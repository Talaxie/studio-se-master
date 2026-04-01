package com.talend.microsoft.crm._2015_.utils;

import java.util.List;

import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import com.microsoft.schemas.xrm._2011.contracts.ColumnSet;
import com.microsoft.schemas.xrm._2011.contracts.Entity;
import com.microsoft.schemas.xrm._2011.contracts.EntityCollection;
import com.microsoft.schemas.xrm._2011.contracts.QueryExpression;



//WCF webservice that uses message level NTLM/Kerberos authentication.
class ConnT {
  public static void main(String[] args) throws Exception {
	 //Parameters need to config begin
	 System.setProperty("javax.net.ssl.trustStore", "C:\\tst\\jssecacerts");
	 
	 String organizationWsdl = "https://internal.style.com:444/Talend/XRMServices/2011/Organization.svc?wsdl";
	 String securityServiceWsdl = "https://internal.style.com:443/adfs/services/trust/mex";
	 
	 //The username must be in this format: <username>@<domain> or <domain>/<username>
	 String userName = "administrator@style.com";
	 String password = "Talendqa123!";
	 
	 //Parameters need to config begin
	 
	 MsCrmWsdl wsdl = new MsCrmWsdl(organizationWsdl,securityServiceWsdl);
	 DynamicsCRMConnector orgService =new DynamicsCRMConnector(userName, password, wsdl);
	 
	 //Just Test Retrive Account
	 QueryExpression query = new QueryExpression();
	 query.setEntityName("account");
	 
	 ColumnSet columnSet = new ColumnSet();
	 ArrayOfstring arrOfStr = new ArrayOfstring();
	 
	 arrOfStr.getStrings().add("name");
	 columnSet.setColumns(arrOfStr);
	 query.setColumnSet(columnSet);
	 
	 EntityCollection queryResult = orgService.getOrganizationService().retrieveMultiple(query);
	 List<Entity> entityList = queryResult.getEntities().getEntities();
	 
	 for(Entity entity: entityList){
		 
	 }	 
	 
 }
}
