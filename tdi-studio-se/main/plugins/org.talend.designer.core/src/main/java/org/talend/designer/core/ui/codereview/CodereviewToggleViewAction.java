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
 * Action to switch between the different codereview views.
 */
public class CodereviewToggleViewAction extends Action {

    private IJobCodereviewViewPart fViewPart;

    private int fViewerIndex;

    public CodereviewToggleViewAction(IJobCodereviewViewPart v, int viewerIndex) {
        super("", AS_RADIO_BUTTON); //$NON-NLS-1$
        if (viewerIndex == IJobCodereviewViewPart.HIERARCHY_MODE_SUPERTYPES) {
            // setText(TypeCodereviewMessages.ToggleViewAction_supertypes_label);
            setText(Messages.getString("ToggleViewAction_supertypes_label")); //$NON-NLS-1$
            // setDescription(TypeCodereviewMessages.ToggleViewAction_supertypes_description);
            setDescription(Messages.getString("ToggleViewAction_supertypes_description")); //$NON-NLS-1$
            // setToolTipText(TypeCodereviewMessages.ToggleViewAction_supertypes_tooltip);
            setToolTipText(Messages.getString("ToggleViewAction_supertypes_tooltip")); //$NON-NLS-1$
            JavaPluginImages.setLocalImageDescriptors(this, "super_co.gif"); //$NON-NLS-1$
        } else if (viewerIndex == IJobCodereviewViewPart.HIERARCHY_MODE_SUBTYPES) {
            // setText(TypeCodereviewMessages.ToggleViewAction_subtypes_label);
            setText(Messages.getString("ToggleViewAction_subtypes_label")); //$NON-NLS-1$
            // setDescription(TypeCodereviewMessages.ToggleViewAction_subtypes_description);
            setDescription(Messages.getString("ToggleViewAction_subtypes_description")); //$NON-NLS-1$
            // setToolTipText(TypeCodereviewMessages.ToggleViewAction_subtypes_tooltip);
            setToolTipText(Messages.getString("ToggleViewAction_subtypes_tooltip")); //$NON-NLS-1$
            JavaPluginImages.setLocalImageDescriptors(this, "sub_co.gif"); //$NON-NLS-1$
        } else if (viewerIndex == IJobCodereviewViewPart.HIERARCHY_MODE_CLASSIC) {
            // setText(TypeCodereviewMessages.ToggleViewAction_vajhierarchy_label);
            setText(Messages.getString("ToggleViewAction_vajhierarchy_label")); //$NON-NLS-1$
            // setDescription(TypeCodereviewMessages.ToggleViewAction_vajhierarchy_description);
            setDescription(Messages.getString("ToggleViewAction_vajhierarchy_description")); //$NON-NLS-1$
            // setToolTipText(TypeCodereviewMessages.ToggleViewAction_vajhierarchy_tooltip);
            setToolTipText(Messages.getString("ToggleViewAction_vajhierarchy_tooltip")); //$NON-NLS-1$
            JavaPluginImages.setLocalImageDescriptors(this, "hierarchy_co.gif"); //$NON-NLS-1$
        } else {
            Assert.isTrue(false);
        }

        fViewPart = v;
        fViewerIndex = viewerIndex;
    }

    public int getViewerIndex() {
        return fViewerIndex;
    }

    /*
     * @see Action#actionPerformed
     */
    public void run() {
        fViewPart.setCodereviewMode(fViewerIndex);
    }
}
