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

import org.apache.commons.lang.StringUtils;
import org.talend.commons.report.ItemReportRecorder;
import org.talend.core.model.properties.Item;

/**
 * DOC jding  class global comment. Detailled comment
 */
public class AnalysisReportRecorder extends ItemReportRecorder {

    private IItemAnalysisTask task;

    private SeverityOption severity;

    public AnalysisReportRecorder(IItemAnalysisTask task, Item item, SeverityOption severity, String detailMessage) {
        super();
        this.task = task;
        this.item = item;
        this.severity = severity;
        this.detailMessage = detailMessage;
    }

    public AnalysisReportRecorder(IItemAnalysisTask task, SeverityOption severity, String detailMessage) {
        super();
        this.task = task;
        this.severity = severity;
        this.detailMessage = detailMessage;
    }

    public String getTaskName() {
        return task.getName();
    }

    public String getTaskDescription() {
        String description = "";
        if (StringUtils.isNotBlank(task.getDescription())) {
            description = task.getDescription();
        }
        return description;
    }

    public String getLinkToDetail() {
        return task.getDetailLink();
    }

    public IItemAnalysisTask getTask() {
        return task;
    }

    public void setTask(IItemAnalysisTask task) {
        this.task = task;
    }

    public SeverityOption getSeverity() {
        return severity;
    }

    public void setSeverity(SeverityOption severity) {
        this.severity = severity;
    }

    public enum SeverityOption {

        CRITICAL("Critical", 1),
        MAJOR("Major", 2),
        WARNING("Warning", 3);

        private String label;

        private int priority;

        private SeverityOption(String label, int priority) {
            this.label = label;
            this.priority = priority;
        }

        public String getLabel() {
            return label;
        }

        public int getPriority() {
            return priority;
        }
    }
}
