package org.talend.repository.ui.wizards.exportjob.extrachecker;

import org.talend.designer.core.model.utils.emf.talendfile.NodeType;
import org.talend.repository.i18n.Messages;
import org.talend.repository.ui.wizards.exportjob.JavaJobScriptsExportWSWizardPage.JobExportType;

/**
 * Check if exists node tESBProviderRequest. If find one, then throw error
 * "Service Job can't build independent but export with the Service node it assigned with."
 * 
 * TODO better move to other bundle relative to this check.(some appropriate esb bundle)
 * 
 * @author GaoZone
 * @JIRA TESB-13867
 */
public class BanSoapServiceJobChecker extends AbstractJobNodeChecker {

	@Override
	String checkNode(JobExportType exportType, NodeType node) {
		if (!"tESBProviderRequest".equals(node.getComponentName())) {
			return null;
		}
		return Messages.getString("JavaJobScriptsExportWSWizardPage.banServiceJob");
	}
}
