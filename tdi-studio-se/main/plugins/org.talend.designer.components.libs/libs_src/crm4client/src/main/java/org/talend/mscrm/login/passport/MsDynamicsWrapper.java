package org.talend.mscrm.login.passport;

/*
 * Copyright (c) 2009, GoodData Corporation. All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided that the
 * following conditions are met:
 * 
 * * Redistributions of source code must retain the above copyright notice, this list of conditions and the following
 * disclaimer. * Redistributions in binary form must reproduce the above copyright notice, this list of conditions and
 * the following disclaimer in the documentation and/or other materials provided with the distribution. * Neither the
 * name of the GoodData Corporation nor the names of its contributors may be used to endorse or promote products derived
 * from this software without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES,
 * INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

import java.io.IOException;

import javax.xml.soap.Node;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.Text;

import org.jaxen.JaxenException;
import org.jaxen.XPath;

/**
 * Java wrapper of selected MS CRM 2011 Online web services
 * 
 * @author zd <zd@gooddata.com>
 * @version 1.0
 */
public class MsDynamicsWrapper {

    private final static String HTTPS = "https://";

    private final static String CRM_DISCOVERY_ENDPOINT = "/MSCRMServices/2007/Passport/CrmDiscoveryService.asmx";

    private final static String CRM_ENDPOINT = "/MSCrmServices/2007/CrmService.asmx";

    private final static String CRM_DISCOVERY_XMLNS = "http://schemas.microsoft.com/crm/2007/CrmDiscoveryService";

    // private final static String LIVE_ID_HOST = "dev.login.live-int.com";

    // private final static String LIVE_ID_HOST = "dev.login.live-ppe.com";

    private final static String LIVE_ID_HOST = "login.live.com";

    private final static String LIVE_ID_ENDPOINT = "/rst2.srf";

    private final static String WSSE_XMLNS = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd";

    private final static String ENTITY_XMLNS = "http://schemas.microsoft.com/crm/2006/WebServices";

    private final static String RESULT_XMLNS = "http://schemas.microsoft.com/crm/2007/WebServices";

    private final static String LIVE_ID_SERVER_PLACEHOLDER = "%SERVER%";

    private final static String LIVE_ID_USERNAME_PLACEHOLDER = "%USERNAME%";

    private final static String LIVE_ID_PASSWORD_PLACEHOLDER = "%PASSWORD%";

    private final static String LIVE_ID_POLICY_PLACEHOLDER = "%POLICY%";

    private final static String CRM_ORGANIZATION_PLACEHOLDER = "%ORGANIZATION%";

    private final static String LIVE_ID_TICKET_PLACEHOLDER = "%LIVEID%";

    private final static String CRM_TICKET_PLACEHOLDER = "%CRMTICKET%";

    private final static String CRM_ENTITY_PLACEHOLDER = "%ENTITY%";

    private final static String CRM_ATTRIBUTES_PLACEHOLDER = "%ATTRIBUTES%";

    private final static String CRM_PAGE_NUMBER_PLACEHOLDER = "%PAGENUMBER%";

    private final static String CRM_PAGE_COOKIE_PLACEHOLDER = "%PAGECOOKIE%";

    private final static String CRM_PAGE_COUNT_PLACEHOLDER = "%PAGECOUNT%";

    private final static int PAGE_COUNT = 1000;

    // SAAJ SOAP executor
    private SoapExecutor soap;

    // CRM 2011 Online host
    private String host;

    // MS Live ID username
    private String username;

    // MS Live ID password
    private String password;

    // CRM 2011 Online organization
    private String organization;

    // CRM 2011 Online policy string
    private String policy;

    // MS Live ID ticket
    private String liveId;

    // CRM 2011 Online CRM ticket
    private String crmTicket;

    /**
     * Constructor
     * 
     * @param hostName CRM 2011 Online host
     * @param organization CRM 2011 Online organization
     * @param user CRM 2011 Online username
     * @param password CRM 2011 Online password
     */
    public MsDynamicsWrapper(String hostName, String organization, String user, String password) {
        soap = new SoapExecutor();
        setHost(hostName);
        setOrganization(organization);
        setUsername(user);
        setPassword(password);
    }

    /**
     * Connects the CRM 2011 Online
     * 
     * @throws JaxenException issue with the response format
     * @throws IOException generic IO issue
     * @throws SOAPException issue with SOAP invocation
     */
    public void connect() throws JaxenException, IOException, SOAPException {
        String policy = retrievePolicy();
        setPolicy(policy);
        String liveid = login();
        setLiveId(liveid);
        String crmTicket = retrieveCrmTicket();
        setCrmTicket(crmTicket);
    }

    /**
     * Retrieves the MS CRM 2011 policy
     * 
     * @return the policy string
     * @throws JaxenException issue with the response format
     * @throws IOException generic IO issue
     * @throws SOAPException issue with SOAP invocation
     */
    public String retrievePolicy() throws IOException, SOAPException, JaxenException {
        String msg = FileUtil.readStringFromClasspath("/org/talend/mscrm/login/passport/RetrievePolicy.xml",
                MsDynamicsWrapper.class);
        SOAPMessage response = soap.execute(HTTPS + host + CRM_DISCOVERY_ENDPOINT, msg);
        XPath xp = soap.createXPath("//crm:Policy/text()", response);
        xp.addNamespace("crm", CRM_DISCOVERY_XMLNS);
        Text result = (Text) xp.selectSingleNode(response.getSOAPBody());
        return result.getValue();
    }

    /**
     * Retrieves the CRM ticket
     * 
     * @return CRM ticket
     * @throws JaxenException issue with the response format
     * @throws IOException generic IO issue
     * @throws SOAPException issue with SOAP invocation
     */
    public String retrieveCrmTicket() throws IOException, SOAPException, JaxenException {
        String msg = FileUtil.readStringFromClasspath("/org/talend/mscrm/login/passport/RetrieveCrmTicket.xml",
                MsDynamicsWrapper.class);
        msg = msg.replace(CRM_ORGANIZATION_PLACEHOLDER, getOrganization());
        msg = msg.replace(LIVE_ID_TICKET_PLACEHOLDER, getLiveId());
        SOAPMessage response = soap.execute(HTTPS + host + CRM_DISCOVERY_ENDPOINT, msg);
        XPath xp = soap.createXPath("//crm:CrmTicket/text()", response);
        xp.addNamespace("crm", CRM_DISCOVERY_XMLNS);
        Text result = (Text) xp.selectSingleNode(response.getSOAPBody());
        return result.getNodeValue();
    }

    /**
     * Retrieves data from the CRM 2011 Online
     * 
     * @param entity CRM 2011 entity (e.g. account or opportunity)
     * @param columns Entity fields (e.g. accountid, name etc.)
     * @param csvFile name of the CSV file where the results will be stored
     * @return number of rows retrieved
     * @throws JaxenException issue with the response format
     * @throws IOException generic IO issue
     * @throws SOAPException issue with SOAP invocation
     */
    // public int retrieveMultiple(String entity, String[] columns, String csvFile) throws IOException, SOAPException,
    // JaxenException {
    // int cnt = 0;
    // CSVWriter cw = FileUtil.createUtf8CsvEscapingWriter(new File(csvFile));
    // try {
    // int pageNumber = 1;
    // String cookie = "";
    // boolean hasNext = true;
    // while (hasNext) {
    // List<Map<String, String>> ret = new ArrayList<Map<String, String>>();
    // RetrievePageInfo info = retrievePage(entity, columns, pageNumber++, cookie, ret);
    // for (Map<String, String> m : ret) {
    // String[] row = new String[columns.length];
    // for (int i = 0; i < columns.length; i++) {
    // row[i] = m.get(columns[i]);
    // }
    // cw.writeNext(row);
    // }
    // cnt += ret.size();
    // cw.flush();
    // cookie = info.getPageCookie();
    // if ("0".equalsIgnoreCase(info.getMoreRecords()))
    // hasNext = false;
    // }
    // } finally {
    // cw.close();
    // }
    // return cnt;
    // }

    /**
     * Paging information holder
     */
    // private class RetrievePageInfo {
    //
    // private String pageCookie;
    //
    // private String moreRecords;
    //
    // public RetrievePageInfo(String cookie, String more) {
    // setPageCookie(cookie);
    // setMoreRecords(more);
    // }
    //
    // public String getPageCookie() {
    // return pageCookie;
    // }
    //
    // public void setPageCookie(String pageCookie) {
    // this.pageCookie = pageCookie;
    // }
    //
    // public String getMoreRecords() {
    // return moreRecords;
    // }
    //
    // public void setMoreRecords(String moreRecords) {
    // this.moreRecords = moreRecords;
    // }
    // }

    /**
     * Retrieves a single page of RetrieveMultiple result
     * 
     * @param entity CRM 2011 entity (e.g. account or opportunity)
     * @param columns Entity fields (e.g. accountid, name etc.)
     * @param pageNumber the result page number (1..N)
     * @param cookie API paging cookie
     * @param ret the List of Maps that will be populated with the data
     * @return the RetrievePageInfo structure that describes the status of the retrieval
     * @throws JaxenException issue with the response format
     * @throws IOException generic IO issue
     * @throws SOAPException issue with SOAP invocation
     */
    // protected RetrievePageInfo retrievePage(String entity, String[] columns, int pageNumber, String cookie,
    // List<Map<String, String>> ret) throws IOException, SOAPException, JaxenException {
    // String msg = FileUtil.readStringFromClasspath("/com/gooddata/msdynamics/RetrieveMultiple.xml",
    // MsDynamicsWrapper.class);
    // msg = msg.replace(CRM_ORGANIZATION_PLACEHOLDER, getOrganization());
    // msg = msg.replace(CRM_TICKET_PLACEHOLDER, getCrmTicket());
    // msg = msg.replace(CRM_ENTITY_PLACEHOLDER, entity);
    // msg = msg.replace(CRM_PAGE_NUMBER_PLACEHOLDER, Integer.toString(pageNumber));
    // msg = msg.replace(CRM_PAGE_COUNT_PLACEHOLDER, Integer.toString(PAGE_COUNT));
    // if (cookie != null && cookie.length() > 0) {
    // msg = msg.replace(CRM_PAGE_COOKIE_PLACEHOLDER, "<ns4:PageCookie><![CDATA[" + cookie + "]]></ns4:PageCookie>");
    // } else {
    // msg = msg.replace(CRM_PAGE_COOKIE_PLACEHOLDER, "");
    // }
    // String columnsElement = "";
    // for (int i = 0; i < columns.length; i++) {
    // columnsElement += "<ns4:Attribute>" + columns[i] + "</ns4:Attribute>";
    // }
    // msg = msg.replace(CRM_ATTRIBUTES_PLACEHOLDER, columnsElement);
    // SOAPMessage response = soap.execute(HTTPS + host + CRM_ENDPOINT, msg);
    // XPath xp = soap.createXPath("//crm:RetrieveMultipleResult", response);
    // xp.addNamespace("crm", RESULT_XMLNS);
    // List result = xp.selectNodes(response.getSOAPBody());
    // if (result != null && result.size() == 1) {
    // SOAPElement e = (SOAPElement) result.get(0);
    // String more = e.getAttribute("MoreRecords");
    // String newCookie = e.getAttribute("PagingCookie");
    // if (more != null && more.length() > 0 && newCookie != null && newCookie.length() > 0) {
    // xp = soap.createXPath("//crm:BusinessEntity", response);
    // xp.addNamespace("crm", ENTITY_XMLNS);
    // result = xp.selectNodes(response.getSOAPBody());
    // for (Object o : result) {
    // e = (SOAPElement) o;
    // Map<String, String> instance = new HashMap<String, String>();
    // Iterator elements = e.getChildElements();
    // while (elements.hasNext()) {
    // SOAPElement name = (SOAPElement) elements.next();
    // String value = name.getFirstChild().getNodeValue();
    // instance.put(name.getElementName().getLocalName(), value);
    // }
    // ret.add(instance);
    // }
    // return new RetrievePageInfo(newCookie, more);
    // } else {
    // throw new SOAPException("RetrieveMultiple: Invalid response. The response doesn't contain either "
    // + "the MoreRecords or the PagingCookie attributes.");
    // }
    //
    // } else {
    // throw new SOAPException("RetrieveMultiple: Invalid response. The response doesn't contain "
    // + "the RetrieveMultipleResult element.");
    // }
    // }

    /**
     * Logs into the MS CRM 2011 Online
     * 
     * @return the Live ID token
     * @throws JaxenException issue with the response format
     * @throws IOException generic IO issue
     * @throws SOAPException issue with SOAP invocation
     */
    public String login() throws IOException, SOAPException, JaxenException {
        String msg = FileUtil
                .readStringFromClasspath("/org/talend/mscrm/login/passport/LiveIdLogin.xml", MsDynamicsWrapper.class);
        msg = msg.replaceAll(LIVE_ID_SERVER_PLACEHOLDER, getHost());
        msg = msg.replaceAll(LIVE_ID_USERNAME_PLACEHOLDER, getUsername());
        msg = msg.replaceAll(LIVE_ID_PASSWORD_PLACEHOLDER, getPassword());
        msg = msg.replaceAll(LIVE_ID_POLICY_PLACEHOLDER, getPolicy());
        SOAPMessage response = soap.execute(HTTPS + LIVE_ID_HOST + LIVE_ID_ENDPOINT, msg);
        XPath xp = soap.createXPath("//wsse:BinarySecurityToken/text()", response);
        xp.addNamespace("wsse", WSSE_XMLNS);
        Node result = (Node) xp.selectSingleNode(response.getSOAPBody());
        return result.getValue();
    }

    // Getters and Setters

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public String getLiveId() {
        return liveId;
    }

    public void setLiveId(String l) {
        this.liveId = l;
    }

    public String getCrmTicket() {
        return crmTicket;
    }

    public void setCrmTicket(String crmTicket) {
        this.crmTicket = crmTicket;
    }
}
