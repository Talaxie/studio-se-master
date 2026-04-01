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
import java.util.concurrent.CompletableFuture;

import org.eclipse.jface.dialogs.MessageDialog;
import org.talend.commons.exception.ExceptionHandler;

public class MessageDialogWithToggleCustomUI extends AbstractCustomUI<MessageDialogWithToggleBusinessHandler> {

    public MessageDialogWithToggleCustomUI(MessageDialogWithToggleBusinessHandler businessHandler) {
        super(businessHandler);
    }

    @Override
    protected IUIEvent createOpenEvent() {
        IUIEvent openEvent = super.createOpenEvent();
        Map<String, Object> params = openEvent.getParams();
        MessageDialogWithToggleBusinessHandler bh = getBusinessHandler();
        params.put(BuiltinParams.title.name(), bh.getTitle());
        params.put(BuiltinParams.message.name(), bh.getMessage());
        params.put("toggleMsg", bh.getToggleMessage());
        params.put("toggleState", bh.getToggleState());
        params.put("dialogImageType", mapDialogImageType(bh.getDialogType()));
        params.put("buttons", bh.getButtonLabels());
        params.put("defaultBtnIndex", bh.getDefaultBtnIndex());
        return openEvent;
    }

    private String mapDialogImageType(int type) {
        switch (type) {
        case MessageDialog.CONFIRM:
            return "confirm";
        case MessageDialog.ERROR:
            return "error";
        case MessageDialog.INFORMATION:
            return "info";
        case MessageDialog.QUESTION:
            return "question";
        case MessageDialog.QUESTION_WITH_CANCEL:
            return "questionWithCancel";
        case MessageDialog.WARNING:
            return "warning";
        default:
            return "none";
        }
    }

    @Override
    protected MessageDialogWithToggleBusinessHandler collectDialogData() {
        DefaultUIData toggleStateReq = createUIDataEvent("toggleState");
        MessageDialogWithToggleBusinessHandler businessHandler = getBusinessHandler();
        try {
            CompletableFuture<Object> toggleStateResp = requestUIData(toggleStateReq);
            businessHandler.setOpenResult(getOpenResult());
            boolean toggleState = Boolean.valueOf(toggleStateResp.get().toString());
            if (toggleState != businessHandler.getToggleState()) {
                businessHandler.setToggleState(toggleState);
            }
        } catch (Exception e) {
            ExceptionHandler.process(e);
        }
        return businessHandler;
    }

}
