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
package org.talend.designer.maven.tools;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.apache.maven.model.Build;
import org.apache.maven.model.Model;
import org.apache.maven.model.Plugin;
import org.apache.maven.model.Profile;
import org.talend.designer.maven.model.MergedModel;

public class MergeModelTool {

    public MergedModel mergeModel(Model defaultModel, Model customModel) {
        MergedModel mergedModel = new MergedModel();
        mergedModel.setModel(defaultModel);
        if (customModel == null) {
            return mergedModel;
        }
        // basic info
        mergeBasicInfo(defaultModel, customModel);

        // Properties
        if (customModel.getProperties() != null) {
            Properties defaultProperties = defaultModel.getProperties();
            customModel.getProperties().keySet().stream().filter(key -> defaultProperties.containsKey(key))
                    .forEach(key -> mergedModel.getIllegalProperties().add((String) key));
            defaultProperties.putAll(customModel.getProperties());
        }

        Build build = customModel.getBuild();
        if (build != null) {
            // PluginManagement
            if (build.getPluginManagement() != null) {
                Map<String, Plugin> customPluginsManageMap = build.getPluginManagement().getPluginsAsMap();
                Map<String, Plugin> defaultPluginsManageMap = defaultModel.getBuild().getPluginManagement().getPluginsAsMap();
                customPluginsManageMap.keySet().stream().filter(key -> defaultPluginsManageMap.containsKey(key))
                        .forEach(key -> mergedModel.getIllegalPluginManagement().add(customPluginsManageMap.get(key)));
                if (mergedModel.getIllegalPluginManagement().isEmpty()) {
                    build.getPluginManagement().getPlugins()
                            .forEach(plugin -> defaultModel.getBuild().getPluginManagement().addPlugin(plugin));
                }
            }

            // Plugins
            Map<String, Plugin> customPluginsMap = build.getPluginsAsMap();
            Map<String, Plugin> defaultPluginsMap = defaultModel.getBuild().getPluginsAsMap();
            customPluginsMap.keySet().stream().filter(key -> defaultPluginsMap.containsKey(key))
                    .forEach(key -> mergedModel.getIllegalPlugins().add(customPluginsMap.get(key)));
            if (mergedModel.getIllegalPlugins().isEmpty()) {
                defaultModel.getBuild().getPlugins().addAll(build.getPlugins());
            }
        }
        
        // Profiles
        Map<String, Profile> customProfileMap = customModel.getProfiles().stream()
                .collect(Collectors.toMap(Profile::getId, Function.identity()));
        Map<String, Profile> defaultProfileMap = defaultModel.getProfiles().stream()
                .collect(Collectors.toMap(Profile::getId, Function.identity()));
        customProfileMap.keySet().stream().filter(key -> defaultProfileMap.containsKey(key))
                .forEach(key -> mergedModel.getIllegalProfiles().add(customProfileMap.get(key)));
        if (mergedModel.getIllegalProfiles().isEmpty()) {
            defaultModel.getProfiles().addAll(customModel.getProfiles());
        }

        mergeOtherSetup(defaultModel, customModel);

        if (!mergedModel.getIllegalPluginManagement().isEmpty() || !mergedModel.getIllegalPlugins().isEmpty()
                || !mergedModel.getIllegalProfiles().isEmpty()) {
            mergedModel.setModel(null);
        }

        return mergedModel;
    }

    public Model migrateCustomModel(Model defaultModel, Model customModel) {
        // Properties
        Iterator<Entry<Object, Object>> iterator = customModel.getProperties().entrySet().iterator();
        while (iterator.hasNext()) {
            Entry<Object, Object> entry = iterator.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (defaultModel.getProperties().containsKey(key) && value != null
                    && value.equals(defaultModel.getProperties().get(key))) {
                iterator.remove();
            }
        }

        Build build = customModel.getBuild();
        if (build != null) {
            // PluginManagement
            if (build.getPluginManagement() != null) {
                Map<String, Plugin> defaultPluginsManageMap = defaultModel.getBuild().getPluginManagement().getPluginsAsMap();
                build.getPluginManagement().getPlugins().removeIf(p -> defaultPluginsManageMap.containsKey(p.getKey()));
                if (build.getPluginManagement().getPlugins().isEmpty()) {
                    build.setPluginManagement(null);
                }
            }
            // Plugins
            Map<String, Plugin> defaultPluginsMap = defaultModel.getBuild().getPluginsAsMap();
            customModel.getBuild().getPlugins().removeIf(p -> defaultPluginsMap.containsKey(p.getKey()));
        }

        // Profiles
        Map<String, Profile> defaultProfileMap = defaultModel.getProfiles().stream()
                .collect(Collectors.toMap(Profile::getId, Function.identity()));
        customModel.getProfiles().removeIf(profile -> defaultProfileMap.containsKey(profile.getId()));

        return customModel;
    }

    private void mergeBasicInfo(Model defaultModel, Model customModel) {
        if (customModel.getModelVersion() != null && !customModel.getModelVersion().equals(defaultModel.getModelVersion())) {
            defaultModel.setModelVersion(customModel.getModelVersion());
        }
        if (customModel.getGroupId() != null && !customModel.getGroupId().equals(defaultModel.getGroupId())) {
            defaultModel.setGroupId(customModel.getGroupId());
        }
        if (customModel.getArtifactId() != null && !customModel.getArtifactId().equals(defaultModel.getArtifactId())) {
            defaultModel.setArtifactId(customModel.getArtifactId());
        }
        if (customModel.getVersion() != null && !customModel.getVersion().equals(defaultModel.getVersion())) {
            defaultModel.setVersion(customModel.getVersion());
        }
        if (customModel.getPackaging() != null && !customModel.getPackaging().equals(defaultModel.getPackaging())) {
            defaultModel.setPackaging(customModel.getPackaging());
        }
        if (customModel.getName() != null && !customModel.getName().equals(defaultModel.getName())) {
            defaultModel.setName(customModel.getName());
        }
        if (customModel.getUrl() != null && !customModel.getUrl().equals(defaultModel.getUrl())) {
            defaultModel.setUrl(customModel.getUrl());
        }
    }

    private void mergeOtherSetup(Model defaultModel, Model customModel) {
        // default model doesn't have those setup so can merge directly if exists
        // FIXME add more if needed: https://maven.apache.org/ref/3.8.6/maven-model/maven.html

        // DependencyManagement
        if (customModel.getDependencyManagement() != null) {
            defaultModel.setDependencyManagement(customModel.getDependencyManagement());
        }
        // Dependencies
        if (!customModel.getDependencies().isEmpty()) {
            defaultModel.setDependencies(customModel.getDependencies());
        }
        // Repositories
        if (!customModel.getRepositories().isEmpty()) {
            defaultModel.setRepositories(customModel.getRepositories());
        }
        // PluginRepositories
        if (!customModel.getPluginRepositories().isEmpty()) {
            defaultModel.setPluginRepositories(customModel.getPluginRepositories());
        }
        // DistributionManagement
        if (customModel.getDistributionManagement() != null) {
            defaultModel.setDistributionManagement(customModel.getDistributionManagement());
        }
        // SCM
        if (customModel.getScm() != null) {
            defaultModel.setScm(customModel.getScm());
        }
    }

}
