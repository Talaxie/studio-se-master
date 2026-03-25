package org.talend.designer.runtime.visualization;

import org.eclipse.swt.custom.StyleRange;


public class ReportMessage {
	   /** Type of the message. */

    /** Type of the message. */
    private StyleRange type;

    /** Content of the message. */
    private String content;

    /**
     * Constrcucts a new ProcessMessage.
     */
    public ReportMessage(StyleRange type, String content) {

        this.type = type;
        this.content = content;
    }

    /**
     * Getter for content.
     * 
     * @return the content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * Getter for type.
     * 
     * @return the type
     */
    public StyleRange getType() {
        return this.type;
    }
}
