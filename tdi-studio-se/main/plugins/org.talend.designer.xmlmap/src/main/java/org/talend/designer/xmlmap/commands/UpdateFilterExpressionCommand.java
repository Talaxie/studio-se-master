package org.talend.designer.xmlmap.commands;

import org.eclipse.gef.commands.Command;
import org.talend.designer.gefabstractmap.dnd.TransferdType;
import org.talend.designer.gefabstractmap.dnd.TransferedObject;
import org.talend.designer.gefabstractmap.part.MapperTablePart;
import org.talend.designer.xmlmap.model.emf.xmlmap.AbstractInOutTree;
import org.talend.designer.xmlmap.model.emf.xmlmap.AbstractNode;
import org.talend.designer.xmlmap.model.emf.xmlmap.FilterConnection;
import org.talend.designer.xmlmap.model.emf.xmlmap.TreeNode;
import org.talend.designer.xmlmap.model.emf.xmlmap.VarNode;
import org.talend.designer.xmlmap.model.emf.xmlmap.VarTable;
import org.talend.designer.xmlmap.model.emf.xmlmap.XmlMapData;
import org.talend.designer.xmlmap.model.emf.xmlmap.XmlmapFactory;
import org.talend.designer.xmlmap.parts.TreeNodeEditPart;
import org.talend.designer.xmlmap.parts.VarNodeEditPart;
import org.talend.designer.xmlmap.util.XmlMapUtil;

public class UpdateFilterExpressionCommand extends Command {

    TransferedObject objects;

    protected MapperTablePart targetEditPart;

    protected XmlMapData xmlMapData;

    public UpdateFilterExpressionCommand(TransferedObject objects, MapperTablePart targetEditPart, XmlMapData xmlMapData) {
        this.objects = objects;
        this.targetEditPart = targetEditPart;
        this.xmlMapData = xmlMapData;
    }

    @Override
    public void execute() {
        AbstractInOutTree targetTree = (AbstractInOutTree) targetEditPart.getModel();

        String expression = targetTree.getExpressionFilter();
        if (objects.getToTransfer() != null) {
            for (Object obj : objects.getToTransfer()) {
                AbstractNode sourceNode = null;
                // INPUT == FILTER
                if (objects.getType() == TransferdType.INPUT) {
                    TreeNodeEditPart part = (TreeNodeEditPart) obj;
                    sourceNode = (TreeNode) part.getModel();
                    if (expression == null) {
                        expression = XmlMapUtil.convertToExpression(((TreeNode) sourceNode).getXpath());
                    } else {
                        expression = expression + " " + XmlMapUtil.convertToExpression(((TreeNode) sourceNode).getXpath());
                    }
                }
                // VARE == FILTER
                else if (objects.getType() == TransferdType.VAR) {
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

                }
                if (sourceNode != null) {
                    targetTree.setExpressionFilter(expression);
                    FilterConnection connection = XmlmapFactory.eINSTANCE.createFilterConnection();
                    connection.setSource(sourceNode);
                    connection.setTarget(targetTree);
                    targetTree.getFilterIncomingConnections().add(connection);
                    sourceNode.getFilterOutGoingConnections().add(connection);
                    xmlMapData.getConnections().add(connection);
                }

                // check if need update outputTree InputLoopNodesTable
            }
        }

    }

}
