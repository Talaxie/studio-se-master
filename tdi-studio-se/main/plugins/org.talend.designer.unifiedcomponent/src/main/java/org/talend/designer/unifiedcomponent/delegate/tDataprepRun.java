// ============================================================================
//
// Copyright (C) 2006-2021 Talaxie Inc. - www.deilink.fr
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talaxie SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.designer.unifiedcomponent.delegate;

import org.talend.designer.unifiedcomponent.resources.ComponentImage;

public class tDataprepRun extends AbstractUnifiedComponent {

    /*
     * (non-Javadoc)
     *
     * @see org.talend.designer.unifiedcomponent.comp.service.IUnifiedComponent#getName()
     */
    @Override
    public String getComponentName() {
        return "tDataprepRun";
    }

    /*
     * (non-Javadoc)
     *
     * @see org.talend.designer.unifiedcomponent.comp.service.IUnifiedComponent#getFamily()
     */
    @Override
    public String getFamily() {
        return "";
    }

    /*
     * (non-Javadoc)
     *
     * @see org.talend.designer.unifiedcomponent.comp.service.IUnifiedComponent#getImage()
     */
    @Override
    public ComponentImage getImage() {
        return ComponentImage.tDataprepRun;
    }

}
