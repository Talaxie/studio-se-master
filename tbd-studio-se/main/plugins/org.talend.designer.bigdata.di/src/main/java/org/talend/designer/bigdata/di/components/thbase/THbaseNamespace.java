package org.talend.designer.bigdata.di.components.thbase;

import org.talend.designer.codegen.config.CodeGeneratorArgument;

public class THbaseNamespace extends THbaseAbstract {
    public THbaseNamespace(CodeGeneratorArgument codeGeneratorArgument) {
        super(codeGeneratorArgument);
    }

    public String getNamespaceAction() {
        return BigDataDIComponent.getParameter(node, "__NAMESPACE_ACTION__", "NONE");
    }
}
