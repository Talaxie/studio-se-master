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
package org.talend.designer.core.ui.editor.properties.controllers.generator;

import java.util.Collection;
import java.util.HashSet;

import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.core.model.metadata.IDynamicBaseProperty;
import org.talend.core.model.process.IElementParameter;
import org.talend.core.ui.properties.tab.IDynamicProperty;
import org.talend.designer.core.ui.editor.properties.controllers.executors.IControllerExecutor;
import org.talend.designer.core.ui.editor.properties.controllers.ui.IControllerUI;


/**
 * DOC cmeng  class global comment. Detailled comment
 */
public class ControllerFactories implements IControllerFactory {

    private static ControllerFactories inst;

    private Collection<IControllerFactory> factories;

    public static ControllerFactories inst() {
        if (inst == null) {
            inst = new ControllerFactories();
        }
        return inst;
    }

    private ControllerFactories() {
        factories = new HashSet<>();
        init();
    }

    private void init() {
        try {
            BundleContext bc = FrameworkUtil.getBundle(ControllerFactories.class).getBundleContext();
            Collection<ServiceReference<IControllerFactory>> serviceReferences = bc.getServiceReferences(IControllerFactory.class,
                    null);
            for (ServiceReference<IControllerFactory> sr : serviceReferences) {
                IControllerFactory impl = bc.getService(sr);
                factories.add(impl);
            }
        } catch (Throwable e) {
            ExceptionHandler.process(e);
        }
    }

    @Override
    public IControllerUI createUI(String name, IDynamicProperty dp) {
        for (IControllerFactory factory : factories) {
            IControllerUI ui = factory.createUI(name, dp);
            if (ui != null) {
                return ui;
            }
        }
        return null;
    }

    @Override
    public IControllerExecutor createExecutor(String name, IDynamicBaseProperty dynamicBaseProp, IElementParameter curParameter) {
        for (IControllerFactory factory : factories) {
            IControllerExecutor executor = factory.createExecutor(name, dynamicBaseProp, curParameter);
            if (executor != null) {
                return executor;
            }
        }
        return null;
    }

}
