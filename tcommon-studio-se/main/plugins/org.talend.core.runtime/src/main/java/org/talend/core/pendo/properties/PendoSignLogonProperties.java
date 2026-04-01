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
package org.talend.core.pendo.properties;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DOC jding  class global comment. Detailled comment
 */
public class PendoSignLogonProperties implements IPendoDataProperties {

    @JsonProperty("studio_version")
    private String studioVersion;

    @JsonProperty("valid_items")
    private int validItems;

    @JsonProperty("signature_invalid_items")
    private int invalidSignItems;

    @JsonProperty("unsigned_items_from_SE")
    private String unsignSEItems;

    @JsonProperty("unsigned_items_from_EE")
    private int unsignEEItems;

    @JsonProperty("invalid_item_source_version")
    private String invalidItemSourceVersion;

    @JsonProperty("signed_by_migration")
    private int signByMigration;

    @JsonProperty("grace_period")
    private String gracePeriod;

    @JsonProperty("installed_date")
    private String installDate;

    @JsonProperty("project_creation_date")
    private String projectCreateDate;

    @JsonProperty("valid_migration_token")
    private String validMigrationToken;

    /**
     * Getter for studioVersion.
     * 
     * @return the studioVersion
     */
    public String getStudioVersion() {
        return studioVersion;
    }

    /**
     * Sets the studioVersion.
     * 
     * @param studioVersion the studioVersion to set
     */
    public void setStudioVersion(String studioVersion) {
        this.studioVersion = studioVersion;
    }

    /**
     * Getter for validItems.
     * 
     * @return the validItems
     */
    public int getValidItems() {
        return validItems;
    }

    /**
     * Sets the validItems.
     * 
     * @param validItems the validItems to set
     */
    public void setValidItems(int validItems) {
        this.validItems = validItems;
    }

    /**
     * Getter for invalidSignItems.
     * 
     * @return the invalidSignItems
     */
    public int getInvalidSignItems() {
        return invalidSignItems;
    }

    /**
     * Sets the invalidSignItems.
     * 
     * @param invalidSignItems the invalidSignItems to set
     */
    public void setInvalidSignItems(int invalidSignItems) {
        this.invalidSignItems = invalidSignItems;
    }

    /**
     * Getter for unsignSEItems.
     * @return the unsignSEItems
     */
    public String getUnsignSEItems() {
        return unsignSEItems;
    }

    /**
     * Sets the unsignSEItems.
     * @param unsignSEItems the unsignSEItems to set
     */
    public void setUnsignSEItems(String unsignSEItems) {
        this.unsignSEItems = unsignSEItems;
    }

    /**
     * Getter for unsignEEItems.
     * 
     * @return the unsignEEItems
     */
    public int getUnsignEEItems() {
        return unsignEEItems;
    }

    /**
     * Sets the unsignEEItems.
     * 
     * @param unsignEEItems the unsignEEItems to set
     */
    public void setUnsignEEItems(int unsignEEItems) {
        this.unsignEEItems = unsignEEItems;
    }

    /**
     * Getter for invalidItemSourceVersion.
     * 
     * @return the invalidItemSourceVersion
     */
    public String getInvalidItemSourceVersion() {
        return invalidItemSourceVersion;
    }

    /**
     * Sets the invalidItemSourceVersion.
     * 
     * @param invalidItemSourceVersion the invalidItemSourceVersion to set
     */
    public void setInvalidItemSourceVersion(String invalidItemSourceVersion) {
        this.invalidItemSourceVersion = invalidItemSourceVersion;
    }

    /**
     * Getter for signByMigration.
     * 
     * @return the signByMigration
     */
    public int getSignByMigration() {
        return signByMigration;
    }

    /**
     * Sets the signByMigration.
     * 
     * @param signByMigration the signByMigration to set
     */
    public void setSignByMigration(int signByMigration) {
        this.signByMigration = signByMigration;
    }

    /**
     * Getter for gracePeriod.
     * 
     * @return the gracePeriod
     */
    public String getGracePeriod() {
        return gracePeriod;
    }

    /**
     * Sets the gracePeriod.
     * 
     * @param gracePeriod the gracePeriod to set
     */
    public void setGracePeriod(String gracePeriod) {
        this.gracePeriod = gracePeriod;
    }

    /**
     * Getter for installDate.
     * 
     * @return the installDate
     */
    public String getInstallDate() {
        return installDate;
    }

    /**
     * Sets the installDate.
     * 
     * @param installDate the installDate to set
     */
    public void setInstallDate(String installDate) {
        this.installDate = installDate;
    }

    /**
     * Getter for projectCreateDate.
     * 
     * @return the projectCreateDate
     */
    public String getProjectCreateDate() {
        return projectCreateDate;
    }

    /**
     * Sets the projectCreateDate.
     * 
     * @param projectCreateDate the projectCreateDate to set
     */
    public void setProjectCreateDate(String projectCreateDate) {
        this.projectCreateDate = projectCreateDate;
    }

    /**
     * Getter for validMigrationToken.
     * 
     * @return the validMigrationToken
     */
    public String getValidMigrationToken() {
        return validMigrationToken;
    }

    /**
     * Sets the validMigrationToken.
     * 
     * @param validMigrationToken the validMigrationToken to set
     */
    public void setValidMigrationToken(String validMigrationToken) {
        this.validMigrationToken = validMigrationToken;
    }

}
