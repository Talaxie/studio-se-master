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
package org.talend.librariesmanager.ui.actions;

import org.eclipse.jface.action.Action;
import org.talend.commons.ui.runtime.image.EImage;
import org.talend.commons.ui.runtime.image.ImageProvider;
import org.talend.core.GlobalServiceRegister;
import org.talend.core.service.IUpdateService;
import org.talend.librariesmanager.ui.i18n.Messages;
import org.talend.librariesmanager.ui.views.ModulesView;


public class CheckThirdPartyLibrariesAction extends Action {

	private ModulesView parentView = null;

    public CheckThirdPartyLibrariesAction(ModulesView parentView) {
        super();
        this.setText(Messages.getString("Module.view.install.additional.packages.action.text"));
        this.setDescription(Messages.getString("Module.view.install.additional.packages.action.description"));
        this.setImageDescriptor(ImageProvider.getImageDesc(EImage.DOWNLOAD_LIB));
        this.parentView = parentView;
    }

    @Override
    public void run() {
    	 if (GlobalServiceRegister.getDefault().isServiceRegistered(IUpdateService.class)) {
             IUpdateService service = GlobalServiceRegister.getDefault().getService(IUpdateService.class);
             service.checkThirdPartyLibraries();
         }

    }

}
