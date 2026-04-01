// ============================================================================
//
// Copyright (C) 2006-2023 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.commons.ui.runtime.custom;


public interface ICrossPlatformPreferenceStore {

    boolean getBoolean(String key);

    boolean getDefaultBoolean(String key);

    void setValue(String key, boolean value);

    void setValue(String key, String value);

    Object getOriginStore();

}
