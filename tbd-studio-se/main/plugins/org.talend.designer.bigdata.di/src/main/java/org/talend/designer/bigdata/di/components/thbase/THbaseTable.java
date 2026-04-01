package org.talend.designer.bigdata.di.components.thbase;

import org.talend.designer.codegen.config.CodeGeneratorArgument;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class THbaseTable extends THbaseAbstract {

    public THbaseTable(CodeGeneratorArgument codeGeneratorArgument) {
        super(codeGeneratorArgument);
    }

    public String getTableAction() {
        return BigDataDIComponent.getParameter(node, "__TABLE_ACTION__", "NONE");
    }

    public List<Map<String, String>> getFamilyParameters() {
        return BigDataDIComponent.tableParameter(node, "__FAMILY_PARAMETERS__", Collections.emptyList())
                .stream()
                .map(m -> m.entrySet().stream()
                        .collect(Collectors.toMap(Map.Entry::getKey, p -> THbaseUtils.addQuotesIfNotContainContext(p.getValue()))))
                .collect(Collectors.toList());
    }
    public String getRegionSplitKeys(){
        return BigDataDIComponent.getParameter(node, "__SPLIT_REGIONS_KEYS__", "");
    }
}
