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
package org.talend.commons.ui.runtime.custom;

import java.util.concurrent.CompletableFuture;

/**
 * DOC cmeng  class global comment. Detailled comment
 */
public interface ICustomUIEngine {

    static final String CONTEXT_PROCESS = "PROCESS";

    <T extends IBusinessHandler> T run(ICustomUI<T> ui);

    /**
     * Handle event from stigma
     */
    void handleUIEvent(IUIEvent event);

    /**
     * Provide UI data to stigma
     */
    Object provideUIData(IUIData uiData);

    /**
     * Send event to stigma
     */
    <T extends IBusinessHandler> void dispatchUIEvent(ICustomUI<T> ui, IUIEvent event);

    /**
     * Request data from stigma
     */
    <T extends IBusinessHandler> CompletableFuture<Object> requestUIData(ICustomUI<T> ui, IUIData uiData);

    <M> M convertValue(Object value, Class<M> clz);

    Object readJson(String value) throws Exception;

    void registerThreadLocalContext(String key, Object value);

    Object getThreadLocalContext(String key);

    void registerUIEventHandler(String uiId, IUIEventHandler handler);

    void unregisterUIEventHandler(String uiId);

    void registerGlobalUIEventHandler(String eventId, IUIEventHandler handler);

    void unregisterGlobalUIEventHandler(String eventId, IUIEventHandler handler);

    boolean isClientAlive();

}
