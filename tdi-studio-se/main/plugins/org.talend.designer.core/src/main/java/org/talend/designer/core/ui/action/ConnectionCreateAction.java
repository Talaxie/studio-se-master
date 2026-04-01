// ============================================================================
//
// Copyright (C) 2006-2021 Talaxie Inc. - www.deilink.fr
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talaxie SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.designer.core.ui.action;

import java.util.List;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Event;
import org.eclipse.ui.IWorkbenchPart;
import org.talend.core.model.process.EConnectionType;
import org.talend.core.model.process.INodeConnector;
import org.talend.designer.core.ui.action.CrossPlatformConnectionCreateAction.IConnectionCreationFactory;
import org.talend.designer.core.ui.editor.nodes.NodePart;

/**
 * Action that manage to create a connection from the context menu. A connection type is used to know which kind of
 * connection will be created. <br/>
 *
 * $Id$
 *
 */
public class ConnectionCreateAction extends SelectionAction implements ICrossPlatformConnectionCreateActionHook {

    public static final String ID = "org.talend.designer.core.ui.editor.action.ConnectionCreateAction"; //$NON-NLS-1$

    private CrossPlatformConnectionCreateAction action;

    /**
     * Define the type of the connection and the workbench part who will manage the connection.
     *
     * @param part
     * @param connecType
     */
    public ConnectionCreateAction(IWorkbenchPart part, EConnectionType connecType) {
        super(part);
        action = new CrossPlatformConnectionCreateAction(null, connecType, this);
        // setId(ID+connecType.getName());
    }

    public ConnectionCreateAction(IWorkbenchPart part, INodeConnector nodeConnector) {
        super(part);
        action = new CrossPlatformConnectionCreateAction(null, nodeConnector, this);
        // setId(ID+connecType.getName());
    }

    @Override
    public List getCrossPlatformSelectedObjects() {
        return getSelectedObjects();
    }

    @Override
    protected boolean calculateEnabled() {
        return action.canPerformAction(getCrossPlatformSelectedObjects());
    }

    @Override
    public boolean checkExistConnectionName() {
        return isListenerAttached();
    }

    public List<INodeConnector> getConnectors() {
        return action.getConnectors();
    }

    public List<String> getMenuList() {
        return action.getMenuList();
    }

    @Override
    public void run() {
        action.run(getCrossPlatformSelectedObjects());
    }

    @Override
    public void runConnectionCreation(IConnectionCreationFactory factory) {

        NodePart nodePart = (NodePart) action.getNodePart();

        TalendConnectionCreationTool myConnectTool = new TalendConnectionCreationTool(factory, true);
        myConnectTool.performConnectionStartWith(nodePart);
        nodePart.getViewer().getEditDomain().setActiveTool(myConnectTool);

        /**
         * Create a mouse down event that thinks it is over the blob and dispatch it. This is a bit of a fudge to mimic
         * what the user ought to do.
         */
        Point point = null;
        point = nodePart.getFigure().getClientArea().getCenter();

        Point p = point;
        nodePart.getFigure().translateToAbsolute(p);

        Canvas canvas = (Canvas) nodePart.getViewer().getControl();
        Event event = new Event();
        event.button = 1;
        event.count = 0;
        event.detail = 0;
        event.end = 0;
        event.height = 0;
        event.keyCode = 0;
        event.start = 0;
        event.stateMask = 0;
        event.time = 9516624; // any old time... doesn't matter
        event.type = 3;
        event.widget = canvas;
        event.width = 0;
        event.x = p.x + 3;
        event.y = p.y + 3;
        /**
         * Set the connection tool to be the current tool
         */

        canvas.notifyListeners(3, event);
    }

}
