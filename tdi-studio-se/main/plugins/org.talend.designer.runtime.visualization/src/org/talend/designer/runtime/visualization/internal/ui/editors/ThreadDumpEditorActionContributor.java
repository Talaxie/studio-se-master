/*******************************************************************************
 * Copyright (c) 2010 JVM Monitor project. All rights reserved.
 * 
 * This code is distributed under the terms of the Eclipse Public License v1.0 which is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.talend.designer.runtime.visualization.internal.ui.editors;

import java.util.ArrayList;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.part.EditorActionBarContributor;
import org.talend.designer.runtime.visualization.internal.actions.ToggleOrientationAction;
import org.talend.designer.runtime.visualization.internal.actions.ToggleOrientationAction.Orientation;
import org.talend.designer.runtime.visualization.internal.ui.properties.thread.ThreadSashForm;

/**
 * The action bar contributor for thread dump editor.
 */
public class ThreadDumpEditorActionContributor extends EditorActionBarContributor {

    /** The actions to toggle orientation. */
    private ArrayList<ToggleOrientationAction> orientationActions;

    /*
     * @see EditorActionBarContributor#contributeToToolBar(IToolBarManager)
     */
    @Override
    public void contributeToToolBar(IToolBarManager toolBarManager) {
        orientationActions = new ArrayList<ToggleOrientationAction>();
        for (Orientation orientation : Orientation.values()) {
            orientationActions.add(new ToggleOrientationAction(orientation));
        }

        for (Action action : orientationActions) {
            toolBarManager.add(new ActionContributionItem(action) {

                @Override
                protected boolean isEnabledAllowed() {
                    return true;
                }
            });
        }
    }

    /*
     * @see EditorActionBarContributor#setActiveEditor(IEditorPart)
     */
    @Override
    public void setActiveEditor(IEditorPart targetEditor) {
        if (!(targetEditor instanceof ThreadDumpEditor)) {
            return;
        }

        ThreadDumpEditor threadDump = (ThreadDumpEditor) targetEditor;
        ThreadSashForm sashForm = threadDump.getThreadSashForm();
        for (ToggleOrientationAction action : orientationActions) {
            action.setSashForm(sashForm);
            if (action.isChecked()) {
                action.run();
            }
        }
    }
}
