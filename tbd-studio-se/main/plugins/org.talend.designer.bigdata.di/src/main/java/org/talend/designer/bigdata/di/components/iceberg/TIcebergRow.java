package org.talend.designer.bigdata.di.components.iceberg;

import org.talend.core.model.utils.NodeUtil;
import org.talend.designer.bigdata.di.components.DesignerDIComponent;
import org.talend.designer.codegen.config.CodeGeneratorArgument;

public class TIcebergRow implements DesignerDIComponent.WithConnection {

    protected final CodeGeneratorArgument codeGeneratorArgument;

    public TIcebergRow(CodeGeneratorArgument arg) {
        this.codeGeneratorArgument = arg;
    }

    @Override
    public CodeGeneratorArgument codeGeneratorArgument() {
        return this.codeGeneratorArgument;
    }

    public String getSqlQuery() {
        return NodeUtil.replaceCRLFInMEMO_SQL(getParameter("__SQL_QUERY__", ""));
    }
}
