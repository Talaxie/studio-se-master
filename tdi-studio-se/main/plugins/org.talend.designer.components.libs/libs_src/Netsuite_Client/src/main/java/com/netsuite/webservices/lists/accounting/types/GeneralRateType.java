
package com.netsuite.webservices.lists.accounting.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeneralRateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GeneralRateType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_average"/&gt;
 *     &lt;enumeration value="_current"/&gt;
 *     &lt;enumeration value="_historical"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GeneralRateType", namespace = "urn:types.accounting_2014_2.lists.webservices.netsuite.com")
@XmlEnum
public enum GeneralRateType {

    @XmlEnumValue("_average")
    AVERAGE("_average"),
    @XmlEnumValue("_current")
    CURRENT("_current"),
    @XmlEnumValue("_historical")
    HISTORICAL("_historical");
    private final String value;

    GeneralRateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GeneralRateType fromValue(String v) {
        for (GeneralRateType c: GeneralRateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
