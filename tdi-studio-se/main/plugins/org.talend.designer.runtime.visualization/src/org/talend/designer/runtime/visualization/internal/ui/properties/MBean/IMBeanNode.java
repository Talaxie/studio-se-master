/*******************************************************************************
 * Copyright (c) 2011 JVM Monitor project. All rights reserved. 
 * 
 * This code is distributed under the terms of the Eclipse Public License v1.0
 * which is available at http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.talend.designer.runtime.visualization.internal.ui.properties.MBean;

/**
 * The MBean tree node.
 */
public interface IMBeanNode {

    /**
     * Gets the node name.
     * 
     * @return The node name
     */
    String getName();

    /**
     * Gets the parent node.
     * 
     * @return The parent node, or <tt>null</tt> if this is root node
     */
    IMBeanNode getParent();

    /**
     * Gets the child nodes.
     * 
     * @return The child nodes, or empty array if not available
     */
    IMBeanNode[] getChildren();

    /**
     * Adds the child node.
     * 
     * @param child
     *            The child node
     */
    void addChild(IMBeanNode child);
}
