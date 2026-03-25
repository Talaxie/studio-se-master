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
package org.talend.designer.core.ui.editor.connections;

import java.util.ArrayList;
import java.util.List;

import org.talend.core.model.components.ComponentCategory;
import org.talend.core.model.process.Element;
import org.talend.core.model.process.IProcess;
import org.talend.designer.core.ui.editor.subjobcontainer.ICrossPlatformEditPart;

public interface ICrossPlatformConnectionPart extends ICrossPlatformEditPart {

    ICrossPlatformEditPart getCrossPlatformSource();

    ICrossPlatformEditPart getCrossPlatformTarget();

    @Override
    default public List getCrossPlatformModelChildren() {
        List<Element> elements;
        elements = new ArrayList<Element>();
        elements.add(((Connection) getCrossPlatformModel()).getConnectionLabel());
        elements.add(((Connection) getCrossPlatformModel()).getPerformance());

        if (((Connection) getCrossPlatformModel()).getResuming() != null) {
            elements.add(((Connection) getCrossPlatformModel()).getResuming());
        }

        boolean monitorSupport = true;
        if (getCrossPlatformParentPart() != null && getCrossPlatformRoot() != null) {
            ICrossPlatformEditPart contents = getCrossPlatformRoot().getCrossPlatformContents();
            if (contents.getCrossPlatformModel() instanceof IProcess) {
                IProcess currentProcess = (IProcess) contents.getCrossPlatformModel();
                if (ComponentCategory.CATEGORY_4_MAPREDUCE.getName().endsWith(currentProcess.getComponentsType())) {
                    monitorSupport = false;
                }
            }
        } else {
            IProcess currentProcess = ((Connection) getCrossPlatformModel()).getSource().getProcess();
            if (ComponentCategory.CATEGORY_4_MAPREDUCE.getName().endsWith(currentProcess.getComponentsType())) {
                monitorSupport = false;
            }
        }

        if (monitorSupport) {
            if (((Connection) getCrossPlatformModel()).getConnectionTrace() != null) {
                elements.add(((Connection) getCrossPlatformModel()).getConnectionTrace());
            }

            // Add monitor label
            if (((Connection) getCrossPlatformModel()).isMonitorConnection()) {
                elements.add(((Connection) getCrossPlatformModel()).getMonitorLabel());
            }
        }

        return elements;
    }

}
