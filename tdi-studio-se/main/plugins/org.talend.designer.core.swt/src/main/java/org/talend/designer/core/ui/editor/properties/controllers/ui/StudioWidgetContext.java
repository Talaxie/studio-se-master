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
package org.talend.designer.core.ui.editor.properties.controllers.ui;

import java.lang.reflect.Method;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Control;
import org.talend.commons.exception.ExceptionHandler;

/**
 * DOC cmeng  class global comment. Detailled comment
 */
public class StudioWidgetContext extends AbsWidgetContext {

    private Control control;

    public StudioWidgetContext(Control control) {
        this.control = control;
    }

    @Override
    public String getText() {
        if (this.control instanceof Button) {
            return ((Button) this.control).getText();
        } else if (this.control instanceof Combo) {
            return ((Combo) this.control).getText();
        } else {
            Method getText;
            try {
                getText = this.control.getClass().getDeclaredMethod("getText");
                getText.setAccessible(true);
                return (String) getText.invoke(this.control);
            } catch (Exception e) {
                ExceptionHandler.process(e);
            }
        }
        return null;
    }

    @Override
    public Object getData(String param) {
        return this.control.getData(param);
    }

    @Override
    public void setData(String param, Object value) {
        this.control.setData(param, value);
    }

}
