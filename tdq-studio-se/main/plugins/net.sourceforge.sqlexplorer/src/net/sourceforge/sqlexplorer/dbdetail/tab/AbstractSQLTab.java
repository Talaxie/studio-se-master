package net.sourceforge.sqlexplorer.dbdetail.tab;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import net.sourceforge.sqlexplorer.IConstants;
import net.sourceforge.sqlexplorer.Messages;
import net.sourceforge.sqlexplorer.dataset.DataSet;
import net.sourceforge.sqlexplorer.dbproduct.SQLConnection;
import net.sourceforge.sqlexplorer.plugin.SQLExplorerPlugin;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


public abstract class AbstractSQLTab extends AbstractDataSetTab {
   
    protected static final Log _logger = LogFactory.getLog(AbstractSQLTab.class);

    public final DataSet getDataSet() throws Exception {
        
        DataSet dataSet = null;
        int timeOut = SQLExplorerPlugin.getDefault().getPluginPreferences().getInt(IConstants.INTERACTIVE_QUERY_TIMEOUT);
        
        SQLConnection connection = null;
        ResultSet rs = null;
        Statement stmt = null;
        PreparedStatement pStmt = null;
        
        try {
        	connection = getNode().getSession().grabConnection();
                    
            Object[] params = getSQLParameters();
            if (params == null || params.length == 0) {
                
                
                // use normal statement
                stmt = connection.createStatement();
                stmt.setQueryTimeout(timeOut);
                rs = stmt.executeQuery(getSQL());
                
            } else {
                
                // use prepared statement
                pStmt = connection.prepareStatement(getSQL());
                pStmt.setQueryTimeout(timeOut);
                
                for (int i = 0; i < params.length; i++) {
                    
                    if (params[i] instanceof String) {
                        pStmt.setString(i + 1, (String) params[i]);
                    } else if (params[i] instanceof Integer) {
                        pStmt.setInt(i + 1, ((Integer) params[i]).intValue());
                    } else if (params[i] instanceof String) {
                        pStmt.setLong(i + 1, ((Long) params[i]).longValue());
                    }                     
                }
                
                rs = pStmt.executeQuery();
            }
        
            dataSet = new DataSet(rs, null);
            
            rs.close();
            rs = null;
            
        } catch (Exception e) {
            
            SQLExplorerPlugin.error(Messages.getString("AbstractSQLSourceTab.cannotLoadSource") + getNode().getName(), e);
            
        } finally {
            if (rs != null)
            	try {
            		rs.close();
            	}catch(SQLException e) {
                    SQLExplorerPlugin.error(Messages.getString("DataSet.errorCloseRs"), e);
            	}
            if (stmt != null)
                try {
                    stmt.close();
                } catch (SQLException e) {
                    SQLExplorerPlugin.error(Messages.getString("DataSet.errorCloseStmt"), e);
                }
            if (pStmt != null)
                try {
                    pStmt.close();
                } catch (SQLException e) {
                    SQLExplorerPlugin.error(Messages.getString("DataSet.errorCloseStmt"), e);
                }
            if (connection != null)
            	getNode().getSession().releaseConnection(connection);
        }
        return dataSet;
        
    }

    public abstract String getLabelText();
    
    public abstract String getSQL();
    
    public Object[] getSQLParameters() {
        return null;
    }
}
