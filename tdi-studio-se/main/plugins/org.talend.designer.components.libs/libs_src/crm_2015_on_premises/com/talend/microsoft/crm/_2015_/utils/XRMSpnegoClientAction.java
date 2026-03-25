package com.talend.microsoft.crm._2015_.utils;

//import org.apache.ws.security.spnego.DefaultSpnegoClientAction;
//import org.apache.ws.security.spnego.SpnegoClientAction;
import org.apache.wss4j.common.spnego.DefaultSpnegoClientAction;
import org.apache.wss4j.common.spnego.SpnegoClientAction;
import org.ietf.jgss.GSSContext;
import org.ietf.jgss.GSSException;
import org.ietf.jgss.GSSManager;
import org.ietf.jgss.GSSName;
import org.ietf.jgss.Oid;

public class XRMSpnegoClientAction implements SpnegoClientAction {
	private org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory
			.getLog(DefaultSpnegoClientAction.class);
	protected String serviceName;
	protected GSSContext secContext;
	protected boolean mutualAuth;

	/**
	 * Whether to enable mutual authentication or not.
	 */
	public void setMutualAuth(boolean mutualAuthentication) {
		mutualAuth = mutualAuthentication;
	}

	/**
	 * The Service Name
	 */
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	/**
	 * Obtain a service ticket
	 */
	public byte[] run() {
		try {
			GSSManager gssManager = GSSManager.getInstance();
			Oid oid = new Oid("1.3.6.1.5.5.2");
			GSSName gssService = gssManager.createName(serviceName,
					GSSName.NT_USER_NAME);
			secContext = gssManager.createContext(gssService, oid, null,
					GSSContext.DEFAULT_LIFETIME);
			secContext.requestMutualAuth(mutualAuth);
			secContext.requestCredDeleg(Boolean.FALSE);
			byte[] token = new byte[0];
			return secContext.initSecContext(token, 0, token.length);
		} catch (GSSException e) {
			if (log.isDebugEnabled()) {
				log.debug("Error in obtaining a Kerberos token", e);
			}
		}
		return null;
	}

	@Override
	public GSSContext getContext() {
		return secContext;
	}

	@Override
	public void setUserNameServiceForm(boolean arg0) {
		// TODO Auto-generated method stub
		
	}
}
