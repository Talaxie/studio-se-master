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
package org.talend.repository.ui.login.connections.settings;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.program.Program;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.ui.runtime.ColorConstants;
import org.talend.commons.ui.runtime.exception.ExceptionMessageDialog;
import org.talend.commons.ui.runtime.image.EImage;
import org.talend.commons.ui.runtime.image.ImageProvider;
import org.talend.core.model.general.ConnectionBean;
import org.talend.core.model.utils.TalendWorkbenchUtil;
import org.talend.core.service.IStudioLiteP2Service;
import org.talend.core.service.IStudioLiteP2Service.UpdateSiteConfig;
import org.talend.core.services.ICoreTisService;
import org.talend.core.ui.branding.IBrandingService;
import org.talend.repository.ProjectManager;
import org.talend.repository.i18n.Messages;
import org.talend.repository.ui.login.LoginHelper;

/**
 * DOC cmeng class global comment. Detailled comment
 */
public class UpdatesitePreferencePage extends PreferencePage {

    IStudioLiteP2Service p2Service = IStudioLiteP2Service.get();

    private Text releaseUriText;

    private Text updateUriText;
    
    private Text baseUserText;

    private Text basePasswordText;

    private Text updateUserText;

    private Text updatePasswordText;
    
    private Button testLocalAuth;
    
    private Label localBaseAuthLabel;
    
    private Label localUpdateAuthLabel;
    
    private Text remoteBaseUserText;

    private Text remoteBasePasswordText;

    private Text remoteUpdateUserText;

    private Text remoteUpdatePasswordText;
    
    private Button remoteTestAuth;
    
    private boolean localBaseChanged = false;
    
    private boolean localUpdateChanged = false;
    
    private boolean remoteBaseChanged = false;

    private boolean remoteUpdateChanged = false;

    private Label remoteBaseAuthLabel;

    private Label remoteUpdateAuthLabel;
    
    private Text remoteReleaseUriText;

    private Text remoteUpdateUriText;

    private Button overwriteRemoteUpdateSettingsBtn;

    private Composite overwriteWarnPanel;

    private Composite panel;

    private Composite remotePanel;

    private Composite overwritePanel;

    private Composite localPanel;

    private Composite warningPanel;
    
    private Label warningDesc;

    private boolean enableTmcUpdateSettings;

    private boolean isCloudConnection = false;

    private boolean isWorkbenchRunning = false;
    
    private Button m2Delete = null;
    
    private static final boolean M2_DELETE_DEFAULT= false;
    
    private static final String LINK_MORE_URL = "https://document-link.us.cloud.talend.com/ts_mg_update-studio?version=80&lang=en&env=prd";
    
    private static final String PROPERTY_REMOVE_M2 = "talend.studio.m2.clean";

    @Override
    protected Control createContents(Composite parent) {
        this.setTitle(Messages.getString("UpdatesitePreferencePage.title"));

        panel = new Composite(parent, SWT.NONE);
        panel.setLayout(new FormLayout());

        FormData fd = null;
        remotePanel = new Composite(panel, SWT.NONE);
        FormLayout formLayout = new FormLayout();
        formLayout.marginBottom = 10;
        remotePanel.setLayout(formLayout);
        fd = new FormData();
        fd.top = new FormAttachment(0);
        fd.left = new FormAttachment(0);
        fd.right = new FormAttachment(100);
        remotePanel.setLayoutData(fd);

        Group remoteGroup = null;
        GridLayout panelLayout = null;
        GridData gd = null;
        ConnectionBean curConnection = LoginHelper.getInstance().getCurrentSelectedConnBean();
        isCloudConnection = LoginHelper.isCloudConnection(curConnection);
        isWorkbenchRunning = PlatformUI.isWorkbenchRunning();
        if (isWorkbenchRunning && isCloudConnection) {
            syncUpdateSettingConfig();
            remoteGroup = new Group(remotePanel, SWT.NONE);
            String projectLabel = "";
            try {
                projectLabel = ProjectManager.getInstance().getCurrentProject().getLabel();
            } catch (Exception e) {
                ExceptionHandler.process(e);
            }
            remoteGroup.setText(Messages.getString("UpdatesitePreferencePage.group.remote", projectLabel));
            fd = new FormData();
            fd.top = new FormAttachment(0);
            fd.left = new FormAttachment(0);
            fd.right = new FormAttachment(100);
            remoteGroup.setLayoutData(fd);
            remoteGroup.setLayout(new FillLayout());

            Composite RemoteSettingsPanel = new Composite(remoteGroup, SWT.NONE);
            RemoteSettingsPanel.setLayoutData(new GridData(GridData.FILL_BOTH));

            panelLayout = new GridLayout(2, false);
            panelLayout.horizontalSpacing = 10;
            panelLayout.verticalSpacing = 5;
            RemoteSettingsPanel.setLayout(panelLayout);

            Label remoteReleaseLabel = new Label(RemoteSettingsPanel, SWT.NONE);
            remoteReleaseLabel.setText(Messages.getString("UpdatesitePreferencePage.base"));
            gd = new GridData();
            remoteReleaseLabel.setLayoutData(gd);

            remoteReleaseUriText = new Text(RemoteSettingsPanel, SWT.BORDER);
            remoteReleaseUriText.setEditable(false);
            gd = new GridData(GridData.FILL_HORIZONTAL);
            remoteReleaseUriText.setLayoutData(gd);

            // add basic authentication settings for base uri
            remoteBaseAuthLabel = new Label(RemoteSettingsPanel, SWT.NONE);
            remoteBaseAuthLabel.setText(Messages.getString("UpdatesitePreferencePage.basicAuth.credential"));
            
            Composite baseAuthPanel = new Composite(RemoteSettingsPanel, SWT.None);
            baseAuthPanel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
            panelLayout = new GridLayout(4, false);
            baseAuthPanel.setLayout(panelLayout);

            Label unameLabel = new Label(baseAuthPanel, SWT.NONE);
            unameLabel.setText(Messages.getString("UpdatesitePreferencePage.basicAuth.user"));
            remoteBaseUserText = new Text(baseAuthPanel, SWT.BORDER);
            gd = new GridData(GridData.FILL_HORIZONTAL);
            remoteBaseUserText.setLayoutData(gd);

            Label pwdLabel = new Label(baseAuthPanel, SWT.NONE);
            pwdLabel.setText(Messages.getString("UpdatesitePreferencePage.basicAuth.password"));
            remoteBasePasswordText = new Text(baseAuthPanel, SWT.PASSWORD | SWT.BORDER);
            gd = new GridData(GridData.FILL_HORIZONTAL);
            remoteBasePasswordText.setLayoutData(gd);
            
            
            Label remoteUpdateLabel = new Label(RemoteSettingsPanel, SWT.NONE);
            remoteUpdateLabel.setText(Messages.getString("UpdatesitePreferencePage.update"));
            gd = new GridData();
            remoteUpdateLabel.setLayoutData(gd);

            remoteUpdateUriText = new Text(RemoteSettingsPanel, SWT.BORDER);
            remoteUpdateUriText.setEditable(false);
            gd = new GridData(GridData.FILL_HORIZONTAL);
            remoteUpdateUriText.setLayoutData(gd);
            
            // add basic authentication settings for base uri
            remoteUpdateAuthLabel = new Label(RemoteSettingsPanel, SWT.NONE);
            remoteUpdateAuthLabel.setText(Messages.getString("UpdatesitePreferencePage.basicAuth.credential"));

            baseAuthPanel = new Composite(RemoteSettingsPanel, SWT.None);
            baseAuthPanel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
            panelLayout = new GridLayout(4, false);
            baseAuthPanel.setLayout(panelLayout);

            unameLabel = new Label(baseAuthPanel, SWT.NONE);
            unameLabel.setText(Messages.getString("UpdatesitePreferencePage.basicAuth.user"));
            remoteUpdateUserText = new Text(baseAuthPanel, SWT.BORDER);
            gd = new GridData(GridData.FILL_HORIZONTAL);
            remoteUpdateUserText.setLayoutData(gd);

            pwdLabel = new Label(baseAuthPanel, SWT.NONE);
            pwdLabel.setText(Messages.getString("UpdatesitePreferencePage.basicAuth.password"));
            remoteUpdatePasswordText = new Text(baseAuthPanel, SWT.PASSWORD | SWT.BORDER);
            gd = new GridData(GridData.FILL_HORIZONTAL);
            remoteUpdatePasswordText.setLayoutData(gd);
            
            gd = new GridData(GridData.FILL_HORIZONTAL);
            gd.horizontalSpan = 2;
            gd.horizontalAlignment = SWT.RIGHT;
            panelLayout = new GridLayout(1, false);
            Composite authButtonPanel = new Composite(RemoteSettingsPanel, SWT.None);
            authButtonPanel.setLayoutData(gd);
            authButtonPanel.setLayout(panelLayout);
            
            remoteTestAuth = new Button(authButtonPanel, SWT.NONE | SWT.CENTER);
            remoteTestAuth.setText(Messages.getString("UpdatesitePreferencePage.basicAuth.test"));

            Composite adminInfoPanel = new Composite(remotePanel, SWT.NONE);
            fd = new FormData();
            fd.top = new FormAttachment(remoteGroup, 0, SWT.BOTTOM);
            fd.left = new FormAttachment(0);
            adminInfoPanel.setLayoutData(fd);
            GridLayout infoPanelLayout = new GridLayout(3, false);
            adminInfoPanel.setLayout(infoPanelLayout);
            adminInfoPanel.setBackground(ColorConstants.INFO_COLOR);
            Label infoImgLabel = new Label(adminInfoPanel, SWT.WRAP);
            Image infoImage = ImageProvider.getImage(EImage.INFORMATION_ICON);
            ImageData imageData = infoImage.getImageData();
            imageData.scaledTo(16, 16);
            infoImage.setBackground(ColorConstants.INFO_COLOR);
            infoImgLabel.setImage(infoImage);
            infoImgLabel.setBackground(ColorConstants.INFO_COLOR);
            infoImgLabel.setLayoutData(new GridData(SWT.TOP));
            Link adminInfoLabel = new Link(adminInfoPanel, SWT.WRAP);
            adminInfoLabel.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
            adminInfoLabel.setBackground(ColorConstants.INFO_COLOR);
            adminInfoLabel.setText(Messages.getString("UpdatesitePreferencePage.infoPanel") + " <a>"
                    + Messages.getString("UpdatesitePreferencePage.infoPanel.link") + "</a>");
            adminInfoLabel.addSelectionListener(new SelectionAdapter() {

                @Override
                public void widgetSelected(SelectionEvent e) {
                    Program.launch(Messages.getString("UpdatesitePreferencePage.infoPanel.linkUrl"));
                }

            });
            Label moreImgLabel = new Label(adminInfoPanel, SWT.WRAP);
            Image moreImage = ImageProvider.getImage(EImage.MOREINFO_ICON);
            moreImage.setBackground(ColorConstants.INFO_COLOR);
            moreImgLabel.setImage(moreImage);
            moreImgLabel.setBackground(ColorConstants.INFO_COLOR);
        }

        boolean isCloudLicense = IBrandingService.get().isCloudLicense();
        boolean showOverwrite = false;
        if (isCloudLicense) {
            showOverwrite = true;
        } else {
            showOverwrite = isWorkbenchRunning && isCloudConnection;
        }
        overwritePanel = new Composite(panel, SWT.NONE);
        fd = new FormData();
        fd.top = new FormAttachment(remotePanel, 0, SWT.BOTTOM);
        fd.left = new FormAttachment(0);
        overwritePanel.setLayoutData(fd);
        if (showOverwrite) {
            formLayout = new FormLayout();
            formLayout.marginBottom = 7;
            overwritePanel.setLayout(formLayout);

            overwriteRemoteUpdateSettingsBtn = new Button(overwritePanel, SWT.CHECK);
            String overwriteLabel = null;
            if (isWorkbenchRunning) {
                overwriteLabel = Messages.getString("UpdatesitePreferencePage.btn.overwriteRemoteUpdateSettings");
            } else {
                overwriteLabel = Messages.getString("UpdatesitePreferencePage.btn.overwriteRemoteUpdateSettings.logon");
            }
            overwriteRemoteUpdateSettingsBtn.setText(overwriteLabel);
            fd = new FormData();
            fd.top = new FormAttachment(0);
            fd.left = new FormAttachment(0);
            overwriteRemoteUpdateSettingsBtn.setLayoutData(fd);
            if (!isWorkbenchRunning) {
                Label help = new Label(overwritePanel, SWT.PUSH);
                help.setImage(ImageProvider.getImage(EImage.QUESTION_ICON));
                help.setToolTipText(Messages.getString("UpdatesitePreferencePage.btn.overwriteRemoteUpdateSettings.help"));
                fd = new FormData();
                fd.top = new FormAttachment(overwriteRemoteUpdateSettingsBtn, 0, SWT.CENTER);
                fd.left = new FormAttachment(overwriteRemoteUpdateSettingsBtn, 2, SWT.RIGHT);
                help.setLayoutData(fd);
            } else {
                overwriteWarnPanel = new Composite(overwritePanel, SWT.NONE);
                FormData warnFd = new FormData();
                warnFd.top = new FormAttachment(overwriteRemoteUpdateSettingsBtn, 0, SWT.BOTTOM);
                warnFd.left = new FormAttachment(0);
                overwriteWarnPanel.setLayoutData(warnFd);
                overwriteWarnPanel.setLayout(new GridLayout(2, false));
                overwriteWarnPanel.setBackground(ColorConstants.WARN_COLOR);
                Label warnImgLabel = new Label(overwriteWarnPanel, SWT.WRAP);
                warnImgLabel.setImage(ImageProvider.getImage(EImage.WARNING_SMALL));
                warnImgLabel.setBackground(ColorConstants.WARN_COLOR);
                warnImgLabel.setLayoutData(new GridData(SWT.TOP));
                Label overwriteInfoLabel = new Label(overwriteWarnPanel, SWT.WRAP);
                overwriteInfoLabel.setBackground(ColorConstants.WARN_COLOR);
                overwriteInfoLabel.setText(Messages.getString("UpdatesitePreferencePage.overwriteWarnPanel"));
            }
        } else {
            fd.height = 0;
        }
        
        Composite m2Panel = new Composite(panel, SWT.None);
        
        localPanel = new Composite(panel, SWT.NONE);
        localPanel.setLayout(new FormLayout());
        fd = new FormData();
        fd.top = new FormAttachment(overwritePanel, 0, SWT.BOTTOM);
        fd.left = new FormAttachment(0);
        fd.right = new FormAttachment(100);
        fd.bottom = new FormAttachment(m2Panel, 0, SWT.TOP);
        localPanel.setLayoutData(fd);

        Group localGroup = new Group(localPanel, SWT.NONE);
        localGroup.setText(Messages.getString("UpdatesitePreferencePage.group.local"));
        fd = new FormData();
        fd.top = new FormAttachment(0);
        fd.left = new FormAttachment(0);
        fd.right = new FormAttachment(100);
        fd.bottom = new FormAttachment(100);
        localGroup.setLayoutData(fd);
        localGroup.setLayout(new FillLayout());
        
        Composite LocalSettinsContainer =  new Composite(localGroup, SWT.None);
        LocalSettinsContainer.setLayout(new GridLayout(1, false));
        LocalSettinsContainer.setLayoutData(new GridData(SWT.NONE, SWT.TOP, true, false));
        
        Composite localSettingsPanel = new Composite(LocalSettinsContainer, SWT.None);
        localSettingsPanel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

        panelLayout = new GridLayout(2, false);
        panelLayout.horizontalSpacing = 10;
        panelLayout.verticalSpacing = 5;
        localSettingsPanel.setLayout(panelLayout);

        Label releaseLabel = new Label(localSettingsPanel, SWT.NONE);
        releaseLabel.setText(Messages.getString("UpdatesitePreferencePage.base"));
        gd = new GridData();
        releaseLabel.setLayoutData(gd);

        releaseUriText = new Text(localSettingsPanel, SWT.BORDER);
        gd = new GridData(GridData.FILL_HORIZONTAL);
        releaseUriText.setLayoutData(gd);
        
        // add basic authentication settings for base uri
        localBaseAuthLabel = new Label(localSettingsPanel, SWT.NONE);
        localBaseAuthLabel.setText(Messages.getString("UpdatesitePreferencePage.basicAuth.credential"));
        
        Composite baseAuthPanel =  new Composite(localSettingsPanel, SWT.None);
        baseAuthPanel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        panelLayout = new GridLayout(4, false);
        baseAuthPanel.setLayout(panelLayout);
        
        Label unameLabel = new Label(baseAuthPanel, SWT.NONE);
        unameLabel.setText(Messages.getString("UpdatesitePreferencePage.basicAuth.user"));
        baseUserText = new Text(baseAuthPanel, SWT.BORDER);
        gd = new GridData(GridData.FILL_HORIZONTAL);
        baseUserText.setLayoutData(gd);
        
        Label pwdLabel = new Label(baseAuthPanel, SWT.NONE);
        pwdLabel.setText(Messages.getString("UpdatesitePreferencePage.basicAuth.password"));
        basePasswordText = new Text(baseAuthPanel, SWT.PASSWORD | SWT.BORDER);
        gd = new GridData(GridData.FILL_HORIZONTAL);
        basePasswordText.setLayoutData(gd);
        
        Label updateLabel = new Label(localSettingsPanel, SWT.NONE);
        updateLabel.setText(Messages.getString("UpdatesitePreferencePage.update"));
        gd = new GridData();
        updateLabel.setLayoutData(gd);

        updateUriText = new Text(localSettingsPanel, SWT.BORDER);
        gd = new GridData(GridData.FILL_HORIZONTAL);
        updateUriText.setLayoutData(gd);
        
        // add basic authentication settings for update uri
        localUpdateAuthLabel = new Label(localSettingsPanel, SWT.NONE);
        localUpdateAuthLabel.setText(Messages.getString("UpdatesitePreferencePage.basicAuth.credential"));
        
        baseAuthPanel =  new Composite(localSettingsPanel, SWT.None);
        baseAuthPanel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        panelLayout = new GridLayout(4, false);
        baseAuthPanel.setLayout(panelLayout);
        
        unameLabel = new Label(baseAuthPanel, SWT.NONE);
        unameLabel.setText(Messages.getString("UpdatesitePreferencePage.basicAuth.user"));
        updateUserText = new Text(baseAuthPanel, SWT.BORDER);
        gd = new GridData(GridData.FILL_HORIZONTAL);
        updateUserText.setLayoutData(gd);
        
        pwdLabel = new Label(baseAuthPanel, SWT.NONE);
        pwdLabel.setText(Messages.getString("UpdatesitePreferencePage.basicAuth.password"));
        updatePasswordText = new Text(baseAuthPanel, SWT.PASSWORD | SWT.BORDER);
        gd = new GridData(GridData.FILL_HORIZONTAL);
        updatePasswordText.setLayoutData(gd);
        
        
        gd = new GridData(GridData.FILL_HORIZONTAL);
        gd.horizontalSpan = 2;
        panelLayout = new GridLayout(1, false);
        gd.horizontalAlignment = SWT.RIGHT;
        Composite authButtonPanel = new Composite(localSettingsPanel, SWT.None);
        authButtonPanel.setLayoutData(gd);
        authButtonPanel.setLayout(panelLayout);

        testLocalAuth = new Button(authButtonPanel, SWT.NONE | SWT.CENTER);
        testLocalAuth.setText(Messages.getString("UpdatesitePreferencePage.basicAuth.test"));
        
        Label placeHolder = new Label(localSettingsPanel, SWT.None);
        gd = new GridData();
        placeHolder.setLayoutData(gd);

        warningPanel = new Composite(localSettingsPanel, SWT.None);
        gd = new GridData(GridData.GRAB_HORIZONTAL);
        warningPanel.setLayoutData(gd);
        warningPanel.setLayout(new GridLayout(2, false));

        Label warningImg = new Label(warningPanel, SWT.None);
        gd = new GridData(GridData.VERTICAL_ALIGN_BEGINNING);
        warningImg.setLayoutData(gd);
        warningImg.setImage(ImageProvider.getImage(EImage.WARNING_ICON));
        warningDesc = new Label(warningPanel, SWT.WRAP);
        warningDesc.setText(Messages.getString("UpdatesitePreferencePage.warn.onPremUpdateSetup"));
        warningDesc.setFont(JFaceResources.getFontRegistry().getBold(JFaceResources.DEFAULT_FONT));
        gd = new GridData(GridData.VERTICAL_ALIGN_BEGINNING | GridData.FILL_HORIZONTAL);
        gd.widthHint = 600;
        warningDesc.setLayoutData(gd);
        
        // remove m2
        FormData m2PanelData = new FormData();
        m2PanelData.left = new FormAttachment(localPanel, 0, SWT.LEFT);
        m2PanelData.right = new FormAttachment(localPanel, 0, SWT.RIGHT);
        m2PanelData.bottom = new FormAttachment(100);
        m2Panel.setLayout(new GridLayout(1, false));
        m2Panel.setLayoutData(m2PanelData);
        
        m2Delete = new Button(m2Panel, SWT.CHECK | SWT.WRAP);
        m2Delete.setText(Messages.getString("UpdatesitePreferencePage.m2.delete"));
        try {
            m2Delete.setSelection(p2Service.removeM2());
        } catch (Exception e2) {
            ExceptionHandler.process(e2);
        }
        
        String linkMsg = Messages.getString("UpdatesitePreferencePage.m2.info", "<a>" + Messages.getString("UpdatesitePreferencePage.m2.more") + "</a>");

        Link m2Link = new Link(m2Panel, SWT.WRAP);
        GridData m2LinkData = new GridData(GridData.FILL_HORIZONTAL);
        m2LinkData.widthHint = 860;
        m2Link.setLayoutData(m2LinkData);
        m2Link.setText(linkMsg);
        m2Link.addListener(SWT.MouseUp, new Listener() {

            @Override
            public void handleEvent(Event event) {
                Program.launch(LINK_MORE_URL);
            }
        });
        
        if (Boolean.getBoolean(PROPERTY_REMOVE_M2)) {
            m2Delete.setSelection(true);
        }
        
        if (System.getProperty(PROPERTY_REMOVE_M2) != null) {
            m2Delete.setEnabled(false);
        }

        init();
        addListener();
        return panel;
    }

    // need to be executed after loading uris of base and update
    private void initBasicAuth(UpdateSiteConfig config) throws Exception {
        localBaseChanged = false;
        localUpdateChanged = false;
        remoteBaseChanged = false;
        remoteUpdateChanged = false;
        if (!enableTmcUpdateSettings || (enableTmcUpdateSettings && overwriteRemoteUpdateSettingsBtn.getSelection())) {
            // init local settings
            this.testLocalAuth.setEnabled(false);
            URI baseURI = config.getLocalRelease(new NullProgressMonitor());
            if (isHTTP(baseURI)) {
                this.testLocalAuth.setEnabled(true);
                // load user and pwd
                String[] namePwd = UpdateSiteConfig.loadCredentialsFromSecureStore(baseURI);
                if (namePwd != null) {
                    this.baseUserText.setText(namePwd[0]);
                    this.basePasswordText.setText(namePwd[1]);
                }
            } else {
                this.baseUserText.setEnabled(false);
                this.basePasswordText.setEnabled(false);
            }

            URI updateUri = null;
            Collection<URI> updateURIs = config.getLocalUpdates(new NullProgressMonitor());
            for (URI uri : updateURIs) {
                if (isHTTP(uri)) {
                    updateUri = uri;
                    // only support one http update site
                    break;
                }
            }
            if (updateUri != null) {
                this.testLocalAuth.setEnabled(true);
                // load user and pwd
                String[] namePwd = UpdateSiteConfig.loadCredentialsFromSecureStore(updateUri);
                if (namePwd != null) {
                    this.updateUserText.setText(namePwd[0]);
                    this.updatePasswordText.setText(namePwd[1]);
                }
            } else {
                // no http update site
                this.updateUserText.setEnabled(false);
                this.updatePasswordText.setEnabled(false);
            }
        }
        if (enableTmcUpdateSettings) {
            // init remote settings
            this.remoteTestAuth.setEnabled(false);
            String remoteBaseUriStr = config.getTmcRelease(new NullProgressMonitor());
            if (!StringUtils.isEmpty(remoteBaseUriStr) && isHTTP(URI.create(remoteBaseUriStr))) {
                this.remoteTestAuth.setEnabled(true);
                // load user and pwd
                String[] namePwd = UpdateSiteConfig.loadCredentialsFromSecureStore(URI.create(remoteBaseUriStr));
                if (namePwd != null) {
                    this.remoteBaseUserText.setText(namePwd[0]);
                    this.remoteBasePasswordText.setText(namePwd[1]);
                }
            } else {
                this.remoteBaseUserText.setEnabled(false);
                this.remoteBasePasswordText.setEnabled(false);
            }

            URI updateUri = null;
            String remoteUpdateUriStr = config.getTmcUpdate(new NullProgressMonitor());
            if (!StringUtils.isEmpty(remoteUpdateUriStr) && isHTTP(URI.create(remoteUpdateUriStr))) {
                updateUri = URI.create(remoteUpdateUriStr);
            }

            if (updateUri != null) {
                this.remoteTestAuth.setEnabled(true);
                // load user and pwd
                String[] namePwd = UpdateSiteConfig.loadCredentialsFromSecureStore(updateUri);
                if (namePwd != null) {
                    this.remoteUpdateUserText.setText(namePwd[0]);
                    this.remoteUpdatePasswordText.setText(namePwd[1]);
                }
            } else {
                // no http update site
                this.remoteUpdateUserText.setEnabled(false);
                this.remoteUpdatePasswordText.setEnabled(false);
            }
        }
        
        updateLocalBasicAuthUI();
        updateRemoteBasicAuthUI();
        // init basic auth
        setValid(validateBasicAuth());
        refresh();
    }
    
    private void init() {
        try {
            // don't exclude to occupy place avoid hidden
            warningPanel.setVisible(false);
            warningPanel.getParent().getParent().layout();
            
            IProgressMonitor monitor = new NullProgressMonitor();
            UpdateSiteConfig config = p2Service.getUpdateSiteConfig(new NullProgressMonitor());
            URI release = config.getLocalRelease(monitor);
            releaseUriText.setText(release == null ? "" : release.toString());
            releaseUriText.setEditable(config.isReleaseEditable());
            if (!config.isReleaseEditable()) {
                releaseUriText.setToolTipText(Messages.getString("UpdatesitePreferencePage.tooltip.cantEdit"));
            }

            enableTmcUpdateSettings = config.isEnableTmcUpdateSettings(monitor);
            FormData fd = (FormData) remotePanel.getLayoutData();
            if (enableTmcUpdateSettings) {
                fd.height = SWT.DEFAULT;

                if (remoteReleaseUriText != null) {
                    String tmcRelease = config.getTmcRelease(monitor);
                    remoteReleaseUriText.setText(tmcRelease);
                }
                if (remoteUpdateUriText != null) {
                    String tmcUpdate = config.getTmcUpdate(monitor);
                    remoteUpdateUriText.setText(tmcUpdate);
                }
            } else {
                fd.height = 0;
                if (isWorkbenchRunning) {
                    FormData owFd = (FormData) overwritePanel.getLayoutData();
                    owFd.height = 0;
                }
            }
            boolean overwriteTmcUpdateSettings = config.isOverwriteTmcUpdateSettings(monitor);
            if (overwriteRemoteUpdateSettingsBtn != null) {
                overwriteRemoteUpdateSettingsBtn.setSelection(overwriteTmcUpdateSettings);
                if (overwriteWarnPanel != null) {
                    overwriteWarnPanel.setVisible(overwriteTmcUpdateSettings);
                }
                updateLocalPanelVisible(overwriteTmcUpdateSettings);
            }

            Collection<URI> updates = config.getLocalUpdates(monitor);
            StringBuilder updateStr = new StringBuilder();
            if (updates != null && !updates.isEmpty()) {
                for (String uri : updates.stream().map(uri -> uri.toString()).collect(Collectors.toList())) {
                    if (0 < updateStr.length()) {
                        updateStr.append(",");
                    }
                    updateStr.append(uri);
                }
            }
            updateUriText.setText(updateStr.toString());
            updateUriText.setEditable(config.isUpdateEditable());
            if (!config.isUpdateEditable()) {
                updateUriText.setToolTipText(Messages.getString("UpdatesitePreferencePage.tooltip.cantEdit"));
            }

            // init basic authentication settings
            initBasicAuth(config);
            
            panel.layout();
        } catch (Exception e) {
            ExceptionHandler.process(e);
        }
    }

    private void syncUpdateSettingConfig() {
        try {
            ICoreTisService.get().syncProjectUpdateSettingsFromServer(new NullProgressMonitor(),
                    ProjectManager.getInstance().getCurrentProject());
        } catch (Exception e) {
            ExceptionHandler.process(e);
        }
    }

    private void updateLocalPanelVisible(boolean visible) {
        if (!PlatformUI.isWorkbenchRunning() || !enableTmcUpdateSettings) {
            localPanel.setVisible(true);
        } else {
            localPanel.setVisible(visible);
        }
    }

    private void addListener() {
        releaseUriText.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(ModifyEvent e) {
                updateLocalBasicAuthUI();
                setValid(true);
                refresh();
            }
        });
        updateUriText.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(ModifyEvent e) {
                updateLocalBasicAuthUI();
                setValid(true);
                refresh();
            }
        });
        if (overwriteRemoteUpdateSettingsBtn != null) {
            overwriteRemoteUpdateSettingsBtn.addSelectionListener(new SelectionAdapter() {

                @Override
                public void widgetSelected(SelectionEvent e) {
                    onOverwriteRemoteUpdateSettingsBtn(e);
                }

            });
        }
        
        testLocalAuth.addSelectionListener(new SelectionListener() {

            @Override
            public void widgetDefaultSelected(SelectionEvent arg0) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void widgetSelected(SelectionEvent arg0) {
                boolean isValid = true;
                try {
                    URI baseUri = null;
                    URI updateUri = null;
                    try {
                        baseUri = getBaseURI();
                    } catch (Exception e) {
                        ExceptionHandler.process(e);
                    }
                    try {
                        updateUri = getUpdateURI();
                    } catch (Exception e) {
                        ExceptionHandler.process(e);
                    }
                    if (sameHost(baseUri, updateUri)) {
                        boolean isValidBase = false;
                        boolean isValidUpdate = false;
                        boolean isBaseError = false;
                        boolean isUpdateError = false;
                        try {
                            isValidBase = validateBasicAuth(releaseUriText, baseUserText, basePasswordText);
                        } catch (Exception e) {
                            isBaseError = true;
                            popupWindow(releaseUriText, true, "UpdatesitePreferencePage.basicAuth.error");
                        }
                        try {
                            isValidUpdate = validateBasicAuth(updateUriText, updateUserText, updatePasswordText);
                        } catch (Exception e) {
                            isUpdateError = true;
                            popupWindow(updateUriText, true, "UpdatesitePreferencePage.basicAuth.error");
                        }
                        isValid = isValid && isValidBase && isValidUpdate;
                        if (isValidBase == isValidUpdate) {
                            if (!isBaseError) {
                                popupWindow(releaseUriText, !isValidBase);
                            }
                        } else {
                            if (!isBaseError) {
                                popupWindow(releaseUriText, !isValidBase);
                            }
                            if (!isUpdateError) {
                                popupWindow(updateUriText, !isValidUpdate);
                            }
                        }
                    } else {
                        boolean isBaseError = false;
                        boolean isUpdateError = false;
                        if (baseUri != null) {
                            boolean isValidBase = false;
                            try {
                                isValidBase = validateBasicAuth(releaseUriText, baseUserText, basePasswordText);
                            } catch (Exception e) {
                                isBaseError = true;
                                popupWindow(releaseUriText, true, "UpdatesitePreferencePage.basicAuth.error");
                            }
                            isValid = isValid && isValidBase;
                            if (!isBaseError) {
                                popupWindow(releaseUriText, !isValidBase);
                            }
                        }
                        if (updateUri != null) {
                            boolean isValidUpdate = false;
                            try {
                                isValidUpdate = validateBasicAuth(updateUriText, updateUserText, updatePasswordText);
                            } catch (Exception e) {
                                isUpdateError = true;
                                popupWindow(updateUriText, true, "UpdatesitePreferencePage.basicAuth.error");
                            }
                            isValid = isValid && isValidUpdate;
                            if (!isUpdateError) {
                                popupWindow(updateUriText, !isValidUpdate);
                            }
                        }
                    }
                    
                } catch (Exception e) {
                    ExceptionHandler.process(e);
                }
                
                setValid(isValid);
                
                refresh();
            }
            
        });
        
        baseUserText.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(ModifyEvent e) {
                refresh();
                localBaseChanged = true;
            }
        });
        
        basePasswordText.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(ModifyEvent e) {
                refresh();
                localBaseChanged = true;
            }
        });
        
        updateUserText.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(ModifyEvent e) {
                refresh();
                localUpdateChanged = true;
            }
        });
        
        updatePasswordText.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(ModifyEvent e) {
                refresh();
                localUpdateChanged = true;
            }
        });
        
        if (isWorkbenchRunning && isCloudConnection) {
            remoteBaseUserText.addModifyListener(new ModifyListener() {

                @Override
                public void modifyText(ModifyEvent e) {
                    refresh();
                    remoteBaseChanged = true;
                }
            });
            remoteBasePasswordText.addModifyListener(new ModifyListener() {

                @Override
                public void modifyText(ModifyEvent e) {
                    refresh();
                    remoteBaseChanged = true;
                }
            });
            remoteUpdateUserText.addModifyListener(new ModifyListener() {

                @Override
                public void modifyText(ModifyEvent e) {
                    refresh();
                    remoteUpdateChanged = true;
                }
            });
            remoteUpdateUserText.addModifyListener(new ModifyListener() {

                @Override
                public void modifyText(ModifyEvent e) {
                    refresh();
                    remoteUpdateChanged = true;
                }
            });
            
            remoteTestAuth.addSelectionListener(new SelectionListener() {

                @Override
                public void widgetDefaultSelected(SelectionEvent arg0) {
                    // TODO Auto-generated method stub

                }

                @Override
                public void widgetSelected(SelectionEvent arg0) {
                    boolean isValid = true;
                    try {
                        boolean isBaseError = false;
                        boolean isUpdateError = false;
                        URI baseUri = null;
                        URI updateUri = null;
                        try {
                            baseUri = getRemoteBaseURI();
                        } catch (Exception e) {
                            ExceptionHandler.process(e);
                        }
                        try {
                            updateUri = getRemoteUpdateURI();
                        } catch (Exception e) {
                            ExceptionHandler.process(e);
                        }
                        if (sameHost(baseUri, updateUri)) {
                            String user = StringUtils.isEmpty(remoteBaseUserText.getText().trim()) ? remoteUpdateUserText.getText().trim() : remoteBaseUserText.getText().trim();
                            String pwd = StringUtils.isEmpty(remoteBasePasswordText.getText().trim()) ? remoteUpdatePasswordText.getText().trim() : remoteBasePasswordText.getText().trim();
                            boolean valid = false;
                            try {
                                valid = validateBasicAuth(baseUri, user, pwd);
                            } catch (Exception e) {
                                isBaseError = true;
                                popupWindow(remoteReleaseUriText, true, "UpdatesitePreferencePage.basicAuth.error");
                            }
                            isValid = valid;
                            if (!isBaseError) {
                                popupWindow(remoteReleaseUriText, !isValid);
                            }
                        } else {
                            if (baseUri != null) {
                                boolean isValidBase = false;
                                try {
                                    isValidBase = validateBasicAuth(remoteReleaseUriText, remoteBaseUserText, remoteBasePasswordText);
                                } catch (Exception e) {
                                    isBaseError = true;
                                    popupWindow(remoteReleaseUriText, true, "UpdatesitePreferencePage.basicAuth.error");
                                }
                                isValid = isValid && isValidBase;
                                if (!isBaseError) {
                                    popupWindow(remoteReleaseUriText, !isValidBase);
                                }
                            }
                            if (updateUri != null) {
                                boolean isValidUpdate = false;
                                try {
                                    isValidUpdate = validateBasicAuth(remoteUpdateUriText, remoteUpdateUserText, remoteUpdatePasswordText);
                                } catch (Exception e) {
                                    isUpdateError = true;
                                    popupWindow(remoteUpdateUriText, true, "UpdatesitePreferencePage.basicAuth.error");
                                }
                                isValid = isValid && isValidUpdate;
                                if (!isUpdateError) {
                                    popupWindow(remoteUpdateUriText, !isValidUpdate);
                                }
                            }
                        }
                    } catch (Exception e) {
                        ExceptionHandler.process(e);
                    }
                    setValid(isValid);
                    refresh();
                }

            });
        }
    }

    private void onOverwriteRemoteUpdateSettingsBtn(SelectionEvent e) {
        if (overwriteWarnPanel != null) {
            overwriteWarnPanel.setVisible(overwriteRemoteUpdateSettingsBtn.getSelection());
        }
        updateLocalPanelVisible(overwriteRemoteUpdateSettingsBtn.getSelection());
        updateLocalBasicAuthUI();
        updateRemoteBasicAuthUI();
        try {
            setValid(validateBasicAuth());
        } catch (Exception ex) {
            ExceptionHandler.process(ex);
        }
    }
    
    private static boolean sameHost(URI baseUri, URI updateUri) {
        return baseUri != null && updateUri != null && StringUtils.equals(baseUri.getHost(), updateUri.getHost());
    }

    private void updateRemoteBasicAuthUI() {
        if (isCloudConnection && enableTmcUpdateSettings) {
            this.remoteTestAuth.setEnabled(false);
            this.remoteBaseUserText.setEnabled(false);
            this.remoteBasePasswordText.setEnabled(false);
            this.remoteUpdateUserText.setEnabled(false);
            this.remoteUpdatePasswordText.setEnabled(false);
            if (!overwriteRemoteUpdateSettingsBtn.getSelection()) {
                try {
                    URI baseURI = getRemoteBaseURI();
                    if (baseURI != null) {
                        remoteTestAuth.setEnabled(true);
                        this.remoteBasePasswordText.setEnabled(true);
                        this.remoteBaseUserText.setEnabled(true);
                    }
                } catch (Exception e) {
                    ExceptionHandler.process(e);
                }
                
                try {
                    URI updateURI = getRemoteUpdateURI();
                    if (updateURI != null) {
                        remoteTestAuth.setEnabled(true);
                        this.remoteUpdateUserText.setEnabled(true);
                        this.remoteUpdatePasswordText.setEnabled(true);
                    }
                } catch (Exception e) {
                    ExceptionHandler.process(e);
                }
            }
        }
    }
    
    private void updateLocalBasicAuthUI() {
        if (!enableTmcUpdateSettings || (enableTmcUpdateSettings && overwriteRemoteUpdateSettingsBtn.getSelection()) || localPanel.isVisible()) {
            URI baseURI = null;
            try {
                baseURI = getBaseURI();
            } catch (Exception e) {
                ExceptionHandler.process(e);
            }
            testLocalAuth.setEnabled(false);
            this.basePasswordText.setEnabled(false);
            this.baseUserText.setEnabled(false);
            if (baseURI != null) {
                testLocalAuth.setEnabled(true);
                this.basePasswordText.setEnabled(true);
                this.baseUserText.setEnabled(true);
            }
            
            URI updateURI = null;
            try {
                updateURI = getUpdateURI();
            } catch (Exception e) {
                ExceptionHandler.process(e);
            }
            this.updateUserText.setEnabled(false);
            this.updatePasswordText.setEnabled(false);
            if (updateURI != null) {
                testLocalAuth.setEnabled(true);
                this.updateUserText.setEnabled(true);
                this.updatePasswordText.setEnabled(true);
            }
            
        } else {
            testLocalAuth.setEnabled(false);
            this.basePasswordText.setEnabled(false);
            this.baseUserText.setEnabled(false);
            this.updateUserText.setEnabled(false);
            this.updatePasswordText.setEnabled(false);
        }
    }
    
    private URI getBaseURI() throws Exception {
        return getURI(this.releaseUriText.getText());
    }
    
    private URI getURI(String uriText) throws Exception {
        if (uriText == null || StringUtils.isBlank(uriText.trim())) {
            return null;
        }
        String[] uriStrs = uriText.trim().split(",");
        for (String uriStr : uriStrs) {
            URI uri = p2Service.toURI(uriStr);
            if (isHTTP(uri)) {
                return uri;
            }
        }
        return null;
    }
    
    private URI getUpdateURI() throws Exception {
        return getURI(this.updateUriText.getText());
    }
    
    private URI getRemoteBaseURI() throws Exception {
        return getURI(this.remoteReleaseUriText.getText());
    }

    private URI getRemoteUpdateURI() throws Exception {
        return getURI(this.remoteUpdateUriText.getText());
    }
    
    private static boolean isHTTP(URI uri) {
        if (uri != null && (StringUtils.equals(uri.getScheme(), UpdateSiteConfig.PROTOCOL_HTTP) || StringUtils.equals(uri.getScheme(), UpdateSiteConfig.PROTOCOL_HTTPS))) {
            return true;
        }
        return false;
    }
    
    private void saveBasicAuth(UpdateSiteConfig config) throws Exception {
        if (!enableTmcUpdateSettings || (enableTmcUpdateSettings && overwriteRemoteUpdateSettingsBtn.getSelection())) {
            URI baseUri = null;
            try {
                baseUri = this.getBaseURI();
            } catch (Exception e) {
                ExceptionHandler.process(e);
            }
            if (baseUri != null) {
                if (localBaseChanged) {
                    UpdateSiteConfig.saveCredentialsIntoSecureStore(baseUri, this.baseUserText.getText().trim(), this.basePasswordText.getText().trim());
                    config.enableBasicAuth(baseUri.getHost(), true);
                    localBaseChanged = false;
                }
            }
            URI updateUri = null;
            try {
                updateUri = this.getUpdateURI();
            } catch (Exception e) {
                ExceptionHandler.process(e);
            }
            if (updateUri != null) {
                if (localUpdateChanged) {
                    UpdateSiteConfig.saveCredentialsIntoSecureStore(updateUri, this.updateUserText.getText().trim(), this.updatePasswordText.getText().trim());
                    config.enableBasicAuth(updateUri.getHost(), true);
                    localUpdateChanged = false;
                }
            }
        } else {
            if (enableTmcUpdateSettings) {
                // save remote basic auth
                URI baseUri = null;
                try {
                    baseUri = this.getRemoteBaseURI();
                } catch (Exception e) {
                    ExceptionHandler.process(e);
                }
                if (baseUri != null) {
                    if (remoteBaseChanged) {
                        UpdateSiteConfig.saveCredentialsIntoSecureStore(baseUri, this.remoteBaseUserText.getText().trim(), this.remoteBasePasswordText.getText().trim());
                        config.enableBasicAuth(baseUri.getHost(), true);
                        remoteBaseChanged = false;
                    }
                }

                URI updateUri = null;
                try {
                    updateUri = this.getRemoteUpdateURI();
                } catch (Exception e) {
                    ExceptionHandler.process(e);
                }
                if (updateUri != null) {
                    if (remoteUpdateChanged) {
                        UpdateSiteConfig.saveCredentialsIntoSecureStore(updateUri, this.remoteUpdateUserText.getText().trim(), this.remoteUpdatePasswordText.getText().trim());
                        config.enableBasicAuth(updateUri.getHost(), true);
                        remoteUpdateChanged = false;
                    }
                }
            }
        }
    }

    @Override
    public boolean performOk() {
        if (this.isControlCreated()) {
            if (!validateBasicAuth()) {
                setValid(false);
                return false;
            }

            try {
                if (m2Delete.getSelection() != p2Service.removeM2()) {
                    p2Service.saveRemoveM2(m2Delete.getSelection());
                }
            } catch (Exception e1) {
                ExceptionHandler.process(e1);
            }
            
            try {
                IProgressMonitor monitor = new NullProgressMonitor();
                UpdateSiteConfig config = p2Service.getUpdateSiteConfig(new NullProgressMonitor());
                if (config.isReleaseEditable()) {
                    String release = releaseUriText.getText();
                    config.setLocalRelease(monitor, StringUtils.isBlank(release) ? null : p2Service.toURI(release.trim()));
                }
                if (config.isUpdateEditable()) {
                    String update = updateUriText.getText();
                    if (StringUtils.isBlank(update)) {
                        config.setLocalUpdates(monitor, null);
                    } else {
                        Collection<URI> updates = new ArrayList<>();
                        String[] splits = update.split(",");
                        for (String split : splits) {
                            updates.add(p2Service.toURI(split.trim()));
                        }
                        config.setLocalUpdates(monitor, updates);
                    }
                }
                if (overwriteRemoteUpdateSettingsBtn != null) {
                    config.overwriteTmcUpdateSettings(monitor, overwriteRemoteUpdateSettingsBtn.getSelection());
                }
                // after config set
                if (isWorkbenchRunning && isCloudConnection) {
                    p2Service.handleTmcUpdateObserve(!overwriteRemoteUpdateSettingsBtn.getSelection());
                }
                resetWorkbenchTitle();
                // save basic authentication credentials
                saveBasicAuth(config);
            } catch (Exception e) {
                ExceptionMessageDialog.openError(null, Messages.getString("UpdatesitePreferencePage.err.title"),
                        e.getLocalizedMessage(), e);
            }
        }
        return super.performOk();
    }
    
    private void resetWorkbenchTitle() {
        if (!isWorkbenchRunning || !isCloudConnection) {
            return;
        }

        try {
            IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
            Shell workbenchShell = window.getShell();
            if (workbenchShell != null && !workbenchShell.isDisposed()) {
                workbenchShell.setText(TalendWorkbenchUtil.getWorkbenchWindowTitle());
            }
        } catch (Exception e) {
            ExceptionHandler.process(e);
        }
    }

    private void resetBasicAuth() {
        if (!enableTmcUpdateSettings || (enableTmcUpdateSettings && overwriteRemoteUpdateSettingsBtn.getSelection()) || localPanel.isVisible()) {
            // local
            URI baseUri = null;
            URI updateUri = null;
            try {
                baseUri = getBaseURI();
            } catch (Exception e) {
                ExceptionHandler.process(e);
            }
            try {
                updateUri = getUpdateURI();
            } catch (Exception e) {
                ExceptionHandler.process(e);
            }
            testLocalAuth.setEnabled(false);
            this.baseUserText.setEnabled(false);
            this.basePasswordText.setEnabled(false);
            if (baseUri != null) {
                testLocalAuth.setEnabled(true);
                this.baseUserText.setEnabled(true);
                this.basePasswordText.setEnabled(true);
                try {
                    UpdateSiteConfig.deleteCredentialsFromSecureStore(baseUri);
                } catch (Exception e) {
                    ExceptionHandler.process(e);
                }
            }

            this.baseUserText.setText("");
            this.basePasswordText.setText("");

            this.updateUserText.setEnabled(false);
            this.updatePasswordText.setEnabled(false);
            if (updateUri != null) {
                testLocalAuth.setEnabled(true);
                this.updateUserText.setEnabled(true);
                this.updatePasswordText.setEnabled(true);
                try {
                    UpdateSiteConfig.deleteCredentialsFromSecureStore(updateUri);
                } catch (Exception e) {
                    ExceptionHandler.process(e);
                }
            }
            this.updateUserText.setText("");
            this.updatePasswordText.setText("");
        }
        // remote
        if (this.enableTmcUpdateSettings && isWorkbenchRunning && isCloudConnection) {
            URI remeoteBaseUri = null;
            URI remoteUpdateUri = null;
            try {
                remeoteBaseUri = this.getRemoteBaseURI();
            } catch (Exception e) {
                ExceptionHandler.process(e);
            }
            try {
                remoteUpdateUri = this.getRemoteUpdateURI();
            } catch (Exception e) {
                ExceptionHandler.process(e);
            }
            remoteTestAuth.setEnabled(false);
            this.remoteBaseUserText.setEnabled(false);
            this.remoteBasePasswordText.setEnabled(false);
            if (remeoteBaseUri != null) {
                remoteTestAuth.setEnabled(true);
                this.remoteBaseUserText.setEnabled(true);
                this.remoteBasePasswordText.setEnabled(true);
                try {
                    UpdateSiteConfig.deleteCredentialsFromSecureStore(remeoteBaseUri);
                } catch (Exception e) {
                    ExceptionHandler.process(e);
                }
            }

            this.remoteBaseUserText.setText("");
            this.remoteBasePasswordText.setText("");

            this.remoteUpdateUserText.setEnabled(false);
            this.remoteUpdatePasswordText.setEnabled(false);
            if (remoteUpdateUri != null) {
                remoteTestAuth.setEnabled(true);
                this.remoteUpdateUserText.setEnabled(true);
                this.remoteUpdatePasswordText.setEnabled(true);
                try {
                    UpdateSiteConfig.deleteCredentialsFromSecureStore(remoteUpdateUri);
                } catch (Exception e) {
                    ExceptionHandler.process(e);
                }
            }
            this.remoteUpdateUserText.setText("");
            this.remoteUpdatePasswordText.setText("");
        }
        
        // init basic auth
        try {
            setValid(validateBasicAuth());
        } catch (Exception e) {
            ExceptionHandler.process(e);
        }
        
        updateLocalBasicAuthUI();
        updateRemoteBasicAuthUI();
        
        refresh();
        localBaseChanged = false;
        localUpdateChanged = false;
        remoteBaseChanged = false;
        remoteUpdateChanged = false;
    }

    @Override
    protected void performDefaults() {
        if (this.isControlCreated()) {
            try {
                UpdateSiteConfig config = p2Service.getUpdateSiteConfig(new NullProgressMonitor());
                if (config.isReleaseEditable() && config.isUpdateEditable()) {
                    NullProgressMonitor monitor = new NullProgressMonitor();
                    config.resetToDefault(monitor);
                    URI release = config.getLocalRelease(monitor);
                    releaseUriText.setText(release == null ? "" : release.toString());
                    Collection<URI> updates = config.getLocalUpdates(monitor);
                    StringBuilder updateStr = new StringBuilder();
                    if (updates != null && !updates.isEmpty()) {
                        updateStr.append(
                                String.join(",", updates.stream().map(uri -> uri.toString()).collect(Collectors.toList())));
                    }
                    updateUriText.setText(updateStr.toString());
//                    if (this.overwriteRemoteUpdateSettingsBtn != null) {
//                        this.overwriteRemoteUpdateSettingsBtn.setSelection(config.isOverwriteTmcUpdateSettings(monitor));
//                        onOverwriteRemoteUpdateSettingsBtn(null);
//                    }
                    
                    // reset basic authentication
                    resetBasicAuth();
                    
                    // set default for m2delete
                    if (System.getProperty(PROPERTY_REMOVE_M2) == null) {
                        m2Delete.setSelection(M2_DELETE_DEFAULT);
                    }
                } else {
                    // normally it should be a dead code
                    throw new Exception(Messages.getString("UpdatesitePreferencePage.err.reset.readonly"));
                }
            } catch (Exception e) {
                ExceptionMessageDialog.openError(null, Messages.getString("UpdatesitePreferencePage.err.title"),
                        e.getLocalizedMessage(), e);
            }
        }
        super.performDefaults();
    }

    private void refresh() {
        this.updateApplyButton();
        this.getContainer().updateButtons();
    }

    private boolean validate() {
        this.setErrorMessage(null);
        checkUpdateUriSettings();
        String releaseUriStr = releaseUriText.getText().trim();
        if (StringUtils.isBlank(releaseUriStr)) {
            this.setErrorMessage(Messages.getString("UpdatesitePreferencePage.err.baseCantEmpty"));
            return false;
        } else if (StringUtils.equals(releaseUriStr, updateUriText.getText().trim())) {
            this.setErrorMessage(Messages.getString("UpdatesitePreferencePage.err.baseAndUpdateShouldBeDiff"));
            return false;
        }
        return true;
    }
    
    private boolean validateBasicAuth(Text uriInput, Text userInput, Text passwordInput) throws Exception {
        URI uri = getURI(uriInput.getText());
        if (uri != null) {
            if (validateBasicAuth(uri, userInput.getText(), passwordInput.getText())) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }
    
    private void popupWindow(Text uriInput, boolean isError) throws Exception {
        popupWindow(uriInput, isError, isError ? "UpdatesitePreferencePage.basicAuth.wrongUserOrPassword" : "UpdatesitePreferencePage.basicAuth.ok");
    }
    
    private void popupWindow(Text uriInput, boolean isError, String messageKey) {
        String popupTitle = "";
        if (uriInput.equals(releaseUriText) || uriInput.equals(remoteReleaseUriText)) {
            popupTitle = Messages.getString("UpdatesitePreferencePage.base");
        } else if (uriInput.equals(updateUriText) || uriInput.equals(remoteUpdateUriText)) {
            popupTitle = Messages.getString("UpdatesitePreferencePage.update");
        }

        URI uri = null;
        try {
            uri = this.getURI(uriInput.getText().trim());
        } catch (Exception e) {
            MessageDialog.openError(getShell(), popupTitle, Messages.getString(messageKey));
            return;
        }
        if (isHTTP(uri)) {
            popupTitle = popupTitle + ": " + uri.getHost();
            if (!isError) {
                MessageDialog.openInformation(getShell(), popupTitle, Messages.getString(messageKey));
            } else {
                MessageDialog.openError(getShell(), popupTitle, Messages.getString(messageKey));
            }
        }
    }
    
    private boolean validateBasicAuth(URI uri, String user, String password) throws Exception {
        String nameAndPwd = user.trim() + ":" + password.trim();
        boolean requireAuth = UpdateSiteConfig.requireCredentials(uri, nameAndPwd);
        if (requireAuth) {
            return false;
        }
        return true;
    }
    
    private boolean validateBasicAuth() {
        boolean retVal = true;
        if (!enableTmcUpdateSettings || (enableTmcUpdateSettings && overwriteRemoteUpdateSettingsBtn.getSelection()) || localPanel.isVisible()) {
            URI baseUri = null;
            try {
                baseUri = this.getBaseURI();
                if (baseUri != null) {
                    retVal = validateBasicAuth(baseUri, this.baseUserText.getText(), basePasswordText.getText());
                }
            } catch (Exception e) {
                popupWindow(this.releaseUriText, true, "UpdatesitePreferencePage.basicAuth.error");
                return false;
            }
            try {
                URI updateUri = this.getUpdateURI();
                if (updateUri != null) {
                    String userStr = this.updateUserText.getText().trim();
                    String pwdStr = updatePasswordText.getText().trim();
                    if (baseUri != null && StringUtils.equals(baseUri.getHost(), updateUri.getHost())) {
                        if (StringUtils.isEmpty(userStr)) {
                            userStr = this.baseUserText.getText().trim();
                        }
                        if (StringUtils.isEmpty(pwdStr)) {
                            pwdStr = this.basePasswordText.getText().trim();
                        }
                    }

                    retVal = retVal && validateBasicAuth(updateUri, userStr, pwdStr);

                }
            } catch (Exception e) {
                popupWindow(this.updateUriText, true, "UpdatesitePreferencePage.basicAuth.error");
                return false;
            }
        } else {
            if (enableTmcUpdateSettings) {
                // remote basic auth
                URI baseUri = null;
                try {
                    baseUri = this.getRemoteBaseURI();
                    if (baseUri != null) {
                        retVal = validateBasicAuth(baseUri, this.remoteBaseUserText.getText(), remoteBasePasswordText.getText());
                    }
                } catch (Exception e) {
                    popupWindow(this.remoteReleaseUriText, true, "UpdatesitePreferencePage.basicAuth.error");
                    return false;
                }
                try {
                    URI updateUri = this.getRemoteUpdateURI();
                    if (updateUri != null) {
                        String userStr = this.remoteUpdateUserText.getText().trim();
                        String pwdStr = remoteUpdatePasswordText.getText().trim();
                        if (baseUri != null && StringUtils.equals(baseUri.getHost(), updateUri.getHost())) {
                            if (StringUtils.isEmpty(userStr)) {
                                userStr = this.remoteBaseUserText.getText().trim();
                            }
                            if (StringUtils.isEmpty(pwdStr)) {
                                pwdStr = this.remoteBasePasswordText.getText().trim();
                            }
                        }
                        retVal = retVal && validateBasicAuth(updateUri, userStr, pwdStr);
                    }
                } catch (Exception e) {
                    popupWindow(this.remoteUpdateUriText, true, "UpdatesitePreferencePage.basicAuth.error");
                    return false;
                }
            }
        }
        return retVal;
    }

    private void checkUpdateUriSettings() {
        String updateUriStr = updateUriText.getText().trim();
        warningDesc.setText(Messages.getString("UpdatesitePreferencePage.warn.onPremUpdateSetup"));
        showWarning(StringUtils.isBlank(updateUriStr));
    }
    
    private void showWarning(boolean show) {
        // don't exclude to occupy place avoid hidden
        if (show) {
            warningPanel.setVisible(true);
        } else {
            warningPanel.setVisible(false);
        }
        warningPanel.getParent().getParent().layout();
    }

    @Override
    public boolean isValid() {
        return super.isValid() && (this.isControlCreated() && validate());
    }

}
