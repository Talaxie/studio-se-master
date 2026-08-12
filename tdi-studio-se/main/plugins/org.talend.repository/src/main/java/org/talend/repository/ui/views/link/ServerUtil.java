// ============================================================================
//
// Copyright (C) 2006-2024 Talaxie Inc. - www.deilink.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talaxie SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.repository.ui.views.link;

import java.io.IOException;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.talend.commons.exception.PersistenceException;
import org.talend.core.model.properties.Item;
import org.talend.core.model.properties.ProcessItem;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.model.repository.IRepositoryViewObject;
import org.talend.core.repository.model.ProjectRepositoryNode;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.repository.items.importexport.wizard.models.ImportNodesBuilder;
import org.talend.repository.model.IRepositoryNode;
import org.talend.repository.model.RepositoryNode;
import org.talend.repository.ui.wizards.exportjob.JavaJobScriptsExportWSWizardPage.JobExportType;
import org.talend.repository.ui.wizards.exportjob.scriptsmanager.BuildJobManager;
import org.talend.repository.ui.wizards.exportjob.scriptsmanager.JobScriptsManager.ExportChoice;

public class ServerUtil {

	private static final Logger LOGGER = Logger.getLogger(ServerUtil.class);

	private static ImportNodesBuilder nodesBuilder = new ImportNodesBuilder();

	public static Boolean jobImport(String projectLabel, String jobName) {
		return org.talend.repository.items.importexport.ui.wizard.server.ServerUtil.jobImport(projectLabel, jobName);
	}

	public static boolean importItems(String zipPath, IProgressMonitor monitor, final boolean overwrite, final boolean openThem, boolean needMigrationTask) throws IOException {
		return org.talend.repository.items.importexport.ui.wizard.server.ServerUtil.importItems(zipPath, monitor,
				overwrite, openThem, needMigrationTask);
	}

	public static Boolean jobExport(String fileLocation, String Projet, String Sequenceur) {
		try {
			ProcessItem jobItem = getProcessItem(Sequenceur);
			List<String> defaultFileName = new ArrayList<String>();
			defaultFileName.add(Sequenceur);
			defaultFileName.add(jobItem.getProperty().getVersion());
			String selectedJobVersion = jobItem.getProperty().getVersion();
			String context = "Default";
      Map<ExportChoice, Object> exportChoiceMap = new EnumMap<ExportChoice, Object>(ExportChoice.class);
			exportChoiceMap.put(ExportChoice.needLauncher, Boolean.TRUE);
			exportChoiceMap.put(ExportChoice.needTalendLibraries, Boolean.TRUE);
			exportChoiceMap.put(ExportChoice.launcherName, "All");
			exportChoiceMap.put(ExportChoice.needSystemRoutine, Boolean.TRUE);
			exportChoiceMap.put(ExportChoice.needUserRoutine, Boolean.TRUE);
			exportChoiceMap.put(ExportChoice.needJobItem, Boolean.TRUE);
			exportChoiceMap.put(ExportChoice.needSourceCode, Boolean.TRUE);
			exportChoiceMap.put(ExportChoice.needDependencies, Boolean.TRUE);
			exportChoiceMap.put(ExportChoice.needJobScript, Boolean.TRUE);
			exportChoiceMap.put(ExportChoice.needContext, Boolean.TRUE);
			exportChoiceMap.put(ExportChoice.contextName, context);
			exportChoiceMap.put(ExportChoice.needWebhook, Boolean.FALSE);
			exportChoiceMap.put(ExportChoice.applyToChildren, Boolean.FALSE);
			exportChoiceMap.put(ExportChoice.needParameterValues, Boolean.FALSE);
			exportChoiceMap.put(ExportChoice.binaries, Boolean.TRUE);
			exportChoiceMap.put(ExportChoice.executeTests, Boolean.FALSE);
			exportChoiceMap.put(ExportChoice.includeTestSource, Boolean.FALSE);
			exportChoiceMap.put(ExportChoice.includeLibs, Boolean.TRUE);
			exportChoiceMap.put(ExportChoice.needLog4jLevel, Boolean.FALSE);
			exportChoiceMap.put(ExportChoice.log4jLevel, null);
			JobExportType jobExportType = JobExportType.POJO;
			BuildJobManager.getInstance().buildJob(fileLocation, jobItem, selectedJobVersion, context, exportChoiceMap, jobExportType, new NullProgressMonitor());
		} catch (Exception e) {
			e.printStackTrace();
			if (LOGGER.isInfoEnabled()) {
				LOGGER.info(e);
			}
			return false;
		}

		return true;
	}

	private static ProcessItem getProcessItem(String jobName) {
		try {
			String jobId = getItemId(jobName);
			return (ProcessItem) getItemById(jobId);
		} catch (Exception e) {
			e.printStackTrace();
			if (LOGGER.isInfoEnabled()) {
				LOGGER.info(e);
			}
			return null;
		}
	}

	private static String getItemId(String jobName) {
		RepositoryNode root = ProjectRepositoryNode.getInstance().getRootRepositoryNode(getSupportType());
		IRepositoryNode jobNode = searchNodeByName(root, jobName);
		if (jobNode != null) {
			return jobNode.getObject().getId();
		} else {
			return null;
		}
		// return "_QKNNUGZ8EeWm5YvsrIoYzQ";
	}

	private static IRepositoryNode searchNodeByName(IRepositoryNode node, String nodeName) {
		if (node.getObject() != null && node.getObject().getProperty().getDisplayName().equals(nodeName)) {
			return node;
		}
		for (IRepositoryNode child : node.getChildren()) {
			IRepositoryNode result = searchNodeByName(child, nodeName);
			if (result != null) {
				return result;
			}
		}
		return null;
	}

	private static ERepositoryObjectType getSupportType() {
			return ERepositoryObjectType.PROCESS;
	}

	private static Item getItemById(String jobId) throws PersistenceException {
		IRepositoryViewObject obj = ProxyRepositoryFactory.getInstance().getLastVersion(jobId);
		return obj.getProperty().getItem();
	}

	public static Boolean scriptStart(String scriptLocation, String arg) {
		return org.talend.repository.items.importexport.ui.wizard.server.ServerUtil.scriptStart(scriptLocation, arg);
	}
}
