
package com.netsuite.webservices.transactions.sales.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpportunityStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OpportunityStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_closedLost"/&gt;
 *     &lt;enumeration value="_closedWon"/&gt;
 *     &lt;enumeration value="_inProgress"/&gt;
 *     &lt;enumeration value="_issuedEstimate"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OpportunityStatus", namespace = "urn:types.sales_2014_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum OpportunityStatus {

    @XmlEnumValue("_closedLost")
    CLOSED_LOST("_closedLost"),
    @XmlEnumValue("_closedWon")
    CLOSED_WON("_closedWon"),
    @XmlEnumValue("_inProgress")
    IN_PROGRESS("_inProgress"),
    @XmlEnumValue("_issuedEstimate")
    ISSUED_ESTIMATE("_issuedEstimate");
    private final String value;

    OpportunityStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OpportunityStatus fromValue(String v) {
        for (OpportunityStatus c: OpportunityStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
