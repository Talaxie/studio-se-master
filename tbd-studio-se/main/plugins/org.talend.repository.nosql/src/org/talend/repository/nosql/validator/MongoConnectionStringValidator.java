// ============================================================================
//
// Copyright (C) 2006-2021 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.repository.nosql.validator;

import org.talend.core.model.utils.ContextParameterUtils;
import org.talend.designer.core.model.utils.emf.talendfile.ContextType;
import org.talend.metadata.managment.ui.utils.ConnectionContextHelper;
import org.talend.repository.model.nosql.NoSQLConnection;

/**
 * DOC sbliu  class global comment. Detailled comment
 */
public class MongoConnectionStringValidator implements IValidator {
    private static final String local_prefix = "mongodb://";
    private static final String atlas_prefix = "mongodb+srv://";
    
    private NoSQLConnection connection;
    private Object value;

    public MongoConnectionStringValidator(NoSQLConnection connection, String text) {
        this.connection = connection;
        this.value = text;
    }

    /* (non-Javadoc)
     * @see org.talend.repository.nosql.validator.IValidator#validate()
     */
    @Override
    public boolean validate() {
        if (value == null) {
            return false;
        }

        String connString = String.valueOf(value);
        if (connection.isContextMode()) {
            ContextType contextType = ConnectionContextHelper.getContextTypeForContextMode(connection);
            connString = ContextParameterUtils.getOriginalValue(contextType, connString);
        }
        
        return connString.startsWith(local_prefix) || connString.startsWith(atlas_prefix);
    }

}
