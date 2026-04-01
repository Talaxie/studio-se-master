
package com.netsuite.webservices.transactions.sales.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemFulfillmentThirdPartyTypeUps.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemFulfillmentThirdPartyTypeUps"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_consigneeBilling"/&gt;
 *     &lt;enumeration value="_noneSelected"/&gt;
 *     &lt;enumeration value="_thirdPartyBilling"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ItemFulfillmentThirdPartyTypeUps", namespace = "urn:types.sales_2014_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum ItemFulfillmentThirdPartyTypeUps {

    @XmlEnumValue("_consigneeBilling")
    CONSIGNEE_BILLING("_consigneeBilling"),
    @XmlEnumValue("_noneSelected")
    NONE_SELECTED("_noneSelected"),
    @XmlEnumValue("_thirdPartyBilling")
    THIRD_PARTY_BILLING("_thirdPartyBilling");
    private final String value;

    ItemFulfillmentThirdPartyTypeUps(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemFulfillmentThirdPartyTypeUps fromValue(String v) {
        for (ItemFulfillmentThirdPartyTypeUps c: ItemFulfillmentThirdPartyTypeUps.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
