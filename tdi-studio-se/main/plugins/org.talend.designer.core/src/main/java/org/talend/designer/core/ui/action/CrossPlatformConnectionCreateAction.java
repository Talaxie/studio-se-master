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
package org.talend.designer.core.ui.action;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.CreationFactory;
import org.talend.commons.ui.runtime.custom.ICustomUI;
import org.talend.commons.ui.runtime.custom.InputDialogBusinessHandler;
import org.talend.commons.ui.runtime.custom.InputDialogBusinessHandler.IInputDialogInputValidator;
import org.talend.core.GlobalServiceRegister;
import org.talend.core.PluginChecker;
import org.talend.core.model.components.ComponentCategory;
import org.talend.core.model.metadata.IMetadataTable;
import org.talend.core.model.process.EConnectionType;
import org.talend.core.model.process.EParameterFieldType;
import org.talend.core.model.process.IConnection;
import org.talend.core.model.process.IConnectionCategory;
import org.talend.core.model.process.IElementParameter;
import org.talend.core.model.process.INodeConnector;
import org.talend.core.model.process.IProcess2;
import org.talend.core.model.utils.TalendTextUtils;
import org.talend.core.ui.IJobletProviderService;
import org.talend.core.utils.KeywordsValidator;
import org.talend.designer.core.i18n.Messages;
import org.talend.designer.core.model.components.EParameterName;
import org.talend.designer.core.ui.action.business.AbsCrossPlatformProcessEditorAction;
import org.talend.designer.core.ui.action.business.ICrossPlatformSelectionActionHook;
import org.talend.designer.core.ui.dialog.IDesignerCoreUIHandler;
import org.talend.designer.core.ui.dialog.mergeorder.ConnectionTableAndSchemaNameDialogBusinessHandler;
import org.talend.designer.core.ui.editor.ICrossPlatformCreationFactory;
import org.talend.designer.core.ui.editor.connections.Connection;
import org.talend.designer.core.ui.editor.nodes.ICrossPlatformNodePart;
import org.talend.designer.core.ui.editor.nodes.Node;
import org.talend.designer.core.ui.editor.process.Process;
import org.talend.designer.core.utils.ConnectionUtil;

public class CrossPlatformConnectionCreateAction extends AbsCrossPlatformProcessEditorAction {

    private static final String NEW_OUTPUT = "*New Output*"; //$NON-NLS-1$

    private final String ISINPUT = "isinput";

    private final String TRUE = "true";

    private final EConnectionType connecType;

    private ICrossPlatformNodePart nodePart;

    private List<String> menuList;

    private List<Object> listArgs;

    private INodeConnector curNodeConnector;

    public CrossPlatformConnectionCreateAction(IProcess2 process, EConnectionType connecType,
            ICrossPlatformConnectionCreateActionHook action) {
        super(process, action);
        this.connecType = connecType;
    }

    public CrossPlatformConnectionCreateAction(IProcess2 process, INodeConnector nodeConnector,
            ICrossPlatformConnectionCreateActionHook action) {
        super(process, action);
        this.connecType = nodeConnector.getDefaultConnectionType();
        this.curNodeConnector = nodeConnector;
    }

    @Override
    public ICrossPlatformConnectionCreateActionHook getActionHook() {
        return (ICrossPlatformConnectionCreateActionHook) super.getActionHook();
    }

    public ICrossPlatformNodePart getNodePart() {
        return nodePart;
    }

    public void setNodePart(ICrossPlatformNodePart nodePart) {
        this.nodePart = nodePart;
    }

    public INodeConnector getCurNodeConnector() {
        return curNodeConnector;
    }

    public void setCurNodeConnector(INodeConnector curNodeConnector) {
        this.curNodeConnector = curNodeConnector;
    }

    public EConnectionType getConnecType() {
        return connecType;
    }

    @Override
    public boolean isEnabled(List<Object> selected) {
        return canPerformAction(selected);
    }

    @Override
    public Command createCommand(List<Object> objects) {
        throw new UnsupportedOperationException();
    }

    /**
     * Test if the selected item is a node.
     *
     * @return true/false
     */
    @SuppressWarnings("unchecked")
    public boolean canPerformAction(List<Object> selected) {
        if (selected.isEmpty()) {
            return false;
        }
        List parts = selected;
        if (parts.size() == 1) {
            Object o = parts.get(0);
            if (!(o instanceof ICrossPlatformNodePart)) {
                return false;
            }
            nodePart = (ICrossPlatformNodePart) o;
            if (!(nodePart.getCrossPlatformModel() instanceof Node)) {
                return false;
            }
            Node node = (Node) nodePart.getCrossPlatformModel();
            if (!node.isActivate()) {
                return false;
            }

            if (node.getJobletNode() != null) {
                return false;
            }

            if (curNodeConnector != null && "VALIDATION_REJECT".equals(curNodeConnector.getName())) {
                if (node.getProcess() != null
                        && !ComponentCategory.CATEGORY_4_DI.getName().equals(node.getProcess().getComponentsType())) {
                    return false;
                }
            }

            if (connecType.hasConnectionCategory(IConnectionCategory.EXECUTION_ORDER)) {
                if (!(Boolean) node.getPropertyValue(EParameterName.STARTABLE.getName())
                        || (!node.getProcessStartNode(false).equals(node))) {
                    if (!node.isELTMapComponent()) {
                        boolean jobletOk = false;
                        if (PluginChecker.isJobLetPluginLoaded()) {
                            IJobletProviderService service = GlobalServiceRegister.getDefault()
                                    .getService(IJobletProviderService.class);
                            if (service != null && service.isJobletComponent(node)) {
                                jobletOk = true;
                            }
                        }
                        if (!jobletOk) {
                            return false;
                        }
                    }
                }
            }
            menuList = new ArrayList<String>();
            if (curNodeConnector == null) {
                curNodeConnector = node.getConnectorFromType(connecType);
                if (curNodeConnector == null || !curNodeConnector.isShow()) {
                    return false;
                }
            }

            if (curNodeConnector.getMaxLinkOutput() != -1) {
                if (curNodeConnector.getCurLinkNbOutput() >= curNodeConnector.getMaxLinkOutput()) {
                    return false;
                }
            }
            if (curNodeConnector.getMaxLinkOutput() == 0) {
                return false;
            }

            /**
             * judge whether to show the table link menu in ELTMap components
             */
            if (curNodeConnector.getName().equals(EConnectionType.TABLE.getName())) {
                List<? extends IConnection> tableRefs = node.getOutgoingConnections(EConnectionType.TABLE_REF);
                if (tableRefs != null && 0 < tableRefs.size()) {
                    return false;
                }
            }

            if (!curNodeConnector.isMultiSchema()) {
                // setText(curNodeConnector.getMenuName());
            }

            if (curNodeConnector.isMultiSchema()) {
                for (IMetadataTable element : node.getMetadataList()) {
                    IMetadataTable table = (element);
                    String value = table.getAdditionalProperties().get(ISINPUT);
                    if (value != null && value.equals(TRUE)) {
                        continue;
                    }
                    String name = table.getTableName();
                    if (name.equals(node.getUniqueName())) {
                        continue;
                    }
                    boolean isELTMap = node.isELTMapComponent()
                            && EConnectionType.TABLE_REF.getName().equals(table.getAttachedConnector());
                    if (table.getAttachedConnector() == null || table.getAttachedConnector().equals(curNodeConnector.getName())
                            || isELTMap) {
                        if (connecType == EConnectionType.TABLE) {
                            name = table.getLabel() + " (" + name + ")"; //$NON-NLS-1$ //$NON-NLS-2$
                        }
                        boolean nameUsed = false;
                        for (Connection connec : (List<Connection>) node.getOutgoingConnections()) {
                            if (connec.getLineStyle().hasConnectionCategory(IConnectionCategory.FLOW)) {
                                if (connec.getMetadataTable() != null
                                        && connec.getMetadataTable().getTableName().equals(table.getTableName())) {
                                    nameUsed = true;
                                }
                            }
                        }
                        // if the name is not already in the process adds to the list
                        if (!nameUsed) {
                            menuList.add(name);
                        }
                    }
                }
                if ((curNodeConnector.getMaxLinkOutput() == -1
                        || node.getMetadataList().size() < curNodeConnector.getMaxLinkOutput()) && curNodeConnector.isBuiltIn()) {
                    menuList.add(getNewOutputMenuName());
                }
            } else {
                String menuName;
                boolean addDefaultName = false;

                // get linked metadata to connector
                IMetadataTable table = null;
                for (IMetadataTable element : node.getMetadataList()) {
                    table = (element);
                    if (table.getTableName().equals(node.getUniqueName())) {
                        break;
                    }
                }

                // if EBCDIC + single schema mode, only have one output maximum
                if (node.getComponent().getName().contains("EBCDIC") && node.checkSchemaForEBCDIC(table)
                        && curNodeConnector.getCurLinkNbOutput() > 0) {
                    return false;
                }
                if (connecType == EConnectionType.TABLE) {
                    addDefaultName = addDefaultName();
                    menuName = getNewOutputMenuName();
                } else {
                    menuName = curNodeConnector.getMenuName();
                }
                if (!addDefaultName) {
                    getActionHook().setText(menuName);
                    menuList.add(menuName);
                }
            }

            return true;
        }
        return false;
    }

    /**
     * DOC qzhang Comment method "addDefaultName".
     *
     * @param node
     */
    private boolean addDefaultName() {
        String removeQuotes = getDefaultTableName();
        String temp = removeQuotes.replaceAll(" ", "");
        if ("".equals(temp)) {
            removeQuotes = temp;
        }
        if (removeQuotes != null && !"".equals(removeQuotes)) {
            menuList.add(removeQuotes);
            // setText(removeQuotes);
            return true;
        }
        return false;
    }

    /**
     * DOC qzhang Comment method "getDefaultTableName".
     *
     * @param node
     * @param removeQuotes
     * @return
     */
    private String getDefaultTableName() {
        Node node = (Node) nodePart.getCrossPlatformModel();
        StringBuffer removeQuotes = new StringBuffer();
        IElementParameter elementParam = node.getElementParameter("ELT_TABLE_NAME"); //$NON-NLS-1$
        IElementParameter schemaParam = node.getElementParameter("ELT_SCHEMA_NAME");//$NON-NLS-1$
        if (node.isELTComponent() && elementParam != null && elementParam.getFieldType().equals(EParameterFieldType.TEXT)) {
            String name2 = elementParam.getValue().toString();
            if (schemaParam != null) {
                String schema = schemaParam.getValue().toString();
                if (schema != null) {
                    schema = TalendTextUtils.removeQuotes(schema);
                    if (!"".equals(schema)) { //$NON-NLS-1$
                        removeQuotes.append(schema);
                        removeQuotes.append(".");//$NON-NLS-1$
                    }
                }
            }
            if (name2 != null) {
                name2 = TalendTextUtils.removeQuotes(name2);
                List<IMetadataTable> metaList = node.getMetadataList();
                if (metaList != null) {

                    for (IMetadataTable metadataTable : metaList) {
                        if (metadataTable != null) {
                            String tName = metadataTable.getTableName();
                            tName = TalendTextUtils.removeQuotes(tName);
                            if (tName.equals(name2)) {
                                String tableLable = metadataTable.getLabel();
                                if (tableLable != null) {
                                    tableLable = TalendTextUtils.removeQuotes(tableLable);
                                    if (!"".equals(tableLable)) {
                                        name2 = tableLable;
                                    }
                                }
                            }
                        }
                    }
                }
                String temp = name2.replaceAll(" ", "");
                if ("".equals(temp)) {
                    name2 = temp;
                }
                if (!"".equals(name2)) { //$NON-NLS-1$
                    removeQuotes.append(name2);
                    removeQuotes.append(" (");
                    removeQuotes.append(curNodeConnector.getMenuName());
                    removeQuotes.append(")");
                    // removeQuotes = name2 + " (" + curNodeConnector.getMenuName() + ")"; //$NON-NLS-1$ //
                    // //$NON-NLS-2$
                }

            }
            // if (removeQuotes != null && node.isELTComponent() &&
            // node.getComponent().getName().equals("tELTOracleInput")) { //$NON-NLS-1$
            // if (getDefaultSchemaName() != null) {
            // String temp = removeQuotes.toString();
            // removeQuotes.append(getDefaultSchemaName());
            // removeQuotes.append(".");
            // removeQuotes.append(temp);
            // // removeQuotes = getDefaultSchemaName() + "." + removeQuotes; //$NON-NLS-1$
            // }
            // }
        }
        return removeQuotes.toString();
    }

    /**
     * DOC gcui Comment method "getDefaultSchemaName".
     *
     * @param node
     * @param removeQuotes
     * @return
     */
    private String getDefaultSchemaName() {
        Node node = (Node) nodePart.getCrossPlatformModel();
        String schemaNameRemoveQuotes = null;
        IElementParameter elementParam = node.getElementParameter("ELT_SCHEMA_NAME"); //$NON-NLS-1$
        if (node.isELTComponent() && elementParam != null && elementParam.getFieldType().equals(EParameterFieldType.TEXT)) {
            String name2 = elementParam.getValue().toString();
            if (name2 != null) {
                name2 = TalendTextUtils.removeQuotes(name2);
                if (!"".equals(name2)) { //$NON-NLS-1$
                    schemaNameRemoveQuotes = name2;
                }
            }
        }
        return schemaNameRemoveQuotes;
    }

    public List<INodeConnector> getConnectors() {
        List<INodeConnector> list = new ArrayList<INodeConnector>();
        List selectedObjects = getActionHook().getCrossPlatformSelectedObjects();
        if (selectedObjects.isEmpty()) {
            return list;
        }
        List parts = selectedObjects;
        if (parts.size() == 1) {
            Object o = parts.get(0);
            if (!(o instanceof ICrossPlatformNodePart)) {
                return list;
            }
            nodePart = (ICrossPlatformNodePart) o;
            if (!(nodePart.getCrossPlatformModel() instanceof Node)) {
                return list;
            }
            Node node = (Node) nodePart.getCrossPlatformModel();
            if (!node.isActivate()) {
                return list;
            }
            List<INodeConnector> nodeConnectorList = new ArrayList<INodeConnector>(node.getConnectorsFromType(connecType));
            List<INodeConnector> toRemove = new ArrayList<INodeConnector>();
            for (INodeConnector connector : nodeConnectorList) {
                if (!connector.isShow() || ((connector.getMaxLinkOutput() != -1)
                        && (connector.getCurLinkNbOutput() >= connector.getMaxLinkOutput()))) {
                    toRemove.add(connector);
                } else {
                    if (PluginChecker.isJobLetPluginLoaded()) {
                        IJobletProviderService service = GlobalServiceRegister.getDefault()
                                .getService(IJobletProviderService.class);
                        if (service != null) {
                            if (service.isJobletComponent(node) && !service.isBuiltTriggerConnector(node, connector)) {
                                toRemove.add(connector);
                            }
                            // for bug 10973
                            List<? extends IConnection> outgoingConnections = node.getOutgoingConnections();
                            if (service.isTriggerInputNode(node) && outgoingConnections != null
                                    && outgoingConnections.size() >= 1) {
                                toRemove.add(connector);
                            }
                        }
                    }
                }
            }
            nodeConnectorList.removeAll(toRemove);
            return nodeConnectorList;
        }
        return list;
    }

    private String getNewOutputMenuName() {
        return NEW_OUTPUT + " (" + curNodeConnector.getMenuName() + ")"; //$NON-NLS-1$ //$NON-NLS-2$
    }

    public List<String> getMenuList() {
        // // gcui:remove *New Output* if have defaultTable name.
        // if (menuList.size() > 1 && getDefaultTableName() != null) {
        // menuList.remove(getNewOutputMenuName());
        // }
        return menuList;
    }

    public void setMenuList(final List<String> menuList) {
        this.menuList = menuList;
    }

    public String isValid(String newText) {
        final Node node = (Node) nodePart.getCrossPlatformModel();
        if (newText != null) {
            if (!node.getProcess().checkValidConnectionName(newText, getActionHook().checkExistConnectionName())
                    || KeywordsValidator.isKeyword(newText) || KeywordsValidator.isSqlKeyword(newText)) {
                return "Input is invalid."; //$NON-NLS-1$
            }
            return null;
        } else {
            return null;
        }

    }

    private String askForConnectionName(String nodeLabel, String oldName) {
        final Node node = (Node) nodePart.getCrossPlatformModel();
        InputDialogBusinessHandler handler = new InputDialogBusinessHandler(
                nodeLabel + Messages.getString("ConnectionCreateAction.dialogTitle"),
                Messages.getString("ConnectionCreateAction.dialogMessage"), oldName, new IInputDialogInputValidator() {

                    @Override
                    public String isValid(String newText) {
                        if (newText != null) {
                            if (!node.getProcess().checkValidConnectionName(newText, getActionHook().checkExistConnectionName())
                                    || KeywordsValidator.isKeyword(newText) || KeywordsValidator.isSqlKeyword(newText)) {
                                return "Input is invalid."; //$NON-NLS-1$
                            }
                            return null;
                        } else {
                            return null;
                        }
                    }
                });
        InputDialogBusinessHandler result = IDesignerCoreUIHandler.get().askForConnectionNameUI(handler);
        if (result.getOpenResult().equals(ICustomUI.CANCEL)) {
            return ""; //$NON-NLS-1$
        }
        String connName = result.getResult();
        IElementParameter elementParam = node.getElementParameter("ELT_TABLE_NAME"); //$NON-NLS-1$
        if (elementParam != null) {
            elementParam.setValue(connName);
        }
        return TalendTextUtils.removeQuotes(connName);
    }

    /**
     * DOC gcui Comment method "askForConnectionNameAndSchema".
     *
     * @param nodeLabel
     * @param oldName
     * @return
     */
    private String askForConnectionNameAndSchema(String nodeLabel, String oldName) {
        final Node node = (Node) nodePart.getCrossPlatformModel();
        String outName = ""; //$NON-NLS-1$
        ConnectionTableAndSchemaNameDialogBusinessHandler handler = new ConnectionTableAndSchemaNameDialogBusinessHandler(
                nodeLabel + Messages.getString("ConnectionCreateAction.dialogTitle"),
                Messages.getString("ConnectionCreateAction.dialogMessage"), oldName);
        ConnectionTableAndSchemaNameDialogBusinessHandler result = IDesignerCoreUIHandler.get()
                .openConnectionTableAndSchemaNameDialog(handler);
        if (result.getOpenResult().equals(ICustomUI.CANCEL)) {
            return ""; //$NON-NLS-1$
        }
        if (result.getSchemaName().length() != 0 && result.getTableName().length() != 0) {
            IElementParameter elementParam = node.getElementParameter("ELT_TABLE_NAME"); //$NON-NLS-1$
            IElementParameter schemaParam = node.getElementParameter("ELT_SCHEMA_NAME");//$NON-NLS-1$
            if (schemaParam != null) {
                String schemaValue = result.getSchemaName();
                schemaParam.setValue(schemaValue);
            }
            if (elementParam != null) {
                String tableValue = result.getTableName();
                elementParam.setValue(tableValue);
            }

            outName = TalendTextUtils.removeQuotes(result.getSchemaName()) + "." //$NON-NLS-1$
                    + TalendTextUtils.removeQuotes(result.getTableName());
        } else if (result.getSchemaName().length() == 0 && result.getTableName().length() != 0) {
            IElementParameter elementParam = node.getElementParameter("ELT_TABLE_NAME"); //$NON-NLS-1$
            if (elementParam != null) {
                String tableValue = result.getTableName();
                elementParam.setValue(tableValue);
            }
            outName = TalendTextUtils.removeQuotes(result.getTableName());
        }

        return outName;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.jface.action.Action#run()
     */
    public void run(List objects) {
        IMetadataTable meta = null;
        IMetadataTable newMetadata = null;
        String connectionName = null;

        if (objects.isEmpty()) {
            return;
        }
        List parts = objects;
        if (parts.size() == 1) {
            Object o = parts.get(0);
            if (!(o instanceof ICrossPlatformNodePart)) {
                return;
            }
            nodePart = (ICrossPlatformNodePart) o;
        } else {
            return;
        }

        Node node = (Node) nodePart.getCrossPlatformModel();
        ICrossPlatformSelectionActionHook actionHook = getActionHook();
        if (curNodeConnector.isMultiSchema()) {
            if (actionHook.getText().equals(getNewOutputMenuName())) {
                // boolean nameOk = false;
                // while (!nameOk) {
                //
                // if (node.isELTComponent()) {
                // connectionName = "Default";
                // } else {
                // connectionName = askForConnectionName(node.getLabel(), connectionName);
                // }
                // if (connectionName.equals("")) { //$NON-NLS-1$
                // return;
                // }
                // if (connecType.equals(EConnectionType.TABLE) ||
                // node.getProcess().checkValidConnectionName(connectionName)) {
                // nameOk = true;
                // } else {
                // String message = Messages.getString("ConnectionCreateAction.errorCreateConnectionName",
                // connectionName); //$NON-NLS-1$
                // MessageDialog.openError(getWorkbenchPart().getSite().getShell(), Messages
                // .getString("ConnectionCreateAction.error"), message); //$NON-NLS-1$
                // }
                // }
                //
                // if (connecType.equals(EConnectionType.TABLE)) {
                // meta = new MetadataTable();
                // meta.setTableName(connectionName);
                // meta.setLabel(connectionName);
                // // meta.setTableId(node.getMetadataList().size());
                // newMetadata = meta;
                // } else {
                // boolean metaExist = false;
                // for (int i = 0; i < node.getMetadataList().size(); i++) {
                // if ((node.getMetadataList().get(i)).getTableName().equals(connectionName)) {
                // metaExist = true;
                // }
                // }
                // if (!metaExist) {
                // meta = new MetadataTable();
                // meta.setTableName(connectionName);
                // newMetadata = meta;
                // }
                // }
            } else {
                String tableName;
                // int tableId = -1;
                if (connecType == EConnectionType.TABLE) {
                    int end = actionHook.getText().length() - 1;
                    int start = actionHook.getText().lastIndexOf("(") + 1; //$NON-NLS-1$
                    tableName = actionHook.getText().substring(start, end);
                    // table = Integer.parseInt(stringId);
                    // tableName = getText().substring(0, start - 2);
                    meta = node.getMetadataTable(tableName);
                    // meta = (IMetadataTable) node.getMetadataList().get(tableId);
                    connectionName = meta.getLabel();
                } else {
                    tableName = actionHook.getText();
                    // tableId = -1;

                    meta = node.getMetadataTable(tableName);
                    // for (int i = 0; i < node.getMetadataList().size(); i++) {
                    // IMetadataTable table = (IMetadataTable) node.getMetadataList().get(i);
                    // if (table.getTableName().equals(tableName)) {
                    // meta = (IMetadataTable) node.getMetadataList().get(i);
                    // }
                    // }
                    connectionName = meta.getTableName();
                }
            }
            // for built-in only:
            if (meta != null) {
                meta.setAttachedConnector(curNodeConnector.getName());
            }
        } else {
            if (connecType == EConnectionType.TABLE) {
                if (actionHook.getText().equals(getDefaultTableName())) {
                    int end = actionHook.getText().lastIndexOf("(") - 1;//$NON-NLS-1$
                    int start = 0;
                    if (end >= start) {
                        connectionName = actionHook.getText().substring(start, end);
                        meta = node.getMetadataList().get(0);
                        meta.setAttachedConnector(curNodeConnector.getName());
                    } else if (actionHook.getText().endsWith(".")) {
                        connectionName = askForConnectionName(node.getLabel(), null);
                        if (connectionName != null && !"".equals(connectionName)) {
                            connectionName = actionHook.getText() + connectionName;
                        }
                        meta = node.getMetadataList().get(0);
                        meta.setAttachedConnector(curNodeConnector.getName());
                    }
                } else if (actionHook.getText().equals(getNewOutputMenuName()) && getDefaultTableName() != null) {
                    if (node.getComponent().getName().equals("tELTOracleInput")) { //$NON-NLS-1$
                        connectionName = askForConnectionNameAndSchema(node.getLabel(), null);
                    } else {
                        connectionName = askForConnectionName(node.getLabel(), null);
                    }
                } else {
                    // gcui:see bug 6781.if is tELT*Input then add a schema name.
                    // if (node.isELTComponent() && node.getComponentName().endsWith("Input"))
                    if (node.getComponent().getName().equals("tELTOracleInput")) { //$NON-NLS-1$
                        connectionName = askForConnectionNameAndSchema(node.getLabel(), getDefaultSchemaName());
                    } else {
                        connectionName = askForConnectionName(node.getLabel(), null);
                    }

                }
            } else {
                if (connecType.hasConnectionCategory(IConnectionCategory.FLOW)) {
                    connectionName = node.getProcess().generateUniqueConnectionName(Process.DEFAULT_ROW_CONNECTION_NAME);
                } else if (connecType.hasConnectionCategory(IConnectionCategory.CAMEL)) {
                    connectionName = ConnectionUtil.generateUniqueConnectionName(connecType, node.getProcess(), curNodeConnector);
                } else {
                    connectionName = curNodeConnector.getLinkName();
                }
            }
            if (node.getMetadataList().size() == 0) {
                meta = null;
            } else {
                meta = node.getMetadataFromConnector(curNodeConnector.getName());
            }
        }

        listArgs = new ArrayList<Object>();
        if (connecType.equals(EConnectionType.FLOW_MAIN) || connecType.equals(EConnectionType.FLOW_REF)
                || connecType.equals(EConnectionType.TABLE)) {
            if (meta == null) {
                listArgs.add(null);
            } else {
                listArgs.add(meta.getTableName());
            }
        } else {
            listArgs.add(node.getUniqueName(false));
        }

        String baseName = node.getConnectionName();
        String fromConnectionName = null;
        if (node.getProcess().checkValidConnectionName(baseName)) {
            fromConnectionName = node.getProcess().generateUniqueConnectionName(baseName);
        }
        if (fromConnectionName != null && connecType.hasConnectionCategory(IConnectionCategory.FLOW)
                && node.getProcess().checkValidConnectionName(fromConnectionName, false) && !curNodeConnector.isMultiSchema()) {

            listArgs.add(fromConnectionName);

        } else {

            listArgs.add(connectionName);

        }

        listArgs.add(newMetadata);
        ConnectionCreationFactory factory = new ConnectionCreationFactory();

        getActionHook().runConnectionCreation(factory);
    }

    public interface IConnectionCreationFactory extends CreationFactory, ICrossPlatformCreationFactory {

    }

    public class ConnectionCreationFactory implements IConnectionCreationFactory {

        @Override
        public Object getNewObject() {
            return listArgs;
        }

        @Override
        public Object getObjectType() {
            return curNodeConnector.getName();
        }
    }

}
