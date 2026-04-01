package org.talend.repository.model.migration;

import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;

import org.talend.commons.exception.ExceptionHandler;
import org.talend.core.language.ECodeLanguage;
import org.talend.core.model.components.ComponentUtilities;
import org.talend.core.model.components.ModifyComponentsAction;
import org.talend.core.model.components.conversions.IComponentConversion;
import org.talend.core.model.components.filters.IComponentFilter;
import org.talend.core.model.components.filters.NameComponentFilter;
import org.talend.core.model.migration.AbstractJobMigrationTask;
import org.talend.core.model.properties.Item;
import org.talend.designer.core.model.utils.emf.talendfile.NodeType;
import org.talend.designer.core.model.utils.emf.talendfile.ProcessType;

/**
 * https://jira.talendforge.org/browse/TDI-45870
 */
public class AddUseScientificNotationCheckboxTWriteJSONField extends AbstractJobMigrationTask {
    private boolean modified = false;

    public ExecutionResult execute(Item item) {
        ProcessType processType = getProcessType(item);
        if (getProject().getLanguage() != ECodeLanguage.JAVA || processType == null) {
            return ExecutionResult.NOTHING_TO_DO;
        }

        String[] componentsName = new String[] {"tWriteJSONField","tWriteJSONFieldIn"};
        modified = false;
        
        try {
            for (int i = 0; i < componentsName.length; i++) {
                IComponentFilter filter = new NameComponentFilter(componentsName[i]);
                ModifyComponentsAction.searchAndModify(item, processType, filter,
                        Collections.singletonList(new IComponentConversion() {

                            public void transform(NodeType node) {
                                if (ComponentUtilities.getNodeProperty(node, "USE_SCIENTIFIC_NOTATION") == null) {
                                    ComponentUtilities.addNodeProperty(node, "USE_SCIENTIFIC_NOTATION", "CHECK");
                                    ComponentUtilities.getNodeProperty(node, "USE_SCIENTIFIC_NOTATION").setValue("true");
                                    modified = true;
                                }
                            }
                        }));
            }
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

    public Date getOrder() {
        GregorianCalendar gc = new GregorianCalendar(2022, 03, 03, 12, 0, 0);
        return gc.getTime();
    }
}