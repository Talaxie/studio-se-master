package org.talend.designer.core;

import org.eclipse.gef.commands.Command;
import org.talend.core.IService;
import org.talend.core.model.process.IConnection;
import org.talend.core.model.process.INode;

public interface IDbMapDesignerService extends IService {

    public Command getUpdateELTMapComponentCommand(INode targetNode, IConnection connection, String oldConnectionName,
            String newConnectionName);
    
}
