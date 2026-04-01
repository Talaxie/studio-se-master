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
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.designer.core.i18n.Messages;
import org.talend.designer.core.model.utils.emf.talendfile.ElementParameterType;
import org.talend.designer.core.model.utils.emf.talendfile.NodeType;
import org.talend.designer.core.model.utils.emf.talendfile.ProcessType;

public class DuplicatedRouteIdUsageAnalysisTask extends AbstractItemAnalysisTask {

	@Override
	public List<AnalysisReportRecorder> execute(Item item) {

		ProcessType processType = getProcessType(item);
        if (processType == null) {
            return null;
        }
        
		List<AnalysisReportRecorder> recordList = new ArrayList<AnalysisReportRecorder>();	
		
		
        for (Object nodeObject : processType.getNode()) {
            NodeType currentNode = (NodeType) nodeObject;
            String componentName = currentNode.getComponentName();
            currentNode.getMetadata();
            if (componentName == null) {
                continue;
            }
            
            String componentID = null;
            
            for (Object e : currentNode.getElementParameter()) {
                ElementParameterType p = (ElementParameterType) e;
                if ("UNIQUE_NAME".equals(p.getName())) {
                    componentID = p.getValue();
                }
            }
            
			if ("cConfig".equalsIgnoreCase(componentName) || "cProcessor".equalsIgnoreCase(componentName)
					|| "cJavaDSLProcessor".equalsIgnoreCase(componentName)) {
            	
                for (Object e : currentNode.getElementParameter()) {
                    ElementParameterType p = (ElementParameterType) e;
                    if ("CODE".equals(p.getName())) {
						String value = p.getValue();
						if (value != null && !StringUtils.isEmpty(value) && value.contains(".routeId(")) {
							recordList.add(new AnalysisReportRecorder(this, item, SeverityOption.CRITICAL,
									Messages.getString("DuplicatedRouteIdUsageAnalysisTask.duplicateUsage",
											componentName, componentID)));
						}
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
		return types;
	}

}
