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
package org.talend.rcp.handler;

import org.apache.commons.codec.binary.StringUtils;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.swt.program.Program;


public class ContactSupportHandler extends AbstractHandler {

    public static final String CONTACT_SUPPORT = "https://www.talend.com/technical-support/";//$NON-NLS-1$

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        String id = event.getCommand().getId();
        if (StringUtils.equals(id, "org.talend.rcp.show.contactSupport.command")) {//$NON-NLS-1$
            openBrower(CONTACT_SUPPORT);
        }
        return null;
    }

    protected void openBrower(String url) {
        Program.launch(url);
    }

}
