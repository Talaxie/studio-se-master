// ============================================================================
//
// Copyright (C) 2006-2023 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.core.service;

import java.io.File;

import org.talend.commons.CommonsPlugin;
import org.talend.core.IService;

/**
 * @author bhe created on Jan 19, 2023
 *
 */
public interface IComponentJsonformGeneratorService extends IService {

    /**
     * System property to enable whether to generate jsonform or not, not enabled by default
     */
    public static final String JSONFORM_GENERATE_PROP = "jsonform.generate";
    
    public static final String JSONFORM_GENERATE_FOLDER_PROP = "jsonform.generate.dir";
    
    public static final String JSONFORM_GENERATE_FOLDER_NAME_PROP = "jsonforms";

    /**
     * Generate jsonform json files for all of components
     * 
     * <pre>
     * Folder structure
     * 
     * targetFolder
     * --Category
     * ----tRowgenerator.json
     * ----tLogRow.json
     * 
     * </pre>
     * 
     * @param targetFolder all of jsonform jsons will be saved into the targetFolder
     */
    void generate(File targetFolder);

    /**
     * If enabled by -Djsonform.generate or by running junit, then generate jsonform for components, otherwise will not generate.
     * 
     * @return enabled or not
     */
    public static boolean isEnabled() {
        return Boolean.getBoolean(JSONFORM_GENERATE_PROP) || CommonsPlugin.isJUnitTest() || CommonsPlugin.isJunitWorking();
    }
    
    public static String getDirectoryFromProperty() {
        return System.getProperty(JSONFORM_GENERATE_FOLDER_PROP);
    }
}
