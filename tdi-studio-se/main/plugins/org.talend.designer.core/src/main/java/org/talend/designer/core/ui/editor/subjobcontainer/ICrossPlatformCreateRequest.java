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

import org.eclipse.draw2d.geometry.Point;
import org.talend.designer.core.ui.editor.ICrossPlatformCreationFactory;

public interface ICrossPlatformCreateRequest extends ICrossPlatformRequest {

    ICrossPlatformCreationFactory getFactory();

    void setFactory(ICrossPlatformCreationFactory factory);

    Point getLocation();

    void setLocation(Point location);

    Object getNewObject();

    Object getNewObjectType();

}