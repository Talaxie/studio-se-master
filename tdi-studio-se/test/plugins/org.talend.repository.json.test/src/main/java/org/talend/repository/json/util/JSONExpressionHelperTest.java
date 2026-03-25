// ============================================================================
//
// Copyright (C) 2006-2022 Talaxie Inc. - www.deilink.fr
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talaxie SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.repository.json.util;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.talend.repository.model.json.JsonFactory;
import org.talend.repository.model.json.SchemaTarget;
import org.talend.repository.ui.wizards.metadata.connection.files.json.JsonTreeNode;

/**
 * DOC jding  class global comment. Detailled comment
 */
public class JSONExpressionHelperTest {

    @Test
    public void testAutoWrapFieldToExpression() throws Exception {
        JSONExpressionHelper helper = new JSONExpressionHelper();
        List<Object> treeViewerInputList = prepareTreeViewerInputList();
        List<SchemaTarget> fieldBeansList = new ArrayList<SchemaTarget>();
        SchemaTarget schemaTarget = createSchemaTarget("birthday");
        fieldBeansList.add(schemaTarget);
        schemaTarget = createSchemaTarget("first name");
        fieldBeansList.add(schemaTarget);
        schemaTarget = createSchemaTarget("other data.other data value");
        fieldBeansList.add(schemaTarget);
        helper.autoWrapFieldToExpression(treeViewerInputList, fieldBeansList);
        assertEquals("birthday", fieldBeansList.get(0).getRelativeXPathQuery());
        assertEquals("['first name']", fieldBeansList.get(1).getRelativeXPathQuery());
        assertEquals("['other data'].['other data value']", fieldBeansList.get(2).getRelativeXPathQuery());

        helper.autoWrapFieldToExpression(treeViewerInputList, fieldBeansList);
        assertEquals("birthday", fieldBeansList.get(0).getRelativeXPathQuery());
        assertEquals("['first name']", fieldBeansList.get(1).getRelativeXPathQuery());
        assertEquals("['other data'].['other data value']", fieldBeansList.get(2).getRelativeXPathQuery());

        fieldBeansList.clear();
        schemaTarget = createSchemaTarget("$.person.birthday");
        fieldBeansList.add(schemaTarget);
        schemaTarget = createSchemaTarget("$.person.first name");
        fieldBeansList.add(schemaTarget);
        schemaTarget = createSchemaTarget("$.person[?(@.attribute==1)].first name");
        fieldBeansList.add(schemaTarget);
        schemaTarget = createSchemaTarget("$.person[?(@.attribute==1)].other data[?(@.test==1)].other data value");
        fieldBeansList.add(schemaTarget);
        helper.autoWrapFieldToExpression(treeViewerInputList, fieldBeansList);
        assertEquals("$.person.birthday", fieldBeansList.get(0).getRelativeXPathQuery());
        assertEquals("$.person.['first name']", fieldBeansList.get(1).getRelativeXPathQuery());
        assertEquals("$.person[?(@.attribute==1)].['first name']", fieldBeansList.get(2).getRelativeXPathQuery());
        assertEquals("$.person[?(@.attribute==1)].['other data'][?(@.test==1)].['other data value']",
                fieldBeansList.get(3).getRelativeXPathQuery());

        helper.autoWrapFieldToExpression(treeViewerInputList, fieldBeansList);
        assertEquals("$.person.birthday", fieldBeansList.get(0).getRelativeXPathQuery());
        assertEquals("$.person.['first name']", fieldBeansList.get(1).getRelativeXPathQuery());
        assertEquals("$.person[?(@.attribute==1)].['first name']", fieldBeansList.get(2).getRelativeXPathQuery());
        assertEquals("$.person[?(@.attribute==1)].['other data'][?(@.test==1)].['other data value']",
                fieldBeansList.get(3).getRelativeXPathQuery());
    }

    private SchemaTarget createSchemaTarget(String query) {
        SchemaTarget schemaTarget = JsonFactory.eINSTANCE.createSchemaTarget();
        schemaTarget.setRelativeXPathQuery(query);
        return schemaTarget;
    }

    private List<Object> prepareTreeViewerInputList() {
        List<Object> inputList = new ArrayList<Object>();
        JsonTreeNode rootNode = createJsonTreeNode("$", "$");
        JsonTreeNode firLevelNode = createJsonTreeNode("person", "$.person");
        rootNode.addChild(firLevelNode);
        JsonTreeNode secLevelNode = createJsonTreeNode("birthday", "$.person.birthday");
        JsonTreeNode secLevelNode1 = createJsonTreeNode("first name", "$.person.first name");
        JsonTreeNode secLevelNode2 = createJsonTreeNode("other data", "$.person.other data");
        firLevelNode.addChild(new JsonTreeNode[] { secLevelNode, secLevelNode1, secLevelNode2 });
        JsonTreeNode thirLevelNode = createJsonTreeNode("other data value", "$.person.other data.other data value");
        secLevelNode2.addChild(thirLevelNode);
        inputList.add(rootNode);
        return inputList;
    }

    public JsonTreeNode createJsonTreeNode(String label, String jsonPath) {
        JsonTreeNode node = new JsonTreeNode();
        node.setLabel(label);
        node.setJsonPath(jsonPath);
        return node;
    }

}
