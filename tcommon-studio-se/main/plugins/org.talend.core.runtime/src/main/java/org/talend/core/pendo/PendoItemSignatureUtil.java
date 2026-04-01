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
package org.talend.core.pendo;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.common.util.EMap;
import org.talend.commons.utils.VersionUtils;
import org.talend.core.model.general.Project;
import org.talend.core.model.properties.Property;
import org.talend.core.runtime.projectsetting.ProjectPreferenceManager;
import org.talend.core.runtime.util.EmfResourceUtil;
import org.talend.repository.ProjectManager;
import org.talend.utils.security.CryptoMigrationUtil;
import org.talend.utils.security.StudioEncryption;

/**
 * DOC jding  class global comment. Detailled comment
 */
public class PendoItemSignatureUtil {

    public static final String MIGRATION_TOKEN_KEY = "force_import_unsupported_job";

    public static final String REPOSITORY_PLUGIN_ID = "org.talend.repository";

    public static final String PROJ_DATE_ID = "repository.project.id";

    public static final String PROD_DATE_ID = "product.date.id";

    public static String getCurrentProjectCreateDate() {
        Project currentProject = ProjectManager.getInstance().getCurrentProject();
        if (currentProject != null) {
            ProjectPreferenceManager projectPrefManager = new ProjectPreferenceManager(
                    PendoItemSignatureUtil.REPOSITORY_PLUGIN_ID, false);
            String projDate = projectPrefManager.getValue(PendoItemSignatureUtil.PROJ_DATE_ID);
            if (StringUtils.isNotBlank(projDate)) {
                String decrypt = null;
                if (StudioEncryption.hasEncryptionSymbol(projDate)) {
                    decrypt = StudioEncryption.getStudioEncryption(StudioEncryption.EncryptionKeyName.MIGRATION_TOKEN)
                            .decrypt(projDate);
                } else {
                    decrypt = CryptoMigrationUtil.decrypt(projDate);
                }
                return decrypt;
            }
        }
        return null;
    }

    public static String getStudioVersion() {
        String studioVersion = VersionUtils.getDisplayVersion();
        String patchInstalledVersion = PendoTrackDataUtil.getLatestPatchInstalledVersion();
        if (StringUtils.isNotBlank(patchInstalledVersion)) {
            studioVersion = patchInstalledVersion;
        }
        return studioVersion;
    }

    public static String getItemProductVersion(Property property) {
        String productVersion = null;
        EMap additionalProperties = property.getAdditionalProperties();
        if (additionalProperties.get("modified_product_version") != null) {
            productVersion = additionalProperties.get("modified_product_version").toString();
        } else if (additionalProperties.get("created_product_version") != null) {
            productVersion = additionalProperties.get("created_product_version").toString();
        }
        if (StringUtils.isNotBlank(productVersion)) {
            productVersion = VersionUtils.getTalendPureVersion(productVersion);
        }
        return productVersion;
    }

    public static String getItemProductName(Property property) {
        String productName = null;
        EMap additionalProperties = property.getAdditionalProperties();
        if (additionalProperties.get("modified_product_fullname") != null) {
            productName = additionalProperties.get("modified_product_fullname").toString();
        } else if (additionalProperties.get("created_product_fullname") != null) {
            productName = additionalProperties.get("created_product_fullname").toString();
        }
        return productName;
    }

    public static String formatDate(String dateString, String pattern) {
        String formattedDate = "";
        if (StringUtils.isNotBlank(dateString)) {
            Date date = new Date(Long.parseLong(dateString));
            SimpleDateFormat sdf = new SimpleDateFormat(pattern);
            formattedDate = sdf.format(date);
        }
        return formattedDate;
    }

    public interface SignatureStatus {

        public static final int V_VALID = 0;

        public static final int V_INVALID = EmfResourceUtil.V_INVALID << 0;

        public static final int V_UNSIGNED = V_INVALID << 1;
    }

    public enum TOSProdNameEnum {

        TOS_DI("Talaxie Open Studio for Data Integration"),
        TOS_BD("Talaxie Open Studio for Big Data"),
        TOS_ESB("Talaxie Open Studio for ESB"),
        TOS_TOP("Talaxie Open Studio for Data Quality");

        private String prodName;

        TOSProdNameEnum(String prodName) {
            this.prodName = prodName;
        }

        public String getProdName() {
            return prodName;
        }

        public static String getTOSCategoryByProdName(String prodName) {
            String category = null;
            for (TOSProdNameEnum tosProdNameEnum : TOSProdNameEnum.values()) {
                if (tosProdNameEnum.getProdName().equals(prodName)) {
                    category = tosProdNameEnum.name();
                    break;
                }
            }
            return category;
        }

    }

    public enum ValueEnum {

        YES("Y"),
        NO("N"),
        NOT_APPLICATE("N/A");

        private String displayValue;

        ValueEnum(String displayValue) {
            this.displayValue = displayValue;
        }

        public String getDisplayValue() {
            return displayValue;
        }
    }
}
