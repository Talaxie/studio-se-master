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
package org.talend.core.runtime.util;

import org.apache.commons.lang.StringUtils;
import org.talend.core.model.metadata.ISAPConstant;
import org.talend.core.model.metadata.builder.connection.SAPConnection;
import org.talend.cwm.helper.TaggedValueHelper;

/**
 * created by hcyi on Nov 29, 2021
 * Detailled comment
 *
 */
public class SAPUtils {

    public static boolean isHana(SAPConnection connection) {
        if (connection != null) {
            String connectionType = TaggedValueHelper.getValueString(ISAPConstant.ADSO_CONNECTION_TYPE, connection);
            if (StringUtils.isBlank(connectionType)) {
                String dbHost = TaggedValueHelper.getValueString(ISAPConstant.PROP_DB_HOST, connection);
                if (StringUtils.isNotBlank(dbHost)) {
                    return true;
                }
            } else if (ISAPConstant.HANA_JDBC.equals(connectionType)) {
                return true;
            }
        }
        return false;
    }

}
