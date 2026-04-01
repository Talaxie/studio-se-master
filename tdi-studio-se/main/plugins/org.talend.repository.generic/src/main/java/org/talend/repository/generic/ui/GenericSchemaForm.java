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
package org.talend.repository.generic.ui;

import java.lang.reflect.InvocationTargetException;

import org.apache.avro.Schema;
import org.apache.commons.lang.StringUtils;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.PlatformUI;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.runtime.model.components.IComponentConstants;
import org.talend.commons.ui.swt.formtools.Form;
import org.talend.commons.ui.swt.formtools.LabelledText;
import org.talend.commons.ui.swt.formtools.UtilsButton;
import org.talend.commons.utils.data.list.IListenableListListener;
import org.talend.commons.utils.data.list.ListenableListEvent;
import org.talend.components.api.properties.ComponentProperties;
import org.talend.components.api.service.ComponentService;
import org.talend.core.model.metadata.MetadataToolHelper;
import org.talend.core.model.metadata.builder.connection.Connection;
import org.talend.core.model.metadata.builder.connection.MetadataTable;
import org.talend.core.model.properties.ConnectionItem;
import org.talend.core.runtime.services.IGenericWizardInternalService;
import org.talend.core.ui.check.Checker;
import org.talend.core.ui.check.IChecker;
import org.talend.core.ui.metadata.editor.MetadataEmfTableEditor;
import org.talend.core.ui.metadata.editor.MetadataEmfTableEditorView;
import org.talend.designer.core.generic.utils.ComponentsUtils;
import org.talend.designer.core.generic.utils.SchemaUtils;
import org.talend.metadata.managment.ui.wizard.AbstractForm;
import org.talend.repository.generic.i18n.Messages;

import orgomg.cwm.objectmodel.core.TaggedValue;
/**
 *
 * created by ycbai on 2015年10月28日 Detailled comment
 *
 */
public class GenericSchemaForm extends AbstractForm {

    private static final int WIDTH_GRIDDATA_PIXEL = 750;

    private MetadataEmfTableEditor metadataEditor;

    private MetadataEmfTableEditorView tableEditorView;

    private MetadataTable metadataTable;

    private LabelledText metadataNameText;

    private LabelledText metadataCommentText;

    private boolean readOnly;

    private IChecker checker;

    private Composite compositeRetrieveSchema;

    private UtilsButton retrieveSchemaButton;

    private Label informationLabel;

    private String tableString;

    public GenericSchemaForm(Composite parent, ConnectionItem connectionItem, MetadataTable metadataTable, String[] existingNames) {
        super(parent, SWT.NONE, existingNames);
        this.metadataTable = metadataTable;
        checker = new Checker();
        setConnectionItem(connectionItem);
        setupForm();
    }

    @Override
    protected void initialize() {
        String label = MetadataToolHelper.validateValue(metadataTable.getLabel());
        metadataNameText.setText(label);
        metadataCommentText.setText(metadataTable.getComment());
        metadataEditor.setMetadataTable(metadataTable);
        tableEditorView.setMetadataEditor(metadataEditor);
        tableEditorView.getTableViewerCreator().layout();

        if (getConnection().isReadOnly()) {
            adaptFormToReadOnly();
        } else {
            updateStatus(IStatus.OK, null);
        }
        hideControl(compositeRetrieveSchema, !"Snowflake".equalsIgnoreCase(connectionItem.getTypeName())); //$NON-NLS-1$
    }

    private Connection getConnection() {
        return connectionItem.getConnection();
    }

    @Override
    protected void adaptFormToReadOnly() {
        readOnly = isReadOnly();
        metadataNameText.setReadOnly(isReadOnly());
        metadataCommentText.setReadOnly(isReadOnly());
        tableEditorView.setReadOnly(isReadOnly());
    }

    @Override
    protected void addFields() {
        Composite mainComposite = Form.startNewDimensionnedGridLayout(this, 2, WIDTH_GRIDDATA_PIXEL, 60);
        metadataNameText = new LabelledText(mainComposite, Messages.getString("GenericSchemaForm.metadataName")); //$NON-NLS-1$
        metadataCommentText = new LabelledText(mainComposite, Messages.getString("GenericSchemaForm.metadataComment")); //$NON-NLS-1$

        Group groupMetaData = Form.createGroup(this, 1, Messages.getString("GenericSchemaForm.groupMetadata"), 280); //$NON-NLS-1$
        Composite compositeMetaData = Form.startNewGridLayout(groupMetaData, 1);

        // Composite retrieve schema
        compositeRetrieveSchema = Form.startNewDimensionnedGridLayout(compositeMetaData, 2, WIDTH_GRIDDATA_PIXEL, 0);
        informationLabel = new Label(compositeRetrieveSchema, SWT.NONE);
        informationLabel.setText(Messages.getString("GenericSchemaForm.retrieveButtonUse")); //$NON-NLS-1$
        informationLabel.setSize(100, HEIGHT_BUTTON_PIXEL);

        retrieveSchemaButton = new UtilsButton(compositeRetrieveSchema,
                Messages.getString("GenericSchemaForm.retrieveSchema"), WIDTH_BUTTON_PIXEL, HEIGHT_BUTTON_PIXEL); //$NON-NLS-1$
        retrieveSchemaButton.setToolTipText(Messages.getString("GenericSchemaForm.getDetailedSchema")); //$NON-NLS-1$

        Composite compositeTable = Form.startNewDimensionnedGridLayout(compositeMetaData, 1, WIDTH_GRIDDATA_PIXEL, 200);
        compositeTable.setLayout(new FillLayout());
        metadataEditor = new MetadataEmfTableEditor(Messages.getString("GenericSchemaForm.metadataDescription")); //$NON-NLS-1$
        tableEditorView = new MetadataEmfTableEditorView(compositeTable, SWT.NONE);
    }

    @Override
    protected void addFieldsListeners() {
        metadataNameText.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(final ModifyEvent e) {
                MetadataToolHelper.validateSchema(metadataNameText.getText());
                metadataTable.setLabel(metadataNameText.getText());
                checkFieldsValue();
            }
        });
        metadataNameText.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {
                MetadataToolHelper.checkSchema(getShell(), e);
            }
        });

        metadataCommentText.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(final ModifyEvent e) {
                metadataTable.setComment(metadataCommentText.getText());
            }
        });

        tableEditorView.getMetadataEditor().addAfterOperationListListener(new IListenableListListener() {

            @Override
            public void handleEvent(ListenableListEvent event) {
                checkFieldsValue();
            }
        });
    }

    @Override
    protected boolean checkFieldsValue() {
        if (metadataNameText.getCharCount() == 0) {
            metadataNameText.forceFocus();
            updateStatus(IStatus.ERROR, Messages.getString("GenericSchemaForm.nameAlert")); //$NON-NLS-1$
            return false;
        } else if (!MetadataToolHelper.isValidSchemaName(metadataNameText.getText())) {
            metadataNameText.forceFocus();
            updateStatus(IStatus.ERROR, Messages.getString("GenericSchemaForm.nameAlertIllegalChar")); //$NON-NLS-1$
            return false;
        } else if (isNameAllowed(metadataNameText.getText())) {
            updateStatus(IStatus.ERROR, Messages.getString("GenericSchemaForm.nameAlreadyExist")); //$NON-NLS-1$
            return false;
        }

        if (tableEditorView.getMetadataEditor().getBeanCount() > 0) {
            updateStatus(IStatus.OK, null);
            return true;
        }
        updateStatus(IStatus.ERROR, Messages.getString("GenericSchemaForm.itemAlert")); //$NON-NLS-1$
        return false;
    }

    @Override
    public void setVisible(boolean visible) {
        super.setVisible(visible);
        if (visible) {
            if (isReadOnly() != readOnly) {
                adaptFormToReadOnly();
            }
        }
    }

    @Override
    protected void addUtilsButtonListeners() {
        retrieveSchemaButton.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(final SelectionEvent e) {

                if (retrieveSchemaButton.getEnabled()) {
                    pressRetrieveSchemaButton();
                    metadataTable.setName(metadataNameText.getText());
                }
            }
        });
    }

    private void pressRetrieveSchemaButton() {
        boolean doit = true;
        if (tableEditorView.getMetadataEditor().getBeanCount() > 0) {
            doit = MessageDialog.openConfirm(getShell(), Messages.getString("GenericSchemaForm.retrieveButtonConfirmation"), //$NON-NLS-1$
                    Messages.getString("GenericSchemaForm.retrieveButtonConfirmationMessage")); //$NON-NLS-1$
        }
        if (doit) {
            tableString = metadataNameText.getText();
            if (metadataNameText.getEnable() && StringUtils.isBlank(tableString)) {
                MessageDialog.openError(getShell(), Messages.getString("GenericSchemaForm.no_such_table"), //$NON-NLS-1$
                        Messages.getString("GenericSchemaForm.type_another_name")); //$NON-NLS-1$
                return;
            }
            if (metadataTable != null) {
                for (TaggedValue taggedValue : metadataTable.getTaggedValue()) {
                    if (IComponentConstants.COMPONENT_PROPERTIES_TAG.equals(taggedValue.getTag())) {
                        IRunnableWithProgress iRunnableWithProgress = new IRunnableWithProgress() {

                            @Override
                            public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
                                PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {

                                    @Override
                                    public void run() {
                                        ComponentProperties compProperties = ComponentsUtils
                                                .getComponentPropertiesFromSerialized(taggedValue.getValue(), getConnection());
                                        ComponentService compService = IGenericWizardInternalService.getService()
                                                .getComponentService();
                                        Schema schemaObj = compService.retrieveSchema(compProperties);
                                        boolean updated = SchemaUtils.updateMetadataTable(compProperties, "main.schema", //$NON-NLS-1$
                                                schemaObj, metadataTable);
                                        if (updated) {
                                            metadataEditor.setMetadataTable(metadataTable);
                                            tableEditorView.setMetadataEditor(metadataEditor);
                                            tableEditorView.getTableViewerCreator().layout();
                                        }
                                    }
                                });
                            }
                        };
                        try {
                            new ProgressMonitorDialog(getShell()).run(true, true, iRunnableWithProgress);
                        } catch (InvocationTargetException e1) {
                            ExceptionHandler.process(e1);
                        } catch (InterruptedException e2) {
                            ExceptionHandler.process(e2);
                        }
                    }
                }
            }
        }
    }

    public IChecker getChecker() {
        return this.checker;
    }

}
