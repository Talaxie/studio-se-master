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

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Composite;
import org.talend.core.model.process.EParameterFieldType;
import org.talend.core.model.process.IElementParameter;
import org.talend.core.model.properties.ConnectionItem;
import org.talend.designer.core.model.components.ElementParameter;
import org.talend.metadata.managment.ui.model.AbsConnParamName;
import org.talend.metadata.managment.ui.model.IConnParamName;
import org.talend.metadata.managment.ui.wizard.AbstractForm;
import org.talend.sdk.component.studio.ui.composite.TaCoKitWizardComposite;
import org.talend.sdk.component.studio.util.TacokitContextUtil;

public class TaCokitForm extends AbstractForm {

    private TaCoKitWizardComposite composite;

    protected TaCokitForm(Composite parent, ConnectionItem connectionItem, boolean hasContextBtn, int style) {
        super(parent, style);
        setConnectionItem(connectionItem);
        setupForm(hasContextBtn);
        FormData data = new FormData();
        data.left = new FormAttachment(0, 0);
        data.right = new FormAttachment(100, 0);
        data.bottom = new FormAttachment(85, 0);
        setLayoutData(data);
    }

    public void setComposite(TaCoKitWizardComposite composite) {
        this.composite = composite;
    }

    @Override
    protected void exportAsContext() {
        collectConParameters();
        super.exportAsContext();
    }

    @Override
    protected void revertContext() {
        collectConParameters();
        super.revertContext();
    }

    protected void collectConParameters() {
        TaCoKitPageBuildHelper help = composite.getTaCoKitPageBuildHelper();
        if (help != null) {
            Set<IConnParamName> set = new HashSet<>();
            for (IElementParameter param : help.getParameters()) {
                if (param.isShow(Collections.emptyList()) && ((ElementParameter) param).isDisplayedByDefault()
                        && TacokitContextUtil.isSupportContextFieldType(param.getFieldType())) {
                    TaCoKitParamName taCoKitParamName = new TaCoKitParamName(param.getName(), param.getFieldType());
                    taCoKitParamName.setValue(param.getValue() == null ? null : String.valueOf(param.getValue()));
                    set.add(taCoKitParamName);
                }
            }
            clearContextParams();
            set.forEach(p -> addContextParams(p, true));
        }
    }

    @Override
    protected boolean checkFieldsValue() {
        return false;
    }

    @Override
    protected void initialize() {
        if (composite != null) {
            composite.updateParameter();
            composite.refresh();
        }
    }

    @Override
    protected void addFields() {
        // nothing to do
    }

    @Override
    protected void addFieldsListeners() {
        // nothing to do
    }

    @Override
    public void adaptFormToEditable() {
        super.adaptFormToEditable();
    }

    @Override
    protected void adaptFormToReadOnly() {
        // nothing to do
    }

    @Override
    protected void addUtilsButtonListeners() {
        // nothing to do
    }

}

class TaCoKitParamName extends AbsConnParamName {

    private String value;

    private EParameterFieldType eParameterFieldType;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public TaCoKitParamName(String name, EParameterFieldType eParameterFieldType) {
        this.name = name;
        this.eParameterFieldType = eParameterFieldType;
    }

    public EParameterFieldType getType() {
        return this.eParameterFieldType;
    }
}
