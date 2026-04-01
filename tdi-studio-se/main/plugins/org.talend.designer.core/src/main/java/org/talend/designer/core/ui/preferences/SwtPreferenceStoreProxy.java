// ============================================================================
//
// Copyright (C) 2006-2023 Talaxie Inc. - www.deilink.fr
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talaxie SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.designer.core.ui.preferences;

import org.eclipse.jface.preference.IPreferenceStore;
import org.talend.commons.ui.runtime.custom.ICrossPlatformPreferenceStore;

public class SwtPreferenceStoreProxy implements ICrossPlatformPreferenceStore {

    private IPreferenceStore store;

    public SwtPreferenceStoreProxy(IPreferenceStore store) {
        this.store = store;
    }

    @Override
    public boolean getBoolean(String key) {
        return store.getBoolean(key);
    }

    @Override
    public boolean getDefaultBoolean(String key) {
        return store.getDefaultBoolean(key);
    }

    @Override
    public void setValue(String key, boolean value) {
        store.setValue(key, value);
    }

    @Override
    public void setValue(String key, String value) {
        store.setValue(value, value);
    }

    @Override
    public Object getOriginStore() {
        return store;
    }

}
