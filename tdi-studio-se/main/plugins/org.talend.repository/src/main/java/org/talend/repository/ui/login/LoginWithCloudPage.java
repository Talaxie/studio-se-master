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

import java.io.ByteArrayInputStream;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.preference.PreferenceDialog;
import org.eclipse.jface.preference.PreferenceManager;
import org.eclipse.jface.preference.PreferenceNode;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.program.Program;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.events.HyperlinkAdapter;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.eclipse.ui.forms.widgets.Hyperlink;
import org.osgi.framework.Version;
import org.osgi.service.prefs.BackingStoreException;
import org.osgi.service.prefs.Preferences;
import org.talend.commons.CommonsPlugin;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.utils.VersionUtils;
import org.talend.commons.utils.network.NetworkUtil;
import org.talend.commons.utils.system.EclipseCommandLine;
import org.talend.core.GlobalServiceRegister;
import org.talend.core.model.general.ConnectionBean;
import org.talend.core.model.properties.PropertiesFactory;
import org.talend.core.model.properties.User;
import org.talend.core.prefs.GeneralParametersProvider;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.core.service.ICloudSignOnService;
import org.talend.core.service.IRemoteService;
import org.talend.core.services.ICoreTisService;
import org.talend.core.ui.workspace.ChooseWorkspaceData;
import org.talend.repository.RepositoryPlugin;
import org.talend.repository.i18n.Messages;
import org.talend.repository.ui.login.connections.ConnectionUserPerReader;
import org.talend.repository.ui.login.connections.network.LoginNetworkPreferencePage;
import org.talend.repository.ui.login.connections.network.proxy.LoginProxyPreferencePage;
import org.talend.repository.ui.login.connections.settings.WorkspacePreferencePage;
import org.talend.signon.util.TMCRepositoryUtil;
import org.talend.signon.util.TokenMode;
import org.talend.signon.util.listener.LoginEventListener;
import org.talend.utils.io.FilesUtils;
import org.talend.utils.json.JSONObject;
import org.talend.utils.string.DigestUtil;

public class LoginWithCloudPage extends AbstractLoginActionPage implements LoginEventListener {

    private static final Logger LOGGER = Logger.getLogger(LoginWithCloudPage.class);

    private static final String SHOW_WELCOME_INFO_KEY = "LoginWithCloudPage.showWelcomeInfo";

    protected Label title;

    private Button networkSettingsButton;

    protected String licenseString;

    private Button signCloudButton;

    private Button otherSignButton;

    private Color messagePanelColor = new Color(null, 205, 227, 242);

    private String codeVerifier = ICloudSignOnService.get().generateCodeVerifier();

    private boolean isRefreshToken = false;

    private Composite firstInfoComposite = null;

    private Hyperlink imageLink = null;

    private boolean isSignOnCloud;

    private IRemoteService remoteService;
    
    private ICoreTisService coreTisService;

    public LoginWithCloudPage(Composite parent, LoginDialogV2 dialog, int style) {
        super(parent, dialog, style);
    }

    public LoginWithCloudPage(Composite parent, LoginDialogV2 dialog, int style, boolean isRefreshToken) {
        super(parent, dialog, style);
        this.isRefreshToken = isRefreshToken;
    }

    @Override
    public void preCreateControl() {
        // nothing need to do
    }

    @Override
    public void instantiateControl(Composite container) {
        if (isShowWelcomeInfo()) {
            firstInfoComposite = new Canvas(container, SWT.DOUBLE_BUFFERED);
            GridLayout compositeLayout = new GridLayout(3, false);
            firstInfoComposite.setLayout(compositeLayout);
            firstInfoComposite.addPaintListener(new PaintListener() {

                @Override
                public void paintControl(PaintEvent e) {
                    drawMessageBackground(e, firstInfoComposite);
                }
            });

            Label imageLabel = new Label(firstInfoComposite, SWT.None);
            imageLabel.setImage(JFaceResources.getImage(Dialog.DLG_IMG_MESSAGE_INFO));
            imageLabel.setBackground(messagePanelColor);
            GridData gridData = new GridData(SWT.BEGINNING, SWT.CENTER, false, false);
            imageLabel.setLayoutData(gridData);

            Label infoLabel1 = new Label(firstInfoComposite, SWT.None);
            infoLabel1.setText(Messages.getString("LoginWithCloudPage.titleFirstLbl1"));
            infoLabel1.setBackground(messagePanelColor);
            gridData = new GridData(SWT.FILL, SWT.CENTER, false, false);
            gridData.horizontalSpan = 2;
            infoLabel1.setLayoutData(gridData);

            Label holderLabel = new Label(firstInfoComposite, SWT.None);
            gridData = new GridData(SWT.BEGINNING, SWT.CENTER, false, false);
            holderLabel.setLayoutData(gridData);

            Label infoLabel2 = new Label(firstInfoComposite, SWT.None);
            infoLabel2.setText(Messages.getString("LoginWithCloudPage.titleFirstLbl2"));
            infoLabel2.setBackground(messagePanelColor);
            gridData = new GridData(SWT.FILL, SWT.CENTER, false, false);
            infoLabel2.setLayoutData(gridData);

            Composite moreInfoCom = new Composite(firstInfoComposite, SWT.None);
            compositeLayout = new GridLayout(2, false);
            compositeLayout.marginWidth = 0;
            compositeLayout.marginHeight = 0;
            moreInfoCom.setLayout(compositeLayout);
            moreInfoCom.setBackground(messagePanelColor);

            imageLink = new Hyperlink(moreInfoCom, SWT.NONE);
            imageLink.setText(Messages.getString("LoginWithCloudPage.titleFirstLinkLbl"));
            imageLink.setUnderlined(true);
            imageLink.setBackground(messagePanelColor);
            imageLink.addHyperlinkListener(new HyperlinkAdapter() {

                @Override
                public void linkActivated(HyperlinkEvent e) {
                    onMoreInfoLinkClicked(e);
                }
            });
            Label moreImageLabel = new Label(moreInfoCom, SWT.RIGHT);
            ImageDescriptor imageDescriptor = ImageDescriptor
                    .createFromURL(RepositoryPlugin.class.getResource("/icons/moreInfo.png"));
            moreImageLabel.setImage(imageDescriptor.createImage());
            moreImageLabel.setBackground(messagePanelColor);
        }

        title = new Label(container, SWT.WRAP);
        title.setFont(LoginDialogV2.fixedFont);
        title.setText(Messages.getString("LoginWithCloudPage.titleLbl")); //$NON-NLS-1$

        signCloudButton = new Button(container, SWT.FLAT);
        signCloudButton.setFont(LoginDialogV2.fixedFont);
        signCloudButton.setText(Messages.getString("LoginWithCloudPage.signCloudBtn"));

        otherSignButton = new Button(container, SWT.FLAT);
        otherSignButton.setFont(LoginDialogV2.fixedFont);
        otherSignButton.setText(Messages.getString("LoginWithCloudPage.otherSignBtn"));

        networkSettingsButton = new Button(container, SWT.NONE);
        networkSettingsButton.setFont(LoginDialogV2.fixedFont);
        networkSettingsButton.setText(Messages.getString("LoginWithCloudPage.networkSettings"));//$NON-NLS-1$

        if (isRefreshToken) {
            title.setText(Messages.getString("LoginWithCloudPage.titleLblRelogin")); //$NON-NLS-1$
            otherSignButton.setText(Messages.getString("LoginWithCloudPage.exitBtn"));
        }
    }

    private void drawMessageBackground(PaintEvent e, Control ctrl) {
        e.gc.setBackground(messagePanelColor);
        e.gc.setAntialias(SWT.ON);
        e.gc.setInterpolation(SWT.HIGH);
        Point size = ctrl.getSize();
        e.gc.fillRoundRectangle(0, 0, size.x, size.y, 15, 15);
    }

    @Override
    protected void layoutControl() {
        if (firstInfoComposite != null) {
            int offset = (firstInfoComposite.computeSize(SWT.DEFAULT, SWT.DEFAULT).x) / 2 * -1;
            FormData formData = new FormData();
            formData.top = new FormAttachment(0, 0);
            formData.left = new FormAttachment(50, offset);
            firstInfoComposite.setLayoutData(formData);
        }

        int offset = (title.computeSize(SWT.DEFAULT, SWT.DEFAULT).x) / 2 * -1;
        FormData formData = new FormData();
        if (firstInfoComposite != null) {
            formData.top = new FormAttachment(firstInfoComposite, 20);
        } else {
            formData.top = new FormAttachment(20, 0);
        }
        formData.left = new FormAttachment(50, offset);
        title.setLayoutData(formData);

        offset = signCloudButton.computeSize(SWT.DEFAULT, SWT.DEFAULT).x / 2 * -1;
        formData = new FormData();
        formData.top = new FormAttachment(title, 20, SWT.BOTTOM);
        formData.left = new FormAttachment(50, offset);
        signCloudButton.setLayoutData(formData);

        offset = otherSignButton.computeSize(SWT.DEFAULT, SWT.DEFAULT).x / 2 * -1;
        formData = new FormData();
        formData.top = new FormAttachment(signCloudButton, 20, SWT.BOTTOM);
        formData.left = new FormAttachment(50, offset);
        otherSignButton.setLayoutData(formData);

        if (this.networkSettingsButton != null) {
            offset = networkSettingsButton.computeSize(SWT.DEFAULT, SWT.DEFAULT).x / 2 * -1;
            formData = new FormData();
            formData.top = new FormAttachment(100, -50);
            formData.left = new FormAttachment(50, offset);
            networkSettingsButton.setLayoutData(formData);
        }
    }

    private boolean isShowWelcomeInfo() {
        Preferences node = new ConfigurationScope().getNode(ChooseWorkspaceData.ORG_TALEND_WORKSPACE_PREF_NODE);
        boolean showWelcomeInfo = node.getBoolean(SHOW_WELCOME_INFO_KEY, true);
        return showWelcomeInfo;
    }

    private void saveShowWelcomeInfo() {
        Preferences node = new ConfigurationScope().getNode(ChooseWorkspaceData.ORG_TALEND_WORKSPACE_PREF_NODE);
        node.putBoolean(SHOW_WELCOME_INFO_KEY, false);
        try {
            node.flush();
        } catch (BackingStoreException e) {
            LOGGER.error("failed to store workspace location in preferences :", e); //$NON-NLS-1$
        }
    }

    protected void layoutRemotely() {

    }

    @Override
    public void init() throws Throwable {
        super.init();
    }

    @Override
    public void afterCreateControl() {
    }

    @Override
    public void refreshUIData() {
        // nothing need to do
    }

    @Override
    public void check() {
        // nothing need to do
    }

    @Override
    public void addListeners() {
        signCloudButton.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                isSignOnCloud = true;
                try {
                    ICloudSignOnService.get().signonCloud(LoginWithCloudPage.this);
                } catch (Exception e1) {
                    showError(e1);
                }
            }
        });

        if (otherSignButton != null) {
            otherSignButton.addSelectionListener(new SelectionAdapter() {

                @Override
                public void widgetSelected(SelectionEvent e) {
                    if (!isRefreshToken) {
                        isSignOnCloud = false;
                        removeSSOConnection();
                        try {
                            gotoNextPage();
                        } catch (Throwable e1) {
                            showError(e1);
                        }
                    } else {
                        try {
                            if (CommonsPlugin.isDebugMode()) {
                                LOGGER.info("Logoff Project");
                            }
                            ProxyRepositoryFactory.getInstance().logOffProject();
                            if (PlatformUI.isWorkbenchRunning()) {
                                PlatformUI.getWorkbench().close();
                            }
                            if (CommonsPlugin.isDebugMode()) {
                                LOGGER.info("Close workbench");
                            }
                            System.exit(0);
                        } catch (Exception e1) {
                            showError(e1);
                        }
                    }
                }
            });
        }

        if (networkSettingsButton != null) {
            networkSettingsButton.addSelectionListener(new SelectionAdapter() {

                @Override
                public void widgetSelected(SelectionEvent e) {
                    onNetworkSettingsClicked();
                }

            });
        }
    }

    @Override
    public Object getCheckedErrors() {
        return null;
    }

    protected String getRecentWorkSpace() {
        String filePath = new Path(Platform.getInstanceLocation().getURL().getPath()).toFile().getPath();
        return filePath;
    }

    private void showError(Throwable e) {
        String message = null;
        if (e instanceof InvocationTargetException && ((InvocationTargetException) e).getTargetException() != null) {
            message = ((InvocationTargetException) e).getTargetException().getMessage();
        } else {
            message = e.getMessage();
        }
        MessageDialog.openError(Display.getDefault().getActiveShell(), getShell().getText(), message);
    }

    @Override
    public void loginStart() {
        if (!isShowingCurrentPage()) {
            return;
        }
        Display.getDefault().asyncExec(() -> {
            errorManager.setInfoMessage(Messages.getString("LoginWithCloudPage.signInTaskFirst"));
        });
    }

    @Override
    public void loginStop(String authCode, String dataCenter) {
        if (!isShowingCurrentPage()) {
            return;
        }
        Display.getDefault().asyncExec(() -> {
            errorManager.setInfoMessage(Messages.getString("LoginWithCloudPage.signInTaskSec"));
            loginDialog.getShell().forceActive();
        });
        try {
            TokenMode token = ICloudSignOnService.get().getToken(authCode, this.codeVerifier, dataCenter);
            if (CommonsPlugin.isDebugMode()) {
                LOGGER.info("Access token SHA256 is:"
                        + DigestUtil.sha256Hex(token.getAccessToken().getBytes()) + "\t Refresh token SHA256 is:" + DigestUtil.sha256Hex(token.getRefreshToken().getBytes()));
            }
            ConnectionBean conn = saveConnection(token, TMCRepositoryUtil.getCloudAdminURL(dataCenter),
                    ICloudSignOnService.get().getTokenUser(TMCRepositoryUtil.getCloudAdminURL(dataCenter), token));
            TMCRepositoryUtil.saveRecentDataCenter(dataCenter);
            LoginHelper.getInstance().setCurrentSelectedConnBean(conn);
            if (isRefreshToken) {
                Display.getDefault().asyncExec(() -> {
                    loginDialog.okPressed();
                });
            } else {
                Display.getDefault().asyncExec(() -> {
                    errorManager.setInfoMessage(Messages.getString("LoginWithCloudPage.fetchLicenseTask"));
                });
                setRepositoryContextInContext(conn);
                boolean isSameLicense = fetchLicense(conn);
                if (!isSameLicense) {
                    Display.getDefault().asyncExec(() -> {
                        boolean validResult = validateLicense(true, true);
                        if (validResult) {
                            EclipseCommandLine.updateOrCreateExitDataPropertyWithCommand(EclipseCommandLine.TALEND_RELOAD_COMMAND,
                                    "true", //$NON-NLS-1$
                                    false);
                            LoginHelper.isRestart = true;
                            this.loginDialog.okPressed();
                        }
                    });
                } else {
                    Display.getDefault().asyncExec(() -> {
                        try {
                            errorManager.clearAllMessages();
                            this.gotoNextPage();
                        } catch (Throwable e) {
                            Display.getDefault().asyncExec(() -> {
                                errorManager.setErrMessage(e.getLocalizedMessage());
                            });
                            ExceptionHandler.process(e);
                        }
                    });
                }
            }
        } catch (Exception e) {
            Display.getDefault().asyncExec(() -> {
                errorManager.setErrMessage(e.getLocalizedMessage());
            });
            ExceptionHandler.process(e);
        }
    }

    @Override
    public void loginFailed(Exception ex) {
        if (!isShowingCurrentPage()) {
            return;
        }
        Display.getDefault().asyncExec(() -> {
            errorManager.setErrMessage(ex.getMessage());
        });
    }

    private boolean isShowingCurrentPage() {
        if (signCloudButton == null || signCloudButton.isDisposed()) {
            return false;
        }
        return true;
    }

    public void setRepositoryContextInContext(ConnectionBean conn) {
        LoginHelper.setRepositoryContextInContext(conn, getUser(conn), null, null);
    }

    public User getUser(ConnectionBean conn) {
        User toReturn = PropertiesFactory.eINSTANCE.createUser();
        toReturn.setLogin(conn.getUser());
        return toReturn;
    }

    private boolean fetchLicense(ConnectionBean connection) throws Exception {
        File licenseFile = this.getCoreTisService().getLicenseFile();
        long codeCurrent = FilesUtils.getChecksumAlder32(licenseFile);
        JSONObject jsonObj = getRemoteService().getLicenseKey(connection.getUser(),
                connection.getConnectionToken().getAccessToken(), connection.getUrl(), "");
        licenseString = jsonObj.getString("customerName") + "_" + jsonObj.getString("licenseKey"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        long codeNew= FilesUtils.getChecksumAlder32( new ByteArrayInputStream(licenseString.getBytes()));
        if (codeCurrent != codeNew) {
            getCoreTisService().storeLicenseAndUpdateConfig(licenseString);
            return false;
        }
        return true;
    }

    protected boolean validateLicense(boolean isFromRemote, boolean showLicenseNeeded) {
        boolean validateResult = false;
        if (licenseString == null || licenseString.isEmpty()) {
            if (showLicenseNeeded) {
                errorManager.setErrMessage(Messages.getString("LoginWithCloudPage.licenseNeeded")); //$NON-NLS-1$
            }
            return validateResult;
        }
        String message = ""; //$NON-NLS-1$
        List<StyleRange> styleRangeList = new ArrayList<StyleRange>();
        int endIndex = 0;
        try {
            message = Messages.getString("LoginWithCloudPage.LicenseInfo") + " "; //$NON-NLS-1$ //$NON-NLS-2$
            int startIndex = message.length();
            StyleRange styleRange = new StyleRange();
            styleRangeList.add(styleRange);
            styleRange.font = loginDialog.errorFont;
            styleRange.foreground = LoginDialogV2.WHITE_COLOR;
            styleRange.start = 0;
            styleRange.length = startIndex;

            String product = getCoreTisService().getLicenseProductName(licenseString);
            if (product != null && !product.trim().isEmpty()) {
                message = message + product + " "; //$NON-NLS-1$
            }

            product = getCoreTisService().getLicenseProductEdition(licenseString);
            if (product != null && !product.trim().isEmpty()) {
                message = message + product + " "; //$NON-NLS-1$
            }

            endIndex = message.length();
            styleRange = new StyleRange();
            styleRangeList.add(styleRange);
            styleRange.font = loginDialog.errorFontBorder;
            styleRange.foreground = LoginDialogV2.WHITE_COLOR;
            styleRange.start = startIndex;
            styleRange.length = endIndex - startIndex;

            if (getCoreTisService().isLicenseExpired(licenseString)) {
                message += Messages.getString("LoginWithCloudPage.hasExpired"); //$NON-NLS-1$
            } else if (!getCoreTisService().isLicenseVersionCorrect(licenseString)) {
                message += Messages.getString("LoginWithCloudPage.notCorrect"); //$NON-NLS-1$
            } else {
                validateResult = true;
                message += Messages.getString("LoginWithCloudPage.lblMessage2"); //$NON-NLS-1$
            }
        } catch (Throwable e) {
            if (e instanceof InvocationTargetException && ((InvocationTargetException) e).getTargetException() != null) {
                message = ((InvocationTargetException) e).getTargetException().getMessage();
            } else {
                message = e.getMessage();
            }
        }

        StyleRange styleRange = new StyleRange();
        styleRangeList.add(styleRange);
        styleRange.font = loginDialog.errorFont;
        styleRange.foreground = LoginDialogV2.WHITE_COLOR;
        styleRange.start = endIndex;
        styleRange.length = message.length() - endIndex;

        if (validateResult) {
            errorManager.setInfoMessage(message, styleRangeList);
        } else {
            errorManager.setErrMessage(message, styleRangeList);
        }
        return validateResult;
    }

    public IRemoteService getRemoteService() {
        if (remoteService == null) {
            if (GlobalServiceRegister.getDefault().isServiceRegistered(IRemoteService.class)) {
                remoteService = (IRemoteService) GlobalServiceRegister.getDefault().getService(IRemoteService.class);
            }
        }
        return remoteService;
    }
    
    public ICoreTisService getCoreTisService() {
        if (coreTisService == null) {
            if (GlobalServiceRegister.getDefault().isServiceRegistered(IRemoteService.class)) {
                coreTisService = (ICoreTisService) GlobalServiceRegister.getDefault().getService(ICoreTisService.class);
            }
        }
        return coreTisService;
    }

    private void removeSSOConnection() {
        ConnectionUserPerReader reader = ConnectionUserPerReader.getInstance();
        List<ConnectionBean> list = reader.forceReadConnections();
        Iterator<ConnectionBean> connectionBeanIter = list.iterator();
        while (connectionBeanIter.hasNext()) {
            if (connectionBeanIter.next().isLoginViaCloud()) {
                connectionBeanIter.remove();
            }
        }
        reader.saveConnections(list);
        LoginHelper.destroy(); // Reload connections
    }

    private ConnectionBean saveConnection(TokenMode token, String adminURL, String user) {
        ConnectionUserPerReader reader = ConnectionUserPerReader.getInstance();
        List<ConnectionBean> list = reader.forceReadConnections();
        Iterator<ConnectionBean> connectionBeanIter = list.iterator();
        while (connectionBeanIter.hasNext()) {
            if (connectionBeanIter.next().isLoginViaCloud()) {
                connectionBeanIter.remove();
            }
        }
        ConnectionBean connection = ConnectionBean.getDefaultCloudConnectionBean(token.getDataCenter());
        list.add(connection);
        
        connection.setConnectionToken(token);
        connection.setUrl(adminURL);
        connection.setUser(user);

        reader.saveConnections(list);
        reader.saveLastConnectionBean(connection);
        
        ICloudSignOnService.get().reload();
        return connection;
    }

    @Override
    public String getCodeChallenge() {
        String codeChallenge = null;
        try {
            if (ICloudSignOnService.get() != null) {
                codeChallenge = ICloudSignOnService.get().getCodeChallenge(codeVerifier);
            }
        } catch (Exception ex) {
            Display.getDefault().asyncExec(() -> {
                errorManager.setErrMessage(ex.getLocalizedMessage());
            });
            ExceptionHandler.process(ex);
        }
        return codeChallenge;
    }

    public void onNetworkSettingsClicked() {
        PreferenceDialog pd = new PreferenceDialog(Display.getDefault().getActiveShell(), new PreferenceManager());

        LoginProxyPreferencePage prefPage = new LoginProxyPreferencePage();
        prefPage.setTitle(Messages.getString("LoginProxyPreferencePage.proxy.title"));
        pd.getPreferenceManager().addToRoot(new PreferenceNode("proxyPage", prefPage));

        LoginNetworkPreferencePage networkPage = new LoginNetworkPreferencePage();
        networkPage.setTitle(Messages.getString("LoginProxyPreferencePage.timeout.title"));
        pd.getPreferenceManager().addToRoot(new PreferenceNode("timeoutPage", networkPage));

        WorkspacePreferencePage workspacePage = new WorkspacePreferencePage() {

            @Override
            public void restart() throws Exception {
                doRestart();
            };

        };
        pd.getPreferenceManager().addToRoot(new PreferenceNode("workspace", workspacePage));

        int open = pd.open();
        if (Window.OK == open) {
            NetworkUtil.loadAuthenticator();
        }
    }

    private void doRestart() {
        loginDialog.close();
    }

    private void onMoreInfoLinkClicked(HyperlinkEvent e) {
        Program.launch(getDocUrl());
    }

    protected String getDocUrl() {
        Version studioVer = new Version(VersionUtils.getInternalVersion());
        String ver = String.valueOf(studioVer.getMajor()) + String.valueOf(studioVer.getMinor());
        String language = GeneralParametersProvider.getOnLineHelpLanguageSetting();
        String url = String.format(TMCRepositoryUtil.ONLINE_HELP_URL, ver, language);
        return url;
    }

    @Override
    public AbstractActionPage getNextPage() {
        AbstractActionPage iNextPage = null;
        if (!isRefreshToken) {
            saveShowWelcomeInfo();
            iNextPage = new LoginProjectPage(getParent(), loginDialog, SWT.NONE, isSignOnCloud);
            setNextPage(iNextPage);
        }

        return iNextPage;
    }
}
