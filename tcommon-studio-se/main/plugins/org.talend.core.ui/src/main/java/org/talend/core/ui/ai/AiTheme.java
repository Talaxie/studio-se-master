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
package org.talend.core.ui.ai;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Widget;
import org.talend.themes.core.elements.utils.TalendThemeUtils;

/**
 * Colors of the AI assistant view, for the light and the dark themes.
 * <p>
 * The CSS engine of the theme styles the widgets after their creation (SWT.Skin event) and would replace the colors
 * of the bubbles: the colors given with {@link #setColors(Control, Color, Color)} are applied again after it.
 */
public final class AiTheme {

    private static final String COLORS_DATA_KEY = "talaxie.ai.colors"; //$NON-NLS-1$

    private static boolean skinListenerInstalled;

    public final boolean dark;

    public final Color viewBackground;

    public final Color text;

    public final Color secondaryText;

    public final Color userBubble;

    public final Color assistantBubble;

    public final Color errorBubble;

    public final Color errorBorder;

    public final Color errorText;

    public final Color actionsBubble;

    public final Color actionsBorder;

    public final Color actionsText;

    public final Color typingDot;

    public final Color typingDotActive;

    private AiTheme(boolean dark) {
        this.dark = dark;
        if (dark) {
            viewBackground = new Color(43, 45, 48);
            text = new Color(223, 225, 229);
            secondaryText = new Color(168, 173, 179);
            userBubble = new Color(46, 67, 110);
            assistantBubble = new Color(57, 59, 64);
            errorBubble = new Color(74, 37, 40);
            errorBorder = new Color(110, 52, 57);
            errorText = new Color(247, 168, 176);
            actionsBubble = new Color(35, 61, 43);
            actionsBorder = new Color(52, 94, 64);
            actionsText = new Color(165, 214, 167);
            typingDot = new Color(110, 115, 122);
            typingDotActive = new Color(200, 204, 210);
        } else {
            viewBackground = new Color(255, 255, 255);
            text = new Color(0, 0, 0);
            secondaryText = new Color(100, 100, 100);
            userBubble = new Color(214, 228, 255);
            assistantBubble = new Color(241, 243, 244);
            errorBubble = new Color(253, 236, 236);
            errorBorder = new Color(240, 190, 190);
            errorText = new Color(170, 30, 30);
            actionsBubble = new Color(232, 245, 233);
            actionsBorder = new Color(190, 225, 195);
            actionsText = new Color(27, 94, 32);
            typingDot = new Color(160, 160, 160);
            typingDotActive = new Color(90, 90, 90);
        }
    }

    /** The colors of the active theme */
    public static AiTheme get() {
        boolean dark;
        try {
            dark = TalendThemeUtils.isDarkModeTheme();
        } catch (Exception e) {
            dark = false;
        }
        return of(dark);
    }

    /** The colors of the light or the dark theme */
    public static AiTheme of(boolean dark) {
        return new AiTheme(dark);
    }

    /**
     * Sets the colors of a control and keeps them when the theme styles the control.
     *
     * @param background the background, null to keep the one of the theme
     * @param foreground the foreground, null to keep the one of the theme
     */
    public static void setColors(Control control, Color background, Color foreground) {
        installSkinListener(control.getDisplay());
        control.setData(COLORS_DATA_KEY, new Color[] { background, foreground });
        applyColors(control);
    }

    private static void applyColors(Widget widget) {
        if (!(widget instanceof Control) || widget.isDisposed()) {
            return;
        }
        Object data = widget.getData(COLORS_DATA_KEY);
        if (data instanceof Color[]) {
            Color[] colors = (Color[]) data;
            Control control = (Control) widget;
            if (colors[0] != null) {
                control.setBackground(colors[0]);
            }
            if (colors[1] != null) {
                control.setForeground(colors[1]);
            }
        }
    }

    /** Listener called after the one of the CSS engine (registered before), so our colors are kept */
    private static synchronized void installSkinListener(Display display) {
        if (skinListenerInstalled) {
            return;
        }
        skinListenerInstalled = true;
        display.addListener(SWT.Skin, event -> applyColors(event.widget));
    }
}
