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
package org.talend.designer.core.ui.preferences;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.FontFieldEditor;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.core.CorePlugin;
import org.talend.core.PluginChecker;
import org.talend.core.prefs.ITalendCorePrefConstants;
import org.talend.core.ui.branding.IBrandingService;
import org.talend.designer.core.i18n.Messages;

public class AppearancePreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

    private final String groupName = "Font"; //$NON-NLS-1$

    private FontFieldEditor memoFontEditor = null;

    private FontFieldEditor consoleFontField = null;

    private ComboViewer persistOptionsCombo = null;

    //    public static final String CONSOLE_FONT = "talendOutputConsoleFont"; //$NON-NLS-1$

    public AppearancePreferencePage() {
        super(GRID);
        IPreferenceStore store = CorePlugin.getDefault().getPreferenceStore();
        setPreferenceStore(store);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.jface.preference.FieldEditorPreferencePage#createFieldEditors()
     */
    @Override
    protected void createFieldEditors() {
        addField(new BooleanFieldEditor(ITalendCorePrefConstants.CONTEXT_GROUP_BY_SOURCE,
                Messages.getString("AppearancePreferencePage.groupBySource"), //$NON-NLS-1$
                getFieldEditorParent()));
        Composite parent = getFieldEditorParent();
        addFields(parent);
        if (PluginChecker.isStudioLite() && !isOEM()) {
            addPerspectiveSettings(parent);
        }
    }

    private boolean isOEM() {
        boolean isOEM = false;
        try {
            isOEM = !IBrandingService.get().isPoweredbyTalend();
        } catch (Exception e) {
            ExceptionHandler.process(e);
        }
        return isOEM;
    }

    private void addPerspectiveSettings(Composite parent) {
        Composite layoutSettingsPanel = new Composite(parent, SWT.NULL);
        layoutSettingsPanel.setLayout(new GridLayout(2, false));
        GridData gd = new GridData(GridData.GRAB_HORIZONTAL | GridData.HORIZONTAL_ALIGN_FILL);
        gd.horizontalSpan = getHorizontalSpan();
        layoutSettingsPanel.setLayoutData(gd);
        Label persistStateLabel = new Label(layoutSettingsPanel, SWT.NONE);
        persistStateLabel.setText(Messages.getString("AppearancePreferencePage.perspectivePersistScope"));
        persistOptionsCombo = new ComboViewer(layoutSettingsPanel, SWT.READ_ONLY);
        Map<String, String> scopes = new LinkedHashMap<>();
        scopes.put(ITalendCorePrefConstants.PERSPECTIVE_PERSIST_SCOPE_PROJECT_AND_BRANCH,
                Messages.getString("AppearancePreferencePage.perspectivePersistScope.projectAndBranch"));
        scopes.put(ITalendCorePrefConstants.PERSPECTIVE_PERSIST_SCOPE_STUDIO,
                Messages.getString("AppearancePreferencePage.perspectivePersistScope.studio"));
        persistOptionsCombo.setLabelProvider(new LabelProvider() {

            @Override
            public String getText(Object element) {
                if (element instanceof Map.Entry) {
                    return (String) ((Map.Entry) element).getValue();
                }
                return super.getText(element);
            }
        });
        persistOptionsCombo.setContentProvider(new ArrayContentProvider() {

            @Override
            public Object[] getElements(Object inputElement) {
                if (inputElement instanceof Map) {
                    return ((Map) inputElement).entrySet().toArray();
                }
                return super.getElements(inputElement);
            }
        });
        persistOptionsCombo.setInput(scopes);
        String storedScope = CorePlugin.getDefault().getPreferenceStore()
                .getString(ITalendCorePrefConstants.PERSPECTIVE_PERSIST_SCOPE);
        if (StringUtils.isBlank(storedScope)) {
            storedScope = ITalendCorePrefConstants.PERSPECTIVE_PERSIST_SCOPE_DEFAULT;
        }
        final String selectedScope = storedScope;
        Optional<Entry<String, String>> findFirst = scopes.entrySet().stream()
                .filter(entry -> StringUtils.equals(entry.getKey(), selectedScope))
                .findFirst();
        Map.Entry selectedEntry = null;
        if (findFirst.isPresent()) {
            selectedEntry = findFirst.get();
        } else {
            selectedEntry = scopes.entrySet().iterator().next();
        }
        persistOptionsCombo.setSelection(new StructuredSelection(selectedEntry));
    }

    protected void addFields(Composite parent) {
        Composite main = createPageLayout(parent);
        createFontAndColorGroup(main);
    }

    private Composite createPageLayout(Composite parent) {
        Composite main = new Composite(parent, SWT.NULL);
        main.setLayout(new GridLayout());
        GridData gd = new GridData(GridData.GRAB_HORIZONTAL | GridData.HORIZONTAL_ALIGN_FILL);
        gd.horizontalSpan = getHorizontalSpan();
        main.setLayoutData(gd);
        return main;
    }

    private int getHorizontalSpan() {
        return 2;
    }

    protected Composite createFontAndColorGroup(Composite parent) {

        Group group = new Group(parent, SWT.NONE);
        group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        group.setLayout(new GridLayout(3, false));
        Composite composite = new Composite(group, SWT.NONE);
        GridLayout gridLayout = new GridLayout(3, false);
        composite.setLayout(gridLayout);
        GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
        gridData.grabExcessHorizontalSpace = true;
        gridData.horizontalSpan = 3;
        composite.setLayoutData(gridData);
        group.setText(groupName);

        addFontAndColorFields(composite);

        GridLayout layout = new GridLayout();
        layout.numColumns = 3;
        layout.marginWidth = 0;
        layout.marginHeight = 0;
        layout.horizontalSpacing = 8;
        composite.setLayout(layout);

        return group;
    }

    protected void addFontAndColorFields(Composite composite) {
        memoFontEditor = new FontFieldEditor(TalendDesignerPrefConstants.MEMO_TEXT_FONT,
                Messages.getString("AppearancePreferencePage.textFont"), composite); //$NON-NLS-1$
        addField(memoFontEditor);

        consoleFontField = new FontFieldEditor(TalendDesignerPrefConstants.CONSOLT_TEXT_FONT,
                Messages.getString("AppearancePreferencePage.consoleFont"), composite); //$NON-NLS-1$
        addField(consoleFontField);

    }

    @Override
    public void init(IWorkbench workbench) {
    }

    @Override
    public void dispose() {
        super.dispose();
        // TDI-21143 : Studio repository view : remove all refresh call to repo view
        // IRepositoryView view = RepositoryManagerHelper.findRepositoryView();
        // if (view != null) {
        // view.refresh();
        // }
    }

    @Override
    protected void performDefaults() {
        super.performDefaults();
        if (persistOptionsCombo != null) {
            Map<String, String> scopes = (Map<String, String>) persistOptionsCombo.getInput();
            Optional<Entry<String, String>> findFirst = scopes.entrySet().stream().filter(
                    entry -> StringUtils.equals(entry.getKey(), ITalendCorePrefConstants.PERSPECTIVE_PERSIST_SCOPE_DEFAULT))
                    .findFirst();
            Map.Entry selectedEntry = null;
            if (findFirst.isPresent()) {
                selectedEntry = findFirst.get();
            } else {
                selectedEntry = scopes.entrySet().iterator().next();
            }
            persistOptionsCombo.setSelection(new StructuredSelection(selectedEntry));
        }
    }

    @Override
    public boolean performOk() {
        boolean ok = super.performOk();
        if (ok) {
            CorePlugin.getDefault().getDesignerCoreService().switchToCurContextsView();
        }
        if (persistOptionsCombo != null) {
            IStructuredSelection selection = persistOptionsCombo.getStructuredSelection();
            Map.Entry<String, String> selectedEntry = (Entry<String, String>) selection.getFirstElement();
            CorePlugin.getDefault().getPreferenceStore().setValue(ITalendCorePrefConstants.PERSPECTIVE_PERSIST_SCOPE,
                    selectedEntry.getKey());
        }
        return ok;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.gmf.runtime.common.ui.preferences.AbstractPreferencePage#initHelp()
     */

}
