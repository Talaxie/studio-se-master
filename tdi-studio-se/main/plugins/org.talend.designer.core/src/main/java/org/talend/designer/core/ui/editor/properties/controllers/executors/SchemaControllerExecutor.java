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
package org.talend.designer.core.ui.editor.properties.controllers.executors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.talend.commons.exception.PersistenceException;
import org.talend.commons.ui.runtime.exception.ExceptionHandler;
import org.talend.commons.ui.swt.dialogs.ModelSelectionBusinessHandler;
import org.talend.commons.ui.swt.dialogs.ModelSelectionDialog;
import org.talend.commons.ui.swt.dialogs.ModelSelectionDialog.EEditSelection;
import org.talend.commons.ui.swt.dialogs.ModelSelectionDialog.ESelectionType;
import org.talend.core.CorePlugin;
import org.talend.core.GlobalServiceRegister;
import org.talend.core.model.metadata.IMetadataColumn;
import org.talend.core.model.metadata.IMetadataTable;
import org.talend.core.model.metadata.MetadataSchemaType;
import org.talend.core.model.metadata.MetadataTable;
import org.talend.core.model.metadata.MetadataToolHelper;
import org.talend.core.model.metadata.builder.ConvertionHelper;
import org.talend.core.model.metadata.builder.connection.SAPBWTable;
import org.talend.core.model.metadata.builder.connection.SAPFunctionUnit;
import org.talend.core.model.process.EConnectionType;
import org.talend.core.model.process.EParameterFieldType;
import org.talend.core.model.process.IConnection;
import org.talend.core.model.process.IElement;
import org.talend.core.model.process.IElementParameter;
import org.talend.core.model.process.IElementParameterDefaultValue;
import org.talend.core.model.process.INode;
import org.talend.core.model.process.INodeConnector;
import org.talend.core.model.process.IProcess;
import org.talend.core.model.properties.ConnectionItem;
import org.talend.core.model.properties.Item;
import org.talend.core.model.properties.ProcessItem;
import org.talend.core.model.properties.Property;
import org.talend.core.model.properties.SAPConnectionItem;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.model.repository.IRepositoryViewObject;
import org.talend.core.model.utils.TalendTextUtils;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.core.repository.model.repositoryObject.MetadataTableRepositoryObject;
import org.talend.core.repository.seeker.RepositorySeekerManager;
import org.talend.core.runtime.services.IGenericWizardService;
import org.talend.core.ui.metadata.dialog.MetadataDialog;
import org.talend.core.ui.metadata.dialog.MetadataDialogBusinessHandler;
import org.talend.core.ui.metadata.dialog.MetadataDialogForMerge;
import org.talend.core.ui.metadata.dialog.MetadataDialogForMergeBusinessHandler;
import org.talend.cwm.helper.ConnectionHelper;
import org.talend.designer.core.IDesignerCoreService;
import org.talend.designer.core.i18n.Messages;
import org.talend.designer.core.model.components.EParameterName;
import org.talend.designer.core.model.components.EmfComponent;
import org.talend.designer.core.ui.editor.cmd.ChangeMetadataCommand;
import org.talend.designer.core.ui.editor.cmd.PropertyChangeCommand;
import org.talend.designer.core.ui.editor.cmd.RepositoryChangeMetadataCommand;
import org.talend.designer.core.ui.editor.connections.Connection;
import org.talend.designer.core.ui.editor.nodes.Node;
import org.talend.designer.core.ui.editor.properties.controllers.RetrieveSchemaHelper;
import org.talend.designer.core.ui.editor.properties.controllers.SynchronizeSchemaHelper;
import org.talend.designer.core.ui.editor.properties.controllers.ui.ISchemaControllerUI;
import org.talend.designer.core.ui.editor.properties.controllers.ui.IWidgetContext;
import org.talend.designer.core.utils.SAPParametersUtils;
import org.talend.designer.core.utils.ValidationRulesUtil;
import org.talend.designer.runprocess.ItemCacheManager;
import org.talend.repository.model.IMetadataService;
import org.talend.repository.model.IProxyRepositoryFactory;
import org.talend.repository.model.IRepositoryNode;
import org.talend.repository.model.IRepositoryNode.EProperties;
import org.talend.repository.model.RepositoryNode;
import org.talend.repository.ui.dialog.RepositoryReviewBusinessHandler;
import org.talend.repository.ui.dialog.RepositoryReviewDialog;

/**
 * DOC cmeng  class global comment. Detailled comment
 */
public abstract class SchemaControllerExecutor extends RepositoryControllerExecutor implements ISchemaControllerExecutor {

    @Override
    protected ISchemaControllerUI getUi() {
        return (ISchemaControllerUI) super.getUi();
    }

    public boolean prepareReadOnlyTable(IMetadataTable table, boolean readOnlyParam, boolean readOnlyElement) {
        boolean isCustom = false;
        if (table.isReadOnly()) {
            return true;
        }
        for (IMetadataColumn column : table.getListColumns()) {
            if (column.isCustom() && !column.isReadOnly()) {
                isCustom = true;
            }
        }
        if (!isCustom) {
            return readOnlyParam || readOnlyElement;
        }
        for (IMetadataColumn column : table.getListColumns()) {
            if (!column.isCustom()) {
                column.setReadOnly(table.isReadOnly());
            }
        }
        return readOnlyElement;
    }

    /**
     * Find the IRepositoryObject of metadata connection thats contains current schema.
     *
     * @param schemaId
     * @return
     */
    public IRepositoryViewObject findRepositoryObject(String schemaId) {
        try {
            String[] names = schemaId.split(" - "); //$NON-NLS-1$
            IProxyRepositoryFactory factory = ProxyRepositoryFactory.getInstance();
            IRepositoryViewObject node = factory.getLastVersion(names[0]);
            return node;
        } catch (PersistenceException e) {
            ExceptionHandler.process(e);
        }
        return null;
    }

    /**
     * Use the database table wizard to update the schema in the repository.
     *
     * @param button
     */
    public void updateRepositorySchema(IWidgetContext button) {
        String paramName = (String) button.getData(PARAMETER_NAME);
        String fullParamName = paramName + ":" + getRepositoryChoiceParamName(); //$NON-NLS-1$
        IElementParameter schemaParam = getElem().getElementParameter(fullParamName);
        String schemaId = (String) schemaParam.getValue();
        org.talend.core.model.metadata.builder.connection.Connection connection = MetadataToolHelper
                .getConnectionFromRepository(schemaId);
        String[] names = schemaId.split(" - "); //$NON-NLS-1$

        if (connection == null || names == null || names.length != 2) {
            // When no repository avaiable on "Repository" mode, open a MessageDialog.
            getUi().openError(Messages.getString("NoRepositoryDialog.Title"), Messages.getString("NoRepositoryDialog.Text"));
            return;
        }
        // find IRepositoryObject from repository that contains current connection
        IRepositoryViewObject node = findRepositoryObject(schemaId);
        RepositoryNode repositoryNode = null;
        IRepositoryNode iRepNode = RepositorySeekerManager.getInstance().searchRepoViewNode(node.getProperty().getId());
        if (iRepNode instanceof RepositoryNode) {
            repositoryNode = (RepositoryNode) iRepNode;
        }
        if (repositoryNode == null) {
            return;
        }
        RepositoryNode metadataNode = null;
        metadataNode = findRepositoryNode(names[1], names[0], repositoryNode);
        if (metadataNode != null) {
            final IMetadataService metadataService = CorePlugin.getDefault().getMetadataService();
            if (metadataService != null) {
                metadataService.runCreateTableAction(metadataNode);
            }
        }
    }

    public RepositoryNode findRepositoryNode(String label, String id, RepositoryNode root) {
        String name = (String) root.getProperties(EProperties.LABEL);
        String rootID = root.getId();
        RepositoryNode toReturn = null;
        if (label.equals(name) && !id.equals(rootID)) {
            toReturn = root;
        } else {
            for (IRepositoryNode node : root.getChildren()) {
                toReturn = findRepositoryNode(label, id, (RepositoryNode) node);
                if (toReturn != null) {
                    break;
                }
            }
        }
        return toReturn;
    }

    /**
     * If schema type is repository, display a dialog to ask the user to change to built-in mode or update the schema in
     * the repository. Return true to stop the process.
     *
     * @param button
     */
    public boolean checkForRepositoryShema(IWidgetContext button) {
        boolean stop = false;
        if (button.getData(NAME).equals(SCHEMA)) {
            String paramName = (String) button.getData(PARAMETER_NAME);
            String type = (String) getElem().getPropertyValue(EParameterName.SCHEMA_TYPE.getName(), paramName);
            if (type != null && type.equals(EmfComponent.REPOSITORY)) {
                // use repository schema, pop up a dialog to ask the user for changing mode
                INode node;
                if (getElem() instanceof INode) {
                    node = (INode) getElem();
                } else { // else instanceof Connection
                    node = ((IConnection) getElem()).getSource();
                }
                boolean isReadOnly = node.getProcess().isReadOnly();
                if (node.getJobletNode() != null) {
                    isReadOnly = node.isReadOnly();
                }
                ModelSelectionBusinessHandler handler = new ModelSelectionBusinessHandler(ESelectionType.SCHEMA, isReadOnly);
                stop = true;
                ModelSelectionBusinessHandler modelSelect = getUi().openModelSelectionDialog(handler);
                if (modelSelect.getOpenResult().equals(ModelSelectionDialog.OK)) {
                    if (modelSelect.getOptionValue() == EEditSelection.REPOSITORY) {
                        // update repository schema
                        button.setData(FORCE_READ_ONLY, false);
                        updateRepositorySchema(button);
                    } else if (modelSelect.getOptionValue() == EEditSelection.BUILDIN) {
                        // change the schema type to built in, then continue the original process
                        getUi().executeCommand(new RepositoryChangeSchemaBuiltinCommand(getElem(), paramName));
                        button.setData(FORCE_READ_ONLY, false);
                        stop = false;
                    } else if (modelSelect.getOptionValue() == EEditSelection.SHOW_SCHEMA) {
                        button.setData(FORCE_READ_ONLY, true);
                        stop = false;
                    }
                }
            }
        }
        return stop;
    }

    public void copySchemaFromChildJob(Node runJobNode, final Item item) {
        // 0004322: tRunJob can import the tBufferOutput schema from the son job
        if (runJobNode != null && item instanceof ProcessItem) {
            IDesignerCoreService service = CorePlugin.getDefault().getDesignerCoreService();
            IProcess process = service.getProcessFromProcessItem((ProcessItem) item);
            List<? extends INode> graphicalNodes = process.getGraphicalNodes();
            for (INode node : graphicalNodes) {
                if ((node != null) && node.getComponent().getName().equals("tBufferOutput")) { //$NON-NLS-1$
                    List<IMetadataTable> list = node.getMetadataList();
                    if (list.size() > 0) {
                        List<IMetadataTable> metadata = runJobNode.getMetadataList();
                        if (metadata.size() == 0) {
                            metadata.add(list.get(0).clone());
                        } else {
                            IMetadataTable table = metadata.get(0);
                            // clear schema of tRunJob, so we will replace with schema of tBufferOutput
                            table.getListColumns().clear();
                            List<IMetadataColumn> columns = list.get(0).getListColumns();
                            for (IMetadataColumn col : columns) {
                                table.getListColumns().add(col.clone());
                            }
                        }
                        // skip other tBufferOutput component
                        break;
                    }
                }
            }
        }
    }

    @Override
    public Command createButtonCommand(IWidgetContext button) {
        // see 0003766: Problems with the read only mode of the properties on repository mode.
        if (checkForRepositoryShema(button)) {
            return null;
        }
        IWidgetContext inputButton = button;
        IElementParameter switchParam = getElem().getElementParameter(EParameterName.REPOSITORY_ALLOW_AUTO_SWITCH.getName());

        if (inputButton.getData(NAME).equals(SCHEMA)) {
            // this map wil hold the all input connection for the tUnite component
            Map<INode, Map<IMetadataTable, Boolean>> inputInfos = new HashMap<INode, Map<IMetadataTable, Boolean>>();

            INode node;
            if (getElem() instanceof Node) {
                node = (INode) getElem();
            } else { // else instanceof Connection
                node = ((IConnection) getElem()).getSource();
            }

            IMetadataTable inputMetadata = null, inputMetaCopy = null;
            Connection inputConec = null;
            String propertyName = (String) inputButton.getData(PARAMETER_NAME);
            IElementParameter param = node.getElementParameter(propertyName);

            IElementParameter connectionParam = param.getChildParameters().get(EParameterName.CONNECTION.getName());
            String connectionName = null;
            if (connectionParam != null) {
                connectionName = (String) connectionParam.getValue();
            }
            Object obj = button.getData(FORCE_READ_ONLY);
            boolean forceReadOnly = false;
            if (obj != null) {
                forceReadOnly = (Boolean) obj;
            }
            boolean inputReadOnly = false, outputReadOnly = false, inputReadOnlyNode = false, inputReadOnlyParam = false;

            for (Connection connec : (List<Connection>) node.getIncomingConnections()) {
                if (connec.isActivate() && (connec.getLineStyle().equals(EConnectionType.FLOW_MAIN)
                        || connec.getLineStyle().equals(EConnectionType.TABLE)
                        || connec.getLineStyle().equals(EConnectionType.FLOW_MERGE)
                        || connec.getLineStyle() == EConnectionType.FLOW_REF)) {
                    if (connectionName != null && !connec.getName().equals(connectionName)) {
                        continue;
                    }
                    inputMetadata = connec.getMetadataTable();
                    inputMetaCopy = inputMetadata.clone();
                    inputConec = connec;

                    if (connec.getSource().isReadOnly()) {
                        inputReadOnlyNode = true;
                    } else {
                        for (IElementParameter curParam : connec.getSource().getElementParameters()) {
                            if (curParam.getFieldType() == EParameterFieldType.SCHEMA_TYPE
                                    || curParam.getFieldType() == EParameterFieldType.SCHEMA_REFERENCE) {
                                if (curParam.isReadOnly()) {
                                    inputReadOnlyParam = true;
                                }
                            }
                        }
                    }
                    // check if the inputMetadata is readonly
                    if (inputMetadata != null) {
                        for (IMetadataColumn column : inputMetadata.getListColumns(true)) {
                            IMetadataColumn columnCopied = inputMetaCopy.getColumn(column.getLabel());
                            columnCopied.setCustom(column.isCustom());
                            columnCopied.setReadOnly(column.isReadOnly());
                        }
                        inputMetaCopy.setReadOnly(inputMetadata.isReadOnly());
                        inputReadOnly = prepareReadOnlyTable(inputMetaCopy, inputReadOnlyParam, inputReadOnlyNode);
                    }

                    // store the value for Dialog
                    Map<IMetadataTable, Boolean> oneInput = new HashMap<IMetadataTable, Boolean>();
                    oneInput.put(inputMetaCopy, inputReadOnly);
                    inputInfos.put(connec.getSource(), oneInput);
                }
            }

            if (connectionParam != null && inputMetadata == null) {
                getUi().openError(Messages.getString("AbstractSchemaController.inputNotSet"),
                        Messages.getString("AbstractSchemaController.connectionNotAvaliable"));
                return null;
            }

            IMetadataTable originaleMetadataTable = getMetadataTableFromXml(node);
            // check if the outputMetadata is readonly
            IMetadataTable originaleOutputTable = node.getMetadataFromConnector(param.getContext());
            // when several schema_type button ,need get the right one which is opening
            IElementParameter schemaParam = param.getChildParameters().get("SCHEMA_TYPE");//$NON-NLS-1$
            // need setRepository here
            if (!param.getContext().equals(schemaParam.getContext())) {
                schemaParam = param.getChildParameters().get("SCHEMA_TYPE");//$NON-NLS-1$
            }
            if (schemaParam != null && EmfComponent.REPOSITORY.equals(schemaParam.getValue())) {
                if (originaleOutputTable != null && originaleOutputTable instanceof MetadataTable) {
                    ((MetadataTable) originaleOutputTable).setRepository(true);
                }
            } else if (schemaParam != null && EmfComponent.BUILTIN.equals(schemaParam.getValue())) {
                if (originaleOutputTable != null && originaleOutputTable instanceof MetadataTable) {
                    ((MetadataTable) originaleOutputTable).setRepository(false);
                }
            }

            if ("tUniservBTGeneric".equals(node.getComponent().getName())) {//$NON-NLS-1$
                originaleOutputTable = node.getMetadataTable("OUTPUT_SCHEMA");//$NON-NLS-1$
            }
            IMetadataTable outputMetaCopy = originaleOutputTable.clone(true);
            for (IMetadataColumn column : originaleOutputTable.getListColumns(true)) {
                IMetadataColumn columnCopied = outputMetaCopy.getColumn(column.getLabel());
                columnCopied.setCustom(column.isCustom());
                columnCopied.setReadOnly(column.isReadOnly());
                if (("tLogCatcher".equals(node.getComponent().getName()) || "tStatCatcher".equals(node.getComponent().getName())) //$NON-NLS-1$ //$NON-NLS-2$
                        && !outputMetaCopy.sameMetadataAs(originaleMetadataTable, IMetadataColumn.OPTIONS_NONE)) {
                    columnCopied.setReadOnly(false);
                }
            }
            outputMetaCopy
                    .setReadOnly(originaleOutputTable.isReadOnly() || param.isReadOnly(node.getElementParametersWithChildrens()));
            if (("tLogCatcher".equals(node.getComponent().getName()) || "tStatCatcher".equals(node.getComponent().getName())) //$NON-NLS-1$ //$NON-NLS-2$
                    && !outputMetaCopy.sameMetadataAs(originaleMetadataTable, IMetadataColumn.OPTIONS_NONE)) {
                outputMetaCopy.setReadOnly(false);
            }

            IElementParameter schemaTypeParam = param.getChildParameters().get("SCHEMA_TYPE"); //$NON-NLS-1$
            List<IElementParameterDefaultValue> defaultValues = schemaTypeParam.getDefaultValues();
            for (IElementParameterDefaultValue elementParameterDefaultValue : defaultValues) {
                if (elementParameterDefaultValue.getDefaultValue() instanceof MetadataTable) {
                    MetadataTable table = (MetadataTable) elementParameterDefaultValue.getDefaultValue();
                    outputMetaCopy.setReadOnlyColumnPosition(table.getReadOnlyColumnPosition());
                    break;
                }
            }

            outputMetaCopy.sortCustomColumns();

            if (!forceReadOnly) {
                outputReadOnly = prepareReadOnlyTable(outputMetaCopy, param.isReadOnly(), node.isReadOnly());
            } else {
                outputReadOnly = true;
            }
            // create the MetadataDialog
            MetadataDialogBusinessHandler metaDialogHandler = null;
            if (inputMetadata != null) {
                if (inputInfos != null && inputInfos.size() > 1 && connectionName == null) {
                    MetadataDialogForMergeBusinessHandler handler = new MetadataDialogForMergeBusinessHandler(inputInfos,
                            outputMetaCopy, node);
                    handler.setTitle(Messages.getString("AbstractSchemaController.schemaOf") + node.getLabel()); //$NON-NLS-1$
                    handler.setInputReadOnly(inputReadOnly);
                    handler.setOutputReadOnly(outputReadOnly);
                    MetadataDialogForMergeBusinessHandler metaDialogForMerge = getUi().openMetadataDialogForMerge(handler);
                    if (metaDialogForMerge.getOpenResult().equals(MetadataDialogForMerge.OK)) {
                        // inputMetaCopy = metaDialog.getInputMetaData();
                        outputMetaCopy = metaDialogForMerge.getOutputMetaTable();

                        // check if the metadata is modified
                        boolean modified = false;
                        if (!outputMetaCopy.sameMetadataAs(originaleOutputTable, IMetadataColumn.OPTIONS_NONE)) {
                            modified = true;
                        } else {
                            if (inputMetadata != null) {
                                // Notice: the Map inputInfos maybe is modified by the dialog.
                                Set<INode> inputNodes = inputInfos.keySet();
                                for (INode inputNode : inputNodes) {
                                    Map<IMetadataTable, Boolean> oneInput = inputInfos.get(inputNode);
                                    inputMetaCopy = (IMetadataTable) oneInput.keySet().toArray()[0];
                                    if (!inputMetaCopy.sameMetadataAs(inputNode.getMetadataList().get(0),
                                            IMetadataColumn.OPTIONS_NONE)) {
                                        modified = true;
                                    }
                                }
                            }
                        }

                        // create the changeMetadataCommand
                        if (modified) {
                            if (switchParam != null) {
                                switchParam.setValue(Boolean.FALSE);
                            }
                            Command changeMetadataCommand = null;
                            // only output, no input
                            if (inputInfos.isEmpty()) {
                                changeMetadataCommand = new ChangeMetadataCommand(node, param, null, null, null,
                                        originaleOutputTable, outputMetaCopy);
                            } else {
                                Set<INode> inputNodes = inputInfos.keySet();
                                int count = 0;
                                for (INode inputNode : inputNodes) {
                                    Map<IMetadataTable, Boolean> oneInput = inputInfos.get(inputNode);
                                    inputMetaCopy = (IMetadataTable) oneInput.keySet().toArray()[0];
                                    if (count == 0) {
                                        changeMetadataCommand = new ChangeMetadataCommand(node, param, inputNode,
                                                inputNode.getMetadataList().get(0), inputMetaCopy, originaleOutputTable,
                                                outputMetaCopy);
                                    } else {
                                        changeMetadataCommand = changeMetadataCommand.chain(new ChangeMetadataCommand(node, param,
                                                inputNode, inputNode.getMetadataList().get(0), inputMetaCopy,
                                                originaleOutputTable, outputMetaCopy));
                                    }
                                    count++;
                                }
                            }
                            return changeMetadataCommand;
                        }
                    }

                } else {
                    INode inputNode = (inputConec.getSource());
                    if (inputMetaCopy.getAttachedConnector() == null) {
                        INodeConnector mainConnector;
                        if (inputNode.isELTComponent()) {
                            mainConnector = inputNode.getConnectorFromType(EConnectionType.TABLE);
                        } else {
                            mainConnector = inputNode.getConnectorFromType(EConnectionType.FLOW_MAIN);
                        }
                        inputMetaCopy.setAttachedConnector(mainConnector.getName());
                    }
                    metaDialogHandler = new MetadataDialogBusinessHandler(inputMetaCopy, inputNode, outputMetaCopy, node);
                }
            } else {
                metaDialogHandler = new MetadataDialogBusinessHandler(null, null, outputMetaCopy, node);
            }

            if (metaDialogHandler != null) {
                metaDialogHandler.setTitle(Messages.getString("AbstractSchemaController.schema.title", node.getLabel())); //$NON-NLS-1$
                metaDialogHandler.setInputReadOnly(inputReadOnly);
                metaDialogHandler.setOutputReadOnly(outputReadOnly);

                setMetadataTableOriginalNameList(inputMetadata, inputMetaCopy);
                setMetadataTableOriginalNameList(originaleOutputTable, outputMetaCopy);
                MetadataDialogBusinessHandler metaDialog = getUi().openMetadataDialog(metaDialogHandler);
                if (metaDialog.getOpenResult().equals(MetadataDialog.OK)) {

                    inputMetaCopy = metaDialog.getInputMetaTable();
                    outputMetaCopy = metaDialog.getOutputMetaTable();
                    boolean modified = false;
                    if (!outputMetaCopy.sameMetadataAs(originaleOutputTable, IMetadataColumn.OPTIONS_NONE)) {
                        modified = true;
                    } else {
                        if (inputMetadata != null) {
                            if (!inputMetaCopy.sameMetadataAs(inputMetadata, IMetadataColumn.OPTIONS_NONE)) {
                                modified = true;
                            }
                        }
                    }
                    if (modified) {
                        if (switchParam != null) {
                            switchParam.setValue(Boolean.FALSE);
                        }
                        INode inputNode = null;
                        if (inputConec != null) {
                            inputNode = inputConec.getSource();
                        }
                        ChangeMetadataCommand changeMetadataCommand = new ChangeMetadataCommand(node, param, inputNode,
                                inputMetadata, inputMetaCopy, originaleOutputTable, outputMetaCopy);
                        return changeMetadataCommand;
                    }
                }
            }
        } else if (inputButton.getData(NAME).equals(RETRIEVE_SCHEMA)) {
            Node node = (Node) getElem();
            // String propertyName = (String) inputButton.getData(PARAMETER_NAME);
            final Command cmd = RetrieveSchemaHelper.retrieveSchemasCommand(node);
            if (switchParam != null) {
                switchParam.setValue(Boolean.FALSE);
            }
            return cmd;
        } else if (inputButton.getData(NAME).equals(RESET_COLUMNS)) {
            Node node = (Node) getElem();

            String propertyName = (String) inputButton.getData(PARAMETER_NAME);
            IElementParameter param = node.getElementParameter(propertyName);

            final Command cmd = SynchronizeSchemaHelper.createCommand(node, param);
            if (switchParam != null) {
                switchParam.setValue(Boolean.FALSE);
            }

            return cmd;
        } else if (button.getData(NAME).equals(REPOSITORY_CHOICE)) {
            String paramName = (String) button.getData(PARAMETER_NAME);
            IElementParameter schemaParam = getElem().getElementParameter(paramName);

            ERepositoryObjectType type = ERepositoryObjectType.METADATA_CON_TABLE;
            String filter = schemaParam.getFilter();
            if (getElem() instanceof Node) {
                Node sapNode = (Node) getElem();
                if (sapNode.getComponent().getName().startsWith("tESB")) { //$NON-NLS-1$
                    filter = ERepositoryObjectType.SERVICESOPERATION.getType();
                }
            }

            RepositoryReviewBusinessHandler handler = new RepositoryReviewBusinessHandler(type, filter);
            RepositoryReviewBusinessHandler dialog = getUi().openRepositoryReviewDialog(handler);
            if (dialog.getOpenResult().equals(RepositoryReviewDialog.OK)) {
                RepositoryNode node = dialog.getResult();
                while (node.getObject().getProperty().getItem() == null
                        || (!(node.getObject().getProperty().getItem() instanceof ConnectionItem))) {
                    node = node.getParent();
                }

                IRepositoryViewObject object = dialog.getResult().getObject();
                Property property = object.getProperty();
                String id = property.getId();
                String name = object.getLabel();// The name is Table Name.
                org.talend.core.model.metadata.builder.connection.MetadataTable table = null;
                if (property.getItem() instanceof SAPConnectionItem && object instanceof MetadataTableRepositoryObject) {
                    MetadataTableRepositoryObject metadataObject = (MetadataTableRepositoryObject) object;
                    table = (org.talend.core.model.metadata.builder.connection.MetadataTable) metadataObject.getModelElement();
                    if (table.eContainer() instanceof SAPFunctionUnit) {
                        SAPFunctionUnit function = (SAPFunctionUnit) table.eContainer();
                        String tableType = table.getTableType() == null ? MetadataSchemaType.OUTPUT.name() : table.getTableType();
                        name = function.getLabel() + "/" + tableType + "/" + name;//$NON-NLS-1$ //$NON-NLS-2$
                    }
                }
                if (name != null) {
                    if (getElem() instanceof Node) {
                        Node nodeElement = (Node) getElem();
                        String value = id + " - " + name; //$NON-NLS-1$
                        IMetadataTable repositoryMetadata = MetadataToolHelper.getMetadataFromRepository(value);
                        if (nodeElement.getComponent().getName().equals("tSQLTemplateMerge")) {//$NON-NLS-1$
                            if (paramName.equals("SCHEMA")) {//$NON-NLS-1$
                                paramName = "SOURCE_TABLE";//$NON-NLS-1$
                                Command dbSelectorCommand = new PropertyChangeCommand(getElem(), paramName,
                                        TalendTextUtils.addQuotes(repositoryMetadata.getTableName()));
                                getUi().executeCommand(dbSelectorCommand);
                                getUi().updateUIText(paramName, TalendTextUtils.addQuotes(repositoryMetadata.getTableName()));

                                paramName = "SCHEMA:REPOSITORY_SCHEMA_TYPE";//$NON-NLS-1$
                                dbSelectorCommand = new PropertyChangeCommand(getElem(), paramName, TalendTextUtils.addQuotes(name));
                                getUi().executeCommand(dbSelectorCommand);
                                getUi().updateUIText(paramName, TalendTextUtils.addQuotes(name));
                                paramName = "SCHEMA";//$NON-NLS-1$
                            } else if (paramName.equals("SCHEMA_TARGET")) {//$NON-NLS-1$
                                paramName = "TARGET_TABLE";//$NON-NLS-1$
                                Command dbSelectorCommand = new PropertyChangeCommand(getElem(), paramName,
                                        TalendTextUtils.addQuotes(repositoryMetadata.getTableName()));
                                getUi().executeCommand(dbSelectorCommand);
                                getUi().updateUIText(paramName, TalendTextUtils.addQuotes(repositoryMetadata.getTableName()));

                                paramName = "SCHEMA_TARGET:REPOSITORY_SCHEMA_TYPE";//$NON-NLS-1$
                                dbSelectorCommand = new PropertyChangeCommand(getElem(), paramName, TalendTextUtils.addQuotes(name));
                                getUi().executeCommand(dbSelectorCommand);
                                getUi().updateUIText(paramName, TalendTextUtils.addQuotes(name));
                                paramName = "SCHEMA_TARGET";//$NON-NLS-1$
                            }
                        } else if (nodeElement.getComponent().getName().startsWith("tSQLTemplate")) {//$NON-NLS-1$
                            if (paramName.equals("SCHEMA")) {//$NON-NLS-1$
                                paramName = "TABLE_NAME";//$NON-NLS-1$
                                Command dbSelectorCommand = new PropertyChangeCommand(getElem(), paramName,
                                        TalendTextUtils.addQuotes(repositoryMetadata.getTableName()));
                                getUi().executeCommand(dbSelectorCommand);
                                getUi().updateUIText(paramName, TalendTextUtils.addQuotes(repositoryMetadata.getTableName()));

                                paramName = "SCHEMA:REPOSITORY_SCHEMA_TYPE";//$NON-NLS-1$
                                dbSelectorCommand = new PropertyChangeCommand(getElem(), paramName, TalendTextUtils.addQuotes(name));
                                getUi().executeCommand(dbSelectorCommand);
                                getUi().updateUIText(paramName, TalendTextUtils.addQuotes(name));
                                paramName = "SCHEMA";//$NON-NLS-1$
                            } else if (paramName.equals("SCHEMA_TARGET")) {//$NON-NLS-1$
                                paramName = "TABLE_NAME_TARGET";//$NON-NLS-1$
                                Command dbSelectorCommand = new PropertyChangeCommand(getElem(), paramName,
                                        TalendTextUtils.addQuotes(repositoryMetadata.getTableName()));
                                getUi().executeCommand(dbSelectorCommand);
                                getUi().updateUIText(paramName, TalendTextUtils.addQuotes(repositoryMetadata.getTableName()));

                                paramName = "SCHEMA_TARGET:REPOSITORY_SCHEMA_TYPE";//$NON-NLS-1$
                                dbSelectorCommand = new PropertyChangeCommand(getElem(), paramName, TalendTextUtils.addQuotes(name));
                                getUi().executeCommand(dbSelectorCommand);
                                getUi().updateUIText(paramName, TalendTextUtils.addQuotes(name));
                                paramName = "SCHEMA_TARGET";//$NON-NLS-1$
                            }
                        } else if (nodeElement.getComponent().getName().startsWith("tSalesforce")) {//$NON-NLS-1$
                            paramName = paramName + ":" + EParameterName.REPOSITORY_SCHEMA_TYPE.getName();//$NON-NLS-1$
                            Command selectorCommand = new PropertyChangeCommand(getElem(), paramName,
                                    TalendTextUtils.addQuotes(value));
                            getUi().executeCommand(selectorCommand);
                        } else {
                            Command dbSelectorCommand = new PropertyChangeCommand(getElem(), paramName,
                                    TalendTextUtils.addQuotes(repositoryMetadata.getTableName()));
                            getUi().executeCommand(dbSelectorCommand);
                            getUi().updateUIText(paramName, TalendTextUtils.addQuotes(repositoryMetadata.getTableName()));
                        }
                    }
                }
                String value = id + " - " + name; //$NON-NLS-1$

                String fullParamName = paramName + ":" + getRepositoryChoiceParamName(); //$NON-NLS-1$

                org.talend.core.model.metadata.builder.connection.Connection connection = null;
                if (getElem() instanceof Node) {
                    IMetadataTable repositoryMetadata = null;
                    if (table != null && table instanceof SAPBWTable) {
                        repositoryMetadata = ConvertionHelper.convert(table);
                    } else {
                        repositoryMetadata = MetadataToolHelper.getMetadataFromRepository(value);
                        connection = MetadataToolHelper.getConnectionFromRepository(value);
                    }
                    // For SAP see bug 5423
                    String functionId = node.getParent().getId();
                    if (((Node) getElem()).getUniqueName().startsWith("tSAP") && !((Node) getElem()).getUniqueName().startsWith("tSAPHana")//$NON-NLS-1$//$NON-NLS-2$
                            && functionId != "-1") {//$NON-NLS-1$
                        Node sapNode = (Node) getElem();
                        repositoryMetadata = getMetadataFromRepository(id, functionId, name);

                        String functionName = node.getParent().getObject().getLabel();
                        for (IElementParameter param : sapNode.getElementParameters()) {
                            SAPParametersUtils.retrieveSAPParams(getElem(), connection, param, functionName);
                        }
                    }
                    // For validation rule.
                    boolean isValRulesLost = false;
                    IRepositoryViewObject currentValRuleObj = ValidationRulesUtil.getCurrentValidationRuleObjs(getElem());
                    if (currentValRuleObj != null) {
                        List<IRepositoryViewObject> valRuleObjs = ValidationRulesUtil.getRelatedValidationRuleObjs(value);
                        if (!ValidationRulesUtil.isCurrentValRuleObjInList(valRuleObjs, currentValRuleObj)) {

                            if (!getUi().openConfirm(Messages.getString("AbstractSchemaController.validationrule.title.confirm"),
                                    Messages.getString("AbstractSchemaController.validationrule.selectMetadataMsg"))) {
                                return null;
                            } else {
                                isValRulesLost = true;
                            }
                        }
                    }

                    if (repositoryMetadata == null) {
                        repositoryMetadata = new MetadataTable();
                    }
                    if (switchParam != null) {
                        switchParam.setValue(Boolean.FALSE);
                    }

                    CompoundCommand cc = new CompoundCommand();
                    RepositoryChangeMetadataCommand changeMetadataCommand = new RepositoryChangeMetadataCommand((Node) getElem(),
                            fullParamName, value, repositoryMetadata, null, null, table);
                    changeMetadataCommand.setConnection(connection);
                    cc.add(changeMetadataCommand);

                    if (isValRulesLost) {
                        ValidationRulesUtil.appendRemoveValidationRuleCommands(cc, getElem());
                    }
                    return cc;
                }
            }
        } else if (button.getData(NAME).equals(COPY_CHILD_COLUMNS)) {
            String paramName = (String) button.getData(PARAMETER_NAME);
            IElementParameter param = getElem().getElementParameter(paramName);
            IElementParameter processParam = getElem().getElementParameterFromField(EParameterFieldType.PROCESS_TYPE);
            IElementParameter processIdParam = processParam.getChildParameters()
                    .get(EParameterName.PROCESS_TYPE_PROCESS.getName());
            String id = (String) processIdParam.getValue();
            Item item = ItemCacheManager.getProcessItem(id);
            Node node = (Node) getElem();
            copySchemaFromChildJob(node, item);
            // pop up the schema dialog
            MetadataDialogBusinessHandler handler = new MetadataDialogBusinessHandler(null, null, node.getMetadataList().get(0),
                    node);
            handler.setTitle(Messages.getString("AbstractSchemaController.schemaOf") + node.getLabel()); //$NON-NLS-1$
            MetadataDialogBusinessHandler metaDialog = getUi().openMetadataDialog(handler);
            if (metaDialog.getOpenResult().equals(MetadataDialog.OK)) {
                IMetadataTable outputMetaData = metaDialog.getOutputMetaTable();
                return new ChangeMetadataCommand(node, param, null, outputMetaData);
            }
        }
        return null;
    }

    private void setMetadataTableOriginalNameList(IMetadataTable metadataTable, IMetadataTable tableCopy) {
        if (metadataTable != null) {
            if (metadataTable.isRepository() && metadataTable.getOriginalColumns() == null) {
                List<String> columnNames = new ArrayList<String>();
                for (IMetadataColumn column : metadataTable.getListColumns()) {
                    columnNames.add(column.getLabel());
                }
                if (metadataTable.getOriginalColumns() == null || metadataTable.getOriginalColumns().isEmpty()) {
                    metadataTable.setOriginalColumns(columnNames);
                }
            }
            if (tableCopy.getOriginalColumns() == null || tableCopy.getOriginalColumns().isEmpty()) {
                tableCopy.setOriginalColumns(metadataTable.getOriginalColumns());
            }
        }
    }

    public IMetadataTable getMetadataTableFromXml(INode node) {
        IElementParameter param = node.getElementParameterFromField(EParameterFieldType.SCHEMA_TYPE);
        if (param.getValue() instanceof IMetadataTable) {
            IMetadataTable table = (IMetadataTable) param.getValue();
            return table;
        }
        return null;
    }

    @Override
    public Command createComboCommand(IWidgetContext combo) {
        IMetadataTable repositoryMetadata = null;

        String fullParamName = (String) combo.getData(PARAMETER_NAME);
        IElementParameter switchParam = getElem().getElementParameter(EParameterName.REPOSITORY_ALLOW_AUTO_SWITCH.getName());
        String value = new String(""); //$NON-NLS-1$

        IElementParameter param = getElem().getElementParameter(fullParamName);
        for (int j = 0; j < param.getListItemsValue().length; j++) {
            if (combo.getText().equals(param.getListItemsDisplayName()[j])) {
                value = (String) param.getListItemsValue()[j];
            }
        }

        // if change to build-in, unuse the validation rule if the component has.
        boolean isValRulesLost = false;
        IRepositoryViewObject currentValRuleObj = ValidationRulesUtil.getCurrentValidationRuleObjs(getElem());
        if (value.equals(EmfComponent.BUILTIN) && currentValRuleObj != null) {

            if (!getUi().openConfirm(Messages.getString("AbstractSchemaController.validationrule.title.confirm"),
                    Messages.getString("AbstractSchemaController.validationrule.selectBuildInMsg"))) {
                return null;
            } else {
                isValRulesLost = true;
            }
        }

        org.talend.core.model.metadata.builder.connection.Connection connection = null;

        if (getElem() instanceof Node) {
            Node node = (Node) getElem();
            Command baseCommand = null;
            boolean isReadOnly = false;
            String newRepositoryIdValue = null;
            if (node.getMetadataFromConnector(param.getContext()) != null) {
                isReadOnly = node.getMetadataFromConnector(param.getContext()).isReadOnly();
            }
            if (value.equals(EmfComponent.BUILTIN) && isReadOnly && !"tLogCatcher".equals(node.getComponent().getName()) //$NON-NLS-1$
                    && !"tStatCatcher".equals(node.getComponent().getName())) { //$NON-NLS-1$
                boolean hasMetadataInput = false;
                if (node.getCurrentActiveLinksNbInput(EConnectionType.FLOW_MAIN) > 0
                        || node.getCurrentActiveLinksNbInput(EConnectionType.TABLE) > 0) {
                    hasMetadataInput = true;
                }
                repositoryMetadata = new MetadataTable();
                if (hasMetadataInput) {
                    for (Connection connec : (List<Connection>) node.getIncomingConnections()) {
                        if (connec.isActivate() && (connec.getLineStyle().equals(EConnectionType.FLOW_MAIN)
                                || connec.getLineStyle().equals(EConnectionType.TABLE))) {
                            repositoryMetadata = connec.getMetadataTable().clone();
                        }
                    }

                }
            } else if (value.equals(EmfComponent.REPOSITORY)) {
                // Map<String, IMetadataTable> repositoryTableMap = dynamicProperty.getRepositoryTableMap();
                IElementParameter property = ((Node) getElem()).getElementParameter(EParameterName.PROPERTY_TYPE.getName());
                if ((property != null) && EmfComponent.REPOSITORY.equals(property.getValue())) {
                    String propertySelected = (String) ((Node) getElem())
                            .getElementParameter(EParameterName.REPOSITORY_PROPERTY_TYPE.getName()).getValue();
                    IProxyRepositoryFactory factory = ProxyRepositoryFactory.getInstance();
                    /* 16969 */
                    Item item = null;
                    try {
                        IRepositoryViewObject repobj = factory.getLastVersion(propertySelected);
                        if (repobj != null) {
                            Property tmpproperty = repobj.getProperty();
                            if (tmpproperty != null) {
                                item = tmpproperty.getItem();
                            }
                        }
                        // item = factory.getLastVersion(propertySelected).getProperty().getItem();
                    } catch (PersistenceException e) {
                        ExceptionHandler.process(e);
                    }
                    if (item != null && item instanceof ConnectionItem) {

                        final ConnectionItem connectionItem = (ConnectionItem) item;
                        if (connectionItem != null) {
                            connection = connectionItem.getConnection();
                        }
                    }
                }

                IElementParameter repositorySchemaType = param.getParentParameter().getChildParameters()
                        .get(EParameterName.REPOSITORY_SCHEMA_TYPE.getName());
                String schemaSelected = (String) repositorySchemaType.getValue();
                if (schemaSelected == null
                        || (EmfComponent.BUILTIN.equals(param.getValue()) && ("module.main.schema".equals(getCurParameter().getName())
                                || "table.main.schema".equals(getCurParameter().getName())))) {
                    schemaSelected = ""; //$NON-NLS-1$
                }

                /* value can be devided means the value like "connectionid - label" */
                String[] keySplitValues = schemaSelected.toString().split(" - "); //$NON-NLS-1$
                if (keySplitValues.length > 1) {
                    String connectionId = keySplitValues[0];
                    String tableLabel = keySplitValues[1];
                    IProxyRepositoryFactory factory = ProxyRepositoryFactory.getInstance();
                    Item item = null;
                    try {
                        IRepositoryViewObject repobj = factory.getLastVersion(connectionId);
                        if (repobj != null) {
                            Property tmpproperty = repobj.getProperty();
                            if (tmpproperty != null) {
                                item = tmpproperty.getItem();
                            }
                        }
                    } catch (PersistenceException e) {
                        ExceptionHandler.process(e);
                    }
                    if (item != null && item instanceof ConnectionItem) {

                        final ConnectionItem connectionItem = (ConnectionItem) item;
                        if (connectionItem != null) {
                            connection = connectionItem.getConnection();
                        }
                    }
                    if (item != null && item instanceof ConnectionItem) {
                        boolean findTable = false;
                        Set<org.talend.core.model.metadata.builder.connection.MetadataTable> tables = null;
                        IGenericWizardService wizardService = null;
                        if (GlobalServiceRegister.getDefault().isServiceRegistered(IGenericWizardService.class)) {
                            wizardService = (IGenericWizardService) GlobalServiceRegister.getDefault()
                                    .getService(IGenericWizardService.class);
                        }
                        if (wizardService != null && wizardService.isGenericItem(item)) {
                            tables = new HashSet<>(wizardService.getMetadataTables(connection));
                        } else {
                            tables = ConnectionHelper.getTables(connection);
                        }
                        for (org.talend.core.model.metadata.builder.connection.MetadataTable table : tables) {
                            if (table.getLabel().equals(tableLabel)) {
                                repositoryMetadata = ConvertionHelper.convert(table);
                                newRepositoryIdValue = schemaSelected;
                                findTable = true;
                                break;
                            }
                        }
                        if (!findTable) {
                            repositoryMetadata = new MetadataTable();
                        }
                    } else {
                        repositoryMetadata = new MetadataTable();
                    }
                } else { // value only got a empty string
                    repositoryMetadata = new MetadataTable();
                }
            } else {
                baseCommand = new PropertyChangeCommand(getElem(), fullParamName, value);
            }
            if (switchParam != null) {
                switchParam.setValue(Boolean.FALSE);
            }

            CompoundCommand cc = new CompoundCommand();

            if (baseCommand != null) {
                cc.add(baseCommand);
            } else {
                RepositoryChangeMetadataCommand changeMetadataCommand = new RepositoryChangeMetadataCommand((Node) getElem(),
                        fullParamName, value, repositoryMetadata, newRepositoryIdValue, null);
                changeMetadataCommand.setConnection(connection);
                cc.add(changeMetadataCommand);
            }
            // unuse the validation rules of the component.
            if (isValRulesLost) {
                ValidationRulesUtil.appendRemoveValidationRuleCommands(cc, getElem());
            }
            return cc;
        }
        return null;
    }

    public static org.talend.core.model.metadata.IMetadataTable getMetadataFromRepository(String connectionId, String functionId,
            String tableName) {
        org.talend.core.model.metadata.builder.connection.MetadataTable table = MetadataToolHelper
                .getMetadataTableFromSAPFunction(connectionId, functionId, tableName);
        if (table != null) {
            return ConvertionHelper.convert(table);
        }
        return null;
    }

    @Override
    public String getRepositoryChoiceParamName() {
        return EParameterName.REPOSITORY_SCHEMA_TYPE.getName();
    }

    @Override
    public String getRepositoryTypeParamName() {
        return EParameterName.SCHEMA_TYPE.getName();
    }

    /**
     * Change the schema type to built in.
     */
    class RepositoryChangeSchemaBuiltinCommand extends Command {

        private IElement elem;

        private String propertyName;

        public RepositoryChangeSchemaBuiltinCommand(IElement elem, String propertyName) {
            this.elem = elem;
            this.propertyName = propertyName;
            setLabel(Messages.getString("PropertyChangeCommand.Label")); //$NON-NLS-1$
        }

        @Override
        public void execute() {
            // Force redraw of Commponents propoerties
            elem.setPropertyValue(EParameterName.UPDATE_COMPONENTS.getName(), new Boolean(true));
            IElementParameter param = elem.getElementParameter(propertyName);
            IElementParameter schemaTypeParam = param.getChildParameters().get("SCHEMA_TYPE"); //$NON-NLS-1$
            schemaTypeParam.setRepositoryValueUsed(false);
            schemaTypeParam.setReadOnly(false);
            elem.setPropertyValue(param.getName() + ":SCHEMA_TYPE", EmfComponent.BUILTIN); //$NON-NLS-1$
        }

        @Override
        public void undo() {
            // Force redraw of Commponents propoerties
            elem.setPropertyValue(EParameterName.UPDATE_COMPONENTS.getName(), new Boolean(true));
            IElementParameter param = elem.getElementParameter(propertyName);
            IElementParameter schemaTypeParam = param.getChildParameters().get("SCHEMA_TYPE"); //$NON-NLS-1$
            schemaTypeParam.setRepositoryValueUsed(true);
            schemaTypeParam.setReadOnly(true);
            elem.setPropertyValue(param.getName() + ":SCHEMA_TYPE", EmfComponent.REPOSITORY); //$NON-NLS-1$
        }
    }

}
