package org.talend.hadoop.distribution.constants.databricks;

public class DatabricksRuntimeAndSparkVersion {
	
	private String runtimeVersion;
	
	private String sparkVersion;
	
	public DatabricksRuntimeAndSparkVersion(String runtimeVersion, String sparkVersion) {
		this.runtimeVersion = runtimeVersion;
		this.sparkVersion = sparkVersion;
	}
	
	public String getRuntimeVersion() {
		return this.runtimeVersion;
	}
	
	public String getSparkVersion() {
		return this.sparkVersion;
	}
}
