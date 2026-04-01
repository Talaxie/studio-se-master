// ============================================================================
//
// Copyright (C) 2006-2023 Talaxie Inc. - www.deilink.fr
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talaxie SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.designer.core.ui.editor.properties.controllers.executors;

/**
 * Fake class, don't add anything in it, implement it in fragments for different Platform!!
 */
public interface ISchemaControllerExecutor extends IRepositoryControllerExecutor {

    public static final String FORCE_READ_ONLY = "FORCE_READ_ONLY"; //$NON-NLS-1$

    public static final String RESET_COLUMNS = "RESET_COLUMNS"; //$NON-NLS-1$

    public static final String COPY_CHILD_COLUMNS = "COPY_CHILD_COLUMNS"; //$NON-NLS-1$

    public static final String SCHEMA = "SCHEMA"; //$NON-NLS-1$

    public static final String RETRIEVE_SCHEMA = "Retrieve Schema"; //$NON-NLS-1$

    public static final String TUNISERVBTGENERIC = "tUniservBTGeneric"; //$NON-NLS-1$

}
