package org.talend.syslog;

public class SyslogMessage {

    private String timestamp;

    private String host;

    private String program;

    private String pid;

    private String text;

    public void setTimeStamp(String val) {
        this.timestamp = val;
    }

    public String getTimeStamp() {
        return this.timestamp;
    }

    public void setHost(String val) {
        this.host = val;
    }

    public String getHost() {
        return this.host;
    }

    public void setProgram(String val) {
        this.program = val;
    }

    public String getProgram() {
        return this.program;
    }

    public void setPid(String val) {
        this.pid = val;
    }

    public String getPid() {
        return this.pid;
    }

    public void setText(String val) {
        this.text = val;
    }

    public String getText() {
        return this.text;
    }

}
