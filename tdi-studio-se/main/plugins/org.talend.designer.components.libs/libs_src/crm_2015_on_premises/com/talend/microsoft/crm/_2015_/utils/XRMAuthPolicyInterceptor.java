package com.talend.microsoft.crm._2015_.utils;

import java.util.Collection;

import javax.xml.namespace.QName;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.binding.soap.interceptor.AbstractSoapInterceptor;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.Phase;
import org.apache.cxf.ws.policy.AssertionInfo;
import org.apache.cxf.ws.policy.AssertionInfoMap;
import org.apache.cxf.ws.security.wss4j.PolicyBasedWSS4JInInterceptor;
import org.apache.cxf.ws.security.wss4j.PolicyBasedWSS4JOutInterceptor;

public class XRMAuthPolicyInterceptor extends AbstractSoapInterceptor {
	public XRMAuthPolicyInterceptor() {
		super(Phase.PRE_PROTOCOL);
		addAfter(PolicyBasedWSS4JInInterceptor.class.getName());
		addAfter(PolicyBasedWSS4JOutInterceptor.class.getName());
	}

	public void handleMessage(SoapMessage message) throws Fault {
		AssertionInfoMap aim = message.get(AssertionInfoMap.class);
		if (null == aim) {
			return;
		}
		QName qname = new QName(
				"http://schemas.microsoft.com/xrm/2011/Contracts/Services",
				"AuthenticationPolicy", "ms-xrm");
		Collection<AssertionInfo> ais = aim.get(qname);
		if (null == ais || ais.size() == 0) {
			return;
		}

		for (AssertionInfo ai : ais) {
			ai.setAsserted(true);
		}
	}
}
