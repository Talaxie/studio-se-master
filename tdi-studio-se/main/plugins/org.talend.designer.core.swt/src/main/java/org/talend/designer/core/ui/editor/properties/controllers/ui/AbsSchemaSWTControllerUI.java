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
package org.talend.designer.core.ui.editor.properties.controllers.ui;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.fieldassist.DecoratedField;
import org.eclipse.jface.fieldassist.FieldDecoration;
import org.eclipse.jface.fieldassist.FieldDecorationRegistry;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.talend.commons.ui.runtime.image.ImageProvider;
import org.talend.commons.ui.swt.dialogs.ModelSelectionBusinessHandler;
import org.talend.commons.ui.swt.dialogs.ModelSelectionDialog;
import org.talend.core.model.metadata.IMetadataColumn;
import org.talend.core.model.metadata.IMetadataTable;
import org.talend.core.model.metadata.builder.database.ExtractMetaDataUtils;
import org.talend.core.model.process.EConnectionType;
import org.talend.core.model.process.EParameterFieldType;
import org.talend.core.model.process.IConnection;
import org.talend.core.model.process.IElementParameter;
import org.talend.core.model.process.INodeConnector;
import org.talend.core.ui.CoreUIPlugin;
import org.talend.core.ui.metadata.dialog.MetadataDialog;
import org.talend.core.ui.metadata.dialog.MetadataDialogBusinessHandler;
import org.talend.core.ui.metadata.dialog.MetadataDialogForMerge;
import org.talend.core.ui.metadata.dialog.MetadataDialogForMergeBusinessHandler;
import org.talend.core.ui.properties.tab.IDynamicProperty;
import org.talend.designer.core.i18n.Messages;
import org.talend.designer.core.model.components.EParameterName;
import org.talend.designer.core.model.components.EmfComponent;
import org.talend.designer.core.ui.editor.nodes.Node;
import org.talend.designer.core.ui.editor.properties.controllers.creator.SelectAllTextControlCreator;
import org.talend.designer.core.ui.editor.properties.controllers.executors.SchemaControllerExecutor;
import org.talend.repository.ui.dialog.RepositoryReviewBusinessHandler;
import org.talend.repository.ui.dialog.RepositoryReviewDialog;

/**
 * DOC cmeng class global comment. Detailled comment
 */
public abstract class AbsSchemaSWTControllerUI extends AbsRepositorySWTControllerUI implements ISchemaControllerUI {

    protected static final int WIZARD_WIDTH = 800;

    protected static final int WIZARD_HEIGHT = 495;

    public AbsSchemaSWTControllerUI(IDynamicProperty dp, SchemaControllerExecutor executor) {
        super(dp, executor);
    }

    @Override
    public SchemaControllerExecutor getControllerExecutor() {
        return (SchemaControllerExecutor) super.getControllerExecutor();
    }

    @Override
    public Control createControl(Composite subComposite, IElementParameter param, int numInRow, int nbInRow, int top,
            Control lastControl) {
        this.curParameter = param;
        this.paramFieldType = param.getFieldType();
        CCombo combo;
        Control lastControlUsed = lastControl;

        combo = new CCombo(subComposite, SWT.BORDER);
        IElementParameter propertyTypeParameter = param.getChildParameters()
                .get(getControllerExecutor().getRepositoryTypeParamName());
        FormData data;
        String[] originalList = propertyTypeParameter.getListItemsDisplayName();
        List<String> stringToDisplay = new ArrayList<String>();
        for (String element : originalList) {
            stringToDisplay.add(element);
        }
        combo.setItems(stringToDisplay.toArray(new String[0]));
        combo.setEditable(false);
        combo.setEnabled(!propertyTypeParameter.isReadOnly());
        if (elem instanceof Node) {
            combo.setToolTipText(VARIABLE_TOOLTIP + propertyTypeParameter.getVariableName());
        }
        if (!propertyTypeParameter.isReadOnly()) {
            if (param.getFieldType() == EParameterFieldType.PROPERTY_TYPE
                    || param.getFieldType() == EParameterFieldType.SCHEMA_TYPE
                    || param.getFieldType() == EParameterFieldType.SCHEMA_REFERENCE
                    || param.getFieldType() == EParameterFieldType.QUERYSTORE_TYPE) {
                combo.setEnabled(ExtractMetaDataUtils.getInstance().haveLoadMetadataNode());
            }
        }

        CLabel labelLabel = getWidgetFactory().createCLabel(subComposite, propertyTypeParameter.getDisplayName());
        data = new FormData();
        if (lastControl != null) {
            data.left = new FormAttachment(lastControl, 0);
        } else {
            data.left = new FormAttachment((((numInRow - 1) * MAX_PERCENT) / nbInRow), 0);
        }
        data.top = new FormAttachment(0, top);
        labelLabel.setLayoutData(data);
        if (numInRow != 1) {
            labelLabel.setAlignment(SWT.RIGHT);
        }
        // *********************
        data = new FormData();
        int currentLabelWidth = STANDARD_LABEL_WIDTH;
        GC gc = new GC(labelLabel);
        Point labelSize = gc.stringExtent(propertyTypeParameter.getDisplayName());
        gc.dispose();

        if ((labelSize.x + ITabbedPropertyConstants.HSPACE) > currentLabelWidth) {
            currentLabelWidth = labelSize.x + ITabbedPropertyConstants.HSPACE;
        }

        if (param.isRepositoryValueUsed()) {
            param.setReadOnly(true);
        }

        if (numInRow == 1) {
            if (lastControl != null) {
                data.left = new FormAttachment(lastControl, currentLabelWidth);
            } else {
                data.left = new FormAttachment(0, currentLabelWidth);
            }
        } else {
            data.left = new FormAttachment(labelLabel, 0, SWT.RIGHT);
        }
        data.top = new FormAttachment(0, top);
        combo.setLayoutData(data);
        combo.addSelectionListener(listenerSelection);
        combo.setData(PARAMETER_NAME, param.getName() + ":" + propertyTypeParameter.getName()); //$NON-NLS-1$
        lastControlUsed = combo;

        String propertyType = (String) propertyTypeParameter.getValue();
        param.setReadOnly(propertyTypeParameter.isReadOnly());
        if (propertyType != null && propertyType.equals(EmfComponent.REPOSITORY)) {
            lastControlUsed = addRepositoryChoice(subComposite, lastControlUsed, numInRow, nbInRow, top, param);
        }
        // **********************
        hashCurControls.put(param.getName() + ":" + propertyTypeParameter.getName(), combo); //$NON-NLS-1$

        Point initialSize = combo.computeSize(SWT.DEFAULT, SWT.DEFAULT);
        dynamicProperty.setCurRowSize(initialSize.y + ITabbedPropertyConstants.VSPACE);
        return lastControlUsed;
    }

    public Control addRepositoryChoice(Composite subComposite, Control lastControl, int numInRow, int nbInRow, int top,
            IElementParameter param) {
        FormData data;

        IElementParameter repositoryParameter = param.getChildParameters()
                .get(getControllerExecutor().getRepositoryChoiceParamName());

        Text labelText;

        final DecoratedField dField = new DecoratedField(subComposite, SWT.BORDER, new SelectAllTextControlCreator());
        if (param.isRequired()) {
            FieldDecoration decoration = FieldDecorationRegistry.getDefault()
                    .getFieldDecoration(FieldDecorationRegistry.DEC_REQUIRED);
            dField.addFieldDecoration(decoration, SWT.RIGHT | SWT.TOP, false);
        }
        Control cLayout = dField.getLayoutControl();
        labelText = (Text) dField.getControl();

        labelText.setData(PARAMETER_NAME, param.getName());

        cLayout.setBackground(subComposite.getBackground());
        labelText.setEditable(false);
        if (elem instanceof Node) {
            labelText.setToolTipText(VARIABLE_TOOLTIP + param.getVariableName());
        }

        // *********************
        data = new FormData();
        data.left = new FormAttachment(lastControl, 0);
        data.right = new FormAttachment(lastControl, STANDARD_REPOSITORY_WIDTH, SWT.RIGHT);
        // data.right = new FormAttachment((numInRow * MAX_PERCENT) / nbInRow, 0);
        data.top = new FormAttachment(0, top);
        cLayout.setLayoutData(data);

        Button btn;
        Point btnSize;

        btn = getWidgetFactory().createButton(subComposite, "", SWT.PUSH); //$NON-NLS-1$
        btnSize = btn.computeSize(SWT.DEFAULT, SWT.DEFAULT);

        btn.setImage(ImageProvider.getImage(CoreUIPlugin.getImageDescriptor(DOTS_BUTTON)));

        btn.addSelectionListener(listenerSelection);
        btn.setData(NAME, REPOSITORY_CHOICE);
        btn.setData(PARAMETER_NAME, param.getName());
        btn.setEnabled(!param.isReadOnly());
        data = new FormData();
        data.left = new FormAttachment(cLayout, 0);
        data.right = new FormAttachment(cLayout, STANDARD_BUTTON_WIDTH, SWT.RIGHT);
        data.top = new FormAttachment(0, top);
        data.height = STANDARD_HEIGHT - 2;
        btn.setLayoutData(data);

        // **********************
        hashCurControls.put(param.getName() + ":" + repositoryParameter.getName(), labelText); //$NON-NLS-1$
        return btn;
    }

    @Override
    public int estimateRowSize(Composite subComposite, IElementParameter param) {
        int comboSize, buttonSize;
        CCombo combo = new CCombo(subComposite, SWT.BORDER);
        IElementParameter schemaTypeParameter = param.getChildParameters().get(EParameterName.SCHEMA_TYPE.getName());
        String[] originalList = schemaTypeParameter.getListItemsDisplayName();
        combo.setItems(originalList);
        comboSize = combo.computeSize(SWT.DEFAULT, SWT.DEFAULT).y;
        combo.dispose();

        Button btn = getWidgetFactory().createButton(subComposite, "", SWT.PUSH); //$NON-NLS-1$
        buttonSize = btn.computeSize(SWT.DEFAULT, SWT.DEFAULT).y;
        btn.dispose();
        return Math.max(comboSize, buttonSize) + ITabbedPropertyConstants.VSPACE;
    }

    public Control addButton(Composite subComposite, IElementParameter param, Control lastControl, int numInRow, int top) {
        Button btn;
        Button resetBtn = null;
        Control lastControlUsed = lastControl;
        Point btnSize;
        FormData data;

        btn = getWidgetFactory().createButton(subComposite, "", SWT.PUSH); //$NON-NLS-1$
        btnSize = btn.computeSize(SWT.DEFAULT, SWT.DEFAULT);

        btn.setImage(ImageProvider.getImage(CoreUIPlugin.getImageDescriptor(DOTS_BUTTON)));

        btn.addSelectionListener(listenerSelection);
        btn.setData(NAME, SCHEMA);
        btn.setData(PARAMETER_NAME, param.getName());
        // btn.setEnabled(!param.isReadOnly());

        lastControlUsed = btn;

        if (elem instanceof Node) {
            Node node = (Node) elem;
            boolean flowMainInput = false;
            boolean multipleInput = false;
            boolean tableReadOnly = false;

            IMetadataTable table = node.getMetadataFromConnector(param.getContext());
            if (table != null) {
                tableReadOnly = table.isReadOnly() || param.isReadOnly(node.getElementParametersWithChildrens());
                for (IConnection connec : node.getIncomingConnections()) {
                    if (connec.getLineStyle().equals(EConnectionType.FLOW_MAIN)
                            || connec.getLineStyle().equals(EConnectionType.TABLE)
                            || connec.getLineStyle().equals(EConnectionType.FLOW_MERGE)) {
                        flowMainInput = true;
                    }
                }
                IMetadataTable inputTable = null;
                if (flowMainInput) {
                    int nbMain = 0;
                    for (IConnection connec : node.getIncomingConnections()) {
                        if (connec.getLineStyle().equals(EConnectionType.FLOW_MAIN)) {
                            if (inputTable == null) {
                                inputTable = connec.getMetadataTable();
                            }
                            nbMain++;
                        }
                    }
                    INodeConnector nodeConnector = node.getConnectorFromName(EConnectionType.FLOW_MAIN.getName());
                    if (nodeConnector != null) {
                        int maxFlowInput = nodeConnector.getMaxLinkInput();
                        if (maxFlowInput > 1 && nbMain >= 1 && (nbMain <= maxFlowInput || maxFlowInput == -1)) {
                            multipleInput = true;
                        }
                    }

                }
                if (flowMainInput && !multipleInput) {
                    // if component allow schema auto propagation, verify if input/output schemas are the same
                    // if not, allow to use the button sync.

                    if (node.getComponent().isSchemaAutoPropagated() && !table.sameMetadataAs(inputTable,
                            IMetadataColumn.OPTIONS_IGNORE_KEY | IMetadataColumn.OPTIONS_IGNORE_NULLABLE
                                    | IMetadataColumn.OPTIONS_IGNORE_COMMENT | IMetadataColumn.OPTIONS_IGNORE_PATTERN
                                    | IMetadataColumn.OPTIONS_IGNORE_DBCOLUMNNAME | IMetadataColumn.OPTIONS_IGNORE_DBTYPE
                                    | IMetadataColumn.OPTIONS_IGNORE_DEFAULT | IMetadataColumn.OPTIONS_IGNORE_BIGGER_SIZE)) {
                        tableReadOnly = false;
                    }
                    resetBtn = createAdditionalButton(subComposite, btn, btnSize, param,
                            Messages.getString("AbstractSchemaController.syncColumns"), //$NON-NLS-1$
                            Messages.getString("AbstractSchemaController.resetButton.tooltip"), //$NON-NLS-1$
                            top, !tableReadOnly);
                    resetBtn.setData(NAME, RESET_COLUMNS);

                    lastControlUsed = resetBtn;

                }
            }

            if (top == 0 && node.getComponent().getName().equals(TUNISERVBTGENERIC)) {
                Button newButton = null;
                if (resetBtn != null) {
                    newButton = resetBtn;
                } else {
                    newButton = btn;
                }
                Button retrieveSchemaButton = createAdditionalButton(subComposite, newButton, btnSize, param, RETRIEVE_SCHEMA,
                        RETRIEVE_SCHEMA, top, !param.isReadOnly());
                retrieveSchemaButton.setData(NAME, RETRIEVE_SCHEMA);

                lastControlUsed = retrieveSchemaButton;
            }
            // 0004322: tRunJob can import the tBufferOutput schema from the son job
            if (node.getComponent().getName().equals("tRunJob")) { //$NON-NLS-1$
                // for bug 10489
                Button newButton = null;
                if (resetBtn != null) {
                    newButton = resetBtn;
                } else {
                    newButton = btn;
                }
                Button copySchemaButton = createAdditionalButton(subComposite, newButton, btnSize, param,
                        Messages.getString("AbstractSchemaController.copyChildSchema"), Messages //$NON-NLS-1$
                                .getString("AbstractSchemaController.copyChildSchema.tooltip"), //$NON-NLS-1$
                        top, !param.isReadOnly());
                copySchemaButton.setData(NAME, COPY_CHILD_COLUMNS);

                lastControlUsed = copySchemaButton;
            }
        }

        CLabel labelLabel = getWidgetFactory().createCLabel(subComposite,
                Messages.getString("AbstractSchemaController.editSchema")); //$NON-NLS-1$
        data = new FormData();
        data.left = new FormAttachment(lastControl, 0);
        data.right = new FormAttachment(lastControl,
                labelLabel.computeSize(SWT.DEFAULT, SWT.DEFAULT).x + (ITabbedPropertyConstants.HSPACE * 2), SWT.RIGHT);
        if (resetBtn != null) {
            data.top = new FormAttachment(resetBtn, 0, SWT.CENTER);
        } else {
            data.top = new FormAttachment(0, top);
        }
        labelLabel.setLayoutData(data);
        if (numInRow != 1) {
            labelLabel.setAlignment(SWT.RIGHT);
        }

        data = new FormData();
        data.left = new FormAttachment(labelLabel, 0);
        data.right = new FormAttachment(labelLabel, STANDARD_BUTTON_WIDTH, SWT.RIGHT);
        if (resetBtn != null) {
            data.top = new FormAttachment(resetBtn, 0, SWT.CENTER);
        } else {
            data.top = new FormAttachment(0, top);
        }

        data.height = STANDARD_HEIGHT - 2;
        btn.setLayoutData(data);

        // curRowSize = btnSize.y + ITabbedPropertyConstants.VSPACE;
        int buttonHeight = btnSize.y + ITabbedPropertyConstants.VSPACE;
        if (dynamicProperty.getCurRowSize() < buttonHeight) {
            dynamicProperty.setCurRowSize(buttonHeight);
        }
        return lastControlUsed;
    }

    public Button createAdditionalButton(Composite subComposite, Button button, Point buttonSize, IElementParameter param,
            String text, String tooltip, int top, boolean enabled) {
        Button subButton = getWidgetFactory().createButton(subComposite, text, SWT.PUSH);
        subButton.setToolTipText(tooltip);

        Point subButtonnSize = subButton.computeSize(SWT.DEFAULT, SWT.DEFAULT);

        subButton.addSelectionListener(listenerSelection);
        FormData data = new FormData();
        data.left = new FormAttachment(button, 0);
        data.right = new FormAttachment(button, subButtonnSize.x + ITabbedPropertyConstants.HSPACE, SWT.RIGHT);
        data.top = new FormAttachment(0, top);
        data.height = subButtonnSize.y;
        subButton.setLayoutData(data);

        subButton.setData(PARAMETER_NAME, param.getName());
        subButton.setEnabled(enabled);
        if (subButtonnSize.y > buttonSize.y) {
            buttonSize.y = subButtonnSize.y;
        }
        return subButton;
    }

    @Override
    public void refresh(IElementParameter param, boolean check) {
        super.refresh(param, check);
    }

    @Override
    public ModelSelectionBusinessHandler openModelSelectionDialog(ModelSelectionBusinessHandler handler) {
        ModelSelectionDialog modelSelect = new ModelSelectionDialog(handler, composite.getShell());
        int open = modelSelect.open();
        handler.setOptionValue(modelSelect.getOptionValue());
        handler.setOpenResult(open);
        return handler;
    }

    @Override
    public MetadataDialogForMergeBusinessHandler openMetadataDialogForMerge(MetadataDialogForMergeBusinessHandler handler) {
        MetadataDialogForMerge metaDialogForMerge = new MetadataDialogForMerge(handler, composite.getShell(), getCommandStack());
        int open = metaDialogForMerge.open();
        handler.setOpenResult(open);
        return handler;
    }

    @Override
    public MetadataDialogBusinessHandler openMetadataDialog(MetadataDialogBusinessHandler handler) {
        MetadataDialog metadataDialog = new MetadataDialog(handler, composite.getShell(), getCommandStack());
        int open = metadataDialog.open();
        handler.setOpenResult(open);
        return handler;
    }

    @Override
    public RepositoryReviewBusinessHandler openRepositoryReviewDialog(RepositoryReviewBusinessHandler handler) {
        RepositoryReviewDialog dialog = new RepositoryReviewDialog(handler, composite.getShell());
        int open = dialog.open();
        handler.setResult(dialog.getResult());
        handler.setOpenResult(open);
        return handler;
    }

    @Override
    public void updateUIText(String paramName, String txt) {
        Text labelText = (Text) hashCurControls.get(paramName);
        if (labelText != null) {
            labelText.setText(txt);
        }
    }

}
