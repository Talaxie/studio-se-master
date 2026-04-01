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
package org.talend.designer.core.ui.editor;

import org.talend.core.GlobalServiceRegister;
import org.talend.core.ui.ISparkJobletProviderService;
import org.talend.core.ui.ISparkStreamingJobletProviderService;
import org.talend.designer.core.ITestContainerGEFService;
import org.talend.designer.core.ui.editor.connections.Connection;
import org.talend.designer.core.ui.editor.connections.ConnectionLabel;
import org.talend.designer.core.ui.editor.connections.ConnectionPerformance;
import org.talend.designer.core.ui.editor.connections.ConnectionResuming;
import org.talend.designer.core.ui.editor.connections.ConnectionTrace;
import org.talend.designer.core.ui.editor.connections.CrossPlatformConnLabelEditPart;
import org.talend.designer.core.ui.editor.connections.CrossPlatformConnectionPart;
import org.talend.designer.core.ui.editor.connections.CrossPlatformConnectionPerformanceEditPart;
import org.talend.designer.core.ui.editor.connections.CrossPlatformConnectionResumingEditPart;
import org.talend.designer.core.ui.editor.connections.CrossPlatformConnectionTraceEditPart;
import org.talend.designer.core.ui.editor.connections.CrossPlatformMonitorConnectionLabelPart;
import org.talend.designer.core.ui.editor.connections.MonitorConnectionLabel;
import org.talend.designer.core.ui.editor.jobletcontainer.CrossPlatformJobletContainerPart;
import org.talend.designer.core.ui.editor.nodecontainer.CrossPlatformNodeContainerPart;
import org.talend.designer.core.ui.editor.nodecontainer.NodeContainer;
import org.talend.designer.core.ui.editor.nodes.CrossPlatformNodeErrorEditPart;
import org.talend.designer.core.ui.editor.nodes.CrossPlatformNodeLabelEditPart;
import org.talend.designer.core.ui.editor.nodes.CrossPlatformNodePart;
import org.talend.designer.core.ui.editor.nodes.CrossPlatformNodeProgressBarPart;
import org.talend.designer.core.ui.editor.nodes.Node;
import org.talend.designer.core.ui.editor.nodes.NodeError;
import org.talend.designer.core.ui.editor.nodes.NodeLabel;
import org.talend.designer.core.ui.editor.nodes.NodeProgressBar;
import org.talend.designer.core.ui.editor.notes.CrossPlatformNoteEditPart;
import org.talend.designer.core.ui.editor.notes.Note;
import org.talend.designer.core.ui.editor.process.CrossPlatformProcessPart;
import org.talend.designer.core.ui.editor.process.Process;
import org.talend.designer.core.ui.editor.subjobcontainer.CrossPlatformSubjobContainerPart;
import org.talend.designer.core.ui.editor.subjobcontainer.ICrossPlatformEditPart;
import org.talend.designer.core.ui.editor.subjobcontainer.SubjobContainer;

public class CrossPlatformPartFactory implements ICrossPlatformPartFactory {

    public CrossPlatformPartFactory() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public ICrossPlatformEditPart createEditPart(ICrossPlatformEditPart context, Object model) {
        ICrossPlatformEditPart part = null;

        if (model instanceof SubjobContainer) {
            part = new CrossPlatformSubjobContainerPart(model);
        } else if (model instanceof Process) {
            part = new CrossPlatformProcessPart(model);
        } else if (model instanceof Node) {
            part = new CrossPlatformNodePart(model);
        } else if (model instanceof Connection) {
            part = new CrossPlatformConnectionPart(model, null, null);
        } else if (model instanceof ConnectionLabel) {
            part = new CrossPlatformConnLabelEditPart(model);
        } else if (model instanceof MonitorConnectionLabel) {
            part = new CrossPlatformMonitorConnectionLabelPart(model);
        } else if (model instanceof ConnectionPerformance) {
            part = new CrossPlatformConnectionPerformanceEditPart(model);
        } else if (model instanceof ConnectionTrace) {
            part = new CrossPlatformConnectionTraceEditPart(model);
        } else if (model instanceof ConnectionResuming) {
            part = new CrossPlatformConnectionResumingEditPart(model);
        } else if (model instanceof NodeLabel) {
            part = new CrossPlatformNodeLabelEditPart(model);
        } else if (model instanceof NodeContainer) {
            if (GlobalServiceRegister.getDefault().isServiceRegistered(ITestContainerGEFService.class)) {
                ITestContainerGEFService testContainerService = (ITestContainerGEFService) GlobalServiceRegister.getDefault()
                        .getService(ITestContainerGEFService.class);
                if (testContainerService != null) {
                    part = testContainerService.createCrossPlatformEditorPart(model);
                    if (part != null) {
                        part.setCrossPlatformModel(model);
                        return part;
                    }
                }
            }
            if (((NodeContainer) model).getNode().isSparkJoblet()) {
                if (GlobalServiceRegister.getDefault().isServiceRegistered(ISparkJobletProviderService.class)) {
                    ISparkJobletProviderService sparkService = (ISparkJobletProviderService) GlobalServiceRegister.getDefault()
                            .getService(ISparkJobletProviderService.class);
                    if (sparkService != null) {
                        part = (ICrossPlatformEditPart) sparkService.createCrossPlatformEditorPart(model);
                        if (part != null) {
                            part.setCrossPlatformModel(model);
                            return part;
                        }
                    }
                }
            } else if (((NodeContainer) model).getNode().isSparkStreamingJoblet()) {
                if (GlobalServiceRegister.getDefault().isServiceRegistered(ISparkStreamingJobletProviderService.class)) {
                    ISparkStreamingJobletProviderService sparkService = (ISparkStreamingJobletProviderService) GlobalServiceRegister
                            .getDefault().getService(ISparkStreamingJobletProviderService.class);
                    if (sparkService != null) {
                        part = (ICrossPlatformEditPart) sparkService.createCrossPlatformEditorPart(model);
                        if (part != null) {
                            part.setCrossPlatformModel(model);
                            return part;
                        }
                    }
                }
            } else if (((NodeContainer) model).getNode().isStandardJoblet()) {
                part = new CrossPlatformJobletContainerPart(model);
            } else if (((NodeContainer) model).getNode().isMapReduce()) {
                part = new CrossPlatformJobletContainerPart(model);
            } else {
                part = new CrossPlatformNodeContainerPart(model);
            }
        } else if (model instanceof Note) {
            part = new CrossPlatformNoteEditPart(model);
        } else if (model instanceof NodeError) {
            part = new CrossPlatformNodeErrorEditPart(model);
        } else if (model instanceof NodeProgressBar) {
            part = new CrossPlatformNodeProgressBarPart(model);
        } else {
            return null;
        }
        // tell the newly created part about the model object
        part.setCrossPlatformModel(model);

        return part;
    }

}
