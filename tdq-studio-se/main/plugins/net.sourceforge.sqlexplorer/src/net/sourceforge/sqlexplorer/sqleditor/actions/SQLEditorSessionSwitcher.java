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
package net.sourceforge.sqlexplorer.sqleditor.actions;

import java.util.HashMap;

import net.sourceforge.sqlexplorer.Messages;
import net.sourceforge.sqlexplorer.connections.ConnectionsView;
import net.sourceforge.sqlexplorer.connections.SessionEstablishedListener;
import net.sourceforge.sqlexplorer.dbproduct.Alias;
import net.sourceforge.sqlexplorer.dbproduct.ConnectionJob;
import net.sourceforge.sqlexplorer.dbproduct.ConnectionListener;
import net.sourceforge.sqlexplorer.dbproduct.Session;
import net.sourceforge.sqlexplorer.dbproduct.User;
import net.sourceforge.sqlexplorer.plugin.SQLExplorerPlugin;
import net.sourceforge.sqlexplorer.plugin.editors.SwitchableSessionEditor;

import org.eclipse.jface.action.ControlContribution;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

public class SQLEditorSessionSwitcher extends ControlContribution implements ConnectionListener, SessionEstablishedListener {

    private SwitchableSessionEditor _editor;

    private Combo _sessionCombo;

    private HashMap<Integer, User> sessionIndexes = new HashMap<Integer, User>();

    /**
     * @param editor SQLEditor to which this session switcher belongs
     */
    public SQLEditorSessionSwitcher(SwitchableSessionEditor editor) {
        super("net.sourceforge.sqlexplorer.sessionswitcher");
        _editor = editor;
    }

    @Override
    protected Control createControl(Composite parent) {
        SQLExplorerPlugin.getDefault().getAliasManager().addListener(this);

        _sessionCombo = new Combo(parent, SWT.READ_ONLY);
        _sessionCombo.setToolTipText(Messages.getString("SQLEditor.Actions.ChooseSession.ToolTip"));

        _sessionCombo.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent event) {

                // change session for this editor
                User user = null;
                int selIndex = _sessionCombo.getSelectionIndex();
                if (selIndex != 0) {
                    user = sessionIndexes.get(selIndex - 1);
                }

                // Nothing to do?
                if (user != null && _editor.getSession() != null && _editor.getSession().getUser() == user) {
                    return;
                }

                // Disconnect from the current session while we try to connect
                _editor.setSession(null);
                _sessionCombo.deselectAll();
                _editor.refreshToolbars();

                if (user == null) {
                    return;
                }

                // Start the connection job
                ConnectionJob.createSession(user.getAlias(), user, SQLEditorSessionSwitcher.this, false);
            }
        });
        setSessionOptions();
        if (_sessionCombo.getItemCount() == 1) {
            MessageDialog.openInformation(parent.getShell(),
                    Messages.getString("SQLEditor.Actions.ChooseSession.NoConnections.Title"),
                    Messages.getString("SQLEditor.Actions.ChooseSession.NoConnections.Message"));
        }

        return _sessionCombo;
    }

    @Override
    public void dispose() {
        SQLExplorerPlugin.getDefault().getAliasManager().removeListener(this);
        super.dispose();
    }

    private void setSessionOptions() {
        if (_sessionCombo.isDisposed()) {
            return;
        }
        _sessionCombo.removeAll();
        _sessionCombo.add("");

        int index = 0;
        User currentUser = null;
        if (_editor.getSession() != null) {
            currentUser = _editor.getSession().getUser();
        }
        for (Alias alias : SQLExplorerPlugin.getDefault().getAliasManager().getAliases()) {
            for (User user : alias.getUsers()) {
                _sessionCombo.add(user.getDescription());
                sessionIndexes.put(new Integer(index++), user);
                // MOD msjian TDQ-5927 2013-5-24: set the item identify by the username, url and connection name
                if (currentUser != null) {
                    boolean isMatched = currentUser.getUserName().equals(user.getUserName())
                            && currentUser.getAlias().getUrl().equals(alias.getUrl());
                    if (currentUser.getDatabaseConnection() != null) {
                        isMatched = isMatched && currentUser.getDatabaseConnection().getName().equals(alias.getName());
                    }
                    if (isMatched) {
                        _sessionCombo.select(_sessionCombo.getItemCount() - 1);
                    }
                }
            }
        }
    }

    @Override
    public void modelChanged() {
        if (_sessionCombo != null && !_sessionCombo.isDisposed()) {
            _editor.getSite().getShell().getDisplay().asyncExec(new Runnable() {

                @Override
                public void run() {
                    setSessionOptions();
                }
            });
        }
    }

    @Override
    public void cannotEstablishSession(User user) {
        if (_sessionCombo.isDisposed()) {
            return;
        }
        _editor.getSite().getShell().getDisplay().asyncExec(new Runnable() {

            @Override
            public void run() {
                _sessionCombo.deselectAll();
                _editor.refreshToolbars();
            }
        });
    }

    @Override
    public void sessionEstablished(final Session session) {
        if (_sessionCombo.isDisposed()) {
            return;
        }
        _editor.getSite().getShell().getDisplay().asyncExec(new Runnable() {

            @Override
            public void run() {
                _editor.setSession(session);
                setSessionOptions();
                ConnectionsView connectionsView = SQLExplorerPlugin.getDefault().getConnectionsView();
                if (connectionsView != null) {
                    connectionsView.setDefaultUser(session.getUser());
                }
                _editor.refreshToolbars();
            }
        });
    }
}
