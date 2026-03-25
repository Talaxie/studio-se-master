
package com.netsuite.webservices.transactions.customers.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChargeStage.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChargeStage"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_hold"/&gt;
 *     &lt;enumeration value="_nonBillable"/&gt;
 *     &lt;enumeration value="_processed"/&gt;
 *     &lt;enumeration value="_ready"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ChargeStage", namespace = "urn:types.customers_2014_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum ChargeStage {

    @XmlEnumValue("_hold")
    HOLD("_hold"),
    @XmlEnumValue("_nonBillable")
    NON_BILLABLE("_nonBillable"),
    @XmlEnumValue("_processed")
    PROCESSED("_processed"),
    @XmlEnumValue("_ready")
    READY("_ready");
    private final String value;

    ChargeStage(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChargeStage fromValue(String v) {
        for (ChargeStage c: ChargeStage.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
