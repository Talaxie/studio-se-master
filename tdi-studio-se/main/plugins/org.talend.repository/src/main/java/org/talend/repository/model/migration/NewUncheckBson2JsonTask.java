package org.talend.repository.model.migration;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

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
import org.talend.designer.core.model.utils.emf.talendfile.ProcessType;

public class NewUncheckBson2JsonTask extends AbstractJobMigrationTask {

    private Map<String,String> versionMap = new HashMap();

    @Override
    public ExecutionResult execute(final Item item) {
        final ProcessType processType = getProcessType(item);
        if (getProject().getLanguage() != ECodeLanguage.JAVA || processType == null) {
            return ExecutionResult.NOTHING_TO_DO;
        }
        getMongoVersion(item);
        IComponentConversion action = node -> {
            if(node == null) {
                return;
            }
            ElementParameterType convert_bson_to_string =
                    ComponentUtilities.getNodeProperty(node, "CONVERT_BSON_TO_STRING");
            String db_version;
            final ElementParameterType use_existing_connection =
                    ComponentUtilities.getNodeProperty(node, "USE_EXISTING_CONNECTION");
            if(use_existing_connection!= null && "true".equals(use_existing_connection.getValue())){
                final String connection = ComponentUtilities.getNodeProperty(node, "CONNECTION").getValue();
                db_version = versionMap.get(connection);
            }else{
                db_version = ComponentUtilities.getNodeProperty(node, "DB_VERSION").getValue();
            }
            if ("MONGODB_3_5_X".equals(db_version) && (
                    convert_bson_to_string == null)) {//$NON-NLS-1$
                ComponentUtilities.addNodeProperty(node, "CONVERT_BSON_TO_STRING", "CHECK");//$NON-NLS-1$ //$NON-NLS-2$
                convert_bson_to_string =
                        ComponentUtilities.getNodeProperty(node, "CONVERT_BSON_TO_STRING");
                convert_bson_to_string.setValue("false");//$NON-NLS-1$ //$NON-NLS-2$
            }

            if(!"MONGODB_3_5_X".equals(db_version) && (
                    convert_bson_to_string != null)){
                convert_bson_to_string.setValue("true");//$NON-NLS-1$ //$NON-NLS-2$
            }

        };

        boolean modified = false;
            IComponentFilter filter = new NameComponentFilter("tMongoDBInput");

            try {
                modified |= ModifyComponentsAction.searchAndModify(item, processType, filter, Arrays.asList(action));
            } catch (PersistenceException e) {
                ExceptionHandler.process(e);
                return ExecutionResult.FAILURE;
            }

        if (modified) {
            return ExecutionResult.SUCCESS_NO_ALERT;
        } else {
            return ExecutionResult.NOTHING_TO_DO;
        }
    }

    private void getMongoVersion(Item item)   {
        IComponentFilter filter = new NameComponentFilter("tMongoDBConnection");
        final ProcessType processType = getProcessType(item);
        IComponentConversion action = node -> {
            if(node == null) {
                return;
            }
            final ElementParameterType dbVersion = ComponentUtilities.getNodeProperty(node, "DB_VERSION");
            versionMap.put(ComponentUtilities.getNodeProperty(node, "UNIQUE_NAME").getValue(),dbVersion.getValue());
        };
        try {
            ModifyComponentsAction.searchAndModify(item, processType, filter, Arrays.asList(action));
        } catch (PersistenceException e) {
            //ignore
        }
    }

    @Override
    public Date getOrder() {
        GregorianCalendar gc = new GregorianCalendar(2023, Calendar.MARCH, 27, 0, 0, 0);
        return gc.getTime();
    }
}