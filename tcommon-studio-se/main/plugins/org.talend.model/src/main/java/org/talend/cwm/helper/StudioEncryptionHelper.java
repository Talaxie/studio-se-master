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
package org.talend.cwm.helper;

import org.talend.utils.security.StudioEncryption;
import org.talend.utils.security.StudioKeySource;

public class StudioEncryptionHelper {

    public static Boolean isLatestEncryptionKey(String encryptedValue) {
        if (encryptedValue != null && StudioEncryption.hasEncryptionSymbol(encryptedValue)) {
            if (encryptedValue.startsWith(StudioEncryption.PREFIX_PASSWORD)) {
                String[] srcData = encryptedValue.split("\\:");
                StudioKeySource ks = StudioEncryption.getKeySource(srcData[1], false);
                if (ks.getKeyName().isSystemKey() && StudioEncryption.getKeySource(StudioEncryption.EncryptionKeyName.SYSTEM.toString(), true)
                        .getKeyName().getKeyName().equals(ks.getKeyName().getKeyName())) {
                    return true;
                }
                if (ks.getKeyName().isRoutineKey() && StudioEncryption.getKeySource(StudioEncryption.EncryptionKeyName.ROUTINE.toString(), true)
                        .getKeyName().getKeyName().equals(ks.getKeyName().getKeyName())) {
                    return true;
                }
            }
        }
        return false;
    }
}
