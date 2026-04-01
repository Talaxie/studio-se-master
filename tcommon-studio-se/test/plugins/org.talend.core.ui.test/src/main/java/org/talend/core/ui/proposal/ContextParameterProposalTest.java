// ============================================================================
//
// Copyright (C) 2006-2022 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.core.ui.proposal;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.talend.core.model.context.JobContext;
import org.talend.core.model.context.JobContextParameter;
import org.talend.core.model.metadata.types.JavaTypesManager;
import org.talend.core.model.process.IContextParameter;

/**
 * created by hcyi on Apr 25, 2022
 * Detailled comment
 *
 */
public class ContextParameterProposalTest {

    @Test
    public void testGetDescription4PasswordType() {
        IContextParameter contextParam = new JobContextParameter();
        JobContext newContext = new JobContext("JobContext");//$NON-NLS-1$
        contextParam.setName("abc");//$NON-NLS-1$
        contextParam.setComment("abc");//$NON-NLS-1$
        contextParam.setContext(newContext);
        contextParam.setType(JavaTypesManager.PASSWORD.getId());
        contextParam.setValue("abc123");//$NON-NLS-1$

        ContextParameterProposal proposal = new ContextParameterProposal(contextParam);
        String desc = proposal.getDescription();
        assertEquals("Description: abc\n\nDefault context environment: JobContext\n\nType: id_Password\nValue: ******\n", //$NON-NLS-1$
                desc);
    }

    @Test
    public void testGetDescription4DefaultJavaType() {
        IContextParameter contextParam = new JobContextParameter();
        JobContext newContext = new JobContext("JobContext");//$NON-NLS-1$
        contextParam.setName("abc");//$NON-NLS-1$
        contextParam.setComment("abc");//$NON-NLS-1$
        contextParam.setContext(newContext);
        contextParam.setType(JavaTypesManager.getDefaultJavaType().getId());
        contextParam.setValue("abc123");//$NON-NLS-1$

        ContextParameterProposal proposal = new ContextParameterProposal(contextParam);
        String desc = proposal.getDescription();
        assertEquals("Description: abc\n\nDefault context environment: JobContext\n\nType: id_String\nValue: abc123\n", //$NON-NLS-1$
                desc);
    }

}
