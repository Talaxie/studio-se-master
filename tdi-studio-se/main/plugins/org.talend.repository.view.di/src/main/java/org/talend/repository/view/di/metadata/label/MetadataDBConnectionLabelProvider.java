// ============================================================================
//
// Copyright (C) 2006-2023 Talaxie Inc. - www.deilink.fr
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talaxie SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.repository.view.di.metadata.label;

import org.eclipse.swt.graphics.Image;
import org.talend.core.service.ITCKUIService;
import org.talend.repository.model.RepositoryNode;
import org.talend.repository.viewer.label.RepositoryViewLabelProvider;

public class MetadataDBConnectionLabelProvider extends RepositoryViewLabelProvider {

    @Override
    public Image getImage(Object element) {
        if (RepositoryNode.class.isInstance(element) && ITCKUIService.get() != null
                && ITCKUIService.get().isTCKRepoistoryNode(RepositoryNode.class.cast(element))) {
            Image image = ITCKUIService.get().getTCKImage(element, (img, repoObj) -> super.decorateImageWithStatus(img, repoObj));
            if (image != null) {
                return image;
            }
        }
        return super.getImage(element);
    }

}
