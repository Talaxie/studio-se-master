package org.talend.stewardship;

import org.apache.commons.lang.StringEscapeUtils;
import org.dom4j.Element;

public class Record implements IRecord {

    public void setBasicInfo(String source, String score, String weights) {

    }

    public void setBasicInfo(String source) {

    }

    public void addExtraInfo(String infoKey, String infoValue, String infoScope) {

    }

    public void addSrcColumn(String colName, String colValue, String colType, String colIskey) {

    }
    
    public void addText(Element element, String value) {
        String escapedValue = StringEscapeUtils.escapeXml(value);
        element.addText(escapedValue);
    }
}
