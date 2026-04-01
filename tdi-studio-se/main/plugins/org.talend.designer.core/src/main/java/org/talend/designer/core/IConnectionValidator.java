package org.talend.designer.core;


import org.talend.core.model.process.EConnectionType;
import org.talend.core.model.process.INode;

public interface IConnectionValidator {

    public boolean canConnectToSource(INode oldSource, INode newSource, INode target, EConnectionType lineStyle,
            String connectorName, String connectionName);

    public boolean canConnectToTarget(INode source, INode oldTarget, INode newTarget, EConnectionType lineStyle,
            String connectorName, String connectionName);

}
