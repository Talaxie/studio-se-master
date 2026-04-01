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
package org.talend.repository.ui.wizards.metadata.connection.database;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.talend.metadata.managment.ui.props.PropertiesFieldModel;
import org.talend.metadata.managment.ui.props.PropertiesTableView;

/**
 * DOC jding  class global comment. Detailled comment
 */
public class LabelledParameterTable {

    public static final String DEFAULT_KEY_NAME = "KEY";

    public static final String DEFAULT_VALUE_NAME = "VALUE";

    public static final String DEFAULT_KEY_COLUMN_NAME = "Key";

    public static final String DEFAULT_VALUE_COLUMN_NAME = "Value";

    private Label label;

    private PropertiesFieldModel propertiesTableModel;

    private PropertiesTableView propertiesTableView;

    private Composite tableComposite;

    private List<Map<String, Object>> properties = new ArrayList<Map<String, Object>>();

    public LabelledParameterTable(final Composite parent, final String labelStr, List<Map<String, Object>> properties,
            final int horizontalSpan) {
        if (properties == null) {
            properties = new ArrayList<Map<String, Object>>();
        }
        this.properties = properties;
        createLabelledParameterTable(parent, labelStr, horizontalSpan);
    }

    private void createLabelledParameterTable(final Composite parent, final String labelStr, final int horizontalSpan) {
        label = new Label(parent, SWT.BEGINNING);
        if (labelStr != null) {
            label.setText(labelStr);
        }
        label.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_BEGINNING));

        tableComposite = new Composite(parent, SWT.NONE);
        GridLayout compositeTableLayout = new GridLayout(1, false);
        compositeTableLayout.marginWidth = 0;
        compositeTableLayout.marginHeight = 0;
        tableComposite.setLayout(compositeTableLayout);
        GridData gridData = new GridData(GridData.FILL_BOTH);
        gridData.grabExcessHorizontalSpace = true;
        gridData.grabExcessVerticalSpace = true;
        gridData.horizontalSpan = horizontalSpan;
        gridData.minimumHeight = 200;
        tableComposite.setLayoutData(gridData);

        propertiesTableModel = new PropertiesFieldModel(properties, ""); //$NON-NLS-1$
        propertiesTableView = new PropertiesTableView(tableComposite, propertiesTableModel) {

            @Override
            public String getKeyName() {
                return getPropertiesKeyName();
            }

            @Override
            public String getValueName() {
                return getPropertiesValueName();
            }

            @Override
            public String getKeyColumnName() {
                return getPropertiesKeyColumnName();
            }

            @Override
            public String getValueColumnName() {
                return getPropertiesValueColumnName();
            }


        };
        propertiesTableModel.setFixedSize(true);
        Composite fieldTableEditorComposite = propertiesTableView.getMainComposite();
        GridData tableGridData = new GridData(SWT.FILL, SWT.FILL, true, true);
        tableGridData.heightHint = 200;
        fieldTableEditorComposite.setLayoutData(tableGridData);

    }

    public void setHideWidgets(final boolean hide) {
        GridData dataLabel = (GridData) label.getLayoutData();
        dataLabel.exclude = hide;
        label.setLayoutData(dataLabel);
        GridData dataCombo = (GridData) tableComposite.getLayoutData();
        dataCombo.exclude = hide;
        tableComposite.setLayoutData(dataCombo);

        label.setVisible(!hide);
        tableComposite.setVisible(!hide);

        if (label.getParent() != null)
            label.getParent().layout();
    }

    public PropertiesFieldModel getPropertiesTableModel() {
        return propertiesTableModel;
    }

    public PropertiesTableView getPropertiesTableView() {
        return propertiesTableView;
    }

    public String getPropertiesKeyName() {
        return DEFAULT_KEY_NAME;
    }

    public String getPropertiesValueName() {
        return DEFAULT_VALUE_NAME;
    }

    public String getPropertiesKeyColumnName() {
        return DEFAULT_KEY_COLUMN_NAME;
    }

    public String getPropertiesValueColumnName() {
        return DEFAULT_VALUE_COLUMN_NAME;
    }

}
