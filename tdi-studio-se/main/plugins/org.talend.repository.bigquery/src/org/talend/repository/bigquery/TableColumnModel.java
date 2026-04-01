package org.talend.repository.bigquery;

public class TableColumnModel {

	String columnName;
	boolean nullable;
	String dataType;
	Integer length;
	Integer scale;
	boolean isKey;

	public String getColumnName() {
		return columnName;
	}

	public boolean isNullable() {
		return nullable;
	}

	public String getDataType() {
		return dataType;
	}

	public Integer getLength() {
		return length;
	}

	public Integer getScale() {
		return scale;
	}

	public boolean isKey() {
		return isKey;
	}

}
