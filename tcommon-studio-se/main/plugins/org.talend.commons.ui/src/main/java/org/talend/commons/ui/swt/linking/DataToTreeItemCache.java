package org.talend.commons.ui.swt.linking;

import java.util.IdentityHashMap;

import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
import org.talend.commons.ui.utils.TreeUtils;


public class DataToTreeItemCache {

    private IdentityHashMap<Object, TreeItem> map;
    private Tree tree;

    public DataToTreeItemCache(Tree tree) {
        super();
        this.tree = tree;
        map = new IdentityHashMap<Object, TreeItem>();
    }

    public TreeItem getTreeItem(Object data) {
        TreeItem treeItem = map.get(data);
        if (treeItem == null) {
            treeItem = TreeUtils.getTreeItem(this.tree, data);
            // if(treeItem != null) {
            // map.put(data, treeItem);
            // }
        }
        return treeItem;
    }

    public void clear() {
        map.clear();
    }


}
