package org.talend.commons.utils.threading.locker.operators;

import java.util.Random;

import org.talend.commons.utils.threading.threadsafetester.IThreadSafetyOperator;

public class UnlockOperator extends AbstractLockerOperator implements IThreadSafetyOperator {

    public void doOperations() {
        int sumUnlocked = 0;
        Random random = new Random();
        for (int i = 0; i < nOperationsByOperator; i++) {
            boolean hasUnlocked = locker.unlock(i);
            if (hasUnlocked) {
                sumUnlocked++;
            }
        }
        resultContainer.sumUnlocked.getAndAdd(sumUnlocked);
    }

}
