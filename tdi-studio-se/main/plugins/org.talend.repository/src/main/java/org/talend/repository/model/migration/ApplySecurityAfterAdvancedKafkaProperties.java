package org.talend.repository.model.migration;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.talend.commons.exception.ExceptionHandler;
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

public class ApplySecurityAfterAdvancedKafkaProperties extends AbstractJobMigrationTask {

    // Components
    private static final String KAFKA_INPUT = "tKafkaInput";
    private static final String KAFKA_OUTPUT = "tKafkaOutput";
    private static final String KAFKA_CONNECTION = "tKafkaConnection";
    private static final String SET_KEYSTORE = "tSetKeystore";

    // Properties
    private static final String USE_EXISTING_CONNECTION = "USE_EXISTING_CONNECTION";
    private static final String CONNECTION = "CONNECTION";
    private static final String KAFKA_VERSION = "KAFKA_VERSION";
    private static final String USE_HTTPS = "USE_HTTPS";
    private static final String HTTPS_SETTING = "HTTPS_SETTING";
    private static final String USE_KRB = "USE_KRB";
    private static final String APPLY_SECURITY_PROPERTIES_AFTER_ADVANCED = "APPLY_SECURITY_PROPERTIES_AFTER_ADVANCED";

    @Override
    public Date getOrder() {
        GregorianCalendar gc = new GregorianCalendar(2021, 12, 2, 13, 0, 0);
        return gc.getTime();
    }

    @Override
    public ExecutionResult execute(Item item) {
        ProcessType processType = getProcessType(item);

        if (getProject().getLanguage() != ECodeLanguage.JAVA || processType == null) {
            return ExecutionResult.NOTHING_TO_DO;
        }

        List<String> filterList = Arrays.asList(KAFKA_INPUT, KAFKA_OUTPUT);
        IComponentConversion componentConversion = new KafkaComponentConversion(processType);

        boolean modified = false;
        for (String componentName: filterList) {
            IComponentFilter filter = new NameComponentFilter(componentName);
            try {
                modified |= ModifyComponentsAction.searchAndModify(item, processType, filter,
                        Arrays.<IComponentConversion> asList(componentConversion));
            } catch (Exception e) {
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

    private class KafkaComponentConversion implements IComponentConversion {

        private ProcessType processType;

        public KafkaComponentConversion(ProcessType processType) {
            this.processType = processType;
        }

        @Override
        public void transform(NodeType node) {
            NodeType connectionPropertiesNode = node;

            ElementParameterType useExistingConnection =
                    ComponentUtilities.getNodeProperty(node, USE_EXISTING_CONNECTION);
            if (useExistingConnection != null && "true".equalsIgnoreCase(useExistingConnection.getValue())) {
                ElementParameterType connection = ComponentUtilities.getNodeProperty(node, CONNECTION);
                if (connection != null) {
                    NodeType connectionNode =
                            searchNodeTypeByUniqueName(processType, KAFKA_CONNECTION, connection.getValue());
                    if (connectionNode != null) {
                        connectionPropertiesNode = connectionNode;
                    }
                }
            }

            ElementParameterType kafkaVersion = ComponentUtilities.getNodeProperty(connectionPropertiesNode, KAFKA_VERSION);
            boolean supportsSecuritySettings = kafkaVersion != null && !"KAFKA_0_8_2_0".equals(kafkaVersion.getValue());

            boolean hasHttpsProperties = false;
            ElementParameterType useHttps = ComponentUtilities.getNodeProperty(connectionPropertiesNode, USE_HTTPS);
            if (useHttps != null && "true".equalsIgnoreCase(useHttps.getValue())) {
                ElementParameterType httpsSetting = ComponentUtilities.getNodeProperty(connectionPropertiesNode, HTTPS_SETTING);
                if (httpsSetting != null) {
                    NodeType httpsSettingNode = searchNodeTypeByUniqueName(processType, SET_KEYSTORE, httpsSetting.getValue());
                    hasHttpsProperties = httpsSettingNode != null;
                }
            }

            ElementParameterType useKrb = ComponentUtilities.getNodeProperty(connectionPropertiesNode, USE_KRB);
            boolean hasKrbProperties = useKrb != null && "true".equalsIgnoreCase(useKrb.getValue());

            if (supportsSecuritySettings && (hasHttpsProperties || hasKrbProperties)) {
                if (ComponentUtilities.getNodeProperty(node, APPLY_SECURITY_PROPERTIES_AFTER_ADVANCED) == null) {
                    ComponentUtilities.addNodeProperty(node, APPLY_SECURITY_PROPERTIES_AFTER_ADVANCED, "CHECK");
                    ComponentUtilities.getNodeProperty(node, APPLY_SECURITY_PROPERTIES_AFTER_ADVANCED).setValue("true");
                }
            }
        }
    }
}
