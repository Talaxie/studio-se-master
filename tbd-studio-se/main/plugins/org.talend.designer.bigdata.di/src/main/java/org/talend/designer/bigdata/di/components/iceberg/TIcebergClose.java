package org.talend.designer.bigdata.di.components.iceberg;

import org.talend.designer.bigdata.di.components.DesignerDIComponent.BigDataDIComponent;
import org.talend.designer.codegen.config.CodeGeneratorArgument;


public class TIcebergClose implements BigDataDIComponent {

    protected final CodeGeneratorArgument codeGeneratorArgument;

    public TIcebergClose(CodeGeneratorArgument arg) {
        this.codeGeneratorArgument = arg;
    }

    @Override
    public CodeGeneratorArgument codeGeneratorArgument() {
        return this.codeGeneratorArgument;
    }

    public String getConnectionComponentName() {
        return getParameter("__CONNECTION__", "");
    }
}
