
package com.netsuite.webservices.platform.core.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchRecordType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SearchRecordType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="account"/&gt;
 *     &lt;enumeration value="accountingPeriod"/&gt;
 *     &lt;enumeration value="appDefinition"/&gt;
 *     &lt;enumeration value="appPackage"/&gt;
 *     &lt;enumeration value="assemblyItem"/&gt;
 *     &lt;enumeration value="bin"/&gt;
 *     &lt;enumeration value="budget"/&gt;
 *     &lt;enumeration value="calendarEvent"/&gt;
 *     &lt;enumeration value="campaign"/&gt;
 *     &lt;enumeration value="classification"/&gt;
 *     &lt;enumeration value="contact"/&gt;
 *     &lt;enumeration value="customer"/&gt;
 *     &lt;enumeration value="customerMessage"/&gt;
 *     &lt;enumeration value="customRecord"/&gt;
 *     &lt;enumeration value="department"/&gt;
 *     &lt;enumeration value="employee"/&gt;
 *     &lt;enumeration value="entityGroup"/&gt;
 *     &lt;enumeration value="file"/&gt;
 *     &lt;enumeration value="folder"/&gt;
 *     &lt;enumeration value="giftCertificate"/&gt;
 *     &lt;enumeration value="groupMember"/&gt;
 *     &lt;enumeration value="inventoryNumber"/&gt;
 *     &lt;enumeration value="item"/&gt;
 *     &lt;enumeration value="issue"/&gt;
 *     &lt;enumeration value="job"/&gt;
 *     &lt;enumeration value="location"/&gt;
 *     &lt;enumeration value="lotNumberedAssemblyItem"/&gt;
 *     &lt;enumeration value="manufacturingCostTemplate"/&gt;
 *     &lt;enumeration value="manufacturingOperationTask"/&gt;
 *     &lt;enumeration value="manufacturingRouting"/&gt;
 *     &lt;enumeration value="message"/&gt;
 *     &lt;enumeration value="nexus"/&gt;
 *     &lt;enumeration value="note"/&gt;
 *     &lt;enumeration value="opportunity"/&gt;
 *     &lt;enumeration value="otherNameCategory"/&gt;
 *     &lt;enumeration value="partner"/&gt;
 *     &lt;enumeration value="phoneCall"/&gt;
 *     &lt;enumeration value="priceLevel"/&gt;
 *     &lt;enumeration value="pricingGroup"/&gt;
 *     &lt;enumeration value="projectTask"/&gt;
 *     &lt;enumeration value="promotionCode"/&gt;
 *     &lt;enumeration value="resourceAllocation"/&gt;
 *     &lt;enumeration value="revRecSchedule"/&gt;
 *     &lt;enumeration value="revRecTemplate"/&gt;
 *     &lt;enumeration value="salesRole"/&gt;
 *     &lt;enumeration value="serializedAssemblyItem"/&gt;
 *     &lt;enumeration value="solution"/&gt;
 *     &lt;enumeration value="siteCategory"/&gt;
 *     &lt;enumeration value="subsidiary"/&gt;
 *     &lt;enumeration value="supportCase"/&gt;
 *     &lt;enumeration value="task"/&gt;
 *     &lt;enumeration value="timeBill"/&gt;
 *     &lt;enumeration value="topic"/&gt;
 *     &lt;enumeration value="transaction"/&gt;
 *     &lt;enumeration value="vendor"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SearchRecordType", namespace = "urn:types.core_2014_2.platform.webservices.netsuite.com")
@XmlEnum
public enum SearchRecordType {

    @XmlEnumValue("account")
    ACCOUNT("account"),
    @XmlEnumValue("accountingPeriod")
    ACCOUNTING_PERIOD("accountingPeriod"),
    @XmlEnumValue("appDefinition")
    APP_DEFINITION("appDefinition"),
    @XmlEnumValue("appPackage")
    APP_PACKAGE("appPackage"),
    @XmlEnumValue("assemblyItem")
    ASSEMBLY_ITEM("assemblyItem"),
    @XmlEnumValue("bin")
    BIN("bin"),
    @XmlEnumValue("budget")
    BUDGET("budget"),
    @XmlEnumValue("calendarEvent")
    CALENDAR_EVENT("calendarEvent"),
    @XmlEnumValue("campaign")
    CAMPAIGN("campaign"),
    @XmlEnumValue("classification")
    CLASSIFICATION("classification"),
    @XmlEnumValue("contact")
    CONTACT("contact"),
    @XmlEnumValue("customer")
    CUSTOMER("customer"),
    @XmlEnumValue("customerMessage")
    CUSTOMER_MESSAGE("customerMessage"),
    @XmlEnumValue("customRecord")
    CUSTOM_RECORD("customRecord"),
    @XmlEnumValue("department")
    DEPARTMENT("department"),
    @XmlEnumValue("employee")
    EMPLOYEE("employee"),
    @XmlEnumValue("entityGroup")
    ENTITY_GROUP("entityGroup"),
    @XmlEnumValue("file")
    FILE("file"),
    @XmlEnumValue("folder")
    FOLDER("folder"),
    @XmlEnumValue("giftCertificate")
    GIFT_CERTIFICATE("giftCertificate"),
    @XmlEnumValue("groupMember")
    GROUP_MEMBER("groupMember"),
    @XmlEnumValue("inventoryNumber")
    INVENTORY_NUMBER("inventoryNumber"),
    @XmlEnumValue("item")
    ITEM("item"),
    @XmlEnumValue("issue")
    ISSUE("issue"),
    @XmlEnumValue("job")
    JOB("job"),
    @XmlEnumValue("location")
    LOCATION("location"),
    @XmlEnumValue("lotNumberedAssemblyItem")
    LOT_NUMBERED_ASSEMBLY_ITEM("lotNumberedAssemblyItem"),
    @XmlEnumValue("manufacturingCostTemplate")
    MANUFACTURING_COST_TEMPLATE("manufacturingCostTemplate"),
    @XmlEnumValue("manufacturingOperationTask")
    MANUFACTURING_OPERATION_TASK("manufacturingOperationTask"),
    @XmlEnumValue("manufacturingRouting")
    MANUFACTURING_ROUTING("manufacturingRouting"),
    @XmlEnumValue("message")
    MESSAGE("message"),
    @XmlEnumValue("nexus")
    NEXUS("nexus"),
    @XmlEnumValue("note")
    NOTE("note"),
    @XmlEnumValue("opportunity")
    OPPORTUNITY("opportunity"),
    @XmlEnumValue("otherNameCategory")
    OTHER_NAME_CATEGORY("otherNameCategory"),
    @XmlEnumValue("partner")
    PARTNER("partner"),
    @XmlEnumValue("phoneCall")
    PHONE_CALL("phoneCall"),
    @XmlEnumValue("priceLevel")
    PRICE_LEVEL("priceLevel"),
    @XmlEnumValue("pricingGroup")
    PRICING_GROUP("pricingGroup"),
    @XmlEnumValue("projectTask")
    PROJECT_TASK("projectTask"),
    @XmlEnumValue("promotionCode")
    PROMOTION_CODE("promotionCode"),
    @XmlEnumValue("resourceAllocation")
    RESOURCE_ALLOCATION("resourceAllocation"),
    @XmlEnumValue("revRecSchedule")
    REV_REC_SCHEDULE("revRecSchedule"),
    @XmlEnumValue("revRecTemplate")
    REV_REC_TEMPLATE("revRecTemplate"),
    @XmlEnumValue("salesRole")
    SALES_ROLE("salesRole"),
    @XmlEnumValue("serializedAssemblyItem")
    SERIALIZED_ASSEMBLY_ITEM("serializedAssemblyItem"),
    @XmlEnumValue("solution")
    SOLUTION("solution"),
    @XmlEnumValue("siteCategory")
    SITE_CATEGORY("siteCategory"),
    @XmlEnumValue("subsidiary")
    SUBSIDIARY("subsidiary"),
    @XmlEnumValue("supportCase")
    SUPPORT_CASE("supportCase"),
    @XmlEnumValue("task")
    TASK("task"),
    @XmlEnumValue("timeBill")
    TIME_BILL("timeBill"),
    @XmlEnumValue("topic")
    TOPIC("topic"),
    @XmlEnumValue("transaction")
    TRANSACTION("transaction"),
    @XmlEnumValue("vendor")
    VENDOR("vendor");
    private final String value;

    SearchRecordType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchRecordType fromValue(String v) {
        for (SearchRecordType c: SearchRecordType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
