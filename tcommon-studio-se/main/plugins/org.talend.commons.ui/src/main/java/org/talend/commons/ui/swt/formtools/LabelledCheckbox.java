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
package org.talend.commons.ui.swt.formtools;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;

/**
 * Create a Label and a Checkbox.
 */
public class LabelledCheckbox implements LabelledWidget{

    private Button button;

    private Label label;

    /**
     * Create a Label and a Text.
     *
     * @param composite
     * @param string
     */
    public LabelledCheckbox(Composite composite, String string) {
        createLabelledButton(composite, string, 1, true);
    }

    /**
     * Create a Label and a Text.
     *
     * @param composite
     * @param string
     * @param isFill
     */
    public LabelledCheckbox(Composite composite, String string, boolean isFill) {
        createLabelledButton(composite, string, 1, isFill);
    }

    /**
     * Create a Label and a Button width specific styleField.
     *
     * @param composite
     * @param string
     * @param int horizontalSpan
     */
    public LabelledCheckbox(Composite composite, String string, int horizontalSpan) {
        createLabelledButton(composite, string, horizontalSpan, true);
    }

    /**
     * Create a Label and a Button width specific styleField.
     *
     * @param composite
     * @param string
     * @param int horizontalSpan
     * @param styleField
     */
    public LabelledCheckbox(Composite composite, String string, int horizontalSpan, int styleField) {
        createLabelledButton(composite, string, horizontalSpan, true);
    }

    /**
     * Create a Label and a Button width Gridata option FILL.
     *
     * @param composite
     * @param string
     * @param styleField
     * @param int horizontalSpan
     * @param isFill
     */
    public LabelledCheckbox(Composite composite, String string, int horizontalSpan, boolean isFill) {
        createLabelledButton(composite, string, horizontalSpan, isFill);
    }

    /**
     * Create a Label and a Button width specific styleField and Gridata option FILL.
     *
     * @param composite
     * @param string
     * @param int horizontalSpan
     * @param styleField
     * @param isFill
     */
    public LabelledCheckbox(Composite composite, String string, int horizontalSpan, int styleField, boolean isFill) {
        createLabelledButton(composite, string, horizontalSpan, isFill);
    }

    /**
     * Create a Label and a Button width specific styleField and Gridata option FILL.
     *
     * @param composite
     * @param string
     * @param int horizontalSpan
     * @param styleField
     * @param isFill
     */
    private void createLabelledButton(Composite composite, String string, int horizontalSpan, boolean isFill) {
        label = new Label(composite, SWT.LEFT);
        if (string != null) {
            label.setText(string);
        }

        button = new Button(composite, SWT.CHECK);
        int gridDataStyle = SWT.NONE;
        if (isFill) {
            gridDataStyle = SWT.FILL;
        }
        GridData gridData = new GridData(gridDataStyle, SWT.CENTER, true, false);
        gridData.horizontalSpan = horizontalSpan;
        button.setLayoutData(gridData);

    }

    /**
     * setToolTipText to Text Object.
     *
     * @param string
     */
    public void setToolTipText(final String string) {
        button.setToolTipText(string);
    }

    /**
     * is Checkbox Selected.
     *
     * @return boolean
     */
    public Boolean isSelected() {
        return button.getSelection();
    }

    /**
     * setText to Label Object.
     *
     * @param string
     */
    public void setLabelText(final String string) {
        if (string != null) {
            label.setText(string);
        } else {
            label.setText(""); //$NON-NLS-1$
        }

    }

    /**
     * setEditable to Button and Label Object.
     *
     * @param boolean
     */
    public void forceFocus() {
        setEnabled(true);
        button.forceFocus();
    }

    /**
     * setEnabled to Button and Label Object.
     *
     * @param boolean
     */
    public void setEnabled(final boolean visible) {
        button.setEnabled(visible);
        label.setEnabled(visible);
    }

    /**
     * setVisible to Button and Label Object.
     *
     * @param boolean
     */
    public void setVisible(final boolean visible) {
        button.setVisible(visible);
        label.setVisible(visible);
    }

    public void setVisible(final boolean visible, final boolean exclude) {
        Control[] controls = new Control[] { label, button };
        for (Control control : controls) {
            control.setVisible(visible);
            if (control.getLayoutData() instanceof GridData) {
                ((GridData) control.getLayoutData()).exclude = exclude;
            }
        }
    }

    /**
     * addListener to Button Object.
     *
     * @param eventType
     * @param listener
     */
    public void addListener(int eventType, Listener listener) {
        button.addListener(eventType, listener);
    }

    /**
     * addFocusListener to Button Object.
     *
     * @param listener
     */
    public void addFocusListener(FocusListener listener) {
        button.addFocusListener(listener);
    }

    @Override
    public void set(String value) {
        button.setSelection(Boolean.parseBoolean(value));
    }
    
    public void addSelectionListener(SelectionListener listener) {
        button.addSelectionListener(listener);
    }
    
    public boolean getSelection() {
        return button.getSelection();
    }
}
