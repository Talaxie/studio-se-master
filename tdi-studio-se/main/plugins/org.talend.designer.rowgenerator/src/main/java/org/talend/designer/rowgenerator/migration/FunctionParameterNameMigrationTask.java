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
package org.talend.designer.rowgenerator.migration;

import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Set;

import org.eclipse.emf.common.util.EMap;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.exception.PersistenceException;
import org.talend.core.language.ECodeLanguage;
import org.talend.core.model.components.ModifyComponentsAction;
import org.talend.core.model.components.conversions.IComponentConversion;
import org.talend.core.model.components.filters.IComponentFilter;
import org.talend.core.model.components.filters.NameComponentFilter;
import org.talend.core.model.migration.AbstractJobMigrationTask;
import org.talend.core.model.properties.Item;
import org.talend.designer.core.model.utils.emf.talendfile.ColumnType;
import org.talend.designer.core.model.utils.emf.talendfile.MetadataType;
import org.talend.designer.core.model.utils.emf.talendfile.NodeType;
import org.talend.designer.core.model.utils.emf.talendfile.ProcessType;
import org.talend.designer.rowgenerator.data.Function;
import org.talend.designer.rowgenerator.data.FunctionManager;
import org.talend.designer.rowgenerator.ui.editor.MetadataColumnExt;
import org.talend.utils.json.JSONArray;
import org.talend.utils.json.JSONException;
import org.talend.utils.json.JSONObject;

/**
 * DOC jding  class global comment. Detailled comment
 */
public class FunctionParameterNameMigrationTask extends AbstractJobMigrationTask {

    private Set<String> paramNameList;

    @Override
    public Date getOrder() {
        GregorianCalendar gc = new GregorianCalendar(2023, 6, 16, 12, 0, 0);
        return gc.getTime();
    }

    @Override
    public ExecutionResult execute(Item item) {
        ProcessType processType = getProcessType(item);
        if (getProject().getLanguage() != ECodeLanguage.JAVA || processType == null) {
            return ExecutionResult.NOTHING_TO_DO;
        }
        Set<String> parameterNameList = getParameterNameList();
        boolean[] modified = new boolean[1];

        IComponentConversion conversion = new IComponentConversion() {

            @Override
            public void transform(NodeType node) {
                for (Object metadata : node.getMetadata()) {
                    try {
                        if (metadata instanceof MetadataType) {
                            MetadataType metaType = (MetadataType) metadata;
                            for (Object column : metaType.getColumn()) {
                                if (column instanceof ColumnType) {
                                    ColumnType columnType = (ColumnType) column;
                                    EMap additionalField = columnType.getAdditionalField();
                                    String functionInfo = (String) additionalField.get(MetadataColumnExt.FUNCTION_INFO);
                                    if (functionInfo != null) {
                                        JSONObject functionObj = new JSONObject(functionInfo);
                                        JSONArray parametersArray = functionObj.getJSONArray(Function.PARAMETERS);
                                        for (int i = 0; i < parametersArray.length(); i++) {
                                            JSONObject parameterObj = parametersArray.getJSONObject(i);
                                            String paramName = parameterObj.getString(Function.PARAMETER_NAME);
                                            if (parameterNameList.contains(paramName)) {
                                                parameterObj.put(Function.PARAMETER_NAME,
                                                        FunctionManager.EFunctionParameter.CUSTOMIZE_PARAM.getParamName());
                                                modified[0] = true;
                                            }
                                        }
                                        additionalField.put(MetadataColumnExt.FUNCTION_INFO, functionObj.toString());
                                    }
                                }
                            }
                        }
                    } catch (JSONException e) {
                        ExceptionHandler.process(e);
                    }
                }
            }
        };

        IComponentFilter componentFilter = new NameComponentFilter("tRowGenerator");
        try {
            ModifyComponentsAction.searchAndModify(item, processType, componentFilter, Collections.singletonList(conversion));
        } catch (PersistenceException e) {
            ExceptionHandler.process(e);
            return ExecutionResult.FAILURE;
        }

        if (modified[0]) {
            return ExecutionResult.SUCCESS_NO_ALERT;
        } else {
            return ExecutionResult.NOTHING_TO_DO;
        }
    }

    private Set<String> getParameterNameList() {
        if (paramNameList != null) {
            return paramNameList;
        }

        paramNameList = new HashSet<String>();
        String[] localeArray = new String[] { "de", "es", "fr", "it", "ja", "ru", "sk", "slk", "zh_CN" };
        for (String loc : localeArray) {
            try {
                Locale locale = new Locale(loc);
                if ("zh_CN".equals(loc)) {
                    locale = new Locale("zh", "CN");
                }
                ResourceBundle bundle = ResourceBundle.getBundle("org.talend.core.runtime.i18n.messages", locale,
                        FunctionManager.class.getClassLoader());
                String localeString = bundle.getString("FunctionManager.PurePerl.ParaName");
                paramNameList.add(localeString);
            } catch (MissingResourceException e) {
                // key not exist, do nothing
            }
        }
        paramNameList.add("Paramètre personnalisé"); //$NON-NLS-1$
        paramNameList.add("カスタマイズパラメーター"); //$NON-NLS-1$
        return paramNameList;
    }

}
