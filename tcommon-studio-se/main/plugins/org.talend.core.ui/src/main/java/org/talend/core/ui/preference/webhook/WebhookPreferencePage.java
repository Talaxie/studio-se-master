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
package org.talend.core.ui.preference.webhook;

import java.beans.PropertyChangeEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.talend.core.prefs.ITalendCorePrefConstants;
import org.talend.core.service.IRemoteService;
import org.talend.core.ui.CoreUIPlugin;
import org.talend.core.ui.i18n.Messages;
import org.talend.core.ui.token.TokenCollectorFactory;
import org.talend.core.ui.webService.Webhook;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.talend.commons.ui.gmf.util.DisplayUtils;

/**
 * ggu class global comment. Detailled comment
 */
public class WebhookPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

    private StringFieldEditor frontHostField;
    private StringFieldEditor backHostField;
    private StringFieldEditor loginField;
    private StringFieldEditor passwordField;
    private Text textScriptImport;
    private Text textScriptBuild;

    public WebhookPreferencePage() {
        super(GRID);
        setPreferenceStore(CoreUIPlugin.getDefault().getPreferenceStore());
        setDescription("Les webhooks sont un moyen de fournir à d’autres applications des informations en temps réel. Ils permettent d’envoyer une notification à une autre application lorsqu’un événement donné se produit."); //$NON-NLS-1$
    }

    @Override
    public void init(IWorkbench workbench) {

    }

    @Override
    protected void createFieldEditors() {
        Composite parent = getFieldEditorParent();
        parent.setLayoutData(new GridData(GridData.FILL_BOTH));
        parent.setLayout(new GridLayout(1, false));

        CTabFolder tabFolder = new CTabFolder(parent, SWT.NULL);
        tabFolder.setSimple(false);
        tabFolder.setLayoutData(new GridData(GridData.FILL_BOTH));
        tabFolder.setLayout(new GridLayout(1, false));


	    // Nexus part
        CTabItem tabItemNexus = new CTabItem(tabFolder, SWT.NONE);
        tabItemNexus.setText("Nexus");
        tabItemNexus.setToolTipText("Nexus configuration");
        if (CoreUIPlugin.getDefault().getPreferenceStore().getBoolean(ITalendCorePrefConstants.WEBHOOK_NEXUS_ENABLED)) {
            tabItemNexus.setImage(ImageDescriptor.createFromURL(this.getClass().getResource("/icons/circle_actif_16x16.png")).createImage());
        } else {
            tabItemNexus.setImage(ImageDescriptor.createFromURL(this.getClass().getResource("/icons/circle_disable_16x16.png")).createImage());
        }
        tabFolder.setSelection(tabItemNexus);

	    Composite compositeNexus = new Composite(tabFolder, SWT.NONE);
	    compositeNexus.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
	    compositeNexus.setLayout(new GridLayout(1, false));
	    compositeNexus.setVisible(true);
        tabItemNexus.setControl(compositeNexus);

        BooleanFieldEditor checkboxNexusEnable = new BooleanFieldEditor(ITalendCorePrefConstants.WEBHOOK_NEXUS_ENABLED, "Active", compositeNexus) {
            @Override
            protected void valueChanged(boolean oldValue, boolean newValue) {
                setPresentsDefaultValue(false);
                if (oldValue != newValue) {
                    if (newValue) {
                        tabItemNexus.setImage(ImageDescriptor.createFromURL(this.getClass().getResource("/icons/circle_actif_16x16.png")).createImage());
                    } else {
                        tabItemNexus.setImage(ImageDescriptor.createFromURL(this.getClass().getResource("/icons/circle_disable_16x16.png")).createImage());
                    }
                }
            }
        };
        addField(checkboxNexusEnable);
        addField(new StringFieldEditor(ITalendCorePrefConstants.WEBHOOK_NEXUS_HOST, "Front host", compositeNexus));
        addField(new StringFieldEditor(ITalendCorePrefConstants.WEBHOOK_NEXUS_LOGIN, "Login", compositeNexus));
        StringFieldEditor nexusPasswordField = new StringFieldEditor(ITalendCorePrefConstants.WEBHOOK_NEXUS_PASSWORD, "Password", compositeNexus);
        nexusPasswordField.getTextControl(compositeNexus).setEchoChar('*');
        addField(nexusPasswordField);
        addField(new StringFieldEditor(ITalendCorePrefConstants.WEBHOOK_NEXUS_RELEASE_REPO, "Release repo", compositeNexus));
        addField(new StringFieldEditor(ITalendCorePrefConstants.WEBHOOK_NEXUS_SNAPSHOT_REPO, "Snapshot repo", compositeNexus));
        addField(new StringFieldEditor(ITalendCorePrefConstants.WEBHOOK_NEXUS_GROUP_ID, "Group ID", compositeNexus));

	    // EtlTool part
        CTabItem tabItemEtlTool = new CTabItem(tabFolder, SWT.NULL);
        tabItemEtlTool.setText("EtlTool");
        tabItemEtlTool.setToolTipText("EtlTool configuration");
        if (CoreUIPlugin.getDefault().getPreferenceStore().getBoolean(ITalendCorePrefConstants.WEBHOOK_ETLTOOL_ENABLED)) {
            tabItemEtlTool.setImage(ImageDescriptor.createFromURL(this.getClass().getResource("/icons/circle_actif_16x16.png")).createImage());
        } else {
            tabItemEtlTool.setImage(ImageDescriptor.createFromURL(this.getClass().getResource("/icons/circle_disable_16x16.png")).createImage());
        }

	    Composite compositeEtlTool = new Composite(tabFolder, SWT.NONE);
	    compositeEtlTool.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        GridLayout gridLayoutEtlTool = new GridLayout(1, false);
        gridLayoutEtlTool.marginHeight = 10;
        gridLayoutEtlTool.marginWidth = 10;
        compositeEtlTool.setLayout(gridLayoutEtlTool);
        compositeEtlTool.setVisible(true);
        tabItemEtlTool.setControl(compositeEtlTool);

        BooleanFieldEditor checkboxEtlToolEnable = new BooleanFieldEditor(ITalendCorePrefConstants.WEBHOOK_ETLTOOL_ENABLED, "Active", compositeEtlTool) {
            @Override
            protected void valueChanged(boolean oldValue, boolean newValue) {
                setPresentsDefaultValue(false);
                if (oldValue != newValue) {
                    if (newValue) {
                        tabItemEtlTool.setImage(ImageDescriptor.createFromURL(this.getClass().getResource("/icons/circle_actif_16x16.png")).createImage());
                    } else {
                        tabItemEtlTool.setImage(ImageDescriptor.createFromURL(this.getClass().getResource("/icons/circle_disable_16x16.png")).createImage());
                    }
                }
            }
        };
        addField(checkboxEtlToolEnable);
        frontHostField = new StringFieldEditor(ITalendCorePrefConstants.WEBHOOK_ETLTOOL_FRONT_HOST, "Front host", compositeEtlTool);
        addField(frontHostField);
        backHostField = new StringFieldEditor(ITalendCorePrefConstants.WEBHOOK_ETLTOOL_BACK_HOST, "Back host", compositeEtlTool);
        addField(backHostField);
        loginField = new StringFieldEditor(ITalendCorePrefConstants.WEBHOOK_ETLTOOL_LOGIN, "Login", compositeEtlTool);
        addField(loginField);
        passwordField = new StringFieldEditor(ITalendCorePrefConstants.WEBHOOK_ETLTOOL_PASSWORD, "Password", compositeEtlTool);
        passwordField.getTextControl(compositeEtlTool).setEchoChar('*');
        addField(passwordField);

        Button buttonTestEtlTool = new Button(compositeEtlTool, SWT.FLAT);
        buttonTestEtlTool.setText("Test"); //$NON-NLS-1$
        buttonTestEtlTool.setLayoutData(new GridData());
        buttonTestEtlTool.addSelectionListener(new SelectionListener() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                Boolean result = Webhook.backTest(backHostField.getStringValue(), loginField.getStringValue(), passwordField.getStringValue());
                String message = "Test ko !\n"; //$NON-NLS-1$
                if (result) {
                    message = "Test ok !\n"; //$NON-NLS-1$
                }
                MessageDialog messageDialog = new MessageDialog(
                    DisplayUtils.getDefaultShell(false),
                    "Talaxie - Webhook test", //$NON-NLS-1$
                    null,
                    message, //$NON-NLS-1$
                    MessageDialog.CONFIRM,
                    new String[] {
                        IDialogConstants.OK_LABEL,
                        IDialogConstants.CANCEL_LABEL
                    },
                    0
                ); //$NON-NLS-1$
                if (messageDialog.open() == 0) {
                    // TODO
                }

            }

            @Override
            public void widgetDefaultSelected(SelectionEvent e) {
                // Nothing to do
            }
        });

	    // Script part
        CTabItem tabItemScript = new CTabItem(tabFolder, SWT.NONE);
        tabItemScript.setText("Script");
        tabItemScript.setToolTipText("Script configuration");
        if (CoreUIPlugin.getDefault().getPreferenceStore().getBoolean(ITalendCorePrefConstants.WEBHOOK_SCRIPT_ENABLED)) {
            tabItemScript.setImage(ImageDescriptor.createFromURL(this.getClass().getResource("/icons/circle_actif_16x16.png")).createImage());
        } else {
            tabItemScript.setImage(ImageDescriptor.createFromURL(this.getClass().getResource("/icons/circle_disable_16x16.png")).createImage());
        }

	    Composite compositeScript = new Composite(tabFolder, SWT.NONE);
	    compositeScript.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
	    compositeScript.setLayout(new GridLayout(1, false));
	    compositeScript.setVisible(true);
        tabItemScript.setControl(compositeScript);

        BooleanFieldEditor checkboxScriptEnable = new BooleanFieldEditor(ITalendCorePrefConstants.WEBHOOK_SCRIPT_ENABLED, "Active", compositeScript) {
            @Override
            protected void valueChanged(boolean oldValue, boolean newValue) {
                setPresentsDefaultValue(false);
                if (oldValue != newValue) {
                    if (newValue) {
                        tabItemScript.setImage(ImageDescriptor.createFromURL(this.getClass().getResource("/icons/circle_actif_16x16.png")).createImage());
                    } else {
                        tabItemScript.setImage(ImageDescriptor.createFromURL(this.getClass().getResource("/icons/circle_disable_16x16.png")).createImage());
                    }
                }
            }
        };
        addField(checkboxScriptEnable);

	    Composite compositeScriptFile = new Composite(compositeScript, SWT.NONE);
	    compositeScriptFile.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
	    compositeScriptFile.setLayout(new GridLayout(3, false));
	    compositeScriptFile.setVisible(true);

	    // Script Import
        /*
	    CLabel labelScriptImport = new CLabel(compositeScriptFile, SWT.NONE);
	    labelScriptImport.setText("Import");
	    textScriptImport = new Text(compositeScriptFile, SWT.BORDER);
	    textScriptImport.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
	    textScriptImport.setText(CoreUIPlugin.getDefault().getPreferenceStore().getString(ITalendCorePrefConstants.WEBHOOK_SCRIPT_IMPORT_LOCATION));
        Button buttonScriptImport = new Button(compositeScriptFile, SWT.PUSH);
        buttonScriptImport.setText("...");
        buttonScriptImport.setLayoutData(new GridData(40, SWT.DEFAULT));
        buttonScriptImport.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent evt) {
				FileDialog dlg = new FileDialog(parent.getShell(), SWT.NONE);
				Collection files = new ArrayList();
				if (dlg.open() != null) {
					String[] names = dlg.getFileNames();
					textScriptImport.setText(dlg.getFilterPath() + File.separator + dlg.getFileName());
				}
			}
        });
        */
	    
	    // Script Build
	    CLabel labelScriptBuild = new CLabel(compositeScriptFile, SWT.NONE);
	    labelScriptBuild.setText("Build");
	    textScriptBuild = new Text(compositeScriptFile, SWT.BORDER);
	    textScriptBuild.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
	    textScriptBuild.setText(CoreUIPlugin.getDefault().getPreferenceStore().getString(ITalendCorePrefConstants.WEBHOOK_SCRIPT_BUILD_LOCATION));
        Button buttonScriptBuild = new Button(compositeScriptFile, SWT.PUSH);
        buttonScriptBuild.setText("...");
        buttonScriptBuild.setLayoutData(new GridData(40, SWT.DEFAULT));
        buttonScriptBuild.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent evt) {
				FileDialog dlg = new FileDialog(parent.getShell(), SWT.NONE);
				Collection files = new ArrayList();
				if (dlg.open() != null) {
					String[] names = dlg.getFileNames();
					textScriptBuild.setText(dlg.getFilterPath() + File.separator + dlg.getFileName());
				}
			}
        });
    }

    /*
     * @see PreferencePage#performDefaults()
     */
    @Override
    protected void performDefaults() {
        textScriptImport.setText("");
        textScriptBuild.setText("");

        super.performDefaults();
    }

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.jface.preference.FieldEditorPreferencePage#performOk()
     */
    @Override
    public boolean performOk() {
        if (textScriptImport != null) {
            getPreferenceStore().setValue(ITalendCorePrefConstants.WEBHOOK_SCRIPT_IMPORT_LOCATION, textScriptImport.getText());
        }
        if (textScriptBuild != null) {
            getPreferenceStore().setValue(ITalendCorePrefConstants.WEBHOOK_SCRIPT_BUILD_LOCATION, textScriptBuild.getText());
        }

        final IPreferenceStore preferenceStore = CoreUIPlugin.getDefault().getPreferenceStore();
        boolean valueBeforeOk = preferenceStore.getBoolean(ITalendCorePrefConstants.DATA_COLLECTOR_ENABLED);

        boolean ok = super.performOk();

        if (valueBeforeOk != preferenceStore.getBoolean(ITalendCorePrefConstants.DATA_COLLECTOR_ENABLED)) {
            TokenCollectorFactory.getFactory().send();
        }
        return ok;
    }
}
