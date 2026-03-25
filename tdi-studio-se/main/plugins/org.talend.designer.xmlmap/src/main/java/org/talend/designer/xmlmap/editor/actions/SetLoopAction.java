package org.talend.designer.xmlmap.editor.actions;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchPart;
import org.talend.designer.xmlmap.i18n.Messages;
import org.talend.designer.xmlmap.model.emf.xmlmap.AbstractInOutTree;
import org.talend.designer.xmlmap.model.emf.xmlmap.Connection;
import org.talend.designer.xmlmap.model.emf.xmlmap.InputLoopNodesTable;
import org.talend.designer.xmlmap.model.emf.xmlmap.InputXmlTree;
import org.talend.designer.xmlmap.model.emf.xmlmap.LookupConnection;
import org.talend.designer.xmlmap.model.emf.xmlmap.NodeType;
import org.talend.designer.xmlmap.model.emf.xmlmap.OutputTreeNode;
import org.talend.designer.xmlmap.model.emf.xmlmap.OutputXmlTree;
import org.talend.designer.xmlmap.model.emf.xmlmap.TreeNode;
import org.talend.designer.xmlmap.parts.TreeNodeEditPart;
import org.talend.designer.xmlmap.ui.tabs.MapperManager;
import org.talend.designer.xmlmap.util.XmlMapUtil;

public class SetLoopAction extends SelectionAction {

    public static String ID = "xml map set as loop action";

    private MapperManager mapperManager;

    private boolean input;

    private TreeNodeEditPart nodePart;

    // private List<TreeNode> nodesNeedToChangeMainStatus = new ArrayList<TreeNode>();

    public SetLoopAction(IWorkbenchPart part) {
        super(part);
        setId(ID);
        setText("As loop element");
    }

    @Override
    protected boolean calculateEnabled() {
        // nodesNeedToChangeMainStatus.clear();
        if (getSelectedObjects().isEmpty()) {
            return false;
        }
        Object s = getSelectedObjects().get(0);
        if (s instanceof List && !((List) s).isEmpty()) {
            List selectedarts = (List) s;
            Object obj = selectedarts.get(selectedarts.size() - 1);
            if (obj instanceof TreeNodeEditPart) {
                nodePart = (TreeNodeEditPart) obj;
                TreeNode model = (TreeNode) nodePart.getModel();

                if (NodeType.ATTRIBUT.equals(model.getNodeType()) || NodeType.NAME_SPACE.equals(model.getNodeType())
                        || !(model.eContainer() instanceof TreeNode)) {
                    return false;
                }

                if (model.isLoop()) {
                    return false;
                }

            } else {
                return false;
            }
        }

        return true;
    }

    public void update(Object selection) {
        setSelection(new StructuredSelection(selection));
    }

    @Override
    public void run() {
        TreeNode model = (TreeNode) nodePart.getModel();

        TreeNode docRoot = XmlMapUtil.getTreeNodeRoot(model);
        AbstractInOutTree abstractTree = (AbstractInOutTree) docRoot.eContainer();
        boolean isLookup = abstractTree != mapperManager.getMainInputTree() && !(abstractTree instanceof OutputXmlTree);
        // remove old group
        if (model instanceof OutputTreeNode) {
            OutputTreeNode outputNode = (OutputTreeNode) model;
            if (docRoot != null) {
                XmlMapUtil.cleanSubGroup(outputNode);
                List<TreeNode> newLoopUpGroups = new ArrayList<TreeNode>();
                findUpGroupNode(newLoopUpGroups, outputNode);
                // clean all groups except the ancestor of new loop
                XmlMapUtil.cleanSubGroup(docRoot, newLoopUpGroups);

                // reset the group in case some element ancestor of loop element are not group but under the group
                if (!newLoopUpGroups.isEmpty()) {
                    TreeNode rootGroup = newLoopUpGroups.get(newLoopUpGroups.size() - 1);
                    upsetGroup(outputNode, rootGroup);
                }
            }
        }
        if (!isLookup) {

            // TDI-20147
            List<TreeNode> loopNodes = new ArrayList<TreeNode>();
            checkSubElementIsLoop(model, loopNodes);
            checkParentElementIsLoop(model, loopNodes);
            if (!loopNodes.isEmpty()) {
                if (MessageDialog.openConfirm(Display.getDefault().getActiveShell(),
                        Messages.getString("SetLoopAction.cleanSubLoopTitle"),
                        Messages.getString("SetLoopAction.cleanSubLoopMessages"))) {
                } else {
                    return;
                }
            }

            for (TreeNode treeNode : loopNodes) {
                treeNode.setLoop(false);
            }

            model.setLoop(true);

            XmlMapUtil.clearMainNode(model);
            XmlMapUtil.upsetMainNode(model);

            abstractTree.setMultiLoops(XmlMapUtil.checkMultiLoopsStatus(abstractTree));
            if (input) {
                // check if child is mapped to output remove the old loop in output node
                XmlMapUtil.removeloopInOutputTree(mapperManager, loopNodes);
                // disable the function to add sourceloop into InputLoopNodesTable automatically
                // add input loopNodes to InputLoopNodesTable
                // addInputLoopNodesToOutput(model, model);

            } else {
                // clean the InputLoopNodesTable for the old loops
                InputXmlTree mainInput = mapperManager.getMainInputTree();
                XmlMapUtil.removeLoopTableForOutput((OutputXmlTree) abstractTree, loopNodes, mainInput == null ? false
                        : mainInput.isMultiLoops());

            }
        } else {
            if (docRoot != null) {
                cleanSubLoop(docRoot);
            }
            model.setLoop(true);
            XmlMapUtil.clearMainNode(docRoot);
            XmlMapUtil.upsetMainNode(model);
        }
        if (abstractTree != null) {
            mapperManager.getProblemsAnalyser().checkProblems(abstractTree);
            mapperManager.getMapperUI().updateStatusBar();
        }
    }

    private void addInputLoopNodesToOutput(TreeNode loopNode, TreeNode loopOrChild) {
        addInputLoopNodesToOutput(loopNode, loopOrChild.getOutgoingConnections());
        // check related lookup nodes
        if (!loopOrChild.getLookupOutgoingConnections().isEmpty()) {
            for (LookupConnection lookupConnection : loopOrChild.getLookupOutgoingConnections()) {
                TreeNode lookupTarget = (TreeNode) lookupConnection.getTarget();
                addInputLoopNodesToOutput(loopNode, lookupTarget.getOutgoingConnections());
            }

        }

        if (!loopOrChild.getChildren().isEmpty()) {
            for (TreeNode child : loopOrChild.getChildren()) {
                addInputLoopNodesToOutput(loopNode, child);
            }
        }
    }

    private void addInputLoopNodesToOutput(TreeNode loopNode, List<Connection> connections) {
        for (Connection connection : connections) {
            if (connection.getTarget() instanceof OutputTreeNode) {
                OutputTreeNode loopParentNode = (OutputTreeNode) XmlMapUtil.getLoopParentNode((OutputTreeNode) connection
                        .getTarget());
                if (loopParentNode != null) {
                    if (loopParentNode.getInputLoopNodesTable() != null) {
                        loopParentNode.getInputLoopNodesTable().getInputloopnodes().add(loopNode);
                    }
                } else {
                    OutputXmlTree abstractInOutTree = (OutputXmlTree) XmlMapUtil.getAbstractInOutTree((OutputTreeNode) connection
                            .getTarget());
                    if (!XmlMapUtil.hasDocument(abstractInOutTree)) {
                        EList<InputLoopNodesTable> inputLoopNodesTables = abstractInOutTree.getInputLoopNodesTables();
                        if (inputLoopNodesTables.size() == 1) {
                            InputLoopNodesTable inputLoopNodesTable = inputLoopNodesTables.get(0);
                            inputLoopNodesTable.getInputloopnodes().add(loopNode);
                        }
                    }
                }
            }
        }
    }

    private void cleanSubLoop(TreeNode docRoot) {
        for (TreeNode treeNode : docRoot.getChildren()) {
            if (treeNode.isLoop()) {
                treeNode.setLoop(false);
            }
            cleanSubLoop(treeNode);
        }
    }

    private void checkSubElementIsLoop(TreeNode subTreeNode, List<TreeNode> subLoops) {
        if (subTreeNode == null) {
            return;
        }
        TreeNode e = subTreeNode;
        if (e.isLoop()) {
            subLoops.add(e);
        }
        for (TreeNode treeNode : subTreeNode.getChildren()) {
            checkSubElementIsLoop(treeNode, subLoops);
        }
    }

    private void checkParentElementIsLoop(TreeNode subTreeNode, List<TreeNode> subLoops) {
        if (subTreeNode == null) {
            return;
        }
        TreeNode e = subTreeNode;
        if (e.isLoop()) {
            subLoops.add(e);
        }
        if (e.eContainer() instanceof TreeNode) {
            checkParentElementIsLoop((TreeNode) e.eContainer(), subLoops);
        }
    }

    private void getLoopNode(TreeNode pNode, List<TreeNode> loopNodeList) {
        if (pNode == null) {
            return;
        }
        TreeNode e = pNode;
        if (e.isLoop()) {
            loopNodeList.add(e);
        }
        for (TreeNode treeNode : pNode.getChildren()) {
            getLoopNode(treeNode, loopNodeList);
        }
    }

    private void findUpGroupNode(List<TreeNode> newLoopUpGroups, OutputTreeNode node) {
        if (node.eContainer() instanceof OutputTreeNode) {
            OutputTreeNode parent = (OutputTreeNode) node.eContainer();
            if (parent.isGroup()) {
                newLoopUpGroups.add(parent);
            }
            findUpGroupNode(newLoopUpGroups, parent);
        }
    }

    private void upsetGroup(TreeNode node, TreeNode rootGroup) {
        if (node.eContainer() instanceof TreeNode && rootGroup != node.eContainer()) {
            TreeNode parent = (TreeNode) node.eContainer();
            if (!parent.isGroup()) {
                if (parent.isChoice() || parent.isSubstitution()) {
                    parent.setGroup(false);
                } else {
                    parent.setGroup(true);
                }
            }
        }
    }

    public void setMapperManager(MapperManager mapperManager) {
        this.mapperManager = mapperManager;
    }

    public boolean isInput() {
        return input;
    }

    public void setInput(boolean input) {
        this.input = input;
    }

}
