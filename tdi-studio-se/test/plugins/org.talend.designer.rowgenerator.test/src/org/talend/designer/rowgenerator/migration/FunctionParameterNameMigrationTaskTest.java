// ============================================================================
//
// Copyright (C) 2006-2023 Talaxie Inc. - www.deilink.fr
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talaxie SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.designer.rowgenerator.migration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.talend.core.model.properties.ItemState;
import org.talend.core.model.properties.ProcessItem;
import org.talend.core.model.properties.PropertiesFactory;
import org.talend.core.model.properties.Property;
import org.talend.core.model.repository.IRepositoryViewObject;
import org.talend.designer.core.model.utils.emf.talendfile.ColumnType;
import org.talend.designer.core.model.utils.emf.talendfile.MetadataType;
import org.talend.designer.core.model.utils.emf.talendfile.NodeType;
import org.talend.designer.core.model.utils.emf.talendfile.ProcessType;
import org.talend.designer.core.model.utils.emf.talendfile.TalendFileFactory;
import org.talend.designer.rowgenerator.data.Function;
import org.talend.designer.rowgenerator.data.FunctionManager;
import org.talend.designer.rowgenerator.ui.editor.MetadataColumnExt;
import org.talend.repository.ProjectManager;
import org.talend.repository.model.IProxyRepositoryFactory;
import org.talend.repository.model.IProxyRepositoryService;
import org.talend.utils.json.JSONArray;
import org.talend.utils.json.JSONObject;

/**
 * DOC jding  class global comment. Detailled comment
 */
public class FunctionParameterNameMigrationTaskTest {

    private ProcessItem testItem;

    @Before
    public void setUp() throws Exception {
        IProxyRepositoryFactory repositoryFactory = IProxyRepositoryService.get().getProxyRepositoryFactory();
        ProcessItem processItem = PropertiesFactory.eINSTANCE.createProcessItem();
        Property property = PropertiesFactory.eINSTANCE.createProperty();
        property.setId(repositoryFactory.getNextId());
        property.setLabel("testMigrateFunctionParaName");
        property.setVersion("0.1");
        processItem.setProperty(property);
        ItemState itemState = PropertiesFactory.eINSTANCE.createItemState();
        itemState.setDeleted(false);
        itemState.setPath("");
        ProcessType processType = TalendFileFactory.eINSTANCE.createProcessType();
        NodeType nodeType = TalendFileFactory.eINSTANCE.createNodeType();
        nodeType.setComponentName("tRowGenerator");
        MetadataType metadataType = TalendFileFactory.eINSTANCE.createMetadataType();
        nodeType.getMetadata().add(metadataType);
        metadataType.getColumn().add(createColumnType("name", "id_String", createFunctionInfo("customize parameter", "name")));
        metadataType.getColumn().add(createColumnType("type", "id_String", createFunctionInfo("Paramètre personnalisé", "type")));
        metadataType.getColumn().add(createColumnType("id", "id_String", createFunctionInfo("personnaliser le paramètre", "id")));
        metadataType.getColumn().add(createColumnType("dep", "id_String", createFunctionInfo("Parameter anpassen", "dep")));
        metadataType.getColumn().add(createColumnType("code", "id_String", createFunctionInfo("personalizza parametri", "code")));
        metadataType.getColumn().add(createColumnType("category", "id_String", createFunctionInfo("自定义参数", "category")));
        metadataType.getColumn().add(createColumnType("mail", "id_String", createFunctionInfo("カスタマイズパラメーター", "mail")));
        metadataType.getColumn().add(createColumnType("address", "id_String", createFunctionInfo("パラメーターをカスタマイズ", "address")));
        metadataType.getColumn().add(createColumnType("memo", "id_String", createFunctionInfo("parameter", "memo")));
        ColumnType columnType = TalendFileFactory.eINSTANCE.createColumnType();
        columnType.setName("extra");
        columnType.setType("id_String");
        metadataType.getColumn().add(columnType);

        processType.getNode().add(nodeType);
        processItem.setProcess(processType);
        repositoryFactory.create(processItem, new Path(""));
        testItem = processItem;
    }

    @Test
    public void testMigrateFunctionParameterName() throws Exception {
        FunctionParameterNameMigrationTask migrationTask = new FunctionParameterNameMigrationTask();
        migrationTask.setProject(ProjectManager.getInstance().getCurrentProject());
        migrationTask.execute(testItem);

        NodeType nodeType = (NodeType) testItem.getProcess().getNode().get(0);
        MetadataType metadataType = (MetadataType) nodeType.getMetadata().get(0);
        EList columnList = metadataType.getColumn();
        for (int i = 0; i < 8; i++) {
            ColumnType columnType = (ColumnType) columnList.get(i);
            String paramName = getFunctionInfoParamName(columnType);
            assertEquals(FunctionManager.EFunctionParameter.CUSTOMIZE_PARAM.getParamName(), paramName);
        }
        ColumnType memoColumn = (ColumnType) columnList.get(8);
        assertEquals("parameter", getFunctionInfoParamName(memoColumn));

        ColumnType extraColumn = (ColumnType) columnList.get(9);
        assertNull(getFunctionInfoParamName(extraColumn));

    }

    private String getFunctionInfoParamName(ColumnType columnType) throws Exception {
        String functionInfo = (String) columnType.getAdditionalField().get(MetadataColumnExt.FUNCTION_INFO);
        if (functionInfo != null) {
            JSONObject functionObj = new JSONObject(functionInfo);
            JSONArray parametersArray = functionObj.getJSONArray(Function.PARAMETERS);
            for (int i = 0; i < parametersArray.length(); i++) {
                JSONObject parameterObj = parametersArray.getJSONObject(i);
                String paramName = parameterObj.getString(Function.PARAMETER_NAME);
                return paramName;
            }
        }
        return null;
    }


    @After
    public void tearDown() throws Exception {
        IProxyRepositoryFactory repositoryFactory = IProxyRepositoryService.get().getProxyRepositoryFactory();
        IRepositoryViewObject object = repositoryFactory.getSpecificVersion(testItem.getProperty().getId(),
                testItem.getProperty().getVersion(), true);
        repositoryFactory.deleteObjectPhysical(object);
        testItem = null;
    }

    private ColumnType createColumnType(String name, String type, String functionInfo) {
        ColumnType columnType = TalendFileFactory.eINSTANCE.createColumnType();
        columnType.setName(name);
        columnType.setType(type);
        columnType.getAdditionalField().put(MetadataColumnExt.FUNCTION_INFO, functionInfo);
        return columnType;
    }

    private String createFunctionInfo(String paramName, String paramValue) throws Exception {
        JSONObject functionObj = new JSONObject();
        functionObj.put(Function.NAME, "...");
        functionObj.put(Function.PARAMETER_CLASS_NAME, "");
        JSONArray parametersArr = new JSONArray();
        JSONObject parameterObj = new JSONObject();
        parameterObj.put(Function.PARAMETER_NAME, paramName);
        parameterObj.put(Function.PARAMETER_VALUE, paramValue);
        parametersArr.put(parameterObj);
        functionObj.put(Function.PARAMETERS, parametersArr);
        return functionObj.toString();
    }

}
