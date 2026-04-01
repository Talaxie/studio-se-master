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
package org.talend.designer.core.ui.editor.subjobcontainer;


public abstract class AbsCrossPlatformConnectionEditPart extends AbsCrossPlatformEditPart
        implements ICrossPlatformConnectionEditPart {

    private ICrossPlatformEditPart sourceEditPart;

    private ICrossPlatformEditPart targetEditPart;

    public AbsCrossPlatformConnectionEditPart(Object model, ICrossPlatformEditPart source, ICrossPlatformEditPart target) {
        super(model);
        this.sourceEditPart = source;
        this.targetEditPart = target;
    }

    @Override
    public void setCrossPlatformParentPart(ICrossPlatformEditPart parentPart) {
        boolean wasNull = getCrossPlatformParentPart() == null;
        boolean becomingNull = parentPart == null;
        if (becomingNull && !wasNull) {
            removeCrossPlatformNotify();
        }
        super.setCrossPlatformParentPart(parentPart);
        if (wasNull && !becomingNull) {
            addCrossPlatformNotify();
        }
    }

    @Override
    public ICrossPlatformEditPart getCrossPlatformSource() {
        return sourceEditPart;
    }

    @Override
    public void setCrossPlatformSource(ICrossPlatformEditPart editPart) {
        if (editPart == null) {
            setCrossPlatformParentPart(null);
        }
        if (sourceEditPart == editPart) {
            return;
        }
        sourceEditPart = editPart;
        if (sourceEditPart != null) {
            setCrossPlatformParentPart(sourceEditPart.getCrossPlatformRoot());
        }
        if (sourceEditPart != null && targetEditPart != null) {
            crossPlatformRefresh();
        }
    }

    @Override
    public ICrossPlatformEditPart getCrossPlatformTarget() {
        return targetEditPart;
    }

    @Override
    public void setCrossPlatformTarget(ICrossPlatformEditPart editPart) {
        if (editPart == null) {
            setCrossPlatformParentPart(null);
        }
        if (targetEditPart == editPart) {
            return;
        }
        targetEditPart = editPart;
        if (editPart != null) {
            setCrossPlatformParentPart(editPart.getCrossPlatformRoot());
        }
        if (sourceEditPart != null && targetEditPart != null) {
            crossPlatformRefresh();
        }
    }

}
