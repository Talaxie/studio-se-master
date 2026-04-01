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

import java.util.function.BiFunction;

import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.graphics.Image;
import org.talend.core.GlobalServiceRegister;
import org.talend.core.IService;
import org.talend.core.model.components.IComponent;
import org.talend.core.model.metadata.builder.connection.Connection;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.model.repository.IRepositoryViewObject;
import org.talend.repository.model.RepositoryNode;

public interface ITCKUIService extends IService {
    
    RepositoryNode createTaCoKitRepositoryNode(RepositoryNode parent, ERepositoryObjectType repObjType,
            IRepositoryViewObject repositoryObject, Connection connection) throws Exception;

    Image getTCKImage(Object element, BiFunction<Image, IRepositoryViewObject, Image> decorator);

    boolean isTCKRepoistoryNode(RepositoryNode node);

    ERepositoryObjectType getTCKRepositoryType(String componentName);

    ERepositoryObjectType getTCKJDBCType();

    Wizard createTCKWizard(String type, IPath path);

    Wizard createTCKWizard(String type, IPath path, boolean isNew);

    Wizard editTCKWizard(RepositoryNode node);
       
    String getComponentFamilyName(IComponent component);

    public static ITCKUIService get() {
        if (GlobalServiceRegister.getDefault().isServiceRegistered(ITCKUIService.class)) {
            return GlobalServiceRegister.getDefault().getService(ITCKUIService.class);
        }
        return null;
    }

}
