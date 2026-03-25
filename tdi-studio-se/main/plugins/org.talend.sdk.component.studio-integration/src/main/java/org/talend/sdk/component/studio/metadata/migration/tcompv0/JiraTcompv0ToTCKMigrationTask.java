package org.talend.sdk.component.studio.metadata.migration.tcompv0;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.exception.PersistenceException;
import org.talend.core.model.components.ComponentUtilities;
import org.talend.core.model.components.ModifyComponentsAction;
import org.talend.core.model.components.conversions.IComponentConversion;
import org.talend.core.model.components.filters.IComponentFilter;
import org.talend.core.model.components.filters.NameComponentFilter;
import org.talend.core.model.properties.Item;
import org.talend.designer.core.model.utils.emf.talendfile.NodeType;
import org.talend.designer.core.model.utils.emf.talendfile.ProcessType;

public class JiraTcompv0ToTCKMigrationTask extends SimpleTcompv0ToTCKMigrationTask {

    @Override
    public ExecutionResult execute(final Item item) {
        ExecutionResult basicMigrationResult = super.execute(item);

        boolean modified = false;
        if (basicMigrationResult != ExecutionResult.FAILURE) {
            ProcessType processType = getProcessType(item);

            if (item == null || processType == null) {
                return ExecutionResult.NOTHING_TO_DO;
            }


            try {
                //need a migration for JiraInput jql to replace '\"' with '"'
                IComponentFilter filterInput = new NameComponentFilter("JIRAInput");
                modified |= migrateInputJQLString(item, processType, filterInput);
                //need a migration for jiraOutput outputAction INSERT->CREATE
                IComponentFilter filterOutput = new NameComponentFilter("JIRAOutput");
                modified |= migrateOutputAction(item, processType, filterOutput);
            } catch (PersistenceException e) {
                ExceptionHandler.process(e);
                return ExecutionResult.FAILURE;
            }
        }

        if (modified) {
            return ExecutionResult.SUCCESS_NO_ALERT;
        } else {
            return basicMigrationResult;
        }
    }

    private boolean migrateInputJQLString(Item item, ProcessType processType, IComponentFilter filter)
            throws PersistenceException {
        return ModifyComponentsAction.searchAndModify(item, processType, filter,
                Arrays.asList(node -> {
                    String oldJQLValue =
                            ComponentUtilities.getNodePropertyValue(node, "configuration.jql");

                    ComponentUtilities.setNodeValue(node, "configuration.jql",
                            sanitizeJQL(oldJQLValue));
                }));
    }

    private String sanitizeJQL(String jql) {
        if (jql != null) {
            if (jql.startsWith("\"")) {
                jql = jql.substring(1);
            }

            if (jql.endsWith("\"")) {
                jql = jql.substring(0, jql.length() - 1);
            }
            if (jql.contains("\\\"")) {
                jql = jql.replaceAll("\\\\\"", "\"");
            }
        }
        return jql;
    }

    private boolean migrateOutputAction(Item item, ProcessType processType, IComponentFilter filter)
            throws PersistenceException {

        return ModifyComponentsAction.searchAndModify(item, processType, filter,
                Arrays.asList(node -> {
                    String oldOutputActionValue =
                            ComponentUtilities.getNodePropertyValue(node, "configuration.outputAction");
                    oldOutputActionValue =
                            "INSERT".equals(oldOutputActionValue) ? "CREATE" : oldOutputActionValue;
                    ComponentUtilities.setNodeValue(node, "configuration.outputAction",
                            oldOutputActionValue);
                }));
    }

    @Override
    public Date getOrder() {
        return new GregorianCalendar(2023, Calendar.JULY, 19, 16, 0, 0).getTime();
    }

    @Override
    protected String getMigrationFile() {
        return "JiraTcompv0ToTCKMigrationTask.properties";
    }
}
