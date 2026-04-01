package org.talend.rcp.intro;

import java.util.Properties;

import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.intro.IIntroSite;
import org.eclipse.ui.intro.config.IIntroAction;
import org.talend.core.model.general.Project;

public class ImportDemoProjectAction implements IIntroAction {

    private static final String IMPORT_ITEM = "Import Demo items"; //$NON-NLS-1$

    private Shell shell;

    private Project[] projects;

    @Override
    public void run(IIntroSite site, Properties params) {
        if (params == null) {
            return;
        }
        Object type = params.get("type");
        if (type != null) {
            // reuse the ImportDemoProjectAction
            org.talend.repository.ui.actions.importproject.ImportDemoProjectItemsAction.getInstance().run();
        }

    }

}
