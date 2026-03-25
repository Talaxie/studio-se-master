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
package org.talend.designer.gefabstractmap.figures.treesettings;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.PositionConstants;
import org.talend.designer.gefabstractmap.figures.cells.ITextAreaCell;
import org.talend.designer.gefabstractmap.part.directedit.DirectEditType;
import org.talend.designer.mapper.ui.color.ColorInfo;

/**
 * DOC talend class global comment. Detailled comment
 */
public class FilterTextArea extends Label implements ITextAreaCell {

    private DirectEditType type;

    public FilterTextArea() {
        setBackgroundColor(ColorInfo.NODE_FIGURE_BACKGROUND());
        setBorder(new LineBorder(ColorInfo.COLOR_TREE_BORDER()));
        setLabelAlignment(PositionConstants.LEFT);
    }

    public void setDirectEditType(DirectEditType type) {
        this.type = type;
    }

    public DirectEditType getDirectEditType() {
        return DirectEditType.EXPRESSION_FILTER;
    }

}
