package org.talend.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.model.InitializationError;

@RunWith(AllSwtBotTestsForJUnit4SuiteAnt.class)
public class AllSwtBotTestsForJUnit4SuiteAnt extends Suite {

    private static final TalendSwtBotTestCollectorAnt ttc = new TalendSwtBotTestCollectorAnt();

    public AllSwtBotTestsForJUnit4SuiteAnt(Class<?> klass) throws InitializationError {
        super(klass, ttc.getTests());
    }

}
