package org.talend.stewardship;

public interface IRecord {

    public void setBasicInfo(String source, String score, String weights);

    public void setBasicInfo(String source);

    public void addExtraInfo(String infoKey, String infoValue, String infoScope);

    public void addSrcColumn(String colName, String colValue, String colType, String colIskey);

}
