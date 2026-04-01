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
package net.sourceforge.sqlexplorer.parsers;

import net.sourceforge.sqlexplorer.util.BackedCharSequence;



/**
 * Implementation of Query that provides for more a sophisticated description of
 * the task to be performed, namely: defining parameters, interactive questions which
 * need to be asked, and content-type overrides.
 * 
 * @author John Spackman
 */
public class AnnotatedQuery extends AbstractQuery {
	
	private QueryType queryType;
	private BackedCharSequence buffer;
	private int lineNo;

	public AnnotatedQuery(BackedCharSequence buffer, int lineNo) {
		super();
		this.buffer = buffer;
		this.lineNo = lineNo;
	}

	/* (non-Javadoc)
	 * @see net.sourceforge.sqlexplorer.parsers.Query#getQueryType()
	 */
	public QueryType getQueryType() {
		return queryType;
	}

	/* (non-Javadoc)
	 * @see net.sourceforge.sqlexplorer.parsers.Query#getQuerySql()
	 */
	public BackedCharSequence getQuerySql() {
		return buffer;
	}

	/* (non-Javadoc)
	 * @see net.sourceforge.sqlexplorer.parsers.Query#getLineNo()
	 */
	public int getLineNo() {
		return lineNo;
	}

	/* (non-JavaDoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return Integer.toString(lineNo) + ": " + buffer.toString();
	}

	/**
	 * @param queryType the queryType to set
	 */
	protected void setQueryType(QueryType queryType) {
		this.queryType = queryType;
	}

}
