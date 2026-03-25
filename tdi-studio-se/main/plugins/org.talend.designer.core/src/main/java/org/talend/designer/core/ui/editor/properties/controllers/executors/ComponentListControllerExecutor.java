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
package org.talend.designer.core.ui.editor.properties.controllers.executors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.gef.commands.Command;
import org.talend.commons.ui.runtime.custom.ICommonUIHandler;
import org.talend.commons.ui.runtime.custom.UIHandlerFactories;
import org.talend.core.GlobalServiceRegister;
import org.talend.core.PluginChecker;
import org.talend.core.model.process.EParameterFieldType;
import org.talend.core.model.process.IConnection;
import org.talend.core.model.process.IElement;
import org.talend.core.model.process.IElementParameter;
import org.talend.core.model.process.INode;
import org.talend.core.model.process.IProcess2;
import org.talend.core.model.utils.TalendPropertiesUtil;
import org.talend.core.runtime.services.IGenericService;
import org.talend.core.ui.IJobletProviderService;
import org.talend.core.ui.process.IGraphicalNode;
import org.talend.designer.core.model.process.statsandlogs.StatsAndLogsManager;
import org.talend.designer.core.ui.editor.cmd.PropertyChangeCommand;
import org.talend.designer.core.ui.editor.nodes.Node;
import org.talend.designer.core.ui.editor.properties.controllers.ui.IComponentListControllerUI;
import org.talend.designer.core.ui.editor.properties.controllers.ui.IWidgetContext;
import org.talend.designer.core.utils.DesignerUtilities;

/**
 * DOC cmeng  class global comment. Detailled comment
 */
public class ComponentListControllerExecutor extends BusinessControllerExecutor implements IComponentListControllerExecutor {

    @Override
    protected IComponentListControllerUI getUi() {
        return (IComponentListControllerUI) super.getUi();
    }

    @Override
    public boolean execute(Map<String, Object> params) {
        IWidgetContext widgetCtx = getUi().getDefaultControlContext();
        params.forEach((k, v) -> {
            widgetCtx.setData(k, v);
        });
        Command cmd = createCommand(widgetCtx);
        if (cmd != null && cmd.canExecute()) {
            getUi().executeCommand(cmd);
            return true;
        }
        return false;
    }

    public Command createCommand(IWidgetContext widget) {
        IElement elem = getElem();
        String name = getParameterName(getCurParameter());
        if (!elem.getPropertyValue(name).equals(widget.getText())) {

            String value = new String(""); //$NON-NLS-1$
            List<? extends IElementParameter> elementParametersWithChildrens = elem.getElementParametersWithChildrens();
            Object selected = widget.getData("selected");
            for (int i = 0; i < elementParametersWithChildrens.size(); i++) {
                IElementParameter param = elementParametersWithChildrens.get(i);
                if (getParameterName(param).equals(name)) {
                    for (int j = 0; j < param.getListItemsValue().length; j++) {
                        if (selected != null) {
                            if (selected.equals(param.getListItemsValue()[j])) {
                                value = (String) param.getListItemsValue()[j];
                            }
                        } else if (widget.getText().equals(param.getListItemsDisplayName()[j])) {
                            value = (String) param.getListItemsValue()[j];
                        }
                    }
                }
            }
            return new PropertyChangeCommand(elem, name, value);
        }
        return null;
    }

    @Override
    public Object getData(Map<String, Object> params) {
        if (Boolean.valueOf(params.get("refresh").toString())) {
            IElement elem = getElem();
            IElementParameter param = (IElementParameter) params.get("paramId");
            doUpdateComponentList(elem, param);

            String[] curComponentNameList = param.getListItemsDisplayName();
            String[] curComponentValueList = (String[]) param.getListItemsValue();

            Object value = param.getValue();
            int numValue = -1;
            for (int i = 0; i < curComponentValueList.length; i++) {
                if (curComponentValueList[i].equals(value)) {
                    numValue = i;
                    break;
                }
            }
            LinkedHashMap<String, String> list = new LinkedHashMap<>();
            for (int i = 0; i < curComponentNameList.length; i++) {
                list.put(curComponentNameList[i], curComponentValueList[i]);
            }
            Map<String, Object> retValue = new HashMap<>();
//            retValue.put("list", list);
            if (param.isContextMode()) {
                String paramValue = (String) value;
                if (elem instanceof INode) {
                    INode currentNode = (INode) elem;
                    String completeValue = getDisplayUniqueName(currentNode, paramValue);
                    if (StringUtils.isNotBlank(completeValue)
                            || StringUtils.isBlank(completeValue) && DesignerUtilities.validateJobletShortName(paramValue)) {
                        paramValue = completeValue;
                    }
                }
                retValue.put("contextMode", true);
                retValue.put("enable", false);
                retValue.put("selected", paramValue);
            } else {
                retValue.put("list", list);
                if (numValue == -1) {
                    if (isSelectDefaultItem() && curComponentNameList.length > 0) {
                        elem.setPropertyValue(getParameterName(param), curComponentValueList[0]);
                        retValue.put("selected", curComponentNameList[0]);
                    }
                } else {
                    retValue.put("selected", curComponentNameList[numValue]);
                }
            }
            return retValue;
        }
        return null;
    }

    public static void renameComponentUniqueName(String oldConnectionName, String newConnectionName, List<Node> nodesToUpdate) {
        for (Node curNode : nodesToUpdate) {
            for (IElementParameter curParam : curNode.getElementParameters()) {
                if (curParam.getFieldType().equals(EParameterFieldType.COMPONENT_LIST)) {
                    String value = (String) curParam.getValue();
                    if (oldConnectionName.equals(curParam.getValue())) {
                        curParam.setValue(newConnectionName);
                    } else if (value != null && value.startsWith(oldConnectionName + "_")) {
                        curParam.setValue(value.replaceFirst(oldConnectionName + "_", newConnectionName + "_"));
                    }
                } else if (curParam.getFieldType().equals(EParameterFieldType.COMPONENT_REFERENCE)) {
                    String value = (String) curParam.getValue();
                    if (oldConnectionName.equals(value)) {
                        curParam.setValue(newConnectionName);
                    } else if (value != null && value.startsWith(oldConnectionName + "_")) {
                        curParam.setValue(value.replaceFirst(oldConnectionName + "_", newConnectionName + "_"));
                    }
                    if (GlobalServiceRegister.getDefault().isServiceRegistered(IGenericService.class)) {
                        IGenericService genericService = (IGenericService) GlobalServiceRegister.getDefault()
                                .getService(IGenericService.class);
                        if (genericService != null) {
                            genericService.resetReferenceValue(curNode, oldConnectionName, newConnectionName);
                        }
                    }
                } else if (curParam.getFieldType().equals(EParameterFieldType.TABLE)) {
                    final Object[] itemsValue = curParam.getListItemsValue();
                    for (Object element : itemsValue) {
                        if (element instanceof IElementParameter) {
                            IElementParameter param = (IElementParameter) element;
                            if (param.getFieldType().equals(EParameterFieldType.COMPONENT_LIST)) {
                                List<Map<String, Object>> tableValues = (List<Map<String, Object>>) curParam.getValue();
                                for (Map<String, Object> curLine : tableValues) {
                                    Object value = curLine.get(param.getName());
                                    if (value instanceof Integer) {
                                        String connectionName = (String) param.getListItemsValue()[(Integer) value];
                                        if (connectionName.equals(oldConnectionName)) {
                                            // note: change from "Integer" value stored to "String" value
                                            curLine.put(param.getName(), newConnectionName);
                                        } else if (connectionName != null && connectionName.startsWith(oldConnectionName + "_")) {
                                            curParam.setValue(connectionName.replaceFirst(oldConnectionName + "_",
                                                    newConnectionName + "_"));
                                        }
                                    } else if (value instanceof String) {
                                        curLine.put(param.getName(), newConnectionName);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

    }

    public static void updateComponentList(IElement elem, IElementParameter param) {
        if (elem instanceof INode) {
            final INode currentNode = (INode) elem;

            final List<INode> nodeList;
            IJobletProviderService jobletService = getJobletProviderService(param);
            if (jobletService != null) {
                nodeList = jobletService.getConnNodesForInputTrigger(currentNode, param);
            } else {
                List<? extends INode> list = null;
                if (PluginChecker.isJobLetPluginLoaded()) {
                    IJobletProviderService jobletProviderService = (IJobletProviderService) GlobalServiceRegister.getDefault()
                            .getService(IJobletProviderService.class);
                    INode jobletNode = currentNode.getJobletNode();
                    if (jobletNode != null && jobletProviderService.isJobletComponent(jobletNode)) {
                        List<? extends INode> jobletNodes = jobletProviderService.getGraphNodesForJoblet(jobletNode);
                        for (INode node : jobletNodes) {
                            if (node != null && node.getUniqueName() != null
                                    && node.getUniqueName().equals(currentNode.getUniqueName())) {
                                list = node.getProcess().getNodesOfType(param.getFilter());
                                break;
                            }
                        }
                    }
                }
                if (list == null) {
                    list = currentNode.getProcess().getNodesOfType(param.getFilter());
                }
                nodeList = new ArrayList<INode>();
                if (list != null) {
                    for (INode datanode : list) {
                        // it's possible to filter the virtual components from this list
                        if (!datanode.isVirtualGenerateNode() && datanode.getUniqueName() != null
                                && !datanode.getUniqueName().equals(StatsAndLogsManager.CONNECTION_UID)) {
                            nodeList.add(datanode);
                        }
                    }
                }
            }
            updateComponentList(nodeList, currentNode, param, true);
        }
    }

    protected static void updateComponentList(Collection<INode> nodeList, INode currentNode, IElementParameter param,
            boolean isSelectDefaultItem) {
        final Collection<String> componentDisplayNames = new ArrayList<String>();
        final Collection<String> componentUniqueNames = new ArrayList<String>();
        for (INode node : nodeList) {
            if (node.getJobletNode() != null) {
                node = node.getJobletNode();
            }
            String uniqueName = node.getUniqueName();
            if (uniqueName.equals(currentNode.getUniqueName())) {
                continue;
            }
            String displayName = (String) node.getElementParameter("LABEL").getValue(); //$NON-NLS-1$
            String displayUniqueName = getDisplayUniqueName(node, uniqueName);
            if (displayName == null) {
                displayName = displayUniqueName;
            }
            if (displayName.indexOf("__UNIQUE_NAME__") != -1) { //$NON-NLS-1$
                displayName = displayName.replaceAll("__UNIQUE_NAME__", displayUniqueName); //$NON-NLS-1$
            }
            if (!uniqueName.equals(displayUniqueName) && displayName.indexOf(uniqueName) != -1) {
                displayName = displayName.replaceAll(uniqueName, displayUniqueName);
            }
            if (!displayName.equals(displayUniqueName)) {
                displayName = displayUniqueName + " - " + displayName; //$NON-NLS-1$
            }
            componentUniqueNames.add(uniqueName);
            componentDisplayNames.add(displayName);
        }

        param.setListItemsDisplayName(componentDisplayNames.toArray(new String[0]));
        final String[] componentValueList = componentUniqueNames.toArray(new String[0]);
        param.setListItemsValue(componentValueList);

        Object value = param.getValue();
        if (!componentUniqueNames.contains(value) && isSelectDefaultItem) {
            String newValue = null;
            if (!param.isDynamicSettings()) {
                if (!componentUniqueNames.isEmpty()) {
                    if (value == null || value.equals("")) { //$NON-NLS-1$
                        currentNode.setPropertyValue(getParameterName(param), componentValueList[0]);
                        if (currentNode instanceof IGraphicalNode) {
                            IGraphicalNode node = (IGraphicalNode) currentNode;
                            node.checkAndRefreshNode();
                            ((IProcess2) node.getProcess()).setProcessModified(true);
                        } else if (currentNode instanceof IConnection) {
                            ((IProcess2) ((IConnection) currentNode).getSource().getProcess()).setProcessModified(true);
                        }
                    } else {
                        newValue = componentValueList[0];

                    }
                } else { // removed the old value.
                    newValue = "";//$NON-NLS-1$
                }
            }

            if (!("".equals(newValue)) && newValue != null) { //$NON-NLS-1$
                ICommonUIHandler ui = UIHandlerFactories.inst().getUIHandler(ICommonUIHandler.class);
                ui.execute(new PropertyChangeCommand(currentNode, getParameterName(param), ""));
            }
        }
    }

    public static String getDisplayUniqueName(INode node, String uniqueName) {
        if (TalendPropertiesUtil.isEnabledUseShortJobletName()) {
            return DesignerUtilities.getNodeInJobletCompleteUniqueName(node, uniqueName);
        }
        return uniqueName;
    }

    public void doUpdateComponentList(IElement elem, IElementParameter param) {
        updateComponentList(elem, param);
    }

    public boolean isSelectDefaultItem() {
        return false;
    }

    private static IJobletProviderService getJobletProviderService(IElementParameter param) {
        if (PluginChecker.isJobLetPluginLoaded()) {
            IJobletProviderService jobletService = (IJobletProviderService) GlobalServiceRegister.getDefault()
                    .getService(IJobletProviderService.class);
            if (param != null && param.getElement() instanceof INode
                    && jobletService.isJobletComponent((INode) param.getElement()) && param.getParentParameter() != null) {
                return jobletService;
            }
        }
        return null;
    }

    public static String getParameterName(IElementParameter param) {
        IJobletProviderService service = getJobletProviderService(param);
        if (service != null) { // is joblet node
            return param.getParentParameter().getName() + ":" + param.getName(); //$NON-NLS-1$
        } else {
            return param.getName();
        }
    }
}
