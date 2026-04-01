package com.talend.microsoft.crm._2015_.utils;

import org.apache.wss4j.common.ext.WSSecurityException;
import org.apache.wss4j.dom.handler.RequestData;
import org.apache.wss4j.dom.validate.Credential;
import org.apache.wss4j.dom.validate.TimestampValidator;

//import org.apache.ws.security.WSSecurityException;
//import org.apache.ws.security.handler.RequestData;
//import org.apache.ws.security.validate.Credential;
//import org.apache.ws.security.validate.TimestampValidator;

public class MyTimestampValidator extends TimestampValidator {

	/**
	 * Validate the credential argument. It must contain a non-null Timestamp.
	 * 
	 * @param credential
	 *            the Credential to be validated
	 * @param data
	 *            the RequestData associated with the request
	 * @throws WSSecurityException
	 *             on a failed validation
	 */
	public Credential validate(Credential credential, RequestData data)
			throws WSSecurityException {
		if (credential == null || credential.getTimestamp() == null) {
//			throw new WSSecurityException(WSSecurityException.FAILURE,
			throw new WSSecurityException(WSSecurityException.ErrorCode.FAILURE,
					"noCredential");
		}

		return credential;
	}
}
