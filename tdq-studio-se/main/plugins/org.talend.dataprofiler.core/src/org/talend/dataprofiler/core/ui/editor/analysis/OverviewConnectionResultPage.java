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
package org.talend.dataprofiler.core.ui.editor.analysis;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.ui.forms.editor.FormEditor;
import org.talend.core.model.metadata.builder.connection.DatabaseConnection;
import org.talend.cwm.helper.TaggedValueHelper;
import org.talend.dq.helper.JDBCSwitchContextUtils;
import org.talend.metadata.managment.ui.convert.DbConnectionAdapter;
import org.talend.repository.model.IRepositoryNode;

public class OverviewConnectionResultPage extends OverviewResultPage {

    /**
     * @param editor
     * @param id
     * @param title
     */
    public OverviewConnectionResultPage(FormEditor editor, String id, String title) {
        super(editor, id, title);
    }

    @Override
    protected boolean isSCActiveOriginalElement(IRepositoryNode node) {
        DatabaseConnection findConnection = JDBCSwitchContextUtils.findConnection(node);
        if (findConnection == null) {
            return false;
        }
        boolean isSwitchContextMode = new DbConnectionAdapter(findConnection).isSwitchWithTaggedValueMode();
        if (!isSwitchContextMode) {
            return false;
        }
        String taggedOriginalSID =
                TaggedValueHelper.getValueString(TaggedValueHelper.ORIGINAL_SID, findConnection);
        String taggedTargetSID =
                TaggedValueHelper.getValueString(TaggedValueHelper.TARGET_SID, findConnection);
        String catalogOrSchemaName = JDBCSwitchContextUtils.getCatalogOrSchemaName(node);
        if (StringUtils.isNotEmpty(catalogOrSchemaName) && catalogOrSchemaName.equals(taggedOriginalSID)
                && StringUtils.isNotEmpty(taggedOriginalSID) && !taggedTargetSID.equals(taggedOriginalSID)) {
            return true;
        }
        return false;
    }

}
