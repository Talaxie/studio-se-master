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
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Element;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.util.EList;
import org.talend.core.CorePlugin;
import org.talend.core.PluginChecker;
import org.talend.core.model.components.IComponent;
import org.talend.core.model.general.Project;
import org.talend.core.model.genhtml.IHTMLDocConstants;
import org.talend.core.model.process.INode;
import org.talend.core.model.process.IProcess;
import org.talend.core.model.properties.Item;
import org.talend.core.model.properties.JobletProcessItem;
import org.talend.core.model.properties.impl.ProcessItemImpl;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.designer.core.model.utils.emf.talendfile.ElementParameterType;

/**
 * ftang class global comment. Detailled comment
 */
public class GenerateJobletDocListHTML extends GenerateDocListHTML {

    /**
     * ftang GenerateJobletDocListHTML constructor comment.
     *
     * @param repositoryObjectType
     */
    public GenerateJobletDocListHTML(Project project) {
        super(project, ERepositoryObjectType.JOBLET_DOC, ERepositoryObjectType.JOBLET);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.talend.repository.documentation.ui.wizards.htmldocgeneration.GenerateDocListHTML#generate()
     */
    @Override
    public File generate(boolean allVersions) {
        return generateXMLAndHTML(IHTMLDocConstants.JOBLET_DOC_LIST_XML_NAME, IHTMLDocConstants.JOBLET_DOC_LIST_HTML_NAME,
                allVersions);
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * org.talend.repository.documentation.generation.HTMLDocGenerator#seperateNodes(org.talend.core.model.properties
     * .Item)
     */
    @Override
    protected List<List> seperateNodes(Item item) {
        List<INode> internalNodeComponentList = new ArrayList<INode>();
        List<INode> externalNodeComponentList = new ArrayList<INode>();
        List<INode> allNodeComponentList = new ArrayList<INode>();
        List<List> componentsList = new ArrayList<List>();

        IProcess process = null;
        if (PluginChecker.isJobLetPluginLoaded() || PluginChecker.isRouteletLoaded()) {
            
            process = CorePlugin.getDefault().getDesignerCoreService().getJobletProcessByItem(item);

        }
        if (process == null) {
            return componentsList;
        }

        List<INode> graphicalNodeList = (List<INode>) process.getGraphicalNodes();

        for (INode node : graphicalNodeList) {
            // If component is not activate, do not need to get it's information
            if (!node.isActivate()) {
                continue;
            }

            allNodeComponentList.add(node);

            if (node.getExternalNode() != null) {
                externalNodeComponentList.add(node);
            } else {
                internalNodeComponentList.add(node);
            }

        }
        componentsList.add(allNodeComponentList);
        componentsList.add(internalNodeComponentList);
        componentsList.add(externalNodeComponentList);

        return componentsList;
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * org.talend.repository.documentation.generation.HTMLDocGenerator#generateAllComponentsSummaryInfo(org.talend.core
     * .model.properties.Item, org.dom4j.Element, java.util.List)
     */
    @Override
    public void generateAllComponentsSummaryInfo(Item item, Element inputJobElement, List<INode> allComponentsList) {
        Element componentNameListElement = null;
        Point screenshotOffset = new Point();

        if (item instanceof JobletProcessItem) {
            JobletProcessItem jobletProcessItem = (JobletProcessItem) item;
            if (jobletProcessItem.getJobletProcess().getParameters() != null) {
                List<ElementParameterType> elemParamList = jobletProcessItem.getJobletProcess().getParameters()
                        .getElementParameter();
                getScreenShotOffset(screenshotOffset, elemParamList);
            }
        }
        if (item instanceof ProcessItemImpl) {
            ProcessItemImpl processItem = (ProcessItemImpl) item;
            if (processItem.getProcess().getParameters() != null) {
                List<ElementParameterType> elemParamList = processItem.getProcess().getParameters()
                        .getElementParameter();
                getScreenShotOffset(screenshotOffset, elemParamList);
            }
        }

        getComponentListInfo(inputJobElement, allComponentsList, componentNameListElement, screenshotOffset);
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * org.talend.repository.documentation.generation.HTMLDocGenerator#getSourceAndTargetConnection(org.talend.core.
     * model.properties.Item)
     */
    @Override
    protected void getSourceAndTargetConnection(Item item) {
        if (item instanceof JobletProcessItem) {
            EList connectionList = ((JobletProcessItem) item).getJobletProcess().getConnection();

            if (connectionList != null && connectionList.size() != 0) {

                handleSourceAndTargetConnection(connectionList);
            }
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see org.talend.repository.documentation.generation.HTMLDocGenerator#getDocTypeAttribute()
     */
    @Override
    protected String getDocTypeAttribute() {
        return ERepositoryObjectType.JOBLET_DOC.toString();
    }

}
