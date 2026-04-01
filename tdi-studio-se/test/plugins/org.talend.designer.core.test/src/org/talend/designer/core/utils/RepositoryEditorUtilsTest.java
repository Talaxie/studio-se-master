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
package org.talend.designer.core.utils;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.Path;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.talend.commons.exception.PersistenceException;
import org.talend.commons.ui.runtime.image.ImageUtils;
import org.talend.core.CorePlugin;
import org.talend.core.context.Context;
import org.talend.core.context.RepositoryContext;
import org.talend.core.model.properties.ByteArray;
import org.talend.core.model.properties.Item;
import org.talend.core.model.properties.JobletProcessItem;
import org.talend.core.model.properties.ProcessItem;
import org.talend.core.model.properties.PropertiesFactory;
import org.talend.core.model.properties.Property;
import org.talend.core.model.repository.IRepositoryViewObject;
import org.talend.core.model.repository.RepositoryObject;
import org.talend.core.model.routines.RoutinesUtil;
import org.talend.core.repository.ui.editor.RepositoryEditorInput;
import org.talend.core.repository.ui.view.RepositoryLabelProvider;
import org.talend.designer.core.model.utils.emf.talendfile.ParametersType;
import org.talend.designer.core.model.utils.emf.talendfile.ProcessType;
import org.talend.designer.core.model.utils.emf.talendfile.RoutinesParameterType;
import org.talend.designer.core.model.utils.emf.talendfile.TalendFileFactory;
import org.talend.designer.joblet.model.JobletFactory;
import org.talend.designer.joblet.model.JobletProcess;
import org.talend.repository.model.IProxyRepositoryFactory;

/**
 * created by hcyi on Apr 12, 2022
 * Detailled comment
 *
 */
public class RepositoryEditorUtilsTest {

    IProxyRepositoryFactory factory;

    List<IRepositoryViewObject> repositoryObjects;

    @Before
    public void before() throws Exception {
        factory = CorePlugin.getDefault().getRepositoryService().getProxyRepositoryFactory();
        repositoryObjects = new ArrayList<IRepositoryViewObject>();
    }

    @After
    public void clean() throws Exception {
        for (IRepositoryViewObject repositoryObject : repositoryObjects) {
            factory.deleteObjectPhysical(repositoryObject);
        }
        factory = null;
    }

    @Test
    public void testGetProcessItemEditorInput() throws PersistenceException {
        String label = "testItem1"; //$NON-NLS-1$
        String id = factory.getNextId();
        IRepositoryViewObject object_01 = createRepositoryObject4Process(label, id, "0.1");//$NON-NLS-1$
        repositoryObjects.add(object_01);
        Item item = object_01.getProperty().getItem();
        RepositoryEditorInput fileEditorInput = RepositoryEditorUtils.getProcessItemEditorInput(item, false);
        Assert.assertNotNull(fileEditorInput);
        Assert.assertEquals("org.talend.designer.core.ui.editor.ProcessEditorInput", fileEditorInput.getClass().getName()); //$NON-NLS-1$
    }

    @Test
    public void testGetJobletProcessItemEditorInput() throws PersistenceException {
        String label = "testItem2"; //$NON-NLS-1$
        String id = factory.getNextId();
        IRepositoryViewObject object_01 = createRepositoryObject4Joblet(label, id, "0.1");//$NON-NLS-1$
        repositoryObjects.add(object_01);
        Item item = object_01.getProperty().getItem();
        RepositoryEditorInput fileEditorInput = RepositoryEditorUtils.getProcessItemEditorInput(item, false);
        Assert.assertNotNull(fileEditorInput);
        Assert.assertEquals("org.talend.designer.joblet.ui.editor.JobletEditorInput", fileEditorInput.getClass().getName()); //$NON-NLS-1$
    }

    private IRepositoryViewObject createRepositoryObject4Process(String label, String id, String version)
            throws PersistenceException {
        Property property = PropertiesFactory.eINSTANCE.createProperty();
        property.setAuthor(((RepositoryContext) CorePlugin.getContext().getProperty(Context.REPOSITORY_CONTEXT_KEY)).getUser());
        property.setVersion(version);
        property.setStatusCode(""); //$NON-NLS-1$

        ProcessItem processItem = PropertiesFactory.eINSTANCE.createProcessItem();

        processItem.setProperty(property);
        property.setId(id);
        property.setLabel(label);
        property.setDisplayName(property.getLabel());

        ProcessType process = TalendFileFactory.eINSTANCE.createProcessType();
        processItem.setProcess(process);

        factory.create(processItem, new Path(""));
        return new RepositoryObject(property);
    }

    private IRepositoryViewObject createRepositoryObject4Joblet(String label, String id, String version)
            throws PersistenceException {
        Property property = PropertiesFactory.eINSTANCE.createProperty();
        property.setAuthor(((RepositoryContext) CorePlugin.getContext().getProperty(Context.REPOSITORY_CONTEXT_KEY)).getUser());
        property.setVersion(version);
        property.setStatusCode(""); //$NON-NLS-1$

        JobletProcessItem processItem = PropertiesFactory.eINSTANCE.createJobletProcessItem();
        ByteArray ba = PropertiesFactory.eINSTANCE.createByteArray();
        processItem.setIcon(ba);
        processItem.getIcon()
                .setInnerContent(ImageUtils.saveImageToData(RepositoryLabelProvider.getDefaultJobletImage(processItem)));

        processItem.setProperty(property);
        property.setId(id);
        property.setLabel(label);
        property.setDisplayName(property.getLabel());
        ParametersType parameterType = TalendFileFactory.eINSTANCE.createParametersType();
        // add depended routines.
        List<RoutinesParameterType> dependenciesInPreference;
        dependenciesInPreference = RoutinesUtil.createDependenciesInPreference();

        parameterType.getRoutinesParameter().addAll(dependenciesInPreference);
        JobletProcess process = JobletFactory.eINSTANCE.createJobletProcess();
        process.setParameters(parameterType);
        processItem.setJobletProcess(process);
        factory.create(processItem, new Path(""));
        return new RepositoryObject(property);
    }
}
