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


public interface ICrossPlatformEditPartListener {

    void childAdded(ICrossPlatformEditPart child, int index);

    void removingChild(ICrossPlatformEditPart child, int index);

    void partActivated(ICrossPlatformEditPart editpart);

    void partDeactivated(ICrossPlatformEditPart editpart);

    void selectedStateChanged(ICrossPlatformEditPart editpart);

    public class Stub implements ICrossPlatformEditPartListener {

        @Override
        public void childAdded(ICrossPlatformEditPart child, int index) {
        }

        @Override
        public void removingChild(ICrossPlatformEditPart child, int index) {
        }

        @Override
        public void partActivated(ICrossPlatformEditPart editpart) {
        }

        @Override
        public void partDeactivated(ICrossPlatformEditPart editpart) {
        }

        @Override
        public void selectedStateChanged(ICrossPlatformEditPart editpart) {
        }

    }

}
