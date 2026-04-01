// ============================================================================
//
// Copyright (C) 2006-2022 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.analysistask;

import java.util.List;
import java.util.Set;

import org.talend.core.model.properties.Item;
import org.talend.core.model.repository.ERepositoryObjectType;

/**
 * created by hcyi on Oct 26, 2022
 * Detailled comment
 *
 */
public class DefaultItemsAnalysisTask extends AbstractItemAnalysisTask {

    public DefaultItemsAnalysisTask() {
    }


    @Override
    public Set<ERepositoryObjectType> getRepositoryObjectTypeScope() {
        return null;
    }

    @Override
    public List<AnalysisReportRecorder> execute(Item item) {
        // TODO Auto-generated method stub
        return null;
    }

}
