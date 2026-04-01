package org.talend.camel.designer.analysistask;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.talend.analysistask.AbstractItemAnalysisTask;
import org.talend.analysistask.AnalysisReportRecorder;
import org.talend.analysistask.AnalysisReportRecorder.SeverityOption;
import org.talend.core.model.properties.Item;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.designer.core.model.utils.emf.talendfile.ElementParameterType;
import org.talend.designer.core.model.utils.emf.talendfile.NodeType;
import org.talend.designer.core.model.utils.emf.talendfile.ProcessType;

public class RemovedCamelPropertiesAnalysisTask extends AbstractItemAnalysisTask{

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
            if (componentName == null || "cMessagingEndpoint".equals(componentName)) {
                for (Object e : nodeType.getElementParameter()) {
                    ElementParameterType p = (ElementParameterType) e;
                    if ("URI".equals(p.getName()) && p.getValue().startsWith("\"quartz://") && p.getValue().contains("startDelayedSeconds")) {
                        SeverityOption severity = SeverityOption.WARNING;
                        String message = "Parameter startDelayedSeconds is not supported in camel-quartz anymore with Camel 3.20 version. See Apache Camel documentation to get details.";
                        AnalysisReportRecorder record = new AnalysisReportRecorder(this, item, severity, message);
                        recordList.add(record);
                        break;
                    }
                }
            }
        }
        return recordList;
    }

    @Override
    public Set<ERepositoryObjectType> getRepositoryObjectTypeScope() {
        Set<ERepositoryObjectType> types = new HashSet<ERepositoryObjectType>();
        types.addAll(ERepositoryObjectType.getAllTypesOfProcess());
        types.addAll(ERepositoryObjectType.getAllTypesOfProcess2());
        return types;
    }

}
