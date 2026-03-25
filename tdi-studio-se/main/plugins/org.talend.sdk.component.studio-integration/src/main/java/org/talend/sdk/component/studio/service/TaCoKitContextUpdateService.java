// ============================================================================
//
// Copyright (C) 2006-2022 Talaxie Inc. - www.deilink.fr
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talaxie SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.sdk.component.studio.service;

import java.util.Map;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.core.AbstractRepositoryContextUpdateService;
import org.talend.core.model.metadata.builder.connection.Connection;
import org.talend.sdk.component.studio.metadata.model.TaCoKitConfigurationModel;
import org.talend.sdk.component.studio.metadata.model.TaCoKitConfigurationModel.ValueModel;

public class TaCoKitContextUpdateService extends AbstractRepositoryContextUpdateService {

    @Override
    public boolean updateContextParameter(Connection conn, String oldValue, String newValue) {
        boolean isModified = false;
        if (conn.isContextMode()) {
            TaCoKitConfigurationModel taCoKitConfigurationModel = new TaCoKitConfigurationModel(conn);
            Map<String, String> properties = taCoKitConfigurationModel.getProperties();

            ValueModel value;
            try {
                if (properties != null && properties.size() > 0) {
                    Set<String> keySet = properties.keySet();
                    for (String key : keySet) {
                        boolean isNotENUMType = taCoKitConfigurationModel.isNotENUMTypeParameter(key);
                        if (isNotENUMType) {
                            value = taCoKitConfigurationModel.getValue(key);
                            if (value != null && StringUtils.equals(oldValue, value.getValue())) {
                                taCoKitConfigurationModel.setValue(key, value.getValue());
                                isModified = true;
                            }
                        }

                    }
                }
            } catch (Exception e) {
                ExceptionHandler.process(e);
            }
        }
        return isModified;
    }

    @Override
    public boolean accept(Connection connection) {
        boolean isTacokit = TaCoKitConfigurationModel.isTacokit(connection);

        return isTacokit;
    }
}
