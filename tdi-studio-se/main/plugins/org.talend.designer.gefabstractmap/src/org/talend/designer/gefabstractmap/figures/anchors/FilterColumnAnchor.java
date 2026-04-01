package org.talend.designer.gefabstractmap.figures.anchors;

import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.swt.SWT;
import org.talend.designer.gefabstractmap.figures.manager.TableEntityManager;
import org.talend.designer.gefabstractmap.figures.table.entity.TableTreeEntityFigure;
import org.talend.designer.gefabstractmap.part.BaseConnectionEditPart;
import org.talend.designer.gefabstractmap.part.InputTablePart;
import org.talend.designer.gefabstractmap.part.MapperTablePart;
import org.talend.designer.gefabstractmap.utils.MapperUtils;

public class FilterColumnAnchor extends ChopboxAnchor {

    private ConnectionEditPart connectionPart;

    private TableEntityManager entityManager;

    public FilterColumnAnchor(IFigure owner, ConnectionEditPart connectionPart, TableEntityManager entityManager) {
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

        boolean loctionRight = true;
        if (connectionPart.getTarget() instanceof InputTablePart) {
            loctionRight = false;
        }

        Point ref = null;
        if (mapperTablePart != null && entityManager.isTableMinimized()) {
            if (loctionRight) {
                ref = mapperTablePart.getFigure().getBounds().getRight();
            } else {
                ref = mapperTablePart.getFigure().getBounds().getLeft();
            }

        } else {
            if (getOwner() == null) {
                return null;
            } else if (getOwner() instanceof TableTreeEntityFigure) {
                TableTreeEntityFigure nodeFigure = (TableTreeEntityFigure) getOwner();
                if (nodeFigure.getElement() != null) {
                    if (loctionRight) {
                        ref = nodeFigure.getElement().getBounds().getRight();
                    } else {
                        ref = nodeFigure.getElement().getBounds().getLeft();
                    }
                    getOwner().translateToAbsolute(ref);

                }
            } else {
                ref = getOwner().getBounds().getCenter();
                getOwner().translateToAbsolute(ref);
            }
        }

        if (mapperTablePart != null && ref != null) {
            IFigure treeFigure = mapperTablePart.getFigure();
            if (loctionRight) {
                int avialableX = treeFigure.getBounds().getRight().x;
                if (ref.x > avialableX) {
                    ref.x = avialableX;
                }
            } else {
                int avialableX = treeFigure.getBounds().x;
                if (ref.x < avialableX) {
                    ref.x = avialableX;
                }
            }
        }

        if (connectionPart instanceof BaseConnectionEditPart && connectionPart.getFigure() instanceof PolylineConnection) {
            BaseConnectionEditPart baseConnectionPart = (BaseConnectionEditPart) connectionPart;
            PolylineConnection connFigure = (PolylineConnection) connectionPart.getFigure();

            org.eclipse.swt.graphics.Point avilableSize = entityManager.getGraphicalViewer().getControl().getSize();

            if (ref != null) {
                if (ref.y < 0) {
                    ref.y = 0;
                    baseConnectionPart.setSourceConcained(false);
                    if (baseConnectionPart.isDOTStyle()) {
                        connFigure.setLineStyle(SWT.LINE_DASHDOTDOT);
                    } else {
                        connFigure.setLineStyle(SWT.LINE_SOLID);
                    }
                } else if (ref.y > avilableSize.y) {
                    ref.y = avilableSize.y;
                    baseConnectionPart.setSourceConcained(false);
                    if (baseConnectionPart.isDOTStyle()) {
                        connFigure.setLineStyle(SWT.LINE_DASHDOTDOT);
                    } else {
                        connFigure.setLineStyle(SWT.LINE_SOLID);
                    }
                } else {
                    baseConnectionPart.setSourceConcained(true);
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
