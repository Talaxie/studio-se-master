package org.talend.repository.model.migration;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.exception.PersistenceException;
import org.talend.core.language.ECodeLanguage;
import org.talend.core.model.components.ComponentUtilities;
import org.talend.core.model.components.ModifyComponentsAction;
import org.talend.core.model.components.conversions.IComponentConversion;
import org.talend.core.model.components.filters.IComponentFilter;
import org.talend.core.model.components.filters.NameComponentFilter;
import org.talend.core.model.migration.AbstractJobMigrationTask;
import org.talend.core.model.properties.Item;
import org.talend.designer.core.model.utils.emf.talendfile.ElementParameterType;
import org.talend.designer.core.model.utils.emf.talendfile.NodeType;
import org.talend.designer.core.model.utils.emf.talendfile.ProcessType;

public class SetKeystoreKafkaMigrationTask extends AbstractJobMigrationTask {

    // Properties
    private static final String USE_EXISTING_CONNECTION_PROPERTY = "USE_EXISTING_CONNECTION";
    private static final String CONNECTION_PROPERTY = "CONNECTION";
    private static final String USE_HTTPS_PROPERTY = "USE_HTTPS";
    private static final String HTTPS_SETTING_PROPERTY = "HTTPS_SETTING";
    private static final String SET_KEYSTORE_PROPERTY = "SET_KEYSTORE";
    private static final String SCHEMA_REGISTRY_USE_HTTPS_PROPERTY = "SCHEMA_REGISTRY_USE_HTTPS";
    private static final String SCHEMA_REGISTRY_SET_KEYSTORE_PROPERTY = "SCHEMA_REGISTRY_SET_KEYSTORE";

    // Components
    private static final String KAFKA_CONNECTION = "tKafkaConnection";
    private static final String SET_KEYSTORE = "tSetKeystore";

    // Types
    private static final String CHECK_TYPE = "CHECK";

    @Override
    public Date getOrder() {
        return new GregorianCalendar(2022, Calendar.MARCH, 17, 18, 0, 0).getTime();
    }

    @Override
    public ExecutionResult execute(Item item) {
        final ProcessType processType = getProcessType(item);

        if (getProject().getLanguage() != ECodeLanguage.JAVA || processType == null) {
            return ExecutionResult.NOTHING_TO_DO;
        }

        List<String> kafkaSslComponents = Arrays.asList("tKafkaConnection", "tKafkaInput", "tKafkaOutput");
        List<String> schemaRegistrySslComponents = Arrays.asList("tKafkaInput", "tKafkaOutput");

        boolean modified = false;

        // schema registry with reused kafka ssl and empty tSetKeystore
        for (String componentName : schemaRegistrySslComponents) {
            IComponentFilter componentFilter = new NameComponentFilter(componentName);
            try {
                modified |= ModifyComponentsAction.searchAndModify(item, processType, componentFilter,
                        Arrays.<IComponentConversion> asList(new IComponentConversion() {

                            public void transform(NodeType node) {
                                NodeType connectionPropertiesNode = node;

                                // retrieve connection node
                                ElementParameterType useExistingConnection = ComponentUtilities.getNodeProperty(node, USE_EXISTING_CONNECTION_PROPERTY);
                                if (useExistingConnection != null && "true".equalsIgnoreCase(useExistingConnection.getValue())) {
                                    ElementParameterType connection = ComponentUtilities.getNodeProperty(node, CONNECTION_PROPERTY);
                                    if (connection != null) {
                                        NodeType connectionNode = searchNodeTypeByUniqueName(processType, KAFKA_CONNECTION, connection.getValue());
                                        if (connectionNode != null) {
                                            connectionPropertiesNode = connectionNode;
                                        }
                                    }
                                }

                                ElementParameterType useHttps = ComponentUtilities.getNodeProperty(connectionPropertiesNode, USE_HTTPS_PROPERTY);

                                if (ComponentUtilities.getNodeProperty(connectionPropertiesNode, SET_KEYSTORE_PROPERTY) == null
                                        && useHttps != null && "true".equalsIgnoreCase(useHttps.getValue())
                                        && !hasSetKeystore(connectionPropertiesNode, processType)) {
                                    // disable ssl for schema registry if reused kafka tSetKeystore is empty
                                    // to ignore schema registry ssl configuration (if any) after ssl for kafka is disabled
                                    ElementParameterType schemaRegistryUseHttps = ComponentUtilities.getNodeProperty(node, SCHEMA_REGISTRY_USE_HTTPS_PROPERTY);
                                    if (schemaRegistryUseHttps != null && "true".equalsIgnoreCase(schemaRegistryUseHttps.getValue())) {
                                        schemaRegistryUseHttps.setValue("false");
                                    }
                                }
                            }
                        }));
            } catch (PersistenceException e) {
                ExceptionHandler.process(e);
                return ExecutionResult.FAILURE;
            }
        }

        // Kafka ssl
        for (String componentName : kafkaSslComponents) {
            IComponentFilter componentFilter = new NameComponentFilter(componentName);
            try {
                modified |= ModifyComponentsAction.searchAndModify(item, processType, componentFilter,
                        Arrays.<IComponentConversion> asList(new IComponentConversion() {

                            public void transform(NodeType node) {
                                if (ComponentUtilities.getNodeProperty(node, SET_KEYSTORE_PROPERTY) == null) {
                                    ComponentUtilities.addNodeProperty(node, SET_KEYSTORE_PROPERTY, CHECK_TYPE);
                                    ComponentUtilities.setNodeValue(node, SET_KEYSTORE_PROPERTY, "true");

                                    ElementParameterType useHttps = ComponentUtilities.getNodeProperty(node, USE_HTTPS_PROPERTY);
                                    if (useHttps != null && "true".equalsIgnoreCase(useHttps.getValue())
                                            && !hasSetKeystore(node, processType)) {
                                        // disable ssl for kafka if tSetKeystore is empty to keep the same security protocol
                                        useHttps.setValue("false");
                                    }
                                }
                            }
                        }));
            } catch (PersistenceException e) {
                ExceptionHandler.process(e);
                return ExecutionResult.FAILURE;
            }
        }

        // Schema registry ssl
        for (String componentName : schemaRegistrySslComponents) {
            IComponentFilter componentFilter = new NameComponentFilter(componentName);
            try {
                modified |= ModifyComponentsAction.searchAndModify(item, processType, componentFilter,
                        Arrays.<IComponentConversion> asList(new IComponentConversion() {

                            public void transform(NodeType node) {
                                if (ComponentUtilities.getNodeProperty(node, SCHEMA_REGISTRY_SET_KEYSTORE_PROPERTY) == null) {
                                    ComponentUtilities.addNodeProperty(node, SCHEMA_REGISTRY_SET_KEYSTORE_PROPERTY, CHECK_TYPE);
                                    ComponentUtilities.setNodeValue(node, SCHEMA_REGISTRY_SET_KEYSTORE_PROPERTY, "false");

                                    ElementParameterType schemaRegistryUseHttps = ComponentUtilities.getNodeProperty(node, SCHEMA_REGISTRY_USE_HTTPS_PROPERTY);
                                    if (schemaRegistryUseHttps != null && schemaRegistryUseHttps.getValue() != null) {
                                        ComponentUtilities.setNodeValue(node, SCHEMA_REGISTRY_SET_KEYSTORE_PROPERTY, schemaRegistryUseHttps.getValue());
                                    }
                                }
                            }
                        }));
            } catch (PersistenceException e) {
                ExceptionHandler.process(e);
                return ExecutionResult.FAILURE;
            }
        }

        if (modified) {
            return ExecutionResult.SUCCESS_NO_ALERT;
        } else {
            return ExecutionResult.NOTHING_TO_DO;
        }
    }

    private boolean hasSetKeystore(NodeType node, ProcessType processType) {
        boolean hasSetKeystore = false;
        ElementParameterType httpsSetting = ComponentUtilities.getNodeProperty(node, HTTPS_SETTING_PROPERTY);
        if (httpsSetting != null) {
            NodeType httpsSettingNode = searchNodeTypeByUniqueName(processType, SET_KEYSTORE, httpsSetting.getValue());
            hasSetKeystore = httpsSettingNode != null;
        }
        return hasSetKeystore;
    }

    private NodeType searchNodeTypeByUniqueName(ProcessType processType, String componentName, String uniqueName) {
        if (processType == null || componentName == null || (uniqueName == null || "".equals(uniqueName.trim()))) {
            return null;
        }
        NodeType searchNode = null;
        EList<NodeType> nodes = processType.getNode();
        for (NodeType node : nodes) {
            if (node != null && componentName.equals(node.getComponentName())) {
                ElementParameterType uniqueNameParam = ComponentUtilities.getNodeProperty(node, "UNIQUE_NAME");
                if (uniqueNameParam != null && uniqueName.equals(uniqueNameParam.getValue())) {
                    searchNode = node;
                    break;
                }
            }
        }

        return searchNode;
    }
}
