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
package org.talend.sdk.component.studio.metadata.handler;

import static org.talend.core.model.metadata.designerproperties.RepositoryToComponentProperty.addQuotesIfNecessary;
import static org.talend.sdk.component.studio.model.parameter.PropertyDefinitionDecorator.PATH_SEPARATOR;
import static org.talend.sdk.component.studio.util.TaCoKitUtil.isEmpty;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.lang3.StringUtils;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.components.api.properties.ComponentProperties;
import org.talend.core.model.components.IComponent;
import org.talend.core.model.components.IComponentsService;
import org.talend.core.model.metadata.IMetadataTable;
import org.talend.core.model.metadata.builder.connection.Connection;
import org.talend.core.model.metadata.builder.connection.DatabaseConnection;
import org.talend.core.model.metadata.builder.connection.TacokitDatabaseConnection;
import org.talend.core.model.process.EParameterFieldType;
import org.talend.core.model.process.IElement;
import org.talend.core.model.process.IElementParameter;
import org.talend.core.model.process.INode;
import org.talend.core.model.properties.ConnectionItem;
import org.talend.core.model.properties.Item;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.model.utils.AbstractDragAndDropServiceHandler;
import org.talend.core.model.utils.IComponentName;
import org.talend.core.repository.RepositoryComponentSetting;
import org.talend.core.utils.TalendQuoteUtils;
import org.talend.designer.core.utils.UnifiedComponentUtil;
import org.talend.repository.model.RepositoryNode;
import org.talend.sdk.component.server.front.model.ComponentDetail;
import org.talend.sdk.component.server.front.model.ComponentDetailList;
import org.talend.sdk.component.server.front.model.ComponentId;
import org.talend.sdk.component.server.front.model.ComponentIndex;
import org.talend.sdk.component.server.front.model.ComponentIndices;
import org.talend.sdk.component.server.front.model.ConfigTypeNode;
import org.talend.sdk.component.server.front.model.SimplePropertyDefinition;
import org.talend.sdk.component.studio.ComponentModel;
import org.talend.sdk.component.studio.IAdditionalJDBCComponent;
import org.talend.sdk.component.studio.Lookups;
import org.talend.sdk.component.studio.metadata.model.TaCoKitConfigurationModel;
import org.talend.sdk.component.studio.metadata.model.TaCoKitConfigurationModel.ValueModel;
import org.talend.sdk.component.studio.metadata.node.ITaCoKitRepositoryNode;
import org.talend.sdk.component.studio.model.parameter.PropertyDefinitionDecorator;
import org.talend.sdk.component.studio.model.parameter.ValueConverter;
import org.talend.sdk.component.studio.util.TaCoKitConst;
import org.talend.sdk.component.studio.util.TaCoKitUtil;
import org.talend.sdk.component.studio.websocket.WebSocketClient.V1Component;
import org.talend.sdk.studio.process.TaCoKitNode;

public class TaCoKitDragAndDropHandler extends AbstractDragAndDropServiceHandler {

    private static final String TACOKIT = TaCoKitConst.METADATA_TACOKIT.name();

    private static final String INPUT = "Input"; //$NON-NLS-1$

    private static final String OUTPUT = "Output"; //$NON-NLS-1$

    private static final String NETSUITE = "NetSuite"; //$NON-NLS-1$

    @Override
    public boolean canHandle(final Connection connection) {
        if (connection == null) {
            return false;
        }
        try {
            if (TaCoKitConfigurationModel.isTacokit(connection)) {
                return true;
            }
        } catch (Exception e) {
            ExceptionHandler.process(e);
        }
        return false;
    }

    /**
     * Retrieves persisted value (value stored in repository) by {@code repositoryKey}
     *
     * @param connection object, which stores persisted values
     * @param repositoryKey repository value key
     * @param table component schema value
     * @param targetComponent name of a target component
     * @return persisted value
     */
    @Override
    public Object getComponentValue(final Connection connection, final String repositoryKey, final IMetadataTable table,
            final String targetComponent, Map<Object, Object> contextMap) {
        Objects.requireNonNull(targetComponent, "targetComponent should not be null");
        if (connection == null || isEmpty(repositoryKey)) {
            return null;
        }
        ValueModel valueModel = null;
        TaCoKitConfigurationModel model = null;
        String key = null;
        try {
            model = new TaCoKitConfigurationModel(connection);
            if (TaCoKitNode.TACOKIT_METADATA_TYPE_ID.equals(repositoryKey)) {
                return model.getConfigurationId();
            }
            key = computeKey(model, repositoryKey, targetComponent);
            valueModel = model.getValue(key);
        } catch (Exception e) {
            ExceptionHandler.process(e);
        }
        if (valueModel == null || valueModel.getValue() == null) {
            return null;
        }
        EParameterFieldType fieldType = null;
        if (model != null) {
            fieldType = model.getEParameterFieldType(key);
        }
        if (TaCoKitConst.TYPE_STRING.equalsIgnoreCase(valueModel.getType())
                && !EParameterFieldType.CLOSED_LIST.equals(fieldType)) {
            return addQuotesIfNecessary(connection, valueModel.getValue());
        } else if (EParameterFieldType.TABLE.equals(fieldType)
                || EParameterFieldType.TACOKIT_SUGGESTABLE_TABLE.equals(fieldType)) {
            String value = valueModel.getValue();
            if (TaCoKitConst.CONFIG_NODE_ID_DATASET.equalsIgnoreCase(model.getConfigTypeNode().getConfigurationType())) {

                String tableValue = getTableParameterValue(value, key);
                return model.convertParameterValue(repositoryKey, key, tableValue);
            }
            return model.convertParameterValue(repositoryKey, key, valueModel.getValue());
        } else {
            return valueModel.getValue();
        }
    }

    private String getTableParameterValue(String objectValue, String parentKey) {
        if (objectValue == null || objectValue instanceof String) {
            final List<Map<String, Object>> tableValue = ValueConverter.toTable(objectValue);
            Map<String, Object> newMap = new HashMap<String, Object>();
            for (Map<String, Object> map : tableValue) {

                Set<Entry<String, Object>> entrySet = map.entrySet();
                Iterator<Entry<String, Object>> iterator = entrySet.iterator();

                while (iterator.hasNext()) {
                    Entry<String, Object> next = iterator.next();
                    String k = next.getKey();
                    String substringAfter = StringUtils.substringAfter(k, "[]");
                    String newKey = parentKey + "[]" + substringAfter;

                    newMap.put(newKey, next.getValue());

                }
            }
            if (newMap.size() > 0) {

                objectValue = newMap.toString();
            }
        }
        return objectValue;
    }
    /**
     * Computes stored key (a key which is used to store specific parameter value) from {@code parameterId} of specified {@code component}
     *
     * @param model object which stores persisted values
     * @param parameterId parameter id
     * @param component component name
     * @return stored value key
     * @throws Exception Exception should be handled by ExceptionHandler
     */
    private String computeKey(final TaCoKitConfigurationModel model, String parameterId, String component) throws Exception {
        if (Lookups.taCoKitCache().isVirtualComponentName(component)) {
            List<SimplePropertyDefinition> propertiesList = model.getConfigTypeNode().getProperties();
            if (TaCoKitConst.CONFIG_NODE_ID_DATASTORE.equalsIgnoreCase(model.getConfigTypeNode().getConfigurationType())) {
                for (SimplePropertyDefinition p : propertiesList) {
                    if (StringUtils.equals(parameterId, p.getPath())) {
                        return parameterId;
                    }
                }
            } else {
                ComponentDetail detail = retrieveDetail(component);
                String configPath = TaCoKitUtil.getConfigurationPath(propertiesList);
                String datastorePath = TaCoKitUtil.getDatastorePath(propertiesList);
                if (datastorePath != null && configPath != null) {
                    String parameterIdInDateset = parameterId.replaceFirst(configPath, datastorePath);
                    for (SimplePropertyDefinition p : propertiesList) {
                        if (StringUtils.equals(parameterIdInDateset, p.getPath())) {
                            return parameterIdInDateset;
                        }
                    }
                }
            }
            return null;
        } else {
            final Map<String, PropertyDefinitionDecorator> tree = retrieveProperties(component);
            Optional<String> configPath = findConfigPath(tree, model, parameterId);
            String modelRoot = findModelRoot(model.getProperties());
            if (configPath.isPresent()) {
                return parameterId.replace(configPath.get(), modelRoot);
            } else {
                return null;
            }
        }
    }
    
    private String findModelRoot(final Map<String, String> values) {
        List<String> possibleRoots = values.keySet().stream()
            .filter(key -> key.contains(PATH_SEPARATOR))
            .map(key -> key.substring(0, key.indexOf(PATH_SEPARATOR)))
            .distinct()
            .collect(Collectors.toList());
    
        if (possibleRoots.size() != 1) {
            throw new IllegalStateException("Multiple roots found. Can't guess correct one: " + possibleRoots);
        }
        return possibleRoots.get(0);
    }

    private Map<String, PropertyDefinitionDecorator> retrieveProperties(final String component) {
        final ComponentDetail detail = retrieveDetail(component);
        return buildPropertyTree(detail);
    }

    private Optional<String> findConfigPath(final Map<String, PropertyDefinitionDecorator> tree, final TaCoKitConfigurationModel model, final String parameterId) throws Exception {
        final ConfigTypeNode configTypeNode = model.getConfigTypeNode();
        final String configType = configTypeNode.getConfigurationType();
        final String configName = configTypeNode.getName();

        for (PropertyDefinitionDecorator current = tree.get(parameterId); current != null; current = tree.get(current.getParentPath())) {
            if (configType.equals(current.getConfigurationType())
                    && configName.equals(current.getConfigurationTypeName())) {
                return Optional.of(current.getPath());
            }
        }
        return Optional.empty();
    }

    private ComponentDetail retrieveDetail(final String component) {
        if (Lookups.taCoKitCache().isVirtualComponentName(component)) {
            return Lookups.taCoKitCache().getComponentDetailByName(component);
        }
        final ComponentIndices indices = client().getIndex(language());
        final ComponentId id = indices.getComponents().stream().map(ComponentIndex::getId)
                .filter(i -> component.equals(TaCoKitUtil.getFullComponentName(i.getFamily(), i.getName())))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(component + " not found"));

        final ComponentDetailList detailList = client()
                .getDetail(language(), new String[] { id.getId() });
        if (detailList.getDetails().size() != 1) {
            throw new IllegalArgumentException("No single detail for " + component);
        }
        return detailList.getDetails().get(0);
    }

    private Map<String, PropertyDefinitionDecorator> buildPropertyTree(final ComponentDetail detail) {
        final Map<String, PropertyDefinitionDecorator> tree = new HashMap<>();
        final Collection<PropertyDefinitionDecorator> properties = PropertyDefinitionDecorator.wrap(detail.getProperties());
        properties.forEach(p -> tree.put(p.getPath(), p));
        return tree;
    }

    private V1Component client() {
        return Lookups.client().v1().component();
    }

    private String language() {
        return Locale.getDefault().getLanguage();
    }

    @Override
    public List<IComponent> filterNeededComponents(final Item item, final RepositoryNode selectedNode,
            final ERepositoryObjectType type) {

        List<IComponent> neededComponents = new ArrayList<IComponent>();
        
        ITaCoKitRepositoryNode taCoKitRepositoryNode = null;
        if (selectedNode instanceof ITaCoKitRepositoryNode) {
            taCoKitRepositoryNode = (ITaCoKitRepositoryNode)selectedNode;
            if (!((ITaCoKitRepositoryNode) selectedNode).isLeafNode()) {
                return neededComponents;
            }
        } else if ((taCoKitRepositoryNode = getParentTaCoKitRepositoryNode(selectedNode)) == null){
            return neededComponents;
        }
        ITaCoKitRepositoryNode tacokitNode = taCoKitRepositoryNode;
        ConfigTypeNode configTypeNode = tacokitNode.getConfigTypeNode();
        ConfigTypeNode familyTypeNode = Lookups.taCoKitCache().getFamilyNode(configTypeNode);
        String familyName = familyTypeNode.getName();
        String configType = configTypeNode.getConfigurationType();
        String configName = configTypeNode.getName();

        boolean isAdditionalJDBC = false;
        String productId = null;
        if (ConnectionItem.class.isInstance(item)) {
            Connection connection = ConnectionItem.class.cast(item).getConnection();
            if (DatabaseConnection.class.isInstance(connection)) {
                DatabaseConnection dbconn = DatabaseConnection.class.cast(connection);
                productId = dbconn.getProductId();
                if (UnifiedComponentUtil.isAdditionalJDBC(dbconn.getProductId())) {
                    isAdditionalJDBC = true;
                }
            }
        }
        for (IComponent component : IComponentsService.get().getComponentsFactory().readComponents()) {
            if (ComponentModel.class.isInstance(component)) {
                if (isAdditionalJDBC && (!IAdditionalJDBCComponent.class.isInstance(component) || !IAdditionalJDBCComponent.class
                        .cast(component).getDatabaseType().equals(StringUtils.deleteWhitespace(productId)))) {
                    continue;
                }
                if (!isAdditionalJDBC && IAdditionalJDBCComponent.class.isInstance(component)) {
                    continue;
                }
                if (!isAdditionalJDBC) {
                    String componentName = component.getName().toLowerCase();
                    if (componentName.contains("jdbcoutputbulk") || componentName.contains("jdbcbulk")) {
                        continue;
                    }
                }
                if (ComponentModel.class.cast(component).supports(familyName, configType, configName)) {
                    neededComponents.add(component);
                }
            }
        }

        return neededComponents;

    }
    
    private ITaCoKitRepositoryNode getParentTaCoKitRepositoryNode(RepositoryNode selectedNode) {
        while (selectedNode.getParent() != null) {
            if (selectedNode.getParent() instanceof ITaCoKitRepositoryNode) {
                return (ITaCoKitRepositoryNode)selectedNode.getParent();
            }
            selectedNode = selectedNode.getParent();
        }
        
        return null;
    }

    @Override
    public IComponentName getCorrespondingComponentName(final Item item, final ERepositoryObjectType type) {
        RepositoryComponentSetting setting = null;
        if (item instanceof ConnectionItem) {
            try {
                TaCoKitConfigurationModel configurationModel = new TaCoKitConfigurationModel(((ConnectionItem) item).getConnection());
                if (configurationModel == null || TaCoKitUtil.isEmpty(configurationModel.getConfigurationId())) {
                    return setting;
                }
                setting = new RepositoryComponentSetting();
                setting.setName(TACOKIT);
                setting.setRepositoryType(TACOKIT);
                setting.setWithSchema(true);
                Connection connection = ((ConnectionItem) item).getConnection();
                String componentMainName = getComponentMainName(connection, type);
                if (componentMainName != null) {
                    setting.setInputComponent(getInputComponentName(componentMainName));
                    setting.setOutputComponent(getOutputComponentName(componentMainName));
                    setting.setDefaultComponent(getInputComponentName(componentMainName));
                }
                List<Class<Item>> list = new ArrayList<Class<Item>>();
                Class clazz = null;
                try {
                    clazz = Class.forName(ConnectionItem.class.getName());
                } catch (ClassNotFoundException e) {
                    ExceptionHandler.process(e);
                }
                list.add(clazz);
                setting.setClasses(list.toArray(new Class[0]));
            } catch (Exception e) {
                // nothing to do
            }
        }

        return setting;
    }

    @SuppressWarnings("unchecked")
    @Override
    public void setComponentValue(final Connection connection, final INode node, final IElementParameter param) {
        if (!TacokitDatabaseConnection.class.isInstance(connection)) {
            return;
        }
        TacokitDatabaseConnection tckConnection = TacokitDatabaseConnection.class.cast(connection);
        String paramName = param.getName();
        if (param.getValue() == null) {
            return;
        }
        String paramValue = TalendQuoteUtils.removeQuotesIfExist(param.getValue().toString());
        if (TacokitDatabaseConnection.KEY_DATASTORE_URL.equals(paramName) || TacokitDatabaseConnection.KEY_URL.equals(paramName)
                || "URL".equals(paramName)) {
            tckConnection.setURL(paramValue);
        } else if (TacokitDatabaseConnection.KEY_DATASTORE_HOST.equals(paramName)
                || TacokitDatabaseConnection.KEY_HOST.equals(paramName)) {
            tckConnection.setServerName(paramValue);
        } else if (TacokitDatabaseConnection.KEY_DATASTORE_PORT.equals(paramName)
                || TacokitDatabaseConnection.KEY_PORT.equals(paramName)) {
            tckConnection.setPort(paramValue);
        } else if (TacokitDatabaseConnection.KEY_DRIVER.equals(paramName)) {
            // ignore
        } else if (TacokitDatabaseConnection.KEY_DATASTORE_DRIVER.equals(paramName) || "DRIVER_JAR".equals(paramName)) {
            List<Map<String, String>> list = (List<Map<String, String>>) param.getValue();
            Set<String> existingDrivers = Stream.of(tckConnection.getDriverJarPath().split(";")).collect(Collectors.toSet());
            list.stream().flatMap(m -> m.values().stream()).filter(path -> !existingDrivers.contains(path))
                    .forEach(path -> tckConnection.setDriverJarPath(path));
        } else if (TacokitDatabaseConnection.KEY_DATASTORE_DRIVER_CLASS.equals(paramName)
                || TacokitDatabaseConnection.KEY_DRIVER_CLASS.equals(paramName) || "DRIVER_CLASS".equals(paramName)) {
            tckConnection.setDriverClass(paramValue);
        } else if (TacokitDatabaseConnection.KEY_DATASTORE_USER_ID.equals(paramName)
                || TacokitDatabaseConnection.KEY_USER_ID.equals(paramName) || "USERNAME".equals(paramName)) {
            tckConnection.setUsername(paramValue);
        } else if (TacokitDatabaseConnection.KEY_DATASTORE_PASSWORD.equals(paramName)
                || TacokitDatabaseConnection.KEY_PASSWORD.equals(paramName) || "PASSWORD".equals(paramName)) {
            tckConnection.setRawPassword(paramValue);
        } else if (TacokitDatabaseConnection.KEY_DATASTORE_DATABASE_MAPPING.equals(paramName)
                || TacokitDatabaseConnection.KEY_DATABASE_MAPPING.equals(paramName)) {
            // already set
            // tckConnection.setDbmsId(paramValue);
        } else if (TacokitDatabaseConnection.KEY_DATASTORE_DATASOURCE_ALIAS.equals(paramName)
                || TacokitDatabaseConnection.KEY_DATASOURCE_ALIAS.equals(paramName)) {
            // ignore
            // tckConnection.getDatasourceAlias();
        } else if (TacokitDatabaseConnection.KEY_DATASTORE_USE_SHARED_DB_CONNECTION.equals(paramName)
                || TacokitDatabaseConnection.KEY_USE_SHARED_DB_CONNECTION.equals(paramName)) {
            // ignore
            // tckConnection.useSharedDBConnection();
        } else if (TacokitDatabaseConnection.KEY_DATASTORE_SHARED_DB_CONNECTION.equals(paramName)
                || TacokitDatabaseConnection.KEY_SHARED_DB_CONNECTION.equals(paramName)) {
            // ignore
            // tckConnection.getSharedDBConnectionName();
        } else if (TacokitDatabaseConnection.KEY_DATASTORE_USE_DATASOURCE.equals(paramName)
                || TacokitDatabaseConnection.KEY_USE_DATASOURCE.equals(paramName)) {
            // ignore
            // tckConnection.useDatasourceAlias();;
        } else if (TacokitDatabaseConnection.KEY_DATASTORE_AUTHENTICATION_TYPE.equals(paramName)
                || TacokitDatabaseConnection.KEY_AUTHENTICATION_TYPE.equals(paramName)) {
            tckConnection.setAuthenticationType(paramValue);
        } else if (TacokitDatabaseConnection.KEY_DATASTORE_USE_AUTO_COMMIT.equals(paramName)
                || TacokitDatabaseConnection.KEY_USE_AUTO_COMMIT.equals(paramName)) {
            // ignore
            // tckConnection.setUseAutoCommit(Boolean.valueOf(paramValue));
        } else if (TacokitDatabaseConnection.KEY_DATASTORE_AUTO_COMMIT.equals(paramName)
                || TacokitDatabaseConnection.KEY_AUTO_COMMIT.equals(paramName)) {
            // ignore
            // tckConnection.setAutoCommit(Boolean.valueOf(paramValue));
        } else if (TacokitDatabaseConnection.KEY_DATASTORE_ENABLE_DB_TYPE.equals(paramName)
                || TacokitDatabaseConnection.KEY_ENABLE_DB_TYPE.equals(paramName)) {
            tckConnection.setEnableDBType(Boolean.valueOf(paramValue));
        } else if (TacokitDatabaseConnection.KEY_DATASTORE_DB_TYPE.equals(paramName)
                || TacokitDatabaseConnection.KEY_DB_TYPE.equals(paramName)) {
            // already set
            // tckConnection.setDatabaseType(paramValue);
        }

    }

    @Override
    public ERepositoryObjectType getType(final String repositoryType) {
        ERepositoryObjectType repObjType = ERepositoryObjectType.valueOf(repositoryType);
        if (repObjType != null && TaCoKitUtil.isTaCoKitType(repObjType)) {
            return repObjType;
        }
        return null;
    }

    @Override
    public void handleTableRelevantParameters(final Connection connection, final IElement ele,
            final IMetadataTable metadataTable) {
        // nothing to do
    }

    private String getComponentMainName(Connection connection, final ERepositoryObjectType type) {
        if (type != null) {
            String typeLabel = type.getLabel();
            String parentTypeLabel = null;
            ERepositoryObjectType parentType = type.findParentType(type);
            if (parentType != null) {
                parentTypeLabel = parentType.getLabel();
            }
            if (NETSUITE.equalsIgnoreCase(typeLabel) || NETSUITE.equalsIgnoreCase(parentTypeLabel)) {
                return NETSUITE + "V2019"; //$NON-NLS-1$
            }
        }
        return null;
    }

    private String getInputComponentName(String componentMainName) {
        return getInputOrOutputComponentName(componentMainName, true);
    }

    private String getOutputComponentName(String componentMainName) {
        return getInputOrOutputComponentName(componentMainName, false);
    }

    private String getInputOrOutputComponentName(String componentMainName, boolean isInput) {
        if (isInput) {
            return componentMainName.concat(INPUT);
        }
        return componentMainName.concat(OUTPUT);
    }
    
    @Override
    public boolean isGenericRepositoryValue(Connection connection, List<ComponentProperties> componentProperties, String paramName) {
        return getGenericRepositoryValue(connection, componentProperties, paramName) != null || getGenericRepositoryValue(connection, componentProperties, paramName.replace(".dataSet.dataStore", "")) != null;
    }

    @Override
    public Object getGenericRepositoryValue(Connection connection, List<ComponentProperties> componentProperties, String paramName) {
        if (connection instanceof TacokitDatabaseConnection) {
            TacokitDatabaseConnection tacokitDatabaseConnection = (TacokitDatabaseConnection)connection;
            return tacokitDatabaseConnection.getPropertyValue(paramName);
        }       
        return null;
    }
}
