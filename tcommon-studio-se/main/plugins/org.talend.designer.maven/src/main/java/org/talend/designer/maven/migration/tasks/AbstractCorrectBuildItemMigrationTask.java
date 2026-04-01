package org.talend.designer.maven.migration.tasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.talend.commons.exception.PersistenceException;
import org.talend.commons.runtime.model.emf.EmfHelper;
import org.talend.core.GlobalServiceRegister;
import org.talend.core.model.components.filters.IComponentFilter;
import org.talend.core.model.migration.AbstractItemMigrationTask;
import org.talend.core.model.properties.Item;
import org.talend.core.model.properties.JobletProcessItem;
import org.talend.core.model.properties.ProcessItem;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.repository.utils.ConvertJobsUtil;
import org.talend.designer.core.model.utils.emf.talendfile.ElementParameterType;
import org.talend.designer.core.model.utils.emf.talendfile.NodeType;
import org.talend.designer.core.model.utils.emf.talendfile.ProcessType;
import org.talend.migration.MigrationReportHelper;
import org.talend.migration.MigrationReportRecorder;
import org.talend.repository.model.IProxyRepositoryFactory;
import org.talend.repository.model.IRepositoryService;

public abstract class AbstractCorrectBuildItemMigrationTask extends AbstractItemMigrationTask implements ICorrectBuildTypeMigrationTask {

	protected static final String BUILD_TYPE_PROPERTY = "BUILD_TYPE";
	protected static final String BUILD_TYPE_STANDALONE = "STANDALONE";
	protected static final String BUILD_TYPE_OSGI = "OSGI";
	protected static final String BUILD_TYPE_ROUTE = "ROUTE";
	protected static final String BUILD_TYPE_ROUTE_MICROSERVICE = "ROUTE_MICROSERVICE";
	protected static final String REST_MS = "REST_MS";
	
	
	protected static Map<String, String> migratedJobs = new HashMap<String, String>();
	
	protected static void clearMigratedJobs () {
		migratedJobs.clear();
	}
	
	protected static void skipMigrationForJob (String jobName, String migrationTask) {
		migratedJobs.put(jobName, migrationTask);
	}
	
	protected static void storeMigratedJob (String jobName, String migrationTask) {
		migratedJobs.put(jobName, migrationTask);
	}
	
	protected static boolean isJobMigrated (String jobName) {
		return migratedJobs.containsKey(jobName);
	}
	
	protected static String getStoredJobMigraionTask (String jobName) {
		return migratedJobs.get(jobName);
	}

	public void generateReportRecord(MigrationReportRecorder recorder) {
		MigrationReportHelper.getInstance().addRecorder(recorder);
	}

	public static List<NodeType> searchComponent(ProcessType processType, IComponentFilter filter) {
		List<NodeType> list = new ArrayList<NodeType>();
		if (filter == null || processType == null) {
			return list;
		}

		for (Object o : processType.getNode()) {
			if (filter.accept((NodeType) o)) {
				list.add((NodeType) o);
			}
		}
		return list;
	}

	public void save(Item item) throws PersistenceException {
		IRepositoryService service = (IRepositoryService) GlobalServiceRegister.getDefault()
				.getService(IRepositoryService.class);
		IProxyRepositoryFactory factory = service.getProxyRepositoryFactory();
		factory.save(item, true);
	}

	public ProcessType getProcessType(Item item) {
		ProcessType processType = null;
		if (item instanceof ProcessItem) {
			processType = ((ProcessItem) item).getProcess();
		}
		if (item instanceof JobletProcessItem) {
			processType = ((JobletProcessItem) item).getJobletProcess();
		}
		if (processType != null) {
			EmfHelper.visitChilds(processType);
			ERepositoryObjectType itemType = ERepositoryObjectType.getItemType(item);
			if (itemType == ERepositoryObjectType.TEST_CONTAINER
					&& !ConvertJobsUtil.JobType.STANDARD.getDisplayName().equalsIgnoreCase(processType.getJobType())) {
				return null;
			}

		}
		return processType;
	}

	/**
	 * Find element parameter with a given parameter name
	 *
	 * @param paramName
	 * @param elementParameterTypes
	 * @return
	 */
	public static final ElementParameterType findElementParameterByName(String paramName, NodeType node) {
		for (Object obj : node.getElementParameter()) {
			ElementParameterType cpType = (ElementParameterType) obj;
			if (paramName.equals(cpType.getName())) {
				return cpType;
			}
		}
		return null;
	}
	
	abstract public void clear ();
}
