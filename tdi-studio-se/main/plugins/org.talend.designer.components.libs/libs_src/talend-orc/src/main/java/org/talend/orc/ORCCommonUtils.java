package org.talend.orc;

import org.apache.hadoop.hive.ql.exec.vector.ColumnVector;
import org.apache.hadoop.hive.ql.exec.vector.MapColumnVector;

abstract class ORCCommonUtils {
	/**
	 * Check that the map type for the key is BYTES, LONG or DOUBLE and that the key
	 * type is LONG, DOUBLE, BYTES, DECIMAL or TIMESTAMP.
	 *
	 * @param mapVector a MapColumnVector
	 * @return true if the key and value types conform to the limits described
	 *         above.
	 */
	public static boolean checkMapColumnVectorTypes(MapColumnVector mapVector) {
		ColumnVector.Type keyType = mapVector.keys.type;
		ColumnVector.Type valueType = mapVector.values.type;
		return (keyType == ColumnVector.Type.BYTES || keyType == ColumnVector.Type.LONG
				|| keyType == ColumnVector.Type.DOUBLE)
				&& (valueType == ColumnVector.Type.LONG || valueType == ColumnVector.Type.DOUBLE
						|| valueType == ColumnVector.Type.BYTES || valueType == ColumnVector.Type.DECIMAL
						|| valueType == ColumnVector.Type.TIMESTAMP);
	}
}
