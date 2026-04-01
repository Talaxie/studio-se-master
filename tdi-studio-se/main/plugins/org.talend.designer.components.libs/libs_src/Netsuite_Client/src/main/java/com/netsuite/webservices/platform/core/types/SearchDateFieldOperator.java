
package com.netsuite.webservices.platform.core.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchDateFieldOperator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SearchDateFieldOperator"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="after"/&gt;
 *     &lt;enumeration value="before"/&gt;
 *     &lt;enumeration value="empty"/&gt;
 *     &lt;enumeration value="notAfter"/&gt;
 *     &lt;enumeration value="notBefore"/&gt;
 *     &lt;enumeration value="notEmpty"/&gt;
 *     &lt;enumeration value="notOn"/&gt;
 *     &lt;enumeration value="notOnOrAfter"/&gt;
 *     &lt;enumeration value="notOnOrBefore"/&gt;
 *     &lt;enumeration value="notWithin"/&gt;
 *     &lt;enumeration value="on"/&gt;
 *     &lt;enumeration value="onOrAfter"/&gt;
 *     &lt;enumeration value="onOrBefore"/&gt;
 *     &lt;enumeration value="within"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SearchDateFieldOperator", namespace = "urn:types.core_2014_2.platform.webservices.netsuite.com")
@XmlEnum
public enum SearchDateFieldOperator {

    @XmlEnumValue("after")
    AFTER("after"),
    @XmlEnumValue("before")
    BEFORE("before"),
    @XmlEnumValue("empty")
    EMPTY("empty"),
    @XmlEnumValue("notAfter")
    NOT_AFTER("notAfter"),
    @XmlEnumValue("notBefore")
    NOT_BEFORE("notBefore"),
    @XmlEnumValue("notEmpty")
    NOT_EMPTY("notEmpty"),
    @XmlEnumValue("notOn")
    NOT_ON("notOn"),
    @XmlEnumValue("notOnOrAfter")
    NOT_ON_OR_AFTER("notOnOrAfter"),
    @XmlEnumValue("notOnOrBefore")
    NOT_ON_OR_BEFORE("notOnOrBefore"),
    @XmlEnumValue("notWithin")
    NOT_WITHIN("notWithin"),
    @XmlEnumValue("on")
    ON("on"),
    @XmlEnumValue("onOrAfter")
    ON_OR_AFTER("onOrAfter"),
    @XmlEnumValue("onOrBefore")
    ON_OR_BEFORE("onOrBefore"),
    @XmlEnumValue("within")
    WITHIN("within");
    private final String value;

    SearchDateFieldOperator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchDateFieldOperator fromValue(String v) {
        for (SearchDateFieldOperator c: SearchDateFieldOperator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
