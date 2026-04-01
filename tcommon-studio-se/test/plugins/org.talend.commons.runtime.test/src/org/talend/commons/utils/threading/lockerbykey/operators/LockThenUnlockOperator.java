package org.talend.commons.utils.threading.lockerbykey.operators;

import org.talend.commons.utils.threading.threadsafetester.IThreadSafetyOperator;

public class LockThenUnlockOperator extends AbstractLockerByKeyOperator implements IThreadSafetyOperator {

    @SuppressWarnings("unchecked")
    public void doOperations() throws Exception {
        int sumThreadSafeOperations = 0;
        for (int i = 0; i < nOperationsByOperator; i++) {
            try {
                locker.lockInterruptibly(i);
                incrementNotThreadSafeCounter(i);
                sumThreadSafeOperations++;
                if (debug) {
                    System.out.println(getTime() + getThreadId() + ": Locked " + i);
                }
                Thread.sleep(10);
            } finally {
                if (debug) {
                    System.out.println(getTime() + getThreadId() + ": Unlocking " + i);
                }
                try {
                    locker.unlock(i);
                } catch (Exception e) {
                    System.out.println(getTime() + getThreadId() + ": Error when Unlocking " + i);
                    throw e;
                }
            }
        }
        resultContainer.sumThreadSafeOperations.getAndAdd(sumThreadSafeOperations);
    }

}
