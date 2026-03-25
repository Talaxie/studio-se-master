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
package org.talend.designer.core.ui.editor.properties.controllers;

import java.beans.PropertyChangeListener;
import java.util.List;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.talend.core.model.process.IElementParameter;
import org.talend.core.model.process.Problem;
import org.talend.core.ui.properties.tab.IDynamicProperty;
import org.talend.designer.core.ui.editor.properties.controllers.ui.IControllerUI;

/**
 * DOC cmeng  class global comment. Detailled comment
 */
public interface ISWTBusinessControllerUI extends IControllerUI, PropertyChangeListener {

    void init(IDynamicProperty dp);

    Control createControl(final Composite subComposite, final IElementParameter param, final int numInRow, final int nbInRow,
            final int top, final Control lastControl);

    @Override
    void refresh(IElementParameter param, boolean check);

    void updateCodeProblems(List<Problem> codeProblems);

    int estimateRowSize(final Composite subComposite, final IElementParameter param);

    boolean hasDynamicRowSize();

    void setAdditionalHeightSize(int height);

    void dispose();

    @Override
    default boolean openConfirm(String title, String msg) {
        return false;
    }

    @Override
    default void openWarning(String title, String msg) {

    }

    @Override
    default void openError(String title, String msg) {

    }

}
