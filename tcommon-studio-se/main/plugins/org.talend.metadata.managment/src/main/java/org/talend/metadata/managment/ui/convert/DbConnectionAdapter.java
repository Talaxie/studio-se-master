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
package org.talend.metadata.managment.ui.convert;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.core.runtime.Platform;
import org.talend.core.database.EDatabaseTypeName;
import org.talend.core.model.context.ContextUtils;
import org.talend.core.model.metadata.builder.connection.DatabaseConnection;
import org.talend.core.model.metadata.builder.database.jdbc.EDBTypeProductNameMapping;
import org.talend.core.model.metadata.builder.database.jdbc.ExtractorFactory;
import org.talend.core.model.properties.ContextItem;
import org.talend.cwm.helper.TaggedValueHelper;
import org.talend.metadata.managment.utils.MetadataConnectionUtils;
import org.talend.utils.sugars.TypedReturnCode;

public class DbConnectionAdapter {

    private DatabaseConnection originalDB = null;


    public DbConnectionAdapter(DatabaseConnection originalDB) {
        this.originalDB = originalDB;
    }


    public String getSID(String defaultCatalog) {
        if (originalDB == null) {
            return null;
        }
        String sid = extractedTargetValue(TaggedValueHelper.ORIGINAL_SID, TaggedValueHelper.TARGET_SID,
                defaultCatalog);
        if (!Platform.isRunning()) {
            String tempSid = ExtractorFactory.getCatalogFromJobContext(originalDB);
            sid = StringUtils.isBlank(tempSid) ? sid : tempSid;
        }
        return sid;
    }

    public String getUISchema(String defaultSchema) {
        if (originalDB == null) {
            return null;
        }
        String uiSchema = extractedTargetValue(TaggedValueHelper.ORIGINAL_UISCHEMA, TaggedValueHelper.TARGET_UISCHEMA,
                defaultSchema);
        if (!Platform.isRunning()) {
            String tempUiSchema = ExtractorFactory.getSchemaFromJobContext(originalDB);
            uiSchema = StringUtils.isBlank(tempUiSchema) ? uiSchema : tempUiSchema;
        }
        return uiSchema;
    }


    private String extractedTargetValue(String originalTagName, String TargetTagName, String currentValue) {
        if (isSwitchWithTaggedValueMode()) {
            String taggedOriginalValue = TaggedValueHelper.getValueString(originalTagName, originalDB);
            String taggedTargetValue = TaggedValueHelper.getValueString(TargetTagName, originalDB);
            if (currentValue.equals(taggedOriginalValue)) {
                return taggedTargetValue;
            }
        }
        return currentValue;
    }

    public boolean isSwitchWithTaggedValueMode() {
        String databaseType = originalDB.getDatabaseType();
        String taggedOriginalSID = TaggedValueHelper.getValueString(TaggedValueHelper.ORIGINAL_SID, originalDB);
        if (EDatabaseTypeName.GENERAL_JDBC.getXMLType().equals(databaseType) && originalDB.isContextMode()
                && !StringUtils.isEmpty(taggedOriginalSID)) {
            return true;
        }
        return false;
    }

    public boolean needTobeMigration() {
        if (originalDB == null) {
            return false;
        }
        if (!originalDB.isContextMode()) {
            return false;
        }
        String contextId = originalDB.getContextId();
        ContextItem contextItem = ContextUtils.getContextItemById2(contextId);
        String databaseType = originalDB.getDatabaseType();
        String databaseProductName = getDPName();

        String taggedOriginalSID = TaggedValueHelper.getValueString(TaggedValueHelper.ORIGINAL_SID, originalDB);
        // context
        // 1:group >1
        // 2:JDBC connection
        // 3:tagged value is not exist
        // 4:has been supported
        if (contextItem.getContext().size() > 1 && EDatabaseTypeName.GENERAL_JDBC.getXMLType().equals(databaseType)
                && StringUtils.isEmpty(taggedOriginalSID)
                && ExtractorFactory.isSupportDB(EDBTypeProductNameMapping.findTypeByProductName(databaseProductName))) {
            return true;
        }
        return false;
    }

    private String getDPName() {
        String dpName = TaggedValueHelper.getValueString(TaggedValueHelper.DB_PRODUCT_NAME, originalDB);
        if (!StringUtils.isEmpty(dpName)) {
            return dpName;
        }
        TypedReturnCode<Connection> checkConnection = MetadataConnectionUtils.createConnection(originalDB);
        if (checkConnection.isOk()) {
            try (Connection sqlConn = checkConnection.getObject()) {
                DatabaseMetaData sqlMetaData = sqlConn.getMetaData();
                return sqlMetaData.getDatabaseProductName();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
