// ============================================================================
//
// Copyright (C) 2006-2026 Talaxie Inc. - www.deilink.fr
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talaxie SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.core.ui.ai;

import org.talend.core.GlobalServiceRegister;
import org.talend.core.IService;

/**
 * Gives the AI assistant access to the job opened in the active editor: description of the job sent to the model, and
 * application of the modifications asked by the model. Implemented by the job designer.
 */
public interface IAiJobService extends IService {

    /**
     * @return a description of the job opened in the active editor (components, main parameters, connections), null if
     * no job editor is active
     */
    String getActiveJobDescription();

    /**
     * Applies the actions (JSON array, see the assistant system prompt) to the job opened in the active editor. All the
     * actions are executed as one editor command: they can be undone together and the job is not saved.
     */
    Modification applyActions(String actionsJson);

    /** Modifications applied to a job by the assistant */
    interface Modification {

        /** Report of the application, shown to the user and sent to the model with the next message */
        String getReport();

        /** At least one action has been applied */
        boolean hasChanges();

        /**
         * Undoes the modifications, only if they are the last ones of the job (otherwise the modifications done since
         * would be undone too).
         *
         * @return null if undone, else the reason why they cannot be undone
         */
        String undo();
    }

    static IAiJobService get() {
        if (GlobalServiceRegister.getDefault().isServiceRegistered(IAiJobService.class)) {
            return GlobalServiceRegister.getDefault().getService(IAiJobService.class);
        }
        return null;
    }
}
