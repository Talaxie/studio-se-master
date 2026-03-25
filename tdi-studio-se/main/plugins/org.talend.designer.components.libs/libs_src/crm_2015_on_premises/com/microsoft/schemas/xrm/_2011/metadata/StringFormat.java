
package com.microsoft.schemas.xrm._2011.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StringFormat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StringFormat">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Email"/>
 *     &lt;enumeration value="Text"/>
 *     &lt;enumeration value="TextArea"/>
 *     &lt;enumeration value="Url"/>
 *     &lt;enumeration value="TickerSymbol"/>
 *     &lt;enumeration value="PhoneticGuide"/>
 *     &lt;enumeration value="VersionNumber"/>
 *     &lt;enumeration value="Phone"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StringFormat")
@XmlEnum
public enum StringFormat {

    @XmlEnumValue("Email")
    EMAIL("Email"),
    @XmlEnumValue("Text")
    TEXT("Text"),
    @XmlEnumValue("TextArea")
    TEXT_AREA("TextArea"),
    @XmlEnumValue("Url")
    URL("Url"),
    @XmlEnumValue("TickerSymbol")
    TICKER_SYMBOL("TickerSymbol"),
    @XmlEnumValue("PhoneticGuide")
    PHONETIC_GUIDE("PhoneticGuide"),
    @XmlEnumValue("VersionNumber")
    VERSION_NUMBER("VersionNumber"),
    @XmlEnumValue("Phone")
    PHONE("Phone");
    private final String value;

    StringFormat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StringFormat fromValue(String v) {
        for (StringFormat c: StringFormat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
