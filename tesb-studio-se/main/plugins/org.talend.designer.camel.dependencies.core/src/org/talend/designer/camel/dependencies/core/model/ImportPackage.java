package org.talend.designer.camel.dependencies.core.model;

import org.osgi.framework.Constants;

public class ImportPackage extends ManifestItem {

    @Override
    public String getVersionAttribute() {
        return Constants.VERSION_ATTRIBUTE;
    }

    @Override
    public String getHeader() {
        return Constants.IMPORT_PACKAGE;
    }
}
