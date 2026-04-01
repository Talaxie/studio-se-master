// ============================================================================
//
// Copyright (C) 2006-2022 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.metadata.managment.ui.convert.strategy;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.exception.PersistenceException;
import org.talend.core.hadoop.IHadoopClusterService;
import org.talend.core.hadoop.repository.HadoopRepositoryUtil;
import org.talend.core.model.context.ContextUtils;
import org.talend.core.model.metadata.builder.connection.Connection;
import org.talend.core.model.properties.ConnectionItem;
import org.talend.core.model.properties.ContextItem;
import org.talend.core.model.properties.Item;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.model.repository.IRepositoryViewObject;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.metadata.managment.ui.utils.ConnectionContextHelper;
import org.talend.metadata.managment.ui.utils.ISwitchContext;
import org.talend.repository.ProjectManager;
import org.talend.repository.model.IProxyRepositoryFactory;


public abstract class AbstractSwitchContextStrategy implements ISwitchContext {

    private static Logger log = Logger.getLogger(AbstractSwitchContextStrategy.class);

    @Override
    public boolean updateContextGroup(ConnectionItem connItem, String selectedContext) {
        return updateContextGroup(connItem, selectedContext, null);
    }

    @Override
    public boolean updateContextForConnectionItems(Map<String, String> contextGroupRanamedMap,
            ContextItem contextItem) {
        if (contextItem == null) {
            return false;
        }
        IProxyRepositoryFactory factory = ProxyRepositoryFactory.getInstance();
        try {
            List<IRepositoryViewObject> allConnectionItem =
                    factory.getAll(ProjectManager.getInstance().getCurrentProject(),
                            ERepositoryObjectType.METADATA_CONNECTIONS);

            for (IRepositoryViewObject connectionItem : allConnectionItem) {
                Item item = connectionItem.getProperty().getItem();
                if (item instanceof ConnectionItem
                        && ConnectionContextHelper.checkContextMode((ConnectionItem) item) != null) {
                    Connection con = ((ConnectionItem) item).getConnection();
                    String contextId = con.getContextId();
                    if (contextId != null && contextId.equals(contextItem.getProperty().getId())) {
                        String oldContextGroup = con.getContextName();
                        boolean modified = false;
                        if (oldContextGroup != null && !"".equals(oldContextGroup)) { //$NON-NLS-1$
                            String newContextGroup = contextGroupRanamedMap.get(oldContextGroup);
                            if (newContextGroup != null) { // rename
                                con.setContextName(newContextGroup);
                                modified = true;
                            }
                        } else { // if not set, set default group
                            ContextItem originalItem = ContextUtils.getContextItemById2(contextId);
                            con.setContextName(originalItem.getDefaultContext());
                            modified = true;
                        }
                        if (modified) {
                            factory.save(item);
                        }
                    }
                }
            }

            IHadoopClusterService hadoopClusterService = HadoopRepositoryUtil.getHadoopClusterService();
            if (hadoopClusterService != null) {
                hadoopClusterService.updateConfJarsByContextGroup(contextItem, contextGroupRanamedMap);
            }

            return true;
        } catch (PersistenceException e) {
            ExceptionHandler.process(e);
        }
        return false;
    }

    protected void saveConnection(ConnectionItem connItem, boolean... isMigrationTask) {
        IProxyRepositoryFactory factory = ProxyRepositoryFactory.getInstance();
        try {
            factory.save(connItem, isMigrationTask);
        } catch (PersistenceException e) {
            log.error(e, e);
        }
    }

}
