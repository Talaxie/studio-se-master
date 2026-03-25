/*******************************************************************************
 * Copyright (c) 2010 JVM Monitor project. All rights reserved.
 * 
 * This code is distributed under the terms of the Eclipse Public License v1.0 which is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.talend.designer.runtime.visualization.internal.core.cpu;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * The thread node.
 * 
 * @param <E> The method note type
 */
public class ThreadNode<E extends IMethodNode> implements IThreadNode {

    /** The method nodes. */
    private List<E> nodes;

    /** The thread name. */
    private String threadName;

    /** The total invocation time. */
    private long totalTime;

    /**
     * The constructor.
     * 
     * @param name The thread name
     */
    public ThreadNode(String name) {
        threadName = name;
        nodes = new CopyOnWriteArrayList<E>();
    }

    /*
     * @see ITreeNode#getChildren()
     */
    @Override
    public List<E> getChildren() {
        return nodes;
    }

    /*
     * @see ITreeNode#getChild(String)
     */
    @Override
    public IMethodNode getChild(String name) {
        for (IMethodNode node : nodes) {
            if (node.getName().equals(name)) {
                return node;
            }
        }
        return null;
    }

    /*
     * @see ITreeNode#hasChildren()
     */
    @Override
    public boolean hasChildren() {
        return nodes.size() > 0;
    }

    /*
     * @see ITreeNode#getParent()
     */
    @Override
    public ITreeNode getParent() {
        return null;
    }

    /*
     * @see ITreeNode#getName()
     */
    @Override
    public String getName() {
        return threadName;
    }

    /*
     * @see IThreadNode#getTotalTime()
     */
    @Override
    public long getTotalTime() {
        return totalTime;
    }

    /*
     * @see Object#equals(Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ThreadNode)) {
            return false;
        }

        if (((ITreeNode) obj).getName().equals(threadName)) {
            return true;
        }

        return false;
    }

    /*
     * @see Object#hashCode()
     */
    @Override
    public int hashCode() {
        return super.hashCode() | threadName.hashCode();
    }

    /*
     * @see Object#toString()
     */
    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("Thread: ").append(getName()).append('\t'); //$NON-NLS-1$
        buffer.append(getTotalTime());
        return buffer.toString();
    }

    /**
     * Adds the child node.
     * 
     * @param node The child node
     */
    public void addChild(E node) {
        nodes.add(node);
    }

    /**
     * Clears the attributes and those of child nodes recursively.
     */
    public void clear() {
        totalTime = 0;
        for (IMethodNode node : nodes) {
            ((AbstractMethodNode) node).clear();
        }
    }

    /**
     * Sets the total invocation time.
     * 
     * @param time The total invocation time
     */
    public void setTotalTime(long time) {
        totalTime = time;
    }
}
