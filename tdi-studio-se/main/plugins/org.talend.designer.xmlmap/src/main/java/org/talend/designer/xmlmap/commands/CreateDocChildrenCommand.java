package org.talend.designer.xmlmap.commands;

import org.eclipse.emf.common.util.EList;
import org.eclipse.gef.commands.Command;
import org.talend.core.model.utils.TalendTextUtils;
import org.talend.designer.gefabstractmap.dnd.TransferdType;
import org.talend.designer.gefabstractmap.dnd.TransferedObject;
import org.talend.designer.xmlmap.dnd.CreateNodeConnectionRequest;
import org.talend.designer.xmlmap.model.emf.xmlmap.AbstractNode;
import org.talend.designer.xmlmap.model.emf.xmlmap.Connection;
import org.talend.designer.xmlmap.model.emf.xmlmap.NodeType;
import org.talend.designer.xmlmap.model.emf.xmlmap.OutputTreeNode;
import org.talend.designer.xmlmap.model.emf.xmlmap.TreeNode;
import org.talend.designer.xmlmap.model.emf.xmlmap.VarNode;
import org.talend.designer.xmlmap.model.emf.xmlmap.VarTable;
import org.talend.designer.xmlmap.model.emf.xmlmap.XmlMapData;
import org.talend.designer.xmlmap.model.emf.xmlmap.XmlmapFactory;
import org.talend.designer.xmlmap.parts.OutputTreeNodeEditPart;
import org.talend.designer.xmlmap.parts.TreeNodeEditPart;
import org.talend.designer.xmlmap.parts.VarNodeEditPart;
import org.talend.designer.xmlmap.ui.tabs.MapperManager;
import org.talend.designer.xmlmap.util.XmlMapUtil;

public class CreateDocChildrenCommand extends Command {

    TransferedObject objects;

    private OutputTreeNodeEditPart targetEditPart;

    private MapperManager manager;

    private XmlMapData xmlMapData;

    private CreateNodeConnectionRequest rq;

    public CreateDocChildrenCommand(TransferedObject objects, OutputTreeNodeEditPart targetEditPart,
            CreateNodeConnectionRequest rq, MapperManager manager) {
        this.objects = objects;
        this.targetEditPart = targetEditPart;
        this.rq = rq;
        this.manager = manager;
        this.xmlMapData = manager.getExternalData();
    }

    @Override
    public void execute() {
        // only drop output can create a new node now
        OutputTreeNode targetOutputNode = (OutputTreeNode) targetEditPart.getModel();
        String expression = "";

        if (objects.getToTransfer() != null) {
            for (Object obj : objects.getToTransfer()) {
                OutputTreeNode createdNode = (OutputTreeNode) rq.getNewObject();
                AbstractNode source = null;
                if (objects.getType() == TransferdType.INPUT) {
                    TreeNodeEditPart part = (TreeNodeEditPart) obj;
                    TreeNode sourceNode = (TreeNode) part.getModel();
                    source = sourceNode;
                    createdNode.setName(sourceNode.getName());
                    createdNode.setType(sourceNode.getType());
                    createdNode.setPattern(sourceNode.getPattern());
                    expression = XmlMapUtil.convertToExpression(sourceNode.getXpath());
                    createdNode.setExpression(expression);

                    // INPUT => OUTPUT
                    if (createdNode instanceof OutputTreeNode) {
                        if (NodeType.NAME_SPACE.equals(sourceNode.getNodeType())) {
                            // namespace and only be droped as namespace
                            createdNode.setDefaultValue(sourceNode.getDefaultValue());
                        }
                        createdNode.setXpath(XmlMapUtil.getXPath(targetOutputNode.getXpath(), createdNode.getName(),
                                createdNode.getNodeType()));
                        createdNode.setExpression(XmlMapUtil.convertToExpression(sourceNode.getXpath()));

                        EList<TreeNode> sourceChildren = sourceNode.getChildren();
                        if (!sourceChildren.isEmpty()) {
                            // children must be attribute or namespace
                            for (TreeNode child : sourceChildren) {
                                OutputTreeNode childTarget = XmlmapFactory.eINSTANCE.createOutputTreeNode();
                                childTarget.setName(child.getName());
                                childTarget.setType(child.getType());
                                childTarget.setPattern(child.getPattern());
                                childTarget.setNodeType(child.getNodeType());
                                childTarget.setXpath(XmlMapUtil.getXPath(createdNode.getXpath(), childTarget.getName(),
                                        childTarget.getNodeType()));
                                createdNode.getChildren().add(childTarget);

                                if (NodeType.NAME_SPACE.equals(child.getNodeType())) {
                                    childTarget.setDefaultValue(child.getDefaultValue());
                                    // default value is already set as from source , no need the expression to get
                                    // default value
                                    childTarget.setExpression("");
                                } else {
                                    childTarget.setExpression(XmlMapUtil.convertToExpression(child.getXpath()));
                                    createConnection(child, childTarget);
                                }
                            }
                        }
                        // disable function of add source loop to target InputLoopNodesTable
                        // InputLoopTableUtil
                        // .addSourceLoopToInputLoopTable(sourceNode, targetOutputNode, manager.getMainInputTree());
                    }
                } else if (objects.getType() == TransferdType.VAR) {
                    // VARE ==>OUTPUT
                    VarNodeEditPart part = (VarNodeEditPart) obj;
                    VarNode sourceNode = (VarNode) part.getModel();
                    source = sourceNode;
                    String variable = sourceNode.getName();
                    createdNode.setName(variable);
                    createdNode.setXpath(XmlMapUtil.getXPath(targetOutputNode.getXpath(), createdNode.getName(),
                            createdNode.getNodeType()));
                    if (sourceNode.eContainer() instanceof VarTable) {
                        VarTable container = (VarTable) sourceNode.eContainer();
                        variable = container.getName() + TalendTextUtils.JAVA_END_STRING + variable;
                    }
                    createdNode.setExpression(variable);
                }
                targetOutputNode.getChildren().add(createdNode);
                createConnection(source, createdNode);
                if (!XmlMapUtil.isExpressionEditable(targetOutputNode)) {
                    targetOutputNode.setExpression("");
                    if (targetOutputNode.isAggregate()) {
                        targetOutputNode.setAggregate(false);
                    }
                }
            }
        }
    }

    private void createConnection(AbstractNode sourceNode, AbstractNode targetNode) {
        Connection conn = XmlmapFactory.eINSTANCE.createConnection();
        conn.setSource(sourceNode);
        conn.setTarget(targetNode);
        targetNode.getIncomingConnections().add(conn);
        sourceNode.getOutgoingConnections().add(conn);
        if (xmlMapData != null) {
            xmlMapData.getConnections().add(conn);
        }
    }

}
