package com.talend.microsoft.crm._2015_.utils;

import java.util.Collection;

import javax.xml.namespace.QName;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.binding.soap.interceptor.AbstractSoapInterceptor;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.ws.policy.AssertionInfo;
import org.apache.cxf.ws.policy.AssertionInfoMap;
import org.apache.cxf.ws.security.wss4j.PolicyBasedWSS4JInInterceptor;
import org.apache.cxf.ws.security.wss4j.PolicyBasedWSS4JOutInterceptor;

public class WspPolicyInterceptor extends AbstractSoapInterceptor {
	public WspPolicyInterceptor() {
		super("pre-protocol");
		addAfter(PolicyBasedWSS4JInInterceptor.class.getName());
		addAfter(PolicyBasedWSS4JOutInterceptor.class.getName());
	}

	public void handleMessage(SoapMessage message) throws Fault {
		AssertionInfoMap aim = (AssertionInfoMap) message
				.get(AssertionInfoMap.class);
		if (null == aim) {
			return;
		}
		QName qname = QNamesCollection.POLICY_WSP;

		Collection<AssertionInfo> ais = (Collection<AssertionInfo>) aim
				.get(qname);
		if ((null == ais) || (ais.size() == 0)) {
			return;
		}
		for (AssertionInfo ai : ais) {
			ai.setAsserted(true);
		}
	}
}
