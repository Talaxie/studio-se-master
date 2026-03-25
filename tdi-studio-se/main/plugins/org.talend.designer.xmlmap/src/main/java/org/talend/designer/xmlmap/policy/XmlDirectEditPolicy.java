package org.talend.designer.xmlmap.policy;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.DirectEditPolicy;
import org.eclipse.gef.requests.DirectEditRequest;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.TextCellEditor;
import org.talend.designer.gefabstractmap.part.directedit.DirectEditType;
import org.talend.designer.xmlmap.commands.DirectEditCommand;
import org.talend.designer.xmlmap.commands.TreeSettingDirectEditCommand;
import org.talend.designer.xmlmap.model.emf.xmlmap.AbstractNode;

public class XmlDirectEditPolicy extends DirectEditPolicy {

    @Override
    protected Command getDirectEditCommand(DirectEditRequest request) {
        Command command = null;
        CellEditor editor = request.getCellEditor();

        Object directEditFeature = request.getDirectEditFeature();
        if (directEditFeature instanceof DirectEditType) {
            DirectEditType type = (DirectEditType) directEditFeature;
            if (getHost().getModel() instanceof AbstractNode) {
                AbstractNode model = (AbstractNode) getHost().getModel();
                switch (type) {
                case EXPRESSION:
                case NODE_NAME:
                    command = new DirectEditCommand(getHost(), model, type, request.getCellEditor().getValue());
                    break;
                case VAR_NODE_TYPE:
                    if (editor instanceof ComboBoxCellEditor) {
                        ComboBoxCellEditor combo = (ComboBoxCellEditor) editor;
                        int selectIndex = (Integer) combo.getValue();
                        command = new DirectEditCommand(getHost(), model, type, combo.getItems()[selectIndex]);
                    }
                    break;
                case LOOKUP_MODEL:
                case MATCH_MODEL:
                case JOIN_MODEL:
                case PERSISTENT_MODEL:
                case OUTPUT_REJECT:
                case LOOK_UP_INNER_JOIN_REJECT:
                    if (editor instanceof ComboBoxCellEditor) {
                        ComboBoxCellEditor combo = (ComboBoxCellEditor) editor;
                        int selectIndex = (Integer) combo.getValue();
                        command = new TreeSettingDirectEditCommand(model, type, combo.getItems()[selectIndex]);
                    }
                    break;
                case EXPRESSION_FILTER:
                    if (editor instanceof TextCellEditor) {
                        command = new TreeSettingDirectEditCommand(model, type, request.getCellEditor().getValue());
                    }
                default:
                    break;
                }

            } else {
                switch (type) {
                case LOOKUP_MODEL:
                case MATCH_MODEL:
                case JOIN_MODEL:
                case PERSISTENT_MODEL:
                case OUTPUT_REJECT:
                case LOOK_UP_INNER_JOIN_REJECT:
                case ALL_IN_ONE:
                case ENABLE_EMPTY_ELEMENT:
                    if ((editor instanceof ComboBoxCellEditor)) {
                        ComboBoxCellEditor combo = (ComboBoxCellEditor) editor;
                        int selectIndex = (Integer) combo.getValue();
                        command = new TreeSettingDirectEditCommand(getHost().getModel(), type, combo.getItems()[selectIndex]);
                    }
                    break;
                case EXPRESSION_FILTER:
                    command = new TreeSettingDirectEditCommand(getHost().getModel(), type, request.getCellEditor().getValue());
                }

            }
        }

        return command;
    }

    @Override
    protected void showCurrentEditValue(DirectEditRequest request) {
        // TODO Auto-generated method stub

    }

}
