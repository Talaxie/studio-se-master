package org.talend.designer.core.ui.editor.process;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.talend.core.database.EDatabaseTypeName;
import org.talend.core.model.components.ComponentCategory;
import org.talend.core.model.components.IComponent;
import org.talend.core.model.metadata.builder.connection.ConnectionFactory;
import org.talend.core.model.metadata.builder.connection.DatabaseConnection;
import org.talend.core.model.properties.PropertiesFactory;
import org.talend.core.model.properties.Property;
import org.talend.core.ui.component.ComponentsFactoryProvider;
import org.talend.designer.core.ui.editor.nodes.Node;
public class ProcessUpdateManagerTest {

    private Process process;

    private ProcessUpdateManager updateManager;

    @Before
    public void setUp() throws Exception {
        Property property = PropertiesFactory.eINSTANCE.createProperty();
        process = new Process(property);
        updateManager = new ProcessUpdateManager(process);
    }

    @Test
    public void testIsOldJDBC() throws Exception {
        IComponent component = null;
        Node node = null;
        DatabaseConnection connection = ConnectionFactory.eINSTANCE.createDatabaseConnection();

        component = ComponentsFactoryProvider.getInstance().get("tELTMap", ComponentCategory.CATEGORY_4_DI.getName());
        node = new Node(component, process);
        connection.setDatabaseType(EDatabaseTypeName.GENERAL_JDBC.getProduct());
        assertTrue(updateManager.isOldJDBC(node, connection));

        connection.setDatabaseType(EDatabaseTypeName.MYSQL.getProduct());
        assertFalse(updateManager.isOldJDBC(node, connection));

        component = ComponentsFactoryProvider.getInstance().get("tSqoopMerge", ComponentCategory.CATEGORY_4_DI.getName());
        node = new Node(component, process);
        connection.setDatabaseType(EDatabaseTypeName.GENERAL_JDBC.getProduct());
        assertTrue(updateManager.isOldJDBC(node, connection));

        component = ComponentsFactoryProvider.getInstance().get("tJDBCInput", ComponentCategory.CATEGORY_4_DI.getName());
        if (component != null) {
            node = new Node(component, process);
            connection.setDatabaseType(EDatabaseTypeName.GENERAL_JDBC.getProduct());
            assertFalse(updateManager.isOldJDBC(node, connection));
        }

        component = ComponentsFactoryProvider.getInstance().get("tJDBCInput", ComponentCategory.CATEGORY_4_MAPREDUCE.getName());
        if (component != null) {
            node = new Node(component, process);
            connection.setDatabaseType(EDatabaseTypeName.GENERAL_JDBC.getProduct());
            assertTrue(updateManager.isOldJDBC(node, connection));
        }

    }

    @Test
    public void testCompareMapList() throws Exception {
        List<Map<String, Object>> oldList = new ArrayList<Map<String, Object>>();
        List<Map<String, Object>> objectValue = new ArrayList<Map<String, Object>>();
        boolean result = updateManager.compareMapList(objectValue, oldList, new String[] { "KEY", "VALUE" });
        assertTrue(result);

        Map<String, Object> lineMap = new HashMap<String, Object>();
        lineMap.put("KEY", "testKey");
        lineMap.put("VALUE", "testValue");
        objectValue.add(lineMap);
        // size not match to false
        result = updateManager.compareMapList(objectValue, oldList, new String[] { "KEY", "VALUE" });
        assertFalse(result);
        oldList.add(lineMap);
        result = updateManager.compareMapList(objectValue, oldList, new String[] { "KEY", "VALUE" });
        assertTrue(result);

        Map<String, Object> line2Map = new HashMap<String, Object>();
        line2Map.put("KEY", "testKey2");
        line2Map.put("VALUE", "testValue2");
        objectValue.add(line2Map);
        oldList.add(line2Map);
        result = updateManager.compareMapList(objectValue, oldList, new String[] { "KEY", "VALUE" });
        assertTrue(result);
        // value not match to false
        objectValue.remove(1);
        Map<String, Object> newLine = new HashMap<String, Object>();
        newLine.put("KEY", "testKey2");
        newLine.put("VALUE", "newValue2");
        objectValue.add(newLine);
        result = updateManager.compareMapList(objectValue, oldList, new String[] { "KEY", "VALUE" });
        assertFalse(result);

        oldList = new ArrayList<Map<String, Object>>();
        objectValue = new ArrayList<Map<String, Object>>();
        oldList.add(lineMap);
        oldList.add(line2Map);
        objectValue.add(line2Map);
        objectValue.add(lineMap);
        // order not match to false
        result = updateManager.compareMapList(objectValue, oldList, new String[] { "KEY", "VALUE" });
        assertFalse(result);

        oldList = new ArrayList<Map<String, Object>>();
        objectValue = new ArrayList<Map<String, Object>>();
        lineMap = new HashMap<String, Object>();
        line2Map = new HashMap<String, Object>();
        lineMap.put("SCHEMA_COLUMN", "birthday");
        lineMap.put("QUERY", "$.person.birthday");
        lineMap.put("NODECHECK", "false");
        line2Map.put("SCHEMA_COLUMN", "attribute");
        line2Map.put("QUERY", "$.person.attribute");
        line2Map.put("NODECHECK", "false");
        oldList.add(lineMap);
        oldList.add(line2Map);
        objectValue.add(line2Map);
        objectValue.add(lineMap);
        result = updateManager.compareMapList(objectValue, oldList, new String[] { "SCHEMA_COLUMN", "QUERY", "NODECHECK" });
        assertFalse(result);

        oldList = new ArrayList<Map<String, Object>>();
        objectValue = new ArrayList<Map<String, Object>>();
        lineMap = new HashMap<String, Object>();
        line2Map = new HashMap<String, Object>();
        lineMap.put("SCHEMA_COLUMN", "componentName");
        lineMap.put("QUERY", "../componentName");
        lineMap.put("NODECHECK", "");
        line2Map.put("SCHEMA_COLUMN", "componentName");
        line2Map.put("QUERY", "../componentName");
        oldList.add(lineMap);
        objectValue.add(line2Map);
        result = updateManager.compareMapList(objectValue, oldList, new String[] { "SCHEMA_COLUMN", "QUERY", "NODECHECK" });
        assertTrue(result);
        oldList.clear();
        oldList.add(line2Map);
        objectValue.clear();
        objectValue.add(lineMap);
        result = updateManager.compareMapList(objectValue, oldList, new String[] { "SCHEMA_COLUMN", "QUERY", "NODECHECK" });
        assertTrue(result);

    }
}
