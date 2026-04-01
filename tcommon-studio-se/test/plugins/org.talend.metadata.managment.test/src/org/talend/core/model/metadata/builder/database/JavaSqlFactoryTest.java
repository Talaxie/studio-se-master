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
package org.talend.core.model.metadata.builder.database;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.talend.core.model.context.JobContextManager;
import org.talend.core.model.context.JobContextParameter;
import org.talend.core.model.metadata.builder.connection.ConnectionPackage;
import org.talend.core.model.metadata.builder.connection.DatabaseConnection;
import org.talend.core.model.metadata.types.JavaTypesManager;
import org.talend.core.model.process.IContext;
import org.talend.core.model.process.IContextParameter;

/**
 * created by mzhao on Nov 12, 2012 Detailled comment
 *
 */
public class JavaSqlFactoryTest {

    /**
     * Test method for
     * {@link org.talend.core.model.metadata.builder.database.JavaSqlFactory#getPassword(org.talend.core.model.metadata.builder.connection.Connection)}
     * .
     */
    @Test
    public void testGetPassword() {
        DatabaseConnection conn = ConnectionPackage.eINSTANCE.getConnectionFactory().createDatabaseConnection();
        String pwd = JavaSqlFactory.getPassword(conn);
        assertEquals("", pwd); //$NON-NLS-1$
        conn.setRawPassword(""); //$NON-NLS-1$
        pwd = JavaSqlFactory.getPassword(conn);
        assertEquals("", pwd); //$NON-NLS-1$
        conn.setRawPassword("talend4ever"); //$NON-NLS-1$
        pwd = JavaSqlFactory.getPassword(conn);
        assertEquals("talend4ever", pwd); //$NON-NLS-1$

    }

    /**
     * Test method for
     * {@link org.talend.core.model.metadata.builder.database.JavaSqlFactory#getUsername(org.talend.core.model.metadata.builder.connection.Connection)}
     * .
     */
    @Test
    public void testGetUsername() {
        DatabaseConnection conn = ConnectionPackage.eINSTANCE.getConnectionFactory().createDatabaseConnection();
        String userName = JavaSqlFactory.getUsername(conn);
        assertEquals("", userName); //$NON-NLS-1$
        conn.setUsername(""); //$NON-NLS-1$
        userName = JavaSqlFactory.getUsername(conn);
        assertEquals("", userName); //$NON-NLS-1$
        conn.setUsername("talend4ever"); //$NON-NLS-1$
        userName = JavaSqlFactory.getUsername(conn);
        assertEquals("talend4ever", userName); //$NON-NLS-1$

    }

    @Test
    public void testPromptPassword() {
        DatabaseConnection conn = getConnection();
        JobContextManager contextManager = getContextManager();
        for (IContextParameter contextParam : contextManager.getDefaultContext().getContextParameterList()) {
            JavaSqlFactory.savePromptConVars2Cache(conn, contextParam, new ArrayList<IContext>());
        }
        JavaSqlFactory.haveSetPromptContextVars = true;
        String pwd = JavaSqlFactory.getPassword(conn);
        assertEquals("Il1O0@01I", pwd); //$NON-NLS-1$
        JavaSqlFactory.haveSetPromptContextVars = false;

    }

    private DatabaseConnection getConnection() {
        DatabaseConnection conn = ConnectionPackage.eINSTANCE.getConnectionFactory().createDatabaseConnection();
        conn.setDatabaseType("MySQL");
        conn.setCdcTypeMode("true");
        conn.setContextId("_t6JiIL-JEeytPPESGs4uTQ");
        conn.setContextMode(true);
        conn.setPassword("context.mysql_Password");
        conn.setUsername("context.mysql_Login");
        return conn;
    }

    public JobContextManager getContextManager() {
        JobContextManager contextManager = new JobContextManager();
        List<IContextParameter> contextParameterList = contextManager.getDefaultContext().getContextParameterList();

        IContextParameter contextParam = new JobContextParameter();
        contextParam.setName("mysql_Password");
        contextParam.setPrompt("mysql_Password?");
        contextParam.setPromptNeeded(true);
        contextParam.setType(JavaTypesManager.PASSWORD.getId());
        contextParam.setValue("enc:system.encryption.key.v1:XvDCYmNqHBiWwueysEnyHM0Pl925+BNYbHHOpR+u4EGBX8d4MA==");
        contextParameterList.add(contextParam);

        contextParam = new JobContextParameter();
        contextParam.setName("mysql_Login");
        contextParam.setPrompt("mysql_Login?");
        contextParam.setPromptNeeded(true);
        contextParam.setType(JavaTypesManager.getDefaultJavaType().getId());
        contextParam.setValue("xyz");
        contextParameterList.add(contextParam);
        return contextManager;
    }
}
