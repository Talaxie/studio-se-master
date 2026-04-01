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
package org.talend.commons.ui.nofitication;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.jface.window.Window;
import org.eclipse.jface.window.WindowManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

public class NotificationManager implements Listener {

    private static NotificationManager notificationManager;

    private WindowManager windowManager = new WindowManager();

    private NotificationManager() {
        Shell shell = getParentShell();
        if (shell != null) {
            shell.addListener(SWT.Resize, this);
            shell.addListener(SWT.Move, this);
        }
    }

    public static NotificationManager getInstance() {
        if (notificationManager == null) {
            notificationManager = new NotificationManager();
        }
        return notificationManager;
    }

    @Override
    public void handleEvent(Event event) {
        refresh();
    }

    public void refresh() {
        Stream.of(windowManager.getWindows()).map(ArrangedNotificationPopup.class::cast)
                .forEach(ArrangedNotificationPopup::initializeBounds);
    }

    public List<Window> getWindows() {
        return Stream.of(windowManager.getWindows()).collect(Collectors.toList());
    }

    public void add(Window window) {
        windowManager.add(window);
    }

    public void remove(Window window) {
        windowManager.remove(window);
    }

    public Shell getParentShell() {
        Shell shell = null;
        if (PlatformUI.getWorkbench().getActiveWorkbenchWindow() != null) {
            shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
            if (shell == null) {
                shell = PlatformUI.getWorkbench().getDisplay().getActiveShell();
            }
        }
        return shell;
    }

}
