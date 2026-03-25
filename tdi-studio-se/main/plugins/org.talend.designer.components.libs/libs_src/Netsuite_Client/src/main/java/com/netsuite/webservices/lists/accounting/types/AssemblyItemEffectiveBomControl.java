
package com.netsuite.webservices.lists.accounting.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssemblyItemEffectiveBomControl.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AssemblyItemEffectiveBomControl"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_effectiveDate"/&gt;
 *     &lt;enumeration value="_revisionControl"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AssemblyItemEffectiveBomControl", namespace = "urn:types.accounting_2014_2.lists.webservices.netsuite.com")
@XmlEnum
public enum AssemblyItemEffectiveBomControl {

    @XmlEnumValue("_effectiveDate")
    EFFECTIVE_DATE("_effectiveDate"),
    @XmlEnumValue("_revisionControl")
    REVISION_CONTROL("_revisionControl");
    private final String value;

    AssemblyItemEffectiveBomControl(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AssemblyItemEffectiveBomControl fromValue(String v) {
        for (AssemblyItemEffectiveBomControl c: AssemblyItemEffectiveBomControl.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
