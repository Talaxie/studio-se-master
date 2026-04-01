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
package org.talend.core.model.update;

import java.util.Date;

/**
 * DOC cmeng  class global comment. Detailled comment
 */
public class StudioUpdateConfig implements IStudioUpdateConfig {

    private Boolean enabled;

    private IStudioUpdate studioUpdate;

    @Override
    public Boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public IStudioUpdate getStudioUpdate() {
        return studioUpdate;
    }

    public void setStudioUpdate(IStudioUpdate studioUpdate) {
        this.studioUpdate = studioUpdate;
    }

    public static class StudioUpdate implements IStudioUpdate {

        private String name;

        private String studioVersion;

        private String updateUrl;

        private Date releaseDate;

        private String infoUrl;

        private String baseUrl;

        private String approvedBy;

        private String approvedName;

        private Date approvedDate;

        private String projectId;

        private Boolean custom;

        @Override
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String getStudioVersion() {
            return studioVersion;
        }

        public void setStudioVersion(String studioVersion) {
            this.studioVersion = studioVersion;
        }

        @Override
        public String getUpdateUrl() {
            return updateUrl;
        }

        public void setUpdateUrl(String updateUrl) {
            this.updateUrl = updateUrl;
        }

        @Override
        public Date getReleaseDate() {
            return releaseDate;
        }

        public void setReleaseDate(Date releaseDate) {
            this.releaseDate = releaseDate;
        }

        @Override
        public String getInfoUrl() {
            return infoUrl;
        }

        public void setInfoUrl(String infoUrl) {
            this.infoUrl = infoUrl;
        }

        @Override
        public String getBaseUrl() {
            return baseUrl;
        }

        public void setBaseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
        }

        @Override
        public String getApprovedBy() {
            return approvedBy;
        }

        public void setApprovedBy(String approvedBy) {
            this.approvedBy = approvedBy;
        }

        @Override
        public String getApprovedName() {
            return approvedName;
        }

        public void setApprovedName(String approvedName) {
            this.approvedName = approvedName;
        }

        @Override
        public Date getApprovedDate() {
            return approvedDate;
        }

        public void setApprovedDate(Date approvedDate) {
            this.approvedDate = approvedDate;
        }

        @Override
        public String getProjectId() {
            return projectId;
        }

        public void setProjectId(String projectId) {
            this.projectId = projectId;
        }

        @Override
        public Boolean isCustom() {
            return custom;
        }

        public void setCustom(Boolean custom) {
            this.custom = custom;
        }

    }

}
