package org.talend.cwm.helper;

import org.talend.core.model.metadata.builder.connection.AbstractMetadataObject;

public class SubItemHelper {

    public static final String DELETED = "deleted";

    public static boolean isDeleted(AbstractMetadataObject abstractMetadataObject) {
        boolean deleted = false;
        if (abstractMetadataObject != null) {
            deleted = abstractMetadataObject.getProperties().containsKey(DELETED);
        }
        return deleted;
    }

    public static void setDeleted(AbstractMetadataObject abstractMetadataObject, boolean deleted) {
        if (abstractMetadataObject != null) {
            if (deleted) {
                abstractMetadataObject.getProperties().put(DELETED, Boolean.TRUE.toString());
            } else {
                abstractMetadataObject.getProperties().remove(DELETED);
            }
        }
    }
}
