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
package org.talend.designer.core.ui.editor;

import java.util.List;
import java.util.Map;

import org.eclipse.draw2d.ConnectionLayer;
import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.FreeformLayeredPane;
import org.eclipse.draw2d.LayeredPane;
import org.eclipse.draw2d.ScalableFigure;
import org.eclipse.draw2d.ScalableFreeformLayeredPane;
import org.eclipse.draw2d.Viewport;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.gef.AutoexposeHelper;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editparts.GridLayer;
import org.eclipse.gef.editparts.ScalableFreeformRootEditPart;
import org.eclipse.gef.editparts.ViewportAutoexposeHelper;
import org.eclipse.gef.editparts.ZoomManager;
import org.eclipse.ui.IEditorInput;
import org.talend.commons.ui.gmf.draw2d.AnimatableZoomManager;
import org.talend.designer.core.ui.editor.nodes.CrossPlatformSwtEditPartViewer;
import org.talend.designer.core.ui.editor.nodes.CrossPlatformSwtFigureProxy;
import org.talend.designer.core.ui.editor.nodes.ICrossPlatformEditPartViewer;
import org.talend.designer.core.ui.editor.nodes.ICrossPlatformFigure;
import org.talend.designer.core.ui.editor.nodes.SelectionFeedbackEditPolicy;
import org.talend.designer.core.ui.editor.subjobcontainer.ICrossPlatformEditPart;
import org.talend.designer.core.ui.editor.subjobcontainer.ICrossPlatformRequest;
import org.talend.designer.core.ui.editor.subjobcontainer.ICrossPlatformRequestProxy;
import org.talend.designer.core.ui.editor.subjobcontainer.ICrossPlatformRootEditPart;
import org.talend.designer.core.ui.editor.subjobcontainer.SwtRequestProxyFactory;

/**
 * Modification of the default RootEditPart to add the possibility to change the color of the background and change the
 * grid.
 *
 * $Id: TalendScalableFreeformRootEditPart.java 7038 2007-11-15 14:05:48Z plegall $
 *
 */
public class TalendScalableFreeformRootEditPart extends ScalableFreeformRootEditPart implements ICrossPlatformRootEditPart {

    public static final String PROCESS_BACKGROUND_LAYER = "processBackgroundLayer"; //$NON-NLS-1$

    public static final String SUBJOB_BACKGROUND_LAYER = "processBackgroundLayer"; //$NON-NLS-1$

    public static final String MAP_REDUCE_LAYER = "mapReduceLayer"; //$NON-NLS-1$

    private IEditorInput editorInput;

    private AnimatableZoomManager zoomManager;

    private double[] zoomLevels = { .05, .1, .25, .5, .75, 1, 1.25, 1.5, 1.75, 2, 4 };

    private GridLayer gridLayer;

    private FeedbackLayer feedbackLayer;

    private CrossPlatformSwtEditPartViewer crossPlatformViewer;

    private CrossPlatformSwtFigureProxy crossPlatformFigure;

    private ICrossPlatformPartFactory crossPlatformPartFactory;

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.gef.editparts.ScalableFreeformRootEditPart#getZoomManager()
     */
    @Override
    public ZoomManager getZoomManager() {
        if (zoomManager == null) {
            zoomManager = new AnimatableZoomManager((ScalableFigure) getScaledLayers(), ((Viewport) getFigure()));
            zoomManager.setZoomLevels(zoomLevels);
            zoomManager.setZoomAnimationStyle(ZoomManager.ANIMATE_ZOOM_IN_OUT);
        }
        return zoomManager;
    }

    public TalendScalableFreeformRootEditPart(IEditorInput editorInput) {
        this.editorInput = editorInput;
    }

    @Override
    protected LayeredPane createPrintableLayers() {
        FreeformLayeredPane layeredPane = new FreeformLayeredPane();
        layeredPane.add(new FreeformLayer(), PRIMARY_LAYER);
        layeredPane.add(new ConnectionLayer(), CONNECTION_LAYER);
        return layeredPane;
    }

    @Override
    protected GridLayer createGridLayer() {
        if (gridLayer == null) {
            gridLayer = new TalendGridLayer();
        }
        return gridLayer;
    }

    @Override
    protected ScalableFreeformLayeredPane createScaledLayers() {
        ScalableFreeformLayeredPane layers = new ScalableFreeformLayeredPane();
        layers.add(new FreeformLayer(), SUBJOB_BACKGROUND_LAYER);
        layers.add(new FreeformLayer(), PROCESS_BACKGROUND_LAYER);
        layers.add(createGridLayer(), GRID_LAYER);
        layers.add(getPrintableLayers(), PRINTABLE_LAYERS);
        layers.add(new FreeformLayer(), MAP_REDUCE_LAYER);
        layers.add(new FreeformLayer(), SelectionFeedbackEditPolicy.TALEND_FEEDBACK_LAYER);
        layers.add(new FeedbackLayer(), SCALED_FEEDBACK_LAYER);
        feedbackLayer = new FeedbackLayer();
        return layers;
    }

    /**
     * Modification fo the default Layer. <br/>
     *
     * $Id: TalendScalableFreeformRootEditPart.java 7038 2007-11-15 14:05:48Z plegall $
     *
     */
    class FeedbackLayer extends FreeformLayer {

        FeedbackLayer() {
            setEnabled(false);
        }
    }

    public IEditorInput getEditorInput() {
        return editorInput;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.gef.editparts.FreeformGraphicalRootEditPart#getAdapter(java.lang.Class)
     */
    @Override
    public Object getAdapter(Class key) {
        if (key == AutoexposeHelper.class) {
            return new ViewportAutoexposeHelper(this, new Insets(100));
        }
        return super.getAdapter(key);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#deactivate()
     */
    @Override
    public void deactivate() {
        super.deactivate();
        editorInput = null;
        zoomManager = null;
        feedbackLayer = null;
        gridLayer = null;
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
    public List getModelChildren() {
        return super.getModelChildren();
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
    public ICrossPlatformEditPart getCrossPlatformContents() {
        return (ICrossPlatformEditPart) getContents();
    }

    @Override
    public ICrossPlatformPartFactory getCrossPlatformPartFactory() {
        if (crossPlatformPartFactory == null) {
            crossPlatformPartFactory = new CrossPlatformPartFactory();
        }
        return crossPlatformPartFactory;
    }

    @Override
    public Map getCrossPlatformEditPartRegistry() {
        return getViewer().getEditPartRegistry();
    }

    @Override
    public boolean isCrossPlatformActive() {
        return isActive();
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
