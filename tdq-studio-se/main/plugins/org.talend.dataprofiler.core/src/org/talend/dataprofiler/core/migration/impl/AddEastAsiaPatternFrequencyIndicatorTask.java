package org.talend.dataprofiler.core.migration.impl;

import java.util.Date;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.Path;
import org.talend.dataprofiler.core.CorePlugin;
import org.talend.dataprofiler.core.manager.DQStructureManager;
import org.talend.dataprofiler.core.migration.AbstractWorksapceUpdateTask;
import org.talend.resource.ResourceManager;

public class AddEastAsiaPatternFrequencyIndicatorTask extends AbstractWorksapceUpdateTask {

    private final String DESFOLDERNAME = "Pattern Finder"; //$NON-NLS-1$

    private final String SRCFOLDERPATH = "/indicators/Pattern Frequency Statistics/"; //$NON-NLS-1$

    public AddEastAsiaPatternFrequencyIndicatorTask() {
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.dataprofiler.migration.IMigrationTask#getOrder()
     */
    public Date getOrder() {
        return createDate(2015, 9, 24);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.dataprofiler.migration.IMigrationTask#getMigrationTaskType()
     */
    public MigrationTaskType getMigrationTaskType() {
        return MigrationTaskType.FILE;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.dataprofiler.migration.AMigrationTask#doExecute()
     */
    @Override
    protected boolean doExecute() throws Exception {
        DQStructureManager manager = DQStructureManager.getInstance();
        // if the project version is lower than 6.1 and import from logon window, the target folder is "Pattern Finder".
        // or else, the target folder is renamed to "Pattern Frequency Statistics" by TDQ-11101.
        IFolder desFolder = ResourceManager.getSystemIndicatorFolder().getFolder(DESFOLDERNAME);
        if (!desFolder.exists()) {
            desFolder = ResourceManager.getSystemIndicatorFolder().getFolder("Pattern Frequency Statistics"); //$NON-NLS-1$
        }
        manager.copyFilesToFolder(CorePlugin.getDefault(), new Path(SRCFOLDERPATH).toString(), false, desFolder, null);
        return true;
    }

}
