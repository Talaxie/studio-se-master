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
package org.talend.designer.gefabstractmap.editor;

import java.util.Collection;
import java.util.List;

import org.eclipse.draw2d.ExclusionSearch;
import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.ui.parts.GraphicalViewerImpl;
import org.talend.designer.gefabstractmap.figures.manager.FiguresManager;
import org.talend.designer.gefabstractmap.manager.AbstractMapperManager;
import org.talend.designer.gefabstractmap.part.InputTablePart;
import org.talend.designer.gefabstractmap.part.MapperRootEditPart;
import org.talend.designer.gefabstractmap.part.MapperTablePart;
import org.talend.designer.gefabstractmap.part.OutputTablePart;
import org.talend.designer.gefabstractmap.part.TableEntityPart;
import org.talend.designer.gefabstractmap.part.VarTablePart;
import org.talend.designer.gefabstractmap.utils.MapperUtils;

/**
 * created by wchen on 2013-1-14 Detailled comment
 *
 */
public abstract class MapperGraphicalViewer extends GraphicalViewerImpl {

    // same as org.eclipse.gef.internal.InternalGEFPlugin.MONITOR_SCALE_PROPERTY (internal API)
    private static final String MONITOR_SCALE_PROPERTY = "monitorScale"; //$NON-NLS-1$

    private FiguresManager listener;

    private AbstractMapperManager mapperManager;

    public MapperGraphicalViewer() {
        listener = createFiguresManager();
        this.addSelectionChangedListener(listener);
    }

    protected abstract FiguresManager createFiguresManager();

    public IFigure findFigureAt(int x, int y, Collection exclude, final Conditional condition) {
        class ConditionalTreeSearch extends ExclusionSearch {

            ConditionalTreeSearch(Collection coll) {
                super(coll);
            }

            @Override
            public boolean accept(IFigure figure) {
                EditPart editpart = null;
                while (editpart == null && figure != null) {
                    editpart = (EditPart) getVisualPartMap().get(figure);
                    figure = figure.getParent();
                }
                return editpart != null && (condition == null || condition.evaluate(editpart));
            }
        }
        return getLightweightSystem().getRootFigure().findFigureAt(x, y, new ConditionalTreeSearch(exclude));
    }

    @Override
    public void select(EditPart editpart) {

        if (editpart instanceof VarTablePart) {
            return;
        }

        if (editpart instanceof MapperRootEditPart) {
            return;
        }

        // set false to dispatch mouse release event ??? need or not mouseListeners is executed before selection change
        // setRouteEventsToEditDomain(false);

        if ((getSelectedEditParts().size() == 1) && (getSelectedEditParts().get(0) == editpart)) {
            return;
        }

        primDeselectAll(editpart);
        appendSelection(editpart); // fireSelectionChanged() is called here
    }

    /*
     * if partToAppend is inputTree , don't clean all outputTree in selection list , leave the first one by default . if
     * partToAppend is outputTree , do the same for inputTree selections
     */
    private void primDeselectAll(EditPart eidtPart) {
        EditPart partToAppend = eidtPart;
        List list = primGetSelectedEditParts();

        if (partToAppend instanceof TableEntityPart) {
            partToAppend = MapperUtils.getMapperTablePart((TableEntityPart) partToAppend);
        }

        EditPart part;
        MapperTablePart abstractTreePart = null;
        for (int i = 0; i < list.size(); i++) {
            part = (EditPart) list.get(i);
            if (partToAppend instanceof InputTablePart) {
                if (abstractTreePart == null && part instanceof OutputTablePart) {
                    abstractTreePart = (MapperTablePart) part;
                    continue;
                }
            } else if (partToAppend instanceof OutputTablePart) {
                if (abstractTreePart == null && part instanceof InputTablePart) {
                    abstractTreePart = (MapperTablePart) part;
                    continue;
                }
            }
            part.setSelected(EditPart.SELECTED_NONE);
        }
        list.clear();
        if (abstractTreePart != null) {
            list.add(abstractTreePart);
        }
    }

    public AbstractMapperManager getMapperManager() {
        return mapperManager;
    }

    public void setMapperManager(AbstractMapperManager mapperManager) {
        this.mapperManager = mapperManager;
        if (!selectionListeners.contains(mapperManager)) {
            mapperManager.setGraphicalViewer(this);
            addSelectionChangedListener(mapperManager);
        }
    }

    public FiguresManager getFiguresManager() {
        return this.listener;
    }

    /**
     * Returns the size of the viewer control in figure coordinates.
     * <p>
     * When the draw2d autoscale is enabled (Windows with a zoom > 100%), the control size is in physical pixels while
     * the figures are scaled by the monitor zoom, so the control size must be divided by this zoom.
     */
    public org.eclipse.swt.graphics.Point getAvailableSize() {
        org.eclipse.swt.graphics.Point size = getControl().getSize();
        Object scale = getProperty(MONITOR_SCALE_PROPERTY);
        if (scale instanceof Double) {
            double monitorScale = (Double) scale;
            if (monitorScale > 0 && monitorScale != 1) {
                return new org.eclipse.swt.graphics.Point((int) (size.x / monitorScale), (int) (size.y / monitorScale));
            }
        }
        return size;
    }

    public static org.eclipse.swt.graphics.Point getAvailableSize(EditPartViewer viewer) {
        if (viewer instanceof MapperGraphicalViewer) {
            return ((MapperGraphicalViewer) viewer).getAvailableSize();
        }
        return viewer.getControl().getSize();
    }
}
