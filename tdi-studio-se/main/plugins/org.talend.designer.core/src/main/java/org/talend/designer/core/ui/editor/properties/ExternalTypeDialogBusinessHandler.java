package org.talend.designer.core.ui.editor.properties;

import org.talend.commons.ui.runtime.custom.AbsBusinessHandler;
import org.talend.core.model.process.IExternalNode;

public class ExternalTypeDialogBusinessHandler extends AbsBusinessHandler {

    private static final String UI_KEY = "MapperDialog";

    private String title;

    private IExternalNode externalNode;

    public ExternalTypeDialogBusinessHandler(IExternalNode externalNode) {
        this.externalNode = externalNode;
    }

    public IExternalNode getExternalNode() {
        return externalNode;
    }

    public void setExternalNode(IExternalNode externalNode) {
        this.externalNode = externalNode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getUiKey() {
        return UI_KEY;
    }

}
