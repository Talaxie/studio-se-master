package org.talend.designer.bigdata.di.components.thbase;

import org.talend.designer.bigdata.di.components.DesignerDIComponent;
import org.talend.designer.codegen.config.CodeGeneratorArgument;

public class THbaseDeleteRows extends THbaseAbstract implements DesignerDIComponent.WithDieOnErrorOption {

    public THbaseDeleteRows(CodeGeneratorArgument codeGeneratorArgument) {
       super(codeGeneratorArgument);
    }

    public String getDeleteRows() {
        return BigDataDIComponent.getParameter(node, "__ROW_KEY__", "");
    }
}
