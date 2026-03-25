package org.talend.designer.gefabstractmap.figures.routers;

import org.eclipse.draw2d.AbstractRouter;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.ConnectionRouter;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Ray;

/**
 * hwang class global comment. Detailled comment
 */
public class CurveConnectionRouter extends AbstractRouter {

    /**
     * @see ConnectionRouter#route(Connection)
     */
    public void route(Connection conn) {
        if ((conn.getSourceAnchor() == null) || (conn.getTargetAnchor() == null)) {
            return;
        }

        Point startPoint = getStartPoint(conn);
        conn.translateToRelative(startPoint);
        Point endPoint = getEndPoint(conn);
        conn.translateToRelative(endPoint);

        Ray start = new Ray(startPoint);
        Ray end = new Ray(endPoint);

        PointList points = new PointList();
        points.addPoint(new Point(start.x, start.y));

        Point p;
        double w = Math.abs(start.x - end.x) * 4;
        double h = Math.abs(start.y - end.y);
        if (h <= 20) {
            points.addPoint(new Point(end.x, end.y));
            conn.setPoints(points);
            return;
        }
        double EY = (int) (h / 2);
        double EX = (int) (w / 4 / Math.PI);
        int n = 400;

        double h1 = 4.0 * Math.PI / n;
        double x1 = -2 * Math.PI, y1 = Math.sin(x1), x2, y2;

        boolean sight = false;
        double dis = 0;
        int beginJ = n / 8 * 3;
        int endJ = n / 8 * 5;
        double subTract = Math.abs(start.x - end.x) * 1.5;
        if (start.y < end.y) {
            subTract = Math.abs(start.x - end.x) * 0.5;
            beginJ = n / 8 * 1;
            endJ = n / 8 * 3;
        }
        for (int j = 0; j < n; j++) {
            x2 = x1 + h1;
            y2 = Math.sin(x2);
            if (j > beginJ && j < endJ) {
                double temx = (x1 * EX) + w / 2 + start.x - subTract;
                double temy = (h / 2) - (EY * y1) + (h / 2);
                if (!sight) {
                    dis = (temy - start.y);
                }
                p = new Point(temx, temy - dis);
                points.addPoint(p);
                sight = true;
            } else if (j < beginJ) {
                points.addPoint(new Point(start.x, start.y));
            } else if (j > endJ) {
                points.addPoint(new Point(end.x, end.y));
            }

            x1 = x2;
            y1 = y2;
        }
        points.addPoint(new Point(end.x, end.y));
        conn.setPoints(points);
    }

}
