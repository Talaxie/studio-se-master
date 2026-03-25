package org.talend.designer.gefabstractmap.figures.anchors;

import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.swt.SWT;
import org.talend.designer.gefabstractmap.figures.manager.TableEntityManager;
import org.talend.designer.gefabstractmap.figures.table.entity.TableEntityFigure;
import org.talend.designer.gefabstractmap.part.BaseConnectionEditPart;
import org.talend.designer.gefabstractmap.part.LookupConnectionPart;
import org.talend.designer.gefabstractmap.part.MapperTablePart;
import org.talend.designer.gefabstractmap.utils.MapperUtils;

public class LookupColumnAnchor extends ChopboxAnchor {

    private ConnectionEditPart connectionPart;

    private TableEntityManager entityManager;

    public LookupColumnAnchor(IFigure owner, ConnectionEditPart connectionPart, TableEntityManager entityManager) {
        super(owner);
        this.connectionPart = connectionPart;
        this.entityManager = entityManager;
    }

    @Override
    public IFigure getOwner() {
        return super.getOwner();
    }

    @Override
    public Point getReferencePoint() {
        if (connectionPart == null) {
            return getOwner().getBounds().getLeft();
        }

        MapperTablePart mapperTablePart = MapperUtils.getMapperTablePart(entityManager.getEditPart());

        Point ref = null;
        if (mapperTablePart != null && entityManager.isTableMinimized()) {
            ref = mapperTablePart.getFigure().getBounds().getLeft();
        } else {

            if (getOwner() == null) {
                return null;
            } else if (getOwner() instanceof TableEntityFigure) {
                TableEntityFigure nodeFigure = (TableEntityFigure) getOwner();
                if (nodeFigure.getElement() != null) {
                    ref = nodeFigure.getElement().getBounds().getLeft();
                    getOwner().translateToAbsolute(ref);

                }
            } else {
                ref = getOwner().getBounds().getCenter();
                getOwner().translateToAbsolute(ref);
            }
        }

        if (mapperTablePart != null && ref != null) {
            IFigure treeFigure = mapperTablePart.getFigure();
            int avialableX = treeFigure.getBounds().x;
            if (ref.x < avialableX) {
                ref.x = avialableX;
            }

        }

        if (connectionPart instanceof BaseConnectionEditPart && connectionPart.getFigure() instanceof PolylineConnection) {
            BaseConnectionEditPart baseConnectionPart = (BaseConnectionEditPart) connectionPart;
            PolylineConnection connFigure = (PolylineConnection) connectionPart.getFigure();

            org.eclipse.swt.graphics.Point avilableSize = entityManager.getGraphicalViewer().getControl().getSize();

            if (ref != null) {
                if (ref.y < 0) {
                    if (!(baseConnectionPart instanceof LookupConnectionPart)) {
                        ref.y = 0;
                    }
                    baseConnectionPart.setTargetContained(false);
                    if (baseConnectionPart.isDOTStyle()) {
                        connFigure.setLineStyle(SWT.LINE_DASHDOTDOT);
                    } else {
                        connFigure.setLineStyle(SWT.LINE_SOLID);
                    }
                } else if (ref.y > avilableSize.y) {
                    if (!(baseConnectionPart instanceof LookupConnectionPart)) {
                        ref.y = avilableSize.y;
                    }
                    baseConnectionPart.setTargetContained(false);
                    if (baseConnectionPart.isDOTStyle()) {
                        connFigure.setLineStyle(SWT.LINE_DASHDOTDOT);
                    } else {
                        connFigure.setLineStyle(SWT.LINE_SOLID);
                    }
                } else {
                    baseConnectionPart.setTargetContained(true);
                    if (!baseConnectionPart.isDOTStyle()) {
                        connFigure.setLineStyle(SWT.LINE_SOLID);
                    }
                }
            }
        }

        return ref;

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.draw2d.ChopboxAnchor#getLocation(org.eclipse.draw2d.geometry.Point)
     */
    @Override
    public Point getLocation(Point reference) {
        Point referencePoint = getReferencePoint();
        if (referencePoint != null) {
            return new Point(referencePoint.x, referencePoint.y);
        } else {
            return new Point(0, 0);
        }

    }

    @Override
    protected Rectangle getBox() {
        return super.getBox();
    }

}
