package com.talend.microsoft.crm._2015_.utils;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.apache.cxf.Bus;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.endpoint.EndpointImpl;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.ws.policy.PolicyInterceptorProviderRegistry;
//import org.apache.cxf.ws.security.policy.SP11Constants;
//import org.apache.cxf.ws.security.policy.SP12Constants;
import org.apache.cxf.ws.security.policy.interceptors.SpnegoTokenInterceptorProvider;
import org.apache.cxf.ws.security.trust.STSClient;
import org.apache.wss4j.policy.SP11Constants;
import org.apache.wss4j.policy.SP12Constants;

import com.microsoft.schemas.xrm._2011.contracts.OrganizationService;
import com.microsoft.schemas.xrm._2011.contracts.services.IOrganizationService;

public class DynamicsCRMConnector {
	private IOrganizationService organizationService = null;
	
	public IOrganizationService getOrganizationService(){
		return this.organizationService;
	}

	public DynamicsCRMConnector(String username, String password, MsCrmWsdl msCrmWsdl) throws Exception {
		String organizationWsdl = msCrmWsdl.getOrganizationWsdl();
		String securityServiceWsdl = msCrmWsdl.getSecurityServiceWsdl();
		
		URL orgWsdlUrl = new URL(organizationWsdl);
		OrganizationService orgService = new OrganizationService(orgWsdlUrl);
		organizationService = orgService.getCustomBindingIOrganizationService();

		Client client = ClientProxy.getClient(organizationService);
		client.getInInterceptors().add(new LoggingInInterceptor());
		client.getOutInterceptors().add(new LoggingOutInterceptor());

		Bus bus = ((EndpointImpl) client.getEndpoint()).getBus();
		
		PolicyInterceptorProviderRegistry pipr = bus.getExtension(PolicyInterceptorProviderRegistry.class);
		pipr.unregister(SP11Constants.SPNEGO_CONTEXT_TOKEN);
		pipr.unregister(SP12Constants.SPNEGO_CONTEXT_TOKEN);
		pipr.register(new SpnegoTokenInterceptorProvider());
		pipr.register(new XRMAuthPolicyProvider());

		STSClient stsClient = new STSClient(bus);
		stsClient.setSoap12();
		stsClient.setWsdlLocation(securityServiceWsdl);
		stsClient.setServiceQName(QNamesCollection.SECURITY_TOKEN_SERVICE);
		stsClient.setEndpointQName(QNamesCollection.IWS_TRUST13ASYNC);
		stsClient.setSendRenewing(false);

		HashMap<String, Object> properties = new HashMap<String, Object>();
		properties.put("ws-security.username", username);
		properties.put("ws-security.callback-handler", new HardcodedPassword(password));
		stsClient.setProperties(properties);

		Map<String, Object> rc = client.getRequestContext();
		rc.put("ws-security.sts.client", stsClient);
		rc.put("ws-security.timestamp.validator", new MyTimestampValidator());
	}
}
