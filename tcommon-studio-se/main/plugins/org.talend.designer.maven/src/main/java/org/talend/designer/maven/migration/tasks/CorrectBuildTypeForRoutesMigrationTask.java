package org.talend.designer.maven.migration.tasks;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.exception.PersistenceException;
import org.talend.core.model.components.filters.IComponentFilter;
import org.talend.core.model.components.filters.NameComponentFilter;
import org.talend.core.model.general.Project;
import org.talend.core.model.properties.Item;
import org.talend.core.model.properties.ProcessItem;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.core.runtime.process.TalendProcessArgumentConstant;
import org.talend.designer.core.model.utils.emf.talendfile.NodeType;
import org.talend.designer.core.model.utils.emf.talendfile.ProcessType;
import org.talend.designer.runprocess.ItemCacheManager;
import org.talend.migration.MigrationReportRecorder;
import org.talend.repository.ProjectManager;

/*
 * Routes
 * If no BUILD_TYPE is set then Default BUILD_TYPE must be ROUTE
 * - Manage child jobs for routes ( parent, target BUILD_TYPE = OSGI )
 * Else if BUILD_TYPE is ROUTE
 * - Manage child jobs for routes ( parent, target BUILD_TYPE = OSGI )
 * Else if BUILD_TYPE is ROUTE_MICROSERVICE
 * -Manage child jobs for jobs ( parent, target BUILD_TYPE = STANDALONE )
 */

public class CorrectBuildTypeForRoutesMigrationTask extends AbstractRouteMigrationTask {

	private static final String C_TALEND_JOB = "cTalendJob";

	protected Map<String, String> migratedChildJobs = new HashMap<String, String>();

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

		boolean modified = false;
		boolean migrationFailure = false;
		/*
		 * If no BUILD_TYPE is set then default BUILD_TYPE must be ROUTE
		 */

		Object buildType = item.getProperty().getAdditionalProperties().get(BUILD_TYPE_PROPERTY);
		if (null == buildType) {
			item.getProperty().getAdditionalProperties().put(BUILD_TYPE_PROPERTY, BUILD_TYPE_ROUTE);
			try {
				save(item);
				modified |= true;
				generateReportRecord(
						new MigrationReportRecorder(this, MigrationReportRecorder.MigrationOperationType.MODIFY, item,
								null, "Build Type", "null", BUILD_TYPE_OSGI));
			} catch (PersistenceException e) {
				ExceptionHandler.process(e);
				return ExecutionResult.FAILURE;
			}
		}

		/*
		 * If no BUILD_TYPE is set then Default BUILD_TYPE must be ROUTE - Manage child
		 * jobs for routes ( parent, target BUILD_TYPE = OSGI ) Else if BUILD_TYPE is
		 * ROUTE - Manage child jobs for routes ( parent, target BUILD_TYPE = OSGI )
		 * Else if BUILD_TYPE is ROUTE_MICROSERVICE -Manage child jobs for jobs (
		 * parent, target BUILD_TYPE = STANDALONE )
		 */

		String currentRouteBuildType = (String) item.getProperty().getAdditionalProperties().get(BUILD_TYPE_PROPERTY);

		String currentRouteID = item.getProperty().getLabel();

		IComponentFilter filter = new NameComponentFilter(C_TALEND_JOB);

		List<NodeType> c = searchComponent(processType, filter);

		if (!c.isEmpty()) {

			for (NodeType cTalendJobComponent : c) {

				String processID = findElementParameterByName("SELECTED_JOB_NAME:PROCESS_TYPE_PROCESS",
						cTalendJobComponent) == null ? null
								: findElementParameterByName("SELECTED_JOB_NAME:PROCESS_TYPE_PROCESS",
										cTalendJobComponent).getValue();
				String processVersion = findElementParameterByName("SELECTED_JOB_NAME:PROCESS_TYPE_VERSION",
						cTalendJobComponent) == null ? null
								: findElementParameterByName("SELECTED_JOB_NAME:PROCESS_TYPE_VERSION",
										cTalendJobComponent).getValue();

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

						String jobID = childItem.getProperty().getLabel();

						String currentChildBuildTypeStr = (null == currentChildBuildType) ? null
								: (String) currentChildBuildType;
						
						if (BUILD_TYPE_ROUTE.equalsIgnoreCase(currentRouteBuildType)
								&& BUILD_TYPE_OSGI.equalsIgnoreCase(currentChildBuildTypeStr)) {
							storeMigratedModel(jobID, currentRouteID);
						}

						if (BUILD_TYPE_ROUTE.equalsIgnoreCase(currentRouteBuildType)
								&& !BUILD_TYPE_OSGI.equalsIgnoreCase(currentChildBuildTypeStr)) {

							try {
								if (isModelMigrated(jobID)) {
									ExceptionHandler.process(new RuntimeException(
											"Child Job is called by 2 or more different Routes which have different build types. Build type for child Job ["
													+ jobID + "] was previously updated to [" + currentChildBuildTypeStr
													+ "] to be compatible with parent Route ["
													+ getStoredMigratedModelParentRoute(jobID)
													+ "] which is not compatible with current parent Route ["
													+ currentRouteID + "] with build type [" + currentRouteBuildType
													+ "]. "));
									migrationFailure = true;
									continue;
								} else {

									childItem.getProperty().getAdditionalProperties()
											.put(TalendProcessArgumentConstant.ARG_BUILD_TYPE, BUILD_TYPE_OSGI);

									generateReportRecord(new MigrationReportRecorder(this,
											MigrationReportRecorder.MigrationOperationType.MODIFY, childItem, null,
											"Build Type", currentChildBuildTypeStr, BUILD_TYPE_OSGI));


									ProxyRepositoryFactory.getInstance().save(childItemProject, childItem, true);
								}

							} catch (PersistenceException e) {
								ExceptionHandler.process(e);
								return ExecutionResult.FAILURE;
							}
						}
						


						if (BUILD_TYPE_ROUTE_MICROSERVICE.equalsIgnoreCase(currentRouteBuildType)
								&& !BUILD_TYPE_STANDALONE.equalsIgnoreCase(currentChildBuildTypeStr)) {

							try {

								if (isModelMigrated(jobID)) {
									ExceptionHandler.process(new RuntimeException(
											"Child Job is called by 2 or more different Routes which have different build types. Build type for child Job ["
													+ jobID + "] was previously updated to [" + currentChildBuildTypeStr
													+ "] to be compatible with parent Route ["
													+ getStoredMigratedModelParentRoute(jobID)
													+ "] which is not compatible with current parent Route ["
													+ currentRouteID + "] with build type [" + currentRouteBuildType
													+ "]. "));
									migrationFailure = true;
									continue;
								} else {

									childItem.getProperty().getAdditionalProperties()
											.put(TalendProcessArgumentConstant.ARG_BUILD_TYPE, BUILD_TYPE_STANDALONE);

									generateReportRecord(new MigrationReportRecorder(this,
											MigrationReportRecorder.MigrationOperationType.MODIFY, childItem, null,
											"Build Type", currentChildBuildTypeStr, BUILD_TYPE_STANDALONE));

									ProxyRepositoryFactory.getInstance().save(childItemProject, childItem, true);
								}
							} catch (PersistenceException e) {
								ExceptionHandler.process(e);
								return ExecutionResult.FAILURE;
							}
						}
						
						
						if(!isModelMigrated(jobID)) {
							storeMigratedModel(jobID, currentRouteID);
						}
						
					}
				}

			}

		}

		if (migrationFailure) {
			return ExecutionResult.FAILURE;
		}

		if (modified) {
			return ExecutionResult.SUCCESS_NO_ALERT;
		}

		return ExecutionResult.NOTHING_TO_DO;

	}

	protected void clearMigratedChildJobs() {
		migratedChildJobs.clear();
	}

	protected void storeMigratedModel(String jobName, String parentRouteName) {
		migratedChildJobs.put(jobName, parentRouteName);
	}

	protected boolean isModelMigrated(String jobName) {
		return migratedChildJobs.containsKey(jobName);
	}

	protected String getStoredMigratedModelParentRoute(String jobName) {
		return migratedChildJobs.get(jobName);
	}

	@Override
	public String getDescription() {
		return "Synchronize build types for Routes (incuding child jobs)";
	}

	@Override
	public void clear() {
		clearMigratedChildJobs();
		clearMigratedJobs();
	}

}
