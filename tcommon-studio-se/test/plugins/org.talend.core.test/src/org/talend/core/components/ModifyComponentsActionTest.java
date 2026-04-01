// ============================================================================
//
// Copyright (C) 2006-2022 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.core.components;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.eclipse.core.runtime.Path;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.talend.core.model.components.ModifyComponentsAction;
import org.talend.core.model.properties.ProcessItem;
import org.talend.core.model.properties.PropertiesFactory;
import org.talend.core.model.properties.Property;
import org.talend.core.model.relationship.RelationshipItemBuilder;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.designer.core.model.utils.emf.talendfile.ConnectionType;
import org.talend.designer.core.model.utils.emf.talendfile.ElementParameterType;
import org.talend.designer.core.model.utils.emf.talendfile.MetadataType;
import org.talend.designer.core.model.utils.emf.talendfile.NodeType;
import org.talend.designer.core.model.utils.emf.talendfile.ProcessType;
import org.talend.designer.core.model.utils.emf.talendfile.TalendFileFactory;

/**
 * @author bhe created on Jul 6, 2022
 *
 */
public class ModifyComponentsActionTest {

    private static final String OLDNAME = "NetSuite2019Input";

    private static final String NEWNAME = "NetSuiteNewInput";

    @Test
    public void testSearchAndRenameComponent() throws Exception {

        ProcessItem item = PropertiesFactory.eINSTANCE.createProcessItem();
        Property property = PropertiesFactory.eINSTANCE.createProperty();
        property.setId("_yVUx8NF4EeG5wOtnVeZxqf");
        property.setVersion("0.1");
        property.setLabel("testSearchAndRenameTckComponent");
        item.setProperty(property);
        ProcessType process = TalendFileFactory.eINSTANCE.createProcessType();
        item.setProcess(process);

        NodeType node = TalendFileFactory.eINSTANCE.createNodeType();
        node.setComponentName(OLDNAME);
        ElementParameterType param = TalendFileFactory.eINSTANCE.createElementParameterType();
        param.setName("UNIQUE_NAME");
        param.setValue("t" + OLDNAME + "_1");

        MetadataType meta = TalendFileFactory.eINSTANCE.createMetadataType();
        meta.setName("t" + OLDNAME + "_1");
        meta.setConnector("FLOW");

        node.getMetadata().add(meta);
        node.getElementParameter().add(param);
        process.getNode().add(node);

        NodeType node2 = TalendFileFactory.eINSTANCE.createNodeType();
        node2.setComponentName("NetSuite2019Output");
        ElementParameterType param2 = TalendFileFactory.eINSTANCE.createElementParameterType();
        param.setName("UNIQUE_NAME");
        param.setValue("tNetSuite2019Output_1");
        node2.getElementParameter().add(param2);
        process.getNode().add(node2);

        ConnectionType conn = TalendFileFactory.eINSTANCE.createConnectionType();
        conn.setMetaname("t" + OLDNAME + "_1");
        conn.setConnectorName("FLOW");
        conn.setSource("t" + OLDNAME + "_1");
        conn.setTarget("tNetSuite2019Output_1");
        process.getConnection().add(conn);

        ProxyRepositoryFactory.getInstance().create(item, new Path(""));
        
        // rename
        boolean modified = ModifyComponentsAction.searchAndRenameComponent(item, process, OLDNAME, NEWNAME);

        assertTrue(modified);

        boolean findNewNode = false;
        for (Object o : process.getNode()) {
            NodeType tempNode = (NodeType) o;
            if (tempNode.getComponentName().equals(NEWNAME)) {
                findNewNode = true;
                for (Object obj : tempNode.getMetadata()) {
                    MetadataType tempMeta = (MetadataType) obj;
                    assertEquals(tempMeta.getName(), "t" + NEWNAME + "_1");
                }
            }
        }
        
        assertTrue(findNewNode);
        
        ConnectionType newconn = (ConnectionType) process.getConnection().get(0);
        assertEquals(newconn.getMetaname(), "t" + NEWNAME + "_1");
        assertEquals(newconn.getSource(), "t" + NEWNAME + "_1");

    }

}
