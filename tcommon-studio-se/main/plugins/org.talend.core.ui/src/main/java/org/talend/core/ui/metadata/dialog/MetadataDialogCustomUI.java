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

import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.ui.runtime.custom.AbstractCustomUI;
import org.talend.commons.ui.runtime.custom.ICustomUI;
import org.talend.commons.ui.runtime.custom.IUIEvent;
import org.talend.core.model.metadata.IMetadataColumn;
import org.talend.core.model.metadata.IMetadataTable;
import org.talend.core.model.metadata.MetadataColumn;

/**
 * DOC cmeng class global comment. Detailled comment
 */
public class MetadataDialogCustomUI extends AbstractCustomUI<MetadataDialogBusinessHandler> {

    public MetadataDialogCustomUI(MetadataDialogBusinessHandler bh) {
        super(bh);
    }

    @Override
    protected IUIEvent createOpenEvent() {
        IUIEvent openEvent = super.createOpenEvent();
        Map<String, Object> params = openEvent.getParams();
        MetadataDialogBusinessHandler bh = getBusinessHandler();
        params.put(BuiltinParams.title.name(), bh.getTitle());
        IMetadataTable inputMetaTable = bh.getInputMetaTable();
        if (inputMetaTable != null) {
            params.put("inputMetaTable", inputMetaTable);
        }
        IMetadataTable outputMetaTable = bh.getOutputMetaTable();
        params.put("outputMetaTable", outputMetaTable);
        return openEvent;
    }

    @Override
    protected MetadataDialogBusinessHandler collectDialogData() {
        CompletableFuture<Object> outputMetaDataRequest = requestUIData(createUIDataEvent("output"));
        CompletableFuture<Object> inputMetaDataRequest = requestUIData(createUIDataEvent("input"));
        MetadataDialogBusinessHandler bh = getBusinessHandler();
        try {
            if (isCancelled()) {
                bh.setOpenResult(ICustomUI.CANCEL);
                return bh;
            }
            bh.setOpenResult(ICustomUI.OK);
            List<Object> output = (List<Object>) outputMetaDataRequest.get();
            IMetadataTable outputMetaTable = bh.getOutputMetaTable();
            if (outputMetaTable != null) {
                List<IMetadataColumn> outputColumns = outputMetaTable.getListColumns();
                extracted(output, outputColumns);
            }

            List<Object> input = (List<Object>) inputMetaDataRequest.get();
            IMetadataTable inputMetaTable = bh.getInputMetaTable();
            if (inputMetaTable != null) {
                List<IMetadataColumn> inputColumns = inputMetaTable.getListColumns();
                extracted(input, inputColumns);
            }
        } catch (Exception e) {
            ExceptionHandler.process(e);
        }

        return bh;
    }

    private void extracted(List<Object> newColumns, List<IMetadataColumn> originalColumns) {
        int i = 0;
        for (; i < newColumns.size(); i++) {
            Object obj = newColumns.get(i);
            IMetadataColumn convertValue = this.getUIEngine().convertValue(obj, MetadataColumn.class);
            IMetadataColumn originalColumn = null;
            if (i < originalColumns.size()) {
                originalColumn = originalColumns.get(i);
            } else {
                originalColumn = new MetadataColumn();
                originalColumns.add(originalColumn);
            }
            originalColumn.updateWith(convertValue);
        }
        if (0 < originalColumns.size()) {
            for (int j = originalColumns.size() - 1; i <= j; j--) {
                originalColumns.remove(j);
            }
        }
    }

}
