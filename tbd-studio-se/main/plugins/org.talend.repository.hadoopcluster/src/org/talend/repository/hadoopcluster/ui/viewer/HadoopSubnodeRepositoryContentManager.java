package org.talend.repository.hadoopcluster.ui.viewer;

import java.util.ArrayList;
import java.util.List;

import org.talend.core.model.repository.IRepositoryContentHandler;
import org.talend.core.model.repository.RepositoryContentManager;
import org.talend.repository.hadoopcluster.ui.viewer.handler.IHadoopSubnodeRepositoryContentHandler;

/**
 * created by ycbai on 2013-1-28 Detailled comment
 * 
 */
public class HadoopSubnodeRepositoryContentManager {

    private static List<IHadoopSubnodeRepositoryContentHandler> handlers = null;

    public static List<IHadoopSubnodeRepositoryContentHandler> getHandlers() {
        if (handlers == null) {
            handlers = new ArrayList<IHadoopSubnodeRepositoryContentHandler>();
            for (IRepositoryContentHandler handler : RepositoryContentManager.getHandlers()) {
                if (handler instanceof IHadoopSubnodeRepositoryContentHandler) {
                    handlers.add((IHadoopSubnodeRepositoryContentHandler) handler);
                }
            }
        }

        return handlers;
    }
}