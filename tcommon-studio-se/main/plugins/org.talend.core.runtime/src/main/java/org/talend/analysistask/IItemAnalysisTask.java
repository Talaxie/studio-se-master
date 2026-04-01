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
package org.talend.analysistask;

import java.util.List;
import java.util.Set;

import org.talend.core.model.properties.Item;
import org.talend.core.model.repository.ERepositoryObjectType;

/**
 * DOC jding  class global comment. Detailled comment
 */
public interface IItemAnalysisTask {

    Set<ERepositoryObjectType> getRepositoryObjectTypeScope();

    List<AnalysisReportRecorder> execute(Item item);

    String getId();

    void setId(String id);

    String getName();

    void setName(String name);

    String getDescription();

    void setDescription(String description);

    String getDetailLink();

    void setDetailLink(String detailLink);

}
