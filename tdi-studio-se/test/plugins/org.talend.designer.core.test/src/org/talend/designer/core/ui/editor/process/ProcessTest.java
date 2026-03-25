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
package org.talend.designer.core.ui.editor.process;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.talend.core.model.components.ComponentCategory;
import org.talend.core.model.components.IComponent;
import org.talend.core.model.process.IElement;
import org.talend.core.model.process.IElementParameter;
import org.talend.core.model.process.IElementParameterDefaultValue;
import org.talend.core.model.process.INode;
import org.talend.core.model.properties.PropertiesFactory;
import org.talend.core.model.properties.Property;
import org.talend.core.model.repository.FakePropertyImpl;
import org.talend.core.ui.component.ComponentsFactoryProvider;
import org.talend.designer.core.model.FakeElement;
import org.talend.designer.core.model.components.ElementParameter;
import org.talend.designer.core.model.components.ElementParameterDefaultValue;
import org.talend.designer.core.ui.editor.nodecontainer.NodeContainer;
import org.talend.designer.core.ui.editor.nodes.Node;


/**
 * created by nrousseau on Aug 29, 2016
 * Detailled comment
 *
 */
public class ProcessTest {

    /**
     * Test method for {@link org.talend.designer.core.ui.editor.process.Process#checkProcess()}.
     */
    @Test
    public void testCheckProcess() {

        Process p = new Process(new FakePropertyImpl()) {

            /* (non-Javadoc)
             * @see org.talend.designer.core.ui.editor.process.Process#checkProblems()
             */
            @Override
            protected void checkProblems() {
                assertThat(isDuplicate(), is(false));
                assertThat(isActivate(), is(true));
            }

        };
        p.setActivate(false);
        p.setDuplicate(false);
        p.checkProcess();
        p.setActivate(false);
        p.setDuplicate(true);
        p.checkProcess();
        p.setActivate(true);
        p.setDuplicate(false);
        p.checkProcess();
        p.setActivate(true);
        p.setDuplicate(true);
        p.checkProcess();
    }

    /**
     * Test method for {@link org.talend.designer.core.ui.editor.process.Process#checkProcess()}.
     */
    @Test
    public void testNoNeedSetValue() {
        Process p = new Process(new FakePropertyImpl());

        List<IElementParameterDefaultValue> defaultValues = null;

        IElement elem = new FakeElement("test");
        IElementParameter param = new ElementParameter(elem);

        IElementParameterDefaultValue defaultValue = new ElementParameterDefaultValue();
        defaultValues = new ArrayList<IElementParameterDefaultValue>();
        defaultValues.add(defaultValue);
        param.setDefaultValues(defaultValues);
        assertFalse(p.noNeedSetValue(param, "aa"));

        assertTrue(p.noNeedSetValue(param, null));

        defaultValue = new ElementParameterDefaultValue();
        defaultValue.setDefaultValue("aa");
        defaultValues = new ArrayList<IElementParameterDefaultValue>();
        defaultValues.add(defaultValue);
        param.setDefaultValues(defaultValues);
        assertTrue(p.noNeedSetValue(param, "aa"));

        defaultValue = new ElementParameterDefaultValue();
        defaultValues = new ArrayList<IElementParameterDefaultValue>();
        defaultValue.setDefaultValue("bb");
        defaultValues.add(defaultValue);
        param.setDefaultValues(defaultValues);
        assertFalse(p.noNeedSetValue(param, "aa"));
    }
    
    @Test
    public void testGetNodesOfType() {
        //version supported by tAmazonMysqlConnection: mysql5
        IComponent mysqlConnComp = ComponentsFactoryProvider.getInstance().get("tMysqlConnection",
                ComponentCategory.CATEGORY_4_DI.getName());
        IComponent amazonConnComp = ComponentsFactoryProvider.getInstance().get("tAmazonMysqlConnection",
                ComponentCategory.CATEGORY_4_DI.getName());
        IComponent mysqlInputComp = ComponentsFactoryProvider.getInstance().get("tMysqlInput",
                ComponentCategory.CATEGORY_4_DI.getName());
        
        //vesion supported by tAmazonOracleConnection: 18, 12, 11
        IComponent oracleConnComp = ComponentsFactoryProvider.getInstance().get("tOracleConnection",
                ComponentCategory.CATEGORY_4_DI.getName());
        IComponent oracle9ConnComp = ComponentsFactoryProvider.getInstance().get("tOracleConnection",
                ComponentCategory.CATEGORY_4_DI.getName());
        IComponent oracle12ConnComp = ComponentsFactoryProvider.getInstance().get("tOracleConnection",
                ComponentCategory.CATEGORY_4_DI.getName());
        IComponent amazonOracleConnComp = ComponentsFactoryProvider.getInstance().get("tAmazonOracleConnection",
                ComponentCategory.CATEGORY_4_DI.getName());
        IComponent oracleInputComp = ComponentsFactoryProvider.getInstance().get("tOracleInput",
                ComponentCategory.CATEGORY_4_DI.getName());
        
        Property property1 = PropertiesFactory.eINSTANCE.createProperty();
        property1.setId("property1"); 
        property1.setVersion("0.1"); 
        property1.setLabel("test1");
        Process process = new Process(property1);
        
        Node mysqlConnNode = new Node(mysqlConnComp,process);
        Node amazonMysqlConnNode = new Node(amazonConnComp,process);
        Node mysqlInputNode = new Node(mysqlInputComp,process);
        process.addNodeContainer(new NodeContainer(amazonMysqlConnNode));
        process.addNodeContainer(new NodeContainer(mysqlConnNode));
        process.addNodeContainer(new NodeContainer(mysqlInputNode));
        
        Node oracleConnNode = new Node(oracleConnComp,process);
        Node oracle9ConnNode = new Node(oracle9ConnComp,process);
        Node oracle12ConnNode = new Node(oracle12ConnComp,process);
        Node amazonOracleConnNode = new Node(amazonOracleConnComp,process);
        Node oracleInputNode = new Node(oracleInputComp,process);
        process.addNodeContainer(new NodeContainer(oracleConnNode));
        process.addNodeContainer(new NodeContainer(oracle9ConnNode));
        process.addNodeContainer(new NodeContainer(oracle12ConnNode));
        process.addNodeContainer(new NodeContainer(amazonOracleConnNode));
        process.addNodeContainer(new NodeContainer(oracleInputNode));
        
        oracle9ConnNode.getElementParameter("DB_VERSION").setValue("ORACLE_9");
        oracle12ConnNode.getElementParameter("DB_VERSION").setValue("ORACLE_12");
        
        List<INode> s = process.getNodesOfType("tMysqlConnection");
        assertEquals(s.size(),1); 
        s = process.getNodesOfType("tAmazonMysqlConnection");
        assertEquals(s.size(),1); //amazon one
        
        s = process.getNodesOfType("tOracleConnection");
        assertEquals(s.size(),3); 
        s = process.getNodesOfType("tAmazonOracleConnection");
        assertEquals(s.size(),1); //amazon one
        
    }

    @Test
    public void testIsParamDistribution() {
        Process p = new Process(new FakePropertyImpl());
        IElement elem = new FakeElement("test");
        IElementParameter param = new ElementParameter(elem);
        param.setName("DISTRIBUTION");
        param.setValue("Cloudera");
        assertTrue(p.isParamDistribution(param));
        param = new ElementParameter(elem);
        param.setName("DB_VERSION");
        param.setValue("Mysql8");
        assertFalse(p.isParamDistribution(param));
    }

}
