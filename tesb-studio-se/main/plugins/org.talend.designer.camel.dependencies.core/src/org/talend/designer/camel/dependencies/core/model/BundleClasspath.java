package org.talend.designer.camel.dependencies.core.model;

import org.osgi.framework.Constants;

public class BundleClasspath extends ManifestItem {

    @Override
    public String getVersionAttribute() {
        return null;
    }

    @Override
    public String getHeader() {
        return Constants.BUNDLE_CLASSPATH;
    }

    @Override
    public String toManifestString() {
        if (isOptional()) {
            return null;
        }
        return super.toManifestString();
    }
}
