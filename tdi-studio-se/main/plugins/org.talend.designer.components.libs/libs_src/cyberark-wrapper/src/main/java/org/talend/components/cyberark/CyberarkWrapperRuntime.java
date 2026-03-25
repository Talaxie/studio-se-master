package org.talend.components.cyberark;

import javapasswordsdk.PSDKPasswordRequest;
import javapasswordsdk.PasswordSDK;
import javapasswordsdk.exceptions.PSDKException;

public class CyberarkWrapperRuntime {

    private PSDKPasswordRequest passRequest;

    private final String credProviderServicePort;

    private final String appId;

    private final String safe;

    private final String folder;

    private final String objectName;

    private final String reason;

    public CyberarkWrapperRuntime(Integer credProviderServicePort, String appId, String safe,
                                  String folder, String objectName, String reason) {
        this.credProviderServicePort = credProviderServicePort != null && credProviderServicePort > 0 ?
                String.valueOf(credProviderServicePort) : "";
        this.appId = appId;
        this.safe = safe;
        this.folder = folder;
        this.objectName = objectName;
        this.reason = reason;
    }


    public String getPassword() {
        try {
            passRequest = new PSDKPasswordRequest();

            if (!credProviderServicePort.isEmpty()) {
                passRequest.setConnectionPort(credProviderServicePort);
            }

            passRequest.setAppID(appId);

            passRequest.setSafe(safe);

            if (!folder.isEmpty() && !folder.equalsIgnoreCase("root")) {
                passRequest.setFolder(folder);
            }

            passRequest.setObject(objectName);

            if (!reason.isEmpty()) {
                passRequest.setReason(reason);
            }
            return String.valueOf(PasswordSDK.getPassword(passRequest).getSecureContent());
        } catch (PSDKException e) {
            throw new RuntimeException(e);
        }
    }
}
