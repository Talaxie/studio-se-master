package org.talend.designer.runtime.visualization;

import java.util.Iterator;

import org.apache.commons.collections.buffer.UnboundedFifoBuffer;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.graphics.Color;

public class ReportMessageManager {
	
	private static UnboundedFifoBuffer messages = new UnboundedFifoBuffer(100);
	
	private static ReportMessageManager manager;
	
	private ReportMessageManager(){}
	
	public synchronized static ReportMessageManager getInstance(){
		if(manager == null){
			manager = new ReportMessageManager();
		}
		return manager;
	}

	public UnboundedFifoBuffer getMessages() {
		return messages;
	}
	
	public int getMessagesLength() {
    	if(messages.size() <1){
    		return 0;
    	}
    	Iterator iterator = messages.iterator();
    	int length = 0;
    	while(iterator.hasNext()){
    		ReportMessage message = (ReportMessage) iterator.next();
    		length += message.getContent().length();
    	}
		return length;
	}
	
	public synchronized void setStartMessage(String content,Color foreground, Color background){
		messages.clear();
		StyleRange styleRange = new StyleRange(0, content.length(), foreground, background);
		messages.add(new ReportMessage(styleRange, content));
	}
	
	public synchronized void setEndMessage(String content,Color foreground, Color background){
		int oldLength = getMessagesLength();
		StyleRange styleRange = new StyleRange(oldLength, content.length(), foreground, background);
		messages.add(new ReportMessage(styleRange, content));
	}
	
	public synchronized void setWarningMessage(String content,Color foreground, Color background){
		int oldLength = getMessagesLength();
		StyleRange styleRange = new StyleRange(oldLength, content.length(), foreground, background);
		messages.add(new ReportMessage(styleRange, content));
	}
}
