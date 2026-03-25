/*******************************************************************************
 * Copyright (c) 2010-2011 JVM Monitor project. All rights reserved.
 * 
 * This code is distributed under the terms of the Eclipse Public License v1.0 which is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.talend.designer.runtime.visualization.internal.ui.properties.MBean;

import javax.management.ObjectName;

import org.talend.designer.runtime.visualization.IActiveJvm;

/**
 * The MBean.
 */
public class MBean implements IMBeanNode {

    /** The node name. */
    private String name;

    /** The parent node. */
    private IMBeanNode parent;

    /** The object name. */
    private ObjectName objectName;

    /** The state indicating if notification is supported. */
    private boolean isNotificationSupported;

    /** The JVM. */
    private IActiveJvm jvm;

    /**
     * The constructor.
     * 
     * @param name The node name
     * @param parent The parent node
     * @param objectName The object name
     * @param jvm The JVM
     * @param isNotificationSupported <tt>true</tt> if notification is supported
     */
    public MBean(String name, IMBeanNode parent, ObjectName objectName, IActiveJvm jvm, boolean isNotificationSupported) {
        this.name = name;
        this.parent = parent;
        this.objectName = objectName;
        this.jvm = jvm;
        this.isNotificationSupported = isNotificationSupported;
    }

    /*
     * @see IMBeanNode#getName()
     */
    @Override
    public String getName() {
        return name;
    }

    /*
     * @see IMBeanNode#getParent()
     */
    @Override
    public IMBeanNode getParent() {
        return parent;
    }

    /*
     * @see IMBeanNode#getChildren()
     */
    @Override
    public IMBeanNode[] getChildren() {
        return new IMBeanNode[0];
    }

    /*
     * @see IMBeanNode#addChild(IMBeanNode)
     */
    @Override
    public void addChild(IMBeanNode child) {
        // do nothing
    }

    /**
     * Gets the object name.
     * 
     * @return the object name
     */
    public ObjectName getObjectName() {
        return objectName;
    }

    /**
     * Gets the state indicating if notification is supported.
     * 
     * @return <tt>true</tt> if notification is supported
     */
    protected boolean isNotificationSubsctibed() {
        return isNotificationSupported && jvm.getMBeanServer().getMBeanNotification().isSubscribed(objectName);
    }

    /**
     * Gets the JVM.
     * 
     * @return the JVM
     */
    protected IActiveJvm getJvm() {
        return jvm;
    }
}
