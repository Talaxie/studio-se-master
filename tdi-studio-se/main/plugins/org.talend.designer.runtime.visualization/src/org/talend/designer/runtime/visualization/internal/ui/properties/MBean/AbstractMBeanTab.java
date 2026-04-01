/*******************************************************************************
 * Copyright (c) 2010-2013 JVM Monitor project. All rights reserved.
 * 
 * This code is distributed under the terms of the Eclipse Public License v1.0 which is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.talend.designer.runtime.visualization.internal.ui.properties.MBean;

import javax.management.ObjectName;

import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.part.PageBook;
import org.talend.designer.runtime.visualization.Activator;
import org.talend.designer.runtime.visualization.internal.ui.properties.AbstractJvmPropertySection;

/**
 * The abstract class for MBean tab.
 */
abstract public class AbstractMBeanTab extends PageBook {

    /** The tab item. */
    CTabItem tabItem;

    /** The object name. */
    ObjectName objectName;

    /** The property section. */
    AbstractJvmPropertySection section;

    /** The tab folder. */
    private CTabFolder tabFolder;

    /** The error message page. */
    private Composite errorMessagePage;

    /** The state indicating if invalid input is given. */
    private boolean invalidInput;

    /** The tab image. */
    private Image tabImage;

    /** The label to show message. */
    private Label messageLabel;

    /**
     * The constructor.
     * 
     * @param tabFolder The tab folder
     * @param section The property section
     */
    public AbstractMBeanTab(CTabFolder tabFolder, AbstractJvmPropertySection section) {
        super(tabFolder, SWT.NONE);

        this.tabFolder = tabFolder;
        this.section = section;
        invalidInput = false;

        createErrorMessagePage();
        addTabItem();
    }

    /*
     * @see Widget#dispose()
     */
    @Override
    public void dispose() {
        super.dispose();
        if (tabImage != null) {
            tabImage.dispose();
        }
    }

    /**
     * Notifies that selection has been changed.
     * 
     * @param selection The selection
     */
    final protected void selectionChanged(StructuredSelection selection) {
        objectName = getObjectName(selection);
        if (objectName == null) {
            return;
        }

        invalidInput = false;

        selectionChanged();
    }

    /**
     * Refreshes.
     */
    final protected void refresh() {
        if (invalidInput) {
            return;
        }

        performRefresh();
    }

    /**
     * Invoked when section is deactivated.
     */
    protected void deactivated() {
        Job.getJobManager().cancel(toString());
    }

    /**
     * Adds the tab item.
     */
    void addTabItem() {
        tabItem = new CTabItem(tabFolder, SWT.NONE);
        tabItem.setText(getTabText());
        tabItem.setImage(getTabImage());
        tabItem.setControl(this);
    }

    /**
     * Gets the object name.
     * 
     * @param selection The selection
     * @return The object name
     */
    static ObjectName getObjectName(StructuredSelection selection) {
        Object element = selection.getFirstElement();
        if (element instanceof MBean) {
            return ((MBean) element).getObjectName();
        }

        return null;
    }

    /**
     * Indicates that the given MBean is not supported.
     * 
     * @param e The exception
     */
    void indicateNotSupported(Exception e) {
        Throwable t = e.getCause();
        while (t.getCause() != null) {
            t = t.getCause();
        }

        final String errorMessage = NLS.bind(Messages.mBeanNotSupportedMessage, t.getLocalizedMessage());

        Display.getDefault().asyncExec(new Runnable() {

            @Override
            public void run() {
                messageLabel.setText(errorMessage);
                showPage(errorMessagePage);
            }
        });

        invalidInput = true;
    }

    /**
     * Notifies that selection has been changed.
     */
    abstract void selectionChanged();

    /**
     * Performs the refresh for tab specific things.
     */
    abstract void performRefresh();

    /**
     * Gets the tab text.
     * 
     * @return The tab text
     */
    abstract String getTabText();

    /**
     * Gets the path to tab image.
     * 
     * @return The path to tab image
     */
    abstract String getTabImagePath();

    /**
     * Creates the error message page.
     */
    private void createErrorMessagePage() {
        errorMessagePage = new Composite(this, SWT.NONE);
        errorMessagePage.setLayout(new FillLayout());
        errorMessagePage.setBackground(Display.getDefault().getSystemColor(SWT.COLOR_LIST_BACKGROUND));

        FormToolkit toolkit = new FormToolkit(Display.getDefault());
        messageLabel = toolkit.createLabel(errorMessagePage, ""); //$NON-NLS-1$
    }

    /**
     * Gets the tab image.
     * 
     * @return The tab image
     */
    private Image getTabImage() {
        if (tabImage == null || tabImage.isDisposed()) {
            tabImage = Activator.getImageDescriptor(getTabImagePath()).createImage();
        }
        return tabImage;
    }
}
