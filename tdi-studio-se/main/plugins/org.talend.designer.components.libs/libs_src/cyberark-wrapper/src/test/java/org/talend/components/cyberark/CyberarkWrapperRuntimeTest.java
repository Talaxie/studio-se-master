package org.talend.components.cyberark;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockedConstruction;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import javapasswordsdk.PSDKPassword;
import javapasswordsdk.PSDKPasswordRequest;
import javapasswordsdk.PasswordSDK;
import javapasswordsdk.exceptions.PSDKException;

import static org.mockito.ArgumentMatchers.any;

class CyberarkWrapperRuntimeTest {

    private static final String EXPECTED_PASSWORD = "SomePassword";

    private final MockedStatic<PasswordSDK> mock = Mockito.mockStatic(PasswordSDK.class);
    private final PSDKPassword mockPassword = Mockito.mock(PSDKPassword.class);

    @BeforeEach
    void setUp() {
        Mockito.when(mockPassword.getSecureContent()).thenReturn(EXPECTED_PASSWORD.toCharArray());
        mock.when(() -> PasswordSDK.getPassword(any())).thenReturn(mockPassword);
    }

    @Test
    void testExecuteGetPasswordWithFullProperties() throws PSDKException {
        Integer configurationPort = 1000;
        String configurationAppId = "appId";
        String configurationSafe = "someSafe";
        String configurationFolder = "someFolder";
        String configurationObjectName = "myObject";
        String configurationReason = "Some reason to retrieve password";

        MockedConstruction<PSDKPasswordRequest> mockedRequest = Mockito.mockConstruction(PSDKPasswordRequest.class);
        CyberarkWrapperRuntime runtime = new CyberarkWrapperRuntime(configurationPort,//
                configurationAppId, configurationSafe, configurationFolder, //
                configurationObjectName, configurationReason);

        String result = runtime.getPassword();

        Mockito.verify(mockedRequest.constructed().get(0)).setConnectionPort(String.valueOf(configurationPort));
        Mockito.verify(mockedRequest.constructed().get(0)).setAppID(configurationAppId);
        Mockito.verify(mockedRequest.constructed().get(0)).setSafe(configurationSafe);
        Mockito.verify(mockedRequest.constructed().get(0)).setFolder(configurationFolder);
        Mockito.verify(mockedRequest.constructed().get(0)).setObject(configurationObjectName);
        Mockito.verify(mockedRequest.constructed().get(0)).setReason(configurationReason);

        Assertions.assertEquals(EXPECTED_PASSWORD, result);
    }
}