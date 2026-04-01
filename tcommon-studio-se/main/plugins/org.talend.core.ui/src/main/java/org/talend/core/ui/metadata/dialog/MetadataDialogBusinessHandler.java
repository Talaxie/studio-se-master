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
package org.talend.core.ui.metadata.dialog;

import org.talend.commons.ui.runtime.custom.AbsBusinessHandler;
import org.talend.core.model.metadata.IMetadataTable;
import org.talend.core.model.process.INode;


/**
 * DOC cmeng  class global comment. Detailled comment
 */
public class MetadataDialogBusinessHandler extends AbsBusinessHandler {

    private static final String UI_KEY = "MetadataDialog";

    private String title;

    private IMetadataTable inputMetaTable;

    private IMetadataTable outputMetaTable;

    private INode inputNode;

    private INode outputNode;

    private boolean inputReadOnly;

    private boolean outputReadOnly;

    public MetadataDialogBusinessHandler(IMetadataTable inputMetaTable, INode inputNode, IMetadataTable outputMetaTable,
            INode outputNode) {
        this.inputMetaTable = inputMetaTable;
        this.inputNode = inputNode;
        this.outputMetaTable = outputMetaTable;
        this.outputNode = outputNode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public IMetadataTable getInputMetaTable() {
        return inputMetaTable;
    }

    public void setInputMetaTable(IMetadataTable inputMetaTable) {
        this.inputMetaTable = inputMetaTable;
    }

    public IMetadataTable getOutputMetaTable() {
        return outputMetaTable;
    }

    public void setOutputMetaTable(IMetadataTable outputMetaTable) {
        this.outputMetaTable = outputMetaTable;
    }

    public INode getInputNode() {
        return inputNode;
    }

    public void setInputNode(INode inputNode) {
        this.inputNode = inputNode;
    }

    public INode getOutputNode() {
        return outputNode;
    }

    public void setOutputNode(INode outputNode) {
        this.outputNode = outputNode;
    }

    public boolean isInputReadOnly() {
        return inputReadOnly;
    }

    public void setInputReadOnly(boolean inputReadOnly) {
        this.inputReadOnly = inputReadOnly;
    }

    public boolean isOutputReadOnly() {
        return outputReadOnly;
    }

    public void setOutputReadOnly(boolean outputReadOnly) {
        this.outputReadOnly = outputReadOnly;
    }

    @Override
    public String getUiKey() {
        return UI_KEY;
    }

}
