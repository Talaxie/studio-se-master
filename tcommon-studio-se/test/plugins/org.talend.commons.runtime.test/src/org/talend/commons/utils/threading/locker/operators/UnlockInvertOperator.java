package org.talend.commons.utils.threading.locker.operators;

import org.talend.commons.utils.threading.threadsafetester.IThreadSafetyOperator;

public class UnlockInvertOperator extends AbstractLockerOperator implements IThreadSafetyOperator {

    public void doOperations() throws InterruptedException {
        Thread.sleep(1000);
        int sumUnlocked = 0;
        for (int i = 0; i < nOperationsByOperator; i++) {
            boolean hasUnlocked = locker.unlock(i);
            if (hasUnlocked) {
                sumUnlocked++;
            }
        }
        resultContainer.sumLocked.getAndAdd(sumUnlocked);
    }

}
