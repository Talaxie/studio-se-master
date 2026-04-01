// ============================================================================
//
// Copyright (C) 2006-2021 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.core.ui.properties.tab;

import org.apache.commons.collections.BidiMap;
import org.eclipse.swt.widgets.Composite;
import org.talend.core.model.metadata.IDynamicBaseProperty;
import org.talend.core.model.process.Element;
import org.talend.core.model.process.INode;
import org.talend.core.model.process.IProcess;
import org.talend.core.model.process.IProcess2;
import org.talend.designer.core.IMultiPageTalendEditor;

/**
 * DOC nrousseau class global comment. Detailled comment <br/>
 *
 */
public interface IDynamicProperty extends IDynamicBaseProperty {

    public BidiMap getHashCurControls();

    public IMultiPageTalendEditor getPart();

    public Composite getComposite();

    // public Map<String, IMetadataTable> getRepositoryTableMap();

    public void setCurRowSize(int i);

    public int getCurRowSize();

    /* 16969 */
    // public Map<String, ConnectionItem> getRepositoryConnectionItemMap();

    // public Map<String, Query> getRepositoryQueryStoreMap();

    public void refresh();

    @Override
    default IProcess2 getProcess() {
        IProcess process = null;
        IMultiPageTalendEditor part = getPart();
        if (part == null) {
            // achen modify to fix 0005991 part is null
            Element elem = getElement();
            if (elem instanceof INode) {
                process = ((INode) elem).getProcess();
            }
        } else {
            process = part.getProcess();
        }
        return (IProcess2) process;
    }

}
