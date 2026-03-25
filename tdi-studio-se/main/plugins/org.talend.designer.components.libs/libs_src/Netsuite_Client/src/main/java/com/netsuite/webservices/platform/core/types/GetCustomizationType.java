
package com.netsuite.webservices.platform.core.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCustomizationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GetCustomizationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="crmCustomField"/&gt;
 *     &lt;enumeration value="customList"/&gt;
 *     &lt;enumeration value="customRecordType"/&gt;
 *     &lt;enumeration value="entityCustomField"/&gt;
 *     &lt;enumeration value="itemCustomField"/&gt;
 *     &lt;enumeration value="itemNumberCustomField"/&gt;
 *     &lt;enumeration value="itemOptionCustomField"/&gt;
 *     &lt;enumeration value="otherCustomField"/&gt;
 *     &lt;enumeration value="transactionBodyCustomField"/&gt;
 *     &lt;enumeration value="transactionColumnCustomField"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GetCustomizationType", namespace = "urn:types.core_2014_2.platform.webservices.netsuite.com")
@XmlEnum
public enum GetCustomizationType {

    @XmlEnumValue("crmCustomField")
    CRM_CUSTOM_FIELD("crmCustomField"),
    @XmlEnumValue("customList")
    CUSTOM_LIST("customList"),
    @XmlEnumValue("customRecordType")
    CUSTOM_RECORD_TYPE("customRecordType"),
    @XmlEnumValue("entityCustomField")
    ENTITY_CUSTOM_FIELD("entityCustomField"),
    @XmlEnumValue("itemCustomField")
    ITEM_CUSTOM_FIELD("itemCustomField"),
    @XmlEnumValue("itemNumberCustomField")
    ITEM_NUMBER_CUSTOM_FIELD("itemNumberCustomField"),
    @XmlEnumValue("itemOptionCustomField")
    ITEM_OPTION_CUSTOM_FIELD("itemOptionCustomField"),
    @XmlEnumValue("otherCustomField")
    OTHER_CUSTOM_FIELD("otherCustomField"),
    @XmlEnumValue("transactionBodyCustomField")
    TRANSACTION_BODY_CUSTOM_FIELD("transactionBodyCustomField"),
    @XmlEnumValue("transactionColumnCustomField")
    TRANSACTION_COLUMN_CUSTOM_FIELD("transactionColumnCustomField");
    private final String value;

    GetCustomizationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GetCustomizationType fromValue(String v) {
        for (GetCustomizationType c: GetCustomizationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
