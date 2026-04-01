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
package org.talend.dataprofiler.core.ui.editor.analysis;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.widgets.Section;
import org.talend.core.model.metadata.builder.connection.MetadataColumn;
import org.talend.cwm.db.connection.SQLExecutor;
import org.talend.cwm.helper.TaggedValueHelper;
import org.talend.dataprofiler.core.ui.editor.preview.model.ChartTableFactory;
import org.talend.dataquality.indicators.columnset.RecordMatchingIndicator;
import org.talend.dataquality.indicators.mapdb.MapDBManager;
import org.talend.dataquality.record.linkage.ui.composite.utils.MatchRuleAnlaysisUtils;
import org.talend.dataquality.record.linkage.ui.section.DuplicateRecordStatisticsSection;
import org.talend.dataquality.record.linkage.ui.section.GroupStatisticsSection;
import org.talend.dq.analysis.AnalysisHandler;
import org.talend.dq.analysis.AnalysisRecordGroupingUtils;

import orgomg.cwm.objectmodel.core.ModelElement;

/**
 * DOC yyin class global comment. Detailled comment
 */
public class MatchAnalysisResultPage extends AbstractAnalysisResultPage implements PropertyChangeListener {

    protected static Logger log = Logger.getLogger(MatchAnalysisResultPage.class);

    private Composite resultComp;

    private MatchAnalysisDetailsPage matchAnalysisMasterPage;

    private DuplicateRecordStatisticsSection duplicateRecordStatisticsSection;

    private GroupStatisticsSection groupStatisticsSection;

    /**
     * DOC yyin MatchAnalysisResultPage constructor comment.
     *
     * @param editor
     * @param id
     * @param title
     */
    public MatchAnalysisResultPage(FormEditor editor, String id, String title) {
        super(editor, id, title);
        AnalysisEditor analysisEditor = (AnalysisEditor) editor;
        this.matchAnalysisMasterPage = (MatchAnalysisDetailsPage) analysisEditor.getMasterPage();
    }

    /*
     * (non-Javadoc)
     *
     * @see java.beans.PropertyChangeListener#propertyChange(java.beans.PropertyChangeEvent)
     */
    public void propertyChange(PropertyChangeEvent evt) {
        // No implementation
    }

    /*
     * (non-Javadoc)
     *
     * @see org.talend.dataprofiler.core.ui.editor.analysis.AbstractAnalysisResultPage#getAnalysisHandler()
     */
    @Override
    protected AnalysisHandler getAnalysisHandler() {
        return matchAnalysisMasterPage.getAnalysisHandler();
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * org.talend.dataprofiler.core.ui.editor.analysis.AbstractAnalysisResultPage#refresh(org.talend.dataprofiler.core
     * .ui.editor.analysis.AbstractAnalysisMetadataPage)
     */
    @Override
    public void refresh(AbstractAnalysisMetadataPage masterPage) {
        if (summaryComp != null && !summaryComp.isDisposed()) {
            summaryComp.dispose();
        }

        if (resultComp != null && !resultComp.isDisposed()) {
            resultComp.dispose();
        }
        createFormContent(getManagedForm());

        duplicateRecordStatisticsSection.refreshChart();
        groupStatisticsSection.refreshChart();
    }

    @Override
    protected void createFormContent(IManagedForm managedForm) {
        super.createFormContent(managedForm);

        if (topComposite != null && !topComposite.isDisposed()) {
            resultComp = toolkit.createComposite(topComposite);
            resultComp.setLayoutData(new GridData(GridData.FILL_HORIZONTAL | GridData.VERTICAL_ALIGN_BEGINNING));
            resultComp.setLayout(new GridLayout());
            createResultSection(resultComp);
            form.reflow(true);
        }
    }

    @Override
    protected void createResultSection(Composite parent) {
        duplicateRecordStatisticsSection =
                new DuplicateRecordStatisticsSection(form, parent, Section.TWISTIE | Section.TITLE_BAR
                        | Section.EXPANDED, toolkit, getAnalysisHandler().getAnalysis());
        duplicateRecordStatisticsSection.createContent();
        duplicateRecordStatisticsSection.getSection()
                .setExpanded(
                        getExpandedStatus(duplicateRecordStatisticsSection.getSection().getText()));

        groupStatisticsSection =
                new GroupStatisticsSection(form, parent, Section.TWISTIE | Section.TITLE_BAR | Section.EXPANDED,
                        toolkit, getAnalysisHandler().getAnalysis());
        groupStatisticsSection.createContent();
        groupStatisticsSection.getSection()
                .setExpanded(getExpandedStatus(groupStatisticsSection.getSection().getText()));

        // TDQ-19618 isStoreOndisk & allowDrill down
        if (TaggedValueHelper.getValueBoolean(SQLExecutor.STORE_ON_DISK_KEY, getAnalysisHandler().getAnalysis()) &
                TaggedValueHelper.getValueBoolean(SQLExecutor.ALLOW_DRILL_DOWN, getAnalysisHandler().getAnalysis())) {
            RecordMatchingIndicator recordMatchingIndicator =
                    MatchRuleAnlaysisUtils.getRecordMatchIndicatorFromAna(getAnalysisHandler().getAnalysis());
            ChartTableFactory.addMenuAndTipForMatchAnalysis(duplicateRecordStatisticsSection.getTableViewer(),
                    recordMatchingIndicator, getAnalysisHandler().getAnalysis());
            ChartTableFactory.addMenuAndTipForMatchAnalysis(groupStatisticsSection.getTableViewer(),
                    recordMatchingIndicator, getAnalysisHandler().getAnalysis());
            // init schema if not run
            if (recordMatchingIndicator.getListRows() == null
                    || recordMatchingIndicator.getListRows().size() == 0) {
                initSchema(recordMatchingIndicator);
            }
        }
    }

    private void initSchema(RecordMatchingIndicator recordMatchingIndicator) {
        String[] completeColumnNames = AnalysisRecordGroupingUtils.getCompleteColumnNames(matchAnalysisMasterPage.getSelectedColumnsFromHandler());
        
        List<Object[]> colSchemaString = new ArrayList<Object[]>();
        colSchemaString.add(completeColumnNames); 
        recordMatchingIndicator.setListRows(colSchemaString);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.talend.dataprofiler.core.ui.editor.AbstractFormPage#setDirty(boolean)
     */
    @Override
    public void setDirty(boolean isDirty) {
        // no dirty event in this result page.

    }

    @Override
    public void dispose() {
        if (form != null) {
            this.form.dispose();
        }
        if (TaggedValueHelper.getValueBoolean(SQLExecutor.STORE_ON_DISK_KEY, getAnalysisHandler().getAnalysis()) &
                TaggedValueHelper.getValueBoolean(SQLExecutor.ALLOW_DRILL_DOWN, getAnalysisHandler().getAnalysis())) {
            MapDBManager.getInstance().closeDB(matchAnalysisMasterPage.getCurrentModelElement());
        }
        super.dispose();
    }

}
