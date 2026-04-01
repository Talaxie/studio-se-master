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
package org.talend.repository.generic.update;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Map;

import org.eclipse.core.runtime.Path;
import org.junit.Test;
import org.talend.commons.exception.PersistenceException;
import org.talend.commons.utils.VersionUtils;
import org.talend.core.context.Context;
import org.talend.core.context.RepositoryContext;
import org.talend.core.model.metadata.IMetadataTable;
import org.talend.core.model.metadata.builder.connection.Connection;
import org.talend.core.model.metadata.builder.connection.ConnectionFactory;
import org.talend.core.model.metadata.builder.connection.MetadataTable;
import org.talend.core.model.properties.PropertiesFactory;
import org.talend.core.model.properties.Property;
import org.talend.core.model.relationship.Relation;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.core.runtime.CoreRuntimePlugin;
import org.talend.repository.generic.model.genericMetadata.GenericConnection;
import org.talend.repository.generic.model.genericMetadata.GenericConnectionItem;
import org.talend.repository.generic.model.genericMetadata.GenericMetadataFactory;

/**
 * created by hcyi on Jun 29, 2022
 * Detailled comment
 *
 */
public class GenericUpdateManagerTest {

    @Test
    public void testGetNameAndTableMapEmpty() throws PersistenceException {
        String id = "testId"; //$NON-NLS-1$
        GenericConnectionItem connectionItem = createBasicConnection(id);

        GenericUpdateManager updateManager = new GenericUpdateManager(connectionItem, new ArrayList<IMetadataTable>(),
                new ArrayList<Relation>());

        Map<String, MetadataTable> nameAndTableMap = updateManager.getNameAndTableMap(connectionItem);

        assertEquals(0, nameAndTableMap.size());
    }

    @Test
    public void testGetNameAndTableMap() throws PersistenceException {
        String id = "testId"; //$NON-NLS-1$
        GenericConnectionItem connectionItem = createBasicConnection(id);
        Connection connection = connectionItem.getConnection();
        orgomg.cwm.objectmodel.core.Package container = connection;
        // Create some MetadataTables for test.
        MetadataTable table1 = createMetadataTable("table1"); //$NON-NLS-1$
        container.getOwnedElement().add(table1);
        MetadataTable table2 = createMetadataTable("table2"); //$NON-NLS-1$
        container.getOwnedElement().add(table2);
        MetadataTable table3 = createMetadataTable("table3"); //$NON-NLS-1$
        container.getOwnedElement().add(table3);

        GenericUpdateManager updateManager = new GenericUpdateManager(connectionItem, new ArrayList<IMetadataTable>(),
                new ArrayList<Relation>());

        Map<String, MetadataTable> nameAndTableMap = updateManager.getNameAndTableMap(connectionItem);

        assertEquals(3, nameAndTableMap.size());
    }

    private GenericConnectionItem createBasicConnection(String id) throws PersistenceException {
        GenericConnection connection = GenericMetadataFactory.eINSTANCE.createGenericConnection();

        Property connectionProperty = PropertiesFactory.eINSTANCE.createProperty();
        // ses the id to be used for persistence lookup
        connectionProperty.setId(id);
        connectionProperty.setAuthor(
                ((RepositoryContext) CoreRuntimePlugin.getInstance().getContext().getProperty(Context.REPOSITORY_CONTEXT_KEY))
                        .getUser());
        connectionProperty.setVersion(VersionUtils.DEFAULT_VERSION);
        connectionProperty.setStatusCode(""); //$NON-NLS-1$
        connectionProperty.setLabel("test");
        GenericConnectionItem connectionItem = GenericMetadataFactory.eINSTANCE.createGenericConnectionItem();

        connectionItem.setProperty(connectionProperty);
        connectionItem.setConnection(connection);
        connectionItem.setTypeName("snowflake");
        ProxyRepositoryFactory.getInstance().create(connectionItem, new Path(""));
        return connectionItem;
    }

    private MetadataTable createMetadataTable(String name) {
        MetadataTable table = ConnectionFactory.eINSTANCE.createMetadataTable();
        table.setName(name);
        table.setLabel(table.getName());
        return table;
    }

}
