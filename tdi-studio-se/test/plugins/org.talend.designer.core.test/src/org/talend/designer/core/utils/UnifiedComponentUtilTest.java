// ============================================================================
//
// Copyright (C) 2006-2021 Talaxie Inc. - www.deilink.fr
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talaxie SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.designer.core.utils;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.Path;
import org.junit.AfterClass;
import org.junit.Test;
import org.talend.core.database.EDatabaseTypeName;
import org.talend.core.model.components.IComponent;
import org.talend.core.model.metadata.builder.connection.ConnectionFactory;
import org.talend.core.model.metadata.builder.connection.DatabaseConnection;
import org.talend.core.model.metadata.builder.connection.MetadataTable;
import org.talend.core.model.properties.DatabaseConnectionItem;
import org.talend.core.model.properties.ItemState;
import org.talend.core.model.properties.PropertiesFactory;
import org.talend.core.model.properties.Property;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.model.repository.IRepositoryViewObject;
import org.talend.core.model.utils.IComponentName;
import org.talend.core.repository.RepositoryComponentManager;
import org.talend.core.repository.RepositoryComponentSetting;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.cwm.helper.ConnectionHelper;
import org.talend.cwm.helper.PackageHelper;
import org.talend.designer.core.model.components.UnifiedJDBCBean;
import org.talend.repository.model.IRepositoryNode.ENodeType;
import org.talend.repository.model.RepositoryNode;

import orgomg.cwm.resource.record.RecordFactory;
import orgomg.cwm.resource.record.RecordFile;

/**
 * DOC jding  class global comment. Detailled comment
 */
public class UnifiedComponentUtilTest {

    private static List<String> dbDisplayName = Arrays.asList(new String[] { "Test DB", "Test DB R" });

    @Test
    public void testLoadAdditionalJDBC() {
        String jsonContent = getMokeAdditionalJDBCJson();
        InputStream in = new ByteArrayInputStream(jsonContent.getBytes());
        Map<String, UnifiedJDBCBean> loadAdditionalJDBC = UnifiedComponentUtil.loadAdditionalJDBC(in);
        for (String key : dbDisplayName) {
            assertTrue(key + " didn't load properly", loadAdditionalJDBC.containsKey(key));
            UnifiedJDBCBean bean = loadAdditionalJDBC.get(key);
            assertNotNull(bean.getDatabaseId());
            assertNotNull(bean.getDisplayName());
            assertNotNull(bean.getDriverClass());
            assertNotNull(bean.getPaths());
            assertTrue(bean.getPaths().size()>0);

            assertNotNull(bean.getExcludeDefinitions());
            assertNotNull(bean.getParameterConfigurations());
        }
        UnifiedJDBCBean testdbBean = loadAdditionalJDBC.get("Test DB");
        assertTrue(testdbBean.getExcludeDefinitions().size() > 0);
        assertTrue(testdbBean.getParameterConfigurations().size() > 0);
        testdbBean = loadAdditionalJDBC.get("Test DB R");
        assertTrue(testdbBean.getExcludeDefinitions().isEmpty());
        assertTrue(testdbBean.getParameterConfigurations().isEmpty());

        String excludeCompName = "tJDBCSP";
        assertTrue(UnifiedComponentUtil.isUnsupportedComponent(excludeCompName, loadAdditionalJDBC.get("Test DB")));
        assertFalse(UnifiedComponentUtil.isUnsupportedComponent(excludeCompName, loadAdditionalJDBC.get("Test DB R")));
    }

    @Test
    public void testFilterUnifiedComponent4Filter() throws Exception {
        ProxyRepositoryFactory proxyRepositoryFactory = ProxyRepositoryFactory.getInstance();
        IRepositoryViewObject metadataRepObject = null;
        try {
            // sybase
            Property metadataProperty = PropertiesFactory.eINSTANCE.createProperty();
            DatabaseConnectionItem metadataItem = PropertiesFactory.eINSTANCE.createDatabaseConnectionItem();
            ItemState metadataItemState = PropertiesFactory.eINSTANCE.createItemState();
            metadataItemState.setPath("");
            metadataItem.setProperty(metadataProperty);
            metadataProperty.setId(proxyRepositoryFactory.getNextId());
            metadataProperty.setLabel("testMetadata");
            metadataProperty.setVersion("0.1");
            DatabaseConnection connection = ConnectionFactory.eINSTANCE.createDatabaseConnection();
            connection.setName("testSybase");
            connection.setId(proxyRepositoryFactory.getNextId());
            connection.setDatabaseType(EDatabaseTypeName.SYBASEASE.getDisplayName());
            metadataItem.setConnection(connection);
            RecordFile record = (RecordFile) ConnectionHelper.getPackage(connection.getName(), connection, RecordFile.class);
            MetadataTable inputTable = ConnectionFactory.eINSTANCE.createMetadataTable();
            inputTable.setId(proxyRepositoryFactory.getNextId());
            inputTable.setLabel("Input");
            if (record != null) {
                PackageHelper.addMetadataTable(inputTable, record);
            } else {
                RecordFile newrecord = RecordFactory.eINSTANCE.createRecordFile();
                newrecord.setName(connection.getName());
                ConnectionHelper.addPackage(newrecord, connection);
                PackageHelper.addMetadataTable(inputTable, newrecord);
            }
            proxyRepositoryFactory.create(metadataItem, new Path(""));
            proxyRepositoryFactory.save(metadataItem);
            metadataRepObject = proxyRepositoryFactory.getSpecificVersion(metadataProperty.getId(),
                    metadataProperty.getVersion(), true);
            RepositoryNode metadataNode = new RepositoryNode(metadataRepObject, null, ENodeType.REPOSITORY_ELEMENT);

            IComponentName rcSetting = RepositoryComponentManager.getSetting(metadataItem,
                    ERepositoryObjectType.METADATA_CONNECTIONS);
            List<IComponent> neededComponents = RepositoryComponentManager.filterNeededComponents(metadataItem, metadataNode,
                    ERepositoryObjectType.METADATA_CONNECTIONS, true, metadataRepObject.getProjectLabel());
            RepositoryComponentSetting compsetting = new RepositoryComponentSetting();
            compsetting.setInputComponent(rcSetting.getInputComponentName());
            compsetting.setOutputComponent(rcSetting.getOutPutComponentName());
            compsetting.setDefaultComponent(rcSetting.getDefaultComponentName());
            List<IComponent> filterUnifiedComponent = UnifiedComponentUtil.filterUnifiedComponent(compsetting, neededComponents,
                    EDatabaseTypeName.SYBASEASE.getDisplayName());
            boolean componentExist = isComponentExist(filterUnifiedComponent, "tSybaseOutputBulkExec");
            assertTrue(componentExist);
            componentExist = isComponentExist(filterUnifiedComponent, "tDBOutputBulkExec");
            assertTrue(componentExist);

            // redshift
            connection.setDatabaseType(EDatabaseTypeName.REDSHIFT.getDisplayName());
            proxyRepositoryFactory.save(metadataItem);
            metadataRepObject = proxyRepositoryFactory.getSpecificVersion(metadataProperty.getId(), metadataProperty.getVersion(),
                    true);
            RepositoryNode metadataNode1 = new RepositoryNode(metadataRepObject, null, ENodeType.REPOSITORY_ELEMENT);
            IComponentName rcSetting1 = RepositoryComponentManager.getSetting(metadataItem,
                    ERepositoryObjectType.METADATA_CONNECTIONS);
            List<IComponent> neededComponents1 = RepositoryComponentManager.filterNeededComponents(metadataItem, metadataNode1,
                    ERepositoryObjectType.METADATA_CONNECTIONS, true, metadataRepObject.getProjectLabel());
            RepositoryComponentSetting compsetting1 = new RepositoryComponentSetting();
            compsetting1.setInputComponent(rcSetting1.getInputComponentName());
            compsetting1.setOutputComponent(rcSetting1.getOutPutComponentName());
            compsetting1.setDefaultComponent(rcSetting1.getDefaultComponentName());
            List<IComponent> filterUnifiedComponent1 = UnifiedComponentUtil.filterUnifiedComponent(compsetting1,
                    neededComponents1, EDatabaseTypeName.REDSHIFT.getDisplayName());
            componentExist = isComponentExist(filterUnifiedComponent1, "tRedshiftInput");
            assertTrue(componentExist);
            componentExist = isComponentExist(filterUnifiedComponent1, "tRedshiftOutput");
            assertTrue(componentExist);
            componentExist = isComponentExist(filterUnifiedComponent1, "tDBInput");
            assertTrue(componentExist);
            componentExist = isComponentExist(filterUnifiedComponent1, "tDBOutput");
            assertTrue(componentExist);
        } finally {
            if (metadataRepObject != null) {
                proxyRepositoryFactory.deleteObjectPhysical(metadataRepObject);
            }
        }

    }

    private boolean isComponentExist(List<IComponent> componentList, String componentName) {
        boolean exist = false;
        for (IComponent component : componentList) {
            if (component.getName().equals(componentName)) {
                exist = true;
                break;
            }
        }
        return exist;
    }


    @AfterClass
    public static void afterClass() {
        Map<String, UnifiedJDBCBean> additionalJDBCMap = UnifiedComponentUtil.getAdditionalJDBC();
        for (String key : dbDisplayName) {
            additionalJDBCMap.remove(key);
        }
    }

    private String getMokeAdditionalJDBCJson() {
        /**
         * [
         * { "id" : "TEST_DB", "displayName" : "Test DB", "class" : "com.simba.spark.jdbc.Driver", "url" :
         * "jdbc:spark://", "paths" : [ {"path" : "mvn:Spark/SparkJDBC42/2.6.14.1018/jar"} ], "excludes": [{
         * "component": "tJDBCSP" }, { "component": "tJDBCCommit" }, { "component": "tJDBCRollback" } ],
         * "configuration": [{ "component": "tTestDBConnection", "parameters": [{ "name": "use_autocommit", "value":
         * "true" }, { "name": "autocommit", "value": "true" } ] } ]
         * }, { "id" : "TEST_DB_R", "displayName" : "Test DB R", "class" : "com.simba.spark.jdbc.Driver", "url" :
         * "jdbc:spark://", "paths" : [ {"path" : "mvn:Spark/SparkJDBC42/2.6.14.1018/jar"} ]
         * }
         * ]
         */
        String jsonContent = "[\r\n" + "\r\n" + "    {\r\n" + "        \"id\" : \"TEST_DB\",\r\n"
                + "        \"displayName\" : \"Test DB\",\r\n" + "        \"class\" : \"com.simba.spark.jdbc.Driver\",\r\n"
                + "        \"url\" : \"jdbc:spark://\",\r\n" + "        \"paths\" : \r\n" + "        [\r\n"
                + "            {\"path\" : \"mvn:Spark/SparkJDBC42/2.6.14.1018/jar\"}\r\n" + "        ],\r\n"
                + "        \"excludes\": [{\r\n" + "                \"component\": \"tJDBCSP\"\r\n" + "            },\r\n"
                + "            {\r\n" + "                \"component\": \"tJDBCCommit\"\r\n" + "            },\r\n"
                + "            {\r\n" + "                \"component\": \"tJDBCRollback\"\r\n" + "            }\r\n"
                + "        ],\r\n" + "        \"configuration\": [{\r\n"
                + "                \"component\": \"tTestDBConnection\",\r\n" + "                \"parameters\": [{\r\n"
                + "                        \"name\": \"use_autocommit\",\r\n" + "                        \"value\": \"true\"\r\n"
                + "                    },\r\n" + "                    {\r\n"
                + "                        \"name\": \"autocommit\",\r\n" + "                        \"value\": \"true\"\r\n"
                + "                    }\r\n" + "                ]\r\n" + "            }\r\n" + "        ]\r\n" + "    \r\n"
                + "    },  {\r\n" + "        \"id\" : \"TEST_DB_R\",\r\n" + "        \"displayName\" : \"Test DB R\",\r\n"
                + "        \"class\" : \"com.simba.spark.jdbc.Driver\",\r\n" + "        \"url\" : \"jdbc:spark://\",\r\n"
                + "        \"paths\" : \r\n" + "        [\r\n"
                + "            {\"path\" : \"mvn:Spark/SparkJDBC42/2.6.14.1018/jar\"}\r\n" + "        ]\r\n" + "    \r\n"
                + "    }\r\n" + "\r\n" + "]";
        return jsonContent;
    }

}
