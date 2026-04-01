
package com.netsuite.webservices.platform.common.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RevenueStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RevenueStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_pending"/&gt;
 *     &lt;enumeration value="_inProgress"/&gt;
 *     &lt;enumeration value="_completed"/&gt;
 *     &lt;enumeration value="_onRevCommitment"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RevenueStatus", namespace = "urn:types.common_2014_2.platform.webservices.netsuite.com")
@XmlEnum
public enum RevenueStatus {

    @XmlEnumValue("_pending")
    PENDING("_pending"),
    @XmlEnumValue("_inProgress")
    IN_PROGRESS("_inProgress"),
    @XmlEnumValue("_completed")
    COMPLETED("_completed"),
    @XmlEnumValue("_onRevCommitment")
    ON_REV_COMMITMENT("_onRevCommitment");
    private final String value;

    RevenueStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RevenueStatus fromValue(String v) {
        for (RevenueStatus c: RevenueStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
