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
package org.talend.dataprofiler.core.ui.action.actions;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.talend.commons.utils.WorkspaceUtils;
import org.talend.commons.utils.io.FilesUtils;
import org.talend.resource.ResourceManager;

/**
 * an object which can be import into TDQ, include an Object File (csv) and a Jar File list.
 */
public class ImportObject {

    protected static Logger log = Logger.getLogger(ImportObject.class);

    /**
     * create a ImportObject.
     *
     * @param pObjfile
     * @param pJarfiles
     * @return
     */
    public static ImportObject createImportObject(File pObjfile, List<File> pJarfiles) {
        return new ImportObject(pObjfile, pJarfiles);
    }

    private File objFile;

    private List<File> jarFiles;

    private ImportObject(File pObjfile, List<File> pJarfiles) {
        this.setObjFile(pObjfile);
        this.setJarFiles(pJarfiles);
    }

    /**
     * copy jar file into TDQ_Libraries/Indicators/User Defined Indicators/lib.
     */
    public void copyJarFiles() {
        if (!this.getJarFiles().isEmpty()) {
            try {
                for (File file : this.getJarFiles()) {
                    FilesUtils.copyFile(file,
                            WorkspaceUtils.ifileToFile(ResourceManager.getUDIJarFolder().getFile(file.getName())));
                }
            } catch (IOException e) {
                log.warn(e, e);
            }
        }
    }

    public List<File> getJarFiles() {
        if (this.jarFiles == null) {
            this.jarFiles = new ArrayList<File>();
        }
        return this.jarFiles;
    }

    public File getObjFile() {
        return this.objFile;
    }

    private void setJarFiles(List<File> jarFiles) {
        this.jarFiles = jarFiles;
    }

    private void setObjFile(File objFile) {
        this.objFile = objFile;
    }
}
