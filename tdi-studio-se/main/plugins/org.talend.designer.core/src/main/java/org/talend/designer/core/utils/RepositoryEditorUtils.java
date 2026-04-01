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
package org.talend.designer.core.utils;

import org.talend.commons.exception.PersistenceException;
import org.talend.core.GlobalServiceRegister;
import org.talend.core.model.properties.Item;
import org.talend.core.model.properties.JobletProcessItem;
import org.talend.core.model.properties.ProcessItem;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.repository.ui.editor.RepositoryEditorInput;
import org.talend.core.ui.IJobletProviderService;
import org.talend.core.ui.ISparkJobletProviderService;
import org.talend.core.ui.ISparkStreamingJobletProviderService;
import org.talend.designer.core.ICreateMRProcessService;
import org.talend.designer.core.ICreateStormProcessService;
import org.talend.designer.core.ui.MultiPageTalendEditor;
import org.talend.designer.core.ui.editor.ProcessEditorInput;

/**
 * created by hcyi on May 10, 2022
 * Detailled comment
 *
 */
public class RepositoryEditorUtils {

    public static RepositoryEditorInput getProcessItemEditorInput(final Item item, final boolean readonly)
            throws PersistenceException {
        RepositoryEditorInput fileEditorInput = null;
        ERepositoryObjectType itemType = ERepositoryObjectType.getItemType(item);
        if (item instanceof ProcessItem) {
            ProcessItem processItem = (ProcessItem) item;
            if (ERepositoryObjectType.PROCESS_STORM == itemType) {
                if (GlobalServiceRegister.getDefault().isServiceRegistered(ICreateStormProcessService.class)) {
                    ICreateStormProcessService stromService = GlobalServiceRegister.getDefault()
                            .getService(ICreateStormProcessService.class);
                    fileEditorInput = stromService.getStromProcessEditorInput(processItem, true, false, readonly);
                }
            } else if (ERepositoryObjectType.PROCESS_MR == itemType) {
                if (GlobalServiceRegister.getDefault().isServiceRegistered(ICreateMRProcessService.class)) {
                    ICreateMRProcessService mRService = GlobalServiceRegister.getDefault()
                            .getService(ICreateMRProcessService.class);
                    fileEditorInput = mRService.getMRProcessEditorInput(processItem, true, false, readonly);
                }
            } else {
                fileEditorInput = new ProcessEditorInput(processItem, true, false, readonly);
            }
        } else if (item instanceof JobletProcessItem) {
            JobletProcessItem jobletItem = (JobletProcessItem) item;
            if (ERepositoryObjectType.SPARK_JOBLET == itemType) {
                if (GlobalServiceRegister.getDefault().isServiceRegistered(ISparkJobletProviderService.class)) {
                    ISparkJobletProviderService sparkJobletService = GlobalServiceRegister.getDefault()
                            .getService(ISparkJobletProviderService.class);
                    if (sparkJobletService != null && sparkJobletService.isSparkJobletItem(jobletItem)) {
                        fileEditorInput = (RepositoryEditorInput) sparkJobletService.createJobletEditor(jobletItem, true, false,
                                readonly, false);
                    }
                }
            } else if (ERepositoryObjectType.SPARK_STREAMING_JOBLET == itemType) {
                if (GlobalServiceRegister.getDefault().isServiceRegistered(ISparkStreamingJobletProviderService.class)) {
                    ISparkStreamingJobletProviderService sparkJobletService = GlobalServiceRegister.getDefault()
                            .getService(ISparkStreamingJobletProviderService.class);
                    if (sparkJobletService != null && sparkJobletService.isSparkStreamingJobletItem(jobletItem)) {
                        fileEditorInput = (RepositoryEditorInput) sparkJobletService.createJobletEditor(jobletItem, true, false,
                                readonly, false);
                    }
                }
            } else {
                if (GlobalServiceRegister.getDefault().isServiceRegistered(IJobletProviderService.class)) {
                    IJobletProviderService jobletService = GlobalServiceRegister.getDefault()
                            .getService(IJobletProviderService.class);
                    if (jobletService != null) {
                        fileEditorInput = (RepositoryEditorInput) jobletService.getJobletProcessEditorInput(jobletItem, true,
                                false, readonly, false);
                    }
                }
            }
        }
        return fileEditorInput;
    }

    public static String getEditorId(ERepositoryObjectType itemType) throws PersistenceException {
        String editorId = null;
        if (ERepositoryObjectType.PROCESS_STORM == itemType) {
            editorId = "org.talend.repository.storm.editor";//$NON-NLS-1$
        } else if (ERepositoryObjectType.PROCESS_MR == itemType) {
            editorId = "org.talend.designer.mapreduce.editor"; //$NON-NLS-1$
        } else if (ERepositoryObjectType.SPARK_JOBLET == itemType) {
            editorId = "org.talend.designer.sparkjoblet.ui.editors.SparkJobletMultiPageTalendEditor"; //$NON-NLS-1$
        } else if (ERepositoryObjectType.SPARK_STREAMING_JOBLET == itemType) {
            editorId = "org.talend.designer.sparkstreamingjoblet.ui.editors.SparkStreamingJobletMultiPageTalendEditor"; //$NON-NLS-1$
        } else if (ERepositoryObjectType.JOBLET == itemType) {
            editorId = "org.talend.designer.joblet.multieditor"; //$NON-NLS-1$
        } else {
            editorId = MultiPageTalendEditor.ID;
        }
        return editorId;
    }

}
