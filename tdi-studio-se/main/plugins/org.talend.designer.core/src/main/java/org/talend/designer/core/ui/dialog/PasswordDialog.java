// ============================================================================
//
// Copyright (C) 2006-2022 Talaxie Inc. - www.deilink.fr
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talaxie SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.designer.core.ui.dialog;

import org.apache.commons.lang.StringUtils;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Shell;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.ui.swt.colorstyledtext.ColorStyledText;
import org.talend.core.CorePlugin;
import org.talend.core.utils.TalendQuoteUtils;
import org.talend.designer.core.i18n.Messages;


/**
 * DOC cmeng  class global comment. Detailled comment
 */
public class PasswordDialog extends Dialog {

    public static enum Mode {
        JavaExpression,
        PurePassword,
        all
    }

    private Mode supportMode;

    private Mode currentMode;

    private Composite panel;

    private Composite lineSeperatorPanel;

    private ComboViewer lineSeperator;

    private Link linkLabel;

    private StyledText pwdText;

    private LineSeperatorStyle lineSeperatorStyle;

    private String initPassword = null;

    private String inputPassword = null;

    public PasswordDialog(Shell parentShell, String initPassword, Mode mode) {
        super(parentShell);
        this.initPassword = initPassword;
        this.inputPassword = this.initPassword;
        this.supportMode = mode;
        switch (this.supportMode) {
        case PurePassword:
            currentMode = Mode.PurePassword;
            break;
        default:
            currentMode = Mode.JavaExpression;
            break;
        }
        lineSeperatorStyle = LineSeperatorStyle.LF;
    }

    @Override
    protected void configureShell(Shell shell) {
        super.configureShell(shell);
        shell.setText(Messages.getString("PasswordDialog.title"));
    }

    protected StyledText getPasswordTextControl() {
        return this.pwdText;
    }

    public String getPasswordText() {
        if (isPurePassword()) {
            return formatCRLF(inputPassword);
        }
        return inputPassword;
    }

    private String formatCRLF(String pwd) {
        String newPwd = pwd;
        boolean hasNewLine = newPwd.contains("\n");
        if (hasNewLine) {
            boolean isCrlf = newPwd.contains("\r\n");
            if (LineSeperatorStyle.LF.equals(this.lineSeperatorStyle)) {
                if (isCrlf) {
                    newPwd = newPwd.replaceAll("\r\n", "\n");
                }
            } else {
                if (!isCrlf) {
                    newPwd = newPwd.replaceAll("\n", "\r\n");
                }
            }
        }
        return newPwd;
    }

    public boolean isPurePassword() {
        return this.currentMode == Mode.PurePassword;
    }

    @Override
    protected boolean isResizable() {
        return true;
    }

    @Override
    protected Control createDialogArea(Composite parent) {
        panel = new Composite(parent, SWT.NONE);
        GridData gd = new GridData(GridData.FILL_BOTH);
        gd.widthHint = 640;
        gd.heightHint = 260;
        panel.setLayoutData(gd);
        FormLayout formLayout = new FormLayout();
        formLayout.marginWidth = 30;
        formLayout.marginHeight = 30;
        panel.setLayout(formLayout);

        linkLabel = new Link(panel, SWT.WRAP);
        FormData fd = new FormData();
        fd.left = new FormAttachment(0);
        fd.right = new FormAttachment(100);
        fd.top = new FormAttachment(0);
        linkLabel.setLayoutData(fd);
        linkLabel.setText(getLinkLabelMsg());

        lineSeperatorPanel = new Composite(panel, SWT.NONE);
        fd = new FormData();
        fd.left = new FormAttachment(0);
        fd.right = new FormAttachment(100);
        fd.top = new FormAttachment(linkLabel, 0, SWT.BOTTOM);
        lineSeperatorPanel.setLayoutData(fd);
        FormLayout fl = new FormLayout();
        fl.marginTop = 10;
        lineSeperatorPanel.setLayout(fl);
        Label lineSeperatorLabel = new Label(lineSeperatorPanel, SWT.NONE);
        lineSeperator = new ComboViewer(lineSeperatorPanel, SWT.READ_ONLY);
        lineSeperatorLabel.setText(Messages.getString("PasswordDialog.lineSeperator.label"));
        fd = new FormData();
        fd.right = new FormAttachment(lineSeperator.getControl(), -5, SWT.LEFT);
        fd.top = new FormAttachment(lineSeperator.getControl(), 0, SWT.CENTER);
        lineSeperatorLabel.setLayoutData(fd);
        fd = new FormData();
        fd.right = new FormAttachment(100);
        lineSeperator.getControl().setLayoutData(fd);
        lineSeperator.setLabelProvider(new LineDelimiterLabelProvider());
        lineSeperator.setContentProvider(new ArrayContentProvider());
        lineSeperator.setInput(new LineSeperatorStyle[] { LineSeperatorStyle.LF, LineSeperatorStyle.CRLF });
        lineSeperator.setSelection(new StructuredSelection(lineSeperatorStyle));

//        pwdText = new StyledText(panel, SWT.MULTI | SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
        pwdText = new ColorStyledText(panel, SWT.MULTI | SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL,
                CorePlugin.getDefault().getPreferenceStore(), "java");
        pwdText.setWordWrap(false);
        fd = new FormData();
        fd.left = new FormAttachment(0);
        fd.right = new FormAttachment(100);
        fd.top = new FormAttachment(lineSeperatorPanel, 10, SWT.BOTTOM);
        fd.bottom = new FormAttachment(100);
        pwdText.setLayoutData(fd);
        if (StringUtils.isNotBlank(inputPassword)) {
            pwdText.setText(inputPassword);
        }

        addListeners();
        return panel;
    }

    protected void registContextAssist() {
        // nothing to do
    }

    protected void registValueChangeListener() {
        // nothing to do
    }

    protected void unregistValueChangeListener() {
        // nothing to do
    }

    private void addListeners() {
        if (this.supportMode == Mode.all || this.supportMode == Mode.JavaExpression) {
            registContextAssist();
        }
        checkValueChangeListener();
        onModeChanged();
        linkLabel.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                onSwitch();
            }

        });
        pwdText.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(ModifyEvent e) {
                onPasswordValueChanged(e);
            }
        });
        lineSeperator.addSelectionChangedListener(new ISelectionChangedListener() {

            @Override
            public void selectionChanged(SelectionChangedEvent event) {
                onLineSeperatorChanged(event);
            }
        });
    }

    private void onPasswordValueChanged(ModifyEvent e) {
        inputPassword = pwdText.getText();
    }

    private void onLineSeperatorChanged(SelectionChangedEvent event) {
        IStructuredSelection selection = (IStructuredSelection) lineSeperator.getSelection();
        this.lineSeperatorStyle = (LineSeperatorStyle) selection.getFirstElement();
    }

    private String getLinkLabelMsg() {
        if (this.supportMode == Mode.PurePassword) {
            return Messages.getString("PasswordDialog.note.onlyPwdMode");
        } else if (this.supportMode == Mode.JavaExpression) {
            return Messages.getString("PasswordDialog.note.onlyJavaMode");
        } else if (this.currentMode == Mode.PurePassword) {
            return Messages.getString("PasswordDialog.note.pwdMode",
                    "<a>" + Messages.getString("PasswordDialog.switchTo.javaMode") + "</a>");
        } else {
            return Messages.getString("PasswordDialog.note.javaMode",
                    "<a>" + Messages.getString("PasswordDialog.switchTo.pwdMode") + "</a>");
        }
    }

    private void onModeChanged() {
        FormData fd = (FormData) lineSeperatorPanel.getLayoutData();
        if (this.currentMode == Mode.PurePassword) {
            fd.height = SWT.DEFAULT;
        } else {
            fd.height = 0;
        }
        panel.layout();
    }

    private void onSwitch() {
        if (this.currentMode == Mode.PurePassword) {
            this.currentMode = Mode.JavaExpression;
        } else {
            this.currentMode = Mode.PurePassword;
        }
        checkValueChangeListener();
        linkLabel.setText(getLinkLabelMsg());
        String pwd = this.pwdText.getText();
        if (this.currentMode == Mode.PurePassword) {
            try {
                pwd = TalendQuoteUtils.removeQuotes(pwd);
                pwd = TalendQuoteUtils.checkSlashAndRemoveQuotation(pwd);
            } catch (Exception e) {
                ExceptionHandler.process(e);
            }
            this.pwdText.setText(pwd);
        } else {
            try {
                pwd = escapePassword(formatCRLF(pwd));
            } catch (Exception e) {
                ExceptionHandler.process(e);
            }
            this.pwdText.setText(pwd);
        }
        onPasswordValueChanged(null);
        onModeChanged();
        panel.layout();
    }

    private void checkValueChangeListener() {
        if (this.currentMode == Mode.JavaExpression) {
            registValueChangeListener();
        } else {
            unregistValueChangeListener();
        }
    }

    public String getEscapedPassword() {
        if (isPurePassword()) {
            return escapePassword(getPasswordText());
        } else {
            return getPasswordText();
        }
    }

    private String escapePassword(String pwd) {
        return TalendQuoteUtils.addQuotes(pwd);
    }

    private enum LineSeperatorStyle {

        CRLF(Messages.getString("PasswordDialog.lineSeperator.crlf")),
        LF(Messages.getString("PasswordDialog.lineSeperator.lf"));

        private String label;

        LineSeperatorStyle(String label) {
            this.label = label;
        }

        public String getLabel() {
            return this.label;
        }

    }

    private class LineDelimiterLabelProvider extends LabelProvider {

        @Override
        public String getText(Object element) {
            if (element instanceof LineSeperatorStyle) {
                return ((LineSeperatorStyle) element).getLabel();
            }
            return super.getText(element);
        }

    }

}
