/**
 * Copyright (C) 2006-2021 Talaxie Inc. - www.deilink.fr
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.talend.sdk.component.studio.model.action;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.talend.commons.CommonsPlugin;
import org.talend.commons.runtime.service.ITaCoKitService;
import org.talend.commons.utils.PasswordEncryptUtil;
import org.talend.core.GlobalServiceRegister;
import org.talend.core.ILibraryManagerService;
import org.talend.core.model.context.ContextUtils;
import org.talend.core.model.metadata.builder.connection.Connection;
import org.talend.core.model.process.IContext;
import org.talend.core.model.process.IContextManager;
import org.talend.core.model.process.IContextParameter;
import org.talend.core.model.properties.ContextItem;
import org.talend.core.service.IMetadataManagmentUiService;
import org.talend.core.service.ITCKUIService;
import org.talend.core.utils.TalendQuoteUtils;
import org.talend.designer.core.model.utils.emf.talendfile.ContextType;
import org.talend.metadata.managment.ui.utils.ConnectionContextHelper;
import org.talend.sdk.component.studio.Lookups;
import org.talend.sdk.component.studio.lang.Pair;
import org.talend.sdk.component.studio.model.parameter.TableActionParameter;
import org.talend.sdk.component.studio.model.parameter.ValueConverter;
import org.talend.sdk.component.studio.websocket.WebSocketClient.V1Action;
import org.talend.utils.security.StudioEncryption;


public class Action<T> {

    private final static Logger LOGGER = LoggerFactory.getLogger(Action.class.getName());
    
    private static boolean isCommandline = CommonsPlugin.isHeadless();

    public static final String STATUS = "status";

    public static final String OK = "OK";

    public static final String KO = "KO";

    public static final String MESSAGE = "comment";

    private V1Action actionClient;

    private final String actionName;

    private final String family;

    private final String type;

    /**
     * Action parameters map. Key is an ElementParameter path. Value is a list of action parameters associated with the ElementParameter
     */
    private final Map<String, List<IActionParameter>> parameters = new HashMap<>();

    private IContextManager contextManager;

    private IContext context;

    private Connection connection;

    public Action(final String actionName, final String family, final Type type) {
        this.actionName = actionName;
        this.family = family;
        this.type = type.toString();
    }

    public Action(final String actionName, final String family, final Type type, IContext context) {
        this.actionName = actionName;
        this.family = family;
        this.type = type.toString();
        this.context = context;
    }

    public Action(final String actionName, final String family, final Type type, Connection connection) {
        this.actionName = actionName;
        this.family = family;
        this.type = type.toString();
        this.connection = connection;
    }

    /**
     * Adds specified {@code parameter} to this Action.
     * ActionParameter passed should be unique action parameter.
     *
     * @param parameter ActionParameter to be added
     */
    public void addParameter(final IActionParameter parameter) {
        Objects.requireNonNull(parameter, "parameter should not be null");
        final String elementParameter = parameter.getName();
        List<IActionParameter> list = parameters.computeIfAbsent(elementParameter, k -> new ArrayList<>());

        if (list.contains(parameter)) {
            throw new IllegalArgumentException("action already contains parameter " + parameter);
        }
        list.add(parameter);
    }

    public void setRowNumber(int rowNumber) {
        parameters.values().stream().flatMap(List::stream).forEach(param -> {
            if (param instanceof TableActionParameter) {
                ((TableActionParameter) param).setRowNumber(rowNumber);
            }
        });
    }

    public boolean isMissingRequired() {
        Iterator iter = parameters.values().iterator();
        while (iter.hasNext()) {
            Object obj = iter.next();
            if (obj != null && obj instanceof List) {
                List<IActionParameter> actionsList = (List<IActionParameter>) obj;
                for (IActionParameter action : actionsList) {
                    if (action instanceof TableActionParameter && ((TableActionParameter) action).isMissingRequired()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @SuppressWarnings("unchecked")
    public Map<String, T> callback() {
        Map<String, String> payLoad = payload();
        if (ITCKUIService.get().getTCKJDBCType().getLabel().equals(getFamily())) {
            retrieveDrivers(payLoad);
        }
        return actionClient().execute(Map.class, family, type, actionName, payLoad);
    }

    protected void retrieveDrivers(Map<String, String> payLoad) {
        List<String> neededList = new ArrayList<String>();
        for (String key : payLoad.keySet()) {
            if (key.matches("\\S*.jdbcDriver\\[\\d\\].path")) {
                neededList.add(TalendQuoteUtils.removeQuotesIfExist(payLoad.get(key)));
            } else if (key.matches("driverJars\\[\\d\\].path")) {
                String values = payLoad.get(key);
                List<Map<String, Object>> driverList = new ArrayList<Map<String, Object>>();
                ITaCoKitService service = ITaCoKitService.getInstance();
                if (service != null) {
                    driverList = service.convertToTable(values);
                }
                for (Map<String, Object> map : driverList) {
                    for (String k : map.keySet()) {
                        if (k.matches("\\S*.jdbcDriver\\[\\].path")) {
                            neededList.add(TalendQuoteUtils.removeQuotesIfExist(map.get(k).toString()));
                        }
                    }
                }
            }           
        }
        ILibraryManagerService librairesManagerService = (ILibraryManagerService) GlobalServiceRegister.getDefault()
                .getService(ILibraryManagerService.class);
        if (librairesManagerService != null && neededList.size() > 0) {
            librairesManagerService.retrieve(neededList, null, new NullProgressMonitor());
        }
    }

    protected final String getActionName() {
        return this.actionName;
    }

    protected final String getFamily() {
        return this.family;
    }

    protected final String getType() {
        return this.type;
    }

    protected final Map<String, String> payload() {
        final Map<String, String> payload = new HashMap<>();       
        selectContext();
        Set<Entry<String, List<IActionParameter>>> entrySet = parameters.entrySet();
        for (Entry<String, List<IActionParameter>> entry : entrySet) {
            List<IActionParameter> listValues = entry.getValue();
            for (IActionParameter actPrameter : listValues) {
                Collection<Pair<String, String>> parameters2 = actPrameter.parameters();
                for (Pair<String, String> pair : parameters2) {
                    String first = pair.getFirst();
                    String second = pair.getSecond();
                    String value = second;
                    IContextParameter contextParameter = null;
                    if (context != null) {
                        contextParameter = context.getContextParameter(second.replace("context.", ""));
                    }

                    boolean isContextValue = false;
                    if (contextParameter != null) {
                        value = contextParameter.getValue();
                        isContextValue = true;
                        if (PasswordEncryptUtil.isPasswordType(contextParameter.getType())) {
                            if (StudioEncryption.hasEncryptionSymbol(value)) {
                                value = StudioEncryption.getStudioEncryption(StudioEncryption.EncryptionKeyName.SYSTEM)
                                        .decrypt(value);
                            }
                        }
                    }

                    if (actPrameter instanceof TableActionParameter && isContextValue) {
                        extractTableActionParameter(payload, first, value);
                        continue;
                    }

                    if (!StringUtils.isBlank(value) && !StringUtils.equals(value, "[]")) {
                        payload.put(first, value.toString());
                    }
                }
            }
        }
        return payload;
    }

    private void extractTableActionParameter(Map<String, String> payload, String keyPath, String value) {
        String[] tableValue = value.split(";");
        int beginIndex = keyPath.indexOf("["), endIndex = keyPath.indexOf("]");
        String regular = keyPath;
        if (beginIndex > 0 && endIndex > 0 && beginIndex < endIndex) {
            regular = regular.substring(0, beginIndex + 1) + "%d" + keyPath.substring(endIndex);
        }
        for (int i = 0; i < tableValue.length; i++) {
            keyPath = regular.replaceFirst("%d", String.valueOf(i));
            value = TalendQuoteUtils.removeQuotesIfExist(tableValue[i]);
            if (!StringUtils.isBlank(value) && !StringUtils.equals(value, "[]")) {
                payload.put(keyPath, value.toString());
            }
        }
    }

    public IContextManager getContextManager() {
        return contextManager;
    }

    public void setContextManager(final IContextManager contextManager) {
        this.contextManager = contextManager;
    }

    private void selectContext() {
        final List<IContext> allContexts = new ArrayList<IContext>();

        if (getContextManager() != null) {
            allContexts.addAll(getContextManager().getListContext());
            context = getContextManager().getDefaultContext();
        }
        if (connection != null && connection.isContextMode()) {
            ContextItem contextItem = ContextUtils.getContextItemById2(connection.getContextId());
            if (contextItem != null) {
                for (Object obj : contextItem.getContext()) {
                    ContextType contextType = (ContextType) obj;
                    IContext jobContext = ContextUtils.convert2IContext(contextType, contextItem.getProperty().getId());
                    allContexts.add(jobContext);
                    if (contextItem.getDefaultContext().equals(jobContext.getName())) {
                        context = jobContext;
                    }
                }
            } else {
                LOGGER.error("Can't load context item id:" + connection.getContextId());
            }
        }

        if (allContexts != null && allContexts.size() > 0
                && GlobalServiceRegister.getDefault().isServiceRegistered(IMetadataManagmentUiService.class)) {
            IMetadataManagmentUiService mmUIService = GlobalServiceRegister.getDefault()
                    .getService(IMetadataManagmentUiService.class);
            if (!isCommandline) {
                Display.getDefault().syncExec(new Runnable() {

                    @Override
                    public void run() {
                        if (PlatformUI.isWorkbenchRunning()) {
                            IContext selectedContext = mmUIService.promptConfirmLauch(Display.getDefault().getActiveShell(),
                                    allContexts, context);
                            if (selectedContext != null) {
                                context = selectedContext;
                            }
                        }
                    }
                });
            }
        }
    }

    public enum Type {
        HEALTHCHECK,
        SUGGESTIONS,
        VALIDATION,
        UPDATE;

        @Override
        public String toString() {
            return super.toString().toLowerCase();
        }
    }

    protected V1Action actionClient() {
        if (actionClient == null) {
            actionClient = Lookups.client().v1().action();
        }
        return actionClient;
    }

}
