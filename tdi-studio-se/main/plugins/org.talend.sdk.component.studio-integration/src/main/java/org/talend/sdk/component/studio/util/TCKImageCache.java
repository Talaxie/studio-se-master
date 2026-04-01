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
package org.talend.sdk.component.studio.util;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

import org.eclipse.swt.graphics.Image;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.ui.runtime.image.ImageProvider;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.model.repository.IRepositoryViewObject;
import org.talend.repository.model.IRepositoryNode.ENodeType;
import org.talend.repository.model.RepositoryNode;
import org.talend.sdk.component.server.front.model.ConfigTypeNode;
import org.talend.sdk.component.studio.Lookups;
import org.talend.sdk.component.studio.metadata.node.ITaCoKitRepositoryNode;
import org.talend.sdk.component.studio.metadata.node.TaCoKitLeafRepositoryNode;

public class TCKImageCache {

    private static Map<ERepositoryObjectType, Image> imageMap = new HashMap<>();

    public static Image getImage(Object element, BiFunction<Image, IRepositoryViewObject, Image> decorator) {
        if (element instanceof ITaCoKitRepositoryNode) {
            ITaCoKitRepositoryNode rnode = ((ITaCoKitRepositoryNode) element);
            Image image = rnode.getImage();
            if (image != null) {
                if (rnode.isLeafNode()) {
                    return decorator.apply(image, rnode.getObject());
                }
                return image;
            }
        }
        if (element instanceof RepositoryNode) {
            RepositoryNode repoNode = ((RepositoryNode) element);
            ENodeType nodeType = repoNode.getType();
            ERepositoryObjectType type = repoNode.getObjectType();
            if (nodeType == ENodeType.REPOSITORY_ELEMENT && type != null) {
                if (TaCoKitUtil.isTaCoKitType(type)) {
                    Image image = imageMap.get(type);
                    if (image == null) {
                        ConfigTypeNode configTypeNode = Lookups.taCoKitCache().getRepositoryObjectType2ConfigTypeNodeMap()
                                .get(type);
                        if (configTypeNode != null) {
                            try {
                                image = new TaCoKitLeafRepositoryNode(null, null, null, "dummy", configTypeNode).getImage(); //$NON-NLS-1$
                            } catch (Exception e) {
                                ExceptionHandler.process(e);
                            }
                        }
                        if (image == null) {
                            image = ImageProvider.getImage(ETaCoKitImage.TACOKIT_REPOSITORY_ICON);
                        }
                        imageMap.put(type, image);
                    }
                    return decorator.apply(image, repoNode.getObject());
                }
            }
        }
        if (element instanceof ITaCoKitRepositoryNode) {
            ITaCoKitRepositoryNode rnode = ((ITaCoKitRepositoryNode) element);
            if (rnode.isFamilyNode()) {
                return ImageProvider.getImage(ETaCoKitImage.TACOKIT_REPOSITORY_ICON);
            }
        }
        return null;
    }

}
