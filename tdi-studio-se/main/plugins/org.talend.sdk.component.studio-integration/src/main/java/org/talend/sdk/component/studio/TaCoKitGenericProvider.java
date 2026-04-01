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
package org.talend.sdk.component.studio;

import static java.util.Collections.emptyList;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

import org.eclipse.jface.resource.ImageDescriptor;
import org.talend.commons.CommonsPlugin;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.runtime.service.ITaCoKitService;
import org.talend.components.api.component.ComponentDefinition;
import org.talend.core.CorePlugin;
import org.talend.core.model.components.ComponentCategory;
import org.talend.core.model.components.IComponent;
import org.talend.core.model.components.IComponentsFactory;
import org.talend.core.model.process.IGenericProvider;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.prefs.ITalendCorePrefConstants;
import org.talend.core.runtime.services.IGenericService;
import org.talend.core.service.ITCKUIService;
import org.talend.core.ui.component.ComponentsFactoryProvider;
import org.talend.designer.core.model.components.EmfComponent;
import org.talend.designer.core.model.components.UnifiedJDBCBean;
import org.talend.designer.core.utils.UnifiedComponentUtil;
import org.talend.repository.ProjectManager;
import org.talend.sdk.component.server.front.model.ActionItem;
import org.talend.sdk.component.server.front.model.ActionList;
import org.talend.sdk.component.server.front.model.ComponentDetail;
import org.talend.sdk.component.server.front.model.ComponentIndex;
import org.talend.sdk.component.server.front.model.ConfigTypeNodes;
import org.talend.sdk.component.studio.VirtualComponentModel.VirtualComponentModelType;
import org.talend.sdk.component.studio.lang.Pair;
import org.talend.sdk.component.studio.service.ComponentService;
import org.talend.sdk.component.studio.util.TaCoKitConst;
import org.talend.sdk.component.studio.util.TaCokitImageUtil;
import org.talend.sdk.component.studio.websocket.WebSocketClient;

// note: for now we load the component on the server but
// we can use the mojo generating the meta later
// to avoid to load all components at startup
public class TaCoKitGenericProvider implements IGenericProvider {
    @Override
    public void loadComponentsFromExtensionPoint() {
        if (ProjectManager.getInstance().getCurrentProject() == null || !Lookups.configuration().isActive()) {
            return;
        }
        try {
            ITaCoKitService.getInstance().waitForStart();
        } catch (Throwable t) {
            // don't block if fail
            ExceptionHandler.process(t);
            return;
        }

        final WebSocketClient client = Lookups.client();
        Stream<Pair<ComponentIndex, ComponentDetail>> details = client.v1().component().details(Locale.getDefault().getLanguage());
        final ConfigTypeNodes configTypes = client.v1().configurationType().getRepositoryModel(true);

        final ComponentService service = Lookups.service();
        final IComponentsFactory factory = ComponentsFactoryProvider.getInstance();
        final Set<IComponent> components = factory.getComponentsForInit();
        final Set<String> createdConnectionFamiliySet = new HashSet<String>();
        final Set<String> createdCloseFamiliySet = new HashSet<String>();
        synchronized (components) {
            components.removeIf(component -> {
                if (TaCoKitConst.GUESS_SCHEMA_COMPONENT_NAME.equals(component.getName())) { // this should likely
                    // move...
                    Lookups.taCoKitCache().setTaCoKitGuessSchemaComponent(component);
                }
                return ComponentModel.class.isInstance(component);
            });

            final String reportPath =
                    CorePlugin.getDefault().getPluginPreferences().getString(ITalendCorePrefConstants.IREPORT_PATH);
            final boolean isCatcherAvailable = components.stream()
                    .anyMatch(comp -> comp != null && comp.getName().equals(EmfComponent.TSTATCATCHER_NAME)
                            && ComponentCategory.CATEGORY_4_DI.getName().equals(comp.getPaletteType()));
            boolean isHeadless = CommonsPlugin.isHeadless();
            Map<String, IComponent> jdbcComponentMap = new HashMap<>();
            details.forEach(pair -> {
                ComponentIndex index = pair.getFirst();
                ComponentDetail detail = pair.getSecond();
                ImageDescriptor imageDesc = null;
                try {
                    if (!isHeadless) {
                        imageDesc = service.toEclipseIcon(index.getIcon());
                    }
                } catch (Exception e) {
                    ExceptionHandler.process(e);
                }
                if (imageDesc == null) {
                    imageDesc = ComponentService.DEFAULT_IMAGE;
                }
                ComponentModel componentModel = new ComponentModel(index, detail, configTypes, imageDesc, reportPath, isCatcherAvailable);
                components.add(componentModel);

                boolean isJDBCFamily = ITCKUIService.get().getTCKJDBCType().getLabel().equals(index.getFamilyDisplayName());
                if (isJDBCFamily) {
                    jdbcComponentMap.put(componentModel.getDisplayName(), componentModel);
                }
                if (!createdConnectionFamiliySet.contains(index.getId().getFamily())) {
                    ActionList actionList = Lookups.taCoKitCache().getActionList(index.getId().getFamily());
                    IComponent connectionModel = createConnectionComponent(index, detail, configTypes, reportPath, isCatcherAvailable, createdConnectionFamiliySet, actionList);
                    if (connectionModel != null) {
                        components.add(connectionModel);
                        if (isJDBCFamily) {
                            jdbcComponentMap.put(connectionModel.getDisplayName(), connectionModel);
                        }
                    }
                }

                if (!createdCloseFamiliySet.contains(index.getId().getFamily())) {
                    ActionList actionList = Lookups.taCoKitCache().getActionList(index.getId().getFamily());
                    IComponent closeModel = createCloseConnectionComponent(index, detail, configTypes, reportPath, isCatcherAvailable, createdCloseFamiliySet, actionList);
                    if (closeModel != null) {
                        components.add(closeModel);
                        if (isJDBCFamily) {
                            jdbcComponentMap.put(closeModel.getDisplayName(), closeModel);
                        }
                    }
                }

            });

            // init additional JDBC components
            if (IGenericService.getService() != null) {
                String oldName = ERepositoryObjectType.JDBC.getLabel();
                String newName = ITCKUIService.get().getTCKJDBCType().getLabel();
                Set<ComponentDefinition> compDefinitions = IGenericService.getService().getJDBCComponentDefinitions();
                Map<String, UnifiedJDBCBean> jdbcMap = UnifiedComponentUtil.getAdditionalJDBC();
                for (ComponentDefinition definition : compDefinitions) {
                    for (UnifiedJDBCBean bean : jdbcMap.values()) {
                        if (UnifiedComponentUtil.isUnsupportedComponent(definition.getName(), bean)) {
                            continue;
                        }
                        IComponent component = jdbcComponentMap.get(definition.getName().replace(oldName, newName));
                        if (component == null) {
                            continue;
                        }
                        if (VirtualComponentModel.class.isInstance(component)) {
                            VirtualComponentModel comp = VirtualComponentModel.class.cast(component);
                            ComponentModel additionalComponent = new AdditonalJDBCVirtualComponentModel(comp.getIndex(),
                                    comp.getDetail(), configTypes, comp.getIcon32(), reportPath, isCatcherAvailable,
                                    comp.getModelType(), bean.getComponentKey());
                            components.add(additionalComponent);
                        } else if (ComponentModel.class.isInstance(component)) {
                            ComponentModel comp = ComponentModel.class.cast(component);
                            ComponentModel additionalComponent = new AdditionalJDBCComponentModel(comp.getIndex(),
                                    comp.getDetail(), configTypes, comp.getIcon32(), reportPath, isCatcherAvailable,
                                    bean.getComponentKey());
                            components.add(additionalComponent);
                        }
                    }
                }
            }
        }
    }

    private VirtualComponentModel createCloseConnectionComponent(final ComponentIndex index, final ComponentDetail detail,
            final ConfigTypeNodes configTypeNodes, String reportPath, boolean isCatcherAvailable, Set<String> createdFamiliySet, ActionList actionList) {
        boolean isSupport = false;
        String iconKey = null;
        VirtualComponentModel model = null;
        if (actionList != null && actionList.getItems() != null) {
            for (ActionItem action : actionList.getItems()) {
                if (TaCoKitConst.CLOSE_CONNECTION_ATCION_NAME.equals(action.getType())) {
                    isSupport = true;
                    iconKey = action.getType();
                    break;
                }
            }
        }
        if (isSupport && !createdFamiliySet.contains(index.getId().getFamily())) {
            ImageDescriptor imageDesc = null;

            try {
                imageDesc = TaCokitImageUtil.getImage(detail.getId().getFamilyId(), iconKey);
            } catch (Exception e) {
                try {
                    imageDesc = TaCokitImageUtil.getConnectionImage(detail.getId().getFamilyId());
                } catch (Exception ex) {
                    ExceptionHandler.process(e);
                }
            }

            if (imageDesc == null) {
                imageDesc = ComponentService.DEFAULT_IMAGE;
            }
            model = new VirtualComponentModel(index, detail, configTypeNodes, imageDesc, reportPath, isCatcherAvailable,
                    VirtualComponentModelType.CLOSE);
            Lookups.taCoKitCache().registeVirtualComponent(model);
            createdFamiliySet.add(index.getId().getFamily());
        }

        return model;
    }

    private VirtualComponentModel createConnectionComponent(final ComponentIndex index, final ComponentDetail detail,
            final ConfigTypeNodes configTypeNodes, String reportPath, boolean isCatcherAvailable, Set<String> createdFamiliySet, ActionList actionList) {
        boolean isSupport = false;
        String iconKey = null;
        VirtualComponentModel model = null;
        if (actionList != null && actionList.getItems() != null) {
            for (ActionItem action : actionList.getItems()) {
                if (TaCoKitConst.CREATE_CONNECTION_ATCION_NAME.equals(action.getType())) {
                    isSupport = true;
                    iconKey = action.getType();
                    break;
                }
            }
        }
        if (isSupport && !createdFamiliySet.contains(index.getId().getFamily())) {
            ImageDescriptor imageDesc = null;

            try {
                imageDesc = TaCokitImageUtil.getImage(detail.getId().getFamilyId(), iconKey);
            } catch (Exception e) {
                try {
                    imageDesc = TaCokitImageUtil.getConnectionImage(detail.getId().getFamilyId());
                } catch (Exception ex) {
                    ExceptionHandler.process(e);
                }
            }

            if (imageDesc == null) {
                imageDesc = ComponentService.DEFAULT_IMAGE;
            }
            model = new VirtualComponentModel(index, detail, configTypeNodes, imageDesc, reportPath, isCatcherAvailable,
                    VirtualComponentModelType.CONNECTION);
            Lookups.taCoKitCache().registeVirtualComponent(model);
            createdFamiliySet.add(index.getId().getFamily());
        }
        return model;
    }

    @Override // unused
    public List<?> addPaletteEntry() {
        return emptyList();
    }

}
