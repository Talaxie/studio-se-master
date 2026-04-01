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

import net.sourceforge.sqlexplorer.ExplorerException;
import net.sourceforge.sqlexplorer.Messages;
import net.sourceforge.sqlexplorer.plugin.SQLExplorerPlugin;
import net.sourceforge.sqlexplorer.plugin.views.DataPreviewView;

import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.TableCursor;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.IWorkbenchPage;

/**
 * @author Davy Vanherbergen
 * 
 */
public class DataSetTable {

    /**
     * Create a new table element for a resultset in a given composite.
     * 
     * @param composite canvas to draw table on
     * @param dataSet content of table
     * @param info text displayed in bottem left corner under table
     */
    public DataSetTable(Composite parent, final DataSet dataSet, String info) throws Exception {

        final Composite composite = new Composite(parent, SWT.FILL);
        
        GridLayout layout = new GridLayout();
        layout.numColumns = 2;                
        layout.marginLeft = 0;
        layout.horizontalSpacing = 0;
        layout.verticalSpacing = 2;
        layout.marginWidth = 0;
        layout.marginHeight = 0;
        
        GridData gridData = new GridData(GridData.FILL_BOTH);
        gridData.grabExcessHorizontalSpace = true;
        gridData.grabExcessVerticalSpace = true;
        
        composite.setLayout(layout);
        composite.setLayoutData(gridData);
        
        // check column labels & types
        DataSet.Column[] columns = dataSet.getColumns();
        String[] columnLabels = new String[columns.length];
        for (int i = 0; i < columnLabels.length; i++)
        	columnLabels[i] = columns[i].getCaption();

        if (columnLabels == null || columnLabels.length == 0)
            throw new Exception(Messages.getString("DataSetTable.errorInvalid"));
        
        // create table structure
        final TableViewer tableViewer = new TableViewer(composite, SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL | SWT.MULTI | SWT.VIRTUAL);
        final Table table = tableViewer.getTable();
        
        tableViewer.setColumnProperties(columnLabels);
        table.setItemCount(dataSet.getRows().length);

        // create listener for sorting
    	Listener sortListener = new Listener() {
    		public void handleEvent(Event e) {
    			
    			// determine new sort column and direction
    			TableColumn sortColumn = table.getSortColumn();
    			TableColumn currentColumn = (TableColumn) e.widget;
    			int dir = table.getSortDirection();
    			if (sortColumn == currentColumn) {
    				dir = dir == SWT.UP ? SWT.DOWN : SWT.UP;
    			} else {
    				table.setSortColumn(currentColumn);
    				dir = SWT.UP;
    			}
    			
    			// sort the data based on column and direction
                dataSet.sort(((Integer) currentColumn.getData("orignalColumnIndex")).intValue(), dir);//$NON-NLS-1$
    			
    			// update data displayed in table
    			table.setSortDirection(dir);
    			table.clearAll();
    		}
    	};
        
        GridData tGridData = new GridData();
        tGridData.horizontalSpan = 2;
        tGridData.grabExcessHorizontalSpace = true;
        tGridData.grabExcessVerticalSpace = true;
        tGridData.horizontalAlignment = SWT.FILL;
        tGridData.verticalAlignment = SWT.FILL;
        table.setLayoutData(tGridData);
        
        GridLayout tlayout = new GridLayout();
        tlayout.numColumns = 2;                
        tlayout.marginLeft = 0;
        table.setLayout(tlayout);
        
        table.setHeaderVisible(true);
        table.setLinesVisible(true);

        // store dataset for use in actions
        table.setData(dataSet);
        
        // add all column headers to our table
        for (int i = 0; i < columns.length; i++) {
            DataSet.Column colDef = columns[i];
            
            // add column header
            TableColumn column = new TableColumn(table, colDef.isRightJustify() ? SWT.RIGHT : SWT.LEFT);           
            column.setText(colDef.getCaption());
            column.setMoveable(true);
            column.setResizable(true);            
            column.addListener(SWT.Selection, sortListener);
            column.setData("orignalColumnIndex", new Integer(i));//$NON-NLS-1$
        }
                     
        tableViewer.setContentProvider(new DataSetTableContentProvider());
        tableViewer.setLabelProvider(new DataSetTableLabelProvider());
        tableViewer.setInput(dataSet);

        // add status bar labels
        Label infoLabel = new Label(composite, SWT.NULL);
        infoLabel.setText(info);
        infoLabel.setLayoutData(new GridData(SWT.LEFT, SWT.NULL, true, false));
        
        final Label positionLabel = new Label(composite, SWT.NULL);
        positionLabel.setText("");//$NON-NLS-1$
        positionLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.NULL, true, false));

        // create a TableCursor to navigate around the table
        final TableCursor cursor = new TableCursor(table, SWT.NONE);
        cursor.setBackground(table.getDisplay().getSystemColor(SWT.COLOR_LIST_SELECTION));
        cursor.setForeground(table.getDisplay().getSystemColor(SWT.COLOR_LIST_SELECTION_TEXT));
        cursor.setLayout(new FillLayout());
        cursor.setVisible(false);
        cursor.addSelectionListener(new SelectionAdapter() {
            // when the TableEditor is over a cell, select the corresponding row in 
            // the table
            public void widgetSelected(SelectionEvent e) {
                
                table.setSelection(new TableItem[] {cursor.getRow()});
                cursor.setVisible(true);
                
                // update label with row/column position
                positionLabel.setText(Messages.getString("DatabaseDetailView.Tab.RowPrefix") + " " + 
                        (table.indexOf(cursor.getRow()) + 1) + Messages.getString("DatabaseDetailView.Tab.ColumnPrefix") 
                        + " " + (cursor.getColumn() + 1)); //$NON-NLS-2$ $NON-NLS-4$          
                positionLabel.getParent().layout();
                positionLabel.redraw();
                
                // Show the preview
    			IWorkbenchPage page = SQLExplorerPlugin.getDefault().getWorkbench().getActiveWorkbenchWindow().getActivePage();
    			if (page != null) {
    		        DataPreviewView view = (DataPreviewView)page.findView(DataPreviewView.class.getName());
    		        if (view != null) {
    		        	TableItem row = cursor.getRow();
    		        	int column = cursor.getColumn();
    		        	DataSetRow dsRow = (DataSetRow)row.getData();
    		        	Object obj = dsRow.getRawObjectValue(column);
    		        	try {
    		        		view.previewData(null, obj);
    		        	}catch(ExplorerException ex) {
    		        		SQLExplorerPlugin.error(ex.getMessage(), ex);
    		        	}
    		        }
    			}
            }
        });

        // add resize listener for cursor, to stop cursor from
        // taking strange shapes after being table is resized
        cursor.addControlListener(new ControlAdapter() {
            public void controlResized(ControlEvent e) {
                if (cursor != null) {
                    if (cursor.getRow() == null) {
                        cursor.setVisible(false);
                    } else {
                        cursor.layout();
                        cursor.redraw();
                        cursor.setVisible(true);
                    }
                }
            }
        });
        
        
        table.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                Table t = (Table) e.widget;
                if (t.getItemCount() != 0) {
                    cursor.setVisible(true);
                }
            }           
        });

 
        // refresh tab on F5, copy cell on CTRL-C, etc
        KeyListener keyListener = new DataSetTableKeyListener(parent, table, cursor);
        cursor.addKeyListener(keyListener);
        table.addKeyListener(keyListener);
                        
        
        // add context menu to table & cursor
        final DataSetTableActionGroup actionGroup = new DataSetTableActionGroup(table, cursor);
        MenuManager menuManager = new MenuManager("DataSetTableContextMenu");//$NON-NLS-1$
        menuManager.setRemoveAllWhenShown(true);
        Menu contextMenu = menuManager.createContextMenu(table);        
        
        tableViewer.getControl().setMenu(contextMenu);
        cursor.setMenu(contextMenu);
        
        menuManager.addMenuListener(new IMenuListener() {

            public void menuAboutToShow(IMenuManager manager) {
                actionGroup.fillContextMenu(manager);
            }
        });
                    
        tableViewer.getTable().pack();
        for (TableColumn column : tableViewer.getTable().getColumns())
            column.pack(); 
    }

}


