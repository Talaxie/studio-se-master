package org.talend.rcp.ui.toolbar;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.ui.menus.WorkbenchWindowControlContribution;
import org.talend.commons.utils.system.EnvironmentUtils;

public class ResourceToolbarContribution extends WorkbenchWindowControlContribution {

    public ResourceToolbarContribution() {
        super();
    }

    @Override
    protected Control createControl(Composite parent) {
        // TUP-33432, only for MacOS, change toolbar background color on mouseover
        if (EnvironmentUtils.isMacOsSytem() && parent.getParent() != null && parent.getParent() instanceof ToolBar) {
            ToolBar toolbar = (ToolBar) parent.getParent();
            Color defaultBgColor = toolbar.getBackground();
            // default.css: jeditor-range-indicator-color: #cedff4;
            Color mouseOverBgColor = new Color(null, 206, 223, 244);
            toolbar.addListener(SWT.MouseEnter, new Listener() {

                public void handleEvent(Event e) {
                    toolbar.setBackground(mouseOverBgColor);
                }
            });
            toolbar.addListener(SWT.MouseExit, new Listener() {

                public void handleEvent(Event e) {
                    toolbar.setBackground(defaultBgColor);
                }
            });
            toolbar.addDisposeListener(new DisposeListener() {

                @Override
                public void widgetDisposed(DisposeEvent e) {
                    if (mouseOverBgColor != null && mouseOverBgColor.isDisposed()) {
                        mouseOverBgColor.dispose();
                    }
                }
            });
        }
        return null;
    }
}
