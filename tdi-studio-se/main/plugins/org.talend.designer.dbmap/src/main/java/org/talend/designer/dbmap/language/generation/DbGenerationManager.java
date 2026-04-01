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
package org.talend.designer.dbmap.language.generation;

import static java.util.Optional.ofNullable;
import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import org.talend.commons.ui.runtime.exception.ExceptionHandler;
import org.talend.commons.utils.StringUtils;
import org.talend.commons.utils.data.text.StringHelper;
import org.talend.core.database.EDatabaseTypeName;
import org.talend.core.model.metadata.Dbms;
import org.talend.core.model.metadata.IMetadataColumn;
import org.talend.core.model.metadata.IMetadataTable;
import org.talend.core.model.metadata.MappingTypeRetriever;
import org.talend.core.model.metadata.MetadataTalendType;
import org.talend.core.model.metadata.MetadataToolHelper;
import org.talend.core.model.metadata.builder.database.ExtractMetaDataUtils;
import org.talend.core.model.process.EConnectionType;
import org.talend.core.model.process.ElementParameterParser;
import org.talend.core.model.process.IConnection;
import org.talend.core.model.process.IContext;
import org.talend.core.model.process.IContextParameter;
import org.talend.core.model.process.IElementParameter;
import org.talend.core.model.process.IExternalNode;
import org.talend.core.model.process.INode;
import org.talend.core.model.process.IProcess;
import org.talend.core.model.utils.ContextParameterUtils;
import org.talend.core.model.utils.TalendTextUtils;
import org.talend.core.utils.TalendQuoteUtils;
import org.talend.designer.core.model.components.EParameterName;
import org.talend.designer.dbmap.AbstractUniteMapComponent;
import org.talend.designer.dbmap.DbMapComponent;
import org.talend.designer.dbmap.external.data.ExternalDbMapData;
import org.talend.designer.dbmap.external.data.ExternalDbMapEntry;
import org.talend.designer.dbmap.external.data.ExternalDbMapTable;
import org.talend.designer.dbmap.i18n.Messages;
import org.talend.designer.dbmap.language.AbstractDbLanguage;
import org.talend.designer.dbmap.language.IDbLanguage;
import org.talend.designer.dbmap.language.IJoinType;
import org.talend.designer.dbmap.language.operator.IDbOperator;
import org.talend.designer.dbmap.language.operator.IDbOperatorManager;
import org.talend.designer.dbmap.model.tableentry.TableEntryLocation;
import org.talend.designer.dbmap.utils.DBMapHelper;
import org.talend.designer.dbmap.utils.DataMapExpressionParser;
import org.talend.designer.dbmap.utils.problems.ProblemsAnalyser;

/**
 * DOC amaumont class global comment. Detailled comment <br/>
 *
 * $Id$
 *
 */
public abstract class DbGenerationManager {

    private Map<String, ExternalDbMapTable> nameToInputTable;

    private HashMap<String, ExternalDbMapTable> nameToVarsTable;

    protected IDbLanguage language;

    protected final Set<String> aliasAlreadyDeclared = new HashSet<String>();

    protected String queryColumnsName = ""; //$NON-NLS-1$

    protected String tabSpaceString = DEFAULT_TAB_SPACE_STRING;

    private final String DOT_STR = "."; //$NON-NLS-1$

    protected static final String DEFAULT_TAB_SPACE_STRING = ""; //$NON-NLS-1$

    protected List<String> queryColumnsSegments = new ArrayList<String>();

    protected List<String> querySegments = new ArrayList<String>();

    protected DataMapExpressionParser parser;

    private Boolean addQuotesInColumns;

    private Boolean addQuotesInTableNames;

    private Boolean delimitedCharacter;

    private String delimitedCharacterText;

    private Boolean useAliasInOutputTable;

    protected Set<String> subQueryTable = new HashSet<String>();

    protected INode source;

    protected Set<String> inputSchemaContextSet = new HashSet<String>();

    protected Set<String> inputSchemaGlobalMapSet = new HashSet<String>();

    /**
     * DOC amaumont GenerationManager constructor comment.
     *
     * @param language2
     */
    public DbGenerationManager(IDbLanguage language) {
        super();
        this.language = language;
        this.parser = new DataMapExpressionParser(language);
    }

    /**
     * DOC amaumont Comment method "setInputTables".
     *
     * @param inputTables
     */
    public void setInputTables(List<ExternalDbMapTable> inputTables) {
        // this.inputTables = inputTables;
        nameToInputTable = new HashMap<String, ExternalDbMapTable>(inputTables.size());
        for (ExternalDbMapTable table : inputTables) {
            nameToInputTable.put(table.getName(), table);
        }
    }

    /**
     * DOC amaumont Comment method "setInputTables".
     *
     * @param varsTables
     */
    public void setVarsTables(List<ExternalDbMapTable> varsTables) {
        // this.inputTables = varsTables;
        nameToVarsTable = new HashMap<String, ExternalDbMapTable>(varsTables.size());
        for (ExternalDbMapTable table : varsTables) {
            nameToVarsTable.put(table.getName(), table);
        }
    }

    public ExternalDbMapTable getInputTable(String tableName) {
        return nameToInputTable.get(tableName);
    }

    public ExternalDbMapTable getVarsTable(String tableName) {
        return nameToVarsTable.get(tableName);
    }

    public boolean isInputTable(String tableName) {
        return getInputTable(tableName) != null;
    }

    public boolean isVarsTable(String tableName) {
        return getVarsTable(tableName) != null;
    }

    public String getTableColumnVariable(String tableName, String columnName) {
        return StringHelper
                .replacePrms(this.language.getTemplateTableColumnVariable(), new Object[] { tableName, columnName });
    }

    public String getGeneratedCodeTableColumnVariable(String tableName, String columnName) {
        return StringHelper
                .replacePrms(this.language.getTemplateGeneratedCodeTableColumnVariable(),
                        new Object[] { tableName, columnName });
    }

    public String getTableColumnVariable(TableEntryLocation location) {
        return this.language.getLocation(location.tableName, location.columnName);
    }

    public String getVarsColumnVariable(String columnName) {
        return StringHelper.replacePrms(this.language.getTemplateVarsColumnVariable(), new Object[] { columnName });
    }

    public String indent(final int i) {
        return StringUtils.repeat("  ", i); //$NON-NLS-1$
    }

    public String getQueryColumnsName() {
        return this.queryColumnsName.replaceAll("[\r\n]", " ");
    }

    /**
     * DOC amaumont Comment method "ckeckConstraintsAreEmpty".
     *
     * @param ExternalDbMapTable
     * @return
     */
    public boolean checkFiltersAreEmpty(ExternalDbMapTable outputTable) {
        List<ExternalDbMapEntry> constraints = outputTable.getCustomWhereConditionsEntries();
        for (ExternalDbMapEntry whereEntry : constraints) {
            String constraintExpression = whereEntry.getExpression();
            if (constraintExpression != null && constraintExpression.trim().length() > 0) {
                return false;
            }
        }
        constraints = outputTable.getCustomOtherConditionsEntries();
        for (ExternalDbMapEntry otherEntry : constraints) {
            String constraintExpression = otherEntry.getExpression();
            if (constraintExpression != null && constraintExpression.trim().length() > 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Getter for language.
     *
     * @return the language
     */
    public IDbLanguage getLanguage() {
        return this.language;
    }

    public IDbOperatorManager getOperatorsManager() {
        return this.language.getOperatorsManager();
    }

    /**
     * DOC amaumont Comment method "removeUnmatchingEntriesWithColumnsOfMetadataTable".
     *
     * @param outputTable
     * @param metadataTable
     */
    protected ExternalDbMapTable removeUnmatchingEntriesWithColumnsOfMetadataTable(
            ExternalDbMapTable externalDbMapTable, IMetadataTable metadataTable) {
        ExternalDbMapTable clonedTable = null;
        try {
            clonedTable = (ExternalDbMapTable) externalDbMapTable.clone();
        } catch (CloneNotSupportedException e) {
            ExceptionHandler.process(e);
        }

        List<ExternalDbMapEntry> metadataTableEntries = clonedTable.getMetadataTableEntries();

        if (metadataTableEntries != null) {

            HashMap<String, IMetadataColumn> hNameToColumn = new HashMap<String, IMetadataColumn>();

            List<IMetadataColumn> listColumns = metadataTable.getListColumns();
            for (IMetadataColumn column : listColumns) {
                hNameToColumn.put(column.getLabel(), column);
            }
            List<ExternalDbMapEntry> dbMapEntriesToRemove = new ArrayList<ExternalDbMapEntry>();
            for (ExternalDbMapEntry externalTableEntry : metadataTableEntries) {
                String entryName = externalTableEntry.getName();
                IMetadataColumn column = hNameToColumn.get(entryName);
                if (column == null) {
                    dbMapEntriesToRemove.add(externalTableEntry);
                }
            }
            metadataTableEntries.removeAll(dbMapEntriesToRemove);
        }
        return clonedTable;

    }

    /**
     *
     * ggu Comment method "buildSqlSelect".
     *
     * @param component
     * @param outputTableName
     * @return
     */
    public String buildSqlSelect(DbMapComponent component, String outputTableName) {
        boolean checkUseUpdateStatement = checkUseUpdateStatement(component, outputTableName);
        if (checkUseUpdateStatement) {
            return buildSqlUpdate(component, outputTableName, DEFAULT_TAB_SPACE_STRING);
        } else {
            return buildSqlSelect(component, outputTableName, DEFAULT_TAB_SPACE_STRING);
        }
    }

    protected String getAliasOf(String tableName) {
        return tableName;
    }

    protected String addQuotes(String name) {
        return name;
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
    public String buildSqlSelect(DbMapComponent dbMapComponent, String outputTableName, String tabString) {
        queryColumnsName = "\""; //$NON-NLS-1$
        aliasAlreadyDeclared.clear();
        queryColumnsSegments.clear();
        querySegments.clear();
        subQueryTable.clear();
        inputSchemaContextSet.clear();
        inputSchemaGlobalMapSet.clear();

        this.tabSpaceString = tabString;
        DbMapComponent component = getDbMapComponent(dbMapComponent);

        List<IConnection> outputConnections = (List<IConnection>) component.getOutgoingConnections();

        Map<String, IConnection> nameToOutputConnection = new HashMap<String, IConnection>();
        for (IConnection connection : outputConnections) {
            nameToOutputConnection.put(connection.getUniqueName(), connection);
        }

        ExternalDbMapData data = component.getExternalData();
        List<ExternalDbMapTable> inputTables = data.getInputTables();
        List<String> contextList = getContextList(component);
        collectSchemaContextParam(dbMapComponent, inputTables, contextList);
        collectSchemaGlobalMapParam(dbMapComponent, inputTables);
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
                    expression = addQuoteForSpecialChar(expression, component);
                    // for (IMetadataColumn column : columns) {
                    // if (expression != null && column.getLabel().equals(dbMapEntry.getName())) {
                    // expression = expression.replaceFirst("." + dbMapEntry.getName(), //$NON-NLS-1$
                    // "." + column.getOriginalDbColumnName()); //$NON-NLS-1$
                    // break;
                    // }
                    // }
                    boolean added = false;
                    if (!DEFAULT_TAB_SPACE_STRING.equals(this.tabSpaceString)) {
                        expression += DbMapSqlConstants.SPACE + DbMapSqlConstants.AS + DbMapSqlConstants.SPACE
                                + getAliasOf(dbMapEntry.getName());
                        added = true;
                    }
                    String exp = replaceVariablesForExpression(component, expression);
                    String columnSegment = exp;
                    if (i > 0) {
                        appendSqlQuery(sb, DbMapSqlConstants.COMMA);
                        appendSqlQuery(sb, DbMapSqlConstants.SPACE);
                        queryColumnsName += DbMapSqlConstants.COMMA + DbMapSqlConstants.SPACE;
                        columnSegment = DbMapSqlConstants.COMMA + DbMapSqlConstants.SPACE + columnSegment;
                    }
                    if (expression != null && expression.trim().length() > 0) {
                        appendSqlQuery(sb, exp);
                        String alias = exp;
                        if (!added && isUseAliasInOutputTable()) {
                            String name = DbMapSqlConstants.SPACE + DbMapSqlConstants.AS + DbMapSqlConstants.SPACE
                                    + getAliasOf(dbMapEntry.getName());
                            appendSqlQuery(sb, name);
                            alias = getAliasOf(dbMapEntry.getName());
                        }
                        queryColumnsName += alias;
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
                            buildTableDeclaration(component, sb, inputTables.get(i - 1), commaCouldBeAdded,
                                    crCouldBeAdded, true);
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
                        if (!buildConditions(component, sb, inputTable, true, true, true)) {
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

            StringBuilder sbWhere = new StringBuilder();
            this.tabSpaceString = DEFAULT_TAB_SPACE_STRING;
            boolean isFirstClause = true;
            for (int i = 0; i < lstSizeInputTables; i++) {
                ExternalDbMapTable inputTable = inputTables.get(i);
                if (buildConditions(component, sbWhere, inputTable, false, isFirstClause, false)) {
                    isFirstClause = false;
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
                            if (containWith(exp, DbMapSqlConstants.OR, true)
                                    || containWith(exp, DbMapSqlConstants.AND, true)) {
                                exp = replaceVariablesForAdditionalClauses(component, exp);
                                originalWhereAddition.add(exp);
                            } else {
                                exp = replaceVariablesForAdditionalClauses(component, exp);
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
                            exp = replaceVariablesForAdditionalClauses(component, exp);
                            otherAddition.add(exp);
                        }
                    }
                }
            }
            this.tabSpaceString = tabString;

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
                appendSqlQuery(sb, whereClauses);
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

    protected void collectSchemaContextParam(DbMapComponent dbMapComponent, List<ExternalDbMapTable> inputTables,
            List<String> contextList) {
        List<IConnection> incomingConnections = (List<IConnection>) dbMapComponent.getIncomingConnections();
        if (incomingConnections != null) {
            for (IConnection connection : incomingConnections) {
                INode input = connection.getSource();
                if (input != null) {
                    IElementParameter eltSchemaNameParam = input.getElementParameter("ELT_SCHEMA_NAME"); //$NON-NLS-1$
                    if (eltSchemaNameParam != null && eltSchemaNameParam.getValue() != null) {
                        String schema = String.valueOf(eltSchemaNameParam.getValue());
                        if (schema != null && !inputSchemaContextSet.contains(schema) && contextList.contains(schema)) {
                            inputSchemaContextSet.add(schema);
                        }
                    }
                    IElementParameter eltTableNameParam = input.getElementParameter("ELT_TABLE_NAME"); //$NON-NLS-1$
                    if (eltTableNameParam != null && eltTableNameParam.getValue() != null) {
                        String table = String.valueOf(eltTableNameParam.getValue());
                        if (table != null && !inputSchemaContextSet.contains(table) && contextList.contains(table)) {
                            inputSchemaContextSet.add(table);
                        }
                    }
                }
            }
        }
        if (inputTables != null) {
            for (ExternalDbMapTable table : inputTables) {
                if (table.getAlias() != null && !inputSchemaContextSet.contains(table.getAlias())
                        && contextList.contains(table.getAlias())) {
                    inputSchemaContextSet.add(table.getAlias());
                }
            }
        }
    }

    protected void collectSchemaGlobalMapParam(DbMapComponent dbMapComponent, List<ExternalDbMapTable> inputTables) {
        List<IConnection> incomingConnections = (List<IConnection>) dbMapComponent.getIncomingConnections();
        if (incomingConnections != null) {
            for (IConnection connection : incomingConnections) {
                INode input = connection.getSource();
                if (input != null) {
                    IElementParameter eltSchemaNameParam = input.getElementParameter("ELT_SCHEMA_NAME"); //$NON-NLS-1$
                    if (eltSchemaNameParam != null && eltSchemaNameParam.getValue() != null) {
                        String schema = String.valueOf(eltSchemaNameParam.getValue());
                        if (schema != null && !inputSchemaGlobalMapSet.contains(schema)
                                && parser.getGlobalMapSet(schema).size() > 0) {
                            inputSchemaGlobalMapSet.add(schema);
                        }
                    }
                    IElementParameter eltTableNameParam = input.getElementParameter("ELT_TABLE_NAME"); //$NON-NLS-1$
                    if (eltTableNameParam != null && eltTableNameParam.getValue() != null) {
                        String table = String.valueOf(eltTableNameParam.getValue());
                        if (table != null && !inputSchemaGlobalMapSet.contains(table)
                                && parser.getGlobalMapSet(table).size() > 0) {
                            inputSchemaGlobalMapSet.add(table);
                        }
                    }
                }
            }
        }
        if (inputTables != null) {
            for (ExternalDbMapTable table : inputTables) {
                if (table.getAlias() != null && !inputSchemaGlobalMapSet.contains(table.getAlias())
                        && parser.getGlobalMapSet(table.getAlias()).size() > 0) {
                    inputSchemaGlobalMapSet.add(table.getAlias());
                }
            }
        }
    }

    protected DbMapComponent getDbMapComponent(DbMapComponent dbMapComponent) {
        DbMapComponent component = dbMapComponent;
        INode realGraphicalNode = dbMapComponent.getRealGraphicalNode();
        if (realGraphicalNode != null) {
            IExternalNode externalNode = realGraphicalNode.getExternalNode();
            if (externalNode instanceof DbMapComponent) {
                component = (DbMapComponent) externalNode;
            }
        }
        checkParameters(component);
        return component;
    }

    protected void checkParameters(DbMapComponent component) {
        checkSpecialParameters(component);
    }

    protected boolean checkUseUpdateStatement(DbMapComponent dbMapComponent, String outputTableName) {
        List<IConnection> outputConnections = (List<IConnection>) dbMapComponent.getOutgoingConnections();
        if (outputConnections != null) {
            IConnection iconn = this.getConnectonByMetadataName(outputConnections, outputTableName);
            if (iconn != null && iconn.getTarget() != null) {
                source = iconn.getTarget();
                IElementParameter useUpdateStatementParam = source.getElementParameter("USE_UPDATE_STATEMENT"); //$NON-NLS-1$
                if (useUpdateStatementParam != null && useUpdateStatementParam.isShow(source.getElementParameters())
                        && useUpdateStatementParam.getValue() != null) {
                    return Boolean.valueOf(useUpdateStatementParam.getValue().toString());
                }
            }
        }
        return false;
    }

    protected String getDifferentTable(DbMapComponent dbMapComponent, String outputTableName) {
        if (!ExtractMetaDataUtils.SNOWFLAKE.equalsIgnoreCase(getDbType(dbMapComponent))) {
            return null;
        }
        List<IConnection> outputConnections = (List<IConnection>) dbMapComponent.getOutgoingConnections();
        if (outputConnections != null) {
            IConnection iconn = this.getConnectonByMetadataName(outputConnections, outputTableName);
            if (iconn != null && iconn.getTarget() != null) {
                source = iconn.getTarget();
                IElementParameter useDifferentTable = source.getElementParameter("USE_DIFFERENT_TABLE"); //$NON-NLS-1$
                if (useDifferentTable != null && useDifferentTable.isShow(source.getElementParameters())
                        && useDifferentTable.getValue() != null) {
                    if (Boolean.valueOf(useDifferentTable.getValue().toString())) {
                        IElementParameter differentTable = source.getElementParameter("DIFFERENT_TABLE_NAME"); //$NON-NLS-1$
                        if (differentTable != null && differentTable.getValue() != null) {
                            String table = TalendTextUtils.removeQuotes(String.valueOf(differentTable.getValue()));
                            if (org.apache.commons.lang.StringUtils.isNotBlank(table)) {
                                return table;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    protected String getDbType(DbMapComponent component) {
        IElementParameter mappingPara = component.getElementParameter(EParameterName.MAPPING.getName());
        if (mappingPara == null) {
            return null;
        }
        String mapping = (String) mappingPara.getValue();
        if (mapping == null) {
            return null;
        }
        MappingTypeRetriever mappingTypeRetriever = MetadataTalendType.getMappingTypeRetriever(mapping);
        if (mappingTypeRetriever == null) {
            return null;
        }
        Dbms dbms = mappingTypeRetriever.getDbms();
        if (dbms == null) {
            return null;
        }
        return dbms.getProduct();
    }

    /**
     * This piece regulates which columns are going to be skipped in UPDATE QUERY generation in SET section if
     * <b>SET_COLUMN</b> property exists. This
     * enhancement is needed for tELTOutput component in case of <b>USE_UPDATE_STATEMENT</b>
     *
     * @return List of columns that going to be skipped, if no <b>SET_COLUMN</b> specified then return empty list.
     */
    protected List<Boolean> getSetColumnsForUpdateQuery() {
        return ofNullable(source.getElementParameter("SET_COLUMN"))
                .filter(iep -> iep.isShow(source.getElementParameters()))
                .flatMap(iep -> ofNullable((List<Map<String, ? extends Object>>) iep.getValue()))
                .orElseGet(Collections::emptyList)
                .stream()
                .map(m -> !Boolean.valueOf(m.get("UPDATE_COLUMN").toString()))
                .collect(toList());
    }

    protected void checkSpecialParameters(DbMapComponent component) {
        /**
         * in elt related component javajets(like tELTMSSqlMap_main.javajet), they don't get DbGenerationManager by
         * DbMapComponent#getGenerationManager() while they construct a new manager manually, so some parameters may not
         * be initialised, then need to check these parameters here manually to make sure they are initialised.
         */
        if (this.addQuotesInColumns == null) {
            this.addQuotesInColumns = false;
            IElementParameter activeDelimitedIdentifiersEP =
                    component.getElementParameter(EParameterName.ACTIVE_DATABASE_DELIMITED_IDENTIFIERS.getName());
            if (activeDelimitedIdentifiersEP != null) {
                Object value = activeDelimitedIdentifiersEP.getValue();
                if (value != null) {
                    setAddQuotesInColumns(Boolean.valueOf(value.toString()));
                }
            }
        }

        if (this.addQuotesInTableNames == null) {
            this.addQuotesInTableNames = false;
            IElementParameter activeAddQuotesInTableNameEP =
                    component.getElementParameter(EParameterName.ACTIVE_ADD_QUOTES_IN_TABLE_NAME.getName());
            if (activeAddQuotesInTableNameEP != null) {
                Object value = activeAddQuotesInTableNameEP.getValue();
                if (value != null) {
                    setAddQuotesInTableNames(Boolean.valueOf(value.toString()));
                }
            }
        }

        if (this.delimitedCharacter == null) {
            this.delimitedCharacter = false;
            IElementParameter activeDelimitedCharacterEP =
                    component.getElementParameter(EParameterName.ACTIVE_DELIMITED_CHARACTER.getName());
            if (activeDelimitedCharacterEP != null) {
                Object value = activeDelimitedCharacterEP.getValue();
                if (value != null) {
                    setDelimitedCharacter(Boolean.valueOf(value.toString()));
                }
            }
        }

        if (this.delimitedCharacterText == null) {
            this.delimitedCharacterText = "";
            IElementParameter delimitedCharacterTextEP =
                    component.getElementParameter(EParameterName.DELIMITED_CHARACTER_TEXT.getName());
            if (delimitedCharacterTextEP != null) {
                Object value = delimitedCharacterTextEP.getValue();
                if (value != null) {
                    setDelimitedCharacterText(String.valueOf(value));
                }
            }
        }

        if (this.useAliasInOutputTable == null) {
            this.useAliasInOutputTable = false;
            IElementParameter useAliasInOutputTableEP =
                    component.getElementParameter(EParameterName.USE_ALIAS_IN_OUTPUT_TABLE.getName());
            if (useAliasInOutputTableEP != null) {
                Object value = useAliasInOutputTableEP.getValue();
                if (value != null) {
                    setUseAliasInOutputTable(Boolean.valueOf(value.toString()));
                }
            }
        }
    }

    /**
     *
     * DOC wchen Comment method "replaceExpression".
     *
     * @param expression
     * @param component
     */
    protected String replaceVariablesForExpression(DbMapComponent component, String expression) {
        if (expression == null) {
            return null;
        }
        String quote = getQuote(component);
        if ("\"".equals(quote)) {
            quote = "\\\\\"";
        }
        List<String> contextList = getContextList(component);
        boolean haveReplace = false;
        for (String context : contextList) {
            if (expression.contains(context)) {
                if (isAddQuotesInTableNames()) {
                    expression = expression
                            .replaceAll("\\b" + context + "\\b", //$NON-NLS-1$ //$NON-NLS-2$
                                    "\" +" + "\"" + quote + "\" + " + context + " + \"" + quote + "\"" + "+ \""); //$NON-NLS-1$ //$NON-NLS-2$
                } else {
                    String tempExpression = expression.replace(" ", "");
                    if (!tempExpression.contains("\"+" + context + "+\"")) {
                        expression = expression.replaceAll("\\b" + context + "\\b", "\" +" + context + "+ \"");//$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
                    }
                }
                haveReplace = true;
            }
        }
        if (!haveReplace) {
            List<String> connContextList = getConnectionContextList(component);
            for (String context : connContextList) {
                if (expression.contains(context)) {
                    if (isAddQuotesInTableNames()) {
                        expression = expression
                                .replaceAll("\\b" + context + "\\b", //$NON-NLS-1$ //$NON-NLS-2$
                                        "\" +" + "\"" + quote + "\" + " + context + " + \"" + quote + "\"" + "+ \""); //$NON-NLS-1$ //$NON-NLS-2$
                    } else {
                        expression = expression.replaceAll("\\b" + context + "\\b", "\" +" + context + "+ \""); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
                    }
                }
            }
        }
        Set<String> globalMapList = getGlobalMapList(component, expression);
        if (globalMapList.size() > 0) {
            String tempExpression = expression.trim();
            if ((tempExpression.startsWith("\"+") && tempExpression.endsWith("+\"")) //$NON-NLS-1$//$NON-NLS-2$
                    || (tempExpression.startsWith("\" +") && tempExpression.endsWith("+ \""))) {//$NON-NLS-1$ //$NON-NLS-2$
                return expression;
            }
        }
        for (String globalMapStr : globalMapList) {
            expression = handleGlobalStringInExpression(expression, globalMapStr, quote, true);
        }
        return expression;
    }

    protected String replaceVariablesForAdditionalClauses(DbMapComponent component, String expression) {
        if (expression == null) {
            return null;
        }
        String quote = getQuote(component);
        String oriQuote = quote;
        if ("\"".equals(quote)) {
            quote = "\\\\\"";
        }
        List<String> contextList = getContextList(component);
        boolean haveReplace = false;
        for (String context : contextList) {
            if (expression.contains(context)) {
                if (isAddQuotesInTableNames() && inputSchemaContextSet.contains(context)) {
                    expression = expression
                            .replaceAll("\\b" + context + "\\b", //$NON-NLS-1$ //$NON-NLS-2$
                                    "\" +" + "\"" + quote + "\" + " + context + " + \"" + quote + "\"" + "+ \""); //$NON-NLS-1$ //$NON-NLS-2$
                } else {
                    expression = expression.replaceAll("\\b" + context + "\\b", "\" +" + context + "+ \""); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
                }
                haveReplace = true;
            }
        }
        if (!haveReplace) {
            List<String> connContextList = getConnectionContextList(component);
            for (String context : connContextList) {
                if (expression.contains(context)) {
                    if (isAddQuotesInTableNames() && inputSchemaContextSet.contains(context)) {
                        expression = expression
                                .replaceAll("\\b" + context + "\\b", //$NON-NLS-1$ //$NON-NLS-2$
                                        "\" +" + "\"" + quote + "\" + " + context + " + \"" + quote + "\"" + "+ \""); //$NON-NLS-1$ //$NON-NLS-2$
                    } else {
                        expression = expression.replaceAll("\\b" + context + "\\b", "\" +" + context + "+ \""); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
                    }
                }
            }
        }
        Set<String> globalMapList = getGlobalMapList(component, expression);
        if (globalMapList.size() > 0) {
            String tempExpression = expression.trim();
            if ((tempExpression.startsWith("\"+") && tempExpression.endsWith("+\"")) //$NON-NLS-1$//$NON-NLS-2$
                    || (tempExpression.startsWith("\" +") && tempExpression.endsWith("+ \""))) {//$NON-NLS-1$ //$NON-NLS-2$
                return expression;
            }
        }
        for (String globalMapStr : globalMapList) {
            expression = handleGlobalStringInExpression(expression, globalMapStr, oriQuote,
                    inputSchemaGlobalMapSet.contains(globalMapStr));
        }
        return expression;
    }

    /**
     * try add [" +] before global string and add [+ "] after if needed
     * when checkQuote=true means won't add quotes because it will add the quote after handle the globalString
     */
    public String handleGlobalStringInExpression(String expression, String globalMapStr, String quote,
            boolean checkQuote) {
        String regex = parser.getGlobalMapExpressionRegex(globalMapStr);
        String replacement = parser.getGlobalMapReplacement(globalMapStr);
        int countMatches = org.apache.commons.lang.StringUtils.countMatches(expression, globalMapStr);
        String oriQuote = quote;
        if ("\"".equals(quote)) {
            quote = "\\\\\"";
        }
        if (1 == countMatches) {
            int indexGlobal = expression.indexOf(globalMapStr);

            boolean foundhead = foundhead(expression, indexGlobal - 1, 0);

            boolean foundtail = foundtail(expression, indexGlobal + globalMapStr.length(), expression.length());

            if (!foundhead && !foundtail) {
                if (isAddQuotesInTableNames() && checkQuote) {
                    expression = expression
                            .replaceAll(regex,
                                    "\" +" + "\"" + quote + "\" + " + replacement + " + \"" + quote + "\"" + "+ \"");//$NON-NLS-1$ //$NON-NLS-2$
                } else {
                    expression = expression.replaceAll(regex, "\" +" + replacement + "+ \"");//$NON-NLS-1$ //$NON-NLS-2$
                }
            } else if (!foundhead) {
                if (isAddQuotesInTableNames() && checkQuote) {
                    expression = expression
                            .replaceAll(regex, "\" +" + "\"" + quote + "\" + " + replacement + " + \"" + quote + "\"");//$NON-NLS-1$ //$NON-NLS-2$
                } else {
                    expression = expression.replaceAll(regex, "\" +" + replacement);//$NON-NLS-1$ //$NON-NLS-2$
                }
            } else if (!foundtail) {
                if (isAddQuotesInTableNames() && checkQuote) {
                    expression = expression
                            .replaceAll(regex,
                                    "\" +" + "\"" + quote + "\" + " + replacement + " + \"" + quote + "\"" + "+ \"");//$NON-NLS-1$ //$NON-NLS-2$
                } else {
                    expression = expression.replaceAll(regex, replacement + "+ \"");
                }
            }
        } else {
            if ("\"".equals(oriQuote)) {
                oriQuote = "\\\"";
            }
            int length = globalMapStr.length();
            int[] index = new int[countMatches];
            index[0] = expression.indexOf(globalMapStr);
            for (int i = 1; i < countMatches; i++) {
                index[i] = org.apache.commons.lang.StringUtils.indexOf(expression, globalMapStr, index[i - 1] + length);
            }

            String[] globalMapStrReplacement = new String[countMatches];
            for (int i = index.length - 1; i >= 0; i--) {
                globalMapStrReplacement[i] = globalMapStr;

                boolean foundhead =
                        foundhead(expression, index[i] - 1, i > 0 ? index[i - 1] + globalMapStr.length() : 0);
                boolean foundtail = foundtail(expression, index[i] + globalMapStr.length(),
                        i == index.length - 1 ? expression.length() : index[i + 1]);

                if (!foundhead && !foundtail) {
                    if (isAddQuotesInTableNames() && checkQuote) {
                        globalMapStrReplacement[i] =
                                "\" +" + "\"" + oriQuote + "\" + " + replacement + " + \"" + oriQuote + "\"" + "+ \"";//$NON-NLS-1$ //$NON-NLS-2$
                    } else {
                        globalMapStrReplacement[i] = "\" +" + replacement + "+ \"";//$NON-NLS-1$ //$NON-NLS-2$
                    }
                } else if (!foundhead) {
                    if (isAddQuotesInTableNames() && checkQuote) {
                        globalMapStrReplacement[i] =
                                "\" +" + "\"" + oriQuote + "\" + " + replacement + " + \"" + oriQuote + "\"";//$NON-NLS-1$ //$NON-NLS-2$
                    } else {
                        globalMapStrReplacement[i] = "\" +" + replacement;//$NON-NLS-1$ //$NON-NLS-2$
                    }
                } else if (!foundtail) {
                    if (isAddQuotesInTableNames() && checkQuote) {
                        globalMapStrReplacement[i] =
                                "\" +" + "\"" + oriQuote + "\" + " + replacement + " + \"" + oriQuote + "\"" + "+ \"";//$NON-NLS-1$ //$NON-NLS-2$
                    } else {
                        globalMapStrReplacement[i] = replacement + "+ \"";//$NON-NLS-1$ //$NON-NLS-2$
                    }
                }
            }

            for (int i = index.length - 1; i >= 0; i--) {
                expression = expression.substring(0, index[i]) + globalMapStrReplacement[i]
                        + expression.substring(index[i] + length);
            }
        }
        return expression;
    }

    /*
     * from to startIndex(include) to tolowerIndex(include), check in order if found + and then found "
     */
    public boolean foundhead(String expression, int startIndex, int tolowerIndex) {
        boolean foundhead = false;
        for (int index = startIndex; index >= tolowerIndex && !foundhead; index--) {
            if (Character.isWhitespace(expression.charAt(index))) {
                continue;
            }

            if (expression.charAt(index) != '+') {
                break;
            }

            // char at index is '+'
            for (int i = index - 1; i >= 0 && index >= tolowerIndex; i--) {
                char ch = expression.charAt(i);
                if (ch == '"') {
                    foundhead = true;
                    break;
                } else if (!Character.isWhitespace(ch)) {
                    break;
                }
            }
        }
        return foundhead;
    }

    /*
     * from to startIndex(include) to tohigherIndex(exclude), check in order if found + and then found "
     */
    public boolean foundtail(String expression, int startIndex, int tohigherIndex) {
        boolean foundtail = false;
        for (int index = startIndex; index < tohigherIndex && !foundtail; index++) {
            if (Character.isWhitespace(expression.charAt(index))) {
                continue;
            }

            if (expression.charAt(index) != '+') {
                break;
            }

            // char at index is '+'
            for (int i = index + 1; i < tohigherIndex; i++) {
                char ch = expression.charAt(i);
                if (ch == '"') {
                    foundtail = true;
                    break;
                } else if (!Character.isWhitespace(ch)) {
                    break;
                }
            }
        }
        return foundtail;
    }

    protected String replaceVariablesForTargetTableExpression(DbMapComponent component, String expression) {
        if (expression == null) {
            return null;
        }
        String quote = getQuote(component);
        if (TalendQuoteUtils.isStartEndsWithQuotation(expression, true, false)) {
            expression = expression.substring(1);
        }

        if (TalendQuoteUtils.isStartEndsWithQuotation(expression, false, true)) {
            expression = expression.substring(0, expression.length() - 1);
        }

        List<String> contextList = getContextList(component);
        Collections.sort(contextList, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });
        boolean haveReplace = false;
        for (String context : contextList) {
            if (expression.contains(context)) {
                if (expression.trim().equals(context)) {
                    expression = expression.replaceAll("\\b" + context + "\\b", "\" +" + context + "+ \""); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
                    haveReplace = true;
                } else {
                    if (expression.trim().indexOf(context) == 0) {
                        expression = expression.replaceFirst("\\b" + context + "\\b", "\" +" + context); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                        haveReplace = true;
                    }
                    if (expression.trim().endsWith(context)) {
                        expression = expression.replaceAll("\\b" + context + "\\b", context + "+ \""); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                        haveReplace = true;
                    }
                }
            }
        }
        if (!haveReplace) {
            List<String> connContextList = getConnectionContextList(component);
            for (String context : connContextList) {
                if (expression.trim().equals(context)) {
                    expression = expression.replaceAll("\\b" + context + "\\b", "\" +" + context + "+ \""); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
                    haveReplace = true;
                } else {
                    if (expression.trim().indexOf(context) == 0) {
                        expression = expression.replaceFirst("\\b" + context + "\\b", "\" +" + context); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                        haveReplace = true;
                    }
                    if (expression.trim().endsWith(context)) {
                        expression = expression.replaceAll("\\b" + context + "\\b", context + "+ \""); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                        haveReplace = true;
                    }
                }
            }
        }
        Set<String> globalMapList = getGlobalMapList(component, expression);
        if (globalMapList.size() > 0) {
            String tempExpression = expression.trim();
            if ((tempExpression.startsWith("\"+") && tempExpression.endsWith("+\"")) //$NON-NLS-1$//$NON-NLS-2$
                    || (tempExpression.startsWith("\" +") && tempExpression.endsWith("+ \""))) {//$NON-NLS-1$ //$NON-NLS-2$
                return expression;
            }
        }
        for (String globalMapStr : globalMapList) {
            expression = handleGlobalStringInExpression(expression, globalMapStr, quote, false);
        }
        return expression;
    }

    protected void replaceQueryContext(List<String> querySegments, String context) {
        if (querySegments == null || querySegments.size() == 0) {
            return;
        }
        for (int i = 0; i < querySegments.size(); i++) {
            String segment = querySegments.get(i);
            if (segment.contains(context)) {
                segment = segment.replaceAll("\\b" + context + "\\b", "\" +" + context + "+ \""); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
                querySegments.set(i, segment);
            }
        }
    }

    protected void replaceQueryGlobalMap(List<String> querySegments, String regex, String globalMapString) {
        for (int i = 0; i < querySegments.size(); i++) {
            String segment = querySegments.get(i);
            if (segment.contains(globalMapString)) {
                segment = segment.replaceAll(regex, "\" +" + globalMapString + "+ \""); //$NON-NLS-1$ //$NON-NLS-2$
                querySegments.set(i, segment);
            }
        }
    }

    protected boolean needAlias(List<IMetadataColumn> columns, ExternalDbMapEntry dbMapEntry, String expression) {
        return false;
    }

    protected void appendSqlQuery(StringBuilder sb, String value) {
        appendSqlQuery(sb, value, true);
    }

    protected void appendSqlQuery(StringBuilder sb, String value, boolean addToQuerySegment) {
        if (!"".equals(value)) {//$NON-NLS-1$
            sb.append(value);
            if (addToQuerySegment) {
                querySegments.add(value);
            }
        }
    }

    public List<String> getQuerySegments() {
        return querySegments;
    }

    public List<String> getQueryColumnsSegments() {
        return queryColumnsSegments;
    }

    protected String handleQuery(String query) {
        if (query != null) {
            if (!query.trim().endsWith("\"")) { //$NON-NLS-1$
                query = query + "\""; //$NON-NLS-1$
            } else if (query.trim().endsWith("\\\"")) { //$NON-NLS-1$
                query = query + " \""; //$NON-NLS-1$
            } else {
                if (query.trim().endsWith("+ \"")) { //$NON-NLS-1$
                    if (DEFAULT_TAB_SPACE_STRING.equals(this.tabSpaceString)) {
                        query = query.substring(0, query.lastIndexOf("+ \"")); //$NON-NLS-1$
                    } else {
                        query = query + "\"";
                    }
                }
            }
        }
        return query;
    }

    public static boolean containWith(String expression, String pattern, boolean start) {
        if (expression != null) {
            expression = expression.trim();
            try {
                if (start) {
                    pattern = DbMapSqlConstants.EMPTY + '^' + pattern;
                }
                Pattern regex = Pattern.compile(pattern, Pattern.CANON_EQ | Pattern.CASE_INSENSITIVE);
                Matcher regexMatcher = regex.matcher(expression);
                return regexMatcher.find();
            } catch (PatternSyntaxException ex) {
                //
            }
        }
        return false;
    }

    protected List<String> getContextList(DbMapComponent component) {
        List<String> contextList = new ArrayList<String>();
        IProcess process = component.getProcess();
        IContext context = process.getContextManager().getDefaultContext();
        List<IContextParameter> paraList = context.getContextParameterList();
        for (IContextParameter para : paraList) {
            contextList.add(ContextParameterUtils.JAVA_NEW_CONTEXT_PREFIX + para.getName());
        }

        return contextList;
    }

    protected Set<String> getGlobalMapList(DbMapComponent component, String sqlQuery) {
        return parser.getGlobalMapSet(sqlQuery);
    }

    protected boolean isContainsGlobalMap(String sqlQuery) {
        return parser.getGlobalMapSet(sqlQuery).size() > 0;
    }

    /**
     * DOC amaumont Comment method "buildConditions".
     *
     * @param sb
     * @param inputTable
     * @param writeForJoin TODO
     * @param isFirstClause TODO
     */
    protected boolean buildConditions(DbMapComponent component, StringBuilder sb, ExternalDbMapTable inputTable,
            boolean writeForJoin, boolean isFirstClause) {
        return buildConditions(component, sb, inputTable, writeForJoin, isFirstClause, false);
    }

    /**
     * DOC amaumont Comment method "buildConditions".
     *
     * @param sb
     * @param inputTable
     * @param writeForJoin TODO
     * @param isFirstClause TODO
     * @param isSqlQuert TODO
     */
    protected boolean buildConditions(DbMapComponent component, StringBuilder sb, ExternalDbMapTable inputTable,
            boolean writeForJoin, boolean isFirstClause, boolean isSqlQuert) {
        List<ExternalDbMapEntry> inputEntries = inputTable.getMetadataTableEntries();
        int lstSizeEntries = inputEntries.size();
        boolean atLeastOneConditionWritten = false;
        for (int j = 0; j < lstSizeEntries; j++) {
            ExternalDbMapEntry dbMapEntry = inputEntries.get(j);
            if (writeForJoin == dbMapEntry.isJoin()) {
                boolean conditionWritten =
                        buildCondition(component, sb, inputTable, isFirstClause, dbMapEntry, !writeForJoin, isSqlQuert);
                if (conditionWritten) {
                    atLeastOneConditionWritten = true;
                }
                if (isFirstClause && conditionWritten) {
                    isFirstClause = false;
                }
            }
        }
        return atLeastOneConditionWritten;
    }

    /**
     * build conditions for update case only DOC hzhao Comment method "buildConditions".
     * 
     * @param isFirstClause
     * @param component
     * @param sb
     * @param inputTable
     * @param isSqlQuert
     * @return
     */
    protected boolean buildConditions4WhereClause(boolean isFirstClause, DbMapComponent component, StringBuilder sb,
            ExternalDbMapTable inputTable, boolean isSqlQuert) {
        List<ExternalDbMapEntry> inputEntries = inputTable.getMetadataTableEntries();
        int lstSizeEntries = inputEntries.size();
        boolean atLeastOneConditionWritten = false;
        for (int j = 0; j < lstSizeEntries; j++) {
            ExternalDbMapEntry dbMapEntry = inputEntries.get(j);
            boolean conditionWritten =
                    buildCondition(component, sb, inputTable, isFirstClause, dbMapEntry, true, isSqlQuert);
            if (conditionWritten) {
                atLeastOneConditionWritten = true;
            }
            if (isFirstClause && conditionWritten) {
                isFirstClause = false;
            }
        }
        return atLeastOneConditionWritten;
    }

    /**
     * DOC amaumont Comment method "buildCondition".
     *
     * @param sbWhere
     * @param table
     * @param isFirstClause
     * @param dbMapEntry
     * @param writeCr TODO
     */
    private boolean buildCondition(DbMapComponent component, StringBuilder sbWhere, ExternalDbMapTable table,
            boolean isFirstClause, ExternalDbMapEntry dbMapEntry, boolean writeCr) {
        return buildCondition(component, sbWhere, table, isFirstClause, dbMapEntry, writeCr, false);
    }

    /**
     * DOC amaumont Comment method "buildCondition".
     *
     * @param sbWhere
     * @param table
     * @param isFirstClause
     * @param dbMapEntry
     * @param writeCr TODO
     */
    private boolean buildCondition(DbMapComponent component, StringBuilder sbWhere, ExternalDbMapTable table,
            boolean isFirstClause, ExternalDbMapEntry dbMapEntry, boolean writeCr, boolean isSqlQuery) {
        String expression = initExpression(component, dbMapEntry);
        IDbOperator dbOperator = getOperatorsManager().getOperatorFromValue(dbMapEntry.getOperator());
        boolean operatorIsSet = dbOperator != null;
        boolean expressionIsSet = expression != null && expression.trim().length() > 0;

        boolean conditionWritten = false;

        if (operatorIsSet) {

            if (writeCr) {
                appendSqlQuery(sbWhere, DbMapSqlConstants.NEW_LINE, isSqlQuery);
                appendSqlQuery(sbWhere, tabSpaceString, isSqlQuery);
                appendSqlQuery(sbWhere, DbMapSqlConstants.SPACE, isSqlQuery);
            }
            if (!isFirstClause) {
                appendSqlQuery(sbWhere, DbMapSqlConstants.SPACE, isSqlQuery);
                appendSqlQuery(sbWhere, DbMapSqlConstants.AND, isSqlQuery);
                appendSqlQuery(sbWhere, DbMapSqlConstants.SPACE, isSqlQuery);
            }
            String entryName = dbMapEntry.getName();
            String tableName = table.getName();
            if (table.getAlias() == null) {
                tableName = getHandledTableName(component, table.getName(), table.getAlias());
            } else {
                tableName = getHandledField(component, table.getAlias());
                if (isAddQuotesInTableNames()) {
                    String quote = getQuote(component);
                    List<IConnection> inputConnections = (List<IConnection>) component.getIncomingConnections();
                    IConnection iconn = this.getConnectonByName(inputConnections, tableName);
                    tableName = getTableName(iconn, tableName, quote);
                    tableName = adaptQuoteForTableAndColumnName(component, tableName);
                }
            }
            if (!subQueryTable.contains(tableName)) {
                entryName = getOriginalColumnName(entryName, component, table);
                entryName = getColumnName(null, entryName, getQuote(component));
            }
            String locationInputEntry = language.getLocation(tableName, getHandledField(component, entryName));
            appendSqlQuery(sbWhere, DbMapSqlConstants.SPACE, isSqlQuery);
            appendSqlQuery(sbWhere, locationInputEntry, isSqlQuery);
            appendSqlQuery(sbWhere, getSpecialRightJoin(table), isSqlQuery);

            appendSqlQuery(sbWhere, DbMapSqlConstants.SPACE, isSqlQuery);
            if (operatorIsSet) {
                appendSqlQuery(sbWhere, dbOperator.getOperator(), isSqlQuery);
                appendSqlQuery(sbWhere, DbMapSqlConstants.SPACE, isSqlQuery);
            } else if (!operatorIsSet && expressionIsSet) {
                appendSqlQuery(sbWhere, DbMapSqlConstants.LEFT_COMMENT, isSqlQuery);
                appendSqlQuery(sbWhere, DbMapSqlConstants.SPACE, isSqlQuery);
                appendSqlQuery(sbWhere, Messages.getString("DbGenerationManager.InputOperationSetMessage", entryName),
                        isSqlQuery);
                appendSqlQuery(sbWhere, DbMapSqlConstants.SPACE, isSqlQuery);
                appendSqlQuery(sbWhere, DbMapSqlConstants.RIGHT_COMMENT, isSqlQuery);
            }
            if (operatorIsSet && !expressionIsSet && !dbOperator.isMonoOperand()) {
                String str = table.getName() + DbMapSqlConstants.DOT + entryName;
                appendSqlQuery(sbWhere, DbMapSqlConstants.LEFT_COMMENT, isSqlQuery);
                appendSqlQuery(sbWhere, DbMapSqlConstants.SPACE, isSqlQuery);
                appendSqlQuery(sbWhere, Messages.getString("DbGenerationManager.InputExpSetMessage", str), isSqlQuery);
                appendSqlQuery(sbWhere, DbMapSqlConstants.SPACE, isSqlQuery);
                appendSqlQuery(sbWhere, DbMapSqlConstants.RIGHT_COMMENT, isSqlQuery);
            } else if (expressionIsSet) {
                String exp = replaceVariablesForExpression(component, expression);
                appendSqlQuery(sbWhere, exp, isSqlQuery);
                appendSqlQuery(sbWhere, getSpecialLeftJoin(table), isSqlQuery);
            }
            conditionWritten = true;

        }

        return conditionWritten;
    }

    protected String getSpecialRightJoin(ExternalDbMapTable table) {
        return DbMapSqlConstants.EMPTY;
    }

    protected String getSpecialLeftJoin(ExternalDbMapTable table) {
        return DbMapSqlConstants.EMPTY;
    }

    /**
     * DOC amaumont Comment method "buildFromTableDeclaration".
     *
     * @param sb
     * @param inputTable
     * @param commaCouldBeAdded
     * @param crCouldBeAdded TODO
     * @param writingInJoin TODO
     */
    protected void buildTableDeclaration(DbMapComponent component, StringBuilder sb, ExternalDbMapTable inputTable,
            boolean commaCouldBeAdded, boolean crCouldBeAdded, boolean writingInJoin) {
        appendSqlQuery(sb, DbMapSqlConstants.SPACE);
        String alias = inputTable.getAlias();
        if (alias != null) {
            List<IConnection> inputConnections = (List<IConnection>) component.getIncomingConnections();
            IConnection iconn = null;
            if (inputConnections != null) {
                iconn = this.getConnectonByName(inputConnections, inputTable.getTableName());
            }
            boolean isELTDBMap = false;
            if (iconn != null) {
                INode source = iconn.getSource();
                isELTDBMap = isELTDBMap(source);
            }
            if (isELTDBMap) {
                if (commaCouldBeAdded) {
                    appendSqlQuery(sb, DbMapSqlConstants.COMMA);
                    appendSqlQuery(sb, DbMapSqlConstants.SPACE);
                }
                buildTableDeclaration(component, sb, inputTable);
            } else if (!aliasAlreadyDeclared.contains(inputTable.getName())) {
                if (crCouldBeAdded) {
                    appendSqlQuery(sb, DbMapSqlConstants.NEW_LINE);
                    appendSqlQuery(sb, tabSpaceString);
                }
                if (commaCouldBeAdded) {
                    appendSqlQuery(sb, DbMapSqlConstants.COMMA);
                    appendSqlQuery(sb, DbMapSqlConstants.SPACE);
                }
                String handledTableName = getHandledTableName(component, inputTable.getTableName(), alias);
                appendSqlQuery(sb, handledTableName);
                appendSqlQuery(sb, DbMapSqlConstants.SPACE);
                String handledField = getHandledAlias(component, alias);
                appendSqlQuery(sb, handledField);
                aliasAlreadyDeclared.add(alias);
            } else {
                if (writingInJoin) {
                    appendSqlQuery(sb, getHandledTableName(component, inputTable.getName(), alias));
                }
            }
        } else {
            if (crCouldBeAdded) {
                appendSqlQuery(sb, DbMapSqlConstants.NEW_LINE);
                appendSqlQuery(sb, tabSpaceString);
            }
            if (commaCouldBeAdded) {
                appendSqlQuery(sb, DbMapSqlConstants.COMMA);
                appendSqlQuery(sb, DbMapSqlConstants.SPACE);
            }
            buildTableDeclaration(component, sb, inputTable);
        }
    }

    protected IConnection getConnectonByName(List<IConnection> inputConnections, String metaTableName) {
        IConnection retConnection = null;
        for (IConnection iconn : inputConnections) {
            IMetadataTable metadataTable = iconn.getMetadataTable();
            String tName = iconn.getName();
            if (tName.equals(metaTableName) && metadataTable != null) {
                retConnection = iconn;
                break;
            }
        }
        return retConnection;
    }

    protected IConnection getConnectonByMetadataName(List<IConnection> connections, String metaTableName) {
        IConnection retConnection = null;
        for (IConnection iconn : connections) {
            IMetadataTable metadataTable = iconn.getMetadataTable();
            String tName = iconn.getMetaName() != null ? iconn.getMetaName() : iconn.getUniqueName();
            if (tName.equals(metaTableName) && metadataTable != null) {
                retConnection = iconn;
                break;
            }
        }
        return retConnection;
    }

    protected void buildTableDeclaration(DbMapComponent component, StringBuilder sb, ExternalDbMapTable inputTable) {
        Object inConns = component.getIncomingConnections();
        String quote = getQuote(component);

        List<IConnection> inputConnections = null;
        if (inConns != null) {
            inputConnections = (List<IConnection>) inConns;
        }
        if (inputConnections != null) {
            IConnection iconn = this.getConnectonByName(inputConnections, inputTable.getTableName());

            if (iconn == null) {
                return;
            }
            boolean replace = false;
            String inputTableName = inputTable.getName();
            IMetadataTable metadataTable = iconn.getMetadataTable();
            INode source = iconn.getSource();
            String tableName = metadataTable.getTableName();
            if (isELTDBMap(source)) {
                String deliveredTable = null;
                DbMapComponent externalNode = null;

                if (source instanceof DbMapComponent) {
                    externalNode = (DbMapComponent) source;
                    DbGenerationManager genManager = externalNode.getGenerationManager();
                    deliveredTable = genManager.buildSqlSelect(externalNode, tableName, tabSpaceString + "  "); //$NON-NLS-1$
                } else {
                    if (source.getExternalNode() instanceof AbstractUniteMapComponent) {
                        AbstractUniteMapComponent aumc = (AbstractUniteMapComponent) source.getExternalNode();
                        deliveredTable =
                                aumc.getGenerationManager().buildSqlSelect(source, tableName, tabSpaceString + "  ");
                    } else {
                        externalNode = (DbMapComponent) source.getExternalNode();
                        DbGenerationManager genManager = externalNode.getGenerationManager();
                        deliveredTable = genManager.buildSqlSelect(externalNode, tableName, tabSpaceString + "  "); //$NON-NLS-1$
                    }
                }

                /* the new tabSpaceString in subquery must not be same with the parent!!! */
                subQueryTable.add(inputTableName);
                int begin = 1;
                int end = deliveredTable.length() - 1;
                if (begin <= end) {
                    appendSqlQuery(sb, "("); //$NON-NLS-1$
                    appendSqlQuery(sb, DbMapSqlConstants.NEW_LINE);
                    appendSqlQuery(sb, tabSpaceString);
                    appendSqlQuery(sb, "  "); //$NON-NLS-1$

                    appendSqlQuery(sb, deliveredTable.substring(begin, end));
                    appendSqlQuery(sb, DbMapSqlConstants.NEW_LINE);
                    appendSqlQuery(sb, tabSpaceString);
                    appendSqlQuery(sb, " ) "); //$NON-NLS-1$
                }
            }
            String tableColneName = tableName;
            tableColneName = MetadataToolHelper.validateTableName(tableColneName);
            if (inputTableName.contains(".") && tableName != null) { //$NON-NLS-1$
                MapExpressionParser mapParser2 = new MapExpressionParser("\\s*(\\w+)\\s*\\.\\s*(\\w+)\\s*"); //$NON-NLS-1$
                List<Map<String, String>> tableNameList = mapParser2.parseInTableEntryLocations(inputTableName);
                for (Map<String, String> tableNameMap : tableNameList) {
                    Set<Entry<String, String>> setTable = tableNameMap.entrySet();
                    Iterator<Entry<String, String>> iteTable = setTable.iterator();

                    while (iteTable.hasNext()) {
                        Entry<String, String> tableEntry = iteTable.next();
                        String tableLabel = tableEntry.getKey();
                        String schemaValue = tableEntry.getValue();
                        if (tableLabel.equals(metadataTable.getLabel()) && tableColneName.equals(tableLabel)) {
                            String name = schemaValue + "." + tableName; //$NON-NLS-1$
                            appendSqlQuery(sb, name);
                            replace = true;
                        }
                    }

                }
            } else if (tableName != null) {
                if (inputTableName.equals(metadataTable.getLabel()) && tableColneName.equals(inputTableName)) {
                    appendSqlQuery(sb, tableName);
                    replace = true;
                }
            }
            if (!replace) {
                boolean inputIsELTDBMap = false;
                String schemaValue = "";
                String table = "";
                boolean hasSchema = false;
                String tableWithQuote = "";
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
                String handledTableName = table;
                hasSchema = !"".equals(schemaNoQuote);
                if (hasSchema) {
                    String schemaWithQuote = getTableName(iconn, schemaNoQuote, quote);
                    schemaWithQuote = adaptQuoteForTableAndColumnName(component, schemaWithQuote);
                    if (table.contains("+")) {
                        schemaWithQuote = replaceVariablesForExpression(component, schemaWithQuote);
                        // special case , table name might be String + String , fix for tuj
                        // BugTDI32594_tELTMSSqlOutput_SingleColFunc
                        // now if table name is too complex , we have to set alias , so won't run codes here.
                        if (isAddQuotesInTableNames()) {
                            if ("\"".equals(quote)) {
                                quote = "\\\"";
                            }
                            handledTableName = "\"" + quote + "\" + " + table + " +" + "\"" + quote + "\"";
                        } else {
                            tableWithQuote = getTableName(iconn, tableNoQuote, quote);
                            if (isAddQuotesInTableNames()) {
                                handledTableName = adaptQuoteForTableAndColumnName(component, tableWithQuote);
                            }

                        }
                        // String exp = replaceVariablesForExpression(component, inputTableName);
                        String exp = "";
                        if (ContextParameterUtils.isContainContextParam(schemaValue)
                                || isContainsGlobalMap(schemaValue)) {
                            exp = schemaWithQuote + ".\" +" + handledTableName + " +\"";
                        } else {
                            exp = schemaWithQuote + ".\"" + "+" + handledTableName + " +\"";
                        }
                        appendSqlQuery(sb, exp);
                        return;
                    } else {
                        tableWithQuote = getTableName(iconn, tableNoQuote, quote);
                        if (isAddQuotesInTableNames()) {
                            tableWithQuote = adaptQuoteForTableAndColumnName(component, tableWithQuote);
                        }
                    }
                    // if (isAddQuotesInTableNames()) {
                    // tableWithQuote = adaptQuoteForTableAndColumnName(component, tableWithQuote);
                    // }
                    tableName = schemaWithQuote + "." + tableWithQuote;
                } else {
                    tableName = getTableName(iconn, inputTable.getName(), quote);
                    if (isAddQuotesInTableNames()) {
                        tableName = adaptQuoteForTableAndColumnName(component, tableName);
                    }
                }
                String exp = replaceVariablesForExpression(component, tableName);
                appendSqlQuery(sb, exp);
            }
        }
    }

    protected static boolean isELTDBMap(INode node) {
        return node.isELTComponent()
                /**
                 * The source map node using EConnectionType.TABLE wrote Database, but it wrote data to the table
                 * defined in
                 * *ELTOutput component rather than the table defined in the source map node ****So****,maybe should
                 * always
                 * generate subsql when input node is a map ignoring the EConnectionType
                 */
                // && iconn.getLineStyle() == EConnectionType.TABLE_REF
                && node.getComponent().getName().endsWith("Map"); //$NON-NLS-1$
    }

    protected String addQuoteForSpecialChar(String expression, DbMapComponent component) {
        return expression;
    }

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
            MapExpressionParser mapParser1 = new MapExpressionParser("((\\s*(\\w*#*\\w+)\\s*\\.)*)(\\w+)"); //$NON-NLS-1$
            itemNameList = mapParser1.parseInTableEntryLocations2(expression);

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
                    boolean globalMapSpecialCase = false;
                    String specialCaseColumnName = "";
                    String tableNameValue = tableValue;
                    // find original table name if tableValue is alias
                    String originaltableName = tableValue;
                    ExternalDbMapData externalData = component.getExternalData();
                    final List<ExternalDbMapTable> inputTables = externalData.getInputTables();
                    for (ExternalDbMapTable inputTable : inputTables) {
                        String inputTableName = inputTable.getTableName();
                        if (inputTable.getAlias() != null && inputTable.getAlias().equals(tableValue)) {
                            originaltableName = inputTableName;
                            tableNameValue = inputTable.getAlias();
                            aliasFlag = true;
                            break;
                        }
                        if (isAddQuotesInTableNames() && isContainsGlobalMap(inputTableName)
                                && expression.contains(inputTableName)) {
                            // handle special case dbo.((String)globalMap.get("input2"))
                            // can't change the expression or it will break everything , so here use hard code
                            originaltableName = inputTableName;
                            tableValue = inputTableName;
                            globalMapSpecialCase = true;
                            specialCaseColumnName = expression.replace(inputTableName, "");
                            if (specialCaseColumnName.startsWith(".")) {
                                specialCaseColumnName = specialCaseColumnName.substring(1).trim();
                            }
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
                                if (globalMapSpecialCase
                                        && org.apache.commons.lang.StringUtils.isNotBlank(specialCaseColumnName)) {
                                    // when tableName contains globalMap , expression can't get correct table name
                                    // and column name
                                    columnValue = specialCaseColumnName;
                                }
                                for (IMetadataColumn co : lColumn) {
                                    if (columnValue.equals(co.getLabel())) {
                                        String oriName = co.getOriginalDbColumnName();
                                        // if OriginalDbColumn is empty , still use label to generate sql
                                        if (oriName == null || "".equals(oriName)) { //$NON-NLS-1$
                                            continue;
                                        }
                                        if (expression.trim().equals(tableValue + "." + oriName)
                                                && !globalMapSpecialCase) {
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
                                        if (expression.trim().equals(originaltableName + "." + oriName)
                                                && !globalMapSpecialCase) {
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
                                        // String quotedTableName = getTableName(iconn,tableValue,quote);
                                        // quotedTableName = adaptQuoteForTableAndColumnName(component,
                                        // quotedTableName);
                                        //// expression = expression.replaceAll(tableValue, quotedTableName);
                                        // expression = expression.replaceFirst(tableValue + "\\." + co.getLabel(),
                                        // //$NON-NLS-1$
                                        // quotedTableName + "\\." + oriName); //$NON-NLS-1$
                                        // expression = replaceAuotes(component, expression, quto_markParser,
                                        // quto_mark);
                                        String quotedTableName = "";
                                        if (hasSchema && !aliasFlag) {
                                            String quotedSchemaName = getTableName(iconn, schemaNoQuote, quote);
                                            quotedSchemaName =
                                                    adaptQuoteForTableAndColumnName(component, quotedSchemaName);
                                            quotedTableName = getTableName(iconn, tableNoQuote, quote);
                                            quotedTableName =
                                                    adaptQuoteForTableAndColumnName(component, quotedTableName);
                                            quotedTableName = quotedSchemaName + "." + quotedTableName;
                                        } else {
                                            quotedTableName = getTableName(iconn, tableValue, quote);
                                        }
                                        if (globalMapSpecialCase && org.apache.commons.lang.StringUtils
                                                .isNotBlank(specialCaseColumnName)) {
                                            // seems have bug before, it should be oriName , but to remain same , so
                                            // don't change logic here
                                            expression = quotedTableName + "." + co.getLabel();
                                            expression =
                                                    replaceAuotes(component, expression, quto_markParser, quto_mark);
                                            continue;
                                        }
                                        expression = expression
                                                .replaceFirst(tableValue + "\\." + co.getLabel(), //$NON-NLS-1$
                                                        quotedTableName + "\\." + oriName); //$NON-NLS-1$
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

    public String adaptQuoteForTableAndColumnName(DbMapComponent component, String columnEntry) {
        if (ContextParameterUtils.isContainContextParam(columnEntry)
                || parser.isContainsGlobalMapExpression(columnEntry)
                || isFieldContainsContext(component, columnEntry)) {
            return columnEntry;
        }
        String quote = getQuote(component);
        String quto_mark = TalendQuoteUtils.QUOTATION_MARK;
        String quto_markParser = "[\\\\]?\\" + quto_mark; //$NON-NLS-1$
        return columnEntry.replaceAll(quto_markParser, "\\\\" + quto_mark);
    }

    protected String replaceAuotes(DbMapComponent component, String expression, String quoParser, String quote) {
        if (isComplexExpression(component, expression)) {
            return expression;
        }
        if (!expression.contains("'")) {
            return expression.replaceAll(quoParser, "\\\\" + quote); //$NON-NLS-1$ ;
        }

        List<Integer> indexs = new ArrayList<>();
        for (int i = 0; i < expression.length(); i++) {
            if ("'".equals(String.valueOf(expression.charAt(i)))) {
                indexs.add(i);
            }
        }
        StringBuffer result = new StringBuffer();
        int start = 0;
        for (int i = 0; i < indexs.size(); i++) {
            if (i == 0) {
                if (indexs.size() == 1 && indexs.get(i) == 0) {
                    result.append(expression.substring(0, indexs.get(i) + 1));
                } else {
                    String exp = expression.substring(start, indexs.get(i));
                    result.append(exp.replaceAll(quoParser, "\\\\" + quote)); //$NON-NLS-1$
                }
            }
            if (i % 2 == 0 && i != indexs.size() - 1) {
                result.append(expression.substring(indexs.get(i), indexs.get(i + 1) + 1));
                if (i < indexs.size() - 2) {
                    String exp = expression.substring(indexs.get(i + 1) + 1, indexs.get(i + 2));
                    result.append(exp.replaceAll(quoParser, "\\\\" + quote)); //$NON-NLS-1$
                }
                start = indexs.get(i + 1) + 1;
            } else if (i == indexs.size() - 1) {
                String exp = expression.substring(indexs.get(i) + 1, expression.length());
                result.append(exp.replaceAll(quoParser, "\\\\" + quote)); //$NON-NLS-1$
            }
        }
        return result.toString();
    }

    protected boolean isComplexExpression(DbMapComponent component, String expression) {
        if (parser.isContainsGlobalMapExpression(expression)) {
            return true;
        }
        return false;
    }

    public String getQuote(DbMapComponent component) {
        String delimitedCharacterText = getDelimitedCharacterText();
        if (isDelimitedCharacter() && org.apache.commons.lang.StringUtils.isNotEmpty(delimitedCharacterText)) {
            return delimitedCharacterText;
        }
        String quote = TalendQuoteUtils.QUOTATION_MARK;
        IElementParameter mappingPara = component.getElementParameter(EParameterName.MAPPING.getName());
        if (mappingPara == null) {
            return quote;
        }
        String mapping = (String) mappingPara.getValue();
        if (mapping == null) {
            return quote;
        }
        MappingTypeRetriever mappingTypeRetriever = MetadataTalendType.getMappingTypeRetriever(mapping);
        if (mappingTypeRetriever == null) {
            return quote;
        }
        Dbms dbms = mappingTypeRetriever.getDbms();
        String product = dbms.getProduct();
        EDatabaseTypeName type = EDatabaseTypeName.getTypeFromProductName(product);
        return TalendQuoteUtils.getQuoteByDBType(type);
    }

    private String getOriginalColumnName(String entryName, DbMapComponent component, ExternalDbMapTable table) {
        List<IConnection> inputConnections = (List<IConnection>) component.getIncomingConnections();
        if (inputConnections != null) {
            for (IConnection iconn : inputConnections) {
                IMetadataTable metadataTable = iconn.getMetadataTable();
                String tName = iconn.getName();
                String tableValue = table.getTableName();
                if (tableValue != null && tableValue.equals(tName) && metadataTable != null) {
                    List<IMetadataColumn> lColumn = metadataTable.getListColumns();
                    for (IMetadataColumn colu : lColumn) {
                        if (colu.getLabel().equals(entryName)) {
                            String tempName = colu.getOriginalDbColumnName();
                            if (tempName != null && tempName.length() > 0) {
                                entryName = tempName;
                                return entryName;
                            }
                        }
                    }
                }
            }
        }
        return entryName;
    }

    protected List<String> getConnectionContextList(DbMapComponent component) {
        List<String> contextList = new ArrayList<String>();
        List<IConnection> inputConnections = (List<IConnection>) component.getIncomingConnections();
        List<Map<String, String>> itemNameList = null;
        for (IConnection iconn : inputConnections) {
            String connName = iconn.getName();
            if (!ContextParameterUtils.containContextVariables(connName)) {
                continue;
            }

            MapExpressionParser mapParser1 =
                    new MapExpressionParser("\\s*(\\w+)\\s*\\.\\s*(\\w+)\\s*\\.\\s*(\\w+)\\s*"); //$NON-NLS-1$
            itemNameList = mapParser1.parseInTableEntryLocations(connName);
            if (itemNameList == null) {
                return contextList;
            }
            IMetadataTable metadataTable = iconn.getMetadataTable();
            for (Map<String, String> itemNamemap : itemNameList) {
                Set<Entry<String, String>> set = itemNamemap.entrySet();
                Iterator<Entry<String, String>> ite = set.iterator();
                while (ite.hasNext()) {
                    Entry<String, String> entry = ite.next();
                    String tableValue = entry.getKey();
                    String schemaValue = entry.getValue();
                    if (metadataTable != null && tableValue.equals(metadataTable.getLabel())) {
                        if (!contextList.contains(schemaValue)) {
                            contextList.add(schemaValue);
                        }
                    }
                }
            }

        }
        return contextList;
    }

    protected String getHandledTableName(DbMapComponent component, String tableName, String alias) {
        String quote = getQuote(component);
        List<IConnection> inputConnections = (List<IConnection>) component.getIncomingConnections();
        IConnection iconn = this.getConnectonByName(inputConnections, tableName);
        INode source = iconn.getSource();
        String handledTableName = "";
        boolean inputIsELTDBMap = false;
        String schemaValue = "";
        String tableValue = "";
        boolean hasSchema = false;
        IElementParameter schemaParam = source.getElementParameter("ELT_SCHEMA_NAME");
        IElementParameter tableParam = source.getElementParameter("ELT_TABLE_NAME");
        if (schemaParam != null && schemaParam.getValue() != null) {
            schemaValue = schemaParam.getValue().toString();
        }
        if (tableParam != null && tableParam.getValue() != null) {
            tableValue = tableParam.getValue().toString();
        }
        String schemaNoQuote = schemaValue;
        String tableNoQuote = tableValue;
        ProblemsAnalyser pa = new ProblemsAnalyser(null);
        if (!pa.needAlias(schemaValue)) {
            schemaNoQuote = TalendTextUtils.removeQuotes(schemaValue);
        }
        if (!pa.needAlias(tableValue)) {
            tableNoQuote = TalendTextUtils.removeQuotes(tableValue);
        }

        hasSchema = org.apache.commons.lang.StringUtils.isNotBlank(schemaNoQuote);
        // if (hasSchema) {
        // schemaValue = handledParameterValues(schemaValue);
        // handledTableName = schemaValue + "+\".\"+";
        // handledTableName = handledTableName + tableValue;
        // return "\" +" + handledTableName + "+ \"";
        // }
        if (alias == null) {
            if (hasSchema) {
                schemaValue = getTableName(iconn, schemaNoQuote, quote);
                tableValue = getTableName(iconn, tableNoQuote, quote);
                if (isAddQuotesInTableNames()) {
                    schemaValue = adaptQuoteForTableAndColumnName(component, schemaValue);
                    tableValue = adaptQuoteForTableAndColumnName(component, tableValue);
                }
                tableName = schemaValue + "." + tableValue;
            } else {
                // when it's the case of tELTMap -> tELTMap . should take talbe name from tableName instead of
                // tableNoQuote
                if (org.apache.commons.lang.StringUtils.isEmpty(tableNoQuote)
                        && org.apache.commons.lang.StringUtils.isNotEmpty(tableName)) {
                    tableName = getTableName(iconn, tableName, quote);
                } else {
                    tableName = getTableName(iconn, tableNoQuote, quote);
                }
            }
            tableName = adaptQuoteForTableAndColumnName(component, tableName);
            return replaceVariablesForExpression(component, tableName);
        } else {
            if (iconn != null) {
                if (source != null) {
                    inputIsELTDBMap = isELTDBMap(source);
                    if (inputIsELTDBMap) {
                        tableValue = iconn.getName();
                    }
                }
                if (hasSchema) {
                    schemaValue = handledParameterValues(schemaNoQuote);
                    schemaValue = getTableName(iconn, schemaValue, quote);
                    schemaValue = adaptQuoteForTableAndColumnName(component, schemaValue);
                    if (ContextParameterUtils.isContainContextParam(schemaValue) || isContainsGlobalMap(schemaValue)) {
                        if (isAddQuotesInTableNames()) {
                            if ("\"".equals(quote)) {
                                schemaValue = "\"" + "\\\"" + "\" +" + schemaValue + "+ \"" + "\\\"" + "\"";
                            } else {
                                schemaValue = "\"" + quote + "\" +" + schemaValue + "+ \"" + quote + "\"";
                            }
                        }
                    } else {
                        schemaValue = "\"" + schemaValue + "\"";
                    }
                    handledTableName = schemaValue + "+\".\"+";
                    // if (ContextParameterUtils.isContainContextParam(tableValue) || isContainsGlobalMap(tableValue)) {
                    // if (isAddQuotesInTableNames()) {
                    // if ("\"".equals(quote)) {
                    // quote = "\\\"";
                    // }
                    // tableValue = "\"" + quote + "\" +" + tableValue + "+ \"" + quote + "\"";
                    // }
                    // handledTableName += tableValue;
                    // return "\" +" + handledTableName + "+ \"";
                    // }
                }
                if (ContextParameterUtils.isContainContextParam(tableValue) || isContainsGlobalMap(tableValue)) {
                    tableName = getTableName(iconn, tableValue, quote);
                    if (isAddQuotesInTableNames()) {
                        if ("\"".equals(quote)) {
                            quote = "\\\"";
                        }
                        tableName = "\"" + quote + "\" +" + tableName + "+ \"" + quote + "\"";
                    }
                } else {
                    if (isAddQuotesInTableNames()) {
                        tableName = getTableName(iconn, tableNoQuote, quote);
                        if ("\"".equals(quote)) {
                            tableName = adaptQuoteForTableAndColumnName(component, tableName);
                        }
                        tableName = "\"" + tableName + "\"";
                        handledTableName = handledTableName + tableName;
                        return "\" +" + handledTableName + "+ \"";
                    } else {
                        tableName = getTableName(iconn, tableValue, quote);
                    }
                }
                handledTableName = handledTableName + tableName;
                return "\" +" + handledTableName + "+ \"";
            }
        }
        return tableName;

    }

    protected String handledParameterValues(String originalValue) {
        List<String> paramValues = new ArrayList<String>();
        DBMapHelper.convertContextParameterValue(paramValues, originalValue);
        if (paramValues.size() > 0) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < paramValues.size(); i++) {
                String paramValue = paramValues.get(i);
                if (ContextParameterUtils.isContainContextParam(paramValue)) {
                    sb.append(paramValue);
                } else {
                    sb.append("\"" + paramValue + "\"");//$NON-NLS-1$//$NON-NLS-2$
                }
                if (i < paramValues.size() - 1) {
                    sb.append(" + \".\" + "); //$NON-NLS-1$
                }
            }
            return sb.toString();
        } else {
            return originalValue;
        }
    }

    protected String getColumnName(IConnection conn, String name) {
        if (!isRefTableConnection(conn) && isAddQuotesInColumns()) {
            return getNameWithDelimitedIdentifier(name);
        } else {
            return name;
        }
    }

    protected String getColumnName(IConnection conn, String name, String quote) {
        if (!isRefTableConnection(conn) && isAddQuotesInColumns()) {
            return getNameWithDelimitedIdentifier(name, quote);
        } else {
            return name;
        }
    }

    protected String getTableName(IConnection conn, String name, String quote) {
        if (isAddQuotesInTableNames() && !ContextParameterUtils.isContainContextParam(name)
                && !isContainsGlobalMap(name)) {
            return getNameWithDelimitedIdentifier(name, quote);
        } else {
            return name;
        }
    }

    protected boolean isRefTableConnection(IConnection conn) {
        return conn != null && conn.getLineStyle() == EConnectionType.TABLE_REF;
    }

    protected String getNameWithDelimitedIdentifier(String name) {
        final String delimitedIdentifier = getDelimitedIdentifiers();
        String newName = name;
        newName = newName.replaceAll("\"", "\"\"");
        newName = delimitedIdentifier + newName + delimitedIdentifier;
        return newName;
    }

    protected String getNameWithDelimitedIdentifier(String name, String quote) {
        String newName = name;
        newName = newName.replaceAll("\"", "\"\"");
        newName = quote + newName + quote;
        return newName;
    }

    protected String getDelimitedIdentifiers() {
        return "\""; //$NON-NLS-1$
    }

    protected String getHandledField(DbMapComponent component, String field) {
        if (field != null) {
            List<String> contextList = getContextList(component);
            boolean haveReplace = false;
            for (String context : contextList) {
                if (field.contains(context)) {
                    field = field.replaceAll("\\b" + context + "\\b", "\" +" + context + "+ \""); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
                    haveReplace = true;
                    break;
                }
            }
            if (!haveReplace) {
                field = field.replace("\"", "\\\"");
            }
        }
        return field;
    }

    private boolean isFieldContainsContext(DbMapComponent component, String field) {
        if (field != null) {
            List<String> contextList = getContextList(component);
            for (String context : contextList) {
                if (field.contains(context)) {
                    return true;
                }
            }
        }
        return false;
    }

    protected String getHandledAlias(DbMapComponent component, String alias) {
        if (alias != null) {
            List<String> contextList = getContextList(component);
            boolean haveReplace = false;
            for (String context : contextList) {
                if (alias.contains(context)) {
                    alias = alias.replaceAll("\\b" + context + "\\b", "\" +" + context + "+ \""); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
                    haveReplace = true;
                    break;
                }
            }
            if (!haveReplace) {
                String quote = getQuote(component);
                List<IConnection> inputConnections = (List<IConnection>) component.getIncomingConnections();
                IConnection iconn = this.getConnectonByName(inputConnections, alias);
                alias = getTableName(iconn, alias, quote);
                alias = adaptQuoteForTableAndColumnName(component, alias);
            }
        }
        return alias;
    }

    public boolean isAddQuotesInColumns() {
        return Boolean.TRUE.equals(this.addQuotesInColumns);
    }

    public boolean isAddQuotesInTableNames() {
        return Boolean.TRUE.equals(this.addQuotesInTableNames);
    }

    public boolean isDelimitedCharacter() {
        return Boolean.TRUE.equals(this.delimitedCharacter);
    }

    public String getDelimitedCharacterText() {
        return delimitedCharacterText == null ? "" : this.delimitedCharacterText;
    }

    public void setDelimitedCharacterText(String delimitedCharaterText) {
        this.delimitedCharacterText = delimitedCharaterText;
    }

    public void setAddQuotesInColumns(boolean addQuotesInColumns) {
        this.addQuotesInColumns = addQuotesInColumns;
    }

    public void setDelimitedCharacter(boolean delimitedCharacter) {
        this.delimitedCharacter = delimitedCharacter;
    }

    public void setAddQuotesInTableNames(boolean addQuotesInTableNames) {
        this.addQuotesInTableNames = addQuotesInTableNames;

    }

    public boolean isUseAliasInOutputTable() {
        return Boolean.TRUE.equals(this.useAliasInOutputTable);
    }

    public void setUseAliasInOutputTable(boolean useAliasInOutputTable) {
        this.useAliasInOutputTable = useAliasInOutputTable;
    }

    public boolean isConditionChecked(DbMapComponent component, ExternalDbMapTable inputTable) {
        List<ExternalDbMapEntry> inputEntries = inputTable.getMetadataTableEntries();
        boolean atLeastOneConditionIsChecked = false;
        for (ExternalDbMapEntry dbMapEntry : inputEntries) {
            if (dbMapEntry.isJoin()) {
                if (org.apache.commons.lang.StringUtils.isNotEmpty(dbMapEntry.getExpression())
                        && org.apache.commons.lang.StringUtils.isNotEmpty(dbMapEntry.getOperator())) {
                    atLeastOneConditionIsChecked = true;
                    break;
                }
            }
        }
        return atLeastOneConditionIsChecked;
    }

    protected String getTargetSchemaTable(DbMapComponent component, String outTableName) {
        String targetSchemaTable = null;
        String quote = getQuote(component);
        IElementParameter eltSchemaNameParam = source.getElementParameter("ELT_SCHEMA_NAME"); //$NON-NLS-1$
        if (eltSchemaNameParam != null && eltSchemaNameParam.getValue() != null) {
            String value = String.valueOf(eltSchemaNameParam.getValue());
            String schemaNoQuote = value;
            if (TalendQuoteUtils.isStartEndsWithQuotation(value, true, false) && !isVariable(value)) {
                schemaNoQuote = TalendQuoteUtils.removeQuotesIfExist(value);
            }
            if (org.apache.commons.lang.StringUtils.isNotEmpty(schemaNoQuote)) {
                targetSchemaTable = getHandledField(component, schemaNoQuote);
                if (isVariable(schemaNoQuote)) {
                    targetSchemaTable = replaceVariablesForTargetTableExpression(component, schemaNoQuote);
                    // context won't add quote , so here use special check
                    if (isAddQuotesInTableNames()) {
                        if ("\"".equals(quote)) {
                            targetSchemaTable = "\"+ \"" + "\\\"" + targetSchemaTable + "\\\"" + "\" +\"";
                        } else {
                            targetSchemaTable = "\"+ \"" + quote + targetSchemaTable + quote + "\" +\"";
                        }
                    }

                } else {
                    if (isAddQuotesInTableNames()) {
                        List<IConnection> inputConnections = (List<IConnection>) component.getIncomingConnections();
                        IConnection iconn = this.getConnectonByName(inputConnections, targetSchemaTable);
                        targetSchemaTable = getTableName(iconn, targetSchemaTable, quote);
                        targetSchemaTable = adaptQuoteForTableAndColumnName(component, targetSchemaTable);
                    }
                }
                // if (ContextParameterUtils.isContainContextParam(schemaNoQuote) || isContainsGlobalMap(schemaNoQuote))
                // {
                // if (isAddQuotesInTableNames()) {
                // if ("\"".equals(quote)) {
                // targetSchemaTable = "\"+ \"" + "\\\"" + targetSchemaTable + "\\\"" + "\" +\"";
                // } else {
                // targetSchemaTable = "\"+ \"" + quote + targetSchemaTable + quote + "\" +\"";
                // }
                // }
                //
                // } else {
                // if (isAddQuotesInTableNames()) {
                // List<IConnection> inputConnections = (List<IConnection>) component.getIncomingConnections();
                // IConnection iconn = this.getConnectonByName(inputConnections, targetSchemaTable);
                // targetSchemaTable = getTableName(iconn, targetSchemaTable, quote);
                // targetSchemaTable = adaptQuoteForTableAndColumnName(component, targetSchemaTable);
                // }
                // }
                targetSchemaTable = targetSchemaTable + "."; //$NON-NLS-1$
            }
        }
        String targetTable = outTableName;
        if (TalendQuoteUtils.isStartEndsWithQuotation(outTableName, true, false) && !isVariable(outTableName)) {
            targetTable = TalendQuoteUtils.removeQuotesIfExist(outTableName);
        }
        if (isVariable(targetTable)) {
            targetTable = replaceVariablesForTargetTableExpression(component, targetTable);
            // context won't add quote , so here use special check
            if (isAddQuotesInTableNames()) {
                if ("\"".equals(quote)) {
                    targetTable = "\"+ \"" + "\\\"" + targetTable + "\\\"" + "\" +\"";
                } else {
                    targetTable = "\"+ \"" + quote + targetTable + quote + "\" +\"";
                }
            }
            if (org.apache.commons.lang.StringUtils.isNotBlank(targetSchemaTable)) {
                targetSchemaTable += targetTable;
            } else {
                targetSchemaTable = targetTable;
            }
        } else {
            List<IConnection> inputConnections = (List<IConnection>) component.getIncomingConnections();
            IConnection iconn = this.getConnectonByName(inputConnections, targetTable);
            targetTable = getTableName(iconn, targetTable, quote);
            targetTable = adaptQuoteForTableAndColumnName(component, targetTable);
            if (org.apache.commons.lang.StringUtils.isNotBlank(targetSchemaTable)) {
                targetSchemaTable += targetTable;
            } else {
                targetSchemaTable = targetTable;
            }
        }
        return targetSchemaTable;
    }

    public String buildSqlUpdate(DbMapComponent dbMapComponent, String outputTableName, String tabString) {
        queryColumnsName = "\""; //$NON-NLS-1$
        aliasAlreadyDeclared.clear();
        queryColumnsSegments.clear();
        querySegments.clear();
        subQueryTable.clear();
        inputSchemaContextSet.clear();

        this.tabSpaceString = tabString;
        DbMapComponent component = getDbMapComponent(dbMapComponent);

        List<IConnection> outputConnections = (List<IConnection>) component.getOutgoingConnections();

        Map<String, IConnection> nameToOutputConnection = new HashMap<String, IConnection>();
        for (IConnection connection : outputConnections) {
            nameToOutputConnection.put(connection.getUniqueName(), connection);
        }

        ExternalDbMapData data = component.getExternalData();
        List<String> contextList = getContextList(component);
        List<ExternalDbMapTable> inputTables = data.getInputTables();
        collectSchemaContextParam(dbMapComponent, inputTables, contextList);
        collectSchemaGlobalMapParam(dbMapComponent, inputTables);
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
            String outTableName = outputTable.getTableName();
            IConnection connection = nameToOutputConnection.get(outputTable.getName());
            List<IMetadataColumn> columns = new ArrayList<IMetadataColumn>();
            if (connection != null) {
                IMetadataTable metadataTable = connection.getMetadataTable();
                if (metadataTable != null) {
                    columns.addAll(metadataTable.getListColumns());
                }
            }
            // Update
            INode target = connection.getTarget();
            if (target.isELTComponent()) {
                String p_USE_DIFFERENT_TABLE = "USE_DIFFERENT_TABLE";
                String p_DIFFERENT_TABLE_NAME = "DIFFERENT_TABLE_NAME";
                IElementParameter useDiffTable = target.getElementParameter(p_USE_DIFFERENT_TABLE);
                if (useDiffTable != null && (Boolean) useDiffTable.getValue()
                        && target.getElementParameter(p_DIFFERENT_TABLE_NAME) != null) {
                    outTableName = TalendQuoteUtils
                            .removeQuotesIfExist(
                                    target.getElementParameter(p_DIFFERENT_TABLE_NAME).getValue().toString());
                } else {
                    String p_ELT_TABLE_NAME = "ELT_TABLE_NAME";
                    if (target.getElementParameter(p_ELT_TABLE_NAME) != null) {
                        outTableName = TalendQuoteUtils
                                .removeQuotesIfExist(
                                        target.getElementParameter(p_ELT_TABLE_NAME).getValue().toString());
                    }
                }
            }
            String targetSchemaTable = getTargetSchemaTable(component, outTableName);

            appendSqlQuery(sb, "\"", false); //$NON-NLS-1$
            appendSqlQuery(sb, DbMapSqlConstants.UPDATE);
            appendSqlQuery(sb, DbMapSqlConstants.SPACE);
            appendSqlQuery(sb, targetSchemaTable);
            appendSqlQuery(sb, tabSpaceString);
            appendSqlQuery(sb, DbMapSqlConstants.NEW_LINE);

            // Set
            String keyColumn = DbMapSqlConstants.EMPTY;
            List<ExternalDbMapEntry> metadataTableEntries = outputTable.getMetadataTableEntries();
            if (metadataTableEntries != null) {
                appendSqlQuery(sb, "SET"); //$NON-NLS-1$
                appendSqlQuery(sb, DbMapSqlConstants.SPACE);
                boolean isKey = false;
                int lstSizeOutTableEntries = metadataTableEntries.size();
                List<Boolean> setColumns = getSetColumnsForUpdateQuery();
                final boolean hasDeactivatedColumns = !setColumns.isEmpty();
                boolean isFirstColumn = true;
                for (int i = 0; i < lstSizeOutTableEntries; i++) {
                    if (hasDeactivatedColumns && setColumns.get(i)) {
                        continue;
                    }
                    ExternalDbMapEntry dbMapEntry = metadataTableEntries.get(i);
                    String columnEntry = dbMapEntry.getName();
                    String expression = dbMapEntry.getExpression();
                    expression = initExpression(component, dbMapEntry);
                    if (!isAddQuotesInColumns()) {
                        expression = addQuoteForSpecialChar(expression, component);
                    }
                    //
                    if (!DEFAULT_TAB_SPACE_STRING.equals(this.tabSpaceString)) {
                        expression += DbMapSqlConstants.SPACE + DbMapSqlConstants.AS + DbMapSqlConstants.SPACE
                                + getAliasOf(dbMapEntry.getName());
                    }
                    String exp = replaceVariablesForExpression(component, expression);
                    String columnSegment = exp;
                    // Added isFirstColumn to conform old behaior if first column is skipped
                    if (i > 0 && !isFirstColumn) {
                        queryColumnsName += DbMapSqlConstants.COMMA + DbMapSqlConstants.SPACE;
                        columnSegment = DbMapSqlConstants.COMMA + DbMapSqlConstants.SPACE + columnSegment;
                    }
                    if (expression != null && expression.trim().length() > 0) {
                        queryColumnsName += exp;
                        queryColumnsSegments.add(columnSegment);
                    }
                    //
                    if (!isKey) {
                        for (IMetadataColumn column : columns) {
                            String columnName = column.getLabel();
                            if (columnName.equals(dbMapEntry.getName()) && column.isKey()) {
                                isKey = column.isKey();
                                keyColumn = addQuotes(columnEntry) + " = " + exp;//$NON-NLS-1$
                                break;
                            }
                        }
                        if (isKey) {
                            continue;
                        }
                    }
                    if (expression != null && expression.trim().length() > 0) {
                        // Append COMMA and NEW_LINE for all columns except FIRST.
                        if (!isFirstColumn) {
                            appendSqlQuery(sb, DbMapSqlConstants.COMMA);
                            appendSqlQuery(sb, DbMapSqlConstants.NEW_LINE);
                        } else {
                            isFirstColumn = false;
                        }
                        if (isAddQuotesInColumns()) {
                            columnEntry = getNameWithDelimitedIdentifier(columnEntry, getQuote(component));
                            columnEntry = adaptQuoteForTableAndColumnName(component, columnEntry);
                            appendSqlQuery(sb, columnEntry + " = " + exp); //$NON-NLS-1$
                        } else {
                            appendSqlQuery(sb, addQuotes(columnEntry) + " = " + exp); //$NON-NLS-1$
                        }
                    }
                }
            }
            if ("\"".equals(queryColumnsName)) {
                throw new IllegalArgumentException("Specify at least 1 column for UPDATE QUERY in SET section");
            }
            appendSqlQuery(sb, DbMapSqlConstants.NEW_LINE);

            // From
            appendSqlQuery(sb, tabSpaceString);
            appendSqlQuery(sb, DbMapSqlConstants.FROM);
            // load input table in hash
            // List<ExternalDbMapTable> inputTables = data.getInputTables();
            // load input table in hash
            boolean explicitJoin = false;
            int lstSizeInputTables = inputTables.size();

            appendSqlQuery(sb, DbMapSqlConstants.NEW_LINE);
            appendSqlQuery(sb, tabSpaceString);
            IJoinType previousJoinType = null;

            for (int i = 0; i < lstSizeInputTables; i++) {
                ExternalDbMapTable inputTable = inputTables.get(i);
                IJoinType joinType = language.getJoin(inputTable.getJoinType());
                if (!language.unuseWithExplicitJoin().contains(joinType) && i > 0) {
                    explicitJoin = true;
                } else {
                    explicitJoin = false;
                }
                if (i == 0) {
                    joinType = AbstractDbLanguage.JOIN.NO_JOIN;
                    previousJoinType = joinType;
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
                            buildTableDeclaration(component, sb, inputTables.get(i - 1), commaCouldBeAdded,
                                    crCouldBeAdded, true);
                            previousJoinType = joinType;
                        } else {
                            // appendSqlQuery(sb, DbMapSqlConstants.NEW_LINE);
                            appendSqlQuery(sb, tabSpaceString);
                        }
                        appendSqlQuery(sb, DbMapSqlConstants.SPACE);
                    }
                    String labelJoinType = joinType.getLabel();
                    if (joinType == AbstractDbLanguage.JOIN.CROSS_JOIN) {
                        ExternalDbMapTable nextTable = null;
                        if (i < lstSizeInputTables) {
                            nextTable = inputTables.get(i);
                            appendSqlQuery(sb, labelJoinType);
                            appendSqlQuery(sb, DbMapSqlConstants.SPACE);
                            buildTableDeclaration(component, sb, nextTable, false, true, true);
                        }

                    } else {
                        if (isConditionChecked(component, inputTable)) {
                            appendSqlQuery(sb, labelJoinType);
                            appendSqlQuery(sb, DbMapSqlConstants.SPACE);
                            buildTableDeclaration(component, sb, inputTable, false, false, true);
                            appendSqlQuery(sb, DbMapSqlConstants.SPACE);
                            appendSqlQuery(sb, DbMapSqlConstants.ON);
                            appendSqlQuery(sb, DbMapSqlConstants.LEFT_BRACKET);
                            appendSqlQuery(sb, DbMapSqlConstants.SPACE);
                            buildConditions(component, sb, inputTable, true, true, true);
                            appendSqlQuery(sb, DbMapSqlConstants.SPACE);
                            appendSqlQuery(sb, DbMapSqlConstants.RIGHT_BRACKET);
                        } else {
                            commaCouldBeAdded = true;
                            buildTableDeclaration(component, sb, inputTable, commaCouldBeAdded, crCouldBeAdded, false);
                        }

                    }

                }
            }

            // where
            StringBuilder sbWhere = new StringBuilder();
            this.tabSpaceString = DEFAULT_TAB_SPACE_STRING;
            boolean isFirstClause = true;
            for (int i = 0; i < lstSizeInputTables; i++) {
                ExternalDbMapTable inputTable = inputTables.get(i);
                IJoinType joinType = language.getJoin(inputTable.getJoinType());
                if (joinType == AbstractDbLanguage.JOIN.CROSS_JOIN) {
                    // if join type is CROSS JOIN the condition will only in where clause no matter explicit join
                    // checked or not
                    if (buildConditions4WhereClause(isFirstClause, component, sbWhere, inputTable, false)) {
                        isFirstClause = false;
                    }
                } else {
                    if (buildConditions(component, sbWhere, inputTable, false, isFirstClause, false)) {
                        isFirstClause = false;
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
                List<ExternalDbMapEntry> customWhereConditionsEntries = outputTable.getCustomWhereConditionsEntries();
                if (customWhereConditionsEntries != null) {
                    for (ExternalDbMapEntry entry : customWhereConditionsEntries) {
                        String exp = initExpression(component, entry);
                        if (exp != null && !DbMapSqlConstants.EMPTY.equals(exp.trim())) {
                            if (containWith(exp, DbMapSqlConstants.OR, true)
                                    || containWith(exp, DbMapSqlConstants.AND, true)) {
                                exp = replaceVariablesForAdditionalClauses(component, exp);
                                originalWhereAddition.add(exp);
                            } else {
                                exp = replaceVariablesForAdditionalClauses(component, exp);
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
                            exp = replaceVariablesForAdditionalClauses(component, exp);
                            otherAddition.add(exp);
                        }
                    }
                }
            }
            this.tabSpaceString = tabString;

            String whereClauses = sbWhere.toString();
            String additionalWhereClause = this.getWhereClauseFromTarget(dbMapComponent, outputTableName);
            boolean additionalWhereFlag = additionalWhereClause != null && additionalWhereClause.trim().length() > 0;
            boolean whereFlag = whereClauses.trim().length() > 0;
            boolean whereAddFlag = !whereAddition.isEmpty();
            boolean whereOriginalFlag = !originalWhereAddition.isEmpty();
            if (whereFlag || whereAddFlag || whereOriginalFlag || additionalWhereFlag) {
                appendSqlQuery(sb, DbMapSqlConstants.NEW_LINE);
                appendSqlQuery(sb, tabSpaceString);
                appendSqlQuery(sb, DbMapSqlConstants.WHERE);
            }
            if (whereFlag) {
                appendSqlQuery(sb, whereClauses);
            }
            if (whereAddFlag) {
                for (int i = 0; i < whereAddition.size(); i++) {
                    if ((i == 0 && whereFlag) || i > 0) {
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
            if (additionalWhereFlag) {
                if (whereFlag || whereAddFlag) {
                    appendSqlQuery(sb, DbMapSqlConstants.NEW_LINE);
                    appendSqlQuery(sb, tabSpaceString);
                    appendSqlQuery(sb, DbMapSqlConstants.SPACE);
                    appendSqlQuery(sb, DbMapSqlConstants.AND);
                }
                appendSqlQuery(sb, DbMapSqlConstants.SPACE);
                appendSqlQuery(sb, additionalWhereClause);
            }
        }

        String sqlQuery = sb.toString();
        sqlQuery = handleQuery(sqlQuery);
        queryColumnsName = handleQuery(queryColumnsName);
        return sqlQuery;
    }

    protected String getWhereClauseFromTarget(DbMapComponent dbMapComponent, String outputTableName) {
        List<IConnection> outputConnections = (List<IConnection>) dbMapComponent.getOutgoingConnections();
        if (outputConnections != null) {
            IConnection iconn = this.getConnectonByMetadataName(outputConnections, outputTableName);
            if (iconn != null && iconn.getTarget() != null) {
                source = iconn.getTarget();
                IElementParameter useWhereClauseTable = source.getElementParameter("USE_WHERE_CONDITIONS_TABLE");
                if (useWhereClauseTable != null && Boolean.parseBoolean(useWhereClauseTable.getValue().toString())) {
                    StringBuilder whereSb = new StringBuilder();
                    List<Map<String, String>> whereConditions = (List<Map<String,String>>)ElementParameterParser.getObjectValue(source, "__WHERE_CONDITIONS_TABLE__");
                    if(whereConditions.size() > 0) {
                        String operator = "";
                        for(Map<String, String> whereCondition : whereConditions) {
                            String column_condition = this.adjustVariableOnEdge(whereCondition.get("COLUMN"));
                            String function_condition = TalendTextUtils.removeQuotes(whereCondition.get("FUNCTION"));
                            String value_condition = this.adjustVariableOnEdge(whereCondition.get("VALUE_SQL"));
                            whereSb.append(operator)
                                    .append(column_condition)
                                    .append(" ")
                                    .append(function_condition)
                                    .append(" ")
                                    .append(value_condition);

                            operator = " AND ";
                        }
                    }
                    String clause = whereSb.toString();
                    if (org.apache.commons.lang.StringUtils.isNotBlank(clause)) {
                        return clause;
                    }
                } else {
                    IElementParameter whereClauseParam = source.getElementParameter("WHERE_CLAUSE"); //$NON-NLS-1$

                    if (whereClauseParam != null && whereClauseParam.getValue() != null) {
                        String whereTextArea = this.adjustVariableOnEdge(String.valueOf(whereClauseParam.getValue()));

                        if (org.apache.commons.lang.StringUtils.isNotBlank(whereTextArea)) {
                            return whereTextArea;
                        }
                    }
                }
            }
        }
        return null;
    }

    protected String adjustVariableOnEdge(String code) {
        if (code == null) {
            return null;
        }
        StringBuilder codeSb = new StringBuilder(code);
        if (!code.startsWith("\"")) {
            codeSb.insert(0, "\" + ");
        } else {
            codeSb.deleteCharAt(0);
        }
        if (!code.endsWith("\"")) {
            codeSb.append(" + \"");
        } else {
            codeSb.deleteCharAt(codeSb.length() - 1);
        }
        return codeSb.toString();
    }

    protected boolean isVariable(String expression) {
        return !org.apache.commons.lang.StringUtils.isEmpty(expression)
                && (ContextParameterUtils.isContainContextParam(expression)
                        || parser.getGlobalMapSet(expression).size() > 0);
    }
}