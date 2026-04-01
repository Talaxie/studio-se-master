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
package org.talend.designer.core.model.analysistask;

import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Optional;

import org.eclipse.core.runtime.Path;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.talend.analysistask.AnalysisReportRecorder;
import org.talend.analysistask.IItemAnalysisTask;
import org.talend.analysistask.ItemAnalysisTaskRegistryReader;
import org.talend.core.model.components.IComponent;
import org.talend.core.model.properties.ProcessItem;
import org.talend.core.model.properties.PropertiesFactory;
import org.talend.core.model.properties.Property;
import org.talend.core.model.repository.IRepositoryViewObject;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.designer.core.model.components.EParameterName;
import org.talend.designer.core.model.utils.emf.talendfile.ElementParameterType;
import org.talend.designer.core.model.utils.emf.talendfile.NodeType;
import org.talend.designer.core.model.utils.emf.talendfile.ProcessType;
import org.talend.designer.core.model.utils.emf.talendfile.TalendFileFactory;

/**
 * DOC jding  class global comment. Detailled comment
 */
public class ItemComponentMissingAnalysisTaskTest {

    private static final String TASK_ID = "org.talend.designer.core.model.analysistask.ItemComponentMissingAnalysisTask";

    private ProcessItem processItem;

    @Test
    public void testComponentMissing() {
        List<IItemAnalysisTask> itemAnalysisTasks = ItemAnalysisTaskRegistryReader.getInstance().getItemAnalysisTasks();
        Optional<IItemAnalysisTask> optional = itemAnalysisTasks.stream().filter(task -> TASK_ID.equals(task.getId()))
                .findFirst();
        assertTrue("can't find analysis task " + TASK_ID, optional.isPresent());
        IItemAnalysisTask analysisTask = optional.get();
        List<AnalysisReportRecorder> results = analysisTask.execute(processItem);
        assertTrue(results.size() == 2);
    }

    @Before
    public void before() throws Exception {
        ProxyRepositoryFactory factory = ProxyRepositoryFactory.getInstance();
        Property property = PropertiesFactory.eINSTANCE.createProperty();
        String id = ProxyRepositoryFactory.getInstance().getNextId();
        property.setId(id);
        property.setLabel("test");
        property.setVersion("0.1");
        processItem = PropertiesFactory.eINSTANCE.createProcessItem();
        processItem.setProperty(property);
        property.setItem(processItem);
        ProcessType process = TalendFileFactory.eINSTANCE.createProcessType();
        processItem.setProcess(process);

        NodeType node = TalendFileFactory.eINSTANCE.createNodeType();
        node.setComponentName("testJoblet");
        ElementParameterType familyParam = TalendFileFactory.eINSTANCE.createElementParameterType();
        familyParam.setName(EParameterName.FAMILY.getName());
        familyParam.setValue(IComponent.JOBLET_FAMILY);
        ElementParameterType nameParam = TalendFileFactory.eINSTANCE.createElementParameterType();
        nameParam.setName(EParameterName.UNIQUE_NAME.getName());
        nameParam.setValue("testJoblet");
        node.getElementParameter().add(familyParam);
        node.getElementParameter().add(nameParam);
        process.getNode().add(node);

        NodeType node1 = TalendFileFactory.eINSTANCE.createNodeType();
        node1.setComponentName("tFakeComponet");
        ElementParameterType nameParam1 = TalendFileFactory.eINSTANCE.createElementParameterType();
        nameParam1.setName(EParameterName.UNIQUE_NAME.getName());
        nameParam1.setValue("tFakeComponent_1");
        node1.getElementParameter().add(nameParam1);
        process.getNode().add(node1);
        factory.create(processItem, new Path(""));
        factory.save(processItem);
    }

    @After
    public void after() throws Exception {
        ProxyRepositoryFactory factory = ProxyRepositoryFactory.getInstance();
        IRepositoryViewObject object = factory.getLastVersion(processItem.getProperty().getId());
        factory.deleteObjectPhysical(object);
    }
}
