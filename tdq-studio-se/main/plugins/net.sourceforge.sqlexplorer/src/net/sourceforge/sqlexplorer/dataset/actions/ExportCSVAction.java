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
package net.sourceforge.sqlexplorer.dataset.actions;

import java.io.File;
import java.io.PrintStream;

import net.sourceforge.sqlexplorer.Messages;
import net.sourceforge.sqlexplorer.dataset.DataSet;
import net.sourceforge.sqlexplorer.dataset.DataSetRow;
import net.sourceforge.sqlexplorer.dataset.mapdb.SqlExplorerTalendDataSet;
import net.sourceforge.sqlexplorer.dialogs.CsvExportOptionsDlg;
import net.sourceforge.sqlexplorer.util.ImageUtil;
import net.sourceforge.sqlexplorer.util.TextUtil;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.custom.BusyIndicator;
import org.eclipse.swt.widgets.Display;

/**
 * Export table contents to a CSV file.
 * 
 * @author Davy Vanherbergen
 */
public class ExportCSVAction extends AbstractDataSetTableContextAction {

    private static final ImageDescriptor _image = ImageUtil.getDescriptor("Images.ExportIcon");

    /**
     * Return the text that will be displayed in the context popup menu for this action.
     */
    @Override
    public String getText() {
        return Messages.getString("DataSetTable.Actions.Export.CSV");
    }

    /**
     * Provide image for action
     */
    @Override
    public ImageDescriptor getImageDescriptor() {
        return _image;
    }

    /**
     * Main method. Prompt for file name and save table contents to csv file.
     */
    @Override
    public void run() {

        final CsvExportOptionsDlg dlg = new CsvExportOptionsDlg(_table.getShell());
        if (dlg.open() != Window.OK) {
            return;
        }

        // let's show the fancy wait cursor..
        BusyIndicator.showWhile(Display.getCurrent(), new Runnable() {

            public void run() {

                try {

                    // create new file
                    File file = new File(dlg.getFilename());

                    if (file.exists()) {
                        // overwrite existing files
                        file.delete();
                    }

                    file.createNewFile();
                    PrintStream writer = new PrintStream(file, dlg.getCharacterSet());
                    StringBuffer buffer = new StringBuffer("");//$NON-NLS-1$

                    // get column header and separator preferences
                    String columnSeparator = dlg.getDelimiter();
                    boolean includeColumnNames = dlg.includeHeaders();
                    boolean rtrim = dlg.trimSpaces();
                    boolean quote = dlg.quoteText();
                    String nullValue = dlg.getNullValue();
                    boolean isExportAll = dlg.isExportAll();

                    // check if there is somethign in our table
                    DataSet dataSet = (DataSet) _table.getData();

                    if (!isExportAll && SqlExplorerTalendDataSet.class.isInstance(dataSet)) {
                        dataSet = ((SqlExplorerTalendDataSet) dataSet).getCurrentPageDataSet();
                    }

                    if (dataSet == null) {
                        return;
                    }

                    // export column names if we need to
                    if (includeColumnNames) {

                        DataSet.Column[] columns = dataSet.getColumns();
                        for (int i = 0; i < columns.length; i++) {
                            if (i != 0) {
                                buffer.append(columnSeparator);
                            }
                            buffer.append(columns[i].getCaption());
                        }
                        writer.println(buffer.toString());
                    }

                    // export column data
                    int columnCount = _table.getColumnCount();
                    for (int i = 0; i < dataSet.getRowCount(); i++) {

                        buffer = new StringBuffer("");//$NON-NLS-1$
                        DataSetRow row = dataSet.getRow(i);

                        for (int j = 0; j < columnCount; j++) {
                            Object o = row.getRawObjectValue(j);
                            String t = o == null ? nullValue : o.toString();
                            if (rtrim) {
                                t = TextUtil.rtrim(t);
                            }
                            if (quote && o instanceof String) {
                                buffer.append("\"");//$NON-NLS-1$
                                buffer.append(t);
                                buffer.append("\"");//$NON-NLS-1$
                            } else {
                                buffer.append(t);
                            }
                            /* don't append separator _after_ last column */
                            if (j < columnCount - 1) {
                                buffer.append(columnSeparator);
                            }
                        }
                        writer.println(buffer.toString());
                    }

                    writer.close();

                } catch (final Exception e) {
                    _table.getShell().getDisplay().asyncExec(new Runnable() {

                        public void run() {
                            MessageDialog.openError(_table.getShell(), Messages.getString("SQLResultsView.Error.Export.Title"),
                                    e.getMessage());
                        }
                    });
                }
            }
        });

    }

}
