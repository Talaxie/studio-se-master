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
package routines.system;

import java.util.concurrent.ConcurrentHashMap;

public class SingletonHolder {

    private java.util.Map<String, Object> map = null;

    private static SingletonHolder INSTANCE;
    
    private SingletonHolder() {
        map = new ConcurrentHashMap<String, Object>();
    }

    public static synchronized SingletonHolder getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SingletonHolder();
        }
        return INSTANCE;
    }

    public void put(String key, Object value) {
        map.put(key, value);
    }
    
    public Object get(String key) {
        return map.get(key);
    }
    
    public boolean containsKey(String key) {
        return map.containsKey(key);
    }
    
}
