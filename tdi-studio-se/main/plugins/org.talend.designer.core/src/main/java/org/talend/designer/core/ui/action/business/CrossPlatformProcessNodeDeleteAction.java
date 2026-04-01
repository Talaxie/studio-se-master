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
package org.talend.designer.core.ui.action.business;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.talend.commons.ui.runtime.custom.ICommonUIHandler;
import org.talend.commons.ui.runtime.custom.ICrossPlatformPreferenceStore;
import org.talend.commons.ui.runtime.custom.MessageDialogWithToggleBusinessHandler;
import org.talend.core.GlobalServiceRegister;
import org.talend.core.model.components.IComponent;
import org.talend.core.model.process.IProcess;
import org.talend.core.model.process.IProcess2;
import org.talend.core.ui.IJobletProviderService;
import org.talend.designer.core.DesignerPlugin;
import org.talend.designer.core.i18n.Messages;
import org.talend.designer.core.model.process.AbstractProcessProvider;
import org.talend.designer.core.ui.editor.ICrossPlatformPartFactory;
import org.talend.designer.core.ui.editor.connections.Connection;
import org.talend.designer.core.ui.editor.connections.ConnectionLabel;
import org.talend.designer.core.ui.editor.connections.ICrossPlatformConnLabelEditPart;
import org.talend.designer.core.ui.editor.connections.ICrossPlatformConnectionPart;
import org.talend.designer.core.ui.editor.jobletcontainer.CrossPlatformJobletContainerFigure;
import org.talend.designer.core.ui.editor.jobletcontainer.ICrossPlatformJobletContainerPart;
import org.talend.designer.core.ui.editor.jobletcontainer.JobletContainer;
import org.talend.designer.core.ui.editor.nodecontainer.ICrossPlatformNodeContainerPart;
import org.talend.designer.core.ui.editor.nodecontainer.NodeContainer;
import org.talend.designer.core.ui.editor.nodes.CrossPlatformNodeEditPolicy;
import org.talend.designer.core.ui.editor.nodes.CrossPlatformNodePart;
import org.talend.designer.core.ui.editor.nodes.ICrossPlatformNodePart;
import org.talend.designer.core.ui.editor.nodes.Node;
import org.talend.designer.core.ui.editor.notes.ICrossPlatformNoteEditPart;
import org.talend.designer.core.ui.editor.notes.Note;
import org.talend.designer.core.ui.editor.process.CrossPlatformProcessPart;
import org.talend.designer.core.ui.editor.subjobcontainer.CrossPlatformGroupRequest;
import org.talend.designer.core.ui.editor.subjobcontainer.ICrossPlatformEditPart;
import org.talend.designer.core.ui.editor.subjobcontainer.ICrossPlatformSubjobContainerPart;
import org.talend.designer.core.ui.editor.subjobcontainer.SubjobContainer;
import org.talend.designer.core.ui.preferences.TalendDesignerPrefConstants;

/**
 * DOC cmeng  class global comment. Detailled comment
 */
public class CrossPlatformProcessNodeDeleteAction extends AbsCrossPlatformProcessEditorAction {

    private List<Object> objectsToDelete;

    public CrossPlatformProcessNodeDeleteAction(IProcess2 process, ICrossPlatformActionHook actionHook) {
        super(process, actionHook);
    }

    @Override
    public boolean isEnabled(List<Object> objects) {
        objectsToDelete = new ArrayList<>(objects);
        if (objects.isEmpty() || (objects.size() == 1 && objects.get(0) instanceof CrossPlatformProcessPart)) {
            return false;
        }

        if (!(objects.get(0) instanceof ICrossPlatformEditPart)) {
            return false;
        }
        AbstractProcessProvider pProvider = AbstractProcessProvider.findProcessProviderFromPID(IComponent.JOBLET_PID);
        if (pProvider != null) {
            Map<ICrossPlatformJobletContainerPart, List<ICrossPlatformNodePart>> jobletMap = new HashMap<>();
            boolean nodeInJoblet = false;
            boolean allJunitnode = true;
            boolean hasNode = false;
            int i = 0;
            for (Object o : objects) {
                if (o instanceof ICrossPlatformNodePart) {
                    hasNode = true;
                    ICrossPlatformNodePart nodePart = (ICrossPlatformNodePart) o;
                    Node no = (Node) ((ICrossPlatformNodePart) o).getCrossPlatformModel();
                    if (no.getProcess().isReadOnly()) {
                        return false;
                    }
                    if (no.isReadOnly()) {
                        i++;
                    }
                    if (no.getJunitNode() == null) {
                        allJunitnode = false;
                    }
                    if (!pProvider.canDeleteNode(no)) {
                        return false;
                    }

                    boolean isCollapsedNode = false;
                    if (getProcess().getGraphicalNodes().contains(nodePart.getCrossPlatformModel())) {
                        isCollapsedNode = true;
                    }
                    if (!isCollapsedNode && nodePart.getCrossPlatformParentPart() instanceof ICrossPlatformJobletContainerPart) {
                        ICrossPlatformJobletContainerPart jobletContainer = (ICrossPlatformJobletContainerPart) nodePart
                                .getCrossPlatformParentPart();
                        List<ICrossPlatformNodePart> jobletNodeParts = jobletMap.get(jobletContainer);
                        if (jobletNodeParts == null) {
                            jobletNodeParts = new ArrayList<>();
                            jobletMap.put(jobletContainer, jobletNodeParts);
                        }
                        jobletNodeParts.add(nodePart);
                    }
                } else if (o instanceof ICrossPlatformConnectionPart) {
                    Connection conn = (Connection) ((ICrossPlatformConnectionPart) o).getCrossPlatformModel();
                    if (conn.getSource().getProcess().isReadOnly()) {
                        return false;
                    }
                    if (conn.isReadOnly()) {
                        i++;
                    }

                } else if (o instanceof ICrossPlatformConnLabelEditPart) {
                    ConnectionLabel connLabel = (ConnectionLabel) ((ICrossPlatformConnLabelEditPart) o).getCrossPlatformModel();
                    if (connLabel.getConnection().getSource().getProcess().isReadOnly()) {
                        return false;
                    }
                    if (connLabel.getConnection().isReadOnly()) {
                        i++;
                    }
                } else if (o instanceof ICrossPlatformNoteEditPart) {
                    allJunitnode = false;
                    Note note = (Note) ((ICrossPlatformNoteEditPart) o).getCrossPlatformModel();
                    if (note.isReadOnly()) {
                        i++;
                    }
                } else if (o instanceof ICrossPlatformSubjobContainerPart) {
                    SubjobContainer subjob = (SubjobContainer) ((ICrossPlatformSubjobContainerPart) o).getCrossPlatformModel();
                    if (subjob.getProcess().isReadOnly()) {
                        return false;
                    }
                    if (subjob.isReadOnly()) {
                        i++;
                        continue;
                    }
                    boolean isAllReadonly = true;
                    boolean subjobAllJunit = true;
                    for (NodeContainer nc : subjob.getNodeContainers()) {
                        Node node = nc.getNode();
                        if (!node.isReadOnly()) {
                            isAllReadonly = false;
                        }
                        if (node.getJunitNode() == null) {
                            subjobAllJunit = false;
                        }
                    }
                    if (isAllReadonly || subjobAllJunit) {
                        i++;
                    }
                }
            }

            for (ICrossPlatformJobletContainerPart jobletContainer : jobletMap.keySet()) {
                boolean copyJobletNode = true;
                List<ICrossPlatformNodePart> list = jobletMap.get(jobletContainer);
                for (Object obj : jobletContainer.getCrossPlatformChildren()) {
                    if (obj instanceof ICrossPlatformNodePart) {
                        if (!list.contains(obj)) {
                            copyJobletNode = false;
                            break;
                        }

                    }
                }
                if (copyJobletNode) {
                    objectsToDelete.removeAll(list);
                    ICrossPlatformPartFactory factory = jobletContainer.getCrossPlatformRoot().getCrossPlatformPartFactory();
                    CrossPlatformNodePart createEditPart = (CrossPlatformNodePart) factory.createEditPart(jobletContainer,
                            ((NodeContainer) jobletContainer.getCrossPlatformModel()).getNode());
                    createEditPart.setCrossPlatformParentPart(jobletContainer);
                    createEditPart.installEditPolicy(EditPolicy.COMPONENT_ROLE, new CrossPlatformNodeEditPolicy());
                    objectsToDelete.add(createEditPart);
                } else {
                    nodeInJoblet = true;
                }
            }

            if (((nodeInJoblet || allJunitnode) && hasNode) || i == objects.size()) {
                return false;
            }
        }
        return true;
    }

    public static List<Object> filterSameObject(List<Object> list) {
        List<Object> newList = new ArrayList<>();
        for (Object object : list) {
            if (!newList.contains(object)) {
                newList.add(object);
            }
        }

        return newList;

    }

    @Override
    public Command createCommand(List<Object> objs) {
        List<Object> objects = objectsToDelete;
        objects = filterSameObject(objects);
        if (objects.isEmpty()) {
            return null;
        }
        if (!(objects.get(0) instanceof ICrossPlatformEditPart)) {
            return null;
        }

        ICrossPlatformEditPart object = (ICrossPlatformEditPart) objects.get(0);

        // for TUP-1015
        boolean isConnAttachedJLTriggerComp = false;
        ICrossPlatformConnectionPart connectionPart = null;
        if (object instanceof ICrossPlatformConnectionPart) {
            connectionPart = (ICrossPlatformConnectionPart) object;
        } else if (object instanceof ICrossPlatformConnLabelEditPart) {
            connectionPart = (ICrossPlatformConnectionPart) object.getCrossPlatformParentPart();
        }
        if (connectionPart != null) {
            Node srcNode = null;
            Object srcModel = connectionPart.getCrossPlatformSource().getCrossPlatformModel();
            if (srcModel instanceof Node) {
                srcNode = (Node) srcModel;
            }
            Node tarNode = null;
            Object tarModel = connectionPart.getCrossPlatformTarget().getCrossPlatformModel();
            if (tarModel instanceof Node) {
                tarNode = (Node) tarModel;
            }
            if (srcNode == null || tarNode == null) {
                return null;
            }
            IProcess process = srcNode.getProcess();
            if (AbstractProcessProvider.isExtensionProcessForJoblet(process)) {
                IJobletProviderService service = (IJobletProviderService) GlobalServiceRegister.getDefault()
                        .getService(IJobletProviderService.class);
                if (service != null && (service.isTriggerNode(srcNode) || service.isTriggerNode(tarNode))) {
                    isConnAttachedJLTriggerComp = true;
                }
            }
        }
        ICrossPlatformPreferenceStore store = DesignerPlugin.getDefault().getCrossPlatformPreferenceStore();
        String preKey = TalendDesignerPrefConstants.NOT_SHOW_WARNING_WHEN_DELETE_LINK_WITH_JOBLETTRIGGERLINKCOMPONENT;
        boolean notShowWarning = false;
        if (store != null) {
            notShowWarning = store.getBoolean(preKey);
        }
        if (isConnAttachedJLTriggerComp && !notShowWarning) {
            MessageDialogWithToggleBusinessHandler bh = new MessageDialogWithToggleBusinessHandler(ICommonUIHandler.WARNING,
                    Messages.getString("GEFDeleteAction.deleteConnectionDialog.title"),
                    Messages.getString("GEFDeleteAction.deleteConnectionDialog.msg"),
                    new String[] { IDialogConstants.YES_LABEL, IDialogConstants.NO_LABEL }, 0,
                    Messages.getString("GEFDeleteAction.deleteConnectionDialog.toggleMsg"), notShowWarning);
            bh.setPreferenceStore(store);
            bh.setPrefKey(preKey);
            MessageDialogWithToggleBusinessHandler result = ICommonUIHandler.get().openToggle(bh);
            if (!result.getOpenResult().equals(IDialogConstants.YES_ID)) {
                return null;
            }
            if (store != null) {
                store.setValue(preKey, result.getToggleState());
            }
        }

        List nodeParts = new ArrayList();
        List noteParts = new ArrayList();
        List others = new ArrayList(objects);

        for (Object o : objects) {
            if (o instanceof ICrossPlatformNodePart) {
                others.remove(o);
                Node model = (Node) ((ICrossPlatformNodePart) o).getCrossPlatformModel();
                if (model.getJobletNode() != null) {
                    continue;
                }
                if (model.getJunitNode() != null) {
                    continue;
                }

                nodeParts.add(o);
            } else if (o instanceof ICrossPlatformNoteEditPart) {
                noteParts.add(o);
                others.remove(o);
            } else if (o instanceof ICrossPlatformSubjobContainerPart) {
                others.remove(o);
                ICrossPlatformSubjobContainerPart subjob = (ICrossPlatformSubjobContainerPart) o;

                for (Iterator iterator = subjob.getCrossPlatformChildren().iterator(); iterator.hasNext();) {
                    ICrossPlatformNodeContainerPart nodeContainerPart = (ICrossPlatformNodeContainerPart) iterator.next();
                    if (nodeContainerPart instanceof ICrossPlatformJobletContainerPart) {
                        JobletContainer jobletCon = (JobletContainer) ((ICrossPlatformJobletContainerPart) nodeContainerPart)
                                .getCrossPlatformModel();
                        CrossPlatformJobletContainerFigure jobletFigure = (CrossPlatformJobletContainerFigure) ((ICrossPlatformJobletContainerPart) nodeContainerPart)
                                .getCrossPlatformFigure();
                        if (!jobletCon.isCollapsed()) {
                            jobletFigure.doCollapse();
                        }
                    }
                    ICrossPlatformNodePart nodePart = nodeContainerPart.getCrossPlatformNodePart();
                    if (nodePart != null) {
                        Node model = (Node) nodePart.getCrossPlatformModel();
                        if (model.getJunitNode() != null) {
                            continue;
                        }
                        nodeParts.add(nodePart);
                    }
                }
            }
        }

        if (others.size() == 0) { // so notes & nodes only
            CompoundCommand cpdCmd = new CompoundCommand();
            cpdCmd.setLabel(Messages.getString("GEFDeleteAction.DeleteItems")); //$NON-NLS-1$
            if (nodeParts.size() != 0) {
                CrossPlatformGroupRequest deleteReq = new CrossPlatformGroupRequest(RequestConstants.REQ_DELETE);
                deleteReq.setEditParts(nodeParts);

                cpdCmd.add(((ICrossPlatformEditPart) nodeParts.get(0)).getCommand(deleteReq));
            }
            if (noteParts.size() != 0) {
                CrossPlatformGroupRequest deleteReq = new CrossPlatformGroupRequest(RequestConstants.REQ_DELETE);
                deleteReq.setEditParts(noteParts);
                cpdCmd.add(((ICrossPlatformEditPart) noteParts.get(0)).getCommand(deleteReq));
            }

            return cpdCmd;
        } else {
            CrossPlatformGroupRequest deleteReq = new CrossPlatformGroupRequest(RequestConstants.REQ_DELETE);
            deleteReq.setEditParts(objects);

            Command cmd = object.getCommand(deleteReq);
            return cmd;
        }
    }

}
