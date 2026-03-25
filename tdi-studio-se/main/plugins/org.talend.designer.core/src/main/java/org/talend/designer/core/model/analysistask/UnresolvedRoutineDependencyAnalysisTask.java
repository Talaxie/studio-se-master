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
import org.talend.core.model.general.ModuleNeeded;
import org.talend.core.model.general.ModuleNeeded.ELibraryInstallStatus;
import org.talend.core.model.properties.Item;
import org.talend.core.model.properties.Property;
import org.talend.core.model.properties.RoutineItem;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.designer.core.i18n.Messages;
import org.talend.designer.core.model.utils.emf.component.ComponentFactory;
import org.talend.designer.core.model.utils.emf.component.IMPORTType;
import org.talend.librariesmanager.model.ModulesNeededProvider;

/**
 * DOC apoltavtsev Analysis Task to check missing beans and routines depenencies
 */
public class UnresolvedRoutineDependencyAnalysisTask extends AbstractItemAnalysisTask {

	private static final String VERSION_PATTERN = "-([0-9]+)(.([0-9]+)?)(.([0-9]+)?)";

	@Override
	public List<AnalysisReportRecorder> execute(Item item) {

		List<AnalysisReportRecorder> recordList = new ArrayList<AnalysisReportRecorder>();

		List<IMPORTType> codeImports = cloneCodeImports(item);
		filterDefaultCodeDependencies(codeImports, item);

		for (IMPORTType i : codeImports) {
			if (isMissingDependency(i)) {
				recordList.add(new AnalysisReportRecorder(this, item, SeverityOption.CRITICAL,
						Messages.getString("UnresolvedRoutineDependencyAnalysisTask.missingDependency",
								getCodeItemName(item), i.getMODULE())));
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

	private String getCodeItemName(Item item) {
		if (item != null) {
			Property p = item.getProperty();
			if (p != null) {
				return p.getLabel();
			}
		}
		return "";
	}

	private List<IMPORTType> filterDefaultCodeDependencies(List<IMPORTType> imports, Item item) {
		if (imports != null && item != null) {

			List<ModuleNeeded> defaultDependencies = new ArrayList<ModuleNeeded>();
			if (item instanceof BeanItem) {
				defaultDependencies = ModulesNeededProvider.getModulesNeededForBeans();
			} 
			Set<String> defaultDependenciesNames = new HashSet<String>();
			for (ModuleNeeded module : defaultDependencies) {
				defaultDependenciesNames.add(module.getModuleName().replaceAll(VERSION_PATTERN, ""));
			}
			imports.removeIf(i -> defaultDependenciesNames.contains(i.getMODULE().replaceAll(VERSION_PATTERN, "")));
		}
		return imports;
	}

	private boolean isMissingDependency(IMPORTType dependency) {
		Set<ModuleNeeded> allModules = ModulesNeededProvider.getAllManagedModules();

		for (ModuleNeeded module : allModules) {
			if (areEqualDependencies(dependency, module) && (ELibraryInstallStatus.INSTALLED.equals(module.getStatus())
					|| ELibraryInstallStatus.DEPLOYED.equals(module.getStatus()))) {
				return false;
			}
		}

		return true;
	}

	private boolean areEqualDependencies(IMPORTType dependency, ModuleNeeded module) {

		if (dependency == null || module == null) {
			return false;
		}

		if (StringUtils.equalsIgnoreCase(dependency.getMODULE(), module.getModuleName())) {
			return true;
		}

		return false;
	}

	@Override
	public Set<ERepositoryObjectType> getRepositoryObjectTypeScope() {
		Set<ERepositoryObjectType> types = new HashSet<ERepositoryObjectType>();
		types.addAll(ERepositoryObjectType.getAllTypesOfCodes());
		return types;
	}

}
