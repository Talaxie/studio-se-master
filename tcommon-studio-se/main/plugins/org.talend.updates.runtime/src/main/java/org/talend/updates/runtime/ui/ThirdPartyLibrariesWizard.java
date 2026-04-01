package org.talend.updates.runtime.ui;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.utils.time.PropertiesCollectorUtil;
import org.talend.updates.runtime.Constants;
import org.talend.updates.runtime.InstallFeatureObserver;
import org.talend.updates.runtime.engine.InstallNewFeatureJob;
import org.talend.updates.runtime.engine.factory.PluginOptionalMissingJarsExtraUpdatesFactory;
import org.talend.updates.runtime.engine.factory.PluginRequiredMissingJarsExtraUpdatesFactory;
import org.talend.updates.runtime.i18n.Messages;
import org.talend.updates.runtime.model.ExtraFeature;
import org.talend.updates.runtime.model.FeatureCategory;

import us.monoid.json.JSONArray;
import us.monoid.json.JSONException;
import us.monoid.json.JSONObject;

public class ThirdPartyLibrariesWizard extends Wizard {

    private static Logger log = Logger.getLogger(UpdateStudioWizard.class);

    /**
     * preference node for the org.talend.updates plugin.
     */
    public static final String ORG_TALEND_UPDATES_PREF_NODE = Constants.PLUGIN_ID;

    ThirdPartyLibrariesModel thirdPartyLibrariesModel;// model that hold all the parameters set in the wizard

    private ChooseThirdPartyLibraryToInstallWizardPage chooseThirdPartyLibraryToInstallWizardPage;

    public ThirdPartyLibrariesWizard(Set<ExtraFeature> extraFeatures) {
        this.thirdPartyLibrariesModel = new ThirdPartyLibrariesModel(extraFeatures);
        setWindowTitle(Messages.getString("download.external.dialog.name")); //$NON-NLS-1$
    }

    @Override
    public void addPages() {
        chooseThirdPartyLibraryToInstallWizardPage = new ChooseThirdPartyLibraryToInstallWizardPage(thirdPartyLibrariesModel);
        addPage(chooseThirdPartyLibraryToInstallWizardPage);
    }

    @SuppressWarnings("unchecked")
    @Override
    public boolean performFinish() {
        InstallNewFeatureJob installNewFeatureJob = new InstallNewFeatureJob(
                new HashSet<ExtraFeature>(thirdPartyLibrariesModel.selectedExtraFeatures),
                thirdPartyLibrariesModel.getFeatureRepositories());
        Set<ExtraFeature> selectedExtraFeatures = thirdPartyLibrariesModel.getSelectedExtraFeatures();
        for (ExtraFeature feature : selectedExtraFeatures) {
            InstallFeatureObserver.getInstance().updateInstallFeatureStatus(feature.getName(),
                    InstallFeatureObserver.FEATURE_STATUS_TO_INSTALL);
        }
        installNewFeatureJob.schedule();
        return true;
    }

    @Override
    public boolean performCancel() {
        return super.performCancel();
    }

    public void show(final Shell shell) {
        WizardDialog wizardDialog = new ThirdPartyLibrariesDialog(this, shell);
        wizardDialog.setHelpAvailable(false);
        wizardDialog.open();
    }

    /**
     * called right after the dialog is display to launch any initial runnable if no extra feature is set in the model
     * then launch a thread to get them
     *
     * @param updateStudioWizardDialog
     */
    public void launchInitialRunnable(final ThirdPartyLibrariesDialog thirdPartyLibrariesDialog) {
        if (thirdPartyLibrariesModel.availableExtraFeatures.isEmpty()) {
            Display.getDefault().asyncExec(new Runnable() {

                @Override
                public void run() {
                    try {
                        thirdPartyLibrariesDialog.run(true, true, new IRunnableWithProgress() {

                            @SuppressWarnings("unchecked")
                            @Override
                            public void run(IProgressMonitor iprogressmonitor)
                                    throws InvocationTargetException, InterruptedException {
                                PluginRequiredMissingJarsExtraUpdatesFactory pluginRequiredFactory = new PluginRequiredMissingJarsExtraUpdatesFactory();
                                pluginRequiredFactory.setCheckUpdateOnLine(false);
                                PluginOptionalMissingJarsExtraUpdatesFactory pluginOptionalFactory = new PluginOptionalMissingJarsExtraUpdatesFactory();
                                pluginOptionalFactory.setCheckUpdateOnLine(false);
                                try {
                                    pluginRequiredFactory.retrieveUninstalledExtraFeatures(iprogressmonitor,
                                            thirdPartyLibrariesModel.availableExtraFeatures);
                                    pluginOptionalFactory.retrieveUninstalledExtraFeatures(iprogressmonitor,
                                            thirdPartyLibrariesModel.availableExtraFeatures);
                                } catch (Exception e) {
                                    ExceptionHandler.process(e);
                                }

                            }
                        });
                        // at the end of the runnable, the wizard restore the button states of the start of the wizard,
                        // but the state should be updated cause some
                        // items may already be selected, this forces an upadate of the wizard page state.
                        chooseThirdPartyLibraryToInstallWizardPage.dbc.updateTargets();
                    } catch (InvocationTargetException e) {
                        // an error occured when fetching the modules, so report it to the user.
                        ExceptionHandler.process(e);
                    } catch (InterruptedException e) {
                        // the thread was interupted
                        ExceptionHandler.process(e);
                    }
                }
            });
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.jface.wizard.Wizard#needsProgressMonitor()
     */
    @Override
    public boolean needsProgressMonitor() {
        return true;
    }
}
