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
package org.talend.designer.mapper.ui.visualmap.table;

import org.eclipse.swt.graphics.Color;
import org.talend.designer.mapper.ui.color.ColorInfo;

/**
 * DOC amaumont class global comment. Detailled comment <br/>
 *
 * $Id$
 *
 */
public enum EntryState {
    HIGHLIGHT(ColorInfo.COLOR_ENTRY_HIGHLIGHTED()),
    HIGHLIGHTALL(ColorInfo.COLOR_ENTRY_HIGHLIGHTEDALL()),
    SEARCH_HIGHLIGHT(ColorInfo.COLOR_ENTRY_SEARCH_HIGHLIGHTED()),
    ERROR(ColorInfo.COLOR_ENTRY_ERROR()),
    WARNING(ColorInfo.COLOR_ENTRY_WARNING()),
    NONE(ColorInfo.COLOR_ENTRY_NONE());

    private Color color;

    private EntryState(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

}
