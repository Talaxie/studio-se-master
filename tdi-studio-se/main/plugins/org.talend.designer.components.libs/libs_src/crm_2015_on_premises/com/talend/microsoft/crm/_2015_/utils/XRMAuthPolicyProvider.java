package com.talend.microsoft.crm._2015_.utils;

import java.util.Arrays;

import javax.xml.namespace.QName;

import org.apache.cxf.ws.policy.AbstractPolicyInterceptorProvider;

public class XRMAuthPolicyProvider extends AbstractPolicyInterceptorProvider {
	private static final long serialVersionUID = 1L;
	public XRMAuthPolicyProvider() {
		super(Arrays.asList(new QName[] { new QName(
				"http://schemas.microsoft.com/xrm/2011/Contracts/Services",
				"AuthenticationPolicy", "ms-xrm") }));
		getInInterceptors().add(new XRMAuthPolicyInterceptor());
	}
}
