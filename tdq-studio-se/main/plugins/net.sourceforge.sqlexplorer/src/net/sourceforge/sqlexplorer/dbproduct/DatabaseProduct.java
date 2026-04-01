/*
 * Copyright (C) 2007 SQL Explorer Development Team
 * http://sourceforge.net/projects/eclipsesql
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
package net.sourceforge.sqlexplorer.dbproduct;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.SQLException;
import java.util.Collection;

import net.sourceforge.sqlexplorer.dataset.DataSet;
import net.sourceforge.sqlexplorer.parsers.Query;
import net.sourceforge.sqlexplorer.parsers.QueryParser;
import net.sourceforge.sqlexplorer.plugin.editors.Message;

/**
 * A DatabaseProduct is the base class for representing a given database
 * platform, eg Oracle, DB2, MSSQL, etc etc and ideally each platform
 * supported will provide an implementation.
 * 
 * However, it is currently optional for a platform to provide an 
 * implementation - not doing so simply means that some features will not
 * be available.
 * 
 * Do NOT create an instance of DatabaseProduct directly - use 
 * DatabaseProductFactory instead.
 * 
 * 
 * HOW TO IMPLEMENT AN INSTANCE.
 * 
 * The implementations must provide a public static no-argument function
 * called getProductInstance() which returns an instance of a DatabaseProduct-
 * derived object - the function will be called repeatedly and the returned
 * value is expected to be a global singleton.
 * 
 * The name and class is very important - it must be exactly: 
 * 		net.sourceforge.sqlexplorer.[platform].dbproduct.DatabaseProduct
 * where "[platform]" is the SQuirreL platform identifier (IE "oracle", 
 * "mssql", etc etc).
 * 
 * Note: it is recommended that you derive your class from AbstractDatabaseProduct
 * 
 * The first implementation of this class was for Oracle so please look there
 * if you want some good examples.
 * 
 * @author John Spackman
 *
 */
public interface DatabaseProduct {
	
	/*
	 * Returned by executeQuery() to allow for support of multiple result sets
	 * returned from a single query
	 */
	public interface ExecutionResults {

		/**
		 * Creates instances of DataSet for each ResultSet returned by the Query,
		 * returning null when there are no more.  Can be called (and return null)
		 * if there are no results.
		 * @return
		 * @throws SQLException
		 */
		public DataSet nextDataSet() throws SQLException;
		
		/**
		 * Returns the update count from the query
		 * @return
		 * @throws SQLException
		 */
		public int getUpdateCount() throws SQLException;
		
		/**
		 * Called to close any resources.  Must be called.
		 * @throws SQLException
		 */
		public void close() throws SQLException;
	}
	
	/**
	 * Executes a Query
	 * @param connection Connection to use
	 * @param query Query to execute
	 * @param maxRows Maximum number of rows
	 * @return
	 * @throws SQLException
	 */
	public ExecutionResults executeQuery(SQLConnection connection, Query query, int maxRows) throws SQLException;
	
	/**
	 * Called to describe a connection for the ConnectionsView; this is optional but should
	 * return a short string containing, for example, the server process or connection IDs
	 * @param connection
	 * @return
	 * @throws SQLException
	 */
	public String describeConnection(Connection connection) throws SQLException; 
	
	/**
	 * Loads a driver for use with SQLExplorer.  Note that because of Classloader issues
	 * when dealing with multiple plugins, it is essential that the plugin for the database 
	 * loads the .jar contains the database-specific Driver; if this is not done then ONLY 
	 * the standard JDBC classes can be used, and any platform specific classes will result
	 * in a ClassNotFound exception.
	 * @param driver
	 * @return
	 * @throws ClassNotFoundException
	 */
	public Driver getDriver(ManagedDriver driver) throws ClassNotFoundException;
	
	/**
	 * Returns a tokenizer capable of splitting queries up into segments to be executed
	 * @param sql
	 * @param initialLineNo
	 * @return
	 */
	public QueryParser getQueryParser(String sql, int initialLineNo);
	
	/**
	 * Returns a collection of SQLEditor.Message objects representing messages being
	 * passed back from the server
	 * @return
	 */
	public Collection<Message> getServerMessages(SQLConnection connection) throws SQLException;
	
	/**
	 * Returns a collection of SQLEditor.Message objects representing error messages in
	 * (or regarding) the SQLException.  
	 * LINE NUMBERS: The line numbers assigned to the message are expected to have 
	 * taken the starting line number of the Query into place already; in otherwords,
	 * all line numbers should have lineNoOffset already added to them.
	 * @param connection the SQLConnection to the database
	 * @param e the SQLException which was raised
	 * @param lineNoOffset the query which generated the exception
	 * @return
	 * @throws SQLException 
	 */
	public Collection<Message> getErrorMessages(SQLConnection connection, SQLException e, int lineNoOffset) throws SQLException;
	
	/**
	 * Returns a collection of SQLEditor.Message objects containing error messages
	 * specific to the Query; this is because some DDL (eg for stored procedures)
	 * will apparently succeed but they have failed to compile.  This method is used
	 * to check for and retrieve compiler error messages on the server.
	 * LINE NUMBERS: The line numbers assigned to the message are expected to have 
	 * taken the starting line number of the Query into place already; in otherwords,
	 * all line numbers should have "query.getLineNo() - 1" added to them (getLineNo()
	 * returns a 1-based index). 
	 * @param connection the SQLConnection to the database
	 * @param query the query which generated the exception
	 * @return
	 * @throws SQLException 
	 */
	public Collection<Message> getErrorMessages(SQLConnection connection, Query query) throws SQLException;
}
