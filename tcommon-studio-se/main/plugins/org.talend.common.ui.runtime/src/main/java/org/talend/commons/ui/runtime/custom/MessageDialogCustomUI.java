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

import java.util.Map;

import org.eclipse.jface.dialogs.MessageDialog;
import org.talend.commons.exception.ExceptionHandler;

/**
 * DOC cmeng  class global comment. Detailled comment
 */
public class MessageDialogCustomUI extends AbstractCustomUI<MessageDialogBusinessHandler> {

    public MessageDialogCustomUI(MessageDialogBusinessHandler businessHandler) {
        super(businessHandler);
    }

    @Override
    protected IUIEvent createOpenEvent() {
        IUIEvent openEvent = super.createOpenEvent();
        Map<String, Object> params = openEvent.getParams();
        MessageDialogBusinessHandler bh = getBusinessHandler();
        params.put(BuiltinParams.title.name(), bh.getTitle());
        params.put(BuiltinParams.message.name(), bh.getMessage());
        params.put("dialogType", mapDialogType(bh.getDialogType()));
        return openEvent;
    }

    private String mapDialogType(int type) {
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
    protected MessageDialogBusinessHandler collectDialogData() {
        MessageDialogBusinessHandler businessHandler = getBusinessHandler();
        try {
            businessHandler.setOpenResult(getDialogOpenResult());
        } catch (Exception e) {
            ExceptionHandler.process(e);
        }
        return businessHandler;
    }

    private Object getDialogOpenResult() {
        Object result = null;
        boolean isCancelled = isCancelled();
        switch (getBusinessHandler().getDialogType()) {
        case MessageDialog.CONFIRM:
        case MessageDialog.ERROR:
        case MessageDialog.INFORMATION:
        case MessageDialog.WARNING:
            if (isCancelled) {
                result = Boolean.FALSE;
            } else {
                result = Boolean.TRUE;
            }
            break;
        case MessageDialog.QUESTION:
            if (isCancelled) {
                result = Boolean.FALSE;
            } else {
                result = Boolean.TRUE;
            }
            break;
        case MessageDialog.QUESTION_WITH_CANCEL:
            if (isCancelled) {
                result = Boolean.FALSE;
            } else {
                result = Boolean.TRUE;
            }
            break;
        default:
            result = getOpenResult();
            break;
        }
        return result;
    }

}
