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
package org.talend.repository.model.migration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.apache.commons.lang.StringUtils;
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
import org.talend.designer.core.model.utils.emf.talendfile.ElementValueType;
import org.talend.designer.core.model.utils.emf.talendfile.NodeType;
import org.talend.designer.core.model.utils.emf.talendfile.ProcessType;

/**
 * DOC jding  class global comment. Detailled comment
 */
public class ChangeGoogleAnalyticsReportTableEleValueMigrationTask extends AbstractJobMigrationTask {

    @Override
    public Date getOrder() {
        GregorianCalendar gc = new GregorianCalendar(2022, 6, 8, 18, 0, 0);
        return gc.getTime();
    }

    @Override
    public ExecutionResult execute(Item item) {
        ProcessType processType = getProcessType(item);
        if (getProject().getLanguage() != ECodeLanguage.JAVA || processType == null) {
            return ExecutionResult.NOTHING_TO_DO;
        }
        String[] componentsNameToAffect = new String[] { "GoogleAnalyticsReport" };

        IComponentConversion conversion = new IComponentConversion() {

            @Override
            public void transform(NodeType node) {
                String[] valueSelectionColNames = new String[] { "configuration.dataset.dimensions[].name",
                        "configuration.dataset.metrics[].expression" };
                List<ElementParameterType> tableParamTypes = new ArrayList<ElementParameterType>();
                tableParamTypes.add(ComponentUtilities.getNodeProperty(node, "configuration.dataset.dimensions"));
                tableParamTypes.add(ComponentUtilities.getNodeProperty(node, "configuration.dataset.metrics"));
                for (ElementParameterType paramType : tableParamTypes) {
                    for (ElementValueType elementValue : (List<ElementValueType>) paramType.getElementValue()) {
                        if (Arrays.asList(valueSelectionColNames).contains(elementValue.getElementRef())
                                && StringUtils.isNotBlank(elementValue.getValue()) && elementValue.getValue().contains("(")
                                && elementValue.getValue().contains(")")) {
                            String value = elementValue.getValue();
                            elementValue.setLabel(value);
                            elementValue.setValue(value.substring(value.lastIndexOf("(") + 1, value.lastIndexOf(")")));
                        }
                    }
                }
            }
        };

        boolean modified = false;
        for (String componentName : componentsNameToAffect) {
            IComponentFilter componentFilter = new NameComponentFilter(componentName);
            try {
                modified |= ModifyComponentsAction.searchAndModify(item, processType, componentFilter,
                        Collections.singletonList(conversion));
            } catch (PersistenceException e) {
                ExceptionHandler.process(e);
                return ExecutionResult.FAILURE;
            }
        }
        if (modified) {
            return ExecutionResult.SUCCESS_NO_ALERT;
        } else {
            return ExecutionResult.NOTHING_TO_DO;
        }
    }

}
