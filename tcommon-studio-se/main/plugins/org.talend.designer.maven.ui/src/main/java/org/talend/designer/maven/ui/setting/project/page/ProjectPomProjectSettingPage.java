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
package org.talend.designer.maven.ui.setting.project.page;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.maven.model.Model;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.m2e.core.MavenPlugin;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.core.runtime.projectsetting.AbstractPomTemplateProjectSettingPage;
import org.talend.core.runtime.projectsetting.IProjectSettingPreferenceConstants;
import org.talend.core.runtime.projectsetting.PomPreviewDialog;
import org.talend.designer.maven.model.MergedModel;
import org.talend.designer.maven.model.TalendMavenConstants;
import org.talend.designer.maven.template.MavenTemplateManager;
import org.talend.designer.maven.tools.AggregatorPomsHelper;
import org.talend.designer.maven.tools.MergeModelTool;
import org.talend.designer.maven.ui.DesignerMavenUiPlugin;
import org.talend.designer.maven.ui.i18n.Messages;
import org.talend.repository.ProjectManager;

/**
 * DOC ggu class global comment. Detailled comment
 */
public class ProjectPomProjectSettingPage extends AbstractPomTemplateProjectSettingPage {

    private String oldScriptContent;

    public ProjectPomProjectSettingPage() {
        super();
        this.oldScriptContent = getCustomText();
    }

    @Override
    protected IPreferenceStore doGetPreferenceStore() {
        return DesignerMavenUiPlugin.getDefault().getProjectPreferenceManager().getPreferenceStore();
    }

    @Override
    protected String getPreferenceKey() {
        return IProjectSettingPreferenceConstants.TEMPLATE_PROJECT_POM;
    }

    @Override
    protected String getDefaultText() {
        Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put(MavenTemplateManager.KEY_PROJECT_NAME,
                ProjectManager.getInstance().getCurrentProject().getTechnicalLabel());
        Model model = MavenTemplateManager.getDefaultProjectModel(parameters);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        try {
            MavenPlugin.getMaven().writeModel(model, out);
            return out.toString(TalendMavenConstants.DEFAULT_ENCODING);
        } catch (Exception e) {
            ExceptionHandler.process(e);
        }
        return "Error loading default project pom template!";
    }

    @Override
    protected String getMoreInfoUrl() {
        return "https://document-link.us.cloud.talend.com/ts_ug_customize_project_pom_settings?version=80&lang=en&env=prd"; //$NON-NLS-1$
    }

    @Override
    protected boolean checkModel(boolean preview) {
        if (customText == null || customText.isDisposed()) {
            return false;
        }
        Model model = null;
        try {
            Model defaultModel = MavenPlugin.getMavenModelManager()
                    .readMavenModel(new ByteArrayInputStream(defaultText.getText().getBytes()));
            Model customModel = MavenPlugin.getMavenModelManager()
                    .readMavenModel(new ByteArrayInputStream(customText.getText().getBytes()));
            MergedModel mergedModel = new MergeModelTool().mergeModel(defaultModel, customModel);
            model = mergedModel.getModel();

            StringBuilder msgBuilder = new StringBuilder();
            if (model != null) {
                String propertiesInfo = mergedModel.getIllegalPropertiesInfo();
                if (propertiesInfo != null) {
                    // validated with warning
                    msgBuilder.append(Messages.getString("ProjectPomProjectSettingPage.warningTip")); //$NON-NLS-1$
                    msgBuilder.append(propertiesInfo);
                    MessageDialog.openWarning(getShell(), Messages.getString("ProjectPomProjectSettingPage.validateTitle"), //$NON-NLS-1$
                            msgBuilder.toString());
                }
            } else {
                msgBuilder.append(Messages.getString("ProjectPomProjectSettingPage.errorTip")); //$NON-NLS-1$
                String pluginManagementInfo = mergedModel.getIllegalPluginManagementInfo();
                if (pluginManagementInfo != null) {
                    msgBuilder.append(pluginManagementInfo);
                }
                String pluginsInfo = mergedModel.getIllegalPluginsInfo();
                if (pluginsInfo != null) {
                    msgBuilder.append(pluginsInfo);
                }
                String profilesInfo = mergedModel.getIllegalProfilesInfo();
                if (profilesInfo != null) {
                    msgBuilder.append(profilesInfo);
                }
                MessageDialog.openError(getShell(), Messages.getString("ProjectPomProjectSettingPage.validateTitle"), //$NON-NLS-1$
                        msgBuilder.toString());
            }

            if (model == null) {
                return false;
            }
            if (preview) {
                ByteArrayOutputStream out = new ByteArrayOutputStream();
                MavenPlugin.getMaven().writeModel(model, out);
                String content = out.toString(TalendMavenConstants.DEFAULT_ENCODING);
                new PomPreviewDialog(getShell(), Messages.getString("ProjectPomProjectSettingPage.preview"), content).open(); //$NON-NLS-1$
            }
            return true;
        } catch (Exception e) {
            MessageDialog.openError(getShell(), Messages.getString("ProjectPomProjectSettingPage.validateTitle"), //$NON-NLS-1$
                    e.getCause() == null ? e.getMessage() : e.getCause().getMessage());
            ExceptionHandler.process(e);
            return false;
        }
    }

    @Override
    protected void performApply() {
        if (performOk()) {
            // reset from modification
            this.oldScriptContent = getCustomText();
        }
    }

    @Override
    public boolean performOk() {
        boolean ok = super.performOk();
        if (ok && getScriptTxt() != null && !getScriptTxt().isDisposed()) {
            try {
                if (MessageDialog.openQuestion(getShell(), "Question", //$NON-NLS-1$
                        Messages.getString("AbstractPersistentProjectSettingPage.syncAllPoms"))) { //$NON-NLS-1$
                    new AggregatorPomsHelper().syncAllPoms();
                } else {
                    String newContent = getCustomText();
                    if (!newContent.equals(oldScriptContent)) { // not same
                        MessageDialog.openWarning(this.getShell(),
                                Messages.getString("ProjectPomProjectSettingPage_ConfirmTitle"), //$NON-NLS-1$
                                Messages.getString("ProjectPomProjectSettingPage_ConfirmMessage")); //$NON-NLS-1$
                        new AggregatorPomsHelper().createRootPom(new NullProgressMonitor());
                    }
                }
            } catch (Exception e) {
                ExceptionHandler.process(e);
            }
        }
        return ok;
    }

}
