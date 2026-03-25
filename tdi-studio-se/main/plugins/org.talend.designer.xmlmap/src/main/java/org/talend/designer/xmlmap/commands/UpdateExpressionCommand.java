package org.talend.designer.xmlmap.commands;

import org.eclipse.gef.commands.Command;
import org.talend.designer.gefabstractmap.dnd.TransferdType;
import org.talend.designer.gefabstractmap.dnd.TransferedObject;
import org.talend.designer.gefabstractmap.part.TableEntityPart;
import org.talend.designer.xmlmap.model.emf.xmlmap.AbstractNode;
import org.talend.designer.xmlmap.model.emf.xmlmap.Connection;
import org.talend.designer.xmlmap.model.emf.xmlmap.LookupConnection;
import org.talend.designer.xmlmap.model.emf.xmlmap.NodeType;
import org.talend.designer.xmlmap.model.emf.xmlmap.OutputTreeNode;
import org.talend.designer.xmlmap.model.emf.xmlmap.TreeNode;
import org.talend.designer.xmlmap.model.emf.xmlmap.VarNode;
import org.talend.designer.xmlmap.model.emf.xmlmap.VarTable;
import org.talend.designer.xmlmap.model.emf.xmlmap.XmlMapData;
import org.talend.designer.xmlmap.model.emf.xmlmap.XmlmapFactory;
import org.talend.designer.xmlmap.parts.TreeNodeEditPart;
import org.talend.designer.xmlmap.parts.VarNodeEditPart;
import org.talend.designer.xmlmap.ui.tabs.MapperManager;
import org.talend.designer.xmlmap.util.XmlMapUtil;

public class UpdateExpressionCommand extends Command {

    TransferedObject objects;

    private TableEntityPart targetEditPart;

    private XmlMapData xmlMapData;

    private MapperManager manager;

    public UpdateExpressionCommand(TransferedObject objects, TableEntityPart targetEditPart, MapperManager manager) {
        this.objects = objects;
        this.targetEditPart = targetEditPart;
        this.manager = manager;
        this.xmlMapData = manager.getExternalData();
    }

    @Override
    public void execute() {
        AbstractNode targetNode = (AbstractNode) targetEditPart.getModel();
        boolean targetVar = targetNode instanceof VarNode;
        boolean targetOutput = targetNode instanceof OutputTreeNode;
        boolean targetInput = targetNode instanceof TreeNode && !(targetNode instanceof OutputTreeNode);
        String expression = targetNode.getExpression();
        if (objects.getToTransfer() != null) {
            for (Object obj : objects.getToTransfer()) {
                AbstractNode sourceNode = null;
                if (objects.getType() == TransferdType.INPUT) {
                    TreeNodeEditPart part = (TreeNodeEditPart) obj;
                    sourceNode = (TreeNode) part.getModel();
                    if (expression == null) {
                        expression = XmlMapUtil.convertToExpression(((TreeNode) sourceNode).getXpath());
                    } else {
                        expression = expression + " " + XmlMapUtil.convertToExpression(((TreeNode) sourceNode).getXpath());
                    }
                    targetNode.setExpression(expression);

                    // INPUT => OUTPUT/VAR
                    if (targetVar || targetOutput) {
                        createConnection(sourceNode, targetNode);
                        if (targetOutput) {
                            OutputTreeNode model = (OutputTreeNode) targetNode;
                            if (NodeType.NAME_SPACE.equals(model.getNodeType()) && model.getExpression() != null
                                    && !"".equals(model.getExpression())) {
                                model.setDefaultValue("");
                            }
                            // disable function of add source loop to target InputLoopNodesTable
                            // InputLoopTableUtil.addSourceLoopToInputLoopTable((TreeNode) sourceNode, model,
                            // manager.getMainInputTree());
                        }
                    }
                    // INPUT => INPUT
                    else if (targetInput) {
                        createLookupConnection((TreeNode) sourceNode, (TreeNode) targetNode);
                    }
                } else if (objects.getType() == TransferdType.VAR) {
                    // VARE ==>OUTPUT
                    String tableName = "Var";
                    VarNodeEditPart part = (VarNodeEditPart) obj;
                    sourceNode = (VarNode) part.getModel();
                    if (sourceNode.eContainer() instanceof VarTable) {
                        tableName = ((VarTable) sourceNode.eContainer()).getName();
                    }
                    if (expression == null) {
                        expression = tableName + "." + sourceNode.getName();
                    } else {
                        expression = expression + " " + tableName + "." + sourceNode.getName();
                    }
                    targetNode.setExpression(expression);
                    createConnection(sourceNode, targetNode);

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

    private void createLookupConnection(TreeNode sourceNode, TreeNode targetNode) {
        LookupConnection conn = XmlmapFactory.eINSTANCE.createLookupConnection();
        conn.setSource(sourceNode);
        conn.setTarget(targetNode);
        targetNode.getLookupIncomingConnections().add(conn);
        sourceNode.getLookupOutgoingConnections().add(conn);
        if (xmlMapData != null) {
            xmlMapData.getConnections().add(conn);
        }
    }
}
