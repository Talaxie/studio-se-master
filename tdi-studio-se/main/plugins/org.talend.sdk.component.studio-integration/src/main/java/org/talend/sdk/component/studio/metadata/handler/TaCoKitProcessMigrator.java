package org.talend.sdk.component.studio.metadata.handler;

import java.util.List;
import java.util.Optional;

import org.eclipse.core.runtime.IProgressMonitor;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.exception.PersistenceException;
import org.talend.core.model.components.ComponentCategory;
import org.talend.core.model.properties.Item;
import org.talend.core.model.properties.JobletProcessItem;
import org.talend.core.model.properties.ProcessItem;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.model.repository.IRepositoryViewObject;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.repository.ProjectManager;
import org.talend.repository.items.importexport.handlers.model.ImportItem;
import org.talend.repository.items.importexport.manager.ResourcesManager;
import org.talend.sdk.component.studio.Lookups;
import org.talend.sdk.component.studio.metadata.migration.TaCoKitMigrationManager;

public class TaCoKitProcessMigrator extends AbstractImportResourcesHandler {

    private final TaCoKitMigrationManager manager = Lookups.taCoKitCache().getMigrationManager();

    @Override
    public void postImport(IProgressMonitor monitor, ResourcesManager resManager, ImportItem[] importedItemRecords) {
        if (importedItemRecords == null) {
            return;
        }
        for (final ImportItem importItem : importedItemRecords) {
            try {
                Optional<Item> item = getItem(importItem);
                if (item.isPresent()) {
                    manager.checkProcessItemMigration(item.get(), getComponentType(importItem.getRepositoryType()),
                            monitor);
                }
            } catch (Exception e) {
                ExceptionHandler.process(e);
            }
        }
    }

    private String getComponentType(final ERepositoryObjectType type) {
        if (type == null) {
            return ComponentCategory.CATEGORY_4_DI.getName();
        }
        if (type == ERepositoryObjectType.PROCESS_MR) {
            return ComponentCategory.CATEGORY_4_MAPREDUCE.getName();
        }
        if (type == ERepositoryObjectType.PROCESS_SPARK || type == ERepositoryObjectType.SPARK_JOBLET) {
            return ComponentCategory.CATEGORY_4_SPARK.getName();
        }
        if (type == ERepositoryObjectType.PROCESS_SPARKSTREAMING || type == ERepositoryObjectType.SPARK_STREAMING_JOBLET) {
            return ComponentCategory.CATEGORY_4_SPARKSTREAMING.getName();
        }
        if (type == ERepositoryObjectType.PROCESS_STORM) {
            return ComponentCategory.CATEGORY_4_STORM.getName();
        }
        if (type == ERepositoryObjectType.PROCESS_ROUTE || type == ERepositoryObjectType.PROCESS_ROUTELET) {
            return ComponentCategory.CATEGORY_4_CAMEL.getName();
        }
        return ComponentCategory.CATEGORY_4_DI.getName();
    }

    /**
     * Loads repository item. Implementation was copied from
     * ImportBasicHandler.applyMigrationTasks()
     *
     * @param importItem item which is imported
     * @return Process item stored in repository
     * @throws PersistenceException
     */
    private Optional<Item> getItem(final ImportItem importItem) throws PersistenceException {
        List<IRepositoryViewObject> allVersion = ProxyRepositoryFactory
                .getInstance()
                .getAllVersion(ProjectManager.getInstance().getCurrentProject(), importItem.getItemId(), importItem.getImportPath(), importItem.getRepositoryType());
        for (IRepositoryViewObject repositoryObject : allVersion) {
            if (repositoryObject.getProperty().getVersion().equals(importItem.getItemVersion())) {
                final Item item = repositoryObject.getProperty().getItem();
                if (item instanceof ProcessItem || item instanceof JobletProcessItem) {
                    return Optional.of(item);
                }
            }
        }
        return Optional.empty();
    }

}
