// ============================================================================
//
// Copyright (C) 2006-2022 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.core.runtime.util;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Properties;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.EList;
import org.talend.commons.CommonsPlugin;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.utils.generation.JavaUtils;
import org.talend.core.model.general.Project;
import org.talend.core.model.process.EParameterFieldType;
import org.talend.core.model.process.IProcess;
import org.talend.core.model.process.JobInfo;
import org.talend.core.model.properties.JobletProcessItem;
import org.talend.core.model.properties.ProcessItem;
import org.talend.core.model.properties.Property;
import org.talend.core.runtime.CoreRuntimePlugin;
import org.talend.core.runtime.projectsetting.ProjectPreferenceManager;
import org.talend.designer.core.model.utils.emf.talendfile.ElementParameterType;
import org.talend.designer.core.model.utils.emf.talendfile.NodeType;
import org.talend.designer.runprocess.IProcessor;
import org.talend.repository.ProjectManager;

public class ModuleAccessHelper {

    private static final String FORMAT_ADD_OPPENS = "--add-opens=@=ALL-UNNAMED"; //$NON-NLS-1$

    private static final String CLASS_PREVIEW_PROCESS = "org.talend.designer.component.preview.shadow.PreviewComponentDataProcess"; //$NON-NLS-1$

    private static final String CLASS_GUESS_SCHEMA_PROCESS = "org.talend.designer.core.ui.editor.properties.controllers.AbstractGuessSchemaProcess"; //$NON-NLS-1$

    private static Properties PROPS;

    public static Properties getProperties() {
        if (PROPS == null) {
            PROPS = new Properties();
            try (InputStream input = getConfigFileURL().openStream()) {
                PROPS.load(input);
            } catch (IOException e) {
                ExceptionHandler.process(e);
            }

            Optional.ofNullable(System.getProperty("internal.custom.modules")).filter(StringUtils::isNotBlank)
                    .ifPresent(modules -> put("GLOBAL", modules));

            List<Project> allProjects = new ArrayList<>();
            allProjects.add(ProjectManager.getInstance().getCurrentProject());
            allProjects.addAll(ProjectManager.getInstance().getAllReferencedProjects(true));
            for (Project ref : allProjects) {
                ProjectPreferenceManager prefManager = new ProjectPreferenceManager(ref, CoreRuntimePlugin.PLUGIN_ID, false);
                String settings = prefManager.getValue(JavaUtils.CUSTOM_ACCESS_SETTINGS);
                if (StringUtils.isNotBlank(settings)) {
                    Properties customProps = new Properties();
                    try {
                        customProps.load(new ByteArrayInputStream(settings.getBytes()));
                        customProps.entrySet().stream().filter(en -> StringUtils.isNotBlank((String) en.getValue()))
                                .forEach(en -> put((String) en.getKey(), (String) en.getValue()));

                    } catch (IOException e) {
                        ExceptionHandler.process(e);
                    }
                }
            }
        }
        return PROPS;
    }

    private static void put(String key, String value) {
        PROPS.put(key, PROPS.containsKey(key) ? PROPS.getProperty(key) + "," + value : value);
    }

    public static URL getConfigFileURL() {
        return Platform.getBundle(CoreRuntimePlugin.PLUGIN_ID).getEntry("resources/module_access.properties"); //$NON-NLS-1$
    }

    private static boolean containsKey(String key) {
        return getProperties().containsKey(key);
    }

    private static Set<String> getModules(String key) {
        String modules = getProperties().getProperty(key);
        if (modules != null) {
            return Stream.of(modules.split(",")).map(module -> FORMAT_ADD_OPPENS.replace("@", module.trim())) //$NON-NLS-1$ //$NON-NLS-2$
                    .collect(Collectors.toSet());
        }
        return Collections.emptySet();
    }

    public static boolean allowJavaInternalAcess(Property property) {
        String allow = System.getProperty(JavaUtils.ALLOW_JAVA_INTERNAL_ACCESS);
        if (allow != null) {
            return Boolean.valueOf(allow);
        }
        if (CommonsPlugin.isTUJTest() || CommonsPlugin.isJUnitTest() || CommonsPlugin.isJunitWorking()) {
            return true;
        }
        Project project;
        if (property != null) {
            project = ProjectManager.getInstance()
                    .getProjectFromProjectTechLabel(ProjectManager.getInstance().getProject(property).getTechnicalLabel());
        } else {
            project = ProjectManager.getInstance().getCurrentProject();
        }
        ProjectPreferenceManager preferenceManager = new ProjectPreferenceManager(project, CoreRuntimePlugin.PLUGIN_ID, false);
        return preferenceManager.getBoolean(JavaUtils.ALLOW_JAVA_INTERNAL_ACCESS);
    }

    public static Set<String> getModuleAccessVMArgsForProcessor(IProcessor processor) {
        Property property = processor.getProperty();
        if (property == null) {
            return Collections.emptySet();
        }
        if (!allowJavaInternalAcess(property)) {
            return Collections.emptySet();
        }
        if (isPreviewProcess(processor)) {
            // add all for preview process
            return getProperties().entrySet().stream().filter(en -> StringUtils.isNotBlank((String) en.getValue()))
                    .flatMap(en -> getModules((String) en.getKey()).stream()).collect(Collectors.toSet());

        }
        ProcessItem mainJobItem = (ProcessItem) property.getItem();
        Set<JobInfo> allJobInfos = new HashSet<>();
        allJobInfos.add(new JobInfo(mainJobItem, mainJobItem.getProcess().getDefaultContext()));
        allJobInfos.addAll(processor.getBuildChildrenJobsAndJoblets());
        return getModuleAccessVMArgs(property, allJobInfos);
    }

    @SuppressWarnings("unchecked")
    public static Set<String> getModuleAccessVMArgs(Property property, Set<JobInfo> allJobInfos) {
        if (property == null || property.getItem() == null || !allowJavaInternalAcess(property)) {
            return Collections.emptySet();
        }
        Set<String> vmArgs = new HashSet<>();
        boolean hasTck = false;
        for (JobInfo info : allJobInfos) {
            EList<NodeType> nodes = null;
            EList<ElementParameterType> parameters = null;
            if (info.getJobletProperty() != null) {
                JobletProcessItem item = (JobletProcessItem) info.getJobletProperty().getItem();
                if (item.getJobletProcess() != null) {
                    nodes = item.getJobletProcess().getNode();
                    if (item.getJobletProcess().getParameters() != null) {
                        parameters = item.getJobletProcess().getParameters().getElementParameter();
                    }
                }
            } else if (info.getProcessItem() != null && info.getProcessItem().getProcess() != null) {
                nodes = info.getProcessItem().getProcess().getNode();
                if (info.getProcessItem().getProcess().getParameters() != null) {
                    parameters = info.getProcessItem().getProcess().getParameters().getElementParameter();
                }
            }
            if (nodes != null) {
                nodes.stream().filter(node -> containsKey(node.getComponentName()))
                        .forEach(node -> vmArgs.addAll(getModules(node.getComponentName())));
            }
            if (parameters != null) {
                // FIXME currently it depends on spark version, refine the condition if needed
                Optional<ElementParameterType> optional = parameters.stream()
                        .filter(p -> "SUPPORTED_SPARK_VERSION".equals(p.getName()) && containsKey(p.getValue())).findFirst();
                if (optional.isPresent()) {
                    vmArgs.addAll(getModules(optional.get().getValue()));
                }
            }
            if (!hasTck) {
                hasTck = nodes.stream()
                        .anyMatch(node -> node.getElementParameter().stream()
                                .anyMatch(p -> ((ElementParameterType) p).getField() != null
                                        && EParameterFieldType.TECHNICAL.getName().equals(((ElementParameterType) p).getField())
                                        && ((ElementParameterType) p).getName().equals("TACOKIT_COMPONENT_ID")));
                if (!hasTck) {
                    hasTck = hasExtraSettings(parameters);
                }
            }
        }
        if (hasTck) {
            vmArgs.addAll(getModules("TCK_COMMON_ARGS"));
        }

        if (getProperties().containsKey("GLOBAL")) {
            vmArgs.addAll(getModules("GLOBAL"));
        }

        return vmArgs;
    }

    private static boolean hasExtraSettings(EList<ElementParameterType> parameters) {
        if (parameters == null) {
            return false;
        }
        Map<String, String> paramMap = parameters.stream().filter(p -> p.getName() != null && p.getValue() != null)
                .collect(Collectors.toMap(ElementParameterType::getName, ElementParameterType::getValue, (a1, a2) -> a1));
        // Implicit context
        if (Boolean.valueOf(paramMap.getOrDefault("IMPLICIT_TCONTEXTLOAD", "false"))
                && Boolean.valueOf(paramMap.getOrDefault("FROM_DATABASE_FLAG_IMPLICIT_CONTEXT", "false"))
                && "JDBCInput".equals(paramMap.get("DB_TYPE_IMPLICIT_CONTEXT"))) {
            return true;
        }
        // Stats&Logs
        if ((Boolean.valueOf(paramMap.getOrDefault("ON_STATCATCHER_FLAG", "false"))
                || Boolean.valueOf(paramMap.getOrDefault("ON_LOGCATCHER_FLAG", "false"))
                || Boolean.valueOf(paramMap.getOrDefault("ON_METERCATCHER_FLAG", "false")))
                && Boolean.valueOf(paramMap.getOrDefault("ON_DATABASE_FLAG", "false"))
                && "JDBCOutput".equals(paramMap.get("DB_TYPE"))) {
            return true;
        }
        return false;
    }

    public static void reset() {
        PROPS = null;
    }

    private static boolean isPreviewProcess(IProcessor processor) {
        IProcess process = processor.getProcess();
        if (process == null) {
            return false;
        }
        Property property = processor.getProperty();
        if ("ID".equals(property.getId()) && "Mock_job_for_Guess_schema".equals(property.getLabel())) {
            return true;
        }
        Class<?> clazz = process.getClass();
        // preview process
        if (CLASS_PREVIEW_PROCESS.equals(clazz.getName()) || CLASS_PREVIEW_PROCESS.equals(clazz.getSuperclass().getName())) {
            return true;
        }
        // guess schema process
        if (CLASS_GUESS_SCHEMA_PROCESS.equals(clazz.getSuperclass().getName())) {
            return true;
        }
        return false;
    }

}
