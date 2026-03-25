package org.talend.components.cyberark;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import javapasswordsdk.PasswordSDK;
import javapasswordsdk.exceptions.PSDKException;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;

class CyberarkWrapperUtilsTest {

    private static final MockedStatic<PasswordSDK> mock = Mockito.mockStatic(PasswordSDK.class);

    @Test
    void testSuccessOnNoException() {
        mock.reset();
        Integer testPort = 1111;
        String result = CyberarkWrapperUtils.checkConnection(testPort);
        mock.verify(() -> PasswordSDK.getPassword(any()), times(1));
        Assertions.assertNull(result); //no error code returned
    }

    @Test
    void testErrorWithSpecificErrorCode() {
        Integer testPort = 1111;
        String errorCode = "Some error";
        mock.when(() -> PasswordSDK.getPassword(any())).thenThrow(new PSDKException(errorCode, 1, 2));

        String result = CyberarkWrapperUtils.checkConnection(testPort);
        Assertions.assertEquals(result, errorCode);
    }

    @Test
    void testSuccessWithNotFilledPasswordRequestError() {
        String errorCode = "APPPR010E The request misses an application descriptor (CredFilePath or AppID)";

        mock.when(() -> PasswordSDK.getPassword(any())).thenThrow(new PSDKException(errorCode, 1, 2));

        String result = CyberarkWrapperUtils.checkConnection(null);
        Assertions.assertNull(result);
    }

    @Test
    void testSuccessWithNullPort() {
        mock.reset();
        String result = CyberarkWrapperUtils.checkConnection(null);
        mock.verify(() -> PasswordSDK.getPassword(any()), times(1));
        Assertions.assertNull(result); //no error code returned
    }

}