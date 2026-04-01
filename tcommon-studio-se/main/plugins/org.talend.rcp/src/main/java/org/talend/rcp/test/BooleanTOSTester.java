package org.talend.rcp.test;

import org.eclipse.core.expressions.PropertyTester;
import org.talend.core.PluginChecker;


public class BooleanTOSTester extends PropertyTester{
    
    @Override
    public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
        //if EE return true, then the activity hideMenuForTOS would not be enable
         return PluginChecker.isTIS();
    }

}
