
package com.microsoft.schemas.xrm._2011.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttributeTypeCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AttributeTypeCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Boolean"/>
 *     &lt;enumeration value="Customer"/>
 *     &lt;enumeration value="DateTime"/>
 *     &lt;enumeration value="Decimal"/>
 *     &lt;enumeration value="Double"/>
 *     &lt;enumeration value="Integer"/>
 *     &lt;enumeration value="Lookup"/>
 *     &lt;enumeration value="Memo"/>
 *     &lt;enumeration value="Money"/>
 *     &lt;enumeration value="Owner"/>
 *     &lt;enumeration value="PartyList"/>
 *     &lt;enumeration value="Picklist"/>
 *     &lt;enumeration value="State"/>
 *     &lt;enumeration value="Status"/>
 *     &lt;enumeration value="String"/>
 *     &lt;enumeration value="Uniqueidentifier"/>
 *     &lt;enumeration value="CalendarRules"/>
 *     &lt;enumeration value="Virtual"/>
 *     &lt;enumeration value="BigInt"/>
 *     &lt;enumeration value="ManagedProperty"/>
 *     &lt;enumeration value="EntityName"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AttributeTypeCode")
@XmlEnum
public enum AttributeTypeCode {

    @XmlEnumValue("Boolean")
    BOOLEAN("Boolean"),
    @XmlEnumValue("Customer")
    CUSTOMER("Customer"),
    @XmlEnumValue("DateTime")
    DATE_TIME("DateTime"),
    @XmlEnumValue("Decimal")
    DECIMAL("Decimal"),
    @XmlEnumValue("Double")
    DOUBLE("Double"),
    @XmlEnumValue("Integer")
    INTEGER("Integer"),
    @XmlEnumValue("Lookup")
    LOOKUP("Lookup"),
    @XmlEnumValue("Memo")
    MEMO("Memo"),
    @XmlEnumValue("Money")
    MONEY("Money"),
    @XmlEnumValue("Owner")
    OWNER("Owner"),
    @XmlEnumValue("PartyList")
    PARTY_LIST("PartyList"),
    @XmlEnumValue("Picklist")
    PICKLIST("Picklist"),
    @XmlEnumValue("State")
    STATE("State"),
    @XmlEnumValue("Status")
    STATUS("Status"),
    @XmlEnumValue("String")
    STRING("String"),
    @XmlEnumValue("Uniqueidentifier")
    UNIQUEIDENTIFIER("Uniqueidentifier"),
    @XmlEnumValue("CalendarRules")
    CALENDAR_RULES("CalendarRules"),
    @XmlEnumValue("Virtual")
    VIRTUAL("Virtual"),
    @XmlEnumValue("BigInt")
    BIG_INT("BigInt"),
    @XmlEnumValue("ManagedProperty")
    MANAGED_PROPERTY("ManagedProperty"),
    @XmlEnumValue("EntityName")
    ENTITY_NAME("EntityName");
    private final String value;

    AttributeTypeCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AttributeTypeCode fromValue(String v) {
        for (AttributeTypeCode c: AttributeTypeCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
