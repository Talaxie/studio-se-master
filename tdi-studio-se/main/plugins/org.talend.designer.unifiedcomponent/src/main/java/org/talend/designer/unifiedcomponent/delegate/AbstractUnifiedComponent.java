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
package org.talend.designer.unifiedcomponent.delegate;

import org.talend.designer.core.model.components.EParameterName;
import org.talend.designer.unifiedcomponent.delegate.service.IComponentDelegate;

/**
 * created by hcyi on Nov 28, 2022
 * Detailled comment
 *
 */
public abstract class AbstractUnifiedComponent implements IComponentDelegate {

    @Override
    public String getUnifiedDisplayName() {
        return EParameterName.UNIFIED_COMPONENTS.getDisplayName();
    }
}
