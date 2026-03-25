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

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IntegerFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.talend.designer.core.DesignerPlugin;
import org.talend.designer.core.i18n.Messages;

/**
 * DOC cmeng class global comment. Detailled comment
 */
public class PaletteSettingsPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

    protected IntegerFieldEditor recentlyUsedListSize;

    protected static final int RECENTLY_USED_LIST_SIZE_DEFAULT = 12;

    public PaletteSettingsPreferencePage() {
        super(GRID);
        setPreferenceStore(DesignerPlugin.getDefault().getPreferenceStore());
    }

    @Override
    public void init(IWorkbench workbench) {
    }

    public static int getPaletteRencentlyUsedListSize() {
        return DesignerPlugin.getDefault().getPreferenceStore()
                .getInt(TalendDesignerPrefConstants.PALETTE_SETTINGS_RECENTLY_USED_LIST_SIZE);
    }

    @Override
    protected void createFieldEditors() {
        recentlyUsedListSize = new IntegerFieldEditor(TalendDesignerPrefConstants.PALETTE_SETTINGS_RECENTLY_USED_LIST_SIZE,
                Messages.getString("PaletteSettingsPreferencePage.paletteSettingsRecentlyUsedListSize"), //$NON-NLS-1$
                getFieldEditorParent());
        recentlyUsedListSize.setValidRange(1, 1000);
        addField(recentlyUsedListSize);
    }
}
