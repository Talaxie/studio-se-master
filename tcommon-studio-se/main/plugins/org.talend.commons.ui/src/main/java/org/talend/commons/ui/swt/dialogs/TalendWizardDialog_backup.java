// ============================================================================
//
// Copyright (C) 2006-2021 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.commons.ui.swt.dialogs;

import java.lang.reflect.Field;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.resource.JFaceColors;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.ProgressMonitorPart;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.ui.runtime.ColorConstants;


/**
 * DOC cmeng  class global comment. Detailled comment
 */
public class TalendWizardDialog_backup extends WizardDialog {

    private boolean useNewErrorStyle = false;

    /**
     * Warning color: #FCE6D9 <br/>
     * info color: #CDE3F2
     */

    public TalendWizardDialog_backup(Shell parentShell, IWizard newWizard) {
        super(parentShell, newWizard);
        useNewErrorStyle = true;
        this.setTitleAreaColor(new RGB(205, 227, 242));
    }

    public void setNewErrorStyle(boolean newErrStyle) {
        this.useNewErrorStyle = newErrStyle;
    }

    @Override
    protected Control createContents(Composite parent) {
        parent.setBackground(ColorConstants.WHITE_COLOR);
        Control panel = super.createContents(parent);
        Display display = parent.getDisplay();
        Color background = JFaceColors.getBannerBackground(display);
        Color foreground = JFaceColors.getBannerForeground(display);
        try {
            Field workAreaField = TitleAreaDialog.class.getDeclaredField("workArea");
            workAreaField.setAccessible(true);
            Composite workArea = (Composite) workAreaField.get(this);
            workArea.setBackground(ColorConstants.WHITE_COLOR);
            Field pageContainerField = WizardDialog.class.getDeclaredField("pageContainer");
            pageContainerField.setAccessible(true);
            Composite pageContainer = (Composite) pageContainerField.get(this);
            pageContainer.setBackground(ColorConstants.WHITE_COLOR);
            if (useNewErrorStyle()) {
                FormData formData = (FormData) workArea.getLayoutData();
                formData.top = new FormAttachment(0);
            }
            Field bottomFillerLabelField = TitleAreaDialog.class.getDeclaredField("bottomFillerLabel");
            bottomFillerLabelField.setAccessible(true);
            Composite bottomFillerLabel = (Composite) bottomFillerLabelField.get(this);
            bottomFillerLabel.setVisible(false);
        } catch (Exception e) {
            ExceptionHandler.process(e);
        }
        return panel;
    }

    @Override
    public void setMessage(String newMessage) {
        if (useNewErrorStyle()) {
            ExceptionHandler.log(newMessage);
        } else {
            super.setMessage(newMessage);
        }
    }

    @Override
    public void setMessage(String newMessage, int newType) {
        if (useNewErrorStyle()) {
            ExceptionHandler.log(newMessage);
        } else {
            super.setMessage(newMessage, newType);
        }
    }

    @Override
    public void setErrorMessage(String newErrorMessage) {
        if (useNewErrorStyle()) {
            ExceptionHandler.log(newErrorMessage);
        } else {
            super.setErrorMessage(newErrorMessage);
        }
    }

    private boolean useNewErrorStyle() {
        return this.useNewErrorStyle;
    }

    @Override
    protected Control createDialogArea(Composite parent) {
        Composite panel = (Composite) super.createDialogArea(parent);
        Control[] children = panel.getChildren();
        for (Control child : children) {
            child.setBackground(ColorConstants.WHITE_COLOR);
            if (child instanceof Label) {
                int style = child.getStyle();
                if (0 < (style & SWT.HORIZONTAL) && 0 < (style & SWT.SEPARATOR)) {
                    child.setVisible(false);
                }
            }
        }
        return panel;
    }

    @Override
    protected ProgressMonitorPart createProgressMonitorPart(Composite composite, GridLayout pmlayout) {
        ProgressMonitorPart progMonitor = super.createProgressMonitorPart(composite, pmlayout);
        progMonitor.setBackground(ColorConstants.WHITE_COLOR);
        return progMonitor;
    }

    @Override
    protected Control createButtonBar(Composite parent) {
        Composite composite = new Composite(parent, SWT.NONE);
        composite.setBackground(ColorConstants.WHITE_COLOR);
        GridLayout layout = new GridLayout();
        layout.marginWidth = 0;
        layout.marginHeight = 0;
        layout.horizontalSpacing = 0;
        composite.setLayout(layout);
        composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false));
        composite.setFont(parent.getFont());

        Control helpControl = null;
        // create help control if needed
        if (isHelpAvailable()) {
            helpControl = createHelpControl(composite);
            ((GridData) helpControl.getLayoutData()).horizontalIndent = convertHorizontalDLUsToPixels(
                    IDialogConstants.HORIZONTAL_MARGIN);
        }
        createButtonsForButtonBar(composite);

        Button helpButton = getButton(IDialogConstants.HELP_ID);
        Button finishButton = getButton(IDialogConstants.FINISH_ID);
        Button cancelButton = getButton(IDialogConstants.CANCEL_ID);
        Button backButton = getButton(IDialogConstants.BACK_ID);
        Button nextButton = getButton(IDialogConstants.NEXT_ID);

        FormLayout formLayout = new FormLayout();
        formLayout.marginWidth = 10;
        formLayout.marginHeight = 20;
        composite.setLayout(formLayout);
        final int HORIZON_ALIGN = 5;

        FormData cancelData = new FormData();
        cancelData.left = new FormAttachment(0);
        cancelData.top = new FormAttachment(composite, 0, SWT.CENTER);
        cancelData.width = getButtonWidth(cancelButton);
        cancelButton.setLayoutData(cancelData);

        Control tmpCtrl = cancelButton;

        if (helpControl != null) {
            FormData formData = new FormData();
            formData.left = new FormAttachment(tmpCtrl, HORIZON_ALIGN, SWT.RIGHT);
            formData.top = new FormAttachment(tmpCtrl, 0, SWT.CENTER);
            helpControl.setLayoutData(formData);
            tmpCtrl = helpControl;
        }
        if (helpButton != null) {
            FormData formData = new FormData();
            formData.left = new FormAttachment(tmpCtrl, HORIZON_ALIGN, SWT.RIGHT);
            formData.top = new FormAttachment(tmpCtrl, 0, SWT.CENTER);
            formData.width = getButtonWidth(helpButton);
            helpButton.setLayoutData(formData);
            tmpCtrl = helpButton;
        }
        FormData finishData = new FormData();
        finishData.right = new FormAttachment(100);
        finishData.top = new FormAttachment(composite, 0, SWT.CENTER);
        finishData.width = getButtonWidth(finishButton);
        finishButton.setLayoutData(finishData);
        tmpCtrl = finishButton;

        if (nextButton != null) {
            FormData nextData = new FormData();
            Composite nextParentCtrl = nextButton.getParent();
            nextData.right = new FormAttachment(tmpCtrl, -HORIZON_ALIGN, SWT.LEFT);
            nextData.top = new FormAttachment(tmpCtrl, 0, SWT.CENTER);
            nextParentCtrl.setLayoutData(nextData);
        }
        if (false) {
            if (nextButton != null) {
                FormData nextData = new FormData();
                nextData.right = new FormAttachment(tmpCtrl, -HORIZON_ALIGN, SWT.LEFT);
                nextData.top = new FormAttachment(tmpCtrl, 0, SWT.CENTER);
                nextData.width = getButtonWidth(nextButton);
                nextButton.setLayoutData(nextData);
            }
            if (backButton != null) {
                FormData backData = new FormData();
                backData.right = new FormAttachment(tmpCtrl, -HORIZON_ALIGN, SWT.LEFT);
                backData.top = new FormAttachment(tmpCtrl, 0, SWT.CENTER);
                backData.width = getButtonWidth(backButton);
                backButton.setLayoutData(backData);
            }
        }

        return composite;
    }

    private int getButtonWidth(Button btn) {
        int widthHint = convertHorizontalDLUsToPixels(IDialogConstants.BUTTON_WIDTH);
        Point minSize = btn.computeSize(SWT.DEFAULT, SWT.DEFAULT, true);
        return Math.max(widthHint, minSize.x);
    }

}
