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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.requests.CreateConnectionRequest;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gef.requests.CreationFactory;
import org.eclipse.gef.requests.GroupRequest;
import org.eclipse.gef.requests.LocationRequest;
import org.eclipse.gef.requests.ReconnectRequest;
import org.talend.designer.core.ui.editor.PartFactory;

public class SwtRequestProxyFactory {

    private PartFactory factory;

    private static SwtRequestProxyFactory inst;

    public static SwtRequestProxyFactory get() {
        if (inst == null) {
            inst = new SwtRequestProxyFactory();
        }
        return inst;
    }

    private SwtRequestProxyFactory() {
        factory = new PartFactory();
    }

    public Request convert(ICrossPlatformRequest request) {
        if (request instanceof ICrossPlatformReconnectRequest) {
            ReconnectRequest rr = new ReconnectRequest(request.getType());
            ICrossPlatformReconnectRequest cpr = (ICrossPlatformReconnectRequest) request;
            rr.setConnectionEditPart((ConnectionEditPart) convert(cpr.getConnectionEditPart()));
            rr.setExtendedData(cpr.getExtendedData());
            rr.setLocation(cpr.getLocation());
            rr.setTargetEditPart(convert(cpr.getTarget()));
            return rr;
        } else if (request instanceof ICrossPlatformLocationRequest) {
            LocationRequest lr = new LocationRequest(request.getType());
            ICrossPlatformLocationRequest cpr = (ICrossPlatformLocationRequest) request;
            lr.setExtendedData(cpr.getExtendedData());
            lr.setLocation(cpr.getLocation());
            return lr;
        } else if (request instanceof ICrossPlatformGroupRequest) {
            GroupRequest gr = new GroupRequest(request.getType());
            ICrossPlatformGroupRequest cpr = (ICrossPlatformGroupRequest) request;
            List editParts = cpr.getEditParts();
            if (editParts != null) {
                List newEditParts = new ArrayList<>(editParts.size());
                for (Object editPart : editParts) {
                    if (editPart instanceof ICrossPlatformEditPart) {
                        newEditParts.add(convert((ICrossPlatformEditPart) editPart));
                    } else {
                        newEditParts.add(editPart);
                    }
                }
                gr.setEditParts(newEditParts);
            }
            gr.setExtendedData(cpr.getExtendedData());
            return gr;
        } else if (request instanceof ICrossPlatformCreateConnectionRequest) {
            CreateConnectionRequest ccr = new CreateConnectionRequest();
            ICrossPlatformCreateConnectionRequest cpr = (ICrossPlatformCreateConnectionRequest) request;
            ccr.setExtendedData(cpr.getExtendedData());
            ccr.setFactory((CreationFactory) cpr.getFactory());
            ccr.setLocation(cpr.getLocation());
            ccr.setSourceEditPart(convert(cpr.getSourceEditPart()));
            ccr.setStartCommand(cpr.getStartCommand());
            ccr.setTargetEditPart(convert(cpr.getTargetEditPart()));
            ccr.setType(cpr.getType());
            return ccr;
        } else if (request instanceof ICrossPlatformCreateRequest) {
            CreateRequest cr = new CreateRequest();
            ICrossPlatformCreateRequest ccr = (ICrossPlatformCreateRequest) request;
            cr.setExtendedData(ccr.getExtendedData());
            cr.setFactory((CreationFactory) ccr.getFactory());
            cr.setLocation(ccr.getLocation());
            cr.setType(ccr.getType());
            return cr;
        } else if (ICrossPlatformRequest.class.equals(request.getClass())) {
            Request r = new Request();
            r.setExtendedData(request.getExtendedData());
            r.setType(request.getType());
            return r;
        } else {
            throw new UnsupportedOperationException();
        }
    }

    private EditPart convert(ICrossPlatformEditPart editPart) {
        if (editPart instanceof EditPart) {
            return (EditPart) editPart;
        } else {
            return factory.createEditPart(null, editPart.getCrossPlatformModel());
        }
    }

}
