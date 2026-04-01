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
import org.eclipse.gef.RequestConstants;
import org.talend.designer.core.ui.editor.ICrossPlatformCreationFactory;


public class CrossPlatformCreateRequest extends CrossPlatformRequest implements ICrossPlatformCreateRequest {

    private ICrossPlatformCreationFactory factory;

    private Point location;

    private Object newObject;

    public CrossPlatformCreateRequest() {
        super(RequestConstants.REQ_CREATE);
    }

    @Override
    public void setFactory(ICrossPlatformCreationFactory factory) {
        this.factory = factory;
    }

    @Override
    public ICrossPlatformCreationFactory getFactory() {
        return factory;
    }

    @Override
    public Point getLocation() {
        return this.location;
    }

    @Override
    public void setLocation(Point location) {
        this.location = location;
    }

    @Override
    public Object getNewObject() {
        if (newObject == null) {
            if (factory == null) {
                throw new IllegalArgumentException("CreateRequest has unspecified CreationFactory"); //$NON-NLS-1$
            }
            newObject = factory.getNewObject();
        }
        return newObject;
    }

    @Override
    public Object getNewObjectType() {
        if (factory == null) {
            throw new IllegalArgumentException("CreateRequest has unspecified CreationFactory"); //$NON-NLS-1$
        }
        return factory.getObjectType();
    }

}
