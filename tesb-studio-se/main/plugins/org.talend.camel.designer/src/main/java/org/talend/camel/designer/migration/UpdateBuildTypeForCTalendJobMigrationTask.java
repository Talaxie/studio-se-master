package org.talend.camel.designer.migration;

import java.util.Date;
import java.util.GregorianCalendar;

import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.exception.PersistenceException;
import org.talend.core.model.general.Project;
import org.talend.core.model.properties.ProcessItem;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.core.runtime.process.TalendProcessArgumentConstant;
import org.talend.designer.core.model.utils.emf.talendfile.NodeType;
import org.talend.designer.runprocess.ItemCacheManager;
import org.talend.repository.ProjectManager;
import org.talend.repository.utils.EmfModelUtils;

/**
 * Set 'route' as build type for job in cTalendJob(TESB-21780)
 */
public class UpdateBuildTypeForCTalendJobMigrationTask extends AbstractRouteItemComponentMigrationTask {

    @Override
    public String getComponentNameRegex() {
        return "cTalendJob";
    }

    public Date getOrder() {
        GregorianCalendar gc = new GregorianCalendar(2018, 4, 8, 00, 00, 00);
        return gc.getTime();
    }

    @Override
    public boolean execute(NodeType node) throws PersistenceException {
        return updateBuildTypeForCTalendJob(node);
    }

    @SuppressWarnings("unchecked")
    private boolean updateBuildTypeForCTalendJob(NodeType currentNode) {
        String processID = EmfModelUtils.findElementParameterByName("SELECTED_JOB_NAME:PROCESS_TYPE_PROCESS", currentNode) == null
                ? null
                : EmfModelUtils.findElementParameterByName("SELECTED_JOB_NAME:PROCESS_TYPE_PROCESS", currentNode).getValue();
        String processVersion = EmfModelUtils.findElementParameterByName("SELECTED_JOB_NAME:PROCESS_TYPE_VERSION",
                currentNode) == null ? null
                        : EmfModelUtils.findElementParameterByName("SELECTED_JOB_NAME:PROCESS_TYPE_VERSION", currentNode)
                                .getValue();

        if (processID != null && processVersion != null) {
            ProcessItem item = ItemCacheManager.getProcessItem(processID, processVersion);
            Project itemProject = ProjectManager.getInstance().getCurrentProject();

            if (item == null) {
                for (Project refProject : ProjectManager.getInstance().getAllReferencedProjects()) {
                    item = ItemCacheManager.getRefProcessItem(getProject(), processID);
                    if (item != null) {
                        itemProject = refProject;
                        break;
                    }
                }
            }
            if (item != null) {
                boolean isRouteProcess = ERepositoryObjectType.getType(item.getProperty())
                        .equals(ERepositoryObjectType.PROCESS_ROUTE);
                if (isRouteProcess) {
                    item.getProperty().getAdditionalProperties().put(TalendProcessArgumentConstant.ARG_BUILD_TYPE, "ROUTE");
                }
                try {
                    ProxyRepositoryFactory.getInstance().save(itemProject, item, true);
                } catch (PersistenceException e) {
                    ExceptionHandler.process(e);
                    return false;
                }
                return true;
            }
        }
        return false;
    }

}
