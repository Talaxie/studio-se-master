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
package org.talend.dataprofiler.core.migration.impl;

import java.util.Date;

import org.talend.core.model.metadata.builder.database.dburl.SupportDBUrlType;
import org.talend.dataprofiler.core.migration.AbstractWorksapceUpdateTask;
import org.talend.dataprofiler.core.migration.helper.IndicatorDefinitionFileHelper;
import org.talend.dataquality.indicators.definition.IndicatorDefinition;
import org.talend.dq.indicators.definitions.DefinitionHandler;

/**
 * for TDQ-20479 msjian: update the postgresql expression in "Regular Expression Matching" indicator.
 *
 */
public class UpdateRexMatchInd4PostgresqlTask extends AbstractWorksapceUpdateTask {

    private static final String REGULAR_EXPRESSION_MATCHING_UUID = "_yb-_8Dh8Ed2XmO7pl5Yuyg"; //$NON-NLS-1$

    private final String language = SupportDBUrlType.POSTGRESQLEFAULTURL.getDBKey();

    public Date getOrder() {
        return createDate(2022, 6, 13);
    }

    public MigrationTaskType getMigrationTaskType() {
        return MigrationTaskType.FILE;
    }

    @Override
    protected boolean doExecute() throws Exception {
        IndicatorDefinition regularExpMatchingDef =
                DefinitionHandler.getInstance().getDefinitionById(REGULAR_EXPRESSION_MATCHING_UUID);
        if (regularExpMatchingDef != null) {
            String regularExpbody =
                    "SELECT COUNT(CASE WHEN cast(<%=__COLUMN_NAMES__%> as VARCHAR)  ~ <%=__PATTERN_EXPR__%> THEN 1 END), COUNT(*) FROM <%=__TABLE_NAME__%> <%=__WHERE_CLAUSE__%>"; //$NON-NLS-1$

            if (!IndicatorDefinitionFileHelper.isExistSqlExprWithLanguage(regularExpMatchingDef, language)) {
                IndicatorDefinitionFileHelper
                        .addSqlExpression(regularExpMatchingDef, language,
                                regularExpbody);
            } else {
                IndicatorDefinitionFileHelper
                        .updateSqlExpression(regularExpMatchingDef, language,
                                regularExpbody);
            }
            IndicatorDefinitionFileHelper.save(regularExpMatchingDef);
            DefinitionHandler.getInstance().reloadIndicatorsDefinitions();
        }

        return true;
    }
}
