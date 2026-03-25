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

import org.apache.commons.lang.StringUtils;
import org.talend.analysistask.AbstractItemAnalysisTask;
import org.talend.analysistask.AnalysisReportRecorder;
import org.talend.analysistask.AnalysisReportRecorder.SeverityOption;
import org.talend.core.model.properties.Item;
import org.talend.core.model.properties.ProcessItem;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.designer.core.i18n.Messages;
import org.talend.designer.core.model.components.EParameterName;
import org.talend.designer.core.model.utils.emf.talendfile.ElementParameterType;
import org.talend.designer.core.model.utils.emf.talendfile.NodeType;
import org.talend.designer.core.model.utils.emf.talendfile.ProcessType;
import org.talend.designer.runprocess.ItemCacheManager;

/**
 * DOC jding  class global comment. Detailled comment
 */
public class ChildJobMissingAnalysisTask extends AbstractItemAnalysisTask {

    private static final String COMMA = ";";

    @Override
    public List<AnalysisReportRecorder> execute(Item item) {
        ProcessType processType = getProcessType(item);
        if (processType == null) {
            return null;
        }
        List<AnalysisReportRecorder> recordList = new ArrayList<AnalysisReportRecorder>();
        for (Object nodeObject : processType.getNode()) {
            NodeType nodeType = (NodeType) nodeObject;
            String componentName = nodeType.getComponentName();
            if (!"tRunJob".equals(componentName)) {
                continue;
            }
            ElementParameterType activateParam = getElementParameterByName(nodeType, EParameterName.ACTIVATE.getName());
            if (activateParam != null && !Boolean.valueOf((String) activateParam.getValue())) {
                continue;
            }

            String uniqueName = "";
            ElementParameterType uniqueNameParam = getElementParameterByName(nodeType, EParameterName.UNIQUE_NAME.getName());
            if (uniqueNameParam != null) {
                uniqueName = uniqueNameParam.getValue();
            }

            ElementParameterType processIdsparam = getElementParameterByName(nodeType,
                    EParameterName.PROCESS.getName() + ":" + EParameterName.PROCESS_TYPE_PROCESS.getName());
            ElementParameterType processVersionParam = getElementParameterByName(nodeType,
                    EParameterName.PROCESS.getName() + ":" + EParameterName.PROCESS_TYPE_VERSION.getName());
            if (processIdsparam == null || processVersionParam == null) {
                recordList.add(new AnalysisReportRecorder(this, item, SeverityOption.WARNING,
                        Messages.getString("ChildJobMissingAnalysisTask.emptyChildJob", uniqueName)));
                continue;
            }
            String jobIds = processIdsparam.getValue();
            String version = processVersionParam.getValue();
            if (StringUtils.isBlank(jobIds) || StringUtils.isBlank(version)) {
                recordList.add(new AnalysisReportRecorder(this, item, SeverityOption.WARNING,
                        Messages.getString("ChildJobMissingAnalysisTask.emptyChildJob", uniqueName)));
                continue;
            }

            for (String jobId : jobIds.split(COMMA)) {
                if (StringUtils.isBlank(jobId)) {
                    continue;
                }
                ProcessItem processItem = ItemCacheManager.getProcessItem(jobId, version);
                if (processItem == null) {
                    recordList.add(new AnalysisReportRecorder(this, item, SeverityOption.MAJOR,
                            Messages.getString("ChildJobMissingAnalysisTask.childJobMissing", uniqueName)));
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
