package net.sourceforge.sqlexplorer.dbproduct;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.Map;

import net.sourceforge.sqlexplorer.parsers.NamedParameter;
import net.sourceforge.sqlexplorer.parsers.Query;

public abstract class AbstractDatabaseProduct implements DatabaseProduct {
	
	public ExecutionResults executeQuery(SQLConnection connection, Query query, int maxRows) throws SQLException {
		Statement stmt = null;
		try {
			CharSequence querySql = query.getQuerySql();
			LinkedList<NamedParameter> params = null;
			
			// Apply any named parameters
			if (query.getQueryType() != Query.QueryType.DDL) {
				Map<String, NamedParameter> map = query.getNamedParameters();
				if (map != null && !map.isEmpty()) {
					StringBuffer sb = new StringBuffer(querySql);
					params = locateNamedParameters(sb, map);
					querySql = sb;
				}
			}
			
			/*
			 * Create the statement.  Note that we only create a CallableStatement if
			 * we have parameters; this is because some databases (MySQL) require that
			 * prepareCall is only used for stored code.  CallableStatements are only
			 * needed for output parameters so because we cannot reliably detect what 
			 * the query is (DDL/DML/SELECT/CODE/etc) unless there is a specialised
			 * parser, we rely on whether the user has given any named parameters.
			 * 
			 * Similarly, use Statement when we're just doing DDL - eg Oracle will
			 * not create triggers when using PreparedStatement when it contains
			 * references to :new or :old.
			 */
			boolean hasResults = false;
			if (query.getQueryType() == Query.QueryType.DDL) {
				stmt = connection.getConnection().createStatement();
				hasResults = stmt.execute(querySql.toString());
				
			} else if (params != null) {
				CallableStatement cstmt = connection.getConnection().prepareCall(querySql.toString());
				stmt = cstmt;
				int columnIndex = 1;
				for (NamedParameter param : params)
					configureStatement((CallableStatement)stmt, param, columnIndex++);
				hasResults = cstmt.execute();
				
			} else {
				PreparedStatement pstmt = connection.getConnection().prepareStatement(querySql.toString());
				stmt = pstmt;
				
				// Note we only set maxrows if we know what the query type is (and that it's a SELECT)
				//	This is important for MSSQL DDL statements which fail if maxrows is set, and makes
				//	no sense for non-select anyway.
				if (query.getQueryType() == Query.QueryType.SELECT)
					try {
						stmt.setMaxRows(maxRows);
					}catch(SQLException e) {
						// Nothing
					}
				
				hasResults = pstmt.execute();
			}
			
			return new ExecutionResultImpl(this, stmt, hasResults, params, maxRows);
			
		} catch(SQLException e) {
			try {
				if (stmt != null)
					stmt.close();
			} catch(SQLException e2) {
				// Nothing
			}
			throw e;
		}
	}

	/* (non-Javadoc)
	 * @see net.sourceforge.sqlexplorer.dbproduct.DatabaseProduct#describeConnection(java.sql.Connection)
	 */
	public String describeConnection(Connection connection) throws SQLException {
		return null;
	}

	/**
	 * Scans the StringBuffer looking for named parameters (in the form ":paramname"), and 
	 * looking up the parameter in map.  It returns a list of those parameters; note that
	 * the list will contain duplicates if the named parameter is referenced more than once
	 * @param sb
	 * @param map
	 * @return
	 */
	protected LinkedList<NamedParameter> locateNamedParameters(StringBuffer sb, Map<String, NamedParameter> map) throws SQLException {
		LinkedList<NamedParameter> results = new LinkedList<NamedParameter>();
		
		// The quote character when we're in the middle of a string
		char inQuote = 0;
		
		// The string to look for which terminates a comment (if we're currenbtly parsing one);
		//	null if not currently parsing a comment
		String inComment = null;
		
		// Where the identifier started, relative to the buffer (-1 means no identifier yet)
		int idStart = -1;
		
		for (int i = 0; i < sb.length(); i++) {
			char c = sb.charAt(i);
			char nextC = (i < sb.length() - 1) ? sb.charAt(i + 1) : 0;
			
			// If we're in an identifier
			if (idStart != -1) {
				// Still an identifier?
				if (Character.isJavaIdentifierPart(c))
					continue;
				
				// Find the parameter
				String name = sb.substring(idStart + 1, i);
				NamedParameter param = map.get(name);
				
				// Ignore null parameters because they may be a valid syntax on the server 
				if (param != null) {
					results.add(param);
					sb.delete(idStart + 1, i);
					sb.setCharAt(idStart, '?');
				}
				
				// Next!
				idStart = -1;
				continue;
			}
			
			// Already inside a string?  Check for the end of the string
			if (inQuote != 0) {
				if (c == '\'' || c == '\"') {
					// Double just escapes, it does not terminate the string
					if (nextC != c)
						inQuote = 0;
				}
				continue;
			}
			
			// Already in a comment
			if (inComment != null) {
				// If inComment is empty then we're in a single-line comment; check for EOL
				if (inComment.length() == 0) {
					if (c == '\n')
						inComment = null;
					continue;
				}
				
				// Otherwise inComment is the string which terminates the comment
				if (c == inComment.charAt(0) && nextC == inComment.charAt(1)) {
					inComment = null;
					continue;
				}
			}
			
			// Starting a single-line comment?
			if (c == '-' && nextC == '-') {
				inComment = "";
				continue;
			}
			
			// Starting a multi-line comment?
			if (c == '/' && nextC == '*') {
				inComment = "*/";
				continue;
			}
			
			// Starting a string?
			if (c == '\'' || c == '\"') {
				inQuote = c;
				continue;
			}
			
			// Finally - is it a named parameter?
			if (c == ':' && Character.isJavaIdentifierPart(nextC)) {
				idStart = i;
			}
		}
		
		// Check for a parameter which exists at the very end of the string
		if (idStart > -1) {
			String name = sb.substring(idStart + 1);
			NamedParameter param = map.get(name);
			if (param == null)
				throw new SQLException("Unknown named parameter called " + name);
			results.add(param);
			sb.delete(idStart + 1, sb.length());
			sb.setCharAt(idStart, '?');
		}
		if (results.isEmpty())
			return null;
		
		return results;
	}
	
	/**
	 * Configures the statement with a given parameter at a given ordinal index
	 * @param stmt
	 * @param param
	 * @param columnIndex
	 * @throws SQLException 
	 */
	protected void configureStatement(CallableStatement stmt, NamedParameter param, int columnIndex) throws SQLException {
		param.configureStatement(stmt, columnIndex);
	}
	
	/**
	 * Override this method if the underlying database supports parameters returning resultsets (ie cursors)
	 * @param stmt 
	 * @param param
	 * @param columnIndex 
	 * @return
	 * @throws SQLException 
	 */
	public ResultSet getResultSet(CallableStatement stmt, NamedParameter param, int columnIndex) throws SQLException {
		return null;
	}
}
