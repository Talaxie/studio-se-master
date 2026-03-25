/*
 * Copyright (C) 2007 SQL Explorer Development Team http://sourceforge.net/projects/eclipsesql
 * 
 * This program is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General
 * Public License as published by the Free Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 * 
 * This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU Lesser General Public License along with this library; if not, write to
 * the Free Software Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 */
package net.sourceforge.sqlexplorer.dbproduct;

import java.sql.SQLException;
import java.util.LinkedList;

import net.sourceforge.sqlexplorer.ExplorerException;
import net.sourceforge.sqlexplorer.connections.ConnectionsView;
import net.sourceforge.sqlexplorer.plugin.SQLExplorerPlugin;

/**
 * The SessionTreeNode represents one active database session.
 * 
 * @modified Davy Vanherbergen
 */
public class Session {

    /*
     * A QueuedTask is run once the current connection becomes idle
     */
    private interface QueuedTask {

        public void run() throws SQLException;
    }

    // User definition we connect as (will be null after we've been closed)
    private User user;

    // Connection to the database
    private SQLConnection connection;

    // Last selected catalog
    private String lastCatalog;

    // Whether the connection is currently "grabbed" by calling code
    private boolean connectionInUse;

    // Whether to keep the connection and NOT release it back to the pool
    private boolean keepConnection;

    // Whether we auto-commit
    private boolean autoCommit;

    // Whether we commit on close (only really applies if autoCommit==false)
    private boolean commitOnClose;

    // List of tasks to execute when the current connection is freed up
    private LinkedList<QueuedTask> queuedTasks = new LinkedList<QueuedTask>();

    /**
     * Constructor; ties this Session to a User configuration but does not allocate a SQL connection until required.
     * 
     * @param user
     */
    /* package */Session(User user) throws SQLException {
        this.user = user;
        autoCommit = user.isAutoCommit();
        commitOnClose = user.isCommitOnClose();
    }

    /**
     * Returns true if the session is valid
     * 
     * @return
     */
    public synchronized boolean isValidSession() {
        return user != null;
    }

    /**
     * Called internally to set the connection (including setting it to null)
     * 
     * @param newConnection
     */
    protected void internalSetConnection(SQLConnection newConnection) throws SQLException {
        if (newConnection != null && connection != newConnection && connection != null) {
            throw new IllegalStateException("Cannot change connection on the fly!");
        }
        if (connection != null) {
            connection.setSession(null);
        }
        connection = newConnection;
        if (connection != null) {
            connection.setSession(this);
            if (lastCatalog != null) {
                connection.setCatalog(lastCatalog);
            }
            connection.setAutoCommit(autoCommit);
            connection.setCommitOnClose(commitOnClose);
        }
    }

    /**
     * Returns the current connection, if there is one. Intended only for use by derived classes.
     * 
     * @return
     */
    protected SQLConnection getConnection() {
        return connection;
    }

    /**
     * Grabs a connection; note that releaseConnection MUST be called to return the connection for use by other code.
     * 
     * @return
     * @throws ExplorerException
     */
    public synchronized SQLConnection grabConnection() throws SQLException {
        if (user == null) {
            throw new IllegalStateException("Session invalid (closed)");
        }
        if (connectionInUse) {
            throw new IllegalStateException("Cannot grab a new connection - already in use");
        }

        if (connection != null) {
            if (connection.getConnection() == null || connection.getConnection().isClosed()) {
                internalSetConnection(null);
            }
        }

        // If we don't have one yet, get one from the pool
        if (connection == null) {
            internalSetConnection(user.getConnection());
        }
        if (connection != null) {
            connectionInUse = true;
        }

        ConnectionsView connectionsView = SQLExplorerPlugin.getDefault().getConnectionsView();
        if (connectionsView != null) {
            connectionsView.refresh();
        }
        return connection;
    }

    /**
     * Releases the connection; if the connection does NOT have auto-commit, this session will hang on to it for next
     * time, otherwise it is returned to the pool
     * 
     * @param toRelease
     */
    public synchronized void releaseConnection(SQLConnection toRelease) {
        if (!connectionInUse) {
            throw new IllegalStateException("Cannot release connection - not inuse");
        }
        if (connection != toRelease) {
            // User will be null if we've closed
            if (user == null) {
                return;
            }
            throw new IllegalArgumentException("Attempt to release the wrong connection");
        }

        // Run any queued tasks
        try {
            while (!queuedTasks.isEmpty()) {
                QueuedTask task = queuedTasks.removeFirst();
                task.run();
            }
        } catch (SQLException e) {
            SQLExplorerPlugin.error("Failed running queued task", e);
        }

        connectionInUse = false;

        try {
            // Update the connection to the auto-commit and commit-on-close status
            connection.setAutoCommit(autoCommit);
            connection.setCommitOnClose(commitOnClose);

            // If it's not auto-commit, then we have to keep the connection
            if (!autoCommit || keepConnection) {
                return;
            }
        } catch (SQLException e) {
            SQLExplorerPlugin.error("Cannot commit", e);
        }

        // Give it back into the pool
        try {
            user.releaseConnection(connection);
            internalSetConnection(null);
        } catch (SQLException e) {
            SQLExplorerPlugin.error("Cannot release connection", e);
        }

        ConnectionsView connectionsView = SQLExplorerPlugin.getDefault().getConnectionsView();
        if (connectionsView != null) {
            connectionsView.refresh();
        }
    }

    /**
     * Returns whether the connection is in use or not
     * 
     * @return
     */
    public synchronized boolean isConnectionInUse() {
        return connectionInUse;
    }

    /**
     * Returns trie if auto-commit is enabled
     * 
     * @return
     */
    public boolean isAutoCommit() {
        return autoCommit;
    }

    public synchronized void setAutoCommit(boolean autoCommit) throws SQLException {
        boolean enabling = !this.autoCommit && autoCommit;
        this.autoCommit = autoCommit;

        // If we're turning it on, get rid of any existing connection back to the pool
        if (enabling) {
            // If there's a connection but its not in use, then release it
            if (connection != null && !connectionInUse) {
                try {
                    user.releaseConnection(connection);
                    internalSetConnection(null);
                    ConnectionsView connectionsView = SQLExplorerPlugin.getDefault().getConnectionsView();
                    if (connectionsView != null) {
                        connectionsView.refresh();
                    }
                } catch (SQLException e) {
                    SQLExplorerPlugin.error("Cannot release connection", e);
                }
            }
        }
    }

    public boolean isCommitOnClose() {
        return commitOnClose;
    }

    public void setCommitOnClose(boolean commitOnClose) {
        this.commitOnClose = commitOnClose;
    }

    /**
     * Queues a task to be completed at the end of the current
     * 
     * @param task
     * @throws SQLException
     */
    protected void queueTask(QueuedTask task) throws ExplorerException {
        // If we have a connection and it's not in use, then just run it
        if (connection != null && !connectionInUse) {
            try {
                task.run();
            } catch (SQLException e) {
                throw new ExplorerException(e);
            }
            return;
        }

        // Queue it
        queuedTasks.add(task);

        // If the connection's not in use, grab one and release; the grab
        // ensures we have a connection, and the release flushes the queue
        if (!connectionInUse) {
            try {
                grabConnection();
            } catch (SQLException e) {
                throw new ExplorerException(e);
            } finally {
                releaseConnection(connection);
            }
        }
    }

    /**
     * Closes the session and returns any connection to the pool. Note that isConnectionInUse() must return false or
     * close() will throw an exception.
     * 
     * @throws ExplorerException
     */
    public synchronized void close() {
        if (connectionInUse) {
            user.disposeConnection(connection);
            try {
                internalSetConnection(null);
            } catch (SQLException e) {
                SQLExplorerPlugin.error(e);
            }
        }

        // Disconnection from the user
        if (connection != null) {
            try {
                user.releaseConnection(connection);
            } catch (SQLException e) {
                SQLExplorerPlugin.error(e);
            }
            try {
                internalSetConnection(null);
            } catch (SQLException e) {
                SQLExplorerPlugin.error(e);
            }
        }
        user.releaseSession(this);
        user = null;
    }

    /**
     * Forces the connection (if there is one) to be closed, rolling back any open transactions
     * 
     */
    public synchronized void disposeConnection() {
        if (connectionInUse) {
            throw new IllegalAccessError("Cannot close session while connection is still in use!");
        }
        if (connection != null) {
            SQLConnection connection = this.connection;
            try {
                if (!connection.getAutoCommit()) {
                    connection.rollback();
                }
            } catch (SQLException e) {
                SQLExplorerPlugin.error(e);
            }
            try {
                user.disposeConnection(connection);
                internalSetConnection(null);
            } catch (SQLException e) {
                SQLExplorerPlugin.error(e);
            }
        }
    }

    /**
     * Commits the connection; this will queue if the connection is currently in use
     * 
     */
    public synchronized void commit() throws ExplorerException {
        queueTask(new QueuedTask() {

            @Override
            public void run() throws SQLException {
                connection.commit();
            }
        });
    }

    /**
     * Rolls back the connection; this will queue if the connection is currently in use
     * 
     */
    public synchronized void rollback() throws ExplorerException {
        queueTask(new QueuedTask() {

            @Override
            public void run() throws SQLException {
                connection.rollback();
            }
        });
    }

    /**
     * Changes the catalog of the connection; this will queue if the connection is currently in use
     * 
     */
    public synchronized void setCatalog(final String catalog) throws ExplorerException {
        lastCatalog = catalog;
        if (catalog != null && connection != null) {
            queueTask(new QueuedTask() {

                @Override
                public void run() throws SQLException {
                    connection.setCatalog(catalog);
                }
            });
        }
    }

    public User getUser() {
        return user;
    }

    /* package */void setUser(User user) {
        this.user = user;
    }

    public AliasManager getAliases() {
        return SQLExplorerPlugin.getDefault().getAliasManager();
    }

    @Override
    public String toString() {
        return user != null ? user.toString() : "(disconnected)";
    }

    public DatabaseProduct getDatabaseProduct() {
        if (getUser() == null) {
            return null;
        }
        return getUser().getAlias().getDriver().getDatabaseProduct();
    }

    /**
     * @return the keepConnection
     */
    public boolean isKeepConnection() {
        return keepConnection;
    }

    /**
     * @param keepConnection the keepConnection to set
     */
    public void setKeepConnection(boolean keepConnection) {
        this.keepConnection = keepConnection;
    }
}
