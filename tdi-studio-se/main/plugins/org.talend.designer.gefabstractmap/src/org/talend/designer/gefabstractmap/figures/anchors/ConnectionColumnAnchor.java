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
import org.talend.designer.gefabstractmap.part.LookupConnectionPart;
import org.talend.designer.gefabstractmap.part.MapperTablePart;
import org.talend.designer.gefabstractmap.utils.MapperUtils;

public class ConnectionColumnAnchor extends ChopboxAnchor {

    private ConnectionEditPart connectionPart;

    private TableEntityManager entityManager;

    private boolean forceDarshDot;

    public ConnectionColumnAnchor(IFigure owner, ConnectionEditPart connectionPart, TableEntityManager entityManager,
            boolean forceDarshDot) {
        super(owner);
        this.connectionPart = connectionPart;
        this.entityManager = entityManager;
        this.forceDarshDot = forceDarshDot;
    }

    public ConnectionColumnAnchor(IFigure owner, ConnectionEditPart connectionPart, TableEntityManager entityManager) {
        this(owner, connectionPart, entityManager, false);
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

        boolean loctionRight = false;
        if (mapperTablePart instanceof InputTablePart) {
            loctionRight = true;
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

            if (forceDarshDot) {
                connFigure.setLineStyle(SWT.LINE_DASHDOTDOT);
            } else if (ref != null) {
                if (ref.y < 0) {
                    if (!(baseConnectionPart instanceof LookupConnectionPart)) {
                        ref.y = 0;
                    }
                    if (loctionRight) {
                        baseConnectionPart.setSourceConcained(false);
                    } else {
                        baseConnectionPart.setTargetContained(false);
                    }
                    if (baseConnectionPart.isDOTStyle()) {
                        connFigure.setLineStyle(SWT.LINE_DASHDOTDOT);
                    } else {
                        connFigure.setLineStyle(SWT.LINE_SOLID);
                    }
                } else if (ref.y > avilableSize.y) {
                    if (!(baseConnectionPart instanceof LookupConnectionPart)) {
                        ref.y = avilableSize.y;
                    }
                    if (loctionRight) {
                        baseConnectionPart.setSourceConcained(false);
                    } else {
                        baseConnectionPart.setTargetContained(false);
                    }
                    if (baseConnectionPart.isDOTStyle()) {
                        connFigure.setLineStyle(SWT.LINE_DASHDOTDOT);
                    } else {
                        connFigure.setLineStyle(SWT.LINE_SOLID);
                    }
                } else {
                    if (loctionRight) {
                        baseConnectionPart.setSourceConcained(true);
                    } else {
                        baseConnectionPart.setTargetContained(true);
                    }
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
