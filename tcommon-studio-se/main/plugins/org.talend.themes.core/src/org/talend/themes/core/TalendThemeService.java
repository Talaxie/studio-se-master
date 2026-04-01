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
package org.talend.themes.core;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.batik.css.parser.CSSLexicalUnit;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.e4.ui.css.core.impl.dom.CSSValueFactory;
import org.eclipse.e4.ui.css.swt.helpers.CSSSWTColorHelper;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.ColorRegistry;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.preferences.ScopedPreferenceStore;
import org.eclipse.ui.themes.ColorUtil;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.ui.runtime.ITalendThemeService;
import org.w3c.css.sac.LexicalUnit;

/**
 * DOC cmeng class global comment. Detailled comment
 */
public class TalendThemeService implements ITalendThemeService {

    private static final Logger log = Logger.getLogger(TalendThemeService.class);

    private Map<String, IPreferenceStore> storeMap = new HashMap<>();

    private Map<String, Set<IPropertyChangeListener>> listenerMap = new HashMap<>();

    @Override
    public Color getColorForTheme(String bundleId, String prop) {
        Assert.isNotNull(bundleId);
        Assert.isNotNull(prop);
        IPreferenceStore prefStore = getPreferenceStore(bundleId);
        return getColor(prefStore, prop, Display.getDefault());
    }

    @Override
    public String getPropertyForTheme(String bundleId, String key) {
        Assert.isNotNull(bundleId);
        Assert.isNotNull(key);
        IPreferenceStore prefStore = getPreferenceStore(bundleId);
        return prefStore.getString(key);
    }

    @Override
    public void addPropertyChangeListenerFor(String bundleId, IPropertyChangeListener listener) {
        Assert.isNotNull(bundleId);
        Assert.isNotNull(listener);
        Set<IPropertyChangeListener> set = this.listenerMap.get(bundleId);
        if (set != null && set.contains(listener)) {
            log.info("Listener already exist:" + listener);
            return;
        }
        getPreferenceStore(bundleId).addPropertyChangeListener(listener);
        if (set == null) {
            set = new HashSet<>();
            this.listenerMap.put(bundleId, set);
        }
        set.add(listener);
    }

    @Override
    public boolean containsPropertyChangeListenerFor(String bundleId, IPropertyChangeListener listener) {
        Assert.isNotNull(bundleId);
        Assert.isNotNull(listener);
        Set<IPropertyChangeListener> set = this.listenerMap.get(bundleId);
        if (set != null) {
            return set.contains(listener);
        }
        return false;
    }

    @Override
    public void removePropertyChangeListenerFor(String bundleId, IPropertyChangeListener listener) {
        Assert.isNotNull(bundleId);
        Assert.isNotNull(listener);
        getPreferenceStore(bundleId).removePropertyChangeListener(listener);
        Set<IPropertyChangeListener> set = this.listenerMap.get(bundleId);
        if (set != null) {
            set.remove(listener);
            if (set.isEmpty()) {
                this.listenerMap.remove(bundleId);
            }
        }
    }

    @Override
    public IPreferenceStore getThemePreferenceStore() {
        return getPreferenceStore(ITalendThemeService.THEME_PREFERENCE_ID);
    }

    private IPreferenceStore getPreferenceStore(String bundleId) {
        IPreferenceStore prefStore = storeMap.get(bundleId);
        if (prefStore == null) {
            prefStore = new ScopedPreferenceStore(InstanceScope.INSTANCE, bundleId);
            storeMap.put(bundleId, prefStore);
        }
        return prefStore;
    }

    private Color getColor(IPreferenceStore store, String key, Display display) {
        try {
            RGB rgb = null;
            if (store.contains(key)) {
                String colorStr = null;
                if (store.isDefault(key)) {
                    colorStr = store.getDefaultString(key);
                } else {
                    colorStr = store.getString(key);
                }
                if (StringUtils.isNotBlank(colorStr)) {
                    if (0 <= colorStr.indexOf(',')) {
                        rgb = ColorUtil.getColorValue(colorStr);
                    } else {
                        Color swtColor = CSSSWTColorHelper.getSWTColor(CSSValueFactory
                                .newValue(CSSLexicalUnit.createString(LexicalUnit.SAC_STRING_VALUE, colorStr, null)), display);
                        if (swtColor != null) {
                            rgb = swtColor.getRGB();
                            try {
                                swtColor.dispose();
                            } catch (Throwable e) {
                                ExceptionHandler.process(e);
                            }
                        }
                    }
                }
                if (rgb != null) {
                    ColorRegistry colorRegistry = JFaceResources.getColorRegistry();
                    Color color = colorRegistry.get(rgb.toString());
                    if (color == null) {
                        colorRegistry.put(rgb.toString(), rgb);
                    }
                    return colorRegistry.get(rgb.toString());
                }
            }
        } catch (Throwable e) {
            ExceptionHandler.process(e);
        }
        return null;
    }

}
