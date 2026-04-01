package org.talend.designer.camel.dependencies.core.model;

import org.osgi.framework.Constants;

public class RequireBundle extends ManifestItem {

    @Override
    public String getVersionAttribute() {
        return Constants.BUNDLE_VERSION_ATTRIBUTE;
    }

    @Override
    public String getHeader() {
        return Constants.REQUIRE_BUNDLE;
    }
}
