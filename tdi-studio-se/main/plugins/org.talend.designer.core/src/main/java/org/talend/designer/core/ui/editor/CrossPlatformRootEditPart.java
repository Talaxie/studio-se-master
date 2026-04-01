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
package org.talend.designer.core.ui.editor;

import java.util.HashMap;
import java.util.Map;

import org.talend.designer.core.ui.editor.subjobcontainer.AbsCrossPlatformEditPart;
import org.talend.designer.core.ui.editor.subjobcontainer.ICrossPlatformEditPart;
import org.talend.designer.core.ui.editor.subjobcontainer.ICrossPlatformRootEditPart;


public class CrossPlatformRootEditPart extends AbsCrossPlatformEditPart implements ICrossPlatformRootEditPart {

    private ICrossPlatformEditPart contents;

    private ICrossPlatformPartFactory partFactory;

    private Map editPartRegistry = new HashMap<>();

    public CrossPlatformRootEditPart(Object model) {
        super(model);
    }

    @Override
    public ICrossPlatformEditPart getCrossPlatformContents() {
        return contents;
    }

    public void setCrossPlatformContents(ICrossPlatformEditPart editpart) {
        if (contents == editpart) {
            return;
        }
        if (contents != null) {
            removeChild(contents);
        }
        contents = editpart;
        if (contents != null) {
            addChild(contents, 0);
        }
    }

    @Override
    public ICrossPlatformPartFactory getCrossPlatformPartFactory() {
        if (partFactory == null) {
            partFactory = new CrossPlatformPartFactory();
        }
        return partFactory;
    }

    @Override
    public Map getCrossPlatformEditPartRegistry() {
        return editPartRegistry;
    }

}
