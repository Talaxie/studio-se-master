package org.talend.repository.model.migration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.exception.PersistenceException;
import org.talend.core.model.components.ComponentUtilities;
import org.talend.core.model.components.ModifyComponentsAction;
import org.talend.core.model.components.conversions.IComponentConversion;
import org.talend.core.model.components.filters.IComponentFilter;
import org.talend.core.model.components.filters.NameComponentFilter;
import org.talend.core.model.migration.AbstractJobMigrationTask;
import org.talend.core.model.properties.Item;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.designer.core.model.utils.emf.talendfile.ElementValueType;
import org.talend.designer.core.model.utils.emf.talendfile.NodeType;
import org.talend.designer.core.model.utils.emf.talendfile.ProcessType;
import org.talend.designer.core.model.utils.emf.talendfile.TalendFileFactory;

public class SetDefaultValue4tWriteJSONFieldGroupByOutput extends AbstractJobMigrationTask {

    public List<ERepositoryObjectType> getTypes() {
        List<ERepositoryObjectType> toReturn = new ArrayList<ERepositoryObjectType>();
        ERepositoryObjectType mrtype = ERepositoryObjectType.getType("PROCESS_MR"); //$NON-NLS-1$
        ERepositoryObjectType ditype = ERepositoryObjectType.getType("PROCESS"); //$NON-NLS-1$
        if (mrtype != null) {
            toReturn.add(mrtype);
        }
        if (ditype != null) {
            toReturn.add(ditype);
        }
        return toReturn;
    }

    @Override
    public Date getOrder() {
        return new GregorianCalendar(2014, 9, 23, 16, 0, 0).getTime();
    }

    @Override
    public ExecutionResult execute(Item item) {
        ProcessType processType = getProcessType(item);
        IComponentFilter filter = new NameComponentFilter("tWriteJSONField");
        try {
            ModifyComponentsAction.searchAndModify(item, processType, filter,
                    Arrays.<IComponentConversion> asList(new IComponentConversion() {

                        public void transform(NodeType node) {
                            EList<ElementValueType> list = ComponentUtilities.getNodeProperty(node, "GROUPBYS").getElementValue();
                            ElementValueType outputColumnPropertyElement = null;

                            int size = list.size();
                            if (list != null && size > 0) {
                                String outputFieldValue = ComponentUtilities.getNodeProperty(node, "JSONFIELD").getValue();
                                for (int i = 0, j = 0; i < size; i++) {
                                    outputColumnPropertyElement = TalendFileFactory.eINSTANCE.createElementValueType();
                                    outputColumnPropertyElement.setElementRef("OUTPUT_COLUMN"); //$NON-NLS-1$
                                    outputColumnPropertyElement.setValue(outputFieldValue);
                                    list.add(j, outputColumnPropertyElement);
                                    j = j + 2;
                                }
                            }

                        }
                    }));

        } catch (PersistenceException e) {
            ExceptionHandler.process(e);
            return ExecutionResult.FAILURE;
        }

        return ExecutionResult.SUCCESS_NO_ALERT;

    }

}
