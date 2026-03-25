// ============================================================================
//
// Copyright (C) 2006-2021 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.dataquality.record.linkage.ui.composite.utils;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.DecorationOverlayIcon;
import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.PlatformUI;

/**
 * Store and lazy load Imaged. <br/>
 *
 * $Id: ImageLib.java,v 1.5 2007/04/05 05:33:07 pub Exp $
 *
 */
public final class ImageLib {

    protected static Logger log = Logger.getLogger(ImageLib.class);

    private static ImageRegistry imageRegistry;

    private static URL iconURL;

    public static final String DELETE_ACTION = "cross.png"; //$NON-NLS-1$

    public static final String ADD_ACTION = "add.gif"; //$NON-NLS-1$

    public static final String EDIT_ACTION = "edit.png"; //$NON-NLS-1$

    public static final String UP_ACTION = "up.gif"; //$NON-NLS-1$

    public static final String DOWN_ACTION = "down.gif"; //$NON-NLS-1$

    public static final String WARN_OVR = "warn_ovr.gif"; //$NON-NLS-1$

    public static final String ICON_LOCK = "lock.gif"; //$NON-NLS-1$

    public static final String ICON_ERROR_VAR = "error_ovr.gif"; //$NON-NLS-1$

    public static final String ICON_ADD_VAR = "add_ovr.gif"; //$NON-NLS-1$

    public static final String JAR_FILE = "jar_obj.gif"; //$NON-NLS-1$

    public static final String ICON_LOCK_BYOTHER = "locked_red_overlay.gif"; //$NON-NLS-1$

    public static final String PLUGIN_ID = "org.talend.dataquality.record.linkage.ui"; //$NON-NLS-1$

    public static final String MASTER_IMAGE = "star_tMatchGroup_master.png";//$NON-NLS-1$

    public static final Color COLOR_GREY = new Color(null, 56, 55, 58);

    /**
     * DOC bzhou ImageLib constructor comment.
     */
    private ImageLib() {

    }

    /**
     * get <code>ImageDescriptor</code> with special imageName.
     *
     * @param imageName
     * @return
     */
    public static ImageDescriptor getImageDescriptor(String imageName) {
        if (imageRegistry == null) {
            initialize();
        }
        ImageDescriptor imageDesc = imageRegistry.getDescriptor(imageName);
        if (imageDesc == null) {
            addImage(imageName);
            return imageRegistry.getDescriptor(imageName);
        }
        return imageDesc;
    }

    /**
     * get <code>Image</code> with special imageName.
     *
     * @param imageName
     * @return
     */
    public static Image getImage(String imageName) {
        if (imageRegistry == null) {
            initialize();
        }
        if (imageRegistry == null) {
            return null;
        }
        Image image = imageRegistry.get(imageName);
        if (image == null) {
            addImage(imageName);
            return imageRegistry.get(imageName);
        }
        return image;
    }

    /**
     * initialize the fieds.
     */
    static void initialize() {
        if (imageRegistry == null) {
            imageRegistry = new ImageRegistry(PlatformUI.getWorkbench().getDisplay());
            iconURL = getIconLocation();
        }
    }

    /**
     * get current icons URL.
     *
     * @return
     */
    private static URL getIconLocation() {
        URL installURL = Platform.getBundle(PLUGIN_ID).getEntry("/"); //$NON-NLS-1$
        try {
            return new URL(installURL, "icons/"); //$NON-NLS-1$
        } catch (MalformedURLException e) {
            log.error(e, e);
            return null;
        }
    }

    /**
     * store the image with special name(the name with suffix,such as "sample.gif").
     *
     * @param iconName
     */
    public static void addImage(String iconName) {
        try {
            ImageDescriptor descriptor = ImageDescriptor.createFromURL(new URL(iconURL, iconName));
            imageRegistry.put(iconName, descriptor);
        } catch (MalformedURLException e) {
            // skip, but try to go on to the next one...
        }
    }

    /**
     * DOC bZhou Comment method "createInvalidIcon".
     *
     * @param originalImgName
     * @return
     */
    public static ImageDescriptor createInvalidIcon(String originalImgName) {
        return createInvalidIcon(getImageDescriptor(originalImgName));
    }

    /**
     * DOC bZhou Comment method "createInvalidIcon".
     *
     * @param originalImg
     * @return
     */
    public static ImageDescriptor createInvalidIcon(ImageDescriptor originalImg) {
        ImageDescriptor warnImg = getImageDescriptor(WARN_OVR);
        return originalImg != null ? createIcon(originalImg, warnImg) : null;
    }

    /**
     * DOC bZhou Comment method "createLockedIcon".
     *
     * @param originalImgName
     * @return
     */
    public static ImageDescriptor createLockedIcon(String originalImgName) {
        return createLockedIcon(getImageDescriptor(originalImgName));
    }

    /**
     * DOC bZhou Comment method "createLockedIcon".
     *
     * @param originalImg
     * @return
     */
    public static ImageDescriptor createLockedIcon(ImageDescriptor originalImg) {
        ImageDescriptor lockImg = getImageDescriptor(ICON_LOCK);

        return originalImg != null ? createIcon(originalImg, lockImg) : null;
    }

    /**
     * DOC bZhou Comment method "createIcon".
     *
     * @param originalImg
     * @param decorateImg
     * @return
     */
    public static ImageDescriptor createIcon(ImageDescriptor originalImg, ImageDescriptor decorateImg) {
        return createIcon(originalImg.createImage(), decorateImg);
    }

    /**
     * DOC xqliu Comment method "createIcon".
     *
     * @param originalImg
     * @param decorateImg
     * @return
     */
    public static ImageDescriptor createIcon(Image originalImg, ImageDescriptor decorateImg) {
        return new DecorationOverlayIcon(originalImg, decorateImg, IDecoration.BOTTOM_RIGHT);
    }

    /**
     * DOC qiongli Comment method "createLockedIcon".
     *
     * @param originalImgName
     * @return
     */
    public static ImageDescriptor createErrorIcon(String originalImgName) {
        return createErrorIcon(getImageDescriptor(originalImgName));
    }

    /**
     * DOC bZhou Comment method "createLockedIcon".
     *
     * @param originalImg
     * @return
     */
    public static ImageDescriptor createErrorIcon(ImageDescriptor originalImg) {
        ImageDescriptor lockImg = getImageDescriptor(ICON_ERROR_VAR);

        return originalImg != null ? createIcon(originalImg, lockImg) : null;
    }

    /*
     * DOC qiongli Comment method "createAddedIcon".
     *
     * @param originalImgName
     *
     * @return
     */
    public static ImageDescriptor createAddedIcon(String originalImgName) {
        return createAddedIcon(getImageDescriptor(originalImgName));
    }

    /**
     * DOC qiongli Comment method "createAddedIcon".
     *
     * @param originalImg
     * @return
     */
    public static ImageDescriptor createAddedIcon(ImageDescriptor originalImg) {
        ImageDescriptor addImg = getImageDescriptor(ICON_ADD_VAR);
        return originalImg != null ? new DecorationOverlayIcon(originalImg.createImage(), addImg, IDecoration.TOP_RIGHT) : null;
    }

    public static ImageDescriptor createLockedByOtherIcon(String originalImgName) {
        return createLockedByOtherIcon(getImageDescriptor(originalImgName));
    }

    public static ImageDescriptor createLockedByOtherIcon(ImageDescriptor originalImg) {
        ImageDescriptor lockImg = getImageDescriptor(ICON_LOCK_BYOTHER);
        return originalImg != null ? createIcon(originalImg, lockImg) : null;
    }

    public static ImageDescriptor createLockedByOtherIcon(Image originalImg) {
        ImageDescriptor lockImg = getImageDescriptor(ICON_LOCK_BYOTHER);
        return originalImg != null ? createIcon(originalImg, lockImg) : null;
    }

    public static ImageDescriptor createLockedByOwnIcon(String originalImgName) {
        return createLockedByOtherIcon(getImageDescriptor(originalImgName));
    }

    public static ImageDescriptor createLockedByOwnIcon(ImageDescriptor originalImg) {
        ImageDescriptor lockImg = getImageDescriptor(ICON_LOCK);
        return originalImg != null ? createIcon(originalImg, lockImg) : null;
    }

    public static ImageDescriptor createLockedByOwnIcon(Image originalImg) {
        ImageDescriptor lockImg = getImageDescriptor(ICON_LOCK);
        return originalImg != null ? createIcon(originalImg, lockImg) : null;
    }

}
