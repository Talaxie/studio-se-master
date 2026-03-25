
package com.netsuite.webservices.platform.core.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetAllRecordType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GetAllRecordType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="budgetCategory"/&gt;
 *     &lt;enumeration value="campaignAudience"/&gt;
 *     &lt;enumeration value="campaignCategory"/&gt;
 *     &lt;enumeration value="campaignChannel"/&gt;
 *     &lt;enumeration value="campaignFamily"/&gt;
 *     &lt;enumeration value="campaignOffer"/&gt;
 *     &lt;enumeration value="campaignSearchEngine"/&gt;
 *     &lt;enumeration value="campaignSubscription"/&gt;
 *     &lt;enumeration value="campaignVertical"/&gt;
 *     &lt;enumeration value="costCategory"/&gt;
 *     &lt;enumeration value="currency"/&gt;
 *     &lt;enumeration value="leadSource"/&gt;
 *     &lt;enumeration value="salesTaxItem"/&gt;
 *     &lt;enumeration value="state"/&gt;
 *     &lt;enumeration value="supportCaseIssue"/&gt;
 *     &lt;enumeration value="supportCaseOrigin"/&gt;
 *     &lt;enumeration value="supportCasePriority"/&gt;
 *     &lt;enumeration value="supportCaseStatus"/&gt;
 *     &lt;enumeration value="supportCaseType"/&gt;
 *     &lt;enumeration value="taxAcct"/&gt;
 *     &lt;enumeration value="taxGroup"/&gt;
 *     &lt;enumeration value="taxType"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GetAllRecordType", namespace = "urn:types.core_2014_2.platform.webservices.netsuite.com")
@XmlEnum
public enum GetAllRecordType {

    @XmlEnumValue("budgetCategory")
    BUDGET_CATEGORY("budgetCategory"),
    @XmlEnumValue("campaignAudience")
    CAMPAIGN_AUDIENCE("campaignAudience"),
    @XmlEnumValue("campaignCategory")
    CAMPAIGN_CATEGORY("campaignCategory"),
    @XmlEnumValue("campaignChannel")
    CAMPAIGN_CHANNEL("campaignChannel"),
    @XmlEnumValue("campaignFamily")
    CAMPAIGN_FAMILY("campaignFamily"),
    @XmlEnumValue("campaignOffer")
    CAMPAIGN_OFFER("campaignOffer"),
    @XmlEnumValue("campaignSearchEngine")
    CAMPAIGN_SEARCH_ENGINE("campaignSearchEngine"),
    @XmlEnumValue("campaignSubscription")
    CAMPAIGN_SUBSCRIPTION("campaignSubscription"),
    @XmlEnumValue("campaignVertical")
    CAMPAIGN_VERTICAL("campaignVertical"),
    @XmlEnumValue("costCategory")
    COST_CATEGORY("costCategory"),
    @XmlEnumValue("currency")
    CURRENCY("currency"),
    @XmlEnumValue("leadSource")
    LEAD_SOURCE("leadSource"),
    @XmlEnumValue("salesTaxItem")
    SALES_TAX_ITEM("salesTaxItem"),
    @XmlEnumValue("state")
    STATE("state"),
    @XmlEnumValue("supportCaseIssue")
    SUPPORT_CASE_ISSUE("supportCaseIssue"),
    @XmlEnumValue("supportCaseOrigin")
    SUPPORT_CASE_ORIGIN("supportCaseOrigin"),
    @XmlEnumValue("supportCasePriority")
    SUPPORT_CASE_PRIORITY("supportCasePriority"),
    @XmlEnumValue("supportCaseStatus")
    SUPPORT_CASE_STATUS("supportCaseStatus"),
    @XmlEnumValue("supportCaseType")
    SUPPORT_CASE_TYPE("supportCaseType"),
    @XmlEnumValue("taxAcct")
    TAX_ACCT("taxAcct"),
    @XmlEnumValue("taxGroup")
    TAX_GROUP("taxGroup"),
    @XmlEnumValue("taxType")
    TAX_TYPE("taxType");
    private final String value;

    GetAllRecordType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GetAllRecordType fromValue(String v) {
        for (GetAllRecordType c: GetAllRecordType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
