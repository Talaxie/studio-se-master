package org.talend.repository.model.migration;

import java.util.Date;
import java.util.GregorianCalendar;

import org.talend.commons.exception.ExceptionHandler;
import org.talend.core.model.general.Project;
import org.talend.core.model.metadata.MetadataTalendType;
import org.talend.core.model.migration.AbstractProjectMigrationTask;

public class UpdateMappingFileMigrationTask extends AbstractProjectMigrationTask {

    @Override
    public ExecutionResult execute(Project project) {
        try {
            boolean updated = MetadataTalendType.restoreMappingFiles();
            return updated ? ExecutionResult.SUCCESS_NO_ALERT : ExecutionResult.NOTHING_TO_DO;
        } catch (Exception e) {
            ExceptionHandler.process(e);
            return ExecutionResult.FAILURE;
        }
    }

    @Override
    public Date getOrder() {
        GregorianCalendar gc = new GregorianCalendar(2022, 6, 29, 12, 0, 0);
        return gc.getTime();
    }

}
