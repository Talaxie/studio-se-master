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
package org.talend.core.service;

import org.talend.core.IService;

/**
 * Manage the download of sqlexplorer and top.chart jar files.
 */
public interface IDQJarManagementService extends IService {

    /**
     * check and show the download page, this method should be called in TOP only.
     */
    public void checkSqlexplorerTopchartLibraries();

}
