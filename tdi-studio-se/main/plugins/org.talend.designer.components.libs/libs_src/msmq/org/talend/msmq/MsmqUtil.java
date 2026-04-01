package org.talend.msmq;

import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.UnknownHostException;

import ionic.Msmq.Message;
import ionic.Msmq.MessageQueueException;
import ionic.Msmq.Queue;
import ionic.Msmq.TransactionType;

public class MsmqUtil {

    private Queue msmqHandle = null;

    private String host;

    private String queueName;

    private String msgContent;

    private String queueType="\\private$";
    
    private boolean isTransaction;
    
    private boolean createIfNotExists;
    
    String ipAddr = "";

    final String LOCALIP = "127.0.0.1";

    public MsmqUtil() throws Exception {
        java.net.InetAddress thisIp = java.net.InetAddress.getLocalHost();
        ipAddr = thisIp.getHostAddress();
    }

    public static void main(String[] args) throws java.lang.Exception {
        org.talend.msmq.MsmqUtil msgu = new org.talend.msmq.MsmqUtil();
        msgu.setHost("127.0.0.1");
        msgu.setQueue("jzhao");
        msgu.createIfNotExists(true);
        msgu.setQueueType("");
        msgu.setIsTransaction(true);
        msgu.open();
        String str = "test_abc";
        // str = CharacterSetToolkit.toUnicode(str, true);
        // System.out.println(str);
        msgu.setMsg(str);
        msgu.send();
        if (msgu.isOpen()) {
            str = msgu.receive();
            // str = CharacterSetToolkit.fromUnicode(str);
            System.out.println(str);
        }
        msgu.close();
    }

    // message remain in queue
    public void peek() throws MessageQueueException, UnsupportedEncodingException {
        checkOpen();
        System.out.println("peek");
        Message msg = msmqHandle.peek(2000); // timeout= 2000 ms
        System.out.println(" ==> message: " + msg.getBodyAsString());
        System.out.println("     label:   " + msg.getLabel());
    }

    // close an open queue
    public void close() throws MessageQueueException {
        checkOpen();
        msmqHandle.close();
        msmqHandle = null;
    }

    // delete the queue
    private void delete() throws MessageQueueException {
        String fullname = getQueueFullName(".", queueName);
        ionic.Msmq.Queue.delete(fullname);
    }

    // open the queue, if it not exists, and creating is required, try to create a queue with the name.
    public void open() throws MessageQueueException {
        try {
            if (msmqHandle != null) {
                msmqHandle.close();
                msmqHandle = null;
            }
            String fullname = getQueueFullName(host, queueName);
            msmqHandle = new Queue(fullname);
            // msmqHandle= new Queue(fullname, 0x02); // 0x02 == SEND only
        } catch (MessageQueueException ex1) {

            if (createIfNotExists) {
            	System.out.println("Queue [."+queueType+"\\" + queueName+"] open failure: " + ex1);
                createIfNotExists = false;
                create();
            }else{
            	 throw ex1;
            }
        }
    }

    public void send() throws MessageQueueException, UnsupportedEncodingException {
	    checkOpen();
	    // the transaction flag must agree with the transactional flavor of the queue.
	    int transactionFlag = 0; // 0 = NO TRANSACTION, 1= MTS, 2= XA, 3= SINGLE_MESSAGE
	    String mLabel = "inserted by " + this.getClass().getName() + ".java";
	    String correlationID = "L:none";
	    Message msg = new Message(msgContent, mLabel, correlationID);
	    if(isTransaction){
	    	msmqHandle.send(msg,TransactionType.SINGLE_MESSAGE);
	    }else{
	    	msmqHandle.send(msg);
	    }
    }

    public String receive() throws MessageQueueException, UnsupportedEncodingException {
        checkOpen();
        // System.out.println("receive");
        Message msg = msmqHandle.receive(2000); // timeout= 2000 ms
        // System.out.println(" ==> message: " + msg.getMessage());
        // System.out.println("     label:   " + msg.getLabel());
        return msg.getBodyAsString();
    }

    private String getQueueFullName(String hostname, String queueShortName) {
        String h1 = hostname;
        String a1 = "OS";
        if ((h1 == null) || h1.equals("") || LOCALIP.equals(h1))
            h1 = ".";
        char[] c = h1.toCharArray();
        if ((c[0] >= '1') && (c[0] <= '9'))
            a1 = "TCP";

        return "DIRECT=" + a1 + ":" + h1 +queueType+ "\\" + queueShortName;
    }

    private void create() throws MessageQueueException {
        if (!(host == null || "".equals(host) || "localhost".equalsIgnoreCase(host) || host.equals(ipAddr) || LOCALIP
                .equals(host))) {
            throw new MessageQueueException("can only create queue locally", -1); // can only create locally.
        }
        String fullname = "."+queueType+"\\" + queueName;
        String qLabel = "Created by " + this.getClass().getName() + ".java";
        
        msmqHandle = Queue.create(fullname, qLabel, isTransaction);
        System.out.println("Create queue ["+fullname+"] successfully.");
    }

    private void checkOpen() throws MessageQueueException {
        if (msmqHandle == null)
            throw new MessageQueueException("Open a queue first!\n", -1);
    }

    public boolean isOpen() {
        return msmqHandle != null;
    }

    public void setHost(String host) throws UnknownHostException{
    	try {
			if(InetAddress.getByName(host)!=null){
				this.host = InetAddress.getByName(host).getHostAddress();
			}
		} catch (UnknownHostException e) {
			this.host = host;
			throw e;
		}
    }

    public void setQueue(String queueName) {
        this.queueName = queueName;
    }

    public void setMsg(String msg) {
        this.msgContent = msg;
    }

    public void setQueueType(String queueType) {
		this.queueType = queueType;
	}

	public void setIsTransaction(boolean isTransaction) {
		this.isTransaction = isTransaction;
	}
    public void createIfNotExists(boolean createIfNotExists) {
		this.createIfNotExists = createIfNotExists;
	}
}
