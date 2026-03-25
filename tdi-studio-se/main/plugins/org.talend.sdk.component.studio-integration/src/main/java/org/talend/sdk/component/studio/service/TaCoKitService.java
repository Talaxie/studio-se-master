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
package org.talend.sdk.component.studio.service;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.log4j.Priority;
import org.eclipse.core.runtime.IProgressMonitor;
import org.talend.commons.CommonsPlugin;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.exception.PersistenceException;
import org.talend.commons.runtime.service.ITaCoKitService;
import org.talend.core.PluginChecker;
import org.talend.core.model.metadata.builder.connection.Connection;
import org.talend.core.model.properties.Item;
import org.talend.core.model.properties.Property;
import org.talend.core.model.properties.impl.ConnectionItemImpl;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.model.repository.IRepositoryViewObject;
import org.talend.core.model.utils.ComponentInstallerTaskRegistryReader;
import org.talend.core.model.utils.IComponentInstallerTask;
import org.talend.core.runtime.CoreRuntimePlugin;
import org.talend.designer.core.utils.UnifiedComponentUtil;
import org.talend.repository.model.IProxyRepositoryFactory;
import org.talend.sdk.component.server.front.model.ComponentDetail;
import org.talend.sdk.component.server.front.model.ConfigTypeNode;
import org.talend.sdk.component.studio.Lookups;
import org.talend.sdk.component.studio.ServerManager;
import org.talend.sdk.component.studio.metadata.TaCoKitCache;
import org.talend.sdk.component.studio.metadata.model.TaCoKitConfigurationModel;
import org.talend.sdk.component.studio.metadata.node.ITaCoKitRepositoryNode;
import org.talend.sdk.component.studio.model.parameter.PropertyDefinitionDecorator;
import org.talend.sdk.component.studio.model.parameter.TableElementParameter;
import org.talend.sdk.component.studio.model.parameter.ValueConverter;
import org.talend.sdk.component.studio.model.parameter.ValueSelectionParameter;
import org.talend.sdk.component.studio.model.parameter.VersionParameter;
import org.talend.sdk.component.studio.toolbar.ReloadAction;
import org.talend.sdk.component.studio.util.TaCoKitUtil;
import org.talend.updates.runtime.service.ITaCoKitUpdateService;


public class TaCoKitService implements ITaCoKitService {

    @Override
    public void start() {
        if (CommonsPlugin.isHeadless() || CommonsPlugin.isJUnitTest() || PluginChecker.isSWTBotLoaded()) {
            // install all of TCK components here
//            installTCKComponents(new NullProgressMonitor());
            ServerManager.getInstance().start();
        } else {
            new Thread(new Runnable() {
              
                @Override
                public void run() {
                    
                    // install all of TCK components here
//                    installTCKComponents(new NullProgressMonitor());
                    
                    // start server
                    ServerManager.getInstance().start();
                }
                
            }, "Starting TaCoKit in background...").start();
        }
    }
    
    public void installTCKComponents(IProgressMonitor monitor) {
        List<IComponentInstallerTask> tasks = ComponentInstallerTaskRegistryReader.getInstance().getTasks(IComponentInstallerTask.COMPONENT_TYPE_TCOMPV1);
        tasks.forEach(t -> {
            try {
                t.install(monitor);
            } catch (InvocationTargetException | InterruptedException e) {
                ExceptionHandler.process(e);
            }
        });
    }

    @Override
    public void waitForStart() {
        ServerManager.getInstance().waitForStart();
    }

    @Override
    public boolean isStarted() throws Exception {
        return ServerManager.getInstance().isStarted();
    }

    @Override
    public String reload(IProgressMonitor monitor) throws Exception {
        String result = new ReloadAction().reload(monitor);
        try {
            TaCoKitUtil.registAllTaCoKitRepositoryTypes();
        } catch (Exception e) {
            ExceptionHandler.process(e);
        }
        return result;
    }

    @Override
    public boolean isTaCoKitCar(File file, IProgressMonitor monitor) throws Exception {
        return ITaCoKitUpdateService.getInstance().isCar(file, monitor);
    }

    @Override
    public boolean isTaCoKitType(Object repoType) {
        if (repoType instanceof ERepositoryObjectType) {
            return TaCoKitUtil.isTaCoKitType((ERepositoryObjectType) repoType);
        } else {
            throw new IllegalArgumentException("Currently only support ERepositoryObjectType, please implement it if needed");
        }
    }

    @Override
    public boolean isTaCoKitConnection(Object connection) {
        if (connection instanceof Connection) {
            return TaCoKitConfigurationModel.isTacokit((Connection) connection);
        }
        return false;
    }

    @Override
    public String getParentItemIdFromItem(Object item) {
        String parentItemId = null;
        if (item instanceof ConnectionItemImpl) {
            Connection connection = ((ConnectionItemImpl) item).getConnection();

            if (connection != null) {
                HashMap properties = connection.getProperties();
                if (properties != null && !properties.isEmpty()) {

                    TaCoKitConfigurationModel taCoKitConfigurationModel = new TaCoKitConfigurationModel(connection);
                    parentItemId = taCoKitConfigurationModel.getParentItemId();
                }
            }
        }
        return parentItemId;
    }

    @Override
    public Object getDatastoreFromDataset(Object obj) {
        if (obj instanceof IRepositoryViewObject) {
            IRepositoryViewObject repositoryViewObject = (IRepositoryViewObject) obj;
            ERepositoryObjectType repositoryObjectType = repositoryViewObject.getRepositoryObjectType();
            if (repositoryObjectType != null && isTaCoKitType(repositoryObjectType)) {

                Property property = repositoryViewObject.getProperty();

                if (property != null) {

                    Item item = property.getItem();

                    if (item instanceof ConnectionItemImpl) {

                        Connection connection = ((ConnectionItemImpl) item).getConnection();

                        if (connection != null) {

                            TaCoKitConfigurationModel taCoKitConfigurationModel = new TaCoKitConfigurationModel(
                                    connection);
                            String parentItemId = taCoKitConfigurationModel.getParentItemId();

                            IProxyRepositoryFactory factory = CoreRuntimePlugin.getInstance()
                                    .getProxyRepositoryFactory();

                            IRepositoryViewObject objParent = null;
                            try {
                                if (factory != null && parentItemId != null) {
                                    objParent = factory.getLastVersion(parentItemId, repositoryObjectType);
                                    if (objParent != null) {
                                        return objParent;
                                    }
                                }

                            } catch (PersistenceException e) {
                                ExceptionHandler.process(e);
                            }
                        }

                    }
                }
            }
        }

        return null;
    }

    @Override
    public boolean isNeedMigration(String componentName, Map<String, String> persistedProperties) {
        componentName = UnifiedComponentUtil.getAdditionalJDBCMappingComponent(componentName);
        TaCoKitCache currentCache = Lookups.taCoKitCache();
        Optional<ComponentDetail> detail = Lookups.service().getDetail(componentName);
        if (!detail.isPresent()) {
            ExceptionHandler.process(new Exception("Can't find component detail for " + componentName), Priority.WARN);
            return false;
        }
        if (currentCache.isVirtualComponentName(componentName)) {
            if (currentCache.isVirtualConnectionComponent(componentName)) {
                ConfigTypeNode configTypeNode = Lookups.taCoKitCache()
                        .findDatastoreConfigTypeNodeByName(detail.get().getId().getFamily());
                int curVersion = configTypeNode.getVersion();
                final String version = Optional
                        .ofNullable(persistedProperties.get(TaCoKitUtil.getVersionPropName(configTypeNode)))
                        .orElse("-1");
                int persistedVersion = Integer.parseInt(version);
                if (persistedVersion < curVersion) {
                    return true;
                }
            }
        } else {
            final Collection<PropertyDefinitionDecorator> properties = PropertyDefinitionDecorator
                    .wrap(detail.get().getProperties());
            for (String key : persistedProperties.keySet()) {
                for (PropertyDefinitionDecorator p : properties) {
                    if (p.getConfigurationType() != null && p.getConfigurationTypeName() != null
                            && (p.getPath() + VersionParameter.VERSION_SUFFIX).equals(key)) {
                        int currentVersion = TaCoKitUtil.getConfigTypeVersion(p, currentCache.getConfigTypeNodes(),
                                detail.get().getId().getFamilyId());
                        int persistedVersion = Integer.parseInt(persistedProperties.get(key));
                        if (currentVersion > persistedVersion) {
                            return true;
                        }
                        break;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public boolean isValueSelectionParameter(Object parameter) {
        return (parameter instanceof ValueSelectionParameter);
    }

    @Override
    public boolean isTaCoKitRepositoryNode(Object node) {
        if (node instanceof ITaCoKitRepositoryNode) {
            return true;
        }
        return false;
    }

    @Override
    public List<Map<String, Object>> convertToTable(String value) {
        return ValueConverter.toTable(value);
    }
    
    @Override
    public List<String> getValuesFromTableParameter(Object parameter, String... keys) {
        if (parameter instanceof TableElementParameter) {
            TableElementParameter tableElementParameter = (TableElementParameter) parameter;
            String value = tableElementParameter.getStringValue();
            return getValuesFromTableParameterValue(value, keys);
        }
        return null;
    }

    @Override
    public List<String> getValuesFromTableParameterValue(String value, String... keys) {
        List<String> valueList = new ArrayList<String>();
        List<Map<String, Object>> listValues = convertToTable(value);
        for (Map<String, Object> map : listValues) {
            for (String key: keys) {
                if (map.containsKey(key)) {
                    valueList.add(map.get(key).toString());
                } 
            }
        }
        return valueList;
    }
}
