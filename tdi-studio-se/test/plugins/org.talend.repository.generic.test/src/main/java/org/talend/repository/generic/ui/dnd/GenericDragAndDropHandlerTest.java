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
package org.talend.repository.generic.ui.dnd;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.talend.components.api.properties.ComponentProperties;
import org.talend.components.jdbc.wizard.JDBCConnectionWizardProperties;
import org.talend.core.model.metadata.builder.connection.Connection;
import org.talend.core.model.metadata.builder.connection.ConnectionFactory;
import org.talend.core.model.metadata.builder.connection.DatabaseConnection;
import org.talend.core.model.metadata.builder.connection.impl.ConnectionFactoryImpl;
import org.talend.core.model.param.EConnectionParameterName;
import org.talend.core.model.utils.AbstractDragAndDropServiceHandler;
import org.talend.repository.generic.model.genericMetadata.GenericConnection;

/**
 * created by hcyi on Feb 22, 2016 Detailled comment
 *
 */
public class GenericDragAndDropHandlerTest {

    private Connection conn = null;
    

    @Before
    public void setUp() throws Exception {
        conn = ConnectionFactory.eINSTANCE.createConnection();
    }

    @After
    public void tearDown() throws Exception {
        conn = null;
    }

    @Test
    public void testIsGenericRepositoryValue() {
        Connection connection = mock(Connection.class);
        AbstractDragAndDropServiceHandler abstractDragAndDropServiceHandler = mock(AbstractDragAndDropServiceHandler.class);
        List<ComponentProperties> componentProsList = new ArrayList<>();
        boolean isGenericRepositoryValue = abstractDragAndDropServiceHandler.isGenericRepositoryValue(connection,
                componentProsList, "paramName1");//$NON-NLS-1$
        assertEquals(false, isGenericRepositoryValue);

        connection = mock(GenericConnection.class);
        GenericDragAndDropHandler genericDragAndDropHandler = mock(GenericDragAndDropHandler.class);
        when(genericDragAndDropHandler.canHandle(connection)).thenReturn(true);
        isGenericRepositoryValue = genericDragAndDropHandler.isGenericRepositoryValue(connection, null, "paramName2");//$NON-NLS-1$
        assertEquals(false, isGenericRepositoryValue);

        // PowerMockito.mockStatic(ComponentsUtils.class);
        // ComponentProperties mockComponentProperties = mock(ComponentProperties.class);
        // when(ComponentsUtils.getComponentPropertiesFromSerialized(null)).thenReturn(mockComponentProperties);
        // List<Property> propertyValues = new ArrayList<Property>();
        // Property element = ComponentPropertyFactory.newReturnsProperty();
        // propertyValues.add(element);
        // when(ComponentsUtils.getAllValuedProperties(mockComponentProperties)).thenReturn(propertyValues);
        //        isGenericRepositoryValue = genericDragAndDropHandler.isGenericRepositoryValue(connection, "QueryMode");//$NON-NLS-1$
        // assertEquals(true, isGenericRepositoryValue);
    }
    
    @Test
    public void testGetPassword1() {
        String pwd = GenericDragAndDropHandler.getPassword(conn, "TestPassword");
        assertEquals("\"TestPassword\"", pwd); //$NON-NLS-1$
    }

    @Test
    public void testGetPassword2() {
        String pwd = GenericDragAndDropHandler.getPassword(conn, "\"TestPassword\"");
        assertEquals("\"\\\"TestPassword\\\"\"", pwd); //$NON-NLS-1$
    }

    @Test
    public void testGetPassword3() {
        String pwd = GenericDragAndDropHandler.getPassword(conn, "\"\"TestPassword\"\"");
        assertEquals("\"\\\"\\\"TestPassword\\\"\\\"\"", pwd); //$NON-NLS-1$
    }

    @Test
    public void testGetPassword4() {
        String pwd = GenericDragAndDropHandler.getPassword(conn, "\"TestPassword");
        assertEquals("\"\\\"TestPassword\"", pwd); //$NON-NLS-1$
    }

    @Test
    public void testGetPassword5() {
        String pwd = GenericDragAndDropHandler.getPassword(conn, "TestPassword\"");
        assertEquals("\"TestPassword\\\"\"", pwd); //$NON-NLS-1$
    }

    @Test
    public void testGetPassword6() {
        conn.setContextMode(true);
        String pwd = GenericDragAndDropHandler.getPassword(conn, "context.pwd");
        conn.setContextMode(false);
        assertEquals("context.pwd", pwd); //$NON-NLS-1$
    }

    @Test
    public void testGetValueOfJDBCMappingNULL() {
        List<ComponentProperties> componentProperties = new ArrayList<>();
        JDBCConnectionWizardProperties properties = setupJDBCProperties();
        //
        componentProperties.add(properties);

        DatabaseConnection dbConnection = ConnectionFactoryImpl.eINSTANCE.createDatabaseConnection();

        GenericDragAndDropHandler handler = new GenericDragAndDropHandler();
        Object returnValue = handler.getGenericRepositoryValue(dbConnection, componentProperties,
                "mappingFile", null);
        assertEquals("\"\"", returnValue);//$NON-NLS-1$
    }

    @Test
    public void testGetValueOfJDBCMappingWithQuotes() {
        List<ComponentProperties> componentProperties = new ArrayList<>();
        JDBCConnectionWizardProperties properties = setupJDBCProperties();
        //
        properties.mappingFile.setStoredValue("\"snowflake_id\"");//$NON-NLS-1$
        componentProperties.add(properties);

        DatabaseConnection dbConnection = ConnectionFactoryImpl.eINSTANCE.createDatabaseConnection();

        GenericDragAndDropHandler handler = new GenericDragAndDropHandler();
        Object returnValue = handler.getGenericRepositoryValue(dbConnection, componentProperties,
                "mappingFile", null);
        assertEquals("\"snowflake_id\"", returnValue);
    }

    @Test
    public void testGetValueOfJDBCDriverClass() {
        List<ComponentProperties> componentProperties = new ArrayList<>();
        JDBCConnectionWizardProperties properties = setupJDBCProperties();
        //
        properties.connection.driverClass.setStoredValue("org.h2.Driver");//$NON-NLS-1$
        componentProperties.add(properties);

        DatabaseConnection dbConnection = ConnectionFactoryImpl.eINSTANCE.createDatabaseConnection();

        GenericDragAndDropHandler handler = new GenericDragAndDropHandler();
        Object returnValue = handler.getGenericRepositoryValue(dbConnection, componentProperties,
                "connection.driverClass", null);
        assertEquals("\"org.h2.Driver\"", returnValue);//$NON-NLS-1$
    }

    @Test
    public void testGetValueOfJDBCUserName() {
        List<ComponentProperties> componentProperties = new ArrayList<>();
        JDBCConnectionWizardProperties properties = setupJDBCProperties();
        //
        properties.connection.userPassword.userId.setStoredValue("UserTestA");//$NON-NLS-1$
        componentProperties.add(properties);

        DatabaseConnection dbConnection = ConnectionFactoryImpl.eINSTANCE.createDatabaseConnection();

        GenericDragAndDropHandler handler = new GenericDragAndDropHandler();
        Object returnValue = handler.getGenericRepositoryValue(dbConnection, componentProperties,
                "connection.userPassword.userId", null);
        assertEquals("\"UserTestA\"", returnValue);//$NON-NLS-1$
    }

    @Test
    public void testGetValueOfJDBCPasswordNULL() {
        List<ComponentProperties> componentProperties = new ArrayList<>();
        JDBCConnectionWizardProperties properties = setupJDBCProperties();
        //
        componentProperties.add(properties);

        DatabaseConnection dbConnection = ConnectionFactoryImpl.eINSTANCE.createDatabaseConnection();

        GenericDragAndDropHandler handler = new GenericDragAndDropHandler();
        Object returnValue = handler.getGenericRepositoryValue(dbConnection, componentProperties,
                "connection.userPassword.password", null);
        assertEquals("\"\"", returnValue);//$NON-NLS-1$
    }

    private JDBCConnectionWizardProperties setupJDBCProperties() {
        JDBCConnectionWizardProperties jdbcP = new JDBCConnectionWizardProperties("test");
        jdbcP.init();
        return jdbcP;
    }
}
