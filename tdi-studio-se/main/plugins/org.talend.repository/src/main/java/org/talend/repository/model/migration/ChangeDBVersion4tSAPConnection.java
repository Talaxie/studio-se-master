// Copyright (C) 2006-2021 Talaxie Inc. - www.deilink.fr
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
import org.talend.designer.core.model.utils.emf.talendfile.ElementParameterType;
import org.talend.designer.core.model.utils.emf.talendfile.NodeType;
import org.talend.designer.core.model.utils.emf.talendfile.ProcessType;

public class ChangeDBVersion4tSAPConnection extends AbstractJobMigrationTask {

    @Override
    public Date getOrder() {
        GregorianCalendar gc = new GregorianCalendar(2021, 8, 6, 12, 0, 0);
        return gc.getTime();
    }

    @Override
    public ExecutionResult execute(Item item) {
        final ProcessType processType = getProcessType(item);
        String compName = "tSAPConnection";

        IComponentConversion changeDBNVersion = new IComponentConversion() {

            public void transform(NodeType node) {
                if (node == null) {
                    return;
                }
                ElementParameterType database = ComponentUtilities.getNodeProperty(node, "DB_VERSION"); //$NON-NLS-1$
                if (database == null) {
                    return;
                }
                String dbname = database.getValue();
                if ("sapjco3.jar".equals(dbname)) {
                    database.setValue("com.sap.conn.jco.sapjco.jar");
                }
            }
        };

        IComponentFilter filter = new NameComponentFilter(compName);
        try {
            boolean modified = ModifyComponentsAction
                    .searchAndModify(item, processType, filter, Arrays
                            .<IComponentConversion> asList(changeDBNVersion));
            if (modified) {
                return ExecutionResult.SUCCESS_NO_ALERT;
            } else {
                return ExecutionResult.NOTHING_TO_DO;
            }
        } catch (PersistenceException e) {
            ExceptionHandler.process(e);
            return ExecutionResult.FAILURE;
        }

    }
}
