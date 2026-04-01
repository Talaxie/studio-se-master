// ============================================================================
//
// Copyright (C) 2006-2021 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.core.ui.branding;

import java.io.IOException;
import java.net.URL;

import org.eclipse.jface.resource.ImageDescriptor;
import org.talend.core.GlobalServiceRegister;
import org.talend.core.IService;
import org.w3c.dom.Element;

/**
 * DOC smallet class global comment. Detailled comment <br/>
 *
 */
public interface IBrandingService extends IService {

    public String getFullProductName();

    public String getProductName();

    public String getOptionName();

    public String getShortProductName();

    public String getAcronym();

    public String getCorporationName();

    public ImageDescriptor getLoginVImage();

    public ImageDescriptor getLoginHImage();

    public URL getLicenseFile() throws IOException;

    public IBrandingConfiguration getBrandingConfiguration();

    public boolean isPoweredbyTalend();

    public boolean isPoweredOnlyCamel();

    /**
     * TP_All license also has the flag 'isCloud'
     * @return
     */
    public default boolean isCloudLicense() {
        return false;
    }

    public String getStartingBrowserId();

    public URL getStartingHtmlURL();

    public void createStartingContent(String id, Element parent);

    public String getUserManuals();

    public String getRoutineLicenseHeader(String version);

    public static IBrandingService get() {
        GlobalServiceRegister gsr = GlobalServiceRegister.getDefault();
        if (gsr.isServiceRegistered(IBrandingService.class)) {
            return gsr.getService(IBrandingService.class);
        }
        return null;
    }

}
