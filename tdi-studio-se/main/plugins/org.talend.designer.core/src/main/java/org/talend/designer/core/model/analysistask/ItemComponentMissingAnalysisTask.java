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

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.talend.analysistask.AbstractItemAnalysisTask;
import org.talend.analysistask.AnalysisReportRecorder;
import org.talend.analysistask.AnalysisReportRecorder.SeverityOption;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.exception.PersistenceException;
import org.talend.core.GlobalServiceRegister;
import org.talend.core.model.components.ComponentCategory;
import org.talend.core.model.components.IComponent;
import org.talend.core.model.properties.Item;
import org.talend.core.model.properties.JobletProcessItem;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.ui.ITestContainerCoreService;
import org.talend.core.ui.component.ComponentsFactoryProvider;
import org.talend.designer.core.i18n.Messages;
import org.talend.designer.core.model.components.EParameterName;
import org.talend.designer.core.model.utils.emf.talendfile.ElementParameterType;
import org.talend.designer.core.model.utils.emf.talendfile.NodeType;
import org.talend.designer.core.model.utils.emf.talendfile.ProcessType;
import org.talend.designer.core.ui.editor.jobletcontainer.JobletUtil;
import org.talend.designer.core.utils.UnifiedComponentUtil;

/**
 * DOC jding  class global comment. Detailled comment
 */
public class ItemComponentMissingAnalysisTask extends AbstractItemAnalysisTask{

    @Override
    public List<AnalysisReportRecorder> execute(Item item) {
        ProcessType processType = getProcessType(item);
        if (processType == null) {
            return null;
        }
        List<AnalysisReportRecorder> recordList = new ArrayList<AnalysisReportRecorder>();
        boolean isJoblet = item instanceof JobletProcessItem;
        ComponentCategory componentCategory = ComponentCategory.getComponentCategoryFromItem(item, isJoblet);
        ERepositoryObjectType itemType = ERepositoryObjectType.getItemType(item);
        if (ERepositoryObjectType.TEST_CONTAINER != null && ERepositoryObjectType.TEST_CONTAINER.equals(itemType)
                && GlobalServiceRegister.getDefault().isServiceRegistered(ITestContainerCoreService.class)) {
            ITestContainerCoreService testcaseService = GlobalServiceRegister.getDefault()
                    .getService(ITestContainerCoreService.class);
            if (testcaseService != null) {
                try {
                    Item parentJobItem = testcaseService.getParentJobItem(item);
                    if (parentJobItem != null) {
                        componentCategory = ComponentCategory.getComponentCategoryFromItem(parentJobItem);
                    }
                } catch (PersistenceException e) {
                    ExceptionHandler.process(e);
                }
            }
        }

        final String paletteType = componentCategory.getName();
        for (Object nodeObject : processType.getNode()) {
            NodeType nodeType = (NodeType) nodeObject;
            String componentName = nodeType.getComponentName();
            if (componentName == null || "tRunJob".equals(componentName)) {
                continue;
            }
            ElementParameterType activateParam = getElementParameterByName(nodeType, EParameterName.ACTIVATE.getName());
            if (activateParam != null && !Boolean.valueOf((String) activateParam.getValue())) {
                continue;
            }

            boolean isJobletNode = new JobletUtil().isJoblet(nodeType);
            IComponent component = ComponentsFactoryProvider.getInstance().get(componentName, paletteType);
            if (component == null && isJobletNode) {
                component = ComponentsFactoryProvider.getInstance().getJobletComponent(componentName, paletteType);
            }
            if (component == null) {
                component = UnifiedComponentUtil.getDelegateComponent(componentName, componentCategory.getName());
                if (component == null) {
                    String uniqueName = "";
                    ElementParameterType uniqueNameParam = getElementParameterByName(nodeType,
                            EParameterName.UNIQUE_NAME.getName());
                    if (uniqueNameParam != null) {
                        uniqueName = uniqueNameParam.getValue();
                    }
                    SeverityOption severity = SeverityOption.CRITICAL;
                    String message = Messages.getString("ItemComponentMissingAnalysisTask.componentMissing", uniqueName,
                            componentName);
                    if (isJobletNode) {
                        message = Messages.getString("ItemComponentMissingAnalysisTask.jobletMissing", uniqueName, componentName);
                        severity = SeverityOption.MAJOR;
                    }
                    AnalysisReportRecorder record = new AnalysisReportRecorder(this, item, severity, message);
                    recordList.add(record);
                }
            }
        }
        return recordList;
    }

    @Override
    public Set<ERepositoryObjectType> getRepositoryObjectTypeScope() {
        Set<ERepositoryObjectType> types = new HashSet<ERepositoryObjectType>();
        types.addAll(ERepositoryObjectType.getAllTypesOfProcess());
        types.addAll(ERepositoryObjectType.getAllTypesOfBigDataProcess());
        types.addAll(ERepositoryObjectType.getAllTypesOfProcess2());
        types.addAll(ERepositoryObjectType.getAllTypesOfTestContainer());
        return types;
    }

}
