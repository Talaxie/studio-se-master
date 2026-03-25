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
package org.talend.repository.nosql.db.util.neo4j;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.eclipse.emf.common.util.EMap;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.talend.commons.utils.VersionUtils;
import org.talend.repository.model.nosql.NoSQLConnection;
import org.talend.repository.model.nosql.NosqlFactory;
import org.talend.repository.nosql.constants.INoSQLCommonAttributes;
import org.talend.repository.nosql.db.common.neo4j.INeo4jAttributes;
import org.talend.repository.nosql.db.common.neo4j.INeo4jConstants;
import org.talend.repository.nosql.exceptions.NoSQLServerException;
import org.talend.utils.io.FilesUtils;

/**
 * created by ycbai on 2016年12月30日 Detailled comment
 *
 */
public class Neo4jConnectionUtilTest {

    NoSQLConnection connection;

    NoSQLConnection localConnection;

    File tmpFolder = null;

    @Before
    public void prepare() {
        tmpFolder = org.talend.utils.files.FileUtils.createTmpFolder("neo4jLocalConnection", "test"); //$NON-NLS-1$ //$NON-NLS-2$
        connection = NosqlFactory.eINSTANCE.createNoSQLConnection();
        localConnection = NosqlFactory.eINSTANCE.createNoSQLConnection();
    }

    @After
    public void clean() {
        if (tmpFolder != null) {
            FilesUtils.deleteFolder(tmpFolder, true);
        }
    }

    //TODO: FIXME
    @Ignore("failed because workbench has not been created")
    public void testLocalConnection() throws Exception {
        EMap<String, String> attributes = localConnection.getAttributes();
        attributes.put(INeo4jAttributes.REMOTE_SERVER, "false"); //$NON-NLS-1$

        attributes.put(INeo4jAttributes.DATABASE_PATH, tmpFolder.getCanonicalPath());

        attributes.put(INeo4jAttributes.DB_VERSION, INeo4jConstants.NEO4J_3_2_X);

        localConnection.setDbType("NEO4J");
        // TUP-15696:"Check Service" for Neo4j does not work after first check.
        // so check twice here

        ExecutorService threadExecutor = null;
        try {
            threadExecutor = Executors.newSingleThreadExecutor();
            Future future = threadExecutor.submit(new Runnable() {

                public void run() {
                    try {
                        Neo4jConnectionUtil.checkConnection(localConnection);
                        assertTrue(Neo4jConnectionUtil.checkConnection(localConnection));
                    } catch (NoSQLServerException e) {
                        fail(e.getMessage());
                    }
                }
            });

            while (true) {
                if (future.get() == null) {
                    break;
                }
                Thread.sleep(1000);
            }
        } catch (Exception exception) {
            fail(exception.getMessage());
        } finally {
            if (threadExecutor != null) {
                threadExecutor.shutdown();
            }
        }

    }

    @Test
    public void testIsVersionSince32() throws Exception {

        connection.getAttributes().put(INoSQLCommonAttributes.DB_VERSION, VersionUtils.DEFAULT_VERSION);
        Assert.assertFalse(Neo4jConnectionUtil.isVersionSince32(connection));

        connection.getAttributes().put(INoSQLCommonAttributes.DB_VERSION, "NEO4J_1_2_2");
        Assert.assertFalse(Neo4jConnectionUtil.isVersionSince32(connection));

        connection.getAttributes().put(INoSQLCommonAttributes.DB_VERSION, "NEO4J_3_1_X");
        Assert.assertFalse(Neo4jConnectionUtil.isVersionSince32(connection));

        connection.getAttributes().put(INoSQLCommonAttributes.DB_VERSION, INeo4jConstants.NEO4J_3_2_X);
        Assert.assertTrue(Neo4jConnectionUtil.isVersionSince32(connection));

        connection.getAttributes().put(INoSQLCommonAttributes.DB_VERSION, "NEO4J_4_1_X");
        Assert.assertTrue(Neo4jConnectionUtil.isVersionSince32(connection));

    }


}
