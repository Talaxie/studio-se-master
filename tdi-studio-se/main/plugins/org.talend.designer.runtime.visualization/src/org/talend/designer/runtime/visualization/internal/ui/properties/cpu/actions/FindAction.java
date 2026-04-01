/*******************************************************************************
 * Copyright (c) 2010 JVM Monitor project. All rights reserved.
 * 
 * This code is distributed under the terms of the Eclipse Public License v1.0 which is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.talend.designer.runtime.visualization.internal.ui.properties.cpu.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.ui.IWorkbenchCommandConstants;
import org.talend.designer.runtime.visualization.internal.core.cpu.ITreeNode;

/**
 * The action to find tree item.
 */
public class FindAction extends Action {

    /**
     * The constructor.
     */
    public FindAction() {
        setText(Messages.findLabel);
        setActionDefinitionId(IWorkbenchCommandConstants.EDIT_FIND_AND_REPLACE);
    }

    /*
     * @see Action#run()
     */
    @Override
    public void run() {
        new FindDialog().open();
    }

    /**
     * The target for find action.
     */
    public interface IFindTarget {

        /**
         * Gets the target tree viewer for find action.
         * 
         * @return The target tree viewer for find action
         */
        TreeViewer getTargetTreeViewer();

        /**
         * Gets the target tree model for find action.
         * 
         * @return The target tree model for find action
         */
        ITreeNode[] getTargetTreeNodes();
    }
}
