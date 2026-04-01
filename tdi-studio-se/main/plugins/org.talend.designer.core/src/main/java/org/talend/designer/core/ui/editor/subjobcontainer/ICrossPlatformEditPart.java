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

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.commands.Command;
import org.talend.designer.core.ui.editor.nodes.ICrossPlatformEditPartViewer;
import org.talend.designer.core.ui.editor.nodes.ICrossPlatformFigure;

/**
 * DOC cmeng  class global comment. Detailled comment
 */
public interface ICrossPlatformEditPart {

    Object getCrossPlatformModel();

    void setCrossPlatformModel(Object model);

    ICrossPlatformRootEditPart getCrossPlatformRoot();

    ICrossPlatformEditPart getCrossPlatformParentPart();

    void setCrossPlatformParentPart(ICrossPlatformEditPart part);

    default List getCrossPlatformModelChildren() {
        return Collections.EMPTY_LIST;
    }

    default List getCrossPlatformModelSourceConnections() {
        return Collections.EMPTY_LIST;
    }

    default List getCrossPlatformModelTargetConnections() {
        return Collections.EMPTY_LIST;
    }

    default List getCrossPlatformSourceConnections() {
        return Collections.EMPTY_LIST;
    }

    default List getCrossPlatformTargetConnections() {
        return Collections.EMPTY_LIST;
    }

    List getCrossPlatformChildren();

    ICrossPlatformEditPartViewer getCrossPlatformViewer();

    Command getCommand(ICrossPlatformRequest request);

    ICrossPlatformFigure getCrossPlatformFigure();

    default void addCrossPlatformNotify() {
    }

    default void removeCrossPlatformNotify() {
    }

    boolean isCrossPlatformActive();

    void crossPlatformActivate();

    void crossPlatformDeactivate();

    void refreshCrossPlatformVisuals();

    void crossPlatformRefresh();

    default void crossPlatformDispose() {
    }

}
