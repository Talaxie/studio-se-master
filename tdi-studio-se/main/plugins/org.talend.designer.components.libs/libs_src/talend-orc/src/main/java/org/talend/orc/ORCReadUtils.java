package org.talend.orc;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.hadoop.hive.ql.exec.vector.BytesColumnVector;
import org.apache.hadoop.hive.ql.exec.vector.ColumnVector;
import org.apache.hadoop.hive.ql.exec.vector.DecimalColumnVector;
import org.apache.hadoop.hive.ql.exec.vector.DoubleColumnVector;
import org.apache.hadoop.hive.ql.exec.vector.ListColumnVector;
import org.apache.hadoop.hive.ql.exec.vector.LongColumnVector;
import org.apache.hadoop.hive.ql.exec.vector.MapColumnVector;
import org.apache.hadoop.hive.ql.exec.vector.StructColumnVector;
import org.apache.hadoop.hive.ql.exec.vector.TimestampColumnVector;
import org.apache.hadoop.hive.ql.exec.vector.UnionColumnVector;
import org.apache.hadoop.hive.ql.exec.vector.VectorizedRowBatch;
import org.apache.orc.TypeDescription;

public class ORCReadUtils {
	public static Object readColumnByName(VectorizedRowBatch batch, String columnName, TypeDescription schema,
			int rowNum) {
		List<String> allColumnNames = schema.getFieldNames();
		int colIndex = allColumnNames.indexOf(columnName);
		if (colIndex < 0 || colIndex > batch.cols.length - 1) {
			return null;
		} else {
			org.apache.hadoop.hive.ql.exec.vector.ColumnVector colVector = batch.cols[colIndex];
			TypeDescription fieldType = schema.getChildren().get(colIndex);
			int colRow = colVector.isRepeating ? 0 : rowNum;
			Object value = readColumn(colVector, fieldType, colRow);
			return value;
		}

	}

	public static Object readColumn(ColumnVector colVec, TypeDescription colType, int rowNum) {
		Object columnObj = null;
		if (!colVec.isNull[rowNum]) {
			switch (colVec.type) {
			case BYTES:
				columnObj = readBytesVal(colVec, colType, rowNum);
				break;
			case DECIMAL:
				columnObj = readDecimalVal(colVec, rowNum);
				break;
			case DOUBLE:
				columnObj = readDoubleVal(colVec, colType, rowNum);
				break;
			case LIST:
				columnObj = readListVal(colVec, colType, rowNum);
				break;
			case LONG:
				columnObj = readLongVal(colVec, colType, rowNum);
				break;
			case MAP:
				columnObj = readMapVal(colVec, colType, rowNum);
				break;
			case STRUCT:
				columnObj = readStructVal(colVec, colType, rowNum);
				break;
			case TIMESTAMP:
				columnObj = readTimestampVal(colVec, colType, rowNum);
				break;
			case UNION:
				columnObj = readUnionVal(colVec, colType, rowNum);
				break;
			default:
				throw new RuntimeException("readColumn: unsupported ORC file column type: " + colVec.type.name());
			}
		}
		return columnObj;
	}

	private static Object readListVal(ColumnVector colVec, TypeDescription colType, int rowNum) {
		Object listValues = null;
		if (!colVec.isNull[rowNum]) {
			ListColumnVector listVector = (ListColumnVector) colVec;
			ColumnVector listChildVector = listVector.child;
			TypeDescription childType = colType.getChildren().get(0);
			switch (listChildVector.type) {
			case BYTES:
				listValues = readBytesListValues(listVector, childType, rowNum);
				break;
			case DECIMAL:
				listValues = readDecimalListValues(listVector, rowNum);
				break;
			case DOUBLE:
				listValues = readDoubleListValues(listVector, rowNum);
				break;
			case LONG:
				listValues = readLongListValues(listVector, childType, rowNum);
				break;
			case TIMESTAMP:
				listValues = readTimestampListValues(listVector, childType, rowNum);
				break;
			default:
				throw new RuntimeException(listVector.type.name() + " is not supported for ListColumnVectors");
			}
		}
		return listValues;
	}

	private static List<Object> readLongListVector(LongColumnVector longVector, TypeDescription childType, int offset,
			int numValues) {
		List<Object> longList = new ArrayList<>();
		for (int i = 0; i < numValues; i++) {
			if (!longVector.isNull[offset + i]) {
				long longVal = longVector.vector[offset + i];
				if (childType.getCategory() == TypeDescription.Category.BOOLEAN) {
					Boolean boolVal = longVal == 0 ? Boolean.valueOf(false) : Boolean.valueOf(true);
					longList.add(boolVal);
				} else if (childType.getCategory() == TypeDescription.Category.INT) {
					Integer intObj = (int) longVal;
					longList.add(intObj);
				} else {
					longList.add(longVal);
				}
			} else {
				longList.add(null);
			}
		}
		return longList;
	}

	private static Object readLongListValues(ListColumnVector listVector, TypeDescription childType, int rowNum) {
		int offset = (int) listVector.offsets[rowNum];
		int numValues = (int) listVector.lengths[rowNum];
		LongColumnVector longVector = (LongColumnVector) listVector.child;
		return readLongListVector(longVector, childType, offset, numValues);
	}

	private static Object readTimestampListVector(TimestampColumnVector timestampVector, TypeDescription childType,
			int offset, int numValues) {
		List<Object> timestampList = new ArrayList<>();
		for (int i = 0; i < numValues; i++) {
			if (!timestampVector.isNull[offset + i]) {
				int nanos = timestampVector.nanos[offset + i];
				long millisec = timestampVector.time[offset + i];
				Timestamp timestamp = new Timestamp(millisec);
				timestamp.setNanos(nanos);
				if (childType.getCategory() == TypeDescription.Category.DATE) {
					Date date = new Date(timestamp.getTime());
					timestampList.add(date);
				} else {
					timestampList.add(timestamp);
				}
			} else {
				timestampList.add(null);
			}
		}
		return timestampList;
	}

	/**
	 * Read either Timestamp or Date values, depending on the definition in the
	 * schema.
	 */
	private static Object readTimestampListValues(ListColumnVector listVector, TypeDescription childType, int rowNum) {
		int offset = (int) listVector.offsets[rowNum];
		int numValues = (int) listVector.lengths[rowNum];
		TimestampColumnVector timestampVec = (TimestampColumnVector) listVector.child;
		return readTimestampListVector(timestampVec, childType, offset, numValues);
	}

	private static Object readDecimalListVector(DecimalColumnVector decimalVector, int offset, int numValues,
			int batchRowNum) {
		List<Object> decimalList = new ArrayList<>();
		for (int i = 0; i < numValues; i++) {
			if (!decimalVector.isNull[offset + i]) {
				BigDecimal bigDecimal = decimalVector.vector[batchRowNum].getHiveDecimal().bigDecimalValue();
				decimalList.add(bigDecimal);
			} else {
				decimalList.add(null);
			}
		}
		return decimalList;
	}

	private static Object readDecimalListValues(ListColumnVector listVector, int rowNum) {
		int offset = (int) listVector.offsets[rowNum];
		int numValues = (int) listVector.lengths[rowNum];
		DecimalColumnVector decimalVec = (DecimalColumnVector) listVector.child;
		return readDecimalListVector(decimalVec, offset, numValues, rowNum);
	}

	private static Object readBytesListVector(BytesColumnVector bytesVec, TypeDescription childType, int offset,
			int numValues) {
		List<Object> bytesValList = new ArrayList<>();
		for (int i = 0; i < numValues; i++) {
			if (!bytesVec.isNull[offset + i]) {
				byte[] byteArray = bytesVec.vector[offset + i];
				int vecLen = bytesVec.length[offset + i];
				int vecStart = bytesVec.start[offset + i];
				byte[] vecCopy = Arrays.copyOfRange(byteArray, vecStart, vecStart + vecLen);
				if (childType.getCategory() == TypeDescription.Category.STRING) {
					String str = new String(vecCopy);
					bytesValList.add(str);
				} else {
					bytesValList.add(vecCopy);
				}
			} else {
				bytesValList.add(null);
			}
		}
		return bytesValList;
	}

	private static Object readBytesListValues(ListColumnVector listVector, TypeDescription childType, int rowNum) {
		int offset = (int) listVector.offsets[rowNum];
		int numValues = (int) listVector.lengths[rowNum];
		BytesColumnVector bytesVec = (BytesColumnVector) listVector.child;
		return readBytesListVector(bytesVec, childType, offset, numValues);
	}

	private static Object readDoubleListVector(DoubleColumnVector doubleVec, int offset, int numValues) {
		List<Object> doubleList = new ArrayList<>();
		for (int i = 0; i < numValues; i++) {
			if (!doubleVec.isNull[offset + i]) {
				Double doubleVal = doubleVec.vector[offset + i];
				doubleList.add(doubleVal);
			} else {
				doubleList.add(null);
			}
		}
		return doubleList;
	}

	private static Object readDoubleListValues(ListColumnVector listVector, int rowNum) {

		int offset = (int) listVector.offsets[rowNum];
		int numValues = (int) listVector.lengths[rowNum];
		DoubleColumnVector doubleVec = (DoubleColumnVector) listVector.child;
		return readDoubleListVector(doubleVec, offset, numValues);
	}

	@SuppressWarnings("unchecked")
	private static List<Object> readMapVector(ColumnVector mapVector, TypeDescription childType, int offset,
			int numValues, int rowNum) {
		List<Object> mapList = null;
		switch (mapVector.type) {
		case BYTES:
			mapList = (List<Object>) readBytesListVector((BytesColumnVector) mapVector, childType, offset, numValues);
			break;
		case DECIMAL:
			mapList = (List<Object>) readDecimalListVector((DecimalColumnVector) mapVector, offset, numValues, rowNum);
			;
			break;
		case DOUBLE:
			mapList = (List<Object>) readDoubleListVector((DoubleColumnVector) mapVector, offset, numValues);
			break;
		case LONG:
			mapList = readLongListVector((LongColumnVector) mapVector, childType, offset, numValues);
			break;
		case TIMESTAMP:
			mapList = (List<Object>) readTimestampListVector((TimestampColumnVector) mapVector, childType, offset,
					numValues);
			break;
		default:
			throw new RuntimeException(mapVector.type.name() + " is not supported for MapColumnVectors");
		}
		return mapList;
	}

	/**
	 * <p>
	 * Read a Map column value (e.g., a set of keys and their associated values).
	 * </p>
	 * <p>
	 * The Map key and value types are the first and second children in the children
	 * TypeDescription List. From the TypeDescription source:
	 * </p>
	 * 
	 * <pre>
	 * result.children.add(keyType);
	 * result.children.add(valueType);
	 * </pre>
	 */
	private static Object readMapVal(ColumnVector colVec, TypeDescription colType, int rowNum) {
		Map<Object, Object> objMap = new HashMap<>();
		MapColumnVector mapVector = (MapColumnVector) colVec;
		if (ORCCommonUtils.checkMapColumnVectorTypes(mapVector)) {
			int mapSize = (int) mapVector.lengths[rowNum];
			int offset = (int) mapVector.offsets[rowNum];
			List<TypeDescription> mapTypes = colType.getChildren();
			TypeDescription keyType = mapTypes.get(0);
			TypeDescription valueType = mapTypes.get(1);
			ColumnVector keyChild = mapVector.keys;
			ColumnVector valueChild = mapVector.values;
			List<Object> keyList = readMapVector(keyChild, keyType, offset, mapSize, rowNum);
			List<Object> valueList = readMapVector(valueChild, valueType, offset, mapSize, rowNum);
			assert (keyList.size() == valueList.size());
			for (int i = 0; i < keyList.size(); i++) {
				objMap.put(keyList.get(i), valueList.get(i));
			}
		} else {
			throw new RuntimeException("readMapVal: unsupported key or value types");
		}
		return objMap;
	}

	private static Object readUnionVal(ColumnVector colVec, TypeDescription colType, int rowNum) {
		Pair<TypeDescription, Object> columnValuePair;
		UnionColumnVector unionVector = (UnionColumnVector) colVec;
		int tagVal = unionVector.tags[rowNum];
		List<TypeDescription> unionFieldTypes = colType.getChildren();
		if (tagVal < unionFieldTypes.size()) {
			TypeDescription fieldType = unionFieldTypes.get(tagVal);
			if (tagVal < unionVector.fields.length) {
				ColumnVector fieldVector = unionVector.fields[tagVal];
				int colRow = fieldVector.isRepeating ? 0 : rowNum;
				Object unionValue = readColumn(fieldVector, fieldType, colRow);
				columnValuePair = new ImmutablePair<>(fieldType, unionValue);
			} else {
				throw new RuntimeException("readUnionVal: union tag value out of range for union column vectors");
			}
		} else {
			throw new RuntimeException("readUnionVal: union tag value out of range for union types");
		}
		return columnValuePair;
	}

	private static Object readStructVal(ColumnVector colVec, TypeDescription colType, int rowNum) {
		Object structObj = null;
		if (!colVec.isNull[rowNum]) {
			List<Object> fieldValList = new ArrayList<>();
			StructColumnVector structVector = (StructColumnVector) colVec;
			ColumnVector[] fieldVec = structVector.fields;
			List<TypeDescription> fieldTypes = colType.getChildren();
			assert (fieldVec.length == fieldTypes.size());
			for (int i = 0; i < fieldVec.length; i++) {
				int colRow = fieldVec[i].isRepeating ? 0 : rowNum;
				Object fieldObj = readColumn(fieldVec[i], fieldTypes.get(i), colRow);
				fieldValList.add(fieldObj);
			}
			structObj = fieldValList;
		}
		return structObj;
	}

	private static Object readTimestampVal(ColumnVector colVec, TypeDescription colType, int rowNum) {
		Object timestampVal = null;
		if (!colVec.isNull[rowNum]) {
			TimestampColumnVector timestampVec = (TimestampColumnVector) colVec;
			int nanos = timestampVec.nanos[rowNum];
			long millisec = timestampVec.time[rowNum];
			Timestamp timestamp = new Timestamp(millisec);
			timestamp.setNanos(nanos);
			timestampVal = timestamp;
			if (colType.getCategory() == TypeDescription.Category.DATE) {
				timestampVal = new Date(timestamp.getTime());
			}
		}
		return timestampVal;
	}

	private static Object readDecimalVal(ColumnVector colVec, int rowNum) {
		Object decimalObj = null;
		if (!colVec.isNull[rowNum]) {
			DecimalColumnVector decimalVec = (DecimalColumnVector) colVec;
			decimalObj = decimalVec.vector[rowNum].getHiveDecimal().bigDecimalValue().setScale(decimalVec.scale);
		}
		return decimalObj;
	}

	/**
	 * Read a Long or Boolean value
	 * 
	 * @param colVec  the column vector
	 * @param colType the type of the column
	 * @param rowNum  the ORC file row number.
	 * @return a Boolean or Long object
	 */
	private static Object readLongVal(ColumnVector colVec, TypeDescription colType, int rowNum) {
		Object colObj = null;
		if (!colVec.isNull[rowNum]) {
			LongColumnVector longVec = (LongColumnVector) colVec;
			Long longVal = longVec.vector[rowNum];
			colObj = longVal;
			if (colType.getCategory() == TypeDescription.Category.INT) {
				colObj = longVal.intValue();
			} else if (colType.getCategory() == TypeDescription.Category.BOOLEAN) {
				colObj = longVal == 1 ? Boolean.TRUE : Boolean.FALSE;
			} else if (colType.getCategory() == TypeDescription.Category.DATE) {
				colObj = new Date(longVal * 86400000);
			} else if (colType.getCategory() == TypeDescription.Category.BYTE) {
				colObj = longVal.byteValue();
			} else if (colType.getCategory() == TypeDescription.Category.SHORT) {
				colObj = longVal.shortValue();
			}
		}
		return colObj;
	}

	/**
	 * Read a Double or Float value
	 * 
	 * @param colVec  the column vector
	 * @param colType the type of the column
	 * @param rowNum  the ORC file row number.
	 * @return a Double or Float object
	 */
	private static Object readDoubleVal(ColumnVector colVec, TypeDescription colType, int rowNum) {
		Object colObj = null;
		if (!colVec.isNull[rowNum]) {
			DoubleColumnVector longVec = (DoubleColumnVector) colVec;
			Double doubleVal = longVec.vector[rowNum];
			colObj = doubleVal;
			if (colType.getCategory() == TypeDescription.Category.FLOAT) {
				colObj = doubleVal.floatValue();
			}
		}
		return colObj;
	}

	private static Object readBytesVal(ColumnVector colVec, TypeDescription colType, int rowNum) {
		Object bytesObj = null;
		if (!colVec.isNull[rowNum]) {
			BytesColumnVector bytesVector = (BytesColumnVector) colVec;
			byte[] columnBytes = bytesVector.vector[rowNum];
			int vecLen = bytesVector.length[rowNum];
			int vecStart = bytesVector.start[rowNum];
			byte[] vecCopy = Arrays.copyOfRange(columnBytes, vecStart, vecStart + vecLen);
			if (colType.getCategory() == TypeDescription.Category.STRING ||colType.getCategory() == TypeDescription.Category.VARCHAR) {
				bytesObj = new String(vecCopy);
			} else if (colType.getCategory() == TypeDescription.Category.CHAR) {
				String charStr = new String(vecCopy);
				bytesObj = charStr;
			} else {
				bytesObj = vecCopy;
			}
		}
		return bytesObj;
	}
}
