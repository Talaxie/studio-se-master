// ============================================================================
//
// Copyright (C) 2006-2023 Talaxie Inc. - www.deilink.fr
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talaxie SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.designer.core.ui.editor.properties.controllers.ui;

import java.beans.PropertyChangeEvent;
import java.util.Collection;

import org.apache.commons.lang.StringUtils;
import org.eclipse.gef.commands.Command;
import org.eclipse.jface.fieldassist.DecoratedField;
import org.eclipse.jface.fieldassist.FieldDecoration;
import org.eclipse.jface.fieldassist.FieldDecorationRegistry;
import org.eclipse.jface.fieldassist.IControlCreator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.talend.core.model.process.IElementParameter;
import org.talend.core.model.process.INode;
import org.talend.core.ui.properties.tab.IDynamicProperty;
import org.talend.designer.core.ui.editor.nodes.Node;
import org.talend.designer.core.ui.editor.properties.controllers.executors.ComponentListControllerExecutor;
import org.talend.designer.core.utils.DesignerUtilities;


/**
 * DOC cmeng  class global comment. Detailled comment
 */
public class ComponentListSWTControllerUI extends AbsSWTControllerUI implements IComponentListControllerUI {

    public ComponentListSWTControllerUI(IDynamicProperty dp) {
        super(dp, new ComponentListControllerExecutor());
        getControllerExecutor().init(getControllerContext(), this);
    }

    @Override
    public ComponentListControllerExecutor getControllerExecutor() {
        return (ComponentListControllerExecutor) super.getControllerExecutor();
    }

    @Override
    public IWidgetContext getDefaultControlContext() {
        return new StudioWidgetContext(
                (Control) hashCurControls.get(getControllerExecutor().getParameterName(getCurParameter())));
    }

    private Command createCommand(SelectionEvent selectionEvent) {
        Collection<String> elementsName = hashCurControls.keySet();
        for (String name : elementsName) {
            Object o = hashCurControls.get(name);
            if (o instanceof Control) {
                Control ctrl = (Control) o;
                if (ctrl == null) {
                    hashCurControls.remove(name);
                    return null;
                }

                if (ctrl.equals(selectionEvent.getSource()) && ctrl instanceof CCombo) {
                    boolean isDisposed = ((CCombo) ctrl).isDisposed();
                    if (!isDisposed && (!elem.getPropertyValue(name).equals(((CCombo) ctrl).getText()))) {
                        return getControllerExecutor().createCommand(new StudioWidgetContext(ctrl));
                    }
                }
            }
        }
        return null;
    }

    IControlCreator cbCtrl = new IControlCreator() {

        @Override
        public Control createControl(final Composite parent, final int style) {
            CCombo cb = new CCombo(parent, style);
            return cb;
        }
    };

    @Override
    public Control createControl(Composite subComposite, IElementParameter param, int numInRow, int nbInRow, int top,
            Control lastControl) {
        this.curParameter = param;
        boolean isJobletOk = false;
        // IJobletProviderService service = getJobletProviderService(param);
        // if (service == null) { // not joblet
        // param.setDisplayName(EParameterName.COMPONENT_LIST.getDisplayName());
        // }
        DecoratedField dField = new DecoratedField(subComposite, SWT.BORDER, cbCtrl);
        if (param.isRequired()) {
            FieldDecoration decoration = FieldDecorationRegistry.getDefault()
                    .getFieldDecoration(FieldDecorationRegistry.DEC_REQUIRED);
            dField.addFieldDecoration(decoration, SWT.RIGHT | SWT.TOP, false);
        }

        Control cLayout = dField.getLayoutControl();
        CCombo combo = (CCombo) dField.getControl();
        FormData data;
        combo.setEditable(false);
        cLayout.setBackground(subComposite.getBackground());
        combo.setEnabled(!param.isReadOnly());
        combo.addSelectionListener(listenerSelection);
        if (elem instanceof Node) {
            combo.setToolTipText(VARIABLE_TOOLTIP + param.getVariableName());
        }

        CLabel labelLabel = getWidgetFactory().createCLabel(subComposite, param.getDisplayName());
        data = new FormData();
        if (lastControl != null) {
            data.left = new FormAttachment(lastControl, 0);
        } else {
            data.left = new FormAttachment((((numInRow - 1) * MAX_PERCENT) / nbInRow), 0);
        }
        data.top = new FormAttachment(0, top);
        labelLabel.setLayoutData(data);
        if (numInRow != 1) {
            labelLabel.setAlignment(SWT.RIGHT);
        }
        // *********************
        data = new FormData();
        int currentLabelWidth = STANDARD_LABEL_WIDTH;
        GC gc = new GC(labelLabel);
        Point labelSize = gc.stringExtent(param.getDisplayName());
        gc.dispose();

        if ((labelSize.x + ITabbedPropertyConstants.HSPACE) > currentLabelWidth) {
            currentLabelWidth = labelSize.x + ITabbedPropertyConstants.HSPACE;
        }

        if (numInRow == 1) {
            if (lastControl != null) {
                data.left = new FormAttachment(lastControl, currentLabelWidth);
            } else {
                data.left = new FormAttachment(0, currentLabelWidth);
            }

        } else {
            data.left = new FormAttachment(labelLabel, 0, SWT.RIGHT);
        }
        data.top = new FormAttachment(0, top);
        cLayout.setLayoutData(data);
        Point initialSize = dField.getLayoutControl().computeSize(SWT.DEFAULT, SWT.DEFAULT);

        // **********************
        hashCurControls.put(getControllerExecutor().getParameterName(param), combo);

        dynamicProperty.setCurRowSize(initialSize.y + ITabbedPropertyConstants.VSPACE);
        return cLayout;
    }

    @Override
    public void refresh(IElementParameter param, boolean check) {
        CCombo combo = (CCombo) hashCurControls.get(getControllerExecutor().getParameterName(param));
        if (combo == null || combo.isDisposed()) {
            return;
        }
        getControllerExecutor().doUpdateComponentList(elem, param);

        String[] curComponentNameList = param.getListItemsDisplayName();
        String[] curComponentValueList = (String[]) param.getListItemsValue();

        Object value = param.getValue();
        int numValue = -1;
        for (int i = 0; i < curComponentValueList.length; i++) {
            if (curComponentValueList[i].equals(value)) {
                numValue = i;
                break;
            }
        }

        if (param.isContextMode()) {
            String paramValue = (String) value;
            if (elem instanceof INode) {
                INode currentNode = (INode) elem;
                String completeValue = getControllerExecutor().getDisplayUniqueName(currentNode, paramValue);
                if (StringUtils.isNotBlank(completeValue)
                        || StringUtils.isBlank(completeValue) && DesignerUtilities.validateJobletShortName(paramValue)) {
                    paramValue = completeValue;
                }
            }
            combo.setBackground(Display.getDefault().getSystemColor(SWT.COLOR_YELLOW));
            combo.setEnabled(false);
            combo.setText(paramValue);
        } else {
            combo.setItems(curComponentNameList);
            if (numValue == -1) {
                if (getControllerExecutor().isSelectDefaultItem() && curComponentNameList.length > 0) {
                    elem.setPropertyValue(getControllerExecutor().getParameterName(param), curComponentValueList[0]);
                    combo.setText(curComponentNameList[0]);
                }
            } else {
                combo.setText(curComponentNameList[numValue]);
            }
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * org.talend.designer.core.ui.editor.properties.controllers.AbstractElementPropertySectionController#
     * estimateRowSize
     * (org.eclipse.swt.widgets.Composite, org.talend.core.model.process.IElementParameter)
     */
    @Override
    public int estimateRowSize(Composite subComposite, IElementParameter param) {
        DecoratedField dField = new DecoratedField(subComposite, SWT.BORDER, cbCtrl);
        Point initialSize = dField.getLayoutControl().computeSize(SWT.DEFAULT, SWT.DEFAULT);
        dField.getLayoutControl().dispose();

        return initialSize.y + ITabbedPropertyConstants.VSPACE;
    }

    SelectionListener listenerSelection = new SelectionAdapter() {

        @Override
        public void widgetSelected(SelectionEvent event) {
            Command cmd = createCommand(event);
            executeCommand(cmd);
        }
    };

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        // TODO Auto-generated method stub

    }

}
