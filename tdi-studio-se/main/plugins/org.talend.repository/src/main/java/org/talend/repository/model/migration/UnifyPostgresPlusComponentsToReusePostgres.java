package org.talend.repository.model.migration;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.exception.PersistenceException;
import org.talend.core.language.ECodeLanguage;
import org.talend.core.model.components.ComponentUtilities;
import org.talend.core.model.components.ComponentsAction;
import org.talend.core.model.components.ModifyComponentsAction;
import org.talend.core.model.components.conversions.IComponentConversion;
import org.talend.core.model.components.filters.IComponentFilter;
import org.talend.core.model.components.filters.NameComponentFilter;
import org.talend.core.model.migration.AbstractJobMigrationTask;
import org.talend.core.model.properties.Item;
import org.talend.designer.core.model.utils.emf.talendfile.ElementParameterType;
import org.talend.designer.core.model.utils.emf.talendfile.MetadataType;
import org.talend.designer.core.model.utils.emf.talendfile.NodeType;
import org.talend.designer.core.model.utils.emf.talendfile.ProcessType;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Unify tPostgresPlus components to reuse tPostgresql components
 */
public class UnifyPostgresPlusComponentsToReusePostgres extends AbstractJobMigrationTask {

    @Override
    public ExecutionResult execute(Item item) {
        ProcessType processType = getProcessType(item);
        if (getProject().getLanguage() != ECodeLanguage.JAVA || processType == null) {
            return ExecutionResult.NOTHING_TO_DO;
        }
        try {
            boolean modified = false;
            modified |= migrateBatchSize(item, processType);
            modified |= migrateConnections(item, processType);
            modified |= changeDBType(item, processType);
            modified |= changeDBMapping(item, processType);
            modified |= changeDefaultValueLocalFileCopy(item, processType);
            modified |= changePostgresPlusOutputBulkFileType(item, processType);
            modified |= renameComponents(item, processType);
            return modified ? ExecutionResult.SUCCESS_NO_ALERT : ExecutionResult.NOTHING_TO_DO;
        } catch (PersistenceException e) {
            ExceptionHandler.process(e);
            return ExecutionResult.FAILURE;
        }

    }

    private boolean migrateBatchSize(Item item, ProcessType processType) throws PersistenceException {
        boolean modified = false;
        IComponentFilter filter = new NameComponentFilter("tPostgresPlusOutput");
        modified |= ModifyComponentsAction.searchAndModify(item, processType, filter,
                Arrays.<IComponentConversion> asList(new IComponentConversion() {

                    public void transform(NodeType node) {
                        String useBatch = ComponentUtilities.getNodePropertyValue(node, "USE_BATCH");
                        ComponentUtilities.addNodeProperty(node, "USE_BATCH_SIZE", "CHECK");
                        ComponentUtilities.setNodeValue(node, "USE_BATCH_SIZE", useBatch);
                        ComponentUtilities.removeNodeProperty(node, "USE_BATCH");
                    }
                }));

        return modified;
    }

    private boolean changeDBType(Item item, ProcessType processType) throws PersistenceException {
        String[] componentsName = new String[] { "tCombinedSQLOutput", "tCreateTable", "tJDBCColumnList",
                "tSQLTemplate", "tSQLTemplateAggregate", "tSQLTemplateCommit", "tSQLTemplateFilterColumns",
                "tSQLTemplateFilterRows", "tSQLTemplateMerge", "tSQLTemplateRollback" };
        boolean modified = false;
        for (int i = 0; i < componentsName.length; i++) {
            IComponentFilter filter = new NameComponentFilter(componentsName[i]);
            modified |= ModifyComponentsAction.searchAndModify(item, processType, filter,
                    Arrays.<IComponentConversion> asList(new IComponentConversion() {

                        public void transform(NodeType node) {
                            if ("POSTGREPLUS".equals(ComponentUtilities.getNodePropertyValue(node, "DBTYPE"))) {
                                ComponentUtilities.setNodeValue(node, "DBTYPE", "POSTGRE");
                            }
                        }
                    }));
        }
        return modified;
    }

    private boolean migrateConnections(Item item, ProcessType processType) throws PersistenceException {
        String[] componentsName = new String[] { "tCombinedSQLOutput", "tCreateTable", "tJDBCColumnList",
                "tSQLTemplate", "tSQLTemplateAggregate", "tSQLTemplateCommit", "tSQLTemplateFilterColumns",
                "tSQLTemplateFilterRows", "tSQLTemplateMerge", "tSQLTemplateRollback" };
        boolean modified = false;
        for (int i = 0; i < componentsName.length; i++) {
            IComponentFilter filter = new NameComponentFilter(componentsName[i]);
            modified |= ModifyComponentsAction.searchAndModify(item, processType, filter,
                    Arrays.<IComponentConversion> asList(new IComponentConversion() {

                        public void transform(NodeType node) {
                            String connectionPostgreplus =
                                    ComponentUtilities.getNodePropertyValue(node, "CONNECTION_POSTGREPLUS");
                            if (StringUtils.isNotEmpty(connectionPostgreplus)
                                    && "POSTGREPLUS".equals(
                                    ComponentUtilities.getNodePropertyValue(node, "DBTYPE"))) {
                                ComponentUtilities.setNodeValue(node, "CONNECTION_POSTGRE", connectionPostgreplus);
                            }
                        }
                    }));
        }
        return modified;
    }

    private boolean changeDBMapping(Item item, ProcessType processType) throws PersistenceException {
        String[] componentsName = new String[] { "tCombinedSQLOutput", "tCreateTable", "tELTInput", "tELTMap",
                "tELTOutput", "tPostgresPlusBulkExec", "tPostgresPlusInput", "tPostgresPlusOutput",
                "tPostgresPlusOutputBulkExec", "tPostgresPlusSCDELT", "tJDBCSCDELT", "tSQLTemplate",
                "tSQLTemplateAggregate", "tSQLTemplateCommit", "tSQLTemplateFilterColumns", "tSQLTemplateFilterRows",
                "tSQLTemplateMerge", "tSQLTemplateRollback" };
        boolean modified = false;
        for (int i = 0; i < componentsName.length; i++) {
            IComponentFilter filter = new NameComponentFilter(componentsName[i]);
            modified |= ModifyComponentsAction.searchAndModify(item, processType, filter,
                    Arrays.<IComponentConversion> asList(new IComponentConversion() {

                        public void transform(NodeType node) {
                            if ("postgresplus_id".equals(ComponentUtilities.getNodePropertyValue(node, "MAPPING"))) {
                                ComponentUtilities.setNodeValue(node, "MAPPING", "postgres_id");
                            }
                        }
                    }));
        }
        return modified;
    }

    private boolean changeDefaultValueLocalFileCopy(Item item, ProcessType processType) throws PersistenceException {
        String[] componentsName = new String[] { "tPostgresPlusBulkExec", "tPostgresPlusOutputBulkExec" };
        boolean modified = false;
        for (int i = 0; i < componentsName.length; i++) {
            IComponentFilter filter = new NameComponentFilter(componentsName[i]);
            modified |= ModifyComponentsAction.searchAndModify(item, processType, filter,
                    Arrays.<IComponentConversion> asList(new IComponentConversion() {

                        public void transform(NodeType node) {
                            if (ComponentUtilities.getNodeProperty(node, "LOCAL_FILE") == null) {
                                ComponentUtilities.addNodeProperty(node, "LOCAL_FILE", "CHECK");
                                ComponentUtilities.getNodeProperty(node, "LOCAL_FILE").setValue("false");
                            }
                        }

                    }));
        }
        return modified;
    }

    private boolean changePostgresPlusOutputBulkFileType(Item item, ProcessType processType)
            throws PersistenceException {
        boolean modified = false;
        IComponentFilter filter = new NameComponentFilter("tPostgresPlusOutputBulk");
        modified |= ModifyComponentsAction.searchAndModify(item, processType, filter,
                Arrays.<IComponentConversion> asList(new IComponentConversion() {

                    public void transform(NodeType node) {
                        if (ComponentUtilities.getNodeProperty(node, "FILETYPE") == null) {
                            ComponentUtilities.addNodeProperty(node, "FILETYPE", "CLOSED_LIST");
                            String filename = ComponentUtilities.getNodePropertyValue(node, "FILENAME");
                            ComponentUtilities.getNodeProperty(node, "FILETYPE").setValue("TXTFILE");
                        }
                    }

                }));
        return modified;
    }

    private boolean renameComponents(Item item, ProcessType processType) throws PersistenceException {
        final String[] source = { "tPostgresPlusBulkExec", "tPostgresPlusClose", "tPostgresPlusCommit",
                "tPostgresPlusConnection", "tPostgresPlusInput", "tPostgresPlusOutput", "tPostgresPlusOutputBulk",
                "tPostgresPlusOutputBulkExec", "tPostgresPlusRollback", "tPostgresPlusRow", "tPostgresPlusSCD",
                "tPostgresPlusSCDELT" };

        final String[] target =
                { "tPostgresqlBulkExec", "tPostgresqlClose", "tPostgresqlCommit", "tPostgresqlConnection",
                        "tPostgresqlInput", "tPostgresqlOutput", "tPostgresqlOutputBulk", "tPostgresqlOutputBulkExec",
                        "tPostgresqlRollback", "tPostgresqlRow", "tPostgresqlSCD", "tPostgresqlSCDELT" };
        boolean modified = false;
        for (int i = 0; i < source.length; i++) {
            IComponentFilter filter = new NameComponentFilter(source[i]);
            final String newName = target[i];
            modified |= ModifyComponentsAction.searchAndModify(item, processType, filter,
                    Arrays.<IComponentConversion> asList(new IComponentConversion() {

                        public void transform(NodeType node) {
                            node.setComponentName(newName);
                        }
                    }));
        }
        return modified;
    }

    public Date getOrder() {
        GregorianCalendar gc = new GregorianCalendar(2023, GregorianCalendar.SEPTEMBER, 27, 15, 0, 0);
        return gc.getTime();
    }
}
