package org.talend.repository.model.migration;

import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;

import org.talend.commons.ui.runtime.exception.ExceptionHandler;
import org.talend.core.language.ECodeLanguage;
import org.talend.core.model.components.ComponentUtilities;
import org.talend.core.model.components.ModifyComponentsAction;
import org.talend.core.model.components.filters.IComponentFilter;
import org.talend.core.model.components.filters.NameComponentFilter;
import org.talend.core.model.migration.AbstractJobMigrationTask;
import org.talend.core.model.properties.Item;
import org.talend.designer.core.model.utils.emf.talendfile.ElementParameterType;
import org.talend.designer.core.model.utils.emf.talendfile.ElementValueType;
import org.talend.designer.core.model.utils.emf.talendfile.ProcessType;

/**
 * This will replace the \\ symbol into / that will be the symbol that will mark the internal subdirectories inside
 * filename. It allows a user to use \\ as an escape character in the regexp.
 * <p>
 * <a href="https://jira.talendforge.org/browse/TDI-50358">TDI-50358</a>
 */
public class ReplaceBackSlashWithSlashInGSPut extends AbstractJobMigrationTask {

    public static final String FILES_TABLE_NODE = "FILES";
    public static final String FILEMASK_ELEMENT_REF = "FILEMASK";

    @Override
    public ExecutionResult execute(final Item item) {
        ProcessType processType = getProcessType(item);
        if (getProject().getLanguage() != ECodeLanguage.JAVA || processType == null) {
            return ExecutionResult.NOTHING_TO_DO;
        }

        try {
            IComponentFilter filter = new NameComponentFilter("tGSPut");
            boolean modified = ModifyComponentsAction.searchAndModify(item, processType, filter,
                    Collections.singletonList(node -> {
                        final ElementParameterType filesTable = ComponentUtilities.getNodeProperty(node, FILES_TABLE_NODE);
                        if (filesTable == null) {
                            return;
                        }

                        for (final Object elValue : filesTable.getElementValue()) {
                            ElementValueType elementValueType = (ElementValueType) elValue;
                            // replace \\ into /
                            if (FILEMASK_ELEMENT_REF.equals(elementValueType.getElementRef())) {
                                final String newValue = elementValueType.getValue().replaceAll("\\\\\\\\", "/");
                                elementValueType.setValue(newValue);
                            }
                        }
                    }));

            if (modified) {
                return ExecutionResult.SUCCESS_NO_ALERT;
            } else {
                return ExecutionResult.NOTHING_TO_DO;
            }
        } catch (Exception e) {
            ExceptionHandler.process(e);
            return ExecutionResult.FAILURE;
        }
    }

    @Override
    public Date getOrder() {
        return new GregorianCalendar(2023, Calendar.OCTOBER, 10, 17, 0, 0).getTime();
    }
}
