
package com.microsoft.schemas.xrm._2011.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManagedPropertyOperation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ManagedPropertyOperation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Create"/>
 *     &lt;enumeration value="Update"/>
 *     &lt;enumeration value="Delete"/>
 *     &lt;enumeration value="CreateUpdate"/>
 *     &lt;enumeration value="UpdateDelete"/>
 *     &lt;enumeration value="All"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ManagedPropertyOperation")
@XmlEnum
public enum ManagedPropertyOperation {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Create")
    CREATE("Create"),
    @XmlEnumValue("Update")
    UPDATE("Update"),
    @XmlEnumValue("Delete")
    DELETE("Delete"),
    @XmlEnumValue("CreateUpdate")
    CREATE_UPDATE("CreateUpdate"),
    @XmlEnumValue("UpdateDelete")
    UPDATE_DELETE("UpdateDelete"),
    @XmlEnumValue("All")
    ALL("All");
    private final String value;

    ManagedPropertyOperation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ManagedPropertyOperation fromValue(String v) {
        for (ManagedPropertyOperation c: ManagedPropertyOperation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
