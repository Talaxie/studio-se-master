package org.talend.designer.dbmap.language.generation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.oro.text.regex.MalformedPatternException;
import org.apache.oro.text.regex.MatchResult;
import org.apache.oro.text.regex.Pattern;
import org.apache.oro.text.regex.PatternMatcher;
import org.apache.oro.text.regex.PatternMatcherInput;
import org.apache.oro.text.regex.Perl5Compiler;
import org.apache.oro.text.regex.Perl5Matcher;
import org.apache.oro.text.regex.Perl5Substitution;
import org.apache.oro.text.regex.Substitution;
import org.apache.oro.text.regex.Util;

public class MapExpressionParser {

    private Perl5Matcher matcher = new Perl5Matcher();

    private Perl5Compiler compiler = new Perl5Compiler();

    private Pattern pattern;

    private String locationPattern;

    private PatternMatcherInput patternMatcherInput;

    public MapExpressionParser(String locationPattern) {
        this.locationPattern = locationPattern;
    }

    public void setLocationPattern(String locationPattern) {
        this.locationPattern = locationPattern;
    }

    public List<Map<String, String>> parseInTableEntryLocations(String expression) {
        List<Map<String, String>> result = new ArrayList<Map<String, String>>();
        if (expression != null) {
            matcher.setMultiline(true);
            if (patternMatcherInput == null) {
                patternMatcherInput = new PatternMatcherInput(expression);
            } else {
                patternMatcherInput.setInput(expression);
            }

            recompilePatternIfNecessary(locationPattern);

            while (matcher.contains(patternMatcherInput, pattern)) {
                MatchResult matchResult = matcher.getMatch();
                Map<String, String> map = new HashMap<String, String>();
                if (matchResult.group(3) != null && !"".equals(matchResult.group(3))) {
                    map.put(matchResult.group(3), matchResult.group(1) + "." + matchResult.group(2));
                } else {
                    map.put(matchResult.group(2), matchResult.group(1));
                }

                result.add(map);
            }
        }
        return result;// .toArray(new TableEntryLocation[0]);
    }

    /**
     * 
     * DOC parse to talbename and column map
     * 
     * @param expression
     * @return
     */
    public List<Map<String, String>> parseInTableEntryLocations2(String expression) {
        List<Map<String, String>> result = new ArrayList<Map<String, String>>();
        if (expression != null) {
            matcher.setMultiline(true);
            if (patternMatcherInput == null) {
                patternMatcherInput = new PatternMatcherInput(expression);
            } else {
                patternMatcherInput.setInput(expression);
            }

            recompilePatternIfNecessary(locationPattern);
            while (matcher.contains(patternMatcherInput, pattern)) {
                MatchResult matchResult = matcher.getMatch();
                Map<String, String> map = new HashMap<String, String>();
                String group1 = matchResult.group(1);
                if (group1 != null && !"".equals(group1) && matchResult.group(matchResult.groups() - 1) != null) {
                    map.put(matchResult.group(matchResult.groups() - 1).trim(), group1.substring(0, group1.length() - 1).trim());
                } else {
                    String string = matchResult.toString();
                    int lastIndexOf = string.lastIndexOf(".");
                    if (lastIndexOf != -1) {
                        map.put(string.substring(lastIndexOf + 1, string.length()).trim(), string.substring(0, lastIndexOf)
                                .trim());
                    }
                }
                result.add(map);
            }
        }
        return result;
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

    public String replaceLocation(String expression, String tempPattern, String sub) {
        String returnedExpression = expression;

        recompilePatternIfNecessary(tempPattern);
        if (returnedExpression != null) {
            matcher.setMultiline(true);
            Perl5Substitution substitution = new Perl5Substitution(sub);
            returnedExpression = substitute(matcher, pattern, substitution, returnedExpression, Util.SUBSTITUTE_ALL);
        }
        return returnedExpression;
    }

    private String substitute(PatternMatcher matcher, Pattern pattern, Substitution sub, String input, int numSubs) {
        StringBuffer buffer = new StringBuffer(input.length());
        PatternMatcherInput pinput = new PatternMatcherInput(input);

        // Users have indicated that they expect the result to be the
        // original input string, rather than a copy, if no substitutions
        // are performed,
        if (substitute(buffer, matcher, pattern, sub, pinput, numSubs) != 0) {
            return buffer.toString();
        }
        return input;
    }

    private int substitute(StringBuffer result, PatternMatcher matcher, Pattern pattern, Substitution sub,
            PatternMatcherInput input, int numSubs) {
        int beginOffset, subCount;
        char[] inputBuffer;

        subCount = 0;
        beginOffset = input.getBeginOffset();
        inputBuffer = input.getBuffer();

        // Must be != 0 because SUBSTITUTE_ALL is represented by -1.
        // Do NOT change to numSubs > 0.
        while (numSubs != 0 && matcher.contains(input, pattern)) {
            --numSubs;
            ++subCount;
            if (input.getMatchBeginOffset() > 0) {
                if (input.getBuffer()[input.getMatchBeginOffset() - 1] == '_') {
                    continue;
                }
            }
            if (input.getMatchEndOffset() < input.length() - 1) {
                if (input.getBuffer()[input.getMatchEndOffset()] == '_') {
                    continue;
                }
            }
            result.append(inputBuffer, beginOffset, input.getMatchBeginOffset() - beginOffset);
            sub.appendSubstitution(result, matcher.getMatch(), subCount, input, matcher, pattern);
            beginOffset = input.getMatchEndOffset();
        }

        result.append(inputBuffer, beginOffset, input.length() - beginOffset);
        return subCount;
    }
}
