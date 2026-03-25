package org.talend.designer.core.ui.editor.cmd;

import org.eclipse.gef.commands.Command;
import org.talend.core.model.process.EConnectionType;
import org.talend.core.model.process.IConnection;
import org.talend.core.model.process.IConnectionCategory;
import org.talend.core.model.process.INode;
import org.talend.designer.core.model.components.EParameterName;

public class DisableParallelizationCommand extends Command {

    INode node;

    public DisableParallelizationCommand(INode node) {
        this.node = node;
    }

    public DisableParallelizationCommand(String label) {
        super(label);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void execute() {
        disableParallelization(node);
    }

    private void disableParallelization(INode node) {
        if (node.getOutgoingConnections().size() > 0) {
            for (IConnection con : node.getOutgoingConnections()) {
                EConnectionType lineStyle = con.getLineStyle();
                if (lineStyle.hasConnectionCategory(IConnectionCategory.DATA)) {
                    con.getElementParameter(EParameterName.REPARTITIONER.getName()).setValue(Boolean.FALSE);
                    con.getElementParameter(EParameterName.DEPARTITIONER.getName()).setValue(Boolean.FALSE);
                    con.getElementParameter(EParameterName.PARTITIONER.getName()).setValue(Boolean.FALSE);
                    con.setPropertyValue(EParameterName.NONE.getName(), Boolean.TRUE);

                    if (con.getTarget() != null) {
                        disableParallelization(con.getTarget());
                    }
                } else {
                    node = con.getTarget();
                    disableParallelization(node);
                }
            }
        }
    }
}
