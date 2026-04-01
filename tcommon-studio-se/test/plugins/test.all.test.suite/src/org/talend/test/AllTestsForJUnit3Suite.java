/*******************************************************************************
 * Copyright (c) 2008 Syntax Consulting, Inc. All rights reserved.
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.talend.test;

import junit.framework.Test;
import junit.framework.TestSuite;
import test.common.BundleTestCollector;

public class AllTestsForJUnit3Suite {

    public static Test suite() {
        BundleTestCollector testCollector = new BundleTestCollector();

        TestSuite suite = new TestSuite("All Talaxie Tests"); //$NON-NLS-1$

        /*
         * assemble as many collections as you like based on bundle, package and classname filters
         */
        testCollector.collectJUnit3Tests(suite, "org.talend.", "org.talend.", "*Test");

        return suite;

    }

}
