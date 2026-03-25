package org.talend.camel.designer.migration;

import java.util.Date;
import java.util.GregorianCalendar;

import org.eclipse.emf.common.util.EList;
import org.talend.commons.exception.PersistenceException;
import org.talend.designer.core.model.utils.emf.talendfile.ElementParameterType;
import org.talend.designer.core.model.utils.emf.talendfile.NodeType;
import org.talend.designer.core.model.utils.emf.talendfile.TalendFileFactory;

public class AddStickyJobTocTalendJobMigrationTask extends AbstractRouteItemComponentMigrationTask {

	@Override
	public String getComponentNameRegex() {
		return "cTalendJob";
	}
	
	public Date getOrder() {
		GregorianCalendar gc = new GregorianCalendar(2017, 2, 24, 19, 00, 00);
		return gc.getTime();
	}

	@Override
	public boolean execute(NodeType node) throws PersistenceException{
			return addStickyJob(node);
	}
	
	/**
	 * Adds the sticky job.
	 *
	 * @param currentNode the current node
	 * @return true, if need save.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
    private boolean addStickyJob(NodeType currentNode) {
		EList elementParameter = currentNode.getElementParameter();
		boolean isNewElement = false;
		for (Object obj : elementParameter) {
			if (!(obj instanceof ElementParameterType)) {
				continue;
			}
			ElementParameterType param = (ElementParameterType) obj;
			String name = param.getName();
			if ("STICKY_JOB".equals(name)) {
				isNewElement = true;
				break;
			}
		}
		if (isNewElement) {
			return false;
		}

		ElementParameterType stickyJob = TalendFileFactory.eINSTANCE
				.createElementParameterType();
		stickyJob.setName("STICKY_JOB");
		stickyJob.setField("CHECK");		
		stickyJob.setValue("false");
		elementParameter.add(stickyJob);
		return true;
	}
}
