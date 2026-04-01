package org.talend.designer.maven.migration.tasks;

import java.util.ArrayList;
import java.util.List;

import org.talend.core.model.repository.ERepositoryObjectType;

public abstract class AbstractDataServiceJobMigrationTask extends AbstractCorrectBuildItemMigrationTask {

	@Override
	public List<ERepositoryObjectType> getTypes() {
		List<ERepositoryObjectType> toReturn = new ArrayList<ERepositoryObjectType>();
		toReturn.add(ERepositoryObjectType.PROCESS);
		return toReturn;
	}

}
