package org.talend.repository.nosql.service;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.talend.core.service.INOSQLService;
import org.talend.repository.model.nosql.NoSQLConnection;
import org.talend.repository.model.nosql.NosqlFactory;
import org.talend.repository.nosql.db.common.mongodb.IMongoDBAttributes;

public class NOSQLServiceTest {

    private INOSQLService service;

    private NoSQLConnection noSqlConnection;

    private String jsonStr;

    @Before
    public void setUp() throws Exception {
        service = new NOSQLService();
        noSqlConnection = NosqlFactory.eINSTANCE.createNoSQLConnection();
        jsonStr = "[{\"REPLICA_HOST\":\"context.Mongo1_ReplicaHost_1\",\"REPLICA_PORT\":\"context.Mongo1_ReplicaPort_1\"}]";
        noSqlConnection.getAttributes().put(IMongoDBAttributes.USE_REPLICA_SET, String.valueOf(true));
        noSqlConnection.getAttributes().put(IMongoDBAttributes.REPLICA_SET, jsonStr);

    }

    @Test
    public void testIsUseReplicaSet() {
        assertTrue(service.isUseReplicaSet(noSqlConnection));
    }

    @Test
    public void testGetMongoDBReplicaSets() {
        String replicaSet = service.getMongoDBReplicaSets(noSqlConnection);
        assertEquals(jsonStr, replicaSet);
    }

}
