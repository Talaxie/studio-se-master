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
package org.talend.metadata.managment.ui.convert.strategy;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.talend.core.model.metadata.builder.connection.DatabaseConnection;
import org.talend.core.model.metadata.builder.database.jdbc.ExtractorFactory;
import org.talend.core.model.metadata.builder.database.jdbc.IUrlDbNameExtractor;
import org.talend.core.model.properties.ConnectionItem;
import org.talend.core.model.properties.DatabaseConnectionItem;
import org.talend.cwm.helper.TaggedValueHelper;

/**
 * generic jdbc connection will use this strategy
 */
public class SwitchContextWithTaggedValue extends AbstractSwitchContextStrategy {

    private static Logger log = Logger.getLogger(SwitchContextWithTaggedValue.class);

    @Override
    public boolean updateContextGroup(ConnectionItem connItem, String selectedContext, String originalContext,
            boolean... isMigrationTask) {
        // judge database type by dbMetadata

        IUrlDbNameExtractor extractorInstance =
                ExtractorFactory.getExtractorInstance(connItem, selectedContext, originalContext);
        if (extractorInstance == null) {
            return false;
        }

        extractorInstance.initUiSchemaOrSID();
        String sid = extractorInstance.getExtractResult().get(0);
        String uiSchema = extractorInstance.getExtractResult().get(1);
        DatabaseConnection dbConn = null;
        if (connItem instanceof DatabaseConnectionItem) {
            dbConn = (DatabaseConnection) connItem.getConnection();
        } else {
            return false;
        }
        // catalog never be null
        if (extractorInstance.hasCatalog() && StringUtils.isEmpty(sid)) {
            return false;
        }
        // schema can be null only when there are catalog
        if (!extractorInstance.hasCatalog() && extractorInstance.hasSchema() && StringUtils.isEmpty(uiSchema)) {
            return false;
        }
        boolean hasChanged = false;

        // extract sid by different url try to create class structor to handle default case and special case
        // setting sid or uischema by different databaseType
        boolean isOriginalChanged = recordOriginalValue(connItem, selectedContext, originalContext, sid, uiSchema);

        if (extractorInstance.hasBothSturctor()) {
            if (sidIsValid(sid, dbConn) && uiSchemaIsValid(uiSchema, dbConn)) {
                // change catalog and schema with same time when both structor exist and no one is empty
                TaggedValueHelper.setTaggedValue(dbConn, TaggedValueHelper.TARGET_SID, sid);
                TaggedValueHelper.setTaggedValue(dbConn, TaggedValueHelper.TARGET_UISCHEMA, uiSchema);
                hasChanged = true;
            }
        } else {
            if (extractorInstance.hasCatalog() && sidIsValid(sid, dbConn)) {
                // only catalog case
                TaggedValueHelper.setTaggedValue(dbConn, TaggedValueHelper.TARGET_SID, sid);
                hasChanged = true;
            }
            if (extractorInstance.hasSchema() && uiSchemaIsValid(uiSchema, dbConn)) {
                // only schema case
                TaggedValueHelper.setTaggedValue(dbConn, TaggedValueHelper.TARGET_UISCHEMA, uiSchema);
                hasChanged = true;
            }
        }
        // special case when there are catalog and schema then schema can be set to null for switch between different
        // catalog same schema case
        if (isOriginalChanged && extractorInstance.hasBothSturctor() && StringUtils.isEmpty(uiSchema)) {
            TaggedValueHelper.setTaggedValue(dbConn, TaggedValueHelper.TARGET_UISCHEMA, uiSchema);
            TaggedValueHelper.setTaggedValue(dbConn, TaggedValueHelper.TARGET_SID, sid);
            hasChanged = true;
        }
        if (hasChanged) {
            dbConn.setContextName(selectedContext);
            saveConnection(connItem, isMigrationTask);
            return true;
        }
        return false;
    }

    private boolean recordOriginalValue(ConnectionItem connItem, String selectedContext, String originalContext,
            String targetSid, String targetUiSchema) {
        boolean hasChanged = false;
        IUrlDbNameExtractor extractorInstance =
                ExtractorFactory.getExtractorInstance(connItem, originalContext, selectedContext);
        if (extractorInstance == null) {
            return hasChanged;
        }
        extractorInstance.initUiSchemaOrSID();
        String originalSid = extractorInstance.getExtractResult().get(0);
        String originalUiSchema = extractorInstance.getExtractResult().get(1);
        DatabaseConnection dbConn = null;
        if (connItem instanceof DatabaseConnectionItem) {
            dbConn = (DatabaseConnection) connItem.getConnection();
        } else {
            return hasChanged;
        }
        // catalog never be empty when catalog exist
        if (extractorInstance.hasCatalog() && StringUtils.isEmpty(originalSid)) {
            return false;
        }
        // schema can be empty only when catalog is exist
        if (!extractorInstance.hasCatalog() && extractorInstance.hasSchema() && StringUtils.isEmpty(originalUiSchema)) {
            return false;
        }

        String taggedOriSid = TaggedValueHelper.getValueString(TaggedValueHelper.ORIGINAL_SID, dbConn);
        String taggedOriUiShchema = TaggedValueHelper.getValueString(TaggedValueHelper.ORIGINAL_UISCHEMA, dbConn);
        // case1:catalog original value is empty then save original record(first time to switch)
        if (extractorInstance.hasCatalog() && StringUtils.isEmpty(taggedOriSid)) {
            if (!StringUtils.isEmpty(originalSid) && !StringUtils.isEmpty(targetSid)) {
                TaggedValueHelper.setTaggedValue(dbConn, TaggedValueHelper.ORIGINAL_SID, originalSid);
                hasChanged = true;

            }
        }
        // case1:schema original value is empty then save original record(first time to switch)
        if (extractorInstance.hasSchema() && StringUtils.isEmpty(taggedOriUiShchema)) {
            if (!StringUtils.isEmpty(originalUiSchema) && !StringUtils.isEmpty(targetUiSchema)) {
                TaggedValueHelper.setTaggedValue(dbConn, TaggedValueHelper.ORIGINAL_UISCHEMA, originalUiSchema);
                hasChanged = true;
            }
        }
        // case2 original value is in the context group then do nothing

        // case3 originalContext same with selectedContext(
        // .e.g. DQ->DQ2->DQ2 the second time switch will change original value to DQ2
        // DQ->DQ2->DQ the second time switch will keep original value to DQ and switch target value as
        // DQ

        if (extractorInstance.hasCatalog() && !StringUtils.isEmpty(taggedOriSid) && originalContext.equals(selectedContext)) {
            // change original catalog need to judge schema is not empty with same time
            if (!StringUtils.isEmpty(originalSid)
                    && (!extractorInstance.hasSchema() || !StringUtils.isEmpty(originalUiSchema))) {
                TaggedValueHelper.setTaggedValue(dbConn, TaggedValueHelper.ORIGINAL_SID, originalSid);
                hasChanged = true;
            }
        }
        if (extractorInstance.hasSchema() && !StringUtils.isEmpty(taggedOriUiShchema)
                && originalContext.equals(selectedContext)) {
            // change original schema need to judge catalog is not empty with same time
            if (!StringUtils.isEmpty(originalUiSchema)
                    && (!extractorInstance.hasCatalog()
                            || !StringUtils.isEmpty(originalSid) && !StringUtils.isEmpty(targetUiSchema))) {
                TaggedValueHelper.setTaggedValue(dbConn, TaggedValueHelper.ORIGINAL_UISCHEMA, originalUiSchema);
                hasChanged = true;
            }
        }

        // case4 both has catalog and schema case then schema maybe set null when both original and target are null with
        // same time
        if (isSpecial4Case(targetUiSchema, extractorInstance, originalUiSchema, taggedOriUiShchema)) {
            if (originalContext.equals(selectedContext)) {
                TaggedValueHelper.setTaggedValue(dbConn, TaggedValueHelper.ORIGINAL_SID, originalSid);
            }
            TaggedValueHelper.setTaggedValue(dbConn, TaggedValueHelper.ORIGINAL_UISCHEMA, originalUiSchema);
            hasChanged = true;
        }
        return hasChanged;

    }

    protected boolean isSpecial4Case(String targetUiSchema, IUrlDbNameExtractor extractorInstance,
            String originalUiSchema, String taggedOriUiShchema) {
        return extractorInstance.hasBothSturctor()
                && StringUtils.isEmpty(originalUiSchema) && StringUtils.isEmpty(targetUiSchema);
    }

    private boolean originalValueExistInGroup(String taggedOriSid, String originalSid, String targetSid,
            String taggedOriUiShchema, String originalUiSchema, String targetUiSchema) {
        if (compareAllSameOrEmpty(taggedOriSid, originalSid)
                && compareAllSameOrEmpty(taggedOriUiShchema, originalUiSchema)
                || compareAllSameOrEmpty(taggedOriSid, targetSid)
                        && compareAllSameOrEmpty(taggedOriUiShchema, targetUiSchema)) {
            return true;
        }
        return false;
    }

    protected boolean compareAllSameOrEmpty(String taggedOriSid, String originalSid) {
        return taggedOriSid == originalSid || StringUtils.isEmpty(taggedOriSid) && StringUtils.isEmpty(originalSid);
    }

    private boolean originalValueIsEmpty(String taggedOriSid, String taggedOriUiShchema) {
        return StringUtils.isEmpty(taggedOriSid) || StringUtils.isEmpty(taggedOriUiShchema);
    }

    private boolean uiSchemaIsValid(String uiSchema, DatabaseConnection dbConn) {
        return !StringUtils.isEmpty(uiSchema)
                && !StringUtils.isEmpty(TaggedValueHelper.getValueString(TaggedValueHelper.ORIGINAL_UISCHEMA, dbConn));
    }

    private boolean sidIsValid(String sid, DatabaseConnection dbConn) {
        return !StringUtils.isEmpty(sid)
                && !StringUtils.isEmpty(TaggedValueHelper.getValueString(TaggedValueHelper.ORIGINAL_SID, dbConn));
    }

}
