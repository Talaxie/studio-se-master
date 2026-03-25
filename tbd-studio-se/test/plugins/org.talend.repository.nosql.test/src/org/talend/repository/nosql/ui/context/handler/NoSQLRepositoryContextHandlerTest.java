package org.talend.repository.nosql.ui.context.handler;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.talend.core.model.metadata.types.JavaTypesManager;
import org.talend.core.model.process.IContextParameter;
import org.talend.core.model.properties.ContextItem;
import org.talend.core.model.properties.PropertiesFactory;
import org.talend.core.ui.context.model.table.ConectionAdaptContextVariableModel;
import org.talend.metadata.managment.ui.model.IConnParamName;
import org.talend.metadata.managment.ui.utils.ExtendedNodeConnectionContextUtils.EHadoopParamName;
import org.talend.repository.model.nosql.NoSQLConnection;
import org.talend.repository.model.nosql.NosqlFactory;
import org.talend.repository.nosql.constants.INoSQLCommonAttributes;
import org.talend.repository.nosql.db.common.mongodb.IMongoConstants;
import org.talend.repository.nosql.db.common.mongodb.IMongoDBAttributes;
import org.talend.utils.json.JSONArray;
import org.talend.utils.json.JSONObject;

public class NoSQLRepositoryContextHandlerTest {

    private NoSQLRepositoryContextHandler handler;

    private NoSQLConnection noSqlConnection;

    private Set<IConnParamName> paramSet;

    private Map<ContextItem, List<ConectionAdaptContextVariableModel>> adaptMap;

    @Before
    public void setUp() throws Exception {
        handler = new NoSQLRepositoryContextHandler();
        noSqlConnection = NosqlFactory.eINSTANCE.createNoSQLConnection();
        noSqlConnection.getAttributes().put(INoSQLCommonAttributes.DATABASE, "testDB");
        noSqlConnection.getAttributes().put(IMongoDBAttributes.USE_REPLICA_SET, "true");
        String replicaSet = "[{\"REPLICA_HOST\":\"localhost\",\"REPLICA_PORT\":\"12701\"}]";
        noSqlConnection.getAttributes().put(IMongoDBAttributes.REPLICA_SET, replicaSet);

        paramSet = new HashSet<IConnParamName>();
        paramSet.add(EHadoopParamName.Database);
        paramSet.add(EHadoopParamName.ReplicaSets);

        adaptMap = new HashMap<ContextItem, List<ConectionAdaptContextVariableModel>>();
        ContextItem contextItem = PropertiesFactory.eINSTANCE.createContextItem();
        List<ConectionAdaptContextVariableModel> modelList = new ArrayList<ConectionAdaptContextVariableModel>();
        adaptMap.put(contextItem, modelList);
        modelList.add(new ConectionAdaptContextVariableModel("Mongo_Database", "Database", ""));
        modelList.add(new ConectionAdaptContextVariableModel("Mongo_ReplicaHost_1", "ReplicaHost_1", ""));
        modelList.add(new ConectionAdaptContextVariableModel("Mongo_ReplicaPort_1", "ReplicaPort_1", ""));

    }

    @Test
    public void testCreateContextParameters() throws Exception {
        List<IContextParameter> varList = handler.createContextParameters("Mongo", noSqlConnection, paramSet);
        int i = 0;
        for (IContextParameter contextParameter : varList) {
            if (contextParameter.getValue().equals("localhost")) {
                assertEquals("Mongo_ReplicaHost_1", contextParameter.getName());
                assertEquals(contextParameter.getType(), JavaTypesManager.STRING.getId());
                i++;
            } else if (contextParameter.getValue().equals("12701")) {
                assertEquals("Mongo_ReplicaPort_1", contextParameter.getName());
                assertEquals(contextParameter.getType(), JavaTypesManager.INTEGER.getId());
                i++;
            }
        }
        assertTrue(i == 2);

    }

    @Test
    public void testSetPropertiesForContextMode() throws Exception {
        handler.setPropertiesForContextMode("Mongo", noSqlConnection, paramSet);
        validateResult();
    }

    @Test
    public void testSetPropertiesForExistContextMode() throws Exception {
        handler.setPropertiesForExistContextMode(noSqlConnection, paramSet, adaptMap);
        validateResult();
    }

    private void validateResult() throws Exception {
        String dbName = noSqlConnection.getAttributes().get(INoSQLCommonAttributes.DATABASE);
        assertEquals("context.Mongo_Database", dbName);
        String replicaSet = noSqlConnection.getAttributes().get(IMongoDBAttributes.REPLICA_SET);
        assertNotNull(replicaSet);
        JSONArray jsa = new JSONArray(replicaSet);
        assertTrue(jsa.length() > 0);
        JSONObject jso = jsa.getJSONObject(0);
        String contextHostName = jso.getString(IMongoConstants.REPLICA_HOST_KEY);
        String contextPortName = jso.getString(IMongoConstants.REPLICA_PORT_KEY);
        assertEquals("context.Mongo_ReplicaHost_1", contextHostName);
        assertEquals("context.Mongo_ReplicaPort_1", contextPortName);
    }

}
