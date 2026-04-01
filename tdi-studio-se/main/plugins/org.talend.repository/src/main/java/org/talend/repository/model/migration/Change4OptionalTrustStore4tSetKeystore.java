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
import org.talend.designer.core.model.utils.emf.talendfile.ElementParameterType;
import org.talend.designer.core.model.utils.emf.talendfile.NodeType;
import org.talend.designer.core.model.utils.emf.talendfile.ProcessType;

/**
 * see TDI-49753, we change the ui from check box to radio
 *
 */
public class Change4OptionalTrustStore4tSetKeystore extends AbstractJobMigrationTask {

    @Override
    public ExecutionResult execute(Item item) {
        ProcessType processType = getProcessType(item);
        boolean modified = false;
        IComponentFilter filter = new NameComponentFilter("tSetKeystore");
        try {
            modified = ModifyComponentsAction
                .searchAndModify(
                    item,
                    processType,
                    filter,
                    Arrays.<IComponentConversion> asList(new IComponentConversion() {
    
                        public void transform(NodeType node) {
                            ElementParameterType need_client_auth = ComponentUtilities.getNodeProperty(node, "NEED_CLIENT_AUTH");
                            if (need_client_auth != null) {
                                if("true".equalsIgnoreCase(need_client_auth.getValue())) {
                                    ComponentUtilities.addNodeProperty(node, "SET_TRUSTSTORE_KEYSTORE", "RADIO");
                                    ComponentUtilities.getNodeProperty(node, "SET_TRUSTSTORE_KEYSTORE").setValue("true");
                                    
                                    ComponentUtilities.addNodeProperty(node, "SET_TRUSTSTORE", "RADIO");
                                    ComponentUtilities.getNodeProperty(node, "SET_TRUSTSTORE").setValue("false");
                                    need_client_auth.setValue("false");
                                }
                            }
                        }
                        
                    }));
        } catch (PersistenceException e) {
            ExceptionHandler.process(e);
            return ExecutionResult.FAILURE;
        }
        if (modified) {
            return ExecutionResult.SUCCESS_WITH_ALERT;
        } else {
            return ExecutionResult.NOTHING_TO_DO;
        }

    }

    public Date getOrder() {
        GregorianCalendar gc = new GregorianCalendar(2023, 4, 24, 12, 0, 0);
        return gc.getTime();
    }
}
