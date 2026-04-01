/*******************************************************************************
 * Copyright (c) 2010-2011 JVM Monitor project. All rights reserved. 
 * 
 * This code is distributed under the terms of the Eclipse Public License v1.0
 * which is available at http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.talend.designer.runtime.visualization.internal.ui.properties.MBean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * The MBean folder.
 */
public class MBeanFolder implements IMBeanNode {

    /** The MBean folder name. */
    private String folderName;

    /** The child nodes. */
    private List<IMBeanNode> children;

    /** The parent node. */
    private IMBeanNode parent;

    /**
     * The constructor.
     * 
     * @param folderName
     *            The MBean folder name
     * @param parent
     *            The parent node
     */
    public MBeanFolder(String folderName, IMBeanNode parent) {
        this.folderName = folderName;
        this.parent = parent;
        children = new ArrayList<IMBeanNode>();
    }

    /*
     * @see IMBeanNode#getName()
     */
    @Override
    public String getName() {
        return folderName;
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
}