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
package org.talend.designer.core.ui.editor.cmd;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;
import org.talend.commons.utils.VersionUtils;
import org.talend.core.CorePlugin;
import org.talend.core.context.Context;
import org.talend.core.context.RepositoryContext;
import org.talend.core.model.components.ComponentCategory;
import org.talend.core.model.components.IComponent;
import org.talend.core.model.metadata.IMetadataColumn;
import org.talend.core.model.metadata.IMetadataTable;
import org.talend.core.model.metadata.MetadataTable;
import org.talend.core.model.process.EConnectionType;
import org.talend.core.model.process.EParameterFieldType;
import org.talend.core.model.process.IConnection;
import org.talend.core.model.process.IElementParameter;
import org.talend.core.model.properties.PropertiesFactory;
import org.talend.core.model.properties.Property;
import org.talend.core.ui.component.ComponentsFactoryProvider;
import org.talend.designer.core.ui.editor.connections.Connection;
import org.talend.designer.core.ui.editor.nodes.Node;
import org.talend.designer.core.ui.editor.process.Process;

public class ExternalNodeChangeCommandTest {

    @Test
    public void testNeedChangeSchemaType() throws Exception {
        Process process = new Process(createProperty());

        IElementParameter param = null;


        String componentName = "tSalesforceOutput";
        IComponent salesforceOutputComponent = ComponentsFactoryProvider.getInstance().get(componentName,
                ComponentCategory.CATEGORY_4_DI.getName());
        Node salesforceOutputNode = new Node(salesforceOutputComponent, process);
        IMetadataTable metadataFromConnector = salesforceOutputNode.getMetadataFromConnector("REJECT");
        List<IMetadataColumn> mockMetadataColumns = mockMetadataColumns(
                new String[] { "errorCode", "errorFields", "errorMessage" });
        metadataFromConnector.setListColumns(mockMetadataColumns);

        for (IElementParameter param1 : salesforceOutputNode.getElementParameters()) {
            if ((EParameterFieldType.SCHEMA_TYPE.equals(param1.getFieldType())
                    || EParameterFieldType.SCHEMA_REFERENCE.equals(param1.getFieldType()))
                    && (param1.getContext().equals("REJECT"))) {
                param = param1;
                break;
            }
        }

        MetadataTable mockRepoMetadata = Mockito.mock(MetadataTable.class);
        param.setValue(mockRepoMetadata);

        componentName = "tLogRow";
        IComponent logRowComponent = ComponentsFactoryProvider.getInstance().get(componentName,
                ComponentCategory.CATEGORY_4_DI.getName());
        Node logRowNode = new Node(logRowComponent, process);

        // connectorName:REJECT
        IConnection connection = new Connection(salesforceOutputNode, logRowNode, EConnectionType.FLOW_MAIN, "REJECT", "reject",
                "row1", true);

        mockMetadataColumns = mockMetadataColumns(
                new String[] { "errorCode", "errorFields", "errorMessage" });
        Mockito.when(mockRepoMetadata.getListColumns()).thenReturn(mockMetadataColumns);

        ExternalNodeChangeCommand mockCmd = Mockito.mock(ExternalNodeChangeCommand.class);
        Mockito.when(mockCmd.needChangeSchemaType(connection, mockRepoMetadata)).thenCallRealMethod();
        Mockito.when(mockCmd.needChangeSchemaType(connection, mockRepoMetadata, IMetadataColumn.OPTIONS_NONE)).thenCallRealMethod();

        boolean needChange = mockCmd.needChangeSchemaType(connection, mockRepoMetadata);
        Mockito.verify(mockRepoMetadata, Mockito.times(1)).sameMetadataAs(Mockito.anyList(),
                Mockito.eq(IMetadataColumn.OPTIONS_IGNORE_USED), Mockito.eq(false));

        // lineStyle:EConnectionType.REJECT
        connection = new Connection(salesforceOutputNode, logRowNode, EConnectionType.REJECT, "REJECT", "reject", "row1", true);
        Mockito.when(mockCmd.needChangeSchemaType(connection, mockRepoMetadata)).thenCallRealMethod();
        Mockito.when(mockCmd.needChangeSchemaType(connection, mockRepoMetadata, IMetadataColumn.OPTIONS_NONE)).thenCallRealMethod();
        mockCmd.needChangeSchemaType(connection, mockRepoMetadata);
        Mockito.verify(mockRepoMetadata, Mockito.times(2)).sameMetadataAs(Mockito.anyList(),
                Mockito.eq(IMetadataColumn.OPTIONS_IGNORE_USED), Mockito.eq(false));

        // lineStyle != EConnectionType.REJECT AND connectorName != REJECT
        connection = new Connection(salesforceOutputNode, logRowNode, EConnectionType.FLOW_MAIN, "MAIN", "main", "row1", true);
        Mockito.when(mockCmd.needChangeSchemaType(connection, mockRepoMetadata)).thenCallRealMethod();
        Mockito.when(mockCmd.needChangeSchemaType(connection, mockRepoMetadata,IMetadataColumn.OPTIONS_NONE)).thenCallRealMethod();
        mockCmd.needChangeSchemaType(connection, mockRepoMetadata);
        Mockito.verify(mockRepoMetadata, Mockito.times(1)).sameMetadataAs(Mockito.eq(connection.getMetadataTable()),
                Mockito.eq(IMetadataColumn.OPTIONS_IGNORE_USED));

    }

    private List<IMetadataColumn> mockMetadataColumns(String[] labels) {
        List<IMetadataColumn> columns = new ArrayList<IMetadataColumn>();
        if (labels != null) {
            for (String label : labels) {
                IMetadataColumn mockerrorMessageColumn = Mockito.mock(IMetadataColumn.class);
                Mockito.when(mockerrorMessageColumn.getLabel()).thenReturn(label);
                columns.add(mockerrorMessageColumn);
            }
        }
        return columns;
    }

    private static Property createProperty() {
        Property property = PropertiesFactory.eINSTANCE.createProperty();
        property.setAuthor(((RepositoryContext) CorePlugin.getContext().getProperty(Context.REPOSITORY_CONTEXT_KEY)).getUser());
        property.setVersion(VersionUtils.DEFAULT_VERSION);
        return property;
    }
}
