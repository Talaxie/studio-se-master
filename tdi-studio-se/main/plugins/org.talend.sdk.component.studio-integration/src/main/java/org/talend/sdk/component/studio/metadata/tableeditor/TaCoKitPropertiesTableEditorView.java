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
package org.talend.sdk.component.studio.metadata.tableeditor;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.talend.commons.ui.runtime.swt.tableviewer.data.ModifiedObjectInfo;
import org.talend.commons.ui.swt.tableviewer.TableViewerCreator;
import org.talend.core.model.process.EParameterFieldType;
import org.talend.core.model.process.ElementParameterValueModel;
import org.talend.core.model.process.IElement;
import org.talend.core.model.process.IElementParameter;
import org.talend.designer.core.ui.editor.properties.macrowidgets.tableeditor.PropertiesTableEditorModel;
import org.talend.designer.core.ui.editor.properties.macrowidgets.tableeditor.PropertiesTableEditorView;
import org.talend.sdk.component.studio.util.TaCoKitUtil;

/**
 * created by hcyi on Mar 17, 2021
 * Detailled comment
 *
 */
public class TaCoKitPropertiesTableEditorView<B> extends PropertiesTableEditorView<B> {

    public TaCoKitPropertiesTableEditorView(Composite parentComposite, int mainCompositeStyle, PropertiesTableEditorModel model,
            boolean toolbarVisible, boolean labelVisible) {
        super(parentComposite, mainCompositeStyle, model, toolbarVisible, labelVisible);
    }

    @Override
    protected Object getComboBoxCellOriginalTypedValue(final TableViewerCreator<B> tableViewerCreator, IElement element,
            IElementParameter currentParam, CellEditor cellEditor, String currentKey, Object cellEditorTypedValue) {
        Object returnedValue = null;
        if (cellEditorTypedValue != null && cellEditorTypedValue instanceof Integer) {
            int index = (Integer) cellEditorTypedValue;
            ComboBoxCellEditor cbc = ((ComboBoxCellEditor) cellEditor);
            CCombo combo = (CCombo) cbc.getControl();
            String val = null;

            boolean needUpdateListItem = false;
            if (combo.getEditable() && !StringUtils.isBlank(combo.getText())) {
                val = String.valueOf(combo.getText());
                needUpdateListItem = true;
            }

            int rowNumber = ((Table) combo.getParent()).getSelectionIndex();

            Map<String, String> svs = new LinkedHashMap<String, String>();

            if (currentParam.getListItemsValue() != null && currentParam.getListItemsValue().length > 0) {
                Object[] listItemsValue = currentParam.getListItemsValue();
                String[] listItemsDisplayName = currentParam.getListItemsDisplayName();
                for (int i = 0; i < listItemsValue.length; i++) {
                    svs.put(listItemsDisplayName[i], String.valueOf(listItemsValue[i]));
                }
            }

            if (!StringUtils.isEmpty(val) && !svs.keySet().contains(val)) {
                svs.put(val, val);
            }

            if (!svs.isEmpty() && needUpdateListItem) {
                TaCoKitUtil.updateElementParameter(currentParam, svs);
            }

            String[] listToDisplay = getItemsToDisplay(element, currentParam, rowNumber);
            if (listToDisplay != null && listToDisplay.length > 0 && !Arrays.equals(listToDisplay, cbc.getItems())) {
                ((ComboBoxCellEditor) cellEditor).setItems(listToDisplay);
            }

            String[] namesSet = ((CCombo) cellEditor.getControl()).getItems();
            if (val != null) {
                for (int i = 0; i < namesSet.length; i++) {
                    if (StringUtils.equals(namesSet[i], val)) {
                        index = i;
                        break;
                    }
                }
            }

            if (namesSet.length > 0 && index > -1 && index < namesSet.length) {
                if (EParameterFieldType.TACOKIT_VALUE_SELECTION.equals(currentParam.getFieldType())) {
                    ElementParameterValueModel model = new ElementParameterValueModel();
                    model.setValue(svs.get(namesSet[index]));
                    model.setLabel(namesSet[index]);
                    returnedValue = model;
                } else {
                    returnedValue = namesSet[index];
                }
            } else {
                returnedValue = null;
            }
            // Update
            if (namesSet.length > 0 && returnedValue != null && currentKey != null) {
                ModifiedObjectInfo modifiedObjectInfo = tableViewerCreator.getModifiedObjectInfo();
                Object bean = modifiedObjectInfo.getCurrentModifiedBean();
                Object existedValue = ((Map<String, Object>) bean).get(currentKey);
                if (existedValue != null && !returnedValue.equals(existedValue)) {
                    ((Map<String, Object>) bean).put(currentKey, null);
                }
            }
        } else {
            returnedValue = null;
        }
        return returnedValue;
    }

    @Override
    protected Object getComboBoxCellEditorTypedValue(final TableViewerCreator<B> tableViewerCreator, IElement element,
            IElementParameter currentParam, CellEditor cellEditor, String currentKey, Object originalTypedValue) {
        CCombo combo = (CCombo) cellEditor.getControl();
        int rowNumber = ((Table) combo.getParent()).getSelectionIndex();
        ComboBoxCellEditor cbc = ((ComboBoxCellEditor) cellEditor);

        TaCoKitUtil.updateElementParameter(element, currentParam, rowNumber, originalTypedValue);
        String[] listToDisplay = getItemsToDisplay(element, currentParam, rowNumber);
        if (!Arrays.equals(listToDisplay, cbc.getItems())) {
            ((ComboBoxCellEditor) cellEditor).setItems(listToDisplay);
        }
        Object returnedValue = 0;
        if (originalTypedValue != null) {
            String[] namesSet = listToDisplay;
            for (int j = 0; j < namesSet.length; j++) {
                if (namesSet[j].equals(originalTypedValue)) {
                    returnedValue = j;
                    break;
                }
            }
        }
        return returnedValue;
    }

    @Override
    protected void fillDefaultItemsList(IElementParameter currentParam, Object originalValue) {
        String[] listItems = currentParam.getListItemsDisplayName();
        if (!Arrays.asList(listItems).contains(originalValue)) {
            TaCoKitUtil.fillDefaultItemsList(currentParam, originalValue);
        }
    }
}
