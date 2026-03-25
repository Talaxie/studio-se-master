
package com.microsoft.schemas.crm._2011.contracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PropagationOwnershipOptions.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PropagationOwnershipOptions">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Caller"/>
 *     &lt;enumeration value="ListMemberOwner"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PropagationOwnershipOptions")
@XmlEnum
public enum PropagationOwnershipOptions {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Caller")
    CALLER("Caller"),
    @XmlEnumValue("ListMemberOwner")
    LIST_MEMBER_OWNER("ListMemberOwner");
    private final String value;

    PropagationOwnershipOptions(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PropagationOwnershipOptions fromValue(String v) {
        for (PropagationOwnershipOptions c: PropagationOwnershipOptions.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
