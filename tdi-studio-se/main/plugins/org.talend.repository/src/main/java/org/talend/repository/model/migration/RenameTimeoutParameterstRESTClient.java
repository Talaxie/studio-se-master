// ============================================================================
//
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

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.eclipse.emf.common.util.EList;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.exception.PersistenceException;
import org.talend.core.model.migration.AbstractJobMigrationTask;
import org.talend.core.model.properties.Item;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.designer.core.model.utils.emf.talendfile.ElementParameterType;
import org.talend.designer.core.model.utils.emf.talendfile.NodeType;
import org.talend.designer.core.model.utils.emf.talendfile.ProcessType;

/**
 * Rename timeout parameters for tRESTClient
 */
public class RenameTimeoutParameterstRESTClient extends AbstractJobMigrationTask {

	@Override
	public ExecutionResult execute(Item item) {
		ProcessType processType = getProcessType(item);
		if (processType == null) {
			return ExecutionResult.NOTHING_TO_DO;
		}
		try {
			boolean modified = renameConnections(item, processType);
			return modified? ExecutionResult.SUCCESS_WITH_ALERT: ExecutionResult.NOTHING_TO_DO;
		} catch (Exception e) {
			ExceptionHandler.process(e);
			return ExecutionResult.FAILURE;
		}
	}


	private boolean renameConnections(Item item, ProcessType processType) throws PersistenceException {
		
        ProxyRepositoryFactory factory = ProxyRepositoryFactory.getInstance();
        boolean modified = false;
        EList nodes = processType.getNode();
        for (Object n : nodes) {
            NodeType type = (NodeType) n;
            if (type.getComponentName().equals("tRESTClient")) {
                EList elementParameterList = type.getElementParameter();
                for (Object elem : elementParameterList) {
                    ElementParameterType elemType = (ElementParameterType) elem;
                    if (elemType.getName().equals("CONNECTION_TIMEOUT_DESC")) {
                        elemType.setValue("");
                        modified = true;
                    }
                    if (elemType.getName().equals("RECEIVE_TIMEOUT_DESC")) {
                        elemType.setValue("(See tRESTClient doc. to configure timeouts for Talend Runtime)");
                        modified = true;
                    }
                }
            }
        }
        
		if (modified) {
			factory.save(item, true);
		}

		return modified;
	}
	
	public Date getOrder() {
        GregorianCalendar gc = new GregorianCalendar(2022, Calendar.APRIL, 21, 17, 0, 0);
		return gc.getTime();
	}

}