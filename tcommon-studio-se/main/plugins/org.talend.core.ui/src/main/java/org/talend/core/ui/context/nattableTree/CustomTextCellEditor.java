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
package org.talend.core.ui.context.nattableTree;

import org.eclipse.nebula.widgets.nattable.edit.EditConfigAttributes;
import org.eclipse.nebula.widgets.nattable.edit.config.RenderErrorHandling;
import org.eclipse.nebula.widgets.nattable.edit.editor.AbstractCellEditor;
import org.eclipse.nebula.widgets.nattable.edit.editor.ControlDecorationProvider;
import org.eclipse.nebula.widgets.nattable.edit.editor.IEditErrorHandler;
import org.eclipse.nebula.widgets.nattable.selection.SelectionLayer.MoveDirectionEnum;
import org.eclipse.nebula.widgets.nattable.style.CellStyleAttributes;
import org.eclipse.nebula.widgets.nattable.style.DisplayMode;
import org.eclipse.nebula.widgets.nattable.style.IStyle;
import org.eclipse.nebula.widgets.nattable.style.Style;
import org.eclipse.nebula.widgets.nattable.util.GUIHelper;
import org.eclipse.nebula.widgets.nattable.widget.EditModeEnum;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;
import org.talend.commons.utils.PasswordEncryptUtil;
import org.talend.core.model.process.IContextParameter;

/**
 * created by ldong on Sep 5, 2014 Detailled comment
 *
 */
public class CustomTextCellEditor extends AbstractCellEditor {

    private final IContextParameter realPara;

    private final IStyle cellStyle;

    private final boolean commitOnUpDown;

    private final boolean moveSelectionOnEnter;

    protected boolean freeEdit = false;

    protected boolean commitOnEnter = true;

    /*
     * The wrapped editor control.
     */
    private ContextValuesNatText buttonText;

    /**
     * if password, the value will be * always. should find out the real value.
     */
    private Object recordOriginalCanonicalValue;
    
    protected final ControlDecorationProvider decorationProvider = new ControlDecorationProvider();

    /**
     * The {@link IEditErrorHandler} that is used for showing conversion errors
     * on typing into this editor. By default this is the
     * {@link RenderErrorHandling} which will render the content in the editor
     * red to indicate a conversion error.
     */
    private IEditErrorHandler inputConversionErrorHandler = new RenderErrorHandling(this.decorationProvider);
    
    private IEditErrorHandler inputValidationErrorHandler = new RenderErrorHandling(this.decorationProvider);

    public CustomTextCellEditor(IContextParameter realPara, IStyle cellStyle, boolean commitOnUpDown, boolean moveSelectionOnEnter) {
        this.realPara = realPara;
        this.cellStyle = cellStyle;
        this.commitOnUpDown = commitOnUpDown;
        this.moveSelectionOnEnter = moveSelectionOnEnter;
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * org.eclipse.nebula.widgets.nattable.edit.editor.ICellEditor#createEditorControl(org.eclipse.swt.widgets.Composite
     * )
     */
    @Override
    public Control createEditorControl(Composite parentComp) {
        int style = this.editMode == EditModeEnum.INLINE ? SWT.NONE : SWT.BORDER;
        if (!this.freeEdit) {
            style |= SWT.READ_ONLY;
        }
        final ContextValuesNatText text = new ContextValuesNatText(parentComp, cellStyle, realPara, style);

        addTextListener(text);
        return text;

    }

    protected void addTextListener(final ContextValuesNatText text) {
        text.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent event) {
                if (commitOnEnter && (event.keyCode == SWT.CR || event.keyCode == SWT.KEYPAD_CR)) {
                    MoveDirectionEnum move = MoveDirectionEnum.NONE;
                    if (moveSelectionOnEnter && editMode == EditModeEnum.INLINE) {
                        if (event.stateMask == 0) {
                            move = MoveDirectionEnum.DOWN;
                        } else if (event.stateMask == SWT.SHIFT) {
                            move = MoveDirectionEnum.UP;
                        }
                    }

                    commit(move);
                } else if (event.keyCode == SWT.ESC && event.stateMask == 0) {
                    close();
                } else if (commitOnUpDown && editMode == EditModeEnum.INLINE) {
                    if (event.keyCode == SWT.ARROW_UP) {
                        commit(MoveDirectionEnum.UP);
                    } else if (event.keyCode == SWT.ARROW_DOWN) {
                        commit(MoveDirectionEnum.DOWN);
                    }
                }
            }
            @Override
            public void keyReleased(KeyEvent e) {
                try {
                    // always do the conversion
                    Object canonicalValue = getCanonicalValue(CustomTextCellEditor.this.inputConversionErrorHandler);
                    // and always do the validation, even if for committing the
                    // validation should be skipped, on editing
                    // a validation failure should be made visible
                    // otherwise there would be no need for validation!
                    validateCanonicalValue(canonicalValue, CustomTextCellEditor.this.inputValidationErrorHandler);
                } catch (Exception ex) {
                    // do nothing as exceptions caused by conversion or
                    // validation are handled already we just need this catch
                    // block for stopping the process if conversion failed with
                    // an exception
                }
            }
        });

        
        // text.addFocusListener(new FocusAdapter() {
        //
        // @Override
        // public void focusLost(FocusEvent e) {
        // commit(MoveDirectionEnum.NONE, editMode == EditModeEnum.INLINE);
        // }
        // });
    }

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.nebula.widgets.nattable.edit.editor.ICellEditor#getEditorControl()
     */
    @Override
    public Control getEditorControl() {
        return this.buttonText;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.nebula.widgets.nattable.edit.editor.ICellEditor#getEditorValue()
     */
    @Override
    public Object getEditorValue() {
        return this.buttonText.getValue();
    }

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.nebula.widgets.nattable.edit.editor.ICellEditor#setEditorValue(java.lang.Object)
     */
    @Override
    public void setEditorValue(Object value) {
        this.buttonText.setValue(value != null && value.toString().length() > 0 ? value.toString() : ""); //$NON-NLS-1$

    }

    /*
     * (non-Javadoc)
     *
     * @see
     * org.eclipse.nebula.widgets.nattable.edit.editor.AbstractCellEditor#activateCell(org.eclipse.swt.widgets.Composite
     * , java.lang.Object)
     */
    @Override
    public Control activateCell(Composite parentComp, Object originalCanonicalValue) {
        this.recordOriginalCanonicalValue = originalCanonicalValue;
        if (PasswordEncryptUtil.isPasswordType(realPara.getType())) { // if pasword, get the real one.
            this.recordOriginalCanonicalValue = realPara.getValue(); // correct the value.
        }

        this.buttonText = (ContextValuesNatText) createEditorControl(parentComp);
        if (this.inputConversionErrorHandler instanceof RenderErrorHandling) {
            IStyle conversionErrorStyle = this.configRegistry.getConfigAttribute(
                    EditConfigAttributes.CONVERSION_ERROR_STYLE,
                    DisplayMode.EDIT,
                    this.labelStack);

            ((RenderErrorHandling) this.inputConversionErrorHandler).setErrorStyle(conversionErrorStyle);
        }

        if (this.inputValidationErrorHandler instanceof RenderErrorHandling) {
            IStyle validationErrorStyle = this.configRegistry.getConfigAttribute(
                    EditConfigAttributes.VALIDATION_ERROR_STYLE,
                    DisplayMode.EDIT,
                    this.labelStack);

            if (validationErrorStyle == null) {
                validationErrorStyle = new Style();
                validationErrorStyle.setAttributeValue(
                        CellStyleAttributes.FOREGROUND_COLOR,
                        GUIHelper.COLOR_RED);
            }

            ((RenderErrorHandling) this.inputValidationErrorHandler).setErrorStyle(validationErrorStyle);
        }
        // use the real value.
        setCanonicalValue(this.recordOriginalCanonicalValue);

        Text text = buttonText.getText();
        if (buttonText.getButton() == null) {
            text.forceFocus();
        }
        text.setSelection(0, text.getText().length());

        return this.buttonText;
    }

    /**
     * Getter for freeEdit.
     *
     * @return the freeEdit
     */
    public boolean isFreeEdit() {
        return this.freeEdit;
    }

    /**
     * Sets the freeEdit.
     *
     * @param freeEdit the freeEdit to set
     */
    public void setFreeEdit(boolean freeEdit) {
        this.freeEdit = freeEdit;
    }

    
    public IEditErrorHandler getInputConversionErrorHandler() {
        return inputConversionErrorHandler;
    }

    
    public void setInputConversionErrorHandler(IEditErrorHandler inputConversionErrorHandler) {
        this.inputConversionErrorHandler = inputConversionErrorHandler;
    }

    
    public IEditErrorHandler getInputValidationErrorHandler() {
        return inputValidationErrorHandler;
    }

    
    public void setInputValidationErrorHandler(IEditErrorHandler inputValidationErrorHandler) {
        this.inputValidationErrorHandler = inputValidationErrorHandler;
    }
    
}
