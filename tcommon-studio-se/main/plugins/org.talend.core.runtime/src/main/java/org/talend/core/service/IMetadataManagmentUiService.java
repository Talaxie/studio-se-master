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

import java.util.List;

import org.eclipse.core.runtime.Path;
import org.eclipse.swt.widgets.Shell;
import org.talend.core.IService;
import org.talend.core.model.metadata.builder.connection.Connection;
import org.talend.core.model.process.IContext;
import org.talend.core.model.properties.ContextItem;
import org.talend.designer.core.model.utils.emf.talendfile.ContextType;
import org.talend.repository.model.RepositoryNode;

/**
 * ggu class global comment. Detailled comment
 */
public interface IMetadataManagmentUiService extends IService {

    public String getAndOpenXSDFileDialog(Path initPath);

    public ContextType getContextTypeForContextMode(Connection connection);

    public ContextType getContextTypeForContextMode(Connection connection, String selectedContext, boolean defaultContext);

    public String getOriginalValue(ContextType contextType, final String value);

    public void openRepositoryContextWizard(RepositoryNode repositoryNode);

    public boolean isContextMode(Connection connection, String value);

    public boolean promptConfirmLauch(Shell shell, Connection connection, ContextItem contextItem);

    public IContext promptConfirmLauch(Shell shell, List<IContext> contexts, IContext defaultContext);

    /**
     * 
     * @param shell
     * @param context
     * @return
     * @deprecated use instead promptConfirmLauchIterateContexts
     */
    @Deprecated
    public boolean promptConfirmLauch(Shell shell, IContext context);

    /**
     * Iterate all variables from each context to check prompt needed
     * 
     * @param shell
     * @param contexts
     * @param context
     * @return
     */
    public boolean promptConfirmLauchIterateContexts(Shell shell, List<IContext> contexts, IContext context);

    public boolean isPromptNeeded(List<IContext> contexts);

}
