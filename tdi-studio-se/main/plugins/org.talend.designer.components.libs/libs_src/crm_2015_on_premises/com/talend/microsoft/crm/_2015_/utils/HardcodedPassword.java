package com.talend.microsoft.crm._2015_.utils;

import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.wss4j.common.ext.WSPasswordCallback;

//import org.apache.ws.security.WSPasswordCallback;

public class HardcodedPassword implements CallbackHandler {
	private String password;

	public HardcodedPassword(String password) {
		this.password = password;
	}

	@Override
	public void handle(Callback[] callbacks) throws IOException,
			UnsupportedCallbackException {

		for (Callback c : callbacks) {
			if (c instanceof WSPasswordCallback) {
				WSPasswordCallback passwordCallback = (WSPasswordCallback) c;
				passwordCallback.setPassword(password);
				continue;
			}
			throw new UnsupportedCallbackException(c);
		}
	}
}
