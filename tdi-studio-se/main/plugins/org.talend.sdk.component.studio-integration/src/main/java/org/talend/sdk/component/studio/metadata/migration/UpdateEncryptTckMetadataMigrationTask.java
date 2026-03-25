// ============================================================================
//
// Copyright (C) 2006-2021 Talaxie Inc. - www.deilink.fr
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talaxie SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.sdk.component.studio.metadata.migration;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * DOC jding  class global comment. Detailled comment
 */
public class UpdateEncryptTckMetadataMigrationTask extends EncryptTckMetadataMigrationTask {

    @Override
    public Date getOrder() {
        GregorianCalendar gc = new GregorianCalendar(2021, 10, 19, 12, 0, 0);
        return gc.getTime();
    }

}
