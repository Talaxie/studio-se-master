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

import org.eclipse.jface.action.Action;
import org.eclipse.swt.custom.TableCursor;
import org.eclipse.swt.widgets.Table;


/**
 * Abstract implementation for a context menu action of a DataSetTable.
 * Extend this class to add new actions to the DataSetTable.
 * 
 * @author Davy Vanherbergen
 */
public abstract class AbstractDataSetTableContextAction extends Action {

    protected Table _table;
    
    protected TableCursor _cursor;
    

    /**
     * Store table for use in the actions.
     * @param table
     */
    public final void setTable(Table table) {
        _table = table;        
    }

    /**
     * Store table cursor for use in the actions.
     * @param tableCursor
     */
    public final void setTableCursor(TableCursor cursor) {
        _cursor = cursor;        
    }

    
    /**
     * Implement this method to return true when your action is available
     * for the active table.  When true, the action will be included in the
     * context menu, when false it will be ignored.
     * 
     * @return true if the action should be included in the context menu
     */
    public boolean isAvailable() {
        return true;
    }
}
