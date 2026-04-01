package org.talend.repository.nosql.context;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.talend.designer.core.model.utils.emf.talendfile.ContextParameterType;
import org.talend.designer.core.model.utils.emf.talendfile.ContextType;
import org.talend.designer.core.model.utils.emf.talendfile.TalendFileFactory;
import org.talend.repository.model.nosql.NoSQLConnection;
import org.talend.repository.model.nosql.NosqlFactory;
import org.talend.repository.nosql.db.common.mongodb.IMongoConstants;
import org.talend.repository.nosql.db.common.mongodb.IMongoDBAttributes;
import org.talend.utils.json.JSONArray;
import org.talend.utils.json.JSONObject;

public class NoSQLConnectionContextManagerTest {

    private NoSQLConnectionContextManager manager;

    private NoSQLConnection noSqlConnection;

    private ContextType contextType;

    @Before
    public void setUp() throws Exception {
        noSqlConnection = NosqlFactory.eINSTANCE.createNoSQLConnection();
        String jsonStr = "[{\"REPLICA_HOST\":\"context.Mongo1_ReplicaHost_1\",\"REPLICA_PORT\":\"context.Mongo1_ReplicaPort_1\"}]";
        noSqlConnection.getAttributes().put(IMongoDBAttributes.REPLICA_SET, jsonStr);
        Set<String> attributes = new HashSet<String>();
        attributes.add(IMongoDBAttributes.DATABASE);
        attributes.add(IMongoDBAttributes.REPLICA_SET);
        manager = new NoSQLConnectionContextManager(noSqlConnection, attributes);
        contextType = TalendFileFactory.eINSTANCE.createContextType();
        ContextParameterType hostParam = TalendFileFactory.eINSTANCE.createContextParameterType();
        ContextParameterType portParam = TalendFileFactory.eINSTANCE.createContextParameterType();
        hostParam.setName("Mongo1_ReplicaHost_1");
        hostParam.setValue("localhost");
        portParam.setName("Mongo1_ReplicaPort_1");
        portParam.setValue("12701");
        contextType.getContextParameter().add(hostParam);
        contextType.getContextParameter().add(portParam);
    }

    @Test
    public void testRevertPropertiesForContextMode() throws Exception {
        manager.revertPropertiesForContextMode(contextType);
        String replicaSet = noSqlConnection.getAttributes().get(IMongoDBAttributes.REPLICA_SET);
        JSONArray jsa = new JSONArray(replicaSet);
        assertTrue(jsa.length() > 0);
        JSONObject jso = jsa.getJSONObject(0);
        String hostValue = jso.getString(IMongoConstants.REPLICA_HOST_KEY);
        assertEquals("localhost", hostValue);
        String portValue = jso.getString(IMongoConstants.REPLICA_PORT_KEY);
        assertEquals("12701", portValue);
    }

}
