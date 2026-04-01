// ============================================================================
//
// Copyright (C) 2006-2022 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.metadata.managment.ui.dialog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.SelectionDialog;
import org.talend.commons.ui.runtime.swt.tableviewer.celleditor.DateDialog;
import org.talend.commons.ui.swt.formtools.LabelledCombo;
import org.talend.commons.ui.utils.PathUtils;
import org.talend.core.model.context.ContextUtils;
import org.talend.core.model.process.IContext;
import org.talend.core.model.process.IContextParameter;
import org.talend.core.model.properties.ContextItem;
import org.talend.core.ui.context.DefaultCellEditorFactory;
import org.talend.designer.core.model.utils.emf.talendfile.ContextType;
import org.talend.metadata.managment.ui.i18n.Messages;
import org.talend.metadata.managment.ui.utils.ConnectionContextHelper;
import org.talend.utils.security.StudioEncryption;

/**
 * 
 * created by hcyi on Apr 21, 2022 Detailled comment
 *
 */
public class PromptDialog extends SelectionDialog {

    private static final int Y_POSITION = 150;

    private static final int X_POSITION = 300;

    private static final int CELLPADDING = 10;

    private static final int MINIMUM_WIDTH = 50;

    private static final String DEFAULT_FLAG = "(Default)"; //$NON-NLS-1$

    private static final String TITLE = Messages.getString("ContextSetsSelectionDialog.Title"); //$NON-NLS-1$

    private Object source;

    private List<String> contextSetsList = new ArrayList<String>();

    private String defalutContext = ConnectionContextHelper.EMPTY;

    private String selectedContext = null;

    private IContext currentContext = null;

    private boolean canCancel = false;

    private LabelledCombo contextCombo;

    private Composite contextComp;

    private Composite child;

    private List<IContext> iContexts = new ArrayList<IContext>();

    public PromptDialog(Shell parentShell, IContext context) {
        super(parentShell);
        initDialog(context, canCancel, Messages.getString("ContextSetsSelectionDialog.Messages")); //$NON-NLS-1$
        initSets();
    }

    public PromptDialog(Shell parentShell, ContextItem contextItem) {
        super(parentShell);
        initDialog(contextItem, canCancel, Messages.getString("ContextSetsSelectionDialog.Messages")); //$NON-NLS-1$
        initSets();
    }

    public PromptDialog(Shell parentShell, List<IContext> contexts, IContext defaultIContext) {
        super(parentShell);
        initDialog(contexts, canCancel, Messages.getString("ContextSetsSelectionDialog.Messages")); //$NON-NLS-1$
        if (defaultIContext != null) {
            defalutContext = defaultIContext.getName();
        }
        initSets();
    }

    private void initDialog(Object object, boolean cancelFlag, String message) {
        this.source = object;
        this.canCancel = cancelFlag;
        setHelpAvailable(false);
        setTitle(TITLE);
        setMessage(message);
    }

    private void initSets() {
        if (source != null) {
            iContexts.clear();
            if (source instanceof ContextItem) {
                ContextItem contextItem = (ContextItem) source;
                List<ContextType> contexts = contextItem.getContext();
                String repositoryContextId = contextItem.getProperty().getId();
                defalutContext = contextItem.getDefaultContext();
                for (ContextType contextType : contexts) {
                    IContext iContext = ContextUtils.convert2IContext(contextType, repositoryContextId).clone();
                    iContexts.add(iContext);
                    String name = contextType.getName();
                    if (name.equalsIgnoreCase(defalutContext)) {
                        name = name + DEFAULT_FLAG;
                        selectedContext = name;
                        currentContext = iContext;
                    }
                    contextSetsList.add(name);
                }
            } else if (source instanceof List) {
                List<IContext> contexts = (List<IContext>) source;
                iContexts = contexts;
                for (IContext context : contexts) {
                    String name = context.getName();
                    if (name.equalsIgnoreCase(defalutContext)) {
                        name = name + DEFAULT_FLAG;
                        selectedContext = name;
                        currentContext = context.clone();
                    }
                    contextSetsList.add(name);
                }
            } else if (source instanceof IContext) {
                currentContext = (IContext) source;
                iContexts.add(currentContext);
            }
        }
    }

    @Override
    protected Control createDialogArea(Composite parent) {
        final Composite composite = (Composite) super.createDialogArea(parent);
        composite.setLayout(new FillLayout());

        ScrolledComposite sc = new ScrolledComposite(composite, SWT.H_SCROLL | SWT.V_SCROLL);
        child = new Composite(sc, SWT.NONE);
        child.setLayout(new GridLayout(1, false));

        createSourceArea(child);
        createSelectionArea(child);

        contextComp = new Composite(child, SWT.NONE);
        contextComp.setLayout(new GridLayout(1, false));
        contextComp.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

        createContextArea(currentContext, contextComp);

        sc.setContent(child);

        // Set the minimum size
        // sc.setMinSize(400, 400);

        // Expand both horizontally and vertically
        sc.setExpandHorizontal(true);
        sc.setExpandVertical(true);
        sc.addControlListener(new ControlAdapter() {

            public void controlResized(ControlEvent e) {
                Rectangle r = sc.getClientArea();
                sc.setMinSize(child.computeSize(r.width, SWT.DEFAULT));
            }
        });
        addFieldsListeners();
        return composite;
    }

    private void createSourceArea(Composite parent) {
        if (source != null && source instanceof ContextItem) {
            ContextItem contextItem = (ContextItem) source;

            Composite inner = new Composite(parent, SWT.NONE);
            GridLayout gridLayout = new GridLayout(2, false);
            gridLayout.marginHeight = 0;
            inner.setLayout(gridLayout);
            inner.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

            Label label = new Label(inner, SWT.NONE);
            label.setText(Messages.getString("ContextSetsSelectionDialog.Source")); //$NON-NLS-1$

            Label source = new Label(inner, SWT.NONE);
            source.setText(contextItem.getProperty().getLabel() + " " + contextItem.getProperty().getVersion()); //$NON-NLS-1$
            source.setFont(JFaceResources.getFontRegistry().getBold(JFaceResources.DEFAULT_FONT));
        }
    }

    private void createSelectionArea(Composite parent) {
        if (source != null && (source instanceof ContextItem || source instanceof List)) {
            Composite inner = new Composite(parent, SWT.NONE);
            GridLayout gridLayout = new GridLayout();
            gridLayout.marginHeight = 0;
            inner.setLayout(gridLayout);
            GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
            gridData.minimumWidth = 220;
            gridData.minimumHeight = 100;
            inner.setLayoutData(gridData);

            contextCombo = new LabelledCombo(inner, Messages.getString("PromptDialog.context.environments.name"), null, //$NON-NLS-1$
                    contextSetsList, true);
            contextCombo.setText(defalutContext + DEFAULT_FLAG);
        }
    }

    private void createContextArea(IContext currentContext, Composite parent) {
        Group promptGroup = new Group(parent, SWT.NONE);
        promptGroup.setText(Messages.getString("PromptDialog.variablePrompts.name")); //$NON-NLS-1$
        promptGroup.setLayout(new GridLayout(1, false));
        promptGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        // Prompt for context values ?
        for (final IContextParameter parameter : currentContext.getContextParameterList()) {
            boolean isPromptNeeded = false;
            if (parameter.isPromptNeeded()) {
                isPromptNeeded = true;
            } else if (ContextUtils.isPromptNeeded(iContexts, parameter.getName())) {
                parameter.setPromptNeeded(true);
                isPromptNeeded = true;
            }
            if (isPromptNeeded) {
                if (DefaultCellEditorFactory.isBoolean(parameter.getType())) {
                    final Composite composite2 = new Composite(promptGroup, SWT.NONE);
                    final GridLayout gridLayout = new GridLayout(2, false);
                    gridLayout.horizontalSpacing = 5;
                    gridLayout.marginBottom = 0;
                    gridLayout.marginHeight = 0;
                    gridLayout.marginLeft = 0;
                    gridLayout.marginRight = 0;
                    gridLayout.marginTop = 0;
                    gridLayout.marginWidth = 0;

                    composite2.setLayout(gridLayout);
                    composite2.setLayoutData(new GridData(GridData.BEGINNING));
                    Label label = new Label(composite2, SWT.NONE);
                    label.setText(parameter.getPrompt());
                    label.setAlignment(SWT.LEFT);
                    GridData data = new GridData(GridData.FILL_HORIZONTAL);
                    data.minimumWidth = MINIMUM_WIDTH;
                    label.setLayoutData(data);
                    final Button button = new Button(composite2, SWT.CHECK);
                    button.setSelection(Boolean.parseBoolean(parameter.getValue()));
                    button.addSelectionListener(new SelectionAdapter() {

                        /*
                         * (non-Javadoc)
                         *
                         * @see
                         * org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
                         */
                        @Override
                        public void widgetSelected(SelectionEvent e) {
                            parameter.setValue((new Boolean(button.getSelection())).toString());
                        }

                    });
                } else {
                    Label label = new Label(promptGroup, SWT.NONE);
                    label.setText(parameter.getPrompt());
                    label.setAlignment(SWT.LEFT);
                    GridData data = new GridData(GridData.FILL_HORIZONTAL);
                    data.minimumWidth = MINIMUM_WIDTH;
                    label.setLayoutData(data);
                    createParameterComposite(promptGroup, parameter, label);
                }
            }
        }
        if (promptGroup.getChildren().length == 0) {
            promptGroup.dispose();
        }

    }

    private void createParameterComposite(final Composite parent, final IContextParameter parameter, Label label) {
        final Composite child = new Composite(parent, SWT.NONE);
        final GridLayout layout = new GridLayout(2, false);
        layout.marginLeft = 0;
        layout.horizontalSpacing = 0;
        layout.verticalSpacing = 0;
        layout.marginWidth = 0;
        layout.marginHeight = 0;
        child.setLayout(layout);
        child.setLayoutData(new GridData(GridData.FILL_BOTH));

        if (DefaultCellEditorFactory.isList(parameter.getType())) {
            createListParameterArea(parameter, label, child);
            return;
        }

        final Text text = new Text(child, SWT.SINGLE | SWT.BORDER);

        String paramValue = parameter.getValue();
        if (DefaultCellEditorFactory.isPassword(parameter.getType())) {
            if (StudioEncryption.hasEncryptionSymbol(paramValue)) {
                paramValue = StudioEncryption.getStudioEncryption(StudioEncryption.EncryptionKeyName.SYSTEM).decrypt(paramValue);
            }
        }
        text.setText(paramValue);

        text.addModifyListener(new ModifyListener() {

            public void modifyText(ModifyEvent e) {
                parameter.setValue(text.getText());
            }
        });

        String stringTip = ""; //$NON-NLS-1$
        String comment = ""; //$NON-NLS-1$
        if (parameter.getType().equalsIgnoreCase("String")) {// && LanguageManager.getCurrentLanguage() == //$NON-NLS-1$
            stringTip = Messages.getString("PromptDialog.stringTip"); //$NON-NLS-1$
        }

        comment = parameter.getComment();

        if (!stringTip.equals("")) { //$NON-NLS-1$
            comment = comment + " " + stringTip; //$NON-NLS-1$
        }
        label.setToolTipText(comment);
        text.setToolTipText(comment);
        GridData data = new GridData(GridData.FILL_HORIZONTAL);
        data.minimumWidth = MINIMUM_WIDTH;
        text.setLayoutData(data);
        if (DefaultCellEditorFactory.isDate(parameter.getType())) {
            text.setEditable(false);
            final Button b = new Button(child, SWT.NONE);
            b.setText("..."); //$NON-NLS-1$
            b.addSelectionListener(new SelectionAdapter() {

                /*
                 * (non-Javadoc)
                 *
                 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
                 */
                @Override
                public void widgetSelected(SelectionEvent e) {
                    DateDialog d = new DateDialog(((Button) e.getSource()).getShell());
                    int res = d.open();
                    if (res == Dialog.OK) {
                        text.setText(DefaultCellEditorFactory.getAddQuoteString(d.getTalendDateString()));
                    }
                }

            });
        } else if (DefaultCellEditorFactory.isFile(parameter.getType())) {
            text.setEditable(false);
            final Button b = new Button(child, SWT.NONE);
            b.setText("..."); //$NON-NLS-1$
            b.addSelectionListener(new SelectionAdapter() {

                /*
                 * (non-Javadoc)
                 *
                 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
                 */
                @Override
                public void widgetSelected(SelectionEvent e) {
                    FileDialog d = new FileDialog(((Button) e.getSource()).getShell());
                    if (text.getText() != null) {
                        d.setFileName(PathUtils.getOSPath(DefaultCellEditorFactory.getRemoveQuoteString(text.getText())));
                    }
                    String open = d.open();
                    if (open != null) {
                        text.setText(DefaultCellEditorFactory.getAddQuoteString(PathUtils.getPortablePath(open)));
                    }
                }

            });
        } else if (DefaultCellEditorFactory.isDirectory(parameter.getType())) {
            text.setEditable(false);
            final Button b = new Button(child, SWT.NONE);
            b.setText("..."); //$NON-NLS-1$
            b.addSelectionListener(new SelectionAdapter() {

                /*
                 * (non-Javadoc)
                 *
                 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
                 */
                @Override
                public void widgetSelected(SelectionEvent e) {
                    DirectoryDialog d = new DirectoryDialog(((Button) e.getSource()).getShell());
                    if (text.getText() != null) {
                        d.setFilterPath(PathUtils.getOSPath(DefaultCellEditorFactory.getRemoveQuoteString(text.getText())));
                    }
                    String open = d.open();
                    if (open != null) {
                        open = PathUtils.getPortablePath(open);
                        open += "/"; //$NON-NLS-1$
                        text.setText(DefaultCellEditorFactory.getAddQuoteString(open));
                    }
                }

            });
        } else if (DefaultCellEditorFactory.isPassword(parameter.getType())) {
            text.setEchoChar('*');
        }
    }

    private void createListParameterArea(final IContextParameter parameter, Label label, final Composite parent) {

        final CCombo combo = new CCombo(parent, SWT.BORDER);
        combo.setEditable(false);
        GridData data = new GridData(GridData.FILL_HORIZONTAL);
        data.minimumWidth = MINIMUM_WIDTH;
        combo.setLayoutData(data);

        String[] valueList = parameter.getValueList();
        if (valueList != null) {
            combo.setItems(valueList);
            int index = Arrays.binarySearch(valueList, parameter.getValue());
            if (index >= 0) {
                combo.select(index);
            } else {
                combo.select(0);
            }
        }
        parameter.setInternalValue(combo.getText());
        combo.addModifyListener(new ModifyListener() {

            public void modifyText(ModifyEvent e) {
                parameter.setValue(combo.getText());
            }
        });
        if (parameter.getComment() != null) {
            if (!parameter.getComment().equals("")) { //$NON-NLS-1$
                label.setToolTipText(parameter.getComment());
                combo.setToolTipText(parameter.getComment());
            }
        }
    }

    protected void addFieldsListeners() {
        if (contextCombo != null) {
            contextCombo.addModifyListener(new ModifyListener() {

                @Override
                public void modifyText(final ModifyEvent e) {
                    selectedContext = contextCombo.getItem(contextCombo.getSelectionIndex());
                    contextComp.dispose();
                    contextComp = new Composite(child, SWT.NONE);
                    contextComp.setLayout(new GridLayout(1, false));
                    contextComp.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
                    createContextArea(getCloneContext(), contextComp);
                    child.layout();
                    child.getParent().layout();
                    contextComp.layout();
                }
            });
        }
    }

    @Override
    protected void setShellStyle(int newShellStyle) {
        newShellStyle = newShellStyle | SWT.RESIZE;
        super.setShellStyle(newShellStyle);
    }

    protected void setSize(Shell shell, Point size) {
        Point centerScreen = new Point(shell.getDisplay().getClientArea().width / 2,
                shell.getDisplay().getClientArea().height / 2);

        Point newPosition = new Point(size.x / 2, size.x / 2);
        newPosition.x = centerScreen.x - newPosition.x;
        newPosition.y = centerScreen.y - newPosition.y;
        shell.setLocation(newPosition);
        shell.setSize(size.x + (size.x / 2), size.y + (size.y / 2));
    }

    @Override
    protected void configureShell(final Shell newShell) {
        super.configureShell(newShell);
        Text t = new Text(newShell, SWT.None);
        int height = t.getLineHeight() + CELLPADDING;
        t.dispose();
        int nbParams = 0;
        for (IContextParameter parameter : currentContext.getContextParameterList()) {
            if (parameter.isPromptNeeded()) {
                nbParams++;
            } else if (ContextUtils.isPromptNeeded(iContexts, parameter.getName())) {
                parameter.setPromptNeeded(true);
                nbParams++;
            }
        }
        Point dialogSize = new Point(X_POSITION, Math.min((height * nbParams) + Y_POSITION, 400));
        setSize(newShell, dialogSize);

        if (source != null && source instanceof IContext) {
            newShell.setText(Messages.getString("PromptDialog.title", currentContext.getName())); //$NON-NLS-1$
        } else {
            newShell.setText(Messages.getString("PromptDialog.choose.title")); //$NON-NLS-1$
        }
    }

    public IContext getCloneContext() {
        if (source != null) {
            if (source instanceof ContextItem) {
                ContextItem contextItem = (ContextItem) source;
                List<ContextType> contexts = contextItem.getContext();
                String repositoryContextId = contextItem.getProperty().getId();
                for (ContextType contextType : contexts) {
                    String name = contextType.getName();
                    if (name.equalsIgnoreCase(selectedContext) || (name + DEFAULT_FLAG).equalsIgnoreCase(selectedContext)) {
                        currentContext = ContextUtils.convert2IContext(contextType, repositoryContextId).clone();
                        return currentContext;
                    }
                }
            } else if (source instanceof List) {
                List<IContext> contexts = (List<IContext>) source;
                for (IContext context : contexts) {
                    String name = context.getName();
                    if (name.equalsIgnoreCase(selectedContext) || (name + DEFAULT_FLAG).equalsIgnoreCase(selectedContext)) {
                        currentContext = context.clone();
                        return currentContext;
                    }
                }
            }
        }
        return null;
    }

    public IContext getCurrentContext() {
        return currentContext;
    }

    public List<IContext> getiContexts() {
        return iContexts;
    }

    public void setiContexts(List<IContext> iContexts) {
        this.iContexts = iContexts;
    }

}
