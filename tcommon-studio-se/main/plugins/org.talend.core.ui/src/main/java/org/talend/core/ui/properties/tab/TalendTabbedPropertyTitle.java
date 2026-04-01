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
package org.talend.core.ui.properties.tab;

import org.apache.commons.lang.StringUtils;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.ui.forms.IFormColors;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;
import org.talend.commons.ui.runtime.ITalendThemeService;
import org.talend.commons.ui.runtime.image.EImage;
import org.talend.commons.ui.runtime.image.ImageProvider;
import org.talend.core.GlobalServiceRegister;
import org.talend.core.ui.CoreUIPlugin;
import org.talend.core.ui.i18n.Messages;
import org.talend.designer.core.IDesignerCoreService;
import org.talend.themes.core.elements.stylesettings.TalendTabbedPropertyColorHelper;
import org.talend.themes.core.elements.widgets.ITalendTabbedPropertyTitleWidget;

/**
 * created by hcyi on Feb 2, 2015 Detailled comment
 *
 */
public class TalendTabbedPropertyTitle extends Composite implements ITalendTabbedPropertyTitleWidget {

    private CLabel label;

    private Image image = null;

    private String text = null;
    
    private ToolItem helpLabel;

    private String componentName;

    private Composite titleLabelComp;

    private Composite helpComp;

    private boolean isComponentTitle;

    private static final String BLANK = ""; //$NON-NLS-1$

    private static final String TITLE_FONT = "org.eclipse.ui.internal.views.properties.tabbed.view.TabbedPropertyTitle"; //$NON-NLS-1$

    private TabbedPropertySheetWidgetFactory factory;

    private TalendTabbedPropertyColorHelper colorHelper;

    /**
     * Constructor for TabbedPropertyTitle.
     *
     * @param parent the parent composite.
     * @param factory the widget factory for the tabbed property sheet
     */
    public TalendTabbedPropertyTitle(Composite parent, TabbedPropertySheetWidgetFactory factory) {
        super(parent, SWT.NO_FOCUS);
        this.factory = factory;
        colorHelper = new TalendTabbedPropertyColorHelper(factory);
        // CSS
        CoreUIPlugin.setCSSClass(this, this.getClass().getSimpleName());
        this.addPaintListener(new PaintListener() {

            @Override
            public void paintControl(PaintEvent e) {
                if (image == null && (text == null || text.equals(BLANK))) {
                    label.setVisible(false);
                    helpComp.setVisible(false);
                } else {
                    label.setVisible(true);
                    helpComp.setVisible(isComponentTitle && StringUtils.isNotBlank(componentName));
                    drawTitleBackground(e);
                }
            }
        });

        factory.getColors().initializeSectionToolBarColors();
        setBackground(factory.getColors().getBackground());
        setForeground(factory.getColors().getForeground());

        FormLayout layout = new FormLayout();
        layout.marginWidth = 1;
        layout.marginHeight = 2;
        setLayout(layout);

        Font font;
        if (!JFaceResources.getFontRegistry().hasValueFor(TITLE_FONT)) {
            FontData[] fontData = JFaceResources.getFontRegistry().getBold(JFaceResources.DEFAULT_FONT).getFontData();
            /* title font is 2pt larger than that used in the tabs. */
            fontData[0].setHeight(fontData[0].getHeight() + 2);
            JFaceResources.getFontRegistry().put(TITLE_FONT, fontData);
        }
        font = JFaceResources.getFont(TITLE_FONT);

        titleLabelComp = new Composite(this, SWT.None);
        FormData compData = new FormData();
        compData.left = new FormAttachment(0, 0);
        compData.top = new FormAttachment(0, 0);
        compData.right = new FormAttachment(100, 0);
        compData.bottom = new FormAttachment(100, 0);
        titleLabelComp.setLayoutData(compData);
        titleLabelComp.setLayout(new FormLayout());

        label = factory.createCLabel(titleLabelComp, BLANK);
        label.setFont(font);
        label.setForeground(colorHelper.getTitleForeground());
        FormData data = new FormData();
        data.left = new FormAttachment(0, 0);
        data.top = new FormAttachment(0, 0);
        data.right = new FormAttachment(100, -25);
        data.bottom = new FormAttachment(100, 0);
        label.setLayoutData(data);

        helpComp = new Composite(titleLabelComp, SWT.None);
        FormData helpFormData = new FormData();
        helpFormData.top = new FormAttachment(50, -12);
        helpFormData.right = new FormAttachment(100, 0);
        helpFormData.bottom = new FormAttachment(50, 12);
        helpFormData.left = new FormAttachment(100, -25);
        helpComp.setLayoutData(helpFormData);
        helpComp.setLayout(new FormLayout());

        ToolBar toolBar = new ToolBar(helpComp, SWT.CENTER | SWT.NO_FOCUS);
        FormData toolBarData = new FormData();
        toolBarData.left = new FormAttachment(0, 0);
        toolBarData.top = new FormAttachment(0, 0);
        toolBarData.right = new FormAttachment(100, 0);
        toolBarData.bottom = new FormAttachment(100, 0);
        helpLabel = new ToolItem(toolBar, SWT.CHECK | SWT.CENTER);
        helpLabel.setImage(ImageProvider.getImage(EImage.HELP_ICON));
        helpLabel.setToolTipText(Messages.getString("TalendTabbedPropertyTitle.componentHelpTooltip"));
        helpLabel.setSelection(false);
        helpLabel.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                if (StringUtils.isNotBlank(componentName)
                        && GlobalServiceRegister.getDefault().isServiceRegistered(IDesignerCoreService.class)) {
                    IDesignerCoreService service = GlobalServiceRegister.getDefault().getService(IDesignerCoreService.class);
                    if (service != null) {
                        service.openComponentOnlineHelp(componentName);
                    }
                }
                helpLabel.setSelection(false);
            }
        });
        helpComp.setVisible(false);

        if (colorHelper.getTitleBackground() == null) {
            label.setBackground(new Color[] { getStartColor(),
                    getEndColor() }, new int[] { 100 }, true);
            titleLabelComp.setBackground(getEndColor());
            helpComp.setBackground(getEndColor());
        } else {
            label.setBackground(colorHelper.getTitleBackground());
            titleLabelComp.setBackground(colorHelper.getTitleBackground());
            helpComp.setBackground(colorHelper.getTitleBackground());
        }
    }

    private Color getStartColor() {
        return ITalendThemeService.getColor("org.talend.core.repository.TAB_START_COLOR")
                .orElse(factory.getColors().getColor(IFormColors.H_GRADIENT_END));
    }

    private Color getEndColor() {
        return ITalendThemeService.getColor("org.talend.core.repository.TAB_END_COLOR")
                .orElse(factory.getColors().getColor(IFormColors.H_GRADIENT_START));
    }

    /**
     * @param e
     */
    protected void drawTitleBackground(PaintEvent e) {
        Rectangle bounds = getClientArea();
        if (colorHelper.getTitleBackground() == null) {
            label.setBackground(new Color[] { getStartColor(),
                    getEndColor() }, new int[] { 100 }, true);
            titleLabelComp.setBackground(getEndColor());
            helpComp.setBackground(getEndColor());
        } else {
            label.setBackground(colorHelper.getTitleBackground());
            titleLabelComp.setBackground(colorHelper.getTitleBackground());
            helpComp.setBackground(colorHelper.getTitleBackground());
        }
        Color bg = getStartColor();
        Color gbg = getEndColor();
        GC gc = e.gc;
        gc.setForeground(bg);
        gc.setBackground(gbg);
        gc.fillGradientRectangle(bounds.x, bounds.y, bounds.width, bounds.height, true);
        // background bottom separator
        gc.setForeground(colorHelper.getTitleBottomForegroundKeyline1());
        if (colorHelper.isVisibleBorder()) {
            gc.drawLine(bounds.x, bounds.height - 2, bounds.x + bounds.width - 1, bounds.height - 2);
        }
        gc.setForeground(colorHelper.getTitleBottomForegroundKeyline2());
        if (colorHelper.isVisibleBorder()) {
            gc.drawLine(bounds.x, bounds.height - 1, bounds.x + bounds.width - 1, bounds.height - 1);
        }
    }

    /**
     * Set the text label.
     *
     * @param text the text label.
     * @param image the image for the label.
     */
    public void setTitle(String text, Image image) {
        this.text = text;
        this.image = image;
        if (text != null) {
            label.setText(text);
        } else {
            label.setText(BLANK);
            componentName = null;
        }
        label.setImage(image);
        redraw();
    }

    public void setTitleImage(Image image) {
        this.image = image;
        label.setImage(image);
        redraw();
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    public void setIsComponentTitle(boolean isComponentTitle) {
        this.isComponentTitle = isComponentTitle;
    }

    @Override
    public TalendTabbedPropertyColorHelper getColorHelper() {
        return this.colorHelper;
    }
}