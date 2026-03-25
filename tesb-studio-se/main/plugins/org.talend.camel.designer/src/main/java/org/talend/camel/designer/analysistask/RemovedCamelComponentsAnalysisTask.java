//============================================================================
//
//Copyright (C) 2006-2023 Talend Inc. - www.talend.com
//
//This source code is available under agreement available at
//%InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
//You should have received a copy of the agreement
//along with this program; if not, write to Talend SA
//9 rue Pages 92150 Suresnes, France
//
//============================================================================
package org.talend.camel.designer.analysistask;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.EList;

import org.talend.analysistask.AbstractItemAnalysisTask;
import org.talend.analysistask.AnalysisReportRecorder;
import org.talend.analysistask.AnalysisReportRecorder.SeverityOption;
import org.talend.core.model.components.ComponentCategory;
import org.talend.core.model.properties.Item;
import org.talend.core.model.properties.JobletProcessItem;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.designer.core.i18n.Messages;
import org.talend.designer.core.model.utils.emf.talendfile.ElementParameterType;
import org.talend.designer.core.model.utils.emf.talendfile.ElementValueType;
import org.talend.designer.core.model.utils.emf.talendfile.NodeType;
import org.talend.designer.core.model.utils.emf.talendfile.ProcessType;

/**
* DOC xldai  class global comment. Detailled comment
*/
public class RemovedCamelComponentsAnalysisTask extends AbstractItemAnalysisTask{

    public static final List<String> RemovedComponents =
            Collections.unmodifiableList(Arrays.asList("AHC-WS", "AHC", "ATOMIX", "AZURE", "BEANIO", "BEANSTALK", "ELSQL", "ETCD", "GANGLIA", "HYSTRIX", "JING",
                "LEVELDB-LEGACY", "MSV", "NAGIOS", "NSQ", "RIBBON", "SIP", "SOROUSH", "SPRING-JAVACONFIG", "TAGSOUP", "YAMMER"));
 
    @Override
    public List<AnalysisReportRecorder> execute(Item item) {
        ProcessType processType = getProcessType(item);
        if (processType == null) {
            return null;
        }
        List<AnalysisReportRecorder> recordList = new ArrayList<AnalysisReportRecorder>();
        boolean isJoblet = item instanceof JobletProcessItem;
        ComponentCategory componentCategory = ComponentCategory.getComponentCategoryFromItem(item, isJoblet);

        final String paletteType = componentCategory.getName();
        for (Object nodeObject : processType.getNode()) {
            NodeType nodeType = (NodeType) nodeObject;

            String componentName = nodeType.getComponentName();
            if (componentName == null || "cMessagingEndpoint".equals(componentName)) {
                for (Object e : nodeType.getElementParameter()) {
                    ElementParameterType p = (ElementParameterType) e;
                    if ("HOTLIBS".equals(p.getName())) {
                        EList<?> elementValue = p.getElementValue();
                        for (Object pv : elementValue) {
                            ElementValueType evt = (ElementValueType) pv;
                            String evtValue = evt.getValue();
                            if(null != evtValue && RemovedComponents.contains(evtValue)) {
                                SeverityOption severity = SeverityOption.CRITICAL;
                                String message = "Component name " + evtValue + " does not exist anymore with Camel 3.20 version. See Apache Camel documentation to get details.";
                                AnalysisReportRecorder record = new AnalysisReportRecorder(this, item, severity, message);
                                recordList.add(record);
                            }
                        }
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
