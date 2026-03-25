// ============================================================================
//
// Copyright (C) 2006-2021 Talaxie Inc. - www.deilink.fr
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talaxie SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.designer.documentation.utils;

import java.util.List;

import org.apache.commons.codec.binary.StringUtils;
import org.eclipse.emf.common.util.EList;
import org.eclipse.ui.internal.browser.WebBrowserEditor;
import org.talend.commons.exception.PersistenceException;
import org.talend.commons.ui.runtime.exception.ExceptionHandler;
import org.talend.core.model.properties.Item;
import org.talend.core.model.properties.JobletProcessItem;
import org.talend.core.model.properties.ProcessItem;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.model.repository.IRepositoryViewObject;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.core.repository.model.VersionList;
import org.talend.designer.core.model.utils.emf.talendfile.impl.ElementParameterTypeImpl;
import org.talend.designer.core.model.utils.emf.talendfile.impl.NodeTypeImpl;
import org.talend.repository.documentation.ExportFileResource;

/**
 * DOC ggu class global comment. Detailled comment <br/>
 *
 * $Id: talend.epf 55206 2011-02-15 17:32:14Z mhirt $
 *
 */
public final class DocumentationUtil {

    public static void setPartItemId(WebBrowserEditor editor, String objId, ERepositoryObjectType objType) {
        if (objId != null && editor != null) {
            String id = objId;
            if (objType != null && (objType.equals(ERepositoryObjectType.PROCESS)
                    || objType.equals(ERepositoryObjectType.JOBLET))) {
                id += DocumentationConstants.ID_SUFFIX; // get the doc id
            }
            editor.setPartProperty(DocumentationConstants.KEY_ITEM_ID, id);
        }
    }

    public static void getRelatedResources(List<ExportFileResource> list, List<ExportFileResource> jobletList,
            List<IRepositoryViewObject> repositoryViewObjects,
            List<IRepositoryViewObject> latestVersionRepositoryViewObjects,
            List<IRepositoryViewObject> jobletRepositoryViewObjects, Item item) {
        EList<NodeTypeImpl> nodeList = null;

        if (item instanceof ProcessItem) {
            nodeList = ((ProcessItem) item).getProcess().getNode();
        }
        if (item instanceof JobletProcessItem) {
            nodeList = ((JobletProcessItem) item).getJobletProcess().getNode();
        }
        if (nodeList != null && nodeList.size() > 0) {
            for (NodeTypeImpl nt : nodeList) {
                if ("tRunJob".equals(nt.getComponentName()) || "cTalendJob".equals(nt.getComponentName())) {
                    EList<ElementParameterTypeImpl> elemets = nt.getElementParameter();
                    String jobName = null;
                    String jobVersion = null;
                    for (ElementParameterTypeImpl el : elemets) {

                        if ("PROCESS".equals(el.getName()) || "SELECTED_JOB_NAME".equals(el.getName())) {
                            jobName = el.getValue();

                        }
                        if ("PROCESS:PROCESS_TYPE_VERSION".equals(el.getName())
                                || "SELECTED_JOB_NAME:PROCESS_TYPE_VERSION".equals(el.getName())) {
                            jobVersion = el.getValue();
                        }
                        if (jobName != null && jobVersion != null) {
                            break;
                        }
                    }
                    IRepositoryViewObject subRepositoryViewObject = null;
                    if ("Latest".equals(jobVersion)) {
                        for (IRepositoryViewObject rep : latestVersionRepositoryViewObjects) {
                            if (rep.getProperty() != null && rep.getProperty().getLabel().equals(jobName)) {

                                subRepositoryViewObject = rep;
                                break;
                            }
                        }
                    } else {
                        for (IRepositoryViewObject rep : repositoryViewObjects) {
                            if (rep.getProperty() != null && rep.getProperty().getLabel().equals(jobName)
                                    && rep.getProperty().getVersion().equals(jobVersion)) {
                                subRepositoryViewObject = rep;
                                break;

                            }

                        }
                    }

                    if (subRepositoryViewObject != null) {
                        Item relatedProcessItem = subRepositoryViewObject.getProperty().getItem();

                        ExportFileResource relatedrRsource = new ExportFileResource(relatedProcessItem,
                                relatedProcessItem.getProperty().getLabel());

                        if (!isExist(list, relatedrRsource)) {
                            list.add(relatedrRsource);
                        }
                        getRelatedResources(list, jobletList, repositoryViewObjects, latestVersionRepositoryViewObjects,
                                jobletRepositoryViewObjects, relatedProcessItem);
                    }
                } else {
                    IRepositoryViewObject joletRep = null;
                    if ("Latest".equals(nt.getComponentVersion())) {
                        for (IRepositoryViewObject rep : latestVersionRepositoryViewObjects) {
                            if (rep.getProperty() != null
                                    && rep.getProperty().getLabel().equals(nt.getComponentName())) {

                                joletRep = rep;
                                break;
                            }
                        }
                    } else {
                        for (IRepositoryViewObject rep : jobletRepositoryViewObjects) {

                            if (rep.getProperty().getLabel().equals(nt.getComponentName())
                                    && rep.getProperty().getVersion().equals(nt.getComponentVersion())) {
                                joletRep = rep;
                                break;
                            }
                        }
                    }

                    if (joletRep != null && joletRep.getProperty() != null) {
                        Item relatedProcessItem = joletRep.getProperty().getItem();
                        ExportFileResource relatedrRsource = new ExportFileResource(relatedProcessItem,
                                relatedProcessItem.getProperty().getLabel());

                        if (!isExist(jobletList, relatedrRsource)) {
                            jobletList.add(relatedrRsource);
                        }
                        getRelatedResources(list, jobletList, repositoryViewObjects, latestVersionRepositoryViewObjects,
                                jobletRepositoryViewObjects, relatedProcessItem);
                    }

                }
            }
        }

    }

    public static boolean isExist(List<ExportFileResource> exportFileList, ExportFileResource efe) {
        for (ExportFileResource ex : exportFileList) {
            if (StringUtils.equals(ex.getItem().getProperty().getId(), efe.getItem().getProperty().getId())
                    && StringUtils.equals(ex.getItem().getProperty().getVersion(),
                            efe.getItem().getProperty().getVersion())) {
                return true;
            }
        }
        return false;
    }
}
