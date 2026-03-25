package org.talend.designer.xmlmap.commands;

import java.util.List;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.window.Window;
import org.talend.core.model.components.IODataComponent;
import org.talend.core.model.metadata.IMetadataColumn;
import org.talend.core.model.metadata.IMetadataTable;
import org.talend.core.model.metadata.MetadataColumn;
import org.talend.core.model.metadata.MetadataToolHelper;
import org.talend.designer.gefabstractmap.dnd.TransferdType;
import org.talend.designer.gefabstractmap.dnd.TransferedObject;
import org.talend.designer.xmlmap.dnd.CreateNodeConnectionRequest;
import org.talend.designer.xmlmap.dnd.DropType;
import org.talend.designer.xmlmap.i18n.Messages;
import org.talend.designer.xmlmap.model.emf.xmlmap.AbstractInOutTree;
import org.talend.designer.xmlmap.model.emf.xmlmap.AbstractNode;
import org.talend.designer.xmlmap.model.emf.xmlmap.Connection;
import org.talend.designer.xmlmap.model.emf.xmlmap.InputXmlTree;
import org.talend.designer.xmlmap.model.emf.xmlmap.LookupConnection;
import org.talend.designer.xmlmap.model.emf.xmlmap.NodeType;
import org.talend.designer.xmlmap.model.emf.xmlmap.OutputTreeNode;
import org.talend.designer.xmlmap.model.emf.xmlmap.OutputXmlTree;
import org.talend.designer.xmlmap.model.emf.xmlmap.TreeNode;
import org.talend.designer.xmlmap.model.emf.xmlmap.VarNode;
import org.talend.designer.xmlmap.model.emf.xmlmap.VarTable;
import org.talend.designer.xmlmap.model.emf.xmlmap.XmlMapData;
import org.talend.designer.xmlmap.model.emf.xmlmap.XmlmapFactory;
import org.talend.designer.xmlmap.parts.TreeNodeEditPart;
import org.talend.designer.xmlmap.parts.VarNodeEditPart;
import org.talend.designer.xmlmap.ui.tabs.MapperManager;
import org.talend.designer.xmlmap.util.XmlMapUtil;

public class InsertNewColumnCommand extends Command {

    private EditPart targetEditPart;

    private XmlMapData xmlMapData;

    private TransferedObject objects;

    private DropType dropType;

    private MapperManager manager;

    private CreateNodeConnectionRequest rq;

    public InsertNewColumnCommand(TransferedObject objects, EditPart targetEditPart, CreateNodeConnectionRequest rq,
            MapperManager manager, DropType dropType) {
        this.objects = objects;
        this.targetEditPart = targetEditPart;
        this.rq = rq;
        this.manager = manager;
        this.xmlMapData = manager.getExternalData();
        this.dropType = dropType;
    }

    @Override
    public void execute() {
        if (rq == null || objects.getToTransfer() == null || targetEditPart == null || dropType == null) {
            return;
        }
        Object targetModel = targetEditPart.getModel();
        for (Object obj : objects.getToTransfer()) {
            AbstractNode createdNode = rq.getNewObject();
            // INPUT => OUTPUT INSERT
            if (objects.getType() == TransferdType.INPUT) {
                TreeNodeEditPart part = (TreeNodeEditPart) obj;
                TreeNode sourceNode = (TreeNode) part.getModel();
                String expression = XmlMapUtil.convertToExpression(sourceNode.getXpath());
                switch (dropType) {
                case DROP_INSERT_OUTPUT:
                    int index = -1;
                    OutputXmlTree outputTree = null;
                    if (targetModel instanceof OutputTreeNode) {
                        OutputTreeNode targetNode = (OutputTreeNode) targetModel;
                        if (targetNode.eContainer() instanceof OutputXmlTree) {
                            outputTree = (OutputXmlTree) targetNode.eContainer();
                            index = outputTree.getNodes().indexOf(targetNode);
                        }
                    } else if (targetModel instanceof OutputXmlTree) {
                        outputTree = (OutputXmlTree) targetModel;
                    }
                    if (outputTree != null) {
                        boolean fillNode = fillTreeNode(outputTree.getNodes(), sourceNode, outputTree.getName(), expression,
                                (OutputTreeNode) createdNode);
                        if (!fillNode) {
                            return;
                        }
                        if (index != -1) {
                            outputTree.getNodes().add(index, (OutputTreeNode) createdNode);
                        } else {
                            outputTree.getNodes().add((OutputTreeNode) createdNode);
                        }
                        createConnection(sourceNode, createdNode);
                        AbstractInOutTree abstractTree = XmlMapUtil.getAbstractInOutTree(sourceNode);
                        createOutputMetadataColumn(abstractTree.getName(), outputTree.getName(), sourceNode,
                                createdNode.getName(), index);
                    }
                    break;
                case DROP_INSERT_VAR:
                    VarNode targetVar = (VarNode) targetModel;
                    VarNode varNode = (VarNode) createdNode;
                    if (targetVar.eContainer() instanceof VarTable) {
                        VarTable varTable = (VarTable) targetVar.eContainer();
                        String validSourceName = validSourceNodeName(varTable.getNodes(), sourceNode);
                        String name = getUniqueTableEntry(varTable.getNodes(), validSourceName);
                        varNode.setName(name);
                        varNode.setType(sourceNode.getType());
                        varNode.setExpression(expression);
                        varTable.getNodes().add(varTable.getNodes().indexOf(targetVar), varNode);
                        createConnection(sourceNode, createdNode);
                    }

                    break;
                case DROP_INSERT_INPUT:
                    if (targetModel instanceof InputXmlTree) {
                        InputXmlTree inputTree = (InputXmlTree) targetModel;
                        boolean fillNode = fillTreeNode(inputTree.getNodes(), sourceNode, inputTree.getName(), expression,
                                (TreeNode) createdNode);
                        if (!fillNode) {
                            return;
                        }
                        inputTree.getNodes().add((TreeNode) createdNode);
                        createLookupConnection(sourceNode, (TreeNode) createdNode);
                        AbstractInOutTree abstractTree = XmlMapUtil.getAbstractInOutTree(sourceNode);
                        createInputMetadataColumn(abstractTree.getName(), inputTree.getName(), sourceNode, createdNode.getName(),
                                -1);
                    }
                default:
                    break;
                }
            }
            // VAR => OUTPUT INSERT
            else if (objects.getType() == TransferdType.VAR) {
                VarNodeEditPart part = (VarNodeEditPart) obj;
                VarNode sourceNode = (VarNode) part.getModel();

                String tableName = "Var"; //$NON-NLS-1$
                if (sourceNode.eContainer() instanceof VarTable) {
                    tableName = ((VarTable) sourceNode.eContainer()).getName();
                }
                String expression = tableName + "." + sourceNode.getName(); //$NON-NLS-1$
                if (dropType == DropType.DROP_INSERT_OUTPUT) {
                    int index = -1;
                    OutputXmlTree outputTree = null;
                    if (targetModel instanceof OutputTreeNode) {
                        OutputTreeNode targetNode = (OutputTreeNode) targetModel;
                        if (targetNode.eContainer() instanceof OutputXmlTree) {
                            outputTree = (OutputXmlTree) targetNode.eContainer();
                            index = outputTree.getNodes().indexOf(targetNode);
                        }
                    } else if (targetModel instanceof OutputXmlTree) {
                        outputTree = (OutputXmlTree) targetModel;
                    }
                    if (outputTree != null) {
                        OutputTreeNode outputNode = (OutputTreeNode) createdNode;
                        String name = getUniqueTableEntry(outputTree.getNodes(), sourceNode.getName());
                        outputNode.setName(name);
                        outputNode.setType(sourceNode.getType());
                        outputNode.setExpression(expression);
                        outputNode.setXpath(XmlMapUtil.getXPath(outputTree.getName(), outputNode.getName(),
                                outputNode.getNodeType()));
                        if (index != -1) {
                            outputTree.getNodes().add(index, (OutputTreeNode) createdNode);
                        } else {
                            outputTree.getNodes().add((OutputTreeNode) createdNode);
                        }
                        createConnection(sourceNode, createdNode);
                        createOutputMetadataColumn(null, outputTree.getName(), sourceNode, createdNode.getName(), index);
                        // List<IMetadataTable> metadataTargets = manager.getMapperComponent().getMetadataList();
                        // IMetadataTable metadataTarget = null;
                        // if (metadataTargets != null) {
                        // for (IMetadataTable target : metadataTargets) {
                        // if (target.getTableName().equals(outputTree.getName())) {
                        // metadataTarget = target;
                        // }
                        // }
                        // if (metadataTarget != null) {
                        // IMetadataColumn createNewColumn = new MetadataColumn();
                        // createNewColumn.setLabel(outputNode.getName());
                        // createNewColumn.setTalendType(outputNode.getType());
                        // createNewColumn.setNullable(true);
                        // metadataTarget.getListColumns().add(createNewColumn);
                        // }
                        // }
                    }

                }
            }
        }

        switch (dropType) {
        case DROP_INSERT_OUTPUT:
            manager.getMapperUI().getTabFolderEditors().getOutputMetaEditorView().getTableViewerCreator().refresh();
        case DROP_INSERT_INPUT:
            manager.getMapperUI().getTabFolderEditors().getOutputMetaEditorView().getTableViewerCreator().refresh();
        }

    }

    private void createInputMetadataColumn(String sourceTreeName, String targetTreeName, TreeNode sourceNode,
            String targetNodeName, int index) {
        String sourceNodeName = sourceNode.getName();
        IMetadataTable metadataTarget = null;
        List<IODataComponent> inputs = manager.getMapperComponent().getIODataComponents().getInputs();
        for (IODataComponent incoming : inputs) {
            if (targetTreeName != null && targetTreeName.equals(incoming.getConnection().getName())) {
                metadataTarget = incoming.getTable();
            }
        }

        if (metadataTarget != null) {
            IMetadataColumn columnSource = null;
            if (sourceTreeName != null) {
                columnSource = getSourceColumn(sourceTreeName, sourceNodeName);
            }
            creatMeatadataColumn(columnSource, targetNodeName, sourceNode, metadataTarget, index);
        }
    }

    private void createOutputMetadataColumn(String sourceTreeName, String targetTreeName, AbstractNode sourceNode,
            String targetNodeName, int index) {
        String sourceNodeName = sourceNode.getName();
        IMetadataTable metadataTarget = null;
        List<IMetadataTable> metadataTargets = manager.getMapperComponent().getMetadataList();
        if (metadataTargets != null) {
            for (IMetadataTable target : metadataTargets) {
                if (target.getTableName().equals(targetTreeName)) {
                    metadataTarget = target;
                }
            }
        }
        if (metadataTarget != null) {
            IMetadataColumn columnSource = null;
            if (sourceTreeName != null) {
                columnSource = getSourceColumn(sourceTreeName, sourceNodeName);
            }
            creatMeatadataColumn(columnSource, targetNodeName, sourceNode, metadataTarget, index);
        }
    }

    private void creatMeatadataColumn(IMetadataColumn columnSource, String targetNodeName, AbstractNode sourceNode,
            IMetadataTable metadataTarget, int index) {

        IMetadataColumn createNewColumn = null;
        if (columnSource != null) {
            // dnd schema column
            createNewColumn = new MetadataColumn(columnSource);
            createNewColumn.setLabel(targetNodeName);
        } else {
            // dnd doc child
            createNewColumn = new MetadataColumn();
            createNewColumn.setLabel(targetNodeName);
            createNewColumn.setType(sourceNode.getType());
            createNewColumn.setTalendType(sourceNode.getType());
            if (sourceNode instanceof TreeNode) {
                createNewColumn.setKey(((TreeNode) sourceNode).isKey());
                createNewColumn.setNullable(((TreeNode) sourceNode).isNullable());
                createNewColumn.setPattern(((TreeNode) sourceNode).getPattern());
            }
        }
        if (index != -1) {
            metadataTarget.getListColumns().add(index, createNewColumn);
        } else {
            metadataTarget.getListColumns().add(createNewColumn);
        }

    }

    private IMetadataColumn getSourceColumn(String sourceTreeName, String sourceNodeName) {
        List<IODataComponent> inputs = manager.getMapperComponent().getIODataComponents().getInputs();
        IMetadataColumn columnSource = null;
        for (IODataComponent incoming : inputs) {
            if (sourceTreeName != null && sourceTreeName.equals(incoming.getConnection().getName())) {
                IMetadataTable metadataSource = incoming.getTable();
                for (IMetadataColumn column : metadataSource.getListColumns()) {
                    if (column.getLabel().equals(sourceNodeName)) {
                        columnSource = column;
                        break;
                    }
                }
                break;
            }
        }
        return columnSource;

    }

    private String validSourceNodeName(final List<? extends AbstractNode> validationList, TreeNode sourceNode) {
        String sourceName = sourceNode.getName();
        boolean isValidate = MetadataToolHelper.isValidColumnName(sourceName);
        boolean fixing = false;
        if (!isValidate) {
            if (sourceName.contains(":")) { //$NON-NLS-1$
                if (sourceNode.eContainer() instanceof TreeNode) {
                    TreeNode parent = (TreeNode) sourceNode.eContainer();
                    for (TreeNode child : parent.getChildren()) {
                        if (child.getNodeType() == NodeType.NAME_SPACE) {
                            if (sourceName.startsWith(child.getName() + ":")) { //$NON-NLS-1$
                                sourceName = sourceName.substring(child.getName().length() + 1, sourceName.length());
                                fixing = true;
                            }
                        }
                    }
                    if (!fixing) {
                        sourceName = sourceName.substring(sourceName.indexOf(":"), sourceName.length()); //$NON-NLS-1$
                        fixing = true;
                    }
                }
            }
            if (!fixing || !MetadataToolHelper.isValidColumnName(sourceName)) {
                IInputValidator validataor = new IInputValidator() {

                    @Override
                    public String isValid(String newText) {
                        return XmlMapUtil.isValidColumnName(validationList, newText);
                    }

                };
                InputDialog dialog = new InputDialog(
                        null,
                        Messages.getString("InsertNewColumnCommand_createNew"), Messages.getString("InsertNewColumnCommand_message"), sourceName, validataor); //$NON-NLS-1$ //$NON-NLS-2$
                int open = dialog.open();
                if (open == Window.CANCEL) {
                    return null;
                } else {
                    sourceName = dialog.getValue();
                }
            }
        }

        return sourceName;
    }

    private boolean fillTreeNode(final List<? extends AbstractNode> validationList, TreeNode sourceNode, String sourceTableName,
            String expression, TreeNode target) {
        // fix for TDI-23298
        String validSourceName = validSourceNodeName(validationList, sourceNode);

        String name = getUniqueTableEntry(validationList, validSourceName);
        target.setName(name);
        target.setType(sourceNode.getType());
        target.setExpression(expression);
        target.setPattern(sourceNode.getPattern());
        target.setXpath(XmlMapUtil.getXPath(sourceTableName, target.getName(), target.getNodeType()));
        return true;
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

    private String getUniqueTableEntry(List<? extends AbstractNode> nodeExisted, String nameToCreate) {
        boolean exists = true;
        int counter = 1;
        String newName = nameToCreate;
        while (exists) {
            boolean found = false;
            for (AbstractNode node : nodeExisted) {
                // TDI-26953: drag-and-drop column name should case-sensitive
                if (node.getName().equalsIgnoreCase(newName)) {
                    found = true;
                    break;
                }
            }
            exists = found;
            if (!exists) {
                break;
            }
            newName = nameToCreate + "_" + counter++; //$NON-NLS-1$
        }
        return newName;
    }

}
