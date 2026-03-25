/**
 * Copyright (C) 2006-2021 Talaxie Inc. - www.deilink.fr
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.talend.sdk.component.studio.model.parameter.listener;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import org.talend.sdk.component.studio.model.parameter.ValidationLabel;
import org.talend.sdk.component.studio.util.TacokitContextUtil;

/**
 * Base class for Property Validators. It validates new value. If validation is not passed, then
 * it activates {@code label} ElementParameter and sets its validation message
 */
public abstract class PropertyValidator implements PropertyChangeListener {

    private final ValidationLabel label;

    private final String validationMessage;

    PropertyValidator(final ValidationLabel label, final String validationMessage) {
        this.label = label;
        this.validationMessage = validationMessage;
    }

    /**
     * Validates new value, if it is raw value. Skips validation for contextual value
     *
     * @param event property change event, which provides new value to validate
     */
    @Override
    public void propertyChange(final PropertyChangeEvent event) {
        if(!"value".equals(event.getPropertyName())){
            return;
        }
        if (TacokitContextUtil.isContextualValue(event.getNewValue()) || ValidationHelper.hideValidation(event.getSource())) {
            label.hideConstraint(validationMessage);
        } else if (!validate(event.getNewValue())) {
            label.showConstraint(validationMessage);
        } else {
            label.hideConstraint(validationMessage);
        }
    }

    protected void hideConstraint() {
        label.hideConstraint(validationMessage);
        label.clearConstraint();
    }

    boolean isEmpty(final Object newValue) {
        if (newValue == null) {
            return true;
        }
        String value = (String) newValue;
        return value.isEmpty();
    }

    abstract boolean validate(final Object newValue);

}
