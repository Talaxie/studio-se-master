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
package org.talend.sdk.component.studio.service;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.PlatformUI;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.core.model.components.IComponent;
import org.talend.core.model.metadata.builder.connection.Connection;
import org.talend.core.model.properties.ConnectionItem;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.model.repository.IRepositoryViewObject;
import org.talend.core.repository.model.ProjectRepositoryNode;
import org.talend.core.runtime.services.IGenericWizardService;
import org.talend.core.service.ITCKUIService;
import org.talend.repository.model.RepositoryNode;
import org.talend.sdk.component.server.front.model.ConfigTypeNode;
import org.talend.sdk.component.studio.ComponentModel;
import org.talend.sdk.component.studio.Lookups;
import org.talend.sdk.component.studio.metadata.TaCoKitCache;
import org.talend.sdk.component.studio.metadata.action.CreateTaCoKitConfigurationAction;
import org.talend.sdk.component.studio.metadata.action.EditTaCoKitConfigurationAction;
import org.talend.sdk.component.studio.metadata.model.TaCoKitConfigurationItemModel;
import org.talend.sdk.component.studio.metadata.model.TaCoKitConfigurationModel;
import org.talend.sdk.component.studio.metadata.node.ITaCoKitRepositoryNode;
import org.talend.sdk.component.studio.metadata.node.TaCoKitFamilyRepositoryNode;
import org.talend.sdk.component.studio.metadata.provider.TaCoKitMetadataContentProvider;
import org.talend.sdk.component.studio.ui.wizard.TaCoKitCreateWizard;
import org.talend.sdk.component.studio.ui.wizard.TaCoKitEditWizard;
import org.talend.sdk.component.studio.util.TCKImageCache;
import org.talend.sdk.component.studio.util.TaCoKitConst;
import org.talend.sdk.component.studio.util.TaCoKitSpeicalManager;

public class TCKUIService implements ITCKUIService {

    @Override
    public Image getTCKImage(Object element, BiFunction<Image, IRepositoryViewObject, Image> decorator) {
        return TCKImageCache.getImage(element, decorator);
    }

    @Override
    public boolean isTCKRepoistoryNode(RepositoryNode node) {
        return ITaCoKitRepositoryNode.class.isInstance(node);
    }

    @Override
    public ERepositoryObjectType getTCKRepositoryType(String componentName) {
        TaCoKitCache cache = Lookups.taCoKitCache();
        Map<String, ConfigTypeNode> configTypeNodeMap = cache.getConfigTypeNodeMap();
        ConfigTypeNode configTypeNode = configTypeNodeMap.values().stream().filter(n -> componentName.equals(n.getName()))
                .findFirst().orElse(null);
        if (configTypeNode != null) {
            return cache.getRepositoryObjectType2ConfigTypeNodeMap().entrySet().stream()
                    .filter(en -> en.getValue().equals(configTypeNode)).map(Map.Entry::getKey).findFirst().orElse(null);
        }
        return null;
    }

    @Override
    public ERepositoryObjectType getTCKJDBCType() {
        return getTCKRepositoryType(TaCoKitSpeicalManager.JDBC);
    }

    @Override
    public Wizard createTCKWizard(String type, IPath path) {
        return createTCKWizard(type, path, true);
    }

    @Override
    public Wizard createTCKWizard(String type, IPath path, boolean isNew) {
        String addtionalJDBCType = null;
        if (IGenericWizardService.get().getIfAdditionalJDBCDBType(type)) {
            addtionalJDBCType = type;
            type = getTCKJDBCType().getLabel();
        }
        String realType = type;
        TaCoKitCache cache = Lookups.taCoKitCache();
        Map<String, ConfigTypeNode> configTypeNodeMap = cache.getConfigTypeNodeMap();
        ConfigTypeNode configTypeNode = configTypeNodeMap.values().stream().filter(n -> realType.equals(n.getName())).findFirst()
                .orElse(null);
        CreateTaCoKitConfigurationAction createAction = null;
        if (configTypeNode != null) {
            Set<String> edges = configTypeNode.getEdges();
            if (edges != null && !edges.isEmpty()) {
                List<String> edgeArray = new LinkedList<String>(edges);
                Collections.sort(edgeArray);
                for (String edge : edgeArray) {
                    ConfigTypeNode subTypeNode = configTypeNodeMap.get(edge);
                    if (TaCoKitConst.CONFIG_NODE_ID_DATASTORE.equals(subTypeNode.getConfigurationType())) {
                        createAction = new CreateTaCoKitConfigurationAction(subTypeNode);
                        createAction.setAdditionalJDBCType(addtionalJDBCType);
                        break;
                    }
                }
            }
        }
        if (createAction != null) {
            try {
                RepositoryNode parent = ProjectRepositoryNode.getInstance()
                        .getRootRepositoryNode(ERepositoryObjectType.METADATA_CONNECTIONS, false);
                TaCoKitFamilyRepositoryNode fakeNode = new TaCoKitFamilyRepositoryNode(parent, configTypeNode.getDisplayName(),
                        configTypeNode);
                createAction.init(fakeNode);
                TaCoKitCreateWizard wizard = createAction.createWizard(PlatformUI.getWorkbench());
                wizard.setNew(isNew);
                wizard.setPathToSave(path);
                return wizard;
            } catch (Exception e) {
                ExceptionHandler.process(e);
            }
        }
        return null;
    }

    @Override
    public Wizard editTCKWizard(RepositoryNode node) {
        EditTaCoKitConfigurationAction editAction = new EditTaCoKitConfigurationAction();
        editAction.init(node);
        TaCoKitEditWizard wizard = editAction.createWizard(PlatformUI.getWorkbench());
        if (node.getObject() != null) {
            wizard.setPathToSave(new Path(node.getObject().getPath()));
        }
        return wizard;
    }

    @Override
    public RepositoryNode createTaCoKitRepositoryNode(RepositoryNode parent, ERepositoryObjectType repObjType,
            IRepositoryViewObject repositoryObject, Connection connection) throws Exception {
        ConnectionItem item = (ConnectionItem) repositoryObject.getProperty().getItem();
        TaCoKitConfigurationItemModel itemModule = new TaCoKitConfigurationItemModel(item);
        TaCoKitConfigurationModel module = new TaCoKitConfigurationModel(item.getConnection());
        return TaCoKitMetadataContentProvider.createLeafRepositoryNode(parent, null, itemModule, module.getConfigTypeNode(), repositoryObject);
    }
    
    @Override
    public String getComponentFamilyName(IComponent component) {
        if (component instanceof ComponentModel) {
            ComponentModel componentModel = (ComponentModel)component;
            return componentModel.getIndex().getFamilyDisplayName();
        }
        return null;
    }

}
