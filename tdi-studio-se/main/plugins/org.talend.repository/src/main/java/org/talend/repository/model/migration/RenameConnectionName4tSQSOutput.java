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

import java.util.Date;
import java.util.GregorianCalendar;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.exception.PersistenceException;
import org.talend.core.model.migration.AbstractJobMigrationTask;
import org.talend.core.model.properties.Item;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.designer.core.model.utils.emf.talendfile.ConnectionType;
import org.talend.designer.core.model.utils.emf.talendfile.ElementParameterType;
import org.talend.designer.core.model.utils.emf.talendfile.MetadataType;
import org.talend.designer.core.model.utils.emf.talendfile.NodeType;
import org.talend.designer.core.model.utils.emf.talendfile.ProcessType;

/**
 * Rename connection name of tSQSOutput
 */
public class RenameConnectionName4tSQSOutput extends AbstractJobMigrationTask {

	@Override
	public ExecutionResult execute(Item item) {
		ProcessType processType = getProcessType(item);
		if (processType == null) {
			return ExecutionResult.NOTHING_TO_DO;
		}
		try {
            boolean modified = renameConnections(item, processType);
            if (modified) {
                return ExecutionResult.SUCCESS_WITH_ALERT;
            } else {
                return ExecutionResult.NOTHING_TO_DO;
            }
		} catch (Exception e) {
			ExceptionHandler.process(e);
			return ExecutionResult.FAILURE;
		}
	}

    private boolean renameConnections(Item item, ProcessType processType) throws PersistenceException {

		ProxyRepositoryFactory factory = ProxyRepositoryFactory.getInstance();

		boolean modified = false;

		for (Object o : processType.getConnection()) {

			ConnectionType currentConnection = (ConnectionType) o;

			if ("FLOW".equals(currentConnection.getConnectorName())) {//$NON-NLS-1$
				String nodeUniqueName = currentConnection.getSource();

				for (Object n : processType.getNode()) {
					NodeType node = (NodeType) n;
					if ("tSQSOutput".equals(node.getComponentName())) {//$NON-NLS-1$
						EList metadatasList = node.getMetadata();
						if (metadatasList != null && metadatasList.size() > 0) {
							MetadataType metadata = (MetadataType) metadatasList.get(0);
							MetadataType newMetadata = EcoreUtil.copy(metadata);
							newMetadata.setConnector("MAIN");
							newMetadata.setName("MAIN");
							node.getMetadata().add(newMetadata);
							modified = true;
						}
						for (Object e : node.getElementParameter()) {
							ElementParameterType p = (ElementParameterType) e;
							if ("UNIQUE_NAME".equals(p.getName()) && nodeUniqueName.equals(p.getValue())) {//$NON-NLS-1$
								currentConnection.setConnectorName("MAIN");//$NON-NLS-1$
								modified = true;
							}
						}
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
		GregorianCalendar gc = new GregorianCalendar(2021, 6, 19, 12, 0, 0);
		return gc.getTime();
	}

}
