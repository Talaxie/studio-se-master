
package com.netsuite.webservices.lists.accounting.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemAtpMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemAtpMethod"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_cumulativeAtpWithLookAhead"/&gt;
 *     &lt;enumeration value="_discreteAtp"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ItemAtpMethod", namespace = "urn:types.accounting_2014_2.lists.webservices.netsuite.com")
@XmlEnum
public enum ItemAtpMethod {

    @XmlEnumValue("_cumulativeAtpWithLookAhead")
    CUMULATIVE_ATP_WITH_LOOK_AHEAD("_cumulativeAtpWithLookAhead"),
    @XmlEnumValue("_discreteAtp")
    DISCRETE_ATP("_discreteAtp");
    private final String value;

    ItemAtpMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemAtpMethod fromValue(String v) {
        for (ItemAtpMethod c: ItemAtpMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
