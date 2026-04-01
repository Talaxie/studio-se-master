package org.talend.designer.bigdata.di.components.thbase;

import org.talend.designer.bigdata.di.components.DesignerDIComponent;
import org.talend.designer.codegen.config.CodeGeneratorArgument;

import java.util.*;

public class THbaseOutput extends THbaseAbstract implements DesignerDIComponent.WithDieOnErrorOption {

    private final THbaseTable tHbaseTable;

    public THbaseOutput(CodeGeneratorArgument codeGeneratorArgument) {
        super(codeGeneratorArgument);
        tHbaseTable = new THbaseTable(codeGeneratorArgument);
    }

    @Override
    public boolean isSetTableNsMapping() {
        return BigDataDIComponent.getParameter(node, "__SET_TABLE_NS_MAPPING__",false);
    }

    @Override
    public String getTableNsMapping() {
        return BigDataDIComponent.getParameter(node, "__TABLE_NS_MAPPING__", "");
    }

    public String getTableAction() {
        return tHbaseTable.getTableAction();
    }

    public List<Map<String, String>> getFamilyParameters() {
        return tHbaseTable.getFamilyParameters();
    }

    public boolean isCustomRowKey() {
        return BigDataDIComponent.getParameter(node, "__CUSTOM_ROW_KEY__", false);
    }

    public boolean isUseCustomTimestampColumn() {
        return BigDataDIComponent.getParameter(node, "__CUSTOM_TIMESTAMP_COLUMN__", false);
    }

    public String getCustomTimestampColumn() {
        return BigDataDIComponent.getParameter(node, "__TIMESTAMP_COLUMN__", "");
    }

    public boolean isUseBatchMode() {
        return BigDataDIComponent.getParameter(node, "__USE_BATCH_MODE__", false);
    }

    public String getBatchSize() {
        return BigDataDIComponent.getParameter(node, "__BATCH_SIZE__", "");
    }
}
