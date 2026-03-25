package org.talend.designer.abstractmap.ui.visualmap.link;

import org.talend.designer.abstractmap.model.tableentry.ITableEntry;
import org.talend.designer.abstractmap.ui.visualmap.zone.IMapZone;

/**
 * DOC amaumont class global comment. Detailled comment <br/>
 * 
 * $Id: PointLinkDescriptor.java 898 2006-12-07 11:06:17Z amaumont $
 * 
 */
public class PointLinkDescriptor {

    private ITableEntry tableEntry;

    private IMapZone zone;

    public PointLinkDescriptor(ITableEntry dataMapTableEntry, IMapZone zone) {
        super();
        this.tableEntry = dataMapTableEntry;
        this.zone = zone;
    }

    public ITableEntry getTableEntry() {
        return this.tableEntry;
    }

    public void setTableEntry(ITableEntry dataMapTableEntry) {
        this.tableEntry = dataMapTableEntry;
    }

    public IMapZone getZone() {
        return this.zone;
    }

    public void setZone(IMapZone zone) {
        this.zone = zone;
    }

}
