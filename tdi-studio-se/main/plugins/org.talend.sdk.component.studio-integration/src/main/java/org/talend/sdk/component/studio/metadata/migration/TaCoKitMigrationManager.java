/**
 * Copyright (C) 2006-2021 Talaxie Inc. - www.deilink.fr
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package org.talend.sdk.component.studio.metadata.migration;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.exception.PersistenceException;
import org.talend.core.model.properties.ConnectionItem;
import org.talend.core.model.properties.Item;
import org.talend.core.model.properties.JobletProcessItem;
import org.talend.core.model.properties.ProcessItem;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.designer.core.model.utils.emf.talendfile.ElementParameterType;
import org.talend.designer.core.model.utils.emf.talendfile.impl.NodeTypeImpl;
import org.talend.designer.core.model.utils.emf.talendfile.impl.ProcessTypeImpl;
import org.talend.designer.core.utils.JavaProcessUtil;
import org.talend.repository.model.IProxyRepositoryFactory;
import org.talend.sdk.component.server.front.model.ConfigTypeNode;
import org.talend.sdk.component.studio.Lookups;
import org.talend.sdk.component.studio.exception.UserCancelledException;
import org.talend.sdk.component.studio.i18n.Messages;
import org.talend.sdk.component.studio.metadata.TaCoKitCache;
import org.talend.sdk.component.studio.metadata.model.TaCoKitConfigurationModel;
import org.talend.sdk.component.studio.model.update.TaCoKitUpdateManager;
import org.talend.sdk.component.studio.util.TaCoKitUtil;
import org.talend.sdk.component.studio.websocket.WebSocketClient.V1Component;
import org.talend.sdk.component.studio.websocket.WebSocketClient.V1ConfigurationType;
import org.talend.sdk.studio.process.TaCoKitNode;

/**
 * DOC cmeng  class global comment. Detailled comment
 */
public class TaCoKitMigrationManager {

    private V1ConfigurationType configurationClient;

    private final V1Component componentClient = Lookups.client().v1().component();

    public TaCoKitMigrationManager() {
        configurationClient = Lookups.client().v1().configurationType();
    }
    
    public void checkProcessItemMigration(final Item item, final String compType, final IProgressMonitor progressMonitor) throws UserCancelledException {
        IProgressMonitor monitor = progressMonitor;
        if (monitor == null) {
            monitor = new NullProgressMonitor();
        }
        checkMonitor(monitor);
        String label = "";
        try {
            label = item.getProperty().getLabel();
        } catch (Exception e) {
            // ignore exception as it happens only during label retrieval and is not critical
        }
        monitor.subTask(Messages.getString("migration.check.process.item", label));
        checkNodeItemMigration(item, null, compType);
    }

    public void checkProcessItemMigration(final ProcessItem processItem, final String compType,
            final IProgressMonitor progressMonitor) throws UserCancelledException {
        IProgressMonitor monitor = progressMonitor;
        if (monitor == null) {
            monitor = new NullProgressMonitor();
        }
        checkMonitor(monitor);
        String label = "";
        try {
            label = processItem.getProperty().getLabel();
        } catch (Exception e) {
            // ignore exception as it happens only during label retrieval and is not critical
        }
        monitor.subTask(Messages.getString("migration.check.process.item", label));
        checkNodeMigration(processItem, null, compType);
    }

    public void checkNodeMigration(final ProcessItem processItem, String currentNodeName, String componentType) {
        checkNodeItemMigration(processItem, currentNodeName, componentType);
    }
    
    public void checkNodeItemMigration(final Item item, String currentNodeName, String componentType) {
        EList nodes = null;
        if (item instanceof ProcessItem) {
            ProcessItem pi = (ProcessItem) item;
            final ProcessTypeImpl process = (ProcessTypeImpl) pi.getProcess();
            nodes = process.getNode();
        } else if (item instanceof JobletProcessItem) {
            JobletProcessItem jpi = (JobletProcessItem) item;
            nodes = jpi.getJobletProcess().getNode();
        }
        if (nodes == null) {
            return;
        }
        boolean migrated = false;
        TaCoKitCache taCoKitCache = Lookups.taCoKitCache();
        for (final Object elem : nodes) {
            NodeTypeImpl node = (NodeTypeImpl) elem;
            if (TaCoKitNode.isTacokit(node)) {
                if (currentNodeName != null) {
                    if (!node.getComponentName().equals(currentNodeName)) {
                        continue;
                    }
                }
                final TaCoKitNode tacokitNode = new TaCoKitNode(node, componentType);
                String compName = node.getComponentName();
                EList elementParameter = node.getElementParameter();
                // Check from version properties / component version
                boolean needMigration = JavaProcessUtil.needMigration(compName, elementParameter);
                if (needMigration || tacokitNode.needsMigration()) {
                    Map<String, String> migratedProps = null;
                    if (taCoKitCache.isVirtualComponentName(compName)) {
                        if (taCoKitCache.isVirtualConnectionComponent(compName)) {
                            Map<String, String> props = new HashMap<>();
                            for (Object obj : elementParameter) {
                                if (obj instanceof ElementParameterType) {
                                    ElementParameterType ep = (ElementParameterType) obj;
                                    props.put(ep.getName(), ep.getValue());
                                }
                            }
                            String family = Lookups.service().getDetail(compName).get().getId().getFamily();
                            ConfigTypeNode configTypeNode = taCoKitCache.findDatastoreConfigTypeNodeByName(family);
                            String id = configTypeNode.getId();
                            final String version = Optional.ofNullable(props.get(TaCoKitUtil.getVersionPropName(configTypeNode))).orElse("-1");
                            int persistedVersion = Integer.parseInt(version);
                            // metadata migration no need to be encoded yet..
                            migratedProps = configurationClient.migrate(id, persistedVersion, tacokitNode.getPropertiesToMigrate(false));
                        } else {
                            ExceptionHandler.process(new UnsupportedOperationException("Can't migrate the component: " + compName));
                        }
                    } else {
                        String id = tacokitNode.getId();
                        // we encode anything that may be escaped to avoid jsonb transform errors
                        migratedProps = componentClient.migrate(id, tacokitNode.getPersistedVersion(), tacokitNode.getPropertiesToMigrate(true));
                    }
                    tacokitNode.migrate(migratedProps);
                    migrated = true;
                }
            }
        }
        if (migrated) {
            final IProxyRepositoryFactory factory = ProxyRepositoryFactory.getInstance();
            try {
                factory.save(item);
            } catch (PersistenceException e) {
                ExceptionHandler.process(e);
            }
        }
    }


    private void checkMonitor(final IProgressMonitor monitor) throws UserCancelledException {
        if (monitor != null && monitor.isCanceled()) {
            throw new UserCancelledException(Messages.getString("migration.check.cancel")); //$NON-NLS-1$
        }
    }

    public void migrate(final TaCoKitConfigurationModel configModel, final IProgressMonitor progressMonitor) throws Exception {
        IProgressMonitor monitor = progressMonitor;
        if (monitor == null) {
            monitor = new NullProgressMonitor();
        }
        checkMonitor(monitor);
        String label = configModel.getConnection().getLabel();
        final int storedVersion = configModel.getVersion();
        final int newVersion = configModel.getConfigurationVersion();
        monitor.subTask(Messages.getString("migration.check.progress.execute", label, storedVersion, newVersion)); //$NON-NLS-1$

        Map<String, String> migratedProperties = configurationClient.migrate(configModel.getConfigurationId(),
                configModel.getVersion(), configModel.getProperties());
        configModel.migrate(migratedProperties);
    }

    public void updatedRelatedItems(final ConnectionItem item, final String version, final IProgressMonitor progressMonitor) {
        IProgressMonitor monitor = progressMonitor;
        if (monitor == null) {
            monitor = new NullProgressMonitor();
        }
        String label = ""; //$NON-NLS-1$
        try {
            label = item.getProperty().getLabel();
        } catch (Exception e) {
            // ignore
        }

        monitor.subTask(Messages.getString("migration.check.progress.updateRelated", label, version)); //$NON-NLS-1$
        TaCoKitUpdateManager.updateTaCoKitConnection(item, version, false, false);
    }

}
