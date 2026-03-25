
package com.netsuite.webservices.setup.customization.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomizationFieldType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomizationFieldType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_checkBox"/&gt;
 *     &lt;enumeration value="_currency"/&gt;
 *     &lt;enumeration value="_date"/&gt;
 *     &lt;enumeration value="_datetime"/&gt;
 *     &lt;enumeration value="_decimalNumber"/&gt;
 *     &lt;enumeration value="_document"/&gt;
 *     &lt;enumeration value="_eMailAddress"/&gt;
 *     &lt;enumeration value="_freeFormText"/&gt;
 *     &lt;enumeration value="_help"/&gt;
 *     &lt;enumeration value="_hyperlink"/&gt;
 *     &lt;enumeration value="_image"/&gt;
 *     &lt;enumeration value="_inlineHTML"/&gt;
 *     &lt;enumeration value="_integerNumber"/&gt;
 *     &lt;enumeration value="_listRecord"/&gt;
 *     &lt;enumeration value="_longText"/&gt;
 *     &lt;enumeration value="_multipleSelect"/&gt;
 *     &lt;enumeration value="_password"/&gt;
 *     &lt;enumeration value="_percent"/&gt;
 *     &lt;enumeration value="_phoneNumber"/&gt;
 *     &lt;enumeration value="_richText"/&gt;
 *     &lt;enumeration value="_textArea"/&gt;
 *     &lt;enumeration value="_timeOfDay"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CustomizationFieldType", namespace = "urn:types.customization_2014_2.setup.webservices.netsuite.com")
@XmlEnum
public enum CustomizationFieldType {

    @XmlEnumValue("_checkBox")
    CHECK_BOX("_checkBox"),
    @XmlEnumValue("_currency")
    CURRENCY("_currency"),
    @XmlEnumValue("_date")
    DATE("_date"),
    @XmlEnumValue("_datetime")
    DATETIME("_datetime"),
    @XmlEnumValue("_decimalNumber")
    DECIMAL_NUMBER("_decimalNumber"),
    @XmlEnumValue("_document")
    DOCUMENT("_document"),
    @XmlEnumValue("_eMailAddress")
    E_MAIL_ADDRESS("_eMailAddress"),
    @XmlEnumValue("_freeFormText")
    FREE_FORM_TEXT("_freeFormText"),
    @XmlEnumValue("_help")
    HELP("_help"),
    @XmlEnumValue("_hyperlink")
    HYPERLINK("_hyperlink"),
    @XmlEnumValue("_image")
    IMAGE("_image"),
    @XmlEnumValue("_inlineHTML")
    INLINE_HTML("_inlineHTML"),
    @XmlEnumValue("_integerNumber")
    INTEGER_NUMBER("_integerNumber"),
    @XmlEnumValue("_listRecord")
    LIST_RECORD("_listRecord"),
    @XmlEnumValue("_longText")
    LONG_TEXT("_longText"),
    @XmlEnumValue("_multipleSelect")
    MULTIPLE_SELECT("_multipleSelect"),
    @XmlEnumValue("_password")
    PASSWORD("_password"),
    @XmlEnumValue("_percent")
    PERCENT("_percent"),
    @XmlEnumValue("_phoneNumber")
    PHONE_NUMBER("_phoneNumber"),
    @XmlEnumValue("_richText")
    RICH_TEXT("_richText"),
    @XmlEnumValue("_textArea")
    TEXT_AREA("_textArea"),
    @XmlEnumValue("_timeOfDay")
    TIME_OF_DAY("_timeOfDay");
    private final String value;

    CustomizationFieldType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustomizationFieldType fromValue(String v) {
        for (CustomizationFieldType c: CustomizationFieldType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
