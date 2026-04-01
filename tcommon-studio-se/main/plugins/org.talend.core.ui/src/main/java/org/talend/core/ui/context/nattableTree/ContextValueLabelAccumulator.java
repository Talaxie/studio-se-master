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
package org.talend.core.ui.context.nattableTree;

import org.eclipse.nebula.widgets.nattable.data.IDataProvider;
import org.eclipse.nebula.widgets.nattable.extension.glazedlists.GlazedListsDataProvider;
import org.eclipse.nebula.widgets.nattable.layer.ILayer;
import org.eclipse.nebula.widgets.nattable.layer.LabelStack;
import org.eclipse.nebula.widgets.nattable.layer.cell.ColumnOverrideLabelAccumulator;
import org.talend.core.model.process.IContextManager;
import org.talend.core.model.process.IContextParameter;
import org.talend.core.ui.context.ContextTreeTable.ContextTreeNode;
import org.talend.core.ui.context.IContextModelManager;
import org.talend.core.ui.context.model.ContextTabChildModel;
import org.talend.core.ui.context.model.table.ContextTableConstants;
import org.talend.core.ui.context.model.table.ContextTableTabParentModel;
import org.talend.core.ui.utils.ContextTypeValidator;


public class ContextValueLabelAccumulator extends ColumnOverrideLabelAccumulator {

    private IDataProvider dataProvider;

    private IContextManager manager;

    private IContextModelManager modelManager;

    public ContextValueLabelAccumulator(ILayer layer, IDataProvider dataProvider, IContextManager manager,
            IContextModelManager modelManager) {
        super(layer);
        this.dataProvider = dataProvider;
        this.manager = manager;
        this.modelManager = modelManager;
    }

   
    @Override
    public void accumulateConfigLabels(LabelStack configLabels, int columnPosition, int rowPosition) {
        super.accumulateConfigLabels(configLabels, columnPosition, rowPosition);
        boolean isAddedValueNotMatchStyle = false;
        if (modelManager.getProcess() == null) {
            return;
        }
        String currentColumnName = ContextRowDataListFixture.getPropertyNamesAsList(modelManager).get(columnPosition);
        ContextTreeNode rowNode = ((GlazedListsDataProvider<ContextTreeNode>) dataProvider).getList().get(rowPosition);
        if (configLabels.contains(ContextTableConstants.COLUMN_CONTEXT_VALUE)) {
            IContextParameter realPara = ContextNatTableUtils.getRealParameter(manager, currentColumnName, rowNode.getTreeData());
            if (realPara != null) {
                boolean isValid = ContextTypeValidator.isMatchType(realPara.getType(), realPara.getValue());
                if (isValid) {
                    configLabels.remove(ContextTableConstants.LABEL_VALUE_NOT_MATCH_TYPE);
                } else {
                    configLabels.addLabel(ContextTableConstants.LABEL_VALUE_NOT_MATCH_TYPE);
                    isAddedValueNotMatchStyle = true;
                }
            }
        }
        
        if (!isAddedValueNotMatchStyle) {
            if (rowNode.getTreeData() instanceof ContextTableTabParentModel) {
                ContextTableTabParentModel rowModel = (ContextTableTabParentModel) rowNode.getTreeData();
                Boolean isRepositoryContext = rowModel.hasChildren();
                if (isRepositoryContext) {
                    configLabels.addLabel(ContextTableConstants.LABEL_CHANGED_FORCEGROUND);
                } else {
                }
            } else {
                ContextTabChildModel rowChildModel = (ContextTabChildModel) rowNode.getTreeData();
                if (rowChildModel != null) {
                    configLabels.addLabel(ContextTableConstants.LABEL_CHANGED_FORCEGROUND);
                }
            }
        }
    }
}
