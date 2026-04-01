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
package org.talend.designer.core.ui.editor.properties.controllers.dynamic;

import java.beans.PropertyChangeEvent;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.concurrent.BasicThreadFactory;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gef.commands.CommandStack;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.ui.runtime.exception.ExceptionMessageDialog;
import org.talend.core.GlobalServiceRegister;
import org.talend.core.ITDQRuleService;
import org.talend.core.model.metadata.IMetadataColumn;
import org.talend.core.model.metadata.IMetadataTable;
import org.talend.core.model.metadata.MetadataColumn;
import org.talend.core.model.metadata.MetadataTable;
import org.talend.core.model.metadata.MetadataToolHelper;
import org.talend.core.model.process.IContext;
import org.talend.core.model.process.IElementParameter;
import org.talend.core.model.utils.TalendTextUtils;
import org.talend.core.ui.metadata.dialog.MetadataDialog;
import org.talend.core.ui.properties.tab.IDynamicProperty;
import org.talend.core.utils.KeywordsValidator;
import org.talend.designer.core.i18n.Messages;
import org.talend.designer.core.ui.editor.cmd.ChangeMetadataCommand;
import org.talend.designer.core.ui.editor.nodes.Node;
import org.talend.designer.core.ui.editor.properties.controllers.AbstractElementPropertySectionController;
import org.talend.designer.core.ui.editor.properties.controllers.uidialog.OpenContextChooseComboDialog;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DynamicGuessSchemaController extends AbstractElementPropertySectionController {

    private static final String CONTEXT_CHOOSE_DIALOG_TITLE = "Choose a context for query :";//$NON-NLS-1$

    private static final String GUESS_SCHEMA_NAME = "Guess schema"; //$NON-NLS-1$

    private static final String SCHEMA = "SCHEMA"; //$NON-NLS-1$

    private ExecutorService executorService = Executors
            .newCachedThreadPool(new BasicThreadFactory.Builder().namingPattern(getClass().getName() + "-%d").build()); //$NON-NLS-1$

    public DynamicGuessSchemaController(IDynamicProperty dp) {
        super(dp);
    }

    @Override
    public Control createControl(Composite subComposite, IElementParameter param, int numInRow, int nbInRow, int top,
            Control lastControl) {
        this.curParameter = param;
        this.paramFieldType = param.getFieldType();
        FormData data;

        Button btnCmd = new Button(subComposite, SWT.NONE);
        btnCmd.setText(GUESS_SCHEMA_NAME);

        data = new FormData();

        GC gc = new GC(btnCmd);
        gc.dispose();

        data.left = new FormAttachment(lastControl, 0);
        data.top = new FormAttachment(0, top);
        data.height = STANDARD_HEIGHT + 2;
        btnCmd.setLayoutData(data);
        btnCmd.setData(PARAMETER_NAME, param.getName());
        btnCmd.setData(NAME, SCHEMA);
        btnCmd.setData(SCHEMA, checkQuotes((String) param.getValue()));
        btnCmd.setEnabled(!param.isReadOnly());
        btnCmd.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent event) {
                doGuessSchema();
            }

        });

        return btnCmd;
    }

    @SuppressWarnings("unchecked")
    private void doGuessSchema() {
        final IContext context = selectContext();
        if (context == null) {
            return;
        }
        DynamicGuessSchemaRunnable guessSchema = new DynamicGuessSchemaRunnable(context);
        try {
            new ProgressMonitorDialog(composite.getShell()).run(true, true, guessSchema);
        } catch (InvocationTargetException | InterruptedException e) {
            Display.getDefault().asyncExec(() -> {
                ExceptionMessageDialog.openError(composite.getShell(), Messages.getString("guessSchema.dialog.error.title"), //$NON-NLS-1$
                        Messages.getString("guessSchema.dialog.error.msg.default"), e.getCause().getCause()); //$NON-NLS-1$
            });
            if (InterruptedException.class.isInstance(e)) {
                Thread.currentThread().interrupt();
            }
            return; // Guess schema failed
        }

        if (guessSchema.isCanceled()) {
            return; // task was canceled
        }

        String schema = guessSchema.getSchema();
        IMetadataTable newMeta = buildMetadata(schema);
        if (newMeta == null || newMeta.getListColumns().isEmpty()) {
            ExceptionMessageDialog.openInformation(composite.getShell(),
                    Messages.getString("guessSchema.dialog.info.NoSchema.title"), //$NON-NLS-1$
                    Messages.getString("guessSchema.dialog.info.NoSchema.msg")); //$NON-NLS-1$
            return;
        }
        Node node = Node.class.cast(curParameter.getElement());
        CommandStack commandStack = getCommandStack();
        MetadataDialog metaDialog = new MetadataDialog(composite.getShell(), newMeta, node, commandStack);
        metaDialog.setText(Messages.getString("guessSchema.dialog.title", node.getLabel())); //$NON-NLS-1$
        if (metaDialog.open() == MetadataDialog.OK) {
            IMetadataTable outputMetaCopy = metaDialog.getOutputMetaData();
            IMetadataTable old = node.getMetadataTable(outputMetaCopy.getTableName());
            if (outputMetaCopy.sameMetadataAs(old, IMetadataColumn.OPTIONS_NONE)) {
                return;
            }
            IElementParameter param = ((List<IElementParameter>) elem.getElementParameters()).stream()
                    .filter(p -> p.getContext() != null).findFirst().orElse(curParameter);
            ChangeMetadataCommand cmd = new ChangeMetadataCommand(node, param, old, outputMetaCopy);
            if (commandStack != null) {
                commandStack.execute(cmd);
            } else {
                cmd.execute();
            }
        }
    }

    private IContext selectContext() {
        Shell parentShell = composite.getShell();
        List<IContext> allContexts = Node.class.cast(curParameter.getElement()).getProcess().getContextManager().getListContext();
        OpenContextChooseComboDialog dialog = new OpenContextChooseComboDialog(parentShell, allContexts);
        dialog.create();
        dialog.getShell().setText(CONTEXT_CHOOSE_DIALOG_TITLE);
        IContext selectContext = null;
        if (allContexts.size() == 1) {
            selectContext = Node.class.cast(curParameter.getElement()).getProcess().getContextManager().getDefaultContext();
        } else if (Window.OK == dialog.open()) {
            selectContext = dialog.getSelectedContext();
        }
        return selectContext;
    }

    private String checkQuotes(String str) {
        if (str == null || "".equals(str)) { //$NON-NLS-1$
            return TalendTextUtils.addQuotes(str);
        }

        return str;
    }

    private IMetadataTable buildMetadata(String schema) {
        if (StringUtils.isBlank(schema)) {
            return null;
        }
        List<MetadataColumn> metadataColumns = new ArrayList<>();
        String[] lines = schema.split("\n"); //$NON-NLS-1$
        ObjectMapper mapper = new ObjectMapper();
        for (String line : lines) {
            try {
                List<DynamicMetadata> dynamicColumns = mapper.readValue(line, new TypeReference<List<DynamicMetadata>>() {
                });
                dynamicColumns.stream().map(DynamicMetadata::convert).forEach(columm -> metadataColumns.add(columm));
            } catch (JsonProcessingException e) {
                ExceptionHandler.process(e);
            }
        }
        if (metadataColumns.isEmpty()) {
            return null;
        }

        List<String> columnLabels = new ArrayList<>();
        List<IMetadataColumn> columns = new ArrayList<>();
        int i = -1;
        for (IMetadataColumn oneColumn : metadataColumns) {
            i++;
            oneColumn.setLabel(getLabel(columnLabels, i, oneColumn));
            if (oneColumn.getOriginalDbColumnName() == null || oneColumn.getOriginalDbColumnName().isEmpty()) {
                oneColumn.setOriginalDbColumnName(oneColumn.getLabel());
            }
            columns.add(oneColumn);
            columnLabels.add(oneColumn.getLabel());
        }

        if (!columns.isEmpty()) {
            IElementParameter dqRule = elem.getElementParameter("DQRULES_LIST"); //$NON-NLS-1$
            if (dqRule != null) {
                ITDQRuleService ruleService = null;
                try {
                    ruleService = (ITDQRuleService) GlobalServiceRegister.getDefault().getService(ITDQRuleService.class);
                } catch (RuntimeException e) {
                    // nothing to do
                }
                IElementParameter queryParam = elem.getElementParameter("QUERY"); //$NON-NLS-1$
                if (ruleService != null && queryParam != null) {
                    ruleService.updateOriginalColumnNames(columns, queryParam);
                }
            }
        }

        IMetadataTable metadataTable = new MetadataTable();
        if (metadataTable.getTableName() == null) {
            metadataTable.setTableName(Node.class.cast(curParameter.getElement()).getUniqueName());
        }
        metadataTable.setListColumns(columns);
        // String dbmsId = String.valueOf(elem.getElementParameter("MAPPING").getValue()); //$NON-NLS-1$
        // metadataTable.setDbms(dbmsId);
        return metadataTable;
    }

    private String getLabel(List<String> columnLabels, int i, IMetadataColumn oneColumn) {
        String labelName = oneColumn.getLabel();
        String sub = ""; //$NON-NLS-1$
        String sub2 = ""; //$NON-NLS-1$
        if (labelName != null && labelName.length() > 0 && labelName.startsWith("_")) { //$NON-NLS-1$
            sub = labelName.substring(1);
            if (sub.length() > 0) {
                sub2 = sub.substring(1);
            }
        }
        if (KeywordsValidator.isKeyword(labelName) || KeywordsValidator.isKeyword(sub) || KeywordsValidator.isKeyword(sub2)) {
            labelName = "_" + labelName; //$NON-NLS-1$
        }
        return MetadataToolHelper.validateColumnName(labelName, i, columnLabels);
    }

    @Override
    public void dispose() {
        super.dispose();
        if (executorService != null && !executorService.isShutdown()) {
            try {
                executorService.shutdownNow();
                executorService.shutdown();
            } catch (SecurityException e) {
                ExceptionHandler.process(e);
            }
        }
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        //
    }

    @Override
    public int estimateRowSize(Composite subComposite, IElementParameter param) {
        return 0;
    }

    @Override
    public void refresh(IElementParameter param, boolean check) {
        //
    }

    class DynamicGuessSchemaRunnable implements IRunnableWithProgress {

        private IContext context;

        private String schema;

        private boolean canceled;

        DynamicGuessSchemaRunnable(IContext context) {
            this.context = context;
        }

        @Override
        public void run(IProgressMonitor monitor) throws InterruptedException, InvocationTargetException {
            try {
                DynamicGuessSchemaProcess gsp = new DynamicGuessSchemaProcess(Node.class.cast(curParameter.getElement()), context,
                        executorService);

                Future<String> result = gsp.run();
                while (!result.isDone()) {
                    if (monitor.isCanceled()) {
                        result.cancel(true);
                        canceled = true;
                        gsp.kill();
                        return;
                    }
                }
                try {
                    schema = result.get();
                } catch (ExecutionException e) {
                    throw new InvocationTargetException(e);
                }
            } finally {
                monitor.done();
            }
        }

        synchronized String getSchema() {
            return schema;
        }

        synchronized boolean isCanceled() {
            return canceled;
        }
    }

}
