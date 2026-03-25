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
package net.sourceforge.sqlexplorer.dataset;

import net.sourceforge.sqlexplorer.Messages;
import net.sourceforge.sqlexplorer.plugin.SQLExplorerPlugin;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.TableCursor;
import org.eclipse.swt.dnd.Clipboard;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;

/**
 * Provides keyboard features for DataSetTable:
 * <ul>
 * <li>F5: refresh table</li>
 * <li>CTRL-C: copy active cell</li>
 * <li>CTRL-F: column name finder assistant (use F3 to skip to next match) </li>
 * </ul>
 * 
 * @author Davy Vanherbergen
 */
public class DataSetTableKeyListener implements KeyListener {

    protected static final Log _logger = LogFactory.getLog(DataSetTableKeyListener.class);
    
//    private IDetailTab _tab = null;

    private Composite _parent = null;

    private Table _table = null;

    private TableCursor _cursor = null;

    private Shell _popup = null;

    private static final int CTRL_C = 3;

    private static final int CTRL_F = 6;

    private static final int ENTER = 13;

    private String _lastNameSearched = null;
    
    private int _lastColumnIndex = 0;

   
    /**
     * Create new keylistener
     * 
     * @param parent
     * @param table
     * @param cursor
     * @param tab
     */
    public DataSetTableKeyListener(Composite parent, Table table, TableCursor cursor) {

        _table = table;
        _parent = parent;
        _cursor = cursor;
    }


    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.swt.events.KeyListener#keyPressed(org.eclipse.swt.events.KeyEvent)
     */
    public void keyPressed(KeyEvent e) {

    	//_logger.fatal(Integer.toString((int)e.character));
        switch (e.character) {

            case CTRL_C:
                // copy cell content to clipboard

                try {
					Clipboard clipBoard = SQLExplorerPlugin.getDefault().getConnectionsView().getClipboard();
                    TextTransfer textTransfer = TextTransfer.getInstance();

                    TableItem[] items = _table.getSelection();
                    
                    if (items == null || items.length == 0) {
                        return;
                    }
                               
                    int columnIndex = _cursor.getColumn();      
                    clipBoard.setContents(new Object[] {items[0].getText(columnIndex)}, new Transfer[] {textTransfer});


                } catch (Exception ex) {
                SQLExplorerPlugin.error(Messages.getString("CopyColumnNameAction.error"), ex);
                }
                break;

            case CTRL_F:
                // column name typeahead
                createPopup();
                break;

        }

    }


    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.swt.events.KeyListener#keyReleased(org.eclipse.swt.events.KeyEvent)
     */
    public void keyReleased(KeyEvent e) {

        switch (e.keyCode) {

            case SWT.F5:
                // refresh tab
                /*if (_tab != null) {
                    _tab.refresh();
                }
                disposePopup();
                
                // refresh SQL Results
                try {
                    Object o = _parent.getData("parenttab");
                    if (o != null) {
                        SQLExecution sqlExec = (SQLExecution) ((TabItem)o).getData();
                        if (sqlExec != null) {
                            sqlExec.startExecution();
                        }
                    }
                } catch (Exception e1) {
                    SQLExplorerPlugin.error("Error refreshing", e1);
                }*/

                break;

            case SWT.ESC:
                disposePopup();
                break;

        }

    }


    /**
     * Display column finder popup
     */

    private void createPopup() {

        _lastNameSearched = null;
        
        // recycle old popup
        if (_popup != null && !_popup.isDisposed()) {
            if (!_popup.isVisible()) {
                _popup.open();
            }
            return;
        }

        // find out where to put the popup on screen
        Point popupLocation = _table.toDisplay(10, 40);
        
        // create new shell
        _popup = new Shell(_parent.getShell(), SWT.BORDER | SWT.ON_TOP);
        _popup.setBackground(_parent.getDisplay().getSystemColor(SWT.COLOR_INFO_BACKGROUND));
        _popup.setForeground(_parent.getDisplay().getSystemColor(SWT.COLOR_INFO_FOREGROUND));
        _popup.setSize(250, 50);
        _popup.setLocation(popupLocation);
        _popup.setLayout(new GridLayout());

        GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
        gridData.grabExcessHorizontalSpace = true;
        gridData.grabExcessVerticalSpace = true;

        // add 'find:' label
        Label label = new Label(_popup, SWT.NULL);
        label.setText(Messages.getString("DataSetTable.PopUp.Find"));
        label.setBackground(_parent.getDisplay().getSystemColor(SWT.COLOR_INFO_BACKGROUND));
        
        // add input field for search text
        final Text input = new Text(_popup, SWT.SINGLE | SWT.FILL);
        input.setLayoutData(gridData);
        input.setBackground(_parent.getDisplay().getSystemColor(SWT.COLOR_INFO_BACKGROUND));

        
        // scroll columns whenever something is typed in input field.
        input.addModifyListener(new ModifyListener() {

            public void modifyText(ModifyEvent e) {

                Text t = (Text) e.widget;
                String text = t.getText();

                // locate column and show if found
                if (jumpToColumn(text)) {
                    input.setForeground(_parent.getDisplay().getSystemColor(SWT.COLOR_INFO_FOREGROUND));
                } else {
                    // give some subtle feedback to user that column doesn't exist..
                    input.setForeground(_parent.getDisplay().getSystemColor(SWT.COLOR_RED));                    
                }
            }

        });
        

        // add listener so that we can jump to next column match when
        // user hits enter..
        input.addKeyListener(new KeyAdapter() {

            public void keyPressed(KeyEvent e) {       
                                
                if (e.character == ENTER) {
                    // scroll to next match
                    if (jumpToColumn(null)) {
                        input.setForeground(_parent.getDisplay().getSystemColor(SWT.COLOR_INFO_FOREGROUND));
                    } else {
                        // give some subtle feedback to user that column doesn't exist..
                        input.setForeground(_parent.getDisplay().getSystemColor(SWT.COLOR_RED));                    
                    }
                }                
            }            
        });
        
        // close popup when user is no longer in inputfield
        input.addFocusListener(new FocusAdapter() {
            public void focusLost(FocusEvent e) {
                disposePopup();
            }
            
        });

        
        // activate popup
        _popup.open();
        _popup.forceActive();

    }


    /**
     * Close column finder popup;
     */
    private void disposePopup() {

        if (_popup != null && !_popup.isDisposed()) {
            _popup.close();
            _popup.dispose();
            _popup = null;
        }
    }
    
    
    /**
     * Jump to next availabel column with header name.
     * If the same name is processed again, we jump to
     * the next column with the same name.  If no further columns
     * are available, we jump to first available column again.
     *  
     * @param name of column to jump to.
     * @return true if a matching column was found
     */
    private boolean jumpToColumn(String name) {
        
        String text = null;
        
        if (name != null) {            
            // use input to find column
            text = name.toLowerCase().trim();
            _lastNameSearched = text;
            _lastColumnIndex = 0;
            
        } else {
            // use previous name to search
            text = _lastNameSearched;
            _lastColumnIndex += 1;
                        
        }
        
        if (text == null) {
            text = "";//$NON-NLS-1$
        }
        
        
        TableColumn[] columns = _table.getColumns();        
        if (columns == null || _lastColumnIndex >= columns.length) {
                       
            // no columns or we searched them all..
            _lastColumnIndex = 0;
            return false;
        }
        
        boolean columnFound = false;
        
        // find column
        for (int i = _lastColumnIndex; i < columns.length; i++) {
                       
            TableColumn column = columns[i];

            if (column.getText().toLowerCase().startsWith(text)) {

                columnFound = true;

                // first scroll all the way to right
                _table.showColumn(columns[columns.length - 1]);

                // now back to the column we want, this way it should be
                // the first column visible in most cases
                _table.showColumn(column);
                
                // move cursor to found column
                if (_table.getItemCount() > 0) {
                    _cursor.setSelection(0, i);
                    _cursor.setVisible(true);
                }

                // store column index so we can pickup where we left of
                // in case of repeated search
                _lastColumnIndex = i;
                
                break;

            }
        }
        
        // reset search to start from start again
        if (!columnFound) {
            _lastColumnIndex = 0;
        }
        
        
        return columnFound;
    }
}
