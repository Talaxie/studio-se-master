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

import java.util.Collection;
import java.util.HashSet;

import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;
import org.talend.commons.exception.ExceptionHandler;

/**
 * DOC cmeng  class global comment. Detailled comment
 */
public class UIHandlerFactories implements IUIHandlerFactory {

    private static UIHandlerFactories inst;

    private Collection<IUIHandlerFactory> factories;

    public static UIHandlerFactories inst() {
        if (inst == null) {
            inst = new UIHandlerFactories();
        }
        return inst;
    }

    private UIHandlerFactories() {
        factories = new HashSet<>();
        init();
    }

    private void init() {
        try {
            BundleContext bc = FrameworkUtil.getBundle(UIHandlerFactories.class).getBundleContext();
            Collection<ServiceReference<IUIHandlerFactory>> serviceReferences = bc.getServiceReferences(IUIHandlerFactory.class,
                    null);
            for (ServiceReference<IUIHandlerFactory> sr : serviceReferences) {
                IUIHandlerFactory impl = bc.getService(sr);
                factories.add(impl);
            }
        } catch (Throwable e) {
            ExceptionHandler.process(e);
        }
    }

    @Override
    public <T extends IUIHandler> T getUIHandler(Class<T> clz) {
        for (IUIHandlerFactory factory : factories) {
            T ui = factory.getUIHandler(clz);
            if (ui != null) {
                return ui;
            }
        }
        return null;
    }

    public ICommonUIHandler getCommonUIHandler() {
        return getUIHandler(ICommonUIHandler.class);
    }

}
