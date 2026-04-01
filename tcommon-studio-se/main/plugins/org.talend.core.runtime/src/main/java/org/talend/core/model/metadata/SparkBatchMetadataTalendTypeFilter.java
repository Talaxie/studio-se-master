package org.talend.core.model.metadata;

import java.util.Arrays;
import java.util.List;
import org.talend.core.model.process.IElementParameter;
import org.talend.core.model.process.INode;

public class SparkBatchMetadataTalendTypeFilter
  extends SparkMetadataTalendTypeFilter {

  private INode node;

    public static List<String> dynamicTypeCompatibleComponents = Arrays.asList(
            "tDeltaLakeInput",
            "tDeltaLakeOutput",
            "tFileInputDelimited",
            "tFileInputParquet",
            "tFileOutputParquet",
            "tJDBCInput",
            "tJDBCOutput",
            "tLogRow",
            "tAvroInput",
            "tMongoDBInput",
            "tMongoDBOutput"
            );

  public SparkBatchMetadataTalendTypeFilter(INode node) {
    super(node.getComponent().getName());
    this.node = node;
  }

  @Override
  public List<String> getComponentSpecificTypes() {
    // For the moment only dynamic type is a component specific type
    // dynamic type is available under 2 conditions : job uses Dataset API and component is listed in
    // dynamicTypeCompatibleComponents
    INode configNode = node
      .getProcess()
      .getNodesOfType("tSparkConfiguration")
      .get(0);
    IElementParameter param = configNode.getElementParameter("USE_DATASET_API");
    if (Boolean.FALSE.equals(param.getValue())) {
      return null;
    }
    if (
      dynamicTypeCompatibleComponents.contains(node.getComponent().getName())
    ) {
      return Arrays.asList(SparkMetadataTalendTypeFilter.DYNAMIC);
    }
    return null;
  }
}
