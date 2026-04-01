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
package org.talend.designer.core.ui.editor.cmd;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CommandStack;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.MessageDialogWithToggle;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.talend.commons.ui.gmf.util.DisplayUtils;
import org.talend.commons.ui.runtime.custom.MessageDialogWithToggleBusinessHandler;
import org.talend.designer.core.ui.AbstractMultiPageTalendEditor;
import org.talend.designer.core.ui.editor.AbstractTalendEditor;

/**
 * DOC cmeng class global comment. Detailled comment
 */
public abstract class AbsCmdSwtUIHandler extends AbsCmdUIHandler implements ICommonCommandUIHandler {

    public AbsCmdSwtUIHandler() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public boolean execute(Command cmd) {
        IEditorPart part = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
        if (part instanceof AbstractMultiPageTalendEditor) {
            AbstractTalendEditor te = ((AbstractMultiPageTalendEditor) part).getTalendEditor();
            CommandStack cmdStack = (CommandStack) te.getAdapter(CommandStack.class);
            cmdStack.execute(cmd);
            return true;
        } else {
            cmd.execute();
            return true;
        }
    }

    @Override
    public boolean openQuestion(String title, String message) {
        boolean needPropagate = MessageDialog.openQuestion(DisplayUtils.getDefaultShell(false), title, message);
        return needPropagate;
    }

    @Override
    public boolean openConfirm(String title, String msg) {
        return MessageDialog.openConfirm(DisplayUtils.getDefaultShell(false), title, msg);
    }

    @Override
    public void openWarning(String title, String msg) {
        MessageDialog.openWarning(DisplayUtils.getDefaultShell(false), title, msg);
    }

    @Override
    public void openError(String title, String msg) {
        MessageDialog.openError(DisplayUtils.getDefaultShell(false), title, msg);
    }
    
    @Override
    public MessageDialogWithToggleBusinessHandler openToggle(MessageDialogWithToggleBusinessHandler bh) {
        MessageDialogWithToggle dialog = new MessageDialogWithToggle(null,
                bh.getTitle(),
                null, // accept the default window icon
                bh.getMessage(), bh.getDialogType(), bh.getButtonLabels(),
                bh.getDefaultBtnIndex(), bh.getToggleMessage(),
                bh.getToggleState());
        dialog.setPrefStore((IPreferenceStore) bh.getPreferenceStore().getOriginStore());
        dialog.setPrefKey(bh.getPrefKey());
        int open = dialog.open();
        bh.setOpenResult(open);
        bh.setToggleState(dialog.getToggleState());
        return bh;
    }

}
