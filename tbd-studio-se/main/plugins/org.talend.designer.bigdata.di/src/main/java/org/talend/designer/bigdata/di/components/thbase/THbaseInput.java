package org.talend.designer.bigdata.di.components.thbase;

import org.talend.designer.bigdata.di.components.DesignerDIComponent;
import org.talend.designer.codegen.config.CodeGeneratorArgument;

public class THbaseInput extends  THbaseAbstract implements DesignerDIComponent.WithDieOnErrorOption {
    public THbaseInput(CodeGeneratorArgument codeGeneratorArgument) {
        super(codeGeneratorArgument);
    }
}
