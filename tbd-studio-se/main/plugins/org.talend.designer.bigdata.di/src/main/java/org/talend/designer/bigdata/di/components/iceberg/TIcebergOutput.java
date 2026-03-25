package org.talend.designer.bigdata.di.components.iceberg;

import org.talend.designer.bigdata.di.components.DesignerDIComponent;
import org.talend.designer.codegen.config.CodeGeneratorArgument;

public class TIcebergOutput implements DesignerDIComponent.WithOneInput, DesignerDIComponent.WithSchema, DesignerDIComponent.WithConnection {

    protected final CodeGeneratorArgument codeGeneratorArgument;

    public TIcebergOutput(CodeGeneratorArgument arg) {
        this.codeGeneratorArgument = arg;
    }

    @Override
    public CodeGeneratorArgument codeGeneratorArgument() {
        return this.codeGeneratorArgument;
    }

    public String getTable() {
        return getParameter("__TABLE__", "");
    }

    public boolean useBatch() {
        return getBooleanParameter("__USE_BATCH__", false);
    }

    public int batchSize() {
        return Integer.parseInt(getParameter("__BATCH_SIZE__", "10"));
    }
}
