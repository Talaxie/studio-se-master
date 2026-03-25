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
package org.talend.designer.core.model.analysistask.handler;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.Path;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.talend.analysistask.AnalysisReportRecorder;
import org.talend.analysistask.ItemAnalysisTaskRegistryReader;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.core.model.general.Project;
import org.talend.core.model.properties.ProcessItem;
import org.talend.core.model.properties.PropertiesFactory;
import org.talend.core.model.properties.Property;
import org.talend.core.model.repository.IRepositoryViewObject;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.core.runtime.CoreRuntimePlugin;
import org.talend.designer.core.IDesignerCoreService;
import org.talend.designer.core.model.components.EParameterName;
import org.talend.designer.core.model.utils.emf.talendfile.ElementParameterType;
import org.talend.designer.core.model.utils.emf.talendfile.NodeType;
import org.talend.designer.core.model.utils.emf.talendfile.ProcessType;
import org.talend.designer.core.model.utils.emf.talendfile.TalendFileFactory;
import org.talend.designer.runprocess.ItemCacheManager;
import org.talend.repository.ProjectManager;

/**
 * created by hcyi on Oct 20, 2022
 * Detailled comment
 *
 */
public class AnalysisRepositoryContentHandlerTest {

    private List<ProcessItem> items = new ArrayList<ProcessItem>();

    @Test
    public void testAnalysis() {
        try {
            String projectTecName = ProjectManager.getInstance().getCurrentProject().getTechnicalLabel();
            Project project = ProjectManager.getInstance().getProjectFromProjectTechLabel(projectTecName);
            ItemAnalysisTaskRegistryReader.getInstance().getAllItemURIsMap().clear();
            ItemAnalysisTaskRegistryReader.getInstance().getDuplicatedItemURIsMap().clear();
            List<AnalysisReportRecorder> analysisResultList = new ArrayList<AnalysisReportRecorder>();
            IDesignerCoreService designerCoreService = CoreRuntimePlugin.getInstance().getDesignerCoreService();
            if (designerCoreService != null) {
                List<AnalysisReportRecorder> recorder = designerCoreService.analysis(project);
                if (recorder != null && !recorder.isEmpty()) {
                    analysisResultList.addAll(recorder);
                }
            }
            assertTrue(analysisResultList.size() == 1);
        } catch (Exception e) {
            ExceptionHandler.process(e);
        }
    }

    @Before
    public void before() throws Exception {
        ProxyRepositoryFactory factory = ProxyRepositoryFactory.getInstance();
        // process item 1
        Property property = PropertiesFactory.eINSTANCE.createProperty();
        property.setId("_FM3gAFBsEe2Fwu7e0pz0gg");
        property.setLabel("test");
        property.setVersion("0.1");
        ProcessItem processItem = PropertiesFactory.eINSTANCE.createProcessItem();
        processItem.setProperty(property);
        property.setItem(processItem);
        ProcessType process = TalendFileFactory.eINSTANCE.createProcessType();
        processItem.setProcess(process);

        NodeType node = TalendFileFactory.eINSTANCE.createNodeType();
        node.setComponentName("tRunJob");
        ElementParameterType nameParam = TalendFileFactory.eINSTANCE.createElementParameterType();
        nameParam.setName(EParameterName.UNIQUE_NAME.getName());
        nameParam.setValue("tRunJob_1");
        node.getElementParameter().add(nameParam);
        process.getNode().add(node);

        NodeType node1 = TalendFileFactory.eINSTANCE.createNodeType();
        node1.setComponentName("tRunJob");
        ElementParameterType nameParam1 = TalendFileFactory.eINSTANCE.createElementParameterType();
        nameParam1.setName(EParameterName.UNIQUE_NAME.getName());
        nameParam1.setValue("tRunJob_2");
        node1.getElementParameter().add(nameParam1);
        ElementParameterType peocessIdParam = TalendFileFactory.eINSTANCE.createElementParameterType();
        peocessIdParam.setName(EParameterName.PROCESS.getName() + ":" + EParameterName.PROCESS_TYPE_PROCESS.getName());
        String technicalLabel = ProjectManager.getInstance().getCurrentProject().getTechnicalLabel();
        peocessIdParam.setValue(technicalLabel + ":" + ProxyRepositoryFactory.getInstance().getNextId());
        node1.getElementParameter().add(peocessIdParam);
        ElementParameterType peocessVersionParam = TalendFileFactory.eINSTANCE.createElementParameterType();
        peocessVersionParam.setName(EParameterName.PROCESS.getName() + ":" + EParameterName.PROCESS_TYPE_VERSION.getName());
        peocessVersionParam.setValue(ItemCacheManager.LATEST_VERSION);
        process.getNode().add(node1);
        factory.create(processItem, new Path(""));
        factory.save(processItem);

        items.add(processItem);

        // process item 2
        property = PropertiesFactory.eINSTANCE.createProperty();
        property.setId("_FM3gAFBsEe2Fwu7e0pz0gg");
        property.setLabel("test");
        property.setVersion("0.1");
        processItem = PropertiesFactory.eINSTANCE.createProcessItem();
        processItem.setProperty(property);
        property.setItem(processItem);
        process = TalendFileFactory.eINSTANCE.createProcessType();
        processItem.setProcess(process);

        node = TalendFileFactory.eINSTANCE.createNodeType();
        node.setComponentName("tRunJob");
        nameParam = TalendFileFactory.eINSTANCE.createElementParameterType();
        nameParam.setName(EParameterName.UNIQUE_NAME.getName());
        nameParam.setValue("tRunJob_1");
        node.getElementParameter().add(nameParam);
        process.getNode().add(node);

        node1 = TalendFileFactory.eINSTANCE.createNodeType();
        node1.setComponentName("tRunJob");
        nameParam1 = TalendFileFactory.eINSTANCE.createElementParameterType();
        nameParam1.setName(EParameterName.UNIQUE_NAME.getName());
        nameParam1.setValue("tRunJob_2");
        node1.getElementParameter().add(nameParam1);
        peocessIdParam = TalendFileFactory.eINSTANCE.createElementParameterType();
        peocessIdParam.setName(EParameterName.PROCESS.getName() + ":" + EParameterName.PROCESS_TYPE_PROCESS.getName());
        technicalLabel = ProjectManager.getInstance().getCurrentProject().getTechnicalLabel();
        peocessIdParam.setValue(technicalLabel + ":" + ProxyRepositoryFactory.getInstance().getNextId());
        node1.getElementParameter().add(peocessIdParam);
        peocessVersionParam = TalendFileFactory.eINSTANCE.createElementParameterType();
        peocessVersionParam.setName(EParameterName.PROCESS.getName() + ":" + EParameterName.PROCESS_TYPE_VERSION.getName());
        peocessVersionParam.setValue(ItemCacheManager.LATEST_VERSION);
        process.getNode().add(node1);

        factory.create(processItem, new Path("test/t"));
        factory.save(processItem);
        items.add(processItem);
    }

    @After
    public void after() throws Exception {
        ProxyRepositoryFactory factory = ProxyRepositoryFactory.getInstance();
        for (ProcessItem item : items) {
            IRepositoryViewObject object = factory.getLastVersion(item.getProperty().getId());
            factory.deleteObjectPhysical(object);
        }
    }
}
