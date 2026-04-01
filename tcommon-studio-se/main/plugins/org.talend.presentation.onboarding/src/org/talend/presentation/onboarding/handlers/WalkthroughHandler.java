// ============================================================================
//
// Copyright (C) 2006-2023 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.presentation.onboarding.handlers;

import org.apache.commons.lang.StringUtils;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.talend.core.GlobalServiceRegister;
import org.talend.core.service.ITutorialsService;

public class WalkthroughHandler extends AbstractHandler {


    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        String id = event.getCommand().getId();

        if (StringUtils.equals(id, "org.talend.presentation.walkthrough.command")) {//$NON-NLS-1$
            ITutorialsService service = GlobalServiceRegister.getDefault().getService(ITutorialsService.class);
            service.openTutorialsDialog();
        }
        return null;
    }

}
