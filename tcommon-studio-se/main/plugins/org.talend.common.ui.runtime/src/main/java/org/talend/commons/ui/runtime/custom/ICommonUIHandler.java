// ============================================================================
//
// Copyright (C) 2006-2023 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.commons.ui.runtime.custom;

import org.eclipse.gef.commands.Command;
import org.eclipse.swt.widgets.Shell;

/**
 * DOC cmeng  class global comment. Detailled comment
 */
public interface ICommonUIHandler extends IUIHandler {

    /**
     * Constant for no image (value 0).
     *
     * @see #MessageDialog(Shell, String, Image, String, int, int, String...)
     */
    static final int NONE = 0;

    /**
     * Constant for the error image, or a simple dialog with the error image and
     * a single OK button (value 1).
     *
     * @see #MessageDialog(Shell, String, Image, String, int, int, String...)
     * @see #open(int, Shell, String, String, int)
     */
    static final int ERROR = 1;

    /**
     * Constant for the info image, or a simple dialog with the info image and a
     * single OK button (value 2).
     *
     * @see #MessageDialog(Shell, String, Image, String, int, int, String...)
     * @see #open(int, Shell, String, String, int)
     */
    static final int INFORMATION = 2;

    /**
     * Constant for the question image, or a simple dialog with the question
     * image and Yes/No buttons (value 3).
     *
     * @see #MessageDialog(Shell, String, Image, String, int, int, String...)
     * @see #open(int, Shell, String, String, int)
     */
    static final int QUESTION = 3;

    /**
     * Constant for the warning image, or a simple dialog with the warning image
     * and a single OK button (value 4).
     *
     * @see #MessageDialog(Shell, String, Image, String, int, int, String...)
     * @see #open(int, Shell, String, String, int)
     */
    static final int WARNING = 4;

    /**
     * Constant for a simple dialog with the question image and OK/Cancel buttons (value 5).
     *
     * @see #open(int, Shell, String, String, int)
     * @since 3.5
     */
    static final int CONFIRM = 5;

    /**
     * Constant for a simple dialog with the question image and Yes/No/Cancel buttons (value 6).
     *
     * @see #open(int, Shell, String, String, int)
     * @since 3.5
     */
    static final int QUESTION_WITH_CANCEL = 6;

    static final String CONTEXT_COMMAND_STACK = "COMMAND_STACK";

    boolean execute(Command cmd);

    boolean openQuestion(String title, String msg);

    boolean openConfirm(String title, String msg);

    void openWarning(String title, String msg);

    MessageDialogWithToggleBusinessHandler openToggle(MessageDialogWithToggleBusinessHandler bh);

    void openError(String title, String msg);

    static ICommonUIHandler get() {
        return UIHandlerFactories.inst().getUIHandler(ICommonUIHandler.class);
    }

}
