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
package org.talend.designer.core.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.eclipse.jface.action.IAction;
import org.junit.Test;
import org.talend.core.model.components.IComponent;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.model.repository.FakePropertyImpl;
import org.talend.core.ui.component.ComponentsFactoryProvider;
import org.talend.designer.core.model.components.EParameterName;
import org.talend.designer.core.ui.action.AbstractProcessAction;
import org.talend.designer.core.ui.action.EditProcess;
import org.talend.designer.core.ui.editor.nodes.Node;
import org.talend.designer.core.ui.editor.process.Process;
import org.talend.repository.model.RepositoryNode;

/**
 * created by ycbai on 2016年12月14日 Detailled comment
 *
 */
public class DesignerUtilitiesTest {

    @Test
    public void testGetMainSchemaParameterName() {
        Process process = new Process(new FakePropertyImpl());

        // New component
        IComponent component = ComponentsFactoryProvider.getInstance().get("tSalesforceInput", "DI"); //$NON-NLS-1$ //$NON-NLS-2$
        Node node = new Node(component, process);
        String parameterName = DesignerUtilities.getMainSchemaParameterName(node);
        assertEquals("module.main.schema" + ":" + EParameterName.REPOSITORY_SCHEMA_TYPE.getName(), parameterName); //$NON-NLS-1$ //$NON-NLS-2$

        // Old component
        component = ComponentsFactoryProvider.getInstance().get("tJavaRow", "DI"); //$NON-NLS-1$ //$NON-NLS-2$
        node = new Node(component, process);
        parameterName = DesignerUtilities.getMainSchemaParameterName(node);
        assertEquals("SCHEMA:" + EParameterName.REPOSITORY_SCHEMA_TYPE.getName(), parameterName); //$NON-NLS-1$
    }

    @Test
    public void testGetEditProcessAction4NULL() {
        IAction iAction = DesignerUtilities.getEditProcessAction(null);
        assertNull(null, iAction);
    }

    @Test
    public void testGetEditProcessAction4Spark() {
        RepositoryNode processNode = mock(RepositoryNode.class);
        when(processNode.getContentType()).thenReturn(ERepositoryObjectType.PROCESS_SPARK);
        IAction iAction = DesignerUtilities.getEditProcessAction(processNode);
        assertNull(null, iAction);
    }

    @Test
    public void testGetEditProcessAction4SparkStreaming() {
        RepositoryNode processNode = mock(RepositoryNode.class);
        when(processNode.getContentType()).thenReturn(ERepositoryObjectType.PROCESS_SPARKSTREAMING);
        IAction iAction = DesignerUtilities.getEditProcessAction(processNode);
        assertNull(null, iAction);
    }

    @Test
    public void testGetEditProcessAction4Standard() {
        RepositoryNode processNode = mock(RepositoryNode.class);
        when(processNode.getContentType()).thenReturn(ERepositoryObjectType.PROCESS);
        IAction iAction = DesignerUtilities.getEditProcessAction(processNode);
        if (iAction != null && iAction instanceof AbstractProcessAction) {
            Class<?> classObj = ((AbstractProcessAction) iAction).getClassForDoubleClick();
            assertEquals(new EditProcess().getClassForDoubleClick(), classObj);
        }
    }

    @Test
    public void testValidateJobletShortName() {
        String shortName = "tDBConnection_1";
        boolean result = DesignerUtilities.validateJobletShortName(shortName);
        assertFalse(result);
        shortName = "testJoblet_1_tDBConnection_1";
        result = DesignerUtilities.validateJobletShortName(shortName);
        assertFalse(result);
        shortName = "jc2023_2023";
        result = DesignerUtilities.validateJobletShortName(shortName);
        assertTrue(result);
        shortName = "jc1_1_tDBConnection_1";
        result = DesignerUtilities.validateJobletShortName(shortName);
        assertTrue(result);
        shortName = "context.new1+jc1_1+context.new1";
        result = DesignerUtilities.validateJobletShortName(shortName);
        shortName = "jc1_1+globalMap.get(\"shared\")+jc1_1";
        assertTrue(result);
    }
}
