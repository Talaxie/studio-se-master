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
package org.talend.dataprofiler.core.ui.filters;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.Viewer;
import org.talend.core.model.metadata.builder.connection.DatabaseConnection;
import org.talend.cwm.helper.TaggedValueHelper;
import org.talend.dq.helper.JDBCSwitchContextUtils;
import org.talend.dq.nodes.DBCatalogRepNode;
import org.talend.dq.nodes.DBSchemaRepNode;
import org.talend.repository.model.IRepositoryNode;

public class JDBCActiveElementsFilter extends AbstractViewerFilter {

    public static final int FILTER_ID = 4;

    String taggedOriginalSID;

    String taggedTargetSID;

    String taggedOriginalUISchema;

    String taggedTargetUISchema;

    DatabaseConnection jdbcDBConnection;

    /**
     * @param jdbcDBConnection
     */
    public JDBCActiveElementsFilter(DatabaseConnection jdbcDBConnection) {
        this.jdbcDBConnection = jdbcDBConnection;
        if (jdbcDBConnection != null) {
            taggedOriginalSID = TaggedValueHelper.getValueString(TaggedValueHelper.ORIGINAL_SID, jdbcDBConnection);
            taggedTargetSID = TaggedValueHelper.getValueString(TaggedValueHelper.TARGET_SID, jdbcDBConnection);
            taggedOriginalUISchema =
                    TaggedValueHelper.getValueString(TaggedValueHelper.ORIGINAL_UISCHEMA, jdbcDBConnection);
            taggedTargetUISchema =
                    TaggedValueHelper.getValueString(TaggedValueHelper.TARGET_UISCHEMA, jdbcDBConnection);
        }
    }

    public JDBCActiveElementsFilter() {
        // no need to implement
    }

    @Override
    public boolean select(Viewer viewer, Object parentElement, Object element) {
        if (jdbcDBConnection != null) {
            // the connection node to be root node
            if (element instanceof DBCatalogRepNode && !StringUtils.isEmpty(taggedOriginalSID)
                    && !(taggedOriginalSID.equals(((DBCatalogRepNode) element).getCatalog().getName()))) {
                return false;
            }
            if (element instanceof DBSchemaRepNode && !StringUtils.isEmpty(taggedOriginalUISchema)
                    && !(taggedOriginalUISchema.equals(((DBSchemaRepNode) element).getSchema().getName()))) {
                return false;
            }
            return true;
        }
        // all the database connections to be root nodes
        if (element instanceof DBCatalogRepNode && parentElement instanceof IRepositoryNode) {
            return compareElementName(parentElement, element, TaggedValueHelper.ORIGINAL_SID,
                    ((DBCatalogRepNode) element).getCatalog().getName());
        }
        if (element instanceof DBSchemaRepNode && parentElement instanceof IRepositoryNode) {
            return compareElementName(parentElement, element, TaggedValueHelper.ORIGINAL_UISCHEMA,
                    ((DBSchemaRepNode) element).getSchema().getName());
        }
        // DQ repository view case
        if (element instanceof DBCatalogRepNode && parentElement instanceof TreePath) {
            Object parentNode = ((TreePath) parentElement).getLastSegment();
            if (parentNode == null || !(parentNode instanceof IRepositoryNode)) {
                return true;
            }
            return compareElementName(parentNode, element, TaggedValueHelper.ORIGINAL_SID,
                    ((DBCatalogRepNode) element).getCatalog().getName());
        }
        if (element instanceof DBSchemaRepNode && parentElement instanceof TreePath) {
            Object parentNode = ((TreePath) parentElement).getLastSegment();
            if (parentNode == null || !(parentNode instanceof IRepositoryNode)) {
                return true;
            }
            return compareElementName(parentNode, element, TaggedValueHelper.ORIGINAL_UISCHEMA,
                    ((DBSchemaRepNode) element).getSchema().getName());
        }
        return true;
    }

    protected boolean compareElementName(Object parentElement, Object element, String targetTaggedName,
            String elementName) {
        DatabaseConnection dbConn = JDBCSwitchContextUtils.findConnection((IRepositoryNode) parentElement);
        if (dbConn == null) {
            return true;
        }
        String currentOriginalUISCHEMA =
                TaggedValueHelper.getValueString(targetTaggedName, dbConn);
        if (StringUtils.isEmpty(currentOriginalUISCHEMA)) {
            return true;
        }
        return currentOriginalUISCHEMA.equals(elementName);
    }

    protected boolean compareOriginalUISCHEMA(Object parentElement, Object element) {
        DatabaseConnection dbConn = JDBCSwitchContextUtils.findConnection((IRepositoryNode) parentElement);
        if (dbConn == null) {
            return true;
        }
        String currentOriginalUISCHEMA =
                TaggedValueHelper.getValueString(TaggedValueHelper.ORIGINAL_UISCHEMA, dbConn);
        if (StringUtils.isEmpty(currentOriginalUISCHEMA)) {
            return true;
        }
        return currentOriginalUISCHEMA.equals(((DBSchemaRepNode) element).getSchema().getName());
    }

    protected boolean compareOriginalSID(Object parentElement, Object element) {
        DatabaseConnection dbConn = JDBCSwitchContextUtils.findConnection((IRepositoryNode) parentElement);
        if (dbConn == null) {
            return true;
        }
        String currentOriginalSID =
                TaggedValueHelper.getValueString(TaggedValueHelper.ORIGINAL_SID, dbConn);
        if (StringUtils.isEmpty(currentOriginalSID)) {
            return true;
        }
        return currentOriginalSID.equals(((DBCatalogRepNode) element).getCatalog().getName());
    }

    @Override
    public int getId() {
        return FILTER_ID;
    }

}
