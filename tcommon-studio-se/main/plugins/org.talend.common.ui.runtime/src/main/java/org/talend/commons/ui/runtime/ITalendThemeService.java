// ============================================================================
//
// Copyright (C) 2006-2022 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.commons.ui.runtime;

import java.util.Optional;

import org.apache.commons.lang.StringUtils;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.swt.graphics.Color;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;
import org.talend.commons.exception.ExceptionHandler;

/**
 * DOC cmeng  class global comment. Detailled comment
 */
public interface ITalendThemeService {

    public static String DEFAULT_PREFERENCE_ID = "org.eclipse.ui.workbench";

    public static String THEME_PREFERENCE_ID = "org.eclipse.e4.ui.css.swt.theme";

    /**
     * Get color from instance scope preference of default bundleId, which managed by theme; the standard way eclipse
     * uses
     * 
     * @param prop
     * @return the Color, <font color="red">please <b>DON'T</b> dispose it, it is managed by JFaceResources</font>
     */
    static Optional<Color> getColor(String prop) {
        return getColor(DEFAULT_PREFERENCE_ID, prop);
    }

    /**
     * Get color from instance scope preference of bundleId, which managed by theme; the standard way eclipse uses
     * 
     * @param bundleId the instance scope preference which stores the prop
     * @param prop
     * @return the Color, <font color="red">please <b>DON'T</b> dispose it, it is managed by JFaceResources</font>
     */
    static Optional<Color> getColor(String bundleId, String prop) {
        ITalendThemeService theme = get();
        if (theme != null) {
            return Optional.ofNullable(theme.getColorForTheme(bundleId, prop));
        }
        return Optional.ofNullable(null);
    }

    Color getColorForTheme(String bundleId, String prop);

    /**
     * Get property from instance scope preference of default bundleId, which managed by theme; the standard way eclipse
     * uses
     * 
     * @param key
     * @return
     */
    static Optional<String> getProperty(String key) {
        return getProperty(DEFAULT_PREFERENCE_ID, key);
    }

    /**
     * Get property from instance scope preference of bundleId, which managed by theme; the standard way eclipse uses
     * 
     * @param bundleId the instance scope preference which stores the key
     * @param key
     * @return
     */
    static Optional<String> getProperty(String bundleId, String key) {
        ITalendThemeService theme = get();
        String value = null;
        if (theme != null) {
            value = theme.getPropertyForTheme(bundleId, key);
        }
        if (StringUtils.isBlank(value)) {
            return Optional.ofNullable(null);
        } else {
            return Optional.ofNullable(value);
        }
    }

    String getPropertyForTheme(String bundleId, String key);

    static void addPropertyChangeListener(IPropertyChangeListener listener) {
        ITalendThemeService theme = get();
        if (theme != null) {
            theme.addPropertyChangeListenerFor(DEFAULT_PREFERENCE_ID, listener);
        }
    }

    static void addPropertyChangeListener(String bundleId, IPropertyChangeListener listener) {
        ITalendThemeService theme = get();
        if (theme != null) {
            theme.addPropertyChangeListenerFor(bundleId, listener);
        }
    }

    void addPropertyChangeListenerFor(String bundleId, IPropertyChangeListener listener);

    static boolean containsPropertyChangeListener(String bundleId, IPropertyChangeListener listener) {
        ITalendThemeService theme = get();
        if (theme != null) {
            return theme.containsPropertyChangeListenerFor(bundleId, listener);
        }
        return false;
    }

    boolean containsPropertyChangeListenerFor(String bundleId, IPropertyChangeListener listener);

    static void removePropertyChangeListener(IPropertyChangeListener listener) {
        ITalendThemeService theme = get();
        if (theme != null) {
            theme.removePropertyChangeListenerFor(DEFAULT_PREFERENCE_ID, listener);
        }
    }

    static void removePropertyChangeListener(String bundleId, IPropertyChangeListener listener) {
        ITalendThemeService theme = get();
        if (theme != null) {
            theme.removePropertyChangeListenerFor(bundleId, listener);
        }
    }

    void removePropertyChangeListenerFor(String bundleId, IPropertyChangeListener listener);

    IPreferenceStore getThemePreferenceStore();

    static ITalendThemeService get() {
        try {
            BundleContext bc = FrameworkUtil.getBundle(ITalendThemeService.class).getBundleContext();
            ServiceReference<ITalendThemeService> serviceReference = bc.getServiceReference(ITalendThemeService.class);
            if (serviceReference == null) {
                return null;
            }
            return bc.getService(serviceReference);
        } catch (Exception e) {
            ExceptionHandler.process(e);
        }
        return null;
    }

}
