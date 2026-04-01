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
package org.talend.designer.maven.model;

import java.util.ArrayList;
import java.util.List;

import org.apache.maven.model.Model;
import org.apache.maven.model.Plugin;
import org.apache.maven.model.Profile;

public class MergedModel {

    private Model model;

    private List<String> illegalProperties = new ArrayList<>();

    private List<Profile> illegalProfiles = new ArrayList<>();

    private List<Plugin> illegalPluginManagement = new ArrayList<>();

    private List<Plugin> illegalPlugins = new ArrayList<>();

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public List<String> getIllegalProperties() {
        return illegalProperties;
    }

    public List<Profile> getIllegalProfiles() {
        return illegalProfiles;
    }

    public List<Plugin> getIllegalPluginManagement() {
        return illegalPluginManagement;
    }

    public List<Plugin> getIllegalPlugins() {
        return illegalPlugins;
    }

    public String getIllegalPropertiesInfo() {
        if (!illegalProperties.isEmpty()) {
            StringBuilder msgBuilder = new StringBuilder();
            msgBuilder.append("Properties:\n");
            msgBuilder.append("[");
            illegalProperties.forEach(property -> msgBuilder.append(property).append(", "));
            msgBuilder.delete(msgBuilder.length() - 2, msgBuilder.length());
            msgBuilder.append("]\n");
            return msgBuilder.toString();
        }
        return null;
    }

    public String getIllegalPluginManagementInfo() {
        if (!illegalPluginManagement.isEmpty()) {
            StringBuilder msgBuilder = new StringBuilder();
            msgBuilder.append("PluginManagement:\n");
            illegalPluginManagement.forEach(plugin -> msgBuilder.append(plugin.getKey()).append("\n"));
            msgBuilder.deleteCharAt(msgBuilder.length() - 1);
            msgBuilder.append("\n");
            return msgBuilder.toString();
        }
        return null;
    }

    public String getIllegalPluginsInfo() {
        if (!illegalPlugins.isEmpty()) {
            StringBuilder msgBuilder = new StringBuilder();
            msgBuilder.append("Plugins:\n"); //$NON-NLS-1$
            illegalPlugins.forEach(plugin -> msgBuilder.append(plugin.getKey()).append("\n"));
            msgBuilder.deleteCharAt(msgBuilder.length() - 1);
            msgBuilder.append("\n");
            return msgBuilder.toString();
        }
        return null;
    }

    public String getIllegalProfilesInfo() {
        if (!illegalProfiles.isEmpty()) {
            StringBuilder msgBuilder = new StringBuilder();
            msgBuilder.append("Profiles:\n");
            msgBuilder.append("[");
            illegalProfiles.forEach(profile -> msgBuilder.append(profile.getId()).append(", "));
            msgBuilder.delete(msgBuilder.length() - 2, msgBuilder.length());
            msgBuilder.append("]\n");
            return msgBuilder.toString();
        }
        return null;
    }

}
