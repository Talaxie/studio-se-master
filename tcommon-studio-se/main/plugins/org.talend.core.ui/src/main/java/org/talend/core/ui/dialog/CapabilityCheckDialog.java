// ============================================================================
//
// Copyright (C) 2006-2023 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.core.ui.dialog;

import java.util.LinkedHashMap;

import org.eclipse.jface.dialogs.MessageDialogWithToggle;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.program.Program;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Shell;
import org.talend.commons.exception.LoginException;
import org.talend.commons.exception.PersistenceException;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.core.runtime.projectsetting.ProjectPreferenceManager;
import org.talend.core.runtime.util.ModuleAccessHelper;
import org.talend.core.ui.CoreUIPlugin;
import org.talend.core.ui.i18n.Messages;
import org.talend.repository.RepositoryWorkUnit;

public class CapabilityCheckDialog {

    private static final String KEY_NEVER_SHOW = "runtime.capability.check";

    private static final String LINK_FIX = "https://document-link.us.cloud.talend.com/ig_compatible_java_environments?version=80&lang=en&env=prd";

    private static ProjectPreferenceManager prefManager = new ProjectPreferenceManager(CoreUIPlugin.PLUGIN_ID, false);

    public static boolean open(Shell shell) {
        if (ModuleAccessHelper.allowJavaInternalAcess(null) && !prefManager.getBoolean(KEY_NEVER_SHOW)) {
            String title = Messages.getString("CapabilityCheckDialog.title");
            String message = Messages.getString("CapabilityCheckDialog.message");
            String toggle = Messages.getString("CapabilityCheckDialog.toggle");
            LinkedHashMap<String, Integer> buttonLabelToIdMap = new LinkedHashMap<>();
            buttonLabelToIdMap.put(Messages.getString("CapabilityCheckDialog.cancel"), Window.CANCEL);
            buttonLabelToIdMap.put(Messages.getString("CapabilityCheckDialog.publish"), Window.OK);
            MessageDialogWithToggle dialog = new MessageDialogWithToggle(shell, title, null, message, 0, buttonLabelToIdMap, 1,
                    toggle, false) {

                @Override
                protected Control createCustomArea(Composite parent) {
                    Link link = new Link(parent, SWT.NONE);
                    link.setText(Messages.getString("CapabilityCheckDialog.link"));
                    link.addSelectionListener(SelectionListener.widgetSelectedAdapter((e) -> Program.launch(LINK_FIX)));
                    return link;
                }

                @Override
                protected void buttonPressed(int buttonId) {
                    if (getToggleState()) {
                        RepositoryWorkUnit<Object> workUnit = new RepositoryWorkUnit<Object>(
                                "Store runtime capability check setup") {

                            @Override
                            protected void run() throws LoginException, PersistenceException {
                                prefManager.setValue(KEY_NEVER_SHOW, true);
                                prefManager.save();
                            }

                        };
                        workUnit.setAvoidUnloadResources(true);
                        ProxyRepositoryFactory.getInstance().executeRepositoryWorkUnit(workUnit);

                    }
                    super.buttonPressed(buttonId);
                }

                @Override
                protected boolean customShouldTakeFocus() {
                    return false;
                }

            };
            return dialog.open() == Window.OK ? true : false;
        }
        return true;
    }

}
