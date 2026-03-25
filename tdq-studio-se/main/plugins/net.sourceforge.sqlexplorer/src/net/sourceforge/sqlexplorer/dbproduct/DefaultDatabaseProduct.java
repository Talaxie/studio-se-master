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

import java.net.MalformedURLException;
import java.sql.Driver;
import java.sql.SQLException;
import java.util.Collection;
import java.util.LinkedList;

import net.sourceforge.sqlexplorer.parsers.BasicQueryParser;
import net.sourceforge.sqlexplorer.parsers.Query;
import net.sourceforge.sqlexplorer.parsers.QueryParser;
import net.sourceforge.sqlexplorer.plugin.editors.Message;
import net.sourceforge.squirrel_sql.fw.sql.SQLDriverClassLoader;

public class DefaultDatabaseProduct extends AbstractDatabaseProduct {

	/* (non-JavaDoc)
	 * @see net.sourceforge.sqlexplorer.dbproduct.DatabaseProduct#getDriver(net.sourceforge.squirrel_sql.fw.sql.ManagedDriver)
	 */
	public Driver getDriver(ManagedDriver driver) throws ClassNotFoundException {
		try {
	        ClassLoader loader = new SQLDriverClassLoader(getClass().getClassLoader(), driver);
	        Class driverCls = loader.loadClass(driver.getDriverClassName());
	        return (Driver)driverCls.newInstance();
		} catch(UnsupportedClassVersionError e) {
			throw new ClassNotFoundException(e.getMessage(), e);
		} catch(MalformedURLException e) {
			throw new ClassNotFoundException(e.getMessage(), e);
		} catch(InstantiationException e) {
			throw new ClassNotFoundException(e.getMessage(), e);
		} catch(IllegalAccessException e) {
			throw new ClassNotFoundException(e.getMessage(), e);
		}
	}

	public Collection<Message> getErrorMessages(SQLConnection connection, SQLException e, int lineNoOffset) throws SQLException {
		LinkedList list = new LinkedList();
		list.add(new Message(Message.Status.FAILURE, lineNoOffset + 1, 0, e.getMessage()));
		return list;
	}

	public Collection<Message> getServerMessages(SQLConnection connection) throws SQLException {
		return null;
	}

	public QueryParser getQueryParser(String sql, int initialLineNo) {
		return new BasicQueryParser(sql);
	}

	public Collection<Message> getErrorMessages(SQLConnection connection, Query query) throws SQLException {
		return null;
	}

}
