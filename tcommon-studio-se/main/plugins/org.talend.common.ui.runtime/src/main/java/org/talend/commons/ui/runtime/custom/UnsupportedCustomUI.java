// ============================================================================
//
// Copyright (C) 2006-2022 Talend Inc. - www.talend.com
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

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;

/**
 * DOC cmeng  class global comment. Detailled comment
 */
public class UnsupportedCustomUI<T extends IBusinessHandler> extends AbstractCustomUI<T> {

    UnsupportedBusinessHandler realHandler;

    public UnsupportedCustomUI(T bh, String name) {
        super(bh);
        realHandler = new UnsupportedBusinessHandler(name);
    }

    public UnsupportedCustomUI(T bh, String name, String message) {
        super(bh);
        realHandler = new UnsupportedBusinessHandler(name, message);
    }

    @Override
    protected IUIEvent createOpenEvent() {
        IUIEvent openEvent = super.createOpenEvent();
        Map<String, Object> params = openEvent.getParams();
        params.put(BuiltinParams.name.name(), realHandler.getDialogName());
        params.put(BuiltinParams.message.name(), realHandler.getDialogName());
        return openEvent;
    }

    @Override
    protected T collectDialogData() {
        return getBusinessHandler();
    }

    public static class UnsupportedBusinessHandler extends AbsBusinessHandler {

        private static final String UI_KEY = "UnsupportedDialog";

        private String dialogName;

        private String message;

        public UnsupportedBusinessHandler(String name) {
            super();
            this.dialogName = name;
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            new Exception().printStackTrace(pw);
            this.message = sw.toString();
        }

        public UnsupportedBusinessHandler(String name, String message) {
            super();
            this.dialogName = name;
            this.message = message;
        }

        @Override
        public String getUiKey() {
            return UI_KEY;
        }

        public String getDialogName() {
            return dialogName;
        }

        public void setDialogName(String dialogName) {
            this.dialogName = dialogName;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

    }

}
