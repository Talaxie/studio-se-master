package org.talend.core.database.utils;

import java.util.List;

import org.talend.core.model.context.ContextUtils;
import org.talend.core.model.metadata.builder.connection.Connection;
import org.talend.core.model.process.IContext;
import org.talend.core.model.process.IContextManager;
import org.talend.core.model.properties.ContextItem;
import org.talend.core.model.utils.ContextParameterUtils;
import org.talend.designer.core.model.utils.emf.talendfile.ContextParameterType;
import org.talend.designer.core.model.utils.emf.talendfile.ContextType;

public class BaseConnectionContextHelper {

    public static final String EMPTY = ""; //$NON-NLS-1$

    /**
     * get context original value by context code from the default context group of the contextManager
     * 
     * @param contextManager
     * @param contextCode
     * @return
     */
    public static String getOriginalValue(IContextManager contextManager, String contextCode) {
        if (ContextParameterUtils.containContextVariables(contextCode)) {
            String variable = ContextParameterUtils.getVariableFromCode(contextCode);
            IContext context = contextManager.getDefaultContext();
            if (context != null) {
                return context.getContextParameter(variable).getValue();
            }
        }
        return contextCode;
    }

    /**
     * get context original value by context code
     * 
     * @param context
     * @param contextCode
     * @return
     */
    public static String getOriginalValue(IContext context, String contextCode) {
        if (ContextParameterUtils.containContextVariables(contextCode)) {
            String variable = ContextParameterUtils.getVariableFromCode(contextCode);
            if (context != null) {
                return context.getContextParameter(variable).getValue();
            }
        }
        return contextCode;
    }

    /**
     * 
     * ggu Comment method "getOriginalValue".
     * 
     * if value is context mode, return original value.
     */
    @SuppressWarnings("unchecked")
    public static String getOriginalValue(ContextType contextType, final String value) {
        if (value == null) {
            return EMPTY;
        }
        if (contextType != null && ContextParameterUtils.isContainContextParam(value)) {
            String var = ContextParameterUtils.getVariableFromCode(value);
            if (var != null) {
                ContextParameterType param = null;
                for (ContextParameterType paramType : (List<ContextParameterType>) contextType.getContextParameter()) {
                    if (paramType.getName().equals(var)) {
                        param = paramType;
                        break;
                    }
                }
                if (param != null) {
                    String value2 = param.getRawValue();
                    if (value2 != null) {
                        // return TalendTextUtils.removeQuotes(value2); //some value can't be removed for quote
                        return value2;
                    }
                }
                return EMPTY;
            }
        }
        return value;
    }

    public static ContextType getContextTypeForContextMode(Connection connection) {
        if (connection == null) {
            return null;
        }
        ContextItem contextItem = ContextUtils.getContextItemById2(connection.getContextId());
        if (contextItem != null && connection.isContextMode()) {
            String selectedContext = connection.getContextName();
            return ContextUtils.getContextTypeByName(contextItem, selectedContext, true);
        }
        return null;
    }

}
