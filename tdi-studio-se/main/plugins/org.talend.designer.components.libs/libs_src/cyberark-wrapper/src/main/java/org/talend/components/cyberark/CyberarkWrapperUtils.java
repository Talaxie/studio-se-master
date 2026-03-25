package org.talend.components.cyberark;

import javapasswordsdk.PSDKPasswordRequest;
import javapasswordsdk.PasswordSDK;
import javapasswordsdk.exceptions.PSDKException;

public class CyberarkWrapperUtils {

    /**
     *
     * @param port the port credential provider service is listening to
     * @return error code in case can't connect to the credential provider or
     * null when the sdk error is "APPPR010E The request misses an application descriptor"
     */
    public static String checkConnection(Integer port) {
        try {
            PSDKPasswordRequest passwordRequest = new PSDKPasswordRequest();
            if (port != null && port > 0) {
                passwordRequest.setConnectionPort(String.valueOf(port));
            }
            PasswordSDK.getPassword(passwordRequest);
        } catch (PSDKException e) { //exception should always be thrown
            String errorCode = e.getMessage();
            if (errorCode.contains("APPPR010E")) {
                return null;
            } else {
                return errorCode;
            }
        }

        return null; //should not be here
    }
}
