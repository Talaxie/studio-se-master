/*******************************************************************************
 * Copyright (c) 2010-2011 JVM Monitor project. All rights reserved.
 * 
 * This code is distributed under the terms of the Eclipse Public License v1.0 which is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.talend.designer.runtime.visualization.internal.ui.properties.MBean;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.management.ObjectName;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.talend.designer.runtime.visualization.Activator;
import org.talend.designer.runtime.visualization.IActiveJvm;
import org.talend.designer.runtime.visualization.JvmCoreException;

/**
 * The MBean content provider.
 */
public class MBeanContentProvider implements ITreeContentProvider {

    /** The MBeans. */
    private Map<String, MBeanDomain> domains;

    /**
     * The constructor.
     */
    public MBeanContentProvider() {
        domains = new HashMap<String, MBeanDomain>();
    }

    /*
     * @see IStructuredContentProvider#getElements(Object)
     */
    @Override
    public Object[] getElements(Object inputElement) {
        return domains.values().toArray(new MBeanDomain[0]);
    }

    /*
     * @see ITreeContentProvider#getChildren(Object)
     */
    @Override
    public Object[] getChildren(Object parentElement) {
        if (parentElement instanceof IMBeanNode) {
            return ((IMBeanNode) parentElement).getChildren();
        }
        return null;
    }

    /*
     * @see ITreeContentProvider#getParent(Object)
     */
    @Override
    public Object getParent(Object element) {
        if (element instanceof IMBeanNode) {
            return ((IMBeanNode) element).getParent();
        }
        return null;
    }

    /*
     * @see ITreeContentProvider#hasChildren(Object)
     */
    @Override
    public boolean hasChildren(Object element) {
        if (element instanceof IMBeanNode) {
            return ((IMBeanNode) element).getChildren().length > 0;
        }

        return false;
    }

    /*
     * @see IContentProvider#dispose()
     */
    @Override
    public void dispose() {
        // do nothing
    }

    /*
     * @see IContentProvider#inputChanged(Viewer, Object, Object)
     */
    @Override
    public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
        domains.clear();
    }

    /**
     * Refreshes the content provider.
     * 
     * @param jvm The active JVM
     */
    public void refresh(IActiveJvm jvm) {
        Map<String, MBeanDomain> newDomains = new HashMap<String, MBeanDomain>();

        // refresh domains
        for (ObjectName objectName : getObjectNames(jvm)) {
            MBeanDomain domain;
            String domainName = objectName.getDomain();
            if (domains.containsKey(domainName)) {
                domain = domains.get(domainName);
                newDomains.put(domainName, domain);
            } else if (newDomains.containsKey(domainName)) {
                domain = newDomains.get(domainName);
            } else {
                domain = new MBeanDomain(domainName);
                newDomains.put(domainName, domain);
            }
            domain.refresh(objectName, jvm);
        }

        domains = newDomains;
    }

    /**
     * Gets the object names.
     * 
     * @param jvm The active JVM
     * @return The object names
     */
    private static Set<ObjectName> getObjectNames(IActiveJvm jvm) {
        try {
            return jvm.getMBeanServer().queryNames(null);
        } catch (JvmCoreException e) {
            Activator.log(IStatus.ERROR, Messages.getMBeanObjectNamesFailedMsg, e);
        }
        return new HashSet<ObjectName>();
    }
}
