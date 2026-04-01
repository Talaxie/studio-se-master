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
package org.talend.sdk.component.studio.util;

import static java.util.Collections.emptyMap;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.talend.core.model.components.ComponentCategory;
import org.talend.core.model.components.IComponent;
import org.talend.core.model.process.BigDataNode;
import org.talend.core.model.process.EComponentCategory;
import org.talend.core.model.process.EParameterFieldType;
import org.talend.core.model.process.ElementParameterValueModel;
import org.talend.core.model.process.IProcess;
import org.talend.core.model.properties.PropertiesFactory;
import org.talend.core.model.properties.Property;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.core.ui.component.ComponentsFactoryProvider;
import org.talend.designer.core.model.components.DummyComponent;
import org.talend.designer.core.model.components.ElementParameter;
import org.talend.designer.core.model.process.DataProcess;
import org.talend.designer.core.ui.editor.nodes.Node;
import org.talend.designer.core.ui.editor.process.Process;
import org.talend.sdk.component.server.front.model.ComponentId;
import org.talend.sdk.component.server.front.model.ComponentIndex;
import org.talend.sdk.component.server.front.model.SimplePropertyDefinition;
import org.talend.sdk.component.studio.i18n.Messages;
import org.talend.sdk.component.studio.model.action.SuggestionsAction;
import org.talend.sdk.component.studio.model.parameter.TaCoKitElementParameter;
import org.talend.sdk.component.studio.model.parameter.TableElementParameter;
import org.talend.sdk.component.studio.model.parameter.TextElementParameter;
import org.talend.sdk.component.studio.model.parameter.ValueSelectionParameter;

/**
 * created by hcyi on Oct 9, 2019 Detailled comment
 *
 */
public class TaCoKitUtilTest {

    @Test
    public void testGetDisplayName1() throws Exception {
        final ComponentId id = new ComponentId("Y291Y2hiYXNlI0NvdWNoYmFzZSNJbnB1dA", "Y291Y2hiYXNlI0NvdWNoYmFzZQ", "test",
                "org.test.components:test:1.1.0-SNAPSHOT", "Test", "Input");
        final ComponentIndex index = new ComponentIndex(id, "Test Input", null, null, null, null, 1, Arrays.asList("Local", "File"),
                null, emptyMap());
        String displayName = TaCoKitUtil.getDisplayName(index);
        Assert.assertEquals("TestInput", displayName);//$NON-NLS-1$
    }

    @Test
    public void testGetDisplayName2() throws Exception {
        final ComponentId id = new ComponentId("Y291Y2hiYXNlI0NvdWNoYmFzZSNJbnB1dA", "Y291Y2hiYXNlI0NvdWNoYmFzZQ", "test",
                "org.talend.components:test:1.1.0-SNAPSHOT", "Test", "Input");
        final ComponentIndex index = new ComponentIndex(id, "Test Input", null, null, null, null, 1, Arrays.asList("Local", "File"),
                null, emptyMap());
        String displayName = TaCoKitUtil.getDisplayName(index);
        Assert.assertEquals("tTestInput", displayName);//$NON-NLS-1$
    }

    @Test
    public void testisTaCoKitComponentMadeByTalendNull() throws Exception {
        Assert.assertFalse(TaCoKitUtil.isTaCoKitComponentMadeByTalend(null));
    }

    @Test
    public void testisTaCoKitComponentMadeByTalendEmpty() throws Exception {
        final ComponentId id = new ComponentId("Y291Y2hiYXNlI0NvdWNoYmFzZSNJbnB1dA", "Y291Y2hiYXNlI0NvdWNoYmFzZQ", "test", "",
                "Test", "Input");
        final ComponentIndex index = new ComponentIndex(id, "Test Input", null, null, null, null, 1, Arrays.asList("Local", "File"),
                null, emptyMap());
        Assert.assertFalse(TaCoKitUtil.isTaCoKitComponentMadeByTalend(index));
    }

    @Test
    public void testisTaCoKitComponentMadeByTalendFalse() throws Exception {
        final ComponentId id = new ComponentId("Y291Y2hiYXNlI0NvdWNoYmFzZSNJbnB1dA", "Y291Y2hiYXNlI0NvdWNoYmFzZQ", "test",
                "org.test.components:test:1.1.0-SNAPSHOT", "Test", "Input");
        final ComponentIndex index = new ComponentIndex(id, "Test Input", null, null, null, null, 1, Arrays.asList("Local", "File"),
                null, emptyMap());
        Assert.assertFalse(TaCoKitUtil.isTaCoKitComponentMadeByTalend(index));
    }

    @Test
    public void testisTaCoKitComponentMadeByTalendTrue() throws Exception {
        final ComponentId id = new ComponentId("Y291Y2hiYXNlI0NvdWNoYmFzZSNJbnB1dA", "Y291Y2hiYXNlI0NvdWNoYmFzZQ", "test",
                "org.talend.components:test:1.1.0-SNAPSHOT", "Test", "Input");
        final ComponentIndex index = new ComponentIndex(id, "Test Input", null, null, null, null, 1, Arrays.asList("Local", "File"),
                null, emptyMap());
        Assert.assertTrue(TaCoKitUtil.isTaCoKitComponentMadeByTalend(index));
    }

    @Test
    public void testIsUseExistConnection() {
        BigDataNode node = new BigDataNode(new DummyComponent("dummyComponent"), "dummyComponent");
        node.setActivate(true);
        IProcess process = new Process(PropertiesFactory.eINSTANCE.createProperty());
        node.setProcess(process);

        final ElementParameter parameter = new ElementParameter(node);
        parameter.setName(TaCoKitConst.PARAMETER_USE_EXISTING_CONNECTION);
        parameter.setValue(false);
        parameter.setDisplayName(Messages.getString("ElementParameterCreator.userExistConnectionLabel"));
        parameter.setFieldType(EParameterFieldType.CHECK);
        parameter.setCategory(EComponentCategory.BASIC);
        parameter.setNumRow(1);
        parameter.setReadOnly(false);
        parameter.setRequired(false);
        parameter.setShow(true);
        parameter.setDefaultValue(false);
        node.addElementParameter(parameter);

        String connectionName = "tNetSuiteConnection_1";
        final ElementParameter connectionParameter = new ElementParameter(node);
        connectionParameter.setName(TaCoKitConst.PARAMETER_CONNECTION);
        connectionParameter.setDisplayName(Messages.getString("ElementParameterCreator.connectionLabel"));
        connectionParameter.setFieldType(EParameterFieldType.COMPONENT_LIST);
        connectionParameter.setCategory(EComponentCategory.BASIC);
        connectionParameter.setReadOnly(false);
        connectionParameter.setRequired(true);
        connectionParameter.setNumRow(1);
        connectionParameter.setShow(true);
        connectionParameter.setValue(connectionName);
        connectionParameter.setDynamicSettings(true);
        connectionParameter.setShowIf("USE_EXISTING_CONNECTION == 'true'");
        node.addElementParameter(connectionParameter);

        assertFalse(TaCoKitUtil.isUseExistConnection(node));

        parameter.setValue(true);
        assertTrue(TaCoKitUtil.isUseExistConnection(node));
        assertEquals(connectionName, TaCoKitUtil.getUseExistConnectionName(node));
    }

    @Test
    public void testGetDatastorePath() {
        SimplePropertyDefinition p = new SimplePropertyDefinition();
        p.setName("dataset");
        p.setPath("configuration.datestore.dataset");

        List<SimplePropertyDefinition> propertyList = new ArrayList<SimplePropertyDefinition>();
        propertyList.add(p);

        assertNull(TaCoKitUtil.getDatastorePath(propertyList));

        p = new SimplePropertyDefinition();
        p.setName("connection");
        p.setPath("configuration.connection");
        propertyList.add(p);
        assertEquals("configuration.connection", TaCoKitUtil.getDatastorePath(propertyList));

        p = new SimplePropertyDefinition();
        p.setName("datastore");
        p.setPath("configuration.datastore");
        propertyList.add(p);
        assertEquals("configuration.datastore", TaCoKitUtil.getDatastorePath(propertyList));
    }

    @Test
    public void testGetConfigurationPath() {
        SimplePropertyDefinition p = new SimplePropertyDefinition();
        p.setName("configuration");
        p.setPath("configuration");

        List<SimplePropertyDefinition> propertyList = new ArrayList<SimplePropertyDefinition>();
        propertyList.add(p);
        assertEquals("configuration", TaCoKitUtil.getConfigurationPath(propertyList));
    }

    @Test
    public void testSetupTacokitSuggestionValueConfiguration() {
        Property property = PropertiesFactory.eINSTANCE.createProperty();
        property.setId(ProxyRepositoryFactory.getInstance().getNextId());
        Process process = new Process(property);
        IComponent component = ComponentsFactoryProvider.getInstance().get("tLogRow", ComponentCategory.CATEGORY_4_DI.getName());
        Node fakeNode = new Node(component, process);

        ElementParameter parameter = new ElementParameter(fakeNode);
        parameter.setTaggedValue("org.talend.sdk.component.source", "tacokit");
        parameter.setFieldType(EParameterFieldType.TABLE);
        List list = new ArrayList();
        Map<String, Object> row = new HashMap<String, Object>();
        ElementParameterValueModel model = new ElementParameterValueModel();
        model.setLabel("name (ga:name)");
        model.setValue("ga:name");
        row.put("configuration.dataSet.recordType", "Account");
        row.put("configuration.searchCondition[0].field", model);
        row.put("configuration.searchCondition[0].operator", "List.anyOf");
        row.put("configuration.searchCondition[0].searchValue", "test");
        row.put("configuration.searchCondition[0].additionalSearchValue", "");
        list.add(row);
        parameter.setValue(list);
        ValueSelectionParameter fieldParam = new ValueSelectionParameter(fakeNode, new SuggestionsAction("test", "test"));
        fieldParam.setName("configuration.searchCondition[0].field");
        fieldParam.setFieldType(EParameterFieldType.TACOKIT_VALUE_SELECTION);
        ValueSelectionParameter operatorParam = new ValueSelectionParameter(fakeNode, new SuggestionsAction("test", "test"));
        operatorParam.setName("configuration.searchCondition[0].operator");
        operatorParam.setFieldType(EParameterFieldType.TACOKIT_VALUE_SELECTION);
        TextElementParameter searchValueParam = new TextElementParameter(fakeNode);
        searchValueParam.setName("configuration.searchCondition[0].searchValue");
        TextElementParameter additionParam = new TextElementParameter(fakeNode);
        additionParam.setName("configuration.searchCondition[0].additionalSearchValue");
        parameter.setListItemsValue(new Object[] { fieldParam, operatorParam, searchValueParam, additionParam });

        DataProcess dataprocess = new DataProcess(process);
        dataprocess.setupTacokitSuggestionValueConfiguration(parameter);
        List resultList = (List) parameter.getValue();
        Map resultMap = (Map) resultList.get(0);
        assertEquals(resultMap.get("configuration.searchCondition[0].field"), "ga:name");
        assertEquals(resultMap.get("configuration.searchCondition[0].operator"), "List.anyOf");
    }

    @Test
    public void testConvertParamValue() {
        final List<Map<String, Object>> expectedValue = new ArrayList<Map<String, Object>>();
        final Map<String, Object> row1 = new HashMap<>();
        row1.put("configuration.dataSet.dataStore.jdbcDriver[].path", "mvn:mysql/mysql-connector-java/8.0.18/jar");
        row1.put("configuration.dataSet.dataStore.jdbcDriver[].name", "mysql_jdbcDriver1");
        expectedValue.add(row1);
        final Map<String, Object> row2 = new HashMap<>();
        row2.put("configuration.dataSet.dataStore.jdbcDriver[].path", "mvn:mysql/mysql-connector-java/8.0.12/jar");
        row2.put("configuration.dataSet.dataStore.jdbcDriver[].name", "mysql_jdbcDriver2");
        expectedValue.add(row2);

        final TableElementParameter table = new TableElementParameter(null, Collections.emptyList());
        table.setName("configuration.jdbcDriver");
        table.setFieldType(EParameterFieldType.TABLE);
        final TaCoKitElementParameter column1 = new TaCoKitElementParameter(null);
        column1.setFieldType(EParameterFieldType.TEXT);
        column1.setName("configuration.jdbcDriver[].path");
        final TaCoKitElementParameter column2 = new TaCoKitElementParameter(null);
        column2.setFieldType(EParameterFieldType.TEXT);
        column2.setName("configuration.jdbcDriver[].name");
        table.setListItemsValue(new Object[] { column1, column2 });

        final List<Object> tableValue = new ArrayList<>();
        final Map<String, Object> tableRow1 = new HashMap<>();
        tableRow1.put("path", "mvn:mysql/mysql-connector-java/8.0.18/jar");
        tableRow1.put("name", "mysql_jdbcDriver1");
        tableValue.add(tableRow1);
        final Map<String, Object> tableRow2 = new HashMap<>();
        tableRow2.put("path", "mvn:mysql/mysql-connector-java/8.0.12/jar");
        tableRow2.put("name", "mysql_jdbcDriver2");
        tableValue.add(tableRow2);

        table.setValueFromAction(tableValue);

        Object convertParamValue = TaCoKitUtil.convertParamValue(table, "configuration.jdbcDriver",
                "configuration.dataSet.dataStore.jdbcDriver");

        Assertions.assertEquals(expectedValue, convertParamValue);
    }
}
