// ============================================================================
//
// Copyright (C) 2006-2023 Talaxie Inc. - www.deilink.fr
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talaxie SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.sdk.component.studio;

import org.eclipse.jface.resource.ImageDescriptor;
import org.talend.sdk.component.server.front.model.ComponentDetail;
import org.talend.sdk.component.server.front.model.ComponentIndex;
import org.talend.sdk.component.server.front.model.ConfigTypeNodes;
import org.talend.sdk.component.studio.util.TaCoKitConst;
import org.talend.sdk.component.studio.util.TaCoKitUtil;

public class AdditionalJDBCComponentModel extends ComponentModel implements IAdditionalJDBCComponent {

    private String databaseType;

    public AdditionalJDBCComponentModel(ComponentIndex component, ComponentDetail detail, ConfigTypeNodes configTypeNodes,
            ImageDescriptor image32, String reportPath, boolean isCatcherAvailable, String databaseType) {
        super(component, detail, configTypeNodes, image32, reportPath, isCatcherAvailable);
        this.databaseType = databaseType;
    }

    @Override
    public String getName() {
        return TaCoKitUtil.getFullComponentName(databaseType, index.getId().getName());
    }

    @Override
    public String getDisplayName() {
        if (isMadeByTalend()) {
            return TaCoKitConst.COMPONENT_NAME_PREFIX + getName();
        }
        return getName();
    }

    @Override
    public String getLongName() {
        return getName();
    }

    @Override
    public String getDatabaseType() {
        return databaseType;
    }

}
