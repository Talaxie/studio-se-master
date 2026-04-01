package net.sourceforge.sqlexplorer.dbproduct;

import java.sql.SQLException;

import net.sourceforge.sqlexplorer.ExplorerException;
import net.sourceforge.sqlexplorer.IConstants;
import net.sourceforge.sqlexplorer.dbdetail.DetailTabManager;
import net.sourceforge.sqlexplorer.dbstructure.DatabaseModel;
import net.sourceforge.sqlexplorer.dbstructure.nodes.DatabaseNode;
import net.sourceforge.sqlexplorer.plugin.SQLExplorerPlugin;
import net.sourceforge.sqlexplorer.sessiontree.model.utility.Dictionary;
import net.sourceforge.sqlexplorer.sessiontree.model.utility.DictionaryLoader;
import net.sourceforge.squirrel_sql.fw.sql.SQLDatabaseMetaData;

/**
 * Specialisation of Session which adds meta data; every user has at most one
 * of these, loaded for the first time on demand (which is pretty much always
 * because it's used for detailing catalogs in the editor and for navigating
 * the database structure view)
 * 
 * @author John Spackman
 */
public class MetaDataSession extends Session {
	
	// Cached meta data for this connection
	private SQLDatabaseMetaData metaData;
	
	private String databaseProductName;

	// Cached set of Catalogs for this connection
	private String[] catalogs; 

    // Whether content assist is enabled
    boolean _assistanceEnabled;

    // The dictionary used for content assist
    private Dictionary dictionary;
    
    // Database Model
    private DatabaseModel dbModel;
    
	public MetaDataSession(User user) throws SQLException {
		super(user);
		setKeepConnection(true);
	}
	
	/**
	 * Initialises the metadata, but only if the meta data has not already been collected
	 */
	private void initialise() throws SQLException {
		if (getConnection() != null)
			return;
		
        _assistanceEnabled = SQLExplorerPlugin.getDefault().getPluginPreferences().getBoolean(IConstants.SQL_ASSIST);
        if (_assistanceEnabled) {
            // schedule job to load dictionary for this session
        	dictionary = new Dictionary();
            DictionaryLoader dictionaryLoader = new DictionaryLoader(this);
            dictionaryLoader.schedule(500);
        }
        
		SQLConnection connection = null;
		try {
			connection = grabConnection();
			metaData = connection.getSQLMetaData();
            // MOD gdbu 2011-4-12 bug : 20578
			databaseProductName = metaData.getDatabaseProductName();
			dbModel = new DatabaseModel(this);
            if (metaData.supportsCatalogs())
                catalogs = metaData.getCatalogs();
        } catch (SQLException sqlerror) {
            SQLExplorerPlugin.error(sqlerror);
            // ~20578
        } finally {
			if (connection != null)
				releaseConnection(connection);
		}
	}

	/* (non-Javadoc)
	 * @see net.sourceforge.sqlexplorer.dbproduct.Session#internalSetConnection(net.sourceforge.sqlexplorer.dbproduct.SQLConnection)
	 */
	@Override
	protected void internalSetConnection(SQLConnection newConnection) throws SQLException {
		super.internalSetConnection(newConnection);
		if (newConnection == null) {
			metaData = null;
			dictionary = null;
		}
	}

	/* (non-Javadoc)
	 * @see net.sourceforge.sqlexplorer.dbproduct.Session#close()
	 */
	@Override
	public synchronized void close() {
		super.close();
		
        // store dictionary
		if (dictionary != null)
			dictionary.store();
        
        // clear detail tab cache
        DetailTabManager.clearCacheForSession(this);
	}

    /**
     * Gets (and caches) the meta data for this connection
     * @return
     * @throws ExplorerException
     */
    public synchronized SQLDatabaseMetaData getMetaData() throws SQLException {
    	initialise();
        return metaData;
    }
    
    /**
     * Returns the catalogs supported by the underlying database, or null
     * if catalogs are not supported
     * @return
     * @throws SQLException
     */
    public String[] getCatalogs() {
    	if (catalogs != null)
    		return catalogs;
    	try {
    		initialise();
    	}catch(SQLException e) {
    		SQLExplorerPlugin.error(e);
    		return null;
    	}
   		return catalogs;
    }

    /**
     * Returns the root DatabaseNode for the DatabaseStructureView
     * @return
     */
    public DatabaseNode getRoot() {
    	try {
    		initialise();
    	}catch(SQLException e) {
    		SQLExplorerPlugin.error(e);
    		return null;
    	}
    	return dbModel.getRoot();
    }
    
    /**
     * Returns the MetaData dictionary for type ahead etc
     * @return
     */
    public Dictionary getDictionary() {
    	try {
    		initialise();
    	}catch(SQLException e) {
    		SQLExplorerPlugin.error(e);
    		return null;
    	}
        return dictionary;
    }

	/**
	 * @return the databaseProductName
	 */
	public String getDatabaseProductName() throws SQLException {
		if (databaseProductName != null)
			return databaseProductName;
       	initialise();
		return databaseProductName;
	}
}
