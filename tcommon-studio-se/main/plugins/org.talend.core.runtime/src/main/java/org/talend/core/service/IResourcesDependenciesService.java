package org.talend.core.service;

import org.eclipse.swt.widgets.Shell;
import org.talend.core.GlobalServiceRegister;
import org.talend.core.IService;
import org.talend.core.model.process.IProcess;
import org.talend.core.model.repository.IRepositoryViewObject;

public interface IResourcesDependenciesService extends IService {

    public String openResourcesDialogForContext(Shell parentShell);

    public void copyToExtResourceFolder(IRepositoryViewObject repoObject, String jobId, String jobVersion, String version,
            String rootJobLabel);

    public String getResourcePathForContext(IProcess process, String resourceContextValue);

    public String getResourcePathForContext(IProcess process, String resourceContextValue, boolean forceRelative);

    public String getResourceItemFilePath(String resourceContextValue);

    public void refreshDependencyViewer();

    public void setContextParameterChangeDirtyManually();

    public void removeBuildJobCacheForResource(String resourceId);

    public static IResourcesDependenciesService get() {
        GlobalServiceRegister register = GlobalServiceRegister.getDefault();
        if (register.isServiceRegistered(IResourcesDependenciesService.class)) {
            return register.getService(IResourcesDependenciesService.class);
        }
        return null;
    }
}
