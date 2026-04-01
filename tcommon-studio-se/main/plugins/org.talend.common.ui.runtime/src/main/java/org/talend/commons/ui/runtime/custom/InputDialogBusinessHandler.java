// ============================================================================
//
// Copyright (C) 2006-2023 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.commons.ui.runtime.custom;

public class InputDialogBusinessHandler extends AbsBusinessHandler {

    private static final String UI_KEY = "InputDialog";

    private String title;

    private String message;

    private String defaultValue;

    private String result;

    private IInputDialogInputValidator validator;

    public InputDialogBusinessHandler(String title, String message, String defaultValue, IInputDialogInputValidator validator) {
        super();
        this.title = title;
        this.message = message;
        this.defaultValue = defaultValue;
        this.validator = validator;
    }

    @Override
    public String getUiKey() {
        return UI_KEY;
    }

    public String getTitle() {
        return title;
    }

    public String getMessage() {
        return message;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public IInputDialogInputValidator getValidator() {
        return validator;
    }

    public interface IInputDialogInputValidator {

        public String isValid(String newText);

    }

}
