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

import net.sourceforge.sqlexplorer.IConstants;
import net.sourceforge.sqlexplorer.Messages;
import net.sourceforge.sqlexplorer.dataset.DataSet;
import net.sourceforge.sqlexplorer.plugin.SQLExplorerPlugin;
import net.sourceforge.sqlexplorer.util.ImageUtil;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.custom.BusyIndicator;
import org.eclipse.swt.dnd.Clipboard;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.TableItem;

/**
 * Copy an entire datasettable to the clipboard.
 * 
 * @author Davy Vanherbergen
 */
public class CopyTableAction extends AbstractDataSetTableContextAction {

    private static final ImageDescriptor _image = ImageUtil.getDescriptor("Images.CopyIcon");
    
    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.action.IAction#getText()
     */
    public String getText() {
        return Messages.getString("DataSetTable.Actions.CopyToClipboard");
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

        BusyIndicator.showWhile(Display.getCurrent(), new Runnable() {

            public void run() {

                try {

                    // create clipboard
                    Clipboard clipBoard = new Clipboard(Display.getCurrent());
                    TextTransfer textTransfer = TextTransfer.getInstance();
                    StringBuffer buffer = new StringBuffer("");//$NON-NLS-1$
                    
                    // get preferences
                    String lineSeparator = System.getProperty("line.separator");//$NON-NLS-1$
                    String columnSeparator = SQLExplorerPlugin.getDefault().getPreferenceStore().getString(IConstants.CLIP_EXPORT_SEPARATOR);
                    boolean includeColumnNames = SQLExplorerPlugin.getDefault().getPreferenceStore().getBoolean(IConstants.CLIP_EXPORT_COLUMNS);
                    
                    
                    TableItem[] items = _table.getItems();                    
                    DataSet dataSet = (DataSet) _table.getData();
                    
                    if (items == null || dataSet == null) {
                        return;
                    }
                    
                    // export column names
                    if (includeColumnNames) {
                        
                        DataSet.Column[] columns = dataSet.getColumns();
                        for (int i = 0; i < columns.length; i++) {
                            buffer.append(columns[i].getCaption());
                            buffer.append(columnSeparator);
                        }
                        buffer.append(lineSeparator);
                    }

                    // export column data
                    int columnCount = _table.getColumnCount();
                    for (int i = 0; i < items.length; i++) {
                                               
                        for (int j = 0; j < columnCount; j++) {
                            buffer.append(items[i].getText(j));
                            buffer.append(columnSeparator);
                        }
                        buffer.append(lineSeparator);
                    }

                    // put all on clipboard
                    clipBoard.setContents(new Object[] {buffer.toString()}, new Transfer[] {textTransfer});

                } catch (Exception e) {
                    SQLExplorerPlugin.error(Messages.getString("CopyTableAction.error"), e);
                }
            }
        });

    }

}
