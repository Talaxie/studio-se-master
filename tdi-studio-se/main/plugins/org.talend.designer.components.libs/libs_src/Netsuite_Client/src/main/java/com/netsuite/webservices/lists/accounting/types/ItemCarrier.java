
package com.netsuite.webservices.lists.accounting.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemCarrier.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemCarrier"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_fedexUspsMore"/&gt;
 *     &lt;enumeration value="_ups"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ItemCarrier", namespace = "urn:types.accounting_2014_2.lists.webservices.netsuite.com")
@XmlEnum
public enum ItemCarrier {

    @XmlEnumValue("_fedexUspsMore")
    FEDEX_USPS_MORE("_fedexUspsMore"),
    @XmlEnumValue("_ups")
    UPS("_ups");
    private final String value;

    ItemCarrier(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemCarrier fromValue(String v) {
        for (ItemCarrier c: ItemCarrier.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
