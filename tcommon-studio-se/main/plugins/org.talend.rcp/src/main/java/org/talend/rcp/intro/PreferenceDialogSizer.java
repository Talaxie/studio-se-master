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
package org.talend.rcp.intro;

import org.eclipse.jface.preference.IPreferenceNode;
import org.eclipse.jface.preference.PreferenceDialog;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

/**
 * Sizes the preference dialogs when they are opened (whatever the way they are opened): the dialog is proportional to
 * the main window and the tree on the left is wide enough to show the labels of the preference pages.
 */
public final class PreferenceDialogSizer {

    private static final String SIZED_DATA_KEY = "talaxie.preferenceDialog.sized"; //$NON-NLS-1$

    /** Size of the dialog compared to the main window */
    private static final double WIDTH_RATIO = 0.75;

    private static final double HEIGHT_RATIO = 0.8;

    /** Maximum width of the tree compared to the dialog */
    private static final double MAX_TREE_WIDTH_RATIO = 0.4;

    /** Indentation of each tree level */
    private static final int TREE_LEVEL_INDENT = 20;

    /** Expand arrow, margins and vertical scroll bar */
    private static final int TREE_EXTRA_WIDTH = 50;

    private static boolean installed = false;

    private PreferenceDialogSizer() {
    }

    public static synchronized void install(Display display) {
        if (installed || display == null || display.isDisposed()) {
            return;
        }
        installed = true;
        display.addFilter(SWT.Show, event -> {
            if (event.widget instanceof Shell) {
                Shell shell = (Shell) event.widget;
                if (shell.getData() instanceof PreferenceDialog && shell.getData(SIZED_DATA_KEY) == null) {
                    shell.setData(SIZED_DATA_KEY, Boolean.TRUE);
                    resize((PreferenceDialog) shell.getData(), shell);
                }
            }
        });
    }

    private static void resize(PreferenceDialog dialog, Shell shell) {
        Rectangle area = shell.getMonitor().getClientArea();
        Rectangle reference = getMainWindowBounds(area);

        // dialog size proportional to the main window, never smaller than the default size
        Rectangle bounds = shell.getBounds();
        int width = Math.min(Math.max(bounds.width, (int) (reference.width * WIDTH_RATIO)), area.width);
        int height = Math.min(Math.max(bounds.height, (int) (reference.height * HEIGHT_RATIO)), area.height);

        // tree wide enough to show the labels
        TreeViewer treeViewer = dialog.getTreeViewer();
        if (treeViewer != null && treeViewer.getControl().getLayoutData() instanceof GridData) {
            GridData treeData = (GridData) treeViewer.getControl().getLayoutData();
            int treeWidth = Math.min(computeTreeWidth(dialog, treeViewer.getControl()), (int) (width * MAX_TREE_WIDTH_RATIO));
            if (treeWidth > treeData.widthHint) {
                treeData.widthHint = treeWidth;
            }
        }

        // centered on the main window, inside the monitor
        int x = Math.max(area.x, Math.min(reference.x + (reference.width - width) / 2, area.x + area.width - width));
        int y = Math.max(area.y, Math.min(reference.y + (reference.height - height) / 2, area.y + area.height - height));
        shell.setBounds(x, y, width, height);
        shell.layout(true, true);
    }

    private static Rectangle getMainWindowBounds(Rectangle defaultBounds) {
        if (PlatformUI.isWorkbenchRunning()) {
            IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
            if (window == null && PlatformUI.getWorkbench().getWorkbenchWindowCount() > 0) {
                window = PlatformUI.getWorkbench().getWorkbenchWindows()[0];
            }
            if (window != null && window.getShell() != null && !window.getShell().isDisposed()) {
                return window.getShell().getBounds();
            }
        }
        return defaultBounds;
    }

    private static int computeTreeWidth(PreferenceDialog dialog, Control tree) {
        GC gc = new GC(tree);
        try {
            gc.setFont(tree.getFont());
            int width = 0;
            for (IPreferenceNode node : dialog.getPreferenceManager().getRootSubNodes()) {
                width = Math.max(width, computeLabelWidth(gc, node, 1));
            }
            return width + TREE_EXTRA_WIDTH;
        } finally {
            gc.dispose();
        }
    }

    private static int computeLabelWidth(GC gc, IPreferenceNode node, int level) {
        String label = node.getLabelText();
        int width = level * TREE_LEVEL_INDENT + (label == null ? 0 : gc.textExtent(label).x);
        for (IPreferenceNode subNode : node.getSubNodes()) {
            width = Math.max(width, computeLabelWidth(gc, subNode, level + 1));
        }
        return width;
    }
}
