/*
 * Copyright (C) 2006 Davy Vanherbergen dvanherbergen@users.sourceforge.net
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
package net.sourceforge.sqlexplorer.dbdetail.tab;

import java.sql.SQLException;

import net.sourceforge.sqlexplorer.Messages;
import net.sourceforge.sqlexplorer.dataset.DataSet;
import net.sourceforge.sqlexplorer.dbstructure.nodes.INode;
import net.sourceforge.sqlexplorer.dbstructure.nodes.TableNode;
import net.sourceforge.sqlexplorer.plugin.SQLExplorerPlugin;
import net.sourceforge.squirrel_sql.fw.sql.TableColumnInfo;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.talend.utils.sql.ConnectionUtils;

/**
 * @author Davy Vanherbergen
 * 
 */
public class ColumnInfoTab extends AbstractDataSetTab {

    private static final String COLUMN_LABELS[] = { Messages.getString("DatabaseDetailView.Tab.ColumnInfo.Col.ColumnName"),
            Messages.getString("DatabaseDetailView.Tab.ColumnInfo.Col.DataType"),
            Messages.getString("DatabaseDetailView.Tab.ColumnInfo.Col.TypeName"),
            Messages.getString("DatabaseDetailView.Tab.ColumnInfo.Col.ColumnSize"),
            Messages.getString("DatabaseDetailView.Tab.ColumnInfo.Col.DecimalDigits"),
            Messages.getString("DatabaseDetailView.Tab.ColumnInfo.Col.Radix"),
            Messages.getString("DatabaseDetailView.Tab.ColumnInfo.Col.IsNullAllowed"),
            Messages.getString("DatabaseDetailView.Tab.ColumnInfo.Col.Remarks"),
            Messages.getString("DatabaseDetailView.Tab.ColumnInfo.Col.DefaultValue"),
            Messages.getString("DatabaseDetailView.Tab.ColumnInfo.Col.OctetLength"),
            Messages.getString("DatabaseDetailView.Tab.ColumnInfo.Col.OrdinalPosition"),
            Messages.getString("DatabaseDetailView.Tab.ColumnInfo.Col.IsNullable") };

    @Override
    public String getLabelText() {
        return Messages.getString("DatabaseDetailView.Tab.ColumnInfo");
    }

    @Override
    public DataSet getDataSet() {

        INode node = getNode();

        if (node == null) {
            return null;
        }

        if (node instanceof TableNode) {
            TableNode tableNode = (TableNode) node;
            DataSet dataSet = null;
            // MOD qiongli TDQ-5898 2012-9-4 Add try...catch, odbc teradata dosen't suport
            // something(.e.g,ResultSetColumnReader.getLong(16))
            try {
                TableColumnInfo[] cols = node.getSession().getMetaData().getColumnInfo(tableNode.getTableInfo());
                Comparable[][] dataRows = new Comparable[cols.length][];
                int index = 0;
                for (TableColumnInfo col : cols) {
                    Comparable[] row = new Comparable[COLUMN_LABELS.length];
                    dataRows[index++] = row;

                    int i = 0;
                    row[i++] = col.getColumnName();
                    row[i++] = col.getDataType();
                    row[i++] = col.getTypeName();
                    row[i++] = col.getColumnSize();
                    row[i++] = col.getDecimalDigits();
                    row[i++] = col.getRadix();
                    row[i++] = col.isNullAllowed();
                    row[i++] = col.getRemarks();
                    row[i++] = col.getDefaultValue();
                    row[i++] = col.getOctetLength();
                    row[i++] = col.getOrdinalPosition();
                    row[i++] = col.isNullable();
                    if (i != COLUMN_LABELS.length) {
                        throw new RuntimeException(Messages.getString("ColumnInfoTab.runtimeException"));
                    }
                }

                dataSet = new DataSet(COLUMN_LABELS, dataRows);
            } catch (Exception e) {
                SQLExplorerPlugin.error(Messages.getString("AbstractDataSetTab.error"), e);
                boolean isODBCTeradata = false;
                try {
                    isODBCTeradata = ConnectionUtils.isOdbcTeradata(node.getSession().getMetaData().getJDBCMetaData()) ? true
                            : false;
                } catch (SQLException e1) {
                    SQLExplorerPlugin.error("Failed to get the type of Database", e);
                }
                if (isODBCTeradata) {
                    MessageDialog.openError(Display.getDefault().getActiveShell(), "unsupported",
                            "This operation is unsupported by ODBC Teradata in SQLExplorer!");
                }
            }
            return dataSet;
        }

        return null;
    }

    @Override
    public String getStatusMessage() {
        return Messages.getString("DatabaseDetailView.Tab.ColumnInfo.status") + " " + getNode().getQualifiedName();//$NON-NLS-2$
    }

}
