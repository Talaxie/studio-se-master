package org.talend.orc;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.apache.commons.lang3.tuple.Pair;
import org.apache.hadoop.hive.common.type.HiveDecimal;
import org.apache.hadoop.hive.ql.exec.vector.BytesColumnVector;
import org.apache.hadoop.hive.ql.exec.vector.ColumnVector;
import org.apache.hadoop.hive.ql.exec.vector.DateColumnVector;
import org.apache.hadoop.hive.ql.exec.vector.DecimalColumnVector;
import org.apache.hadoop.hive.ql.exec.vector.DoubleColumnVector;
import org.apache.hadoop.hive.ql.exec.vector.ListColumnVector;
import org.apache.hadoop.hive.ql.exec.vector.LongColumnVector;
import org.apache.hadoop.hive.ql.exec.vector.MapColumnVector;
import org.apache.hadoop.hive.ql.exec.vector.MultiValuedColumnVector;
import org.apache.hadoop.hive.ql.exec.vector.StructColumnVector;
import org.apache.hadoop.hive.ql.exec.vector.TimestampColumnVector;
import org.apache.hadoop.hive.ql.exec.vector.UnionColumnVector;
import org.apache.hadoop.hive.ql.exec.vector.VectorizedRowBatch;
import org.apache.hadoop.hive.serde2.io.HiveDecimalWritable;
import org.apache.orc.TypeDescription;

public class ORCWriteUtils {
	private static final Predicate<Object> isInteger = Integer.class::isInstance;
	private static final Predicate<Object> isLong = Long.class::isInstance;
	private static final Predicate<Object> isDouble = Double.class::isInstance;
	private static final Predicate<Object> isString = String.class::isInstance;
	private static final Predicate<Object> isBigDecimal = BigDecimal.class::isInstance;
	private static final Predicate<Object> isDate = Date.class::isInstance;

	public static void setColumnByName(VectorizedRowBatch batch, String columnName, TypeDescription schema,
			Object colVal, int rowNum) {
		List<String> allColumnNames = schema.getFieldNames();
		int colIndex = allColumnNames.indexOf(columnName);
		if (colIndex < 0 || colIndex > batch.cols.length - 1) {
			return;
		} else {
			org.apache.hadoop.hive.ql.exec.vector.ColumnVector colVector = batch.cols[colIndex];
			TypeDescription fieldType = schema.getChildren().get(colIndex);
			setColumn(colVal, fieldType, columnName, colVector, rowNum);
		}

	}

	/**
	 * Add a column value that is a String or a byte[] array.
	 *
	 * @param colVal         the column value object
	 * @param fieldName      the name of the field (for error reporting)
	 * @param bytesColVector the BytesColumnVector that the byte array will be added
	 *                       to.
	 * @param rowNum         the ORC file row number
	 */
	private static void setByteColumnVector(Object colVal, String fieldName, BytesColumnVector bytesColVector,
			int rowNum) {
		if (colVal instanceof byte[] || colVal instanceof String || colVal instanceof Character) {
			byte[] byteVec;
			if (colVal instanceof String) {
				String strVal = (String) colVal;
				byteVec = strVal.getBytes(StandardCharsets.UTF_8);
			} else if (colVal instanceof Character) {
				String strVal = String.valueOf((char) colVal);
				byteVec = strVal.getBytes(StandardCharsets.UTF_8);
			} else {
				byteVec = (byte[]) colVal;
			}
			bytesColVector.setRef(rowNum, byteVec, 0, byteVec.length);
		} else {
			throw new RuntimeException(orcExceptionMsg("byte[] or String type expected for field ", fieldName, rowNum));
		}
	}

	private static void setDecimalVector(Object colVal, String fieldName, DecimalColumnVector decimalColVector,
			int rowNum) {
		if (colVal instanceof BigDecimal) {
			BigDecimal bigDecimal = (BigDecimal) colVal;
			decimalColVector.precision = (short) bigDecimal.precision();
			decimalColVector.scale = (short) bigDecimal.scale();
			HiveDecimal hiveDecimal = HiveDecimal.create(bigDecimal);
			HiveDecimalWritable writeableDecimal = new HiveDecimalWritable(hiveDecimal);
			decimalColVector.vector[rowNum] = writeableDecimal;
		} else {
			throw new RuntimeException(orcExceptionMsg("BigDecimal type expected for field ", fieldName, rowNum));
		}
	}

	private static void setDoubleVector(Object colVal, String fieldName, DoubleColumnVector doubleVector, int rowNum) {
		if (colVal instanceof Double) {
			doubleVector.vector[rowNum] = (Double) colVal;
		} else if (colVal instanceof Float) {
			Float fltVal = (Float) colVal;
			doubleVector.vector[rowNum] = fltVal.doubleValue();
		} else if (colVal instanceof BigDecimal) {
			doubleVector.vector[rowNum] = ((BigDecimal) colVal).doubleValue();
		} else {
			throw new RuntimeException(orcExceptionMsg("Double/Float/BigDecimal type expected for field ", fieldName, rowNum));
		}
	}

	/**
	 * Initialize a LongColumnVector value.
	 * 
	 * @param colVal     an object of type Boolean, Integer, Long or BigInteger.
	 * @param fieldName  the field name in the schema
	 * @param longVector the LongColumnVector
	 * @param rowNum     the row number
	 */
	private static void setLongColumnVector(Object colVal, String fieldName, LongColumnVector longVector, int rowNum) {
		if (colVal instanceof Boolean) {
			Boolean bool = (Boolean) colVal;
			longVector.vector[rowNum] = (bool.equals(Boolean.TRUE)) ? Long.valueOf(1) : Long.valueOf(0);
		} else if (colVal instanceof Byte) {
			longVector.vector[rowNum] = (Byte) colVal;
		} else if (colVal instanceof Short) {
			longVector.vector[rowNum] = (Short) colVal;
		} else if (colVal instanceof Integer) {
			longVector.vector[rowNum] = (Integer) colVal;
		} else if (colVal instanceof Long) {
			longVector.vector[rowNum] = (Long) colVal;
		} else if (colVal instanceof BigInteger) {
			BigInteger bigInt = (BigInteger) colVal;
			longVector.vector[rowNum] = bigInt.longValue();
		} else {
			throw new RuntimeException(orcExceptionMsg("Long or Integer type expected for field ", fieldName, rowNum));
		}
	}

	private static void setDateColumnVector(Object colVal, String fieldName, DateColumnVector dateVector, int rowNum) {
		if (colVal instanceof Date) {
			Date dateVal = (Date) colVal;
			Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
			cal.setTime(dateVal);
			long epochDay = LocalDate.of(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH)+1, cal.get(Calendar.DAY_OF_MONTH)).toEpochDay();
			dateVector.vector[rowNum] = epochDay;
		} else {
			throw new RuntimeException(orcExceptionMsg("Date type expected for field ", fieldName, rowNum));
		}
	}

	private static void setTimestampVector(Object colVal, String fieldName, TimestampColumnVector timestampVector,
			int rowNum) {
		if (colVal instanceof Timestamp) {
			timestampVector.set(rowNum, (Timestamp) colVal);
		} else if (colVal instanceof Date) {
			Date date = (Date) colVal;
			Timestamp ts = new Timestamp(date.getTime());

			timestampVector.set(rowNum, ts);
		} else {
			throw new RuntimeException(
					orcExceptionMsg("Date or Timestamp type expected for field ", fieldName, rowNum));
		}
	}

	/**
	 * <p>
	 * A union column can contain column vectors of more than one type. In the
	 * TypeDescription createUnion() is called to create a TypeDescription for a
	 * union column. The union values are added by calling the addUnionChild()
	 * method on this TypeDescription object.
	 * </p>
	 * <p>
	 * The class fields in the UnionColumnVector are shown below:
	 * </p>
	 * 
	 * <pre>
	 *     public class UnionColumnVector extends ColumnVector {
	 *        public int[] tags;
	 *        public ColumnVector[] fields;
	 * </pre>
	 * <p>
	 * A tag value (
	 * 
	 * <pre>
	 * tags[rowNum]
	 * </pre>
	 * 
	 * ) is associated with each field value (
	 * 
	 * <pre>
	 * fields[rowNum])
	 * </pre>
	 * 
	 * . The tag value serves as an index for the field type. For example, if there
	 * are three field types defined:
	 * <ol>
	 * <li>Long</li>
	 * <li>Double</li>
	 * <li>String</li>
	 * </ol>
	 * The tag will have a value in the range of [0..2]
	 * </p>
	 * <p>
	 * The tag value is needed to initialize the ColumnVector since without the tag
	 * there is no way to know which union child should be initialized.
	 * </p>
	 *
	 * @param colVal      a Pair&lt;ColumnVector.Type, Object&gt; object with the
	 *                    union type and the object that will be used to initialize
	 *                    the union child ColumnVector.
	 * @param fieldName   The name of the union field
	 * @param unionVector The UnionColumnVector to be initialized
	 * @param rowNum      the ORC file row number.
	 */
	private static void setUnionColumnVector(Object colVal, TypeDescription unionTypeDesc, String fieldName,
			UnionColumnVector unionVector, int rowNum) {
		@SuppressWarnings("unchecked")
		Pair<TypeDescription, Object> unionValuePair = (Pair<TypeDescription, Object>) colVal;
		TypeDescription unionValType = unionValuePair.getLeft();
		List<TypeDescription> unionChildrenTypes = unionTypeDesc.getChildren();
		Object unionColVal = unionValuePair.getRight();
		boolean found = false;
		for (int i = 0; i < unionChildrenTypes.size(); i++) {
			if (unionChildrenTypes.get(i).getCategory() == unionValType.getCategory()) {
				unionVector.tags[rowNum] = i;
				ColumnVector unionFieldVec = unionVector.fields[i];
				setColumn(unionColVal, unionChildrenTypes.get(i), fieldName, unionFieldVec, rowNum);
				found = true;
				break;
			}
		}
		if (!found) {
			throw new RuntimeException("writeUnionColumnVector: Bad type enumeration "
					+ unionValType.getCategory().getName() + " passed for field " + fieldName);
		}
	}

	private static void setLongListVector(List<Object> longValList, LongColumnVector longVector, int offset,
			String fieldName) {
		for (int i = 0; i < longValList.size(); i++) {
			Object objVal = longValList.get(i);
			if (objVal != null) {
				if (objVal instanceof Integer) {
					longVector.vector[offset + i] = (Integer) objVal;
				} else if (objVal instanceof Long) {
					longVector.vector[offset + i] = (Long) objVal;
				} else {
					throw new RuntimeException("List<Integer> expected for field " + fieldName);
				}
			} else {
				longVector.isNull[offset + i] = true;
				longVector.noNulls = false;
			}
		}
	}

	private static void setLongList(List<Object> colValList, ListColumnVector listVector, String fieldName,
			int rowNum) {
		LongColumnVector longVector = (LongColumnVector) listVector.child;
		int offset = (int) listVector.offsets[rowNum];
		setLongListVector(colValList, longVector, offset, fieldName);
	}

	private static void setDoubleListVector(List<Object> doubleValList, DoubleColumnVector doubleVector, int offset,
			String fieldName) {
		for (int i = 0; i < doubleValList.size(); i++) {
			Object objVal = doubleValList.get(i);
			if (objVal != null) {
				if (objVal instanceof Double) {
					doubleVector.vector[offset + i] = (Double) objVal;
				} else if (objVal instanceof Float) {
					Float fltVal = (Float) objVal;
					doubleVector.vector[offset + i] = fltVal.doubleValue();
				} else {
					throw new RuntimeException("List<Double> expected for field " + fieldName);
				}
			} else {
				doubleVector.isNull[offset + i] = true;
				doubleVector.noNulls = false;
			}
		}
	}

	private static void setDoubleList(List<Object> doubleValList, ListColumnVector listVector, String fieldName,
			int rowNum) {
		DoubleColumnVector vecChild = (DoubleColumnVector) listVector.child;
		int offset = (int) listVector.offsets[rowNum];
		setDoubleListVector(doubleValList, vecChild, offset, fieldName);
	}

	private static void setTimestampListVector(List<Object> valueList, TimestampColumnVector timestampVector,
			int offset, String fieldName) {
		for (int i = 0; i < valueList.size(); i++) {
			Object objVal = valueList.get(i);
			if (objVal != null) {
				if (objVal instanceof Date) {
					Timestamp ts = (objVal instanceof Timestamp) ? (Timestamp) objVal
							: new Timestamp(((Date) objVal).getTime());
					timestampVector.time[offset + i] = ts.getTime();
					timestampVector.nanos[offset + i] = ts.getNanos();
				} else {
					throw new RuntimeException("List<Date> or List<Timestamp> expected for field " + fieldName);
				}
			} else {
				timestampVector.isNull[offset + i] = true;
				timestampVector.noNulls = false;
			}
		}
	}

	/**
	 * Initialize the vector values for a ListColumnVector of Date or Timestamp
	 * values.
	 *
	 * @param colValList a list of Timestamp or java.util.Date objects
	 * @param listVector A ListColumnVector with a child that will contain the
	 *                   vector values.
	 * @param fieldName  The field name in the schema for this ORC element
	 * @param rowNum     The ORC file row number
	 */
	private static void setTimestampList(List<Object> colValList, ListColumnVector listVector, String fieldName,
			int rowNum) {
		TimestampColumnVector timestampVector = (TimestampColumnVector) listVector.child;
		int offset = (int) listVector.offsets[rowNum];
		setTimestampListVector(colValList, timestampVector, offset, fieldName);
	}

	private static void setDecimalListVector(List<Object> decimalValList, DecimalColumnVector decimalVector, int offset,
			String fieldName) {
		for (int i = 0; i < decimalValList.size(); i++) {
			Object objVal = decimalValList.get(i);
			if (objVal != null) {
				if (objVal instanceof BigDecimal) {
					BigDecimal bigDecimal = (BigDecimal) objVal;
					decimalVector.precision = (short) bigDecimal.precision();
					decimalVector.scale = (short) bigDecimal.scale();
					HiveDecimal hiveDecimal = HiveDecimal.create(bigDecimal);
					HiveDecimalWritable writeableDecimal = new HiveDecimalWritable(hiveDecimal);
					decimalVector.vector[offset + i] = writeableDecimal;
				} else {
					throw new RuntimeException("BigDecimal value expected for field " + fieldName);
				}
			} else {
				decimalVector.isNull[offset + i] = true;
				decimalVector.noNulls = false;
			}
		}
	}

	/**
	 *
	 * @param colValList a list of BigDecimal values to initialize the
	 *                   ListColumnVector child
	 * @param listVector the ListColumnVector with the DecimalColumnVector child
	 * @param fieldName  the field name for the ListColumnVector/DecimalColumnVector
	 *                   column
	 * @param rowNum     the ORC file row number
	 */
	private static void setDecimalList(List<Object> colValList, ListColumnVector listVector, String fieldName,
			int rowNum) {
		DecimalColumnVector decimalVector = (DecimalColumnVector) listVector.child;
		int offset = (int) listVector.offsets[rowNum];
		setDecimalListVector(colValList, decimalVector, offset, fieldName);
	}

	private static void setBytesListVector(List<Object> valueList, BytesColumnVector bytesVector, int offset,
			String fieldName) {
		for (int i = 0; i < valueList.size(); i++) {
			Object objVal = valueList.get(i);
			if (objVal != null) {
				if (objVal instanceof byte[] || objVal instanceof String) {
					byte[] byteVec = (objVal instanceof byte[]) ? (byte[]) objVal
							: ((String) objVal).getBytes(StandardCharsets.UTF_8);
					bytesVector.vector[offset + i] = byteVec;
					bytesVector.length[offset + i] = byteVec.length;
				} else {
					throw new RuntimeException("String or byte[] value expected for field " + fieldName);
				}
			} else {
				bytesVector.isNull[offset + i] = true;
				bytesVector.length[offset + i] = 0;
				bytesVector.noNulls = false;
			}
		}
	}

	/**
	 * Initialize a ListColumnVector with a BytesColumnVector child with byte[]
	 * values.
	 *
	 * @param colValList a list of byte[] or String values
	 * @param listVector the parent ListColumnVector
	 * @param fieldName  the field name for the ORC column that contains the
	 *                   ListColumnVector
	 * @param rowNum     the ORC file row number
	 */
	private static void setBytesList(List<Object> colValList, ListColumnVector listVector, String fieldName,
			int rowNum) {
		BytesColumnVector bytesVector = (BytesColumnVector) listVector.child;
		int offset = (int) listVector.offsets[rowNum];
		setBytesListVector(colValList, bytesVector, offset, fieldName);
	}

	private static void setMultiValuedVectorParameters(MultiValuedColumnVector multiVector, int vecLength, int rowNum) {
		multiVector.lengths[rowNum] = vecLength;
		if (rowNum > 0) {
			multiVector.offsets[rowNum] = multiVector.lengths[rowNum - 1] + multiVector.offsets[rowNum - 1];
		}
	}

	private static void setListVectorParameters(ListColumnVector listVec, int maxBatchSize, int vecLength, int rowNum) {
		setMultiValuedVectorParameters(listVec, vecLength, rowNum);
		listVec.child.ensureSize(maxBatchSize * vecLength, true);
	}

	/**
	 * Initialize a ListColumnVector. The child of the vector is limited to the
	 * scalar types long, double, String (or byte[])), BigDecimal or Date (or
	 * Timestamp).
	 *
	 * @param colVal     a List&lt;Object&gt;
	 * @param typeDesc   the schema definition for this column
	 * @param fieldName  the column field name
	 * @param listVector the ListColumnVector parent of the vector type child
	 * @param rowNum     the ORC file row number.
	 */
	private static void setListColumnVector(Object colVal, TypeDescription typeDesc, String fieldName,
			ListColumnVector listVector, int rowNum) {
		if (colVal instanceof List) {
			@SuppressWarnings("unchecked")
			List<Object> objValList = (List<Object>) colVal;
			final int maxBatchSize = typeDesc.createRowBatch().getMaxSize();
			setListVectorParameters(listVector, maxBatchSize, objValList.size(), rowNum);
			ColumnVector.Type childType = listVector.child.type;
			switch (childType) {
			case LONG:
				setLongList(objValList, listVector, fieldName, rowNum);
				break;
			case DOUBLE:
				setDoubleList(objValList, listVector, fieldName, rowNum);
				break;
			case BYTES:
				setBytesList(objValList, listVector, fieldName, rowNum);
				break;
			case DECIMAL:
				setDecimalList(objValList, listVector, fieldName, rowNum);
				break;
			case TIMESTAMP:
				setTimestampList(objValList, listVector, fieldName, rowNum);
				break;
			default:
				throw new RuntimeException(childType.name() + " is not supported for ListColumnVector columns");
			}
		} else {
			throw new RuntimeException("List value expected for field " + fieldName);
		}
	}

	/**
	 * Test that all elements in an Object list are of a particular type
	 * 
	 * @param objList  the Object list that is tested
	 * @param typeTest a function that compares against a particular Object type
	 * @return true if all elements are of the test type, false if one or more
	 *         elements are not of that type.
	 */
	private static boolean isListType(List<Object> objList, Predicate<Object> typeTest) {
		return !objList.stream().map(typeTest::test).collect(Collectors.toList()).contains(false);
	}

	/**
	 * Initialize a ColumnVector with Long values.
	 *
	 * @param valueList a list of Long values
	 * @param colVector the LongColumnVector that will be initialized with the Long
	 *                  values
	 * @param offset    the offset[rownum] value for the array
	 * @param fieldName the field name for the Map column
	 */
	private static void setLongMapValues(List<Object> valueList, ColumnVector colVector, int offset, String fieldName) {
		if (isListType(valueList, isLong) || isListType(valueList, isInteger)) {
			LongColumnVector longVector = (LongColumnVector) colVector;
			setLongListVector(valueList, longVector, offset, fieldName);
		} else {
			throw new RuntimeException("For field " + fieldName + " Long values expected");
		}
	}

	/**
	 * Initialize a ColumnVector with Double values.
	 *
	 * @param valueList a list of Double values
	 * @param colVector the DoubleColumnVector that will be initialized with the
	 *                  Double values
	 * @param offset    the offset[rownum] value for the array
	 * @param fieldName the field name for the Map column
	 */
	private static void setDoubleMapValues(List<Object> valueList, ColumnVector colVector, int offset,
			String fieldName) {
		if (isListType(valueList, isDouble)) {
			DoubleColumnVector doubleVector = (DoubleColumnVector) colVector;
			setDoubleListVector(valueList, doubleVector, offset, fieldName);
		} else {
			throw new RuntimeException("For field " + fieldName + " Double values expected");
		}
	}

	/**
	 * Initialize a ColumnVector with String values.
	 *
	 * @param valueList a list of String values
	 * @param colVector the BytesColumnVector that will be initialized with the
	 *                  String values
	 * @param offset    the offset[rownum] value for the array
	 * @param fieldName the field name for the Map column
	 */
	private static void setStringMapValues(List<Object> valueList, ColumnVector colVector, int offset,
			String fieldName) {
		if (isListType(valueList, isString)) {
			BytesColumnVector doubleVector = (BytesColumnVector) colVector;
			setBytesListVector(valueList, doubleVector, offset, fieldName);
		} else {
			throw new RuntimeException("For field " + fieldName + " String values expected");
		}
	}

	/**
	 * Initialize a ColumnVector with BigDeciml values.
	 *
	 * @param valueList a list of BigDecimal
	 * @param colVector the DecimalColumnVector that will be initialized with the
	 *                  BigDecimal values
	 * @param offset    the offset[rownum] value for the array
	 * @param fieldName the field name for the Map column
	 */
	private static void setDecimalMapValues(List<Object> valueList, ColumnVector colVector, int offset,
			String fieldName) {
		if (isListType(valueList, isBigDecimal)) {
			DecimalColumnVector decimalVector = (DecimalColumnVector) colVector;
			setDecimalListVector(valueList, decimalVector, offset, fieldName);
		} else {
			throw new RuntimeException("For field " + fieldName + " BigDecimal values expected");
		}
	}

	/**
	 * Initialize a ColumnVector with timestamp values.
	 *
	 * @param valueList a list of Date (or Timestamp) objects
	 * @param colVector the TimestampColumnVector that will be initialized with the
	 *                  Timestamp values
	 * @param offset    the offset[rownum] value for the array
	 * @param fieldName the field name for the Map column
	 */
	private static void setTimestampMapValues(List<Object> valueList, ColumnVector colVector, int offset,
			String fieldName) {
		if (isListType(valueList, isDate)) {
			TimestampColumnVector timestampVector = (TimestampColumnVector) colVector;
			setTimestampListVector(valueList, timestampVector, offset, fieldName);
		} else {
			throw new RuntimeException("For field " + fieldName + " Date or Timestamp values expected");
		}
	}

	/**
	 * Set the MapColumn value array vector. The type for this vector is limited to
	 * long, double, bytes (String), Decimal and Timestamp.
	 *
	 * @param valueList a list of Objects to initialize the Map column value array.
	 * @param colVector the column array vector to be initialized with the map
	 *                  values.
	 * @param offset    the offset[rowNum] from the parent MapColumnVector
	 * @param fieldName the name of the field for the MapColumnVector.
	 */
	private static void setMapValueVector(List<Object> valueList, ColumnVector colVector, int offset,
			String fieldName) {
		switch (colVector.type) {
		case LONG:
			setLongMapValues(valueList, colVector, offset, fieldName);
			break;
		case DOUBLE:
			setDoubleMapValues(valueList, colVector, offset, fieldName);
			break;
		case BYTES:
			setStringMapValues(valueList, colVector, offset, fieldName);
			break;
		case DECIMAL:
			setDecimalMapValues(valueList, colVector, offset, fieldName);
			break;
		case TIMESTAMP:
			setTimestampMapValues(valueList, colVector, offset, fieldName);
			break;
		default:
			throw new RuntimeException(
					"For field " + fieldName + " values must be long, double, String, BigDecimal or Timestamp");
		}
	}

	/**
	 * <p>
	 * Initialize a MapColumnVector with Long key values.
	 * </p>
	 * 
	 * @param mapSet    a set of {key, value} pairs, where the key values are Long
	 *                  objects. The elements of this set will be used to initialize
	 *                  the key and value array column vectors that are children of
	 *                  the MapColumnVector.
	 * @param mapVector the MapColumnVector. This ColumnVector has children for the
	 *                  key and value arrays.
	 * @param fieldName the field name for the map column vector column.
	 * @param rowNum    the ORC file row number.
	 */
	private static void setLongKeyMap(Set<Map.Entry<Object, Object>> mapSet, MapColumnVector mapVector,
			String fieldName, int rowNum) {
		List<Object> keyValueList = mapSet.stream().map(Map.Entry::getKey).collect(Collectors.toList());
		if (isListType(keyValueList, isLong)) {
			LongColumnVector longVector = (LongColumnVector) mapVector.keys;
			int offset = (int) mapVector.offsets[rowNum];
			// set the key vector
			setLongListVector(keyValueList, longVector, offset, fieldName);
			// set the value vector
			ColumnVector valueVector = mapVector.values;
			List<Object> valueList = mapSet.stream().map(Map.Entry::getValue).collect(Collectors.toList());
			setMapValueVector(valueList, valueVector, offset, fieldName);
		} else {
			throw new RuntimeException("For field " + fieldName + " Long key type expected to match schema");
		}
	}

	/**
	 * <p>
	 * Initialize a MapColumnVector with Double key values.
	 * </p>
	 * 
	 * @param mapSet    a set of {key, value} pairs, where the key values are Double
	 *                  objects. The elements of this set will be used to initialize
	 *                  the key and value array column vectors that are children of
	 *                  the MapColumnVector.
	 * @param mapVector the MapColumnVector. This ColumnVector has children for the
	 *                  key and value arrays.
	 * @param fieldName the field name for the map column vector column.
	 * @param rowNum    the ORC file row number.
	 */
	private static void setDoubleKeyMap(Set<Map.Entry<Object, Object>> mapSet, MapColumnVector mapVector,
			String fieldName, int rowNum) {
		List<Object> keyValueList = mapSet.stream().map(Map.Entry::getKey).collect(Collectors.toList());
		if (isListType(keyValueList, isDouble)) {
			DoubleColumnVector doubleVector = (DoubleColumnVector) mapVector.keys;
			int offset = (int) mapVector.offsets[rowNum];
			// set the key vector
			setDoubleListVector(keyValueList, doubleVector, offset, fieldName);
			// set the value vector
			ColumnVector valueVector = mapVector.values;
			List<Object> valueList = mapSet.stream().map(Map.Entry::getValue).collect(Collectors.toList());
			setMapValueVector(valueList, valueVector, offset, fieldName);
		} else {
			throw new RuntimeException("For field " + fieldName + " Long key type expected to match schema");
		}
	}

	/**
	 * <p>
	 * Initialize a MapColumnVector with String key values.
	 * </p>
	 * 
	 * @param mapSet    a set of {key, value} pairs, where the key values are String
	 *                  objects. The elements of this set will be used to initialize
	 *                  the key and value array column vectors that are children of
	 *                  the MapColumnVector.
	 * @param mapVector the MapColumnVector. This ColumnVector has children for the
	 *                  key and value arrays.
	 * @param fieldName the field name for the map column vector column.
	 * @param rowNum    the ORC file row number.
	 */
	private static void setStringKeyMap(Set<Map.Entry<Object, Object>> mapSet, MapColumnVector mapVector,
			String fieldName, int rowNum) {
		List<Object> keyValueList = mapSet.stream().map(Map.Entry::getKey).collect(Collectors.toList());
		if (isListType(keyValueList, isString)) {
			BytesColumnVector byteVector = (BytesColumnVector) mapVector.keys;
			int offset = (int) mapVector.offsets[rowNum];
			// set the key array vector
			setBytesListVector(keyValueList, byteVector, offset, fieldName);
			// set the value array vector
			ColumnVector valueVector = mapVector.values;
			List<Object> valueList = mapSet.stream().map(Map.Entry::getValue).collect(Collectors.toList());
			setMapValueVector(valueList, valueVector, offset, fieldName);
		} else {
			throw new RuntimeException("For field " + fieldName + " Long key type expected to match schema");
		}
	}

	private static void setMapVectorParameters(MapColumnVector mapVec, int maxBatchSize, int vecLength, int rowNum) {
		setMultiValuedVectorParameters(mapVec, vecLength, rowNum);
		mapVec.keys.ensureSize(maxBatchSize + vecLength, true);
		mapVec.values.ensureSize(maxBatchSize + vecLength, true);
	}

	/**
	 * <p>
	 * Set the Map key and value elements for a MapColumnVector
	 * </p>
	 * <p>
	 * A MapColumnVector has a single ColumnVector type for each of the map key and
	 * map values. For example, the ColumnVector for the key values could be a
	 * BytesColumnVector (a set of String keys). The values could be a
	 * LongColumnVector.
	 * </p>
	 * <p>
	 * In the documentation there is no restriction given for the map key type. This
	 * code limits the key types to scalar values: string, long, double.
	 * </p>
	 * </p>
	 * <p>
	 * The documentation does not limit the map value types. This code limites the
	 * map values to the same types that are supported for ListColumnVectors: long,
	 * double, bytes (String), Decimal and Timestamp.
	 * </p>
	 *
	 * @param colVal    a HashMap object
	 * @param typeDesc  the schema description for the MapColumnVector column
	 * @param fieldName the field name of the MapColumnVector column
	 * @param mapVector The parent MapColumnVector
	 * @param rowNum    the ORC file column number.
	 */
	private static void setMapColumnVector(Object colVal, TypeDescription typeDesc, String fieldName,
			MapColumnVector mapVector, int rowNum) {
		if (colVal == null) {
			mapVector.isNull[rowNum] = true;
			mapVector.noNulls = false;
		} else {
			if (colVal instanceof HashMap) {
				@SuppressWarnings("unchecked")
				Map<Object, Object> rawMap = (HashMap<Object, Object>) colVal;
				int mapLen = rawMap.size();
				final int maxBatchSize = typeDesc.createRowBatch().getMaxSize();
				setMapVectorParameters(mapVector, maxBatchSize, mapLen, rowNum);
				if (ORCCommonUtils.checkMapColumnVectorTypes(mapVector)) {
					Set<Map.Entry<Object, Object>> mapSet = rawMap.entrySet();
					switch (mapVector.keys.type) {
					case LONG:
						setLongKeyMap(mapSet, mapVector, fieldName, rowNum);
						break;
					case DOUBLE:
						setDoubleKeyMap(mapSet, mapVector, fieldName, rowNum);
						break;
					case BYTES:
						setStringKeyMap(mapSet, mapVector, fieldName, rowNum);
						break;
					default: {
						break;
						/* This block left intentionally empty */
					}
					}
				} else {
					throw new RuntimeException(
							"For field " + fieldName + " key types are limited to string, long and double. "
									+ "value types are limited to long, double, String, decimal and timestamp");
				}
			}
		}
	}

	/**
	 * Set a column value in an ORC a row that will be written to the ORC file.
	 *
	 * @param colVal    an Object containing the values to be written to the column
	 * @param typeDesc  the TypeDescription from the schema that defines the column
	 * @param fieldName the column field name
	 * @param vector    the ColumnVector that will be initialized with the values in
	 *                  the colVal argument.
	 * @param rowNum    the ORC file row number.
	 */
	public static void setColumn(Object colVal, TypeDescription typeDesc, String fieldName, ColumnVector vector,
			int rowNum) {
		if (colVal == null) {
			vector.isNull[rowNum] = true;
			vector.noNulls = false;
		} else {
			switch (vector.type) {
			case LONG: {
				if (vector instanceof DateColumnVector) {
					DateColumnVector dateVector = (DateColumnVector) vector;
					setDateColumnVector(colVal, fieldName, dateVector, rowNum);
				} else {
					LongColumnVector longVector = (LongColumnVector) vector;
					setLongColumnVector(colVal, fieldName, longVector, rowNum);
				}
				break;
			}
			case DOUBLE: {
				DoubleColumnVector doubleVector = (DoubleColumnVector) vector;
				setDoubleVector(colVal, fieldName, doubleVector, rowNum);
				break;
			}
			case BYTES: {
				BytesColumnVector bytesColVector = (BytesColumnVector) vector;
				setByteColumnVector(colVal, fieldName, bytesColVector, rowNum);
				break;
			}
			case DECIMAL: {
				DecimalColumnVector decimalVector = (DecimalColumnVector) vector;
				setDecimalVector(colVal, fieldName, decimalVector, rowNum);
				break;
			}
			case DECIMAL_64:
				throw new RuntimeException("Field: " + fieldName + ", Decimal64ColumnVector is not supported");
			case TIMESTAMP: {
				TimestampColumnVector timestampVector = (TimestampColumnVector) vector;
				setTimestampVector(colVal, fieldName, timestampVector, rowNum);
				break;
			}
			case INTERVAL_DAY_TIME:
				throw new RuntimeException("Field: " + fieldName + ", HiveIntervalDayTime is not supported");
			case STRUCT: {
				StructColumnVector structVector = (StructColumnVector) vector;
//				setStructColumnVector(colVal, typeDesc, fieldName, structVector, rowNum);
				break;
			}
			case LIST: {
				ListColumnVector listVector = (ListColumnVector) vector;
				setListColumnVector(colVal, typeDesc, fieldName, listVector, rowNum);
				break;
			}
			case MAP: {
				MapColumnVector mapVector = (MapColumnVector) vector;
				setMapColumnVector(colVal, typeDesc, fieldName, mapVector, rowNum);
				break;
			}
			case UNION: {
				UnionColumnVector unionVector = (UnionColumnVector) vector;
				setUnionColumnVector(colVal, typeDesc, fieldName, unionVector, rowNum);
				break;
			}
			default:
				throw new RuntimeException("setColumn: Internal error: unexpected ColumnVector subtype");
			} // switch
		} // else
	} // setColumn

	private static String orcExceptionMsg(String prefixMsg, String fieldName, int rowNum) {
		return prefixMsg + fieldName + " in row " + rowNum;
	}

	public static TypeDescription detectType(Object value) {
		TypeDescription type = null;
		if (value != null) {
			if (value instanceof Boolean) {
				type = TypeDescription.createBoolean();
			} else if (value instanceof Short) {
				type = TypeDescription.createShort();
			} else if (value instanceof Integer) {
				type = TypeDescription.createInt();
			} else if (value instanceof Long) {
				type = TypeDescription.createLong();
			} else if (value instanceof Timestamp) {
				type = TypeDescription.createTimestamp();
			} else if (value instanceof BigDecimal) {
				type = TypeDescription.createDecimal();
			} else if (value instanceof Byte) {
				type = TypeDescription.createByte();
			} else if (value instanceof Float) {
				type = TypeDescription.createFloat();
			} else if (value instanceof Double) {
				type = TypeDescription.createDouble();
			} else if (value instanceof String) {
				type = TypeDescription.createString();
			} else if (value instanceof Date) {
				type = TypeDescription.createDate();
			} else if (value instanceof byte[]) {
				type = TypeDescription.createBinary();
			} else {
				throw new RuntimeException(
						value.getClass().getName() + " is not supported for ListColumnVector columns");
			}
		} else {
			type = TypeDescription.createString();
		}

		return type;
	}
}
