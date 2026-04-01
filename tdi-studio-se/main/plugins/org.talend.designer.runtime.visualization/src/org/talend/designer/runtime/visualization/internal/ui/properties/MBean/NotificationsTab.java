/*******************************************************************************
 * Copyright (c) 2010-2011 JVM Monitor project. All rights reserved.
 * 
 * This code is distributed under the terms of the Eclipse Public License v1.0 which is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.talend.designer.runtime.visualization.internal.ui.properties.MBean;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.forms.events.HyperlinkAdapter;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Hyperlink;
import org.talend.designer.runtime.visualization.IActiveJvm;
import org.talend.designer.runtime.visualization.ISharedImages;
import org.talend.designer.runtime.visualization.internal.ui.RefreshJob;
import org.talend.designer.runtime.visualization.internal.ui.properties.AbstractJvmPropertySection;

/**
 * The notification tab.
 */
public class NotificationsTab extends AbstractMBeanTab {

    /** The tree viewer. */
    TreeViewer treeViewer;

    /** The message page. */
    Composite messagePage;

    /** The notification filtered tree. */
    NotificationFilteredTree tree;

    /** The action to subscribe notification. */
    SubscribeAction subscribeAction;

    /**
     * The constructor.
     * 
     * @param tabFolder The tab folder
     * @param section The property section
     */
    public NotificationsTab(CTabFolder tabFolder, AbstractJvmPropertySection section) {
        super(tabFolder, section);

        tree = new NotificationFilteredTree(this, section);
        tree.setLayoutData(null);
        treeViewer = tree.getViewer();

        createMessagePage();

        showPage(tree);

        subscribeAction = new SubscribeAction(section);
    }

    @Override
    public void selectionChanged() {
        tree.setInput(objectName);
        subscribeAction.setSelection(objectName);

        refresh(true);
    }

    @Override
    void performRefresh() {
        refresh(false);
    }

    /**
     * Refreshes.
     * 
     * @param force True to force refresh
     */
    private void refresh(final boolean force) {
        new RefreshJob(Messages.refreshNotificationTabJobLabel, toString()) {

            private boolean isSubscribed;

            private boolean isSupported;

            @Override
            protected void refreshModel(IProgressMonitor monitor) {
                IActiveJvm jvm = section.getJvm();
                if (objectName == null || jvm == null || !jvm.isConnected()) {
                    return;
                }
                isSupported = jvm.getMBeanServer().getMBeanNotification().isSupported(objectName);
                if (isSupported) {
                    isSubscribed = jvm.getMBeanServer().getMBeanNotification().isSubscribed(objectName);
                }
            }

            @Override
            protected void refreshUI() {
                if (tree.isDisposed() || messagePage.isDisposed()) {
                    return;
                }

                if (!isSupported) {
                    tabItem.dispose();
                    return;
                }

                if (tabItem.isDisposed() && isSupported) {
                    addTabItem();
                }

                if (!section.isRefreshSuspended() || force) {
                    tree.setInput(objectName);
                    treeViewer.refresh();
                }
                updatePage(isSubscribed);
            }
        }.schedule();
    }

    /**
     * Clears the notifications.
     */
    protected void clear() {
        IActiveJvm jvm = section.getJvm();
        if (jvm != null) {
            jvm.getMBeanServer().getMBeanNotification().clear(objectName);
        }
    }

    /**
     * Creates the message page.
     */
    private void createMessagePage() {
        messagePage = new Composite(this, SWT.NONE);
        messagePage.setLayout(new GridLayout(3, false));
        FormToolkit toolkit = new FormToolkit(Display.getDefault());

        toolkit.createLabel(messagePage, Messages.notificationsNotSubscribedMsg);
        Hyperlink hyperlink = toolkit.createHyperlink(messagePage, Messages.subscribeLinkLabel, SWT.NONE);
        toolkit.createLabel(messagePage, Messages.notificationsLabel);

        hyperlink.addHyperlinkListener(new HyperlinkAdapter() {

            @Override
            public void linkActivated(HyperlinkEvent e) {
                subscribeAction.run();
            }
        });
    }

    @Override
    String getTabText() {
        return Messages.notificationsTabLabel;
    }

    @Override
    String getTabImagePath() {
        return ISharedImages.NOTIFICATION_IMG_PATH;
    }

    /**
     * Update the page.
     * 
     * @param isSubscribed The state indicating if the notification is subscribed
     */
    void updatePage(boolean isSubscribed) {
        if (isSubscribed) {
            showPage(tree);
        } else {
            showPage(messagePage);
        }
    }
}
