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
package org.talend.rcp.intro;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.program.Program;
import org.talend.rcp.action.toolbar.ResourceImageTextAction;
import org.talend.rcp.i18n.Messages;

/**
 * DOC jding  class global comment. Detailled comment
 */
public class TalendHelpDocAction extends Action {

    private static final String TALEND_DOC_LINK = Messages.getString("TalendHelpDocAction.documentationLink"); //$NON-NLS-1$

    private static final String HELP_IMAGE = "/icons/help_center.png";
    public TalendHelpDocAction() {
        setText(Messages.getString("TalendHelpDocAction.helpCenter"));
        setToolTipText(Messages.getString("TalendHelpDocAction.helpCenter"));
        ImageRegistry imageRegistry = JFaceResources.getImageRegistry();
        if (imageRegistry.get(HELP_IMAGE) == null) {
            ImageDescriptor imageDescriptor = ImageDescriptor.createFromFile(ResourceImageTextAction.class, HELP_IMAGE);
            if (imageDescriptor != null) {
                imageRegistry.put(HELP_IMAGE, imageDescriptor);
            }
        }
        setImageDescriptor(imageRegistry.getDescriptor(HELP_IMAGE));
    }

    @Override
    public void run() {
        Program.launch(TALEND_DOC_LINK);
    }

}
