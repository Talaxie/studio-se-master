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

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.FreeformFigure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.editparts.GridLayer;
import org.eclipse.swt.graphics.Color;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.ui.gmf.draw2d.AnimatableZoomManager;
import org.talend.commons.ui.runtime.ITalendThemeService;

/**
 * Grid that will be used for the designer. (modification of the default grid to have black points)
 *
 * $Id: TalendGridLayer.java 7038 2007-11-15 14:05:48Z plegall $
 *
 */
public class TalendGridLayer extends GridLayer {

    public static final Color GRID_COLOR = ColorConstants.black;

    private static final Color GRID_LIGHT_COLOR = new Color(232, 235, 239);

    private static final Color GRID_DARK_COLOR = new Color(125, 135, 150);

    public TalendGridLayer() {
        super();
        setForegroundColor(GRID_COLOR);
    }

    private Color getLightColor() {
        return ITalendThemeService.getColor("org.talend.designer.core.lightColor").orElse(GRID_LIGHT_COLOR);
    }

    private Color getDarkColor() {
        return ITalendThemeService.getColor("org.talend.designer.core.darkColor").orElse(GRID_DARK_COLOR);
    }

    private int getColorAlpha() {
        final int defaultAlpha = 30;
        try {
            return Integer.valueOf(
                    ITalendThemeService.getProperty("org.talend.designer.core.alpha").orElse(String.valueOf(defaultAlpha)));
        } catch (Exception e) {
            ExceptionHandler.process(e);
        }
        return defaultAlpha;
    }

    @Override
    protected void paintGrid(Graphics g) {
        paintGrid(g, this, origin, gridX, gridY);
    }

    protected void paintGrid(Graphics g, IFigure f, org.eclipse.draw2d.geometry.Point origin, int distanceX, int distanceY) {
        FreeformFigure ff = (FreeformFigure) this.getParent();
        Rectangle clientArea = getClientArea();
        Rectangle bounds = ff.getFreeformExtent().getCopy();
        bounds.union(clientArea.x, clientArea.y, clientArea.width * AnimatableZoomManager.currentZoom,
                clientArea.height * AnimatableZoomManager.currentZoom);
        ff.setFreeformBounds(bounds);

        Rectangle clip = g.getClip(Rectangle.SINGLETON);
        if (distanceX > 0 && distanceY > 0) {
            if (origin.x >= clip.x) {
                while (origin.x - distanceX >= clip.x) {
                    origin.x -= distanceX;
                }
            } else {
                while (origin.x < clip.x) {
                    origin.x += distanceX;
                }
            }
            if (origin.y >= clip.y) {
                while (origin.y - distanceY >= clip.y) {
                    origin.y -= distanceY;
                }
            } else {
                while (origin.y < clip.y) {
                    origin.y += distanceY;
                }
            }
            g.setAlpha(getColorAlpha());
            for (int i = origin.x - distanceX; i < clip.x + clip.width; i += distanceX) {
                for (int j = origin.y - distanceY; j < clip.y + clip.height; j += distanceY) {
//                    g.drawPoint(i, j);
                    int re = Math.abs(i - j);
                    if (re / distanceY % 2 == 0) {
                        g.setBackgroundColor(getDarkColor());
//                        g.drawImage(ImageProvider.getImage(EImage.CHESS_GRAY), i, j);
                    } else {
                        g.setBackgroundColor(getLightColor());
                    }
                    g.fillRectangle(i, j, 32, 32);
                }
            }
        }
    }
}
