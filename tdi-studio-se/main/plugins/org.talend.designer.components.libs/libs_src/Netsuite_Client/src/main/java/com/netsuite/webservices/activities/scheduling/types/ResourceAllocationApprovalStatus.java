
package com.netsuite.webservices.activities.scheduling.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResourceAllocationApprovalStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResourceAllocationApprovalStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_approved"/&gt;
 *     &lt;enumeration value="_pendingApproval"/&gt;
 *     &lt;enumeration value="_rejected"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ResourceAllocationApprovalStatus", namespace = "urn:types.scheduling_2014_2.activities.webservices.netsuite.com")
@XmlEnum
public enum ResourceAllocationApprovalStatus {

    @XmlEnumValue("_approved")
    APPROVED("_approved"),
    @XmlEnumValue("_pendingApproval")
    PENDING_APPROVAL("_pendingApproval"),
    @XmlEnumValue("_rejected")
    REJECTED("_rejected");
    private final String value;

    ResourceAllocationApprovalStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResourceAllocationApprovalStatus fromValue(String v) {
        for (ResourceAllocationApprovalStatus c: ResourceAllocationApprovalStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
