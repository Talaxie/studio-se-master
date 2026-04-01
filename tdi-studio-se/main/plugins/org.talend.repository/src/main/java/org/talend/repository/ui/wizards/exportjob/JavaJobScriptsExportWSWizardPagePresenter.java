package org.talend.repository.ui.wizards.exportjob;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.Platform;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.repository.model.RepositoryNode;
import org.talend.repository.ui.wizards.exportjob.JavaJobScriptsExportWSWizardPage.JobExportType;
import org.talend.repository.ui.wizards.exportjob.extrachecker.ExtraBuildChecker;

/**
 * Hold models decompiled from UI. Provide accesses to handle UI.
 * Currently only hold {@link ExtraBuildChecker} instances and provide {@link #extraCheck(JobExportType, RepositoryNode[])} method.
 * 
 * TODO Refactory JobScriptsExportWizardPage move control code to this class.
 * 
 * @author GaoZone
 */
public class JavaJobScriptsExportWSWizardPagePresenter {

	private static final String EXTENSION_EXTRA_BUILD_CHECKER = "org.talend.repository.ui.wizards.exportjob.extrachecker";
	private static final String EXTRA_BUILD_CHECKER = "ExtraBuildChecker";

	@SuppressWarnings("unused")
	// for future use when refactory logical code to Presenter from UI..
	private JavaJobScriptsExportWSWizardPage page;

	private List<ExtraBuildChecker> extraCheckers;

	JavaJobScriptsExportWSWizardPagePresenter(JavaJobScriptsExportWSWizardPage page) {
		this.page = page;
		extraCheckers = new ArrayList<ExtraBuildChecker>();
		initExtraCheckersFromExtensionPoint();
		initExtraCheckers();
	}

	/**
	 * Inits the extra checkers from plugin extension
	 * <code>org.talend.repository.ui.wizards.exportjob.extraBuildChecker</code>
	 */
	private void initExtraCheckersFromExtensionPoint() {
		IExtension[] extensions = Platform.getExtensionRegistry().getExtensionPoint(EXTENSION_EXTRA_BUILD_CHECKER)
				.getExtensions();
		for (IExtension extension : extensions) {
			IConfigurationElement[] eles = extension.getConfigurationElements();
			for (IConfigurationElement ele : eles) {
				try {
					ExtraBuildChecker checker = (ExtraBuildChecker) ele.createExecutableExtension(EXTRA_BUILD_CHECKER);
					addExtraChecker(checker);
				} catch (CoreException e) {
					ExceptionHandler.process(new RuntimeException("Can't load extra Job Build checker - " + ele, e));
				}
			}
		}
	}

	protected void initExtraCheckers() {
		// addExtraChecker(new BanSoapServiceJobChecker());
		// addExtraChecker(new LimitESBJobChecker());
	}

	private void addExtraChecker(ExtraBuildChecker extraChecker) {
		extraCheckers.add(extraChecker);
	}

	/**
	 * Extra check.
	 *
	 * @param exportType
	 *            the export type
	 * @param checkNodes
	 *            the check nodes
	 * @return the error message or <code>null</code> if not exists.
	 */
	public String extraCheck(JobExportType exportType, RepositoryNode[] checkNodes) {
		for (ExtraBuildChecker checker : extraCheckers) {
			String error = checker.check(exportType, checkNodes);
			if (error != null) {
				return error;
			}
		}
		return null;
	}

}
