package org.talaxie.commandline;

import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IStartup;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;

public class CommandLineStartup implements IStartup {

    @Override
    public void earlyStartup() {
        Display.getDefault().asyncExec(() -> {
            if (TalaxieCommandLine.launcher() == 1) {
                Display.getDefault().asyncExec(() -> {
                    IWorkbench workbench = PlatformUI.getWorkbench();
                    if (workbench != null) {
                        workbench.close(); // fermeture de Talaxie
                    }
                });

            }
        });
    }
}
