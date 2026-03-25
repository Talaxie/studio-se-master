// ============================================================================
//
// Copyright (C) 2006-2023 Talaxie Inc. - www.deilink.fr
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talaxie SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.designer.core.ui.editor.subjobcontainer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.talend.designer.core.ui.editor.jobletcontainer.AbstractJobletContainer;
import org.talend.designer.core.ui.editor.jobletcontainer.JobletContainer;
import org.talend.designer.core.ui.editor.nodecontainer.NodeContainer;

public interface ICrossPlatformSubjobContainerPart extends ICrossPlatformEditPart {

    @Override
    default public List getCrossPlatformModelChildren() {
        List<NodeContainer> nodeContainers = new ArrayList<NodeContainer>(
                ((SubjobContainer) getCrossPlatformModel()).getNodeContainers());
        Collections.sort(nodeContainers, new Comparator<NodeContainer>() {

            @Override
            public int compare(NodeContainer nc1, NodeContainer nc2) {
                if (nc1.getNode().isJoblet() || nc2.getNode().isJoblet()) {
                    return 0;
                }
                if (!(nc1 instanceof AbstractJobletContainer) && !(nc2 instanceof AbstractJobletContainer)) {
                    return 0;
                } else if (nc1 instanceof AbstractJobletContainer && !(nc2 instanceof AbstractJobletContainer)) {
                    return -1;
                } else if (!(nc1 instanceof AbstractJobletContainer) && nc2 instanceof AbstractJobletContainer) {
                    return 1;
                } else if (nc1 instanceof JobletContainer && nc2 instanceof JobletContainer) {
                    if (((JobletContainer) nc1).getMrStartContainer() == nc1
                            && ((JobletContainer) nc2).getMrStartContainer() == nc2) {
                        return 0;
                    } else if (((JobletContainer) nc1).getMrStartContainer() != nc1
                            && ((JobletContainer) nc2).getMrStartContainer() == nc2) {
                        return 1;
                    } else if (((JobletContainer) nc1).getMrStartContainer() == nc1
                            && ((JobletContainer) nc2).getMrStartContainer() != nc2) {
                        return -1;
                    } else if (((JobletContainer) nc1).getMrStartContainer() != nc1
                            && ((JobletContainer) nc2).getMrStartContainer() != nc2) {
                        return 0;
                    }
                }
                return 0;
            }
        });
        // List<Element> children = new ArrayList<Element>();
        // children.addAll(nodeContainers);
        // if (GlobalServiceRegister.getDefault().isServiceRegistered(ITestContainerGEFService.class)) {
        // ITestContainerGEFService testContainerService = (ITestContainerGEFService) GlobalServiceRegister.getDefault()
        // .getService(ITestContainerGEFService.class);
        // if (testContainerService != null) {
        // Element model = testContainerService.getJunitContainer(((SubjobContainer) getModel()).getProcess());
        // if (model != null) {
        // children.add(model);
        // }
        // }
        // }
        return nodeContainers;
    }

    @Override
    default List getCrossPlatformModelSourceConnections() {
        return ((SubjobContainer) this.getCrossPlatformModel()).getOutgoingConnections();
    }

}
