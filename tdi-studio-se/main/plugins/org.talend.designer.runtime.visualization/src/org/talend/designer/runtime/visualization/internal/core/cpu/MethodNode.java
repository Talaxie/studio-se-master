/*******************************************************************************
 * Copyright (c) 2010 JVM Monitor project. All rights reserved.
 * 
 * This code is distributed under the terms of the Eclipse Public License v1.0 which is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.talend.designer.runtime.visualization.internal.core.cpu;

import java.util.List;

/**
 * The method node on Hot Spots.
 */
public class MethodNode extends AbstractMethodNode {

    /**
     * The constructor.
     * 
     * @param cpuModel The cpuModel
     * @param name The qualified method name
     * @param thread The thread node
     */
    public MethodNode(ICpuModel cpuModel, String name, ThreadNode thread) {
        super(cpuModel, name, thread);

        selfTime = 0;
        invocationCount = 0;
    }

    /*
     * @see ICallTreeNode#getChildren()
     */
    @Override
    public List<MethodNode> getChildren() {
        return null;
    }

    /*
     * @see ITreeNode#getChild(String)
     */
    @Override
    public MethodNode getChild(String name) {
        return null;
    }

    /*
     * @see ICallTreeNode#hasChildren()
     */
    @Override
    public boolean hasChildren() {
        return false;
    }

    /*
     * @see ITreeNode#getParent()
     */
    @Override
    public ITreeNode getParent() {
        return threadNode;
    }

    /*
     * @see AbstractMethodNode#clear()
     */
    @Override
    public void clear() {
        selfTime = 0;
        invocationCount = 0;
    }

    /*
     * @see Object#equals(Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof MethodNode)) {
            return false;
        }
        MethodNode methodNode = (MethodNode) obj;

        if (methodNode.getName().equals(qualifiedMethodName) && methodNode.getSelfTime() == selfTime
                && methodNode.getInvocationCount() == invocationCount) {
            return true;
        }

        return false;
    }

    /*
     * @see Object#toString()
     */
    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getName()).append('\t');
        buffer.append(getSelfTime()).append('\t');
        buffer.append(getSelfTimeInPercentage()).append('\t');
        buffer.append(getInvocationCount());
        return buffer.toString();
    }

    /**
     * Increments the sum of method invocation time.
     * 
     * @param time The method self invocation time
     */
    public void incrementTime(long time) {
        selfTime += time;
    }

    /**
     * Increments the sum of method invocation count.
     * 
     * @param count The method invocation count
     */
    public void incrementCount(int count) {
        invocationCount += count;
    }
}
