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
package org.talend.designer.maven.ui.setting.project.initializer;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

import org.apache.maven.model.Model;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.m2e.core.MavenPlugin;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.core.runtime.projectsetting.IProjectSettingPreferenceConstants;
import org.talend.core.runtime.projectsetting.IProjectSettingTemplateConstants;
import org.talend.designer.maven.DesignerMavenPlugin;
import org.talend.designer.maven.model.TalendMavenConstants;
import org.talend.designer.maven.template.AbstractMavenTemplateManager;
import org.talend.designer.maven.template.MavenTemplateManager;
import org.talend.designer.maven.ui.DesignerMavenUiPlugin;
import org.talend.designer.maven.utils.PomUtil;

/**
 * DOC ggu class global comment. Detailled comment
 */
public class MavenScriptsProjectSettingInitializer extends AbstractProjectPreferenceInitializer {

    @Override
    protected IPreferenceStore getPreferenceStore() {
        return DesignerMavenUiPlugin.getDefault().getProjectPreferenceManager().getPreferenceStore();
    }

    @Override
    protected void initializeFields(IPreferenceStore preferenceStore) {
        super.initializeFields(preferenceStore);

        try {
            setDefault(preferenceStore, IProjectSettingPreferenceConstants.TEMPLATE_PROJECT_POM, DesignerMavenPlugin.PLUGIN_ID,
                    IProjectSettingTemplateConstants.PATH_GENERAL + '/'
                            + IProjectSettingTemplateConstants.PROJECT_CUSTOM_TEMPLATE_FILE_NAME);

        } catch (Exception e) {
            ExceptionHandler.process(e);
        }

    }

    @Override
    protected void setDefault(IPreferenceStore preferenceStore, String key, String bundle, String bundleTemplatePath) {
        try {
            // set default value.
            AbstractMavenTemplateManager templateManager = MavenTemplateManager.getTemplateManagerMap().get(bundle);
            if (templateManager != null) {
                InputStream stream = templateManager.readBundleStream(bundleTemplatePath);
                Model model = MavenPlugin.getMavenModelManager().readMavenModel(stream);
                ByteArrayOutputStream out = new ByteArrayOutputStream();
                PomUtil.sortModules(model);
                MavenPlugin.getMaven().writeModel(model, out);
                String content = out.toString(TalendMavenConstants.DEFAULT_ENCODING);
                if (content != null) {
                    preferenceStore.setDefault(key, content);
                }
            }
        } catch (Exception e) {
            ExceptionHandler.process(e);
        }
    }

}
