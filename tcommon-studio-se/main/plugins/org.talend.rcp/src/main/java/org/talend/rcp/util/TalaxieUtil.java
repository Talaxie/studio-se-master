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
package org.talend.rcp.util;

// import org.talend.repository.ui.wizards.exportjob.scriptsmanager.BuildJobManager;
// import org.talend.repository.ui.wizards.exportjob.JavaJobScriptsExportWSWizardPage.JobExportType;

/* Import */
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.zip.ZipFile;
import org.talend.repository.items.importexport.ui.managers.FileResourcesUnityManager;
import org.talend.repository.items.importexport.ui.managers.ResourcesManagerFactory;
// import org.talend.repository.items.importexport.manager.ResourcesManager;
import org.talend.repository.items.importexport.handlers.ImportExportHandlersManager;
import org.talend.repository.items.importexport.handlers.model.ImportItem;
import org.eclipse.core.runtime.NullProgressMonitor;
// import org.talend.repository.items.importexport.wizard.models.ImportNodesBuilder;
import org.eclipse.core.runtime.IProgressMonitor;
import org.talend.commons.runtime.model.emf.provider.EmfResourcesFactoryReader;
import org.talend.commons.runtime.model.emf.provider.ResourceOption;
import org.talend.core.model.properties.Item;
import org.talend.core.model.properties.ProcessItem;
import org.talend.repository.model.IProxyRepositoryFactory;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.commons.runtime.model.repository.ERepositoryStatus;
import org.talend.commons.exception.CommonExceptionHandler;

/* Export */
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import org.talend.repository.ui.wizards.exportjob.scriptsmanager.JobScriptsManager.ExportChoice;

/* Project */
import org.talend.core.model.general.Project;
import org.talend.repository.ui.login.LoginHelper;
import org.talend.core.model.general.ConnectionBean;
import java.util.logging.ErrorManager;
import org.talend.core.model.general.ConnectionBean;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.core.resources.IProject;

public class TalaxieUtil {

  // private static ImportNodesBuilder nodesBuilder = new ImportNodesBuilder();

  /*
  public static ConnectionBean getConnection() {
      ConnectionBean result[] = new ConnectionBean[1];
      Display.getDefault().syncExec(() -> {
          if (connectionsViewer != null) {
              IStructuredSelection sel = (IStructuredSelection) connectionsViewer.getSelection();
              result[0] = (ConnectionBean) sel.getFirstElement();
          } else {
              result[0] = (ConnectionBean) connectionLabel.getData();
          }
      });
      return result[0];
  }
  */

  public static void getProjects() {
    try {
      // ErrorManager errorManager = null;
      // ConnectionBean connection = getConnection();
      // Project[] projects = LoginHelper.getInstance().getProjects(connection);
      // for (Project project : projects) {
      //     System.out.print("project : " + project.getTechnicalLabel());
      // }
      IProject[] projects = org.eclipse.core.resources.ResourcesPlugin.getWorkspace().getRoot().getProjects();
      for (IProject project : projects) {
          System.out.print("project : " + project.getName());
      }
    } catch (Exception e) {
      e.printStackTrace();
    }

    return;
  }

  public static void importZipFile(String zipFilePath, String jobName) {
    try {
      /*
      String zipPath = zipFilePath;
      IProgressMonitor monitor = new NullProgressMonitor();
      boolean overwrite = true;
      boolean openThem = true;
      boolean needMigrationTask = false;
      ZipFile srcZipFile = new ZipFile(zipPath);
      final ResourcesManager resourcesManager = ResourcesManagerFactory.getInstance().createResourcesManager(srcZipFile);
      final ResourceOption importOption = ResourceOption.DEMO_IMPORTATION;
      try {
          EmfResourcesFactoryReader.INSTANCE.addOption(importOption);

          resourcesManager.collectPath2Object(srcZipFile);
          final ImportExportHandlersManager importManager = new ImportExportHandlersManager();
          final List<ImportItem> items = populateItems(importManager, resourcesManager, monitor, overwrite);
          final List<String> itemIds = new ArrayList<String>();

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
          if (items != null && !items.isEmpty()) {
              importManager.importItemRecords(monitor, resourcesManager, items, overwrite, nodesBuilder.getAllImportItemRecords(), null);
          }
      } catch (Exception e) {
          CommonExceptionHandler.process(e);
      } finally {
          if (resourcesManager != null) {
              resourcesManager.closeResource();
          }
          nodesBuilder.clear();

          EmfResourcesFactoryReader.INSTANCE.removOption(importOption);
      }
      */
    } catch (Exception e) {
      e.printStackTrace();
    }

    return;
  }

  public static Boolean exportZipFile(String zipFilePath) {
    Map<ExportChoice, Object> exportChoiceMap = new EnumMap<>(ExportChoice.class);
    exportChoiceMap.put(ExportChoice.needUserRoutine, Boolean.TRUE);
    exportChoiceMap.put(ExportChoice.needLog4jLevel, false);
    exportChoiceMap.put(ExportChoice.applyToChildren, false);
    exportChoiceMap.put(ExportChoice.needParameterValues, false);
    exportChoiceMap.put(ExportChoice.needTalendLibraries, true);
    exportChoiceMap.put(ExportChoice.needTalendLibraries, true);
    exportChoiceMap.put(ExportChoice.launcherName, "All");
    exportChoiceMap.put(ExportChoice.needSystemRoutine, true);
    exportChoiceMap.put(ExportChoice.contextName, "Default");
    exportChoiceMap.put(ExportChoice.includeLibs, true);
    exportChoiceMap.put(ExportChoice.needWebhook, false);
    exportChoiceMap.put(ExportChoice.needDependencies, true);
    exportChoiceMap.put(ExportChoice.binaries, true);
    exportChoiceMap.put(ExportChoice.needJobScript, Boolean.TRUE);
    exportChoiceMap.put(ExportChoice.needJobItem, true);
    exportChoiceMap.put(ExportChoice.includeTestSource, false);
    exportChoiceMap.put(ExportChoice.addStatistics, true);
    exportChoiceMap.put(ExportChoice.needLauncher, true);
    exportChoiceMap.put(ExportChoice.executeTests, false);
    exportChoiceMap.put(ExportChoice.needSourceCode, true);
    exportChoiceMap.put(ExportChoice.needContext, true);
    exportChoiceMap.put(ExportChoice.log4jLevel, null);

    // String ProcessType = BuildJobManager.getProcessType();
    // System.out.print("ProcessType : " + ProcessType);
    /*
    buildJob(
      "C:\Talend\TOS_DI-talaxie\OnBoardingDemoJob_0.1.zip",         // X String destinationPath, 
      item,                                                         // - ProcessItem itemToExport, 
      "0.1",                                                        // X String version, 
      "Default",                                                    // X String context, 
      exportChoiceMap,                                              // X Map<ExportChoice, Object> exportChoiceMap, 
      JobExportType.POJO,                                           // X JobExportType jobExportType, 
      pMonitor                                                      // - IProgressMonitor monitor 
    );

    try {
      BuildJobManager.getInstance().buildJob(
        destinationStr, 
        checkedNodes, 
        getDefaultFileName(),
        getSelectedJobVersion(), 
        context.toString(), 
        exportChoiceMap, 
        jobExportType, 
        monitor
      );
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }
    */

    return true;
  }

  /*
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
  */
}

/*

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.talend.core.CorePlugin;
import org.talend.core.model.properties.Item;
import org.talend.core.model.repository.IRepositoryViewObject;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.core.repository.ui.actions.ImportFileAction;
import org.talend.repository.model.RepositoryNode;
import org.talend.repository.model.RepositoryNodeUtilities;
import org.talend.repository.ui.views.IRepositoryView;

public class TalaxieUtil {

  public static void importZipFile(String zipFilePath) {
      // Obtenez l'instance du référentiel Talend
      ProxyRepositoryFactory repositoryFactory = ProxyRepositoryFactory.getInstance();
      IRepositoryView repositoryView = CorePlugin.getDefault().getRepositoryService().getProxyRepositoryView();

      // Créez un dossier temporaire pour l'importation
      IFolder tempFolder = ResourcesPlugin.getWorkspace().getRoot().getFolder(ResourcesPlugin.getWorkspace().getRoot().getFullPath().append("TempImportFolder"));

      // Créez un fichier temporaire pour le fichier ZIP
      IFile tempZipFile = tempFolder.getFile("tempImport.zip");

      // Copiez le fichier ZIP dans le dossier temporaire
      // Assurez-vous que le fichier ZIP est accessible depuis le chemin spécifié
      // (remplacez "/chemin/vers/votre/fichier.zip" par le chemin réel de votre fichier ZIP)
      // Notez que cette étape peut nécessiter une gestion appropriée des exceptions.
      // Vous pouvez utiliser java.nio.file.Files.copy pour effectuer la copie.
      // Exemple :
      // java.nio.file.Files.copy(Paths.get("/chemin/vers/votre/fichier.zip"),
      //     tempZipFile.getLocation().toFile().toPath(), StandardCopyOption.REPLACE_EXISTING);

      // Obtenez le nœud de dossier pour le dossier temporaire
      RepositoryNode tempFolderNode = RepositoryNodeUtilities.getRepositoryNode(tempFolder, repositoryView);

      try {
          // Importez le fichier ZIP dans le dossier temporaire
          ImportFileAction importFileAction = new ImportFileAction(tempFolderNode);
          importFileAction.setFiles(new String[] { tempZipFile.getLocation().toOSString() });

          // Exécutez l'action d'importation
          importFileAction.run();

          // Récupérez les objets importés (si nécessaire)
          Item[] importedItems = importFileAction.getImportedItems();
          for (Item item : importedItems) {
              // Traitez les objets importés selon vos besoins
              System.out.println("Item imported: " + item.getLabel());
          }
      } catch (Exception e) {
          e.printStackTrace();
          // Gérez les erreurs d'importation
      } finally {
          // Nettoyez les ressources temporaires si nécessaire
          // Assurez-vous que vous ne modifiez pas ces ressources si elles sont toujours nécessaires
          // tempZipFile.delete(true, null);
          // tempFolder.delete(true, null);
      }
  }

}
*/

/*

import org.talend.core.model.properties.Item;
import org.talend.repository.model.RepositoryNode;
import org.talend.repository.ui.wizards.imports.TalendImportBuilder;

public class TalaxieUtil {

  public static void importZipFile(String zipFilePath) {
    // Créez un objet ImportItemBuilder
    ImportItemBuilder importItemBuilder = new ImportItemBuilder(zipFilePath);

    // Configurez l'importation selon vos besoins
    // Par exemple, définissez le chemin de destination, la stratégie de remplacement, etc.
    importItemBuilder.setDestinationFolder("/");
    importItemBuilder.setOverwrite(false);

    // Obtenez la liste des éléments à importer
    Item[] itemsToImport = importItemBuilder.getImportItems();

    // Importez les éléments dans le projet
    TalendImportBuilder talendImportBuilder = new TalendImportBuilder();
    RepositoryNode destinationFolder = talendImportBuilder.getFolderFromPath("/");
    talendImportBuilder.addItemsToDestinationFolder(itemsToImport, destinationFolder, false);
  }

}
*/

/*
import org.talend.repository.items.importexport.ui.actions.ImportItemsAction;

public class TalaxieUtil {
  public static void importZipFile(String zipFilePath) {
    // Création d'une instance de l'action d'import
    ImportItemsAction importAction = new ImportItemsAction();
    importAction.setZipFile(zipFilePath);

    // Vous pouvez également spécifier d'autres options d'import si nécessaire
    // importAction.setSomeOtherOption(value);

    // Exécution de l'action d'import
    importAction.run();
  }
}
*/

/*
import org.talend.repository.items.importexport.ui.actions.ImportItemsAction;
import org.talend.repository.items.importexport.ui.wizard.imports.ImportArchiveHelper;
import org.talend.repository.items.importexport.ui.wizard.imports.ZipFileImportWizard;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

public class TalaxieUtil {
  public static void importZipFile(String zipFilePath) {
    ImportItemsAction importAction = new ImportItemsAction();

    ZipFileImportWizard wizard = new ZipFileImportWizard();
    wizard.setImportItemHelper(new ImportArchiveHelper(zipFilePath));
    
    Shell activeShell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
    importAction.setShell(activeShell);
    importAction.setWizard(wizard);
    
    importAction.run();
  }
}
*/
