package org.talend.designer.core.ui.editor.connections;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.ConnectionLocator;
import org.eclipse.draw2d.geometry.Point;

public class DparallelLocator extends ConnectionLocator {

    private int index;

    public DparallelLocator(Connection c, int i) {
        super(c);
        index = i;
    }

    protected int getIndex() {
        return index;
    }

    @Override
    protected Point getReferencePoint() {
        Connection conn = getConnection();
        Point p = Point.SINGLETON;
        Point p1 = conn.getPoints().getPoint(getIndex());
        Point p2 = conn.getPoints().getPoint(getIndex() + 1);
        conn.translateToAbsolute(p1);
        conn.translateToAbsolute(p2);
        p.x = ((p2.x - p1.x) / 9) * 8 + p1.x;
        p.y = ((p2.y - p1.y) / 9) * 8 + p1.y;
        return p;
    }
}
