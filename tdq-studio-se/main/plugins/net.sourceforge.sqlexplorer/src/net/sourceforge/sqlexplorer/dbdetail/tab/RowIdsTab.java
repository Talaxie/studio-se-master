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
package net.sourceforge.sqlexplorer.dbdetail.tab;

import net.sourceforge.sqlexplorer.Messages;
import net.sourceforge.sqlexplorer.dataset.DataSet;
import net.sourceforge.sqlexplorer.dbstructure.nodes.INode;
import net.sourceforge.sqlexplorer.dbstructure.nodes.TableNode;
import net.sourceforge.squirrel_sql.fw.sql.dbobj.BestRowIdentifier;

/**
 * @author Davy Vanherbergen
 * 
 */
public class RowIdsTab extends AbstractDataSetTab {

    private static final String[] COLUMN_LABELS = {
    	"DatabaseDetailView.Tab.RowIds.Col.Scope",
    	"DatabaseDetailView.Tab.RowIds.Col.ColumnName",
    	"DatabaseDetailView.Tab.RowIds.Col.DataType",
    	"DatabaseDetailView.Tab.RowIds.Col.TypeName",
    	"DatabaseDetailView.Tab.RowIds.Col.ColumnSize",
    	"DatabaseDetailView.Tab.RowIds.Col.DecimalDigits",
    	"DatabaseDetailView.Tab.RowIds.Col.PseudoColumn"
 };//$NON-NLS-1$ $NON-NLS-2$ $NON-NLS-3$ $NON-NLS-4$ $NON-NLS-5$ $NON-NLS-6$ $NON-NLS-7$
    
    public String getLabelText() {
        return Messages.getString("DatabaseDetailView.Tab.RowIds");
    }
 
    public DataSet getDataSet() throws Exception {                
        
        INode node = getNode();
        
        if (node == null) {
            return null;
        }
        
        if (node instanceof TableNode) {
            TableNode tableNode = (TableNode) node;
            
            BestRowIdentifier[] rowIds = node.getSession().getMetaData().getBestRowIdentifier(tableNode.getTableInfo());
            Comparable[][] data = new Comparable[rowIds.length][];
            int index = 0;
            for (BestRowIdentifier rowId : rowIds) {
            	Comparable[] row = new Comparable[COLUMN_LABELS.length];
            	data[index++] = row;
            	
            	int i = 0;
            	row[i++] = rowId.getScope();
            	row[i++] = rowId.getColumnName();
            	row[i++] = rowId.getSQLDataType();
            	row[i++] = rowId.getTypeName();
            	row[i++] = rowId.getPrecision();
            	row[i++] = rowId.getScale();
            	row[i++] = rowId.getPseudoColumn();
            	if (i != COLUMN_LABELS.length)
                    throw new RuntimeException(Messages.getString("RowIdsTab.RuntimeException"));
            }
            DataSet dataSet = new DataSet(COLUMN_LABELS, data);
            return dataSet;
        }
        
        return null;
    }
    
    public String getStatusMessage() {
        return Messages.getString("DatabaseDetailView.Tab.RowIds.status") + " " + getNode().getQualifiedName();//$NON-NLS-2$
    }
}
