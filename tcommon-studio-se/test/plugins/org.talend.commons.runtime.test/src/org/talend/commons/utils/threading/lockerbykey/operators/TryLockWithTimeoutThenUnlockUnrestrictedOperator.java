package org.talend.commons.utils.threading.lockerbykey.operators;

import org.talend.commons.utils.threading.threadsafetester.IThreadSafetyOperator;

public class TryLockWithTimeoutThenUnlockUnrestrictedOperator extends AbstractLockerByKeyOperator implements IThreadSafetyOperator {

    @SuppressWarnings("unchecked")
    public void doOperations() throws Exception {
        int sumThreadSafeOperations = 0;
        for (int i = 0; i < nOperationsByOperator; i++) {
            if (locker.tryLock(i, i)) {
                incrementNotThreadSafeCounter(i);
                sumThreadSafeOperations++;
                try {
                    if (debug) {
                        System.out.println(getTime() + getThreadId() + ": TryLockUnrestricted Timeout Locked " + i);
                    }
                    Thread.sleep(10);
                } finally {
                    if (debug) {
                        System.out.println(getTime() + getThreadId() + ": TryLockUnrestricted Timeout Unlocking " + i);
                    }
                    try {
                        locker.unlock(i);
                    } catch (Exception e) {
                        System.out.println(getTime() + getThreadId() + ": Error when Unlocking TryLockUnrestricted Timeout " + i);
                        throw e;
                    }
                }
            } else {
                if (debug) {
                    System.out.println(getTime() + getThreadId() + ": TryLockUnrestricted Timeout Failed " + i);
                }
            }
        }
        resultContainer.sumThreadSafeOperations.getAndAdd(sumThreadSafeOperations);
    }

}
