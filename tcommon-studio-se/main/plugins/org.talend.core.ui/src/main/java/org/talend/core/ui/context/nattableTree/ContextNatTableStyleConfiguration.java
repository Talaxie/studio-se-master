// ============================================================================
//
// Copyright (C) 2006-2021 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.core.ui.context.nattableTree;

import org.eclipse.nebula.widgets.nattable.config.AbstractRegistryConfiguration;
import org.eclipse.nebula.widgets.nattable.config.CellConfigAttributes;
import org.eclipse.nebula.widgets.nattable.config.IConfigRegistry;
import org.eclipse.nebula.widgets.nattable.data.convert.DefaultDisplayConverter;
import org.eclipse.nebula.widgets.nattable.painter.cell.ICellPainter;
import org.eclipse.nebula.widgets.nattable.painter.cell.TextPainter;
import org.eclipse.nebula.widgets.nattable.painter.cell.decorator.LineBorderDecorator;
import org.eclipse.nebula.widgets.nattable.style.BorderStyle;
import org.eclipse.nebula.widgets.nattable.style.CellStyleAttributes;
import org.eclipse.nebula.widgets.nattable.style.DisplayMode;
import org.eclipse.nebula.widgets.nattable.style.HorizontalAlignmentEnum;
import org.eclipse.nebula.widgets.nattable.style.Style;
import org.eclipse.nebula.widgets.nattable.style.VerticalAlignmentEnum;
import org.eclipse.nebula.widgets.nattable.util.GUIHelper;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.talend.commons.ui.runtime.ColorConstants;
import org.talend.core.ui.context.model.table.ContextTableConstants;

/**
 * created by ldong on Aug 26, 2014 Detailled comment
 *
 */
public class ContextNatTableStyleConfiguration extends AbstractRegistryConfiguration {

    public Color gradientFgColor = GUIHelper.getColor(136, 212, 215);

    public Font font = GUIHelper.DEFAULT_FONT;

    public HorizontalAlignmentEnum hAlign = HorizontalAlignmentEnum.CENTER;

    public VerticalAlignmentEnum vAlign = VerticalAlignmentEnum.MIDDLE;

    public BorderStyle borderStyle = null;

    public ICellPainter cellPainter = new LineBorderDecorator(new TextPainter());

    /**
     * DOC ldong ContextNatTableStyleConfiguration constructor comment.
     *
     * @param font
     */
    public ContextNatTableStyleConfiguration(Font font) {
        super();
        this.font = font;
    }

    @Override
    public void configureRegistry(IConfigRegistry configRegistry) {
        configRegistry.registerConfigAttribute(CellConfigAttributes.CELL_PAINTER, cellPainter);

        Style cellStyle = new Style();
        cellStyle.setAttributeValue(CellStyleAttributes.BACKGROUND_COLOR, ColorConstants.getTableBackgroundColor());
        cellStyle.setAttributeValue(CellStyleAttributes.FOREGROUND_COLOR, ColorConstants.getTableForegroundColor());
        cellStyle.setAttributeValue(CellStyleAttributes.GRADIENT_BACKGROUND_COLOR, ColorConstants.getTableBackgroundColor());
        cellStyle.setAttributeValue(CellStyleAttributes.GRADIENT_FOREGROUND_COLOR, gradientFgColor);
        cellStyle.setAttributeValue(CellStyleAttributes.FONT, font);
        cellStyle.setAttributeValue(CellStyleAttributes.HORIZONTAL_ALIGNMENT, hAlign);
        cellStyle.setAttributeValue(CellStyleAttributes.VERTICAL_ALIGNMENT, vAlign);
        cellStyle.setAttributeValue(CellStyleAttributes.BORDER_STYLE, borderStyle);
        configRegistry.registerConfigAttribute(CellConfigAttributes.CELL_STYLE, cellStyle);
        
        Style cellStyleValueError = new Style();
        cellStyleValueError.setAttributeValue(CellStyleAttributes.FOREGROUND_COLOR, ColorConstants.ERROR_FONT_COLOR);
        configRegistry.registerConfigAttribute(CellConfigAttributes.CELL_STYLE, cellStyleValueError, DisplayMode.NORMAL, ContextTableConstants.LABEL_VALUE_NOT_MATCH_TYPE);
        configRegistry.registerConfigAttribute(CellConfigAttributes.CELL_STYLE, cellStyleValueError, DisplayMode.SELECT, ContextTableConstants.LABEL_VALUE_NOT_MATCH_TYPE);
        
        Style cellStyleChangedForceGround = new Style();
        cellStyleChangedForceGround.setAttributeValue(CellStyleAttributes.FOREGROUND_COLOR, ColorConstants.getTableReadOnlyForegroundColor());
        configRegistry.registerConfigAttribute(CellConfigAttributes.CELL_STYLE, cellStyleChangedForceGround, DisplayMode.NORMAL, ContextTableConstants.LABEL_CHANGED_FORCEGROUND);        
        
        configRegistry.registerConfigAttribute(CellConfigAttributes.DISPLAY_CONVERTER, new DefaultDisplayConverter());

    }

}
