package org.talend.rcp.test;

import org.eclipse.core.expressions.PropertyTester;
import org.talend.core.language.ECodeLanguage;
import org.talend.core.language.LanguageManager;

public class LanguageUseJavaTest extends PropertyTester {

    private static final String IS_USE_JAVA = "isUseJava";

    public LanguageUseJavaTest() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
        if (IS_USE_JAVA.equals(property)) {
            return !(LanguageManager.getCurrentLanguage() == ECodeLanguage.JAVA);
        }
        return false;
    }
}
