package com.talend.microsoft.crm._2015_.utils;

import javax.xml.namespace.QName;

public class QNamesCollection {
	public static final QName HTTPS_SP = new QName(
			"http://docs.oasis-open.org/ws-sx/ws-securitypolicy/200702",
			"HttpsToken", "sp");
	public static final QName POLICY_WSP = new QName(
			"http://schemas.xmlsoap.org/ws/2004/09/policy", "Policy", "wsp");
	public static final QName FAIL_POLICY = new QName(
			"http://schemas.microsoft.com/xrm/2012/Contracts/Services",
			"FailoverPolicy");
	public static final QName AUTH_POLICY_2011 = new QName(
			"http://schemas.microsoft.com/xrm/2011/Contracts/Services",
			"AuthenticationPolicy");
	public static final QName AUTH_POLICY_2012 = new QName(
			"http://schemas.microsoft.com/xrm/2012/Contracts/Services",
			"AuthenticationPolicy");
	public static final QName ORGANIZATION_SERVICE = new QName(
			"http://schemas.microsoft.com/xrm/2011/Contracts",
			"OrganizationService");
	public static final QName PROCESS_CREATE = new QName(
			"http://schemas.microsoft.com/xrm/2011/Contracts/Services",
			"Create");
	public static final QName CREATE_SERVICE = new QName(
			"http://schemas.microsoft.com/xrm/2011/Contracts/Services",
			"Create");
	public static final QName METADATA_EXCHANGE_SERVICE = new QName(
			"http://www.w3.org/2009/09/ws-mex", "MetadataExchangeService");
	public static final QName WS_MEX = new QName(
			"http://www.w3.org/2009/09/ws-mex", "Get2004");
	public static final QName SECURITY_TOKEN_SERVICE = new QName(
			"http://schemas.microsoft.com/ws/2008/06/identity/securitytokenservice",
			"SecurityTokenService");
	public static final QName IWS_TRUST13ASYNC = new QName(
			"http://schemas.microsoft.com/ws/2008/06/identity/securitytokenservice",
			"UserNameWSTrustBinding_IWSTrust13Async");

	public QNamesCollection() {
	}
}
