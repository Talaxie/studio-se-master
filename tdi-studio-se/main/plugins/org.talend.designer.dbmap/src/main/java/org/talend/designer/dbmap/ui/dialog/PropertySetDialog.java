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
package org.talend.designer.dbmap.ui.dialog;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.talend.core.model.components.IComponent;
import org.talend.designer.dbmap.i18n.Messages;
import org.talend.designer.dbmap.language.generation.DbGenerationManager;
import org.talend.designer.dbmap.managers.MapperManager;
/**
 * 
 * created by hcyi on Nov 24, 2020 Detailled comment
 *
 */
public class PropertySetDialog extends Dialog {

    private MapperManager mapperManager;

    private DbGenerationManager generationManager;

    private Button addQuotesInColumnsButton;
    
    private Button addQuotesInTableNamesButton;
    
    private Label delimitedCharacterLabel;
    
    private Text delimitedCharacterText;

    private Button useAliasButton;

    private final Color color = new Color(Display.getDefault(), 238, 238, 0);

    public PropertySetDialog(Shell parentShell, MapperManager mapperManager) {
        super(parentShell);
        this.mapperManager = mapperManager;
        generationManager = mapperManager.getComponent().getGenerationManager();
    }

    @Override
    protected Control createDialogArea(Composite parent) {
        Composite container = (Composite) super.createDialogArea(parent);
        final GridLayout gridLayout = new GridLayout();
        gridLayout.marginLeft = 10;
        gridLayout.marginTop = 20;
        gridLayout.marginHeight = 0;
        container.setLayout(gridLayout);

        addQuotesInColumnsButton = new Button(container, SWT.CHECK);
        addQuotesInColumnsButton.setText(Messages.getString("PropertySetDialog.add_quotes_in_columns.title")); //$NON-NLS-1$

        addQuotesInTableNamesButton = new Button(container, SWT.CHECK);
        addQuotesInTableNamesButton.setText(Messages.getString("PropertySetDialog.add_quotes_in_table_names.title"));//$NON-NLS-1$

        Composite delimitedComp = new Composite(container, SWT.NONE);
        FillLayout fill = new FillLayout();
        delimitedComp.setLayout(fill);

        delimitedCharacterLabel = new Label(delimitedComp, SWT.NONE);
        delimitedCharacterLabel.setText(Messages.getString("PropertySetDialog.delimited_character.title"));
        delimitedCharacterText = new Text(delimitedComp, SWT.BORDER);
        delimitedComp.layout();
        useAliasButton = new Button(container, SWT.CHECK);
        String useAliasTitle = Messages.getString("PropertySetDialog.useAlias.title");//$NON-NLS-1$
        IComponent component = mapperManager.getComponent().getComponent();
        if (component != null && "tELTOracleMap".equals(component.getName())) { //$NON-NLS-1$
            useAliasTitle = Messages.getString("PropertySetDialog.useAlias.oracle.title");//$NON-NLS-1$
        }
        useAliasButton.setText(useAliasTitle);

        init();
        addListener();
        updateStatus();
        return container;
    }

    private void init() {
        addQuotesInColumnsButton.setSelection(generationManager.isAddQuotesInColumns());
        addQuotesInTableNamesButton.setSelection(generationManager.isAddQuotesInTableNames());
        boolean delimitedCharacter = generationManager.isDelimitedCharacter();
        String text = generationManager.getDelimitedCharacterText();
        IComponent component = mapperManager.getComponent().getComponent();
        boolean isJdbcEltMap = false;
        if (component != null && "tELTMap".equals(component.getName())) { //$NON-NLS-1$
            isJdbcEltMap = true;
        }
        // set visible as false always for now . later maybe set to isJdbcEltMap to let user override the quote.
        delimitedCharacterText.setVisible(false);
        delimitedCharacterLabel.setVisible(false);

        addQuotesInTableNamesButton.setVisible(isJdbcEltMap);
        if (StringUtils.isBlank(text)) {
            text = generationManager.getQuote(mapperManager.getComponent());
        }
        delimitedCharacterText.setText(text);

        useAliasButton.setSelection(generationManager.isUseAliasInOutputTable());

        // Implement the column alias only for tELTTeradataMap/tELTOracleMap now.
        boolean enabled = false;
        if (component != null && ("tELTTeradataMap".equals(component.getName()) || "tELTOracleMap".equals(component.getName()))) { //$NON-NLS-1$ //$NON-NLS-2$
            enabled = true;
        }
        useAliasButton.setVisible(enabled);
    }

    private void addListener() {
        addQuotesInColumnsButton.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                mapperManager.setAddQuotesInColumns(addQuotesInColumnsButton.getSelection());
                updateStatus();
                if (addQuotesInColumnsButton.getSelection()) {
                    mapperManager.setDelimitedCharacter(true);
                } else {
                    if (!addQuotesInTableNamesButton.getSelection()) {
                        mapperManager.setDelimitedCharacter(false);
                    }
                }
            }
        });
        useAliasButton.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                mapperManager.useAliasInOutputTable(useAliasButton.getSelection());
                updateStatus();
            }
        });
        addQuotesInTableNamesButton.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                mapperManager.setAddQuotesInTableNames(addQuotesInTableNamesButton.getSelection());
                updateStatus();
                if (addQuotesInTableNamesButton.getSelection()) {
                    mapperManager.setDelimitedCharacter(true);
                } else {
                    if (!addQuotesInColumnsButton.getSelection()) {
                        mapperManager.setDelimitedCharacter(false);
                    }
                }
            }
        });
//        delimitedCharacterButton.addSelectionListener(new SelectionAdapter() {
//
//            @Override
//            public void widgetSelected(SelectionEvent e) {
//                boolean selected = delimitedCharacterButton.getSelection();
//                mapperManager.setDelimitedCharacter(selected);
//                delimitedCharacterText.setEditable(selected);
//                updateStatus();
//            }
//        });
        
        delimitedCharacterText.addModifyListener( new ModifyListener() {

            @Override
            public void modifyText(ModifyEvent e) {
                mapperManager.setDelimitedCharacterText(delimitedCharacterText.getText());
                updateStatus();
                delimitedCharacterText.setBackground(null);
            }

        } );
    }

    private void updateStatus() {
        if (generationManager.isAddQuotesInColumns() == addQuotesInColumnsButton.getSelection()) {
            addQuotesInColumnsButton.setBackground(null);
        } else {
            addQuotesInColumnsButton.setBackground(color);
        }
        if (generationManager.isAddQuotesInTableNames() == addQuotesInTableNamesButton.getSelection()) {
            addQuotesInTableNamesButton.setBackground(null);
        } else {
            addQuotesInTableNamesButton.setBackground(color);
        }
//        if (generationManager.isDelimitedCharacter() == delimitedCharacterButton.getSelection()) {
//            delimitedCharacterButton.setBackground(null);
//            delimitedCharacterText.setBackground(null);
//        } else {
//            delimitedCharacterButton.setBackground(color);
//            delimitedCharacterText.setBackground(color);
//
//        }
        if (generationManager.isUseAliasInOutputTable() == useAliasButton.getSelection()) {
            useAliasButton.setBackground(null);
        } else {
            useAliasButton.setBackground(color);
        }
    }

    @Override
    protected void createButtonsForButtonBar(Composite parent) {
        createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
        createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
    }

    @Override
    protected Point getInitialSize() {
        return new Point(500, 300);
    }

    @Override
    protected void configureShell(Shell newShell) {
        super.configureShell(newShell);
        newShell.setText(Messages.getString("PropertySetDialog.title")); //$NON-NLS-1$
    }

    @Override
    protected void okPressed() {
        mapperManager.setAddQuotesInColumns(addQuotesInColumnsButton.getSelection());
        String text = delimitedCharacterText.getText();
        mapperManager.setDelimitedCharacterText(text);
        mapperManager
                .setDelimitedCharacter(
                        addQuotesInColumnsButton.getSelection() || addQuotesInTableNamesButton.getSelection());
        mapperManager.setAddQuotesInTableNames(addQuotesInTableNamesButton.getSelection());
        mapperManager.useAliasInOutputTable(useAliasButton.getSelection());
        if (StringUtils.isBlank(text)
                && (addQuotesInColumnsButton.getSelection() || addQuotesInTableNamesButton.getSelection())) {
            delimitedCharacterText.setBackground(delimitedCharacterText.getDisplay().getSystemColor(SWT.COLOR_RED));
            MessageDialog
                    .openError(delimitedCharacterText.getShell(),
                            Messages.getString("PropertySetDialog.error_delimited_character.title"), //$NON-NLS-1$
                            Messages.getString("PropertySetDialog.error_delimited_character.message"));
            return;
        }
        super.okPressed();
    }
}
