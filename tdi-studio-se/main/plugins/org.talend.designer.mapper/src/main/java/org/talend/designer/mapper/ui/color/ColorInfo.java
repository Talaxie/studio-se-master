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
package org.talend.designer.mapper.ui.color;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.talend.commons.ui.runtime.ITalendThemeService;

/**
 * DOC mhelleboid class global comment. Detailled comment <br/>
 *
 * $Id$
 *
 */
public enum ColorInfo {

    COLOR_ENTRY_HIGHLIGHTED(102,190,230), 
    COLOR_ENTRY_HIGHLIGHTEDALL(255, 255, 0), // yellow
    COLOR_ENTRY_SEARCH_HIGHLIGHTED(255, 150, 20), // orange
    COLOR_ENTRY_ERROR(100, 200, 255), // ?
    COLOR_ENTRY_WARNING(0, 200, 60), // ?
    COLOR_ENTRY_NORMAL(170, 170, 170), // ?
    COLOR_ENTRY_NONE(255, 255, 255), // white
    
    COLOR_BACKGROUND_LINKS_ZONE(210, 210, 196), // gray

    // COLOR_UNSELECTED_ZONE_TO_ZONE_LINK(235, 235, 0), // light yellow
    COLOR_SELECTED_ZONE_TO_ZONE_LINK(255, 255, 0), // yellow
    COLOR_UNSELECTED_ZONE_TO_ZONE_LINK(196, 196, 180), // light gray

    COLOR_SELECTED_LOOKUP_LINKS(160, 40, 210), // violet
    COLOR_UNSELECTED_LOOKUP_LINKS(200, 186, 225), // pastel violet

    COLOR_SELECTED_FILTER_LINK(255, 150, 20), // orange
    COLOR_UNSELECTED_FILTER_LINK(255, 200, 70), // light gray

    COLOR_SELECTED_GLOBALMAP_LINK(71, 40, 210), // bleu sombre
    COLOR_UNSELECTED_GLOBALMAP_LINK(111, 186, 225), // bleu

    COLOR_HIGHLIGHTED_TEXT_ROW(240, 240, 240), // light gray

    COLOR_BACKGROUND_ERROR_EXPRESSION_CELL(255, 0, 0), // red
    COLOR_BACKGROUND_VALID_EXPRESSION_CELL(255, 255, 255), // white
    COLOR_BACKGROUND_TRANSPRENT(0, 0, 0, 0), // transparent

    COLOR_FOREGROUND_ERROR_EXPRESSION_CELL(255, 255, 255), // white
    COLOR_FOREGROUND_VALID_EXPRESSION_CELL(0, 0, 0), // black
    
    COLOR_BACKGROUND_WARNING_EXPRESSION_CELL(255, 190, 150), // light orange

    COLOR_DRAGGING_INSERTION_INDICATOR(0, 78, 152), // blue
    COLOR_EXPREESION_DISABLE(240, 240, 240),

    COLOR_SEPARATOR_TOP_LEFT(172, 168, 153), // dark gray

    COLOR_TREE_LINES(128, 128, 128),

    COLOR_COLUMN_TREE_SETTING(200, 225, 250),
    COLOR_COLUMN_SELECTION(90, 180, 255), // ligth blue
    ZONE_BACKGROUND_COLOR(241, 239, 226), // zone background color
    COLOR_TREE_BORDER(153, 186, 243),
    
    COLOR_TMAP_PREVIEW(235, 234, 230);

    private Color color = null;
    
    private static Map<String, Color> cachedColorMap = new HashMap<String, Color>();

    private ColorInfo(int red, int green, int blue) {
        color = new Color(Display.getCurrent(), red, green, blue);
    }

    private ColorInfo(int red, int green, int blue, int alpha) {
        color = new Color(Display.getCurrent(), red, green, blue, alpha);
    }
    
    public static Color COLOR_ENTRY_HIGHLIGHTED() {
        return getColor("COLOR_ENTRY_HIGHLIGHTED", Display.getDefault().getSystemColor(SWT.COLOR_LIST_SELECTION));
    }
    
    public static Color COLOR_ENTRY_HIGHLIGHTEDALL() {
        return getColor("COLOR_ENTRY_HIGHLIGHTEDALL", Display.getDefault().getSystemColor(SWT.COLOR_LIST_SELECTION));
    }
    
    public static Color COLOR_ENTRY_SEARCH_HIGHLIGHTED() {
        return getColor("COLOR_ENTRY_SEARCH_HIGHLIGHTED", Display.getDefault().getSystemColor(SWT.COLOR_LIST_SELECTION));
    }
    
    public static Color COLOR_ENTRY_ERROR() {
        return getColor("COLOR_ENTRY_ERROR", COLOR_ENTRY_ERROR.getColor());
    }
    
    public static Color COLOR_ENTRY_WARNING() {
        return getColor("COLOR_ENTRY_WARNING", COLOR_ENTRY_WARNING.getColor());
    }
    
    public static Color COLOR_ENTRY_NORMAL() {
        return getColor("COLOR_ENTRY_NORMAL", Display.getDefault().getSystemColor(SWT.COLOR_LIST_BACKGROUND));
    }
    
    public static Color COLOR_ENTRY_NONE() {
        return getColor("COLOR_ENTRY_NONE", Display.getDefault().getSystemColor(SWT.COLOR_LIST_BACKGROUND));
    }
    
    public static Color COLOR_BACKGROUND_LINKS_ZONE() {
        return getColor("COLOR_BACKGROUND_LINKS_ZONE", COLOR_BACKGROUND_LINKS_ZONE.getColor());
    }
    
    public static Color COLOR_SELECTED_ZONE_TO_ZONE_LINK() {
        return getColor("COLOR_SELECTED_ZONE_TO_ZONE_LINK", Display.getDefault().getSystemColor(SWT.COLOR_LIST_SELECTION));
    }
    
    public static Color COLOR_UNSELECTED_ZONE_TO_ZONE_LINK() {
        return getColor("COLOR_UNSELECTED_ZONE_TO_ZONE_LINK", COLOR_UNSELECTED_ZONE_TO_ZONE_LINK.getColor());
    }
    
    public static Color COLOR_SELECTED_LOOKUP_LINKS() {
        return COLOR_SELECTED_ZONE_TO_ZONE_LINK();
    }
    
    public static Color COLOR_UNSELECTED_LOOKUP_LINKS() {
        return COLOR_UNSELECTED_ZONE_TO_ZONE_LINK();
    }
    
    public static Color COLOR_SELECTED_FILTER_LINK() {
        return COLOR_SELECTED_ZONE_TO_ZONE_LINK();
    }
    
    public static Color COLOR_UNSELECTED_FILTER_LINK() {
        return COLOR_UNSELECTED_ZONE_TO_ZONE_LINK();
    }
    
    public static Color COLOR_SELECTED_GLOBALMAP_LINK() {
        return COLOR_SELECTED_ZONE_TO_ZONE_LINK();
    }
    
    public static Color COLOR_UNSELECTED_GLOBALMAP_LINK() {
        return COLOR_UNSELECTED_ZONE_TO_ZONE_LINK();
    }
    
    public static Color COLOR_HIGHLIGHTED_TEXT_ROW() {
        return getColor("COLOR_HIGHLIGHTED_TEXT_ROW", COLOR_HIGHLIGHTED_TEXT_ROW.getColor());
    }
    
    public static Color COLOR_BACKGROUND_ERROR_EXPRESSION_CELL() {
        return getColor("COLOR_BACKGROUND_ERROR_EXPRESSION_CELL", COLOR_BACKGROUND_ERROR_EXPRESSION_CELL.getColor());
    }
    
    public static Color COLOR_BACKGROUND_VALID_EXPRESSION_CELL() {
        return getColor("COLOR_BACKGROUND_VALID_EXPRESSION_CELL", COLOR_BACKGROUND_VALID_EXPRESSION_CELL.getColor());
    }
    
    public static Color COLOR_FOREGROUND_ERROR_EXPRESSION_CELL() {
        return getColor("COLOR_FOREGROUND_ERROR_EXPRESSION_CELL", COLOR_FOREGROUND_ERROR_EXPRESSION_CELL.getColor());
    }
    
    public static Color COLOR_FOREGROUND_VALID_EXPRESSION_CELL() {
        return getColor("COLOR_FOREGROUND_VALID_EXPRESSION_CELL", COLOR_FOREGROUND_VALID_EXPRESSION_CELL.getColor());
    }
    
    public static Color COLOR_DRAGGING_INSERTION_INDICATOR() {
        return getColor("COLOR_DRAGGING_INSERTION_INDICATOR", COLOR_DRAGGING_INSERTION_INDICATOR.getColor());
    }
    
    public static Color COLOR_TMAP_PREVIEW() {
        return getColor("COLOR_TMAP_PREVIEW", COLOR_TMAP_PREVIEW.getColor());
    }
    
    public static Color COLOR_BACKGROUND_WARNING_EXPRESSION_CELL() {
        return getColor("COLOR_BACKGROUND_WARNING_EXPRESSION_CELL", COLOR_BACKGROUND_WARNING_EXPRESSION_CELL.getColor());
    }
    
    public static Color COLOR_SELECTED_TABLEHERDER_BG() {
        return getColor("COLOR_TMAP_TABELHEADER_SELECTED_BG", Display.getDefault().getSystemColor(SWT.COLOR_LIST_SELECTION));
    }
    
    public static Color COLOR_UNSELECTED_TABLEHERDER_BG() {
        return getColor("COLOR_TMAP_TABELHEADER_UNSELECTED_BG", Display.getDefault().getSystemColor(SWT.COLOR_LIST_BACKGROUND));
    }
    
    public static Color COLOR_SELECTED_TEXT_FG() {
        return getColor("COLOR_SELECTED_TEXT_FG", Display.getDefault().getSystemColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
    }
    
    public static Color COLOR_UNSELECTED_TEXT_FG() {
        return getColor("COLOR_UNSELECTED_TEXT_FG", Display.getDefault().getSystemColor(SWT.COLOR_LIST_FOREGROUND));
    }
    
    public static Color COLOR_TREE_BORDER() {
        return getColor("COLOR_TREE_BORDER", COLOR_TREE_BORDER.getColor());
    }
    
    public static Color ZONE_BACKGROUND_COLOR() {
        return getColor("ZONE_BACKGROUND_COLOR", ZONE_BACKGROUND_COLOR.getColor());
    }
    
    public static Color COLOR_TREE_LINES() {
        return getColor("COLOR_TREE_LINES", COLOR_TREE_LINES.getColor());
    }
    
    public static Color COLOR_COLUMN_TREE_SETTING() {
        return getColor("COLOR_COLUMN_TREE_SETTING", COLOR_COLUMN_TREE_SETTING.getColor());
    }
    
    public static Color COLOR_EXPREESION_DISABLE() {
        return getColor("COLOR_EXPREESION_DISABLE", COLOR_EXPREESION_DISABLE.getColor());
    }
    
    public static Color COLOR_COLUMN_SELECTION() {
        return getColor("COLOR_COLUMN_SELECTION", COLOR_COLUMN_SELECTION.getColor());
    }
    
    public static Color NODE_FIGURE_FORCEGROUND() {
        return getColor("NODE_FIGURE_FORCEGROUND", Display.getDefault().getSystemColor(SWT.COLOR_WIDGET_FOREGROUND));
    }
    
    public static Color NODE_FIGURE_BACKGROUND() {
        return getColor("NODE_FIGURE_BACKGROUND", Display.getDefault().getSystemColor(SWT.COLOR_WIDGET_BACKGROUND));
    }
    
    public static Color EDITABLE_WIDGET_BACKGROUND () {
        return COLOR_ENTRY_NONE();
    }
    
    private static Color getColor(String key, Color defaultColor) {
        if (cachedColorMap.containsKey(key)) {
            return cachedColorMap.get(key);
        }
        
        Color c = ITalendThemeService.getColor(key).orElse(defaultColor);
        cachedColorMap.put(key, c);
        return c;
    }
    
    public Color getColor() {
        return color;
    }
}
