/*******************************************************************************
 * Copyright (c) 2010-2011 JVM Monitor project. All rights reserved.
 * 
 * This code is distributed under the terms of the Eclipse Public License v1.0 which is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.talend.designer.runtime.visualization.internal.ui.properties.MBean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.management.ObjectName;

import org.talend.designer.runtime.visualization.IActiveJvm;

/**
 * The MBean domain.
 */
public class MBeanDomain implements IMBeanNode {

    /** The domain name. */
    private String domainName;

    /** The child nodes. */
    private List<IMBeanNode> children;

    /**
     * The constructor.
     * 
     * @param domainName The domain name
     */
    public MBeanDomain(String domainName) {
        this.domainName = domainName;
        children = new ArrayList<IMBeanNode>();
    }

    /*
     * @see IMBeanNode#getName()
     */
    @Override
    public String getName() {
        return domainName;
    }

    /*
     * @see IMBeanNode#getParent()
     */
    @Override
    public IMBeanNode getParent() {
        return null;
    }

    /*
     * @see IMBeanNode#getChildren()
     */
    @Override
    public IMBeanNode[] getChildren() {
        return children.toArray(new IMBeanNode[children.size()]);
    }

    /*
     * @see IMBeanNode#addChild(IMBeanNode)
     */
    @Override
    public void addChild(IMBeanNode child) {
        if (children.contains(child)) {
            return;
        }

        children.add(child);

        Collections.sort(children, new Comparator<IMBeanNode>() {

            @Override
            public int compare(IMBeanNode o1, IMBeanNode o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }

    /**
     * Refreshes the MBean domain.
     * 
     * @param objectName The object name
     * @param jvm The JVM
     */
    public void refresh(ObjectName objectName, IActiveJvm jvm) {
        // object name can be type=xxx,name=xxx
        String[] properties = objectName.getCanonicalKeyPropertyListString().split(","); //$NON-NLS-1$

        // add or refresh MBean folders
        IMBeanNode parent = this;
        String mBeanName;
        if (properties.length <= 1) {
            mBeanName = getPropertyValue(properties[0]);
        } else {
            for (int i = properties.length - 1; i >= 1; i--) {
                String name = getPropertyValue(properties[i]);
                IMBeanNode child = getChild(parent, name);
                if (child == null) {
                    child = new MBeanFolder(name, parent);
                    parent.addChild(child);
                }
                parent = child;
            }
            mBeanName = getPropertyValue(properties[0]);
        }

        // search corresponding MBean
        MBean mBean = null;
        for (IMBeanNode child : parent.getChildren()) {
            if (child instanceof MBean) {
                String name = ((MBean) child).getObjectName().getCanonicalName();
                if (name.equals(objectName.getCanonicalName())) {
                    mBean = (MBean) child;
                    break;
                }
            }
        }

        // add or refresh MBean
        if (mBean == null) {
            int notificationCount = jvm.getMBeanServer().getMBeanNotification().getNotifications(objectName).length;
            mBean = new MBean(mBeanName, parent, objectName, jvm, notificationCount > 0);
        }
        parent.addChild(mBean);
    }

    /**
     * Gets the value from the given property string "key=value".
     * 
     * @param property The property string
     * @return The value
     */
    private static String getPropertyValue(String property) {
        String[] elements = property.split("="); //$NON-NLS-1$
        if (elements.length == 2) {
            return elements[1].trim();
        }
        return property.trim();
    }

    /**
     * Gets the child node of given node that corresponds to the given name.
     * 
     * @param node The MBean node
     * @param name The node name
     * @return The child node
     */
    private static IMBeanNode getChild(IMBeanNode node, String name) {
        for (IMBeanNode child : node.getChildren()) {
            if (child.getName().equals(name)) {
                return child;
            }
        }
        return null;
    }
}