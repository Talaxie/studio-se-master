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
package org.talend.designer.core.ui.codereview;

import org.eclipse.core.runtime.Assert;
import org.eclipse.jdt.internal.ui.JavaPluginImages;
import org.eclipse.jface.action.Action;
import org.talend.designer.core.i18n.Messages;
import org.talend.designer.core.ui.IJobCodereviewViewPart;

/**
 * Toggles the orientationof the layout of the type codereview
 */
public class CodereviewToggleOrientationAction extends Action {

    private IJobCodereviewViewPart fView;

    private int fActionOrientation;

    public CodereviewToggleOrientationAction(IJobCodereviewViewPart v, int orientation) {
        super("", AS_RADIO_BUTTON); //$NON-NLS-1$
        if (orientation == IJobCodereviewViewPart.VIEW_LAYOUT_HORIZONTAL) {
            // setText(TypeCodereviewMessages.ToggleOrientationAction_horizontal_label);
            setText(Messages.getString("ToggleOrientationAction_horizontal_label")); //$NON-NLS-1$
            // setDescription(TypeCodereviewMessages.ToggleOrientationAction_horizontal_description);
            setDescription(Messages.getString("ToggleOrientationAction_horizontal_description")); //$NON-NLS-1$
            // setToolTipText(TypeCodereviewMessages.ToggleOrientationAction_horizontal_tooltip);
            setToolTipText(Messages.getString("ToggleOrientationAction_horizontal_tooltip")); //$NON-NLS-1$
            JavaPluginImages.setLocalImageDescriptors(this, "th_horizontal.gif"); //$NON-NLS-1$
        } else if (orientation == IJobCodereviewViewPart.VIEW_LAYOUT_VERTICAL) {
            // setText(TypeCodereviewMessages.ToggleOrientationAction_vertical_label);
            setText(Messages.getString("ToggleOrientationAction_vertical_label")); //$NON-NLS-1$
            // setDescription(TypeCodereviewMessages.ToggleOrientationAction_vertical_description);
            setDescription(Messages.getString("ToggleOrientationAction_vertical_description")); //$NON-NLS-1$
            // setToolTipText(TypeCodereviewMessages.ToggleOrientationAction_vertical_tooltip);
            setToolTipText(Messages.getString("ToggleOrientationAction_vertical_tooltip")); //$NON-NLS-1$
            JavaPluginImages.setLocalImageDescriptors(this, "th_vertical.gif"); //$NON-NLS-1$
        } else if (orientation == IJobCodereviewViewPart.VIEW_LAYOUT_AUTOMATIC) {
            // setText(TypeCodereviewMessages.ToggleOrientationAction_automatic_label);
            setText(Messages.getString("ToggleOrientationAction_automatic_label")); //$NON-NLS-1$
            // setDescription(TypeCodereviewMessages.ToggleOrientationAction_automatic_description);
            setDescription(Messages.getString("ToggleOrientationAction_automatic_description")); //$NON-NLS-1$
            // setToolTipText(TypeCodereviewMessages.ToggleOrientationAction_automatic_tooltip);
            setToolTipText(Messages.getString("ToggleOrientationAction_automatic_tooltip")); //$NON-NLS-1$
            JavaPluginImages.setLocalImageDescriptors(this, "th_automatic.gif"); //$NON-NLS-1$
        } else if (orientation == IJobCodereviewViewPart.VIEW_LAYOUT_SINGLE) {
            // setText(TypeCodereviewMessages.ToggleOrientationAction_single_label);
            setText(Messages.getString("ToggleOrientationAction_single_label")); //$NON-NLS-1$
            // setDescription(TypeCodereviewMessages.ToggleOrientationAction_single_description);
            setDescription(Messages.getString("ToggleOrientationAction_single_description")); //$NON-NLS-1$
            // setToolTipText(TypeCodereviewMessages.ToggleOrientationAction_single_tooltip);
            setToolTipText(Messages.getString("ToggleOrientationAction_single_tooltip")); //$NON-NLS-1$
            JavaPluginImages.setLocalImageDescriptors(this, "th_single.gif"); //$NON-NLS-1$
        } else {
            Assert.isTrue(false);
        }
        fView = v;
        fActionOrientation = orientation;
    }

    public int getOrientation() {
        return fActionOrientation;
    }

    /*
     * @see Action#actionPerformed
     */
    public void run() {
        if (isChecked()) {
            fView.setViewLayout(fActionOrientation);
        }
    }

}
