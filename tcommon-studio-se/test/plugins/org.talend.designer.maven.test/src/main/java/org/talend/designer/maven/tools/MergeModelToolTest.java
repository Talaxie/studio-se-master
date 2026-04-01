// ============================================================================
//
// Copyright (C) 2006-2023 Talend Inc. - www.talend.com
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

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.apache.maven.model.Build;
import org.apache.maven.model.Dependency;
import org.apache.maven.model.DependencyManagement;
import org.apache.maven.model.DistributionManagement;
import org.apache.maven.model.Model;
import org.apache.maven.model.Plugin;
import org.apache.maven.model.PluginManagement;
import org.apache.maven.model.Profile;
import org.apache.maven.model.Repository;
import org.junit.Before;
import org.junit.Test;
import org.talend.designer.maven.model.MergedModel;
import org.talend.designer.maven.template.MavenTemplateManager;
import org.talend.repository.ProjectManager;

public class MergeModelToolTest {

    private Model defaultModel;

    private Map<String, Object> parameters;

    private MergeModelTool mergeTool;

    @Before
    public void setUp() throws Exception {
        mergeTool = new MergeModelTool();
        parameters = new HashMap<String, Object>();
        parameters.put(MavenTemplateManager.KEY_PROJECT_NAME,
                ProjectManager.getInstance().getCurrentProject().getTechnicalLabel());
        defaultModel = MavenTemplateManager.getDefaultProjectModel(parameters);
    }

    @Test
    public void testMergeModelWithWarning() throws Exception {
        Model customModel = MavenTemplateManager.getCustomProjectModel(parameters);
        customModel.getProperties().setProperty("signer.version", "9.9.9");
        MergedModel mergedModel = mergeTool.mergeModel(defaultModel.clone(), customModel);
        assertNotNull(mergedModel.getModel());
        assertFalse(mergedModel.getIllegalProperties().isEmpty());
        assertTrue(mergedModel.getIllegalPluginManagement().isEmpty());
        assertTrue(mergedModel.getIllegalPlugins().isEmpty());
        assertTrue(mergedModel.getIllegalProfiles().isEmpty());
    }

    @Test
    public void testMergeModelWithError() throws Exception {
        Model customModel = MavenTemplateManager.getCustomProjectModel(parameters);

        customModel.getProperties().setProperty("signer.version", "9.9.9");

        customModel.setBuild(new Build());
        customModel.getBuild().setPluginManagement(new PluginManagement());
        Plugin plugin = new Plugin();
        plugin.setGroupId("org.apache.maven.plugins");
        plugin.setArtifactId("maven-compiler-plugin");
        customModel.getBuild().getPluginManagement().getPlugins().add(plugin);

        Plugin plugin2 = new Plugin();
        plugin2.setGroupId("org.talend.ci");
        plugin2.setArtifactId("builder-maven-plugin");
        customModel.getBuild().getPlugins().add(plugin2);

        Profile profile = new Profile();
        profile.setId("nexus");
        customModel.getProfiles().add(profile);

        MergedModel mergedModel = mergeTool.mergeModel(defaultModel.clone(), customModel);
        assertNull(mergedModel.getModel());
        assertFalse(mergedModel.getIllegalProperties().isEmpty());
        assertFalse(mergedModel.getIllegalPluginManagement().isEmpty());
        assertFalse(mergedModel.getIllegalPlugins().isEmpty());
        assertFalse(mergedModel.getIllegalProfiles().isEmpty());
    }

    @Test
    public void testMergeModelWithOtherSetup() throws Exception {
        Model customModel = MavenTemplateManager.getCustomProjectModel(parameters);
        customModel.setDependencyManagement(new DependencyManagement());
        customModel.getDependencies().add(new Dependency());
        customModel.getRepositories().add(new Repository());
        customModel.getPluginRepositories().add(new Repository());
        customModel.setDistributionManagement(new DistributionManagement());

        Model model = mergeTool.migrateCustomModel(defaultModel.clone(), customModel);
        assertNotNull(model);
        assertNotNull(model.getDependencyManagement());
        assertNotNull(model.getDistributionManagement());
        assertFalse(customModel.getDependencies().isEmpty());
        assertFalse(customModel.getRepositories().isEmpty());
        assertFalse(customModel.getPluginRepositories().isEmpty());
    }

    @Test
    public void testMigrateCustomModel() throws Exception {
        Model customModel = MavenTemplateManager.getCustomProjectModel(parameters);

        customModel.getProperties().setProperty("encoding", "UTF-8");
        customModel.getProperties().setProperty("signer.version", "9.9.9");
        customModel.getProperties().setProperty("test", "test");

        customModel.setBuild(new Build());
        customModel.getBuild().setPluginManagement(new PluginManagement());
        Plugin plugin1 = new Plugin();
        plugin1.setGroupId("org.apache.maven.plugins");
        plugin1.setArtifactId("maven-compiler-plugin");
        Plugin plugin2 = new Plugin();
        plugin2.setGroupId("a.b.c");
        plugin2.setArtifactId("test-plugin");
        customModel.getBuild().getPluginManagement().getPlugins().add(plugin1);
        customModel.getBuild().getPluginManagement().getPlugins().add(plugin2);

        Plugin plugin3 = new Plugin();
        plugin3.setGroupId("org.talend.ci");
        plugin3.setArtifactId("builder-maven-plugin");
        Plugin plugin4 = new Plugin();
        plugin4.setGroupId("d.e.f");
        plugin4.setArtifactId("test2-plugin");
        customModel.getBuild().getPlugins().add(plugin3);
        customModel.getBuild().getPlugins().add(plugin4);

        Profile profile1 = new Profile();
        profile1.setId("nexus");
        Profile profile2 = new Profile();
        profile2.setId("custom_profile");
        customModel.getProfiles().add(profile1);
        customModel.getProfiles().add(profile2);

        Model model = mergeTool.migrateCustomModel(defaultModel.clone(), customModel);
        assertNotNull(model);
        assertEquals("9.9.9", model.getProperties().getProperty("signer.version"));
        assertEquals("test", model.getProperties().getProperty("test"));
        assertFalse(model.getProperties().containsKey("encoding"));

        assertFalse(model.getBuild().getPluginManagement().getPluginsAsMap().containsKey(plugin1.getKey()));
        assertTrue(model.getBuild().getPluginManagement().getPluginsAsMap().containsKey(plugin2.getKey()));

        assertFalse(model.getBuild().getPluginsAsMap().containsKey(plugin3.getKey()));
        assertTrue(model.getBuild().getPluginsAsMap().containsKey(plugin4.getKey()));

        assertFalse(model.getProfiles().stream().anyMatch(p -> "nexus".equals(p.getId())));
        assertTrue(model.getProfiles().stream().anyMatch(p -> "custom_profile".equals(p.getId())));
    }

    @Test
    public void testMigrateCustomModelWithEmptyPluginManagement() throws Exception {
        Model customModel = MavenTemplateManager.getCustomProjectModel(parameters);
        customModel.setBuild(new Build());
        customModel.getBuild().setPluginManagement(new PluginManagement());
        Plugin plugin = new Plugin();
        plugin.setGroupId("org.apache.maven.plugins");
        plugin.setArtifactId("maven-compiler-plugin");
        customModel.getBuild().getPluginManagement().getPlugins().add(plugin);
        Model model = mergeTool.migrateCustomModel(defaultModel.clone(), customModel);
        assertNotNull(model);
        assertNull(model.getBuild().getPluginManagement());
    }

}
