/* Copyright (c) 2026 Talaxie. Licensed under the Apache License, Version 2.0. */
package org.talend.bigdata.test;

import java.lang.reflect.Field;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.junit.rules.ExternalResource;
import org.talend.core.context.Context;
import org.talend.core.context.RepositoryContext;
import org.talend.core.model.general.Project;
import org.talend.core.runtime.CoreRuntimePlugin;
import org.talend.core.runtime.projectsetting.ProjectPreferenceManager;

/** Supply project preferences without requiring an interactive Studio login. */
public final class TestProject extends ExternalResource {

    private IProject workspaceProject;

    private Object previousRepositoryContext;

    private Object previousPreferences;

    private Field preferencesField;

    @Override
    protected void before() throws Throwable {
        CoreRuntimePlugin plugin = CoreRuntimePlugin.getInstance();
        Context context = plugin.getContext();
        previousRepositoryContext = context.getProperty(Context.REPOSITORY_CONTEXT_KEY);
        // The production singleton caches preferences for the logged-in project.
        // Preserve it so this fixture cannot leak its project into another test.
        preferencesField = CoreRuntimePlugin.class.getDeclaredField("projectPreferenceManager");
        preferencesField.setAccessible(true);
        previousPreferences = preferencesField.get(plugin);
        try {
            String name = "BUILD_TEST_" + Long.toHexString(System.nanoTime());
            workspaceProject = ResourcesPlugin.getWorkspace().getRoot().getProject(name);
            workspaceProject.create(null);
            workspaceProject.open(null);
            Project project = new Project(name);
            project.setTechnicalLabel(name);
            RepositoryContext repositoryContext = new RepositoryContext();
            repositoryContext.setProject(project);
            context.putProperty(Context.REPOSITORY_CONTEXT_KEY, repositoryContext);
            preferencesField.set(plugin, new ProjectPreferenceManager(workspaceProject, "build-test", false));
        } catch (Throwable failure) {
            after();
            throw failure;
        }
    }

    @Override
    protected void after() {
        try {
            CoreRuntimePlugin plugin = CoreRuntimePlugin.getInstance();
            if (previousRepositoryContext == null) {
                plugin.getContext().removeProperty(Context.REPOSITORY_CONTEXT_KEY);
            } else {
                plugin.getContext().putProperty(Context.REPOSITORY_CONTEXT_KEY, previousRepositoryContext);
            }
            preferencesField.set(plugin, previousPreferences);
        } catch (IllegalAccessException e) {
            throw new AssertionError("Cannot restore project preferences", e);
        } finally {
            if (workspaceProject != null && workspaceProject.exists()) {
                try {
                    workspaceProject.delete(true, null);
                } catch (Exception e) {
                    throw new AssertionError("Cannot delete temporary test project", e);
                }
            }
        }
    }
}
