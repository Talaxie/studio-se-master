package org.talend.repository.model.hadoopcluster.util;

import org.talend.utils.security.StudioEncryption;

public class EncryptionUtil {
	
	public static String getValue(String value, boolean encrypt) {
        if (value != null && !value.startsWith("context.") && value.length() > 0) {
            StudioEncryption se = StudioEncryption.getStudioEncryption(StudioEncryption.EncryptionKeyName.SYSTEM);
            // Set default encrypt and decrypt methods
        	java.util.function.Function<String, String> encryptFunction = (src) -> se.encrypt(src);
        	
        	java.util.function.Function<String, String> decryptFunction = (src) -> {
                if (src != null && StudioEncryption.hasEncryptionSymbol(src)) {
                    return se.decrypt(src);
                }
                return src;
            };
            String newValue = null;
            if (encrypt) {
                newValue = encryptFunction.apply(value);
            } else {
                newValue = decryptFunction.apply(value);
            }
            if (newValue != null) { // if enable to encrypt/decrypt will return the new value.
                return newValue;
            }
        }
        return value;
    }
}
