package org.talend.designer.xmlmap.ui.expressionutil;

import java.util.ArrayList;
import java.util.List;

import org.apache.oro.text.regex.MalformedPatternException;
import org.apache.oro.text.regex.MatchResult;
import org.apache.oro.text.regex.Pattern;
import org.apache.oro.text.regex.PatternMatcherInput;
import org.apache.oro.text.regex.Perl5Compiler;
import org.apache.oro.text.regex.Perl5Matcher;
import org.apache.oro.text.regex.Perl5Substitution;
import org.apache.oro.text.regex.Util;
import org.talend.commons.utils.data.text.StringHelper;
import org.talend.designer.xmlmap.util.XmlMapUtil;

public class XmlMapExpressionManager {

    private final static String EXPRESSION_PATTERN = "(\\[)\\s*(\\w+)\\s*\\.(\\w+\\s*:\\s*(/.+?)+(/@.+?)*)\\s*(\\])|((?!\\[)\\s*\\w+)\\s*\\.\\s*(\\w+(?!\\]))";

    private final String SUBS_PATTERN_FOR_REPLACE_LOCATION = "{0}(\\s*\\b){1}(\\s*)\\.(\\s*){2}(\\b\\s*){3}";

    private Perl5Matcher matcher = new Perl5Matcher();

    private Perl5Compiler compiler = new Perl5Compiler();

    private Pattern pattern;

    private PatternMatcherInput patternMatcherInput;

    public List<TableEntryLocation> parseTableEntryLocation(String expression) {
        List<TableEntryLocation> locations = new ArrayList<TableEntryLocation>();
        recompilePatternIfNecessary(EXPRESSION_PATTERN);
        patternMatcherInput = new PatternMatcherInput(expression);

        while (matcher.contains(patternMatcherInput, pattern)) {
            MatchResult matchResult = matcher.getMatch();
            if (matchResult.group(1) != null) {
                TableEntryLocation location = new TableEntryLocation(matchResult.group(1), matchResult.group(2),
                        matchResult.group(3), matchResult.group(6));
                locations.add(location);
            } else if (matchResult.group(matchResult.groups() - 1) != null) {
                TableEntryLocation location = new TableEntryLocation(matchResult.group(matchResult.groups() - 2),
                        matchResult.group(matchResult.groups() - 1));
                locations.add(location);
            }
        }
        return locations;

    }

    public List<String> getMatchedExpression(String expression) {
        List<String> matched = new ArrayList<String>();
        if (expression == null) {
            return matched;
        }
        recompilePatternIfNecessary(EXPRESSION_PATTERN);
        patternMatcherInput = new PatternMatcherInput(expression);
        while (matcher.contains(patternMatcherInput, pattern)) {
            MatchResult matchResult = matcher.getMatch();
            if (matchResult.group(0) != null) {
                matched.add(matchResult.group(0).trim());
            }
        }

        return matched;
    }

    private void recompilePatternIfNecessary(String regexpPattern) {
        if (pattern == null || !regexpPattern.equals(pattern.getPattern())) {
            try {
                pattern = compiler.compile(regexpPattern);
            } catch (MalformedPatternException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public String replaceExpression(String expression, TableEntryLocation oldLocation, TableEntryLocation newLocation) {
        String returnedExpression = expression;
        boolean needPrefixAndSuffix = oldLocation.prefix != null && !"".equals(oldLocation.prefix) && oldLocation.sufix != null
                && !"".equals(oldLocation.sufix);
        String tempPattern = StringHelper.replacePrms(SUBS_PATTERN_FOR_REPLACE_LOCATION, new Object[] {
                needPrefixAndSuffix ? (XmlMapUtil.DOUBLE_ESCAPE + oldLocation.prefix) : "", oldLocation.tableName,
                oldLocation.columnValue, needPrefixAndSuffix ? (XmlMapUtil.DOUBLE_ESCAPE + oldLocation.sufix) : "" });
        recompilePatternIfNecessary(tempPattern);
        if (returnedExpression != null) {
            matcher.setMultiline(true);
            Perl5Substitution substitution = new Perl5Substitution(oldLocation.prefix + "$1" + newLocation.tableName + "$2"
                    + XmlMapUtil.EXPRESSION_SEPARATOR_SPLIT + "$3" + newLocation.columnValue + "$4" + oldLocation.sufix,
                    Perl5Substitution.INTERPOLATE_ALL);
            returnedExpression = Util.substitute(matcher, pattern, substitution, returnedExpression, Util.SUBSTITUTE_ALL);
        }
        return returnedExpression;

    }

}
