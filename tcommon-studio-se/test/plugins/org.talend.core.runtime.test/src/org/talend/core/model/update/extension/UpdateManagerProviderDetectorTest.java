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
package org.talend.core.model.update.extension;

import java.util.List;

import org.eclipse.core.runtime.Path;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.junit.Assert;
import org.junit.Test;
import org.talend.core.model.metadata.builder.connection.ConnectionFactory;
import org.talend.core.model.metadata.builder.connection.DatabaseConnection;
import org.talend.core.model.metadata.builder.connection.MetadataTable;
import org.talend.core.model.properties.ContextItem;
import org.talend.core.model.properties.DatabaseConnectionItem;
import org.talend.core.model.properties.ItemState;
import org.talend.core.model.properties.ProcessItem;
import org.talend.core.model.properties.PropertiesFactory;
import org.talend.core.model.properties.Property;
import org.talend.core.model.relationship.RelationshipItemBuilder;
import org.talend.core.model.repository.IRepositoryViewObject;
import org.talend.core.runtime.CoreRuntimePlugin;
import org.talend.core.utils.ReflectionUtils;
import org.talend.cwm.helper.ConnectionHelper;
import org.talend.cwm.helper.PackageHelper;
import org.talend.designer.core.model.utils.emf.talendfile.ProcessType;
import org.talend.designer.core.model.utils.emf.talendfile.TalendFileFactory;
import org.talend.repository.model.IProxyRepositoryFactory;
import org.talend.repository.model.IRepositoryNode.ENodeType;
import org.talend.repository.model.RepositoryNode;

import orgomg.cwm.resource.record.RecordFactory;
import orgomg.cwm.resource.record.RecordFile;

/**
 * DOC jding  class global comment. Detailled comment
 */
public class UpdateManagerProviderDetectorTest {

    @Test
    public void testGetAllRelations() throws Exception {
        IProxyRepositoryFactory proxyRepositoryFactory = CoreRuntimePlugin.getInstance().getProxyRepositoryFactory();
        IRepositoryViewObject contextRepObject = null;
        IRepositoryViewObject metadataRepObject = null;
        ProcessItem item = null;
        ProcessItem item1 = null;
        try {
            Property property = PropertiesFactory.eINSTANCE.createProperty();
            ProcessType process = TalendFileFactory.eINSTANCE.createProcessType();
            item = PropertiesFactory.eINSTANCE.createProcessItem();
            item.setProperty(property);
            item.setProcess(process);
            property.setId(proxyRepositoryFactory.getNextId());
            property.setLabel("testjob");
            property.setVersion("0.1");
            ItemState itemState = PropertiesFactory.eINSTANCE.createItemState();
            itemState.setPath("");
            item.setState(itemState);
            
            Property property1 = PropertiesFactory.eINSTANCE.createProperty();
            ProcessType process1 = TalendFileFactory.eINSTANCE.createProcessType();
            item1 = PropertiesFactory.eINSTANCE.createProcessItem();
            item1.setProperty(property1);
            item1.setProcess(process1);
            property1.setId(proxyRepositoryFactory.getNextId());
            property1.setLabel("testjob");
            property1.setVersion("0.1");
            ItemState itemState1 = PropertiesFactory.eINSTANCE.createItemState();
            itemState1.setPath("");
            item.setState(itemState1);

            // test property
            Property metadataProperty = PropertiesFactory.eINSTANCE.createProperty();
            DatabaseConnectionItem metadataItem = PropertiesFactory.eINSTANCE.createDatabaseConnectionItem();
            ItemState metadataItemState = PropertiesFactory.eINSTANCE.createItemState();
            metadataItemState.setPath("");
            metadataItem.setProperty(metadataProperty);
            metadataProperty.setId(proxyRepositoryFactory.getNextId());
            metadataProperty.setLabel("testMetadata");
            metadataProperty.setVersion("0.1");
            DatabaseConnection connection = ConnectionFactory.eINSTANCE.createDatabaseConnection();
            connection.setName("mysql_1");
            connection.setId(proxyRepositoryFactory.getNextId());
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
            RelationshipItemBuilder.getInstance().addRelationShip(item, metadataProperty.getId(),
                    RelationshipItemBuilder.LATEST_VERSION, RelationshipItemBuilder.PROPERTY_RELATION);

            metadataRepObject = proxyRepositoryFactory.getSpecificVersion(metadataProperty.getId(), metadataProperty.getVersion(),
                    true);
            RepositoryNode metadataNode = new RepositoryNode(metadataRepObject, null, ENodeType.REPOSITORY_ELEMENT);
            IStructuredSelection metadataSelection = new StructuredSelection(metadataNode);
            List relationList = (List) ReflectionUtils.invokeDeclaredMethod(UpdateManagerProviderDetector.INSTANCE,
                    "getAllRelations", new Object[] { metadataSelection }, IStructuredSelection.class);
            Assert.assertEquals(relationList.size(), 1);

            // test context
            Property contextProperty = PropertiesFactory.eINSTANCE.createProperty();
            ContextItem contextItem = PropertiesFactory.eINSTANCE.createContextItem();
            ItemState contextItemState = PropertiesFactory.eINSTANCE.createItemState();
            contextItemState.setPath("");
            contextItem.setProperty(contextProperty);
            contextItem.setState(contextItemState);
            contextProperty.setId(proxyRepositoryFactory.getNextId());
            contextProperty.setLabel("testContext");
            contextProperty.setVersion("0.1");
            proxyRepositoryFactory.create(contextItem, new Path(""));
            proxyRepositoryFactory.save(contextItem);
            RelationshipItemBuilder.getInstance().addRelationShip(item, contextProperty.getId(),
                    RelationshipItemBuilder.LATEST_VERSION, RelationshipItemBuilder.CONTEXT_RELATION);

            contextRepObject = proxyRepositoryFactory.getSpecificVersion(contextProperty.getId(), contextProperty.getVersion(),
                    true);
            RepositoryNode contextNode = new RepositoryNode(contextRepObject, null, ENodeType.REPOSITORY_ELEMENT);
            IStructuredSelection contextSelection = new StructuredSelection(contextNode);
            relationList = (List) ReflectionUtils.invokeDeclaredMethod(UpdateManagerProviderDetector.INSTANCE, "getAllRelations",
                    new Object[] { contextSelection }, IStructuredSelection.class);
            Assert.assertEquals(relationList.size(), 1);

            RelationshipItemBuilder.getInstance().addRelationShip(item1, contextProperty.getId(),
                    RelationshipItemBuilder.LATEST_VERSION, RelationshipItemBuilder.CONTEXT_RELATION);
            relationList = (List) ReflectionUtils.invokeDeclaredMethod(UpdateManagerProviderDetector.INSTANCE, "getAllRelations",
                    new Object[] { contextSelection }, IStructuredSelection.class);
            Assert.assertEquals(relationList.size(), 2);

        } finally {
            if (item !=null) {
                RelationshipItemBuilder.getInstance().removeItemRelations(item);
            }

            if (item1 != null) {
                RelationshipItemBuilder.getInstance().removeItemRelations(item1);
            }

            if (contextRepObject != null) {
                proxyRepositoryFactory.deleteObjectPhysical(contextRepObject);
            }

            if (metadataRepObject != null) {
                proxyRepositoryFactory.deleteObjectPhysical(metadataRepObject);
            }
        }

    }

}
