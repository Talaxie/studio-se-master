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
package org.talend.designer.maven.ui.setting.project.page;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.IMessage;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.core.PluginChecker;
import org.talend.core.runtime.maven.MavenConstants;
import org.talend.core.runtime.projectsetting.AbstractProjectSettingPage;
import org.talend.designer.maven.DesignerMavenPlugin;
import org.talend.designer.maven.tools.AggregatorPomsHelper;
import org.talend.designer.maven.tools.BuildTypeManager;
import org.talend.designer.maven.ui.i18n.Messages;

/**
 * DOC ggu class global comment. Detailled comment
 */
public class MavenProjectSettingPage extends AbstractProjectSettingPage {

	private IPreferenceStore preferenceStore;

    private Button skipFoldersCheckbox;

	public MavenProjectSettingPage() {
		noDefaultAndApplyButton();
	}

	@Override
	protected String getPreferenceName() {
		return DesignerMavenPlugin.PLUGIN_ID;
	}

	@Override
	protected void createFieldEditors() {
        if (!PluginChecker.isTIS()) {
            return;
        }
		Composite parent = getFieldEditorParent();
		parent.setLayout(new GridLayout());
		Button button = new Button(parent, SWT.NONE);
		button.setText(Messages.getString("ProjectPomProjectSettingPage.syncAllPomsButtonText")); //$NON-NLS-1$

		preferenceStore = getPreferenceStore();

        skipFoldersCheckbox = new Button(parent, SWT.CHECK);
        skipFoldersCheckbox.setText(Messages.getString("MavenProjectSettingPage.skipFolders")); //$NON-NLS-1$
        skipFoldersCheckbox.setSelection(preferenceStore.getBoolean(MavenConstants.SKIP_FOLDERS));
        skipFoldersCheckbox.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                addSyncWarning();
            }
        });

		button.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent event) {
				try {
					new AggregatorPomsHelper().syncAllPoms();
				} catch (Exception e) {
					ExceptionHandler.process(e);
                    if ("filter_parse_error".equals(e.getMessage())) { //$NON-NLS-1$
                        setErrorMessage(Messages.getString("ProjectPomProjectSettingPage_FilterErrorMessage")); //$NON-NLS-1$
					}
				}
			}

		});

        if (isSyncBuildTypeAllowed()) {
            Button syncBuildTypes = new Button(parent, SWT.NONE);
            syncBuildTypes.setText(Messages.getString("ProjectPomProjectSettingPage.syncBuildTypesButtonText")); //$NON-NLS-1$

            syncBuildTypes.addSelectionListener(new SelectionAdapter() {

                @Override
                public void widgetSelected(SelectionEvent event) {
                    try {
                        new BuildTypeManager().syncBuildTypes(getCurrentPage());
                    } catch (Exception e) {
                        ExceptionHandler.process(e);
                    }
                }

            });
        }

    }

    private void addSyncWarning() {
        setMessage(Messages.getString("MavenProjectSettingPage.syncAllPomsWarning"), IMessage.WARNING); //$NON-NLS-1$
    }

	@Override
	public boolean performOk() {
		boolean ok = super.performOk();
		if (preferenceStore != null) {
            preferenceStore.setValue(MavenConstants.SKIP_FOLDERS, skipFoldersCheckbox.getSelection());
		}
		return ok;
	}

	private static boolean isSyncBuildTypeAllowed() {
		return Boolean.getBoolean("talend.builtype.syncallowed");
	}
	
	private MavenProjectSettingPage getCurrentPage() {
		return this;
	}

}
