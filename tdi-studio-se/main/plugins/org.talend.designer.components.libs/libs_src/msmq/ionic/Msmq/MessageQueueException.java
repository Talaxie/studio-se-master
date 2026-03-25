//
// MessageQueueException.java
// ------------------------------------------------------------------
//
// Copyright (c) 2006-2015 Dino Chiesa.
// All rights reserved.
//
// This code module is part of MsmqJava, a JNI library that provides
// access to MSMQ for Java on Windows.
//
// ------------------------------------------------------------------
//
// This code is licensed under the Microsoft Public License.
// See the file License.txt for the license details.
// More info on: http://dotnetzip.codeplex.com
//
// ------------------------------------------------------------------
//
// last saved (in emacs):
// Time-stamp: <2010-March-28 15:50:20>
//
// ------------------------------------------------------------------
//
// This class models an exception that may occur when interacting with
// MSMQ through the JNI library.
//
// ------------------------------------------------------------------

package ionic.Msmq ;

/**
 * An exception type to wrap any problems that occur during MSMQ operations.
 *
 **/
public class MessageQueueException extends java.lang.Exception {

    public int hresult;

    public MessageQueueException(int HRESULT) {
        super();
        hresult= HRESULT;
    }

    public MessageQueueException(String message, int HRESULT) {
        super(message);
        hresult= HRESULT;
    }

    /**
     * <p>Produce the string version for the given exception, including the
     * string mnemonic for the HR wrapped by the exception.</p>
     *
     * <p>Example:</p>
     *
     * <blockquote class='code'><pre>
     *   try {
     *       String label="testmessage";
     *       String body= "....";
     *       Message msg= new Message(body, label, null);
     *       queue.send(msg);
     *   }
     *   catch (MessageQueueException ex1) {
     *       System.out.println("Put failure: " + ex1.toString());
     *   }
     * </pre></blockquote>
     *
     */
    public String toString() {
        String msg = getLocalizedMessage();
        String hr= "hr=" + HrToString(hresult) ;
        return msg + " (" + hr + ")";
    }


    private static String HrToString(int hr) {
        if (hr== 0)
            return "SUCCESS";
        if (hr==0xC00E0002)
            return "MQ_ERROR_PROPERTY";
        if (hr== 0xC00E0003)
            return "MQ_ERROR_QUEUE_NOT_FOUND";
        if (hr==0xC00E0005)
            return "MQ_ERROR_QUEUE_EXISTS";
        if (hr==0xC00E0006)
            return "MQ_ERROR_INVALID_PARAMETER";
        if (hr==0xC00E0007)
            return "MQ_ERROR_INVALID_HANDLE";
        if (hr==0xC00E005A)
            return "MQ_ERROR_QUEUE_DELETED";
        if (hr==0xC00E000B)
            return "MQ_ERROR_SERVICE_NOT_AVAILABLE";
        if (hr==0xC00E001B)
            return "MQ_ERROR_IO_TIMEOUT";
        if (hr==0xC00E001E)
            return "MQ_ERROR_ILLEGAL_FORMATNAME";
        if (hr== 0xC00E0025)
            return "MQ_ERROR_ACCESS_DENIED";
        if (hr==0xC00E0013)
            return "MQ_ERROR_NO_DS";
        if (hr==0xC00E003F)
            return "MQ_ERROR_INSUFFICIENT_PROPERTIES";
        if (hr==0xC00E0014)
            return "MQ_ERROR_ILLEGAL_QUEUE_PATHNAME";
        if (hr==0xC00E0044)
            return "MQ_ERROR_INVALID_OWNER";
        if (hr==0xC00E0045)
            return "MQ_ERROR_UNSUPPORTED_ACCESS_MODE";
        if (hr== 0xC00E0069)
            return "MQ_ERROR_REMOTE_MACHINE_NOT_AVAILABLE";

        return "unknown hr (" + hr + ")";
    }
}
