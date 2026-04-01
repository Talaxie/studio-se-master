package com.talend.microsoft.crm._2015_.utils;
/*
 * @author wluo
 * @createDate 2015-5-25
 */

/*
 * @note: You must install AD FS and config it to get securityServiceWsdl
 * you can follow this jira: https://jira.talendforge.org/browse/TDI-31824
 * make sure you can access organizationWsdl and securityServiceWsdl in your browser and show the right wsdl
 * content otherwise please check the server configuration and port
 */
public class MsCrmWsdl {
	private String organizationWsdl;
	//e.g: organizationWsdl = "https://internal.style.com:444/Talend/XRMServices/2011/Organization.svc?wsdl";
	private String securityServiceWsdl;
	//e.g: securityServiceWsdl = "https://internal.style.com:443/adfs/services/trust/mex";
	
	public MsCrmWsdl() {}
	
	public MsCrmWsdl(String organizationWsdl, String securityServiceWsdl) {
		super();
		this.organizationWsdl = organizationWsdl;
		this.securityServiceWsdl = securityServiceWsdl;
	}
	
	public String getOrganizationWsdl() {
		return organizationWsdl;
	}
	public void setOrganizationWsdl(String organizationWsdl) {
		this.organizationWsdl = organizationWsdl;
	}
	public String getSecurityServiceWsdl() {
		return securityServiceWsdl;
	}
	public void setSecurityServiceWsdl(String securityServiceWsdl) {
		this.securityServiceWsdl = securityServiceWsdl;
	}	
}
