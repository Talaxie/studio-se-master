package org.talend.repository.hadoopcluster.ui.viewer.handler;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.talend.commons.exception.PersistenceException;
import org.talend.commons.ui.runtime.image.IImage;
import org.talend.core.database.conn.ConnParameterKeys;
import org.talend.core.database.conn.template.EDatabaseConnTemplate;
import org.talend.core.model.general.Project;
import org.talend.core.model.metadata.MetadataManager;
import org.talend.core.model.metadata.builder.connection.DatabaseConnection;
import org.talend.core.model.properties.DatabaseConnectionItem;
import org.talend.core.model.properties.Item;
import org.talend.core.model.properties.Property;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.model.repository.IRepositoryTypeProcessor;
import org.talend.core.model.repository.IRepositoryViewObject;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.core.repository.utils.XmiResourceManager;
import org.talend.repository.ProjectManager;
import org.talend.repository.hadoopcluster.node.model.HadoopClusterRepositoryNodeType;
import org.talend.repository.hadoopcluster.ui.HadoopClusterWizard;
import org.talend.repository.hadoopcluster.ui.viewer.HadoopClusterRepositoryTypeProcessor;
import org.talend.repository.hadoopcluster.ui.viewer.HadoopSubnodeRepositoryContentManager;
import org.talend.repository.hadoopcluster.util.EHadoopClusterImage;
import org.talend.repository.model.IProxyRepositoryFactory;
import org.talend.repository.model.IRepositoryNode;
import org.talend.repository.model.IRepositoryNode.ENodeType;
import org.talend.repository.model.RepositoryNode;
import org.talend.repository.model.hadoopcluster.HadoopClusterConnection;
import org.talend.repository.model.hadoopcluster.HadoopClusterConnectionItem;
import org.talend.repository.model.hadoopcluster.HadoopClusterFactory;
import org.talend.repository.model.hadoopcluster.HadoopClusterPackage;
import orgomg.cwm.foundation.businessinformation.BusinessinformationPackage;

/**
 * 
 * created by ycbai on 2013-1-21 Detailled comment
 * 
 */
public class HadoopClusterRepositoryContentHandler extends AbstractHadoopRepositoryContentHandler {

    private XmiResourceManager xmiResourceManager = new XmiResourceManager();

    @Override
    public boolean isProcess(Item item) {
        if (item.eClass() == HadoopClusterPackage.Literals.HADOOP_CLUSTER_CONNECTION_ITEM) {
            return true;
        }

        return false;
    }

    @Override
    public boolean isRepObjType(ERepositoryObjectType type) {
        return type == HadoopClusterRepositoryNodeType.HADOOPCLUSTER;
    }

    @Override
    public ERepositoryObjectType getProcessType() {
        return HadoopClusterRepositoryNodeType.HADOOPCLUSTER;
    }

    @Override
    public Resource create(IProject project, Item item, int classifierID, IPath path) throws PersistenceException {
        Resource itemResource = null;
        if (item.eClass() == HadoopClusterPackage.Literals.HADOOP_CLUSTER_CONNECTION_ITEM) {
            ERepositoryObjectType type = HadoopClusterRepositoryNodeType.HADOOPCLUSTER;
            itemResource = create(project, (HadoopClusterConnectionItem) item, path, type);
        }

        return itemResource;
    }

    private Resource create(IProject project, HadoopClusterConnectionItem item, IPath path, ERepositoryObjectType type)
            throws PersistenceException {
        Resource itemResource = xmiResourceManager.createItemResource(project, item, path, type, false);
        itemResource.getContents().add(item.getConnection());

        return itemResource;
    }

    @Override
    public Resource save(Item item) throws PersistenceException {
        Resource itemResource = null;
        if (item.eClass() == HadoopClusterPackage.Literals.HADOOP_CLUSTER_CONNECTION_ITEM) {
            itemResource = save((HadoopClusterConnectionItem) item);
        }

        return itemResource;
    }

    private Resource save(HadoopClusterConnectionItem item) {
        Resource itemResource = xmiResourceManager.getItemResource(item);
        itemResource.getContents().clear();
        MetadataManager.addContents(item, itemResource);

        // add to the current resource all Document and Description instances because they are not reference in
        // containment references.
        Map<EObject, Collection<Setting>> externalCrossref = EcoreUtil.ExternalCrossReferencer.find(item.getConnection());
        Collection<Object> documents = EcoreUtil.getObjectsByType(externalCrossref.keySet(),
                BusinessinformationPackage.Literals.DOCUMENT);
        for (Object doc : documents) {
            itemResource.getContents().add((EObject) doc);
        }
        Collection<Object> descriptions = EcoreUtil.getObjectsByType(externalCrossref.keySet(),
                BusinessinformationPackage.Literals.DESCRIPTION);
        for (Object doc : descriptions) {
            itemResource.getContents().add((EObject) doc);
        }

        return itemResource;
    }

    @Override
    public IImage getIcon(ERepositoryObjectType type) {
        if (type == HadoopClusterRepositoryNodeType.HADOOPCLUSTER) {
            return EHadoopClusterImage.HADOOPCLUSTER_RESOURCE_ICON;
        }

        return null;
    }

    @Override
    public Item createNewItem(ERepositoryObjectType type) {
        Item item = null;
        if (type == HadoopClusterRepositoryNodeType.HADOOPCLUSTER) {
            item = HadoopClusterFactory.eINSTANCE.createHadoopClusterConnectionItem();
        }

        return item;
    }

    @Override
    public ERepositoryObjectType getRepositoryObjectType(Item item) {
        ERepositoryObjectType type = null;
        if (item.eClass() == HadoopClusterPackage.Literals.HADOOP_CLUSTER_CONNECTION_ITEM) {
            type = HadoopClusterRepositoryNodeType.HADOOPCLUSTER;
        }

        return type;
    }

    @Override
    public void addNode(ERepositoryObjectType type, RepositoryNode parentNode, IRepositoryViewObject repositoryObject,
            RepositoryNode node) {
        if (type == HadoopClusterRepositoryNodeType.HADOOPCLUSTER) {
            Project project = new Project(ProjectManager.getInstance().getProject(node.getObject().getProperty()));
            for (IHadoopSubnodeRepositoryContentHandler handler : HadoopSubnodeRepositoryContentManager.getHandlers()) {
                handler.addNode(project, node);
            }
            addHadoopDBNode(project, node);
        }
    }

    private void addHadoopDBNode(Project project, RepositoryNode parentNode) {
        String id = parentNode.getObject().getId();

        Map<String, List<DatabaseConnectionItem>> dbItemMap = getLinkedDbMap(project).get(id);
        if (dbItemMap != null && dbItemMap.size() > 0) {
            // if existed linked DBs
            RepositoryNode dbRootNode = (RepositoryNode) parentNode.getRoot().getRootRepositoryNode(
                    ERepositoryObjectType.METADATA_CONNECTIONS);
            if (dbRootNode == null || !dbRootNode.isInitialized()) { // init database
                dbRootNode = parentNode.getRoot().getRootRepositoryNode(ERepositoryObjectType.METADATA_CONNECTIONS, true);
            }
            Map<String, IRepositoryNode> linkedDbNodesMap = getLinkedDbNodesMap(dbRootNode);

            Iterator<Entry<String, List<DatabaseConnectionItem>>> iterator = dbItemMap.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<String, List<DatabaseConnectionItem>> entry = iterator.next();
                List<DatabaseConnectionItem> dbItems = entry.getValue();
                EDatabaseConnTemplate dbTemplate = EDatabaseConnTemplate.indexOfTemplate(entry.getKey());
                RepositoryNode hadoopFolderNode = createHadoopFolderNode(parentNode, ERepositoryObjectType.METADATA_CONNECTIONS,
                        dbTemplate.getDBDisplayName(), dbItems.size());
                parentNode.getChildren().add(hadoopFolderNode);
                for (DatabaseConnectionItem dbItem : dbItems) {
                    RepositoryNode hadoopSubNode = createHadoopSubNode(hadoopFolderNode, dbItem);
                    IRepositoryNode dbNode = linkedDbNodesMap.get(dbItem.getProperty().getId());
                    if (dbNode != null) { // add the children, make sure be same as DB connections
                        hadoopSubNode.getChildren().addAll(dbNode.getChildren());
                    }
                }
            }
        }
    }

    /**
     * 
     * Find all Hive or HBase to be linked hadoop cluster.
     */
    private Map<String, IRepositoryNode> getLinkedDbNodesMap(IRepositoryNode curNode) {
        Map<String, IRepositoryNode> linkedDbNodesMap = new HashMap<String, IRepositoryNode>();

        if (curNode.getType() == ENodeType.SIMPLE_FOLDER || curNode.getType() == ENodeType.SYSTEM_FOLDER) {
            List<IRepositoryNode> children = curNode.getChildren();
            for (IRepositoryNode node : children) {
                // add sub folders
                linkedDbNodesMap.putAll(getLinkedDbNodesMap(node));
            }
        } else {
            if (curNode.getObject() != null) {
                Property property = curNode.getObject().getProperty();
                if (property.getItem() instanceof DatabaseConnectionItem) {
                    DatabaseConnectionItem item = (DatabaseConnectionItem) property.getItem();
                    DatabaseConnection connection = (DatabaseConnection) item.getConnection();
                    String hcId = connection.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_HADOOP_CLUSTER_ID);
                    if (hcId != null) { // linked DB, for Hive and HBase
                        linkedDbNodesMap.put(property.getId(), curNode);
                    }
                }
            }
        }

        return linkedDbNodesMap;
    }

    private Map<String, Map<String, List<DatabaseConnectionItem>>> getLinkedDbMap(Project project) {
        Map<String, Map<String, List<DatabaseConnectionItem>>> linkedDbMap = new HashMap<String, Map<String, List<DatabaseConnectionItem>>>();
        try {
            List<IRepositoryViewObject> repObjs = ProxyRepositoryFactory.getInstance().getAll(project,
                    ERepositoryObjectType.METADATA_CONNECTIONS);
            for (IRepositoryViewObject repObj : repObjs) {
                if (repObj != null && repObj.getProperty() != null) {
                    DatabaseConnectionItem item = (DatabaseConnectionItem) repObj.getProperty().getItem();
                    DatabaseConnection connection = (DatabaseConnection) item.getConnection();
                    String hcId = connection.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_HADOOP_CLUSTER_ID);
                    if (hcId != null) {
                        Map<String, List<DatabaseConnectionItem>> dbItemMap = linkedDbMap.get(hcId);
                        if (dbItemMap == null) {
                            dbItemMap = new HashMap<String, List<DatabaseConnectionItem>>();
                            linkedDbMap.put(hcId, dbItemMap);
                        }
                        List<DatabaseConnectionItem> itemList = dbItemMap.get(connection.getDatabaseType());
                        if (itemList == null) {
                            itemList = new ArrayList<DatabaseConnectionItem>();
                            dbItemMap.put(connection.getDatabaseType(), itemList);
                        }
                        itemList.add(item);
                    }
                }
            }
        } catch (PersistenceException e) {
            // dont care...
        }

        return linkedDbMap;
    }

    @Override
    public ERepositoryObjectType getHandleType() {
        return HadoopClusterRepositoryNodeType.HADOOPCLUSTER;
    }

    @Override
    public boolean hasSchemas() {
        return true;
    }

    @Override
    public IWizard newWizard(IWorkbench workbench, boolean creation, RepositoryNode node, String[] existingNames) {
        if (node == null) {
            return null;
        }
        if (workbench == null) {
            workbench = PlatformUI.getWorkbench();
        }

        return new HadoopClusterWizard(workbench, creation, node, existingNames);
    }

    @Override
    protected void deleteNode(Item item) throws Exception {
        final IProxyRepositoryFactory factory = ProxyRepositoryFactory.getInstance();
        Project project = new Project(ProjectManager.getInstance().getProject(item.getProperty()));
        HadoopClusterConnectionItem hadoopClusterItem = (HadoopClusterConnectionItem) item;
        HadoopClusterConnection connection = (HadoopClusterConnection) hadoopClusterItem.getConnection();
        List<String> connectionList = connection.getConnectionList();
        for (String connId : connectionList) {
            IRepositoryViewObject repObj = null;
            try {
                repObj = factory.getLastVersion(project, connId);
            } catch (PersistenceException e) {
                // do nothing.
            }
            if (repObj != null) {
                factory.deleteObjectPhysical(repObj);
            }
        }
        connection.getConnectionList().clear();
        factory.save(hadoopClusterItem);

        // Disconnect db connection to hadoop cluster.
        String clusterId = hadoopClusterItem.getProperty().getId();
        List<IRepositoryViewObject> repObjs = ProxyRepositoryFactory.getInstance().getAll(project,
                ERepositoryObjectType.METADATA_CONNECTIONS);
        for (IRepositoryViewObject repObj : repObjs) {
            if (repObj != null && repObj.getProperty() != null) {
                DatabaseConnectionItem dbItem = (DatabaseConnectionItem) repObj.getProperty().getItem();
                DatabaseConnection dbConnection = (DatabaseConnection) dbItem.getConnection();
                String hcId = dbConnection.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_HADOOP_CLUSTER_ID);
                if (clusterId.equals(hcId)) {
                    dbConnection.getParameters().put(ConnParameterKeys.CONN_PARA_KEY_HADOOP_CLUSTER_ID, null);
                    factory.save(dbItem);
                }
            }
        }
    }

    @Override
    public IRepositoryTypeProcessor getRepositoryTypeProcessor(String repositoryType) {
        ERepositoryObjectType processType = getProcessType();
        if (repositoryType != null && processType != null && repositoryType.equals(processType.getType())) {
            return new HadoopClusterRepositoryTypeProcessor(repositoryType);
        }

        return null;
    }

}
