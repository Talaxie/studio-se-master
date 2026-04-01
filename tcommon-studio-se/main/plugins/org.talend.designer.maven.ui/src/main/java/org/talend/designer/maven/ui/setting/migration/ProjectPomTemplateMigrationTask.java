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
package org.talend.designer.maven.ui.setting.migration;

import java.io.ByteArrayOutputStream;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

import org.apache.maven.model.Model;
import org.eclipse.m2e.core.MavenPlugin;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.core.model.general.Project;
import org.talend.core.model.migration.AbstractProjectMigrationTask;
import org.talend.core.runtime.projectsetting.IProjectSettingPreferenceConstants;
import org.talend.designer.maven.model.TalendMavenConstants;
import org.talend.designer.maven.template.MavenTemplateManager;
import org.talend.designer.maven.tools.MergeModelTool;
import org.talend.designer.maven.ui.DesignerMavenUiPlugin;
import org.talend.repository.ProjectManager;

public class ProjectPomTemplateMigrationTask extends AbstractProjectMigrationTask {

    @Override
    public Date getOrder() {
        GregorianCalendar gc = new GregorianCalendar(2023, 1, 9, 12, 0, 0);
        return gc.getTime();
    }

    @Override
    public ExecutionResult execute(Project project) {
        try {
            Map<String, Object> parameters = new HashMap<String, Object>();
            parameters.put(MavenTemplateManager.KEY_PROJECT_NAME,
                    ProjectManager.getInstance().getCurrentProject().getTechnicalLabel());
            Model defaultModel = MavenTemplateManager.getDefaultProjectModel(parameters);
            Model customModel = MavenTemplateManager.getCustomProjectModel(parameters);
            Model model = new MergeModelTool().migrateCustomModel(defaultModel, customModel);
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            MavenPlugin.getMaven().writeModel(model, out);
            String content = out.toString(TalendMavenConstants.DEFAULT_ENCODING);
            if (content != null) {
                DesignerMavenUiPlugin.getDefault().getProjectPreferenceManager()
                        .setValue(IProjectSettingPreferenceConstants.TEMPLATE_PROJECT_POM, content);
            }
        } catch (Exception e) {
            ExceptionHandler.process(e);
            return ExecutionResult.FAILURE;
        }
        return ExecutionResult.SUCCESS_NO_ALERT;
    }

}
