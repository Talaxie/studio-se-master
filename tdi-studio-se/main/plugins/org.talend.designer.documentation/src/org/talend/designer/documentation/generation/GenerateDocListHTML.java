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
package org.talend.designer.documentation.generation;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.swt.SWT;
import org.osgi.framework.Bundle;
import org.talend.commons.exception.PersistenceException;
import org.talend.commons.ui.runtime.exception.ExceptionHandler;
import org.talend.core.CorePlugin;
import org.talend.core.model.general.Project;
import org.talend.core.model.genhtml.HTMLDocUtils;
import org.talend.core.model.genhtml.HTMLHandler;
import org.talend.core.model.genhtml.IHTMLDocConstants;
import org.talend.core.model.genhtml.XMLHandler;
import org.talend.core.model.properties.Item;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.model.repository.IRepositoryViewObject;
import org.talend.core.model.repository.documentation.DocumentationHelper;
import org.talend.core.model.utils.RepositoryManagerHelper;
import org.talend.designer.documentation.generation.HTMLDocGenerator;
import org.talend.repository.model.IProxyRepositoryFactory;
import org.talend.repository.model.IRepositoryNode;
import org.talend.repository.model.IRepositoryNode.ENodeType;
import org.talend.repository.model.RepositoryNode;
import org.talend.repository.model.nodes.IProjectRepositoryNode;
import org.talend.repository.ui.views.IRepositoryView;

/**
 * ftang class global comment. Detailled comment
 */
public abstract class GenerateDocListHTML extends HTMLDocGenerator {

    private static URL xslFileUrl = null;

    static {
        // Gets the "org.talend.repository.documentation" plug-in:
        final Bundle documentationBundle = Platform.getBundle("org.talend.repository.documentation"); //$NON-NLS-1$

        try {
            xslFileUrl = FileLocator.toFileURL(FileLocator.find(documentationBundle, new Path(
                    IHTMLDocConstants.GENERATE_ALL_DOC_LIST_XSL), null));

        } catch (IOException e) {
            ExceptionHandler.process(e);
        }
    }

    /**
     * ftang GenerateDocListHTML constructor comment.
     *
     * @param repositoryObjectType
     */
    public GenerateDocListHTML(Project project, ERepositoryObjectType repositoryObjectType, ERepositoryObjectType itemType) {
        super(project, repositoryObjectType, itemType);
    }

    /**
     * ftang Comment method "generateItemInfo".
     *
     * @param jobItemSet
     * @param jobName
     * @param jobVersion
     * @param nodePath
     * @param htmlPath
     * @return
     */
    protected void generateItemInfo(Element jobItemSet, String jobName, String jobVersion, String nodePath, String htmlPath) {
        Element item = jobItemSet.addElement("item"); //$NON-NLS-1$
        item.addAttribute("version", HTMLDocUtils.checkString(jobVersion)); //$NON-NLS-1$
        item.addAttribute("name", HTMLDocUtils.checkString(jobName)); //$NON-NLS-1$
        item.addAttribute("path", HTMLDocUtils.checkString(nodePath)); //$NON-NLS-1$
        item.addAttribute("link", htmlPath); //$NON-NLS-1$
    }

    /**
     * ftang Comment method "generateDocItemInfo".
     *
     * @param projectElement
     */
    protected void generateDocItemInfo(Element projectElement, boolean allVersions) {
        ERepositoryObjectType repositoryObjectType = getRepositoryObjectType();
        String itemType = repositoryObjectType.toString().toLowerCase();
        Element itemSet = projectElement.addElement("jobitemset"); //$NON-NLS-1$
        itemSet.addAttribute("type", itemType); //$NON-NLS-1$

        // Step 1: Gets all job nodes on Repository View:
        IProxyRepositoryFactory proxyFactory = CorePlugin.getDefault().getRepositoryService().getProxyRepositoryFactory();
        try {
            if (getItemType() == null) {
                return;
            }
            List<IRepositoryViewObject> docsToCreate = proxyFactory.getAll(getProject(), getItemType(), false, allVersions);

            for (IRepositoryViewObject object : docsToCreate) {
                if (object.getProperty() == null) {
                    continue;
                }
                Item item = object.getProperty().getItem();
                if (item == null) {
                    continue;
                }
                String jobName = object.getLabel();
                String jobVersion = object.getVersion();
                String nodePath = item.getState().getPath();
                String folderName = jobName + "_" + jobVersion; //$NON-NLS-1$
                String htmlFileName = folderName + IHTMLDocConstants.HTML_FILE_SUFFIX;
                if (nodePath != null && !nodePath.equals("")) { //$NON-NLS-1$
                    nodePath = nodePath + IPath.SEPARATOR;
                }
                String htmlPath = nodePath + folderName + IPath.SEPARATOR + htmlFileName;

                generateItemInfo(itemSet, jobName, jobVersion, nodePath, htmlPath);
            }
        } catch (PersistenceException e) {
            ExceptionHandler.process(e);
        }
    }

    /**
     * ftang Comment method "generateXMLAndHTML".
     *
     * @param jobDocListXMLName
     * @param jobDocListHTMLName
     * @return
     */
    protected File generateXMLAndHTML(String jobDocListXMLName, String jobDocListHTMLName, boolean allVersions) {

        // Step 1: generate xml file;
        Document document = DocumentHelper.createDocument();
        Element projectElement = generateProjectInfo(document);

        generateDocItemInfo(projectElement, allVersions);

        String tempFolderPath = HTMLDocUtils.getTmpFolder();

        String xmlFilePath = tempFolderPath + IPath.SEPARATOR + jobDocListXMLName;

        // Delete xml file if it exists.
        new File(xmlFilePath).deleteOnExit();

        XMLHandler.generateXMLFile(tempFolderPath, xmlFilePath, document);

        // Step 2: generate html file;
        String jobNodeDocumentationRoot = DocumentationHelper.getJobNodeDocumentationRoot(getProject(),
                ERepositoryObjectType.getFolderName(getRepositoryObjectType()));
        String htmlFilePath = jobNodeDocumentationRoot + IPath.SEPARATOR + jobDocListHTMLName;
        HTMLHandler.generateHTMLFile("", xslFileUrl.getFile().toString(), xmlFilePath, htmlFilePath); //$NON-NLS-1$

        // Step 2.1: copy the logo file into "pictures" folder.
        String picturesFolderPath = jobNodeDocumentationRoot + IPath.SEPARATOR + IHTMLDocConstants.PIC_FOLDER_NAME;
        String logoPicTargetFullPath = picturesFolderPath + IPath.SEPARATOR + IHTMLDocConstants.TALEND_LOGO_FILE_NAME;
        File targetPicFolder = new File(picturesFolderPath);
        File targetPicFullPathFile = new File(logoPicTargetFullPath);

        if (targetPicFolder == null || !targetPicFolder.exists()) {
            targetPicFolder.mkdir();
        }

        if (!targetPicFullPathFile.exists()) {
            try {
                saveLogoImage(SWT.IMAGE_JPEG, targetPicFullPathFile);
            } catch (IOException e) {
                ExceptionHandler.process(e);
            }
        }
        return new File(htmlFilePath);
    }

    /**
     * ftang Comment method "generate".
     *
     * @return
     */
    public abstract File generate(boolean allVersions);

    /**
     * ftang Comment method "getCurrentNode".
     *
     * @return
     */
    public RepositoryNode getCurrentNode() {
        final IRepositoryView findRepositoryView = RepositoryManagerHelper.findRepositoryView();
        if (findRepositoryView == null) {
            return null;
        }
        IProjectRepositoryNode root = findRepositoryView.getRoot();

        RepositoryNode jobsDocNode = null;

        for (IRepositoryNode node : root.getChildren()) {
            if (node.getType() == ENodeType.SYSTEM_FOLDER && node.getContentType() == ERepositoryObjectType.DOCUMENTATION) {
                {
                    for (IRepositoryNode subNode : node.getChildren()) {
                        if (subNode.getType() == ENodeType.STABLE_SYSTEM_FOLDER
                                && subNode.getContentType() == ERepositoryObjectType.GENERATED) {
                            for (IRepositoryNode nextSubNode : subNode.getChildren()) {
                                if (nextSubNode.getType() == ENodeType.STABLE_SYSTEM_FOLDER
                                        && nextSubNode.getContentType() == getRepositoryObjectType()) {
                                    jobsDocNode = (RepositoryNode) nextSubNode;
                                    // stop looping immediately
                                    return jobsDocNode;
                                }
                            }
                        }
                    }
                }
            }
        }
        return jobsDocNode;
    }

}
