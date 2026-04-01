// ============================================================================
//
// Copyright (C) 2006-2023 Talaxie Inc. - www.deilink.fr
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talaxie SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.repository.bigquery.ui.wizards.widgetsmodel;

import org.talend.core.model.metadata.builder.connection.MetadataTable;
import org.talend.core.ui.metadata.editor.MetadataEmfTableEditor;

public class BigQueryTableFieldModel extends MetadataEmfTableEditor {

    private MetadataTable metadataTable;

    public void setMetadataTable(MetadataTable metadataTable) {
        this.metadataTable = metadataTable;
        registerDataList(metadataTable.getColumns());
    }
}
