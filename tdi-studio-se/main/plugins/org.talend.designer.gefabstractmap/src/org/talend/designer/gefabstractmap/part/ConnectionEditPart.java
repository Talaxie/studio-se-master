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
package org.talend.designer.gefabstractmap.part;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.PolylineConnection;
import org.talend.designer.gefabstractmap.figures.routers.CurveConnectionRouter;
import org.talend.designer.mapper.ui.color.ColorInfo;

/**
 * wchen class global comment. Detailled comment
 */
public class ConnectionEditPart extends BaseConnectionEditPart {

    private CurveConnectionRouter curvrRouter;

    @Override
    protected IFigure createFigure() {
        PolylineConnection connection = new PolylineConnection();
        connection.setTargetDecoration(new PolygonDecoration());
        curvrRouter = new CurveConnectionRouter();
        connection.setForegroundColor(ColorInfo.COLOR_UNSELECTED_ZONE_TO_ZONE_LINK());
        connection.setLineWidth(2);
        connection.setConnectionRouter(curvrRouter);
        return connection;
    }

    @Override
    public void updateForegroundColor(boolean selected) {
        if (selected) {
            getFigure().setForegroundColor(ColorInfo.COLOR_SELECTED_ZONE_TO_ZONE_LINK());
        } else {
            getFigure().setForegroundColor(ColorInfo.COLOR_UNSELECTED_ZONE_TO_ZONE_LINK());
        }
    }

}
