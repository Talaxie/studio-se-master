
package com.netsuite.webservices.platform.core.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchMultiSelectFieldOperator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SearchMultiSelectFieldOperator"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="anyOf"/&gt;
 *     &lt;enumeration value="noneOf"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SearchMultiSelectFieldOperator", namespace = "urn:types.core_2014_2.platform.webservices.netsuite.com")
@XmlEnum
public enum SearchMultiSelectFieldOperator {

    @XmlEnumValue("anyOf")
    ANY_OF("anyOf"),
    @XmlEnumValue("noneOf")
    NONE_OF("noneOf");
    private final String value;

    SearchMultiSelectFieldOperator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchMultiSelectFieldOperator fromValue(String v) {
        for (SearchMultiSelectFieldOperator c: SearchMultiSelectFieldOperator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
