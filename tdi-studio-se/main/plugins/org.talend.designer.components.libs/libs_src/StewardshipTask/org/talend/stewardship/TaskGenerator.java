package org.talend.stewardship;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

public class TaskGenerator {

    private int taskCount = 0;

    private Element tasksElem;

    private Document document;

    public TaskGenerator() {
        document = DocumentHelper.createDocument();
        tasksElem = document.addElement("Tasks");
    }

    public Task addTask() {
        Element taskElem = tasksElem.addElement("Task");
        taskCount++;
        return new Task(taskElem);
    }

    public String getTasksAndClear() {
        String content = document.asXML();
        taskCount = 0;
        tasksElem.clearContent();
        return content;
    }

    public int getTaskCount() {
        return taskCount;
    }
}
