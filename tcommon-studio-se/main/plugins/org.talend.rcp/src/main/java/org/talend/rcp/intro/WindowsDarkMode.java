// ============================================================================
//
// Copyright (C) 2006-2026 Talaxie Inc. - www.deilink.fr
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talaxie SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.rcp.intro;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;

/**
 * Dark mode of the native Windows controls (drop down lists of the combos, borders of the texts, scroll bars, menu
 * bar...) when a dark theme is active.
 * <p>
 * Same settings as org.eclipse.swt.internal.win32.OS.setTheme(boolean), normally called by the DarkThemeProcessor of
 * org.eclipse.e4.ui.swt.win32 when the theme changes, with the colors of the Talaxie dark theme. They are applied here
 * at startup, before the creation of the widgets (they are read when a control is created), so they do not depend on
 * the theme event. The keys are ignored on Linux and macOS.
 */
public final class WindowsDarkMode {

    private static final String THEME_PREFERENCE_NODE = "org.eclipse.e4.ui.css.swt.theme"; //$NON-NLS-1$

    private static final String THEME_ID_PREFERENCE = "themeid"; //$NON-NLS-1$

    private static final String PREFIX = "org.eclipse.swt.internal.win32."; //$NON-NLS-1$

    private WindowsDarkMode() {
    }

    /** Applies the dark mode of the native controls if the theme of the workspace is a dark theme */
    public static void applyIfDarkTheme(Display display) {
        String themeId = InstanceScope.INSTANCE.getNode(THEME_PREFERENCE_NODE).get(THEME_ID_PREFERENCE, null);
        // same rule as the DarkThemeProcessor of Eclipse
        if (themeId != null && themeId.contains("dark")) { //$NON-NLS-1$
            apply(display, true);
        }
    }

    public static void apply(Display display, boolean dark) {
        if (display == null || display.isDisposed()) {
            return;
        }
        // in particular: hovered item of the combo lists readable, thin borders instead of the light 3D borders
        display.setData(PREFIX + "useDarkModeExplorerTheme", dark); //$NON-NLS-1$
        display.setData(PREFIX + "useShellTitleColoring", dark); //$NON-NLS-1$
        display.setData(PREFIX + "menuBarForegroundColor", dark ? new Color(223, 225, 229) : null); //$NON-NLS-1$
        display.setData(PREFIX + "menuBarBackgroundColor", dark ? new Color(43, 45, 48) : null); //$NON-NLS-1$
        display.setData(PREFIX + "menuBarBorderColor", dark ? new Color(67, 69, 74) : null); //$NON-NLS-1$
        display.setData(PREFIX + "Canvas.use_WS_BORDER", dark); //$NON-NLS-1$
        display.setData(PREFIX + "List.use_WS_BORDER", dark); //$NON-NLS-1$
        display.setData(PREFIX + "Table.use_WS_BORDER", dark); //$NON-NLS-1$
        display.setData(PREFIX + "Text.use_WS_BORDER", dark); //$NON-NLS-1$
        display.setData(PREFIX + "Tree.use_WS_BORDER", dark); //$NON-NLS-1$
        display.setData(PREFIX + "Table.headerLineColor", dark ? new Color(67, 69, 74) : null); //$NON-NLS-1$
        display.setData(PREFIX + "Label.disabledForegroundColor", dark ? new Color(122, 126, 133) : null); //$NON-NLS-1$
        display.setData(PREFIX + "Combo.useDarkTheme", dark); //$NON-NLS-1$
        display.setData(PREFIX + "ProgressBar.useColors", dark); //$NON-NLS-1$
        display.setData(PREFIX + "Text.useDarkThemeIcons", dark); //$NON-NLS-1$
        display.setData(PREFIX + "Edge.useDarkPreferedColorScheme", dark); //$NON-NLS-1$
    }
}
