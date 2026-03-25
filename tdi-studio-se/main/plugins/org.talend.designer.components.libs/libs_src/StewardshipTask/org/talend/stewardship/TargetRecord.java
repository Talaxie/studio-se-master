package org.talend.stewardship;

import org.dom4j.Element;

public class TargetRecord extends Record {

    private Element tgtRecordElem;

    public TargetRecord(Element tgtRecordElem) {
        this.tgtRecordElem = tgtRecordElem;
    }

    public void addSrcColumn(String colName, String colValue, String colType, String colIskey) {
	    	if (colName == null)
	            colName = "";
	        if (colType == null)
	            colType = "";
	        if (colIskey == null)
	            colIskey = "";
	        Element tgtColumnElem = tgtRecordElem.addElement("tgtColumn");
	        addText(tgtColumnElem.addElement("defColName"),colName);
	        if (colValue != null){
	    		addText(tgtColumnElem.addElement("defColValue"),colValue);
	    	}
	        addText(tgtColumnElem.addElement("defColType"),colType);
	        addText(tgtColumnElem.addElement("defColIskey"),colIskey);
    }
}
