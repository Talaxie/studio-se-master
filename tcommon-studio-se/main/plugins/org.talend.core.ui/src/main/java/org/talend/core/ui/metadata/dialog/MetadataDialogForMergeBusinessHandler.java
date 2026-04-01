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

import java.util.Map;

import org.talend.commons.ui.runtime.custom.AbsBusinessHandler;
import org.talend.core.model.metadata.IMetadataTable;
import org.talend.core.model.process.INode;


/**
 * DOC cmeng  class global comment. Detailled comment
 */
public class MetadataDialogForMergeBusinessHandler extends AbsBusinessHandler {

    private static final String UI_KEY = "MetadataDialogForMerge";

    private String title;

    private boolean inputReadOnly;

    private boolean outputReadOnly;

    private Map<INode, Map<IMetadataTable, Boolean>> inputInfos;

    private IMetadataTable outputMetaTable;

    private INode outputNode;

    public MetadataDialogForMergeBusinessHandler(Map<INode, Map<IMetadataTable, Boolean>> inputInfos,
            IMetadataTable outputMetaTable, INode outputNode) {
        this.inputInfos = inputInfos;
        this.outputMetaTable = outputMetaTable;
        this.outputNode = outputNode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public IMetadataTable getOutputMetaTable() {
        return outputMetaTable;
    }

    public void setOutputMetaTable(IMetadataTable outputMetaTable) {
        this.outputMetaTable = outputMetaTable;
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

    public Map<INode, Map<IMetadataTable, Boolean>> getInputInfos() {
        return inputInfos;
    }

    public void setInputInfos(Map<INode, Map<IMetadataTable, Boolean>> inputInfos) {
        this.inputInfos = inputInfos;
    }

    @Override
    public String getUiKey() {
        return UI_KEY;
    }

}
