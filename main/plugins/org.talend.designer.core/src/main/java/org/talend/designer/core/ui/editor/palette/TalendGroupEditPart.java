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
package org.talend.designer.core.ui.editor.palette;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.internal.ui.palette.editparts.GroupEditPart;
import org.eclipse.gef.palette.PaletteContainer;

/**
 * DOC cmeng class global comment. Detailled comment
 */
public class TalendGroupEditPart extends GroupEditPart {

    /**
     * DOC cmeng TalendGroupEditPart constructor comment.
     *
     * @param group
     */
    public TalendGroupEditPart(PaletteContainer group) {
        super(group);
    }

    @Override
    public IFigure createFigure() {
        Figure figure = new Figure();
        figure.setOpaque(true);
		figure.setBackgroundColor(getViewer().getColorProvider().getListBackground());
        return figure;
    }

}
