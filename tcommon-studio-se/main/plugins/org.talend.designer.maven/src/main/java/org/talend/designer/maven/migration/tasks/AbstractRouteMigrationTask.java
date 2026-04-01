package org.talend.designer.maven.migration.tasks;

import java.util.ArrayList;
import java.util.List;

import org.talend.core.model.repository.ERepositoryObjectType;

public abstract class AbstractRouteMigrationTask extends AbstractCorrectBuildItemMigrationTask {

	@Override
	public List<ERepositoryObjectType> getTypes() {
		List<ERepositoryObjectType> toReturn = new ArrayList<ERepositoryObjectType>();
		toReturn.add(ERepositoryObjectType.PROCESS_ROUTE);
		toReturn.add(ERepositoryObjectType.PROCESS_ROUTE_MICROSERVICE);
		return toReturn;
	}

}
