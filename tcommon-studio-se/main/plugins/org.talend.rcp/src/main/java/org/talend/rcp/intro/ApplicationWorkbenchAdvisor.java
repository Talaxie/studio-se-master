// ============================================================================
//
// Copyright (C) 2006-2021 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.rcp.intro;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.inject.Inject;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.MElementContainer;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspective;
import org.eclipse.e4.ui.model.application.ui.advanced.MPlaceholder;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MPartSashContainer;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.model.application.ui.basic.MWindowElement;
import org.eclipse.jface.dialogs.TrayDialog;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceManager;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IPerspectiveDescriptor;
import org.eclipse.ui.IPerspectiveRegistry;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferenceConstants;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.application.IWorkbenchConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;
import org.eclipse.ui.internal.WorkbenchPlugin;
import org.eclipse.ui.internal.ide.application.IDEWorkbenchAdvisor;
import org.eclipse.ui.views.IViewRegistry;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.exception.LoginException;
import org.talend.commons.exception.PersistenceException;
import org.talend.commons.ui.runtime.CommonUIPlugin;
import org.talend.commons.ui.swt.colorstyledtext.ColorManager;
import org.talend.commons.utils.system.EclipseCommandLine;
import org.talend.core.GlobalServiceRegister;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.core.repository.utils.LoginTaskRegistryReader;
import org.talend.core.service.ICloudSignOnService;
import org.talend.core.services.IGITProviderService;
import org.talend.core.ui.branding.IBrandingConfiguration;
import org.talend.core.ui.branding.IBrandingService;
import org.talend.core.ui.services.IGitUIProviderService;
import org.talend.designer.codegen.CodeGeneratorActivator;
import org.talend.designer.core.DesignerPlugin;
import org.talend.designer.core.utils.DesignerColorUtils;
import org.talend.designer.runprocess.RunProcessPlugin;
import org.talend.login.ILoginTask;
import org.talend.rcp.TalendSplashHandler;
import org.talend.registration.register.RegisterManagement;
import org.talend.repository.RepositoryWorkUnit;

/**
 * DOC ccarbone class global comment. Detailled comment <br/>
 *
 * $Id$
 *
 */
public class ApplicationWorkbenchAdvisor extends IDEWorkbenchAdvisor {

    private static Logger log = Logger.getLogger(ApplicationWorkbenchAdvisor.class);

    /*
     * @Override public void preStartup() { WorkbenchAdapterBuilder.registerAdapters(); super.preStartup(); }
     */

    private static final String PERSPECTIVE_ID = "org.talend.rcp.perspective"; //$NON-NLS-1$

    @Inject
    private MApplication mApp;

    private void injectVariables() {
        IWorkbench workbench = PlatformUI.getWorkbench();
        IEclipseContext activeContext = workbench.getService(IEclipseContext.class).getActiveLeaf();
        ContextInjectionFactory.inject(this, activeContext);
    }

    @Override
    public WorkbenchWindowAdvisor createWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
        return new ApplicationWorkbenchWindowAdvisor(configurer);
    }

    @Override
    public void initialize(IWorkbenchConfigurer configurer) {
        injectVariables();
        super.initialize(configurer);
        configurer.setSaveAndRestore(false);
        TrayDialog.setDialogHelpAvailable(false);

        PlatformUI.getPreferenceStore().setValue(IWorkbenchPreferenceConstants.CLOSE_EDITORS_ON_EXIT, true);
        PlatformUI.getPreferenceStore().setDefault(IWorkbenchPreferenceConstants.SHOW_TRADITIONAL_STYLE_TABS, false);
        PlatformUI.getPreferenceStore().setDefault(IWorkbenchPreferenceConstants.DOCK_PERSPECTIVE_BAR,
                IWorkbenchPreferenceConstants.TOP_RIGHT);

        try {
            removeInvalidElement(mApp);
        } catch (Exception e) {
            ExceptionHandler.process(e);
        }
    }

    private MApplication removeInvalidElement(MApplication appElement) {
        boolean isOEM = false;
        try {
            isOEM = !IBrandingService.get().isPoweredbyTalend();
        } catch (Exception e) {
            ExceptionHandler.process(e);
        }
        final String cleanProp = "talend.studio.lite.cleanInvalidView";
        String cleanPropValue = System.getProperty(cleanProp);
        if (isOEM && (StringUtils.isBlank(cleanPropValue) || !Boolean.valueOf(cleanPropValue))) {
            return appElement;
        }

        if (!Boolean.valueOf(System.getProperty(cleanProp, Boolean.TRUE.toString()))) {
            return appElement;
        }
        org.eclipse.ui.IWorkbench workbench = PlatformUI.getWorkbench();
        IPerspectiveRegistry perspectiveRegistry = workbench.getPerspectiveRegistry();
        IViewRegistry viewRegistry = workbench.getViewRegistry();
        List<MWindow> windows = appElement.getChildren();
        Set<Object> visited = new HashSet<>();
        for (MWindow window : windows) {
            List<MWindowElement> winElems = window.getChildren();
            for (MWindowElement winElem : new ArrayList<>(winElems)) {
                if (winElem instanceof MElementContainer) {
                    cleanInvalidView((MElementContainer) winElem, perspectiveRegistry, viewRegistry, visited);
                }
            }
            List<MUIElement> sharedElements = window.getSharedElements();
            for (MUIElement sharedElement : new ArrayList<>(sharedElements)) {
                if (sharedElement instanceof MPart) {
                    String elemId = sharedElement.getElementId();
                    if (StringUtils.isNotBlank(elemId) && viewRegistry.find(elemId) == null) {
                        sharedElements.remove(sharedElement);
                    }
                }
            }
        }
        return appElement;
    }

    private void cleanInvalidView(MElementContainer container, IPerspectiveRegistry perspectiveRegistry,
            IViewRegistry viewRegistry, Set<Object> visited) {
        if (container == null) {
            return;
        }
        if (visited.contains(container)) {
            return;
        }
        visited.add(container);
        List children = container.getChildren();
        if (children == null || children.isEmpty()) {
            return;
        }
        MUIElement selectedElement = container.getSelectedElement();
        String selectedId = null;
        if (selectedElement != null) {
            selectedId = selectedElement.getElementId();
        }
        boolean resetSelectedElem = false;
        for (Object child : new ArrayList<>(children)) {
            if (child instanceof MPerspective) {
                String elemId = ((MPerspective) child).getElementId();
                if (StringUtils.isNotBlank(elemId) && perspectiveRegistry.findPerspectiveWithId(elemId) == null) {
                    children.remove(child);
                    if (selectedId != null && selectedId.equals(elemId)) {
                        resetSelectedElem = true;
                    }
                    continue;
                }
            }
            if (child instanceof MElementContainer) {
                cleanInvalidView((MElementContainer) child, perspectiveRegistry, viewRegistry, visited);
                if (((MElementContainer) child).getChildren().isEmpty()) {
                    children.remove(child);
                }
            } else if (child instanceof MPlaceholder) {
                MUIElement ref = ((MPlaceholder) child).getRef();
                if (ref instanceof MPartSashContainer) {
                    continue;
                }
                String viewId = ((MPlaceholder) child).getElementId();
                if (StringUtils.isNotBlank(viewId) && viewRegistry.find(viewId) == null) {
                    if (selectedId != null && selectedId.equals(viewId)) {
                        resetSelectedElem = true;
                    }
                    children.remove(child);
                    continue;
                }
            }
        }
        if (resetSelectedElem) {
            MUIElement newSelectedElem = null;
            if (0 < children.size()) {
                for (Object child : children) {
                    if (child instanceof MUIElement) {
                        if (((MUIElement) child).isToBeRendered()) {
                            newSelectedElem = (MUIElement) child;
                            break;
                        }
                    }
                }
            }
            container.setSelectedElement(newSelectedElem);
        }
    }

    @Override
    public String getInitialWindowPerspectiveId() {
        IBrandingService brandingService = GlobalServiceRegister.getDefault().getService(
                IBrandingService.class);
        if (brandingService != null) {
            IBrandingConfiguration brandingConfiguration = brandingService.getBrandingConfiguration();
            if (brandingConfiguration != null) {
                String perspectiveId = brandingConfiguration.getInitialWindowPerspectiveId();
                if (perspectiveId != null) {
                    //
                    IPerspectiveDescriptor pd = PlatformUI.getWorkbench().getPerspectiveRegistry()
                            .findPerspectiveWithId(perspectiveId);
                    if (pd != null) {
                        return perspectiveId;
                    }
                }
            }
        }
        return PERSPECTIVE_ID;
    }

    @SuppressWarnings("restriction")
    @Override
    public void preStartup() {

        // Fix bug 329,control the startup sequence of the plugin.
        // Promise the following plugin register themselves before system loaded.
        RunProcessPlugin.getDefault();
        CodeGeneratorActivator.getDefault();

        // get all login task to execut at the end but is needed here for monitor count
        LoginTaskRegistryReader loginTaskRegistryReader = new LoginTaskRegistryReader();
        ILoginTask[] allLoginTasks = loginTaskRegistryReader.getAllTaskListInstance();
        IProgressMonitor monitor = TalendSplashHandler.instance != null ? TalendSplashHandler.instance.getBundleProgressMonitor()
                : new NullProgressMonitor();

        SubMonitor subMonitor = SubMonitor.convert(monitor, allLoginTasks.length + 1);

        // handle the login tasks created using the extension point org.talend.core.repository.login.task
        ProxyRepositoryFactory.getInstance().executeRepositoryWorkUnit(new RepositoryWorkUnit<Void>("Applying login tasks") {

            @Override
            protected void run() throws LoginException, PersistenceException {
                for (ILoginTask toBeRun : allLoginTasks) {
                    try {
                        toBeRun.execute(subMonitor.newChild(1, SubMonitor.SUPPRESS_NONE));
                    } catch (Exception e) {
                        log.error("Error while execution a login task.", e); //$NON-NLS-1$
                    }
                }
            }
        });

        super.preStartup();

    }

    @Override
    public void postStartup() {
        super.postStartup();
        if (!ArrayUtils.contains(Platform.getApplicationArgs(), EclipseCommandLine.TALEND_DISABLE_LOGINDIALOG_COMMAND)) {
            RegisterManagement.getInstance().validateRegistration();
        }
        PreferenceManager pm = PlatformUI.getWorkbench().getPreferenceManager();
        // not git project, do not show git settings preference page
        if (IGITProviderService.get() == null || !IGITProviderService.get().isProjectInGitMode()) {
            pm.remove("org.talend.core.prefs" + WorkbenchPlugin.PREFERENCE_PAGE_CATEGORY_SEPARATOR + "org.talend.repository.gitprovider.settings.GitPreferencePage");
        }
        pm.remove("org.eclipse.equinox.internal.p2.ui.sdk.ProvisioningPreferencePage"); //$NON-NLS-1$
        
        // Re-set 
        if (!CommonUIPlugin.isFullyHeadless()) {
            Display display = Display.getDefault();
            if (display == null) {
                display = Display.getCurrent();
            }
            if (display != null) {
                display.syncExec(new Runnable() {

                    @Override
                    public void run() {
                        IPreferenceStore store = DesignerPlugin.getDefault().getPreferenceStore();
                        // designer color
                        DesignerColorUtils.initPreferenceDefault(store);
                        // default colors for the ColorStyledText.
                        ColorManager.initDefaultColors(store);
                    }
                });
            }
        }
    }

    @Override
    public boolean preShutdown() {
        boolean preShutwond = super.preShutdown();
        boolean commitChanges = true;
        if (ICloudSignOnService.get() != null && ICloudSignOnService.get().isReloginDialogRunning()) {
            commitChanges = false;
        }
        if (commitChanges && IGitUIProviderService.get() != null && IGitUIProviderService.get().checkPendingChanges()) {
            preShutwond = false;
        }
        return preShutwond;
    }

}
