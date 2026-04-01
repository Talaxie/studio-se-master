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

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.EList;
import org.talend.core.database.EDatabaseTypeName;
import org.talend.core.model.metadata.builder.connection.DatabaseConnection;
import org.talend.core.model.metadata.builder.database.jdbc.ExtractorFactory;
import org.talend.cwm.helper.CatalogHelper;
import org.talend.cwm.helper.SchemaHelper;
import org.talend.cwm.helper.TaggedValueHelper;

import orgomg.cwm.foundation.softwaredeployment.DataManager;
import orgomg.cwm.resource.relational.Catalog;
import orgomg.cwm.resource.relational.Schema;

public class SchemaAdapter {

    Schema originalSch;

    public SchemaAdapter(Schema sch) {
        originalSch = sch;
    }

    public String getName() {
        if (originalSch == null) {
            return null;
        }
        String schemaName = originalSch.getName();
        if (StringUtils.isEmpty(schemaName)) {
            return schemaName;
        }
        DataManager dataManager = findConnection(originalSch);
        if (dataManager != null && dataManager instanceof DatabaseConnection) {
            DatabaseConnection parentConnection = (DatabaseConnection) dataManager;
            String originalUISchema =
                    TaggedValueHelper.getValueString(TaggedValueHelper.ORIGINAL_UISCHEMA, parentConnection);
            String targetUISchema =
                    TaggedValueHelper.getValueString(TaggedValueHelper.TARGET_UISCHEMA, parentConnection);
            if (Platform.isRunning()) {
                DbConnectionAdapter dbConnectionAdapter =
                        new DbConnectionAdapter(parentConnection);
                if (dbConnectionAdapter.isSwitchWithTaggedValueMode()) {
                    if (schemaName.equals(originalUISchema)) {
                        return targetUISchema;
                    }
                }
            } else if (EDatabaseTypeName.GENERAL_JDBC.getXMLType().equals(parentConnection.getDatabaseType())) {
                String tempSchemaName = ExtractorFactory.getSchemaFromJobContext(parentConnection);
                if (StringUtils.isBlank(tempSchemaName)) {
                    if (parentConnection.isContextMode() && !StringUtils.isBlank(targetUISchema)) {
                        return targetUISchema;
                    }
                } else {
                    return tempSchemaName;
                }
            }
        }
        return schemaName;
    }

    protected static DataManager findConnection(Schema originalSch) {
        Catalog originalParentCatalog = CatalogHelper.getParentCatalog(originalSch);

        EList<DataManager> dataManagerList = null;

        if (originalParentCatalog != null) {
            // has catalog case
            dataManagerList = originalParentCatalog.getDataManager();
        } else {
            dataManagerList = originalSch.getDataManager();
        }
        if (dataManagerList == null || dataManagerList.size() == 0) {
            return null;
        }
        return dataManagerList.get(0);
    }

    public Schema getSchema() {
        if (originalSch == null) {
            return null;
        }
        String schemaName = originalSch.getName();
        if (StringUtils.isEmpty(schemaName)) {
            return originalSch;
        }
        Catalog originalParentCatalog = CatalogHelper.getParentCatalog(originalSch);
        Catalog newParentCatalog = null;
        DataManager dataManager = null;
        if (originalParentCatalog != null) {
            // has catalog case
            newParentCatalog = new CatalogAdapter(originalParentCatalog).getCatalog();
            dataManager = originalParentCatalog.getDataManager().get(0);

        } else {
            // no catalog case
            dataManager = originalSch.getDataManager().get(0);
        }
        if (dataManager instanceof DatabaseConnection) {
            DatabaseConnection parentConnection = (DatabaseConnection) dataManager;
            String originalUISchema =
                    TaggedValueHelper.getValueString(TaggedValueHelper.ORIGINAL_UISCHEMA, parentConnection);
            String targetUISchema =
                    TaggedValueHelper.getValueString(TaggedValueHelper.TARGET_UISCHEMA, parentConnection);
            if (Platform.isRunning()) {
                DbConnectionAdapter dbConnectionAdapter =
                        new DbConnectionAdapter(parentConnection);
                if (dbConnectionAdapter.isSwitchWithTaggedValueMode()) {
                    if (schemaName.equals(originalUISchema)) {
                        // schema switch exist then use targetUISchema name to find schema
                        if (originalParentCatalog != null) {
                            return SchemaHelper.getSchemaByName(CatalogHelper.getSchemas(newParentCatalog),
                                    targetUISchema);
                        } else {
                            return SchemaHelper.getSchema(parentConnection, targetUISchema);
                        }
                    } else if (StringUtils.isEmpty(originalUISchema)) {
                        // schema switch don't exist then use schemaName to find schema
                        if (originalParentCatalog != null) {
                            return SchemaHelper.getSchemaByName(CatalogHelper.getSchemas(newParentCatalog),
                                    schemaName);
                        } else {
                            return SchemaHelper.getSchema(parentConnection, schemaName);
                        }
                    }
                }
            } else if (EDatabaseTypeName.GENERAL_JDBC.getXMLType().equals(parentConnection.getDatabaseType())) {
                String tempSchemaName = ExtractorFactory.getSchemaFromJobContext(parentConnection);
                if (StringUtils.isBlank(tempSchemaName)) {
                    if (parentConnection.isContextMode() && !StringUtils.isBlank(targetUISchema)) {
                        tempSchemaName = targetUISchema;
                    } else {
                        tempSchemaName = schemaName;
                    }
                }
                if (originalParentCatalog != null) {
                    return SchemaHelper.getSchemaByName(CatalogHelper.getSchemas(newParentCatalog), tempSchemaName);
                } else {
                    return SchemaHelper.getSchema(parentConnection, tempSchemaName);
                }
            }
        }
        return originalSch;
    }

    public static List<Schema> findSchemas(List<Schema> inputSchemas) {
        if(inputSchemas==null||inputSchemas.size()==0) {
            return inputSchemas;
        }
        Schema firstSchema=inputSchemas.get(0);
        DataManager dataManager = findConnection(firstSchema);
        String taggedTargetUISchemaName = null;
        String contextTargetUISchemaName = null;
        if (dataManager instanceof DatabaseConnection) {
            DatabaseConnection parentConnection = (DatabaseConnection) dataManager;
            DbConnectionAdapter dbConnectionAdapter =
                    new DbConnectionAdapter(parentConnection);
            if (dbConnectionAdapter.isSwitchWithTaggedValueMode()) {
                taggedTargetUISchemaName =
                        TaggedValueHelper.getValueString(TaggedValueHelper.TARGET_UISCHEMA, parentConnection);
            }
            if (Platform.isRunning()) {
                if (StringUtils.isBlank(taggedTargetUISchemaName)) {
                    return inputSchemas;
                }
            } else if (EDatabaseTypeName.GENERAL_JDBC.getXMLType().equals(parentConnection.getDatabaseType())) {
                contextTargetUISchemaName = ExtractorFactory.getSchemaFromJobContext(parentConnection);
                if (!StringUtils.isBlank(contextTargetUISchemaName)) {
                    taggedTargetUISchemaName = contextTargetUISchemaName;
                }
            }
        }
        if (!StringUtils.isBlank(taggedTargetUISchemaName)) {
            List<Schema> schemaList = new ArrayList<>();
            for (Schema targetSchema : inputSchemas) {
                if (taggedTargetUISchemaName.equals(targetSchema.getName())) {
                    schemaList.add(targetSchema);
                    return schemaList;
                }
            }
        }
        return inputSchemas;
    }
}
