// ============================================================================
//
// Copyright (C) 2006-2021 Talaxie Inc. - www.deilink.fr
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talaxie SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.designer.dbmap.language.oracle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.talend.core.model.metadata.IMetadataColumn;
import org.talend.core.model.metadata.IMetadataTable;
import org.talend.core.model.metadata.MetadataToolHelper;
import org.talend.core.model.process.EConnectionType;
import org.talend.core.model.process.IConnection;
import org.talend.core.model.process.IElementParameter;
import org.talend.core.model.process.INode;
import org.talend.core.model.utils.TalendTextUtils;
import org.talend.core.utils.TalendQuoteUtils;
import org.talend.designer.dbmap.DbMapComponent;
import org.talend.designer.dbmap.external.data.ExternalDbMapData;
import org.talend.designer.dbmap.external.data.ExternalDbMapEntry;
import org.talend.designer.dbmap.external.data.ExternalDbMapTable;
import org.talend.designer.dbmap.i18n.Messages;
import org.talend.designer.dbmap.language.AbstractDbLanguage;
import org.talend.designer.dbmap.language.IJoinType;
import org.talend.designer.dbmap.language.generation.DbGenerationManager;
import org.talend.designer.dbmap.language.generation.DbMapSqlConstants;
import org.talend.designer.dbmap.language.generation.MapExpressionParser;
import org.talend.designer.dbmap.model.tableentry.TableEntryLocation;
import org.talend.designer.dbmap.utils.DataMapExpressionParser;

/**
 *
 * wzhang class global comment. Detailled comment
 */
public class OracleGenerationManager extends DbGenerationManager {

    private static final String JOIN = "(+)";

    public OracleGenerationManager() {
        super(new OracleLanguage());
    }

    @Override
    public String buildSqlSelect(DbMapComponent component, String outputTableName) {
        return super.buildSqlSelect(component, outputTableName);
    }

    /**
     *
     * ggu Comment method "buildSqlSelect".
     *
     * @param component
     * @param outputTableName
     * @param tabSpaceString
     * @return
     */
    @Override
    public String buildSqlSelect(DbMapComponent dbMapComponent, String outputTableName, String tabString) {
        queryColumnsName = "\""; //$NON-NLS-1$
        aliasAlreadyDeclared.clear();
        queryColumnsSegments.clear();
        querySegments.clear();
        this.tabSpaceString = tabString;

        DbMapComponent component = getDbMapComponent(dbMapComponent);

        List<IConnection> outputConnections = (List<IConnection>) component.getOutgoingConnections();

        Map<String, IConnection> nameToOutputConnection = new HashMap<String, IConnection>();
        for (IConnection connection : outputConnections) {
            nameToOutputConnection.put(connection.getUniqueName(), connection);
        }

        ExternalDbMapData data = component.getExternalData();

        StringBuilder sb = new StringBuilder();

        List<ExternalDbMapTable> outputTables = data.getOutputTables();
        int lstOutputTablesSize = outputTables.size();
        ExternalDbMapTable outputTable = null;
        for (int i = 0; i < lstOutputTablesSize; i++) {
            ExternalDbMapTable temp = outputTables.get(i);
            if (outputTableName.equals(temp.getName())) {
                outputTable = temp;
                break;
            }
        }

        if (outputTable != null) {

            IConnection connection = nameToOutputConnection.get(outputTable.getName());
            List<IMetadataColumn> columns = new ArrayList<IMetadataColumn>();
            if (connection != null) {
                IMetadataTable metadataTable = connection.getMetadataTable();
                if (metadataTable != null) {
                    columns.addAll(metadataTable.getListColumns());
                    // call this function seems no use now but only problems
                    // outputTable = removeUnmatchingEntriesWithColumnsOfMetadataTable(outputTable, metadataTable);
                }
            }
            appendSqlQuery(sb, "\"", false); //$NON-NLS-1$
            appendSqlQuery(sb, DbMapSqlConstants.SELECT);
            appendSqlQuery(sb, DbMapSqlConstants.NEW_LINE);
            appendSqlQuery(sb, tabSpaceString);

            List<ExternalDbMapEntry> metadataTableEntries = outputTable.getMetadataTableEntries();
            if (metadataTableEntries != null) {
                int lstSizeOutTableEntries = metadataTableEntries.size();
                for (int i = 0; i < lstSizeOutTableEntries; i++) {
                    ExternalDbMapEntry dbMapEntry = metadataTableEntries.get(i);
                    String expression = dbMapEntry.getExpression();
                    expression = initExpression(component, dbMapEntry);
                    if (!isAddQuotesInColumns()) {
                        expression = addQuoteForSpecialChar(expression, component);
                    }
                    // for (IMetadataColumn column : columns) {
                    // if (expression != null && column.getLabel().equals(dbMapEntry.getName())) {
                    //                            expression = expression.replaceFirst("." + dbMapEntry.getName(), //$NON-NLS-1$
                    //                                    "." + column.getOriginalDbColumnName()); //$NON-NLS-1$
                    // break;
                    // }
                    // }
                    boolean added = false;
                    if (!DEFAULT_TAB_SPACE_STRING.equals(this.tabSpaceString)) {
                        expression += DbMapSqlConstants.SPACE + DbMapSqlConstants.AS + DbMapSqlConstants.SPACE
                                + getAliasOf(dbMapEntry.getName());
                        added = true;
                    }
                    String columnSegment = expression;
                    if (i > 0) {
                        appendSqlQuery(sb, DbMapSqlConstants.COMMA);
                        appendSqlQuery(sb, DbMapSqlConstants.SPACE);
                        queryColumnsName += DbMapSqlConstants.COMMA + DbMapSqlConstants.SPACE;
                        columnSegment = DbMapSqlConstants.COMMA + DbMapSqlConstants.SPACE + columnSegment;
                    }
                    if (expression != null && expression.trim().length() > 0) {
                        String exp = replaceVariablesForExpression(component, expression);
                        appendSqlQuery(sb, exp);
                        boolean needAlias = needAlias(columns, dbMapEntry, expression);
                        if (!added && needAlias && isUseAliasInOutputTable()) {
                            String name = DbMapSqlConstants.SPACE + DbMapSqlConstants.AS + DbMapSqlConstants.SPACE
                                    + getAliasOf(dbMapEntry.getName());
                            appendSqlQuery(sb, name);
                        }
                        queryColumnsName += expression;
                        queryColumnsSegments.add(columnSegment);
                    } else {
                        appendSqlQuery(sb, DbMapSqlConstants.LEFT_COMMENT);
                        String str = outputTable.getName() + DbMapSqlConstants.DOT + dbMapEntry.getName();
                        appendSqlQuery(sb, Messages.getString("DbGenerationManager.OuputExpSetMessage", str));//$NON-NLS-1$
                        appendSqlQuery(sb, DbMapSqlConstants.RIGHT_COMMENT);
                    }
                }
            }

            appendSqlQuery(sb, DbMapSqlConstants.NEW_LINE);
            appendSqlQuery(sb, tabSpaceString);
            appendSqlQuery(sb, DbMapSqlConstants.FROM);

            List<ExternalDbMapTable> inputTables = data.getInputTables();

            // load input table in hash
            boolean explicitJoin = false;
            int lstSizeInputTables = inputTables.size();
            Map<String, ExternalDbMapTable> nameToInputTable = new HashMap<String, ExternalDbMapTable>();
            for (int i = 0; i < lstSizeInputTables; i++) {
                ExternalDbMapTable inputTable = inputTables.get(i);
                nameToInputTable.put(inputTable.getName(), inputTable);
                IJoinType joinType = language.getJoin(inputTable.getJoinType());
                if (!language.unuseWithExplicitJoin().contains(joinType) && i > 0) {
                    explicitJoin = true;
                }

            }

            StringBuilder sbWhere = new StringBuilder();
            this.tabSpaceString = DEFAULT_TAB_SPACE_STRING;
            boolean isFirstClause = true;
            for (int i = 0; i < lstSizeInputTables; i++) {
                ExternalDbMapTable inputTable = inputTables.get(i);
                if (buildConditions(component, sbWhere, inputTable, false, isFirstClause)) {
                    isFirstClause = false;
                }
            }
            this.tabSpaceString = tabString;

            appendSqlQuery(sb, DbMapSqlConstants.NEW_LINE);
            appendSqlQuery(sb, tabSpaceString);

            IJoinType previousJoinType = null;

            for (int i = 0; i < lstSizeInputTables; i++) {
                ExternalDbMapTable inputTable = inputTables.get(i);
                IJoinType joinType = null;
                if (i == 0) {
                    joinType = AbstractDbLanguage.JOIN.NO_JOIN;
                } else {
                    joinType = language.getJoin(inputTable.getJoinType());
                }
                boolean commaCouldBeAdded = !explicitJoin && i > 0;
                boolean crCouldBeAdded = false;
                if (language.unuseWithExplicitJoin().contains(joinType) && !explicitJoin) {
                    buildTableDeclaration(component, sb, inputTable, commaCouldBeAdded, crCouldBeAdded, false);

                } else if (!language.unuseWithExplicitJoin().contains(joinType) && explicitJoin) {
                    if (i > 0) {
                        if (previousJoinType == null) {
                            buildTableDeclaration(component, sb, inputTables.get(i - 1), commaCouldBeAdded, crCouldBeAdded, true);
                            previousJoinType = joinType;
                        } else {
                            appendSqlQuery(sb, DbMapSqlConstants.NEW_LINE);
                            appendSqlQuery(sb, tabSpaceString);
                        }
                        appendSqlQuery(sb, DbMapSqlConstants.SPACE);
                    }
                    String labelJoinType = joinType.getLabel();
                    appendSqlQuery(sb, labelJoinType);
                    appendSqlQuery(sb, DbMapSqlConstants.SPACE);
                    if (joinType == AbstractDbLanguage.JOIN.CROSS_JOIN) {
                        ExternalDbMapTable nextTable = null;
                        if (i < lstSizeInputTables) {
                            nextTable = inputTables.get(i);
                            buildTableDeclaration(component, sb, nextTable, false, false, true);
                        }

                    } else {

                        // ExternalDbMapTable rightTable = joinLeftToJoinRightTables.get(inputTable.getName());
                        buildTableDeclaration(component, sb, inputTable, false, false, true);
                        // if (rightTable != null) {
                        // } else {
                        // sb.append(" <!! NO JOIN CLAUSES FOR '" + inputTable.getName() + "' !!> ");
                        // }
                        appendSqlQuery(sb, DbMapSqlConstants.SPACE);
                        appendSqlQuery(sb, DbMapSqlConstants.ON);
                        appendSqlQuery(sb, DbMapSqlConstants.LEFT_BRACKET);
                        appendSqlQuery(sb, DbMapSqlConstants.SPACE);
                        if (!buildConditions(component, sb, inputTable, true, true)) {
                            appendSqlQuery(sb, DbMapSqlConstants.LEFT_COMMENT);
                            appendSqlQuery(sb, DbMapSqlConstants.SPACE);
                            appendSqlQuery(sb, Messages.getString("DbGenerationManager.conditionNotSet"));//$NON-NLS-1$
                            appendSqlQuery(sb, DbMapSqlConstants.SPACE);
                            appendSqlQuery(sb, DbMapSqlConstants.RIGHT_COMMENT);
                        }
                        appendSqlQuery(sb, DbMapSqlConstants.SPACE);
                        appendSqlQuery(sb, DbMapSqlConstants.RIGHT_BRACKET);
                    }

                }
            }
            /*
             * for addition conditions
             */
            // like as input.newcolumn1>100
            List<String> whereAddition = new ArrayList<String>();
            // olny pure start with group or order, like as order/group by input.newcolumn1
            // List<String> byAddition = new ArrayList<String>();
            // like as input.newcolumn1>100 group/oder by input.newcolumn1
            // List<String> containWhereAddition = new ArrayList<String>();
            // like as "OR/AND input.newcolumn1", will keep original
            List<String> originalWhereAddition = new ArrayList<String>();

            List<String> otherAddition = new ArrayList<String>();

            if (outputTable != null) {
                this.tabSpaceString = DEFAULT_TAB_SPACE_STRING;
                List<ExternalDbMapEntry> customWhereConditionsEntries = outputTable.getCustomWhereConditionsEntries();
                if (customWhereConditionsEntries != null) {
                    for (ExternalDbMapEntry entry : customWhereConditionsEntries) {
                        String exp = initExpression(component, entry);
                        if (exp != null && !DbMapSqlConstants.EMPTY.equals(exp.trim())) {
                            // if (containWith(exp, DbMapSqlConstants.GROUP_BY_PATTERN, true)
                            // || containWith(exp, DbMapSqlConstants.ORDER_BY_PATTERN, true)) {
                            // byAddition.add(exp);
                            // } else if (containWith(exp, DbMapSqlConstants.GROUP_BY_PATTERN, false)
                            // || containWith(exp, DbMapSqlConstants.ORDER_BY_PATTERN, false)) {
                            // containWhereAddition.add(exp);
                            // } else
                            if (containWith(exp, DbMapSqlConstants.OR, true) || containWith(exp, DbMapSqlConstants.AND, true)) {
                                exp = replaceVariablesForExpression(component, exp);
                                originalWhereAddition.add(exp);
                            } else {
                                exp = replaceVariablesForExpression(component, exp);
                                whereAddition.add(exp);
                            }
                        }
                    }
                }
                List<ExternalDbMapEntry> customOtherConditionsEntries = outputTable.getCustomOtherConditionsEntries();
                if (customOtherConditionsEntries != null) {
                    for (ExternalDbMapEntry entry : customOtherConditionsEntries) {
                        String exp = initExpression(component, entry);
                        if (exp != null && !DbMapSqlConstants.EMPTY.equals(exp.trim())) {
                            exp = replaceVariablesForExpression(component, exp);
                            otherAddition.add(exp);
                        }
                    }
                }
                this.tabSpaceString = tabString;
            }

            String whereClauses = sbWhere.toString();

            boolean whereFlag = whereClauses.trim().length() > 0;
            boolean whereAddFlag = !whereAddition.isEmpty();

            boolean whereOriginalFlag = !originalWhereAddition.isEmpty();
            if (whereFlag || whereAddFlag || whereOriginalFlag) {
                appendSqlQuery(sb, DbMapSqlConstants.NEW_LINE);
                appendSqlQuery(sb, tabSpaceString);
                appendSqlQuery(sb, DbMapSqlConstants.WHERE);
            }
            if (whereFlag) {
                sb.append(whereClauses);
            }
            if (whereAddFlag) {
                for (int i = 0; i < whereAddition.size(); i++) {
                    if (i == 0 && whereFlag || i > 0) {
                        appendSqlQuery(sb, DbMapSqlConstants.NEW_LINE);
                        appendSqlQuery(sb, tabSpaceString);
                        appendSqlQuery(sb, DbMapSqlConstants.SPACE);
                        appendSqlQuery(sb, DbMapSqlConstants.AND);
                    }
                    appendSqlQuery(sb, DbMapSqlConstants.SPACE);
                    appendSqlQuery(sb, whereAddition.get(i));
                }
            }
            if (whereOriginalFlag) {
                for (String s : originalWhereAddition) {
                    appendSqlQuery(sb, DbMapSqlConstants.NEW_LINE);
                    appendSqlQuery(sb, DbMapSqlConstants.SPACE);
                    appendSqlQuery(sb, s);
                }
            }
            if (!otherAddition.isEmpty()) {
                appendSqlQuery(sb, DbMapSqlConstants.NEW_LINE);
                appendSqlQuery(sb, tabSpaceString);
                for (String s : otherAddition) {
                    appendSqlQuery(sb, s);
                    appendSqlQuery(sb, DbMapSqlConstants.NEW_LINE);
                    appendSqlQuery(sb, tabSpaceString);
                }
            }
        }
        String sqlQuery = sb.toString();

        sqlQuery = handleQuery(sqlQuery);
        queryColumnsName = handleQuery(queryColumnsName);

        return sqlQuery;
    }

    @Override
    protected String getSpecialRightJoin(ExternalDbMapTable table) {
        // when use oracle's right join (+)
        if (language.getJoin(table.getJoinType()) == OracleLanguage.ORACLEJOIN.RIGHT_OUTER_JOIN_ORACLE) {
            return JOIN;
        }
        return DbMapSqlConstants.EMPTY;
    }

    @Override
    protected String getSpecialLeftJoin(ExternalDbMapTable table) {
        // when use oracle's left join (+)
        if (language.getJoin(table.getJoinType()) == OracleLanguage.ORACLEJOIN.LEFT_OUTER_JOIN_ORACLE) {
            return JOIN + DbMapSqlConstants.SPACE;
        }
        return DbMapSqlConstants.EMPTY;
    }

    @Override
    protected String addQuoteForSpecialChar(String expression, DbMapComponent component) {
        if (expression == null) {
            return expression;
        }
        List<String> specialList = new ArrayList<String>();
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        List<IConnection> inputConnections = (List<IConnection>) component.getIncomingConnections();
        if (inputConnections == null) {
            return expression;
        }
        for (IConnection iconn : inputConnections) {
            IMetadataTable metadataTable = iconn.getMetadataTable();
            if (metadataTable != null) {
                List<IMetadataColumn> lColumn = metadataTable.getListColumns();
                for (IMetadataColumn co : lColumn) {
                    String columnLabel = co.getOriginalDbColumnName();
                    if (columnLabel == null) {
                        columnLabel = co.getLabel();
                    }
                    String exp = MetadataToolHelper.validateValueNoLengthLimit(columnLabel);
                    if (!exp.equals(columnLabel)) {
                        specialList.add(columnLabel);
                    }
                }
            }
        }
        for (String specialColumn : specialList) {
            if (expression.contains(specialColumn)) {
                if (map.get(expression) == null) {
                    List<String> list = new ArrayList<String>();
                    list.add(specialColumn);
                    map.put(expression, list);
                } else {
                    List<String> list = map.get(expression);
                    list.add(specialColumn);
                }
            }
        }
        if (map.size() > 0) {
            List<String> list = map.get(expression);
            Collections.sort(list);
            String specialColumn = list.get(list.size() - 1);
            if (expression.contains(specialColumn)) {
                int begin = expression.indexOf(specialColumn);
                int length = specialColumn.length();
                int allLength = expression.length();
                if (specialColumn.trim().startsWith("\\\"") && specialColumn.trim().endsWith("\\\"")) {
                    return expression;
                }
                String quote = getQuote(component);
                if ("\"".equals(quote)) {
                    quote = "\\\"";
                }
                expression = expression.substring(0, begin) + quote + expression.substring(begin, begin + length)
                        + quote + expression.substring(begin + length, allLength);
//                expression = adaptQuoteForColumnName(component,expression);
                return expression;
            }
        }
        return expression;
    }
    

    @Override
    protected boolean needAlias(List<IMetadataColumn> columns, ExternalDbMapEntry dbMapEntry, String expression) {
        DataMapExpressionParser dataMapExpressionParser = new DataMapExpressionParser(language);
        TableEntryLocation[] tableEntriesLocationsSources = dataMapExpressionParser.parseTableEntryLocations(expression);
        if (tableEntriesLocationsSources.length > 1) {
            return true;
        } else {
            for (TableEntryLocation tableEntriesLocationsSource : tableEntriesLocationsSources) {
                TableEntryLocation location = tableEntriesLocationsSource;
                String entryName = getAliasOf(dbMapEntry.getName());
                if (location != null && entryName != null && !entryName.startsWith("_") //$NON-NLS-1$
                        && !entryName.equals(location.columnName)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    protected String initExpression(DbMapComponent component, ExternalDbMapEntry dbMapEntry) {
        String quote = getQuote(component);
        String quto_mark = TalendQuoteUtils.QUOTATION_MARK;
        String expression = dbMapEntry.getExpression();
        if (expression != null) {
            List<Map<String, String>> itemNameList = null;

            // MapExpressionParser mapParser = new MapExpressionParser("((\\s*(\\w+)\\s*\\.)*)(\\w+)");
            // List<String> parseInTableEntryLocations = mapParser.parseInTableEntryLocations2(expression);
            // for (String entryLocation : parseInTableEntryLocations) {
            //
            // }

            // context.schema.context.table.column
            // context.schema.table.column
            // schema.context.table.column
            // schema.table.column
            // table.column
            // add \\w*#* for oracle 12 , schema name start with C##
            MapExpressionParser mapParser1 = new MapExpressionParser("((\\s*(\\w*#*\\w+)\\s*\\.)*)([\\w\\(\\)]+)"); //$NON-NLS-1$
            // if it's nvl(Table.column , value)
            if (expression.toUpperCase().startsWith("NVL(") && expression.endsWith(")")
                    && expression.indexOf(",") != -1) {
                String withoutNVL = expression.substring(4, expression.length() - 1);
                itemNameList = mapParser1.parseInTableEntryLocations2(withoutNVL);
            } else {
                itemNameList = mapParser1.parseInTableEntryLocations2(expression);
            }

            if (itemNameList == null || itemNameList.isEmpty()) {
                MapExpressionParser mapParser2 = new MapExpressionParser("\\s*(\\w+)\\s*\\.\\s*(\\w+)\\s*"); //$NON-NLS-1$
                itemNameList = mapParser2.parseInTableEntryLocations(expression);
            }

            String quto_markParser = "[\\\\]?\\" + quto_mark; //$NON-NLS-1$
            for (Map<String, String> itemNamemap : itemNameList) {
                Set<Entry<String, String>> set = itemNamemap.entrySet();
                Iterator<Entry<String, String>> ite = set.iterator();
                while (ite.hasNext()) {
                    Entry<String, String> entry = ite.next();
                    String columnValue = entry.getKey();
                    String tableValue = entry.getValue();
                    boolean aliasFlag = false;
                    String tableNameValue = tableValue;
                    // find original table name if tableValue is alias
                    String originaltableName = tableValue;
                    ExternalDbMapData externalData = component.getExternalData();
                    final List<ExternalDbMapTable> inputTables = externalData.getInputTables();
                    for (ExternalDbMapTable inputTable : inputTables) {
                        if (inputTable.getAlias() != null && inputTable.getAlias().equals(tableValue)) {
                            originaltableName = inputTable.getTableName();
                            tableNameValue = inputTable.getAlias();
                            aliasFlag = true;
                        }
                    }

                    List<IConnection> inputConnections = (List<IConnection>) component.getIncomingConnections();
                    if (inputConnections != null) {

                        for (IConnection iconn : inputConnections) {
                            IMetadataTable metadataTable = iconn.getMetadataTable();
                            String tName = iconn.getName();
                            if ((originaltableName.equals(tName) || tableValue.equals(tName))
                                    && metadataTable != null) {
                                List<IMetadataColumn> lColumn = metadataTable.getListColumns();
                                String tableName = metadataTable.getTableName();
                                String tableColneName = tableName;
                                tableColneName = MetadataToolHelper.validateTableName(tableColneName);
                                if (tableValue.contains(".") && tableName != null) { //$NON-NLS-1$
                                    MapExpressionParser mapParser2 =
                                            new MapExpressionParser("\\s*(\\w+)\\s*\\.\\s*(\\w+)\\s*"); //$NON-NLS-1$
                                    List<Map<String, String>> tableNameList =
                                            mapParser2.parseInTableEntryLocations(tableValue);

                                    for (Map<String, String> tableNameMap : tableNameList) {
                                        Set<Entry<String, String>> setTable = tableNameMap.entrySet();
                                        Iterator<Entry<String, String>> iteTable = setTable.iterator();

                                        while (iteTable.hasNext()) {
                                            Entry<String, String> tableEntry = iteTable.next();
                                            String tableLabel = tableEntry.getKey();
                                            String schemaValue = tableEntry.getValue();
                                            if (tableLabel.equals(metadataTable.getLabel())
                                                    && tableColneName.equals(tableLabel)) {
                                                tableName = tableName.replaceAll("\\$", "\\\\\\$"); //$NON-NLS-1$//$NON-NLS-2$
                                                expression = expression
                                                        .replaceFirst(tableValue, schemaValue + "." + tableName); //$NON-NLS-1$
                                            }
                                        }

                                    }
                                } else if (tableName != null) {
                                    if (tableValue.equals(metadataTable.getLabel())
                                            && tableColneName.equals(tableValue)) {
                                        tableName = tableName.replaceAll("\\$", "\\\\\\$"); //$NON-NLS-1$ //$NON-NLS-2$
                                        expression = expression.replaceFirst(tableValue, tableName);
                                    }
                                }
                                INode source = iconn.getSource();
                                String handledTableName = "";
                                boolean inputIsELTDBMap = false;
                                String schemaValue = "";
                                String table = "";
                                boolean hasSchema = false;
                                IElementParameter schemaParam = source.getElementParameter("ELT_SCHEMA_NAME");
                                IElementParameter tableParam = source.getElementParameter("ELT_TABLE_NAME");
                                if (schemaParam != null && schemaParam.getValue() != null) {
                                    schemaValue = schemaParam.getValue().toString();
                                }
                                if (tableParam != null && tableParam.getValue() != null) {
                                    table = tableParam.getValue().toString();
                                }
                                String schemaNoQuote = TalendTextUtils.removeQuotes(schemaValue);
                                String tableNoQuote = TalendTextUtils.removeQuotes(table);
                                hasSchema = !"".equals(schemaNoQuote);
                                for (IMetadataColumn co : lColumn) {
                                    if (columnValue.equals(co.getLabel())) {
                                        String oriName = co.getOriginalDbColumnName();
                                        // if OriginalDbColumn is empty , still use label to generate sql
                                        if (oriName == null || "".equals(oriName)) { //$NON-NLS-1$
                                            continue;
                                        }
                                        if (expression.trim().equals(tableValue + "." + oriName)) {
                                            if (hasSchema && !aliasFlag) {
                                                expression = getTableName(iconn, schemaNoQuote, quote) + "."
                                                        + getTableName(iconn, tableNoQuote, quote) + "."
                                                        + getColumnName(iconn, oriName, quote);
                                                expression = expression.replaceAll(quto_markParser, "\\\\" + quto_mark); //$NON-NLS-1$
                                            } else {
                                                expression = getTableName(iconn, tableValue, quote) + "."
                                                        + getColumnName(iconn, oriName, quote);
                                                expression = expression.replaceAll(quto_markParser, "\\\\" + quto_mark); //$NON-NLS-1$
                                            }
                                            continue;
                                        }
                                        if (expression.trim().equals(originaltableName + "." + oriName)) {
                                            expression = originaltableName + "." + getColumnName(iconn, oriName, quote);
                                            expression = expression.replaceAll(quto_markParser, "\\\\" + quto_mark); //$NON-NLS-1$
                                            continue;
                                        }
                                        // if it is temp delived table, use label to generate sql
                                        if (iconn.getLineStyle() == EConnectionType.TABLE_REF) {
                                            continue;
                                        }
                                        if (!isRefTableConnection(iconn) && isAddQuotesInColumns()) {
                                            oriName = getColumnName(iconn, oriName, quote);
                                        } else {
                                            oriName = oriName.replaceAll("\\$", "\\\\\\$"); //$NON-NLS-1$ //$NON-NLS-2$
                                        }
                                        String quotedTableName = getTableName(iconn, tableValue, quote);
                                        quotedTableName = adaptQuoteForTableAndColumnName(component, quotedTableName);
                                        // expression = expression.replaceAll(tableValue, quotedTableName);
                                        // expression = expression.replaceFirst(tableValue + "\\." + co.getLabel(),
                                        // //$NON-NLS-1$
                                        // quotedTableName + "\\." + oriName); //$NON-NLS-1$
                                        // change replaceFirst to manually replace the String because some special chars
                                        // may not be replaced because of the regular expression
                                        int begin = expression.indexOf(tableValue + "." + co.getLabel());
                                        int length = (tableValue + "." + co.getLabel()).length();
                                        expression = expression.substring(0, begin) + quotedTableName + "." + oriName
                                                + expression.substring(begin + length);
                                        expression = replaceAuotes(component, expression, quto_markParser, quto_mark);
                                    }
                                }

                            }
                        }
                    }
                }
            }

        }

        return expression;
    }
}
