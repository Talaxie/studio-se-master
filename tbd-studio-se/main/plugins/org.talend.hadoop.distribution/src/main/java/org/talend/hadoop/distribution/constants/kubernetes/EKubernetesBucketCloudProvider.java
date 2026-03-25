// ============================================================================
//
// Copyright (C) 2006-2020 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.hadoop.distribution.constants.kubernetes;

import org.talend.hadoop.distribution.i18n.Messages;
public enum EKubernetesBucketCloudProvider {

	S3(Messages.getString("EKubernetesBucketCloudProvider.S3"), "S3"),
	AZURE(Messages.getString("EKubernetesBucketCloudProvider.AZURE"), "AZURE"),
    BLOB(Messages.getString("EKubernetesBucketCloudProvider.BLOB"), "BLOB");

    private String bucketCloudLabel;

    private String bucketCloudValue;

    EKubernetesBucketCloudProvider(String bucketCloudLabel, String bucketCloudValue) {
        this.bucketCloudLabel = bucketCloudLabel;
        this.bucketCloudValue = bucketCloudValue;
    }

    public String getLabel() {
        return bucketCloudLabel;
    }

    public String getValue() {
        return bucketCloudValue;
    }
}
