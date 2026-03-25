// ============================================================================
//
// Copyright (C) 2006-2023 Talaxie Inc. - www.deilink.fr
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talaxie SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.repository.model.migration;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.exception.PersistenceException;
import org.talend.core.model.components.ComponentUtilities;
import org.talend.core.model.components.ModifyComponentsAction;
import org.talend.core.model.components.conversions.IComponentConversion;
import org.talend.core.model.components.filters.IComponentFilter;
import org.talend.core.model.components.filters.NameComponentFilter;
import org.talend.core.model.migration.AbstractJobMigrationTask;
import org.talend.core.model.properties.Item;
import org.talend.core.model.properties.ProcessItem;
import org.talend.designer.core.model.utils.emf.talendfile.ElementParameterType;
import org.talend.designer.core.model.utils.emf.talendfile.NodeType;
import org.talend.designer.core.model.utils.emf.talendfile.ProcessType;

/**
 * set tAS400Output "Return generated keys" value to "true" for old job.
 *
 */
public class ChangeReturnKeysDefault4tAS400Output extends AbstractJobMigrationTask {

    @Override
    public ExecutionResult execute(Item item) {
        ProcessType processType = getProcessType(item);
        boolean modified = false;
        // Only modify when job include tAS400LastInsertId
        if (hasAS400LastInsertId(item)) {
            IComponentFilter filter = new NameComponentFilter("tAS400Output");
            try {
                modified = ModifyComponentsAction
                        .searchAndModify(
                                item,
                                processType,
                                filter,
                                Arrays.<IComponentConversion> asList(new IComponentConversion() {

                                    public void transform(NodeType node) {
                                        ElementParameterType returnKeys = ComponentUtilities
                                                .getNodeProperty(node,
                                                        "RETURN_GENERATED_KEYS");
                                        if (returnKeys == null) {
                                            ComponentUtilities.addNodeProperty(node, "RETURN_GENERATED_KEYS", "CHECK");
                                            ComponentUtilities
                                                    .getNodeProperty(node, "RETURN_GENERATED_KEYS")
                                                    .setValue("true");
                                        }
                                    }
                                }));
            } catch (PersistenceException e) {
                ExceptionHandler.process(e);
                return ExecutionResult.FAILURE;
            }
        }
        if (modified) {
            return ExecutionResult.SUCCESS_WITH_ALERT;
        } else {
            return ExecutionResult.NOTHING_TO_DO;
        }

    }

    private boolean hasAS400LastInsertId(Item item) {
        if (item instanceof ProcessItem) {
            ProcessType processType = ((ProcessItem) item).getProcess();
            for (Object o : processType.getNode()) {
                if (o instanceof NodeType) {
                    NodeType currentNode = (NodeType) o;
                    if ("tAS400LastInsertId".equals(currentNode.getComponentName())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public Date getOrder() {
        GregorianCalendar gc = new GregorianCalendar(2023, 1, 15, 12, 0, 0);
        return gc.getTime();
    }
}
