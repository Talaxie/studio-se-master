// ============================================================================
//
// Copyright (C) 2006-2023 Talaxie Inc. - www.deilink.fr
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talaxie SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.designer.core.ui.editor.nodes;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.gef.EditPolicy;
import org.talend.core.model.process.IConnection;
import org.talend.core.model.process.INode;
import org.talend.designer.core.ui.editor.subjobcontainer.AbsCrossPlatformEditPart;
import org.talend.designer.core.ui.editor.subjobcontainer.ICrossPlatformConnectionEditPart;
import org.talend.designer.core.ui.editor.subjobcontainer.ICrossPlatformEditPart;


/**
 * DOC cmeng  class global comment. Detailled comment
 */
public class CrossPlatformNodePart extends AbsCrossPlatformEditPart implements ICrossPlatformNodePart, PropertyChangeListener {

    private static final Logger log = Logger.getLogger(CrossPlatformNodePart.class);

    public CrossPlatformNodePart(Object model) {
        super(model);
    }

    @Override
    public void createEditPolicies() {
        super.createEditPolicies();
        installEditPolicy(EditPolicy.COMPONENT_ROLE, new CrossPlatformNodeEditPolicy());
        installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE, new CrossPlatformNodeGraphicalEditPolicy());
    }

    @Override
    public void propertyChange(final PropertyChangeEvent changeEvent) {
        boolean needUpdateSubjob = false;
        if (!this.isCrossPlatformActive()) {
            return;
        }
        log.info(" # # # # # # # # # event to be implemented: " + changeEvent.toString());
    }

    @Override
    protected void refreshSourceConnections() {
        int i;
        ICrossPlatformConnectionEditPart editPart;
        Object model;

        Map modelToEditPart = new HashMap();
        List editParts = getSourceConnections();

        for (i = 0; i < editParts.size(); i++) {
            editPart = (ICrossPlatformConnectionEditPart) editParts.get(i);
            modelToEditPart.put(editPart.getCrossPlatformModel(), editPart);
        }

        List modelObjects = getCrossPlatformModelSourceConnections();

        // List<? extends INodeConnector> connList = node.getListConnector();
        if (modelObjects == null) {
            modelObjects = new ArrayList();
        }
        for (i = 0; i < modelObjects.size(); i++) {
            model = modelObjects.get(i);

            if (model instanceof IConnection) {
                INode sourcenode = ((IConnection) model).getSource();
                INode targetnode = ((IConnection) model).getSource();
                String connectorName = ((IConnection) model).getConnectorName();
                if (sourcenode.getConnectorFromName(connectorName) == null
                        && targetnode.getConnectorFromName(connectorName) == null) {
                    return;
                }
            }
            if (i < editParts.size() && ((ICrossPlatformEditPart) editParts.get(i)).getCrossPlatformModel() == model) {
                continue;
            }

            editPart = (ICrossPlatformConnectionEditPart) modelToEditPart.get(model);
            if (editPart != null) {
                reorderSourceConnection(editPart, i);
            } else {
                editPart = createOrFindConnection(model);
                addSourceConnection(editPart, i);
            }
        }

        // Remove the remaining EditParts
        List trash = new ArrayList();
        for (; i < editParts.size(); i++) {
            trash.add(editParts.get(i));
        }
        for (i = 0; i < trash.size(); i++) {
            removeSourceConnection((ICrossPlatformConnectionEditPart) trash.get(i));
        }
    }

    @Override
    protected void refreshTargetConnections() {
        int i;
        ICrossPlatformConnectionEditPart editPart;
        Object model;

        Map mapModelToEditPart = new HashMap();
        List connections = getTargetConnections();

        for (i = 0; i < connections.size(); i++) {
            editPart = (ICrossPlatformConnectionEditPart) connections.get(i);
            mapModelToEditPart.put(editPart.getCrossPlatformModel(), editPart);
        }

        List modelObjects = getCrossPlatformModelTargetConnections();
        if (modelObjects == null) {
            modelObjects = new ArrayList();
        }

        for (i = 0; i < modelObjects.size(); i++) {
            model = modelObjects.get(i);
            if (model instanceof IConnection) {
                INode sourcenode = ((IConnection) model).getSource();
                INode targetnode = ((IConnection) model).getSource();
                String connectorName = ((IConnection) model).getConnectorName();
                if (sourcenode.getConnectorFromName(connectorName) == null
                        && targetnode.getConnectorFromName(connectorName) == null) {
                    return;
                }
            }
            if (i < connections.size() && ((ICrossPlatformEditPart) connections.get(i)).getCrossPlatformModel() == model) {
                continue;
            }

            editPart = (ICrossPlatformConnectionEditPart) mapModelToEditPart.get(model);
            if (editPart != null) {
                reorderTargetConnection(editPart, i);
            } else {
                editPart = createOrFindConnection(model);
                addTargetConnection(editPart, i);
            }
        }

        // Remove the remaining Connection EditParts
        List trash = new ArrayList();
        for (; i < connections.size(); i++) {
            trash.add(connections.get(i));
        }
        for (i = 0; i < trash.size(); i++) {
            removeTargetConnection((ICrossPlatformConnectionEditPart) trash.get(i));
        }
    }

    @Override
    public List getCrossPlatformModelSourceConnections() {
        return ICrossPlatformNodePart.super.getCrossPlatformModelSourceConnections();
    }

    @Override
    public List getCrossPlatformModelTargetConnections() {
        return ICrossPlatformNodePart.super.getCrossPlatformModelTargetConnections();
    }

}
