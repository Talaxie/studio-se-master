package org.talend.designer.xmlmap.editor.actions;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IWorkbenchPart;
import org.talend.designer.xmlmap.model.emf.xmlmap.AbstractInOutTree;
import org.talend.designer.xmlmap.model.emf.xmlmap.NodeType;
import org.talend.designer.xmlmap.model.emf.xmlmap.OutputTreeNode;
import org.talend.designer.xmlmap.model.emf.xmlmap.OutputXmlTree;
import org.talend.designer.xmlmap.model.emf.xmlmap.TreeNode;
import org.talend.designer.xmlmap.parts.OutputTreeNodeEditPart;
import org.talend.designer.xmlmap.util.XmlMapUtil;

public class SetGroupAction extends SelectionAction {

    public static String ID = "xml map set as group action";

    private boolean isRemove;

    private List<TreeNode> subGroupTraceNames = new ArrayList<TreeNode>();

    private OutputTreeNodeEditPart nodePart;

    public SetGroupAction(IWorkbenchPart part) {
        super(part);
        setId(ID);
        setText("As group element");
    }

    @Override
    protected boolean calculateEnabled() {
        subGroupTraceNames.clear();
        if (getSelectedObjects().isEmpty()) {
            return false;
        }
        Object s = getSelectedObjects().get(0);
        if (s instanceof List && !((List) s).isEmpty()) {
            List selectedarts = (List) s;
            Object obj = selectedarts.get(selectedarts.size() - 1);
            if (obj instanceof OutputTreeNodeEditPart) {
                nodePart = (OutputTreeNodeEditPart) obj;
                OutputTreeNode model = (OutputTreeNode) nodePart.getModel();

                if (model.eContainer() instanceof TreeNode
                        && XmlMapUtil.DOCUMENT.equals(((TreeNode) model.eContainer()).getType())) {
                    return false;
                }

                if (NodeType.ATTRIBUT.equals(model.getNodeType()) || NodeType.NAME_SPACE.equals(model.getNodeType())
                        || !(model.eContainer() instanceof TreeNode) || model.isChoice() || model.isSubstitution()) { //$NON-NLS-N$
                    return false;
                }

                // fixed for TDI-20808 ,disable group and aggregate for 501
                AbstractInOutTree abstractTree = XmlMapUtil.getAbstractInOutTree(model);
                if (abstractTree instanceof OutputXmlTree) {
                    OutputXmlTree outputTree = ((OutputXmlTree) abstractTree);
                    if (outputTree.isMultiLoops()) {
                        return false;
                    }
                }

                OutputTreeNode findDownLoopNode = findDownLoopNode(model);
                if (findDownLoopNode == null) {
                    return false;
                }

                if (!model.isGroup()) {
                    setText("As group element");
                    isRemove = false;
                } else {
                    setText("Remove group element");
                    isRemove = true;
                }

                if (isRemove) {
                    if (model.isGroup()) {
                        return true;
                    } else {
                        return false;
                    }
                }

            } else {
                return false;
            }
        }

        return true;
    }

    private OutputTreeNode findDownLoopNode(OutputTreeNode treeNode) {

        for (TreeNode child : treeNode.getChildren()) {
            if (child.isLoop() && child instanceof OutputTreeNode) {
                findGroupNodeTrace(subGroupTraceNames, child);
                return (OutputTreeNode) child;
            } else {
                OutputTreeNode findDownLoopNode = findDownLoopNode((OutputTreeNode) child);
                if (findDownLoopNode != null) {
                    return findDownLoopNode;
                } else {
                    continue;
                }
            }

        }
        return null;
    }

    private void findGroupNodeTrace(List list, TreeNode loopNode) {
        if (nodePart != null) {
            OutputTreeNode selectedNode = (OutputTreeNode) nodePart.getModel();
            OutputTreeNode rootNode = null;
            if (loopNode instanceof OutputTreeNode) {
                rootNode = (OutputTreeNode) XmlMapUtil.getTreeNodeRoot(loopNode);
            }
            Object parentNode = loopNode.eContainer();
            if (parentNode instanceof OutputTreeNode && rootNode != null) {
                OutputTreeNode parent = (OutputTreeNode) parentNode;
                if (!parent.equals(rootNode)) {
                    if (!parent.equals(selectedNode)) {
                        list.add(parent);
                        findGroupNodeTrace(list, parent);
                    } else if (parent.equals(selectedNode)) {
                        list.add(parent);
                    }
                }
            }
        }

    }

    public void update(Object selection) {
        setSelection(new StructuredSelection(selection));
    }

    @Override
    public void run() {
        OutputTreeNode model = (OutputTreeNode) nodePart.getModel();
        OutputTreeNode outputDocumentRoot = (OutputTreeNode) XmlMapUtil.getTreeNodeRoot(model);
        if (outputDocumentRoot != null) {
            XmlMapUtil.cleanSubGroup(outputDocumentRoot);
        }
        if (!isRemove) {
            model.setGroup(true);
            if (!subGroupTraceNames.isEmpty()) {
                for (TreeNode groupNode : subGroupTraceNames) {
                    if (groupNode.isChoice() || groupNode.isSubstitution()) {
                        groupNode.setGroup(false);
                    } else {
                        groupNode.setGroup(true);
                    }
                }
            }
        } else {
            model.setGroup(false);
            if (!subGroupTraceNames.isEmpty()) {
                for (TreeNode groupNode : subGroupTraceNames) {
                    groupNode.setGroup(false);
                }
            }
        }
    }

}
