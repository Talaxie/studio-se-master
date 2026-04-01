/*******************************************************************************
 * Copyright (c) 2013 JVM Monitor project. All rights reserved.
 * 
 * This code is distributed under the terms of the Eclipse Public License v1.0 which is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.talend.designer.runtime.visualization.internal.ui.editors;

import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.ui.part.EditorActionBarContributor;
import org.talend.designer.runtime.visualization.internal.actions.CollapseAllAction;

/**
 * The action bar contributor for CUP dump editor.
 */
public class CpuDumpEditorActionContributor extends EditorActionBarContributor {

    /*
     * @see EditorActionBarContributor#contributeToToolBar(IToolBarManager)
     */
    @Override
    public void contributeToToolBar(IToolBarManager toolBarManager) {
        toolBarManager.add(new ActionContributionItem(new CollapseAllAction()) {

            @Override
            protected boolean isEnabledAllowed() {
                return true;
            }
        });
    }
}
