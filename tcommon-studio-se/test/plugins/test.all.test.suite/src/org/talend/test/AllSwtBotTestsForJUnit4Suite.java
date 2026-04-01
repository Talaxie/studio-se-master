package org.talend.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.model.InitializationError;

@RunWith(AllSwtBotTestsForJUnit4Suite.class)
public class AllSwtBotTestsForJUnit4Suite extends Suite {

    private static final TalendTestCollector ttc = new TalendSwtBotTestCollector();

    public AllSwtBotTestsForJUnit4Suite(Class<?> klass) throws InitializationError {
        super(klass, ttc.getTests());
    }

}
