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
package net.sourceforge.sqlexplorer.plugin;

import java.util.HashMap;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import net.sourceforge.sqlexplorer.IConstants;
import net.sourceforge.sqlexplorer.IConstants.Confirm;
import net.sourceforge.sqlexplorer.SQLCannotConnectException;
import net.sourceforge.sqlexplorer.connections.ConnectionsView;
import net.sourceforge.sqlexplorer.dbproduct.Alias;
import net.sourceforge.sqlexplorer.dbproduct.AliasManager;
import net.sourceforge.sqlexplorer.dbproduct.DriverManager;
import net.sourceforge.sqlexplorer.history.SQLHistory;
import net.sourceforge.sqlexplorer.plugin.editors.SQLEditor;
import net.sourceforge.sqlexplorer.plugin.editors.SQLEditorInput;
import net.sourceforge.sqlexplorer.plugin.perspectives.SQLExplorerPluginPerspective;
import net.sourceforge.sqlexplorer.plugin.views.DatabaseStructureView;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.ILogListener;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The main plugin class to be used in the desktop.
 */
public class SQLExplorerPlugin extends AbstractUIPlugin {

    private static final String SQL = ").sql";

    private static final String SQL_EDITOR = "SQL Editor (";

    // ADD xqliu 2010-03-08 feature 10675
    private static final String DOT_SQL = ".sql";

    private AliasManager aliasManager;

    private int count = 0;

    private DriverManager driverManager;

    // Resource bundle.
    private ResourceBundle resourceBundle;

    private SQLHistory _history = null;

    private static final Log _logger = LogFactory.getLog(SQLExplorerPlugin.class);

    // The shared instance.
    private static SQLExplorerPlugin plugin;

    public final static String PLUGIN_ID = "net.sourceforge.sqlexplorer";

    private boolean _defaultConnectionsStarted = false;

    // Cached connections view
    private ConnectionsView connectionsView;

    // Cached database structure view
    private DatabaseStructureView databaseStructureView;

    private IProject rootProject;

    // Add yyi 2010-09-15 14549: hide connections in SQL Explorer when a connection is moved to the trash bin
    private static HashMap<Alias, IFile> propertyFile = new HashMap<Alias, IFile>();

    private BundleContext bundleContext;

    /**
     * The constructor. Moved previous logic to the start method.
     */
    public SQLExplorerPlugin() {
        super();
        plugin = this;
    }

    /**
     * Initialises the Plugin
     */
    @Override
    public void start(BundleContext context) throws Exception {
        super.start(context);
        this.bundleContext = context;
        try {
            getLog().addLogListener(new ILogListener() {

                @Override
                public void logging(IStatus status, String plugin) {
                    Throwable t = status.getException();
                    if (t != null) {
                        System.err.println(t.getMessage());
                        t.printStackTrace(System.err);
                    }
                }
            });

            driverManager = new DriverManager();
            // MOD qiongli TDQ-8893.we will don't use the xml file to maintain the ManagedDrivers later.so no need to
            // laod or save the xml files.
            // driverManager.loadDrivers();

            aliasManager = new AliasManager();
            // aliasManager.loadAliases();

            try {
                resourceBundle = ResourceBundle.getBundle("net.sourceforge.sqlexplorer.test"); //$NON-NLS-1$
            } catch (MissingResourceException x) {
                resourceBundle = null;
            }

            // load SQL History from previous sessions
            _history = new SQLHistory();
        } catch (Exception e) {
            error("Exception during start", e);
            throw e;
        }
    }

    /**
     * Open all connections that have the 'open on startup property'. This method should be called from within the UI
     * thread!
     */
    public void startDefaultConnections(ConnectionsView connectionsView) {
        this.connectionsView = connectionsView;
        if (_defaultConnectionsStarted) {
            return;
        }

        String fontDesc = getPluginPreferences().getString(IConstants.FONT);
        FontData fontData = null;
        try {
            try {
                fontData = new FontData(fontDesc);
            } catch (IllegalArgumentException e) {
                fontData = new FontData("1|Courier New|10|0|WINDOWS|1|-13|0|0|0|400|0|0|0|0|3|2|1|49|Courier New");
            }
            PreferenceConverter.setValue(getPreferenceStore(), IConstants.FONT, fontData);
        } catch (IllegalArgumentException e) {
            error("Error setting font", e);
        }

        boolean openEditor = SQLExplorerPlugin.getDefault().getPluginPreferences().getBoolean(IConstants.AUTO_OPEN_EDITOR);

        // Get the database structure view - NOTE: we don't use SQLExplorerPlugin.getDatabaseView()
        // because it may not have an active page yet
        DatabaseStructureView dbView = null;
        IWorkbenchSite site = connectionsView.getSite();
        if (site.getPage() != null) {
            dbView = (DatabaseStructureView) site.getPage().findView(DatabaseStructureView.class.getName());
        }

        for (Alias alias : aliasManager.getAliases()) {
            if (alias.isConnectAtStartup() && alias.isAutoLogon() && alias.getDefaultUser() != null) {
                if (dbView != null) {
                    try {
                        dbView.addUser(alias.getDefaultUser());
                    } catch (SQLCannotConnectException e) {
                        // Ignore it; the problem is already in the log, we do not want to delay startup, and the
                        // problem will
                        // be apparent as soon as the user tries to use the connection
                    }
                }

                if (openEditor) {
                    SQLEditorInput input = new SQLEditorInput(SQL_EDITOR + SQLExplorerPlugin.getDefault().getEditorSerialNo()
                            + SQL);
                    input.setUser(alias.getDefaultUser());
                    try {
                        site.getPage().openEditor(input, SQLEditor.class.getName());
                    } catch (PartInitException e) {
                        SQLExplorerPlugin.error("Cannot open SQL editor", e);
                    }
                }
            }
        }

        _defaultConnectionsStarted = true;
    }

    /**
     * Game over. End all..
     * 
     * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
     */
    @Override
    public void stop(BundleContext context) throws Exception {
        // driverManager.saveDrivers();
        // aliasManager.saveAliases();
        aliasManager.closeAllConnections();

        // save SQL History for next session
        // _history.save();

        super.stop(context);
    }

    /**
     * @return Returns the next serial number for creating new editors (used in the title of the filename)
     */
    public int getEditorSerialNo() {
        return count++;
    }

    /**
     * Returns the DriverModel
     * 
     * @return
     */
    public DriverManager getDriverModel() {
        return driverManager;
    }

    /**
     * @return The list of configured Aliases
     */
    public AliasManager getAliasManager() {
        return aliasManager;
    }

    /**
     * @return SQLHistory Instance
     */
    public SQLHistory getSQLHistory() {
        return _history;
    }

    /**
     * @return Returns the plugin's resource bundle,
     */
    public ResourceBundle getResourceBundle() {
        return resourceBundle;
    }

    /**
     * Get the version number as specified in plugin.xml
     * 
     * @return version number of SQL Explorer plugin
     */
    public String getVersion() {
        String version = System.getProperty("talend.studio.version"); //$NON-NLS-1$
        if (version == null || "".equals(version.trim())) { //$NON-NLS-1$
            version = (String) plugin.getBundle().getHeaders().get(org.osgi.framework.Constants.BUNDLE_VERSION);
        }
        return version;
    }

    /**
     * Returns the shared instance.
     */
    public static SQLExplorerPlugin getDefault() {
        return plugin;
    }

    /**
     * Returns the confirmation state of the given preference id
     * 
     * @param preferenceId
     * @return
     */
    public static Confirm getConfirm(String preferenceId) {
        try {
            return IConstants.Confirm.valueOf(getDefault().getPluginPreferences().getString(preferenceId));
        } catch (IllegalArgumentException e) {
            // Nothing
        }
        // PTODO qzhang not ask.
        return IConstants.Confirm.YES;
    }

    /**
     * Global log method.
     * 
     * @param message
     * @param t
     */
    public static void error(String message, Throwable t) {
        if (t instanceof SQLCannotConnectException) {
            getDefault().getLog().log(new Status(IStatus.ERROR, PLUGIN_ID, IStatus.ERROR, String.valueOf(message), null));
        } else {
            getDefault().getLog().log(new Status(IStatus.ERROR, PLUGIN_ID, IStatus.ERROR, String.valueOf(message), t));
            _logger.error(message, t);
        }
    }

    /**
     * Global log method.
     * 
     * @param message
     */
    public static void error(String message) {
        getDefault().getLog().log(new Status(IStatus.ERROR, PLUGIN_ID, IStatus.ERROR, String.valueOf(message), null));
        _logger.error(message);
    }

    /**
     * Global log method.
     * 
     * @param t
     */
    public static void error(Exception e) {
        error(e.getMessage(), e);
    }

    /**
     * Returns the string from the plugin's resource bundle, or 'key' if not found.
     */
    public static String getResourceString(String key) {
        ResourceBundle bundle = SQLExplorerPlugin.getDefault().getResourceBundle();
        try {
            return bundle.getString(key);
        } catch (MissingResourceException e) {
            return key;
        }
    }

    /**
     * DOC bZhou Comment method "getActivePage".
     * 
     * @return the current actived page.
     */
    public IWorkbenchPage getActivePage() {
        if (getWorkbench() != null && getWorkbench().getActiveWorkbenchWindow() != null) {
            return getWorkbench().getActiveWorkbenchWindow().getActivePage();
        }
        return null;
    }

    public ConnectionsView getConnectionsView() {
        if (findConnectionsView() != null) {
            return connectionsView;
        }
        // TDQ-9692 MOD qiongli, only when the current prespective is SQLExplorer, the Connections View is opened.or
        // else,we don't open this view.
        IWorkbenchPage page = getActivePage();
        if (page != null) {
            boolean isCurrSQLExplPerspective = isSqlExplorerCurrentPerspective(page);
            if (isCurrSQLExplPerspective) {
                try {
                    connectionsView = (ConnectionsView) page.showView(ConnectionsView.class.getName());
                } catch (PartInitException e) {
                    error(e);
                }
            }
        }

        return connectionsView;
    }

    /**
     * 
     * only find this view,no open it.
     * 
     * @return
     */
    public ConnectionsView findConnectionsView() {
        if (connectionsView != null) {
            return connectionsView;
        }
        IWorkbenchPage page = getActivePage();
        if (page != null) {
            connectionsView = (ConnectionsView) page.findView(ConnectionsView.class.getName());
        }
        return connectionsView;
    }

    /**
     * if the current perspective is sql explorer?
     * 
     * @param page
     * @return
     */
    private boolean isSqlExplorerCurrentPerspective(IWorkbenchPage page) {
        boolean isCurrSQLExplorerPerspective = false;
        if (page != null) {
            isCurrSQLExplorerPerspective = SQLExplorerPluginPerspective.class.getName().equals(page.getPerspective().getId());
        }
        return isCurrSQLExplorerPerspective;
    }

    public void setConnectionsView(ConnectionsView connectionsView) {
        this.connectionsView = connectionsView;
    }

    public DatabaseStructureView getDatabaseStructureView() {
        if (findDatabaseStructureView() == null) {
            IWorkbenchPage page = getActivePage();
            if (page != null) {
                try {
                    databaseStructureView = (DatabaseStructureView) page.showView(DatabaseStructureView.class.getName());
                } catch (PartInitException e) {
                    error(e);
                }
            }
        }
        return databaseStructureView;
    }

    /**
     * 
     * only find this view,no open it.
     * 
     * @return
     */
    public DatabaseStructureView findDatabaseStructureView() {
        if (databaseStructureView != null) {
            return databaseStructureView;
        }
        IWorkbenchPage page = getActivePage();
        if (page != null) {
            databaseStructureView = (DatabaseStructureView) page.findView(DatabaseStructureView.class.getName());
        }
        return databaseStructureView;
    }

    public void setDatabaseStructureView(DatabaseStructureView databaseStructureView) {
        this.databaseStructureView = databaseStructureView;
    }

    public IWorkbenchSite getSite() {
        if (findConnectionsView() != null) {
            return connectionsView.getSite();
        }

        // if connectionsView is not opened,find DQView.
        IViewPart DQView = null;
        IWorkbenchPage page = getActivePage();
        if (page != null) {
            DQView = page.findView("org.talend.dataprofiler.core.ui.views.DQRespositoryView");
        }
        return DQView == null ? null : DQView.getSite();
    }

    /**
     * DOC qzhang Comment method "isEditorSerialName".
     * 
     * @param name
     * @return
     */
    public static boolean isEditorSerialName(String name) {
        // MOD xqliu 2010-03-08 feature 10675
        // return name.endsWith(SQL) && name.startsWith(SQL_EDITOR);
        return name.endsWith(DOT_SQL);
    }

    /**
     * Getter for rootProject.
     * 
     * @return the rootProject
     */
    public IProject getRootProject() {
        return rootProject;
    }

    /**
     * Sets the rootProject.
     * 
     * @param rootProject the rootProject to set
     */
    public void setRootProject(IProject rootProject) {
        this.rootProject = rootProject;
    }

    // Add yyi 2010-09-15 14549: hide connections in SQL Explorer when a connection is moved to the trash bin
    public HashMap<Alias, IFile> getPropertyFile() {
        return propertyFile;
    }

    /**
     * Getter for bundleContext.
     * 
     * @return the bundleContext
     */
    public BundleContext getBundleContext() {
        return this.bundleContext;
    }
}
