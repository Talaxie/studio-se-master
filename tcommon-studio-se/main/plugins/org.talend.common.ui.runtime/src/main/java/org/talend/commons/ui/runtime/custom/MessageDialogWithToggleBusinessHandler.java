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

public class MessageDialogWithToggleBusinessHandler extends MessageDialogBusinessHandler {

    private static final String UI_KEY = "MessageDialogWithToggle";

    private String toggleMessage;

    private boolean toggleState;

    private ICrossPlatformPreferenceStore preferenceStore;

    private String prefKey;

    private String[] buttonLabels;

    private int defaultBtnIndex = 0;

    public MessageDialogWithToggleBusinessHandler(int dialogType, String title, String message, String[] buttonLabels,
            int defaultBtnIndex, String toggleMessage, boolean toggleState) {
        super(dialogType);
        this.setTitle(title);
        this.setMessage(message);
        this.buttonLabels = buttonLabels;
        this.defaultBtnIndex = defaultBtnIndex;
        this.toggleMessage = toggleMessage;
        this.toggleState = toggleState;
    }

    @Override
    public String getUiKey() {
        return UI_KEY;
    }

    public String getToggleMessage() {
        return toggleMessage;
    }

    public void setToggleMessage(String toggleMessage) {
        this.toggleMessage = toggleMessage;
    }

    public boolean getToggleState() {
        return toggleState;
    }

    public void setToggleState(boolean toggleState) {
        this.toggleState = toggleState;
    }

    public ICrossPlatformPreferenceStore getPreferenceStore() {
        return preferenceStore;
    }

    public void setPreferenceStore(ICrossPlatformPreferenceStore preferenceStore) {
        this.preferenceStore = preferenceStore;
    }

    public String getPrefKey() {
        return prefKey;
    }

    public void setPrefKey(String prefKey) {
        this.prefKey = prefKey;
    }

    public String[] getButtonLabels() {
        return buttonLabels;
    }

    public void setButtonLabels(String[] buttonLabels) {
        this.buttonLabels = buttonLabels;
    }

    public int getDefaultBtnIndex() {
        return defaultBtnIndex;
    }

    public void setDefaultBtnIndex(int defaultBtnIndex) {
        this.defaultBtnIndex = defaultBtnIndex;
    }

}
