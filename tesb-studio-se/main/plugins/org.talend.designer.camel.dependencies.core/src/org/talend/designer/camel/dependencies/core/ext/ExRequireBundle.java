package org.talend.designer.camel.dependencies.core.ext;

import java.util.Collection;
import java.util.Collections;

import org.talend.core.model.process.INode;
import org.talend.designer.camel.dependencies.core.model.RequireBundle;
import org.talend.designer.core.model.utils.emf.talendfile.NodeType;

class ExRequireBundle extends ExManifestItem<RequireBundle> {

    private final RequireBundle requireBundle = new RequireBundle();

    ExRequireBundle(String name, boolean isOptional) {
        requireBundle.setBuiltIn(true);
        requireBundle.setName(name);
        requireBundle.setOptional(isOptional);
    }

    @Override
    protected Collection<RequireBundle> to(NodeType t) {
        return Collections.singletonList(requireBundle);
    }

    @Override
    protected Collection<RequireBundle> to(INode node) {
        return Collections.singletonList(requireBundle);
    }

}
