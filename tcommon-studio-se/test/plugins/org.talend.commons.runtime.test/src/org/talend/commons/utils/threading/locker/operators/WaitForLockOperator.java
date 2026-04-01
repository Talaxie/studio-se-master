package org.talend.commons.utils.threading.locker.operators;

import org.talend.commons.utils.threading.threadsafetester.IThreadSafetyOperator;

public class WaitForLockOperator extends AbstractLockerOperator implements IThreadSafetyOperator {

    public void doOperations() throws InterruptedException {
        int sumLocked = 0;
        for (int i = 0; i < nOperationsByOperator; i++) {
            locker.waitForLock(i);
            sumLocked++;
        }
        resultContainer.sumLocked.getAndAdd(sumLocked);
    }

}
