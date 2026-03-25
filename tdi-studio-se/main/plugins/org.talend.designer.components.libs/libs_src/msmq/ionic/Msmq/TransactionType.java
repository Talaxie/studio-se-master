//
// TransactionType.java
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
// Time-stamp: <2010-March-28 15:43:23>
//
// ------------------------------------------------------------------
//
// This module provides the various transaction types for MQ.
//
// ------------------------------------------------------------------

package ionic.Msmq;

/**
 * Specifies the transaction type to use when enqueuing messages into a
 * transactional queue.
 *
 */

public enum TransactionType {

    // transactionFlag:
    //     MQ_NO_TRANSACTION,
    //     MQ_MTS_TRANSACTION,
    //     MQ_XA_TRANSACTION, or
    //     MQ_SINGLE_MESSAGE
    // see mq.h for details...


    /**
     * <p>Specifies that the call is not part of a transaction. This
     * transaction type cannot be used to send a message to a transactional
     * queue.</p>
     *
     * <p>Equivalent to MSMQ's MQ_NO_TRANSACTION.</p>
     *
     */
    None(0),

    /**
     * <p>If the application is
     * running in the context of a COM+ (Component Services)
     * transaction, the message is sent within the current COM+
     * transaction. Otherwise, the message is sent outside of a
     * transaction.</p>
     *
     * <p>Equivalent to MSMQ's MQ_MTS_TRANSACTION.</p>
     *
     */
        MTS(1),

    /**
     * Specifies that the call is part of an externally coordinated,
     * XA-compliant transaction.
     *
     */
        XA(2),

    /**
     * Specifies that the message is sent in a single-message
     * transaction. Messages sent in a single-message transaction must
     * be sent to a transactional queue.
     *
     * <p>Equivalent to MSMQ's MQ_SINGLE_MESSAGE.</p>
     *
     */
        SINGLE_MESSAGE(3);

    int _transactionFlag;

    TransactionType(int value)
    {
        _transactionFlag = value;
    }

    public int getValue()   { return _transactionFlag; }
}
