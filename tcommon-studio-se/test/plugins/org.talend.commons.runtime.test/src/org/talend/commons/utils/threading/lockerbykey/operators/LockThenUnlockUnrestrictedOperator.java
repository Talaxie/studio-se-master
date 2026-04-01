package org.talend.commons.utils.threading.lockerbykey.operators;

import org.talend.commons.utils.threading.lockerbykey.LockerByKeyUnrestricted;
import org.talend.commons.utils.threading.threadsafetester.IThreadSafetyOperator;

public class LockThenUnlockUnrestrictedOperator extends AbstractLockerByKeyOperator implements IThreadSafetyOperator {

    @SuppressWarnings("unchecked")
    public void doOperations() throws Exception {
        int sumThreadSafeOperations = 0;
        LockerByKeyUnrestricted locker = (LockerByKeyUnrestricted) this.locker;
        for (int i = 0; i < nOperationsByOperator; i++) {
            try {
                locker.lockInterruptiblyUnrestricted(i);
                incrementNotThreadSafeCounter(i);
                sumThreadSafeOperations++;
                if (debug) {
                    System.out.println(getTime() + getThreadId() + ": Locked Unrestricted " + i);
                }
                Thread.sleep(10);
            } finally {
                if (debug) {
                    System.out.println(getTime() + getThreadId() + ": Unlocking Unrestricted " + i);
                }
                try {
                    locker.unlockUnrestricted(i);
                } catch (Exception e) {
                    System.out.println(getTime() + getThreadId() + ": Error when Unlocking Unrestricted " + i);
                    throw e;
                }
            }
        }
        resultContainer.sumThreadSafeOperations.getAndAdd(sumThreadSafeOperations);
    }

}
