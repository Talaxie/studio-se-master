package org.talend.stewardship;

import org.dom4j.Element;

public class SourceRecord extends Record {

    private Element srcRecordElem;

    public SourceRecord(Element srcRecordElem) {
        this.srcRecordElem = srcRecordElem;
    }

    public void setBasicInfo(String source, String score, String weights) {
        if (source == null)
            source = "";
        if (score == null)
            score = "";
        if (weights == null)
            weights = "";
        srcRecordElem.addElement("source").addText(source);
        srcRecordElem.addElement("score").addText(score);
        srcRecordElem.addElement("weights").addText(weights);
    }

    public void setBasicInfo(String source) {
        if (source == null)
            source = "";
        srcRecordElem.addElement("source").addText(source);
    }

    public void addExtraInfo(String infoKey, String infoValue, String infoScope) {
        if (infoKey == null)
            infoKey = "";
        if (infoValue == null)
            infoValue = "";
        Element extraInfoElem = srcRecordElem.addElement("extrainfo");
        extraInfoElem.addElement("infoKey").addText(infoKey);
        extraInfoElem.addElement("infoValue").addText(infoValue);
        if (infoScope != null && !"".equals(infoScope)) {
            extraInfoElem.addElement("infoScope").addText(infoScope);
        }
    }

    public void addSrcColumn(String colName, String colValue, String colType, String colIskey) {
	        if (colName == null)
	            colName = "";
	        if (colType == null)
	            colType = "";
	        if (colIskey == null)
	            colIskey = "";
	        Element srcColumnElem = srcRecordElem.addElement("srcColumn");
	        addText(srcColumnElem.addElement("colName"),colName);
	    	if (colValue != null){
	    		addText(srcColumnElem.addElement("colValue"),colValue);
	    	}
	        addText(srcColumnElem.addElement("colType"),colType);
	        addText(srcColumnElem.addElement("colIskey"),colIskey);
    }

}
