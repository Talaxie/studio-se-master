/**
 * Copyright (C) 2006-2022 Talaxie Inc. - www.deilink.fr
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package org.talend.sdk.component.studio.ui.wizard.page;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.core.model.metadata.builder.connection.Connection;
import org.talend.core.model.metadata.types.JavaTypesManager;
import org.talend.core.model.process.EParameterFieldType;
import org.talend.core.model.process.IContextParameter;
import org.talend.core.model.properties.ContextItem;
import org.talend.core.model.utils.ContextParameterUtils;
import org.talend.core.ui.context.model.table.ConectionAdaptContextVariableModel;
import org.talend.core.utils.TalendQuoteUtils;
import org.talend.designer.core.model.utils.emf.talendfile.ContextType;
import org.talend.metadata.managment.ui.model.IConnParamName;
import org.talend.metadata.managment.ui.utils.ConnectionContextHelper;
import org.talend.metadata.managment.ui.wizard.context.AbstractRepositoryContextHandler;
import org.talend.sdk.component.studio.metadata.model.TaCoKitConfigurationModel;
import org.talend.sdk.component.studio.metadata.model.TaCoKitConfigurationModel.ValueModel;
import org.talend.sdk.component.studio.model.parameter.ValueConverter;
import org.talend.sdk.component.studio.model.parameter.VersionParameter;

public class TaCoKitContextHandler extends AbstractRepositoryContextHandler {

    @Override
    public boolean isRepositoryConType(Connection connection) {
        return TaCoKitConfigurationModel.isTacokit(connection);
    }

    @Override
    public List<IContextParameter> createContextParameters(String prefixName, Connection connection,
            Set<IConnParamName> paramSet) {
        List<IContextParameter> varList = new ArrayList<IContextParameter>();
        String paramPrefix = prefixName + ConnectionContextHelper.LINE;
        String paramName = null;
        for (IConnParamName param : paramSet) {
            if (param instanceof TaCoKitParamName) {
                TaCoKitParamName taCoKitParamName = (TaCoKitParamName) param;
                if (taCoKitParamName.getType() == null) {
                    continue;// remove "configuration.connectionParametersList[1].parameterValue"
                }
                String name = taCoKitParamName.getName();// configuration.accout
                String substringName = StringUtils.substringAfterLast(name, ConnectionContextHelper.DOT);// accout
                if (StringUtils.isNoneBlank(substringName)) {
                    paramName = paramPrefix + substringName;
                } else {
                    paramName = paramPrefix + name;
                }
                String value = ((TaCoKitParamName) param).getValue();
                if (taCoKitParamName.getType() == EParameterFieldType.PASSWORD
                        || taCoKitParamName.getType() == EParameterFieldType.HIDDEN_TEXT) {
                    ConnectionContextHelper.createParameters(varList, paramName, value, JavaTypesManager.PASSWORD);
                } else {
                    ConnectionContextHelper.createParameters(varList, paramName, value);
                }
            }
        }
        return varList;
    }

    @Override
    public void setPropertiesForContextMode(String prefixName, Connection connection, Set<IConnParamName> paramSet) {
        if (connection == null) {
            return;
        }
        String originalVariableName = prefixName + ConnectionContextHelper.LINE;
        String taCokitVariableName = null;
        TaCoKitConfigurationModel taCoKitConfigurationModel = new TaCoKitConfigurationModel(connection);
        for (IConnParamName param : paramSet) {
            if (param instanceof TaCoKitParamName) {
                TaCoKitParamName taCoKitParam = (TaCoKitParamName) param;
                originalVariableName = prefixName + ConnectionContextHelper.LINE;
                String name = taCoKitParam.getName();
                String substringName = StringUtils.substringAfterLast(name, ConnectionContextHelper.DOT);
                if (StringUtils.isNoneBlank(substringName)) {
                    taCokitVariableName = originalVariableName + substringName;
                } else {
                    taCokitVariableName = originalVariableName + name;
                }
                String newScriptCode = ContextParameterUtils.getNewScriptCode(taCokitVariableName, LANGUAGE);
                taCoKitConfigurationModel.setValue(taCoKitParam.getName(), newScriptCode);
            }
        }

    }

    @Override
    public void revertPropertiesForContextMode(Connection connection, ContextType contextType) {
        TaCoKitConfigurationModel taCoKitConfigurationModel = new TaCoKitConfigurationModel(connection);
        TaCoKitConfigurationModel parentConfigurationModel = null;
        try {
            parentConfigurationModel = taCoKitConfigurationModel.getParentConfigurationModel();
        } catch (Exception e) {
            ExceptionHandler.process(e);
        }
        Map<String, String> properties = taCoKitConfigurationModel.getProperties();
        if (properties != null && properties.size() > 0) {
            Set<String> keySet = properties.keySet();
            for (String key : keySet) {
                if (parentConfigurationModel != null) {
                    boolean isParentModelParameter = parentConfigurationModel.isCurrentModelParameter(key);
                    if (isParentModelParameter) {
                        continue;
                    }
                }
                if (key.endsWith(VersionParameter.VERSION_SUFFIX)) {
                    continue;
                }
                revertProperties(taCoKitConfigurationModel, contextType, key);
            }
        }
    }

    private void revertProperties(TaCoKitConfigurationModel taCoKitConfigurationModel, ContextType contextType, String key) {
        try {
            ValueModel valueModel = taCoKitConfigurationModel.getValue(key);
            EParameterFieldType eParameterFieldType = taCoKitConfigurationModel.getEParameterFieldType(key);
            if (valueModel != null) {
                if (eParameterFieldType == EParameterFieldType.TABLE) {
                    List<Map<String, Object>> tableValueList = ValueConverter.toTable((String) valueModel.getValue());
                    List<Map<String, Object>> originalTableValueList = new ArrayList<>();
                    for (Map<String, Object> map : tableValueList) {
                        for (Entry<String, Object> entryTable : map.entrySet()) {
                            Object value = entryTable.getValue();
                            if (value instanceof String) {
                                String tableOriginalValue = ContextParameterUtils.getOriginalValue(contextType, value.toString());
                                if (tableOriginalValue != null) {
                                    String[] splitValues = tableOriginalValue.split(";");
                                    for (String s : splitValues) {
                                        Map<String, Object> originMap = new HashMap<String, Object>();
                                        originalTableValueList.add(originMap);
                                        originMap.put(entryTable.getKey(), TalendQuoteUtils.removeQuotes(s));
                                    }
                                }
                            }
                        }
                    }
                    taCoKitConfigurationModel.setValue(key, originalTableValueList.toString());
                    return;
                }
                String applicationId = TalendQuoteUtils
                        .removeQuotes(ContextParameterUtils.getOriginalValue(contextType, valueModel.getValue()));
                taCoKitConfigurationModel.setValue(key, applicationId);
            }
        } catch (Exception e) {
            ExceptionHandler.process(e);
        }
    }

    @Override
    protected void matchContextForAttribues(Connection connection, IConnParamName param, String contextVariableName) {
        TaCoKitConfigurationModel taCoKitConfigurationModel = new TaCoKitConfigurationModel(connection);
        if (param instanceof TaCoKitParamName) {
            TaCoKitParamName taCoKitParamName = (TaCoKitParamName) param;
            taCoKitConfigurationModel.setValue(taCoKitParamName.getName(),
                    ContextParameterUtils.getNewScriptCode(contextVariableName, LANGUAGE));
        }
    }

    @Override
    public void setPropertiesForExistContextMode(Connection connection, Set<IConnParamName> paramSet,
            Map<ContextItem, List<ConectionAdaptContextVariableModel>> adaptMap) {
        if (connection == null) {
            return;
        }
        TaCoKitConfigurationModel taCoKitConfigurationModel = new TaCoKitConfigurationModel(connection);
        for (IConnParamName param : paramSet) {
            if (param instanceof TaCoKitParamName) {
                String taCokitVariableName = null;
                TaCoKitParamName taCoKitParam = (TaCoKitParamName) param;
                if (adaptMap != null && adaptMap.size() > 0) {
                    for (Map.Entry<ContextItem, List<ConectionAdaptContextVariableModel>> entry : adaptMap.entrySet()) {
                        List<ConectionAdaptContextVariableModel> modelList = entry.getValue();
                        for (ConectionAdaptContextVariableModel model : modelList) {
                            if (model.getValue().equals(taCoKitParam.getName())) {
                                taCokitVariableName = model.getName();
                                break;
                            }
                        }
                    }
                }
                String newScriptCode = ContextParameterUtils.getNewScriptCode(taCokitVariableName, LANGUAGE);
                taCoKitConfigurationModel.setValue(taCoKitParam.getName(), newScriptCode);
            }
        }
    }

    @Override
    public Set<String> getConAdditionPropertiesForContextMode(Connection conn) {
        return new HashSet<String>();
    }

    @Override
    protected void matchAdditionProperties(Connection conn, Map<ContextItem, List<ConectionAdaptContextVariableModel>> adaptMap) {
        // nothing to do
    }
}
