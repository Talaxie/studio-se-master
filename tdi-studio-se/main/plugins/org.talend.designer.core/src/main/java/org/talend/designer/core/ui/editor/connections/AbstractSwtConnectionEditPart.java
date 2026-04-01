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
package org.talend.designer.core.ui.editor.connections;

import java.util.List;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editparts.AbstractConnectionEditPart;
import org.talend.designer.core.ui.editor.nodes.CrossPlatformSwtEditPartViewer;
import org.talend.designer.core.ui.editor.nodes.CrossPlatformSwtFigureProxy;
import org.talend.designer.core.ui.editor.nodes.ICrossPlatformEditPartViewer;
import org.talend.designer.core.ui.editor.nodes.ICrossPlatformFigure;
import org.talend.designer.core.ui.editor.subjobcontainer.ICrossPlatformConnectionEditPart;
import org.talend.designer.core.ui.editor.subjobcontainer.ICrossPlatformEditPart;
import org.talend.designer.core.ui.editor.subjobcontainer.ICrossPlatformRequest;
import org.talend.designer.core.ui.editor.subjobcontainer.ICrossPlatformRequestProxy;
import org.talend.designer.core.ui.editor.subjobcontainer.ICrossPlatformRootEditPart;
import org.talend.designer.core.ui.editor.subjobcontainer.SwtRequestProxyFactory;


public abstract class AbstractSwtConnectionEditPart extends AbstractConnectionEditPart
        implements ICrossPlatformConnectionEditPart {

    private CrossPlatformSwtEditPartViewer crossPlatformViewer;

    private CrossPlatformSwtFigureProxy crossPlatformFigure;

    public AbstractSwtConnectionEditPart() {
        super();
    }

    @Override
    public Object getCrossPlatformModel() {
        return getModel();
    }

    @Override
    public void setCrossPlatformModel(Object model) {
        setModel(model);
    }

    @Override
    public ICrossPlatformRootEditPart getCrossPlatformRoot() {
        return (ICrossPlatformRootEditPart) getRoot();
    }

    @Override
    public ICrossPlatformEditPart getCrossPlatformParentPart() {
        return (ICrossPlatformEditPart) getParent();
    }

    @Override
    public void setCrossPlatformParentPart(ICrossPlatformEditPart part) {
        setParent((EditPart) part);
    }

    @Override
    public List getCrossPlatformChildren() {
        return getChildren();
    }

    @Override
    public List getCrossPlatformModelChildren() {
        return this.getModelChildren();
    }

    @Override
    public ICrossPlatformEditPart getCrossPlatformSource() {
        return (ICrossPlatformEditPart) getSource();
    }

    @Override
    public void setCrossPlatformSource(ICrossPlatformEditPart editPart) {
        setSource((EditPart) editPart);
    }

    @Override
    public ICrossPlatformEditPart getCrossPlatformTarget() {
        return (ICrossPlatformEditPart) getTarget();
    }

    @Override
    public void setCrossPlatformTarget(ICrossPlatformEditPart editPart) {
        setTarget((EditPart) editPart);
    }

    @Override
    public ICrossPlatformEditPartViewer getCrossPlatformViewer() {
        if (crossPlatformViewer == null) {
            crossPlatformViewer = new CrossPlatformSwtEditPartViewer(getViewer());
        }
        return crossPlatformViewer;
    }

    @Override
    public ICrossPlatformFigure getCrossPlatformFigure() {
        if (crossPlatformFigure == null) {
            crossPlatformFigure = new CrossPlatformSwtFigureProxy(getFigure());
        }
        return crossPlatformFigure;
    }

    @Override
    public Command getCommand(ICrossPlatformRequest request) {
        if (request instanceof ICrossPlatformRequestProxy) {
            return super.getCommand(((ICrossPlatformRequestProxy) request).getHost());
        }
        Request swtRequest = SwtRequestProxyFactory.get().convert(request);
        return super.getCommand(swtRequest);
    }

    @Override
    public boolean isCrossPlatformActive() {
        return this.isActive();
    }

    @Override
    public void crossPlatformActivate() {
        activate();
    }

    @Override
    public void crossPlatformDeactivate() {
        deactivate();
    }

    @Override
    public void refreshCrossPlatformVisuals() {
        refreshVisuals();
    }

    @Override
    public void crossPlatformRefresh() {
        refresh();
    }

}
