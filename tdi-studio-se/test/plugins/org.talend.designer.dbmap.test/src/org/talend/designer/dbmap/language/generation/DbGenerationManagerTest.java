package org.talend.designer.dbmap.language.generation;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.talend.commons.utils.VersionUtils;
import org.talend.core.CorePlugin;
import org.talend.core.context.Context;
import org.talend.core.context.RepositoryContext;
import org.talend.core.model.components.ComponentCategory;
import org.talend.core.model.components.IComponent;
import org.talend.core.model.context.JobContext;
import org.talend.core.model.context.JobContextManager;
import org.talend.core.model.context.JobContextParameter;
import org.talend.core.model.metadata.IMetadataColumn;
import org.talend.core.model.metadata.IMetadataTable;
import org.talend.core.model.metadata.MetadataColumn;
import org.talend.core.model.metadata.MetadataTable;
import org.talend.core.model.metadata.types.JavaTypesManager;
import org.talend.core.model.process.EConnectionType;
import org.talend.core.model.process.EParameterFieldType;
import org.talend.core.model.process.IConnection;
import org.talend.core.model.process.IContextParameter;
import org.talend.core.model.process.IElementParameter;
import org.talend.core.model.process.INodeConnector;
import org.talend.core.model.properties.PropertiesFactory;
import org.talend.core.model.properties.Property;
import org.talend.core.model.utils.TalendTextUtils;
import org.talend.core.ui.component.ComponentsFactoryProvider;
import org.talend.designer.core.model.components.EParameterName;
import org.talend.designer.core.model.components.ElementParameter;
import org.talend.designer.core.model.components.NodeConnector;
import org.talend.designer.core.model.process.DataConnection;
import org.talend.designer.core.model.process.DataNode;
import org.talend.designer.core.ui.editor.connections.Connection;
import org.talend.designer.core.ui.editor.nodes.Node;
import org.talend.designer.core.ui.editor.process.Process;
import org.talend.designer.dbmap.DbMapComponent;
import org.talend.designer.dbmap.external.data.ExternalDbMapData;
import org.talend.designer.dbmap.external.data.ExternalDbMapEntry;
import org.talend.designer.dbmap.external.data.ExternalDbMapTable;

public class DbGenerationManagerTest extends DbGenerationManagerTestHelper {

    private DbGenerationManager dbManager;

    private ExternalDbMapEntry extMapEntry;

    private List<ExternalDbMapEntry> tableEntries;

    private DbMapComponent dbMapComponent4SubQuery;

    private static IComponent sourceComponent;

    private static IComponent targetComponent;

    @Before
    public void setUp() throws Exception {
        dbMapComponent = new DbMapComponent();

        ExternalDbMapData externalDbMapData = new ExternalDbMapData();
        dbMapComponent.setExternalData(externalDbMapData);

        List<ExternalDbMapTable> inputTables = new ArrayList<>();
        externalDbMapData.setInputTables(inputTables);

        ExternalDbMapTable externalDbMapTable = new ExternalDbMapTable();
        inputTables.add(externalDbMapTable);
        externalDbMapTable.setName("t1");
        externalDbMapTable.setAlias("t1");
        externalDbMapTable.setTableName("t1");
        externalDbMapTable.setJoinType("NO_JOIN");

        tableEntries = new ArrayList<>();
        externalDbMapTable.setMetadataTableEntries(tableEntries);
        extMapEntry = new ExternalDbMapEntry("id", "t1.id");
        tableEntries.add(extMapEntry);

        List<IConnection> incomingConnections = new ArrayList<IConnection>();
        String[] columns = new String[] { "\\\"id\\\"",  "\\\"name\\\""};
        String[] labels = new String[] { "id",  "name"};
        incomingConnections.add(createConnection("dbo", "t1", labels, columns));
        dbMapComponent.setIncomingConnections(incomingConnections);

        if (dbMapComponent.getElementParameters() == null) {
            dbMapComponent.setElementParameters(Collections.EMPTY_LIST);
        }
        dbManager = new GenericDbGenerationManager();

        //
        dbMapComponent4SubQuery = new DbMapComponent();
        ExternalDbMapData externalDbMapData4SubQuery = new ExternalDbMapData();
        dbMapComponent4SubQuery.setExternalData(externalDbMapData4SubQuery);

        List<ExternalDbMapTable> inputTables4SubQuery = new ArrayList<>();
        externalDbMapData.setInputTables(inputTables4SubQuery);

        ExternalDbMapTable externalDbMapTable4SubQuery = new ExternalDbMapTable();
        inputTables.add(externalDbMapTable4SubQuery);
        externalDbMapTable4SubQuery.setName("t5");
        externalDbMapTable4SubQuery.setAlias("t5");
        externalDbMapTable4SubQuery.setTableName("t5");
        externalDbMapTable4SubQuery.setJoinType("NO_JOIN");

        List<ExternalDbMapEntry> tableEntries4SubQuery = new ArrayList<>();
        externalDbMapTable4SubQuery.setMetadataTableEntries(tableEntries4SubQuery);
        ExternalDbMapEntry extMapEntry4SubQuery = new ExternalDbMapEntry("id", "t5.id");
        tableEntries4SubQuery.add(extMapEntry4SubQuery);

        List<IConnection> incomingConnections4SubQuery = new ArrayList<IConnection>();
        String[] columns4SubQuery = new String[] { "\\\"id\\\"" };
        String[] labelSubQuery = new String[] { "id" };
        incomingConnections4SubQuery.add(createConnection("t5", "t5", labelSubQuery, columns4SubQuery));
        dbMapComponent4SubQuery.setIncomingConnections(incomingConnections4SubQuery);

        if (dbMapComponent4SubQuery.getElementParameters() == null) {
            dbMapComponent4SubQuery.setElementParameters(Collections.EMPTY_LIST);
        }

        sourceComponent = ComponentsFactoryProvider.getInstance().get("tELTOracleMap", ComponentCategory.CATEGORY_4_DI.getName());
        targetComponent = ComponentsFactoryProvider.getInstance().get("tELTOracleMap", ComponentCategory.CATEGORY_4_DI.getName());
    }

    @After
    public void tearDown() throws Exception {
        dbMapComponent = null;
        dbManager = null;
        extMapEntry = null;
        tableEntries = null;

        dbMapComponent4SubQuery = null;
        sourceComponent = null;
        targetComponent = null;
        dbMapComponentDelimited = null;
    }

    @Test
    public void testInitExpression() {
        process = mock(Process.class);
        JobContextManager contextManger = new JobContextManager();
        when(process.getContextManager()).thenReturn(contextManger);
        dbMapComponent.setProcess(process);
        checkValue("dbo.t1.\\\"id\\\"", extMapEntry);
        ExternalDbMapEntry extMapEntry2 = new ExternalDbMapEntry("multiple", "t1.id + t1.name");
        tableEntries.add(extMapEntry2);
        checkValue("dbo.t1.\\\"id\\\" + dbo.t1.\\\"name\\\"", extMapEntry2);
        
        testWithQuote();
    }
    
    @Test
    public void testInitExpressionDelimitedIdentifiers() {
        //when setAddQuotesInColumns true
        dbManager.setAddQuotesInColumns(true);
        checkSnowFlakeValue("t1.\\\"id\\\"",extMapEntry);
        checkMysqlValue("t1.`id`",extMapEntry);
        //when setAddQuotesInColumns false
        dbManager.setAddQuotesInColumns(false);
        checkSnowFlakeValue("t1.id",extMapEntry);
        checkMysqlValue("t1.id",extMapEntry);
    }
    private void checkSnowFlakeValue(String expression, ExternalDbMapEntry entry) {
        dbMapComponentDelimited = new DbMapComponent();
        ElementParameter param = new ElementParameter(dbMapComponent);
        param.setFieldType(EParameterFieldType.MAPPING_TYPE);
        param.setName(EParameterName.MAPPING.getName());
        param.setValue("snowflake_id");
        ((List<IElementParameter>) dbMapComponentDelimited.getElementParameters()).add(param);
        
        List<IConnection> incomingConnections = new ArrayList<IConnection>();
        String[] columns = new String[] { "id",  "name"};
        String[] labels = new String[] { "id",  "name"};
        incomingConnections.add(createConnection("", "t1", labels, columns));
        dbMapComponentDelimited.setIncomingConnections(incomingConnections);

        if (dbMapComponentDelimited.getElementParameters() == null) {
            dbMapComponentDelimited.setElementParameters(Collections.EMPTY_LIST);
        }
        Assert.assertEquals(expression, dbManager.initExpression(dbMapComponentDelimited, entry));
    }
    
    private void checkMysqlValue(String expression, ExternalDbMapEntry entry) {
        dbMapComponentDelimited = new DbMapComponent();
        ElementParameter param = new ElementParameter(dbMapComponent);
        param.setFieldType(EParameterFieldType.MAPPING_TYPE);
        param.setName(EParameterName.MAPPING.getName());
        param.setValue("mysql_id");
        ((List<IElementParameter>) dbMapComponentDelimited.getElementParameters()).add(param);
        
        List<IConnection> incomingConnections = new ArrayList<IConnection>();
        String[] columns = new String[] { "id",  "name"};
        String[] labels = new String[] { "id",  "name"};
        incomingConnections.add(createConnection("", "t1", labels, columns));
        dbMapComponentDelimited.setIncomingConnections(incomingConnections);

        if (dbMapComponentDelimited.getElementParameters() == null) {
            dbMapComponentDelimited.setElementParameters(Collections.EMPTY_LIST);
        }
        Assert.assertEquals(expression, dbManager.initExpression(dbMapComponentDelimited, entry));
    }
    
    @Test
    public void testReplaceAuotes() {
        String quote = "\"";
        String quoParser = "[\\\\]?\\" + quote; //$NON-NLS-1$
        DbGenerationManager dbManager = new GenericDbGenerationManager();
        dbMapComponent = new DbMapComponent();
        String expression = "'\"" + "+" + "(String)globalMap.get(\"BusinessDateStr\")" + "+" + "\"' BETWEEN PROD_GRP_DA.EFF_FRM_DT AND PROD_GRP_DA.EFF_TO_DT";
        
        assertEquals(expression.trim(), dbManager.replaceAuotes(dbMapComponent, expression, quoParser, quote).trim());
        
        expression = "BETWEEN PROD_GRP_DA.EFF_FRM_DT AND PROD_GRP_DA.EFF_TO_DT";
        String expect = "BETWEEN PROD_GRP_DA.EFF_FRM_DT AND PROD_GRP_DA.EFF_TO_DT";
        assertEquals(expect.trim(), dbManager.replaceAuotes(dbMapComponent, expression, quoParser, quote).trim());
        
        expression = "'" +"+"+"context.param1"+"+"+ "aaa";
        expect = "'" +"+"+"context.param1"+"+"+ "aaa";
        
        assertEquals(expect.trim(), dbManager.replaceAuotes(dbMapComponent, expression, quoParser, quote).trim());
        
        expression = "'\"" +"+"+"context.param1"+"+"+ "\"'aaa";
        expect = "'\"" +"+"+"context.param1"+"+"+ "\"'aaa";
        
        assertEquals(expect.trim(), dbManager.replaceAuotes(dbMapComponent, expression, quoParser, quote).trim());
        
        expression = "'context.param1'";
        assertEquals(expression, dbManager.replaceAuotes(dbMapComponent, expression, quoParser, quote).trim());
        
        expression = "table1.name = 'context.param2'";
        assertEquals(expression, dbManager.replaceAuotes(dbMapComponent, expression, quoParser, quote).trim());
        
        expression = "table1.name = 'context.param2' aa";
        assertEquals(expression, dbManager.replaceAuotes(dbMapComponent, expression, quoParser, quote).trim());
        
        expression = "\"+globalMap.get(\"value1\")+\"";
        assertEquals(expression, dbManager.replaceAuotes(dbMapComponent, expression, quoParser, quote).trim());

        expression = "COALESCE(test.name ,\"+globalMap.get(\"value2\")+\")";
        assertEquals(expression, dbManager.replaceAuotes(dbMapComponent, expression, quoParser, quote).trim());

        expression = "\" + (Integer)globalMap.get(\"G_ZERO_PNCHEVNT_SKEY\") + \"";
        assertEquals(expression, dbManager.replaceAuotes(dbMapComponent, expression, quoParser, quote).trim());

        expression = "COALESCE(emp_edited.emp_skey , \" + (Integer)globalMap.get(\"G_ZERO_EMP_SKEY\") + \")";
        assertEquals(expression, dbManager.replaceAuotes(dbMapComponent, expression, quoParser, quote).trim());

        expression = "COALESCE(from_punch.EMP_SKEY     , \" + (Integer)globalMap.get(\"G_ZERO_EMP_SKEY\") + \")";
        assertEquals(expression, dbManager.replaceAuotes(dbMapComponent, expression, quoParser, quote).trim());

        expression = "CASE WHEN \" + (String)globalMap.get(\"DSRC_TYP_DES\") + \" in ('Timecard Editor') AND from_punch.PNCHEVNT_DTM> from_punch.ENTERED_DTM THEN 1 ELSE 0 END";
        assertEquals(expression, dbManager.replaceAuotes(dbMapComponent, expression, quoParser, quote).trim());

        expression = "CASE WHEN \" + (String)globalMap.get(\"DSRC_TYP_DES\") + \" in ('Timecard Editor') THEN 1 ELSE 0 END";
        assertEquals(expression, dbManager.replaceAuotes(dbMapComponent, expression, quoParser, quote).trim());
    }
    
    @Test
    public void testReplaceMultipleAuotes() {
        String quote = "\"";
        String quoParser = "[\\\\]?\\" + quote; //$NON-NLS-1$
        DbGenerationManager dbManager = new GenericDbGenerationManager();
        dbMapComponent = new DbMapComponent();
        String expression = "case when upper(a.rate_type)='FLOAT' then 'D001' else 'AMAT' end";
        assertEquals(expression, dbManager.replaceAuotes(dbMapComponent, expression, quoParser, quote).trim());

        expression = "case when upper(a.rate_type)='FLOAT'";
        assertEquals(expression, dbManager.replaceAuotes(dbMapComponent, expression, quoParser, quote).trim());

        expression = "'context.jobName'";
        assertEquals(expression, dbManager.replaceAuotes(dbMapComponent, expression, quoParser, quote).trim());
    }

    private void testWithQuote(){
    	dbManager.setAddQuotesInColumns(true);
    	List<IConnection> incomingConnections = new ArrayList<IConnection>();
        String[] columns = new String[] { "id",  "name"};
        String[] labels = new String[] { "id",  "name"};
        incomingConnections.add(createConnection("", "t1", labels, columns));
        dbMapComponent.setIncomingConnections(incomingConnections);
        
        ElementParameter param = new ElementParameter(dbMapComponent);
    	param.setName(EParameterName.MAPPING.getName());
    	param.setValue("mysql_id");
    	List<ElementParameter> list = new ArrayList<>();
    	list.add(param);
    	dbMapComponent.setElementParameters(list);
    	checkValue("t1.`id`", extMapEntry);
    	
    	ExternalDbMapEntry extMapEntry3 = new ExternalDbMapEntry("multiple", "if(t1.id<2500,\"<2500\",\">=2500\")");
        tableEntries.add(extMapEntry3);
        checkValue("if(t1.`id`<2500,\\\"<2500\\\",\\\">=2500\\\")", extMapEntry3);
    	
    	ExternalDbMapEntry extMapEntry2 = new ExternalDbMapEntry("multiple", "t1.id + t1.name");
        tableEntries.add(extMapEntry2);
        checkValue("t1.`id` + t1.`name`", extMapEntry2);
    	
    	param.setValue("oracle_id");
    	checkValue("t1.\\\"id\\\"", extMapEntry);
    	checkValue("t1.\\\"id\\\" + t1.\\\"name\\\"", extMapEntry2);
    	
    	param.setValue("mssql_id");
    	checkValue("t1.\\\"id\\\"", extMapEntry);
    	checkValue("t1.\\\"id\\\" + t1.\\\"name\\\"", extMapEntry2);
    }

    public void checkValue(String expression, ExternalDbMapEntry entry) {
        Assert.assertEquals(expression, dbManager.initExpression(dbMapComponent, entry));
    }

    private IConnection createConnection(String schemaName, String tableName, String[] labels, String[] columns) {
        Connection connection = mock(Connection.class);
        Node node = mock(Node.class);
        ElementParameter param = new ElementParameter(node);
        param.setName("ELT_SCHEMA_NAME");
        param.setValue(schemaName);
        when(node.getElementParameter("ELT_SCHEMA_NAME")).thenReturn(param);
        param = new ElementParameter(node);
        param.setName("ELT_TABLE_NAME");
        param.setValue(tableName);
        when(node.getElementParameter("ELT_TABLE_NAME")).thenReturn(param);
        when(connection.getName()).thenReturn("".equals(schemaName) ? tableName : schemaName + "." + tableName);
        when(connection.getSource()).thenReturn(node);

        when(connection.getName()).thenReturn(tableName);
        IMetadataTable metadataTable = new MetadataTable();
        metadataTable.setLabel(tableName);
        metadataTable.setTableName(tableName);
        List<IMetadataColumn> listColumns = new ArrayList<IMetadataColumn>();
        for(int i =0; i < columns.length; i++){
        	IMetadataColumn column = new MetadataColumn();
            column.setLabel(labels[i]);
            column.setOriginalDbColumnName(columns[i]);
            listColumns.add(column);
        }
        metadataTable.setListColumns(listColumns);
        when(connection.getMetadataTable()).thenReturn(metadataTable);

        return connection;
    }

    @Test
    public void testGetHandledTableName() {
        dbManager = new GenericDbGenerationManager();
        String schema = "";
        String main_table = "\"mainTable\"";
        String main_alias = null;
        init(schema, main_table, main_alias, "", "");
        String tableName = "";
        if (!"".equals(schema)) {
            tableName = TalendTextUtils.removeQuotes(schema) + ".";
        }
        tableName = TalendTextUtils.removeQuotes(main_table);
        String expectedValue = "mainTable";
        String handledTableName = dbManager.getHandledTableName(dbMapComponent, tableName, main_alias);
        Assert.assertEquals(expectedValue, handledTableName);

        main_table = "((String)globalMap.get(\"#main_table%\"))";
        main_alias = null;
        init(schema, main_table, main_alias, "", "");
        tableName = "";
        if (!"".equals(schema)) {
            tableName = TalendTextUtils.removeQuotes(schema) + ".";
        }
        tableName = TalendTextUtils.removeQuotes(main_table);
        expectedValue = "\" +((String)globalMap.get(\"#main_table%\"))+ \"";
        handledTableName = dbManager.getHandledTableName(dbMapComponent, tableName, main_alias);
        Assert.assertEquals(expectedValue, handledTableName);

        main_table = "((String)globalMap.get(\"#main_table%\"))";
        main_alias = "main_table";
        init(schema, main_table, main_alias, "", "");
        tableName = "";
        if (!"".equals(schema)) {
            tableName = TalendTextUtils.removeQuotes(schema) + ".";
        }
        tableName = TalendTextUtils.removeQuotes(main_table);
        expectedValue = "\" +((String)globalMap.get(\"#main_table%\"))+ \"";
        handledTableName = dbManager.getHandledTableName(dbMapComponent, tableName, main_alias);
        Assert.assertEquals(expectedValue, handledTableName);

        main_table = "context.main_table";
        main_alias = "main_table";
        init(schema, main_table, main_alias, "", "");
        tableName = "";
        if (!"".equals(schema)) {
            tableName = TalendTextUtils.removeQuotes(schema) + ".";
        }
        tableName = TalendTextUtils.removeQuotes(main_table);
        expectedValue = "\" +context.main_table+ \"";
        handledTableName = dbManager.getHandledTableName(dbMapComponent, tableName, main_alias);
        Assert.assertEquals(expectedValue, handledTableName);

        main_table = "\"abc\"+context.main_table";
        main_alias = "main_table";
        init(schema, main_table, main_alias, "", "");
        tableName = "";
        if (!"".equals(schema)) {
            tableName = TalendTextUtils.removeQuotes(schema) + ".";
        }
        tableName = TalendTextUtils.removeQuotes(main_table);
        expectedValue = "\" +\"abc\"+context.main_table+ \"";
        handledTableName = dbManager.getHandledTableName(dbMapComponent, tableName, main_alias);
        Assert.assertEquals(expectedValue, handledTableName);

    }

    @Test
    public void testBuildSqlSelectForMiddleTable() {
        String schema = "school";
        String main_table = "classInfo";
        String lookup_table = "scoreInfo";
        init(schema, main_table, lookup_table);
        dbManager = new GenericDbGenerationManager();
        String expectedQuery = "\"SELECT\n"
                + "school.classInfo.id, school.classInfo.name, school.classInfo.classNum, school.scoreInfo.score\n"
                + "FROM\n school.classInfo , school.scoreInfo\n" + "WHERE school.classInfo\"";
        String query = dbManager.buildSqlSelect(dbMapComponent, "grade");
        assertEquals(expectedQuery, query);
    }

    private void init(String schema, String main_table, String lookup_table) {
        Process process = new Process(createProperty());
        process.setContextManager(new JobContextManager());
        dbMapComponent.setProcess(process);

        List<IConnection> incomingConnections = new ArrayList<IConnection>();
        String[] mainTableEntities = new String[] { "id", "name", "classNum" };
        String[] lookupEndtities = new String[] { "id", "score" };

        incomingConnections.add(createConnection(process, schema, lookup_table, lookupEndtities, lookupEndtities));
        incomingConnections.add(mockConnection(schema, lookup_table, lookupEndtities, lookupEndtities));
        dbMapComponent.setIncomingConnections(incomingConnections);

        ExternalDbMapData externalData = new ExternalDbMapData();
        List<ExternalDbMapTable> inputs = new ArrayList<ExternalDbMapTable>();
        List<ExternalDbMapTable> outputs = new ArrayList<ExternalDbMapTable>();
        // main table
        ExternalDbMapTable inputTable = new ExternalDbMapTable();
        inputTable.setName(schema + "." + main_table);
        inputTable.setTableName(schema + "." + main_table);
        String[] mainExpressions = new String[] { schema + "." + lookup_table + ".id", schema + "." + lookup_table + ".name",
                schema + "." + lookup_table + ".classNum" };
        List<ExternalDbMapEntry> entities = getMetadataEntities(mainTableEntities, mainExpressions);
        inputTable.setMetadataTableEntries(entities);
        inputs.add(inputTable);
        // lookup table
        inputTable = new ExternalDbMapTable();
        inputTable.setName(schema + "." + lookup_table);
        inputTable.setTableName(schema + "." + lookup_table);
        String[] lookupExpressions = new String[] { schema + "." + main_table + ".id", schema + "." + main_table + ".name" };
        entities = getMetadataEntities(lookupEndtities, lookupExpressions);
        inputTable.setMetadataTableEntries(entities);
        inputs.add(inputTable);

        // output
        ExternalDbMapTable outputTable = new ExternalDbMapTable();
        outputTable.setName("grade");
        List<ExternalDbMapEntry> conditions = new ArrayList<ExternalDbMapEntry>();
        conditions.add(new ExternalDbMapEntry(schema + "." + main_table));
        outputTable.setCustomWhereConditionsEntries(conditions);
        String[] names = new String[] { "id", "name", "classNum", "score" };
        String[] expressions = new String[] { schema + "." + main_table + ".id", schema + "." + main_table + ".name",
                schema + "." + main_table + ".classNum", schema + "." + lookup_table + ".score" };
        outputTable.setMetadataTableEntries(getMetadataEntities(names, expressions));
        outputs.add(outputTable);

        externalData.setInputTables(inputs);
        externalData.setOutputTables(outputs);
        dbMapComponent.setExternalData(externalData);
        List<IMetadataTable> metadataList = new ArrayList<IMetadataTable>();
        MetadataTable metadataTable = getMetadataTable(names, names);
        metadataTable.setLabel("grade");
        metadataList.add(metadataTable);
        dbMapComponent.setMetadataList(metadataList);
    }

    private IConnection mockConnection(String schemaName, String tableName, String[] columns, String[] dbColumns) {
        Connection connection = mock(Connection.class);
        Node node = mock(Node.class);
        ElementParameter param = new ElementParameter(node);
        param.setName("ELT_SCHEMA_NAME");
        param.setValue(schemaName);
        when(node.getElementParameter("ELT_SCHEMA_NAME")).thenReturn(param);
        param = new ElementParameter(node);
        param.setName("ELT_TABLE_NAME");
        param.setValue(tableName);
        when(node.getElementParameter("ELT_TABLE_NAME")).thenReturn(param);
        when(connection.getName()).thenReturn("".equals(schemaName) ? tableName : schemaName + "." + tableName);
        when(connection.getSource()).thenReturn(node);
        IMetadataTable table = new MetadataTable();
        table.setLabel(tableName);
        table.setTableName(tableName);
        List<IMetadataColumn> listColumns = new ArrayList<IMetadataColumn>();
        for (int i = 0; i < columns.length; i++) {
            String columnName = columns[i];
            IMetadataColumn column = new MetadataColumn();
            column.setLabel(columnName);
            column.setOriginalDbColumnName(dbColumns[i]);
            listColumns.add(column);
        }
        table.setListColumns(listColumns);
        when(connection.getMetadataTable()).thenReturn(table);
        return connection;
    }

    private IConnection mockConnection(String schemaName, String tableName, String targetTableName, String[] columns,
            String[] dbColumns) {
        Connection connection = mock(Connection.class);
        Node node = mock(Node.class);
        when(node.isELTComponent()).thenReturn(true);
        IComponent component =
                ComponentsFactoryProvider.getInstance().get("tELTOutput", ComponentCategory.CATEGORY_4_DI.getName());
        when(node.getComponent()).thenReturn(component);
        ElementParameter param = new ElementParameter(node);
        param.setName("ELT_SCHEMA_NAME");
        param.setValue(schemaName);
        when(node.getElementParameter("ELT_SCHEMA_NAME")).thenReturn(param);
        param = new ElementParameter(node);
        param.setName("ELT_TABLE_NAME");
        param.setValue(tableName);
        when(node.getElementParameter("ELT_TABLE_NAME")).thenReturn(param);
        when(connection.getName()).thenReturn("".equals(schemaName) ? tableName : schemaName + "." + tableName);
        when(connection.getSource()).thenReturn(node);
        IMetadataTable table = new MetadataTable();
        table.setLabel(tableName);
        table.setTableName(targetTableName);
        List<IMetadataColumn> listColumns = new ArrayList<IMetadataColumn>();
        for (int i = 0; i < columns.length; i++) {
            String columnName = columns[i];
            IMetadataColumn column = new MetadataColumn();
            column.setLabel(columnName);
            column.setOriginalDbColumnName(dbColumns[i]);
            listColumns.add(column);
        }
        table.setListColumns(listColumns);
        when(connection.getMetadataTable()).thenReturn(table);
        return connection;
    }

    private IConnection createConnection(Process process, String schemaName, String tableName, String[] columns,
            String[] dbColumns) {
        Node sourceNode = new Node(sourceComponent, process);
        INodeConnector connector = new NodeConnector(sourceNode);
        connector.setName("connector");
        connector.setDefaultConnectionType(EConnectionType.FLOW_MAIN);
        ArrayList<INodeConnector> connectors = new ArrayList<INodeConnector>();
        connectors.add(connector);
        sourceNode.setExternalNode(dbMapComponent4SubQuery);
        sourceNode.setListConnector(connectors);

        Node targetNode = new Node(targetComponent, process);
        targetNode.setExternalNode(dbMapComponent);
        IConnection connection = new Connection(sourceNode, targetNode, EConnectionType.FLOW_MAIN, "connector", "meta",
                "school.classInfo", true);
        List<IMetadataTable> metadataList = new ArrayList<IMetadataTable>();
        IMetadataTable table = new MetadataTable();
        table.setLabel(tableName);
        table.setTableName(tableName);
        table.setAttachedConnector("connector");
        List<IMetadataColumn> listColumns = new ArrayList<IMetadataColumn>();
        for (int i = 0; i < columns.length; i++) {
            String columnName = columns[i];
            IMetadataColumn column = new MetadataColumn();
            column.setLabel(columnName);
            column.setOriginalDbColumnName(dbColumns[i]);
            listColumns.add(column);
        }
        table.setListColumns(listColumns);
        metadataList.add(table);
        sourceNode.setMetadataList(metadataList);
        return connection;
    }

    private static Property createProperty() {
        Property property = PropertiesFactory.eINSTANCE.createProperty();
        property.setAuthor(((RepositoryContext) CorePlugin.getContext().getProperty(Context.REPOSITORY_CONTEXT_KEY)).getUser());
        property.setVersion(VersionUtils.DEFAULT_VERSION);
        return property;
    }
    
    @Test
    public void testAppendSqlQuery(){
    	StringBuilder sb = new StringBuilder();
    	dbManager.getQuerySegments().clear();
    	dbManager.appendSqlQuery(sb, "table1", true);
    	Assert.assertTrue(dbManager.getQuerySegments().size()==1);
    	
    	dbManager.getQuerySegments().clear();
    	dbManager.appendSqlQuery(sb, "table1", false);
    	Assert.assertTrue(dbManager.getQuerySegments().isEmpty());
    }
    
    @Test
    public void testBuildSqlSelect() {
        runBuildSql("","table1","table2","table3");
        
    }
    
    private void runBuildSql(String schema, String table1, String table2, String table3) {
        List<IConnection> incomingConnections = new ArrayList<IConnection>();
        String[] mainTableEntities = new String[] { "id", "name" };
        incomingConnections.add(mockConnection(schema, table1, mainTableEntities));
        dbMapComponent.setIncomingConnections(incomingConnections);

        ExternalDbMapData externalData = new ExternalDbMapData();
        List<ExternalDbMapTable> inputs = new ArrayList<ExternalDbMapTable>();
        List<ExternalDbMapTable> outputs = new ArrayList<ExternalDbMapTable>();
        // main table
        ExternalDbMapTable inputTable = new ExternalDbMapTable();
        String mainTableName = "".equals(schema) ? table1 : schema + "." + table1;
        // quote will be removed in the ui for connections ,so we do the same for test
        String mainTableNameNoQuote = TalendTextUtils.removeQuotes(mainTableName);
        inputTable.setTableName(mainTableNameNoQuote);
        inputTable.setName(mainTableName);
        List<ExternalDbMapEntry> entities = getMetadataEntities(mainTableEntities, new String[3]);
        inputTable.setMetadataTableEntries(entities);
        inputs.add(inputTable);

        // output
        ExternalDbMapTable outputTable = new ExternalDbMapTable();
        mainTableName = "".equals(schema) ? table2 : schema + "." + table2;
        // quote will be removed in the ui for connections ,so we do the same for test
        mainTableNameNoQuote = TalendTextUtils.removeQuotes(mainTableName);
        outputTable.setTableName(mainTableNameNoQuote);
        outputTable.setName("table2");
        String[] names = new String[] { "id", "name" };
        String mainTable = mainTableName;
        String[] expressions = new String[] { "table1.id", "table1.name"};
        outputTable.setMetadataTableEntries(getMetadataEntities(names, expressions));
        
        String[] whereNames = new String[]{"whereFilter"};
        String[] whereExps = new String[]{"table1.name = " + "'context.param2'"};
        outputTable.setCustomWhereConditionsEntries(getMetadataEntities(whereNames, whereExps));
        
        String[] otherNames = new String[]{"otherFilter"};
        String[] otherExps = new String[]{"table1.id = " + "'context.param1'"};
        outputTable.setCustomOtherConditionsEntries(getMetadataEntities(otherNames, otherExps));
        outputs.add(outputTable);

        externalData.setInputTables(inputs);
        externalData.setOutputTables(outputs);
        dbMapComponent.setExternalData(externalData);
        List<IMetadataTable> metadataList = new ArrayList<IMetadataTable>();
        MetadataTable metadataTable = getMetadataTable(names);
        metadataTable.setLabel("table2");
        metadataList.add(metadataTable);
        dbMapComponent.setMetadataList(metadataList);
        JobContext newContext = new JobContext("Default");
        List<IContextParameter> newParamList = new ArrayList<IContextParameter>();
        newContext.setContextParameterList(newParamList);
        JobContextParameter param = new JobContextParameter();
        param.setName("schema");
        newParamList.add(param);
        process = mock(Process.class);
        JobContextManager contextManger = new JobContextManager();
        contextManger.setDefaultContext(newContext);
        when(process.getContextManager()).thenReturn(contextManger);
        dbMapComponent.setProcess(process);
        ////////////////////////////////////////////////////////////////////////////////
        ExternalDbMapData externalData2 = new ExternalDbMapData();
        DbMapComponent dbMapComponent2 = new DbMapComponent();
        dbMapComponent2.setExternalData(externalData2);
        mainTableEntities = new String[] {"id", "name"};
        
        List<IConnection> outgoingConnections = new ArrayList<IConnection>();
        Node map1 = mockNode(dbMapComponent);
        outgoingConnections.add(mockConnection(map1, schema, table2, mainTableEntities));
        dbMapComponent.setOutgoingConnections(outgoingConnections);
        dbMapComponent2.setIncomingConnections(outgoingConnections);

        inputs = new ArrayList<ExternalDbMapTable>();
        outputs = new ArrayList<ExternalDbMapTable>();
        // main table
        inputTable = new ExternalDbMapTable();
        mainTableName = "".equals(schema) ? table2 : schema + "." + table2;
        // quote will be removed in the ui for connections ,so we do the same for test
        mainTableNameNoQuote = TalendTextUtils.removeQuotes(mainTableName);
        inputTable.setTableName(mainTableNameNoQuote);
        inputTable.setName("table2");
        entities = getMetadataEntities(mainTableEntities, new String[3]);
        inputTable.setMetadataTableEntries(entities);
        inputs.add(inputTable);

        // output
        outputTable = new ExternalDbMapTable();
        mainTableName = "".equals(schema) ? table3 : schema + "." + table3;
        // quote will be removed in the ui for connections ,so we do the same for test
        mainTableNameNoQuote = TalendTextUtils.removeQuotes(mainTableName);
        outputTable.setTableName(mainTableNameNoQuote);
        outputTable.setName("table3");
        names = new String[] { "id", "name"};
        mainTable = mainTableName;
        expressions = new String[] { "table2.id", "table2.name"};
        outputTable.setMetadataTableEntries(getMetadataEntities(names, expressions));
        outputs.add(outputTable);

        externalData2.setInputTables(inputs);
        externalData2.setOutputTables(outputs);
        dbMapComponent2.setExternalData(externalData2);
        metadataList = new ArrayList<IMetadataTable>();
        metadataTable = getMetadataTable(names);
        metadataTable.setLabel("table3");
        metadataList.add(metadataTable);
        dbMapComponent2.setMetadataList(metadataList);
        if (dbMapComponent2.getElementParameters() == null) {
            dbMapComponent2.setElementParameters(Collections.EMPTY_LIST);
        }
        JobContextParameter param1 = new JobContextParameter();
        param1.setName("param1");
        newParamList.add(param1);
        
        JobContextParameter param2 = new JobContextParameter();
        param2.setName("param2");
        newParamList.add(param2);
        dbMapComponent2.setProcess(process);
        outgoingConnections = new ArrayList<IConnection>();
        outgoingConnections.add(mockConnection(schema, table3, mainTableEntities));
        dbMapComponent2.setOutgoingConnections(outgoingConnections);
        
        ElementParameter comName = new ElementParameter(dbMapComponent);
        comName.setName("COMPONENT_NAME");
        comName.setValue("tELTMap");
        List<ElementParameter> list = new ArrayList<>();
        list.add(comName);
        dbMapComponent.setElementParameters(list);
        
        dbManager = new GenericDbGenerationManager();
        String query = dbManager.buildSqlSelect(dbMapComponent2, "table3").replaceAll("\n", "");
        String exceptQuery = "\"SELECT\n"
                + "table2.id, table2.name\n"
                + "FROM\n"
                + " (\n"
                +"  SELECT\n"
                +"  table1.id AS id, table1.name AS name\n"
                +"  FROM\n"
                +"   table1\n"
                +"  WHERE table1.name = '\" +context.param2+ \"'\n"
                +"  table1.id = '\" +context.param1+ \"'\n"
                +"  \n"
                +" ) table2\"";
        assertEquals(exceptQuery.replaceAll("\n", "").trim(), query.trim());
    }

    @Test
    public void testBuildSqlSelect_endWithContext() {

        String schema = "";
        String table1 = "table1";
        String table2 = "table2";
        String table3 = "table3";
        List<IConnection> incomingConnections = new ArrayList<IConnection>();
        String[] mainTableEntities = new String[] { "id", "column1", "column2" };
        incomingConnections.add(mockConnection(schema, table1, mainTableEntities));
        dbMapComponent.setIncomingConnections(incomingConnections);

        ExternalDbMapData externalData = new ExternalDbMapData();
        List<ExternalDbMapTable> inputs = new ArrayList<ExternalDbMapTable>();
        List<ExternalDbMapTable> outputs = new ArrayList<ExternalDbMapTable>();
        // main table
        ExternalDbMapTable inputTable = new ExternalDbMapTable();
        String mainTableName = "".equals(schema) ? table1 : schema + "." + table1;
        // quote will be removed in the ui for connections ,so we do the same for test
        String mainTableNameNoQuote = TalendTextUtils.removeQuotes(mainTableName);
        inputTable.setTableName(mainTableNameNoQuote);
        inputTable.setName(mainTableName);
        List<ExternalDbMapEntry> entities = getMetadataEntities(mainTableEntities, new String[3]);
        inputTable.setMetadataTableEntries(entities);
        inputs.add(inputTable);

        // output
        ExternalDbMapTable outputTable = new ExternalDbMapTable();
        mainTableName = "".equals(schema) ? table2 : schema + "." + table2;
        // quote will be removed in the ui for connections ,so we do the same for test
        mainTableNameNoQuote = TalendTextUtils.removeQuotes(mainTableName);
        outputTable.setTableName(mainTableNameNoQuote);
        outputTable.setName("table2");
        String[] names = new String[] { "id", "column1", "column2" };
        String mainTable = mainTableName;
        String[] expressions = new String[] { "table1.id",
                "CASE WHEN table1.column1 IS NULL THEN context.param1 ELSE table1.column1 END", "table1.column2" };
        outputTable.setMetadataTableEntries(getMetadataEntities(names, expressions));

        String[] whereNames = new String[] { "whereFilter" };
        String[] whereExps = new String[] { "t.column2 = context.param2" };
        outputTable.setCustomWhereConditionsEntries(getMetadataEntities(whereNames, whereExps));
        outputs.add(outputTable);
        externalData.setInputTables(inputs);
        externalData.setOutputTables(outputs);
        dbMapComponent.setExternalData(externalData);
        List<IMetadataTable> metadataList = new ArrayList<IMetadataTable>();
        MetadataTable metadataTable = getMetadataTable(names);
        metadataTable.setLabel("table2");
        metadataList.add(metadataTable);
        dbMapComponent.setMetadataList(metadataList);
        JobContext newContext = new JobContext("Default");
        List<IContextParameter> newParamList = new ArrayList<IContextParameter>();
        newContext.setContextParameterList(newParamList);
        JobContextParameter param = new JobContextParameter();
        param.setName("schema");
        newParamList.add(param);
        process = mock(Process.class);
        JobContextManager contextManger = new JobContextManager();
        contextManger.setDefaultContext(newContext);
        when(process.getContextManager()).thenReturn(contextManger);
        dbMapComponent.setProcess(process);

        ExternalDbMapData externalData2 = new ExternalDbMapData();
        DbMapComponent dbMapComponent2 = new DbMapComponent();
        dbMapComponent2.setExternalData(externalData2);
        mainTableEntities = new String[] { "id", "column1", "column2" };

        List<IConnection> outgoingConnections = new ArrayList<IConnection>();
        Node map1 = mockNode(dbMapComponent);
        outgoingConnections.add(mockConnection(map1, schema, table2, mainTableEntities));
        dbMapComponent.setOutgoingConnections(outgoingConnections);
        dbMapComponent2.setIncomingConnections(outgoingConnections);

        inputs = new ArrayList<ExternalDbMapTable>();
        outputs = new ArrayList<ExternalDbMapTable>();
        // main table
        inputTable = new ExternalDbMapTable();
        mainTableName = "".equals(schema) ? table2 : schema + "." + table2;
        // quote will be removed in the ui for connections ,so we do the same for test
        mainTableNameNoQuote = TalendTextUtils.removeQuotes(mainTableName);
        inputTable.setTableName(mainTableNameNoQuote);
        inputTable.setName("table2");
        entities = getMetadataEntities(mainTableEntities, new String[3]);
        inputTable.setMetadataTableEntries(entities);
        inputs.add(inputTable);

        // output
        outputTable = new ExternalDbMapTable();
        mainTableName = "".equals(schema) ? table3 : schema + "." + table3;
        // quote will be removed in the ui for connections ,so we do the same for test
        mainTableNameNoQuote = TalendTextUtils.removeQuotes(mainTableName);
        outputTable.setTableName(mainTableNameNoQuote);
        outputTable.setName("table3");
        names = new String[] { "id", "column1", "column2" };
        mainTable = mainTableName;
        expressions = new String[] { "table2.id", "table2.column1", "table2.column2" };
        outputTable.setMetadataTableEntries(getMetadataEntities(names, expressions));
        whereNames = new String[] { "whereFilter" };
        whereExps = new String[] { "t.column2A = context.param2A" };
        outputTable.setCustomWhereConditionsEntries(getMetadataEntities(whereNames, whereExps));
        outputs.add(outputTable);

        externalData2.setInputTables(inputs);
        externalData2.setOutputTables(outputs);
        dbMapComponent2.setExternalData(externalData2);
        metadataList = new ArrayList<IMetadataTable>();
        metadataTable = getMetadataTable(names);
        metadataTable.setLabel("table3");
        metadataList.add(metadataTable);
        dbMapComponent2.setMetadataList(metadataList);
        if (dbMapComponent2.getElementParameters() == null) {
            dbMapComponent2.setElementParameters(Collections.EMPTY_LIST);
        }
        JobContextParameter param1 = new JobContextParameter();
        param1.setName("param1");
        newParamList.add(param1);

        JobContextParameter param2 = new JobContextParameter();
        param2.setName("param2");
        newParamList.add(param2);
        dbMapComponent2.setProcess(process);
        outgoingConnections = new ArrayList<IConnection>();
        outgoingConnections.add(mockConnection(schema, table3, mainTableEntities));
        dbMapComponent2.setOutgoingConnections(outgoingConnections);

        ElementParameter comName = new ElementParameter(dbMapComponent);
        comName.setName("COMPONENT_NAME");
        comName.setValue("tELTMap");
        List<ElementParameter> list = new ArrayList<>();
        list.add(comName);
        dbMapComponent.setElementParameters(list);

        dbManager = new GenericDbGenerationManager() {

            @Override
            protected java.util.List<String> getContextList(DbMapComponent component) {
                return Arrays.asList("context.param1", "context.param2", "context.param2A");
            };
        };

        String query = dbManager.buildSqlSelect(dbMapComponent2, "table3");
        String exceptQuery = "\"SELECT\n" + 
                "table2.id, table2.column1, table2.column2\n" + 
                "FROM\n" + 
                " (\n" + 
                "  SELECT\n" + 
                "  table1.id AS id, CASE WHEN table1.column1 IS NULL THEN \" +context.param1+ \" ELSE table1.column1 END AS column1, table1.column2 AS column2\n" + 
                "  FROM\n" + 
                "   table1\n" + 
                "  WHERE t.column2 = \" +context.param2+ \"\n" + 
                " ) table2\n" + 
                "WHERE t.column2A = \" +context.param2A";
        assertEquals(exceptQuery.trim(), query.trim());

    }

    @Test
    public void testSubQueryBuildSqlSelect() {
        String schema = "";
        String table1 = "table1";
        String table2 = "table2";
        String table3 = "table3";
        List<IConnection> incomingConnections = new ArrayList<IConnection>();
        String[] mainTableEntities = new String[] { "id", "column1", "column2" };
        incomingConnections.add(mockConnection(schema, table1, mainTableEntities));
        dbMapComponent.setIncomingConnections(incomingConnections);

        ExternalDbMapData externalData = new ExternalDbMapData();
        List<ExternalDbMapTable> inputs = new ArrayList<ExternalDbMapTable>();
        List<ExternalDbMapTable> outputs = new ArrayList<ExternalDbMapTable>();
        // main table
        ExternalDbMapTable inputTable = new ExternalDbMapTable();
        String mainTableName = "".equals(schema) ? table1 : schema + "." + table1;
        // quote will be removed in the ui for connections ,so we do the same for test
        String mainTableNameNoQuote = TalendTextUtils.removeQuotes(mainTableName);
        inputTable.setTableName(mainTableNameNoQuote);
        inputTable.setName(mainTableName);
        List<ExternalDbMapEntry> entities = getMetadataEntities(mainTableEntities, new String[3]);
        inputTable.setMetadataTableEntries(entities);
        inputs.add(inputTable);

        // output
        ExternalDbMapTable outputTable = new ExternalDbMapTable();
        mainTableName = "".equals(schema) ? table2 : schema + "." + table2;
        // quote will be removed in the ui for connections ,so we do the same for test
        mainTableNameNoQuote = TalendTextUtils.removeQuotes(mainTableName);
        outputTable.setTableName(mainTableNameNoQuote);
        outputTable.setName("table2");
        String[] names = new String[] { "id", "column1", "column2" };
        String mainTable = mainTableName;
        String[] expressions = new String[] { "table1.id",
                "CASE WHEN table1.column1 IS NULL THEN context.param1 ELSE table1.column1 END", "table1.column2" };
        outputTable.setMetadataTableEntries(getMetadataEntities(names, expressions));

        String[] whereNames = new String[] { "whereFilter" };
        String[] whereExps = new String[] { "t.column2 = 'context.param2'" };
        outputTable.setCustomWhereConditionsEntries(getMetadataEntities(whereNames, whereExps));
        outputs.add(outputTable);
        externalData.setInputTables(inputs);
        externalData.setOutputTables(outputs);
        dbMapComponent.setExternalData(externalData);
        List<IMetadataTable> metadataList = new ArrayList<IMetadataTable>();
        MetadataTable metadataTable = getMetadataTable(names);
        metadataTable.setLabel("table2");
        metadataList.add(metadataTable);
        dbMapComponent.setMetadataList(metadataList);
        JobContext newContext = new JobContext("Default");
        List<IContextParameter> newParamList = new ArrayList<IContextParameter>();
        newContext.setContextParameterList(newParamList);
        JobContextParameter param = new JobContextParameter();
        param.setName("schema");
        newParamList.add(param);
        process = mock(Process.class);
        JobContextManager contextManger = new JobContextManager();
        contextManger.setDefaultContext(newContext);
        when(process.getContextManager()).thenReturn(contextManger);
        dbMapComponent.setProcess(process);

        ExternalDbMapData externalData2 = new ExternalDbMapData();
        DbMapComponent dbMapComponent2 = new DbMapComponent();
        dbMapComponent2.setExternalData(externalData2);
        mainTableEntities = new String[] { "id", "column1", "column2" };
        
        List<IConnection> outgoingConnections = new ArrayList<IConnection>();
        Node map1 = mockNode(dbMapComponent);
        outgoingConnections.add(mockConnection(map1, schema, table2, mainTableEntities));
        dbMapComponent.setOutgoingConnections(outgoingConnections);
        dbMapComponent2.setIncomingConnections(outgoingConnections);

        inputs = new ArrayList<ExternalDbMapTable>();
        outputs = new ArrayList<ExternalDbMapTable>();
        // main table
        inputTable = new ExternalDbMapTable();
        mainTableName = "".equals(schema) ? table2 : schema + "." + table2;
        // quote will be removed in the ui for connections ,so we do the same for test
        mainTableNameNoQuote = TalendTextUtils.removeQuotes(mainTableName);
        inputTable.setTableName(mainTableNameNoQuote);
        inputTable.setName("table2");
        entities = getMetadataEntities(mainTableEntities, new String[3]);
        inputTable.setMetadataTableEntries(entities);
        inputs.add(inputTable);

        // output
        outputTable = new ExternalDbMapTable();
        mainTableName = "".equals(schema) ? table3 : schema + "." + table3;
        // quote will be removed in the ui for connections ,so we do the same for test
        mainTableNameNoQuote = TalendTextUtils.removeQuotes(mainTableName);
        outputTable.setTableName(mainTableNameNoQuote);
        outputTable.setName("table3");
        names = new String[] { "id", "column1", "column2" };
        mainTable = mainTableName;
        expressions = new String[] { "table2.id", "table2.column1", "table2.column2" };
        outputTable.setMetadataTableEntries(getMetadataEntities(names, expressions));
        outputs.add(outputTable);

        externalData2.setInputTables(inputs);
        externalData2.setOutputTables(outputs);
        dbMapComponent2.setExternalData(externalData2);
        metadataList = new ArrayList<IMetadataTable>();
        metadataTable = getMetadataTable(names);
        metadataTable.setLabel("table3");
        metadataList.add(metadataTable);
        dbMapComponent2.setMetadataList(metadataList);
        if (dbMapComponent2.getElementParameters() == null) {
            dbMapComponent2.setElementParameters(Collections.EMPTY_LIST);
        }
        JobContextParameter param1 = new JobContextParameter();
        param1.setName("param1");
        newParamList.add(param1);

        JobContextParameter param2 = new JobContextParameter();
        param2.setName("param2");
        newParamList.add(param2);
        dbMapComponent2.setProcess(process);
        outgoingConnections = new ArrayList<IConnection>();
        outgoingConnections.add(mockConnection(schema, table3, mainTableEntities));
        dbMapComponent2.setOutgoingConnections(outgoingConnections);

        ElementParameter comName = new ElementParameter(dbMapComponent);
        comName.setName("COMPONENT_NAME");
        comName.setValue("tELTMap");
        List<ElementParameter> list = new ArrayList<>();
        list.add(comName);
        dbMapComponent.setElementParameters(list);

        dbManager = new GenericDbGenerationManager();
        // should be:
        // "SELECT
        // table2.id, table2.column1, table2.column2
        // FROM
        // (
        // SELECT
        // table1.id AS id, CASE WHEN table1.column1 IS NULL THEN " +context.param1+ " ELSE table1.column1 END AS
        // column1, table1.column2 AS column2
        // FROM
        // table1
        // WHERE t.column2 = '" +context.param2+ "'
        // ) table2"

        String query = dbManager.buildSqlSelect(dbMapComponent2, "table3").replaceAll("\n", "");
        String exceptQuery = "\"SELECT\n" + "table2.id, table2.column1, table2.column2\n" + "FROM\n" + " (\n" + "  SELECT\n"
                + "  table1.id AS id, CASE WHEN table1.column1 IS NULL THEN \" +context.param1+ \" ELSE table1.column1 END AS column1, table1.column2 AS column2\n"
                + "  FROM\n" + "   table1\n" + "  WHERE t.column2 = '\" +context.param2+ \"'\n" + " ) table2\"";
        assertEquals(exceptQuery.replaceAll("\n", "").trim(), query.trim());
    }
    
    @Test
    /**
     * Related Tuj task: TDI40720_tELTMap_InJoin
     */
    public void testELTMapInJoin() {
        String schema = "context.saphana_schema";
        String inputTable1 = "TDI40745";
        String inputTable2 = "TDI40745Out";
        String outTable1 = "outrow";

        dbMapComponent = new DbMapComponent();

        List<IMetadataTable> metadataList = new ArrayList<IMetadataTable>();

        MetadataTable metadataTable = getMetadataTable(new String[] { "newColumn", "newColumn1" }, new String[] { "id", "name" });
        metadataTable.setLabel(schema + "." + outTable1);
        metadataList.add(metadataTable);

        dbMapComponent.setMetadataList(metadataList);

        // main table
        ExternalDbMapData externalData = new ExternalDbMapData();
        List<ExternalDbMapTable> inputs = new ArrayList<ExternalDbMapTable>();
        List<ExternalDbMapTable> outputs = new ArrayList<ExternalDbMapTable>();
        // main table
        ExternalDbMapTable inputTable = new ExternalDbMapTable();
        inputTable.setTableName(schema + "." + inputTable1);
        inputTable.setName(schema + "." + inputTable1);
        inputTable.setAlias("inrow");
        List<ExternalDbMapEntry> entities = getMetadataEntities(new String[] { "newColumn", "newColumn1" }, new String[2]);
        inputTable.setMetadataTableEntries(entities);
        inputs.add(inputTable);

        // lookup table
        inputTable = new ExternalDbMapTable();
        inputTable.setTableName(schema + "." + inputTable2);
        inputTable.setName(schema + "." + inputTable2);
        inputTable.setAlias("inrow1");
        entities = getMetadataEntities(new String[] { "newColumn", "newColumn1" }, new String[2]);
        ExternalDbMapEntry newColumn = entities.get(0);
        newColumn.setExpression("inrow.newColumn");
        newColumn.setOperator("=");
        inputTable.setJoinType("INNER_JOIN");
        newColumn.setJoin(true);
        inputTable.setMetadataTableEntries(entities);
        inputs.add(inputTable);

        // output
        ExternalDbMapTable outputTable = new ExternalDbMapTable();
        outputTable.setName(schema + "." + outTable1);
        String[] names = new String[] { "newColumn", "newColumn1" };
        String[] expressions = new String[] { "inrow.newColumn", "inrow.newColumn1" };
        outputTable.setMetadataTableEntries(getMetadataEntities(names, expressions));
        outputs.add(outputTable);

        externalData.setInputTables(inputs);
        externalData.setOutputTables(outputs);
        dbMapComponent.setExternalData(externalData);

        List<IConnection> incomingConnections = new ArrayList<IConnection>();
        incomingConnections.add(
                mockConnection(schema, inputTable1, new String[] { "newColumn", "newColumn1" }, new String[] { "id", "name" }));
        incomingConnections.add(
                mockConnection(schema, inputTable2, new String[] { "newColumn", "newColumn1" }, new String[] { "id", "name" }));
        dbMapComponent.setIncomingConnections(incomingConnections);

        List<IConnection> outputConnections = new ArrayList<IConnection>();
        Node map1 = mockNode(dbMapComponent);
        IConnection connection = mockConnection(map1, schema, inputTable1, new String[] { "id", "name" });
        connection.getMetadataTable().getColumn("id").setLabel("newColumn");
        connection.getMetadataTable().getColumn("name").setLabel("newColumn1");
        outputConnections.add(connection);
        dbMapComponent.setOutgoingConnections(outputConnections);

        Process process = mock(Process.class);
        when(process.getContextManager()).thenReturn(new JobContextManager());
        dbMapComponent.setProcess(process);

        JobContext context = new JobContext("Default");
        IContextParameter schemaContext = new JobContextParameter();
        schemaContext.setName("saphana_schema");
        schemaContext.setValue("saphana_schema");
        schemaContext.setType("String");
        context.getContextParameterList().add(schemaContext);

        IContextParameter lookupTableContext = new JobContextParameter();
        lookupTableContext.setName("lookup");
        lookupTableContext.setValue("lookupTable");
        lookupTableContext.setType("String");
        context.getContextParameterList().add(lookupTableContext);
        dbMapComponent.getProcess().getContextManager().setDefaultContext(context);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + outTable1);

        String expectedQuery = "\"SELECT\n" + "inrow.id, inrow.name\n" + "FROM\n"
                + " \" +context.saphana_schema+\".\"+TDI40745+ \" inrow INNER JOIN  \" +context.saphana_schema+\".\"+TDI40745Out+ \" inrow1 ON(  inrow1.id = inrow.id )\"";
        assertEquals(expectedQuery, query);
    }

     @Test
    public void testELTMapJoinWithUpdate() {
        dbManager = new GenericDbGenerationManager();
        String schema = "dbo";
        String inputTable1 = "src1";
        String inputTable2 = "src2";
        String outTable1 = "tar";

        dbMapComponent = new DbMapComponent();

        List<IMetadataTable> metadataList = new ArrayList<IMetadataTable>();

        MetadataTable metadataTable = getMetadataTable(new String[] { "newColumn", "newColumn1" }, new String[] { "id", "name" });
        metadataTable.setLabel(schema + "." + outTable1);
        metadataList.add(metadataTable);

        dbMapComponent.setMetadataList(metadataList);

        // main table
        ExternalDbMapData externalData = new ExternalDbMapData();
        List<ExternalDbMapTable> inputs = new ArrayList<ExternalDbMapTable>();
        List<ExternalDbMapTable> outputs = new ArrayList<ExternalDbMapTable>();
        // main table
        ExternalDbMapTable inputTable = new ExternalDbMapTable();
        inputTable.setTableName(schema + "." + inputTable1);
        inputTable.setName(schema + "." + inputTable1);
        inputTable.setAlias("A");
        List<ExternalDbMapEntry> entities = getMetadataEntities(new String[] { "newColumn", "newColumn1" }, new String[2]);
        inputTable.setMetadataTableEntries(entities);
        inputs.add(inputTable);

        // lookup table
        inputTable = new ExternalDbMapTable();
        inputTable.setTableName(schema + "." + inputTable2);
        inputTable.setName(schema + "." + inputTable2);
        inputTable.setAlias("B");
        entities = getMetadataEntities(new String[] { "newColumn", "newColumn1" }, new String[2]);
        ExternalDbMapEntry newColumn = entities.get(0);
        newColumn.setExpression("A.newColumn");
        newColumn.setOperator("=");
        inputTable.setJoinType("INNER_JOIN");
        newColumn.setJoin(true);
        inputTable.setMetadataTableEntries(entities);
        inputs.add(inputTable);

        // output
        ExternalDbMapTable outputTable = new ExternalDbMapTable();
        outputTable.setName(schema + "." + outTable1);
        outputTable.setTableName(schema + "." + outTable1);
        String[] names = new String[] { "tarColumn", "tarColumn1" };
        String[] expressions = new String[] { "A.newColumn", "A.newColumn1" };
        outputTable.setMetadataTableEntries(getMetadataEntities(names, expressions));
        outputs.add(outputTable);

        externalData.setInputTables(inputs);
        externalData.setOutputTables(outputs);
        dbMapComponent.setExternalData(externalData);

        List<IConnection> incomingConnections = new ArrayList<IConnection>();
        incomingConnections.add(
                mockConnection(schema, inputTable1, new String[] { "newColumn", "newColumn1" }, new String[] { "id", "name" }));
        incomingConnections.add(
                mockConnection(schema, inputTable2, new String[] { "newColumn", "newColumn1" }, new String[] { "id", "name" }));
        dbMapComponent.setIncomingConnections(incomingConnections);

        List<IConnection> outputConnections = new ArrayList<IConnection>();
        Node map1 = mockNode(dbMapComponent);
        IConnection connection = mockConnection(map1, schema, inputTable1, new String[] { "id", "name" });
        targetComponent = ComponentsFactoryProvider.getInstance().get("tELTMSSqlOutput",
                ComponentCategory.CATEGORY_4_DI.getName());
        connection.getMetadataTable().getColumn("id").setLabel("newColumn");
        connection.getMetadataTable().getColumn("name").setLabel("newColumn1");
        // add target
        DataNode output = new DataNode();
        List<IElementParameter> paraList = new ArrayList<IElementParameter>();
        ElementParameter param = new ElementParameter(output);
        param.setName("USE_UPDATE_STATEMENT"); //$NON-NLS-1$
        param.setValue("true"); //$NON-NLS-1$
        paraList.add(param);
        output.setElementParameters(paraList);
        output.setComponent(targetComponent);

        DataConnection dataConnection = new DataConnection();
        dataConnection.setName(schema + "." + outTable1);
        dataConnection.setActivate(true);
        dataConnection.setLineStyle(EConnectionType.FLOW_MAIN);
        dataConnection.setTarget(output);
        IMetadataTable table = new MetadataTable();
        table.setLabel(outTable1);
        table.setTableName(outTable1);
        List<IMetadataColumn> listColumns = new ArrayList<IMetadataColumn>();
        for (String columnName : new String[] { "id", "name" }) {
            IMetadataColumn column = new MetadataColumn();
            column.setLabel(columnName);
            column.setOriginalDbColumnName(columnName);
            listColumns.add(column);
        }
        table.setListColumns(listColumns);
        dataConnection.setMetadataTable(table);
        // List<DataConnection> dataConnections = new ArrayList<>();
        outputConnections.add(dataConnection);
        outputConnections.add(connection);
        dbMapComponent.setOutgoingConnections(outputConnections);

        Process process = mock(Process.class);
        when(process.getContextManager()).thenReturn(new JobContextManager());
        dbMapComponent.setProcess(process);

        IContextParameter lookupTableContext = new JobContextParameter();
        lookupTableContext.setName("lookup");
        lookupTableContext.setValue("lookupTable");
        lookupTableContext.setType("String");
        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + outTable1);
        String expectedQuery = "\"UPDATE dbo.tar\n" + "SET tarColumn = A.id,\n" + "tarColumn1 = A.name\n"
                + "FROM\n \" +\"dbo\"+\".\"+src1+ \" A INNER JOIN  \" +\"dbo\"+\".\"+src2+ \" B " + "ON("
                + "  B.id = A.id )\"";

        assertEquals(expectedQuery, query);
    }

    @Test
    public void testGetHandledFieldWithContext() {
        String schema = "";
        String table1 = "table1";
        String table2 = "table2";
        String table3 = "table3";
        List<IConnection> incomingConnections = new ArrayList<IConnection>();
        String[] mainTableEntities = new String[] { "id", "column1", "column2" };
        incomingConnections.add(mockConnection(schema, table1, mainTableEntities));
        dbMapComponent.setIncomingConnections(incomingConnections);

        ExternalDbMapData externalData = new ExternalDbMapData();
        List<ExternalDbMapTable> inputs = new ArrayList<ExternalDbMapTable>();
        List<ExternalDbMapTable> outputs = new ArrayList<ExternalDbMapTable>();
        // main table
        ExternalDbMapTable inputTable = new ExternalDbMapTable();
        String mainTableName = "".equals(schema) ? table1 : schema + "." + table1;
        // quote will be removed in the ui for connections ,so we do the same for test
        String mainTableNameNoQuote = TalendTextUtils.removeQuotes(mainTableName);
        inputTable.setTableName(mainTableNameNoQuote);
        inputTable.setName(mainTableName);
        List<ExternalDbMapEntry> entities = getMetadataEntities(mainTableEntities, new String[3]);
        inputTable.setMetadataTableEntries(entities);
        inputs.add(inputTable);

        // output
        ExternalDbMapTable outputTable = new ExternalDbMapTable();
        mainTableName = "".equals(schema) ? table2 : schema + "." + table2;
        // quote will be removed in the ui for connections ,so we do the same for test
        mainTableNameNoQuote = TalendTextUtils.removeQuotes(mainTableName);
        outputTable.setTableName(mainTableNameNoQuote);
        outputTable.setName("table2");
        String[] names = new String[] { "id", "column1", "column2" };
        String mainTable = mainTableName;
        String[] expressions = new String[] { "table1.id",
                "CASE WHEN table1.column1 IS NULL THEN context.param1 ELSE table1.column1 END", "table1.column2" };
        outputTable.setMetadataTableEntries(getMetadataEntities(names, expressions));

        String[] whereNames = new String[] { "whereFilter" };
        String[] whereExps = new String[] { "t.column2 = context.param2" };
        outputTable.setCustomWhereConditionsEntries(getMetadataEntities(whereNames, whereExps));
        outputs.add(outputTable);
        externalData.setInputTables(inputs);
        externalData.setOutputTables(outputs);
        dbMapComponent.setExternalData(externalData);
        List<IMetadataTable> metadataList = new ArrayList<IMetadataTable>();
        MetadataTable metadataTable = getMetadataTable(names);
        metadataTable.setLabel("table2");
        metadataList.add(metadataTable);
        dbMapComponent.setMetadataList(metadataList);
        JobContext newContext = new JobContext("Default");
        List<IContextParameter> newParamList = new ArrayList<IContextParameter>();
        newContext.setContextParameterList(newParamList);
        JobContextParameter param = new JobContextParameter();
        param.setName("schema");
        newParamList.add(param);
        process = mock(Process.class);
        JobContextManager contextManger = new JobContextManager();
        contextManger.setDefaultContext(newContext);
        when(process.getContextManager()).thenReturn(contextManger);
        dbMapComponent.setProcess(process);

        ExternalDbMapData externalData2 = new ExternalDbMapData();
        DbMapComponent dbMapComponent2 = new DbMapComponent();
        dbMapComponent2.setExternalData(externalData2);
        mainTableEntities = new String[] { "id", "column1", "column2" };

        List<IConnection> outgoingConnections = new ArrayList<IConnection>();
        Node map1 = mockNode(dbMapComponent);
        outgoingConnections.add(mockConnection(map1, schema, table2, mainTableEntities));
        dbMapComponent.setOutgoingConnections(outgoingConnections);
        dbMapComponent2.setIncomingConnections(outgoingConnections);

        inputs = new ArrayList<ExternalDbMapTable>();
        outputs = new ArrayList<ExternalDbMapTable>();
        // main table
        inputTable = new ExternalDbMapTable();
        mainTableName = "".equals(schema) ? table2 : schema + "." + table2;
        // quote will be removed in the ui for connections ,so we do the same for test
        mainTableNameNoQuote = TalendTextUtils.removeQuotes(mainTableName);
        inputTable.setTableName(mainTableNameNoQuote);
        inputTable.setName("context.alias1");
        inputTable.setAlias("context.alias1");
        entities = getMetadataEntities(mainTableEntities, new String[3]);
        inputTable.setMetadataTableEntries(entities);
        inputs.add(inputTable);

        // output
        outputTable = new ExternalDbMapTable();
        mainTableName = "".equals(schema) ? table3 : schema + "." + table3;
        // quote will be removed in the ui for connections ,so we do the same for test
        mainTableNameNoQuote = TalendTextUtils.removeQuotes(mainTableName);
        outputTable.setTableName(mainTableNameNoQuote);
        outputTable.setName("table3");
        names = new String[] { "id", "column1", "column2" };
        mainTable = mainTableName;
        expressions = new String[] { "context.alias1.id", "table2.column1", "table2.column2" };
        outputTable.setMetadataTableEntries(getMetadataEntities(names, expressions));
        whereNames = new String[] { "whereFilter" };
        whereExps = new String[] { "t.column2A = context.param2A" };
        outputTable.setCustomWhereConditionsEntries(getMetadataEntities(whereNames, whereExps));
        outputs.add(outputTable);

        externalData2.setInputTables(inputs);
        externalData2.setOutputTables(outputs);
        dbMapComponent2.setExternalData(externalData2);
        metadataList = new ArrayList<IMetadataTable>();
        metadataTable = getMetadataTable(names);
        metadataTable.setLabel("table3");
        metadataList.add(metadataTable);
        dbMapComponent2.setMetadataList(metadataList);
        if (dbMapComponent2.getElementParameters() == null) {
            dbMapComponent2.setElementParameters(Collections.EMPTY_LIST);
        }
        JobContextParameter param1 = new JobContextParameter();
        param1.setName("param1");
        newParamList.add(param1);

        JobContextParameter param2 = new JobContextParameter();
        param2.setName("param2");
        newParamList.add(param2);
        dbMapComponent2.setProcess(process);
        outgoingConnections = new ArrayList<IConnection>();
        outgoingConnections.add(mockConnection(schema, table3, mainTableEntities));
        dbMapComponent2.setOutgoingConnections(outgoingConnections);

        ElementParameter comName = new ElementParameter(dbMapComponent);
        comName.setName("COMPONENT_NAME");
        comName.setValue("tELTMap");
        List<ElementParameter> list = new ArrayList<>();
        list.add(comName);
        dbMapComponent.setElementParameters(list);

        dbManager = new GenericDbGenerationManager() {

            @Override
            protected java.util.List<String> getContextList(DbMapComponent component) {
                return Arrays.asList("context.param1", "context.param2", "context.param2A", "context.alias1");
            };
        };

        String query = dbManager.buildSqlSelect(dbMapComponent2, "table3");
        String exceptQuery = "\"SELECT\n" + "\" +context.alias1+ \".id, table2.column1, table2.column2\n" + "FROM\n"
                + " (\n" + "  SELECT\n"
                + "  table1.id AS id, CASE WHEN table1.column1 IS NULL THEN \" +context.param1+ \" ELSE table1.column1 END AS column1, table1.column2 AS column2\n"
                + "  FROM\n" + "   table1\n" + "  WHERE t.column2 = \" +context.param2+ \"\n" + " ) \" +context.alias1+ \"\n"
                + "WHERE t.column2A = \" +context.param2A";
        assertEquals(exceptQuery.trim(), query.trim());
    }

    @Test
    public void testBuildSqlSelectWithContextCase1() {
        String schema = "";
        String main_table = "context.main_table";
        String main_alias = "";
        String lookup_table = "lookup_table";
        String lookup_alias = "";
        init(schema, main_table, main_alias, lookup_table, lookup_alias);
        String expectedQuery = "\"SELECT\n" + "\" +context.main_table+ \"" + ".id, " + "\" +context.main_table+ \"" + ".name, "
                + "\" +context.main_table+ \"" + ".age, " + "lookup_table" + ".score\n" + "FROM\n" + " \" +context.main_table+ \""
                + " , " + "lookup_table\"";
        String query = dbManager.buildSqlSelect(dbMapComponent, "grade");
        assertEquals(expectedQuery, query);
    }

    @Test
    public void testBuildSqlSelectWithContextCase2() {
        String schema = "schema";
        String main_table = "context.main_table";
        String main_alias = "";
        String lookup_table = "lookup_table";
        String lookup_alias = "";
        init(schema, main_table, main_alias, lookup_table, lookup_alias);
        String expectedQuery = "\"SELECT\n" + "schema.\" +context.main_table+ \"" + ".id, " + "schema.\" +context.main_table+ \""
                + ".name, " + "schema.\" +context.main_table+ \"" + ".age, " + "schema.lookup_table" + ".score\n" + "FROM\n"
                + " schema.\" +context.main_table+ \"" + " , " + "schema.lookup_table\"";
        String query = dbManager.buildSqlSelect(dbMapComponent, "grade");
        assertEquals(expectedQuery, query);
    }

    @Test
    public void testBuildSqlSelectWithContextCase3() {
        String schema = "context.schema";
        String main_table = "context.main_table";
        String main_alias = "";
        String lookup_table = "lookup_table";
        String lookup_alias = "";
        init(schema, main_table, main_alias, lookup_table, lookup_alias);
        String expectedQuery = "\"SELECT\n" + "\" +context.schema+ \"." + "\" +context.main_table+ \"" + ".id, "
                + "\" +context.schema+ \"." + "\" +context.main_table+ \"" + ".name, " + "\" +context.schema+ \"."
                + "\" +context.main_table+ \"" + ".age, " + "\" +context.schema+ \"." + "lookup_table" + ".score\n" + "FROM\n"
                + " \" +context.schema+ \"." + "\" +context.main_table+ \"" + " , " + "\" +context.schema+ \"."
                + "lookup_table\"";
        String query = dbManager.buildSqlSelect(dbMapComponent, "grade");
        assertEquals(expectedQuery, query);
    }

    @Test
    public void testBuildSqlSelectWithContextCase4() {
        String schema = "context.schema1.context.schema2";
        String main_table = "context.main_table";
        String main_alias = "a1";
        String lookup_table = "lookup_table";
        String lookup_alias = "a2";
        init(schema, main_table, main_alias, lookup_table, lookup_alias);
        String expectedQuery = "\"SELECT\n" + "a1.id, a1.name, a1.age, a2.score\n" + "FROM\n" + " \" +context.schema1 + \"."
                + "\" + context.schema2+\"." + "\"+context.main_table+ \"" + " a1 , " + "\" +context.schema1 + \"."
                + "\" + context.schema2+\"." + "\"+lookup_table+ \" a2\"";
        String query = dbManager.buildSqlSelect(dbMapComponent, "grade");
        assertEquals(expectedQuery, query);
    }

    @Test
    public void testBuildSqlSelectWithContextCase5() {
        String schema = "context.schema1.context.schema2.context.schema3";
        String main_table = "context.main_table";
        String main_alias = "a1";
        String lookup_table = "lookup_table";
        String lookup_alias = "a2";
        init(schema, main_table, main_alias, lookup_table, lookup_alias);
        String expectedQuery = "\"SELECT\n" + "a1.id, a1.name, a1.age, a2.score\n" + "FROM\n" + " \" +context.schema1 + \"."
                + "\" + context.schema2 + \"." + "\" + context.schema3+\"." + "\"+context.main_table+ \"" + " a1 , "
                + "\" +context.schema1 + \"." + "\" + context.schema2 + \"." + "\" + context.schema3+\"."
                + "\"+lookup_table+ \" a2\"";
        String query = dbManager.buildSqlSelect(dbMapComponent, "grade");
        assertEquals(expectedQuery, query);
    }

    @Test
    public void testBuildSqlSelectWithContextCase6() {
        String schema = "context.schema1.schema2";
        String main_table = "context.main_table";
        String main_alias = "a1";
        String lookup_table = "lookup_table";
        String lookup_alias = "a2";
        init(schema, main_table, main_alias, lookup_table, lookup_alias);
        String expectedQuery = "\"SELECT\n" + "a1.id, a1.name, a1.age, a2.score\n" + "FROM\n" + " \" +context.schema1 + \"."
                + "\" + \"schema2\"+\"." + "\"+context.main_table+ \"" + " a1 , " + "\" +context.schema1 + \"."
                + "\" + \"schema2\"+\"." + "\"+lookup_table+ \" a2\"";
        String query = dbManager.buildSqlSelect(dbMapComponent, "grade");
        assertEquals(expectedQuery, query);
    }

    @Test
    public void testBuildSqlSelectWithContextCase7() {
        String schema = "schema1.context.schema2";
        String main_table = "context.main_table";
        String main_alias = "a1";
        String lookup_table = "lookup_table";
        String lookup_alias = "a2";
        init(schema, main_table, main_alias, lookup_table, lookup_alias);
        String expectedQuery = "\"SELECT\n" + "a1.id, a1.name, a1.age, a2.score\n" + "FROM\n" + " \" +\"schema1\" + \"."
                + "\" + context.schema2+\"." + "\"+context.main_table+ \"" + " a1 , " + "\" +\"schema1\" + \"."
                + "\" + context.schema2+\"." + "\"+lookup_table+ \" a2\"";
        String query = dbManager.buildSqlSelect(dbMapComponent, "grade");
        assertEquals(expectedQuery, query);
    }

    @Test
    public void testBuildSqlSelectWithContextCase8() {
        String schema = "context.schema1 + \".\" + context.schema2";
        String main_table = "context.main_table";
        String main_alias = "a1";
        String lookup_table = "lookup_table";
        String lookup_alias = "a2";
        init(schema, main_table, main_alias, lookup_table, lookup_alias);
        String expectedQuery = "\"SELECT\n" + "a1.id, a1.name, a1.age, a2.score\n" + "FROM\n" + " \" +context.schema1 + \"."
                + "\" + context.schema2+\"." + "\"+context.main_table+ \"" + " a1 , " + "\" +context.schema1 + \"."
                + "\" + context.schema2+\"." + "\"+lookup_table+ \" a2\"";
        String query = dbManager.buildSqlSelect(dbMapComponent, "grade");
        assertEquals(expectedQuery, query);
    }

    @Test
    public void testELTMapWithUpdateIfCheckUseDifferentTable() {
        dbManager = new GenericDbGenerationManager();
        String schema = "dbo";
        String inputTable1 = "src1";
        String inputTable2 = "src2";
        String outTable1 = "tar";

        // Snowflake
        dbMapComponent = new DbMapComponent();
        ElementParameter param = new ElementParameter(dbMapComponent);
        param.setFieldType(EParameterFieldType.MAPPING_TYPE);
        param.setName(EParameterName.MAPPING.getName());
        param.setValue("snowflake_id");
        ((List<IElementParameter>) dbMapComponent.getElementParameters()).add(param);

        List<IMetadataTable> metadataList = new ArrayList<IMetadataTable>();

        MetadataTable metadataTable = getMetadataTable(new String[] { "newColumn", "newColumn1" }, new String[] { "id", "name" });
        metadataTable.setLabel(schema + "." + outTable1);
        metadataList.add(metadataTable);

        dbMapComponent.setMetadataList(metadataList);

        // main table
        ExternalDbMapData externalData = new ExternalDbMapData();
        List<ExternalDbMapTable> inputs = new ArrayList<ExternalDbMapTable>();
        List<ExternalDbMapTable> outputs = new ArrayList<ExternalDbMapTable>();
        // main table
        ExternalDbMapTable inputTable = new ExternalDbMapTable();
        inputTable.setTableName(schema + "." + inputTable1);
        inputTable.setName(schema + "." + inputTable1);
        inputTable.setAlias("A");
        List<ExternalDbMapEntry> entities = getMetadataEntities(new String[] { "newColumn", "newColumn1" }, new String[2]);
        inputTable.setMetadataTableEntries(entities);
        inputs.add(inputTable);

        // lookup table
        inputTable = new ExternalDbMapTable();
        inputTable.setTableName(schema + "." + inputTable2);
        inputTable.setName(schema + "." + inputTable2);
        inputTable.setAlias("B");
        entities = getMetadataEntities(new String[] { "newColumn", "newColumn1" }, new String[2]);
        ExternalDbMapEntry newColumn = entities.get(0);
        newColumn.setExpression("A.newColumn");
        newColumn.setOperator("=");
        inputTable.setJoinType("INNER_JOIN");
        newColumn.setJoin(true);
        inputTable.setMetadataTableEntries(entities);
        inputs.add(inputTable);

        // output
        ExternalDbMapTable outputTable = new ExternalDbMapTable();
        outputTable.setName(schema + "." + outTable1);
        outputTable.setTableName(schema + "." + outTable1);
        String[] names = new String[] { "tarColumn", "tarColumn1" };
        String[] expressions = new String[] { "A.newColumn", "A.newColumn1" };
        outputTable.setMetadataTableEntries(getMetadataEntities(names, expressions));
        outputs.add(outputTable);

        externalData.setInputTables(inputs);
        externalData.setOutputTables(outputs);
        dbMapComponent.setExternalData(externalData);

        List<IConnection> incomingConnections = new ArrayList<IConnection>();
        incomingConnections.add(
                mockConnection(schema, inputTable1, new String[] { "newColumn", "newColumn1" }, new String[] { "id", "name" }));
        incomingConnections.add(
                mockConnection(schema, inputTable2, new String[] { "newColumn", "newColumn1" }, new String[] { "id", "name" }));
        dbMapComponent.setIncomingConnections(incomingConnections);

        List<IConnection> outputConnections = new ArrayList<IConnection>();
        Node map1 = mockNode(dbMapComponent);
        IConnection connection = mockConnection(map1, schema, inputTable1, new String[] { "id", "name" });
        targetComponent = ComponentsFactoryProvider.getInstance().get("tELTMSSqlOutput",
                ComponentCategory.CATEGORY_4_DI.getName());
        connection.getMetadataTable().getColumn("id").setLabel("newColumn");
        connection.getMetadataTable().getColumn("name").setLabel("newColumn1");
        // add target
        DataNode output = new DataNode();
        List<IElementParameter> paraList = new ArrayList<IElementParameter>();
        //
        param = new ElementParameter(output);
        param.setName("USE_UPDATE_STATEMENT"); //$NON-NLS-1$
        param.setValue("true"); //$NON-NLS-1$
        paraList.add(param);
        //
        param = new ElementParameter(output);
        param.setName("USE_DIFFERENT_TABLE"); //$NON-NLS-1$
        param.setValue(true);
        paraList.add(param);
        //
        param = new ElementParameter(output);
        param.setName("DIFFERENT_TABLE_NAME"); //$NON-NLS-1$
        param.setValue("ABC"); //$NON-NLS-1$
        paraList.add(param);
        output.setElementParameters(paraList);
        output.setComponent(targetComponent);

        DataConnection dataConnection = new DataConnection();
        dataConnection.setName(schema + "." + outTable1);
        dataConnection.setActivate(true);
        dataConnection.setLineStyle(EConnectionType.FLOW_MAIN);
        dataConnection.setTarget(output);
        IMetadataTable table = new MetadataTable();
        table.setLabel(outTable1);
        table.setTableName(outTable1);
        List<IMetadataColumn> listColumns = new ArrayList<IMetadataColumn>();
        for (String columnName : new String[] { "id", "name" }) {
            IMetadataColumn column = new MetadataColumn();
            column.setLabel(columnName);
            column.setOriginalDbColumnName(columnName);
            listColumns.add(column);
        }
        table.setListColumns(listColumns);
        dataConnection.setMetadataTable(table);
        // List<DataConnection> dataConnections = new ArrayList<>();
        outputConnections.add(dataConnection);
        outputConnections.add(connection);
        dbMapComponent.setOutgoingConnections(outputConnections);

        Process process = mock(Process.class);
        when(process.getContextManager()).thenReturn(new JobContextManager());
        dbMapComponent.setProcess(process);

        IContextParameter lookupTableContext = new JobContextParameter();
        lookupTableContext.setName("lookup");
        lookupTableContext.setValue("lookupTable");
        lookupTableContext.setType("String");
        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + outTable1);
        String expectedQuery = "\"UPDATE ABC\n" + "SET tarColumn = A.id,\n" + "tarColumn1 = A.name\n"
                + "FROM\n \" +\"dbo\"+\".\"+src1+ \" A INNER JOIN  \" +\"dbo\"+\".\"+src2+ \" B " + "ON("
                + "  B.id = A.id )\"";
        assertEquals(expectedQuery, query);
    }

    @Test
    public void testELTMapWithUpdateIfCheckUseDifferentTable4Alias() {
        dbManager = new GenericDbGenerationManager();
        String schema = "dbo";
        String inputTable1 = "src1";
        String inputTable2 = "src2";
        String outTable1 = "tar";

        // Snowflake
        dbMapComponent = new DbMapComponent();
        ElementParameter param = new ElementParameter(dbMapComponent);
        param.setFieldType(EParameterFieldType.MAPPING_TYPE);
        param.setName(EParameterName.MAPPING.getName());
        param.setValue("snowflake_id");
        ((List<IElementParameter>) dbMapComponent.getElementParameters()).add(param);

        List<IMetadataTable> metadataList = new ArrayList<IMetadataTable>();

        MetadataTable metadataTable = getMetadataTable(new String[] { "newColumn", "newColumn1" }, new String[] { "id", "name" });
        metadataTable.setLabel(schema + "." + outTable1);
        metadataList.add(metadataTable);

        dbMapComponent.setMetadataList(metadataList);

        // main table
        ExternalDbMapData externalData = new ExternalDbMapData();
        List<ExternalDbMapTable> inputs = new ArrayList<ExternalDbMapTable>();
        List<ExternalDbMapTable> outputs = new ArrayList<ExternalDbMapTable>();
        // main table
        ExternalDbMapTable inputTable = new ExternalDbMapTable();
        inputTable.setTableName(schema + "." + inputTable1);
        inputTable.setName(schema + "." + inputTable1);
        inputTable.setAlias("A");
        List<ExternalDbMapEntry> entities = getMetadataEntities(new String[] { "newColumn", "newColumn1" }, new String[2]);
        inputTable.setMetadataTableEntries(entities);
        inputs.add(inputTable);

        // lookup table
        inputTable = new ExternalDbMapTable();
        inputTable.setTableName(schema + "." + inputTable2);
        inputTable.setName(schema + "." + inputTable2);
        inputTable.setAlias("B");
        entities = getMetadataEntities(new String[] { "newColumn", "newColumn1" }, new String[2]);
        ExternalDbMapEntry newColumn = entities.get(0);
        newColumn.setExpression("A.newColumn");
        newColumn.setOperator("=");
        inputTable.setJoinType("INNER_JOIN");
        newColumn.setJoin(true);
        inputTable.setMetadataTableEntries(entities);
        inputs.add(inputTable);

        // output
        ExternalDbMapTable outputTable = new ExternalDbMapTable();
        outputTable.setName(schema + "." + outTable1);
        outputTable.setTableName(schema + "." + outTable1);
        String[] names = new String[] { "tarColumn", "tarColumn1" };
        String[] expressions = new String[] { "A.newColumn", "A.newColumn1" };
        outputTable.setMetadataTableEntries(getMetadataEntities(names, expressions));
        outputs.add(outputTable);

        externalData.setInputTables(inputs);
        externalData.setOutputTables(outputs);
        dbMapComponent.setExternalData(externalData);

        List<IConnection> incomingConnections = new ArrayList<IConnection>();
        incomingConnections.add(
                mockConnection(schema, inputTable1, new String[] { "newColumn", "newColumn1" }, new String[] { "id", "name" }));
        incomingConnections.add(
                mockConnection(schema, inputTable2, new String[] { "newColumn", "newColumn1" }, new String[] { "id", "name" }));
        dbMapComponent.setIncomingConnections(incomingConnections);

        List<IConnection> outputConnections = new ArrayList<IConnection>();
        Node map1 = mockNode(dbMapComponent);
        IConnection connection = mockConnection(map1, schema, inputTable1, new String[] { "id", "name" });
        targetComponent = ComponentsFactoryProvider.getInstance().get("tELTMSSqlOutput",
                ComponentCategory.CATEGORY_4_DI.getName());
        connection.getMetadataTable().getColumn("id").setLabel("newColumn");
        connection.getMetadataTable().getColumn("name").setLabel("newColumn1");
        // add target
        DataNode output = new DataNode();
        List<IElementParameter> paraList = new ArrayList<IElementParameter>();
        //
        param = new ElementParameter(output);
        param.setName("USE_UPDATE_STATEMENT"); //$NON-NLS-1$
        param.setValue("true"); //$NON-NLS-1$
        paraList.add(param);
        //
        param = new ElementParameter(output);
        param.setName("USE_DIFFERENT_TABLE"); //$NON-NLS-1$
        param.setValue(true);
        paraList.add(param);
        //
        param = new ElementParameter(output);
        param.setName("DIFFERENT_TABLE_NAME"); //$NON-NLS-1$
        param.setValue("ABC A"); //$NON-NLS-1$
        paraList.add(param);
        output.setElementParameters(paraList);
        output.setComponent(targetComponent);

        DataConnection dataConnection = new DataConnection();
        dataConnection.setName(schema + "." + outTable1);
        dataConnection.setActivate(true);
        dataConnection.setLineStyle(EConnectionType.FLOW_MAIN);
        dataConnection.setTarget(output);
        IMetadataTable table = new MetadataTable();
        table.setLabel(outTable1);
        table.setTableName(outTable1);
        List<IMetadataColumn> listColumns = new ArrayList<IMetadataColumn>();
        for (String columnName : new String[] { "id", "name" }) {
            IMetadataColumn column = new MetadataColumn();
            column.setLabel(columnName);
            column.setOriginalDbColumnName(columnName);
            listColumns.add(column);
        }
        table.setListColumns(listColumns);
        dataConnection.setMetadataTable(table);
        // List<DataConnection> dataConnections = new ArrayList<>();
        outputConnections.add(dataConnection);
        outputConnections.add(connection);
        dbMapComponent.setOutgoingConnections(outputConnections);

        Process process = mock(Process.class);
        when(process.getContextManager()).thenReturn(new JobContextManager());
        dbMapComponent.setProcess(process);

        IContextParameter lookupTableContext = new JobContextParameter();
        lookupTableContext.setName("lookup");
        lookupTableContext.setValue("lookupTable");
        lookupTableContext.setType("String");
        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + outTable1);
        String expectedQuery = "\"UPDATE ABC A\n" + "SET tarColumn = A.id,\n" + "tarColumn1 = A.name\n"
                + "FROM\n \" +\"dbo\"+\".\"+src1+ \" A INNER JOIN  \" +\"dbo\"+\".\"+src2+ \" B " + "ON("
                + "  B.id = A.id )\"";
        assertEquals(expectedQuery, query);
    }

    @Test
    public void testELTMapWithUpdateIfUnCheckUseDifferentTable() {
        dbManager = new GenericDbGenerationManager();
        String schema = "dbo";
        String inputTable1 = "src1";
        String inputTable2 = "src2";
        String outTable1 = "tar";

        // Snowflake
        dbMapComponent = new DbMapComponent();
        ElementParameter param = new ElementParameter(dbMapComponent);
        param.setFieldType(EParameterFieldType.MAPPING_TYPE);
        param.setName(EParameterName.MAPPING.getName());
        param.setValue("snowflake_id");
        ((List<IElementParameter>) dbMapComponent.getElementParameters()).add(param);

        List<IMetadataTable> metadataList = new ArrayList<IMetadataTable>();

        MetadataTable metadataTable = getMetadataTable(new String[] { "newColumn", "newColumn1" }, new String[] { "id", "name" });
        metadataTable.setLabel(schema + "." + outTable1);
        metadataList.add(metadataTable);

        dbMapComponent.setMetadataList(metadataList);

        // main table
        ExternalDbMapData externalData = new ExternalDbMapData();
        List<ExternalDbMapTable> inputs = new ArrayList<ExternalDbMapTable>();
        List<ExternalDbMapTable> outputs = new ArrayList<ExternalDbMapTable>();
        // main table
        ExternalDbMapTable inputTable = new ExternalDbMapTable();
        inputTable.setTableName(schema + "." + inputTable1);
        inputTable.setName(schema + "." + inputTable1);
        inputTable.setAlias("A");
        List<ExternalDbMapEntry> entities = getMetadataEntities(new String[] { "newColumn", "newColumn1" }, new String[2]);
        inputTable.setMetadataTableEntries(entities);
        inputs.add(inputTable);

        // lookup table
        inputTable = new ExternalDbMapTable();
        inputTable.setTableName(schema + "." + inputTable2);
        inputTable.setName(schema + "." + inputTable2);
        inputTable.setAlias("B");
        entities = getMetadataEntities(new String[] { "newColumn", "newColumn1" }, new String[2]);
        ExternalDbMapEntry newColumn = entities.get(0);
        newColumn.setExpression("A.newColumn");
        newColumn.setOperator("=");
        inputTable.setJoinType("INNER_JOIN");
        newColumn.setJoin(true);
        inputTable.setMetadataTableEntries(entities);
        inputs.add(inputTable);

        // output
        ExternalDbMapTable outputTable = new ExternalDbMapTable();
        outputTable.setName(schema + "." + outTable1);
        outputTable.setTableName(schema + "." + outTable1);
        String[] names = new String[] { "tarColumn", "tarColumn1" };
        String[] expressions = new String[] { "A.newColumn", "A.newColumn1" };
        outputTable.setMetadataTableEntries(getMetadataEntities(names, expressions));
        outputs.add(outputTable);

        externalData.setInputTables(inputs);
        externalData.setOutputTables(outputs);
        dbMapComponent.setExternalData(externalData);

        List<IConnection> incomingConnections = new ArrayList<IConnection>();
        incomingConnections.add(
                mockConnection(schema, inputTable1, new String[] { "newColumn", "newColumn1" }, new String[] { "id", "name" }));
        incomingConnections.add(
                mockConnection(schema, inputTable2, new String[] { "newColumn", "newColumn1" }, new String[] { "id", "name" }));
        dbMapComponent.setIncomingConnections(incomingConnections);

        List<IConnection> outputConnections = new ArrayList<IConnection>();
        Node map1 = mockNode(dbMapComponent);
        IConnection connection = mockConnection(map1, schema, inputTable1, new String[] { "id", "name" });
        targetComponent = ComponentsFactoryProvider.getInstance().get("tELTMSSqlOutput",
                ComponentCategory.CATEGORY_4_DI.getName());
        connection.getMetadataTable().getColumn("id").setLabel("newColumn");
        connection.getMetadataTable().getColumn("name").setLabel("newColumn1");
        // add target
        DataNode output = new DataNode();
        List<IElementParameter> paraList = new ArrayList<IElementParameter>();
        //
        param = new ElementParameter(output);
        param.setName("USE_UPDATE_STATEMENT"); //$NON-NLS-1$
        param.setValue("true"); //$NON-NLS-1$
        paraList.add(param);
        //
        param = new ElementParameter(output);
        param.setName("USE_DIFFERENT_TABLE"); //$NON-NLS-1$
        param.setValue(false);
        paraList.add(param);
        //
        param = new ElementParameter(output);
        param.setName("DIFFERENT_TABLE_NAME"); //$NON-NLS-1$
        param.setValue("ABC"); //$NON-NLS-1$
        paraList.add(param);
        output.setElementParameters(paraList);
        output.setComponent(targetComponent);

        DataConnection dataConnection = new DataConnection();
        dataConnection.setName(schema + "." + outTable1);
        dataConnection.setActivate(true);
        dataConnection.setLineStyle(EConnectionType.FLOW_MAIN);
        dataConnection.setTarget(output);
        IMetadataTable table = new MetadataTable();
        table.setLabel(outTable1);
        table.setTableName(outTable1);
        List<IMetadataColumn> listColumns = new ArrayList<IMetadataColumn>();
        for (String columnName : new String[] { "id", "name" }) {
            IMetadataColumn column = new MetadataColumn();
            column.setLabel(columnName);
            column.setOriginalDbColumnName(columnName);
            listColumns.add(column);
        }
        table.setListColumns(listColumns);
        dataConnection.setMetadataTable(table);
        // List<DataConnection> dataConnections = new ArrayList<>();
        outputConnections.add(dataConnection);
        outputConnections.add(connection);
        dbMapComponent.setOutgoingConnections(outputConnections);

        Process process = mock(Process.class);
        when(process.getContextManager()).thenReturn(new JobContextManager());
        dbMapComponent.setProcess(process);

        IContextParameter lookupTableContext = new JobContextParameter();
        lookupTableContext.setName("lookup");
        lookupTableContext.setValue("lookupTable");
        lookupTableContext.setType("String");
        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + outTable1);
        String expectedQuery = "\"UPDATE dbo.tar\n" + "SET tarColumn = A.id,\n" + "tarColumn1 = A.name\n"
                + "FROM\n \" +\"dbo\"+\".\"+src1+ \" A INNER JOIN  \" +\"dbo\"+\".\"+src2+ \" B " + "ON("
                + "  B.id = A.id )\"";
        assertEquals(expectedQuery, query);
    }

    public void testELTMapUpdate_ContextCase1() {
        String schema = "context.schema";
        String main_table = "src1";
        String main_alias = "";
        String lookup_table = "src2";
        String lookup_alias = "";
        String outTable1 = "tar";

        init4ELTMapUpdate(schema, main_table, main_alias, lookup_table, lookup_alias, outTable1);
        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + outTable1);
        String expectedQuery = "\"UPDATE \" +context.schema+ \".tar\n" + "SET tarColumn = A.id,\n" + "tarColumn1 = A.name\n"
                + "FROM \" +context.schema+\".\"+src1+ \" A , \" +context.schema+\".\"+src2+ \" B\n" + "WHERE\n"
                + "  B.id = A.id\"";

        assertEquals(expectedQuery, query);
    }

    @Test
    public void testELTMapUpdate_ContextCase2() {
        String schema = "context.schema";
        String main_table = "context.src1";
        String lookup_table = "src2";
        String outTable1 = "tar";
        String main_alias = "";
        String lookup_alias = "";

        init4ELTMapUpdate(schema, main_table, main_alias, lookup_table, lookup_alias, outTable1);
        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + outTable1);
        String expectedQuery = "\"UPDATE \" +context.schema+ \".tar\n" + "SET tarColumn = A.id,\n" + "tarColumn1 = A.name\n"
                + "FROM\n \" +context.schema+\".\"+context.src1+ \" A INNER JOIN  \" +context.schema+\".\"+src2+ \" B "
                + "ON(" + "  B.id = A.id )\"";

        assertEquals(expectedQuery, query);
    }

    @Test
    public void testELTMapUpdate_ContextCase3() {
        String schema = "context.schema";
        String main_table = "context.src1";
        String lookup_table = "context.src2";
        String outTable1 = "tar";
        String main_alias = "";
        String lookup_alias = "";

        init4ELTMapUpdate(schema, main_table, main_alias, lookup_table, lookup_alias, outTable1);
        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + outTable1);
        String expectedQuery = "\"UPDATE \" +context.schema+ \".tar\n" + "SET tarColumn = A.id,\n" + "tarColumn1 = A.name\n"
                + "FROM\n \" +context.schema+\".\"+context.src1+ \" A INNER JOIN  \" +context.schema+\".\"+context.src2+ \" B "
                + "ON(" + "  B.id = A.id )\"";

        assertEquals(expectedQuery, query);
    }

    @Test
    public void testELTMapUpdate_ContextCase4() {
        String schema = "context.schema";
        String main_table = "context.src1";
        String lookup_table = "context.src2";
        String outTable1 = "context.tar";
        String main_alias = "";
        String lookup_alias = "";

        init4ELTMapUpdate(schema, main_table, main_alias, lookup_table, lookup_alias, outTable1);
        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + outTable1);
        String expectedQuery = "\"UPDATE \" +context.schema+ \".\" +context.tar+ \"\n" + "SET tarColumn = A.id,\n"
                + "tarColumn1 = A.name\n"
                + "FROM\n \" +context.schema+\".\"+context.src1+ \" A INNER JOIN  \" +context.schema+\".\"+context.src2+ \" B "
                + "ON(" + "  B.id = A.id )\"";

        assertEquals(expectedQuery, query);
    }

    protected void init4ELTMapUpdate(String schema, String main_table, String main_alias, String lookup_table,
            String lookup_alias, String outTable1) {
        dbMapComponent = new DbMapComponent();

        List<IMetadataTable> metadataList = new ArrayList<IMetadataTable>();

        MetadataTable metadataTable = getMetadataTable(new String[] { "newColumn", "newColumn1" }, new String[] { "id", "name" });
        metadataTable.setLabel(schema + "." + outTable1);
        metadataList.add(metadataTable);

        dbMapComponent.setMetadataList(metadataList);

        // main table
        ExternalDbMapData externalData = new ExternalDbMapData();
        List<ExternalDbMapTable> inputs = new ArrayList<ExternalDbMapTable>();
        List<ExternalDbMapTable> outputs = new ArrayList<ExternalDbMapTable>();
        // main table
        ExternalDbMapTable inputTable = new ExternalDbMapTable();
        inputTable.setTableName(schema + "." + main_table);
        inputTable.setName(schema + "." + main_table);
        inputTable.setAlias("A");
        List<ExternalDbMapEntry> entities = getMetadataEntities(new String[] { "newColumn", "newColumn1" }, new String[2]);
        inputTable.setMetadataTableEntries(entities);
        inputs.add(inputTable);

        // lookup table
        inputTable = new ExternalDbMapTable();
        inputTable.setTableName(schema + "." + lookup_table);
        inputTable.setName(schema + "." + lookup_table);
        inputTable.setAlias("B");
        entities = getMetadataEntities(new String[] { "newColumn", "newColumn1" }, new String[2]);
        ExternalDbMapEntry newColumn = entities.get(0);
        newColumn.setExpression("A.newColumn");
        newColumn.setOperator("=");
        inputTable.setJoinType("INNER_JOIN");
        newColumn.setJoin(true);
        inputTable.setMetadataTableEntries(entities);
        inputs.add(inputTable);

        // output
        ExternalDbMapTable outputTable = new ExternalDbMapTable();
        outputTable.setName(schema + "." + outTable1);
        outputTable.setTableName(outTable1);
        String[] names = new String[] { "tarColumn", "tarColumn1" };
        String[] expressions = new String[] { "A.newColumn", "A.newColumn1" };
        outputTable.setMetadataTableEntries(getMetadataEntities(names, expressions));
        outputs.add(outputTable);

        externalData.setInputTables(inputs);
        externalData.setOutputTables(outputs);
        dbMapComponent.setExternalData(externalData);

        List<IConnection> incomingConnections = new ArrayList<IConnection>();
        incomingConnections.add(
                mockConnection(schema, main_table, new String[] { "newColumn", "newColumn1" }, new String[] { "id", "name" }));
        incomingConnections.add(
                mockConnection(schema, lookup_table, new String[] { "newColumn", "newColumn1" }, new String[] { "id", "name" }));
        dbMapComponent.setIncomingConnections(incomingConnections);

        List<IConnection> outputConnections = new ArrayList<IConnection>();
        Node map1 = mockNode(dbMapComponent);
        IConnection connection = mockConnection(map1, schema, main_table, new String[] { "id", "name" });
        targetComponent = ComponentsFactoryProvider.getInstance().get("tELTMSSqlOutput",
                ComponentCategory.CATEGORY_4_DI.getName());
        connection.getMetadataTable().getColumn("id").setLabel("newColumn");
        connection.getMetadataTable().getColumn("name").setLabel("newColumn1");
        // add target
        DataNode output = new DataNode();
        List<IElementParameter> paraList = new ArrayList<IElementParameter>();
        ElementParameter param = new ElementParameter(output);
        param.setName("USE_UPDATE_STATEMENT"); //$NON-NLS-1$
        param.setValue("true"); //$NON-NLS-1$
        paraList.add(param);
        param = new ElementParameter(output);
        param.setName("ELT_SCHEMA_NAME");
        param.setValue(schema);
        paraList.add(param);
        output.setElementParameters(paraList);
        output.setComponent(targetComponent);

        DataConnection dataConnection = new DataConnection();
        dataConnection.setName(schema + "." + outTable1);
        dataConnection.setActivate(true);
        dataConnection.setLineStyle(EConnectionType.FLOW_MAIN);
        dataConnection.setTarget(output);
        IMetadataTable table = new MetadataTable();
        table.setLabel(outTable1);
        table.setTableName(outTable1);
        List<IMetadataColumn> listColumns = new ArrayList<IMetadataColumn>();
        for (String columnName : new String[] { "id", "name" }) {
            IMetadataColumn column = new MetadataColumn();
            column.setLabel(columnName);
            column.setOriginalDbColumnName(columnName);
            listColumns.add(column);
        }
        table.setListColumns(listColumns);
        dataConnection.setMetadataTable(table);
        // List<DataConnection> dataConnections = new ArrayList<>();
        outputConnections.add(dataConnection);
        outputConnections.add(connection);
        dbMapComponent.setOutgoingConnections(outputConnections);

        Process process = mock(Process.class);
        when(process.getContextManager()).thenReturn(createTestJobContextManager());
        dbMapComponent.setProcess(process);

        IContextParameter lookupTableContext = new JobContextParameter();
        lookupTableContext.setName("lookup");
        lookupTableContext.setValue("lookupTable");
        lookupTableContext.setType("String");
    }

    private JobContextManager createTestJobContextManager() {
        JobContextManager contextManager = new JobContextManager();
        List<IContextParameter> contextParameterList = contextManager.getDefaultContext().getContextParameterList();

        // create context parameters
        IContextParameter contextParam = new JobContextParameter();
        contextParam.setName("schema");
        contextParam.setType(JavaTypesManager.getDefaultJavaType().getId());
        contextParam.setValue("schema");
        contextParameterList.add(contextParam);

        contextParam = new JobContextParameter();
        contextParam.setName("src1");
        contextParam.setType(JavaTypesManager.getDefaultJavaType().getId());
        contextParam.setValue("src1");
        contextParameterList.add(contextParam);

        contextParam = new JobContextParameter();
        contextParam.setName("src2");
        contextParam.setType(JavaTypesManager.getDefaultJavaType().getId());
        contextParam.setValue("src2");
        contextParameterList.add(contextParam);

        contextParam = new JobContextParameter();
        contextParam.setName("tar");
        contextParam.setType(JavaTypesManager.getDefaultJavaType().getId());
        contextParam.setValue("tar");
        contextParameterList.add(contextParam);

        return contextManager;
    }
    
    @Test
    public void testHandleGlobalString() {
        dbManager = new GenericDbGenerationManager();
        String quote = "\"";
        //standard 
        String[] globalStrs = {"((Integer)globalMap.get(\"G_StrtCVRGskeySCHD\"))", "((Integer)globalMap.get(\"G_EndCVRGskeySCHD\"))", "((String)globalMap.get(\"sQRY_TXT\"))"};
        String expression = "SCHD_GEN_SKEY BETWEEN ((Integer)globalMap.get(\"G_StrtCVRGskeySCHD\"))  AND ((Integer)globalMap.get(\"G_EndCVRGskeySCHD\"))  AND (   ((String)globalMap.get(\"sQRY_TXT\"))    ) AND ((Integer)globalMap.get(\"G_StrtCVRGskeySCHD\")) AND 1=1";
        String expected = "SCHD_GEN_SKEY BETWEEN \" +((Integer)globalMap.get(\"G_StrtCVRGskeySCHD\"))+ \"  AND \" +((Integer)globalMap.get(\"G_EndCVRGskeySCHD\"))+ \"  AND (   \" +((String)globalMap.get(\"sQRY_TXT\"))+ \"    ) AND \" +((Integer)globalMap.get(\"G_StrtCVRGskeySCHD\"))+ \" AND 1=1";
        for(String globalStr:globalStrs) {
            expression = dbManager.handleGlobalStringInExpression(expression, globalStr, quote, false);
        }
        assertEquals(expected ,expression);
        
        //had duplicated global string
        expression = "SCHD_GEN_SKEY BETWEEN \"+((Integer)globalMap.get(\"G_StrtCVRGskeySCHD\"))+\"  AND \"+ ((Integer)globalMap.get(\"G_EndCVRGskeySCHD\")) + \" AND (   ((String)globalMap.get(\"sQRY_TXT\"))    ) AND ((Integer)globalMap.get(\"G_StrtCVRGskeySCHD\")) AND 1=1";
        expected = "SCHD_GEN_SKEY BETWEEN \"+((Integer)globalMap.get(\"G_StrtCVRGskeySCHD\"))+\"  AND \"+ ((Integer)globalMap.get(\"G_EndCVRGskeySCHD\")) + \" AND (   \" +((String)globalMap.get(\"sQRY_TXT\"))+ \"    ) AND \" +((Integer)globalMap.get(\"G_StrtCVRGskeySCHD\"))+ \" AND 1=1";
        
        for(String globalStr:globalStrs) {
            expression = dbManager.handleGlobalStringInExpression(expression, globalStr, quote, false);
        }
        assertEquals(expected ,expression);
        
        
        // no duplicated global string
        expression = "SCHD_GEN_SKEY BETWEEN \"+((Integer)globalMap.get(\"G_StrtCVRGskeySCHD\"))+\"  AND \"+ ((Integer)globalMap.get(\"G_EndCVRGskeySCHD\")) + \" AND (   ((String)globalMap.get(\"sQRY_TXT\"))    ) AND 1=1";
        expected = "SCHD_GEN_SKEY BETWEEN \"+((Integer)globalMap.get(\"G_StrtCVRGskeySCHD\"))+\"  AND \"+ ((Integer)globalMap.get(\"G_EndCVRGskeySCHD\")) + \" AND (   \" +((String)globalMap.get(\"sQRY_TXT\"))+ \"    ) AND 1=1";
        for(String globalStr:globalStrs) {
            expression = dbManager.handleGlobalStringInExpression(expression, globalStr, quote, false);
        }
        assertEquals(expected ,expression);
        
        
        
    }

    @Test
    public void testELTMapJoinWithUpdateAndQuoteSnowflake() {
        dbManager = new GenericDbGenerationManager();
        dbManager.setAddQuotesInColumns(true);
        String schema = "dbo";
        String inputTable1 = "src1";
        String inputTable2 = "src2";
        String outTable1 = "tar";

        dbMapComponent = new DbMapComponent();

        List<IMetadataTable> metadataList = new ArrayList<IMetadataTable>();

        MetadataTable metadataTable =
                getMetadataTable(new String[] { "newColumn", "newColumn1" }, new String[] { "id", "name" });
        metadataTable.setLabel(schema + "." + outTable1);
        metadataList.add(metadataTable);

        dbMapComponent.setMetadataList(metadataList);

        // mysql
        ElementParameter paramMapping = new ElementParameter(dbMapComponent);
        paramMapping.setFieldType(EParameterFieldType.MAPPING_TYPE);
        paramMapping.setName(EParameterName.MAPPING.getName());
        paramMapping.setValue("snowflake_id");
        ((List<IElementParameter>) dbMapComponent.getElementParameters()).add(paramMapping);

        // main table
        ExternalDbMapData externalData = new ExternalDbMapData();
        List<ExternalDbMapTable> inputs = new ArrayList<ExternalDbMapTable>();
        List<ExternalDbMapTable> outputs = new ArrayList<ExternalDbMapTable>();
        // main table
        ExternalDbMapTable inputTable = new ExternalDbMapTable();
        inputTable.setTableName(schema + "." + inputTable1);
        inputTable.setName(schema + "." + inputTable1);
        inputTable.setAlias("A");
        List<ExternalDbMapEntry> entities =
                getMetadataEntities(new String[] { "newColumn", "newColumn1" }, new String[2]);
        inputTable.setMetadataTableEntries(entities);
        inputs.add(inputTable);

        // lookup table
        inputTable = new ExternalDbMapTable();
        inputTable.setTableName(schema + "." + inputTable2);
        inputTable.setName(schema + "." + inputTable2);
        inputTable.setAlias("B");
        entities = getMetadataEntities(new String[] { "newColumn", "newColumn1" }, new String[2]);
        ExternalDbMapEntry newColumn = entities.get(0);
        newColumn.setExpression("A.newColumn");
        newColumn.setOperator("=");
        newColumn.setJoin(true);
        inputTable.setMetadataTableEntries(entities);
        inputs.add(inputTable);

        // output
        ExternalDbMapTable outputTable = new ExternalDbMapTable();
        outputTable.setName(schema + "." + outTable1);
        outputTable.setTableName(schema + "." + outTable1);
        String[] names = new String[] { "tarColumn", "tarColumn1" };
        String[] expressions = new String[] { "A.newColumn", "A.newColumn1" };
        outputTable.setMetadataTableEntries(getMetadataEntities(names, expressions));
        outputs.add(outputTable);

        externalData.setInputTables(inputs);
        externalData.setOutputTables(outputs);
        dbMapComponent.setExternalData(externalData);

        List<IConnection> incomingConnections = new ArrayList<IConnection>();
        incomingConnections
                .add(mockConnection(schema, inputTable1, new String[] { "newColumn", "newColumn1" },
                        new String[] { "id", "name" }));
        incomingConnections
                .add(mockConnection(schema, inputTable2, new String[] { "newColumn", "newColumn1" },
                        new String[] { "id", "name" }));
        dbMapComponent.setIncomingConnections(incomingConnections);

        List<IConnection> outputConnections = new ArrayList<IConnection>();
        Node map1 = mockNode(dbMapComponent);
        IConnection connection = mockConnection(map1, schema, inputTable1, new String[] { "id", "name" });
        targetComponent = ComponentsFactoryProvider
                .getInstance()
                .get("tELTMsSqlOutput", ComponentCategory.CATEGORY_4_DI.getName());
        connection.getMetadataTable().getColumn("id").setLabel("newColumn");
        connection.getMetadataTable().getColumn("name").setLabel("newColumn1");
        // add target
        DataNode output = new DataNode();
        List<IElementParameter> paraList = new ArrayList<IElementParameter>();
        ElementParameter param = new ElementParameter(output);
        param.setName("USE_UPDATE_STATEMENT"); //$NON-NLS-1$
        param.setValue("true"); //$NON-NLS-1$
        paraList.add(param);
        output.setElementParameters(paraList);
        output.setComponent(targetComponent);

        DataConnection dataConnection = new DataConnection();
        dataConnection.setName(schema + "." + outTable1);
        dataConnection.setActivate(true);
        dataConnection.setLineStyle(EConnectionType.FLOW_MAIN);
        dataConnection.setTarget(output);
        IMetadataTable table = new MetadataTable();
        table.setLabel(outTable1);
        table.setTableName(outTable1);
        List<IMetadataColumn> listColumns = new ArrayList<IMetadataColumn>();
        for (String columnName : new String[] { "id", "name" }) {
            IMetadataColumn column = new MetadataColumn();
            column.setLabel(columnName);
            column.setOriginalDbColumnName(columnName);
            listColumns.add(column);
        }
        table.setListColumns(listColumns);
        dataConnection.setMetadataTable(table);
        // List<DataConnection> dataConnections = new ArrayList<>();
        outputConnections.add(dataConnection);
        outputConnections.add(connection);
        dbMapComponent.setOutgoingConnections(outputConnections);

        Process process = mock(Process.class);
        when(process.getContextManager()).thenReturn(new JobContextManager());
        dbMapComponent.setProcess(process);

        IContextParameter lookupTableContext = new JobContextParameter();
        lookupTableContext.setName("lookup");
        lookupTableContext.setValue("lookupTable");
        lookupTableContext.setType("String");
        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + outTable1);
        String expectedQuery =
                "\"UPDATE dbo.tar\n" + "SET \\\"tarColumn\\\" = A.\\\"id\\\",\n"
                        + "\\\"tarColumn1\\\" = A.\\\"name\\\"\n"
                        + "FROM\n \" +\"dbo\"+\".\"+src1+ \" A , \" +\"dbo\"+\".\"+src2+ \" B\"";

        assertEquals(expectedQuery, query);
    }

    @Test
    public void testELTMapJoinWithUpdateAndQuoteMysql() {
        dbManager = new GenericDbGenerationManager();
        dbManager.setAddQuotesInColumns(true);
        String schema = "dbo";
        String inputTable1 = "src1";
        String inputTable2 = "src2";
        String outTable1 = "tar";

        dbMapComponent = new DbMapComponent();

        List<IMetadataTable> metadataList = new ArrayList<IMetadataTable>();

        MetadataTable metadataTable =
                getMetadataTable(new String[] { "newColumn", "newColumn1" }, new String[] { "id", "name" });
        metadataTable.setLabel(schema + "." + outTable1);
        metadataList.add(metadataTable);

        dbMapComponent.setMetadataList(metadataList);

        // mysql
        ElementParameter paramMapping = new ElementParameter(dbMapComponent);
        paramMapping.setFieldType(EParameterFieldType.MAPPING_TYPE);
        paramMapping.setName(EParameterName.MAPPING.getName());
        paramMapping.setValue("mysql_id");
        ((List<IElementParameter>) dbMapComponent.getElementParameters()).add(paramMapping);

        // main table
        ExternalDbMapData externalData = new ExternalDbMapData();
        List<ExternalDbMapTable> inputs = new ArrayList<ExternalDbMapTable>();
        List<ExternalDbMapTable> outputs = new ArrayList<ExternalDbMapTable>();
        // main table
        ExternalDbMapTable inputTable = new ExternalDbMapTable();
        inputTable.setTableName(schema + "." + inputTable1);
        inputTable.setName(schema + "." + inputTable1);
        inputTable.setAlias("A");
        List<ExternalDbMapEntry> entities =
                getMetadataEntities(new String[] { "newColumn", "newColumn1" }, new String[2]);
        inputTable.setMetadataTableEntries(entities);
        inputs.add(inputTable);

        // lookup table
        inputTable = new ExternalDbMapTable();
        inputTable.setTableName(schema + "." + inputTable2);
        inputTable.setName(schema + "." + inputTable2);
        inputTable.setAlias("B");
        entities = getMetadataEntities(new String[] { "newColumn", "newColumn1" }, new String[2]);
        ExternalDbMapEntry newColumn = entities.get(0);
        newColumn.setExpression("A.newColumn");
        newColumn.setOperator("=");
        newColumn.setJoin(true);
        inputTable.setMetadataTableEntries(entities);
        inputs.add(inputTable);

        // output
        ExternalDbMapTable outputTable = new ExternalDbMapTable();
        outputTable.setName(schema + "." + outTable1);
        outputTable.setTableName(schema + "." + outTable1);
        String[] names = new String[] { "tarColumn", "tarColumn1" };
        String[] expressions = new String[] { "A.newColumn", "A.newColumn1" };
        outputTable.setMetadataTableEntries(getMetadataEntities(names, expressions));
        outputs.add(outputTable);

        externalData.setInputTables(inputs);
        externalData.setOutputTables(outputs);
        dbMapComponent.setExternalData(externalData);

        List<IConnection> incomingConnections = new ArrayList<IConnection>();
        incomingConnections
                .add(mockConnection(schema, inputTable1, new String[] { "newColumn", "newColumn1" },
                        new String[] { "id", "name" }));
        incomingConnections
                .add(mockConnection(schema, inputTable2, new String[] { "newColumn", "newColumn1" },
                        new String[] { "id", "name" }));
        dbMapComponent.setIncomingConnections(incomingConnections);

        List<IConnection> outputConnections = new ArrayList<IConnection>();
        Node map1 = mockNode(dbMapComponent);
        IConnection connection = mockConnection(map1, schema, inputTable1, new String[] { "id", "name" });
        targetComponent = ComponentsFactoryProvider
                .getInstance()
                .get("tELTMsSqlOutput", ComponentCategory.CATEGORY_4_DI.getName());
        connection.getMetadataTable().getColumn("id").setLabel("newColumn");
        connection.getMetadataTable().getColumn("name").setLabel("newColumn1");
        // add target
        DataNode output = new DataNode();
        List<IElementParameter> paraList = new ArrayList<IElementParameter>();
        ElementParameter param = new ElementParameter(output);
        param.setName("USE_UPDATE_STATEMENT"); //$NON-NLS-1$
        param.setValue("true"); //$NON-NLS-1$
        paraList.add(param);
        output.setElementParameters(paraList);
        output.setComponent(targetComponent);

        DataConnection dataConnection = new DataConnection();
        dataConnection.setName(schema + "." + outTable1);
        dataConnection.setActivate(true);
        dataConnection.setLineStyle(EConnectionType.FLOW_MAIN);
        dataConnection.setTarget(output);
        IMetadataTable table = new MetadataTable();
        table.setLabel(outTable1);
        table.setTableName(outTable1);
        List<IMetadataColumn> listColumns = new ArrayList<IMetadataColumn>();
        for (String columnName : new String[] { "id", "name" }) {
            IMetadataColumn column = new MetadataColumn();
            column.setLabel(columnName);
            column.setOriginalDbColumnName(columnName);
            listColumns.add(column);
        }
        table.setListColumns(listColumns);
        dataConnection.setMetadataTable(table);
        // List<DataConnection> dataConnections = new ArrayList<>();
        outputConnections.add(dataConnection);
        outputConnections.add(connection);
        dbMapComponent.setOutgoingConnections(outputConnections);

        Process process = mock(Process.class);
        when(process.getContextManager()).thenReturn(new JobContextManager());
        dbMapComponent.setProcess(process);

        IContextParameter lookupTableContext = new JobContextParameter();
        lookupTableContext.setName("lookup");
        lookupTableContext.setValue("lookupTable");
        lookupTableContext.setType("String");
        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + outTable1);
        String expectedQuery = "\"UPDATE dbo.tar\n" + "SET `tarColumn` = A.`id`,\n" + "`tarColumn1` = A.`name`\n"
                + "FROM\n \" +\"dbo\"+\".\"+src1+ \" A , \" +\"dbo\"+\".\"+src2+ \" B\"";

        assertEquals(expectedQuery, query);
    }

    private void initTestParams(String schema, String inputTable1, String alias1, String inputTable2, String alias2,
            String targetTable, boolean addQuotesInTableNames, String joinType, boolean isUpdate, String dbType) {
        dbManager = new GenericDbGenerationManager();
        dbManager.setAddQuotesInColumns(false);
        dbManager.setAddQuotesInTableNames(addQuotesInTableNames);
        dbMapComponent = new DbMapComponent();

        List<IMetadataTable> metadataList = new ArrayList<IMetadataTable>();

        MetadataTable metadataTable =
                getMetadataTable(new String[] { "newColumn", "newColumn1" }, new String[] { "id", "name" });
        metadataTable.setLabel(StringUtils.isNotBlank(schema) ? schema + "." + targetTable : schema);
        metadataList.add(metadataTable);

        dbMapComponent.setMetadataList(metadataList);

        // oracle
        ElementParameter paramMapping = new ElementParameter(dbMapComponent);
        paramMapping.setFieldType(EParameterFieldType.MAPPING_TYPE);
        paramMapping.setName(EParameterName.MAPPING.getName());
        paramMapping.setValue(dbType);
        ((List<IElementParameter>) dbMapComponent.getElementParameters()).add(paramMapping);

        // main table
        ExternalDbMapData externalData = new ExternalDbMapData();
        List<ExternalDbMapTable> inputs = new ArrayList<ExternalDbMapTable>();
        List<ExternalDbMapTable> outputs = new ArrayList<ExternalDbMapTable>();
        // main table
        ExternalDbMapTable inputTable = new ExternalDbMapTable();
        inputTable.setTableName(StringUtils.isNotBlank(schema) ? schema + "." + inputTable1 : inputTable1);
        inputTable.setName(StringUtils.isNotBlank(schema) ? schema + "." + inputTable1 : inputTable1);
        if (StringUtils.isNotBlank(alias1)) {
            inputTable.setAlias(alias1);
        }
        List<ExternalDbMapEntry> entities =
                getMetadataEntities(new String[] { "newColumn", "newColumn1" }, new String[2]);
        inputTable.setMetadataTableEntries(entities);
        inputs.add(inputTable);

        // lookup table
        ExternalDbMapTable lookupTable = new ExternalDbMapTable();
        lookupTable.setTableName(StringUtils.isNotBlank(schema) ? schema + "." + inputTable2 : inputTable2);
        lookupTable.setName(StringUtils.isNotBlank(schema) ? schema + "." + inputTable2 : inputTable2);
        if (StringUtils.isNotBlank(alias2)) {
            lookupTable.setAlias(alias2);
        }
        entities = getMetadataEntities(new String[] { "newColumn", "newColumn1" }, new String[2]);
        ExternalDbMapEntry newColumn = entities.get(0);
        newColumn
                .setExpression(StringUtils.isNotBlank(alias1) ? alias1 + ".newColumn"
                        : inputTable.getTableName() + ".newColumn");
        newColumn.setOperator("=");
        newColumn.setJoin("NO_JOIN".equals(joinType) ? false : true);
        lookupTable.setJoinType(joinType);

        lookupTable.setMetadataTableEntries(entities);
        inputs.add(lookupTable);

        // output
        ExternalDbMapTable outputTable = new ExternalDbMapTable();
        outputTable.setName(StringUtils.isNotBlank(schema) ? schema + "." + targetTable : targetTable);
        outputTable.setTableName(targetTable);
        String[] names = new String[] { "tarColumn", "tarColumn1" };
        String outputExpression1 =
                StringUtils.isNotBlank(alias1) ? alias1 + ".newColumn" : inputTable.getName() + ".newColumn";
        String outputExpression2 =
                StringUtils.isNotBlank(alias2) ? alias2 + ".newColumn1" : lookupTable.getName() + ".newColumn1";
        String[] expressions = new String[] { outputExpression1, outputExpression2 };
        outputTable.setMetadataTableEntries(getMetadataEntities(names, expressions));
        outputs.add(outputTable);

        externalData.setInputTables(inputs);
        externalData.setOutputTables(outputs);
        dbMapComponent.setExternalData(externalData);

        List<IConnection> incomingConnections = new ArrayList<IConnection>();
        incomingConnections
                .add(mockConnection(schema, inputTable1, targetTable, new String[] { "newColumn", "newColumn1" },
                        new String[] { "id", "name" }));
        incomingConnections
                .add(mockConnection(schema, inputTable2, targetTable, new String[] { "newColumn", "newColumn1" },
                        new String[] { "id", "name" }));
        dbMapComponent.setIncomingConnections(incomingConnections);

        List<IConnection> outputConnections = new ArrayList<IConnection>();
        Node map1 = mockNode(dbMapComponent);
        IConnection connection = mockConnection(map1, schema, inputTable1, new String[] { "id", "name" });
        IComponent targetComponent =
                ComponentsFactoryProvider.getInstance().get("tELTOutput", ComponentCategory.CATEGORY_4_DI.getName());
        connection.getMetadataTable().getColumn("id").setLabel("newColumn");
        connection.getMetadataTable().getColumn("name").setLabel("newColumn1");
        // add target
        DataNode output = new DataNode();
        List<IElementParameter> paraList = new ArrayList<IElementParameter>();
        ElementParameter param = new ElementParameter(output);
        param.setName("USE_UPDATE_STATEMENT"); //$NON-NLS-1$
        param.setValue(String.valueOf(isUpdate)); // $NON-NLS-1$
        paraList.add(param);
        if (StringUtils.isNotBlank(schema)) {
            param = new ElementParameter(output);
            param.setName("ELT_SCHEMA_NAME");
            param.setValue(schema);
            paraList.add(param);
        }
        output.setElementParameters(paraList);
        output.setComponent(targetComponent);

        DataConnection dataConnection = new DataConnection();
        dataConnection.setName(StringUtils.isNotBlank(schema) ? schema + "." + targetTable : targetTable);
        dataConnection.setActivate(true);
        dataConnection.setLineStyle(EConnectionType.FLOW_MAIN);
        dataConnection.setTarget(output);
        IMetadataTable table = new MetadataTable();
        table.setLabel(targetTable);
        table.setTableName(targetTable);
        List<IMetadataColumn> listColumns = new ArrayList<IMetadataColumn>();
        for (String columnName : new String[] { "id", "name" }) {
            IMetadataColumn column = new MetadataColumn();
            column.setLabel(columnName);
            column.setOriginalDbColumnName(columnName);
            listColumns.add(column);
        }
        table.setListColumns(listColumns);
        dataConnection.setMetadataTable(table);
        // List<DataConnection> dataConnections = new ArrayList<>();
        outputConnections.add(dataConnection);
        outputConnections.add(connection);
        dbMapComponent.setOutgoingConnections(outputConnections);

        JobContext newContext = new JobContext("Default");
        List<IContextParameter> newParamList = new ArrayList<IContextParameter>();
        newContext.setContextParameterList(newParamList);
        JobContextParameter cparam = new JobContextParameter();
        cparam.setName("schema");
        cparam.setValue("dbo");
        newParamList.add(cparam);
        cparam = new JobContextParameter();
        cparam.setName("input1");
        cparam.setValue("src1");
        newParamList.add(cparam);
        cparam = new JobContextParameter();
        cparam.setName("input2");
        cparam.setValue("src2");
        newParamList.add(cparam);
        cparam = new JobContextParameter();
        cparam.setName("target");
        cparam.setValue("tar");
        newParamList.add(cparam);

        JobContextManager contextManger = new JobContextManager();
        contextManger.setDefaultContext(newContext);
        Process process = mock(Process.class);
        when(process.getContextManager()).thenReturn(contextManger);
        dbMapComponent.setProcess(process);

        IContextParameter lookupTableContext = new JobContextParameter();
        lookupTableContext.setName("lookup");
        lookupTableContext.setValue("lookupTable");
        lookupTableContext.setType("String");
    }

    @Test
    public void testELTMapJoinWithUpdateAndTableNameQuoteOracleWithAliasNoJoin() {
        String schema = "dbo";
        String inputTable1 = "src1";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "src2";
        String alias2 = "B";
        boolean addQuotesInTableNames = true;
        String joinType = "NO_JOIN";
        boolean isUpdate = true;
        String dbType = "oracle_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);
        String expectedQuery = "\"UPDATE \\\"dbo\\\".\\\"tar\\\"\n" + "SET tarColumn = \\\"A\\\".id,\n"
                + "tarColumn1 = \\\"B\\\".name\n"
                + "FROM\n \" +\"\\\"dbo\\\"\"+\".\"+\"\\\"src1\\\"\"+ \" \\\"A\\\" , \" +\"\\\"dbo\\\"\"+\".\"+\"\\\"src2\\\"\"+ \" \\\"B\\\"\nWHERE\n  \\\"B\\\".id = \\\"A\\\".id\"";

        assertEquals(expectedQuery, query);
    }

    @Test
    public void testELTMapJoinWithUpdateAndTableNameQuoteOracleWithAliasInnerJoin() {
        String schema = "dbo";
        String inputTable1 = "src1";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "src2";
        String alias2 = "B";
        boolean addQuotesInTableNames = true;
        String joinType = "INNER_JOIN";
        boolean isUpdate = true;
        String dbType = "oracle_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);
        String expectedQuery = "\"UPDATE \\\"dbo\\\".\\\"tar\\\"\n" + "SET tarColumn = \\\"A\\\".id,\n"
                + "tarColumn1 = \\\"B\\\".name\n"
                + "FROM\n \" +\"\\\"dbo\\\"\"+\".\"+\"\\\"src1\\\"\"+ \" \\\"A\\\" INNER JOIN  \" +\"\\\"dbo\\\"\"+\".\"+\"\\\"src2\\\"\"+ \" \\\"B\\\" ON(  \\\"B\\\".id = \\\"A\\\".id )\"";

        assertEquals(expectedQuery, query);
    }

    @Test
    public void testELTMapJoinWithUpdateAndTableNameQuoteOracleWithAliasLeftOutterJoin() {
        String schema = "dbo";
        String inputTable1 = "src1";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "src2";
        String alias2 = "B";
        boolean addQuotesInTableNames = true;
        String joinType = "LEFT_OUTER_JOIN";
        boolean isUpdate = true;
        String dbType = "oracle_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);
        String expectedQuery = "\"UPDATE \\\"dbo\\\".\\\"tar\\\"\n" + "SET tarColumn = \\\"A\\\".id,\n"
                + "tarColumn1 = \\\"B\\\".name\n"
                + "FROM\n \" +\"\\\"dbo\\\"\"+\".\"+\"\\\"src1\\\"\"+ \" \\\"A\\\" LEFT OUTER JOIN  \" +\"\\\"dbo\\\"\"+\".\"+\"\\\"src2\\\"\"+ \" \\\"B\\\" ON(  \\\"B\\\".id = \\\"A\\\".id )\"";

        assertEquals(expectedQuery, query);
    }

    @Test
    public void testELTMapJoinWithUpdateAndTableNameQuoteOracleWithAliasRightOutterJoin() {
        String schema = "dbo";
        String inputTable1 = "src1";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "src2";
        String alias2 = "B";
        boolean addQuotesInTableNames = true;
        String joinType = "RIGHT_OUTER_JOIN";
        boolean isUpdate = true;
        String dbType = "oracle_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);
        String expectedQuery = "\"UPDATE \\\"dbo\\\".\\\"tar\\\"\n" + "SET tarColumn = \\\"A\\\".id,\n"
                + "tarColumn1 = \\\"B\\\".name\n"
                + "FROM\n \" +\"\\\"dbo\\\"\"+\".\"+\"\\\"src1\\\"\"+ \" \\\"A\\\" RIGHT OUTER JOIN  \" +\"\\\"dbo\\\"\"+\".\"+\"\\\"src2\\\"\"+ \" \\\"B\\\" ON(  \\\"B\\\".id = \\\"A\\\".id )\"";

        assertEquals(expectedQuery, query);
    }

    @Test
    public void testELTMapJoinWithUpdateAndTableNameQuoteOracleWithAliasFullOutterJoin() {
        String schema = "dbo";
        String inputTable1 = "src1";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "src2";
        String alias2 = "B";
        boolean addQuotesInTableNames = true;
        String joinType = "FULL_OUTER_JOIN";
        boolean isUpdate = true;
        String dbType = "oracle_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);
        String expectedQuery = "\"UPDATE \\\"dbo\\\".\\\"tar\\\"\n" + "SET tarColumn = \\\"A\\\".id,\n"
                + "tarColumn1 = \\\"B\\\".name\n"
                + "FROM\n \" +\"\\\"dbo\\\"\"+\".\"+\"\\\"src1\\\"\"+ \" \\\"A\\\" FULL OUTER JOIN  \" +\"\\\"dbo\\\"\"+\".\"+\"\\\"src2\\\"\"+ \" \\\"B\\\" ON(  \\\"B\\\".id = \\\"A\\\".id )\"";

        assertEquals(expectedQuery, query);
    }

    @Test
    public void testELTMapJoinWithUpdateAndTableNameQuoteOracleWithAliasCrossJoin() {
        String schema = "dbo";
        String inputTable1 = "src1";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "src2";
        String alias2 = "B";
        boolean addQuotesInTableNames = true;
        String joinType = "CROSS_JOIN";
        boolean isUpdate = true;
        String dbType = "oracle_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);
        String expectedQuery = "\"UPDATE \\\"dbo\\\".\\\"tar\\\"\n" + "SET tarColumn = \\\"A\\\".id,\n"
                + "tarColumn1 = \\\"B\\\".name\n"
                + "FROM\n \" +\"\\\"dbo\\\"\"+\".\"+\"\\\"src1\\\"\"+ \" \\\"A\\\" CROSS JOIN  \n\" +\"\\\"dbo\\\"\"+\".\"+\"\\\"src2\\\"\"+ \" \\\"B\\\"\nWHERE\n  \\\"B\\\".id = \\\"A\\\".id\"";

        assertEquals(expectedQuery, query);
    }

    @Test
    public void testELTMapJoinWithUpdateAndTableNameQuoteMysqlWithAliasNoJoin() {
        String schema = "dbo";
        String inputTable1 = "src1";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "src2";
        String alias2 = "B";
        boolean addQuotesInTableNames = true;
        String joinType = "NO_JOIN";
        boolean isUpdate = true;
        String dbType = "mysql_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);
        String expectedQuery = "\"UPDATE `dbo`.`tar`\n" + "SET tarColumn = `A`.id,\n" + "tarColumn1 = `B`.name\n"
                + "FROM\n \" +\"`dbo`\"+\".\"+\"`src1`\"+ \" `A` , \" +\"`dbo`\"+\".\"+\"`src2`\"+ \" `B`\nWHERE\n  `B`.id = `A`.id\"";

        assertEquals(expectedQuery, query);
    }

    @Test
    public void testELTMapJoinWithUpdateAndTableNameQuoteMysqlWithAliasInnerJoin() {
        String schema = "dbo";
        String inputTable1 = "src1";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "src2";
        String alias2 = "B";
        boolean addQuotesInTableNames = true;
        String joinType = "INNER_JOIN";
        boolean isUpdate = true;
        String dbType = "mysql_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);
        String expectedQuery = "\"UPDATE `dbo`.`tar`\n" + "SET tarColumn = `A`.id,\n" + "tarColumn1 = `B`.name\n"
                + "FROM\n \" +\"`dbo`\"+\".\"+\"`src1`\"+ \" `A` INNER JOIN  \" +\"`dbo`\"+\".\"+\"`src2`\"+ \" `B` ON(  `B`.id = `A`.id )\"";

        assertEquals(expectedQuery, query);
    }

    @Test
    public void testELTMapJoinWithUpdateAndTableNameQuoteMysqlWithAliasLeftOutterJoin() {
        String schema = "dbo";
        String inputTable1 = "src1";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "src2";
        String alias2 = "B";
        boolean addQuotesInTableNames = true;
        String joinType = "LEFT_OUTER_JOIN";
        boolean isUpdate = true;
        String dbType = "mysql_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);
        String expectedQuery = "\"UPDATE `dbo`.`tar`\n" + "SET tarColumn = `A`.id,\n" + "tarColumn1 = `B`.name\n"
                + "FROM\n \" +\"`dbo`\"+\".\"+\"`src1`\"+ \" `A` LEFT OUTER JOIN  \" +\"`dbo`\"+\".\"+\"`src2`\"+ \" `B` ON(  `B`.id = `A`.id )\"";

        assertEquals(expectedQuery, query);
    }

    @Test
    public void testELTMapJoinWithUpdateAndTableNameQuoteMysqlWithAliasRightOutterJoin() {
        String schema = "dbo";
        String inputTable1 = "src1";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "src2";
        String alias2 = "B";
        boolean addQuotesInTableNames = true;
        String joinType = "RIGHT_OUTER_JOIN";
        boolean isUpdate = true;
        String dbType = "mysql_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);
        String expectedQuery = "\"UPDATE `dbo`.`tar`\n" + "SET tarColumn = `A`.id,\n" + "tarColumn1 = `B`.name\n"
                + "FROM\n \" +\"`dbo`\"+\".\"+\"`src1`\"+ \" `A` RIGHT OUTER JOIN  \" +\"`dbo`\"+\".\"+\"`src2`\"+ \" `B` ON(  `B`.id = `A`.id )\"";

        assertEquals(expectedQuery, query);
    }

    @Test
    public void testELTMapJoinWithUpdateAndTableNameQuoteMysqlWithAliasFullOutterJoin() {
        String schema = "dbo";
        String inputTable1 = "src1";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "src2";
        String alias2 = "B";
        boolean addQuotesInTableNames = true;
        String joinType = "FULL_OUTER_JOIN";
        boolean isUpdate = true;
        String dbType = "mysql_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);
        String expectedQuery = "\"UPDATE `dbo`.`tar`\n" + "SET tarColumn = `A`.id,\n" + "tarColumn1 = `B`.name\n"
                + "FROM\n \" +\"`dbo`\"+\".\"+\"`src1`\"+ \" `A` FULL OUTER JOIN  \" +\"`dbo`\"+\".\"+\"`src2`\"+ \" `B` ON(  `B`.id = `A`.id )\"";

        assertEquals(expectedQuery, query);
    }

    @Test
    public void testELTMapJoinWithUpdateAndTableNameQuoteMysqlWithAliasCrossJoin() {
        String schema = "dbo";
        String inputTable1 = "src1";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "src2";
        String alias2 = "B";
        boolean addQuotesInTableNames = true;
        String joinType = "CROSS_JOIN";
        boolean isUpdate = true;
        String dbType = "mysql_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);
        String expectedQuery = "\"UPDATE `dbo`.`tar`\n" + "SET tarColumn = `A`.id,\n" + "tarColumn1 = `B`.name\n"
                + "FROM\n \" +\"`dbo`\"+\".\"+\"`src1`\"+ \" `A` CROSS JOIN  \n\" +\"`dbo`\"+\".\"+\"`src2`\"+ \" `B`\nWHERE\n  `B`.id = `A`.id\"";

        assertEquals(expectedQuery, query);
    }

    @Test
    public void testELTMapJoinWithUpdateAndTableNameQuoteSnowflakeWithAliasNoJoin() {
        String schema = "dbo";
        String inputTable1 = "src1";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "src2";
        String alias2 = "B";
        boolean addQuotesInTableNames = true;
        String joinType = "NO_JOIN";
        boolean isUpdate = true;
        String dbType = "snowflake_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);
        String expectedQuery = "\"UPDATE \\\"dbo\\\".\\\"tar\\\"\n" + "SET tarColumn = \\\"A\\\".id,\n"
                + "tarColumn1 = \\\"B\\\".name\n"
                + "FROM\n \" +\"\\\"dbo\\\"\"+\".\"+\"\\\"src1\\\"\"+ \" \\\"A\\\" , \" +\"\\\"dbo\\\"\"+\".\"+\"\\\"src2\\\"\"+ \" \\\"B\\\""
                + "\nWHERE\n  \\\"B\\\".id = \\\"A\\\".id\"";

        assertEquals(expectedQuery, query);
    }

    @Test
    public void testELTMapJoinWithUpdateAndTableNameQuoteSnowflakeWithAliasInnerJoin() {
        String schema = "dbo";
        String inputTable1 = "src1";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "src2";
        String alias2 = "B";
        boolean addQuotesInTableNames = true;
        String joinType = "INNER_JOIN";
        boolean isUpdate = true;
        String dbType = "snowflake_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);
        String expectedQuery = "\"UPDATE \\\"dbo\\\".\\\"tar\\\"\n" + "SET tarColumn = \\\"A\\\".id,\n"
                + "tarColumn1 = \\\"B\\\".name\n"
                + "FROM\n \" +\"\\\"dbo\\\"\"+\".\"+\"\\\"src1\\\"\"+ \" \\\"A\\\" INNER JOIN  \" +\"\\\"dbo\\\"\"+\".\"+\"\\\"src2\\\"\"+ \" \\\"B\\\" ON(  \\\"B\\\".id = \\\"A\\\".id )\"";

        assertEquals(expectedQuery, query);
    }

    @Test
    public void testELTMapJoinWithUpdateAndTableNameQuoteSnowflakeWithAliasLeftOutterJoin() {
        String schema = "dbo";
        String inputTable1 = "src1";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "src2";
        String alias2 = "B";
        boolean addQuotesInTableNames = true;
        String joinType = "LEFT_OUTER_JOIN";
        boolean isUpdate = true;
        String dbType = "snowflake_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);
        String expectedQuery = "\"UPDATE \\\"dbo\\\".\\\"tar\\\"\n" + "SET tarColumn = \\\"A\\\".id,\n"
                + "tarColumn1 = \\\"B\\\".name\n"
                + "FROM\n \" +\"\\\"dbo\\\"\"+\".\"+\"\\\"src1\\\"\"+ \" \\\"A\\\" LEFT OUTER JOIN  \" +\"\\\"dbo\\\"\"+\".\"+\"\\\"src2\\\"\"+ \" \\\"B\\\" ON(  \\\"B\\\".id = \\\"A\\\".id )\"";

        assertEquals(expectedQuery, query);
    }

    @Test
    public void testELTMapJoinWithUpdateAndTableNameQuoteSnowflakeWithAliasRightOutterJoin() {
        String schema = "dbo";
        String inputTable1 = "src1";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "src2";
        String alias2 = "B";
        boolean addQuotesInTableNames = true;
        String joinType = "RIGHT_OUTER_JOIN";
        boolean isUpdate = true;
        String dbType = "snowflake_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);
        String expectedQuery = "\"UPDATE \\\"dbo\\\".\\\"tar\\\"\n" + "SET tarColumn = \\\"A\\\".id,\n"
                + "tarColumn1 = \\\"B\\\".name\n"
                + "FROM\n \" +\"\\\"dbo\\\"\"+\".\"+\"\\\"src1\\\"\"+ \" \\\"A\\\" RIGHT OUTER JOIN  \" +\"\\\"dbo\\\"\"+\".\"+\"\\\"src2\\\"\"+ \" \\\"B\\\" ON(  \\\"B\\\".id = \\\"A\\\".id )\"";

        assertEquals(expectedQuery, query);
    }

    @Test
    public void testELTMapJoinWithUpdateAndTableNameQuoteSnowflakeWithAliasFullOutterJoin() {
        String schema = "dbo";
        String inputTable1 = "src1";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "src2";
        String alias2 = "B";
        boolean addQuotesInTableNames = true;
        String joinType = "FULL_OUTER_JOIN";
        boolean isUpdate = true;
        String dbType = "snowflake_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);
        String expectedQuery = "\"UPDATE \\\"dbo\\\".\\\"tar\\\"\n" + "SET tarColumn = \\\"A\\\".id,\n"
                + "tarColumn1 = \\\"B\\\".name\n"
                + "FROM\n \" +\"\\\"dbo\\\"\"+\".\"+\"\\\"src1\\\"\"+ \" \\\"A\\\" FULL OUTER JOIN  \" +\"\\\"dbo\\\"\"+\".\"+\"\\\"src2\\\"\"+ \" \\\"B\\\" ON(  \\\"B\\\".id = \\\"A\\\".id )\"";

        assertEquals(expectedQuery, query);
    }

    @Test
    public void testELTMapJoinWithUpdateAndTableNameQuoteSnowflakeWithAliasCrossJoin() {
        String schema = "dbo";
        String inputTable1 = "src1";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "src2";
        String alias2 = "B";
        boolean addQuotesInTableNames = true;
        String joinType = "CROSS_JOIN";
        boolean isUpdate = true;
        String dbType = "snowflake_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);
        String expectedQuery = "\"UPDATE \\\"dbo\\\".\\\"tar\\\"\n" + "SET tarColumn = \\\"A\\\".id,\n"
                + "tarColumn1 = \\\"B\\\".name\n"
                + "FROM\n \" +\"\\\"dbo\\\"\"+\".\"+\"\\\"src1\\\"\"+ \" \\\"A\\\" CROSS JOIN  \n\" +\"\\\"dbo\\\"\"+\".\"+\"\\\"src2\\\"\"+ \" \\\"B\\\"\nWHERE\n  \\\"B\\\".id = \\\"A\\\".id\"";

        assertEquals(expectedQuery, query);
    }

    @Test
    public void testELTMapJoinWithUpdateAndTableNameQuoteOracleWithoutAliasNoJoin() {
        String schema = "dbo";
        String inputTable1 = "src1";
        String alias1 = "";
        String targetTable = "tar";
        String inputTable2 = "src2";
        String alias2 = "";
        boolean addQuotesInTableNames = true;
        String joinType = "NO_JOIN";
        boolean isUpdate = true;
        String dbType = "oracle_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);
        String expectedQuery = "\"UPDATE \\\"dbo\\\".\\\"tar\\\"\n" + "SET tarColumn = \\\"dbo\\\".\\\"src1\\\".id,\n"
                + "tarColumn1 = \\\"dbo\\\".\\\"src2\\\".name\n"
                + "FROM\n \\\"dbo\\\".\\\"src1\\\" , \\\"dbo\\\".\\\"src2\\\"\nWHERE\n  \\\"dbo\\\".\\\"src2\\\".id = \\\"dbo\\\".\\\"src1\\\".id\"";

        assertEquals(expectedQuery, query);
    }

    @Test
    public void testELTMapJoinWithUpdateAndTableNameQuoteOracleWithoutAliasInnerJoin() {
        String schema = "dbo";
        String inputTable1 = "src1";
        String alias1 = "";
        String targetTable = "tar";
        String inputTable2 = "src2";
        String alias2 = "";
        boolean addQuotesInTableNames = true;
        String joinType = "INNER_JOIN";
        boolean isUpdate = true;
        String dbType = "oracle_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);
        String expectedQuery = "\"UPDATE \\\"dbo\\\".\\\"tar\\\"\n" + "SET tarColumn = \\\"dbo\\\".\\\"src1\\\".id,\n"
                + "tarColumn1 = \\\"dbo\\\".\\\"src2\\\".name\n"
                + "FROM\n \\\"dbo\\\".\\\"src1\\\" INNER JOIN  \\\"dbo\\\".\\\"src2\\\" ON(  \\\"dbo\\\".\\\"src2\\\".id = \\\"dbo\\\".\\\"src1\\\".id )\"";
        assertEquals(expectedQuery, query);
    }

    @Test
    public void testELTMapJoinWithUpdateAndTableNameQuoteOracleWithoutAliasLeftOuterJoin() {
        String schema = "dbo";
        String inputTable1 = "src1";
        String alias1 = "";
        String targetTable = "tar";
        String inputTable2 = "src2";
        String alias2 = "";
        boolean addQuotesInTableNames = true;
        String joinType = "LEFT_OUTER_JOIN";
        boolean isUpdate = true;
        String dbType = "oracle_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);
        String expectedQuery = "\"UPDATE \\\"dbo\\\".\\\"tar\\\"\n" + "SET tarColumn = \\\"dbo\\\".\\\"src1\\\".id,\n"
                + "tarColumn1 = \\\"dbo\\\".\\\"src2\\\".name\n"
                + "FROM\n \\\"dbo\\\".\\\"src1\\\" LEFT OUTER JOIN  \\\"dbo\\\".\\\"src2\\\" ON(  \\\"dbo\\\".\\\"src2\\\".id = \\\"dbo\\\".\\\"src1\\\".id )\"";
        assertEquals(expectedQuery, query);
    }

    @Test
    public void testELTMapJoinWithUpdateAndTableNameQuoteOracleWithoutAliasRightOuterJoin() {
        String schema = "dbo";
        String inputTable1 = "src1";
        String alias1 = "";
        String targetTable = "tar";
        String inputTable2 = "src2";
        String alias2 = "";
        boolean addQuotesInTableNames = true;
        String joinType = "RIGHT_OUTER_JOIN";
        boolean isUpdate = true;
        String dbType = "oracle_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);
        String expectedQuery = "\"UPDATE \\\"dbo\\\".\\\"tar\\\"\n" + "SET tarColumn = \\\"dbo\\\".\\\"src1\\\".id,\n"
                + "tarColumn1 = \\\"dbo\\\".\\\"src2\\\".name\n"
                + "FROM\n \\\"dbo\\\".\\\"src1\\\" RIGHT OUTER JOIN  \\\"dbo\\\".\\\"src2\\\" ON(  \\\"dbo\\\".\\\"src2\\\".id = \\\"dbo\\\".\\\"src1\\\".id )\"";
        assertEquals(expectedQuery, query);
    }

    @Test
    public void testELTMapJoinWithUpdateAndTableNameQuoteOracleWithoutAliasFullOuterJoin() {
        String schema = "dbo";
        String inputTable1 = "src1";
        String alias1 = "";
        String targetTable = "tar";
        String inputTable2 = "src2";
        String alias2 = "";
        boolean addQuotesInTableNames = true;
        String joinType = "FULL_OUTER_JOIN";
        boolean isUpdate = true;
        String dbType = "oracle_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);
        String expectedQuery = "\"UPDATE \\\"dbo\\\".\\\"tar\\\"\n" + "SET tarColumn = \\\"dbo\\\".\\\"src1\\\".id,\n"
                + "tarColumn1 = \\\"dbo\\\".\\\"src2\\\".name\n"
                + "FROM\n \\\"dbo\\\".\\\"src1\\\" FULL OUTER JOIN  \\\"dbo\\\".\\\"src2\\\" ON(  \\\"dbo\\\".\\\"src2\\\".id = \\\"dbo\\\".\\\"src1\\\".id )\"";
        assertEquals(expectedQuery, query);
    }

    @Test
    public void testELTMapJoinWithUpdateAndTableNameQuoteOracleWithoutAliasCrossJoin() {
        String schema = "dbo";
        String inputTable1 = "src1";
        String alias1 = "";
        String targetTable = "tar";
        String inputTable2 = "src2";
        String alias2 = "";
        boolean addQuotesInTableNames = true;
        String joinType = "CROSS_JOIN";
        boolean isUpdate = true;
        String dbType = "oracle_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);
        String expectedQuery = "\"UPDATE \\\"dbo\\\".\\\"tar\\\"\n" + "SET tarColumn = \\\"dbo\\\".\\\"src1\\\".id,\n"
                + "tarColumn1 = \\\"dbo\\\".\\\"src2\\\".name\n"
                + "FROM\n \\\"dbo\\\".\\\"src1\\\" CROSS JOIN  \n\\\"dbo\\\".\\\"src2\\\"\nWHERE\n  \\\"dbo\\\".\\\"src2\\\".id = \\\"dbo\\\".\\\"src1\\\".id\"";
        assertEquals(expectedQuery, query);
    }

    @Test
    public void testELTMapJoinWithUpdateAndTableNameQuoteMysqlWithoutAliasNoJoin() {
        String schema = "dbo";
        String inputTable1 = "src1";
        String alias1 = "";
        String targetTable = "tar";
        String inputTable2 = "src2";
        String alias2 = "";
        boolean addQuotesInTableNames = true;
        String joinType = "NO_JOIN";
        boolean isUpdate = true;
        String dbType = "mysql_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);
        String expectedQuery = "\"UPDATE `dbo`.`tar`\n" + "SET tarColumn = `dbo`.`src1`.id,\n"
                + "tarColumn1 = `dbo`.`src2`.name\n"
                + "FROM\n `dbo`.`src1` , `dbo`.`src2`\nWHERE\n  `dbo`.`src2`.id = `dbo`.`src1`.id\"";

        assertEquals(expectedQuery, query);
    }

    @Test
    public void testELTMapJoinWithUpdateAndTableNameQuoteMysqlWithoutAliasInnerJoin() {
        String schema = "dbo";
        String inputTable1 = "src1";
        String alias1 = "";
        String targetTable = "tar";
        String inputTable2 = "src2";
        String alias2 = "";
        boolean addQuotesInTableNames = true;
        String joinType = "INNER_JOIN";
        boolean isUpdate = true;
        String dbType = "mysql_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);
        String expectedQuery =
                "\"UPDATE `dbo`.`tar`\n" + "SET tarColumn = `dbo`.`src1`.id,\n" + "tarColumn1 = `dbo`.`src2`.name\n"
                        + "FROM\n `dbo`.`src1` INNER JOIN  `dbo`.`src2` ON(  `dbo`.`src2`.id = `dbo`.`src1`.id )\"";
        assertEquals(expectedQuery, query);
    }

    @Test
    public void testELTMapJoinWithUpdateAndTableNameQuoteMysqlWithoutAliasLeftOuterJoin() {
        String schema = "dbo";
        String inputTable1 = "src1";
        String alias1 = "";
        String targetTable = "tar";
        String inputTable2 = "src2";
        String alias2 = "";
        boolean addQuotesInTableNames = true;
        String joinType = "LEFT_OUTER_JOIN";
        boolean isUpdate = true;
        String dbType = "mysql_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);
        String expectedQuery = "\"UPDATE `dbo`.`tar`\n" + "SET tarColumn = `dbo`.`src1`.id,\n"
                + "tarColumn1 = `dbo`.`src2`.name\n"
                + "FROM\n `dbo`.`src1` LEFT OUTER JOIN  `dbo`.`src2` ON(  `dbo`.`src2`.id = `dbo`.`src1`.id )\"";
        assertEquals(expectedQuery, query);
    }

    @Test
    public void testELTMapJoinWithUpdateAndTableNameQuoteMysqlWithoutAliasRightOuterJoin() {
        String schema = "dbo";
        String inputTable1 = "src1";
        String alias1 = "";
        String targetTable = "tar";
        String inputTable2 = "src2";
        String alias2 = "";
        boolean addQuotesInTableNames = true;
        String joinType = "RIGHT_OUTER_JOIN";
        boolean isUpdate = true;
        String dbType = "mysql_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);
        String expectedQuery = "\"UPDATE `dbo`.`tar`\n" + "SET tarColumn = `dbo`.`src1`.id,\n"
                + "tarColumn1 = `dbo`.`src2`.name\n"
                + "FROM\n `dbo`.`src1` RIGHT OUTER JOIN  `dbo`.`src2` ON(  `dbo`.`src2`.id = `dbo`.`src1`.id )\"";
        assertEquals(expectedQuery, query);
    }

    @Test
    public void testELTMapJoinWithUpdateAndTableNameQuoteMysqlWithoutAliasFullOuterJoin() {
        String schema = "dbo";
        String inputTable1 = "src1";
        String alias1 = "";
        String targetTable = "tar";
        String inputTable2 = "src2";
        String alias2 = "";
        boolean addQuotesInTableNames = true;
        String joinType = "FULL_OUTER_JOIN";
        boolean isUpdate = true;
        String dbType = "mysql_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);
        String expectedQuery = "\"UPDATE `dbo`.`tar`\n" + "SET tarColumn = `dbo`.`src1`.id,\n"
                + "tarColumn1 = `dbo`.`src2`.name\n"
                + "FROM\n `dbo`.`src1` FULL OUTER JOIN  `dbo`.`src2` ON(  `dbo`.`src2`.id = `dbo`.`src1`.id )\"";
        assertEquals(expectedQuery, query);
    }

    @Test
    public void testELTMapJoinWithUpdateAndTableNameQuoteMysqlWithoutAliasCrossJoin() {
        String schema = "dbo";
        String inputTable1 = "src1";
        String alias1 = "";
        String targetTable = "tar";
        String inputTable2 = "src2";
        String alias2 = "";
        boolean addQuotesInTableNames = true;
        String joinType = "CROSS_JOIN";
        boolean isUpdate = true;
        String dbType = "mysql_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);
        String expectedQuery = "\"UPDATE `dbo`.`tar`\n" + "SET tarColumn = `dbo`.`src1`.id,\n"
                + "tarColumn1 = `dbo`.`src2`.name\n"
                + "FROM\n `dbo`.`src1` CROSS JOIN  \n`dbo`.`src2`\nWHERE\n  `dbo`.`src2`.id = `dbo`.`src1`.id\"";
        assertEquals(expectedQuery, query);
    }

    @Test
    public void testELTMapJoinWithUpdateAndTableNameQuoteMysqlWithoutAliasNoJoinContextMode() {
        String schema = "context.schema";
        String inputTable1 = "context.input1";
        String alias1 = "";
        String targetTable = "context.target";
        String inputTable2 = "context.input2";
        String alias2 = "";
        boolean addQuotesInTableNames = true;
        String joinType = "NO_JOIN";
        boolean isUpdate = true;
        String dbType = "mysql_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);
        String expectedQuery =
                "\"UPDATE \"+ \"`\" +context.schema+ \"`\" +\".\"+ \"`\" +context.target+ \"`\" +\"\nSET tarColumn = \" +\"`\" + context.schema + \"`\"+ \".\" +\"`\" + context.input1 + \"`\"+ \".id,\n"
                        + "tarColumn1 = \" +\"`\" + context.schema + \"`\"+ \".\" +\"`\" + context.input2 + \"`\"+ \".name\nFROM\n \" +\"`\" + context.schema + \"`\"+ \".\" +\"`\" + context.input1 + \"`\"+ "
                        + "\" , \" +\"`\" + context.schema + \"`\"+ \".\" +\"`\" + context.input2 + \"`\"+ \"\nWHERE\n  \" +\"`\" + context.schema + \"`\"+ \".\" +\"`\" + context.input2 + \"`\"+ \".id = \" +\"`\" + context.schema + \"`\"+ \".\" +\"`\" + context.input1 + \"`\"+ \".id\"";

        assertEquals(expectedQuery, query);
    }

    @Test
    public void testELTMapJoinWithUpdateAndTableNameQuoteMysqlWithoutAliasInnerJoinContextMode() {
        String schema = "context.schema";
        String inputTable1 = "context.input1";
        String alias1 = "";
        String targetTable = "context.target";
        String inputTable2 = "context.input2";
        String alias2 = "";
        boolean addQuotesInTableNames = true;
        String joinType = "INNER_JOIN";
        boolean isUpdate = true;
        String dbType = "mysql_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);
        String expectedQuery =
                "\"UPDATE \"+ \"`\" +context.schema+ \"`\" +\".\"+ \"`\" +context.target+ \"`\" +\"\nSET tarColumn = \" +\"`\" + context.schema + \"`\"+ \".\" +\"`\" + context.input1 + \"`\"+ \".id,\n"
                        + "tarColumn1 = \" +\"`\" + context.schema + \"`\"+ \".\" +\"`\" + context.input2 + \"`\"+ \".name\nFROM\n \" +\"`\" + context.schema + \"`\"+ \".\" +\"`\" + context.input1 + \"`\"+ "
                        + "\" INNER JOIN  \" +\"`\" + context.schema + \"`\"+ \".\" +\"`\" + context.input2 + \"`\"+ \" ON(  \" +\"`\" + context.schema + \"`\"+ \".\" +\"`\" + context.input2 + \"`\"+ \".id"
                        + " = \" +\"`\" + context.schema + \"`\"+ \".\" +\"`\" + context.input1 + \"`\"+ \".id )\"";

        assertEquals(expectedQuery, query);
    }

    @Test
    public void testELTMapJoinWithUpdateAndTableNameQuoteSnowflakeWithoutAliasNoJoinContextMode() {
        String schema = "context.schema";
        String inputTable1 = "context.input1";
        String alias1 = "";
        String targetTable = "context.target";
        String inputTable2 = "context.input2";
        String alias2 = "";
        boolean addQuotesInTableNames = true;
        String joinType = "NO_JOIN";
        boolean isUpdate = true;
        String dbType = "snowflake_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);
        String expectedQuery =
                "\"UPDATE \"+ \"\\\"\" +context.schema+ \"\\\"\" +\".\"+ \"\\\"\" +context.target+ \"\\\"\" +\"\nSET tarColumn = \" +\"\\\"\" + context.schema + \"\\\"\"+ \".\" +\"\\\"\" + context.input1 + \"\\\"\"+ \".id,\n"
                        + "tarColumn1 = \" +\"\\\"\" + context.schema + \"\\\"\"+ \".\" +\"\\\"\" + context.input2 + \"\\\"\"+ \".name\nFROM\n \" +\"\\\"\" + context.schema + \"\\\"\"+ \".\" +\"\\\"\" + context.input1 + \"\\\"\"+ "
                        + "\" , \" +\"\\\"\" + context.schema + \"\\\"\"+ \".\" +\"\\\"\" + context.input2 + \"\\\"\"+ \"\n"
                        + "WHERE\n"
                        + "  \" +\"\\\"\" + context.schema + \"\\\"\"+ \".\" +\"\\\"\" + context.input2 + \"\\\"\"+ \".id = \" +\"\\\"\" + context.schema + \"\\\"\"+ \".\" +\"\\\"\" + context.input1 + \"\\\"\"+ \".id\"";

        assertEquals(expectedQuery, query);
    }

    @Test
    public void testELTMapJoinWithUpdateAndTableNameQuoteSnowflakeWithoutAliasInnerJoinContextMode() {
        String schema = "context.schema";
        String inputTable1 = "context.input1";
        String alias1 = "";
        String targetTable = "context.target";
        String inputTable2 = "context.input2";
        String alias2 = "";
        boolean addQuotesInTableNames = true;
        String joinType = "INNER_JOIN";
        boolean isUpdate = true;
        String dbType = "snowflake_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);
        String expectedQuery =
                "\"UPDATE \"+ \"\\\"\" +context.schema+ \"\\\"\" +\".\"+ \"\\\"\" +context.target+ \"\\\"\" +\"\nSET tarColumn = \" +\"\\\"\" + context.schema + \"\\\"\"+ \".\" +\"\\\"\" + context.input1 + \"\\\"\"+ \".id,\n"
                        + "tarColumn1 = \" +\"\\\"\" + context.schema + \"\\\"\"+ \".\" +\"\\\"\" + context.input2 + \"\\\"\"+ \".name\nFROM\n \" +\"\\\"\" + context.schema + \"\\\"\"+ \".\" +\"\\\"\" + context.input1 + \"\\\"\"+ "
                        + "\" INNER JOIN  \" +\"\\\"\" + context.schema + \"\\\"\"+ \".\" +\"\\\"\" + context.input2 + \"\\\"\"+ \" ON(  \" +\"\\\"\" + context.schema + \"\\\"\"+ \".\" +\"\\\"\" + context.input2 + \"\\\"\"+ \".id"
                        + " = \" +\"\\\"\" + context.schema + \"\\\"\"+ \".\" +\"\\\"\" + context.input1 + \"\\\"\"+ \".id )\"";

        assertEquals(expectedQuery, query);
    }

    @Test
    public void testELTMapJoinWithUpdateAndTableNameQuoteSnowflakeWithAliasNoJoinContextMode() {
        String schema = "context.schema";
        String inputTable1 = "context.input1";
        String alias1 = "A";
        String targetTable = "context.target";
        String inputTable2 = "context.input2";
        String alias2 = "B";
        boolean addQuotesInTableNames = true;
        String joinType = "NO_JOIN";
        boolean isUpdate = true;
        String dbType = "snowflake_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);
        String expectedQuery =
                "\"UPDATE \"+ \"\\\"\" +context.schema+ \"\\\"\" +\".\"+ \"\\\"\" +context.target+ \"\\\"\" +\"\nSET tarColumn = \\\"A\\\".id,\n"
                        + "tarColumn1 = \\\"B\\\".name\nFROM\n \" +\"\\\"\" +context.schema+ \"\\\"\"+\".\"+\"\\\"\" +context.input1+ \"\\\"\"+ \" \\\"A\\\" , "
                        + "\" +\"\\\"\" +context.schema+ \"\\\"\"+\".\"+\"\\\"\" +context.input2+ \"\\\"\"+ \" \\\"B\\\"\nWHERE\n  \\\"B\\\".id = \\\"A\\\".id\"";

        assertEquals(expectedQuery, query);
    }

    @Test
    public void testELTMapJoinWithUpdateAndTableNameQuoteSnowflakeWithAliasInnerJoinContextMode() {
        String schema = "context.schema";
        String inputTable1 = "context.input1";
        String alias1 = "A";
        String targetTable = "context.target";
        String inputTable2 = "context.input2";
        String alias2 = "B";
        boolean addQuotesInTableNames = true;
        String joinType = "INNER_JOIN";
        boolean isUpdate = true;
        String dbType = "snowflake_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);
        String expectedQuery =
                "\"UPDATE \"+ \"\\\"\" +context.schema+ \"\\\"\" +\".\"+ \"\\\"\" +context.target+ \"\\\"\" +\"\nSET tarColumn = \\\"A\\\".id,\n"
                        + "tarColumn1 = \\\"B\\\".name\nFROM\n \" +\"\\\"\" +context.schema+ \"\\\"\"+\".\"+\"\\\"\" +context.input1+ \"\\\"\"+ \" \\\"A\\\" INNER JOIN  "
                        + "\" +\"\\\"\" +context.schema+ \"\\\"\"+\".\"+\"\\\"\" +context.input2+ \"\\\"\"+ \" \\\"B\\\" ON(  \\\"B\\\".id = \\\"A\\\".id )\"";

        assertEquals(expectedQuery, query);
    }

    @Test
    public void testELTMapJoinWithUpdateAndTableNameQuoteMysqlWithAliasNoJoinContextMode() {
        String schema = "context.schema";
        String inputTable1 = "context.input1";
        String alias1 = "A";
        String targetTable = "context.target";
        String inputTable2 = "context.input2";
        String alias2 = "B";
        boolean addQuotesInTableNames = true;
        String joinType = "NO_JOIN";
        boolean isUpdate = true;
        String dbType = "mysql_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);
        String expectedQuery =
                "\"UPDATE \"+ \"`\" +context.schema+ \"`\" +\".\"+ \"`\" +context.target+ \"`\" +\"\nSET tarColumn = `A`.id,\n"
                        + "tarColumn1 = `B`.name\nFROM\n \" +\"`\" +context.schema+ \"`\"+\".\"+\"`\" +context.input1+ \"`\"+ \" `A` , "
                        + "\" +\"`\" +context.schema+ \"`\"+\".\"+\"`\" +context.input2+ \"`\"+ \" `B`\nWHERE\n  `B`.id = `A`.id\"";

        assertEquals(expectedQuery, query);
    }

    @Test
    public void testELTMapJoinWithUpdateAndTableNameQuoteMysqlWithAliasInnerJoinContextMode() {
        String schema = "context.schema";
        String inputTable1 = "context.input1";
        String alias1 = "A";
        String targetTable = "context.target";
        String inputTable2 = "context.input2";
        String alias2 = "B";
        boolean addQuotesInTableNames = true;
        String joinType = "INNER_JOIN";
        boolean isUpdate = true;
        String dbType = "mysql_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);
        String expectedQuery =
                "\"UPDATE \"+ \"`\" +context.schema+ \"`\" +\".\"+ \"`\" +context.target+ \"`\" +\"\nSET tarColumn = `A`.id,\n"
                        + "tarColumn1 = `B`.name\nFROM\n \" +\"`\" +context.schema+ \"`\"+\".\"+\"`\" +context.input1+ \"`\"+ \" `A` INNER JOIN  "
                        + "\" +\"`\" +context.schema+ \"`\"+\".\"+\"`\" +context.input2+ \"`\"+ \" `B` ON(  `B`.id = `A`.id )\"";

        assertEquals(expectedQuery, query);
    }

    @Test
    public void testELTMapJoinWithUpdateAndTableNameQuoteMysqlWithAliasNoJoinGloableMap() {
        String schema = "((String)globalMap.get(\"schema\"))";
        String inputTable1 = "((String)globalMap.get(\"input1\"))";
        String alias1 = "A";
        String targetTable = "((String)globalMap.get(\"target\"))";
        String inputTable2 = "((String)globalMap.get(\"input2\"))";
        String alias2 = "B";
        boolean addQuotesInTableNames = true;
        String joinType = "NO_JOIN";
        boolean isUpdate = true;
        String dbType = "mysql_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);
        String expectedQuery =
                "\"UPDATE \"+ \"`\" +((String)globalMap.get(\"schema\"))+ \"`\" +\".\"+ \"`\" +((String)globalMap.get(\"target\"))+ \"`\" +\"\n"
                        + "SET tarColumn = `A`.id,\n" + "tarColumn1 = `B`.name\n" + "FROM\n"
                        + " \" +\"`\" +((String)globalMap.get(\"schema\"))+ \"`\"+\".\"+\"`\" +((String)globalMap.get(\"input1\"))+ \"`\"+ \" `A` , \" +\"`\" +((String)globalMap.get(\"schema\"))+ \"`\"+\".\"+\"`\" +((String)globalMap.get(\"input2\"))+ \"`\"+ \" `B`\n"
                        + "WHERE\n" + "  `B`.id = `A`.id\"";

        assertEquals(expectedQuery, query);
    }

    @Test
    public void testELTMapJoinWithUpdateAndTableNameQuoteMysqlWithAliasInnerJoinGloableMap() {
        String schema = "((String)globalMap.get(\"schema\"))";
        String inputTable1 = "((String)globalMap.get(\"input1\"))";
        String alias1 = "A";
        String targetTable = "((String)globalMap.get(\"target\"))";
        String inputTable2 = "((String)globalMap.get(\"input2\"))";
        String alias2 = "B";
        boolean addQuotesInTableNames = true;
        String joinType = "INNER_JOIN";
        boolean isUpdate = true;
        String dbType = "mysql_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);
        String expectedQuery =
                "\"UPDATE \"+ \"`\" +((String)globalMap.get(\"schema\"))+ \"`\" +\".\"+ \"`\" +((String)globalMap.get(\"target\"))+ \"`\" +\"\n"
                        + "SET tarColumn = `A`.id,\n" + "tarColumn1 = `B`.name\n" + "FROM\n"
                        + " \" +\"`\" +((String)globalMap.get(\"schema\"))+ \"`\"+\".\"+\"`\" +((String)globalMap.get(\"input1\"))+ \"`\"+ \" `A` INNER JOIN  \" +\"`\" +((String)globalMap.get(\"schema\"))+ \"`\"+\".\"+\"`\" +((String)globalMap.get(\"input2\"))+ \"`\"+ \" `B` ON(  `B`.id = `A`.id )\"";

        assertEquals(expectedQuery, query);
    }

    @Test
    public void testELTMapJoinWithUpdateAndTableNameQuoteSnowflakeWithAliasNoJoinGloableMap() {
        String schema = "((String)globalMap.get(\"schema\"))";
        String inputTable1 = "((String)globalMap.get(\"input1\"))";
        String alias1 = "A";
        String targetTable = "((String)globalMap.get(\"target\"))";
        String inputTable2 = "((String)globalMap.get(\"input2\"))";
        String alias2 = "B";
        boolean addQuotesInTableNames = true;
        String joinType = "NO_JOIN";
        boolean isUpdate = true;
        String dbType = "snowflake_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);
        String expectedQuery =
                "\"UPDATE \"+ \"\\\"\" +((String)globalMap.get(\"schema\"))+ \"\\\"\" +\".\"+ \"\\\"\" +((String)globalMap.get(\"target\"))+ \"\\\"\" +\"\n"
                        + "SET tarColumn = \\\"A\\\".id,\n" + "tarColumn1 = \\\"B\\\".name\n" + "FROM\n"
                        + " \" +\"\\\"\" +((String)globalMap.get(\"schema\"))+ \"\\\"\"+\".\"+\"\\\"\" +((String)globalMap.get(\"input1\"))+ \"\\\"\"+ \" \\\"A\\\" , \" +\"\\\"\" +((String)globalMap.get(\"schema\"))+ \"\\\"\"+\".\"+\"\\\"\" +((String)globalMap.get(\"input2\"))+ \"\\\"\"+ \" \\\"B\\\"\n"
                        + "WHERE\n" + "  \\\"B\\\".id = \\\"A\\\".id\"";

        assertEquals(expectedQuery, query);
    }

    @Test
    public void testELTMapJoinWithUpdateAndTableNameQuoteSnowflakeWithAliasInnerJoinGloableMap() {
        String schema = "((String)globalMap.get(\"schema\"))";
        String inputTable1 = "((String)globalMap.get(\"input1\"))";
        String alias1 = "A";
        String targetTable = "((String)globalMap.get(\"target\"))";
        String inputTable2 = "((String)globalMap.get(\"input2\"))";
        String alias2 = "B";
        boolean addQuotesInTableNames = true;
        String joinType = "INNER_JOIN";
        boolean isUpdate = true;
        String dbType = "snowflake_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);
        String expectedQuery =
                "\"UPDATE \"+ \"\\\"\" +((String)globalMap.get(\"schema\"))+ \"\\\"\" +\".\"+ \"\\\"\" +((String)globalMap.get(\"target\"))+ \"\\\"\" +\"\n"
                        + "SET tarColumn = \\\"A\\\".id,\n" + "tarColumn1 = \\\"B\\\".name\n" + "FROM\n"
                        + " \" +\"\\\"\" +((String)globalMap.get(\"schema\"))+ \"\\\"\"+\".\"+\"\\\"\" +((String)globalMap.get(\"input1\"))+ \"\\\"\"+ \" \\\"A\\\" INNER JOIN  \" +\"\\\"\" +((String)globalMap.get(\"schema\"))+ \"\\\"\"+\".\"+\"\\\"\" +((String)globalMap.get(\"input2\"))+ \"\\\"\"+ \" \\\"B\\\" ON(  \\\"B\\\".id = \\\"A\\\".id )\"";

        assertEquals(expectedQuery, query);
    }

    @Test
    public void testELTMapJoinWithUpdateAndTableNameQuoteSnowflakeWithoutAliasInnerJoinGloableMap() {
        String schema = "((String)globalMap.get(\"schema\"))";
        String inputTable1 = "((String)globalMap.get(\"input1\"))";
        String alias1 = "";
        String targetTable = "((String)globalMap.get(\"target\"))";
        String inputTable2 = "((String)globalMap.get(\"input2\"))";
        String alias2 = "B";
        boolean addQuotesInTableNames = true;
        String joinType = "INNER_JOIN";
        boolean isUpdate = true;
        String dbType = "snowflake_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);
        String expectedQuery =
                "\"UPDATE \"+ \"\\\"\" +((String)globalMap.get(\"schema\"))+ \"\\\"\" +\".\"+ \"\\\"\" +((String)globalMap.get(\"target\"))+ \"\\\"\" +\"\n"
                        + "SET tarColumn = \" +\"\\\"\" + ((String)globalMap.get(\"schema\")) + \"\\\"\"+ \".\" +\"\\\"\" + ((String)globalMap.get(\"input1\")) + \"\\\"\"+ \".newColumn,\n"
                        + "tarColumn1 = \\\"B\\\".name\n" + "FROM\n"
                        + " \" +\"\\\"\" + ((String)globalMap.get(\"schema\")) + \"\\\"\"+ \".\" +\"\\\"\" + ((String)globalMap.get(\"input1\")) + \"\\\"\"+ \" INNER JOIN  \" +\"\\\"\" +((String)globalMap.get(\"schema\"))+ \"\\\"\"+\".\"+\"\\\"\" +((String)globalMap.get(\"input2\"))+ \"\\\"\"+ \" \\\"B\\\" ON(  \\\"B\\\".id = \" +\"\\\"\" + ((String)globalMap.get(\"schema\")) + \"\\\"\"+ \".\" +\"\\\"\" + ((String)globalMap.get(\"input1\")) + \"\\\"\"+ \".newColumn )\"";

        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithUpdateAndTableNameQuoteSnowflakeWithoutAliasInnerJoinGloableMapNoSchema() {
        String schema = "";
        String inputTable1 = "((String)globalMap.get(\"input1\"))";
        String alias1 = "";
        String targetTable = "((String)globalMap.get(\"target\"))";
        String inputTable2 = "((String)globalMap.get(\"input2\"))";
        String alias2 = "B";
        boolean addQuotesInTableNames = true;
        String joinType = "INNER_JOIN";
        boolean isUpdate = true;
        String dbType = "snowflake_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, targetTable);
        String expectedQuery =
                "\"UPDATE \"+ \"\\\"\" +((String)globalMap.get(\"target\"))+ \"\\\"\" +\"\n"
                        + "SET tarColumn = \" +\"\\\"\" + ((String)globalMap.get(\"input1\")) + \"\\\"\"+ \".newColumn,\n"
                        + "tarColumn1 = \\\"B\\\".name\n" + "FROM\n"
                        + " \" +\"\\\"\" + ((String)globalMap.get(\"input1\")) + \"\\\"\"+ \" INNER JOIN  \" +\"\\\"\" +((String)globalMap.get(\"input2\"))+ \"\\\"\"+ \" \\\"B\\\" ON(  \\\"B\\\".id = \" +\"\\\"\" + ((String)globalMap.get(\"input1\")) + \"\\\"\"+ \".newColumn )\"";

        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithUpdateAndTableNameQuoteSnowflakeWithoutAliasNoJoinGloableMapNoSchema() {
        String schema = "";
        String inputTable1 = "input1";
        String alias1 = "";
        String targetTable = "((String)globalMap.get(\"target\"))";
        String inputTable2 = "((String)globalMap.get(\"input2\"))";
        String alias2 = "B";
        boolean addQuotesInTableNames = true;
        String joinType = "NO_JOIN";
        boolean isUpdate = true;
        String dbType = "snowflake_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, targetTable);
        String expectedQuery =
                "\"UPDATE \"+ \"\\\"\" +((String)globalMap.get(\"target\"))+ \"\\\"\" +\"\n"
                        + "SET tarColumn = \\\"input1\\\".id,\n" + "tarColumn1 = \\\"B\\\".name\n" + "FROM\n"
                        + " \\\"input1\\\" , \" +\"\\\"\" +((String)globalMap.get(\"input2\"))+ \"\\\"\"+ \" \\\"B\\\"\n"
                        + "WHERE\n" + "  \\\"B\\\".id = \\\"input1\\\".id\"";

        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithUpdateAndTableNameQuoteMysqlWithoutAliasInnerJoinGloableMapNoSchema() {
        String schema = "";
        String inputTable1 = "((String)globalMap.get(\"input1\"))";
        String alias1 = "";
        String targetTable = "((String)globalMap.get(\"target\"))";
        String inputTable2 = "((String)globalMap.get(\"input2\"))";
        String alias2 = "B";
        boolean addQuotesInTableNames = true;
        String joinType = "INNER_JOIN";
        boolean isUpdate = true;
        String dbType = "mysql_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, targetTable);
        String expectedQuery =
                "\"UPDATE \"+ \"`\" +((String)globalMap.get(\"target\"))+ \"`\" +\"\n"
                        + "SET tarColumn = \" +\"`\" + ((String)globalMap.get(\"input1\")) + \"`\"+ \".newColumn,\n"
                        + "tarColumn1 = `B`.name\n" + "FROM\n"
                        + " \" +\"`\" + ((String)globalMap.get(\"input1\")) + \"`\"+ \" INNER JOIN  \" +\"`\" +((String)globalMap.get(\"input2\"))+ \"`\"+ \" `B` ON(  `B`.id = \" +\"`\" + ((String)globalMap.get(\"input1\")) + \"`\"+ \".newColumn )\"";

        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithUpdateAndTableNameQuoteMysqlWithoutAliasNoJoinGloableMapNoSchema() {
        String schema = "";
        String inputTable1 = "input1";
        String alias1 = "";
        String targetTable = "((String)globalMap.get(\"target\"))";
        String inputTable2 = "((String)globalMap.get(\"input2\"))";
        String alias2 = "B";
        boolean addQuotesInTableNames = true;
        String joinType = "NO_JOIN";
        boolean isUpdate = true;
        String dbType = "mysql_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, targetTable);
        String expectedQuery =
                "\"UPDATE \"+ \"`\" +((String)globalMap.get(\"target\"))+ \"`\" +\"\n"
                        + "SET tarColumn = `input1`.id,\n" + "tarColumn1 = `B`.name\n" + "FROM\n"
                        + " `input1` , \" +\"`\" +((String)globalMap.get(\"input2\"))+ \"`\"+ \" `B`\n" + "WHERE\n"
                        + "  `B`.id = `input1`.id\"";

        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithUpdateAndTableNameQuoteMysqlWithoutAliasInnerJoinContextNoSchema() {
        String schema = "";
        String inputTable1 = "input1";
        String alias1 = "";
        String targetTable = "tar";
        String inputTable2 = "context.input2";
        String alias2 = "B";
        boolean addQuotesInTableNames = true;
        String joinType = "INNER_JOIN";
        boolean isUpdate = true;
        String dbType = "mysql_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, targetTable);
        String expectedQuery =
                "\"UPDATE `tar`\nSET tarColumn = `input1`.id,\n" + "tarColumn1 = `B`.name\nFROM\n `input1` INNER JOIN  "
                        + "\" +\"`\" +context.input2+ \"`\"+ \" `B` ON(  `B`.id = `input1`.id )\"";

        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithUpdateAndTableNameQuoteSnowflakeWithoutAliasInnerJoinContextNoSchema() {
        String schema = "";
        String inputTable1 = "input1";
        String alias1 = "";
        String targetTable = "tar";
        String inputTable2 = "context.input2";
        String alias2 = "B";
        boolean addQuotesInTableNames = true;
        String joinType = "INNER_JOIN";
        boolean isUpdate = true;
        String dbType = "snowflake_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, targetTable);
        String expectedQuery =
                "\"UPDATE \\\"tar\\\"\nSET tarColumn = \\\"input1\\\".id,\n"
                        + "tarColumn1 = \\\"B\\\".name\nFROM\n \\\"input1\\\" INNER JOIN  "
                        + "\" +\"\\\"\" +context.input2+ \"\\\"\"+ \" \\\"B\\\" ON(  \\\"B\\\".id = \\\"input1\\\".id )\"";

        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithSelectAndTableNameQuoteSnowflakeInnerJoinContextSchema() {
        String schema = "context.schema";
        String inputTable1 = "context.input1";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "((String)globalMap.get(\"input2\"))";
        String alias2 = "";
        boolean addQuotesInTableNames = true;
        String joinType = "INNER_JOIN";
        boolean isUpdate = false;
        String dbType = "snowflake_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);

        String expectedQuery = "\"SELECT\n"
                + "\\\"A\\\".id, \" +\"\\\"\" + context.schema + \"\\\"\"+ \".\" +\"\\\"\" + ((String)globalMap.get(\"input2\")) + \"\\\"\"+ \".newColumn1\n"
                + "FROM\n"
                + " \" +\"\\\"\" +context.schema+ \"\\\"\"+\".\"+\"\\\"\" +context.input1+ \"\\\"\"+ \" \\\"A\\\" INNER JOIN  \" +\"\\\"\" + context.schema + "
                + "\"\\\"\"+ \".\" +\"\\\"\" + ((String)globalMap.get(\"input2\")) + \"\\\"\"+ \" ON(  \" +\"\\\"\" + context.schema + \"\\\"\"+ \".\" +\"\\\"\""
                + " + ((String)globalMap.get(\"input2\")) + \"\\\"\"+ \".id = \\\"A\\\".id )\"";
        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithSelectAndTableNameQuoteSnowflakeNoJoinContextSchema() {
        String schema = "context.schema";
        String inputTable1 = "context.input1";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "((String)globalMap.get(\"input2\"))";
        String alias2 = "";
        boolean addQuotesInTableNames = true;
        String joinType = "NO_JOIN";
        boolean isUpdate = false;
        String dbType = "snowflake_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);

        String expectedQuery = "\"SELECT\n"
                + "\\\"A\\\".id, \" +\"\\\"\" + context.schema + \"\\\"\"+ \".\" +\"\\\"\" + ((String)globalMap.get(\"input2\")) + \"\\\"\"+ \".newColumn1\n"
                + "FROM\n"
                + " \" +\"\\\"\" +context.schema+ \"\\\"\"+\".\"+\"\\\"\" +context.input1+ \"\\\"\"+ \" \\\"A\\\" , \" +\"\\\"\" + context.schema + \"\\\"\"+ \".\" +\"\\\"\" + ((String)globalMap.get(\"input2\")) + \"\\\"\"+ \"\n"
                + "WHERE\n"
                + "  \" +\"\\\"\" + context.schema + \"\\\"\"+ \".\" +\"\\\"\" + ((String)globalMap.get(\"input2\")) + \"\\\"\"+ \".id = \\\"A\\\".id\"";
        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithSelectAndTableNameQuoteMysqlInnerJoinContextSchema() {
        String schema = "context.schema";
        String inputTable1 = "context.input1";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "((String)globalMap.get(\"input2\"))";
        String alias2 = "";
        boolean addQuotesInTableNames = true;
        String joinType = "INNER_JOIN";
        boolean isUpdate = false;
        String dbType = "mysql_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);

        String expectedQuery = "\"SELECT\n"
                + "`A`.id, \" +\"`\" + context.schema + \"`\"+ \".\" +\"`\" + ((String)globalMap.get(\"input2\")) + \"`\"+ \".newColumn1\n"
                + "FROM\n"
                + " \" +\"`\" +context.schema+ \"`\"+\".\"+\"`\" +context.input1+ \"`\"+ \" `A` INNER JOIN  \" +\"`\" + context.schema + "
                + "\"`\"+ \".\" +\"`\" + ((String)globalMap.get(\"input2\")) + \"`\"+ \" ON(  \" +\"`\" + context.schema + \"`\"+ \".\" +\"`\""
                + " + ((String)globalMap.get(\"input2\")) + \"`\"+ \".id = `A`.id )\"";
        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithSelectAndTableNameQuoteMysqlNoJoinContextSchema() {
        String schema = "context.schema";
        String inputTable1 = "context.input1";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "((String)globalMap.get(\"input2\"))";
        String alias2 = "";
        boolean addQuotesInTableNames = true;
        String joinType = "NO_JOIN";
        boolean isUpdate = false;
        String dbType = "mysql_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);

        String expectedQuery = "\"SELECT\n"
                + "`A`.id, \" +\"`\" + context.schema + \"`\"+ \".\" +\"`\" + ((String)globalMap.get(\"input2\")) + \"`\"+ \".newColumn1\n"
                + "FROM\n"
                + " \" +\"`\" +context.schema+ \"`\"+\".\"+\"`\" +context.input1+ \"`\"+ \" `A` , \" +\"`\" + context.schema + \"`\"+ \".\" +\"`\" + ((String)globalMap.get(\"input2\")) + \"`\"+ \"\n"
                + "WHERE\n"
                + "  \" +\"`\" + context.schema + \"`\"+ \".\" +\"`\" + ((String)globalMap.get(\"input2\")) + \"`\"+ \".id = `A`.id\"";
        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithSelectAndTableNameQuoteSnowflakeInnerJoinContextSchema2() {
        String schema = "context.schema";
        String inputTable1 = "context.input1";
        String alias1 = "";
        String targetTable = "tar";
        String inputTable2 = "((String)globalMap.get(\"input2\"))";
        String alias2 = "B";
        boolean addQuotesInTableNames = true;
        String joinType = "INNER_JOIN";
        boolean isUpdate = false;
        String dbType = "snowflake_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);

        String expectedQuery = "\"SELECT\n"
                + "\" +\"\\\"\" + context.schema + \"\\\"\"+ \".\" +\"\\\"\" + context.input1 + \"\\\"\"+ \".id, \\\"B\\\".name\n"
                + "FROM\n"
                + " \" +\"\\\"\" + context.schema + \"\\\"\"+ \".\" +\"\\\"\" + context.input1 + \"\\\"\"+ \" INNER JOIN  \" +\"\\\"\""
                + " +context.schema+ \"\\\"\"+\".\"+\"\\\"\" +((String)globalMap.get(\"input2\"))+ \"\\\"\"+ \" \\\"B\\\" "
                + "ON(  \\\"B\\\".id = \" +\"\\\"\" + context.schema + \"\\\"\"+ \".\" +\"\\\"\" + context.input1 + \"\\\"\"+ \".id )\"";
        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithSelectAndTableNameQuoteSnowflakeNoJoinContextSchema2() {
        String schema = "context.schema";
        String inputTable1 = "context.input1";
        String alias1 = "";
        String targetTable = "tar";
        String inputTable2 = "((String)globalMap.get(\"input2\"))";
        String alias2 = "B";
        boolean addQuotesInTableNames = true;
        String joinType = "NO_JOIN";
        boolean isUpdate = false;
        String dbType = "snowflake_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);

        String expectedQuery = "\"SELECT\n"
                + "\" +\"\\\"\" + context.schema + \"\\\"\"+ \".\" +\"\\\"\" + context.input1 + \"\\\"\"+ \".id, \\\"B\\\".name\n"
                + "FROM\n"
                + " \" +\"\\\"\" + context.schema + \"\\\"\"+ \".\" +\"\\\"\" + context.input1 + \"\\\"\"+ \" , \" +\"\\\"\" +context.schema+ \"\\\"\"+\".\"+\"\\\"\" +((String)globalMap.get(\"input2\"))+ \"\\\"\"+ \" \\\"B\\\"\n"
                + "WHERE\n"
                + "  \\\"B\\\".id = \" +\"\\\"\" + context.schema + \"\\\"\"+ \".\" +\"\\\"\" + context.input1 + \"\\\"\"+ \".id\"";
        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithSelectAndTableNameQuoteMysqlInnerJoinContextSchema2() {
        String schema = "context.schema";
        String inputTable1 = "context.input1";
        String alias1 = "";
        String targetTable = "tar";
        String inputTable2 = "((String)globalMap.get(\"input2\"))";
        String alias2 = "B";
        boolean addQuotesInTableNames = true;
        String joinType = "INNER_JOIN";
        boolean isUpdate = false;
        String dbType = "mysql_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);

        String expectedQuery = "\"SELECT\n"
                + "\" +\"`\" + context.schema + \"`\"+ \".\" +\"`\" + context.input1 + \"`\"+ \".id, `B`.name\n"
                + "FROM\n"
                + " \" +\"`\" + context.schema + \"`\"+ \".\" +\"`\" + context.input1 + \"`\"+ \" INNER JOIN  \" +\"`\""
                + " +context.schema+ \"`\"+\".\"+\"`\" +((String)globalMap.get(\"input2\"))+ \"`\"+ \" `B` "
                + "ON(  `B`.id = \" +\"`\" + context.schema + \"`\"+ \".\" +\"`\" + context.input1 + \"`\"+ \".id )\"";
        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithSelectAndTableNameQuoteMysqlNoJoinContextSchema2() {
        String schema = "context.schema";
        String inputTable1 = "context.input1";
        String alias1 = "";
        String targetTable = "tar";
        String inputTable2 = "((String)globalMap.get(\"input2\"))";
        String alias2 = "B";
        boolean addQuotesInTableNames = true;
        String joinType = "NO_JOIN";
        boolean isUpdate = false;
        String dbType = "mysql_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);

        String expectedQuery = "\"SELECT\n"
                + "\" +\"`\" + context.schema + \"`\"+ \".\" +\"`\" + context.input1 + \"`\"+ \".id, `B`.name\n"
                + "FROM\n"
                + " \" +\"`\" + context.schema + \"`\"+ \".\" +\"`\" + context.input1 + \"`\"+ \" , \" +\"`\" +context.schema+ \"`\"+\".\"+\"`\" +((String)globalMap.get(\"input2\"))+ \"`\"+ \" `B`\n"
                + "WHERE\n"
                + "  `B`.id = \" +\"`\" + context.schema + \"`\"+ \".\" +\"`\" + context.input1 + \"`\"+ \".id\"";
        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithSelectAndTableNameQuoteSnowflakeInnerJoinNomalTableNameContextSchema() {
        String schema = "context.schema";
        String inputTable1 = "input1";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "input2";
        String alias2 = "";
        boolean addQuotesInTableNames = true;
        String joinType = "INNER_JOIN";
        boolean isUpdate = false;
        String dbType = "snowflake_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);

        String expectedQuery = "\"SELECT\n"
                + "\\\"A\\\".id, \" +\"\\\"\" + context.schema + \"\\\"\"+ \".\\\"input2\\\".name\n"
                + "FROM\n"
                + " \" +\"\\\"\" +context.schema+ \"\\\"\"+\".\"+\"\\\"input1\\\"\"+ \" \\\"A\\\" INNER JOIN"
                + "  \" +\"\\\"\" + context.schema + \"\\\"\"+ \".\\\"input2\\\" ON(  \" +\"\\\"\" + context.schema +"
                + " \"\\\"\"+ \".\\\"input2\\\".id = \\\"A\\\".id )\"";
        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithSelectAndTableNameQuoteSnowflakeNoJoinNomalTableNameContextSchema() {
        String schema = "context.schema";
        String inputTable1 = "input1";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "input2";
        String alias2 = "";
        boolean addQuotesInTableNames = true;
        String joinType = "NO_JOIN";
        boolean isUpdate = false;
        String dbType = "snowflake_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);

        String expectedQuery = "\"SELECT\n"
                + "\\\"A\\\".id, \" +\"\\\"\" + context.schema + \"\\\"\"+ \".\\\"input2\\\".name\n" + "FROM\n"
                + " \" +\"\\\"\" +context.schema+ \"\\\"\"+\".\"+\"\\\"input1\\\"\"+ \" \\\"A\\\" , \" +\"\\\"\" + context.schema + \"\\\"\"+ \".\\\"input2\\\"\n"
                + "WHERE\n" + "  \" +\"\\\"\" + context.schema + \"\\\"\"+ \".\\\"input2\\\".id = \\\"A\\\".id\"";
        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithSelectAndTableNameQuoteMysqlInnerJoinNomalTableNameContextSchema() {
        String schema = "context.schema";
        String inputTable1 = "input1";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "input2";
        String alias2 = "";
        boolean addQuotesInTableNames = true;
        String joinType = "INNER_JOIN";
        boolean isUpdate = false;
        String dbType = "mysql_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);

        String expectedQuery = "\"SELECT\n" + "`A`.id, \" +\"`\" + context.schema + \"`\"+ \".`input2`.name\n"
                + "FROM\n" + " \" +\"`\" +context.schema+ \"`\"+\".\"+\"`input1`\"+ \" `A` INNER JOIN"
                + "  \" +\"`\" + context.schema + \"`\"+ \".`input2` ON(  \" +\"`\" + context.schema +"
                + " \"`\"+ \".`input2`.id = `A`.id )\"";
        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithSelectAndTableNameQuoteMysqlNoJoinNomalTableNameContextSchema() {
        String schema = "context.schema";
        String inputTable1 = "input1";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "input2";
        String alias2 = "";
        boolean addQuotesInTableNames = true;
        String joinType = "NO_JOIN";
        boolean isUpdate = false;
        String dbType = "mysql_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);

        String expectedQuery = "\"SELECT\n" + "`A`.id, \" +\"`\" + context.schema + \"`\"+ \".`input2`.name\n"
                + "FROM\n"
                + " \" +\"`\" +context.schema+ \"`\"+\".\"+\"`input1`\"+ \" `A` , \" +\"`\" + context.schema + \"`\"+ \".`input2`\n"
                + "WHERE\n" + "  \" +\"`\" + context.schema + \"`\"+ \".`input2`.id = `A`.id\"";
        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithSelectAndTableNameQuoteSnowflakeInnerJoinContextGlobalMapTableNameNormalSchema() {
        String schema = "dbo";
        String inputTable1 = "context.input1";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "((String)globalMap.get(\"input2\"))";
        String alias2 = "";
        boolean addQuotesInTableNames = true;
        String joinType = "INNER_JOIN";
        boolean isUpdate = false;
        String dbType = "snowflake_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);

        String expectedQuery = "\"SELECT\n"
                + "\\\"A\\\".id, \\\"dbo\\\".\" +\"\\\"\" + ((String)globalMap.get(\"input2\")) + \"\\\"\"+ \".newColumn1\n"
                + "FROM\n"
                + " \" +\"\\\"dbo\\\"\"+\".\"+\"\\\"\" +context.input1+ \"\\\"\"+ \" \\\"A\\\" INNER JOIN  \\\"dbo\\\".\" +\"\\\"\""
                + " + ((String)globalMap.get(\"input2\")) + \"\\\"\"+ \" ON(  \\\"dbo\\\".\" +\"\\\"\" + ((String)globalMap.get(\"input2\"))"
                + " + \"\\\"\"+ \".id = \\\"A\\\".id )\"";
        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithSelectAndTableNameQuoteSnowflakeNoJoinContextGlobalMapTableNameNormalSchema() {
        String schema = "dbo";
        String inputTable1 = "context.input1";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "((String)globalMap.get(\"input2\"))";
        String alias2 = "";
        boolean addQuotesInTableNames = true;
        String joinType = "NO_JOIN";
        boolean isUpdate = false;
        String dbType = "snowflake_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);

        String expectedQuery = "\"SELECT\n"
                + "\\\"A\\\".id, \\\"dbo\\\".\" +\"\\\"\" + ((String)globalMap.get(\"input2\")) + \"\\\"\"+ \".newColumn1\n"
                + "FROM\n"
                + " \" +\"\\\"dbo\\\"\"+\".\"+\"\\\"\" +context.input1+ \"\\\"\"+ \" \\\"A\\\" , \\\"dbo\\\".\" +\"\\\"\" + ((String)globalMap.get(\"input2\")) + \"\\\"\"+ \"\n"
                + "WHERE\n"
                + "  \\\"dbo\\\".\" +\"\\\"\" + ((String)globalMap.get(\"input2\")) + \"\\\"\"+ \".id = \\\"A\\\".id\"";
        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithSelectAndTableNameQuoteMysqlInnerJoinContextGlobalMapTableNameNormalSchema() {
        String schema = "dbo";
        String inputTable1 = "context.input1";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "((String)globalMap.get(\"input2\"))";
        String alias2 = "";
        boolean addQuotesInTableNames = true;
        String joinType = "INNER_JOIN";
        boolean isUpdate = false;
        String dbType = "mysql_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);

        String expectedQuery = "\"SELECT\n"
                + "`A`.id, `dbo`.\" +\"`\" + ((String)globalMap.get(\"input2\")) + \"`\"+ \".newColumn1\n" + "FROM\n"
                + " \" +\"`dbo`\"+\".\"+\"`\" +context.input1+ \"`\"+ \" `A` INNER JOIN  `dbo`.\" +\"`\""
                + " + ((String)globalMap.get(\"input2\")) + \"`\"+ \" ON(  `dbo`.\" +\"`\" + ((String)globalMap.get(\"input2\"))"
                + " + \"`\"+ \".id = `A`.id )\"";
        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithSelectAndTableNameQuoteMysqlNoJoinContextGlobalMapTableNameNormalSchema() {
        String schema = "dbo";
        String inputTable1 = "context.input1";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "((String)globalMap.get(\"input2\"))";
        String alias2 = "";
        boolean addQuotesInTableNames = true;
        String joinType = "NO_JOIN";
        boolean isUpdate = false;
        String dbType = "mysql_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);

        String expectedQuery = "\"SELECT\n"
                + "`A`.id, `dbo`.\" +\"`\" + ((String)globalMap.get(\"input2\")) + \"`\"+ \".newColumn1\n"
                + "FROM\n"
                + " \" +\"`dbo`\"+\".\"+\"`\" +context.input1+ \"`\"+ \" `A` , `dbo`.\" +\"`\" + ((String)globalMap.get(\"input2\")) + \"`\"+ \"\n"
                + "WHERE\n"
                + "  `dbo`.\" +\"`\" + ((String)globalMap.get(\"input2\")) + \"`\"+ \".id = `A`.id\"";
        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithSelectAndTableNameQuoteSnowflakeInnerJoinContextGlobalMapTableNameNormalSchema2() {
        String schema = "dbo";
        String inputTable1 = "context.input1";
        String alias1 = "";
        String targetTable = "tar";
        String inputTable2 = "((String)globalMap.get(\"input2\"))";
        String alias2 = "B";
        boolean addQuotesInTableNames = true;
        String joinType = "INNER_JOIN";
        boolean isUpdate = false;
        String dbType = "snowflake_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);

        String expectedQuery = "\"SELECT\n"
                + "\\\"dbo\\\".\" +\"\\\"\" + context.input1 + \"\\\"\"+ \".id, \\\"B\\\".name\n"
                + "FROM\n"
                + " \\\"dbo\\\".\" +\"\\\"\" + context.input1 + \"\\\"\"+ \" INNER JOIN  "
                + "\" +\"\\\"dbo\\\"\"+\".\"+\"\\\"\" +((String)globalMap.get(\"input2\"))+ \"\\\"\"+ \" \\\"B\\\""
                + " ON(  \\\"B\\\".id = \\\"dbo\\\".\" +\"\\\"\" + context.input1 + \"\\\"\"+ \".id )\"";
        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithSelectAndTableNameQuoteSnowflakeNoJoinContextGlobalMapTableNameNormalSchema2() {
        String schema = "dbo";
        String inputTable1 = "context.input1";
        String alias1 = "";
        String targetTable = "tar";
        String inputTable2 = "((String)globalMap.get(\"input2\"))";
        String alias2 = "B";
        boolean addQuotesInTableNames = true;
        String joinType = "NO_JOIN";
        boolean isUpdate = false;
        String dbType = "snowflake_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);

        String expectedQuery = "\"SELECT\n"
                + "\\\"dbo\\\".\" +\"\\\"\" + context.input1 + \"\\\"\"+ \".id, \\\"B\\\".name\n"
                + "FROM\n"
                + " \\\"dbo\\\".\" +\"\\\"\" + context.input1 + \"\\\"\"+ \" , \" +\"\\\"dbo\\\"\"+\".\"+\"\\\"\" +((String)globalMap.get(\"input2\"))+ \"\\\"\"+ \" \\\"B\\\"\n"
                + "WHERE\n"
                + "  \\\"B\\\".id = \\\"dbo\\\".\" +\"\\\"\" + context.input1 + \"\\\"\"+ \".id\"";
        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithSelectAndTableNameQuoteMysqlInnerJoinContextGlobalMapTableNameNormalSchema2() {
        String schema = "dbo";
        String inputTable1 = "context.input1";
        String alias1 = "";
        String targetTable = "tar";
        String inputTable2 = "((String)globalMap.get(\"input2\"))";
        String alias2 = "B";
        boolean addQuotesInTableNames = true;
        String joinType = "INNER_JOIN";
        boolean isUpdate = false;
        String dbType = "mysql_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);

        String expectedQuery = "\"SELECT\n" + "`dbo`.\" +\"`\" + context.input1 + \"`\"+ \".id, `B`.name\n" + "FROM\n"
                + " `dbo`.\" +\"`\" + context.input1 + \"`\"+ \" INNER JOIN  "
                + "\" +\"`dbo`\"+\".\"+\"`\" +((String)globalMap.get(\"input2\"))+ \"`\"+ \" `B`"
                + " ON(  `B`.id = `dbo`.\" +\"`\" + context.input1 + \"`\"+ \".id )\"";
        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithSelectAndTableNameQuoteMysqlNoJoinContextGlobalMapTableNameNormalSchema2() {
        String schema = "dbo";
        String inputTable1 = "context.input1";
        String alias1 = "";
        String targetTable = "tar";
        String inputTable2 = "((String)globalMap.get(\"input2\"))";
        String alias2 = "B";
        boolean addQuotesInTableNames = true;
        String joinType = "NO_JOIN";
        boolean isUpdate = false;
        String dbType = "mysql_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);

        String expectedQuery = "\"SELECT\n" + "`dbo`.\" +\"`\" + context.input1 + \"`\"+ \".id, `B`.name\n" + "FROM\n"
                + " `dbo`.\" +\"`\" + context.input1 + \"`\"+ \" , \" +\"`dbo`\"+\".\"+\"`\" +((String)globalMap.get(\"input2\"))+ \"`\"+ \" `B`\n"
                + "WHERE\n" + "  `B`.id = `dbo`.\" +\"`\" + context.input1 + \"`\"+ \".id\"";
        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithSelectAndTableNameQuoteSnowflakeInnerJoinNormalTableNameNormalSchema() {
        String schema = "dbo";
        String inputTable1 = "input1";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "input2";
        String alias2 = "";
        boolean addQuotesInTableNames = true;
        String joinType = "INNER_JOIN";
        boolean isUpdate = false;
        String dbType = "snowflake_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);

        String expectedQuery = "\"SELECT\n"
                + "\\\"A\\\".id, \\\"dbo\\\".\\\"input2\\\".name\n" + "FROM\n"
                + " \" +\"\\\"dbo\\\"\"+\".\"+\"\\\"input1\\\"\"+ \" \\\"A\\\" INNER JOIN  \\\"dbo\\\".\\\"input2\\\""
                + " ON(  \\\"dbo\\\".\\\"input2\\\".id = \\\"A\\\".id )\"";
        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithSelectAndTableNameQuoteSnowflakeNoJoinNormalTableNameNormalSchema() {
        String schema = "dbo";
        String inputTable1 = "input1";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "input2";
        String alias2 = "";
        boolean addQuotesInTableNames = true;
        String joinType = "NO_JOIN";
        boolean isUpdate = false;
        String dbType = "snowflake_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);

        String expectedQuery = "\"SELECT\n"
                + "\\\"A\\\".id, \\\"dbo\\\".\\\"input2\\\".name\n" + "FROM\n"
                + " \" +\"\\\"dbo\\\"\"+\".\"+\"\\\"input1\\\"\"+ \" \\\"A\\\" , \\\"dbo\\\".\\\"input2\\\"\n"
                + "WHERE\n" + "  \\\"dbo\\\".\\\"input2\\\".id = \\\"A\\\".id\"";
        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithSelectAndTableNameQuoteMysqlInnerJoinNormalTableNameNormalSchema() {
        String schema = "dbo";
        String inputTable1 = "input1";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "input2";
        String alias2 = "";
        boolean addQuotesInTableNames = true;
        String joinType = "INNER_JOIN";
        boolean isUpdate = false;
        String dbType = "mysql_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);

        String expectedQuery = "\"SELECT\n" + "`A`.id, `dbo`.`input2`.name\n" + "FROM\n"
                + " \" +\"`dbo`\"+\".\"+\"`input1`\"+ \" `A` INNER JOIN  `dbo`.`input2`"
                + " ON(  `dbo`.`input2`.id = `A`.id )\"";
        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithSelectAndTableNameQuoteMysqlNoJoinNormalTableNameNormalSchema() {
        String schema = "dbo";
        String inputTable1 = "input1";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "input2";
        String alias2 = "";
        boolean addQuotesInTableNames = true;
        String joinType = "NO_JOIN";
        boolean isUpdate = false;
        String dbType = "mysql_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);

        String expectedQuery = "\"SELECT\n" + "`A`.id, `dbo`.`input2`.name\n" + "FROM\n"
                + " \" +\"`dbo`\"+\".\"+\"`input1`\"+ \" `A` , `dbo`.`input2`\n" + "WHERE\n"
                + "  `dbo`.`input2`.id = `A`.id\"";
        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithSelectAndTableNameQuoteSnowflakeInnerJoinContextGlobalMapTableNameNoSchema() {
        String schema = "";
        String inputTable1 = "context.input1";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "((String)globalMap.get(\"input2\"))";
        String alias2 = "";
        boolean addQuotesInTableNames = true;
        String joinType = "INNER_JOIN";
        boolean isUpdate = false;
        String dbType = "snowflake_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, targetTable);

        String expectedQuery = "\"SELECT\n"
                + "\\\"A\\\".id, \" +\"\\\"\" + ((String)globalMap.get(\"input2\")) + \"\\\"\"+ \".newColumn1\n"
                + "FROM\n"
                + " \" +\"\\\"\" +context.input1+ \"\\\"\"+ \" \\\"A\\\" INNER JOIN  \" +\"\\\"\" + ((String)globalMap.get(\"input2\")) + \"\\\"\"+ \""
                + " ON(  \" +\"\\\"\" + ((String)globalMap.get(\"input2\")) + \"\\\"\"+ \".id = \\\"A\\\".id )\"";
        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithSelectAndTableNameQuoteSnowflakeNoJoinContextGlobalMapTableNameNoSchema() {
        String schema = "";
        String inputTable1 = "context.input1";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "((String)globalMap.get(\"input2\"))";
        String alias2 = "";
        boolean addQuotesInTableNames = true;
        String joinType = "NO_JOIN";
        boolean isUpdate = false;
        String dbType = "snowflake_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, targetTable);

        String expectedQuery = "\"SELECT\n"
                + "\\\"A\\\".id, \" +\"\\\"\" + ((String)globalMap.get(\"input2\")) + \"\\\"\"+ \".newColumn1\n"
                + "FROM\n"
                + " \" +\"\\\"\" +context.input1+ \"\\\"\"+ \" \\\"A\\\" , \" +\"\\\"\" + ((String)globalMap.get(\"input2\")) + \"\\\"\"+ \"\n"
                + "WHERE\n" + "  \" +\"\\\"\" + ((String)globalMap.get(\"input2\")) + \"\\\"\"+ \".id = \\\"A\\\".id\"";
        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithSelectAndTableNameQuoteMysqlInnerJoinContextGlobalMapTableNameNoSchema() {
        String schema = "";
        String inputTable1 = "context.input1";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "((String)globalMap.get(\"input2\"))";
        String alias2 = "";
        boolean addQuotesInTableNames = true;
        String joinType = "INNER_JOIN";
        boolean isUpdate = false;
        String dbType = "mysql_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, targetTable);

        String expectedQuery = "\"SELECT\n"
                + "`A`.id, \" +\"`\" + ((String)globalMap.get(\"input2\")) + \"`\"+ \".newColumn1\n" + "FROM\n"
                + " \" +\"`\" +context.input1+ \"`\"+ \" `A` INNER JOIN  \" +\"`\" + ((String)globalMap.get(\"input2\")) + \"`\"+ \""
                + " ON(  \" +\"`\" + ((String)globalMap.get(\"input2\")) + \"`\"+ \".id = `A`.id )\"";
        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithSelectAndTableNameQuoteMysqlNoJoinContextGlobalMapTableNameNoSchema() {
        String schema = "";
        String inputTable1 = "context.input1";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "((String)globalMap.get(\"input2\"))";
        String alias2 = "";
        boolean addQuotesInTableNames = true;
        String joinType = "NO_JOIN";
        boolean isUpdate = false;
        String dbType = "mysql_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, targetTable);

        String expectedQuery = "\"SELECT\n"
                + "`A`.id, \" +\"`\" + ((String)globalMap.get(\"input2\")) + \"`\"+ \".newColumn1\n" + "FROM\n"
                + " \" +\"`\" +context.input1+ \"`\"+ \" `A` , \" +\"`\" + ((String)globalMap.get(\"input2\")) + \"`\"+ \"\n"
                + "WHERE\n" + "  \" +\"`\" + ((String)globalMap.get(\"input2\")) + \"`\"+ \".id = `A`.id\"";
        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithSelectAndTableNameQuoteSnowflakeInnerJoinContextGlobalMapTableNameNoSchema2() {
        String schema = "";
        String inputTable1 = "context.input1";
        String alias1 = "";
        String targetTable = "tar";
        String inputTable2 = "((String)globalMap.get(\"input2\"))";
        String alias2 = "B";
        boolean addQuotesInTableNames = true;
        String joinType = "INNER_JOIN";
        boolean isUpdate = false;
        String dbType = "snowflake_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, targetTable);

        String expectedQuery = "\"SELECT\n"
                + "\" +\"\\\"\" + context.input1 + \"\\\"\"+ \".id, \\\"B\\\".name\n"
                + "FROM\n"
                + " \" +\"\\\"\" + context.input1 + \"\\\"\"+ \" INNER JOIN  \" +\"\\\"\" +((String)globalMap.get(\"input2\"))+ \"\\\"\"+ \" \\\"B\\\" "
                + "ON(  \\\"B\\\".id = \" +\"\\\"\" + context.input1 + \"\\\"\"+ \".id )\"";
        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithSelectAndTableNameQuoteSnowflakeNoJoinContextGlobalMapTableNameNoSchema2() {
        String schema = "";
        String inputTable1 = "context.input1";
        String alias1 = "";
        String targetTable = "tar";
        String inputTable2 = "((String)globalMap.get(\"input2\"))";
        String alias2 = "B";
        boolean addQuotesInTableNames = true;
        String joinType = "NO_JOIN";
        boolean isUpdate = false;
        String dbType = "snowflake_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, targetTable);

        String expectedQuery = "\"SELECT\n" + "\" +\"\\\"\" + context.input1 + \"\\\"\"+ \".id, \\\"B\\\".name\n"
                + "FROM\n"
                + " \" +\"\\\"\" + context.input1 + \"\\\"\"+ \" , \" +\"\\\"\" +((String)globalMap.get(\"input2\"))+ \"\\\"\"+ \" \\\"B\\\"\n"
                + "WHERE\n" + "  \\\"B\\\".id = \" +\"\\\"\" + context.input1 + \"\\\"\"+ \".id\"";
        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithSelectAndTableNameQuoteMysqlInnerJoinContextGlobalMapTableNameNoSchema2() {
        String schema = "";
        String inputTable1 = "context.input1";
        String alias1 = "";
        String targetTable = "tar";
        String inputTable2 = "((String)globalMap.get(\"input2\"))";
        String alias2 = "B";
        boolean addQuotesInTableNames = true;
        String joinType = "INNER_JOIN";
        boolean isUpdate = false;
        String dbType = "mysql_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, targetTable);

        String expectedQuery = "\"SELECT\n" + "\" +\"`\" + context.input1 + \"`\"+ \".id, `B`.name\n" + "FROM\n"
                + " \" +\"`\" + context.input1 + \"`\"+ \" INNER JOIN  \" +\"`\" +((String)globalMap.get(\"input2\"))+ \"`\"+ \" `B` "
                + "ON(  `B`.id = \" +\"`\" + context.input1 + \"`\"+ \".id )\"";
        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithSelectAndTableNameQuoteMysqlNoJoinContextGlobalMapTableNameNoSchema2() {
        String schema = "";
        String inputTable1 = "context.input1";
        String alias1 = "";
        String targetTable = "tar";
        String inputTable2 = "((String)globalMap.get(\"input2\"))";
        String alias2 = "B";
        boolean addQuotesInTableNames = true;
        String joinType = "NO_JOIN";
        boolean isUpdate = false;
        String dbType = "mysql_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, targetTable);

        String expectedQuery = "\"SELECT\n" + "\" +\"`\" + context.input1 + \"`\"+ \".id, `B`.name\n" + "FROM\n"
                + " \" +\"`\" + context.input1 + \"`\"+ \" , \" +\"`\" +((String)globalMap.get(\"input2\"))+ \"`\"+ \" `B`\n"
                + "WHERE\n" + "  `B`.id = \" +\"`\" + context.input1 + \"`\"+ \".id\"";
        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithSelectAndTableNameQuoteSnowflakeInnerJoinNormalTableNameNoSchema() {
        String schema = "";
        String inputTable1 = "input1";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "input2";
        String alias2 = "";
        boolean addQuotesInTableNames = true;
        String joinType = "INNER_JOIN";
        boolean isUpdate = false;
        String dbType = "snowflake_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, targetTable);

        String expectedQuery = "\"SELECT\n" + "\\\"A\\\".id, \\\"input2\\\".name\n"
                + "FROM\n"
                + " \" +\"\\\"input1\\\"\"+ \" \\\"A\\\" INNER JOIN  \\\"input2\\\" ON(  \\\"input2\\\".id = \\\"A\\\".id )\"";
        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithSelectAndTableNameQuoteSnowflakeNoJoinNormalTableNameNoSchema() {
        String schema = "";
        String inputTable1 = "input1";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "input2";
        String alias2 = "";
        boolean addQuotesInTableNames = true;
        String joinType = "NO_JOIN";
        boolean isUpdate = false;
        String dbType = "snowflake_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, targetTable);

        String expectedQuery = "\"SELECT\n" + "\\\"A\\\".id, \\\"input2\\\".name\n" + "FROM\n"
                + " \" +\"\\\"input1\\\"\"+ \" \\\"A\\\" , \\\"input2\\\"\n" + "WHERE\n"
                + "  \\\"input2\\\".id = \\\"A\\\".id\"";
        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithSelectAndTableNameQuoteMysqlInnerJoinNormalTableNameNoSchema() {
        String schema = "";
        String inputTable1 = "input1";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "input2";
        String alias2 = "";
        boolean addQuotesInTableNames = true;
        String joinType = "INNER_JOIN";
        boolean isUpdate = false;
        String dbType = "mysql_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, targetTable);

        String expectedQuery = "\"SELECT\n" + "`A`.id, `input2`.name\n" + "FROM\n"
                + " \" +\"`input1`\"+ \" `A` INNER JOIN  `input2` ON(  `input2`.id = `A`.id )\"";
        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithSelectAndTableNameQuoteMysqlNoJoinNormalTableNameNoSchema() {
        String schema = "";
        String inputTable1 = "input1";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "input2";
        String alias2 = "";
        boolean addQuotesInTableNames = true;
        String joinType = "NO_JOIN";
        boolean isUpdate = false;
        String dbType = "mysql_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, targetTable);

        String expectedQuery = "\"SELECT\n" + "`A`.id, `input2`.name\n" + "FROM\n"
                + " \" +\"`input1`\"+ \" `A` , `input2`\n" + "WHERE\n" + "  `input2`.id = `A`.id\"";
        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithSelectAndTableNameQuoteSnowflakeInnerJoinContextGlobalMapTableNameGlobalMapSchema() {
        String schema = "((String)globalMap.get(\"schema\"))";
        String inputTable1 = "context.input1";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "((String)globalMap.get(\"input2\"))";
        String alias2 = "";
        boolean addQuotesInTableNames = true;
        String joinType = "INNER_JOIN";
        boolean isUpdate = false;
        String dbType = "snowflake_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);

        String expectedQuery = "\"SELECT\n"
                + "\\\"A\\\".id, \" +\"\\\"\" + ((String)globalMap.get(\"schema\")) + \"\\\"\"+ \".\" +\"\\\"\" + ((String)globalMap.get(\"input2\")) + \"\\\"\"+ \".newColumn1\n"
                + "FROM\n"
                + " \" +\"\\\"\" +((String)globalMap.get(\"schema\"))+ \"\\\"\"+\".\"+\"\\\"\" +context.input1+ \"\\\"\"+ \" \\\"A\\\" INNER JOIN  \" +\"\\\"\" + "
                + "((String)globalMap.get(\"schema\")) + \"\\\"\"+ \".\" +\"\\\"\" + ((String)globalMap.get(\"input2\")) + \"\\\"\"+ \" "
                + "ON(  \" +\"\\\"\" + ((String)globalMap.get(\"schema\")) + \"\\\"\"+ \".\" +\"\\\"\" + ((String)globalMap.get(\"input2\")) + \"\\\"\"+ \".id = \\\"A\\\".id )\"";
        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithSelectAndTableNameQuoteSnowflakeNoJoinContextGlobalMapTableNameGlobalMapSchema() {
        String schema = "((String)globalMap.get(\"schema\"))";
        String inputTable1 = "context.input1";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "((String)globalMap.get(\"input2\"))";
        String alias2 = "";
        boolean addQuotesInTableNames = true;
        String joinType = "NO_JOIN";
        boolean isUpdate = false;
        String dbType = "snowflake_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);

        String expectedQuery = "\"SELECT\n"
                + "\\\"A\\\".id, \" +\"\\\"\" + ((String)globalMap.get(\"schema\")) + \"\\\"\"+ \".\" +\"\\\"\" + ((String)globalMap.get(\"input2\")) + \"\\\"\"+ \".newColumn1\n"
                + "FROM\n"
                + " \" +\"\\\"\" +((String)globalMap.get(\"schema\"))+ \"\\\"\"+\".\"+\"\\\"\" +context.input1+ \"\\\"\"+ \" \\\"A\\\" , \" +\"\\\"\" + ((String)globalMap.get(\"schema\")) + \"\\\"\"+ \".\" +\"\\\"\" + ((String)globalMap.get(\"input2\")) + \"\\\"\"+ \"\n"
                + "WHERE\n"
                + "  \" +\"\\\"\" + ((String)globalMap.get(\"schema\")) + \"\\\"\"+ \".\" +\"\\\"\" + ((String)globalMap.get(\"input2\")) + \"\\\"\"+ \".id = \\\"A\\\".id\"";
        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithSelectAndTableNameQuoteMysqlInnerJoinContextGlobalMapTableNameGlobalMapSchema() {
        String schema = "((String)globalMap.get(\"schema\"))";
        String inputTable1 = "context.input1";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "((String)globalMap.get(\"input2\"))";
        String alias2 = "";
        boolean addQuotesInTableNames = true;
        String joinType = "INNER_JOIN";
        boolean isUpdate = false;
        String dbType = "mysql_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);

        String expectedQuery = "\"SELECT\n"
                + "`A`.id, \" +\"`\" + ((String)globalMap.get(\"schema\")) + \"`\"+ \".\" +\"`\" + ((String)globalMap.get(\"input2\")) + \"`\"+ \".newColumn1\n"
                + "FROM\n"
                + " \" +\"`\" +((String)globalMap.get(\"schema\"))+ \"`\"+\".\"+\"`\" +context.input1+ \"`\"+ \" `A` INNER JOIN  \" +\"`\" + "
                + "((String)globalMap.get(\"schema\")) + \"`\"+ \".\" +\"`\" + ((String)globalMap.get(\"input2\")) + \"`\"+ \" "
                + "ON(  \" +\"`\" + ((String)globalMap.get(\"schema\")) + \"`\"+ \".\" +\"`\" + ((String)globalMap.get(\"input2\")) + \"`\"+ \".id = `A`.id )\"";
        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithSelectAndTableNameQuoteMysqlNoJoinContextGlobalMapTableNameGlobalMapSchema() {
        String schema = "((String)globalMap.get(\"schema\"))";
        String inputTable1 = "context.input1";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "((String)globalMap.get(\"input2\"))";
        String alias2 = "";
        boolean addQuotesInTableNames = true;
        String joinType = "NO_JOIN";
        boolean isUpdate = false;
        String dbType = "mysql_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);

        String expectedQuery = "\"SELECT\n"
                + "`A`.id, \" +\"`\" + ((String)globalMap.get(\"schema\")) + \"`\"+ \".\" +\"`\" + ((String)globalMap.get(\"input2\")) + \"`\"+ \".newColumn1\n"
                + "FROM\n"
                + " \" +\"`\" +((String)globalMap.get(\"schema\"))+ \"`\"+\".\"+\"`\" +context.input1+ \"`\"+ \" `A` , \" +\"`\" + ((String)globalMap.get(\"schema\")) + \"`\"+ \".\" +\"`\" + ((String)globalMap.get(\"input2\")) + \"`\"+ \"\n"
                + "WHERE\n"
                + "  \" +\"`\" + ((String)globalMap.get(\"schema\")) + \"`\"+ \".\" +\"`\" + ((String)globalMap.get(\"input2\")) + \"`\"+ \".id = `A`.id\"";
        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithSelectAndTableNameQuoteSnowflakeInnerJoinContextGlobalMapTableNameGlobalMapSchema2() {
        String schema = "((String)globalMap.get(\"schema\"))";
        String inputTable1 = "context.input1";
        String alias1 = "";
        String targetTable = "tar";
        String inputTable2 = "((String)globalMap.get(\"input2\"))";
        String alias2 = "B";
        boolean addQuotesInTableNames = true;
        String joinType = "INNER_JOIN";
        boolean isUpdate = false;
        String dbType = "snowflake_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);

        String expectedQuery = "\"SELECT\n"
                + "\" +\"\\\"\" + ((String)globalMap.get(\"schema\")) + \"\\\"\"+ \".\" +\"\\\"\" + context.input1 + \"\\\"\"+ \".newColumn, \\\"B\\\".name\n"
                + "FROM\n"
                + " \" +\"\\\"\" + ((String)globalMap.get(\"schema\")) + \"\\\"\"+ \".\" +\"\\\"\" + context.input1 + \"\\\"\"+ \" INNER JOIN"
                + "  \" +\"\\\"\" +((String)globalMap.get(\"schema\"))+ \"\\\"\"+\".\"+\"\\\"\" +((String)globalMap.get(\"input2\"))+ \"\\\"\"+ \" \\\"B\\\""
                + " ON(  \\\"B\\\".id = \" +\"\\\"\" + ((String)globalMap.get(\"schema\")) + \"\\\"\"+ \".\" +\"\\\"\" + context.input1 + \"\\\"\"+ \".newColumn )\"";
        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithSelectAndTableNameQuoteSnowflakeNoJoinContextGlobalMapTableNameGlobalMapSchema2() {
        String schema = "((String)globalMap.get(\"schema\"))";
        String inputTable1 = "context.input1";
        String alias1 = "";
        String targetTable = "tar";
        String inputTable2 = "((String)globalMap.get(\"input2\"))";
        String alias2 = "B";
        boolean addQuotesInTableNames = true;
        String joinType = "NO_JOIN";
        boolean isUpdate = false;
        String dbType = "snowflake_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);

        String expectedQuery = "\"SELECT\n"
                + "\" +\"\\\"\" + ((String)globalMap.get(\"schema\")) + \"\\\"\"+ \".\" +\"\\\"\" + context.input1 + \"\\\"\"+ \".newColumn, \\\"B\\\".name\n"
                + "FROM\n"
                + " \" +\"\\\"\" + ((String)globalMap.get(\"schema\")) + \"\\\"\"+ \".\" +\"\\\"\" + context.input1 + \"\\\"\"+ \" , \" +\"\\\"\" +((String)globalMap.get(\"schema\"))+ \"\\\"\"+\".\"+\"\\\"\" +((String)globalMap.get(\"input2\"))+ \"\\\"\"+ \" \\\"B\\\"\n"
                + "WHERE\n"
                + "  \\\"B\\\".id = \" +\"\\\"\" + ((String)globalMap.get(\"schema\")) + \"\\\"\"+ \".\" +\"\\\"\" + context.input1 + \"\\\"\"+ \".newColumn\"";
        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithSelectAndTableNameQuoteMysqlInnerJoinContextGlobalMapTableNameGlobalMapSchema2() {
        String schema = "((String)globalMap.get(\"schema\"))";
        String inputTable1 = "context.input1";
        String alias1 = "";
        String targetTable = "tar";
        String inputTable2 = "((String)globalMap.get(\"input2\"))";
        String alias2 = "B";
        boolean addQuotesInTableNames = true;
        String joinType = "INNER_JOIN";
        boolean isUpdate = false;
        String dbType = "mysql_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);

        String expectedQuery = "\"SELECT\n"
                + "\" +\"`\" + ((String)globalMap.get(\"schema\")) + \"`\"+ \".\" +\"`\" + context.input1 + \"`\"+ \".newColumn, `B`.name\n"
                + "FROM\n"
                + " \" +\"`\" + ((String)globalMap.get(\"schema\")) + \"`\"+ \".\" +\"`\" + context.input1 + \"`\"+ \" INNER JOIN"
                + "  \" +\"`\" +((String)globalMap.get(\"schema\"))+ \"`\"+\".\"+\"`\" +((String)globalMap.get(\"input2\"))+ \"`\"+ \" `B`"
                + " ON(  `B`.id = \" +\"`\" + ((String)globalMap.get(\"schema\")) + \"`\"+ \".\" +\"`\" + context.input1 + \"`\"+ \".newColumn )\"";
        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithSelectAndTableNameQuoteMysqlNoJoinContextGlobalMapTableNameGlobalMapSchema2() {
        String schema = "((String)globalMap.get(\"schema\"))";
        String inputTable1 = "context.input1";
        String alias1 = "";
        String targetTable = "tar";
        String inputTable2 = "((String)globalMap.get(\"input2\"))";
        String alias2 = "B";
        boolean addQuotesInTableNames = true;
        String joinType = "NO_JOIN";
        boolean isUpdate = false;
        String dbType = "mysql_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);

        String expectedQuery = "\"SELECT\n"
                + "\" +\"`\" + ((String)globalMap.get(\"schema\")) + \"`\"+ \".\" +\"`\" + context.input1 + \"`\"+ \".newColumn, `B`.name\n"
                + "FROM\n"
                + " \" +\"`\" + ((String)globalMap.get(\"schema\")) + \"`\"+ \".\" +\"`\" + context.input1 + \"`\"+ \" , \" +\"`\" +((String)globalMap.get(\"schema\"))+ \"`\"+\".\"+\"`\" +((String)globalMap.get(\"input2\"))+ \"`\"+ \" `B`\n"
                + "WHERE\n"
                + "  `B`.id = \" +\"`\" + ((String)globalMap.get(\"schema\")) + \"`\"+ \".\" +\"`\" + context.input1 + \"`\"+ \".newColumn\"";
        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithSelectAndTableNameQuoteSnowflakeInnerJoinNormalTableNameGlobalMapSchema() {
        String schema = "((String)globalMap.get(\"schema\"))";
        String inputTable1 = "input1";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "input2";
        String alias2 = "";
        boolean addQuotesInTableNames = true;
        String joinType = "INNER_JOIN";
        boolean isUpdate = false;
        String dbType = "snowflake_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);

        String expectedQuery = "\"SELECT\n"
                + "\\\"A\\\".id, \" +\"\\\"\" + ((String)globalMap.get(\"schema\")) + \"\\\"\"+ \".\\\"input2\\\".newColumn1\n"
                + "FROM\n"
                + " \" +\"\\\"\" +((String)globalMap.get(\"schema\"))+ \"\\\"\"+\".\"+\"\\\"input1\\\"\"+ \" \\\"A\\\" INNER JOIN"
                + "  \" +\"\\\"\" + ((String)globalMap.get(\"schema\")) + \"\\\"\"+ \".\\\"input2\\\" ON(  \" +\"\\\"\" + ((String)globalMap.get(\"schema\")) + \"\\\"\"+ \".\\\"input2\\\".id = \\\"A\\\".id )\"";
        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithSelectAndTableNameQuoteSnowflakeNoJoinNormalTableNameGlobalMapSchema() {
        String schema = "((String)globalMap.get(\"schema\"))";
        String inputTable1 = "input1";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "input2";
        String alias2 = "";
        boolean addQuotesInTableNames = true;
        String joinType = "NO_JOIN";
        boolean isUpdate = false;
        String dbType = "snowflake_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);

        String expectedQuery = "\"SELECT\n"
                + "\\\"A\\\".id, \" +\"\\\"\" + ((String)globalMap.get(\"schema\")) + \"\\\"\"+ \".\\\"input2\\\".newColumn1\n"
                + "FROM\n"
                + " \" +\"\\\"\" +((String)globalMap.get(\"schema\"))+ \"\\\"\"+\".\"+\"\\\"input1\\\"\"+ \" \\\"A\\\" , \" +\"\\\"\" + ((String)globalMap.get(\"schema\")) + \"\\\"\"+ \".\\\"input2\\\"\n"
                + "WHERE\n"
                + "  \" +\"\\\"\" + ((String)globalMap.get(\"schema\")) + \"\\\"\"+ \".\\\"input2\\\".id = \\\"A\\\".id\"";
        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithSelectAndTableNameQuoteMysqlInnerJoinNormalTableNameGlobalMapSchema() {
        String schema = "((String)globalMap.get(\"schema\"))";
        String inputTable1 = "input1";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "input2";
        String alias2 = "";
        boolean addQuotesInTableNames = true;
        String joinType = "INNER_JOIN";
        boolean isUpdate = false;
        String dbType = "mysql_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);

        String expectedQuery = "\"SELECT\n"
                + "`A`.id, \" +\"`\" + ((String)globalMap.get(\"schema\")) + \"`\"+ \".`input2`.newColumn1\n" + "FROM\n"
                + " \" +\"`\" +((String)globalMap.get(\"schema\"))+ \"`\"+\".\"+\"`input1`\"+ \" `A` INNER JOIN"
                + "  \" +\"`\" + ((String)globalMap.get(\"schema\")) + \"`\"+ \".`input2` ON(  \" +\"`\" + ((String)globalMap.get(\"schema\")) + \"`\"+ \".`input2`.id = `A`.id )\"";
        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithSelectAndTableNameQuoteMysqlNoJoinNormalTableNameGlobalMapSchema() {
        String schema = "((String)globalMap.get(\"schema\"))";
        String inputTable1 = "input1";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "input2";
        String alias2 = "";
        boolean addQuotesInTableNames = true;
        String joinType = "NO_JOIN";
        boolean isUpdate = false;
        String dbType = "mysql_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);

        String expectedQuery = "\"SELECT\n"
                + "`A`.id, \" +\"`\" + ((String)globalMap.get(\"schema\")) + \"`\"+ \".`input2`.newColumn1\n" + "FROM\n"
                + " \" +\"`\" +((String)globalMap.get(\"schema\"))+ \"`\"+\".\"+\"`input1`\"+ \" `A` , \" +\"`\" + ((String)globalMap.get(\"schema\")) + \"`\"+ \".`input2`\n"
                + "WHERE\n" + "  \" +\"`\" + ((String)globalMap.get(\"schema\")) + \"`\"+ \".`input2`.id = `A`.id\"";
        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithSelectAndNoQuoteNoJoinContextTableNameWithStringContextSchemaWithString() {
        String schema = "context.schema + \".DWH\"";
        String inputTable1 = "context.input1 +\".DIM_SITE\"";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "\"DIM_SITE2\"";
        String alias2 = "B";
        boolean addQuotesInTableNames = false;
        String joinType = "NO_JOIN";
        boolean isUpdate = false;
        String dbType = "snowflake_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);

        String expectedQuery = "\"SELECT\n"
                + "A.id, B.name\n"
                + "FROM\n"
                + " \" +context.schema + \".DWH\"+\".\"+context.input1 +\".DIM_SITE\"+ \" A , \" +context.schema + \".DWH\"+\".\"+\"DIM_SITE2\"+ \" B\n"
                + "WHERE\n"
                + "  B.id = A.id\"";
        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithSelectAndNoQuoteInnerJoinContextTableNameWithStringContextSchemaWithString() {
        String schema = "context.schema + \".DWH\"";
        String inputTable1 = "context.input1 +\".DIM_SITE\"";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "\"DIM_SITE2\"";
        String alias2 = "B";
        boolean addQuotesInTableNames = false;
        String joinType = "INNER_JOIN";
        boolean isUpdate = false;
        String dbType = "snowflake_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);

        String expectedQuery = "\"SELECT\n" + "A.id, B.name\n" + "FROM\n"
                + " \" +context.schema + \".DWH\"+\".\"+context.input1 +\".DIM_SITE\"+ \" A INNER JOIN  \" +context.schema + \".DWH\"+\".\"+\"DIM_SITE2\"+ \" B ON(  B.id = A.id )\"";
        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithSelectAndSnowFlakeQuoteNoJoinContextTableNameWithStringContextSchemaWithString() {
        String schema = "context.schema + \".DWH\"";
        String inputTable1 = "context.input1 +\".DIM_SITE\"";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "\"DIM_SITE2\"";
        String alias2 = "B";
        boolean addQuotesInTableNames = true;
        String joinType = "NO_JOIN";
        boolean isUpdate = false;
        String dbType = "snowflake_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);

        String expectedQuery = "\"SELECT\n" + "\\\"A\\\".id, \\\"B\\\".name\n" + "FROM\n"
                + " \" +\"\\\"\" +context.schema + \".DWH\"+ \"\\\"\"+\".\"+\"\\\"\" +context.input1 +\".DIM_SITE\"+ \"\\\"\"+ \" \\\"A\\\" , \" +\"\\\"\" +context.schema + \".DWH\"+ \"\\\"\"+\".\"+\"\\\"DIM_SITE2\\\"\"+ \" \\\"B\\\"\n"
                + "WHERE\n" + "  \\\"B\\\".id = \\\"A\\\".id\"";
        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithSelectAndMysqlQuoteNoJoinContextTableNameWithStringContextSchemaWithString() {
        String schema = "context.schema + \".DWH\"";
        String inputTable1 = "context.input1 +\".DIM_SITE\"";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "\"DIM_SITE2\"";
        String alias2 = "B";
        boolean addQuotesInTableNames = true;
        String joinType = "NO_JOIN";
        boolean isUpdate = false;
        String dbType = "mysql_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);

        String expectedQuery = "\"SELECT\n" + "`A`.id, `B`.name\n" + "FROM\n"
                + " \" +\"`\" +context.schema + \".DWH\"+ \"`\"+\".\"+\"`\" +context.input1 +\".DIM_SITE\"+ \"`\"+ \" `A` , \" +\"`\" +context.schema + \".DWH\"+ \"`\"+\".\"+\"`DIM_SITE2`\"+ \" `B`\n"
                + "WHERE\n" + "  `B`.id = `A`.id\"";
        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithUpdateAndNoQuoteNoJoinContextTableNameWithStringContextSchemaWithString() {
        String schema = "context.schema + \".DWH\"";
        String inputTable1 = "context.input1 +\".DIM_SITE\"";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "\"DIM_SITE2\"";
        String alias2 = "B";
        boolean addQuotesInTableNames = false;
        String joinType = "NO_JOIN";
        boolean isUpdate = true;
        String dbType = "snowflake_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);

        String expectedQuery = "\"UPDATE \" +context.schema + \".DWH.tar\n" + "SET tarColumn = A.id,\n"
                + "tarColumn1 = B.name\n" + "FROM\n"
                + " \" +context.schema + \".DWH\"+\".\"+context.input1 +\".DIM_SITE\"+ \" A , \" +context.schema + \".DWH\"+\".\"+\"DIM_SITE2\"+ \" B\n"
                + "WHERE\n" + "  B.id = A.id\"";
        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithUpdateAndNoQuoteInnerJoinContextTableNameWithStringContextSchemaWithString() {
        String schema = "context.schema + \".DWH\"";
        String inputTable1 = "context.input1 +\".DIM_SITE\"";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "\"DIM_SITE2\"";
        String alias2 = "B";
        boolean addQuotesInTableNames = false;
        String joinType = "INNER_JOIN";
        boolean isUpdate = true;
        String dbType = "snowflake_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);

        String expectedQuery = "\"UPDATE \" +context.schema + \".DWH.tar\n" + "SET tarColumn = A.id,\n"
                + "tarColumn1 = B.name\n" + "FROM\n"
                + " \" +context.schema + \".DWH\"+\".\"+context.input1 +\".DIM_SITE\"+ \" A INNER JOIN  \" +context.schema + \".DWH\"+\".\"+\"DIM_SITE2\"+ \" B ON(  B.id = A.id )\"";
        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithUpdateAndSnowFlakeQuoteNoJoinContextTableNameWithStringContextSchemaWithString() {
        String schema = "context.schema + \".DWH\"";
        String inputTable1 = "context.input1 +\".DIM_SITE\"";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "\"DIM_SITE2\"";
        String alias2 = "B";
        boolean addQuotesInTableNames = true;
        String joinType = "NO_JOIN";
        boolean isUpdate = true;
        String dbType = "snowflake_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);

        String expectedQuery = "\"UPDATE \"+ \"\\\"\" +context.schema + \".DWH\\\"\" +\".\\\"tar\\\"\n"
                + "SET tarColumn = \\\"A\\\".id,\n" + "tarColumn1 = \\\"B\\\".name\n" + "FROM\n"
                + " \" +\"\\\"\" +context.schema + \".DWH\"+ \"\\\"\"+\".\"+\"\\\"\" +context.input1 +\".DIM_SITE\"+ \"\\\"\"+ \" \\\"A\\\" , \" +\"\\\"\" +context.schema + \".DWH\"+ \"\\\"\"+\".\"+\"\\\"DIM_SITE2\\\"\"+ \" \\\"B\\\"\n"
                + "WHERE\n" + "  \\\"B\\\".id = \\\"A\\\".id\"";
        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithUpdateAndMysqlQuoteNoJoinContextTableNameWithStringContextSchemaWithString() {
        String schema = "context.schema + \".DWH\"";
        String inputTable1 = "context.input1 +\".DIM_SITE\"";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "\"DIM_SITE2\"";
        String alias2 = "B";
        boolean addQuotesInTableNames = true;
        String joinType = "NO_JOIN";
        boolean isUpdate = true;
        String dbType = "mysql_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);

        String expectedQuery = "\"UPDATE \"+ \"`\" +context.schema + \".DWH`\" +\".`tar`\n"
                + "SET tarColumn = `A`.id,\n" + "tarColumn1 = `B`.name\n" + "FROM\n"
                + " \" +\"`\" +context.schema + \".DWH\"+ \"`\"+\".\"+\"`\" +context.input1 +\".DIM_SITE\"+ \"`\"+ \" `A` , \" +\"`\" +context.schema + \".DWH\"+ \"`\"+\".\"+\"`DIM_SITE2`\"+ \" `B`\n"
                + "WHERE\n" + "  `B`.id = `A`.id\"";
        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithSelectAndNoQuoteNoJoinGlobalMapTableNameWithStringGlobalMapSchemaWithString() {
        String schema = "((String)globalMap.get(\"schema\")) + \".DWH\"";
        String inputTable1 = "((String)globalMap.get(\"input1\")) +\".DIM_SITE\"";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "\"DIM_SITE2\"";
        String alias2 = "B";
        boolean addQuotesInTableNames = false;
        String joinType = "NO_JOIN";
        boolean isUpdate = false;
        String dbType = "snowflake_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);

        String expectedQuery = "\"SELECT\n" + "A.id, B.name\n" + "FROM\n"
                + " \" +((String)globalMap.get(\"schema\")) + \".DWH\"+\".\"+((String)globalMap.get(\"input1\")) +\".DIM_SITE\"+ \" A , \" +((String)globalMap.get(\"schema\")) + \".DWH\"+\".\"+\"DIM_SITE2\"+ \" B\n"
                + "WHERE\n" + "  B.id = A.id\"";
        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithSelectAndNoQuoteInnerJoinGlobalMapTableNameWithStringGlobalMapSchemaWithString() {
        String schema = "((String)globalMap.get(\"schema\")) + \".DWH\"";
        String inputTable1 = "((String)globalMap.get(\"input1\")) +\".DIM_SITE\"";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "\"DIM_SITE2\"";
        String alias2 = "B";
        boolean addQuotesInTableNames = false;
        String joinType = "INNER_JOIN";
        boolean isUpdate = false;
        String dbType = "snowflake_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);

        String expectedQuery = "\"SELECT\n" + "A.id, B.name\n" + "FROM\n"
                + " \" +((String)globalMap.get(\"schema\")) + \".DWH\"+\".\"+((String)globalMap.get(\"input1\")) +\".DIM_SITE\"+ \" A INNER JOIN  \" +((String)globalMap.get(\"schema\")) + \".DWH\"+\".\"+\"DIM_SITE2\"+ \" B ON(  B.id = A.id )\"";
        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithSelectAndSnowFlakeQuoteNoJoinGlobalMapTableNameWithStringGlobalMapSchemaWithString() {
        String schema = "((String)globalMap.get(\"schema\")) + \".DWH\"";
        String inputTable1 = "((String)globalMap.get(\"input1\")) +\".DIM_SITE\"";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "\"DIM_SITE2\"";
        String alias2 = "B";
        boolean addQuotesInTableNames = true;
        String joinType = "NO_JOIN";
        boolean isUpdate = false;
        String dbType = "snowflake_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);

        String expectedQuery = "\"SELECT\n" + "\\\"A\\\".id, \\\"B\\\".name\n" + "FROM\n"
                + " \" +\"\\\"\" +((String)globalMap.get(\"schema\")) + \".DWH\"+ \"\\\"\"+\".\"+\"\\\"\" +((String)globalMap.get(\"input1\")) +\".DIM_SITE\"+ \"\\\"\"+ \" \\\"A\\\" , \" +\"\\\"\" +((String)globalMap.get(\"schema\")) + \".DWH\"+ \"\\\"\"+\".\"+\"\\\"DIM_SITE2\\\"\"+ \" \\\"B\\\"\n"
                + "WHERE\n" + "  \\\"B\\\".id = \\\"A\\\".id\"";
        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithSelectAndMysqlQuoteNoJoinGlobalMapTableNameWithStringGlobalMapSchemaWithString() {
        String schema = "((String)globalMap.get(\"schema\")) + \".DWH\"";
        String inputTable1 = "((String)globalMap.get(\"input1\")) +\".DIM_SITE\"";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "\"DIM_SITE2\"";
        String alias2 = "B";
        boolean addQuotesInTableNames = true;
        String joinType = "NO_JOIN";
        boolean isUpdate = false;
        String dbType = "mysql_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);

        String expectedQuery = "\"SELECT\n" + "`A`.id, `B`.name\n" + "FROM\n"
                + " \" +\"`\" +((String)globalMap.get(\"schema\")) + \".DWH\"+ \"`\"+\".\"+\"`\" +((String)globalMap.get(\"input1\")) +\".DIM_SITE\"+ \"`\"+ \" `A` , \" +\"`\" +((String)globalMap.get(\"schema\")) + \".DWH\"+ \"`\"+\".\"+\"`DIM_SITE2`\"+ \" `B`\n"
                + "WHERE\n" + "  `B`.id = `A`.id\"";
        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithUpdateAndNoQuoteNoJoinGlobalMapTableNameWithStringGlobalMapSchemaWithString() {
        String schema = "((String)globalMap.get(\"schema\")) + \".DWH\"";
        String inputTable1 = "((String)globalMap.get(\"input1\")) +\".DIM_SITE\"";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "\"DIM_SITE2\"";
        String alias2 = "B";
        boolean addQuotesInTableNames = false;
        String joinType = "NO_JOIN";
        boolean isUpdate = true;
        String dbType = "snowflake_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);

        String expectedQuery = "\"UPDATE \" +((String)globalMap.get(\"schema\")) + \".DWH.tar\n"
                + "SET tarColumn = A.id,\n" + "tarColumn1 = B.name\n" + "FROM\n"
                + " \" +((String)globalMap.get(\"schema\")) + \".DWH\"+\".\"+((String)globalMap.get(\"input1\")) +\".DIM_SITE\"+ \" A , \" +((String)globalMap.get(\"schema\")) + \".DWH\"+\".\"+\"DIM_SITE2\"+ \" B\n"
                + "WHERE\n" + "  B.id = A.id\"";
        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithUpdateAndNoQuoteInnerJoinGlobalMapTableNameWithStringGlobalMapSchemaWithString() {
        String schema = "((String)globalMap.get(\"schema\")) + \".DWH\"";
        String inputTable1 = "((String)globalMap.get(\"input1\")) +\".DIM_SITE\"";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "\"DIM_SITE2\"";
        String alias2 = "B";
        boolean addQuotesInTableNames = false;
        String joinType = "INNER_JOIN";
        boolean isUpdate = true;
        String dbType = "snowflake_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);

        String expectedQuery = "\"UPDATE \" +((String)globalMap.get(\"schema\")) + \".DWH.tar\n"
                + "SET tarColumn = A.id,\n" + "tarColumn1 = B.name\n" + "FROM\n"
                + " \" +((String)globalMap.get(\"schema\")) + \".DWH\"+\".\"+((String)globalMap.get(\"input1\")) +\".DIM_SITE\"+ \" A INNER JOIN  \" +((String)globalMap.get(\"schema\")) + \".DWH\"+\".\"+\"DIM_SITE2\"+ \" B ON(  B.id = A.id )\"";
        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithUpdateAndSnowFlakeQuoteNoJoinGlobalMapTableNameWithStringGlobalMapSchemaWithString() {
        String schema = "((String)globalMap.get(\"schema\")) + \".DWH\"";
        String inputTable1 = "((String)globalMap.get(\"input1\")) +\".DIM_SITE\"";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "\"DIM_SITE2\"";
        String alias2 = "B";
        boolean addQuotesInTableNames = true;
        String joinType = "NO_JOIN";
        boolean isUpdate = true;
        String dbType = "snowflake_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);

        String expectedQuery =
                "\"UPDATE \"+ \"\\\"\" +((String)globalMap.get(\"schema\")) + \".DWH\\\"\" +\".\\\"tar\\\"\n"
                        + "SET tarColumn = \\\"A\\\".id,\n" + "tarColumn1 = \\\"B\\\".name\n" + "FROM\n"
                        + " \" +\"\\\"\" +((String)globalMap.get(\"schema\")) + \".DWH\"+ \"\\\"\"+\".\"+\"\\\"\" +((String)globalMap.get(\"input1\")) +\".DIM_SITE\"+ \"\\\"\"+ \" \\\"A\\\" , \" +\"\\\"\" +((String)globalMap.get(\"schema\")) + \".DWH\"+ \"\\\"\"+\".\"+\"\\\"DIM_SITE2\\\"\"+ \" \\\"B\\\"\n"
                        + "WHERE\n" + "  \\\"B\\\".id = \\\"A\\\".id\"";
        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithUpdateAndMysqlQuoteNoJoinGlobalMapTableNameWithStringGlobalMapSchemaWithString() {
        String schema = "((String)globalMap.get(\"schema\")) + \".DWH\"";
        String inputTable1 = "((String)globalMap.get(\"input1\")) +\".DIM_SITE\"";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "\"DIM_SITE2\"";
        String alias2 = "B";
        boolean addQuotesInTableNames = true;
        String joinType = "NO_JOIN";
        boolean isUpdate = true;
        String dbType = "mysql_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);

        String expectedQuery = "\"UPDATE \"+ \"`\" +((String)globalMap.get(\"schema\")) + \".DWH`\" +\".`tar`\n"
                + "SET tarColumn = `A`.id,\n" + "tarColumn1 = `B`.name\n" + "FROM\n"
                + " \" +\"`\" +((String)globalMap.get(\"schema\")) + \".DWH\"+ \"`\"+\".\"+\"`\" +((String)globalMap.get(\"input1\")) +\".DIM_SITE\"+ \"`\"+ \" `A` , \" +\"`\" +((String)globalMap.get(\"schema\")) + \".DWH\"+ \"`\"+\".\"+\"`DIM_SITE2`\"+ \" `B`\n"
                + "WHERE\n" + "  `B`.id = `A`.id\"";
        assertEquals(expectedQuery, query);

    }

    /**
     * _complex Tests are the case of "String" + context.schema/globalMap("schem") + "String"
     */
    @Test
    public void testELTMapJoinWithUpdateAndMysqlQuoteNoJoinGlobalMapTableNameWithStringGlobalMapSchemaWithString_complex() {
        String schema = "\"prefix\" + ((String)globalMap.get(\"schema\")) + \".DWH\"";
        String inputTable1 = "\"prefix\"+((String)globalMap.get(\"input1\")) +\".DIM_SITE\"";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "\"DIM_SITE2\"";
        String alias2 = "B";
        boolean addQuotesInTableNames = true;
        String joinType = "NO_JOIN";
        boolean isUpdate = true;
        String dbType = "mysql_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);

        String expectedQuery = "\"UPDATE \"+ \"`prefix\" + ((String)globalMap.get(\"schema\")) + \".DWH`\" +\".`tar`\n"
                + "SET tarColumn = `A`.id,\n" + "tarColumn1 = `B`.name\n" + "FROM\n"
                + " \" +\"`\" +\"prefix\" + ((String)globalMap.get(\"schema\")) + \".DWH\"+ \"`\"+\".\"+\"`\" +\"prefix\"+((String)globalMap.get(\"input1\")) +\".DIM_SITE\"+ \"`\"+ \" `A` , \" +\"`\" +\"prefix\" + ((String)globalMap.get(\"schema\")) + \".DWH\"+ \"`\"+\".\"+\"`DIM_SITE2`\"+ \" `B`\n"
                + "WHERE\n" + "  `B`.id = `A`.id\"";
        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithUpdateAndMysqlQuoteNoJoinContextTableNameWithStringContextSchemaWithString_complex() {
        String schema = "\"prefix\"+ context.schema + \".DWH\"";
        String inputTable1 = "\"prefix\"+ context.input1 +\".DIM_SITE\"";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "\"DIM_SITE2\"";
        String alias2 = "B";
        boolean addQuotesInTableNames = true;
        String joinType = "NO_JOIN";
        boolean isUpdate = true;
        String dbType = "mysql_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);

        String expectedQuery = "\"UPDATE \"+ \"`prefix\"+ context.schema + \".DWH`\" +\".`tar`\n"
                + "SET tarColumn = `A`.id,\n" + "tarColumn1 = `B`.name\n" + "FROM\n"
                + " \" +\"`\" +\"prefix\"+ context.schema + \".DWH\"+ \"`\"+\".\"+\"`\" +\"prefix\"+ context.input1 +\".DIM_SITE\"+ \"`\"+ \" `A` , \" +\"`\" +\"prefix\"+ context.schema + \".DWH\"+ \"`\"+\".\"+\"`DIM_SITE2`\"+ \" `B`\n"
                + "WHERE\n" + "  `B`.id = `A`.id\"";
        assertEquals(expectedQuery, query);

    }

    @Test
    public void
            testELTMapJoinWithUpdateAndSnowFlakeQuoteNoJoinGlobalMapTableNameWithStringGlobalMapSchemaWithString_complex() {
        String schema = "\"prefix\" + ((String)globalMap.get(\"schema\")) + \".DWH\"";
        String inputTable1 = "\"prefix\"+((String)globalMap.get(\"input1\")) +\".DIM_SITE\"";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "\"DIM_SITE2\"";
        String alias2 = "B";
        boolean addQuotesInTableNames = true;
        String joinType = "NO_JOIN";
        boolean isUpdate = true;
        String dbType = "snowflake_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);

        String expectedQuery =
                "\"UPDATE \"+ \"\\\"prefix\" + ((String)globalMap.get(\"schema\")) + \".DWH\\\"\" +\".\\\"tar\\\"\n"
                        + "SET tarColumn = \\\"A\\\".id,\n" + "tarColumn1 = \\\"B\\\".name\n" + "FROM\n"
                        + " \" +\"\\\"\" +\"prefix\" + ((String)globalMap.get(\"schema\")) + \".DWH\"+ \"\\\"\"+\".\"+\"\\\"\" +\"prefix\"+((String)globalMap.get(\"input1\")) +\".DIM_SITE\"+ \"\\\"\"+ \" \\\"A\\\" , \" +\"\\\"\" +\"prefix\" + ((String)globalMap.get(\"schema\")) + \".DWH\"+ \"\\\"\"+\".\"+\"\\\"DIM_SITE2\\\"\"+ \" \\\"B\\\"\n"
                        + "WHERE\n" + "  \\\"B\\\".id = \\\"A\\\".id\"";
        assertEquals(expectedQuery, query);

    }

    @Test
    public void
            testELTMapJoinWithUpdateAndSnowFlakeQuoteNoJoinContextTableNameWithStringContextSchemaWithString_complex() {
        String schema = "\"prefix\"+ context.schema + \".DWH\"";
        String inputTable1 = "\"prefix\"+ context.input1 +\".DIM_SITE\"";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "\"DIM_SITE2\"";
        String alias2 = "B";
        boolean addQuotesInTableNames = true;
        String joinType = "NO_JOIN";
        boolean isUpdate = true;
        String dbType = "snowflake_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);

        String expectedQuery = "\"UPDATE \"+ \"\\\"prefix\"+ context.schema + \".DWH\\\"\" +\".\\\"tar\\\"\n"
                + "SET tarColumn = \\\"A\\\".id,\n" + "tarColumn1 = \\\"B\\\".name\n" + "FROM\n"
                + " \" +\"\\\"\" +\"prefix\"+ context.schema + \".DWH\"+ \"\\\"\"+\".\"+\"\\\"\" +\"prefix\"+ context.input1 +\".DIM_SITE\"+ \"\\\"\"+ \" \\\"A\\\" , \" +\"\\\"\" +\"prefix\"+ context.schema + \".DWH\"+ \"\\\"\"+\".\"+\"\\\"DIM_SITE2\\\"\"+ \" \\\"B\\\"\n"
                + "WHERE\n" + "  \\\"B\\\".id = \\\"A\\\".id\"";
        assertEquals(expectedQuery, query);

    }

    @Test
    public void
            testELTMapJoinWithSelectAndSnowFlakeQuoteNoJoinGlobalMapTableNameWithStringGlobalMapSchemaWithString_complex() {
        String schema = "\"prefix\" + ((String)globalMap.get(\"schema\")) + \".DWH\"";
        String inputTable1 = "\"prefix\"+((String)globalMap.get(\"input1\")) +\".DIM_SITE\"";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "\"DIM_SITE2\"";
        String alias2 = "B";
        boolean addQuotesInTableNames = true;
        String joinType = "NO_JOIN";
        boolean isUpdate = false;
        String dbType = "snowflake_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);

        String expectedQuery =
                "\"SELECT\n" + "\\\"A\\\".id, \\\"B\\\".name\n" + "FROM\n"
                        + " \" +\"\\\"\" +\"prefix\" + ((String)globalMap.get(\"schema\")) + \".DWH\"+ \"\\\"\"+\".\"+\"\\\"\" +\"prefix\"+((String)globalMap.get(\"input1\")) +\".DIM_SITE\"+ \"\\\"\"+ \" \\\"A\\\" , \" +\"\\\"\" +\"prefix\" + ((String)globalMap.get(\"schema\")) + \".DWH\"+ \"\\\"\"+\".\"+\"\\\"DIM_SITE2\\\"\"+ \" \\\"B\\\"\n"
                        + "WHERE\n" + "  \\\"B\\\".id = \\\"A\\\".id\"";
        assertEquals(expectedQuery, query);

    }

    @Test
    public void
            testELTMapJoinWithSelectAndSnowFlakeQuoteNoJoinContextTableNameWithStringContextSchemaWithString_complex() {
        String schema = "\"prefix\"+ context.schema + \".DWH\"";
        String inputTable1 = "\"prefix\"+ context.input1 +\".DIM_SITE\"";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "\"DIM_SITE2\"";
        String alias2 = "B";
        boolean addQuotesInTableNames = true;
        String joinType = "NO_JOIN";
        boolean isUpdate = false;
        String dbType = "snowflake_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);

        String expectedQuery = "\"SELECT\n" + "\\\"A\\\".id, \\\"B\\\".name\n" + "FROM\n"
                + " \" +\"\\\"\" +\"prefix\"+ context.schema + \".DWH\"+ \"\\\"\"+\".\"+\"\\\"\" +\"prefix\"+ context.input1 +\".DIM_SITE\"+ \"\\\"\"+ \" \\\"A\\\" , \" +\"\\\"\" +\"prefix\"+ context.schema + \".DWH\"+ \"\\\"\"+\".\"+\"\\\"DIM_SITE2\\\"\"+ \" \\\"B\\\"\n"
                + "WHERE\n" + "  \\\"B\\\".id = \\\"A\\\".id\"";
        assertEquals(expectedQuery, query);

    }

    @Test
    public void
            testELTMapJoinWithSelectAndMysqlQuoteNoJoinGlobalMapTableNameWithStringGlobalMapSchemaWithString_complex() {
        String schema = "\"prefix\" + ((String)globalMap.get(\"schema\")) + \".DWH\"";
        String inputTable1 = "\"prefix\"+((String)globalMap.get(\"input1\")) +\".DIM_SITE\"";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "\"DIM_SITE2\"";
        String alias2 = "B";
        boolean addQuotesInTableNames = true;
        String joinType = "NO_JOIN";
        boolean isUpdate = false;
        String dbType = "mysql_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);

        String expectedQuery = "\"SELECT\n" + "`A`.id, `B`.name\n" + "FROM\n"
                + " \" +\"`\" +\"prefix\" + ((String)globalMap.get(\"schema\")) + \".DWH\"+ \"`\"+\".\"+\"`\" +\"prefix\"+((String)globalMap.get(\"input1\")) +\".DIM_SITE\"+ \"`\"+ \" `A` , \" +\"`\" +\"prefix\" + ((String)globalMap.get(\"schema\")) + \".DWH\"+ \"`\"+\".\"+\"`DIM_SITE2`\"+ \" `B`\n"
                + "WHERE\n" + "  `B`.id = `A`.id\"";
        assertEquals(expectedQuery, query);

    }

    @Test
    public void testELTMapJoinWithSelectAndMysqlQuoteNoJoinContextTableNameWithStringContextSchemaWithString_complex() {
        String schema = "\"prefix\"+ context.schema + \".DWH\"";
        String inputTable1 = "\"prefix\"+ context.input1 +\".DIM_SITE\"";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "\"DIM_SITE2\"";
        String alias2 = "B";
        boolean addQuotesInTableNames = true;
        String joinType = "NO_JOIN";
        boolean isUpdate = false;
        String dbType = "mysql_id";
        initTestParams(schema, inputTable1, alias1, inputTable2, alias2, targetTable, addQuotesInTableNames, joinType,
                isUpdate, dbType);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);

        String expectedQuery = "\"SELECT\n" + "`A`.id, `B`.name\n" + "FROM\n"
                + " \" +\"`\" +\"prefix\"+ context.schema + \".DWH\"+ \"`\"+\".\"+\"`\" +\"prefix\"+ context.input1 +\".DIM_SITE\"+ \"`\"+ \" `A` , \" +\"`\" +\"prefix\"+ context.schema + \".DWH\"+ \"`\"+\".\"+\"`DIM_SITE2`\"+ \" `B`\n"
                + "WHERE\n" + "  `B`.id = `A`.id\"";
        assertEquals(expectedQuery, query);

    }

    private void initTestParamsWithCustomeWhereAdditon(String schema, String inputTable1, String alias1,
            String inputTable2, String alias2, String targetTable, boolean addQuotesInTableNames, String joinType,
            boolean isUpdate, String dbType, String customeWhere[], String groupby[]) {
        dbManager = new GenericDbGenerationManager();
        dbManager.setAddQuotesInColumns(false);
        dbManager.setAddQuotesInTableNames(addQuotesInTableNames);
        dbMapComponent = new DbMapComponent();

        List<IMetadataTable> metadataList = new ArrayList<IMetadataTable>();

        MetadataTable metadataTable =
                getMetadataTable(new String[] { "newColumn", "newColumn1" }, new String[] { "id", "name" });
        metadataTable.setLabel(StringUtils.isNotBlank(schema) ? schema + "." + targetTable : schema);
        metadataList.add(metadataTable);

        dbMapComponent.setMetadataList(metadataList);

        // oracle
        ElementParameter paramMapping = new ElementParameter(dbMapComponent);
        paramMapping.setFieldType(EParameterFieldType.MAPPING_TYPE);
        paramMapping.setName(EParameterName.MAPPING.getName());
        paramMapping.setValue(dbType);
        ((List<IElementParameter>) dbMapComponent.getElementParameters()).add(paramMapping);

        // main table
        ExternalDbMapData externalData = new ExternalDbMapData();
        List<ExternalDbMapTable> inputs = new ArrayList<ExternalDbMapTable>();
        List<ExternalDbMapTable> outputs = new ArrayList<ExternalDbMapTable>();
        // main table
        ExternalDbMapTable inputTable = new ExternalDbMapTable();
        inputTable.setTableName(StringUtils.isNotBlank(schema) ? schema + "." + inputTable1 : inputTable1);
        inputTable.setName(StringUtils.isNotBlank(schema) ? schema + "." + inputTable1 : inputTable1);
        if (StringUtils.isNotBlank(alias1)) {
            inputTable.setAlias(alias1);
        }
        List<ExternalDbMapEntry> entities =
                getMetadataEntities(new String[] { "newColumn", "newColumn1" }, new String[2]);
        inputTable.setMetadataTableEntries(entities);
        inputs.add(inputTable);

        // lookup table
        ExternalDbMapTable lookupTable = new ExternalDbMapTable();
        lookupTable.setTableName(StringUtils.isNotBlank(schema) ? schema + "." + inputTable2 : inputTable2);
        lookupTable.setName(StringUtils.isNotBlank(schema) ? schema + "." + inputTable2 : inputTable2);
        if (StringUtils.isNotBlank(alias2)) {
            lookupTable.setAlias(alias2);
        }
        entities = getMetadataEntities(new String[] { "newColumn", "newColumn1" }, new String[2]);
        ExternalDbMapEntry newColumn = entities.get(0);
        newColumn
                .setExpression(StringUtils.isNotBlank(alias1) ? alias1 + ".newColumn"
                        : inputTable.getTableName() + ".newColumn");
        newColumn.setOperator("=");
        newColumn.setJoin("NO_JOIN".equals(joinType) ? false : true);
        lookupTable.setJoinType(joinType);

        lookupTable.setMetadataTableEntries(entities);
        inputs.add(lookupTable);

        // output
        ExternalDbMapTable outputTable = new ExternalDbMapTable();
        outputTable.setName(StringUtils.isNotBlank(schema) ? schema + "." + targetTable : targetTable);
        outputTable.setTableName(targetTable);
        String[] names = new String[] { "tarColumn", "tarColumn1" };
        String outputExpression1 =
                StringUtils.isNotBlank(alias1) ? alias1 + ".newColumn" : inputTable.getName() + ".newColumn";
        String outputExpression2 =
                StringUtils.isNotBlank(alias2) ? alias2 + ".newColumn1" : lookupTable.getName() + ".newColumn1";
        String[] expressions = new String[] { outputExpression1, outputExpression2 };
        outputTable.setMetadataTableEntries(getMetadataEntities(names, expressions));
        entities = getMetadataEntities(new String[2],
                new String[] { customeWhere[0] + "!=" + customeWhere[1] });
        // inputTable.getTableName() + ".newColumn1 != ((String)globalMap.get(\"where2\"))" });
        outputTable.setCustomWhereConditionsEntries(entities);
        entities = getMetadataEntities(new String[2],
                new String[] { groupby[0], groupby[1] });
        outputTable.setCustomOtherConditionsEntries(entities);
        outputs.add(outputTable);

        externalData.setInputTables(inputs);
        externalData.setOutputTables(outputs);
        dbMapComponent.setExternalData(externalData);

        List<IConnection> incomingConnections = new ArrayList<IConnection>();
        incomingConnections
                .add(mockConnection(schema, inputTable1, targetTable, new String[] { "newColumn", "newColumn1" },
                        new String[] { "id", "name" }));
        incomingConnections
                .add(mockConnection(schema, inputTable2, targetTable, new String[] { "newColumn", "newColumn1" },
                        new String[] { "id", "name" }));
        dbMapComponent.setIncomingConnections(incomingConnections);

        List<IConnection> outputConnections = new ArrayList<IConnection>();
        Node map1 = mockNode(dbMapComponent);
        IConnection connection = mockConnection(map1, schema, inputTable1, new String[] { "id", "name" });
        IComponent targetComponent =
                ComponentsFactoryProvider.getInstance().get("tELTOutput", ComponentCategory.CATEGORY_4_DI.getName());
        connection.getMetadataTable().getColumn("id").setLabel("newColumn");
        connection.getMetadataTable().getColumn("name").setLabel("newColumn1");
        // add target
        DataNode output = new DataNode();
        List<IElementParameter> paraList = new ArrayList<IElementParameter>();
        ElementParameter param = new ElementParameter(output);
        param.setName("USE_UPDATE_STATEMENT"); //$NON-NLS-1$
        param.setValue(String.valueOf(isUpdate)); // $NON-NLS-1$
        paraList.add(param);
        if (StringUtils.isNotBlank(schema)) {
            param = new ElementParameter(output);
            param.setName("ELT_SCHEMA_NAME");
            param.setValue(schema);
            paraList.add(param);
        }
        output.setElementParameters(paraList);
        output.setComponent(targetComponent);

        DataConnection dataConnection = new DataConnection();
        dataConnection.setName(StringUtils.isNotBlank(schema) ? schema + "." + targetTable : targetTable);
        dataConnection.setActivate(true);
        dataConnection.setLineStyle(EConnectionType.FLOW_MAIN);
        dataConnection.setTarget(output);
        IMetadataTable table = new MetadataTable();
        table.setLabel(targetTable);
        table.setTableName(targetTable);
        List<IMetadataColumn> listColumns = new ArrayList<IMetadataColumn>();
        for (String columnName : new String[] { "id", "name" }) {
            IMetadataColumn column = new MetadataColumn();
            column.setLabel(columnName);
            column.setOriginalDbColumnName(columnName);
            listColumns.add(column);
        }
        table.setListColumns(listColumns);
        dataConnection.setMetadataTable(table);
        // List<DataConnection> dataConnections = new ArrayList<>();
        outputConnections.add(dataConnection);
        outputConnections.add(connection);
        dbMapComponent.setOutgoingConnections(outputConnections);

        JobContext newContext = new JobContext("Default");
        List<IContextParameter> newParamList = new ArrayList<IContextParameter>();
        newContext.setContextParameterList(newParamList);
        JobContextParameter cparam = new JobContextParameter();
        cparam.setName("schema");
        cparam.setValue("dbo");
        newParamList.add(cparam);
        cparam = new JobContextParameter();
        cparam.setName("input1");
        cparam.setValue("src1");
        newParamList.add(cparam);
        cparam = new JobContextParameter();
        cparam.setName("input2");
        cparam.setValue("src2");
        newParamList.add(cparam);
        cparam = new JobContextParameter();
        cparam.setName("target");
        cparam.setValue("tar");
        newParamList.add(cparam);
        cparam = new JobContextParameter();
        cparam.setName("where1");
        cparam.setValue("where1");
        newParamList.add(cparam);
        cparam = new JobContextParameter();
        cparam.setName("groupby");
        cparam.setValue("groupby");
        newParamList.add(cparam);

        JobContextManager contextManger = new JobContextManager();
        contextManger.setDefaultContext(newContext);
        Process process = mock(Process.class);
        when(process.getContextManager()).thenReturn(contextManger);
        dbMapComponent.setProcess(process);

        IContextParameter lookupTableContext = new JobContextParameter();
        lookupTableContext.setName("lookup");
        lookupTableContext.setValue("lookupTable");
        lookupTableContext.setType("String");
    }

    @Test
    public void testELTMapJoinWithSelectAndMysqlQuoteNoJoinNormalTableNameCustomeWhereCustomeOther() {
        String schema = "dbo";
        String inputTable1 = "src1";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "src2";
        String alias2 = "B";
        boolean addQuotesInTableNames = true;
        String joinType = "INNER_JOIN";
        boolean isUpdate = false;
        String dbType = "mysql_id";
        String customeWhere[] = new String[] { "dbo.src1.newColumn", "context.where1" };
        String groupby[] = new String[] { "group by context.groupby", "group by ((String)globalMap.get(\"groupby\"))" };
        initTestParamsWithCustomeWhereAdditon(schema, inputTable1, alias1, inputTable2, alias2, targetTable,
                addQuotesInTableNames, joinType,
                isUpdate, dbType, customeWhere, groupby);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);

        String expectedQuery = "\"SELECT\n" + "`A`.id, `B`.name\n" + "FROM\n"
                + " \" +\"`dbo`\"+\".\"+\"`src1`\"+ \" `A` INNER JOIN  \" +\"`dbo`\"+\".\"+\"`src2`\"+ \" `B` ON(  `B`.id = `A`.id )\n"
                + "WHERE `dbo`.`src1`.id!=\" +context.where1+ \"\n" + "group by \" +context.groupby+ \"\n"
                + "group by \" +((String)globalMap.get(\"groupby\"))";
        assertEquals(expectedQuery, query);
    }

    @Test
    public void testELTMapJoinWithSelectAndMysqlQuoteNoJoinNormalTableNameCustomeWhereCustomeOther1() {
        String schema = "dbo";
        String inputTable1 = "src1";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "src2";
        String alias2 = "B";
        boolean addQuotesInTableNames = true;
        String joinType = "INNER_JOIN";
        boolean isUpdate = false;
        String dbType = "mysql_id";
        String customeWhere[] = new String[] { "A.newColumn", "context.where1" };
        String groupby[] = new String[] { "group by A.newColumn", "group by ((String)globalMap.get(\"groupby\"))" };
        initTestParamsWithCustomeWhereAdditon(schema, inputTable1, alias1, inputTable2, alias2, targetTable,
                addQuotesInTableNames, joinType, isUpdate, dbType, customeWhere, groupby);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);

        String expectedQuery = "\"SELECT\n" + "`A`.id, `B`.name\n" + "FROM\n"
                + " \" +\"`dbo`\"+\".\"+\"`src1`\"+ \" `A` INNER JOIN  \" +\"`dbo`\"+\".\"+\"`src2`\"+ \" `B` ON(  `B`.id = `A`.id )\n"
                + "WHERE `A`.id!=\" +context.where1+ \"\n" + "group by `A`.id\n"
                + "group by \" +((String)globalMap.get(\"groupby\"))";
        assertEquals(expectedQuery, query);
    }

    @Test
    public void testELTMapJoinWithUpdateAndSnowflakeQuoteNoJoinNormalTableNameCustomeWhereCustomeOther() {
        String schema = "dbo";
        String inputTable1 = "src1";
        String alias1 = "A";
        String targetTable = "tar";
        String inputTable2 = "src2";
        String alias2 = "B";
        boolean addQuotesInTableNames = true;
        String joinType = "INNER_JOIN";
        boolean isUpdate = true;
        String dbType = "snowflake_id";
        String customeWhere[] = new String[] { "dbo.src1.newColumn", "context.where1" };
        String groupby[] =
                new String[] { "group by dbo.src1.newColumn", "group by ((String)globalMap.get(\"groupby\"))" };

        initTestParamsWithCustomeWhereAdditon(schema, inputTable1, alias1, inputTable2, alias2, targetTable,
                addQuotesInTableNames, joinType, isUpdate, dbType, customeWhere, groupby);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);

        String expectedQuery = "\"UPDATE \\\"dbo\\\".\\\"tar\\\"\n" + "SET tarColumn = \\\"A\\\".id,\n"
                + "tarColumn1 = \\\"B\\\".name\n" + "FROM\n"
                + " \" +\"\\\"dbo\\\"\"+\".\"+\"\\\"src1\\\"\"+ \" \\\"A\\\" INNER JOIN  \" +\"\\\"dbo\\\"\"+\".\"+\"\\\"src2\\\"\"+ \" \\\"B\\\" ON(  \\\"B\\\".id = \\\"A\\\".id )\n"
                + "WHERE \\\"dbo\\\".\\\"src1\\\".id!=\" +context.where1+ \"\n"
                + "group by \\\"dbo\\\".\\\"src1\\\".id\n"
                + "group by \" +((String)globalMap.get(\"groupby\"))";
        assertEquals(expectedQuery, query);
    }

    @Test
    public void testELTMapJoinWithUpdateAndSnowflakeQuoteNoJoinNormalTableNameCustomeWhereCustomeOther1() {
        String schema = "((String)globalMap.get(\"schema\"))";
        String inputTable1 = "context.input1";
        String alias1 = "";
        String targetTable = "tar";
        String inputTable2 = "src2";
        String alias2 = "B";
        boolean addQuotesInTableNames = true;
        String joinType = "INNER_JOIN";
        boolean isUpdate = true;
        String dbType = "snowflake_id";
        String customeWhere[] = new String[] { schema + "." + inputTable1 + ".newColumn", "context.where1" };
        String groupby[] = new String[] { "group by " + schema + "." + inputTable1 + ".newColumn",
                "group by ((String)globalMap.get(\"groupby\"))" };

        initTestParamsWithCustomeWhereAdditon(schema, inputTable1, alias1, inputTable2, alias2, targetTable,
                addQuotesInTableNames, joinType, isUpdate, dbType, customeWhere, groupby);

        String query = dbManager.buildSqlSelect(dbMapComponent, schema + "." + targetTable);

        String expectedQuery = "\"UPDATE \"+ \"\\\"\" +((String)globalMap.get(\"schema\"))+ \"\\\"\" +\".\\\"tar\\\"\n"
                + "SET tarColumn = \" +\"\\\"\" + ((String)globalMap.get(\"schema\")) + \"\\\"\"+ \".\" +\"\\\"\" + context.input1 + \"\\\"\"+ \".newColumn,\n"
                + "tarColumn1 = \\\"B\\\".name\n" + "FROM\n"
                + " \" +\"\\\"\" + ((String)globalMap.get(\"schema\")) + \"\\\"\"+ \".\" +\"\\\"\" + context.input1 + \"\\\"\"+ \" INNER JOIN  \" +\"\\\"\" +((String)globalMap.get(\"schema\"))+ \"\\\"\"+\".\"+\"\\\"src2\\\"\"+ \" \\\"B\\\" ON(  \\\"B\\\".id = \" +\"\\\"\" + ((String)globalMap.get(\"schema\")) + \"\\\"\"+ \".\" +\"\\\"\" + context.input1 + \"\\\"\"+ \".newColumn )\n"
                + "WHERE \" +\"\\\"\" + ((String)globalMap.get(\"schema\")) + \"\\\"\"+ \".\" +\"\\\"\" + context.input1 + \"\\\"\"+ \".newColumn!=\" +context.where1+ \"\n"
                + "group by \" +\"\\\"\" + ((String)globalMap.get(\"schema\")) + \"\\\"\"+ \".\" +\"\\\"\" + context.input1 + \"\\\"\"+ \".newColumn\n"
                + "group by \" +((String)globalMap.get(\"groupby\"))";
        assertEquals(expectedQuery, query);
    }


    @Test
    public void testSubQuery() {
        String schema = "";
        String table1 = "table1";
        String table2 = "table2";
        String table3 = "table3";
        List<IConnection> incomingConnections = new ArrayList<IConnection>();
        String[] mainTableEntities = new String[] { "id", "column1", "column2" };
        incomingConnections.add(mockConnection(schema, table1, mainTableEntities));
        dbMapComponent.setIncomingConnections(incomingConnections);

        ExternalDbMapData externalData = new ExternalDbMapData();
        List<ExternalDbMapTable> inputs = new ArrayList<ExternalDbMapTable>();
        List<ExternalDbMapTable> outputs = new ArrayList<ExternalDbMapTable>();
        // main table
        ExternalDbMapTable inputTable = new ExternalDbMapTable();
        String mainTableName = "".equals(schema) ? table1 : schema + "." + table1;
        // quote will be removed in the ui for connections ,so we do the same for test
        String mainTableNameNoQuote = TalendTextUtils.removeQuotes(mainTableName);
        inputTable.setTableName(mainTableNameNoQuote);
        inputTable.setName(mainTableName);
        List<ExternalDbMapEntry> entities = getMetadataEntities(mainTableEntities, new String[3]);
        inputTable.setMetadataTableEntries(entities);
        inputs.add(inputTable);

        // output
        ExternalDbMapTable outputTable = new ExternalDbMapTable();
        mainTableName = "".equals(schema) ? table2 : schema + "." + table2;
        // quote will be removed in the ui for connections ,so we do the same for test
        mainTableNameNoQuote = TalendTextUtils.removeQuotes(mainTableName);
        outputTable.setTableName(mainTableNameNoQuote);
        outputTable.setName("table2");
        String[] names = new String[] { "id", "column1", "column2" };
        String mainTable = mainTableName;
        String[] expressions = new String[] { "table1.id", "table1.column1", "table1.column2" };
        outputTable.setMetadataTableEntries(getMetadataEntities(names, expressions));

        outputs.add(outputTable);
        externalData.setInputTables(inputs);
        externalData.setOutputTables(outputs);
        dbMapComponent.setExternalData(externalData);
        List<IMetadataTable> metadataList = new ArrayList<IMetadataTable>();
        MetadataTable metadataTable = getMetadataTable(names);
        metadataTable.setLabel("table2");
        metadataList.add(metadataTable);
        dbMapComponent.setMetadataList(metadataList);
        JobContext newContext = new JobContext("Default");
        List<IContextParameter> newParamList = new ArrayList<IContextParameter>();
        newContext.setContextParameterList(newParamList);
        JobContextParameter param = new JobContextParameter();
        param.setName("schema");
        newParamList.add(param);
        process = mock(Process.class);
        JobContextManager contextManger = new JobContextManager();
        contextManger.setDefaultContext(newContext);
        when(process.getContextManager()).thenReturn(contextManger);
        dbMapComponent.setProcess(process);

        ExternalDbMapData externalData2 = new ExternalDbMapData();
        DbMapComponent dbMapComponent2 = new DbMapComponent();
        dbMapComponent2.setExternalData(externalData2);
        mainTableEntities = new String[] { "id", "column1", "column2" };

        List<IConnection> outgoingConnections = new ArrayList<IConnection>();
        Node map1 = mockNode(dbMapComponent);
        outgoingConnections.add(mockConnection(map1, schema, table2, mainTableEntities));
        outgoingConnections
                .add(mockConnection(schema, "input1", "table3", new String[] { "id", "newColumn", "newColumn1" },
                        new String[] { "id", "newColumn", "newColumn1" }));
        dbMapComponent.setOutgoingConnections(outgoingConnections);

        dbMapComponent2.setIncomingConnections(outgoingConnections);

        inputs = new ArrayList<ExternalDbMapTable>();
        outputs = new ArrayList<ExternalDbMapTable>();
        // main table
        inputTable = new ExternalDbMapTable();
        mainTableName = "".equals(schema) ? table2 : schema + "." + table2;
        // quote will be removed in the ui for connections ,so we do the same for test
        mainTableNameNoQuote = TalendTextUtils.removeQuotes(mainTableName);
        inputTable.setTableName(mainTableNameNoQuote);
        inputTable.setName("table2");
        entities = getMetadataEntities(mainTableEntities, new String[3]);
        inputTable.setMetadataTableEntries(entities);
        
        // external input table
        ExternalDbMapTable inputTable2 = new ExternalDbMapTable();
        String extTableName = "input1";
        // quote will be removed in the ui for connections ,so we do the same for test
        String extTableNameNoQuote = TalendTextUtils.removeQuotes(extTableName);
        inputTable2.setTableName(extTableNameNoQuote);
        inputTable2.setName(extTableName);
        mainTableEntities = new String[] { "id", "column1", "column2" };
        List<ExternalDbMapEntry> entitiesExt = getMetadataEntities(mainTableEntities, new String[3]);
        ExternalDbMapEntry newColumn = entitiesExt.get(0);
        newColumn.setExpression("table2.id");
        newColumn.setOperator("=");
        newColumn.setJoin(false);
        inputTable2.setJoinType("NO_JOIN");
        inputTable2.setMetadataTableEntries(entitiesExt);
        inputs.add(inputTable2);
        inputs.add(inputTable);


        // output
        outputTable = new ExternalDbMapTable();
        mainTableName = "".equals(schema) ? table3 : schema + "." + table3;
        // quote will be removed in the ui for connections ,so we do the same for test
        mainTableNameNoQuote = TalendTextUtils.removeQuotes(mainTableName);
        outputTable.setTableName(mainTableNameNoQuote);
        outputTable.setName("table3");
        names = new String[] { "id", "column1", "column2" };
        mainTable = mainTableName;
        expressions = new String[] { "table2.id", "table2.column1", "table2.column2" };
        outputTable.setMetadataTableEntries(getMetadataEntities(names, expressions));
        outputs.add(outputTable);

        externalData2.setInputTables(inputs);
        externalData2.setOutputTables(outputs);
        dbMapComponent2.setExternalData(externalData2);
        metadataList = new ArrayList<IMetadataTable>();
        metadataTable = getMetadataTable(names);
        metadataTable.setLabel("table3");
        metadataList.add(metadataTable);
        dbMapComponent2.setMetadataList(metadataList);
        if (dbMapComponent2.getElementParameters() == null) {
            dbMapComponent2.setElementParameters(Collections.EMPTY_LIST);
        }
        JobContextParameter param1 = new JobContextParameter();
        param1.setName("param1");
        newParamList.add(param1);

        JobContextParameter param2 = new JobContextParameter();
        param2.setName("param2");
        newParamList.add(param2);
        dbMapComponent2.setProcess(process);
        outgoingConnections = new ArrayList<IConnection>();
        outgoingConnections.add(mockConnection(schema, table3, mainTableEntities));
        dbMapComponent2.setOutgoingConnections(outgoingConnections);

        ElementParameter comName = new ElementParameter(dbMapComponent);
        comName.setName("COMPONENT_NAME");
        comName.setValue("tELTMap");
        List<ElementParameter> list = new ArrayList<>();
        list.add(comName);
        dbMapComponent.setElementParameters(list);

        dbManager = new GenericDbGenerationManager();
        dbManager.setAddQuotesInTableNames(false);


        String queryNoQuotes = dbManager.buildSqlSelect(dbMapComponent2, "table3").replaceAll("\n", "");
        String exceptQueryNoQuotes =
                "\"SELECTtable2.id, table2.column1, table2.column2FROM input1 , (  SELECT  table1.id AS id, table1.column1 AS column1, table1.column2 AS column2  FROM   table1 ) table2WHERE  input1.id = table2.id\"";
        assertEquals(exceptQueryNoQuotes.replaceAll("\n", "").trim(), queryNoQuotes.trim());
        dbManager.setAddQuotesInTableNames(true);
        String query = dbManager.buildSqlSelect(dbMapComponent2, "table3").replaceAll("\n", "");
        String exceptQuery =
                "\"SELECT\\\"table2\\\".id, \\\"table2\\\".column1, \\\"table2\\\".column2FROM \\\"input1\\\" , (  SELECT  table1.id AS id, table1.column1 AS column1, table1.column2 AS column2  FROM   table1 ) table2WHERE  \\\"input1\\\".id = \\\"table2\\\".id\"";
        assertEquals(exceptQuery.replaceAll("\n", "").trim(), query.trim());

    }
}

