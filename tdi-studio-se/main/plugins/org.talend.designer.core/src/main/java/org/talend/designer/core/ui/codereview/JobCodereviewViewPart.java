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
package org.talend.designer.core.ui.codereview;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.net.URL;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.Assert;
import org.eclipse.jdt.internal.ui.actions.CompositeActionGroup;
import org.eclipse.jdt.internal.ui.viewsupport.SelectionProviderMediator;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.util.DelegatingDropAdapter;
import org.eclipse.jface.util.LocalSelectionTransfer;
import org.eclipse.jface.viewers.AbstractTreeViewer;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.BusyIndicator;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.custom.TableEditor;
import org.eclipse.swt.custom.ViewForm;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DropTarget;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.ControlListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionContext;
import org.eclipse.ui.actions.ActionGroup;
import org.eclipse.ui.part.PageBook;
import org.eclipse.ui.part.ViewPart;
import org.talend.core.model.process.IProcess2;
import org.talend.core.prefs.ITalendCorePrefConstants;
import org.talend.core.ui.CoreUIPlugin;
import org.talend.core.ui.TalendBrowserLaunchHelper;
import org.talend.core.ui.webService.Webhook;
import org.talend.designer.core.DesignerPlugin;
import org.talend.designer.core.i18n.Messages;
import org.talend.designer.core.ui.IJobCodereviewViewPart;
import org.talend.repository.ProjectManager;

import org.talend.designer.core.ui.codereview.CodereviewViewerProvider;
import org.talend.designer.core.ui.codereview.CodereviewToggleViewAction;
import org.talend.designer.core.ui.codereview.CodereviewToggleOrientationAction;
import org.talend.designer.core.ui.codereview.CodereviewFocusOnJobAction;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.io.File;
import org.eclipse.core.resources.ResourcesPlugin;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.eclipse.swt.graphics.Color;

/**
 * view showing the super jobs/sub jobs of its input.
 */
public class JobCodereviewViewPart extends ViewPart implements IJobCodereviewViewPart {

    private static final Logger LOGGER = Logger.getLogger(JobCodereviewViewPart.class);

    public static final String ID = "org.talend.designer.core.ui.codereview.JobCodereviewViewPart"; //$NON-NLS-1$

    private static final String GROUP_FOCUS = "group.focus"; //$NON-NLS-1$

    private static final String DIALOGSTORE_VIEWLAYOUT = "TypeCodereviewViewPart.orientation"; //$NON-NLS-1$

    // input job or null
    private IProcess2 inputProcess;

    private IProcess2 inputProcessSelected;

    private IDialogSettings fDialogSettings;

    private CodereviewToggleViewAction[] fViewActions;

    private int fCurrentViewerIndex;

    private Composite mainComposite;

    private PageBook mainPageBook;

    private SashForm mainSashForm;

    private CLabel headerLabel;

    private ViewForm headerViewForm;

    private PageBook headerPageBook;

    private ViewForm bodyViewForm;

    private CLabel bodyLabel;

    private JobCodereviewViewer[] fAllViewers;

    private CLabel fEmptyTypesViewer;

    private List<HashMap<String, String>> codereviewItems;

    private TableViewer dependencyViewer;

    private Map<Object, Button> dependencyButtons;

    private JobCodereviewLifeCycle fCodereviewLifeCycle;

    private ISelectionChangedListener fSelectionChangedListener;

    private CodereviewToggleOrientationAction[] fToggleOrientationActions;

    private CompositeActionGroup fActionGroups;

    private CodereviewFocusOnJobAction focusOnTypeAction = null;

    String showEmptyLabel = Messages.getString("JobCodereviewViewPart.showDecription"); //$NON-NLS-1$

    private int fCurrentLayout;

    private boolean fInComputeLayout;

    private SelectionProviderMediator fSelectionProviderMediator;

    /**
     * Constructor
     */
    public JobCodereviewViewPart() {
        fCodereviewLifeCycle = new JobCodereviewLifeCycle();
        fViewActions = new CodereviewToggleViewAction[] {
            new CodereviewToggleViewAction(this, IJobCodereviewViewPart.HIERARCHY_MODE_SUBTYPES),
            new CodereviewToggleViewAction(this, IJobCodereviewViewPart.HIERARCHY_MODE_SUPERTYPES)
        };

        fSelectionChangedListener = new ISelectionChangedListener() {
            public void selectionChanged(SelectionChangedEvent event) {
                doSelectionChanged(event);
            }
        };
        fDialogSettings = DesignerPlugin.getDefault().getDialogSettings();
        fToggleOrientationActions = new CodereviewToggleOrientationAction[] {
            new CodereviewToggleOrientationAction(this, VIEW_LAYOUT_VERTICAL),
            new CodereviewToggleOrientationAction(this, VIEW_LAYOUT_HORIZONTAL),
            new CodereviewToggleOrientationAction(this, VIEW_LAYOUT_AUTOMATIC),
            new CodereviewToggleOrientationAction(this, VIEW_LAYOUT_SINGLE)
        };

        focusOnTypeAction = new CodereviewFocusOnJobAction(this);
    }

    @Override
    public void createPartControl(Composite container) {
        mainComposite = container;
        addResizeListener(mainComposite);
        mainPageBook = new PageBook(container, SWT.NONE);
        mainPageBook.setBackground(new Color(255, 255, 255));

        headerLabel = new CLabel(mainPageBook, SWT.TOP + SWT.LEFT + SWT.WRAP);
        headerLabel.setText(showEmptyLabel);
        headerLabel.setBackground(new Color(255, 255, 255));

        mainSashForm = new SashForm(mainPageBook, SWT.VERTICAL);
        mainSashForm.setVisible(false);

        headerViewForm = new ViewForm(mainSashForm, SWT.NONE);
        headerViewForm.setContent(createHeaderViewerControl(headerViewForm));

        bodyViewForm = new ViewForm(mainSashForm, SWT.BORDER | SWT.FLAT);
        bodyViewForm.setBackground(new Color(236, 237, 239));
        mainSashForm.setWeights(new int[] { 30, 70 });
        bodyViewForm.setContent(createBodyViewerControl(bodyViewForm));

        initDragAndDrop();

        MenuManager menu = new MenuManager();
        menu.add(focusOnTypeAction);
        headerLabel.setMenu(menu.createContextMenu(headerLabel));

        mainPageBook.showPage(headerLabel);

        int layout;
        try {
            layout = fDialogSettings.getInt(DIALOGSTORE_VIEWLAYOUT);
            if (layout < 0 || layout > 3) {
                layout = VIEW_LAYOUT_AUTOMATIC;
            }
        } catch (NumberFormatException e) {
            layout = VIEW_LAYOUT_AUTOMATIC;
        }
        // force the update
        fCurrentLayout = -1;
        // will fill the main tool bar
        setViewLayout(layout);

        // set the filter menu items
        IActionBars actionBars = getViewSite().getActionBars();
        IMenuManager viewMenu = actionBars.getMenuManager();

        IMenuManager layoutSubMenu = new MenuManager(Messages.getString("FocusOnJobAction.TypeHierarchyViewPart_layout_submenu")); //$NON-NLS-1$
        viewMenu.add(layoutSubMenu);
        for (int i = 0; i < fToggleOrientationActions.length; i++) {
            layoutSubMenu.add(fToggleOrientationActions[i]);
        }
        viewMenu.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));

        // selection provider
        int nCodereviewViewers = fAllViewers.length;
        StructuredViewer[] trackedViewers = new StructuredViewer[nCodereviewViewers + 1];
        for (int i = 0; i < nCodereviewViewers; i++) {
            trackedViewers[i] = fAllViewers[i];
        }
        trackedViewers[nCodereviewViewers] = dependencyViewer;
        fSelectionProviderMediator = new SelectionProviderMediator(trackedViewers, getCurrentViewer());
        getSite().setSelectionProvider(fSelectionProviderMediator);
        ActionGroup[] actionGroups = new ActionGroup[] { new JobActionGroup() };
        fActionGroups = new CompositeActionGroup(actionGroups);
        fActionGroups.fillActionBars(actionBars);
    }

    /**
     * bqian Comment method "createHeaderViewerControl".
     *
     * @param typeViewerViewForm
     * @return
     */
    private Control createHeaderViewerControl(Composite parent) {
        headerPageBook = new PageBook(parent, SWT.NULL);
        headerPageBook.setBackground(new Color(0, 0, 255));

        // Create the viewers
        JobCodereviewViewer superTypesViewer = new SuperJobCodereviewViewer(headerPageBook, fCodereviewLifeCycle, this);
        initializeTypesViewer(superTypesViewer);
        JobCodereviewViewer subTypesViewer = new SubJobCodereviewViewer(headerPageBook, fCodereviewLifeCycle, this);
        initializeTypesViewer(subTypesViewer);
        fAllViewers = new JobCodereviewViewer[2];
        fAllViewers[HIERARCHY_MODE_SUPERTYPES] = superTypesViewer;
        fAllViewers[HIERARCHY_MODE_SUBTYPES] = subTypesViewer;

        int currViewerIndex;
        try {
            currViewerIndex = HIERARCHY_MODE_SUBTYPES;
            if (currViewerIndex < 0 || currViewerIndex > 1) {
                currViewerIndex = HIERARCHY_MODE_SUBTYPES;
            }
        } catch (NumberFormatException e) {
            currViewerIndex = HIERARCHY_MODE_SUBTYPES;
        }

        fEmptyTypesViewer = new CLabel(headerPageBook, SWT.TOP | SWT.LEFT | SWT.WRAP);

        for (int i = 0; i < fAllViewers.length; i++) {
            fAllViewers[i].setInput(fAllViewers[i]);
        }

        // force the update
        fCurrentViewerIndex = -1;
        setCodereviewMode(currViewerIndex);

        return headerPageBook;
    }

    private Control createBodyViewerControl(Composite parent) {
        Composite compositeMain = new Composite(parent, SWT.NONE);
        compositeMain.setBackground(new Color(236, 237, 239));
        GridLayout mainGridLayout = new GridLayout(2, false);
        mainGridLayout.horizontalSpacing = 0;
        mainGridLayout.verticalSpacing = 0;
        mainGridLayout.marginWidth = 0;
        mainGridLayout.marginHeight = 0;
        mainGridLayout.marginTop = 0;
        mainGridLayout.marginBottom = 0;
        mainGridLayout.marginRight = 0;
        mainGridLayout.marginLeft = 0;
        compositeMain.setLayout(mainGridLayout);

        bodyLabel = new CLabel(compositeMain, SWT.NONE);
        bodyLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

        Button bodyButton = new Button(compositeMain, SWT.FLAT);
        bodyButton.setImage(ImageDescriptor.createFromURL(this.getClass().getResource("/icons/arrow_refresh.png")).createImage());
        bodyButton.setLayoutData(new GridData(SWT.RIGHT, SWT.TOP, false, false));
        bodyButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
            	fillCodereviewItems(inputProcessSelected);
            }
        });

        dependencyViewer = new TableViewer(compositeMain, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION);
        Table dependencyTable = dependencyViewer.getTable();
        GridData dependencyGridData = new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1);
        dependencyGridData.horizontalIndent = 0;
        dependencyGridData.verticalIndent = 0;
        dependencyTable.setLayoutData(dependencyGridData);
		dependencyTable.setHeaderBackground(new Color(240, 241, 243));
		dependencyTable.setHeaderForeground(new Color(96, 125, 139));
        // dependencyTable.setBackground(new Color(250, 250, 250));
        dependencyTable.setHeaderVisible(true);
        dependencyTable.setLinesVisible(true);
        dependencyButtons = new HashMap<Object, Button>();

        // Column type
        TableViewerColumn viewerColumn = new TableViewerColumn(dependencyViewer, SWT.NONE);
        TableColumn column = viewerColumn.getColumn();
        column.setText("");
        column.setWidth(2);
        column.setAlignment(SWT.CENTER);
        column.setResizable(false);
        column.setMoveable(false);
        viewerColumn.setLabelProvider(new ColumnLabelProvider() {
            @Override
            public String getText(Object element) {
                return "";
            }
        });

        // Column type
        viewerColumn = new TableViewerColumn(dependencyViewer, SWT.NONE);
        column = viewerColumn.getColumn();
        column.setText("Type");
        column.setWidth(100);
        column.setAlignment(SWT.CENTER);
        column.setResizable(true);
        column.setMoveable(true);
        viewerColumn.setLabelProvider(new ColumnLabelProvider() {
            @Override
            public String getText(Object element) {
                String type = ((HashMap<String, String>)element).get("Type");
                String text = type;
                if (type.equals("1")) {
                	text = "Bloquant";
                } else if (type.equals("2")) {
                	text = "Critique";
                } else if (type.equals("3")) {
                	text = "Major";
                } else if (type.equals("4")) {
                	text = "Mineur";
                } else if (type.equals("5")) {
                	text = "Info";
                }
            	return text;
            }

            @Override
            public Color getForeground(Object element) {
                String type = ((HashMap<String, String>)element).get("Type");
                Color color = new Color(Display.getCurrent(), new RGB(0, 0, 0));
                if (type.equals("1")) {
                    color = new Color(Display.getCurrent(), new RGB(244, 67, 54));
                } else if (type.equals("2")) {
                    color = new Color(Display.getCurrent(), new RGB(255, 152, 0));
                } else if (type.equals("3")) {
                    color = new Color(Display.getCurrent(), new RGB(33, 150, 243));
                } else if (type.equals("4")) {
                    color = new Color(Display.getCurrent(), new RGB(33, 150, 243));
                } else if (type.equals("5")) {
                    color = new Color(Display.getCurrent(), new RGB(96, 125, 139));
                }
            	return color;
            }
            
            @Override
            public Color getBackground(Object element) {
                String type = ((HashMap<String, String>)element).get("Type");
                Color color = new Color(Display.getCurrent(), new RGB(0, 0, 0));
                if (type.equals("1")) {
                    color = new Color(255, 240, 240);
                } else if (type.equals("2")) {
                    color = new Color(255, 255, 240);
                } else if (type.equals("3")) {
                    color = new Color(240, 240, 255);
                } else if (type.equals("4")) {
                    color = new Color(240, 240, 255);
                } else if (type.equals("5")) {
                    color = new Color(250, 250, 255);
                }
            	return color;
            }
        });

        // Column titre
        viewerColumn = new TableViewerColumn(dependencyViewer, SWT.NONE);
        column = viewerColumn.getColumn();
        column.setText("Titre");
        column.setWidth(200);
        column.setResizable(true);
        column.setMoveable(true);
        viewerColumn.setLabelProvider(new ColumnLabelProvider() {
            @Override
            public String getText(Object element) {
                return ((HashMap<String, String>)element).get("Titre");
            }
        });

        // Column description
        viewerColumn = new TableViewerColumn(dependencyViewer, SWT.NONE);
        column = viewerColumn.getColumn();
        column.setText("Description");
        column.setWidth(330);
        column.setResizable(true);
        column.setMoveable(true);
        viewerColumn.setLabelProvider(new ColumnLabelProvider() {
            @Override
            public String getText(Object element) {
                return ((HashMap<String, String>)element).get("Description");
            }
        });

        // Column composant
        viewerColumn = new TableViewerColumn(dependencyViewer, SWT.NONE);
        column = viewerColumn.getColumn();
        column.setText("Composant");
        column.setWidth(150);
        column.setResizable(true);
        column.setMoveable(true);
        viewerColumn.setLabelProvider(new ColumnLabelProvider() {
            @Override
            public String getText(Object element) {
                return ((HashMap<String, String>)element).get("UNIQUE_NAME");
            }
        });

        // Column redirection documentation
        viewerColumn = new TableViewerColumn(dependencyViewer, SWT.NONE);
        column = viewerColumn.getColumn();
        column.setText("Doc");
        column.setWidth(50);
        column.setResizable(true);
        column.setMoveable(true);
        viewerColumn.setLabelProvider(new ColumnLabelProvider() {

            @Override
            public void update(ViewerCell cell) {
            	if (
            		((HashMap<String, String>)cell.getElement()).containsKey("Url") &&
            		!((HashMap<String, String>)cell.getElement()).get("Url").equals("")
            	) {
                    String url = ((HashMap<String, String>)cell.getElement()).get("Url");
	                TableItem item = (TableItem) cell.getItem();
	                Button button;
	                if(dependencyButtons.containsKey(cell.getElement())) {
	                    button = dependencyButtons.get(cell.getElement());
	                    button.setVisible(false);
	                    button.dispose();
	                }
	                button = new Button((Composite) cell.getViewerRow().getControl(),SWT.NONE);
	                button.setImage(ImageDescriptor.createFromURL(this.getClass().getResource("/icons/web.png")).createImage());
	                button.addSelectionListener(new SelectionAdapter() {
	                    @Override
	                    public void widgetSelected(SelectionEvent event) {
                            TalendBrowserLaunchHelper.openURL(url);
						}
	                });
	                dependencyButtons.put(cell.getElement(), button);
	                TableEditor editor = new TableEditor(item.getParent());
	                editor.grabHorizontal  = true;
	                editor.grabVertical = true;
	                editor.setEditor(button , item, cell.getColumnIndex());
	                editor.layout();
            	}
            }
        });

        return compositeMain;
    }

    @Override
    public void setFocus() {
        mainPageBook.setFocus();

    }

    private JobCodereviewViewer getCurrentViewer() {
        return fAllViewers[fCurrentViewerIndex];
    }

    public void setCodereviewMode(int viewerIndex) {
        Assert.isNotNull(fAllViewers);
        if (viewerIndex < fAllViewers.length && fCurrentViewerIndex != viewerIndex) {
            fCurrentViewerIndex = viewerIndex;

            updateCodereviewViewer(true);
            if (inputProcess != null) {
                ISelection currSelection = getCurrentViewer().getSelection();
                if (currSelection == null || currSelection.isEmpty()) {
                    internalSelectType(inputProcess, false);
                    currSelection = getCurrentViewer().getSelection();
                }
            }
            updateTitle();

            // fDialogSettings.put(DIALOGSTORE_HIERARCHYVIEW, viewerIndex);
            getCurrentViewer().getTree().setFocus();
        }
        for (int i = 0; i < fViewActions.length; i++) {
            CodereviewToggleViewAction action = fViewActions[i];
            action.setChecked(fCurrentViewerIndex == action.getViewerIndex());
        }
    }

    private void internalSelectType(IProcess2 process, boolean reveal) {
        JobCodereviewViewer viewer = getCurrentViewer();
    }

    /*
     * When the input changed or the codereview pane becomes visible, <code>updateCodereviewViewer<code> brings up the
     * correct view and refreshes the current tree
     */
    private void updateCodereviewViewer(final boolean doExpand) {
        if (inputProcess == null) {
            headerLabel.setText(showEmptyLabel);
            mainPageBook.showPage(headerLabel);
        } else {
            if (getCurrentViewer().containsElements() != null) {
                Runnable runnable = new Runnable() {

                    public void run() {
                        getCurrentViewer().updateContent(doExpand); // refresh
                        updateMethodViewer(inputProcess);
                    }
                };
                BusyIndicator.showWhile(getDisplay(), runnable);
                if (!isChildVisible(headerPageBook, getCurrentViewer().getControl())) {
                    setViewerVisibility(true);
                }
            } else {
                fEmptyTypesViewer.setText(Messages.getString("JobCodereviewViewPart.reason")); //$NON-NLS-1$
                setViewerVisibility(false);
            }
        }
    }

    /*
     * Toggles between the empty viewer page and the codereview
     */
    private void setViewerVisibility(boolean showCodereview) {
        if (showCodereview) {
            headerPageBook.showPage(getCurrentViewer().getControl());
        } else {
            headerPageBook.showPage(fEmptyTypesViewer);
        }
    }

    public IProcess2 getInputProcess() {
        return inputProcess;
    }

    public void setInputProcess(IProcess2 process) {
        updateInput(process);
    }

    public int getCodereviewMode() {
        return fCurrentViewerIndex;
    }

    private Display getDisplay() {
        if (mainPageBook != null && !mainPageBook.isDisposed()) {
            return mainPageBook.getDisplay();
        }
        return null;
    }

    private boolean isChildVisible(Composite pb, Control child) {
        Control[] children = pb.getChildren();
        for (int i = 0; i < children.length; i++) {
            if (children[i] == child && children[i].isVisible())
                return true;
        }
        return false;
    }

    /*
     * Changes the input to a new type
     *
     * @param inputElement
     */
    private void updateInput(IProcess2 newProcess) {
        IProcess2 prevInput = inputProcess;
        if (newProcess == null) {
            clearInput();
        } else {
            inputProcess = newProcess;
            headerLabel.setText(Messages.getString("JobCodereviewMessages.JobCodereviewViewPart_createinput", getJobLabel()));
            try {
                fCodereviewLifeCycle.ensureRefreshedTypeCodereview(inputProcess, PlatformUI.getWorkbench().getActiveWorkbenchWindow());
            } catch (InvocationTargetException e) {
                org.talend.commons.ui.runtime.exception.ExceptionHandler.process(e);
                clearInput();
                return;
            } catch (InterruptedException e) {
                headerLabel.setText(showEmptyLabel);
                return;
            }

            // internalSelectType(null, false); // clear selection
            updateCodereviewViewer(true);
            internalSelectType(inputProcess, true);
            updateToolbarButtons();
            updateTitle();
            mainPageBook.showPage(mainSashForm);
        }
    }

    private void clearInput() {
        inputProcess = null;
        fCodereviewLifeCycle.freeCodereview();

        updateCodereviewViewer(false);
        updateToolbarButtons();
    }

    private void updateToolbarButtons() {
        // boolean isType = inputProcess instanceof IType;
        // for (int i = 0; i < fViewActions.length; i++) {
        // CodereviewToggleViewAction action = fViewActions[i];
        // if (action.getViewerIndex() == HIERARCHY_MODE_CLASSIC) {
        // action.setEnabled(fInputElement != null);
        // } else {
        // action.setEnabled(isType);
        // }
        // }
    }

    private void updateTitle() {
        String viewerTitle = getCurrentViewer().getTitle();

        String tooltip;
        String title;
        if (inputProcess != null) {
            String[] args = new String[] { viewerTitle, getJobLabel(), getProjectLabel() };
            title = Messages.getString("JobCodereviewMessages.JobCodereviewViewPart_title", args); //$NON-NLS-1$
            tooltip = Messages.getString("JobCodereviewMessages.JobCodereviewViewPart_tooltip", args); //$NON-NLS-1$
        } else {
            title = ""; //$NON-NLS-1$
            tooltip = viewerTitle;
        }
        setContentDescription(title);
        setTitleToolTip(tooltip);
    }

    private String getJobLabel() {
        return inputProcess.getLabel();
    }

    private String getProjectLabel() {
        org.talend.core.model.properties.Project project = ProjectManager.getInstance().getProject(inputProcess.getProperty().getItem());
        return project.getTechnicalLabel();
    }

    private void initDragAndDrop() {
        for (int i = 0; i < fAllViewers.length; i++) {
            addDropAdapters(fAllViewers[i]);
        }

        // DND on empty codereview
        DropTarget dropTarget = new DropTarget(mainPageBook, DND.DROP_MOVE | DND.DROP_COPY | DND.DROP_LINK | DND.DROP_DEFAULT);
        dropTarget.setTransfer(new Transfer[] { LocalSelectionTransfer.getTransfer() });
        dropTarget.addDropListener(new JobCodereviewTransferDropAdapter(this));
    }

    private void addDropAdapters(AbstractTreeViewer viewer) {
        Transfer[] transfers = new Transfer[] { LocalSelectionTransfer.getTransfer() };
        int ops = DND.DROP_MOVE | DND.DROP_COPY | DND.DROP_LINK | DND.DROP_DEFAULT;
        DelegatingDropAdapter delegatingDropAdapter = new DelegatingDropAdapter();
        delegatingDropAdapter.addDropTargetListener(new JobCodereviewTransferDropAdapter(this));
        viewer.addDropSupport(ops, transfers, delegatingDropAdapter);
    }

    protected void doSelectionChanged(SelectionChangedEvent e) {
        if (e.getSelectionProvider() == this.dependencyViewer) {

        } else {
            jobSelectionChanged(e.getSelection());
        }
    }

    private void jobSelectionChanged(ISelection sel) {
        if (sel instanceof IStructuredSelection) {
            Object object = ((IStructuredSelection) sel).getFirstElement();
            if (object == null) {
                return;
            }
            IProcess2 process = (IProcess2) object;
            updateMethodViewer(process);
        }
    }

    private void updateMethodViewer(final IProcess2 input) {
        if (!CoreUIPlugin.getDefault().getPreferenceStore().getBoolean(ITalendCorePrefConstants.WEBHOOK_ETLTOOL_ENABLED)) {
            bodyLabel.setText("No webhook defined !");
            dependencyViewer.getTable().setVisible(false);
            return;
        }
        dependencyViewer.getTable().setVisible(true);
        
        if (input == dependencyViewer.getInput()) {
            if (input != null) {
                Runnable runnable = new Runnable() {
                    public void run() {
                        dependencyViewer.refresh(); // refresh
                    }
                };
                BusyIndicator.showWhile(getDisplay(), runnable);
            }
        } else {
            if (input != null) {
                ILabelProvider provider = (ILabelProvider) getCurrentViewer().getLabelProvider();
                bodyLabel.setText(provider.getText(input));
                bodyLabel.setImage(provider.getImage(input));
                inputProcessSelected = input;
                fillCodereviewItems(input);
            } else {
                bodyLabel.setText(""); //$NON-NLS-1$
                bodyLabel.setImage(null);
            }
            /*
            Runnable runnable = new Runnable() {

                public void run() {
                    dependencyViewer.setInput(input); // refresh
                }
            };
            BusyIndicator.showWhile(getDisplay(), runnable);
            */
        }
    }

    public void setViewLayout(int layout) {
        if (fCurrentLayout != layout || layout == VIEW_LAYOUT_AUTOMATIC) {
            fInComputeLayout = true;
            try {
                boolean methodViewerNeedsUpdate = false;

                if (
                    this.bodyViewForm != null &&
                    !bodyViewForm.isDisposed() &&
                    mainSashForm != null &&
                    !mainSashForm.isDisposed()
                ) {
                    boolean horizontal = false;
                    if (layout == VIEW_LAYOUT_SINGLE) {
                        bodyViewForm.setVisible(false);
                        // showMembersInCodereview(false);
                        updateMethodViewer(null);
                    } else {
                        if (fCurrentLayout == VIEW_LAYOUT_SINGLE) {
                            bodyViewForm.setVisible(true);
                            methodViewerNeedsUpdate = true;
                        }
                        if (layout == VIEW_LAYOUT_AUTOMATIC) {
                            if (mainComposite != null && !mainComposite.isDisposed()) {
                                Point size = mainComposite.getSize();
                                if (size.x != 0 && size.y != 0) {
                                    // bug 185397 - Codereview View flips orientation multiple times on resize
                                    // Control viewFormToolbar = headerViewForm.getTopLeft();
                                    // if (viewFormToolbar != null && !viewFormToolbar.isDisposed() &&
                                    // viewFormToolbar.isVisible()) {
                                    // size.y -= viewFormToolbar.getSize().y;
                                    // }
                                    horizontal = size.x > size.y;
                                }
                            }
                            if (fCurrentLayout == VIEW_LAYOUT_AUTOMATIC) {
                                boolean wasHorizontal = mainSashForm.getOrientation() == SWT.HORIZONTAL;
                                if (wasHorizontal == horizontal) {
                                    return; // no real change
                                }
                            }

                        } else if (layout == VIEW_LAYOUT_HORIZONTAL) {
                            horizontal = true;
                        }
                        mainSashForm.setOrientation(horizontal ? SWT.HORIZONTAL : SWT.VERTICAL);
                    }
                    // updateMainToolbar(horizontal);
                    mainSashForm.layout();
                }
                if (methodViewerNeedsUpdate) {
                    jobSelectionChanged(getCurrentViewer().getSelection());
                }
                fDialogSettings.put(DIALOGSTORE_VIEWLAYOUT, layout);
                fCurrentLayout = layout;

                updateCheckedState();
            } finally {
                fInComputeLayout = false;
            }
        }
    }

    private void addResizeListener(Composite parent) {
        parent.addControlListener(new ControlListener() {

            public void controlMoved(ControlEvent e) {
            }

            public void controlResized(ControlEvent e) {
                if (getViewLayout() == VIEW_LAYOUT_AUTOMATIC && !fInComputeLayout) {
                    setViewLayout(VIEW_LAYOUT_AUTOMATIC);
                }
            }
        });
    }

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.jdt.ui.ITypeCodereviewViewPart#getViewLayout()
     */
    public int getViewLayout() {
        return fCurrentLayout;
    }

    private void updateCheckedState() {
        for (int i = 0; i < fToggleOrientationActions.length; i++) {
            fToggleOrientationActions[i].setChecked(getViewLayout() == fToggleOrientationActions[i].getOrientation());
        }
    }

    private void initializeTypesViewer(final JobCodereviewViewer typesViewer) {
        // typesViewer.getControl().setVisible(false);
        typesViewer.initContextMenu(new IMenuListener() {
            public void menuAboutToShow(IMenuManager menu) {
                fillJobViewerContextMenu(typesViewer, menu);
            }
        }, getSite());

        typesViewer.addPostSelectionChangedListener(fSelectionChangedListener);
    }

    private void fillJobViewerContextMenu(JobCodereviewViewer viewer, IMenuManager menu) {
        // viewer entries
        // ISelection selection = viewer.getSelection();

        // if (focusOnSelectionAction.canActionBeAdded())
        // menu.appendToGroup(GROUP_FOCUS, focusOnSelectionAction);
        // menu.appendToGroup(GROUP_FOCUS, fFocusOnTypeAction);

        menu.add(focusOnTypeAction);

        fActionGroups.setContext(new ActionContext(getSite().getSelectionProvider().getSelection()));
        fActionGroups.fillContextMenu(menu);
        fActionGroups.setContext(null);
    }

    /*
     * Creates the context menu for the method viewer
     */
    private void fillDependencyViewerContextMenu(IMenuManager menu) {
        // viewer entries
        fActionGroups.setContext(new ActionContext(getSite().getSelectionProvider().getSelection()));
        fActionGroups.fillContextMenu(menu);
        fActionGroups.setContext(null);
    }

    private void fillCodereviewItems(IProcess2 input) {
        if (dependencyButtons != null && !dependencyButtons.isEmpty()) {
            // Empty codereview table view
            for (Object object : dependencyButtons.keySet()) {
                Button button = dependencyButtons.get(object);
                button.setVisible(false);
                button.dispose();
            }
            dependencyButtons.clear();

            dependencyViewer.setContentProvider(ArrayContentProvider.getInstance());
            dependencyViewer.setInput(null);
            dependencyViewer.refresh();
        }

        // Get Codereview data
        String jobName = input.getProperty().getItem().getProperty().getDisplayName();
        org.talend.core.model.properties.Project project = ProjectManager.getInstance().getProject(input.getProperty().getItem());
        String jobXmlLocation = 
            ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString() +
            File.separator +
            project.getTechnicalLabel() +
            File.separator +
            "process" +
            File.separator +
            input.getProperty().getItem().getState().getPath().replaceFirst("Regex", "") +
            File.separator +
            jobName +
            "_" + input.getVersion() + ".item";
        String xmlText = "";
        try {
            File file = new File(jobXmlLocation);
            Scanner sc = new Scanner(file);
            sc.useDelimiter("\\Z");
            xmlText = sc.next();
        } catch (Exception e) {
            e.printStackTrace();
            if (LOGGER.isInfoEnabled()) {
                LOGGER.info("Get file error : " + jobXmlLocation);
            }
        }
        codereviewItems = Webhook.codeReviewAnalyseText("Talend", jobName, xmlText);

        // Fill codereview table view
        dependencyViewer.setContentProvider(ArrayContentProvider.getInstance());
        dependencyViewer.setInput(codereviewItems);
        dependencyViewer.refresh();
    }

    public void dispose() {
        fCodereviewLifeCycle.freeCodereview();

        if (fActionGroups != null)
            fActionGroups.dispose();

        super.dispose();
    }
}
