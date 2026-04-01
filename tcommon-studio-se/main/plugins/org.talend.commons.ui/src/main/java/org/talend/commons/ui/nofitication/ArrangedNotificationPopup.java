// ============================================================================
//
// Copyright (C) 2006-2022 Talend Inc. - www.talend.com
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

import org.eclipse.jface.notifications.AbstractNotificationPopup;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Monitor;
import org.eclipse.swt.widgets.Shell;

public abstract class ArrangedNotificationPopup extends AbstractNotificationPopup {

    protected static final int MAX_WIDTH = 400;

    protected static final int MIN_HEIGHT = 100;

    protected static final int PADDING_EDGE = 5;

    private static NotificationManager manager;

    public ArrangedNotificationPopup(Display display) {
        super(display);
    }

    public ArrangedNotificationPopup(Display display, int style) {
        super(display, style);
    }

    @Override
    protected void createContentArea(Composite parent) {
        createControl(parent);
        afterCreate();
    }

    protected abstract void createControl(Composite parent);

    @Override
    protected Shell getParentShell() {
        return getNotificationManager().getParentShell();
    }

    @Override
    public void initializeBounds() {
        Rectangle clArea = getPrimaryClientArea();
        Point initialSize = getShell().computeSize(SWT.DEFAULT, SWT.DEFAULT);
        int height = Math.max(initialSize.y, MIN_HEIGHT);
        int width = Math.min(initialSize.x, MAX_WIDTH);

        Point size = new Point(width, height);
        getShell().setLocation(clArea.width + clArea.x - size.x - PADDING_EDGE, clArea.height + clArea.y - size.y - PADDING_EDGE);
        getShell().setSize(size);
    }

    private Rectangle getPrimaryClientArea() {
        Shell parentShell = getParentShell();
        if (parentShell != null) {
            // calculate client area in display-relative coordinates
            // (i.e. without window border / decorations)
            Rectangle bounds = parentShell.getBounds();
            Rectangle trim = parentShell.computeTrim(0, 0, 0, 0);
            List<Window> toasts = getNotificationManager().getWindows();
            Rectangle rect = new Rectangle(bounds.x - trim.x, bounds.y - trim.y, bounds.width - trim.width,
                    bounds.height - trim.height);
            if (!toasts.isEmpty()) {
                int index = 0;
                if (toasts.contains(this)) {
                    // parent shell resize or move
                    index = toasts.indexOf(this);
                    if (index == 0) {
                        // return parent shell rectangle if it's the first one at bottom
                        return rect;
                    }
                    // the one under current toast
                    index -= 1;
                } else {
                    // toast creation
                    // the one on the top
                    index = toasts.size() - 1;
                }
                Rectangle toastRect = toasts.get(index).getShell().getBounds();
                rect = new Rectangle(rect.x, rect.y, rect.width, toastRect.y - rect.y);
            }
            return rect;
        }
        // else display on primary monitor
        Monitor primaryMonitor = this.getShell().getDisplay().getPrimaryMonitor();
        return (primaryMonitor != null) ? primaryMonitor.getClientArea() : this.getShell().getDisplay().getClientArea();
    }

    protected void afterCreate() {
        //
    }

    @Override
    public int open() {
        int open = super.open();
        // add after open
        getNotificationManager().add(this);
        return open;
    }

    @Override
    public boolean close() {
        boolean close = super.close();
        getNotificationManager().remove(this);
        getNotificationManager().refresh();
        return close;
    }

    private NotificationManager getNotificationManager() {
        if (manager == null) {
            manager = NotificationManager.getInstance();
        }
        return manager;
    }

}
