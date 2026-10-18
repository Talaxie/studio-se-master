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
package org.talend.designer.gefabstractmap.policy;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Locator;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.PrecisionRectangle;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.handles.MoveHandle;
import org.eclipse.gef.handles.MoveHandleLocator;
import org.talend.designer.gefabstractmap.figures.table.entity.TableEntityFigure;
import org.talend.designer.gefabstractmap.figures.var.VarEntityFigure;
import org.talend.designer.gefabstractmap.part.MapperTablePart;
import org.talend.designer.gefabstractmap.part.TableEntityPart;
import org.talend.designer.gefabstractmap.utils.MapperUtils;
import org.talend.designer.mapper.ui.color.ColorInfo;

/**
 * WCHEN class global comment. Detailled comment
 */
public class RowSelectionEditPolicy extends NonResizableEditPolicy {

    @Override
    protected List createSelectionHandles() {
        List list = new ArrayList();
        list.add(new RowMoveHandler((GraphicalEditPart) getHost()));
        return list;
    }

    private Locator createLocator(GraphicalEditPart owner) {
        IFigure figure = owner.getFigure();
        if (owner instanceof TableEntityPart) {
            TableEntityFigure treeNodeFigure = (TableEntityFigure) figure;
            // table figure to restrict the width
            MapperTablePart abstractInOutTreePart = MapperUtils.getMapperTablePart((TableEntityPart) owner);
            IFigure parentFigure = ((GraphicalEditPart) abstractInOutTreePart).getFigure();
            Rectangle treeBounds = parentFigure.getBounds();
            Rectangle rowBounds = treeNodeFigure.getElement().getBounds();
            Rectangle treeNodeBounds = figure.getBounds();
            if (treeBounds.x + 1 != treeNodeBounds.x || treeNodeBounds.width > treeBounds.width) {
                return new RowLocator(figure,
                        new Rectangle(treeBounds.x + 1, treeNodeBounds.y, treeBounds.width - 2, rowBounds.height));
            } else {
                Rectangle bounds = treeNodeBounds.getCopy();
                bounds.height = rowBounds.height;
                return new RowLocator(figure, bounds);
            }
        } else if (figure instanceof VarEntityFigure) {
            return new RowLocator(figure, figure.getBounds().getCopy());
        }

        return new MoveHandleLocator(figure);

    }

    /**
     * Same as {@link MoveHandleLocator}, but with bounds which differ from the reference figure ones. The bounds are
     * translated to absolute coordinates by the reference figure (in the figure tree), so the scroll, the zoom and the
     * draw2d autoscale (Windows zoom > 100%) are taken into account.
     */
    static class RowLocator implements Locator {

        private final IFigure reference;

        private final Rectangle bounds;

        RowLocator(IFigure reference, Rectangle bounds) {
            this.reference = reference;
            this.bounds = bounds;
        }

        @Override
        public void relocate(IFigure target) {
            Insets insets = target.getInsets();
            Rectangle r = new PrecisionRectangle(bounds.getResized(-1, -1));
            reference.translateToAbsolute(r);
            target.translateToRelative(r);
            r.translate(-insets.left, -insets.top);
            r.resize(insets.getWidth() + 1, insets.getHeight() + 1);
            target.setBounds(r);
        }
    }

    class RowMoveHandler extends MoveHandle {

        public RowMoveHandler(GraphicalEditPart owner) {
            super(owner, null);
        }

        @Override
        public Locator getLocator() {
            setLocator(createLocator(getOwner()));
            return super.getLocator();
        }

        /*
         * (non-Javadoc)
         *
         * @see org.eclipse.draw2d.Figure#paint(org.eclipse.draw2d.Graphics)
         */
        @Override
        public void paint(Graphics graphics) {
            // super.paint(graphics);
            graphics.setAlpha(40);
            Rectangle r = getBounds().getCopy();
            r.shrink(1, 1);
            graphics.setBackgroundColor(ColorInfo.COLOR_COLUMN_SELECTION());
            // graphics.setBackgroundColor(ColorConstants.blue);
            graphics.fillRectangle(r.x, r.y, r.width, r.height);
            // graphics.setForegroundColor(ColorProviderMapper.getColor(ColorInfo.COLOR_COLUMN_SELECTION));
            // graphics.drawRectangle(r.x, r.y, r.width, r.height);
        }

    }

}
