// ============================================================================
//
// Copyright (C) 2006-2021 Talaxie Inc. - www.deilink.fr
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talaxie SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.repository.generic.view.content;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.navigator.CommonNavigator;
import org.eclipse.ui.navigator.CommonViewer;
import org.talend.core.GlobalServiceRegister;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.model.utils.RepositoryManagerHelper;
import org.talend.core.repository.model.ProjectRepositoryNode;
import org.talend.core.runtime.services.IGenericDBService;
import org.talend.repository.model.IRepositoryNode;
import org.talend.repository.model.IRepositoryNode.ENodeType;
import org.talend.repository.model.IRepositoryNode.EProperties;
import org.talend.repository.model.RepositoryNode;
import org.talend.repository.navigator.RepoViewCommonNavigator;
import org.talend.repository.navigator.RepoViewCommonViewer;
import org.talend.repository.tester.MetadataNodeTester;
import org.talend.repository.viewer.content.ProjectRepoDirectChildrenNodeContentProvider;
import org.talend.repository.viewer.content.VisitResourceHelper;
import org.talend.repository.viewer.content.listener.ResourceCollectorVisitor;

public class MetadataGenericContentProvider extends ProjectRepoDirectChildrenNodeContentProvider {

    MetadataNodeTester metadataNodeTester = new MetadataNodeTester();

    private final class GenericNodeDirectChildrenNodeVisitor extends ResourceCollectorVisitor {

        /* (non-Javadoc)
         * @see org.talend.repository.viewer.content.listener.ResourceCollectorVisitor#getTopNodes()
         */
        @Override
        protected Set<RepositoryNode> getTopNodes() {
            return makeUpHideNodes(getTopLevelNodes());
        }

        @Override
        protected IRepositoryNode getTopNodeFromResourceDelta(final IResourceDelta delta) {
            if (ERepositoryObjectType.SNOWFLAKE == null) {
                return super.getTopNodeFromResourceDelta(delta);
            }
            Set<RepositoryNode> topLevelNodes = getTopNodes();
            IPath rootPath = new Path(ERepositoryObjectType.SNOWFLAKE.getFolder());
            IPath fullPath = delta.getFullPath();
            if (fullPath == null || fullPath.segmentCount() <= 1) {
                return ProjectRepositoryNode.getInstance();
            } else if (fullPath.removeFirstSegments(1).isPrefixOf(rootPath)) {
                return ProjectRepositoryNode.getInstance().getRootRepositoryNode(ERepositoryObjectType.METADATA_CONNECTIONS);
            }
            for (final RepositoryNode repoNode : topLevelNodes) {
                IPath topLevelNodeWorkspaceRelativePath = getTopLevelNodePath(repoNode);
                if (topLevelNodeWorkspaceRelativePath != null && topLevelNodeWorkspaceRelativePath.isPrefixOf(fullPath)) {
                    if (ERepositoryObjectType.SNOWFLAKE == repoNode.getContentType()) {
                        return ProjectRepositoryNode.getInstance()
                                .getRootRepositoryNode(ERepositoryObjectType.METADATA_CONNECTIONS);
                    }
                    return repoNode;
                }
            }

            // handle recyle of folder, since recycle status is only recorded in talend.project
            VisitResourceHelper visitHelper = new VisitResourceHelper(delta);
            boolean merged = ProjectRepositoryNode.getInstance().getMergeRefProject();
            IPath metadataPath = new Path(ERepositoryObjectType.METADATA.getFolder());
            if (metadataPath != null && visitHelper.valid(metadataPath, merged)) {
                return ProjectRepositoryNode.getInstance().getRootRepositoryNode(ERepositoryObjectType.METADATA);
            }
            // this visitor doesn't handle the current folder
            return null;
        }

        private Set<RepositoryNode> makeUpHideNodes(Set<RepositoryNode> topNodes){
            Set<RepositoryNode> nodes = new HashSet<RepositoryNode>(topNodes);
            List<ERepositoryObjectType> extraTypes = new ArrayList<ERepositoryObjectType>();
            IGenericDBService dbService = null;
            if (GlobalServiceRegister.getDefault().isServiceRegistered(IGenericDBService.class)) {
                dbService = (IGenericDBService) GlobalServiceRegister.getDefault().getService(
                        IGenericDBService.class);
            }
            if(dbService != null){
                extraTypes.addAll(dbService.getExtraTypes());
            }
            if (RepositoryManagerHelper.findRepositoryView() != null) {
                for (ERepositoryObjectType type : extraTypes) {
                    RepositoryNode jdbc = new RepositoryNode(null,
                            (RepositoryNode) RepositoryManagerHelper.findRepositoryView().getRoot(), ENodeType.SYSTEM_FOLDER);
                    jdbc.setProperties(EProperties.CONTENT_TYPE, type);
                    jdbc.setProperties(EProperties.LABEL, type.getType());
                    nodes.add(jdbc);
                }
            }
            if (ERepositoryObjectType.SNOWFLAKE != null) {
                nodes.add(ProjectRepositoryNode.getInstance().getGenericTopNodesMap()
                        .get(ERepositoryObjectType.SNOWFLAKE.getType()));
            }
            return nodes;
        }

        /* (non-Javadoc)
         * @see org.talend.repository.viewer.content.listener.ResourceCollectorVisitor#getTopLevelNodePath(org.talend.repository.model.RepositoryNode)
         */
        @Override
        protected IPath getTopLevelNodePath(RepositoryNode repoNode) {
            return getWorkspaceTopNodePath(repoNode);
        }
    }

    private GenericNodeDirectChildrenNodeVisitor genericNodeVisitor;

    @Override
    public Object[] getChildren(Object element) {
        if (!(element instanceof RepositoryNode)) {
            return super.getChildren(element);
        }
        RepositoryNode repoNode = (RepositoryNode) element;
        ProjectRepositoryNode projectRepositoryNode = (ProjectRepositoryNode) repoNode.getRoot();
        if (metadataNodeTester.isMetadataTopNode(repoNode)) {
            getTopLevelNodes().clear();
            projectRepositoryNode.getGenericTopNodesMap().entrySet().stream()
                    .filter(entry -> filterMergedNodeType(entry.getKey()))
                    .forEach(entry -> getTopLevelNodes().add(entry.getValue()));
            getAndStoreTopLevelNode(projectRepositoryNode); // so as to inherit common settings from parent.
            return getTopLevelNodes().toArray();
        }
        if (!repoNode.isInitialized() && getTopLevelNodes().contains(repoNode)) {
            projectRepositoryNode.initializeChildren(repoNode);
            repoNode.setInitialized(true);
        }
        return repoNode.getChildren().toArray();
    }

    private boolean filterMergedNodeType(String type) {
        ERepositoryObjectType snowflakeType = ERepositoryObjectType.SNOWFLAKE;
        if (snowflakeType != null) {
            return !snowflakeType.getType().equals(type);
        }
        return true;
    }

    @Override
    protected ProjectRepositoryNode getProjectRepositoryNode(RepositoryNode element) {
        Assert.isTrue(element instanceof ProjectRepositoryNode);
        return (ProjectRepositoryNode) element;
    }

    @Override
    protected void addResourceVisitor(CommonViewer v) {
        if (v == null) {
            return;
        }
        RepoViewCommonNavigator navigator = null;
        if (v instanceof RepoViewCommonViewer) {
            CommonNavigator commonNavigator = ((RepoViewCommonViewer) v).getCommonNavigator();
            if (commonNavigator instanceof RepoViewCommonNavigator) {
                navigator = ((RepoViewCommonNavigator) commonNavigator);
            }
        }
        if (navigator == null) {
            return;
        }
        if (this.genericNodeVisitor != null) {
            navigator.removeVisitor(this.genericNodeVisitor);
        }
        this.genericNodeVisitor = new GenericNodeDirectChildrenNodeVisitor();
        navigator.addVisitor(this.genericNodeVisitor);

    }

    @Override
    protected RepositoryNode getTopLevelNodeFromProjectRepositoryNode(ProjectRepositoryNode projectNode) {
        return null;
    }

    @Override
    public void dispose() {
        // visitor
        if (this.viewer != null && this.genericNodeVisitor != null && this.viewer instanceof RepoViewCommonViewer) {
            final Control control = this.viewer.getControl();
            if (control != null && !control.isDisposed()) {
                CommonNavigator commonNavigator = ((RepoViewCommonViewer) this.viewer).getCommonNavigator();
                if (commonNavigator instanceof RepoViewCommonNavigator) {
                    ((RepoViewCommonNavigator) commonNavigator).removeVisitor(this.genericNodeVisitor);
                }
            }
        }

        super.dispose();

    }

}
