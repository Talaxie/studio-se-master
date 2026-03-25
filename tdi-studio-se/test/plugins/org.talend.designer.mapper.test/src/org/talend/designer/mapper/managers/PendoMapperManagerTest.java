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
package org.talend.designer.mapper.managers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;
import org.talend.core.model.components.ComponentCategory;
import org.talend.core.model.components.IComponent;
import org.talend.core.model.metadata.MetadataColumn;
import org.talend.core.model.metadata.MetadataTable;
import org.talend.core.model.metadata.types.JavaTypesManager;
import org.talend.core.model.process.EConnectionType;
import org.talend.core.model.process.IProcess2;
import org.talend.core.model.properties.PropertiesFactory;
import org.talend.core.model.properties.Property;
import org.talend.core.pendo.properties.PendoTMapProperties;
import org.talend.core.ui.component.ComponentsFactoryProvider;
import org.talend.designer.abstractmap.ui.visualmap.link.IMapperLink;
import org.talend.designer.abstractmap.ui.visualmap.link.PointLinkDescriptor;
import org.talend.designer.core.ui.editor.connections.Connection;
import org.talend.designer.core.ui.editor.nodes.Node;
import org.talend.designer.core.ui.editor.process.Process;
import org.talend.designer.mapper.MapperComponent;
import org.talend.designer.mapper.external.connection.IOConnection;
import org.talend.designer.mapper.model.table.InputTable;
import org.talend.designer.mapper.model.table.OutputTable;
import org.talend.designer.mapper.model.table.VarsTable;
import org.talend.designer.mapper.model.tableentry.DataMapTableEntry;
import org.talend.designer.mapper.model.tableentry.InputColumnTableEntry;
import org.talend.designer.mapper.model.tableentry.OutputColumnTableEntry;
import org.talend.designer.mapper.model.tableentry.VarTableEntry;
import org.talend.designer.mapper.ui.visualmap.link.Link;
import org.talend.designer.mapper.ui.visualmap.zone.Zone;

/**
 * DOC jding  class global comment. Detailled comment
 */
public class PendoMapperManagerTest {

    @Test
    public void testCalculateProperties() {
        Property property = PropertiesFactory.eINSTANCE.createProperty();
        IProcess2 process = new Process(property);
        MapperComponent mapperComponent = new MapperComponent();
        mapperComponent.setProcess(process);
        MapperManager mapperManager = new MapperManager(mapperComponent);

        // input table
        List<InputTable> inputTableList = new ArrayList<InputTable>();
        IComponent sourceCom = ComponentsFactoryProvider.getInstance().get("tFixedFlowInput",
                ComponentCategory.CATEGORY_4_DI.getName());
        IComponent targetCom = ComponentsFactoryProvider.getInstance().get("tMap", ComponentCategory.CATEGORY_4_DI.getName());
        Node source = new Node(sourceCom, process);
        Node target = new Node(targetCom, process);
        Connection mainConn = new Connection(source, target, EConnectionType.FLOW_MAIN, "FLOW", "row1", "row1", false);
        source = new Node(sourceCom, process);
        Connection lookupConn = new Connection(source, target, EConnectionType.FLOW_REF, "FLOW", "row2", "row2", false);

        //main input table
        MetadataTable metadataTable = new MetadataTable();
        metadataTable.setTableName("row1");
        InputTable inputTable = new InputTable(mapperManager, new IOConnection(mainConn), "row1");
        MetadataColumn metadataColumn = new MetadataColumn();
        metadataColumn.setTalendType(JavaTypesManager.STRING.getId());
        metadataColumn.setLabel("testColumn");
        metadataTable.getListColumns().add(metadataColumn);
        InputColumnTableEntry testColEntry = new InputColumnTableEntry(inputTable, metadataColumn);
        inputTable.addColumnEntry(testColEntry);
        metadataColumn = new MetadataColumn();
        metadataColumn.setTalendType(JavaTypesManager.STRING.getId());
        metadataColumn.setLabel("testColumn1");
        metadataTable.getListColumns().add(metadataColumn);
        InputColumnTableEntry testCol1Entry = new InputColumnTableEntry(inputTable, metadataColumn);
        inputTable.addColumnEntry(testCol1Entry);
        metadataColumn = new MetadataColumn();
        metadataColumn.setTalendType(JavaTypesManager.INTEGER.getId());
        metadataColumn.setLabel("testColumn2");
        metadataTable.getListColumns().add(metadataColumn);
        InputColumnTableEntry testCol2Entry = new InputColumnTableEntry(inputTable, metadataColumn);
        inputTable.addColumnEntry(testCol2Entry);
        inputTableList.add(inputTable);
        
        //lookup input table
        metadataTable = new MetadataTable();
        metadataTable.setTableName("row2");
        InputTable refInputTable = new InputTable(mapperManager, new IOConnection(lookupConn), "row2");
        metadataColumn = new MetadataColumn();
        metadataColumn.setTalendType(JavaTypesManager.STRING.getId());
        metadataColumn.setLabel("testRefColumn");
        metadataTable.getListColumns().add(metadataColumn);
        InputColumnTableEntry testRefColEntry = new InputColumnTableEntry(refInputTable, metadataColumn, "row1.testColumn");
        refInputTable.addColumnEntry(testRefColEntry);
        metadataColumn = new MetadataColumn();
        metadataColumn.setTalendType(JavaTypesManager.STRING.getId());
        metadataColumn.setLabel("testRefColumn1");
        metadataTable.getListColumns().add(metadataColumn);
        InputColumnTableEntry testRefCol1Entry = new InputColumnTableEntry(refInputTable, metadataColumn);
        refInputTable.addColumnEntry(testRefCol1Entry);
        inputTableList.add(refInputTable);
        
        // var table
        List<VarsTable> varTableList = new ArrayList<VarsTable>();
        VarsTable varTable = new VarsTable(mapperManager, "Var");
        VarTableEntry varEntry = new VarTableEntry(varTable, "var1", "row1.testColumn+row1.testColumn1",
                JavaTypesManager.STRING.getId());
        varTable.addColumnEntry(varEntry);
        varTableList.add(varTable);

        //output table
        List<OutputTable> outputTableList = new ArrayList<OutputTable>();
        metadataTable = new MetadataTable();
        metadataTable.setTableName("out");
        OutputTable outputTable = new OutputTable(mapperManager, metadataTable, "out");
        metadataColumn = new MetadataColumn();
        metadataColumn.setTalendType(JavaTypesManager.STRING.getId());
        metadataColumn.setLabel("outColumn");
        metadataTable.getListColumns().add(metadataColumn);
        OutputColumnTableEntry outColEntry = new OutputColumnTableEntry(outputTable, metadataColumn, "Var.var1");
        outputTable.addColumnEntry(outColEntry);
        metadataColumn = new MetadataColumn();
        metadataColumn.setTalendType(JavaTypesManager.STRING.getId());
        metadataColumn.setLabel("outColumn1");
        metadataTable.getListColumns().add(metadataColumn);
        OutputColumnTableEntry outCol1Entry = new OutputColumnTableEntry(outputTable, metadataColumn,
                "row1.testColumn1+row2.testRefColumn1");
        outputTable.addColumnEntry(outCol1Entry);
        metadataColumn = new MetadataColumn();
        metadataColumn.setTalendType(JavaTypesManager.INTEGER.getId());
        metadataColumn.setLabel("outColumn2");
        metadataTable.getListColumns().add(metadataColumn);
        OutputColumnTableEntry outCol2Entry = new OutputColumnTableEntry(outputTable, metadataColumn, "row1.testColumn2");
        outputTable.addColumnEntry(outCol2Entry);
        outputTableList.add(outputTable);
        
        List<IMapperLink> linkList = new ArrayList<IMapperLink>();
        linkList.add(buildLink(testRefColEntry, testColEntry, Zone.INPUTS, Zone.INPUTS, mapperManager));
        linkList.add(buildLink(testColEntry, varEntry, Zone.INPUTS, Zone.VARS, mapperManager));
        linkList.add(buildLink(testCol1Entry, varEntry, Zone.INPUTS, Zone.VARS, mapperManager));
        linkList.add(buildLink(varEntry, outColEntry, Zone.VARS, Zone.OUTPUTS, mapperManager));
        linkList.add(buildLink(testCol1Entry, outCol1Entry, Zone.INPUTS, Zone.OUTPUTS, mapperManager));
        linkList.add(buildLink(testRefCol1Entry, outCol1Entry, Zone.INPUTS, Zone.OUTPUTS, mapperManager));
        linkList.add(buildLink(testCol2Entry, outCol2Entry, Zone.INPUTS, Zone.OUTPUTS, mapperManager));

        MapperManager mockMapperManager = Mockito.mock(MapperManager.class);
        PendoMapperManager pendoManager = new PendoMapperManager(mockMapperManager);
        Mockito.when(mockMapperManager.getInputTables()).thenReturn(inputTableList);
        Mockito.when(mockMapperManager.getOutputTables()).thenReturn(outputTableList);
        Mockito.when(mockMapperManager.getVarsTables()).thenReturn(varTableList);
        Mockito.when(mockMapperManager.getLinks()).thenReturn(linkList);
        PendoTMapProperties properties = (PendoTMapProperties) pendoManager.collectProperties();
        String outputFieldTypes = properties.getOutputFieldTypes();
        assertTrue(outputFieldTypes.contains("String") && outputFieldTypes.contains("Integer"));
        assertEquals(1, properties.getDestinationNumber());
        assertEquals(0, properties.getFilterCounts());
        assertEquals(0, properties.getInnerJoinCounts());
        assertEquals(5, properties.getInputColumns());
        assertEquals(3, properties.getInputOutputMappings());
        assertEquals(2, properties.getInputVarMappings());
        assertEquals(1, properties.getJoinMappingCounts());
        assertEquals(1, properties.getLeftJoinCounts());
        assertEquals(2, properties.getnToOneMappings());
        assertEquals(1, properties.getOneToNMappings());
        assertEquals(3, properties.getOutputColumns());
        assertEquals(1, properties.getOutputNumber());
        assertEquals(3, properties.getSimpleExpressions());
        assertEquals(2, properties.getSourceNumber());
        assertEquals(2, properties.getTransformExpressions());
        assertEquals(1, properties.getVarColumns());
        assertEquals(1, properties.getVarOutputMappings());

    }

    private DummyLink buildLink(DataMapTableEntry linkFromEntry, DataMapTableEntry linkToEntry, Zone linkFromZone,
            Zone linkToZone,
            MapperManager mapperManager) {
        PointLinkDescriptor linkFrom = new PointLinkDescriptor(linkFromEntry, linkFromZone);
        PointLinkDescriptor linkTo = new PointLinkDescriptor(linkToEntry, linkToZone);
        DummyLink link = new DummyLink(linkFrom, linkTo, mapperManager);
        return link;
    }

    class DummyLink extends Link {

        public DummyLink(PointLinkDescriptor pointDescriptor1, PointLinkDescriptor pointDescriptor2,
                MapperManager mapperManager) {
            super(pointDescriptor1, pointDescriptor2, mapperManager);
        }

        @Override
        public void calculate() {
            // do nothing
        }
    }

}
