
package com.netsuite.webservices.lists.relationships.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerNumberFormat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomerNumberFormat"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_spaceAsDigitGroupSeparatorAndDecimalComma"/&gt;
 *     &lt;enumeration value="_spaceAsDigitGroupSeparatorAndDecimalPoint"/&gt;
 *     &lt;enumeration value="_commaAsDigitGroupSeparatorAndDecimalPoint"/&gt;
 *     &lt;enumeration value="_pointAsDigitGroupSeparatorAndDecimalComma"/&gt;
 *     &lt;enumeration value="_apostropheAsDigitGroupSeparatorAndDecimalComma"/&gt;
 *     &lt;enumeration value="_apostropheAsDigitGroupSeparatorAndDecimalPoint"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CustomerNumberFormat", namespace = "urn:types.relationships_2014_2.lists.webservices.netsuite.com")
@XmlEnum
public enum CustomerNumberFormat {

    @XmlEnumValue("_spaceAsDigitGroupSeparatorAndDecimalComma")
    SPACE_AS_DIGIT_GROUP_SEPARATOR_AND_DECIMAL_COMMA("_spaceAsDigitGroupSeparatorAndDecimalComma"),
    @XmlEnumValue("_spaceAsDigitGroupSeparatorAndDecimalPoint")
    SPACE_AS_DIGIT_GROUP_SEPARATOR_AND_DECIMAL_POINT("_spaceAsDigitGroupSeparatorAndDecimalPoint"),
    @XmlEnumValue("_commaAsDigitGroupSeparatorAndDecimalPoint")
    COMMA_AS_DIGIT_GROUP_SEPARATOR_AND_DECIMAL_POINT("_commaAsDigitGroupSeparatorAndDecimalPoint"),
    @XmlEnumValue("_pointAsDigitGroupSeparatorAndDecimalComma")
    POINT_AS_DIGIT_GROUP_SEPARATOR_AND_DECIMAL_COMMA("_pointAsDigitGroupSeparatorAndDecimalComma"),
    @XmlEnumValue("_apostropheAsDigitGroupSeparatorAndDecimalComma")
    APOSTROPHE_AS_DIGIT_GROUP_SEPARATOR_AND_DECIMAL_COMMA("_apostropheAsDigitGroupSeparatorAndDecimalComma"),
    @XmlEnumValue("_apostropheAsDigitGroupSeparatorAndDecimalPoint")
    APOSTROPHE_AS_DIGIT_GROUP_SEPARATOR_AND_DECIMAL_POINT("_apostropheAsDigitGroupSeparatorAndDecimalPoint");
    private final String value;

    CustomerNumberFormat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustomerNumberFormat fromValue(String v) {
        for (CustomerNumberFormat c: CustomerNumberFormat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
