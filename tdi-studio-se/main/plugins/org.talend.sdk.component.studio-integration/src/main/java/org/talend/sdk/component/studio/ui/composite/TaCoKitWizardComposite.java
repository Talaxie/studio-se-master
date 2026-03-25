/**
 * Copyright (C) 2006-2021 Talaxie Inc. - www.deilink.fr
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
package org.talend.sdk.component.studio.ui.composite;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Composite;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.core.model.metadata.builder.connection.Connection;
import org.talend.core.model.process.EComponentCategory;
import org.talend.core.model.process.EParameterFieldType;
import org.talend.core.model.process.Element;
import org.talend.core.model.process.IElementParameter;
import org.talend.sdk.component.server.front.model.ConfigTypeNode;
import org.talend.sdk.component.server.front.model.SimplePropertyDefinition;
import org.talend.sdk.component.studio.Lookups;
import org.talend.sdk.component.studio.metadata.TaCoKitCache;
import org.talend.sdk.component.studio.metadata.model.TaCoKitConfigurationModel;
import org.talend.sdk.component.studio.metadata.model.TaCoKitConfigurationModel.ValueModel;
import org.talend.sdk.component.studio.model.parameter.TaCoKitElementParameter;
import org.talend.sdk.component.studio.model.parameter.TaCoKitElementParameter.IValueChangedListener;
import org.talend.sdk.component.studio.model.parameter.ValueConverter;
import org.talend.sdk.component.studio.ui.composite.problemmanager.IProblemManager;
import org.talend.sdk.component.studio.ui.wizard.page.TaCoKitPageBuildHelper;
import org.talend.sdk.component.studio.util.TacokitContextUtil;

/**
 * Stores {@link TaCoKitConfigurationModel} and sets Configuration Model Updater listener for each
 * {@link TaCoKitElementParameter}
 */
public class TaCoKitWizardComposite extends TaCoKitComposite {

    private final TaCoKitConfigurationModel configurationModel;

    private final IValueChangedListener configurationUpdater;

    private final boolean isNew;
    
    private TaCoKitPageBuildHelper taCoKitPageBuildHelper;

    private boolean isDataset;

    private String dataStorePrefix;

    public TaCoKitWizardComposite(final Composite parentComposite, final int styles, final EComponentCategory section,
            final Element element, final TaCoKitConfigurationModel model, final boolean isCompactView,
            final Color backgroundColor, final boolean isNew, final IProblemManager problemManager, final TaCoKitPageBuildHelper taCoKitPageBuildHelper) {
        super(parentComposite, styles, section, element, isCompactView, backgroundColor, problemManager);
        this.taCoKitPageBuildHelper = taCoKitPageBuildHelper;
        this.configurationModel = model;
        this.isNew = isNew;
        configurationUpdater = new ConfigurationModelUpdater();
        init();
    }

    public void updateParameter() {
        // no matter if it's a BASIC or ADVANCED composite, do update for all
        taCoKitPageBuildHelper.getParameters().stream().filter(p -> p instanceof TaCoKitElementParameter)
                .map(p -> (TaCoKitElementParameter) p).filter(TaCoKitElementParameter::isPersisted)
                .filter(p -> !EParameterFieldType.SCHEMA_TYPE.equals(p.getFieldType())).forEach(parameter -> {
                    parameter.addValueChangeListener(configurationUpdater);
                    try {
                        String key = parameter.getName();
                        ValueModel valueModel = configurationModel.getValue(key);
                        setParamContextMode(parameter);
                        if (valueModel != null) {
                            if (valueModel.getConfigurationModel() != configurationModel) {
                                parameter.setReadOnly(true);
                                TaCoKitConfigurationModel parentConfigurationModel = configurationModel
                                        .getParentConfigurationModel();
                                if (TacokitContextUtil.isSupportContextFieldType(parameter.getFieldType())
                                        && parentConfigurationModel != null) {
                                    Connection parentConnection = parentConfigurationModel.getConnection();
                                    if (parentConnection != null) {
                                        boolean contextMode = parentConnection.isContextMode();
                                        parameter.setContextMode(contextMode);
                                    }
                                }
                            }
                            String value = valueModel.getValue();
                            if (value != null) {
                                parameter.setValue(value);
                            }
                        }
                    } catch (Exception e) {
                        ExceptionHandler.process(e);
                    }
                });

    }

    private void init() {
        if (configurationModel.getConfigTypeNode().getConfigurationType().equals("dataset")) {
            isDataset = true;
            String parentId = configurationModel.getConfigTypeNode().getParentId();
            TaCoKitCache cache = Lookups.taCoKitCache();
            Map<String, ConfigTypeNode> configTypeNodeMap = cache.getConfigTypeNodeMap();
            ConfigTypeNode parentNode = configTypeNodeMap.values().stream().filter(n -> parentId.equals(n.getId())).findFirst()
                    .orElse(null);
            if (parentNode != null) {
                List<SimplePropertyDefinition> parentProperties = parentNode.getProperties();
                dataStorePrefix = parentProperties.stream().filter(p -> p.getName().equals("configuration"))
                        .map(p -> p.getMetadata().get("configurationtype::name")).findFirst().orElse(null);
                if (StringUtils.isNotBlank(dataStorePrefix)) {
                    dataStorePrefix = "configuration." + dataStorePrefix;
                }
            }
        }

        elem.getElementParameters().stream().filter(p -> p instanceof TaCoKitElementParameter)
                .map(p -> (TaCoKitElementParameter) p).filter(TaCoKitElementParameter::isPersisted)
                .filter(p -> !EParameterFieldType.SCHEMA_TYPE.equals(p.getFieldType())).forEach(parameter -> {
                    parameter.addValueChangeListener(configurationUpdater);
                    try {
                        String key = parameter.getName();
                        if (isNew) {
                            parameter.setValue(parameter.getValue());
                        }
                        setParamContextMode(parameter);

                        ValueModel valueModel = configurationModel.getValue(key);
                        if (valueModel != null) {
                            if (valueModel.getConfigurationModel() != configurationModel) {
                                parameter.setReadOnly(true);
                                TaCoKitConfigurationModel parentConfigurationModel = configurationModel
                                        .getParentConfigurationModel();
                                if (TacokitContextUtil.isSupportContextFieldType(parameter.getFieldType())
                                        && parentConfigurationModel != null) {
                                    Connection parentConnection = parentConfigurationModel.getConnection();
                                    if (parentConnection != null) {
                                        boolean contextMode = parentConnection.isContextMode();
                                        parameter.setContextMode(contextMode);
                                    }
                                }
                            }
                            if (StringUtils.isEmpty(valueModel.getValue())) {
                                return;
                            }
                            EParameterFieldType fieldType = parameter.getFieldType();
                            if (EParameterFieldType.TABLE == fieldType) {
                                List<Map<String, Object>> tableValueList = getTableParameterValue(valueModel, parameter);
                                parameter.setValue(tableValueList);
                            } else {
                                parameter.setValue(valueModel.getValue());
                            }
                        }
                    } catch (Exception e) {
                        ExceptionHandler.process(e);
                    }
                });
    }
    
    private void setParamContextMode(IElementParameter parameter) {
        boolean isContextMode = configurationModel.getConnection().isContextMode();
        if (isDataset && isContextMode) {
            // only set context mode for datastore fields when it's a dataset
            if (parameter.getName().startsWith(dataStorePrefix)) {
                parameter.setContextMode(true);
                parameter.setReadOnly(true);
            }
            return;
        }
        parameter.setContextMode(isContextMode);
        parameter.setReadOnly(isContextMode);
    }

    private List<Map<String, Object>> getTableParameterValue(ValueModel valueModel, IElementParameter parameter) {
        String value = valueModel.getValue();
        if (value == null || value instanceof String) {
            return ValueConverter.toTable((String) valueModel.getValue());
        }
        return null;
    }

    /**
     * Removes {@link ConfigurationModelUpdater} from every {@link TaCoKitElementParameter}, where it was registered
     */
    @Override
    public synchronized void dispose() {
        elem
                .getElementParameters()
                .stream()
                .filter(p -> p instanceof TaCoKitElementParameter)
                .map(p -> (TaCoKitElementParameter) p)
                .forEach(p -> p.removeValueChangeListener(configurationUpdater));
        super.dispose();
    }

    /**
     * Overrides parent method as Property Type widget should not be shown in wizard pages
     *
     * @return last Composite added
     */
    @Override
    protected Composite addCommonWidgets() {
        commonComposite = composite;
        return addSchemas(composite, null);
    }

    /**
     * Overrides implementation from parent class.
     * This is a quickfix to skip schema in repository widget
     *
     * @param parent    Composite on which widget will be added
     * @param parameter ElementParameter(Model) associated with widget
     */
    @Override
    protected void addWidgetIfActive(final Composite parent, final IElementParameter parameter) {
        if (doShow(parameter) && !EParameterFieldType.SCHEMA_TYPE.equals(parameter.getFieldType())) {
            addWidget(parent, parameter, null);
        }
    }

    private class ConfigurationModelUpdater implements IValueChangedListener {

        /**
         * Updates {@link TaCoKitConfigurationModel} each time some of {@link TaCoKitElementParameter} is changed
         *
         * @param elementParameter changed {@link TaCoKitElementParameter}
         * @param oldValue         parameter old value
         * @param newValue         parameter new value
         */
        @Override
        public void onValueChanged(final TaCoKitElementParameter elementParameter, final Object oldValue,
                final Object newValue) {
            configurationModel.setValue(elementParameter);
        }

    }
  
    public TaCoKitPageBuildHelper getTaCoKitPageBuildHelper() {
        return taCoKitPageBuildHelper;
    }
  
}
