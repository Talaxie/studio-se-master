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
package org.talend.core.runtime.projectsetting;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.program.Program;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.forms.events.HyperlinkAdapter;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.eclipse.ui.forms.widgets.Hyperlink;
import org.talend.core.runtime.CoreRuntimePlugin;
import org.talend.core.runtime.i18n.Messages;
import org.talend.repository.model.IProxyRepositoryFactory;

public abstract class AbstractPomTemplateProjectSettingPage extends AbstractProjectSettingPage {

    private static final Color COLOR_LINK = new Color(null, 0, 0, 255);

    protected StyledText defaultText;

    protected StyledText customText;

    private boolean isDefaultPresentedForScriptTxt = false;

    private boolean readonly;

    public AbstractPomTemplateProjectSettingPage() {
        super();
        IProxyRepositoryFactory factory = CoreRuntimePlugin.getInstance().getProxyRepositoryFactory();
        readonly = factory.isUserReadOnlyOnCurrentProject();
    }

    protected boolean isReadonly() {
        return readonly;
    }

    public void setReadonly(boolean readonly) {
        this.readonly = readonly;
    }

    protected abstract String getPreferenceKey();

    protected StyledText getScriptTxt() {
        return customText;
    }

    @Override
    protected Control createContents(Composite p) {
        Composite parent = (Composite) super.createContents(p);

        CTabFolder tabFolder = new CTabFolder(parent, SWT.BORDER);
        // tabFolder.setTabPosition(SWT.BOTTOM);
        tabFolder.setSimple(false);

        GridData data = new GridData(GridData.FILL, GridData.FILL, true, true);
        tabFolder.setLayoutData(data);
        data.heightHint = 280;
        data.minimumHeight = 280;
        data.widthHint = 500;
        data.minimumWidth = 500;

        CTabItem defaultTabItem = new CTabItem(tabFolder, SWT.NULL);
        defaultTabItem.setText(Messages.getString("AbstractPomTemplateProjectSettingPage.defaultTabLabel")); //$NON-NLS-1$
        CTabItem customTabItem = new CTabItem(tabFolder, SWT.NULL);
        customTabItem.setText(Messages.getString("AbstractPomTemplateProjectSettingPage.customTabLabel")); //$NON-NLS-1$

        tabFolder.setSelection(defaultTabItem);

        int style = SWT.MULTI | SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL;
        defaultText = new StyledText(tabFolder, style);
        defaultText.setText(getDefaultText());
        defaultText.setBackground(new Color(null, 233, 233, 233));
        defaultText.setEditable(false);
        defaultTabItem.setControl(defaultText);

        customText = new StyledText(tabFolder, style);
        customText.setText(getCustomText());
        customText.setEditable(!isReadonly());
        customTabItem.setControl(customText);
        customText.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(ModifyEvent e) {
                isDefaultPresentedForScriptTxt = false;
            }

        });

        Composite extra = new Composite(parent, SWT.NONE);
        extra.setLayout(new GridLayout(2, false));

        Button preview = new Button(extra, SWT.NONE);
        preview.setText(Messages.getString("AbstractPomTemplateProjectSettingPage.previewButton")); //$NON-NLS-1$
        preview.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                checkModel(true);
            }

        });

        Hyperlink link = new Hyperlink(extra, SWT.NONE);
        link.setText(Messages.getString("AbstractPomTemplateProjectSettingPage.learnMoreLink")); //$NON-NLS-1$
        link.setUnderlined(true);
        link.setForeground(COLOR_LINK);
        link.addHyperlinkListener(new HyperlinkAdapter() {

            @Override
            public void linkActivated(HyperlinkEvent e) {
                Program.launch(getMoreInfoUrl());
            }
        });
        return parent;
    }

    protected abstract String getDefaultText();

    protected String getCustomText() {
        return getPreferenceStore().getString(getPreferenceKey());
    }

    protected abstract boolean checkModel(boolean preview);

    protected abstract String getMoreInfoUrl();

    @Override
    protected void performDefaults() {
        super.performDefaults();
        if (customText != null && !customText.isDisposed()) {
            isDefaultPresentedForScriptTxt = true;
            customText.setText(getPreferenceStore().getDefaultString(getPreferenceKey()));
        }
    }

    @Override
    public boolean performOk() {
        boolean ok = super.performOk();
        if (customText != null && !customText.isDisposed()) {
            if (isDefaultPresentedForScriptTxt) {
                getPreferenceStore().setToDefault(getPreferenceKey());
                return ok;
            }
            if (!checkModel(false)) {
                return false;
            }
            getPreferenceStore().setValue(getPreferenceKey(), customText.getText());
        }
        return ok;
    }

}
