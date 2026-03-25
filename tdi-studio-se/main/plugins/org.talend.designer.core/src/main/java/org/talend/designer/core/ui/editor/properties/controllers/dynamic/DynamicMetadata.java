// ============================================================================
//
// Copyright (C) 2006-2021 Talaxie Inc. - www.deilink.fr
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talaxie SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.designer.core.ui.editor.properties.controllers.dynamic;

import org.talend.core.model.metadata.MetadataColumn;
import org.talend.core.model.metadata.types.JavaTypesManager;

/**
 * Copied from org.talend.desinger.routines.tisprovider/resources/java/routines/system/DynamicMetadata.java
 */
public class DynamicMetadata implements java.io.Serializable {

    private static final long serialVersionUID = 6539025168305946386L;

    private String name = null;

    private String dbName = null;

    private String type = "id_String";

    /**
     * Stores logical type of avro Schema Schema may contain following standard (avro) logical types: "date",
     * "timestamp-millis", "timestamp-micros", "time-millis", "time-micros"
     */
    private String logicalType;

    private String dbType = "VARCHAR";

    private boolean dbTypeDefinitive = false;

    private int dbTypeId = java.sql.Types.VARCHAR;

    private int length = -1;

    private int precision = -1;

    private String format = null;

    private String description = null;

    private boolean isKey = false;

    private boolean isNullable = true;

    private sourceTypes sourceType = sourceTypes.unknown;

    private int columnPosition = -1;

    private String refFieldName = null;

    private String refModuleName = null;

    private String extendedConfiguration = null;

    public static enum sourceTypes {
        unknown,
        demilitedFile,
        positionalFile,
        database,
        excelFile,
        salesforce,
        servicenow,
        sap
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public String getDbName() {
        return dbName;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setLogicalType(String logicalType) {
        this.logicalType = logicalType;
    }

    public String getLogicalType() {
        return this.logicalType;
    }

    public void setDbType(String dbType) {
        this.dbType = dbType;
    }

    public String getDbType() {
        return dbType;
    }

    public boolean isDbTypeDefinitive() {
        return dbTypeDefinitive;
    }

    public void setDbTypeDefinitive(boolean dbTypeDefinitive) {
        this.dbTypeDefinitive = dbTypeDefinitive;
    }

    public void setDbTypeId(int dbTypeId) {
        this.dbTypeId = dbTypeId;
    }

    public int getDbTypeId() {
        return dbTypeId;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }

    public int getPrecision() {
        return precision;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getFormat() {
        return format == null ? "dd-MM-yyyy HH:mm:ss" : format;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setKey(boolean isKey) {
        this.isKey = isKey;
    }

    public boolean isKey() {
        return isKey;
    }

    public void setNullable(boolean isNullable) {
        this.isNullable = isNullable;
    }

    public boolean isNullable() {
        return isNullable;
    }

    public void setSourceType(sourceTypes sourceType) {
        this.sourceType = sourceType;
    }

    public sourceTypes getSourceType() {
        return sourceType;
    }

    public void setColumnPosition(int columnPosition) {
        this.columnPosition = columnPosition;
    }

    public int getColumnPosition() {
        return columnPosition;
    }

    public String getRefFieldName() {
        return refFieldName;
    }

    public void setRefFieldName(String refFieldName) {
        this.refFieldName = refFieldName;
    }

    public String getRefModuleName() {
        return refModuleName;
    }

    public void setRefModuleName(String refModuleName) {
        this.refModuleName = refModuleName;
    }

    public void setExtendedConfiguration(String extendedConfiguration) {
        this.extendedConfiguration = extendedConfiguration;
    }

    public String getExtendedConfiguration() {
        return extendedConfiguration;
    }

    public int hashCode() {
        return 31 * name.hashCode() + dbName != null ? dbName.hashCode() : 0 + type.hashCode() + dbType.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass())
            return false;
        boolean result = false;
        DynamicMetadata dm = (DynamicMetadata) obj;
        result = name.equals(dm.getName()) && type.equals(dm.getType());
        return result;
    }

    public DynamicMetadata clone() {
        DynamicMetadata newDynamicMetadata = new DynamicMetadata();
        newDynamicMetadata.setColumnPosition(this.getColumnPosition());
        newDynamicMetadata.setDbName(this.getDbName());
        newDynamicMetadata.setDbType(this.getDbType());
        newDynamicMetadata.setDbTypeDefinitive(this.isDbTypeDefinitive());
        newDynamicMetadata.setDbTypeId(this.getDbTypeId());
        newDynamicMetadata.setDescription(this.getDescription());
        newDynamicMetadata.setFormat(this.getFormat());
        newDynamicMetadata.setKey(this.isKey());
        newDynamicMetadata.setLength(this.getLength());
        newDynamicMetadata.setLogicalType(this.getLogicalType());
        newDynamicMetadata.setName(this.getName());
        newDynamicMetadata.setNullable(this.isNullable());
        newDynamicMetadata.setPrecision(this.getPrecision());
        newDynamicMetadata.setRefFieldName(this.getRefFieldName());
        newDynamicMetadata.setRefModuleName(this.getRefModuleName());
        newDynamicMetadata.setSourceType(this.getSourceType());
        newDynamicMetadata.setType(this.getType());
        newDynamicMetadata.setExtendedConfiguration(this.getExtendedConfiguration());
        return newDynamicMetadata;
    }

    public MetadataColumn convert() {
        MetadataColumn column = new MetadataColumn();
        column.setLabel(name != null ? name : "");
        column.setOriginalDbColumnName(dbName != null ? dbName : "");
        column.setPrecision(precision);
        column.setLength(length);
        column.setType(dbType);
        column.setTalendType(type);
        column.setPattern(type.equals(JavaTypesManager.DATE.getId()) ? getFormat() : "");
        column.setNullable(isNullable);
        column.setKey(isKey);
        column.setComment(description != null ? description : "");

        return column;
    }
}
