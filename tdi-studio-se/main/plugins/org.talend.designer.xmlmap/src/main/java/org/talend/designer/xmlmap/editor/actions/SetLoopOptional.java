package org.talend.designer.xmlmap.editor.actions;

import java.util.List;

import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IWorkbenchPart;
import org.talend.designer.xmlmap.model.emf.xmlmap.TreeNode;
import org.talend.designer.xmlmap.parts.TreeNodeEditPart;

public class SetLoopOptional extends SelectionAction {

    public static String ID = "org.talend.designer.xmlmap.editor.actions.SetLoopOptional";

    private TreeNodeEditPart nodePart;

    public SetLoopOptional(IWorkbenchPart part) {
        super(part);
        setId(ID);
        setText("As optional loop");
    }

    @Override
    protected boolean calculateEnabled() {
        if (getSelectedObjects().isEmpty()) {
            return false;
        }
        Object s = getSelectedObjects().get(0);
        if (s instanceof List && !((List) s).isEmpty()) {
            List selectedarts = (List) s;
            Object obj = selectedarts.get(selectedarts.size() - 1);
            if (obj instanceof TreeNodeEditPart) {
                nodePart = (TreeNodeEditPart) obj;
                TreeNode model = (TreeNode) nodePart.getModel();
                if (model.isLoop()) {
                    if (model.isOptional()) {
                        setText("Remove loop optional");
                    } else {
                        setText("As optional loop");
                    }
                    return true;
                }

            } else {
                return false;
            }
        }
        return false;
    }

    public void update(Object selection) {
        setSelection(new StructuredSelection(selection));
    }

    @Override
    public void run() {
        TreeNode model = (TreeNode) nodePart.getModel();
        model.setOptional(!model.isOptional());
    }

}
