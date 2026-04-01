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
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.collections.BidiMap;
import org.apache.commons.lang.StringUtils;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CommandStack;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.fieldassist.IContentProposal;
import org.eclipse.jface.fieldassist.IContentProposalListener;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DropTarget;
import org.eclipse.swt.dnd.DropTargetEvent;
import org.eclipse.swt.dnd.DropTargetListener;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Resource;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.views.properties.PropertySheet;
import org.talend.commons.ui.gmf.util.DisplayUtils;
import org.talend.commons.ui.runtime.utils.ControlUtils;
import org.talend.commons.ui.swt.dialogs.ModelSelectionDialog;
import org.talend.commons.ui.swt.dialogs.ModelSelectionDialog.EEditSelection;
import org.talend.commons.ui.swt.dialogs.ModelSelectionDialog.ESelectionType;
import org.talend.commons.ui.swt.proposal.ContentProposalAdapterExtended;
import org.talend.commons.ui.utils.TypedTextCommandExecutor;
import org.talend.commons.utils.generation.CodeGenerationUtils;
import org.talend.core.CorePlugin;
import org.talend.core.GlobalServiceRegister;
import org.talend.core.context.RepositoryContext;
import org.talend.core.language.CodeProblemsChecker;
import org.talend.core.language.ECodeLanguage;
import org.talend.core.language.ICodeProblemsChecker;
import org.talend.core.model.metadata.IDynamicBaseProperty;
import org.talend.core.model.metadata.QueryUtil;
import org.talend.core.model.process.EComponentCategory;
import org.talend.core.model.process.EParameterFieldType;
import org.talend.core.model.process.Element;
import org.talend.core.model.process.IElement;
import org.talend.core.model.process.IElementParameter;
import org.talend.core.model.process.INode;
import org.talend.core.model.process.IProcess;
import org.talend.core.model.process.IProcess2;
import org.talend.core.model.process.Problem;
import org.talend.core.model.process.Problem.ProblemStatus;
import org.talend.core.model.properties.ConnectionItem;
import org.talend.core.model.properties.Information;
import org.talend.core.model.properties.InformationLevel;
import org.talend.core.model.properties.PropertiesFactory;
import org.talend.core.model.properties.Property;
import org.talend.core.sqlbuilder.util.ConnectionParameters;
import org.talend.core.sqlbuilder.util.TextUtil;
import org.talend.core.ui.process.IGraphicalNode;
import org.talend.core.ui.properties.tab.IDynamicProperty;
import org.talend.core.ui.proposal.TalendProposalUtils;
import org.talend.core.ui.services.ISQLBuilderService;
import org.talend.designer.core.DesignerPlugin;
import org.talend.designer.core.IMultiPageTalendEditor;
import org.talend.designer.core.i18n.Messages;
import org.talend.designer.core.model.FakeElement;
import org.talend.designer.core.model.components.EParameterName;
import org.talend.designer.core.model.components.ElementParameter;
import org.talend.designer.core.ui.AbstractMultiPageTalendEditor;
import org.talend.designer.core.ui.editor.cmd.PropertyChangeCommand;
import org.talend.designer.core.ui.editor.nodes.Node;
import org.talend.designer.core.ui.editor.properties.ContextParameterExtractor;
import org.talend.designer.core.ui.editor.properties.controllers.IControllerContext;
import org.talend.designer.core.ui.editor.properties.controllers.ISWTBusinessControllerUI;
import org.talend.designer.core.ui.editor.properties.controllers.executors.BusinessControllerExecutor;
import org.talend.designer.core.ui.preferences.TalendDesignerPrefConstants;
import org.talend.designer.core.ui.viewer.ReconcilerStyledText;
import org.talend.designer.core.ui.views.jobsettings.AbstractPreferenceComposite;
import org.talend.designer.core.ui.views.jobsettings.JobSettingsView;
import org.talend.designer.core.ui.views.problems.Problems;
import org.talend.designer.core.ui.views.properties.ComponentSettingsView;
import org.talend.designer.core.ui.views.properties.MultipleThreadDynamicComposite;
import org.talend.designer.core.ui.views.properties.WidgetFactory;
import org.talend.designer.core.ui.views.properties.composites.MissingSettingsMultiThreadDynamicComposite;
import org.talend.designer.runprocess.IRunProcessService;

/**
 * DOC cmeng class global comment. Detailled comment
 */
public abstract class AbsSWTControllerUI extends ControllerUI implements IBusinessControllerUI, ISWTBusinessControllerUI {

    protected static final int MAX_PERCENT = 100;

    protected static final int STANDARD_LABEL_WIDTH = 100;

    protected static final int STANDARD_HEIGHT = 20;

    protected static final int STANDARD_BUTTON_WIDTH = 25;

    protected static final String DOTS_BUTTON = "icons/dots_button.gif"; //$NON-NLS-1$ s

    private Map<String, Dialog> sqlbuilers = new HashMap<String, Dialog>();

    protected IDynamicProperty dynamicProperty;

    protected Composite composite;

    protected BidiMap hashCurControls;

    protected IMultiPageTalendEditor part;

    protected EditionControlHelper editionControlHelper;

    private int additionalHeightSize;

    private List<Problem> proForJavaErrorMark = null;

    private static Map<String, Problem> proForPerlErrorMark = new HashMap<String, Problem>();

    public AbsSWTControllerUI(IDynamicProperty dp, BusinessControllerExecutor controllerExecutor) {
        super(dp, controllerExecutor);
    }

    @Override
    protected void configure(IDynamicBaseProperty dynamicBaseProp) {
        super.configure(dynamicBaseProp);
        configureSWT((IDynamicProperty) dynamicBaseProp);
    }

    protected void configureSWT(IDynamicProperty dp) {
        this.dynamicProperty = dp;
        hashCurControls = dp.getHashCurControls();
        Object obj = dp.getPart();
        if (obj instanceof IMultiPageTalendEditor) {
            part = (IMultiPageTalendEditor) obj;
        } else {
            // throw new RuntimeException("Type IMultiPageTalendEditor is requried.");
        }
        composite = dp.getComposite();

        editionControlHelper = new EditionControlHelper();
    }

    @Override
    public void init(IDynamicProperty dp) {
        configure(dp);
    }

    @Override
    protected IControllerContext createControllerContext() {
        return new SWTBusinessControllerContext();
    }

    @Override
    public boolean openConfirm(String title, String msg) {
        return MessageDialog.openConfirm(composite.getShell(), title, msg);
    }

    @Override
    public void openWarning(String title, String msg) {
        MessageDialog.openWarning(DisplayUtils.getDefaultShell(false), title, msg);
    }

    @Override
    public void openError(String title, String msg) {
        MessageDialog.openError(composite.getShell(), title, msg);
    }

    @Override
    public void openSqlBuilder(ConnectionParameters connParameters) {
        Shell parentShell = DisplayUtils.getDefaultShell(false);
        ISQLBuilderService service = GlobalServiceRegister.getDefault().getService(ISQLBuilderService.class);
        Dialog sqlBuilder = service.openSQLBuilderDialog(parentShell, "", connParameters);
        sqlBuilder.open();
    }

    @Override
    public void openSqlBuilderBuildIn(ConnectionParameters connParameters, String propertyName) {
        ISQLBuilderService service = GlobalServiceRegister.getDefault().getService(ISQLBuilderService.class);
        service.openSQLBuilderDialog(connParameters, composite, elem, propertyName, getCommandStack(), this, part);
    }

    @Override
    public String openSqlBuilder(IElement elem, ConnectionParameters connParameters, String key, String repoName,
            String repositoryId, String processName, String query) {

        final Dialog builderDialog = sqlbuilers.get(key);
        if (!composite.isDisposed() && builderDialog != null && builderDialog.getShell() != null
                && !builderDialog.getShell().isDisposed()) {
            builderDialog.getShell().setActive();
        } else {
            connParameters.setRepositoryName(repoName);
            if (repositoryId != null) {
                connParameters.setRepositoryId(repositoryId);
            }
            Shell parentShell = DisplayUtils.getDefaultShell(false);
            String nodeLabel = null;
            if (elem instanceof Node) {
                nodeLabel = (String) ((Node) elem).getElementParameter(EParameterName.LABEL.getName()).getValue();
            }
            TextUtil.setDialogTitle(processName, nodeLabel, elem.getElementName());

            ISQLBuilderService service = GlobalServiceRegister.getDefault().getService(ISQLBuilderService.class);

            connParameters.setQuery(query);
            connParameters.setFirstOpenSqlBuilder(true); // first open Sql Builder,set true

            Dialog sqlBuilder = service.openSQLBuilderDialog(parentShell, processName, connParameters);

            sqlbuilers.put(key, sqlBuilder);
            if (Window.OK == sqlBuilder.open()) {
                if (!composite.isDisposed() && !connParameters.isNodeReadOnly()) {
                    String sql = connParameters.getQuery();
                    // modified by hyWang
                    if (!connParameters.getIfContextButtonCheckedFromBuiltIn()) {
                        sql = QueryUtil.checkAndAddQuotes(sql);
                    }
                    return sql;
                }
            }

        }
        return null;
    }

    @Override
    public ConnectionItem getConnectionItem() {
        ConnectionItem connItem = null;
        if (dynamicProperty instanceof MissingSettingsMultiThreadDynamicComposite) {
            connItem = ((MissingSettingsMultiThreadDynamicComposite) dynamicProperty).getConnectionItem();
        }
        return connItem;
    }

    /**
     * DOC yzhang Comment method "createControl".
     *
     * Create control within the tabbed property setcion.
     *
     * @param subComposite. The composite selected in the editor or view, transfered from super class of tabbed
     * properties framwork.
     * @param param. The paramenter from EMF.
     * @param numInRow. The ID of the control in a row.
     * @param nbInRow. The total quantity of the control in a row.
     * @param top
     * @param rowSize height that can take the control (0 if default size)
     * @param lastControl. The latest control created beside current being created. @return. The control created by this
     * method will be the paramenter of next be called createControl method for position calculate.
     */
    @Override
    public abstract Control createControl(final Composite subComposite, final IElementParameter param, final int numInRow,
            final int nbInRow, final int top, final Control lastControl);

    @Override
    public abstract int estimateRowSize(final Composite subComposite, final IElementParameter param);

    protected int getColorStyledTextRowSize(int nbLines) {

        return 0;
    }

    public BidiMap getHashCurControls() {
        return hashCurControls;
    }

    protected boolean isInWizard() {
        if (dynamicProperty != null) {
            Element element = dynamicProperty.getElement();
            if (element instanceof FakeElement) {
                return true;
            }
        }
        return false;
    }

    /**
     * Will return true of false depends if the control has dynamic size or not.
     *
     * @return
     */
    @Override
    public boolean hasDynamicRowSize() {
        return false;
    }

    /**
     * Used only to force the rowSize if the size is dynamic.
     *
     * @param height
     */
    @Override
    public void setAdditionalHeightSize(int height) {
        this.additionalHeightSize = height;
    }

    /**
     * Used only to force the rowSize if the size is dynamic.
     *
     * @return the height
     */
    public int getAdditionalHeightSize() {
        return additionalHeightSize;
    }

    /**
     * Getter for dynamicTabbedPropertySection.
     *
     * @return the dynamicTabbedPropertySection
     */
    public IDynamicProperty getDynamicProperty() {
        return this.dynamicProperty;
    }

    public IMultiPageTalendEditor getEditorPart() {
        return this.part;
    }

    static WidgetFactory widgetFactory = null;

    /**
     * DOC yzhang Comment method "getWidgetFactory".
     *
     * Get the TabbedPropertySheetWidgetFactory for control creating.
     *
     * @return
     */
    protected WidgetFactory getWidgetFactory() {
        if (widgetFactory == null) {
            widgetFactory = new WidgetFactory();
        }
        return widgetFactory;
    }

    private static Map<Control, ControlProperties> controlToProp = new HashMap<Control, ControlProperties>();

    /**
     *
     * DOC amaumont DynamicTabbedPropertySection class global comment. Detailled comment <br/>
     *
     * @author amaumont $Id: DynamicTabbedPropertySection.java 344 2006-11-08 14:29:42 +0000 (mer., 08 nov. 2006)
     * smallet $
     *
     */
    public class CheckErrorsHelper {

        /**
         * DOC amaumont CheckSyntaxHelper constructor comment.
         */
        public CheckErrorsHelper() {
            super();
        }

        private final FocusListener focusListenerForCheckingError = new FocusListener() {

            @Override
            public void focusGained(FocusEvent event) {
                focusGainedExecute((Control) event.widget);
            }

            @Override
            public void focusLost(FocusEvent event) {
                if (!extendedProposal.isProposalOpened()) {
                    Control control = (Control) event.widget;
                    setCodeProblems(null);
                    checkErrorsForPropertiesOnly(control);
                    IWorkbench workbench = PlatformUI.getWorkbench();
                    Property property = null;
                    if (workbench != null) {
                        IWorkbenchPage page = workbench.getActiveWorkbenchWindow().getActivePage();
                        if (page != null) {
                            IEditorPart editorPart = page.getActiveEditor();
                            if (editorPart instanceof AbstractMultiPageTalendEditor) {
                                AbstractMultiPageTalendEditor multiPageTalendEditor = ((AbstractMultiPageTalendEditor) editorPart);
                                property = multiPageTalendEditor.getProcess().getProperty();
                            }
                        }
                    }
                    if (property == null) {
                        return;
                    }
                    ECodeLanguage language = ((RepositoryContext) org.talend.core.CorePlugin.getContext()
                            .getProperty(org.talend.core.context.Context.REPOSITORY_CONTEXT_KEY)).getProject().getLanguage();
                    property.getInformations().clear();
                    if (language == ECodeLanguage.JAVA && proForJavaErrorMark != null) {
                        for (Problem problem : proForJavaErrorMark) {
                            if (ProblemStatus.ERROR.equals(problem.getStatus())) {
                                String problemResource = problem.getDescription();
                                Information information = PropertiesFactory.eINSTANCE.createInformation();
                                if (problemResource != null) {
                                    information.setText(problemResource);
                                }
                                information.setLevel(InformationLevel.ERROR_LITERAL);
                                property.getInformations().add(information);
                            }
                        }
                    } else if (language == ECodeLanguage.PERL && proForPerlErrorMark != null) {
                        for (String componentName : proForPerlErrorMark.keySet()) {
                            Problem problem = proForPerlErrorMark.get(componentName);
                            if (ProblemStatus.ERROR.equals(problem.getStatus())) {
                                String problemResource = problem.getDescription();
                                Information information = PropertiesFactory.eINSTANCE.createInformation();
                                if (problemResource != null) {
                                    information.setText(problemResource);
                                }
                                information.setLevel(InformationLevel.ERROR_LITERAL);
                                property.getInformations().add(information);
                            }
                        }

                    }
                    Problems.computePropertyMaxInformationLevel(property, false);
                    Problems.refreshRepositoryView();
                    Problems.refreshProblemTreeView();
                }
            }

        };

        private final KeyListener keyListenerForCheckingError = new KeyListener() {

            @Override
            public void keyPressed(KeyEvent event) {
                Control control = (Control) event.widget;
                resetErrorState(control);
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }

        };

        private ContentProposalAdapterExtended extendedProposal;

        public void register(Control control, ContentProposalAdapterExtended extendedProposal) {
            control.addFocusListener(focusListenerForCheckingError);
            control.addKeyListener(keyListenerForCheckingError);
            this.extendedProposal = extendedProposal;
        }

        /**
         * DOC amaumont Comment method "unregister".
         *
         * @param control
         */
        public void unregister(Control control) {
            control.removeFocusListener(focusListenerForCheckingError);
            control.removeKeyListener(keyListenerForCheckingError);
        }

        private void focusGainedExecute(Control control) {
            resetErrorState(control);
        }

        private void refreshNode() {
            boolean flag = CorePlugin.getDefault().getPreferenceStore()
                    .getBoolean(TalendDesignerPrefConstants.PROPERTY_CODE_CHECK);
            if (flag) {
                return;
            }
            if (elem instanceof IGraphicalNode) {
                IGraphicalNode errorNode = (IGraphicalNode) elem;
                if (errorNode == null) {
                    return;
                }
                if (errorNode.isCheckProperty()) {
                    errorNode.setCheckProperty(false);
                    errorNode.setErrorFlag(false);
                    errorNode.setCompareFlag(false);
                    errorNode.setErrorInfo(null);
                    ((Node) errorNode).getNodeError().updateState("UPDATE_STATUS", false);//$NON-NLS-1$
                    errorNode.setErrorInfoChange("ERRORINFO", false);//$NON-NLS-1$
                }
            }

        }

        /**
         * DOC amaumont Comment method "checkSyntax".
         *
         * @param control
         * @param modifying
         */
        public void checkErrors(final Control control) {
            refreshNode();
            String parameterName = getParameterName(control);
            if (StringUtils.isBlank(parameterName)) {
                return;
            }
            IElementParameter elementParameter = elem.getElementParameter(parameterName);

            if (elementParameter.isReadOnly() || elementParameter.isNoCheck()) {
                return;
            }

            final Color bgColorError = control.getDisplay().getSystemColor(SWT.COLOR_RED);
            final Color fgColorError = control.getDisplay().getSystemColor(SWT.COLOR_WHITE);

            final ECodeLanguage language = ((RepositoryContext) org.talend.core.CorePlugin.getContext()
                    .getProperty(org.talend.core.context.Context.REPOSITORY_CONTEXT_KEY)).getProject().getLanguage();

            IRunProcessService service = DesignerPlugin.getDefault().getRunProcessService();
            final ICodeProblemsChecker syntaxChecker = service.getSyntaxChecker(language);

            final String valueFinal = ControlUtils.getText(control);

            ControlProperties existingControlProperties = controlToProp.get(control);

            List<Problem> problems = getCodeProblems();
            proForJavaErrorMark = new ArrayList<Problem>();
            if (valueFinal != null) {
                String key = CodeGenerationUtils.buildProblemKey(elem.getElementName(), elementParameter.getName());
                if (language == ECodeLanguage.PERL) {
                    problems = syntaxChecker.checkProblemsForExpression(valueFinal);
                    getAllPerlProblem(key, problems);
                    showErrorMarkForPerl(elem);
                } else if (language == ECodeLanguage.JAVA) {
                    if (problems == null) {
                        problems = syntaxChecker.checkProblemsFromKey(key, null);
                    } else {
                        ((CodeProblemsChecker) syntaxChecker).updateNodeProblems(problems, key);
                    }
                    proForJavaErrorMark = syntaxChecker.checkProblemsForErrorMark(key, null);
                    showErrorMarkForJava(proForJavaErrorMark, elem);

                }
            }

            boolean isRequired = elem.getElementParameter(getParameterName(control)).isRequired();
            if (problems != null) {
                if (isRequired && (valueFinal == null || valueFinal.trim().length() == 0)) {
                    problems.add(new Problem(null, Messages.getString("AbstractElementPropertySectionController.fieldRequired"), //$NON-NLS-1$
                            ProblemStatus.ERROR));
                }
            }

            if (problems != null && problems.size() > 0) {
                if (existingControlProperties == null) {
                    ControlProperties properties = new ControlProperties();
                    controlToProp.put(control, properties);
                    // store original properties to restore them when error will be corrected
                    properties.originalBgColor = control.getBackground();
                    properties.originalFgColor = control.getForeground();
                    properties.originalToolTip = control.getToolTipText();
                }

                control.setBackground(bgColorError);
                control.setForeground(fgColorError);
                String tooltip = Messages.getString("AbstractElementPropertySectionController.syntaxError"); //$NON-NLS-1$

                for (Problem problem : problems) {
                    tooltip += "\n" + problem.getDescription(); //$NON-NLS-1$
                }
                control.setToolTipText(tooltip);
            } else {
                resetErrorState(control);
            }
        }

        private void getAllPerlProblem(String key, List<Problem> problems) {
            if (proForPerlErrorMark != null && proForPerlErrorMark.size() > 0) {
                int indexM = key.indexOf(":");//$NON-NLS-1$
                String keyAfter = "";//$NON-NLS-1$
                if (indexM > 0) {
                    keyAfter = key.substring(0, key.indexOf(":"));//$NON-NLS-1$
                } else {
                    keyAfter = key;
                }
                Set<Map.Entry<String, Problem>> set = proForPerlErrorMark.entrySet();
                for (Iterator<Map.Entry<String, Problem>> ite = set.iterator(); ite.hasNext();) {
                    Map.Entry<String, Problem> tmp = ite.next();
                    if (tmp == null) {
                        continue;
                    }

                    String proKey = tmp.getKey();
                    if (proKey == null) {
                        proKey = "";//$NON-NLS-1$
                    }
                    int indMark = proKey.indexOf(":");//$NON-NLS-1$
                    if (indMark > 0) {
                        proKey = proKey.substring(0, proKey.indexOf(":"));//$NON-NLS-1$
                    }
                    if (!proKey.equals(keyAfter)) {
                        ite.remove();
                    }
                }
            }
            if (problems != null && problems.size() > 0) {
                for (Problem problem : problems) {
                    if (problem != null) {
                        proForPerlErrorMark.put(key, problem);
                    } else {
                        proForPerlErrorMark.put(key, new Problem());
                    }
                    return;
                }

            } else {
                proForPerlErrorMark.put(key, new Problem());
            }
        }

        private void showErrorMarkForPerl(IElement elem) {
            if (elem instanceof IGraphicalNode) {
                IGraphicalNode errorNode = (IGraphicalNode) elem;
                if (errorNode == null) {
                    return;
                }
                StringBuffer errorMessage = new StringBuffer(256);
                if (proForPerlErrorMark != null && proForPerlErrorMark.size() > 0) {
                    Set<Map.Entry<String, Problem>> set = proForPerlErrorMark.entrySet();

                    for (Entry<String, Problem> tmp : set) {
                        if (tmp == null) {
                            continue;
                        }
                        Problem pro = tmp.getValue();
                        if (pro == null) {
                            continue;
                        }
                        String description = pro.getDescription();
                        if (!"".equals(description) && description != null) {//$NON-NLS-1$
                            errorMessage.append(description.replaceFirst("\r\n", ""));//$NON-NLS-1$
                            errorMessage.append("\n");//$NON-NLS-1$
                        }

                    }

                    if ((!"".equals(errorMessage.toString())) && errorMessage != null) {
                        if (errorNode.isCheckProperty() == false) {
                            errorNode.setCheckProperty(true);
                            errorNode.setErrorFlag(true);
                            errorNode.setCompareFlag(false);
                            errorNode.setErrorInfo(errorMessage.toString());
                            ((Node) errorNode).getNodeError().updateState("UPDATE_STATUS", true);//$NON-NLS-1$
                            errorNode.setErrorInfoChange("ERRORINFO", true);//$NON-NLS-1$
                        }
                    } else {
                        if (errorNode.isCheckProperty()) {
                            errorNode.setCheckProperty(false);
                            errorNode.setErrorFlag(false);
                            errorNode.setCompareFlag(false);
                            errorNode.setErrorInfo(null);
                            ((Node) errorNode).getNodeError().updateState("UPDATE_STATUS", false);//$NON-NLS-1$
                            errorNode.setErrorInfoChange("ERRORINFO", false);//$NON-NLS-1$
                        }
                    }

                } else {
                    if (errorNode.isCheckProperty()) {

                        errorNode.setCheckProperty(false);
                        errorNode.setErrorFlag(false);
                        errorNode.setCompareFlag(false);
                        errorNode.setErrorInfo(null);
                        ((Node) errorNode).getNodeError().updateState("UPDATE_STATUS", false);//$NON-NLS-1$
                        errorNode.setErrorInfoChange("ERRORINFO", false);//$NON-NLS-1$
                    }

                }
            }
        }

        private void showErrorMarkForJava(List<Problem> problems, IElement elem) {
            Node errorNode = null;
            if (elem instanceof Node) {
                errorNode = (Node) elem;
                if (errorNode == null) {
                    return;
                }
                if (problems != null && problems.size() > 0) {
                    StringBuffer errorMessage = new StringBuffer(256);
                    for (Problem pro : problems) {
                        if (pro == null || pro.getDescription() == null) {
                            continue;
                        }
                        if (pro.getKey() != null) {
                            int indMark = pro.getKey().indexOf(":");//$NON-NLS-1$
                            String proKey = "";//$NON-NLS-1$
                            if (indMark > 0) {
                                proKey = pro.getKey().substring(0, pro.getKey().indexOf(":"));//$NON-NLS-1$
                            } else {
                                proKey = pro.getKey();
                            }
                            if (errorNode.getUniqueName().equals(proKey)) {
                                errorMessage.append(pro.getDescription());
                                errorMessage.append("\n");//$NON-NLS-1$
                            }
                        }
                    }
                    if (errorNode.isCheckProperty() == false) {
                        if ((!"".equals(errorMessage)) && errorMessage != null) {//$NON-NLS-1$
                            errorNode.setCheckProperty(true);
                            errorNode.setErrorFlag(true);
                            errorNode.setCompareFlag(false);
                            errorNode.setErrorInfo(errorMessage.toString());
                            errorNode.getNodeError().updateState("UPDATE_STATUS", true);//$NON-NLS-1$
                            errorNode.setErrorInfoChange("ERRORINFO", true);//$NON-NLS-1$
                        }
                    }
                } else {
                    if (errorNode.isCheckProperty()) {

                        errorNode.setCheckProperty(false);
                        errorNode.setErrorFlag(false);
                        errorNode.setCompareFlag(false);
                        errorNode.setErrorInfo(null);
                        errorNode.getNodeError().updateState("UPDATE_STATUS", false);//$NON-NLS-1$
                        errorNode.setErrorInfoChange("ERRORINFO", false);//$NON-NLS-1$
                    }
                }

            }

        }

        /**
         * DOC amaumont Comment method "resetErrorState".
         *
         * @param control
         * @param previousProblem
         */
        private void resetErrorState(final Control control) {
            ControlProperties existingControlProperties = controlToProp.get(control);
            if (existingControlProperties != null) {
                control.setToolTipText(existingControlProperties.originalToolTip);
                control.setBackground(existingControlProperties.originalBgColor);
                control.setForeground(existingControlProperties.originalFgColor);
                controlToProp.remove(control);
            }
        }
    }

    /**
     *
     * Container of original properties of Control. <br/>
     *
     * $Id: DynamicTabbedPropertySection.java 865 2006-12-06 06:14:57 +0000 (é�„ç†¸æ¹¡æ¶“ï¿½, 06 é�—ä½·ç°©é�ˆï¿½ 2006)
     * bqian $
     *
     */
    class ControlProperties {

        private Color originalBgColor;

        private Color originalFgColor;

        private String originalToolTip;

        /**
         * DOC amaumont ControlProperties constructor comment.
         */
        public ControlProperties() {
            super();
        }
    }

    protected Command getTextCommandForHelper(String paramName, String text) {
        return new PropertyChangeCommand(elem, paramName, text);
    }

    /**
     *
     * DOC amaumont DynamicTabbedPropertySection class global comment. Detailled comment <br/>
     *
     * @author amaumont
     *
     * $Id: DynamicTabbedPropertySection.java 865 2006-12-06 06:14:57 +0000 (é�„ç†¸æ¹¡æ¶“ï¿½, 06 é�—ä½·ç°©é�ˆï¿½ 2006)
     * bqian $
     *
     */
    public class UndoRedoHelper {

        protected TypedTextCommandExecutor typedTextCommandExecutor;

        /**
         * DOC amaumont Comment method "unregister".
         *
         * @param control
         */
        public void unregister(Control control) {
            // ControlUtils.removeModifyListener(control, modifyListenerForUndoRedo);
            typedTextCommandExecutor.unregister(control);
        }

        public UndoRedoHelper() {
            this.typedTextCommandExecutor = new TypedTextCommandExecutor() {

                @Override
                public void addNewCommand(Control control) {
                    String name = getParameterName(control);
                    if (StringUtils.isBlank(name)) {
                        return;
                    }
                    String text = ControlUtils.getText(control);
                    Command cmd = getTextCommandForHelper(name, text);
                    // getCommandStack().execute(cmd);
                    executeCommand(cmd);
                }

                @Override
                public void updateCommand(Control control) {
                    CommandStack commandStack = getCommandStack();

                    String name = getParameterName(control);
                    if (StringUtils.isBlank(name)) {
                        return;
                    }
                    String text = ControlUtils.getText(control);

                    if (commandStack == null) {
                        executeCommand(new PropertyChangeCommand(elem, name, text));
                        return;
                    }

                    Object[] commands = commandStack.getCommands();

                    if (commands.length == 0 || commandStack.getRedoCommand() != null) {
                        addNewCommand(control);
                    } else {
                        Object lastCommandObject = commands[commands.length - 1];
                        if (lastCommandObject instanceof PropertyChangeCommand) {
                            PropertyChangeCommand lastCommand = (PropertyChangeCommand) lastCommandObject;
                            if (name.equals(lastCommand.getPropName()) && (lastCommand.getElement() == elem)) {
                                lastCommand.dispose();
                                // commandStack.execute(new PropertyChangeCommand(elem, name, text));
                                executeCommand(new PropertyChangeCommand(elem, name, text));
                                // lastCommand.modifyValue(text);
                            }
                        }
                    }
                }

            };

        }

        /**
         * DOC amaumont Comment method "register".
         *
         * @param control
         */
        public void register(Control control) {
            // ControlUtils.addModifyListener(control, modifyListenerForUndoRedo);
            typedTextCommandExecutor.register(control);
        }
    }

    /**
     * DOC amaumont Comment method "getParameterName".
     *
     * @param control
     * @return
     */
    public String getParameterName(Control control) {

        String name = (String) control.getData(PARAMETER_NAME);
        if (name == null) { // if the control don't support this property, then take in the list.
            name = (String) hashCurControls.getKey(control);
        }
        if (name == null) {
            throw new IllegalStateException(
                    "parameterName shouldn't be null or you call this method too early ! (control value : '" //$NON-NLS-1$
                            + ControlUtils.getText(control) + "')"); //$NON-NLS-1$
        }
        return name;
    }

    /**
     * Get the command stack of the Gef editor.
     *
     * @return
     */
    protected CommandStack getCommandStack() {
        if (dynamicProperty != null && dynamicProperty instanceof MultipleThreadDynamicComposite) {
            CommandStack commandStack = ((MultipleThreadDynamicComposite) dynamicProperty).getCommandStack();
            if (commandStack != null) {
                return commandStack;
            }
        }
        if (part == null) {
            return null;
        }
        Object adapter = part.getAdapter(CommandStack.class);
        return (CommandStack) adapter;
    }

    @Override
    public void executeCommand(Command c) {
        if (c == null) {
            return;
        }

        if (getCommandStack() != null) {
            getCommandStack().execute(c);
        } else {
            // if can't find command stack, just execute it.
            c.execute();
        }
    }

    private void refreshDynamicProperty() {
        if (this.dynamicProperty == null) {
            return;
        }
        dynamicProperty.refresh();
    }

    /**
     * Accept Text and StyledText control.
     *
     * @param labelText
     */
    public void addDragAndDropTarget(final Control textControl) {
        DropTargetListener dropTargetListener = new DropTargetListener() {

            String propertyName = null;

            @Override
            public void dragEnter(final DropTargetEvent event) {
            }

            @Override
            public void dragLeave(final DropTargetEvent event) {
            }

            @Override
            public void dragOperationChanged(final DropTargetEvent event) {
            }

            @Override
            public void dragOver(final DropTargetEvent event) {
                if (TextTransfer.getInstance().isSupportedType(event.currentDataType)) {
                    propertyName = getParameterName(textControl);
                    if (StringUtils.isBlank(propertyName)) {
                        return;
                    }
                    for (IElementParameter param : elem.getElementParameters()) {
                        if (param.getName().equals(propertyName)) {
                            if (param.isReadOnly()) {
                                event.detail = DND.ERROR_INVALID_DATA;
                            }
                        }
                    }
                }
            }

            @Override
            public void drop(final DropTargetEvent event) {
                if (propertyName != null) {
                    String text;
                    if (textControl instanceof StyledText) {
                        text = ((StyledText) textControl).getText() + (String) event.data;
                        ((StyledText) textControl).setText(text);

                    } else {
                        text = ((Text) textControl).getText() + (String) event.data;
                        ((Text) textControl).setText(text);
                    }
                    Command cmd = new PropertyChangeCommand(elem, propertyName, text);
                    // getCommandStack().execute(cmd);
                    executeCommand(cmd);
                }
            }

            @Override
            public void dropAccept(final DropTargetEvent event) {
            }
        };

        DropTarget target = new DropTarget(textControl, DND.DROP_MOVE | DND.DROP_COPY | DND.DROP_DEFAULT);
        Transfer[] transfers = new Transfer[] { TextTransfer.getInstance() };
        target.setTransfer(transfers);
        target.addDropListener(dropTargetListener);

    }

    /**
     * Sets the elem.
     *
     * @param elem the elem to set
     */
    protected void setElem(Element elem) {
        this.elem = elem;
    }

    /**
     * Sets the hashCurControls.
     *
     * @param hashCurControls the hashCurControls to set
     */
    protected void setHashCurControls(BidiMap hashCurControls) {
        this.hashCurControls = hashCurControls;
    }

    /**
     * Sets the part.
     *
     * @param part the part to set
     */
    protected void setPart(AbstractMultiPageTalendEditor part) {
        this.part = part;
    }

    /**
     * Sets the section.
     *
     * @param section the section to set
     */
    protected void setSection(EComponentCategory section) {
        this.section = section;
    }

    /**
     * DOC amaumont Comment method "checkErrors".
     *
     * @param control must be or extends <code>Text</code> or <code>StyledText</code>
     */
    protected void checkErrorsForPropertiesOnly(Control control) {
        if (this.section == EComponentCategory.BASIC) {
            editionControlHelper.checkErrors(control);
        }
    }

    @Override
    public abstract void refresh(IElementParameter param, boolean check);

    /**
     * qzhang Comment method "fixedCursorPosition".
     *
     * @param param
     * @param labelText
     * @param value
     * @param valueChanged
     */
    protected void fixedCursorPosition(IElementParameter param, Control labelText, Object value, boolean valueChanged) {
        IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
        IWorkbenchPart workbenchPart = page.getActivePart();
        // tacokit
        boolean update = false;
        if (param != null && param instanceof ElementParameter && param.getFieldType().equals(EParameterFieldType.TEXT)) {
            Object sourceName = ((ElementParameter) param).getTaggedValue("org.talend.sdk.component.source"); //$NON-NLS-1$
            if ("tacokit".equalsIgnoreCase(String.valueOf(sourceName))) { //$NON-NLS-1$
                update = true;
            }
        }

        if ((workbenchPart instanceof PropertySheet) || (workbenchPart instanceof JobSettingsView)
                || (workbenchPart instanceof ComponentSettingsView) || update) {
            Object control = editionControlHelper.undoRedoHelper.typedTextCommandExecutor.getActiveControl();
            if (param.getName().equals(control) && valueChanged && !param.isRepositoryValueUsed()) {
                String previousText = editionControlHelper.undoRedoHelper.typedTextCommandExecutor.getPreviousText2();
                String currentText = String.valueOf(value);
                labelText.setFocus();
                ControlUtils.setCursorPosition(labelText, getcursorPosition(previousText, currentText));
            }
        }
    }

    /**
     * qzhang Comment method "getcursorPosition".
     *
     * @param previousText
     * @param currentText
     * @return
     */
    private int getcursorPosition(String previousText, String currentText) {
        if (previousText.length() == currentText.length() + 1) {
            return getLeftCharPosition(currentText, previousText, false);
        } else if (previousText.length() == currentText.length() - 1) {
            return getLeftCharPosition(previousText, currentText, true);
        }
        return 0;
    }

    /**
     * qzhang Comment method "getLeftCharPosition".
     *
     * @param previousText
     * @param currentText
     * @return
     */
    private int getLeftCharPosition(String previousText, String currentText, boolean add) {
        int i = 0;
        for (; i < currentText.length() - 1; i++) {
            if (currentText.charAt(i) != previousText.charAt(i)) {
                break;
            }
        }
        if (add) {
            return i + 1;
        } else {
            return i;
        }
    }

    @Override
    public void dispose() {
        if (widgetFactory != null) {
            widgetFactory.dispose();
        }
        widgetFactory = null;
        sqlbuilers.clear();
        sqlbuilers = null;
        dynamicProperty = null;
        composite = null;
        hashCurControls = null;
        elem = null;
        part = null;
        section = null;
        editionControlHelper = null;
        curParameter = null;
    }

    public void addRepositoryPropertyListener(Control control) {
        boolean flag = false;

        if (this.curParameter != null) {
            final EComponentCategory category = this.curParameter.getCategory();
            final IElement element = this.curParameter.getElement();
            if (element instanceof FakeElement
                    || AbstractPreferenceComposite.inUseProjectSettingMode(element, category,
                            EParameterName.STATANDLOG_USE_PROJECT_SETTINGS)
                    || AbstractPreferenceComposite.inUseProjectSettingMode(element, category,
                            EParameterName.IMPLICITCONTEXT_USE_PROJECT_SETTINGS)) {
                flag = true; // don't add the listener.
            }
        }
        if (!flag) {
            control.addMouseListener(listenerSelection);
        }
    }

    MouseListener listenerSelection = new MouseAdapter() {

        @Override
        public void mouseDown(MouseEvent e) {

            ModelSelectionDialog modelSelect = new ModelSelectionDialog(((Control) e.getSource()).getShell(),
                    ESelectionType.NORMAL);

            if (modelSelect.open() == ModelSelectionDialog.OK) {
                if (modelSelect.getOptionValue() == EEditSelection.BUILDIN) {
                    Object paramObj = ((Control) e.getSource()).getData(PARAMETER_NAME);
                    String param = null;
                    if (paramObj instanceof String) {
                        param = paramObj.toString().trim();
                    }
                    // getCommandStack().execute(changeToBuildInCommand((Control) e.getSource()));
                    executeCommand(getControllerExecutor().changeToBuildInCommand(param));
                }
                if (modelSelect.getOptionValue() == EEditSelection.REPOSITORY) {
                    Object paramObj = ((Control) e.getSource()).getData(PARAMETER_NAME);
                    String param = null;
                    if (paramObj instanceof String) {
                        param = paramObj.toString().trim();
                    }
                    // getCommandStack().execute(refreshConnectionCommand((Control) e.getSource()));
                    executeCommand(getControllerExecutor().refreshConnectionCommand(param));
                }
            }
        }
    };

    protected IProcess getProcess(final IElement elem, final IMultiPageTalendEditor part) {
        IProcess process = null;
        if (part == null) {
            // achen modify to fix 0005991 part is null
            if (elem instanceof INode) {
                process = ((INode) elem).getProcess();
            }
        } else {
            process = part.getProcess();
        }
        return process;
    }

    /**
     *
     * cli Comment method "addResourceDisposeListener".
     *
     * When dispose the control, dispose resource at the same time. (bug 6916)
     */
    protected void addResourceDisposeListener(final Control parent, final Resource res) {
        if (parent != null) {
            parent.addDisposeListener(new DisposeListener() {

                @Override
                public void widgetDisposed(DisposeEvent e) {
                    if (res != null && !res.isDisposed()) {
                        res.dispose();
                    }
                    parent.removeDisposeListener(this);
                }
            });
        }

    }

    public Composite getComposite() {
        return composite;
    }

    public List<Problem> getCodeProblems() {
        return this.codeProblems;
    }

    @Override
    public void updateCodeProblems(List<Problem> codeProblems) {
        if (codeProblems != null) {
            this.codeProblems = new ArrayList<Problem>(codeProblems);
        }
    }

    public void setCodeProblems(List<Problem> codeProblems) {
        this.codeProblems = codeProblems;
    }

    public IElement getElement() {
        return this.elem;
    }

    public IElementParameter getCurParameter() {
        return curParameter;
    }

    public class EditionControlHelper {

        private final CheckErrorsHelper checkErrorsHelper;

        protected UndoRedoHelper undoRedoHelper;

        private ContentProposalAdapterExtended extendedProposal;

        /**
         * DOC amaumont EditionListenerManager constructor comment.
         */
        public EditionControlHelper() {
            this(new CheckErrorsHelper(), new UndoRedoHelper());
        }

        public EditionControlHelper(CheckErrorsHelper checkErrorsHelper, UndoRedoHelper undoRedoHelper) {
            this.checkErrorsHelper = checkErrorsHelper;
            this.undoRedoHelper = undoRedoHelper;
        }

        /**
         * DOC amaumont Comment method "checkErrors".
         *
         * @param t
         * @param b
         */
        public void checkErrors(Control control) {
            this.checkErrorsHelper.checkErrors(control);
        }

        /**
         * DOC amaumont Comment method "register".
         *
         * @param parameterName
         * @param control
         * @param checkSyntax
         */
        public void register(final String parameterName, final Control control) {
            if (parameterName == null || control == null) {
                throw new NullPointerException();
            }
            IElementParameter param = elem.getElementParameter(parameterName);
            if (param != null && !param.isNoContextAssist() && !param.isReadOnly()
                    && !(control instanceof ReconcilerStyledText)) {

                final IProcess2 process = (IProcess2) getProcess(elem, part);

                if (elem instanceof INode) {
                    this.extendedProposal = TalendProposalUtils.installOn(control, process, (INode) elem);
                } else {
                    this.extendedProposal = TalendProposalUtils.installOn(control, process);
                }

                if (!elem.getElementParameter(parameterName).isNoCheck()) {
                    this.checkErrorsHelper.register(control, extendedProposal);
                }
                extendedProposal.addContentProposalListener(new IContentProposalListener() {

                    @Override
                    public void proposalAccepted(IContentProposal proposal) {
                        if (control instanceof Text) {
                            ContextParameterExtractor.saveContext(parameterName, elem, ((Text) control).getText(), process);
                        } else if (control instanceof StyledText) {
                            ContextParameterExtractor.saveContext(parameterName, elem, ((StyledText) control).getText(), process);
                        }
                    }
                });
                // this.checkErrorsHelper.checkErrors(control, false);
                ContextParameterExtractor.installOn(control, process, parameterName, elem);
            }

            this.undoRedoHelper.register(control);
        }

        public void unregisterUndo(Control control) {
            this.undoRedoHelper.unregister(control);
        }

        /**
         * DOC amaumont Comment method "register".
         *
         * @param control
         */
        public void unregister(Control control) {
            this.checkErrorsHelper.unregister(control);
            this.undoRedoHelper.unregister(control);
        }

    }

    protected class SWTBusinessControllerContext extends BusinessControllerContext {

        @Override
        public boolean isInWizard() {
            return AbsSWTControllerUI.this.isInWizard();
        }

        @Override
        public IProcess2 getProcess() {
            return (IProcess2) AbsSWTControllerUI.this.getProcess(AbsSWTControllerUI.this.elem, AbsSWTControllerUI.this.part);
        }

        @Override
        public Map<String, String> getTableIdAndDbTypeMap() {
            return AbsSWTControllerUI.this.dynamicProperty.getTableIdAndDbTypeMap();
        }

        @Override
        public Map<String, String> getTableIdAndDbSchemaMap() {
            return AbsSWTControllerUI.this.dynamicProperty.getTableIdAndDbSchemaMap();
        }
    }

}
