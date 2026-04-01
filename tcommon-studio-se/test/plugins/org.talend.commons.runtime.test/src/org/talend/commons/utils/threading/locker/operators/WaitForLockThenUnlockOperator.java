package org.talend.commons.utils.threading.locker.operators;

import org.talend.commons.utils.threading.threadsafetester.IThreadSafetyOperator;

public class WaitForLockThenUnlockOperator extends AbstractLockerOperator implements IThreadSafetyOperator {

    @SuppressWarnings("unchecked")
    public void doOperations() throws InterruptedException {
        for (int i = 0; i < nOperationsByOperator; i++) {
            try {
                locker.waitForLock(i);
                System.out.println("Locked " + i);
                Thread.sleep(10);
            } finally {
                System.out.println("Unlocking " + i);
                locker.unlock(i);
            }
        }
    }

}
