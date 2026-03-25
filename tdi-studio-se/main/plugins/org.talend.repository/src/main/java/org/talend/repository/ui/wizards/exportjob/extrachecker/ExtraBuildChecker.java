package org.talend.repository.ui.wizards.exportjob.extrachecker;

import org.talend.repository.model.RepositoryNode;
import org.talend.repository.ui.wizards.exportjob.JavaJobScriptsExportWSWizardPage.JobExportType;

/**
 * Do extra check for selected jobs.
 * Exposed as extension point <code>org.talend.repository.ui.wizards.exportjob.extrachecker</code>
 */
public interface ExtraBuildChecker {

	/**
	 * Check.
	 *
	 * @param exportType the export type
	 * @param checkNodes the check nodes
	 * @return the error message, or <code>null</code> if not exists.
	 */
	String check(JobExportType exportType, RepositoryNode[] checkNodes);

}