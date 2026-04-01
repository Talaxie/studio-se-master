
package com.netsuite.webservices.setup.customization.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomRecordTypePermissionsRestriction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomRecordTypePermissionsRestriction"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_editingOnly"/&gt;
 *     &lt;enumeration value="_viewingAndEditing"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CustomRecordTypePermissionsRestriction", namespace = "urn:types.customization_2014_2.setup.webservices.netsuite.com")
@XmlEnum
public enum CustomRecordTypePermissionsRestriction {

    @XmlEnumValue("_editingOnly")
    EDITING_ONLY("_editingOnly"),
    @XmlEnumValue("_viewingAndEditing")
    VIEWING_AND_EDITING("_viewingAndEditing");
    private final String value;

    CustomRecordTypePermissionsRestriction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustomRecordTypePermissionsRestriction fromValue(String v) {
        for (CustomRecordTypePermissionsRestriction c: CustomRecordTypePermissionsRestriction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
