package org.talend.commons.ui.swt.linking;

import java.util.IdentityHashMap;

import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;
import org.talend.commons.ui.runtime.utils.TableUtils;


public class DataToTableItemCache {

    private IdentityHashMap<Object, TableItem> map;
    private Table table;

    public DataToTableItemCache(Table tree) {
        super();
        this.table = tree;
        map = new IdentityHashMap<Object, TableItem>();
    }

    public TableItem getTableItem(Object data) {
        TableItem tableItem = map.get(data);
        if(tableItem == null) {
            tableItem = TableUtils.getTableItem(this.table, data);
            if(tableItem != null) {
                map.put(data, tableItem);
            }
        }
        return tableItem;
    }
    
    public void clear() {
        map.clear();
    }
    
    
}
