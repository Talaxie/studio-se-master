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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.io.IOException;

import org.eclipse.core.runtime.Path;
import org.junit.Test;
import org.talend.commons.exception.PersistenceException;
import org.talend.core.model.metadata.builder.connection.DatabaseConnection;
import org.talend.core.model.metadata.builder.connection.impl.ConnectionFactoryImpl;
import org.talend.core.model.process.EParameterFieldType;
import org.talend.core.model.properties.ProcessItem;
import org.talend.core.model.properties.PropertiesFactory;
import org.talend.core.model.properties.Property;
import org.talend.core.model.repository.IRepositoryViewObject;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.designer.core.model.utils.emf.talendfile.ContextParameterType;
import org.talend.designer.core.model.utils.emf.talendfile.ElementParameterType;
import org.talend.designer.core.model.utils.emf.talendfile.NodeType;
import org.talend.designer.core.model.utils.emf.talendfile.ProcessType;
import org.talend.designer.core.model.utils.emf.talendfile.TalendFileFactory;
import org.talend.designer.core.model.utils.emf.talendfile.impl.TalendFileFactoryImpl;

public class ProcessEncryptPasswordTest {

    private ProcessItem processItem;

    @Test
    public void testSetParameterRawValue() {
        String value = "123456";
        ElementParameterType paramType = TalendFileFactoryImpl.eINSTANCE.createElementParameterType();
        paramType.setRawValue(value);

        String encryptedValue1 = paramType.getValue();
        paramType.setRawValue(value);
        String encryptedValue2 = paramType.getValue();

        assertEquals(encryptedValue1, encryptedValue2);
        assertEquals(value, paramType.getRawValue());
    }

    @Test
    public void testSetDatabaseConnectionWithPassword() {
        DatabaseConnection connection = ConnectionFactoryImpl.init().createDatabaseConnection();
        connection.setRawPassword("123456");
        String password1 = connection.getPassword();
        connection.setRawPassword("123456");
        String password2 = connection.getPassword();
        assertEquals(password1, password2);

        connection.setRawPassword("654321");
        String password3 = connection.getPassword();
        assertNotEquals(password1, password3);
    }

    @Test
    public void testSetContextParameterTypeWithRawValue() {
        ContextParameterType contextParameter = TalendFileFactoryImpl.init().createContextParameterType();
        contextParameter.setRawValue("123456");
        String password1 = contextParameter.getValue();
        contextParameter.setRawValue("123456");
        String password2 = contextParameter.getValue();
        assertEquals(password1, password2);

        contextParameter.setRawValue("654321");
        String password3 = contextParameter.getValue();
        assertNotEquals(password1, password3);
    }

    @Test
    public void testSaveProcessWithPassword() throws IOException, PersistenceException {
        ProxyRepositoryFactory factory = ProxyRepositoryFactory.getInstance();

        Property property = PropertiesFactory.eINSTANCE.createProperty();
        String id = ProxyRepositoryFactory.getInstance().getNextId();
        property.setId(id);
        property.setLabel("ProcessEncryptPasswordTest");
        property.setVersion("0.1");
        processItem = PropertiesFactory.eINSTANCE.createProcessItem();
        processItem.setProperty(property);
        property.setItem(processItem);
        ProcessType process = TalendFileFactory.eINSTANCE.createProcessType();
        processItem.setProcess(process);

        String value = "123456";
        String paramName = "PARAMTER_TEST";
        ElementParameterType paramType = TalendFileFactoryImpl.eINSTANCE.createElementParameterType();
        paramType.setField(EParameterFieldType.PASSWORD.getName());
        paramType.setName(paramName);
        paramType.setRawValue(value);
        String encryptedValue1 = paramType.getValue();
        paramType.setRawValue(value);

        NodeType node = TalendFileFactory.eINSTANCE.createNodeType();
        node.getElementParameter().add(paramType);
        processItem.getProcess().getNode().add(node);

        factory.create(processItem, new Path(""));
        factory.save(processItem);

        ElementParameterType paramType1 = null;
        for (Object o : ((NodeType) processItem.getProcess().getNode().get(0)).getElementParameter()) {
            if (o instanceof ElementParameterType && paramName.equals(((ElementParameterType) o).getName())) {
                paramType1 = (ElementParameterType) o;
                break;
            }
        }
        assertEquals(paramType.getValue(), paramType1.getValue());
        assertEquals(paramType.getRawValue(), paramType1.getRawValue());

        IRepositoryViewObject object = factory.getLastVersion(processItem.getProperty().getId());
        factory.deleteObjectPhysical(object);
    }

}
