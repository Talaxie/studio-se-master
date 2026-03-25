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
import org.eclipse.gef.requests.LocationRequest;


public class CrossPlatformLocationRequestProxy extends CrossPlatformRequestProxy implements ICrossPlatformLocationRequest {

    public CrossPlatformLocationRequestProxy(LocationRequest request) {
        super(request);
    }

    @Override
    public LocationRequest getOrigin() {
        return (LocationRequest) super.getOrigin();
    }

    @Override
    public Point getLocation() {
        return getOrigin().getLocation();
    }

    @Override
    public void setLocation(Point p) {
        getOrigin().setLocation(p);
    }

}
