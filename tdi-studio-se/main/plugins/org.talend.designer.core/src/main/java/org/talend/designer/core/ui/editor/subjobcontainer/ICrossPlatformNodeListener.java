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
package org.talend.designer.core.ui.editor.subjobcontainer;

import org.eclipse.gef.ConnectionEditPart;

public interface ICrossPlatformNodeListener {

    /**
     * Called prior to removing the connection from its source node. The source
     * is not passed, but can still be obtained at this point by calling
     * {@link ConnectionEditPart#getSource connection.getSource()}
     * 
     * @param connection
     * the connection
     * @param index
     * the index
     */
    void removingSourceConnection(ICrossPlatformConnectionEditPart connection, int index);

    /**
     * Called prior to removing the connection from its target node. The target
     * is not passed, but can still be obtained at this point by calling
     * {@link ConnectionEditPart#getTarget connection.getTarget()}
     * 
     * @param connection
     * the connection
     * @param index
     * the index
     */
    void removingTargetConnection(ICrossPlatformConnectionEditPart connection, int index);

    /**
     * Called after the connection has been added to its source node.
     * 
     * @param connection
     * the connection
     * @param index
     * the index
     */
    void sourceConnectionAdded(ICrossPlatformConnectionEditPart connection, int index);

    /**
     * Called after the connection has been added to its target node.
     * 
     * @param connection
     * the connection
     * @param index
     * the index
     */
    void targetConnectionAdded(ICrossPlatformConnectionEditPart connection, int index);

    public class CrossPlatformNodeListener implements ICrossPlatformNodeListener {

        @Override
        public void removingSourceConnection(ICrossPlatformConnectionEditPart connection, int index) {
        }

        @Override
        public void removingTargetConnection(ICrossPlatformConnectionEditPart connection, int index) {
        }

        @Override
        public void sourceConnectionAdded(ICrossPlatformConnectionEditPart connection, int index) {
        }

        @Override
        public void targetConnectionAdded(ICrossPlatformConnectionEditPart connection, int index) {
        }

    }

}
