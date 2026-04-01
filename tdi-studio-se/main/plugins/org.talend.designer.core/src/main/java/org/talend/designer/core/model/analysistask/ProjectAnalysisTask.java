// ============================================================================
//
// Copyright (C) 2006-2022 Talaxie Inc. - www.deilink.fr
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talaxie SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.designer.core.model.analysistask;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.ecore.resource.Resource;
import org.talend.analysistask.AnalysisReportRecorder;
import org.talend.analysistask.AnalysisReportRecorder.SeverityOption;
import org.talend.analysistask.DefaultItemsAnalysisTask;
import org.talend.analysistask.IItemAnalysisTask;
import org.talend.analysistask.ItemAnalysisReportManager;
import org.talend.analysistask.ItemAnalysisTaskRegistryReader;
import org.talend.commons.exception.PersistenceException;
import org.talend.commons.utils.workbench.resources.ResourceUtils;
import org.talend.core.model.general.Project;
import org.talend.core.model.properties.Item;
import org.talend.core.model.properties.Property;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.repository.utils.URIHelper;
import org.talend.core.repository.utils.XmiResourceManager;
import org.talend.designer.core.i18n.Messages;

/**
 * created by hcyi on Oct 27, 2022 Detailled comment
 *
 */
public class ProjectAnalysisTask {

    private XmiResourceManager xrm = new XmiResourceManager();

    public ProjectAnalysisTask() {
    }

    public List<AnalysisReportRecorder> analysis(Project project) throws PersistenceException {
        List<AnalysisReportRecorder> recordList = new ArrayList<AnalysisReportRecorder>();
        for (ERepositoryObjectType repositoryObjectType : (ERepositoryObjectType[]) ERepositoryObjectType.values()) {
            if (!repositoryObjectType.isResourceItem()) {
                continue;
            }
            Object folder = getFolder(project, repositoryObjectType);
            if (folder != null) {
                IFolder physicalFolder = (IFolder) folder;
                if (physicalFolder.exists()) {
                    analysisMembers(recordList, repositoryObjectType, physicalFolder);
                }
            }
        }
        recordList.addAll(analysisDuplicatedItems());
        return recordList;
    }

    public void analysisMembers(List<AnalysisReportRecorder> recordList, ERepositoryObjectType repositoryObjectType,
            IFolder physicalFolder) throws PersistenceException {
        try {
            if (physicalFolder != null && physicalFolder.exists()) {
                IResource[] members = ResourceUtils.getMembers(physicalFolder);
                Collection<IResource> sortMembers = sortMembers(members);
                for (IResource current : sortMembers) {
                    if (current instanceof IFolder) {
                        analysisMembers(recordList, repositoryObjectType, (IFolder) current);
                    } else if (current instanceof IFile && xrm.isPropertyFile((IFile) current)) {
                        String currentPath = current.getFullPath().removeFileExtension().toPortableString();
                        String objectTypeFolder = repositoryObjectType.getFolder();
                        int beginIndex = currentPath.indexOf(objectTypeFolder) + objectTypeFolder.length() + 1;
                        currentPath = currentPath.substring(beginIndex);
                        String currentItemType = getCurrentItemType(repositoryObjectType);
                        Property property = null;
                        try {
                            property = xrm.loadProperty(current);
                        } catch (Exception e) {
                            String detailMessage = Messages.getString("ProjectAnalysisTask.invalidaProperties"); //$NON-NLS-1$
                            recordList.add(getAnalysisReportRecorder(currentPath, currentItemType, detailMessage,
                                    SeverityOption.MAJOR));
                        }
                        if (property != null) {
                            if (property.eResource() != null && property.eResource().getResourceSet() == null) {
                                property = reload(property);
                            }
                            Resource itemResource = null;
                            Item item = property.getItem();
                            if (item != null) {
                                try {
                                    itemResource = xrm.getItemResource(xrm.getResourceSet(), item, true, true);
                                } catch (Exception e) {
                                    String detailMessage = Messages.getString("ProjectAnalysisTask.invalidaItem"); //$NON-NLS-1$
                                    recordList.add(getAnalysisReportRecorder(currentPath, currentItemType,
                                            detailMessage, SeverityOption.MAJOR));
                                }
                                // Check duplicated item
                                Map<String, String> allItemURIsMap = ItemAnalysisTaskRegistryReader.getInstance()
                                        .getAllItemURIsMap();
                                Map<String, List<String>> duplicatedItemURIsMap = ItemAnalysisTaskRegistryReader.getInstance()
                                        .getDuplicatedItemURIsMap();
                                String key = currentItemType + ":" + item.getProperty().getId(); //$NON-NLS-1$
                                 String otherItemURI = allItemURIsMap.put(key, currentPath);
                                if (otherItemURI != null) {
                                    // Filter different version of item
                                    int otherIndex = otherItemURI.lastIndexOf("_");//$NON-NLS-1$
                                    int currentIndex = currentPath.lastIndexOf("_");//$NON-NLS-1$
                                    String subOtherItemURI = otherItemURI.substring(0, otherIndex);
                                    String subCurrentPath = currentPath.substring(0, currentIndex);
                                    if (subOtherItemURI.equalsIgnoreCase(subCurrentPath)) {
                                        continue;
                                    }
                                    List<String> duplicatedItemURIs = duplicatedItemURIsMap.get(key);
                                    if (duplicatedItemURIs == null) {
                                        duplicatedItemURIs = new ArrayList<String>();
                                        duplicatedItemURIsMap.put(key, duplicatedItemURIs);
                                    }
                                    if (!duplicatedItemURIs.contains(otherItemURI)) {
                                        duplicatedItemURIs.add(otherItemURI);
                                    }
                                    if (!duplicatedItemURIs.contains(currentPath)) {
                                        duplicatedItemURIs.add(currentPath);
                                    }
                                }
                                if (itemResource != null) {
                                    itemResource.unload();
                                }
                                xrm.unloadResources(property);
                            } else {
                                String detailMessage = Messages.getString("ProjectAnalysisTask.invalidaItem"); //$NON-NLS-1$
                                recordList.add(getAnalysisReportRecorder(currentPath, currentItemType,
                                        detailMessage, SeverityOption.MAJOR));
                            }
                        }
                    }
                }
            }
        } finally {
            xrm.unloadResources();
        }
    }

    public Collection<IResource> sortMembers(IResource[] members) {
        Map<String, IResource> membersMap = new HashMap<String, IResource>();
        List<IResource> membersList = new ArrayList<IResource>();
        List<IResource> othersList = new ArrayList<IResource>();
        for (IResource res : members) {
            if (res instanceof IFile) {
                membersList.add(res);
            } else {
                othersList.add(res);
            }
        }
        // sort
        membersList.sort(new Comparator<IResource>() {

            @Override
            public int compare(IResource o1, IResource o2) {
                if (o1 instanceof IFile && o2 instanceof IFile) {
                    String o1Path = o1.getFullPath().removeFileExtension().toPortableString();
                    String o2Path = o2.getFullPath().removeFileExtension().toPortableString();
                    return o2Path.compareTo(o1Path);
                }
                return 0;
            }

        });
        // filter
        membersList.addAll(othersList);
        for (IResource resource : membersList) {
            String currentPath = resource.getFullPath().toPortableString();
            if (resource instanceof IFile) {
                int index1 = currentPath.lastIndexOf("_");//$NON-NLS-1$
                int index2 = currentPath.lastIndexOf(".");//$NON-NLS-1$
                String key = currentPath.substring(0, index1) + currentPath.substring(index2);
                if (!membersMap.containsKey(key)) {
                    membersMap.put(key, resource);
                }
            } else {
                if (!membersMap.containsKey(currentPath)) {
                    membersMap.put(currentPath, resource);
                }
            }
        }
        return membersMap.values();
    }

    public List<AnalysisReportRecorder> analysisDuplicatedItems() {
        List<AnalysisReportRecorder> recordList = new ArrayList<AnalysisReportRecorder>();
        Map<String, List<String>> duplicatedItemURIsMap = ItemAnalysisTaskRegistryReader.getInstance().getDuplicatedItemURIsMap();
        for (String key : duplicatedItemURIsMap.keySet()) {
            List<String> duplicatedItemURIsList = duplicatedItemURIsMap.get(key);
            StringBuffer sb = new StringBuffer();
            for (String itemURI : duplicatedItemURIsList) {
                sb.append(itemURI);
                sb.append(";"); //$NON-NLS-1$
            }
            int index = key.indexOf(":");//$NON-NLS-1$
            String currentItemType = key.substring(0, index);
            String subkey = key.substring(index + 1);
            String detailMessage = Messages.getString("ProjectAnalysisTask.duplicatedItem", //$NON-NLS-1$
                    duplicatedItemURIsList.size(), subkey);
            AnalysisReportRecorder recorder = getAnalysisReportRecorder(sb.toString(), currentItemType, detailMessage,
                    SeverityOption.WARNING);
            recordList.add(recorder);
        }
        return recordList;
    }

    public AnalysisReportRecorder getAnalysisReportRecorder(String currentPath, String currentItemType, String detailMessage,
            SeverityOption severity) {
        AnalysisReportRecorder recorder = new AnalysisReportRecorder(getDefaultItemsAnalysisTask(), severity, detailMessage);
        recorder.setCurrentPath(currentPath);
        recorder.setCurrentItemType(currentItemType);

        return recorder;
    }

    public IItemAnalysisTask getDefaultItemsAnalysisTask() {
        DefaultItemsAnalysisTask analysisTask = new DefaultItemsAnalysisTask();
        analysisTask.setName(Messages.getString("ProjectAnalysisTask.taskName")); //$NON-NLS-1$
        analysisTask.setDetailLink("");//$NON-NLS-1$
        analysisTask.setDescription(Messages.getString("ProjectAnalysisTask.taskDescription"));//$NON-NLS-1$
        return analysisTask;
    }

    public Object getFolder(Project project, ERepositoryObjectType repositoryObjectType) {
        try {
            IProject fsProject = ResourceUtils.getProject(project);
            if (repositoryObjectType != null && repositoryObjectType.hasFolder()) {
                String folderName = ERepositoryObjectType.getFolderName(repositoryObjectType);
                return ResourceUtils.getFolder(fsProject, folderName, true);
            }
        } catch (PersistenceException ex) {
            // do nothing
        }
        return null;
    }

    public Property reload(Property property) {
        IFile file = URIHelper.getFile(property.eResource().getURI());
        List<Resource> affectedResources = xrm.getAffectedResources(property);
        for (Resource resource : affectedResources) {
            resource.unload();
        }
        return xrm.loadProperty(file);
    }

    public String getCurrentItemType(ERepositoryObjectType itemType) {
        String type = ""; //$NON-NLS-1$
        if (itemType != null) {
            ERepositoryObjectType parentJobType = itemType.findParentType(itemType);
            if (parentJobType != null) {
                String parentTypePath = ItemAnalysisReportManager.getInstance().getCompleteObjectTypePath(parentJobType);
                if (StringUtils.isNotBlank(parentTypePath)) {
                    type = parentTypePath + "/";
                }
                type += itemType;

            }
            type = ItemAnalysisReportManager.getInstance().getCompleteObjectTypePath(itemType);
        }
        return type;
    }
}
