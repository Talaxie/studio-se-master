package org.talend.orc;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.hive.ql.exec.vector.ColumnVector;
import org.apache.hadoop.hive.ql.exec.vector.VectorizedRowBatch;
import org.apache.orc.CompressionKind;
import org.apache.orc.OrcFile;
import org.apache.orc.OrcFile.WriterOptions;
import org.apache.orc.Reader;
import org.apache.orc.RecordReader;
import org.apache.orc.TypeDescription;
import org.apache.orc.Writer;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ORCUtilsTest {

	private static File localFolder;

	@BeforeAll
	static void setup() throws IOException {
		localFolder = createTempDirectory();
	}

	@AfterAll
	static void dispose() {
		localFolder.delete();
	}

	/**
	 * Test that an exception is thrown if a Date type is written.
	 *
	 * At the time this test was written, the ORC writer did not correctly write the
	 * date epoch value to the ORC file. The value was written as a 32-bit int,
	 * instead of a 64 bit long. As a result, the date is incorrect. A timestamp
	 * value should be used instead.
	 * 
	 * @param tempDirPath
	 * @throws ORCFileException
	 * @throws InterruptedException
	 */
	@Test
	void testAllDataTypes() throws Throwable {
		String filePath = localFolder.getAbsolutePath() + "/testAllTypes.orc";
		writeData(filePath);

		readAndCheckData(filePath);

	}

	@Test
	void testDetectType() {
		Assertions.assertEquals(TypeDescription.Category.BOOLEAN, ORCWriteUtils.detectType(true).getCategory());
		Assertions.assertEquals(TypeDescription.Category.SHORT,
				ORCWriteUtils.detectType(Short.valueOf("1")).getCategory());
		Assertions.assertEquals(TypeDescription.Category.INT, ORCWriteUtils.detectType(1).getCategory());
		Assertions.assertEquals(TypeDescription.Category.LONG, ORCWriteUtils.detectType(1L).getCategory());
		Assertions.assertEquals(TypeDescription.Category.TIMESTAMP,
				ORCWriteUtils.detectType(new Timestamp(System.currentTimeMillis())).getCategory());
		Assertions.assertEquals(TypeDescription.Category.DECIMAL,
				ORCWriteUtils.detectType(new BigDecimal("1")).getCategory());
		Assertions.assertEquals(TypeDescription.Category.BYTE,
				ORCWriteUtils.detectType(Byte.valueOf("1")).getCategory());
		Assertions.assertEquals(TypeDescription.Category.FLOAT, ORCWriteUtils.detectType(1.0f).getCategory());
		Assertions.assertEquals(TypeDescription.Category.DOUBLE, ORCWriteUtils.detectType(1.0).getCategory());
		Assertions.assertEquals(TypeDescription.Category.STRING, ORCWriteUtils.detectType("test").getCategory());
		Assertions.assertEquals(TypeDescription.Category.DATE, ORCWriteUtils.detectType(new Date()).getCategory());
		Assertions.assertEquals(TypeDescription.Category.BINARY,
				ORCWriteUtils.detectType("test".getBytes()).getCategory());
	}

	private void writeData(String filePath) throws Throwable {
		TypeDescription schema = TypeDescription.createStruct();
		schema.addField("t_boolean", TypeDescription.createBoolean());
		schema.addField("t_byte", TypeDescription.createByte());
		schema.addField("t_bytes", TypeDescription.createBinary());
		schema.addField("t_char", TypeDescription.createChar());
		schema.addField("t_date", TypeDescription.createDate());
		schema.addField("t_ts", TypeDescription.createTimestamp());
		schema.addField("t_double", TypeDescription.createDouble());
		schema.addField("t_float", TypeDescription.createFloat());
		schema.addField("t_decimal", TypeDescription.createDecimal().withPrecision(18).withScale(5));
		schema.addField("t_int", TypeDescription.createInt());
		schema.addField("t_long", TypeDescription.createLong());
		schema.addField("t_short", TypeDescription.createShort());
		schema.addField("t_string", TypeDescription.createString());
		schema.addField("t_list", TypeDescription.createList(TypeDescription.createString()));

		WriterOptions writerOption = OrcFile.writerOptions(new Configuration()) //
				.overwrite(true) //
				.compress(CompressionKind.valueOf("ZLIB")).setSchema(schema); //

		Writer writer = OrcFile.createWriter(new Path(filePath), writerOption);
		VectorizedRowBatch batch = schema.createRowBatch(100);
		for (int r = 0; r < 1000; ++r) {
			int row = batch.size++;
			for (int i = 0; i < batch.cols.length; i++) {
				ColumnVector vector = batch.cols[i];
				TypeDescription type = schema.getChildren().get(i);
				switch (vector.type) {
				case BYTES:
					if (type.getCategory() == TypeDescription.Category.BINARY) {
						ORCWriteUtils.setColumn(("this is byte[] " + r).getBytes(), null, "t_bytes", vector, row);
					} else if (type.getCategory() == TypeDescription.Category.STRING) {
						if(r==666) {
							ORCWriteUtils.setColumn(null, null, "t_string", vector, row);
						}else {
							ORCWriteUtils.setColumn(("this is String " + r), null, "t_string", vector, row);
						}
					} else if (type.getCategory() == TypeDescription.Category.CHAR) {
						ORCWriteUtils.setColumn("talend".charAt(r % 6), null, "t_char", vector, row);
					} else {
						throw new RuntimeException(type.getCategory() + " is not supported as BYTES vector");
					}
					break;
				case DECIMAL:
					ORCWriteUtils.setColumn(new BigDecimal(r + ".12345"), null, "t_decimal", vector, row);
					break;
				case DOUBLE:
					if (type.getCategory() == TypeDescription.Category.DOUBLE) {
						ORCWriteUtils.setColumn(r + 0.123, null, "t_double", vector, row);
					} else if (type.getCategory() == TypeDescription.Category.FLOAT) {
						ORCWriteUtils.setColumn(r + 0.456f, null, "t_float", vector, row);
					} else {
						throw new RuntimeException(type.getCategory() + " is not supported as DOUBLE vector");
					}
					break;
				case LONG:
					if (type.getCategory() == TypeDescription.Category.BOOLEAN) {
						ORCWriteUtils.setColumn(true, null, "t_boolean", vector, row);
					} else if (type.getCategory() == TypeDescription.Category.BYTE) {
						ORCWriteUtils.setColumn((byte)(r % 128), null, "t_byte", vector, row);
					} else if (type.getCategory() == TypeDescription.Category.INT) {
						ORCWriteUtils.setColumn(r, null, "t_int", vector, row);
					} else if (type.getCategory() == TypeDescription.Category.SHORT) {
						ORCWriteUtils.setColumn((short)(r % 256), null, "t_short", vector, row);
					} else if (type.getCategory() == TypeDescription.Category.LONG) {
						ORCWriteUtils.setColumn(r * 1000L, null, "t_long", vector, row);
					} else if (type.getCategory() == TypeDescription.Category.DATE) {
						Date d = new Date(1633687854031L);
						ORCWriteUtils.setColumn(d, null, "t_date", vector, row);
					} else {
						throw new RuntimeException(type.getCategory() + " is not supported as LONG vector");
					}
					break;
				case TIMESTAMP:
					Timestamp ts = new java.sql.Timestamp(1633687854031L);
					ts.setNanos(123456789);
					ORCWriteUtils.setColumn(ts, null, "t_ts", vector, row);
					break;
				case LIST:
					List<String> values = new ArrayList<>();
					values.add("v1_" + r);
					values.add("v2_" + r);
					values.add("v3_" + r);
					ORCWriteUtils.setColumn(values, ORCWriteUtils.detectType("v1_" + r), "t_ list", vector, row);
					break;
				default:
					throw new RuntimeException(vector.type + " is not supported");

				}
			}
			if (batch.size == batch.getMaxSize()) {
				writer.addRowBatch(batch);
				batch.reset();
			}
		}
		if (batch.size != 0) {
			writer.addRowBatch(batch);
		}

		writer.close();
	}

	private void readAndCheckData(String filePath) throws Throwable {

		Reader reader = OrcFile.createReader(new Path(filePath), OrcFile.readerOptions(new Configuration()));
		TypeDescription schema = reader.getSchema();
		VectorizedRowBatch batch = schema.createRowBatch();
		RecordReader rowIterator = reader.rows(reader.options().schema(schema));
		int nuberLine = 0;
		List<Object> nb_500 = new ArrayList<>();
		List<Object> nb_666 = new ArrayList<>();
		while (rowIterator.nextBatch(batch)) {
			ColumnVector[] colVectors = batch.cols;
			for (int row = 0; row < batch.size; ++row) {
				nuberLine++;
				for (String columnName : schema.getFieldNames()) {
					ColumnVector colVector = colVectors[schema.getFieldNames().indexOf(columnName)];
					int colRow = colVector.isRepeating ? 0 : row;
					Object value = ORCReadUtils.readColumnByName(batch, columnName, schema, colRow);
					if (nuberLine == 500) {
						nb_500.add(value);
					}else if (nuberLine == 667) {
						nb_666.add(value);
					}
				}
			}
		}
		Assertions.assertEquals(true, nb_500.get(0));
		Assertions.assertEquals(Byte.valueOf("115"), nb_500.get(1));
		Assertions.assertEquals("this is byte[] 499", new String((byte[]) nb_500.get(2)));
		Assertions.assertEquals("a", nb_500.get(3));
		Date t_date = (Date) nb_500.get(4);
		Assertions.assertEquals((1633687854000L/86400000), t_date.getTime()/86400000);
		Timestamp t_ts = (Timestamp) nb_500.get(5);
		Assertions.assertEquals(1633687854123L, t_ts.getTime());
		Assertions.assertEquals(123456789, t_ts.getNanos());
		Assertions.assertEquals(499.123, nb_500.get(6));
		Assertions.assertEquals(499.456f, (((float) nb_500.get(7)) * 1000) / 1000f);
		Assertions.assertEquals(new BigDecimal("499.12345"), nb_500.get(8));
		Assertions.assertEquals(499, nb_500.get(9));
		Assertions.assertEquals(499000L, nb_500.get(10));
		Assertions.assertEquals(Short.valueOf("243"), nb_500.get(11));
		Assertions.assertEquals("this is String 499", nb_500.get(12));
		Assertions.assertArrayEquals(Arrays.asList("v1_499", "v2_499", "v3_499").toArray(),
				((List<Object>) nb_500.get(13)).toArray());
		
		//NB_LINE 666
		Assertions.assertNull( nb_666.get(12));

		rowIterator.close();

	}

	public static File createTempDirectory() throws IOException {
		final File temp;

		temp = File.createTempFile("temp", Long.toString(System.nanoTime()));
		if (!temp.delete()) {
			throw new IOException("Could not delete temp file: " + temp.getAbsolutePath());
		}

		if (!temp.mkdir()) {
			throw new IOException("Could not create temp directory: " + temp.getAbsolutePath());
		}

		return temp;
	}

}
