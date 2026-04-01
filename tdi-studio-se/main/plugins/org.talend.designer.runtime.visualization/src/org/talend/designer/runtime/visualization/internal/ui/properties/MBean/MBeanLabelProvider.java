/*******************************************************************************
 * Copyright (c) 2010-2011 JVM Monitor project. All rights reserved.
 * 
 * This code is distributed under the terms of the Eclipse Public License v1.0 which is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.talend.designer.runtime.visualization.internal.ui.properties.MBean;

import javax.management.ObjectName;

import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider.IStyledLabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.graphics.Image;
import org.talend.designer.runtime.visualization.Activator;
import org.talend.designer.runtime.visualization.IActiveJvm;
import org.talend.designer.runtime.visualization.ISharedImages;

/**
 * The MBean label provider.
 */
public class MBeanLabelProvider implements IStyledLabelProvider {

    /** The MBean image. */
    private Image mBeanImage;

    /** The MBean folder image. */
    private Image mBeanFolderImage;

    /*
     * @see DelegatingStyledCellLabelProvider.IStyledLabelProvider#getStyledText( Object)
     */
    @Override
    public StyledString getStyledText(Object element) {
        StyledString text = new StyledString();
        boolean appendSuffix = false;
        ObjectName objectName = null;
        IActiveJvm jvm = null;

        if (element instanceof IMBeanNode) {
            text.append(((IMBeanNode) element).getName());
            if (element instanceof MBean && ((MBean) element).isNotificationSubsctibed()) {
                appendSuffix = true;
                jvm = ((MBean) element).getJvm();
            }
        }

        if (appendSuffix && jvm != null) {
            int notificationCount = jvm.getMBeanServer().getMBeanNotification().getNotifications(objectName).length;
            String suffix = " [notifications: " + notificationCount + "]"; //$NON-NLS-1$ //$NON-NLS-2$
            int offset = text.length();
            text.append(suffix);
            text.setStyle(offset, suffix.length(), StyledString.DECORATIONS_STYLER);
        }

        return text;
    }

    /*
     * @see LabelProvider#getImage(Object)
     */
    @Override
    public Image getImage(Object element) {
        if (element instanceof MBeanDomain) {
            return getMBeanFolderImage();
        }

        if (element instanceof MBeanFolder) {
            return getMBeanFolderImage();
        }

        if (element instanceof MBean) {
            return getMBeanImage();
        }
        return null;
    }

    /*
     * @see BaseLabelProvider#dispose()
     */
    @Override
    public void dispose() {
        if (mBeanImage != null) {
            mBeanImage.dispose();
        }
        if (mBeanFolderImage != null) {
            mBeanFolderImage.dispose();
        }
    }

    /*
     * @see IBaseLabelProvider#addListener(ILabelProviderListener)
     */
    @Override
    public void addListener(ILabelProviderListener listener) {
        // do nothing
    }

    /*
     * @see IBaseLabelProvider#isLabelProperty(Object, String)
     */
    @Override
    public boolean isLabelProperty(Object element, String property) {
        return false;
    }

    /*
     * @see IBaseLabelProvider#removeListener(ILabelProviderListener)
     */
    @Override
    public void removeListener(ILabelProviderListener listener) {
        // do nothing
    }

    /**
     * Gets the MBean image.
     * 
     * @return The MBean image
     */
    private Image getMBeanImage() {
        if (mBeanImage == null || mBeanImage.isDisposed()) {
            mBeanImage = Activator.getImageDescriptor(ISharedImages.MBEAN_IMG_PATH).createImage();
        }
        return mBeanImage;
    }

    /**
     * Gets the MBean folder image.
     * 
     * @return The MBean folder image
     */
    private Image getMBeanFolderImage() {
        if (mBeanFolderImage == null || mBeanFolderImage.isDisposed()) {
            mBeanFolderImage = Activator.getImageDescriptor(ISharedImages.MBEAN_FOLDER_IMG_PATH).createImage();
        }
        return mBeanFolderImage;
    }
}
