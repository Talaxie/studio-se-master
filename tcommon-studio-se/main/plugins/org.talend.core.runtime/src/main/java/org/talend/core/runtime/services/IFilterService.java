package org.talend.core.runtime.services;

import org.talend.core.GlobalServiceRegister;
import org.talend.core.IService;
import org.talend.core.model.properties.Item;

public interface IFilterService extends IService {

    public String checkFilterError(String filter);

	public boolean isFilterAccepted(Item item, String filter);

    public static IFilterService get() {
        if (GlobalServiceRegister.getDefault().isServiceRegistered(IFilterService.class)) {
            return GlobalServiceRegister.getDefault().getService(IFilterService.class);
        }
        return null;
    }

}
