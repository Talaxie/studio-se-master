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
package net.sourceforge.sqlexplorer.dataset.actions;

import java.io.File;
import java.io.PrintStream;

import net.sourceforge.sqlexplorer.Messages;
import net.sourceforge.sqlexplorer.dataset.DataSet;
import net.sourceforge.sqlexplorer.dataset.DataSetRow;
import net.sourceforge.sqlexplorer.dialogs.XlsExportOptionsDlg;
import net.sourceforge.sqlexplorer.plugin.SQLExplorerPlugin;
import net.sourceforge.sqlexplorer.util.ImageUtil;
import net.sourceforge.sqlexplorer.util.TextUtil;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.custom.BusyIndicator;
import org.eclipse.swt.widgets.Display;

/**
 * Copy an entire datasettable to the clipboard.
 * 
 * @author Davy Vanherbergen
 */
public class ExportXLSAction extends AbstractDataSetTableContextAction {

    private static final ImageDescriptor _image = ImageUtil.getDescriptor("Images.ExportIcon");


    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.action.IAction#getText()
     */
    public String getText() {
        return Messages.getString("DataSetTable.Actions.Export.XLS");
    }


    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.action.IAction#getImageDescriptor()
     */
    public ImageDescriptor getImageDescriptor() {
        return _image;
    }


    /**
     * Copy all table data to clipboard
     * @see org.eclipse.jface.action.IAction#run()
     */
    public void run() {

    	final XlsExportOptionsDlg dlg = new XlsExportOptionsDlg(_table.getShell());
    	if (dlg.open() != Window.OK)
    		return;
        
        BusyIndicator.showWhile(Display.getCurrent(), new Runnable() {

            public void run() {

                try {

                    File file = new File(dlg.getFilename());

                    if (file.exists()) {
                        // overwrite existing files
                        file.delete();
                    }
                    
                    file.createNewFile();
                    PrintStream writer = new PrintStream(file, dlg.getCharacterSet()); 
                    StringBuffer buffer = new StringBuffer("");//$NON-NLS-1$
                    
                    // get preferences
                    boolean includeColumnNames = dlg.includeHeaders();
                    boolean rtrim = dlg.trimSpaces();
                    boolean quote = dlg.quoteText();
                    String nullValue = dlg.getNullValue();
                   
                    DataSet dataSet = (DataSet) _table.getData();
                    
                    if (dataSet == null) {
                        return;
                    }

                    writer.println("<table>");//$NON-NLS-1$
                    
                    // export column names
                    if (includeColumnNames) {
                        
                        buffer.append("<tr>");//$NON-NLS-1$
                        DataSet.Column[] columns = dataSet.getColumns();
                        for (int i = 0; i < columns.length; i++) {
                            buffer.append("<th>");//$NON-NLS-1$
                            buffer.append(TextUtil.htmlEscape(columns[i].getCaption()));
                            buffer.append("</th>");//$NON-NLS-1$
                        }
                        buffer.append("</tr>");//$NON-NLS-1$
                        writer.println(buffer.toString());
                    }

                    // export column data
                    int columnCount = _table.getColumnCount();
                    for (int i = 0; i < dataSet.getRowCount(); i++) {
                                           
                        buffer = new StringBuffer("<tr>");//$NON-NLS-1$
                        DataSetRow row = dataSet.getRow(i);
                        
                        for (int j = 0; j < columnCount; j++) {
                            buffer.append("<td>");//$NON-NLS-1$
                            Object o = row.getRawObjectValue(j);
                        	String t = o == null ? nullValue : o.toString();
                        	if (rtrim) 
                        		t = TextUtil.rtrim(t);
                        	if (quote && o instanceof String) {
                                buffer.append("\"");//$NON-NLS-1$
                        		buffer.append(TextUtil.htmlEscape(t));
                                buffer.append("\"");//$NON-NLS-1$
                        	} else
                        		buffer.append(TextUtil.htmlEscape(t));
                            buffer.append("</td>");//$NON-NLS-1$
                        }
                        
                        buffer.append("</tr>");//$NON-NLS-1$
                        
                        writer.println(buffer.toString());
                    }

                    writer.println("</table>");//$NON-NLS-1$
                    
                    writer.close();


                } catch (final Exception e) {
                    _table.getShell().getDisplay().asyncExec(new Runnable() {

                        public void run() {
                            MessageDialog.openError(_table.getShell(), Messages.getString("SQLResultsView.Error.Export.Title"), e.getMessage());
                            SQLExplorerPlugin.error(Messages.getString("SQLResultsView.Error.Export.Title"), e);
                        }
                    });
                }
            }
        });

    }

}
