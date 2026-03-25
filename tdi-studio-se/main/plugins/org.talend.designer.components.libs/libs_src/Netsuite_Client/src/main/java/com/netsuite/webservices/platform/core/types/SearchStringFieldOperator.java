
package com.netsuite.webservices.platform.core.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchStringFieldOperator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SearchStringFieldOperator"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="contains"/&gt;
 *     &lt;enumeration value="doesNotContain"/&gt;
 *     &lt;enumeration value="doesNotStartWith"/&gt;
 *     &lt;enumeration value="empty"/&gt;
 *     &lt;enumeration value="hasKeywords"/&gt;
 *     &lt;enumeration value="is"/&gt;
 *     &lt;enumeration value="isNot"/&gt;
 *     &lt;enumeration value="notEmpty"/&gt;
 *     &lt;enumeration value="startsWith"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SearchStringFieldOperator", namespace = "urn:types.core_2014_2.platform.webservices.netsuite.com")
@XmlEnum
public enum SearchStringFieldOperator {

    @XmlEnumValue("contains")
    CONTAINS("contains"),
    @XmlEnumValue("doesNotContain")
    DOES_NOT_CONTAIN("doesNotContain"),
    @XmlEnumValue("doesNotStartWith")
    DOES_NOT_START_WITH("doesNotStartWith"),
    @XmlEnumValue("empty")
    EMPTY("empty"),
    @XmlEnumValue("hasKeywords")
    HAS_KEYWORDS("hasKeywords"),
    @XmlEnumValue("is")
    IS("is"),
    @XmlEnumValue("isNot")
    IS_NOT("isNot"),
    @XmlEnumValue("notEmpty")
    NOT_EMPTY("notEmpty"),
    @XmlEnumValue("startsWith")
    STARTS_WITH("startsWith");
    private final String value;

    SearchStringFieldOperator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchStringFieldOperator fromValue(String v) {
        for (SearchStringFieldOperator c: SearchStringFieldOperator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
