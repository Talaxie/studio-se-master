/*
 * Copyright (C) 2006 Davy Vanherbergen
 * dvanherbergen@users.sourceforge.net
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
package net.sourceforge.sqlexplorer.sqlpanel;

import net.sourceforge.sqlexplorer.dataset.DataSet;
import net.sourceforge.sqlexplorer.parsers.Query;


/**
 * @author Davy Vanherbergen
 *
 */
public class SQLResult {

    private DataSet _dataSet;
    
    private long _executionTimeMillis;
    
//    private String _sqlStatement;
    
    private Query query;

    
    
    /**
     * @return Returns the sqlStatement.
     */
//    public String getSqlStatement() {
//        return _sqlStatement;
//    }


    /**
     * @return Returns the dataSet.
     */
    public DataSet getDataSet() {
        return _dataSet;
    }

    
    /**
     * @return Returns the executionTimeMillis.
     */
    public long getExecutionTimeMillis() {
        return _executionTimeMillis;
    }


    
    public void setDataSet(DataSet dataSet) {
        _dataSet = dataSet;
    }


    
    public void setExecutionTimeMillis(long executionTimeMillis) {
        _executionTimeMillis = executionTimeMillis;
    }


    
//    public void setSqlStatement(String sqlStatement) {
//        _sqlStatement = sqlStatement;
//    }


	public Query getQuery() {
		return query;
	}


	public void setQuery(Query query) {
		this.query = query;
	}


    
    
}
