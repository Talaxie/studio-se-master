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

import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.talend.commons.exception.ExceptionHandler;

public class InputDialogBusinessCustomUI extends AbstractCustomUI<InputDialogBusinessHandler> {

    public InputDialogBusinessCustomUI(InputDialogBusinessHandler businessHandler) {
        super(businessHandler);
    }

    @Override
    protected IUIEvent createOpenEvent() {
        IUIEvent openEvent = super.createOpenEvent();
        Map<String, Object> params = openEvent.getParams();
        InputDialogBusinessHandler bh = getBusinessHandler();
        params.put(BuiltinParams.title.name(), bh.getTitle());
        params.put(BuiltinParams.message.name(), bh.getMessage());
        params.put("defaultValue", bh.getDefaultValue());
        return openEvent;
    }

    @Override
    protected boolean onApply(IUIEvent event) {
        DefaultUIData valueEvent = createUIDataEvent("value");
        String errMsg = null;
        try {
            Object value = requestUIData(valueEvent).get();
            InputDialogBusinessHandler bh = getBusinessHandler();
            if (value == null) {
                value = "";
            }
            errMsg = bh.getValidator().isValid((String) value);
            if (StringUtils.isBlank(errMsg)) {
                return true;
            }
        } catch (Exception e) {
            errMsg = e.getLocalizedMessage();
            ExceptionHandler.process(e);
        }
        DefaultUIEvent errorEvent = new DefaultUIEvent("error", getId());
        errorEvent.getParams().put("message", errMsg);
        dispatchUIEvent(errorEvent);
        return false;
    }

    @Override
    protected InputDialogBusinessHandler collectDialogData() {
        DefaultUIData valueEvent = createUIDataEvent("value");
        InputDialogBusinessHandler businessHandler = getBusinessHandler();
        try {
            Object value = requestUIData(valueEvent).get();
            businessHandler.setOpenResult(getOpenResult());
            if (value != null) {
                businessHandler.setResult(value.toString());
            }
        } catch (Exception e) {
            ExceptionHandler.process(e);
        }
        return businessHandler;
    }

}
