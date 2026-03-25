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
import org.eclipse.emf.common.util.EList;
import org.talend.analysistask.AbstractItemAnalysisTask;
import org.talend.analysistask.AnalysisReportRecorder;
import org.talend.analysistask.AnalysisReportRecorder.SeverityOption;
import org.talend.camel.core.model.camelProperties.BeanItem;
import org.talend.core.CorePlugin;
import org.talend.core.ILibraryManagerService;
import org.talend.core.model.general.ModuleNeeded;
import org.talend.core.model.general.ModuleNeeded.ELibraryInstallStatus;
import org.talend.core.model.properties.Item;
import org.talend.core.model.properties.Property;
import org.talend.core.model.properties.RoutineItem;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.designer.core.i18n.Messages;
import org.talend.designer.core.model.utils.emf.component.ComponentFactory;
import org.talend.designer.core.model.utils.emf.component.IMPORTType;
import org.talend.designer.core.model.utils.emf.talendfile.ElementParameterType;
import org.talend.designer.core.model.utils.emf.talendfile.ElementValueType;
import org.talend.designer.core.model.utils.emf.talendfile.NodeType;
import org.talend.designer.core.model.utils.emf.talendfile.ProcessType;
import org.talend.librariesmanager.model.ModulesNeededProvider;

/**
 * DOC apoltavtsev Analysis Task to check missing components dependencies
 */
public class UnresolvedComponentsDependenciesAnalysisTask extends AbstractItemAnalysisTask {

	private static final String VERSION_PATTERN = "-([0-9]+)(.([0-9]+)?)(.([0-9]+)?)";

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
            
            if ("cConfig".equalsIgnoreCase(componentName)) {
            	
                for (Object e : currentNode.getElementParameter()) {
                    ElementParameterType p = (ElementParameterType) e;
                    if ("DRIVER_JAR".equals(p.getName())) {
                        for (Object v : p.getElementValue()) {
                            ElementValueType ev = (ElementValueType) v;
                            String mvnDep = ev.getValue();
                            if (mvnDep != null && !StringUtils.isEmpty(mvnDep) && "JAR_NAME".equalsIgnoreCase(ev.getElementRef())) {
	                            ModuleNeeded module = ModuleNeeded.newInstance(null, mvnDep, null, true);
	                            if (isMissingDependency(module)) {
	                            	recordList.add(new AnalysisReportRecorder(this, item, SeverityOption.CRITICAL,
	                						Messages.getString("UnresolvedComponentsDependenciesAnalysisTask.missingDependency",
	                								geItemName(item), componentID, module)));
	                            }	
                            }
                        }
                    }
                }
            }
            
            if ("cMessagingEndpoint".equalsIgnoreCase(componentName) 
            		|| "tLibraryLoad".equalsIgnoreCase(componentName)) {
            	
                for (Object e : currentNode.getElementParameter()) {
                    ElementParameterType p = (ElementParameterType) e;
                    if ("LIBRARY".equals(p.getName())) {
                    	String mvnDep = p.getValue();
                    	if (mvnDep != null && !StringUtils.isEmpty(mvnDep)) {
                            ModuleNeeded module = ModuleNeeded.newInstance(null, mvnDep, null, true);
	                        if (isMissingDependency(module)) {
	                        	recordList.add(new AnalysisReportRecorder(this, item, SeverityOption.CRITICAL,
	            						Messages.getString("UnresolvedComponentsDependenciesAnalysisTask.missingDependency",
	            								geItemName(item), componentID, module)));
	                        }
                    	}
                    }
                }
            }
        } 


		return recordList;
	}

	@SuppressWarnings("unchecked")
	private List<IMPORTType> cloneCodeImports(Item item) {
		List<IMPORTType> imports = new ArrayList<IMPORTType>();
		if (item != null) {
			EList<IMPORTType> list = null;
			if (item instanceof BeanItem) {
				list = ((BeanItem) item).getImports();
			} else if (item instanceof RoutineItem) {
				list = ((RoutineItem) item).getImports();
			}
			if (list != null) {
				list.forEach(l -> {
					IMPORTType importType = ComponentFactory.eINSTANCE.createIMPORTType();
					importType.setMODULE(l.getMODULE());
					importType.setMESSAGE(l.getMESSAGE());
					importType.setREQUIRED(l.isSetREQUIRED());
					importType.setMVN(l.getMVN());

					importType.setMODULEGROUP(l.getMODULEGROUP());
					importType.setMRREQUIRED(l.isMRREQUIRED());
					importType.setBundleID(l.getBundleID());
					importType.setNAME(l.getNAME());
					importType.setSHOW(l.isSHOW());
					importType.setUrlPath(l.getUrlPath());

					imports.add(importType);
				});
			}
		}
		return imports;
	}

	private String geItemName(Item item) {
		if (item != null) {
			Property p = item.getProperty();
			if (p != null) {
				return p.getLabel();
			}
		}
		return "";
	}

	private boolean isMissingDependency(ModuleNeeded module) {
		
		String moduleName = module.getModuleName();
		
		Set<ModuleNeeded> allModules = ModulesNeededProvider.getAllManagedModules();

		for (ModuleNeeded m : allModules) {
			if (areEqualDependencies(moduleName, m) && (ELibraryInstallStatus.INSTALLED.equals(m.getStatus())
					|| ELibraryInstallStatus.DEPLOYED.equals(m.getStatus()))) {
				return false;
			}
		}
		
		ILibraryManagerService repositoryBundleService = CorePlugin.getDefault().getRepositoryBundleService();
		if (repositoryBundleService.retrieve(module, null, false)) {
		    return false;
		}

		return true;
	}

	private boolean areEqualDependencies(String dependency, ModuleNeeded module) {

		if (dependency == null || module == null) {
			return false;
		}

		if (StringUtils.equalsIgnoreCase(dependency, module.getMavenUri())) {
			return true;
		}

		return false;
	}

	@Override
	public Set<ERepositoryObjectType> getRepositoryObjectTypeScope() {
		Set<ERepositoryObjectType> types = new HashSet<ERepositoryObjectType>();
		types.addAll(ERepositoryObjectType.getAllTypesOfProcess());
		return types;
	}

}
