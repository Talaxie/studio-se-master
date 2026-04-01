package org.talend.designer.bigdata.di.components.iceberg;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.talend.core.model.metadata.IMetadataTable;
import org.talend.core.model.process.INode;
import org.talend.core.model.utils.NodeUtil;
import org.talend.designer.bigdata.di.components.DesignerDIComponent.WithSchema;
import org.talend.designer.bigdata.di.components.Schema;
import org.talend.designer.codegen.config.CodeGeneratorArgument;

public class TIcebergTable implements WithSchema {

    protected final CodeGeneratorArgument codeGeneratorArgument;

    private final static Map<String, String> tableActionToMethod = new HashMap<String, String>();

    static {
        tableActionToMethod.put("CREATE_TABLE", "create()");
        tableActionToMethod.put("CREATE_TABLE_IF_NOT_EXISTS", "create(true)");
        tableActionToMethod.put("DROP_TABLE", "drop()");
        tableActionToMethod.put("DROP_TABLE_IF_EXISTS", "drop(true)");
        tableActionToMethod.put("TRUNCATE", "truncate()");
    }

    public TIcebergTable(CodeGeneratorArgument arg) {
        this.codeGeneratorArgument = arg;
    }

    @Override
    public CodeGeneratorArgument codeGeneratorArgument() {
        return this.codeGeneratorArgument;
    }

    public String connectionComponentName() {
        return getParameter("__CONNECTION__", "");
    }

    public String table() {
        return getParameter("__TABLE__", "");
    }

    public String actionMethod() {
        return tableActionToMethod.get(getParameter("__TABLE_ACTION__", "CREATE_TABLE"));
    }

    public boolean externalTable() {
        return getBooleanParameter("__EXTERNAL__", false);
    }

    public String format() {
        return getParameter("__FORMAT__", "PARQUET");
    }

    public boolean setFormat() {
        return getBooleanParameter("__SET_FORMAT__", false);
    }

    public boolean createLike() {
        return getBooleanParameter("__CREATE_LIKE__", false);
    }

    public String createLikeSourceTable() {
        return getParameter("__SOURCE_TABLE__", "");
    }

    public boolean createAsSelect() {
        return getBooleanParameter("__CREATE_AS_SELECT__", false);
    }

    public String createAsSelectQuery() {
        return NodeUtil.replaceCRLFInMEMO_SQL(getParameter("__AS_SELECT_QUERY__", ""));
    }

    public List<Schema.Field> partitions() {
        INode node = (INode) codeGeneratorArgument().getArgument();
        Optional<IMetadataTable> partitions = node.getMetadataList().stream().filter(m -> "PARTITIONS".equals(m.getTableName())).findFirst();
        return !createAsSelect() && partitions.isPresent()
                ? partitions.get().getListColumns().stream().map(c -> new Schema.Field(c.getLabel(), Schema.StudioToJavaType(c.getTalendType()))).collect(Collectors.toList())
                : Collections.emptyList();
    }

    public Map<String, String> tableProperties() {
        Map<String, String> tableProperties = new HashMap<String, String>();
        getParameter("__TABLE_PROPERTIES__", Collections.<Map<String, String>> emptyList()).stream().forEach(p -> tableProperties.put(p.get("PROPERTY"), p.get("VALUE")));
        return tableProperties;
    }

    public boolean setLocation() {
        return getBooleanParameter("__SET_LOCATION__", false);
    }

    public String location() {
        return getParameter("__LOCATION__", "");
    }

    public boolean purge() {
        return getBooleanParameter("__PURGE__", false);
    }
}
