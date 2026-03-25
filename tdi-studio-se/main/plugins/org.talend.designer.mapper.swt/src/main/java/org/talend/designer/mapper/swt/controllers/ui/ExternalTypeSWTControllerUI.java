package org.talend.designer.mapper.swt.controllers.ui;

import org.talend.core.model.process.IExternalNode;
import org.talend.core.ui.properties.tab.IDynamicProperty;
import org.talend.designer.core.ui.editor.properties.ExternalTypeDialogBusinessHandler;
import org.talend.designer.core.ui.editor.properties.controllers.executors.ExternalTypeControllerExecutor;
import org.talend.designer.core.ui.editor.properties.controllers.ui.IControllerUI;

public class ExternalTypeSWTControllerUI extends AbsExternalTypeSWTControllerUI implements IControllerUI {

    public ExternalTypeSWTControllerUI(IDynamicProperty dp) {
        super(dp, new ExternalTypeControllerExecutor());
        getControllerExecutor().init(getControllerContext(), this);
    }

    @Override
    public ExternalTypeControllerExecutor getControllerExecutor() {
        return (ExternalTypeControllerExecutor) super.getControllerExecutor();
    }

    @Override
    public ExternalTypeDialogBusinessHandler openExternalNodeDialog(ExternalTypeDialogBusinessHandler handler) {
        IExternalNode externalNode = handler.getExternalNode();
        int open = externalNode.open(composite.getShell());
        handler.setOpenResult(open);
        return handler;
    }

}
