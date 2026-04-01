// ============================================================================
//
// Copyright (C) 2006-2021 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.dq.helper;

import java.io.File;
import java.io.IOException;

import org.apache.commons.lang.StringUtils;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.Platform;
import org.talend.dataquality.record.linkage.utils.CustomAttributeMatcherClassNameConvert;
import org.talend.dq.indicators.definitions.DefinitionHandler;
import org.talend.resource.ResourceManager;

/**
 * created by zshen on Nov 14, 2013 Detailled comment
 *
 */

public class CustomAttributeMatcherHelper {

    public static final String FILEPROTOCOL = "File"; //$NON-NLS-1$

    public static final String SEPARATOR = "||"; //$NON-NLS-1$

    /**
     * DOC zshen Comment method "getClassURLList".
     *
     * @param classPathParameter
     * @return
     */
    public static String getFullJarPath(String classPathParameter) {
        String returnStr = StringUtils.EMPTY;
        String[] allElements = classPathParameter.split(CustomAttributeMatcherClassNameConvert.REGEXKEY);
        if (Platform.isRunning()) {
            for (int index = 0; index < allElements.length - 1; index++) {
                IFile jarFile = ResourceManager.getUDIJarFolder().getFile(allElements[index]);
                if (index != 0) {
                    returnStr += SEPARATOR;
                }
                returnStr += jarFile.getLocation().toOSString();
            }
        } else {// TDQ-19768:get jar for Jobs.
            String libJarPath = getUDILibPath();
            for (int index = 0; index < allElements.length - 1; index++) {
                File newFile = new File(libJarPath + File.separator + allElements[index]);
                if (index != 0) {
                    returnStr += SEPARATOR;
                }
                if (newFile.exists()) {
                    returnStr += newFile.getAbsolutePath();
                }
            }
        }
        return returnStr;
    }
    
    public static String getUDILibPath() {
        if (Platform.isRunning()) {
            return ResourceManager.getUDIJarFolder().getLocation().toString();
        }

        String tdqLibPath = DefinitionHandler.getInstance().getTdqLibPath();
        return tdqLibPath + "Indicators" + File.separator + "User Defined Indicators" + File.separator + "lib"; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    }

    /**
     * DOC zshen Comment method "getClassName".
     *
     * @param classPathParameter like "CustomMatcherTest.jar||MycustomMatch.jar||testCustomMatcher.myCustomMatcher" last
     * one is fully qualified name("testCustomMatcher" is package name and "myCustomMatcher" is class name).
     * @return the class name as the demo will return testCustomMatcher.myCustomMatcher
     */
    public static String getClassName(String classPathParameter) {
        return CustomAttributeMatcherClassNameConvert.getClassName(classPathParameter);
    }

    public static String[] splitJarPath(String classPathParameter) {
        String[] allElements = classPathParameter.split(CustomAttributeMatcherClassNameConvert.REGEXKEY);
        String[] jarPathElements = new String[allElements.length - 1];
        for (int index = 0; index < allElements.length - 1; index++) {
            jarPathElements[index] = new File(allElements[index]).getName();
        }
        return jarPathElements;
    }

}
