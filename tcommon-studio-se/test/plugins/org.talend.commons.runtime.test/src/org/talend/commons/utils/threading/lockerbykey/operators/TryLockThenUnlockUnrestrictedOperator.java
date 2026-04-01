package org.talend.commons.utils.threading.lockerbykey.operators;

import org.talend.commons.utils.threading.lockerbykey.LockerByKeyUnrestricted;
import org.talend.commons.utils.threading.threadsafetester.IThreadSafetyOperator;

public class TryLockThenUnlockUnrestrictedOperator extends AbstractLockerByKeyOperator implements IThreadSafetyOperator {

    @SuppressWarnings("unchecked")
    public void doOperations() throws Exception {
        int sumThreadSafeOperations = 0;
        LockerByKeyUnrestricted locker = (LockerByKeyUnrestricted) this.locker;
        for (int i = 0; i < nOperationsByOperator; i++) {
            if (locker.tryLockUnrestricted(i)) {
                incrementNotThreadSafeCounter(i);
                sumThreadSafeOperations++;
                try {
                    if (debug) {
                        System.out.println(getTime() + getThreadId() + ": TryLockUnrestricted Locked " + i);
                    }
                    Thread.sleep(10);
                } finally {
                    if (debug) {
                        System.out.println(getTime() + getThreadId() + ": TryLockUnrestricted Unlocking " + i);
                    }
                    try {
                        locker.unlockUnrestricted(i);
                    } catch (Exception e) {
                        System.out.println(getTime() + getThreadId() + ": Error when Unlocking TryLockUnrestricted " + i);
                        throw e;
                    }
                }
            } else {
                if (debug) {
                    System.out.println(getTime() + getThreadId() + ": TryLockUnrestricted Failed " + i);
                }
            }
        }
        resultContainer.sumThreadSafeOperations.getAndAdd(sumThreadSafeOperations);
    }

}
