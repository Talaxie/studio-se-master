/*******************************************************************************
 * Copyright (c) 2010 JVM Monitor project. All rights reserved.
 * 
 * This code is distributed under the terms of the Eclipse Public License v1.0 which is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.talend.designer.runtime.visualization.internal.actions;

import org.eclipse.jface.action.Action;
import org.talend.designer.runtime.visualization.Activator;
import org.talend.designer.runtime.visualization.ISharedImages;
import org.talend.designer.runtime.visualization.JvmModelEvent;
import org.talend.designer.runtime.visualization.JvmModelEvent.State;
import org.talend.designer.runtime.visualization.internal.ui.properties.AbstractJvmPropertySection;

/**
 * The action to refresh property section.
 */
public class RefreshAction extends Action {

    /** The property section. */
    private AbstractJvmPropertySection section;

    /**
     * The constructor.
     * 
     * @param section The property section
     */
    public RefreshAction(AbstractJvmPropertySection section) {
        setText(Messages.refreshLabel);
        setImageDescriptor(Activator.getImageDescriptor(ISharedImages.REFRESH_IMG_PATH));
        setDisabledImageDescriptor(Activator.getImageDescriptor(ISharedImages.DISABLED_REFRESH_IMG_PATH));
        setId(getClass().getName());

        setChecked(true);
        this.section = section;
    }

    /*
     * @see Action#run()
     */
    @Override
    public void run() {
        boolean isChecked = isChecked();
        section.suspendRefresh(!isChecked);
        if (isChecked) {
            section.jvmModelChanged(new JvmModelEvent(State.JvmModified, section.getJvm()));
        }
    }
}
