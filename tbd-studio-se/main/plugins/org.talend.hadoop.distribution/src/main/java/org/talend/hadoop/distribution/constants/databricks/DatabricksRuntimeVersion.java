package org.talend.hadoop.distribution.constants.databricks;

import java.util.Arrays;
import java.util.List;

public class DatabricksRuntimeVersion {
	
	private static List<DatabricksRuntimeAndSparkVersion> availableRuntimeAndSparkVersion = initAvailableRuntimeAndSparkVersion();
	
	public static String showIfCondition = "(SPARK_MODE=='DATABRICKS' AND (DATABRICKS_CLUSTER_TYPE=='TRANSIENT' OR isContext[DATABRICKS_CLUSTER_TYPE]))";
	
	public static String defaultVersion = "\"10.4.x-scala2.12\"";

	private static List<DatabricksRuntimeAndSparkVersion> initAvailableRuntimeAndSparkVersion() {
		return Arrays.asList(new DatabricksRuntimeAndSparkVersion("\"9.1.x-scala2.12\"", "SPARK_3_1_x"),
				new DatabricksRuntimeAndSparkVersion("\"10.4.x-scala2.12\"", "SPARK_3_2_x"),
				new DatabricksRuntimeAndSparkVersion("\"12.2.x-scala2.12\"", "SPARK_3_3_x"),
				new DatabricksRuntimeAndSparkVersion("\"11.3.x-scala2.12\"", "SPARK_3_3_x"),
				new DatabricksRuntimeAndSparkVersion("\"13.3.x-scala2.12\"", "SPARK_3_4_x")
				
		);
	}
	
	public static List<DatabricksRuntimeAndSparkVersion> getAvailableRuntimeAndSparkVersion() {
		return availableRuntimeAndSparkVersion;
	}
}