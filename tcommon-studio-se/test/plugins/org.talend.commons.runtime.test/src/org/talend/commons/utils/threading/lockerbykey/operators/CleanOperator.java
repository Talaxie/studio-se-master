package org.talend.commons.utils.threading.lockerbykey.operators;

import java.util.Random;

import org.talend.commons.utils.threading.threadsafetester.IThreadSafetyOperator;

public class CleanOperator extends AbstractLockerByKeyOperator implements IThreadSafetyOperator {

    @SuppressWarnings("unchecked")
    public void doOperations() throws Exception {
        Random random = new Random(System.currentTimeMillis());
        int nOperationsByOperatorLocal = nOperationsByOperator / 10;
        for (int i = 0; i < nOperationsByOperatorLocal; i++) {
            int nextInt = random.nextInt(500);
            Thread.sleep(nextInt);
            if (debug) {
                System.out.println(getTime() + getThreadId() + "Cleaning ...");
            }
            locker.clean();
        }
    }

}
