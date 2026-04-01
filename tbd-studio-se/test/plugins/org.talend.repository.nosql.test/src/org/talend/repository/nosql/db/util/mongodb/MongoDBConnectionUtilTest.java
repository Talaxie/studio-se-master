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
package org.talend.repository.nosql.db.util.mongodb;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.talend.commons.utils.VersionUtils;
import org.talend.core.utils.TalendQuoteUtils;
import org.talend.repository.model.nosql.NoSQLConnection;
import org.talend.repository.model.nosql.NosqlFactory;
import org.talend.repository.nosql.constants.INoSQLCommonAttributes;
import org.talend.repository.nosql.db.common.mongodb.IMongoConstants;

/**
 * DOC PLV class global comment. Detailled comment
 */
public class MongoDBConnectionUtilTest {

    private String contextReplicaSet;

    private String builtInReplicaSet;

    @Before
    public void setUp() throws Exception {
        contextReplicaSet = "[{\"REPLICA_HOST\":\"context.Mongo1_ReplicaHost_1\",\"REPLICA_PORT\":\"context.Mongo1_ReplicaPort_1\"}]";
        builtInReplicaSet = "[{\"REPLICA_HOST\":\"localhost\",\"REPLICA_PORT\":\"12701\"}]";
    }

    @Test
    public void testGetReplicaSetList() throws Exception {
        boolean isContextMode = true;
        // test context mode
        List<HashMap<String, Object>> replicaSetList = MongoDBConnectionUtil.getReplicaSetList(contextReplicaSet, !isContextMode);
        validateResult(replicaSetList, isContextMode);
        // test built-in mode
        isContextMode = false;
        replicaSetList = MongoDBConnectionUtil.getReplicaSetList(builtInReplicaSet, !isContextMode);
        validateResult(replicaSetList, isContextMode);
    }

    private void validateResult(List<HashMap<String, Object>> list, boolean isContextMode) {
        assertTrue(list != null && !list.isEmpty());
        Map<String, Object> map = list.get(0);
        assertTrue(map.size() == 2);
        String hostParam = (String) map.get(IMongoConstants.REPLICA_HOST_KEY);
        String portParam = (String) map.get(IMongoConstants.REPLICA_PORT_KEY);
        if (isContextMode) {
            assertFalse(
                    hostParam.startsWith(TalendQuoteUtils.QUOTATION_MARK) || hostParam.endsWith(TalendQuoteUtils.QUOTATION_MARK));
            assertFalse(
                    portParam.startsWith(TalendQuoteUtils.QUOTATION_MARK) || portParam.endsWith(TalendQuoteUtils.QUOTATION_MARK));
        } else {
            assertTrue(
                    hostParam.startsWith(TalendQuoteUtils.QUOTATION_MARK) && hostParam.endsWith(TalendQuoteUtils.QUOTATION_MARK));
            assertFalse(
                    portParam.startsWith(TalendQuoteUtils.QUOTATION_MARK) || portParam.endsWith(TalendQuoteUtils.QUOTATION_MARK));
        }
    }

    @Test
    public void testIsUpgradeVersion() {
        NoSQLConnection connection = NosqlFactory.eINSTANCE.createNoSQLConnection();
        connection.getAttributes().put(INoSQLCommonAttributes.DB_VERSION, VersionUtils.DEFAULT_VERSION);
        Assert.assertFalse(MongoDBConnectionUtil.isUpgradeVersion(connection));

        connection.getAttributes().put(INoSQLCommonAttributes.DB_VERSION, "MONGODB_2_5_X");
        Assert.assertFalse(MongoDBConnectionUtil.isUpgradeVersion(connection));

        connection.getAttributes().put(INoSQLCommonAttributes.DB_VERSION, "MONGODB_2_6_X");
        Assert.assertFalse(MongoDBConnectionUtil.isUpgradeVersion(connection));

        connection.getAttributes().put(INoSQLCommonAttributes.DB_VERSION, "MONGODB_3_2_X");
        Assert.assertFalse(MongoDBConnectionUtil.isUpgradeVersion(connection));

        connection.getAttributes().put(INoSQLCommonAttributes.DB_VERSION, "MONGODB_3_5_X");
        Assert.assertTrue(MongoDBConnectionUtil.isUpgradeVersion(connection));

        connection.getAttributes().put(INoSQLCommonAttributes.DB_VERSION, "MONGODB_4_5_X");
        Assert.assertTrue(MongoDBConnectionUtil.isUpgradeVersion(connection));
    }
    
    @Test
    public void testGetUsernamePassword() throws UnsupportedEncodingException {
        /// mongo connection string prefix: mongodb://
        String connectionStrings = "mongodb://mongouser001:mongopassword001@example.com/test";
        String[] expectedUsernamePassword = { "mongouser001", "mongopassword001" };
        String[] usernamePassword = MongoDBConnectionUtil.getUsernamePassword(connectionStrings);
        assertArrayEquals(expectedUsernamePassword, usernamePassword);

        // url encoded username,password
        char[] specialChar = { ':', '/', '?', '#', '[', ']', '@', '+' }; //ref mongodb's document about connection string
        String specialStr = new String(specialChar);
        expectedUsernamePassword = new String[] { "mongouser001" + specialStr, "mongopassword001" + specialStr };
        String encodedUsername = URLEncoder.encode(expectedUsernamePassword[0], StandardCharsets.UTF_8.toString());
        String encodedPassword = URLEncoder.encode(expectedUsernamePassword[1], StandardCharsets.UTF_8.toString());
        connectionStrings = "mongodb://" + encodedUsername +":"+encodedPassword + "@example.com/test";
        
        usernamePassword = MongoDBConnectionUtil.getUsernamePassword(connectionStrings);
        assertArrayEquals(expectedUsernamePassword, usernamePassword);
        
        ///mongo connection string prefix: mongodb+srv://
        connectionStrings = "mongodb+srv://mongouser001:mongopassword001@cluster001.lqm73q7.mongodb.net/test";
        expectedUsernamePassword = new String[]{ "mongouser001", "mongopassword001" };
        usernamePassword = MongoDBConnectionUtil.getUsernamePassword(connectionStrings);
        assertArrayEquals(expectedUsernamePassword, usernamePassword);
        
        //url encoded username,password
        expectedUsernamePassword = new String[] { "mongouser001" + specialStr, "mongopassword001" + specialStr };
        encodedUsername = URLEncoder.encode(expectedUsernamePassword[0], StandardCharsets.UTF_8.toString());
        encodedPassword = URLEncoder.encode(expectedUsernamePassword[1], StandardCharsets.UTF_8.toString());
        connectionStrings = "mongodb://" + encodedUsername +":"+encodedPassword + "@example.com/test";
        usernamePassword = MongoDBConnectionUtil.getUsernamePassword(connectionStrings);
        assertArrayEquals(expectedUsernamePassword, usernamePassword);
    }

}
