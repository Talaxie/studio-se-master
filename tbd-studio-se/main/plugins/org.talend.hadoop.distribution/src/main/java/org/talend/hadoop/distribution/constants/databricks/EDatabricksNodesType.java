// ============================================================================
//
// Copyright (C) 2006-2021 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.hadoop.distribution.constants.databricks;

import java.util.Arrays;
import java.util.List;
public enum EDatabricksNodesType {

    AWS("r3.xlarge", Arrays.asList("r3.xlarge", "r3.2xlarge", "r3.4xlarge", "r3.8xlarge", "r4.xlarge", "r4.2xlarge", "r4.4xlarge", "r4.8xlarge", "r5.large", "r5.xlarge", "r5.2xlarge", "r5.4xlarge", "r5.12xlarge", "c3.2xlarge", "c3.4xlarge", "c3.8xlarge", "c4.2xlarge", "c4.4xlarge", "c4.8xlarge", "c5.xlarge", "c5.2xlarge", "c5.4xlarge", "c5.9xlarge", "i3.xlarge", "i3.2xlarge", "i3.4xlarge", "i3.8xlarge", "i3.16xlarge", "i2.xlarge", "i2.2xlarge", "i2.4xlarge", "i2.8xlarge", "p2.xlarge", "p2.8xlarge", "p2.16xlarge", "p3.2xlarge", "p3.8xlarge", "p3.16xlarge", "m4.large", "m4.xlarge", "m4.2xlarge", "m4.4xlarge", "m4.10xlarge", "m4.16xlarge", "m5.large", "m5.xlarge", "m5.2xlarge", "m5.4xlarge", "m5.12xlarge", "memory-optimized", "compute-optimized")),
    AZURE("Standard_DS3_v2",Arrays.asList("Standard_DS3_v2", "Standard_DS4_v2", "Standard_DS5_v2", "Standard_D8s_v3", "Standard_D16s_v3", "Standard_D32s_v3", "Standard_D64s_v3", "Standard_D3_v2", "Standard_D8_v3", "Standard_D16_v3", "Standard_D32_v3", "Standard_D64_v3", "Standard_D12_v2", "Standard_D13_v2", "Standard_D14_v2", "Standard_D15_v2", "Standard_DS12_v2", "Standard_DS13_v2", "Standard_DS14_v2", "Standard_DS15_v2", "Standard_E8s_v3", "Standard_E16s_v3", "Standard_E32s_v3", "Standard_E64s_v3", "Standard_L4s", "Standard_L8s", "Standard_L16s", "Standard_L32s", "Standard_F4s", "Standard_F8s", "Standard_F16s", "Standard_H16", "Standard_F4s_v2", "Standard_F8s_v2", "Standard_F16s_v2", "Standard_F32s_v2", "Standard_F64s_v2", "Standard_F72s_v2", "Standard_NC12", "Standard_NC24", "Standard_NC6s_v3", "Standard_NC12s_v3", "Standard_NC24s_v3", "Standard_L8s_v2", "Standard_L16s_v2", "Standard_L32s_v2", "Standard_L64s_v2", "Standard_L80s_v2")),
    GCP("n1-standard-4", Arrays.asList("n1-standard-4", "n1-standard-8", "n1-standard-16", "n1-standard-32", "n1-standard-64", "n1-standard-96", "n2-standard-4", "n2-standard-8", "n2-standard-16", "n2-standard-32", "n2-standard-48", "n2-standard-64", "n2-standard-80", "n1-highmem-4", "n1-highmem-8", "n1-highmem-16", "n1-highmem-32", "n1-highmem-64", "n1-highmem-96", "n2-highmem-2", "n2-highmem-4", "n2-highmem-8", "n2-highmem-16", "n2-highmem-32", "n2-highmem-48", "n2-highmem-64", "n2-highmem-80", "n1-highcpu-16", "n1-highcpu-32", "n1-highcpu-64", "n1-highcpu-96", "n2-highcpu-16", "n2-highcpu-32", "n2-highcpu-48", "n2-highcpu-64", "n2-highcpu-80", "e2-standard-4", "e2-standard-8", "e2-standard-16", "e2-standard-32", "e2-highmem-2", "e2-highmem-4", "e2-highmem-8", "e2-highmem-16", "e2-highcpu-16", "e2-highcpu-32", "c2-standard-4", "c2-standard-8", "c2-standard-16", "c2-standard-30", "c2-standard-60", "n2d-standard-4", "n2d-standard-8", "n2d-standard-16", "n2d-standard-32", "n2d-standard-48", "n2d-standard-64", "n2d-standard-80", "n2d-standard-96", "n2d-standard-128", "n2d-standard-224", "n2d-highmem-2", "n2d-highmem-4", "n2d-highmem-8", "n2d-highmem-16", "n2d-highmem-32", "n2d-highmem-48", "n2d-highmem-64", "n2d-highmem-80", "n2d-highmem-96", "n2d-highcpu-16", "n2d-highcpu-32", "n2d-highcpu-48", "n2d-highcpu-64", "n2d-highcpu-80", "n2d-highcpu-96", "n2d-highcpu-128", "n2d-highcpu-224", "a2-highgpu-1g", "a2-highgpu-2g", "a2-highgpu-4g", "a2-highgpu-8g", "a2-megagpu-16g"));

    private String defaultValue;
	
	private List<String> type;

    EDatabricksNodesType(String defaultValue, List<String> asList) {
    	this.defaultValue = defaultValue;
		this.type = asList;
	}
    
    public List<String> getNodeTypeID() {
    	return this.type;
    }
    
    public static List<String> getNodeTypeByProvider(String provider) {
    	if (provider != null) {
    		switch(provider) {
			case "\"AWS\"":
				return EDatabricksNodesType.AWS.getNodeTypeID();
			case "\"Azure\"":
				return EDatabricksNodesType.AZURE.getNodeTypeID();
			case "\"GCP\"":
				return EDatabricksNodesType.GCP.getNodeTypeID();
			default:
				return null;
    		}
		}
		return EDatabricksNodesType.AWS.getNodeTypeID();
    }
    
    public String getDefaultValue() {
    	return this.defaultValue;
    }

    public static String getDefaultNodeTypeByProvider(String provider) {
    	if (provider != null) {
			switch(provider) {
				case "\"AWS\"":
					return EDatabricksNodesType.AWS.getDefaultValue();
				case "\"Azure\"":
					return EDatabricksNodesType.AZURE.getDefaultValue();
				case "\"GCP\"":
					return EDatabricksNodesType.GCP.getDefaultValue();
				default:
					return null;
			}
    	}
    	return EDatabricksNodesType.AWS.getDefaultValue();
    }
	
}
