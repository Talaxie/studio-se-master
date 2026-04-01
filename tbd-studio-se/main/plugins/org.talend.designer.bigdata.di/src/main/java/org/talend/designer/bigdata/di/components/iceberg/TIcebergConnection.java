package org.talend.designer.bigdata.di.components.iceberg;

import org.talend.designer.bigdata.di.components.DesignerDIComponent.BigDataDIComponent;
import org.talend.designer.codegen.config.CodeGeneratorArgument;

public class TIcebergConnection implements BigDataDIComponent {

    protected final CodeGeneratorArgument codeGeneratorArgument;

    public TIcebergConnection(CodeGeneratorArgument arg) {
        this.codeGeneratorArgument = arg;
    }

    @Override
    public CodeGeneratorArgument codeGeneratorArgument() {
        return this.codeGeneratorArgument;
    }

    public String getJDBCUrl() {
        return getParameter("__JDBC_URL__", "");
    }

    public String getUser() {
        return getParameter("__USER__", "");
    }

    public String getPassword() {
        return getEncryptedParameter("__PASSWORD__", "");
    }
}
