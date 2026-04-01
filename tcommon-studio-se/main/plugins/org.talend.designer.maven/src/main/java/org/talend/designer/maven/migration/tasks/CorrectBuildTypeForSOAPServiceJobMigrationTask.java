package org.talend.designer.maven.migration.tasks;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.exception.PersistenceException;
import org.talend.core.model.components.filters.IComponentFilter;
import org.talend.core.model.components.filters.NameComponentFilter;
import org.talend.core.model.properties.Item;
import org.talend.designer.core.model.utils.emf.talendfile.NodeType;
import org.talend.designer.core.model.utils.emf.talendfile.ProcessType;
import org.talend.migration.MigrationReportRecorder;

/*
 * Data service SOAP = Job with "tESBProviderRequest"
 * Set BUILD_TYPE as OSGI
 * Manage child jobs for jobs ( parent job, target BUILD_TYPE = OSGI )
 */

public class CorrectBuildTypeForSOAPServiceJobMigrationTask extends AbstractDataServiceJobMigrationTask {

	private static final String T_ESB_PROVIDER_REQUEST = "tESBProviderRequest";
	private static final String BUILD_TYPE_PROPERTY = "BUILD_TYPE";

	private static final String BUILD_TYPE_OSGI = "OSGI";

	/*
	 * (non-Javadoc)
	 *
	 * @see org.talend.migration.IMigrationTask#getOrder()
	 */
	@Override
	public Date getOrder() {
		GregorianCalendar gc = new GregorianCalendar(2021, 7, 25, 12, 0, 0);
		return gc.getTime();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.talend.core.model.migration.AbstractDataserviceMigrationTask#execute(org
	 * .talend.core.model.properties.Item)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public ExecutionResult execute(Item item) {
		final ProcessType processType = getProcessType(item);

		boolean modified = false;

		/*
		 * If no BUILD_TYPE is set then default BUILD_TYPE must be OSGI
		 */

		IComponentFilter filter = new NameComponentFilter(T_ESB_PROVIDER_REQUEST);

		List<NodeType> c = searchComponent(processType, filter);

		if (!c.isEmpty()) {
			Object originalBuildType = item.getProperty().getAdditionalProperties().get(BUILD_TYPE_PROPERTY);

			if (null == originalBuildType || !BUILD_TYPE_OSGI.equalsIgnoreCase(originalBuildType.toString())) {
				item.getProperty().getAdditionalProperties().put(BUILD_TYPE_PROPERTY, BUILD_TYPE_OSGI);
				try {
					save(item);
					modified |= true;
					generateReportRecord(new MigrationReportRecorder(this,
							MigrationReportRecorder.MigrationOperationType.MODIFY, item, null, "Build Type",
							(null == originalBuildType) ? null : originalBuildType.toString(), BUILD_TYPE_OSGI));
					storeMigratedJob(item.getProperty().getLabel(), this.getClass().getName());
				} catch (PersistenceException e) {
					ExceptionHandler.process(e);
					return ExecutionResult.FAILURE;
				}
				return ExecutionResult.SUCCESS_NO_ALERT;
			} else if (BUILD_TYPE_OSGI.equalsIgnoreCase((String)originalBuildType)){
				// current job has correct build type 
				// skip this job during next migrations
				skipMigrationForJob(item.getProperty().getLabel(), this.getClass().getName());
			} 
		}

		if (modified) {
			return ExecutionResult.SUCCESS_NO_ALERT;
		}

		return ExecutionResult.NOTHING_TO_DO;
	}

	@Override
	public String getDescription() {
		return "Synchronize build types for SOAP service Jobs";
	}
	
	@Override
	public void clear () {
		clearMigratedJobs();
	}
	
}
