// ============================================================================
//
// Copyright (C) 2006-2021 Talaxie Inc. - www.deilink.fr
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talaxie SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.repository.ui.login;

import java.awt.Desktop;
import java.net.URI;

import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Resource;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Link;
import org.talend.commons.exception.BusinessException;
import org.talend.commons.exception.CommonExceptionHandler;
import org.talend.commons.ui.swt.dialogs.ErrorDialogWidthDetailArea;
import org.talend.registration.RegistrationPlugin;
import org.talend.registration.license.LicenseManagement;
import org.talend.repository.i18n.Messages;

/**
 * created by cmeng on May 12, 2015 Detailled comment
 *
 */
public class LoginAgreementPage extends AbstractLoginActionPage {

    protected static final String LICENSE_FILE_PATH = "/license.txt"; //$NON-NLS-1$

    protected static final String LICENSE_FILE_PATH_HTML = "/license.html"; //$NON-NLS-1$

    private Button acceptButton;

    private Label licenseAgreementLabel;

    private Button acceptCheckbox;

    private Label iHaveReadLabel;

    private Link agreementLink;

    public LoginAgreementPage(Composite parent, LoginDialogV2 dialog, int style) {
        super(parent, dialog, style);
    }

    @Override
    public void createControl(Composite parentCtrl) {
        Composite container = new Composite(parentCtrl, SWT.NONE);
        container.setLayout(new FormLayout());
        // image
        Label imageLabel = new Label(container, SWT.RIGHT);
        ImageDescriptor imageDescriptor = ImageDescriptor.createFromURL(this.getClass().getResource("/icons/License.png"));
        Image image = imageDescriptor.createImage();
        addResourceDisposeListener(imageLabel, image);
        imageLabel.setImage(image);

        FormData layoutData = new FormData();
        layoutData.top = new FormAttachment(10);
        layoutData.right = new FormAttachment(50, imageLabel.getImage().getBounds().width / 2);
        imageLabel.setLayoutData(layoutData);

        // License agreement
        licenseAgreementLabel = new Label(container, SWT.CENTER);
        licenseAgreementLabel.setText(Messages.getString("LoginAgreementPage.LicenseAgreement"));
        Font font = new Font(container.getDisplay(), "Arial", 16, SWT.BOLD);
        addResourceDisposeListener(licenseAgreementLabel, font);
        licenseAgreementLabel.setFont(font);
        int textHeight = licenseAgreementLabel.computeSize(SWT.DEFAULT, SWT.DEFAULT).y;
        layoutData = new FormData();
        layoutData.top = new FormAttachment(40);
        layoutData.height = textHeight + 2;
        layoutData.right = new FormAttachment(50, licenseAgreementLabel.computeSize(SWT.DEFAULT, SWT.DEFAULT).x / 2);
        licenseAgreementLabel.setLayoutData(layoutData);

        // accept checkbox
        acceptCheckbox = new Button(container, SWT.CHECK);
        layoutData = new FormData();
        layoutData.top = new FormAttachment(60);
        layoutData.right = new FormAttachment(10);
        acceptCheckbox.setLayoutData(layoutData);

        int offset = 0;
        if (Platform.OS_WIN32.equals(Platform.getOS()) || Platform.OS_LINUX.equals(Platform.getOS())) {
            offset = 6;
        }

        // I have Read
        iHaveReadLabel = new Label(container, SWT.CENTER);
        iHaveReadLabel.setText(Messages.getString("LoginAgreementPage.readAndAccept"));
        layoutData = new FormData();
        layoutData.top = new FormAttachment(60);
        layoutData.left = new FormAttachment(acceptCheckbox, offset);
        iHaveReadLabel.setLayoutData(layoutData);

        // deilink link
        agreementLink = new Link(container, SWT.NONE);
        agreementLink .setText("<a href=\"" + Messages.getString("LoginAgreementPage.QlikURL") + "\">" + Messages.getString("LoginAgreementPage.QlikAgreement") + "</a>"); //$NON-NLS-2$
        layoutData = new FormData();
        layoutData.top = new FormAttachment(60);
        layoutData.left = new FormAttachment(iHaveReadLabel, offset);
        agreementLink.setLayoutData(layoutData);

        acceptButton = new Button(container, SWT.CENTER);
        acceptButton.setBackground(backgroundBtnColor);
        acceptButton.setFont(LoginDialogV2.fixedFont);
        acceptButton.setText(Messages.getString("LoginAgreementPage.Next")); //$NON-NLS-1$
        acceptButton.setEnabled(false);
        FormData acceptButtonFormLayoutData = new FormData();
        acceptButtonFormLayoutData.bottom = new FormAttachment(100, 0);
        acceptButtonFormLayoutData.right = new FormAttachment(100, 0);
        acceptButtonFormLayoutData.left = new FormAttachment(100, -1 * LoginDialogV2.getNewButtonSize(acceptButton).x);
        acceptButton.setLayoutData(acceptButtonFormLayoutData);
    }


    @Override
    public AbstractActionPage getNextPage() {
        AbstractActionPage iNextPage = loginDialog.getFirstTimeStartupPageIfNeeded();
        if (iNextPage == null) {
            if (loginDialog.isShowSSOPage()) {
                iNextPage = new LoginWithCloudPage(getParent(), loginDialog, SWT.NONE);
            }else {
                iNextPage = new LoginProjectPage(getParent(), loginDialog, SWT.NONE);
            }
        }
        setNextPage(iNextPage);

        return iNextPage;
    }


    @Override
    public void addListeners() {
        acceptButton.addSelectionListener(new SelectionListener() {

            @Override
            public void widgetSelected(SelectionEvent event) {
                try {
                    LicenseManagement.acceptLicense();
                } catch (BusinessException e) {
                    ErrorDialogWidthDetailArea errorDialog = new ErrorDialogWidthDetailArea(getShell(),
                            RegistrationPlugin.PLUGIN_ID, "", e.getMessage()); //$NON-NLS-1$
                    System.exit(0);
                }

                AbstractActionPage iNextPage = getNextPage();
                if (iNextPage == null) {
                    return;
                }
                try {
                    gotoNextPage();
                } catch (Throwable e1) {
                    CommonExceptionHandler.process(e1);
                }
            }

            @Override
            public void widgetDefaultSelected(SelectionEvent e) {
                // nothing need to do
            }
        });

        acceptCheckbox.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                acceptButton.setEnabled(acceptCheckbox.getSelection());
            }
        });

        agreementLink.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                String href = e.text;
                openBrowser(href);
            }
        });
    }

    private static void openBrowser(String url) {
        if (Desktop.isDesktopSupported()) {
            Desktop desktop = Desktop.getDesktop();
            if (desktop.isSupported(Desktop.Action.BROWSE)) {
                try {
                    URI uri = new URI(url);
                    desktop.browse(uri);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void addResourceDisposeListener(final Control parent, final Resource res) {
        if (parent != null) {
            parent.addDisposeListener(new DisposeListener() {

                public void widgetDisposed(DisposeEvent e) {
                    if (res != null && !res.isDisposed()) {
                        res.dispose();
                    }
                    parent.removeDisposeListener(this);
                }
            });
        }

    }

    @Override
    public void preCreateControl() {
        // nothing need to do
    }

    @Override
    public void afterCreateControl() {
        // nothing need to do
    }

    @Override
    public void refreshUIData() {
        acceptButton.getShell().setDefaultButton(acceptButton);
    }

    @Override
    public void check() {
        // nothing need to do
    }

    @Override
    public Object getCheckedErrors() {
        return null;
    }

}
