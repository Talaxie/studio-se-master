package org.talend.stewardship;

import org.dom4j.Element;

public class Task {

    private Element taskElem;

    public Task(Element taskElem) {
        this.taskElem = taskElem;
    }
    
    public void setBasicInfo(String taskType, String createdBy, String owner, Integer star, String tags) {
        if (taskType == null)
            taskType = "";
        if (createdBy == null)
            createdBy = "";
        if (owner == null)
            owner = "";
        if (star == null)
            star = 0;
        if (tags == null)
            tags = "";
        taskElem.addElement("taskType").addText(taskType);
        taskElem.addElement("createdBy").addText(createdBy);
        taskElem.addElement("owner").addText(owner);
        taskElem.addElement("star").addText(star.toString());
        taskElem.addElement("tags").addText(tags);
    }

    public void setBasicInfo(String taskName, String taskType, String createdBy, String owner, Integer star, String tags) {
        if (taskName == null)
            taskName = "";
        if (taskType == null)
            taskType = "";
        if (createdBy == null)
            createdBy = "";
        if (owner == null)
            owner = "";
        if (star == null)
            star = 0;
        if (tags == null)
            tags = "";
        taskElem.addElement("taskName").addText(taskName);
        taskElem.addElement("taskType").addText(taskType);
        taskElem.addElement("createdBy").addText(createdBy);
        taskElem.addElement("owner").addText(owner);
        taskElem.addElement("star").addText(star.toString());
        taskElem.addElement("tags").addText(tags);
    }

    public SourceRecord addSourceRecord() {
        Element srcRecordElem = taskElem.addElement("srcRecord");

        return new SourceRecord(srcRecordElem);
    }

    public TargetRecord addTargetRecord() {
        Element tgtRecordElem = taskElem.addElement("tgtRecord");

        return new TargetRecord(tgtRecordElem);
    }

    public void changeRecordOrder() {

    }
}
