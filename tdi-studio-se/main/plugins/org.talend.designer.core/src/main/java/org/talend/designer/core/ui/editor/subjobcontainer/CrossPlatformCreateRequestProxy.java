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
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gef.requests.CreationFactory;
import org.talend.designer.core.ui.editor.ICrossPlatformCreationFactory;


public class CrossPlatformCreateRequestProxy extends CrossPlatformRequestProxy implements ICrossPlatformCreateRequest {

    public CrossPlatformCreateRequestProxy(CreateRequest request) {
        super(request);
    }

    @Override
    public CreateRequest getOrigin() {
        return (CreateRequest) super.getOrigin();
    }

    @Override
    public void setFactory(ICrossPlatformCreationFactory factory) {
        getOrigin().setFactory((CreationFactory) factory);
    }

    @Override
    public ICrossPlatformCreationFactory getFactory() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Point getLocation() {
        return getOrigin().getLocation();
    }

    @Override
    public void setLocation(Point location) {
        getOrigin().setLocation(location);
    }

    @Override
    public Object getNewObject() {
        return getOrigin().getNewObject();
    }

    @Override
    public Object getNewObjectType() {
        return getOrigin().getNewObjectType();
    }

}
