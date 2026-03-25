package org.talend.dq.analysis.explore;

import org.eclipse.emf.common.util.EList;

import orgomg.cwm.objectmodel.core.Expression;


public class RegexPatternExplorer extends PatternExplorer {

    @Override
    protected void initRegularExpressionParameter() {
     // MOD gdbu 2011-12-5 TDQ-4087 get function name from sql sentence when use MSSQL
        EList<Expression> instantiatedExpressions = indicator.getInstantiatedExpressions();
        if (instantiatedExpressions.size() > 0) {
            Expression expression = instantiatedExpressions.get(0);
            String regexp = dbmsLanguage.getRegexPatternString(indicator);
            dbmsLanguage.setRegularExpressionFunction(dbmsLanguage.extractRegularExpressionFunction(expression, regexp));
            dbmsLanguage.setFunctionReturnValue(dbmsLanguage.extractRegularExpressionFunctionReturnValue(expression, regexp));
        }
    }

    @Override
    protected String getRegexNotLike(String regexPatternString) {
        return dbmsLanguage.regexNotLike(columnName, regexPatternString)+ dbmsLanguage.getFunctionReturnValue();
    }

    @Override
    protected String getRegexLike(String regexPatternString) {
        return dbmsLanguage.regexLike(columnName, regexPatternString)+ dbmsLanguage.getFunctionReturnValue();
    }
    
    

    
    
}
