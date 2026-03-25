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
package org.talend.designer.dbmap.migration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang.StringUtils;
import org.apache.oro.text.regex.MalformedPatternException;
import org.apache.oro.text.regex.MatchResult;
import org.apache.oro.text.regex.Pattern;
import org.apache.oro.text.regex.PatternMatcherInput;
import org.apache.oro.text.regex.Perl5Compiler;
import org.apache.oro.text.regex.Perl5Matcher;
import org.eclipse.emf.common.util.EList;
import org.talend.commons.exception.PersistenceException;
import org.talend.commons.ui.runtime.exception.ExceptionHandler;
import org.talend.core.language.ECodeLanguage;
import org.talend.core.model.components.ComponentUtilities;
import org.talend.core.model.components.ModifyComponentsAction;
import org.talend.core.model.components.conversions.IComponentConversion;
import org.talend.core.model.components.filters.IComponentFilter;
import org.talend.core.model.components.filters.NameComponentFilter;
import org.talend.core.model.migration.AbstractAllJobMigrationTask;
import org.talend.core.model.properties.Item;
import org.talend.core.model.utils.ContextParameterUtils;
import org.talend.core.utils.TalendQuoteUtils;
import org.talend.designer.core.model.utils.emf.talendfile.AbstractExternalData;
import org.talend.designer.core.model.utils.emf.talendfile.ConnectionType;
import org.talend.designer.core.model.utils.emf.talendfile.ContextParameterType;
import org.talend.designer.core.model.utils.emf.talendfile.ContextType;
import org.talend.designer.core.model.utils.emf.talendfile.NodeType;
import org.talend.designer.core.model.utils.emf.talendfile.ProcessType;
import org.talend.designer.core.model.utils.emf.talendfile.impl.MetadataTypeImpl;
import org.talend.designer.dbmap.model.emf.dbmap.DBMapData;
import org.talend.designer.dbmap.model.emf.dbmap.DBMapperTableEntry;
import org.talend.designer.dbmap.model.emf.dbmap.OutputTable;

/**
 * created by hzhao on Mar 27, 2023
 * Detailled comment
 *
 */
public class SpecialUpdateELTConnectorNameToDefaultName4JDBCMigrationTask extends AbstractAllJobMigrationTask {
    
    private Pattern pattern;

    private final String GLOBALMAP_SPECIAL_REGEX = "\"\\+globalMap\\.get\\(\"\\w+\"\\)\\+\"";

    private final String GLOBALMAP_SPECIAL_REGEX_OUTPUT_EXPRESSION = "\"\\+\\(globalMap\\.get\\(\"\\w+\"\\)\\)\\+\"";

    private final String GLOBALMAP_PATTERN2 =
            "\\s*(\\(\\s*\\(\\s*[a-zA-Z]+\\s*\\)\\s*globalMap\\s*\\.\\s*get\\s*\\(\\s*\\\"(.+?)\\\"\\s*\\)\\s*\\))\\s*";

    @Override
    public ExecutionResult execute(Item item) {
        ProcessType processType = getProcessType(item);
        if (getProject().getLanguage() != ECodeLanguage.JAVA || processType == null || !Boolean
                .valueOf(System
                        .getProperty("talend.import.specialUpdate4ELTJDBCMigrationTask", //$NON-NLS-1$
                                Boolean.FALSE.toString()))) {
            return ExecutionResult.NOTHING_TO_DO;
        }
        boolean eltInputModified = false;
        boolean eltMapModified = false;
        IComponentFilter filter = new NameComponentFilter("tELTInput"); //$NON-NLS-1$
        try {
            eltInputModified = ModifyComponentsAction
                    .searchAndModify(item, processType, filter,
                    Arrays.<IComponentConversion> asList(new IComponentConversion() {

                        @Override
                        public void transform(NodeType node) {
                            boolean update = false;
                            String connectionName = null;
                            String orginalTableValue = ComponentUtilities.getNodePropertyValue(node, "ELT_TABLE_NAME"); //$NON-NLS-1$
                            String orginalSchemaValue = ComponentUtilities.getNodePropertyValue(node, "ELT_SCHEMA_NAME"); //$NON-NLS-1$
                            String tableValue = TalendQuoteUtils.removeQuotes(orginalTableValue);
                            String schemaValue = TalendQuoteUtils.removeQuotes(orginalSchemaValue);
                            if (StringUtils.isBlank(schemaValue)) {
                                connectionName = tableValue;
                            } else {
                                connectionName = schemaValue + "." + tableValue; //$NON-NLS-1$
                            }

                            for (ConnectionType connection : (List<ConnectionType>) processType.getConnection()) {
                                String label = connection.getLabel();
                                // if user customer connection name, keep everything currently they had , will update
                                // the
                                // default table name value .
                                if (!connectionName.equals(label)) {
                                    String sourceNodeName = connection.getSource();
                                    MetadataTypeImpl table = (MetadataTypeImpl) node.getMetadata().get(0);
                                    if (table.getName().equals(sourceNodeName)) {
                                        connectionName = label;
                                        update = true;
                                        break;
                                    }
                                }
                            }
                            // get from connection label
                            if (update) {
                                String connectionNameTemp = connectionName;
                                String tableNewValue = null;
                                // change "+globalMap.get("key")+" to ((String)globalMap.get("key"))
                                if (needUpdateGlobalMap(connectionNameTemp.replaceAll(" ", ""))) {
                                    String connectionNameTempNoSpace = connectionNameTemp.replaceAll(" ", "");
                                    String replacedTableName = connectionNameTempNoSpace
                                            .substring(2, connectionNameTempNoSpace.length() - 2);
                                    replacedTableName = "((String)" + replacedTableName + ")";//$NON-NLS-1$
                                    ComponentUtilities.setNodeValue(node, "ELT_TABLE_NAME", replacedTableName);//$NON-NLS-1$
                                } else {
                                    tableNewValue = replaceVariablesForExpression(processType, connectionNameTemp);
                                    if (tableNewValue != null && !tableNewValue.equals(tableValue)) {
                                        // need to replace \r\n or it will have display issue
                                        ComponentUtilities
                                                .setNodeValue(node, "ELT_TABLE_NAME", //$NON-NLS-1$
                                                        tableNewValue.replaceAll("\r\n", " "));
                                        // for customer case when table name is big query . they don't need to set
                                        // schema
                                        // from the schema field
                                        ComponentUtilities.setNodeValue(node, "ELT_SCHEMA_NAME", ""); //$NON-NLS-1$

                                    }
                                }
                            } else {
                                // add quotes because customer didn't add quotes for table fields
                                ComponentUtilities
                                        .setNodeValue(node, "ELT_TABLE_NAME", //$NON-NLS-1$
                                                addQuotesForTableAndSchemaIfNotExist(orginalTableValue));
                                ComponentUtilities
                                        .setNodeValue(node, "ELT_SCHEMA_NAME", //$NON-NLS-1$
                                                addQuotesForTableAndSchemaIfNotExist(orginalSchemaValue));
                            }
                        }
                    }));
        } catch (PersistenceException e) {
            ExceptionHandler.process(e);
            return ExecutionResult.FAILURE;
        }

        IComponentFilter filterMap = new NameComponentFilter("tELTMap"); //$NON-NLS-1$
        try {
            eltMapModified = ModifyComponentsAction
                    .searchAndModify(item, processType, filterMap,
                            Arrays.<IComponentConversion> asList(new IComponentConversion() {

                                @Override
                                public void transform(NodeType node) {
                                    boolean update = false;
                                    String connectionName = null;
                                    AbstractExternalData nodeData = node.getNodeData();
                                    if (nodeData instanceof DBMapData) {
                                        DBMapData dbMapData = (DBMapData) nodeData;
                                        OutputTable outputTable = dbMapData.getOutputTables().get(0);
                                        if (outputTable != null) {
                                            EList<DBMapperTableEntry> dbMapperTableEntries =
                                                    outputTable.getDBMapperTableEntries();

                                            for (DBMapperTableEntry tableEntry : dbMapperTableEntries) {
                                                String expression = tableEntry.getExpression();
                                                Set<String> globalMapSet = getGlobalMapSet(expression);
                                                if (globalMapSet.size() > 0) {
                                                    for (String gm : globalMapSet) {
                                                        expression =
                                                                expression
                                                                        .replaceAll(getGlobalMapExpressionRegex(gm),
                                                                                getGlobalMapExpressionRegex(
                                                                                        updateSpecialGlobalMapOnExp(
                                                                                                gm)));
                                                    }
                                                    tableEntry.setExpression(expression);
                                                }
                                            }
                                            // dbMapperTableEntries.forEach(e -> {
                                            // String expression = e.getExpression();
                                            // Set<String> globalMapSet = getGlobalMapSet(expression);
                                            // String changeExp = null;
                                            // if (globalMapSet.size() > 0) {
                                            // for (String gm : globalMapSet) {
                                            // expression =
                                            // expression.replaceAll(gm, updateSpecialGlobalMap(gm));
                                            // }
                                            // e.setExpression(expression);
                                            // }
                                            // });
                                        }
                                    }
                                }
                            }));
        } catch (PersistenceException e) {
            ExceptionHandler.process(e);
            return ExecutionResult.FAILURE;
        }
        if (eltInputModified || eltMapModified) {
            return ExecutionResult.SUCCESS_NO_ALERT;
        } else {
            return ExecutionResult.NOTHING_TO_DO;
        }
    }

    @Override
    public Date getOrder() {
        GregorianCalendar gc = new GregorianCalendar(2020, 11, 13, 12, 0, 0);
        return gc.getTime();
    }

    public String replaceVariablesForExpression(ProcessType processType, String expression) {
        if (expression == null) {
            return null;
        }
        List<String> contextList = getContextList(processType);
        for (String context : contextList) {
            if (expression.contains(context)) {
                String tempExpression = expression.replace(" ", "");
                if (!tempExpression.contains("\"+" + context + "+\"")) {
                    expression = expression.replaceAll("\\b" + context + "\\b", "\" +" + context + "+ \"");//$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
                }
            }
        }
        // if (!haveReplace) {
        // List<String> connContextList = getConnectionContextList(processType);
        // for (String context : connContextList) {
        // if (expression.contains(context)) {
        // expression = expression.replaceAll("\\b" + context + "\\b", "\" +" + context + "+ \""); //$NON-NLS-1$
        // //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        // }
        // }
        // }
        Set<String> globalMapList = getGlobalMapSet(expression, GLOBALMAP_PATTERN2);
        if (globalMapList.size() > 0) {
            String tempExpression = expression.trim();
            if ((tempExpression.startsWith("\"+") && tempExpression.endsWith("+\"")) //$NON-NLS-1$//$NON-NLS-2$
                    || (tempExpression.startsWith("\" +") && tempExpression.endsWith("+ \""))) {//$NON-NLS-1$ //$NON-NLS-2$
                return expression;
            }
        }
        for (String globalMapStr : globalMapList) {
            expression = handleGlobalStringInExpression(expression, globalMapStr);
        }
        // add quotes because when set sql on link . there's no quote
        if (!TalendQuoteUtils.isStartEndsWithQuotation(expression, true, true)) {
            expression = TalendQuoteUtils.addQuotes(expression, TalendQuoteUtils.SQL_SCRIPT);
        }
        return expression;
    }

    private boolean needUpdateGlobalMap(String tableName) {
        if (tableName == null) {
            return false;
        }
        return tableName.matches(GLOBALMAP_SPECIAL_REGEX);

    }

    private String updateSpecialGlobalMapOnExp(String expression) {
        if (expression == null) {
            return null;
        }
        String replacedTableName = expression.substring(3, expression.length() - 3);
        replacedTableName = "((String)" + replacedTableName + ")";//$NON-NLS-1$

        return replacedTableName;
    }

    private String updateSpecialGlobalMap(String expression) {
        if (expression == null) {
            return null;
        }
        String replacedTableName = expression.substring(2, expression.length() - 2);
        replacedTableName = "((String)" + replacedTableName + ")";//$NON-NLS-1$

        return replacedTableName;
    }

    private List<String> getContextList(ProcessType processType) {
        List<String> contextList = new ArrayList<String>();
        EList<ContextType> context = processType.getContext();
        for (ContextType ct : context) {
            EList<ContextParameterType> contextParameter = ct.getContextParameter();
            contextParameter.forEach(c -> contextList.add(ContextParameterUtils.JAVA_NEW_CONTEXT_PREFIX + c.getName()));
        }
        return contextList;
    }

    private Set<String> getGlobalMapSet(String sqlQuery) {
        Perl5Matcher matcher = new Perl5Matcher();
        PatternMatcherInput patternMatcherInput = null;
        Set<String> resultList = new HashSet<String>();
        if (sqlQuery != null) {
            matcher.setMultiline(true);
            patternMatcherInput = new PatternMatcherInput(sqlQuery);
            recompilePatternIfNecessary(GLOBALMAP_SPECIAL_REGEX_OUTPUT_EXPRESSION);
            while (matcher.contains(patternMatcherInput, pattern)) {
                MatchResult matchResult = matcher.getMatch();
                if (matchResult.group(0) != null) {
                    String matchGroup = matchResult.group(0);
                    resultList.add(matchGroup);
                }
            }
        }
        return resultList;
    }

    private Set<String> getGlobalMapSet(String sqlQuery, String regex) {
        Perl5Matcher matcher = new Perl5Matcher();
        PatternMatcherInput patternMatcherInput = null;
        Set<String> resultList = new HashSet<String>();
        if (sqlQuery != null) {
            matcher.setMultiline(true);
            patternMatcherInput = new PatternMatcherInput(sqlQuery);
            recompilePatternIfNecessary(regex);
            while (matcher.contains(patternMatcherInput, pattern)) {
                MatchResult matchResult = matcher.getMatch();
                if (matchResult.group(1) != null) {
                    String matchGroup = matchResult.group(1);
                    resultList.add(matchGroup);
                }
            }
        }
        return resultList;
    }

    private Pattern recompilePatternIfNecessary(String regexpPattern) {
        Perl5Compiler compiler = new Perl5Compiler();
        if (pattern == null || !regexpPattern.equals(pattern.getPattern())) {
            try {
                pattern = compiler.compile(regexpPattern);
            } catch (MalformedPatternException e) {
                throw new RuntimeException(e);
            }
        }
        return pattern;
    }

    /**
     * try add [" +] before global string and add [+ "] after if needed
     */
    private String handleGlobalStringInExpression(String expression, String globalMapStr) {
        String regex = getGlobalMapExpressionRegex(globalMapStr);
        String replacement = getGlobalMapReplacement(globalMapStr);
        int countMatches = org.apache.commons.lang.StringUtils.countMatches(expression, globalMapStr);
        if (1 == countMatches) {
            int indexGlobal = expression.indexOf(globalMapStr);

            boolean foundhead = foundhead(expression, indexGlobal - 1, 0);

            boolean foundtail = foundtail(expression, indexGlobal + globalMapStr.length(), expression.length());

            if (!foundhead && !foundtail) {
                expression = expression.replaceAll(regex, "\" +" + replacement + "+ \"");//$NON-NLS-1$ //$NON-NLS-2$
            } else if (!foundhead) {
                expression = expression.replaceAll(regex, "\" +" + replacement);//$NON-NLS-1$ //$NON-NLS-2$
            } else if (!foundtail) {
                expression = expression.replaceAll(regex, replacement + "+ \"");
            }
        } else {
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
                    globalMapStrReplacement[i] = "\" +" + replacement + "+ \"";//$NON-NLS-1$ //$NON-NLS-2$
                } else if (!foundhead) {
                    globalMapStrReplacement[i] = "\" +" + replacement;//$NON-NLS-1$ //$NON-NLS-2$
                } else if (!foundtail) {
                    globalMapStrReplacement[i] = replacement + "+ \"";//$NON-NLS-1$ //$NON-NLS-2$
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
    private boolean foundhead(String expression, int startIndex, int tolowerIndex) {
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
    private boolean foundtail(String expression, int startIndex, int tohigherIndex) {
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

    private String getGlobalMapExpressionRegex(String expression) {
        String[] specialChars = new String[] { "\\", "$", "(", ")", "*", "+", ".", "[", "]", "?", "^", "{", "}", "|" };
        String[] specialCharsRegex = new String[] { "\\\\", "\\$", "\\(", "\\)", "\\*", "\\+", "\\.", "\\[", "\\]",
                "\\?", "\\^", "\\{", "\\}", "\\|" };
        String regexExpression = expression;
        for (int i = 0; i < specialChars.length; i++) {
            int indexOf = regexExpression.indexOf(specialChars[i]);
            if (indexOf != -1) {
                regexExpression = regexExpression.replaceAll(specialCharsRegex[i], "\\\\" + specialCharsRegex[i]);
            }
        }

        return regexExpression;
    }

    private String getGlobalMapReplacement(String expression) {
        String[] specialChars = new String[] { "\\", "$" };
        String[] specialCharsRegex = new String[] { "\\\\", "\\$" };
        String[] specialCharsReplacement = new String[] { "\\\\\\\\", "\\\\\\$" };
        String replacement = expression;
        for (int i = 0; i < specialChars.length; i++) {
            int indexOf = replacement.indexOf(specialChars[i]);
            if (indexOf != -1) {
                replacement = replacement.replaceAll(specialCharsRegex[i], specialCharsReplacement[i]);
            }
        }

        return replacement;
    }

    public String addQuotesForTableAndSchemaIfNotExist(String orginalTableValue) {
        if (!ContextParameterUtils.containContextVariables(orginalTableValue)
                && !(getGlobalMapSet(orginalTableValue, GLOBALMAP_PATTERN2).size() > 0)) {
            // add quotes because customer didn't add quotes for table fields
            if (orginalTableValue != null
                    && !TalendQuoteUtils.isStartEndsWithQuotation(orginalTableValue, true, true)) {
                orginalTableValue = TalendQuoteUtils.addQuotesIfNotExist(orginalTableValue);
            }
        }
        return orginalTableValue;
    }
}