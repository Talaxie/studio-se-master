package org.talend.sdk.component.studio.metadata.migration.tcompv0;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.core.model.components.ComponentUtilities;
import org.talend.core.model.components.ModifyComponentsAction;
import org.talend.core.model.components.conversions.IComponentConversion;
import org.talend.core.model.components.filters.IComponentFilter;
import org.talend.core.model.components.filters.NameComponentFilter;
import org.talend.core.model.migration.AbstractJobMigrationTask;
import org.talend.core.model.properties.Item;
import org.talend.designer.core.generic.utils.ParameterUtilTool;
import org.talend.designer.core.model.utils.emf.talendfile.ElementParameterType;
import org.talend.designer.core.model.utils.emf.talendfile.NodeType;
import org.talend.designer.core.model.utils.emf.talendfile.ProcessType;
import org.talend.sdk.component.studio.util.TcompV0ConfigToFlatMapDeserializer;

/**
 * The tcompv0->tck migration for case when there's no previous tcompv0->tcompv0 migration needed (post_deserialize).
 * The .prop
 */
public abstract class SimpleTcompv0ToTCKMigrationTask extends AbstractJobMigrationTask {

    /**
     * Provide a name of .properties file which contains tck.key=tcompv0.key
     * @return String name of migration .properties file
     */
    protected abstract String getMigrationFile();

    @Override
    public ExecutionResult execute(Item item) {
        boolean modified = false;
        ProcessType processType = getProcessType(item);

        if (item == null || processType == null) {
            return ExecutionResult.NOTHING_TO_DO;
        }

        try {
            Properties migrationProperties = loadPropertiesFromFile();
            List<String> componentsToMigrate = getComponentListKeysToMigrate(migrationProperties);

            for (int i = 0; i < componentsToMigrate.size(); i++) {
                String newComponentName = componentsToMigrate.get(i);
                final String oldComponentName = migrationProperties.getProperty(newComponentName);
                IComponentFilter filter = new NameComponentFilter(oldComponentName);
                try {
                    modified |= ModifyComponentsAction.searchAndModify(item, processType, filter,
                            Arrays.<IComponentConversion>asList(new IComponentConversion() {

                                public void transform(NodeType node) {
                                    renameTcompV0Component(node, newComponentName);
                                    setTckVersion(node, newComponentName, migrationProperties);


                                    Map<String, String> tcompv0PropertiesToMap = getTcompv0ComponentConfigAsMap(node);

                                    ComponentUtilities.removeNodeProperty(node, "PROPERTIES");

                                    migrationProperties.stringPropertyNames().stream()
                                            .filter(key -> key.startsWith(newComponentName + "."))
                                            .forEach((newPropertyKey) -> {
                                                String tckComponentPropertyName = extractPropertyName(newPropertyKey, newComponentName);
                                                String componentPropertyType = getComponentPropertyType(migrationProperties, newPropertyKey);
                                                ComponentUtilities.addNodeProperty(node,
                                                        tckComponentPropertyName, componentPropertyType);
                                                String oldValueKey =
                                                        migrationProperties.getProperty(newPropertyKey);
                                                String newValue = extractNewPropertyValue(tcompv0PropertiesToMap, oldValueKey);
                                                ComponentUtilities.setNodeValue(node, tckComponentPropertyName, newValue);

                                                migrateSchema(node);
                                            });
                                }

                                private String extractNewPropertyValue(Map<String, String> tcompv0PropertiesToMap,
                                        String tcompMapValueKey) {
                                    if (tcompMapValueKey.contains("#")) { //delete property type from tcompv0 map key
                                        tcompMapValueKey = tcompMapValueKey.substring(0, tcompMapValueKey.indexOf("#"));
                                    }
                                    return tcompv0PropertiesToMap.getOrDefault(tcompMapValueKey, tcompMapValueKey);
                                }

                                private String extractPropertyName(String newPropertyKey, String newComponentName) {
                                    return newPropertyKey.substring(newComponentName.length() + 1);
                                }

                                private void migrateSchema(NodeType node) {
                                    final String uniqueName = ParameterUtilTool.getParameterValue(node, "UNIQUE_NAME");
                                    final EList<org.talend.designer.core.model.utils.emf.talendfile.MetadataType> metadatas = node.getMetadata();
                                    int indexOfFlow = -1;
                                    boolean mainExists = false;
                                    for (int i = 0; i < metadatas.size(); i++) {
                                        final org.talend.designer.core.model.utils.emf.talendfile.MetadataType metadataType = metadatas.get(i);

                                        if ("FLOW".equals(metadataType.getConnector()) && uniqueName.equals(
                                                metadataType.getName())) {
                                            indexOfFlow = i;
                                        }
                                        if ("MAIN".equals(metadataType.getConnector()) && "MAIN".equals(
                                                metadataType.getName())) {//tcompV0 use "MAIN" to match connection default
                                            mainExists = true;

                                            metadataType.setConnector("FLOW");
                                            metadataType.setName(uniqueName);

                                            for (Object connectionObj : processType.getConnection()) {
                                                if (connectionObj instanceof org.talend.designer.core.model.utils.emf.talendfile.ConnectionType) {
                                                    org.talend.designer.core.model.utils.emf.talendfile.ConnectionType
                                                            connectionType = (org.talend.designer.core.model.utils.emf.talendfile.ConnectionType) connectionObj;
                                                    if (connectionType.getSource().equals(uniqueName)
                                                            && connectionType.getConnectorName().equals("MAIN")) {
                                                        connectionType.setConnectorName("FLOW");
                                                        connectionType.setMetaname(uniqueName);
                                                    }
                                                }
                                            }
                                        }
                                    }

                                    if (mainExists && indexOfFlow > -1) {
                                        metadatas.remove(indexOfFlow);
                                    }
                                }

                                private Map<String, String> getTcompv0ComponentConfigAsMap(NodeType node) {
                                    ElementParameterType elemParamType =
                                            ComponentUtilities.getNodeProperty(node, "PROPERTIES");

                                    final String jsonProperties = elemParamType.getValue();

                                    return TcompV0ConfigToFlatMapDeserializer.configToMap(jsonProperties);
                                }

                                private void setTckVersion(NodeType node, String newComponentName,
                                        Properties migrationProperties) {
                                    String tckVersion = migrationProperties.containsKey(newComponentName + ".VERSION") ?
                                            migrationProperties.getProperty(newComponentName + ".VERSION") : "1";

                                    node.setComponentVersion(tckVersion);
                                }

                                private void renameTcompV0Component(NodeType node, String newComponentName) {
                                    node.setComponentName(newComponentName);
                                }
                            }));
                } catch (Exception e) {
                    ExceptionHandler.process(e);
                    return ExecutionResult.FAILURE;
                }
            }
        } catch (Exception e) {
            ExceptionHandler.process(e);
            return ExecutionResult.FAILURE;
        }

        if (modified) {
            return ExecutionResult.SUCCESS_NO_ALERT;
        } else {
            return ExecutionResult.NOTHING_TO_DO;
        }
    }

    private String getComponentPropertyType(Properties migrationProperties, String newComponentPropertyName) {
        String propertyValue = migrationProperties.getProperty(newComponentPropertyName);
        int typeSymbolIndex = propertyValue.indexOf("#");
        if (typeSymbolIndex != -1) {
            return propertyValue.substring(typeSymbolIndex + 1);
        } else if (newComponentPropertyName.endsWith("TACOKIT_COMPONENT_ID")) {
            return "TECHNICAL";
        }  else {
            return "TEXT";
        }
    }

    private Properties loadPropertiesFromFile() throws IOException {
        Properties properties = new Properties();

        try (InputStream inputStream = this.getClass().getResourceAsStream(getMigrationFile())) {
            properties.load(inputStream);
        }

        return properties;
    }

    /**
     * @return a list of keys (new, tck component names) which used to create a filter for migration
     */
    private List<String> getComponentListKeysToMigrate(Properties migrationProperties) {
        return migrationProperties.stringPropertyNames()
                .stream()
                //component names don't have . in neither key nor value unlike other properties
                .filter(key-> !key.contains("."))
                .collect(Collectors.toList());
    }
}
