package org.talend.core.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.talend.core.model.context.ContextUtils;
import org.talend.core.model.metadata.builder.connection.Connection;
import org.talend.core.model.properties.ContextItem;
import org.talend.core.model.utils.ContextParameterUtils;
import org.talend.designer.core.model.utils.emf.talendfile.ContextParameterType;
import org.talend.designer.core.model.utils.emf.talendfile.ContextType;
import orgomg.cwm.foundation.softwaredeployment.DataManager;

public class TalendCWMService {

    private static Logger log = Logger.getLogger(TalendCWMService.class);

    /**
     * 
     * Get the readable name (actual item display name) via context style name when the item is on context mode.<BR>
     * Note that in order to make it easier for caller to get a name, this contextualName may be passed as an actual
     * display name, in this case, this name will be simply returned.
     * 
     * @param dataManager
     * @param value eigher the contextual name or the actual display name.
     * @return the readable actual item display name.
     */
    public static String getReadableName(DataManager dataManager, String value) {
        if (!(dataManager instanceof Connection) || !((Connection) dataManager).isContextMode()) {
            return value;
        } else {
            if (value == null) {
                log.error("Null context name in connection " + dataManager); //$NON-NLS-1$
                return value;
            }
            Connection conn = (Connection) dataManager;
            String contextId = conn.getContextId();

            ContextItem contextItem = ContextUtils.getContextItemById2(contextId);
            ContextType contextType = ContextUtils.getContextTypeByName(contextItem, conn.getContextName(), false);
            if (contextType != null && ContextParameterUtils.isContainContextParam(value)) {
                ContextParameterType param = null;
                for (ContextParameterType paramType : (List<ContextParameterType>) contextType.getContextParameter()) {
                    if (paramType.getName().equals(ContextParameterUtils.getVariableFromCode(value))) {
                        param = paramType;
                        break;
                    }
                }
                if (param != null) {
                    String value2 = param.getRawValue();
                    if (value2 != null) {
                        return value2;
                    }
                }
            }
            return value;
        }
    }

}
