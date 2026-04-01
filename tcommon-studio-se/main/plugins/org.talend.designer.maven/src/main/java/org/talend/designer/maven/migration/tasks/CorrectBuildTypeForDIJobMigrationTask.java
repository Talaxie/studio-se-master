package org.talend.designer.maven.migration.tasks;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.exception.PersistenceException;
import org.talend.core.model.components.filters.IComponentFilter;
import org.talend.core.model.components.filters.NameComponentFilter;
import org.talend.core.model.general.Project;
import org.talend.core.model.properties.Item;
import org.talend.core.model.properties.ProcessItem;
import org.talend.designer.core.model.utils.emf.talendfile.NodeType;
import org.talend.designer.core.model.utils.emf.talendfile.ProcessType;
import org.talend.designer.runprocess.ItemCacheManager;
import org.talend.migration.MigrationReportRecorder;
import org.talend.repository.ProjectManager;

/*
 * If Job does not contain any of the following components: "tRouteInput", "tRESTClient", "tESBConsumer" 
 * then BUILD_TYPE must be STANDALONE
 * Else (job contains one of "tRouteInput", "tRESTClient" or "tESBConsumer")
 * If no BUILD_TYPE is set then default BUILD_TYPE must be STANDALONE
 * Manage child jobs for jobs ( parent, target BUILD_TYPE = STANDALONE )
 * If BUILD_TYPE is STANDALONE
 * Manage child jobs for jobs ( parent, target BUILD_TYPE = STANDALONE )
 * If BUILD_TYPE is ROUTE > EXCEPTION: need warning message! BUILD_TYPE was wrongly set to ROUTE from a previous migration task and has to be manually updated (all subjobs have to be checked manually). Value should be either STANDALONE (in most cases) or OSGI.
 */

public class CorrectBuildTypeForDIJobMigrationTask extends AbstractDataServiceJobMigrationTask {

	private static final String[] ESB_COMPONENTS = { "tRouteInput", "tRESTClient", "tESBConsumer" };

	private static final String T_RUB_JOB_COMPONENT = "tRunJob";

	boolean failure = false;

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

	@SuppressWarnings("unchecked")
	@Override
	public ExecutionResult execute(Item item) {
		
		final ProcessType processType = getProcessType(item);
		String jobName = item.getProperty().getLabel();
		
		/*
		 * Migrating remaining jobs only (which was not migrated previously)
		 */
		if (isJobMigrated(jobName)) {
			return ExecutionResult.NOTHING_TO_DO;
		}
		
		
		Object originalBuildType = item.getProperty().getAdditionalProperties().get(BUILD_TYPE_PROPERTY);

		/*
		 * If BUILD_TYPE is ROUTE > EXCEPTION: need warning message! BUILD_TYPE was
		 * wrongly set to ROUTE from a previous migration task and has to be manually
		 * updated (all subjobs have to be checked manually). Value should be either
		 * STANDALONE (in most cases) or OSGI.
		 */

		if (originalBuildType != null && BUILD_TYPE_ROUTE.equalsIgnoreCase((String) originalBuildType)) {
			ExceptionHandler.process(new RuntimeException("Job [" + jobName + "] has incorrect BUILD_TYPE ["
					+ BUILD_TYPE_ROUTE
					+ "] which has to be manually updated  (all subjobs have to be checked manually). Value should be either STANDALONE (in most cases) or OSGI"));
			return ExecutionResult.FAILURE;
		}

		for (String name : ESB_COMPONENTS) {

			boolean modified = false;

			IComponentFilter filter = new NameComponentFilter(name);

			List<NodeType> c = searchComponent(processType, filter);

			if (!c.isEmpty()) {

				/*
				 * job contains one of "tRouteInput", "tRESTClient" or "tESBConsumer") If no
				 * BUILD_TYPE is set then default BUILD_TYPE must be STANDALONE
				 */

				if (null == originalBuildType) {
					item.getProperty().getAdditionalProperties().put(BUILD_TYPE_PROPERTY, BUILD_TYPE_STANDALONE);
					try {
						save(item);
						modified |= true;
						generateReportRecord(
								new MigrationReportRecorder(this, MigrationReportRecorder.MigrationOperationType.MODIFY,
										item, null, "Build Type", null, BUILD_TYPE_STANDALONE));
					} catch (PersistenceException e) {
						ExceptionHandler.process(e);
						return ExecutionResult.FAILURE;
					}
				}

				/*
				 * Manage child jobs for jobs ( parent, target BUILD_TYPE = STANDALONE )
				 */
				String currentParentJobBuildType = (String) item.getProperty().getAdditionalProperties()
						.get(BUILD_TYPE_PROPERTY);

				if (BUILD_TYPE_STANDALONE.equalsIgnoreCase(currentParentJobBuildType)) {
					updateBuildTypeForSubJobs(item, currentParentJobBuildType);
				}

				if (failure) {
					return ExecutionResult.FAILURE;
				}

				if (modified) {
					return ExecutionResult.SUCCESS_NO_ALERT;
				}

				return ExecutionResult.NOTHING_TO_DO;
			}
		}

		/*
		 * If Job does not contain any of the following components: "tRouteInput",
		 * "tRESTClient", "tESBConsumer" then BUILD_TYPE must be STANDALONE
		 * Manage child jobs for jobs ( parent, target BUILD_TYPE = STANDALONE )
		 */

		if (null == originalBuildType || !BUILD_TYPE_STANDALONE.equalsIgnoreCase(originalBuildType.toString())) {
			item.getProperty().getAdditionalProperties().put(BUILD_TYPE_PROPERTY, BUILD_TYPE_STANDALONE);
			boolean modified = false;
			try {
				save(item);
				modified |= true;
				generateReportRecord(new MigrationReportRecorder(this,
						MigrationReportRecorder.MigrationOperationType.MODIFY, item, null, "Build Type",
						(null == originalBuildType) ? null : originalBuildType.toString(), BUILD_TYPE_STANDALONE));
				updateBuildTypeForSubJobs(item, BUILD_TYPE_STANDALONE);
			} catch (PersistenceException e) {
				ExceptionHandler.process(e);
				return ExecutionResult.FAILURE;
			}

			if (failure) {
				return ExecutionResult.FAILURE;
			}

			if (modified) {
				return ExecutionResult.SUCCESS_NO_ALERT;
			}
		}
		
		/*
		 * If Job does not contain any of the following components: "tRouteInput",
		 * "tRESTClient", "tESBConsumer" and BUILD_TYPE is STANDALONE
		 * Manage child jobs for jobs ( parent, target BUILD_TYPE = STANDALONE )
		 */
		if (BUILD_TYPE_STANDALONE.equalsIgnoreCase(originalBuildType.toString())) {
			updateBuildTypeForSubJobs(item, BUILD_TYPE_STANDALONE);
			if (failure) {
				return ExecutionResult.FAILURE;
			}
		}

		return ExecutionResult.NOTHING_TO_DO;
	}

	@Override
	public String getDescription() {
		return "Synchronize build types for DI jobs";
	}

	@Override
	public void clear() {
		clearMigratedJobs();
	}

	@SuppressWarnings("unchecked")
	private void updateBuildTypeForSubJobs(Item parentJobItem, String parentJobBuiltType) {
		IComponentFilter filter = new NameComponentFilter(T_RUB_JOB_COMPONENT);

		ProcessType processType = getProcessType(parentJobItem);

		List<NodeType> c = searchComponent(processType, filter);

		if (!c.isEmpty()) {

			for (NodeType tRunJobComponent : c) {
				String processID = findElementParameterByName("SELECTED_JOB_NAME:PROCESS_TYPE_PROCESS",
						tRunJobComponent) == null ? null
								: findElementParameterByName("SELECTED_JOB_NAME:PROCESS_TYPE_PROCESS", tRunJobComponent)
										.getValue();
				if (processID == null) {
					processID = findElementParameterByName("PROCESS:PROCESS_TYPE_PROCESS",
							tRunJobComponent) == null ? null
									: findElementParameterByName("PROCESS:PROCESS_TYPE_PROCESS", tRunJobComponent)
											.getValue();
				}
				
				String processVersion = findElementParameterByName("SELECTED_JOB_NAME:PROCESS_TYPE_VERSION",
						tRunJobComponent) == null ? null
								: findElementParameterByName("SELECTED_JOB_NAME:PROCESS_TYPE_VERSION", tRunJobComponent)
										.getValue();
				
				if (processVersion == null) {
					processVersion = findElementParameterByName("PROCESS:PROCESS_TYPE_VERSION",
							tRunJobComponent) == null ? null
									: findElementParameterByName("PROCESS:PROCESS_TYPE_VERSION", tRunJobComponent)
											.getValue();
				}

				if (processID != null && processVersion != null) {
					ProcessItem childItem = ItemCacheManager.getProcessItem(processID, processVersion);
					Project childItemProject = ProjectManager.getInstance().getCurrentProject();

					if (childItem == null) {
						for (Project refProject : ProjectManager.getInstance().getAllReferencedProjects()) {
							childItem = ItemCacheManager.getRefProcessItem(getProject(), processID);
							if (childItem != null) {
								childItemProject = refProject;
								break;
							}
						}
					}

					if (childItem != null) {

						Object currentChildBuildType = childItem.getProperty().getAdditionalProperties()
								.get(BUILD_TYPE_PROPERTY);

//						String jobID = childItem.getProperty().getLabel();

						String currentChildBuildTypeStr = (null == currentChildBuildType) ? null
								: (String) currentChildBuildType;

						if (BUILD_TYPE_STANDALONE.equalsIgnoreCase(parentJobBuiltType)
								&& !BUILD_TYPE_STANDALONE.equalsIgnoreCase(currentChildBuildTypeStr)) {

							childItem.getProperty().getAdditionalProperties().put(BUILD_TYPE_PROPERTY,
									BUILD_TYPE_STANDALONE);

							try {
								save(childItem);
								generateReportRecord(new MigrationReportRecorder(this,
										MigrationReportRecorder.MigrationOperationType.MODIFY, childItem, null,
										"Build Type", currentChildBuildTypeStr, BUILD_TYPE_STANDALONE));
							} catch (PersistenceException e) {
								ExceptionHandler.process(e);
								failure = true;
							}
						}

						updateBuildTypeForSubJobs(childItem, parentJobBuiltType);
					}
				}
			}
		}
	}
}
