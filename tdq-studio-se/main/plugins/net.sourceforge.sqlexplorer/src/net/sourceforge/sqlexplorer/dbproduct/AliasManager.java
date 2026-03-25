/*
 * Copyright (C) 2007 SQL Explorer Development Team http://sourceforge.net/projects/eclipsesql
 * 
 * This program is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General
 * Public License as published by the Free Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 * 
 * This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU Lesser General Public License along with this library; if not, write to
 * the Free Software Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 */
package net.sourceforge.sqlexplorer.dbproduct;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

import net.sourceforge.sqlexplorer.ApplicationFiles;
import net.sourceforge.sqlexplorer.ExplorerException;
import net.sourceforge.sqlexplorer.plugin.SQLExplorerPlugin;

import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.dom4j.tree.DefaultElement;
import org.talend.cwm.helper.ConnectionHelper;

/**
 * Maintains the list of Alias objects
 * 
 * @author John Spackman
 * 
 */
public class AliasManager implements ConnectionListener {

    // List of aliases, indexed by alias name
    private TreeMap<String, Alias> aliases = new TreeMap<String, Alias>();

    // Connection Listeners
    private LinkedList<ConnectionListener> connectionListeners = new LinkedList<ConnectionListener>();

    /**
     * Loads Aliases from the users preferences
     * 
     */
    public void loadAliases() throws ExplorerException {
        aliases.clear();

        try {
            SAXReader reader = new SAXReader();
            File file = new File(ApplicationFiles.USER_ALIAS_FILE_NAME);
            if (file.exists()) {
                Element root = reader.read(file).getRootElement();
                if (root.getName().equals("Beans")) {
                    root = convertToV350(root);
                }
                List<Element> list = root.elements(Alias.ALIAS);
                // MOD mzhao bug:19539 Judge if the alias need to save again because it was not encripted in previouse
                // workspace. (before
                // 4.2)
                Boolean needToSave = false;
                if (list != null) {
                    for (Element elem : list) {
                        Alias alias = new Alias(elem);
                        Boolean needToSaveUnit = getDecryptUser(alias.getDefaultUser());
                        if (!needToSave) {
                            needToSave = needToSaveUnit;
                        }
                        addAlias(alias);
                    }
                }
                if (needToSave) {
                    saveAliases();
                }
                // ~ 19539
            }
        } catch (DocumentException e) {
            throw new ExplorerException(e);
        }
    }

    private Boolean getDecryptUser(User user) throws ExplorerException {
        Boolean needToSave = Boolean.FALSE;
        if (user == null) {
            return needToSave;
        }
        String password = user.getPassword();
        if (password == null || password.trim().equals("")) { //$NON-NLS-1$ 
            return needToSave;
        }
        String decPassword = ConnectionHelper.getDecryptPassword(password);
        if (decPassword != null) {
            user.setPassword(decPassword);
        } else {
            needToSave = Boolean.TRUE;
        }
        return needToSave;
    }

    /**
     * Saves all the Aliases to the users preferences
     * 
     */
    public void saveAliases() throws ExplorerException {
        DefaultElement root = new DefaultElement(Alias.ALIASES);
        for (Alias alias : aliases.values()) {
            root.add(alias.describeAsXml());
        }
        try {
            FileWriter writer = new FileWriter(new File(ApplicationFiles.USER_ALIAS_FILE_NAME));
            OutputFormat format = OutputFormat.createPrettyPrint();
            XMLWriter xmlWriter = new XMLWriter(writer, format);
            xmlWriter.write(root);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            throw new ExplorerException(e);
        }
    }

    /**
     * Adds an Alias
     * 
     * @param alias
     */
    public void addAlias(Alias alias) throws ExplorerException {
        aliases.put(alias.getName(), alias);
    }

    /**
     * Removes an Alias with a given name
     * 
     * @param aliasName
     */
    public void removeAlias(String aliasName) {
        Alias alias = aliases.remove(aliasName);
        if (alias != null) {
            alias.closeAllConnections();
            SQLExplorerPlugin.getDefault().getAliasManager().modelChanged();
        }
    }

    /**
     * Locates an Alias by name
     * 
     * @param aliasName
     * @return
     */
    public Alias getAlias(String aliasName) {
        return aliases.get(aliasName);
    }

    /**
     * Provides a list of all Aliases
     * 
     * @return
     */
    public Collection<Alias> getAliases() {
        return aliases.values();
    }

    /**
     * Returns true if the alias is in our list
     * 
     * @param alias
     * @return
     */
    public boolean contains(Alias alias) {
        return aliases.values().contains(alias);
    }

    /**
     * Closes all connections in all aliases; note that ConnectionListeners are NOT invoked
     * 
     */
    public void closeAllConnections() throws ExplorerException {
        for (Alias alias : aliases.values()) {
            alias.closeAllConnections();
        }
    }

    /**
     * Adds a listener for the connections
     * 
     * @param listener
     */
    public void addListener(ConnectionListener listener) {
        connectionListeners.add(listener);
    }

    /**
     * Removes a listener
     * 
     * @param listener
     */
    public void removeListener(ConnectionListener listener) {
        connectionListeners.remove(listener);
    }

    /**
     * Called to notify that the list of connections has changed; passes this onto the listeners
     */
    public void modelChanged() {
        for (ConnectionListener listener : connectionListeners) {
            listener.modelChanged();
        }
    }

    /**
     * Upgrades a v3 definition (java beans style) to v3.5.0beta2 and onwards
     * 
     * @param beans
     * @return
     */
    protected Element convertToV350(Element beans) {
        Element result = new DefaultElement(Alias.ALIASES);

        for (Element bean : beans.elements("Bean")) {
            Element alias = result.addElement(Alias.ALIAS);
            alias.addAttribute(Alias.AUTO_LOGON, Boolean.toString(getBoolean(bean.elementText("autoLogon"), false)));
            alias.addAttribute(Alias.CONNECT_AT_STARTUP,
                    Boolean.toString(getBoolean(bean.elementText("connectAtStartup"), false)));
            alias.addAttribute(Alias.DRIVER_ID, bean.element("driverIdentifier").elementText("string"));
            alias.addElement(Alias.NAME).setText(bean.elementText("name"));
            Element userElem = alias.addElement(Alias.USERS).addElement(User.USER);
            userElem.addElement(User.USER_NAME).setText(bean.elementText("userName"));
            userElem.addElement(User.PASSWORD).setText(bean.elementText("password"));
            alias.addElement(Alias.URL).setText(bean.elementText("url"));
            alias.addElement(Alias.FOLDER_FILTER_EXPRESSION).setText(bean.elementText("folderFilterExpression"));
            alias.addElement(Alias.NAME_FILTER_EXPRESSION).setText(bean.elementText("nameFilterExpression"));
            alias.addElement(Alias.SCHEMA_FILTER_EXPRESSION).setText(bean.elementText("schemaFilterExpression"));
        }

        return result;
    }

    /**
     * Helper method to convert a string to a boolean
     * 
     * @param value
     * @param defaultValue
     * @return
     */
    private boolean getBoolean(String value, boolean defaultValue) {
        if (value == null || value.trim().length() == 0) {
            return defaultValue;
        }
        return value.equals("true") || value.equals("yes") || value.equals("on");
    }
}
