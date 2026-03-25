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
package org.talend.dq.helper;

import org.apache.log4j.Logger;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.talend.core.GlobalServiceRegister;
import org.talend.core.service.IDQJarManagementService;
import org.talend.core.service.IUpdateService;
import org.talend.cwm.management.i18n.Messages;
import org.talend.dq.CWMPlugin;

/**
 * created by yyin on 2015年1月12日 Detailled comment.
 *
 */
public abstract class AbstractOSGIServiceUtils {

    private static Logger log = Logger.getLogger(AbstractOSGIServiceUtils.class);

    private boolean hasShowDownloadWizard = false;

    /**
     * get the plugin name
     *
     * @return
     */
    public abstract String getPluginName();

    /**
     * get the related service interface name
     *
     * @return
     */
    public abstract String getServiceName();

    /**
     * check if the service installed or not
     *
     * @return
     */
    public abstract boolean isServiceInstalled();

    protected void initService(boolean isNeedDownload) {
        BundleContext context = CWMPlugin.getDefault().getBundleContext();
        if (context == null) {
            return;
        }

        ServiceReference serviceReference = context.getServiceReference(getServiceName());
        if (serviceReference != null) {
            setService(context, serviceReference);
        } else if (isNeedDownload) {
            if (!hasShowDownloadWizard) {
                // show download jar dialog
                try {
                    if (GlobalServiceRegister.getDefault().isServiceRegistered(IDQJarManagementService.class)) {
                        IDQJarManagementService service =
                                GlobalServiceRegister.getDefault().getService(IDQJarManagementService.class);
                        service.checkSqlexplorerTopchartLibraries();
                        hasShowDownloadWizard = true;
                    }
                } catch (Exception e) {
                    log.error(e);
                }
            } else {
                log.error(Messages.getString(getMissingMessageName()));
            }
        }
    }

    /**
     * getMissingMessageName.
     *
     * @return
     */
    protected abstract String getMissingMessageName();

    /**
     * getRestartMessageName.
     *
     * @return
     */
    protected abstract String getRestartMessageName();

    /**
     * DOC yyin Comment method "setService".
     *
     * @param context
     * @param serviceReference
     */
    abstract protected void setService(BundleContext context, ServiceReference serviceReference);
}
