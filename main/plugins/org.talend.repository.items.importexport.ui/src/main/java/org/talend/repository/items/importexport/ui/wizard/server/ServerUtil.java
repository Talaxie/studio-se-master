// ============================================================================
//
// Copyright (C) 2006-2024 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.repository.items.importexport.ui.wizard.server;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.talend.commons.runtime.model.emf.provider.EmfResourcesFactoryReader;
import org.talend.commons.runtime.model.emf.provider.ResourceOption;
import org.talend.commons.runtime.model.repository.ERepositoryStatus;
import org.talend.core.model.properties.Item;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.core.service.IExchangeService;
import org.talend.core.service.IStudioLiteP2Service;
import org.talend.core.service.IStudioLiteP2Service.IInstallableUnitInfo;
import org.talend.core.ui.advanced.composite.FilteredCheckboxTree;
import org.talend.core.ui.branding.IBrandingService;
import org.talend.core.ui.component.ComponentPaletteUtilities;
import org.talend.designer.core.IMultiPageTalendEditor;
import org.talend.designer.maven.tools.AggregatorPomsHelper;
import org.talend.designer.maven.tools.MavenPomSynchronizer;
import org.talend.migration.MigrationReportHelper;
import org.talend.repository.items.importexport.handlers.ImportExportHandlersManager;
import org.talend.repository.items.importexport.handlers.imports.IImportItemsHandler;
import org.talend.repository.items.importexport.handlers.imports.ImportBasicHandler;
import org.talend.repository.items.importexport.handlers.imports.ImportCacheHelper;
import org.talend.repository.items.importexport.handlers.imports.ImportDependencyRelationsHelper;
import org.talend.repository.items.importexport.handlers.model.EmptyFolderImportItem;
import org.talend.repository.items.importexport.handlers.model.ImportItem;
import org.talend.repository.items.importexport.manager.ResourcesManager;
import org.talend.repository.items.importexport.ui.dialog.ShowErrorsDuringImportItemsDialog;
import org.talend.repository.items.importexport.ui.i18n.Messages;
import org.talend.repository.items.importexport.ui.managers.FileResourcesUnityManager;
import org.talend.repository.items.importexport.ui.managers.ResourcesManagerFactory;
import org.talend.repository.items.importexport.ui.wizard.imports.providers.ImportItemsViewerContentProvider;
import org.talend.repository.items.importexport.ui.wizard.imports.providers.ImportItemsViewerFilter;
import org.talend.repository.items.importexport.ui.wizard.imports.providers.ImportItemsViewerLabelProvider;
import org.talend.repository.items.importexport.ui.wizard.imports.providers.ImportItemsViewerSorter;
import org.talend.repository.items.importexport.wizard.models.FolderImportNode;
import org.talend.repository.items.importexport.wizard.models.ImportNode;
import org.talend.repository.items.importexport.wizard.models.ImportNodesBuilder;
import org.talend.repository.items.importexport.wizard.models.ItemImportNode;
import org.talend.repository.model.IProxyRepositoryFactory;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.talend.core.model.properties.ProcessItem;
import org.talend.commons.exception.CommonExceptionHandler;
import org.talend.core.ui.webService.Webhook;

public class ServerUtil {

	private static final Logger LOGGER = Logger.getLogger(ServerUtil.class);

	private static ImportNodesBuilder nodesBuilder = new ImportNodesBuilder();

	public static Boolean jobImport(String projectLabel, String jobName) {
		try {
			HashMap<String, String> job = Webhook.JobArchiveGet("ref_DEV", projectLabel, jobName, "Talend");
			String jobZipPath = job.get("jobZipPath");
			importItems(jobZipPath, new NullProgressMonitor(), true, true, false);
		} catch (Exception e) {
			e.printStackTrace();
			if (LOGGER.isInfoEnabled()) {
				LOGGER.info(e);
			}
			return false;
		}

		return true;
	}

	public static boolean importItems(String zipPath, IProgressMonitor monitor, final boolean overwrite, final boolean openThem, boolean needMigrationTask) throws IOException {
		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("importItems");
			LOGGER.info(zipPath);
		}
		ZipFile srcZipFile = new ZipFile(zipPath);
		final ResourcesManager resourcesManager = ResourcesManagerFactory.getInstance().createResourcesManager(srcZipFile);
		final ResourceOption importOption = ResourceOption.DEMO_IMPORTATION;
		try {
			if (LOGGER.isInfoEnabled()) {
				LOGGER.info("importItems #1");
			}
			EmfResourcesFactoryReader.INSTANCE.addOption(importOption);

			resourcesManager.collectPath2Object(srcZipFile);
			final ImportExportHandlersManager importManager = new ImportExportHandlersManager();
			final List<ImportItem> items = populateItems(importManager, resourcesManager, monitor, overwrite);
			final List<String> itemIds = new ArrayList<String>();
			if (LOGGER.isInfoEnabled()) {
				LOGGER.info("importItems #2");
			}

			for (ImportItem itemRecord : items) {
				Item item = itemRecord.getProperty().getItem();
				if (item instanceof ProcessItem) {
					// only select jobs
					itemIds.add(item.getProperty().getId());
				}
				IProxyRepositoryFactory factory = ProxyRepositoryFactory.getInstance();
				if (item.getState().isLocked()) {
					factory.unlock(item);
				}
				ERepositoryStatus status = factory.getStatus(item);
				if (status != null && status == ERepositoryStatus.LOCK_BY_USER) {
					factory.unlock(item);
				}
				if (!needMigrationTask) {
					itemRecord.setMigrationTasksToApply(null);
				}
			}
			// importManager.importItemRecords(new NullProgressMonitor(), resourcesManager, items, overwrite,
			// nodesBuilder.getAllImportItemRecords(), null);
			if (items != null && !items.isEmpty()) {
				importManager.importItemRecords(monitor, resourcesManager, items, overwrite, nodesBuilder.getAllImportItemRecords(), null);
			}
		} catch (Exception e) {
			CommonExceptionHandler.process(e);
			if (LOGGER.isInfoEnabled()) {
				LOGGER.info(e);
			}
		} finally {
			// clean
			if (resourcesManager != null) {
				resourcesManager.closeResource();
			}
			nodesBuilder.clear();

			EmfResourcesFactoryReader.INSTANCE.removOption(importOption);
		}
		return true;
	}

	private static List<ImportItem> populateItems(final ImportExportHandlersManager importManager, final ResourcesManager resourcesManager, IProgressMonitor monitor, final boolean overwrite) {
			List<ImportItem> selectedItemRecords = new ArrayList<ImportItem>();
			nodesBuilder.clear();
			if (resourcesManager != null) { // if resource is not init successfully.
					try {
							// List<ImportItem> items = importManager.populateImportingItems(resourcesManager, overwrite,
							// new NullProgressMonitor(), true);
							List<ImportItem> items = importManager.populateImportingItems(resourcesManager, overwrite, monitor, true);
							nodesBuilder.addItems(items);
					} catch (Exception e) {
							CommonExceptionHandler.process(e);
					}
			}
			ImportItem[] allImportItemRecords = nodesBuilder.getAllImportItemRecords();
			selectedItemRecords.addAll(Arrays.asList(allImportItemRecords));
			Iterator<ImportItem> itemIterator = selectedItemRecords.iterator();
			while (itemIterator.hasNext()) {
					ImportItem item = itemIterator.next();
					if (!item.isValid()) {
							itemIterator.remove();
					}
			}
			return selectedItemRecords;
	}

	public static Boolean jobExport(String fileLocation, String Projet, String Sequenceur, String version, String NexusRepo) {
		try {
			Webhook.export(fileLocation, Projet, Sequenceur, version, null, NexusRepo, null);
		} catch (Exception e) {
			e.printStackTrace();
			if (LOGGER.isInfoEnabled()) {
				LOGGER.info(e);
			}
			return false;
		}

		return true;
	}

	public static Boolean scriptStart(String scriptLocation, String arg) {
		try {
			List<String> args = new ArrayList<>();
			args.add(arg);
			Webhook.scriptStart(scriptLocation, args);
		} catch (Exception e) {
			e.printStackTrace();
			if (LOGGER.isInfoEnabled()) {
				LOGGER.info(e);
			}
			return false;
		}

		return true;
	}
}
