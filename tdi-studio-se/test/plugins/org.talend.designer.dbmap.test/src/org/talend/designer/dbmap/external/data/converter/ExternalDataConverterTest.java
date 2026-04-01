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
package org.talend.designer.dbmap.external.data.converter;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.talend.core.model.components.ComponentCategory;
import org.talend.core.model.components.IComponent;
import org.talend.core.model.components.IODataComponent;
import org.talend.core.model.metadata.IMetadataColumn;
import org.talend.core.model.metadata.IMetadataTable;
import org.talend.core.model.metadata.MetadataColumn;
import org.talend.core.model.metadata.MetadataTable;
import org.talend.core.model.process.EConnectionType;
import org.talend.core.model.process.INodeConnector;
import org.talend.core.ui.component.ComponentsFactoryProvider;
import org.talend.designer.core.model.components.ElementParameter;
import org.talend.designer.core.model.components.NodeConnector;
import org.talend.designer.core.ui.editor.connections.Connection;
import org.talend.designer.core.ui.editor.nodes.Node;
import org.talend.designer.core.ui.editor.process.Process;
import org.talend.designer.dbmap.DbMapComponent;
import org.talend.designer.dbmap.external.connection.IOConnection;
import org.talend.designer.dbmap.external.converter.ExternalDataConverter;
import org.talend.designer.dbmap.external.data.ExternalDbMapData;
import org.talend.designer.dbmap.external.data.ExternalDbMapEntry;
import org.talend.designer.dbmap.external.data.ExternalDbMapTable;
import org.talend.designer.dbmap.managers.MapperManager;
import org.talend.designer.dbmap.managers.MapperManagerTest;
import org.talend.designer.dbmap.model.table.InputTable;

public class ExternalDataConverterTest {

    private static final String SOURCE_COMPONENT_NAME = "tELTOracleInput";

    private static final String TARGET_COMPONENT_NAME = "tELTOracleMap";

    @Test
    public void testPrepareInputTables() {
        ExternalDbMapData data = new ExternalDbMapData();
        ExternalDbMapTable externalDbMapTable = new ExternalDbMapTable();
        externalDbMapTable.setName("table");

        List<ExternalDbMapEntry> entrys = new ArrayList<ExternalDbMapEntry>();
        externalDbMapTable.setMetadataTableEntries(entrys);
        ExternalDbMapEntry c1Entry = new ExternalDbMapEntry();
        c1Entry.setName("c1");
        externalDbMapTable.getMetadataTableEntries().add(c1Entry);

        ExternalDbMapEntry c3Entry = new ExternalDbMapEntry();
        c3Entry.setName("c3");
        externalDbMapTable.getMetadataTableEntries().add(c3Entry);
        data.getInputTables().add(externalDbMapTable);

        IComponent sourceComponent = ComponentsFactoryProvider.getInstance().get(SOURCE_COMPONENT_NAME,
                ComponentCategory.CATEGORY_4_DI.getName());
        IComponent targetComponent = ComponentsFactoryProvider.getInstance().get(TARGET_COMPONENT_NAME,
                ComponentCategory.CATEGORY_4_DI.getName());

        Process process = new Process(MapperManagerTest.createProperty());
        Node sourceNode = new Node(sourceComponent, process);
        INodeConnector connector = new NodeConnector(sourceNode);
        connector.setName("connector");
        connector.setDefaultConnectionType(EConnectionType.FLOW_MAIN);
        ArrayList<INodeConnector> connectors = new ArrayList<INodeConnector>();
        connectors.add(connector);
        sourceNode.setListConnector(connectors);

        Node targetNode = new Node(targetComponent, process);
        DbMapComponent dbMapComponent = new DbMapComponent();

        List<ElementParameter> elementParameters = new ArrayList<ElementParameter>();
        ElementParameter ele = new ElementParameter(targetNode);
        ele.setName("COMPONENT_NAME");
        ele.setValue(TARGET_COMPONENT_NAME);
        elementParameters.add(ele);
        dbMapComponent.setElementParameters(elementParameters);

        targetNode.setExternalNode(dbMapComponent);
        Connection connection = new Connection(sourceNode, targetNode, EConnectionType.FLOW_MAIN, "connector", "meta", "table",
                true);

        IODataComponent component = new IODataComponent(connection);
        IMetadataTable metadataTable = new MetadataTable();
        metadataTable.setTableName("table");

        IMetadataColumn c1 = new MetadataColumn();
        c1.setLabel("c1");
        metadataTable.getListColumns().add(c1);

        IMetadataColumn c2 = new MetadataColumn();
        c2.setLabel("c2");
        metadataTable.getListColumns().add(c2);
        component.setTable(metadataTable);

        IOConnection ioConnection = new IOConnection(component);
        List<IOConnection> inputConnections = new ArrayList<IOConnection>();
        inputConnections.add(ioConnection);

        MapperManager mapperManager = new MapperManager(dbMapComponent);
        ExternalDataConverter converter = new ExternalDataConverter(mapperManager);

        ArrayList<InputTable> inputTables = converter.prepareInputTables(inputConnections, data);

        assertEquals(inputTables.size(), 1);
        assertEquals(inputTables.get(0).getColumnEntries().size(), 3);
        assertEquals(metadataTable.getListColumns().size(), 2);
    }
}
