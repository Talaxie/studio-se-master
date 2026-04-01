
package com.netsuite.webservices.lists.relationships.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EntityType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_company"/&gt;
 *     &lt;enumeration value="_contact"/&gt;
 *     &lt;enumeration value="_customer"/&gt;
 *     &lt;enumeration value="_employee"/&gt;
 *     &lt;enumeration value="_genericResource"/&gt;
 *     &lt;enumeration value="_group"/&gt;
 *     &lt;enumeration value="_internal"/&gt;
 *     &lt;enumeration value="_job"/&gt;
 *     &lt;enumeration value="_otherName"/&gt;
 *     &lt;enumeration value="_partner"/&gt;
 *     &lt;enumeration value="_vendor"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EntityType", namespace = "urn:types.relationships_2014_2.lists.webservices.netsuite.com")
@XmlEnum
public enum EntityType {

    @XmlEnumValue("_company")
    COMPANY("_company"),
    @XmlEnumValue("_contact")
    CONTACT("_contact"),
    @XmlEnumValue("_customer")
    CUSTOMER("_customer"),
    @XmlEnumValue("_employee")
    EMPLOYEE("_employee"),
    @XmlEnumValue("_genericResource")
    GENERIC_RESOURCE("_genericResource"),
    @XmlEnumValue("_group")
    GROUP("_group"),
    @XmlEnumValue("_internal")
    INTERNAL("_internal"),
    @XmlEnumValue("_job")
    JOB("_job"),
    @XmlEnumValue("_otherName")
    OTHER_NAME("_otherName"),
    @XmlEnumValue("_partner")
    PARTNER("_partner"),
    @XmlEnumValue("_vendor")
    VENDOR("_vendor");
    private final String value;

    EntityType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EntityType fromValue(String v) {
        for (EntityType c: EntityType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
