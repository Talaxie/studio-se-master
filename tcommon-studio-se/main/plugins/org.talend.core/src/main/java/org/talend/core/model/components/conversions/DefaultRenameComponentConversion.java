// ============================================================================
//
// Copyright (C) 2006-2022 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.core.model.components.conversions;

import org.eclipse.emf.common.util.EList;
import org.talend.commons.runtime.model.components.IComponentConstants;
import org.talend.core.model.components.ComponentUtilities;
import org.talend.designer.core.model.utils.emf.talendfile.ConnectionType;
import org.talend.designer.core.model.utils.emf.talendfile.ElementParameterType;
import org.talend.designer.core.model.utils.emf.talendfile.MetadataType;
import org.talend.designer.core.model.utils.emf.talendfile.NodeType;
import org.talend.designer.core.model.utils.emf.talendfile.ProcessType;
import org.talend.designer.core.model.utils.emf.talendfile.SubjobType;

/**
 * @author bhe created on Jul 6, 2022
 *
 */
public class DefaultRenameComponentConversion implements IComponentConversion {

    private String newName;

    private String oldName;

    /**
     * Rename component name
     * 
     * @param oldName old base name of the component, e.g. NetSuiteV2019Input
     * @param newName new base name of the component, e.g. NetSuiteNewInput
     */
    public DefaultRenameComponentConversion(String oldName, String newName) {
        super();
        this.newName = newName;
        this.oldName = oldName;
    }

    public void transform(NodeType node) {
        node.setComponentName(newName);
        ProcessType item = (ProcessType) node.eContainer();
        String oldNodeUniqueName = ComponentUtilities.getNodeUniqueName(node);
        ComponentUtilities.setNodeUniqueName(node, oldNodeUniqueName.replaceAll(oldName, newName));
        replaceAllInAllNodesParameterValue(item, this.oldName, this.newName);
    }

    protected static void replaceAllInAllNodesParameterValue(ProcessType item, String oldName, String newName) {
        for (Object o : item.getNode()) {
            NodeType nt = (NodeType) o;
            ComponentUtilities.replaceInNodeParameterValue(nt, oldName, newName);
            EList metaList = nt.getMetadata();
            if (metaList != null) {
                if (!metaList.isEmpty()) {
                    for (Object obj : metaList) {
                        MetadataType meta = (MetadataType) obj;
                        if (meta.getName().contains(oldName)) {
                            meta.setName(meta.getName().replaceAll(oldName, newName));
                        }
                    }
                }
            }
        }
        for (Object o : item.getConnection()) {
            ConnectionType currentConnection = (ConnectionType) o;
            if (currentConnection.getSource().contains(oldName)) {
                currentConnection.setSource(currentConnection.getSource().replaceAll(oldName, newName));
            }
            if (currentConnection.getTarget().contains(oldName)) {
                currentConnection.setTarget(currentConnection.getTarget().replaceAll(oldName, newName));
            }
            if (currentConnection.getMetaname().contains(oldName)) {
                currentConnection.setMetaname(currentConnection.getMetaname().replaceAll(oldName, newName));
            }

            if ("RUN_IF".equals(currentConnection.getConnectorName())) {
                for (Object obj : currentConnection.getElementParameter()) {
                    ElementParameterType type = (ElementParameterType) obj;
                    if ("CONDITION".equals(type.getName())) {
                        if (type.getValue() != null && type.getValue().contains(oldName)) {
                            String replaceAll = type.getValue().replaceAll(oldName, newName);
                            type.setValue(replaceAll);
                        }
                        break;
                    }
                }
            }
        }

        for (Object o : item.getSubjob()) {
            SubjobType sj = (SubjobType) o;
            for (Object obj : sj.getElementParameter()) {
                ElementParameterType p = (ElementParameterType) obj;
                if (p.getName().equals(IComponentConstants.UNIQUE_NAME)) {
                    if (p.getValue() != null && p.getValue().contains(oldName)) {
                        String replaceAll = p.getValue().replaceAll(oldName, newName);
                        p.setValue(replaceAll);
                    }
                }
            }
        }
    }

    public String getNewName() {
        return this.newName;
    }

    public void setNewName(String newName) {
        this.newName = newName;
    }
}
