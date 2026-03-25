// ============================================================================
package org.talend.camel.designer.migration;

import java.io.IOException;
import java.util.Date;
import java.util.GregorianCalendar;

import org.talend.commons.exception.PersistenceException;
import org.talend.designer.core.model.utils.emf.talendfile.ElementParameterType;
import org.talend.designer.core.model.utils.emf.talendfile.NodeType;
import org.talend.migration.MigrationReportRecorder;

/**
 * DOC GangLiu class global comment. Detailed comment
 */
public class RenameHawtdbToLeveldbMigrationTask extends AbstractRouteItemComponentMigrationTask {

	@Override
	public String getComponentNameRegex() {
		return "cAggregate";
	}

	public Date getOrder() {
		GregorianCalendar gc = new GregorianCalendar(2022, 04, 07, 00, 00, 00);
		return gc.getTime();
	}

	@Override
	protected boolean execute(NodeType node) throws Exception {
		return changeRepositoryName(node);
	}


	private boolean changeRepositoryName(NodeType currentNode) throws PersistenceException,
			IOException {
		boolean needSave = false;
		for (Object e : currentNode.getElementParameter()) {
			ElementParameterType p = (ElementParameterType) e;
			if (!"REPOSITORY".equals(p.getName())) {
				continue;
			}
			String value = p.getValue();
			if("HAWTDB".equals(value)){
				p.setValue("LEVELDB");
				needSave = true;
				
				generateReportRecord(new MigrationReportRecorder(this,
				    MigrationReportRecorder.MigrationOperationType.MODIFY, getRouteItem(), currentNode, "REPOSITORY",
				        "HAWTDB", "LEVELDB"));
			}
		}
		return needSave;
	}
}
