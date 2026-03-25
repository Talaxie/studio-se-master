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

import javax.management.MBeanAttributeInfo;
import javax.management.MBeanInfo;
import javax.management.ObjectName;
import javax.management.RuntimeMBeanException;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.talend.designer.runtime.visualization.Activator;
import org.talend.designer.runtime.visualization.IActiveJvm;
import org.talend.designer.runtime.visualization.JvmCoreException;

/**
 * The MBean content provider.
 */
public class AttributeContentProvider implements ITreeContentProvider {

    /** The attribute root nodes. */
    protected List<AttributeNode> attributeRootNodes;

    /**
     * The constructor.
     */
    public AttributeContentProvider() {
        attributeRootNodes = new ArrayList<AttributeNode>();
    }

    /*
     * @see IStructuredContentProvider#getElements(Object)
     */
    @Override
    public Object[] getElements(Object inputElement) {
        return attributeRootNodes.toArray(new AttributeNode[0]);
    }

    /*
     * @see ITreeContentProvider#getChildren(Object)
     */
    @Override
    public Object[] getChildren(Object parentElement) {
        if (parentElement instanceof AttributeNode) {
            return ((AttributeNode) parentElement).getChildren().toArray(new AttributeNode[0]);
        }
        return null;
    }

    /*
     * @see ITreeContentProvider#getParent(Object)
     */
    @Override
    public Object getParent(Object element) {
        return null;
    }

    /*
     * @see ITreeContentProvider#hasChildren(Object)
     */
    @Override
    public boolean hasChildren(Object element) {
        if (element instanceof AttributeNode) {
            return ((AttributeNode) element).hasChildren();
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
        attributeRootNodes.clear();
    }

    /**
     * Refreshes the content provider.
     * 
     * @param jvm The JVM
     * @param objectName The object name
     * @throws JvmCoreException
     */
    protected void refresh(IActiveJvm jvm, ObjectName objectName) throws JvmCoreException {
        MBeanInfo mBeanInfo = null;
        List<AttributeNode> nodes = new ArrayList<AttributeNode>();
        try {
            mBeanInfo = jvm.getMBeanServer().getMBeanInfo(objectName);
        } catch (JvmCoreException e) {
            attributeRootNodes = nodes;
            throw e;
        }

        if (mBeanInfo == null) {
            attributeRootNodes = nodes;
            return;
        }

        AttributeParser parser = new AttributeParser();
        for (MBeanAttributeInfo attributeInfo : mBeanInfo.getAttributes()) {
            String name = attributeInfo.getName();
            Object value = getAttributeValue(jvm, objectName, name);

            AttributeNode attributeNode = null;
            for (AttributeNode node : attributeRootNodes) {
                if (node.getName().equals(name)) {
                    attributeNode = node;
                    attributeNode.setValue(value);
                    break;
                }
            }
            if (attributeNode == null) {
                attributeNode = new AttributeNode(name, null, value);
            }
            parser.refreshAttribute(attributeNode);

            attributeNode.setWritable(attributeInfo.isWritable());
            nodes.add(attributeNode);
        }

        Collections.sort(nodes, new Comparator<AttributeNode>() {

            @Override
            public int compare(AttributeNode o1, AttributeNode o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        attributeRootNodes = nodes;
    }

    /**
     * Gets the attribute value.
     * 
     * @param jvm The JVM
     * @param objectName The object name
     * @param attributeName The attribute name
     * @return The attribute value
     */
    private static Object getAttributeValue(IActiveJvm jvm, ObjectName objectName, String attributeName) {
        try {
            return jvm.getMBeanServer().getAttribute(objectName, attributeName);
        } catch (JvmCoreException e) {
            // not supported
            if (Activator.getDefault().isDebugging()) {
                Activator.log(IStatus.ERROR, Messages.getMBeanAttributeFailedMsg, e);
            }
        } catch (RuntimeMBeanException e) {
            // not supported
        }
        return null;
    }
}
