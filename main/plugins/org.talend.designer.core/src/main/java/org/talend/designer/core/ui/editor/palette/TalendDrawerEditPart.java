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

import java.beans.PropertyChangeEvent;

import org.eclipse.draw2d.FocusEvent;
import org.eclipse.draw2d.FocusListener;
import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.internal.InternalImages;
import org.eclipse.gef.internal.ui.palette.editparts.DrawerEditPart;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteTemplateEntry;
import org.eclipse.gef.ui.palette.PaletteViewerPreferences;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Color;
import org.talend.themes.core.elements.stylesettings.TalendPaletteCSSStyleSetting;

/**
 *
 */
/**
 * DOC Administrator class global comment. Detailled comment
 */
public class TalendDrawerEditPart extends DrawerEditPart {

    protected TalendPaletteCSSStyleSetting cssStyleSetting;

    @Override
    protected void unregister() {
        super.unregister();
    }

    @Override
    protected void unregisterVisuals() {
        if (getFigure() instanceof TalendDrawerFigure) {
            ((TalendDrawerFigure) getFigure()).disposeColors();
        }
        super.unregisterVisuals();

    }

    @Override
    public void deactivate() {
        if (getFigure() instanceof TalendDrawerFigure) {
            ((TalendDrawerFigure) getFigure()).disposeColors();
        }
        super.deactivate();

    }

    private int childLevel = 0;

    public TalendDrawerEditPart(PaletteDrawer drawer, TalendPaletteCSSStyleSetting cssStyleSetting) {
        super(drawer);
        this.cssStyleSetting = cssStyleSetting;
    }

    @Override
    @SuppressWarnings("restriction")
    public IFigure createFigure() {
        EditPart module = getParent();
        if (module instanceof TalendDrawerEditPart) {
            TalendDrawerEditPart parent = (TalendDrawerEditPart) getParent();
            childLevel = parent.childLevel + 1;
        } else {
            childLevel = 0;
        }
        getViewer().getControl().setData("ANIMATE", Boolean.FALSE); //$NON-NLS-1$

        TalendDrawerFigure fig = new TalendDrawerFigure(getViewer().getControl(), getColorProvider(), childLevel, cssStyleSetting) {

            @Override
            IFigure buildTooltip() {
                return createToolTip();
            }
        };
        getViewer().getControl().setData("ANIMATE", Boolean.TRUE); //$NON-NLS-1$
        fig.setExpanded(getModel().isInitiallyOpen());
        fig.setPinned(getModel().isInitiallyPinned());

        fig.getCollapseToggle().addFocusListener(new FocusListener.Stub() {

            @Override
            public void focusGained(FocusEvent fe) {
                getViewer().select(TalendDrawerEditPart.this);
            }
        });

        return fig;
    }

    @Override
    @SuppressWarnings("restriction")
    public void propertyChange(PropertyChangeEvent evt) {
        super.propertyChange(evt);
        String property = evt.getPropertyName();
        if (property.equals(PaletteDrawer.PROPERTY_INITIAL_STATUS)) {
			boolean isExpaned = getFigure().isExpanded();
			if (isExpaned == getModel().isInitiallyOpen()) {
                return;
            }
            try {
				getFigure().setExpanded(getModel().isInitiallyOpen());
                refreshVisuals();
            } catch (Exception e) {
                // do nothing
            }
        }

    }

    @Override
    protected void refreshVisuals() {
		getFigure().setToolTip(createToolTip());

        if (cssStyleSetting.isShowFolderImage()) {
			ImageDescriptor img = getModel().getSmallIcon();
			if (img == null && getModel().showDefaultIcon()) {
                img = InternalImages.DESC_FOLDER_OPEN;
            }
            setImageDescriptor(img);
        }

		getFigure().setTitle(getPaletteEntry().getLabel());
		getFigure().setLayoutMode(getLayoutSetting());

        boolean showPin = getPreferenceSource().getAutoCollapseSetting() == PaletteViewerPreferences.COLLAPSE_AS_NEEDED;
		getFigure().showPin(showPin);

		Color background = getModel().getDrawerType().equals(PaletteTemplateEntry.PALETTE_TYPE_TEMPLATE)
				? getViewer().getColorProvider().getListBackground()
                : null;
		getFigure().getScrollpane().setBackgroundColor(background);
    }

    @Override
    public EditPart createChild(Object model) {
        return super.createChild(model);
    }

    @Override
    public void addChild(EditPart child, int index) {
        super.addChild(child, index);
    }

    @Override
    public void removeChild(EditPart child) {
        super.removeChild(child);
    }
}
