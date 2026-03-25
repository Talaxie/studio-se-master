
package com.netsuite.webservices.setup.customization.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemCustomFieldItemSubType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemCustomFieldItemSubType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_both"/&gt;
 *     &lt;enumeration value="_purchase"/&gt;
 *     &lt;enumeration value="_sale"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ItemCustomFieldItemSubType", namespace = "urn:types.customization_2014_2.setup.webservices.netsuite.com")
@XmlEnum
public enum ItemCustomFieldItemSubType {

    @XmlEnumValue("_both")
    BOTH("_both"),
    @XmlEnumValue("_purchase")
    PURCHASE("_purchase"),
    @XmlEnumValue("_sale")
    SALE("_sale");
    private final String value;

    ItemCustomFieldItemSubType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemCustomFieldItemSubType fromValue(String v) {
        for (ItemCustomFieldItemSubType c: ItemCustomFieldItemSubType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
