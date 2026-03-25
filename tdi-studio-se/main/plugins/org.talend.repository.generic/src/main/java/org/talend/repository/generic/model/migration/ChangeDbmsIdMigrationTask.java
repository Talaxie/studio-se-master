// ============================================================================
//
// Copyright (C) 2006-2022 Talaxie Inc. - www.deilink.fr
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talaxie SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.repository.generic.model.migration;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.exception.PersistenceException;
import org.talend.core.language.ECodeLanguage;
import org.talend.core.model.components.ComponentUtilities;
import org.talend.core.model.components.ModifyComponentsAction;
import org.talend.core.model.components.conversions.IComponentConversion;
import org.talend.core.model.components.filters.IComponentFilter;
import org.talend.core.model.components.filters.NameComponentFilter;
import org.talend.core.model.migration.AbstractAllJobMigrationTask;
import org.talend.core.model.properties.Item;
import org.talend.core.utils.TalendQuoteUtils;
import org.talend.designer.core.model.utils.emf.talendfile.ElementParameterType;
import org.talend.designer.core.model.utils.emf.talendfile.NodeType;
import org.talend.designer.core.model.utils.emf.talendfile.ProcessType;

/**
 * 
 * created by hcyi on Apr 6, 2022 Detailled comment
 *
 */
public class ChangeDbmsIdMigrationTask extends AbstractAllJobMigrationTask {

	@Override
	public ExecutionResult execute(Item item) {
		final ProcessType processType = getProcessType(item);
		if (getProject().getLanguage() != ECodeLanguage.JAVA || processType == null) {
			return ExecutionResult.NOTHING_TO_DO;
		}
        String[] compNames = { "tJDBCSCDELT" }; //$NON-NLS-1$

        boolean modified = false;
		for (String compName : compNames) {
			IComponentFilter filter = new NameComponentFilter(compName); // $NON-NLS-1$
			try {
                modified |= ModifyComponentsAction.searchAndModify(item, processType, filter,
						Arrays.<IComponentConversion>asList(new IComponentConversion() {

							public void transform(NodeType node) {
                                ElementParameterType mappingFile = ComponentUtilities.getNodeProperty(node, "MAPPING"); //$NON-NLS-1$
                                if (mappingFile != null) {
                                    ComponentUtilities.setNodeValue(node, "MAPPING", //$NON-NLS-1$
                                            TalendQuoteUtils.removeQuotesIfExist(mappingFile.getValue()));
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
	
	@Override
	public Date getOrder() {
        GregorianCalendar gc = new GregorianCalendar(2022, 4, 6, 15, 0, 0);
		return gc.getTime();
	}

}
