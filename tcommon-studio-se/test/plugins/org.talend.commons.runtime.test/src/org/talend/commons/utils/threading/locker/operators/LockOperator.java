package org.talend.commons.utils.threading.locker.operators;

import org.talend.commons.utils.threading.threadsafetester.IThreadSafetyOperator;


public class LockOperator extends AbstractLockerOperator implements IThreadSafetyOperator {

    public void doOperations() {
        int sumLocked = 0;
        for (int i = 0; i < nOperationsByOperator; i++) {
            boolean alreadyLocked = locker.lock(i);
            boolean newLock = !alreadyLocked;
            if (newLock) {
                sumLocked++;
            }
        }
        resultContainer.sumLocked.getAndAdd(sumLocked);
    }
    
}
