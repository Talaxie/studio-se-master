
package com.netsuite.webservices.lists.accounting.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemSupplyLotSizingMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemSupplyLotSizingMethod"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_fixedLotSize"/&gt;
 *     &lt;enumeration value="_lotForLot"/&gt;
 *     &lt;enumeration value="_periodsOfSupply"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ItemSupplyLotSizingMethod", namespace = "urn:types.accounting_2014_2.lists.webservices.netsuite.com")
@XmlEnum
public enum ItemSupplyLotSizingMethod {

    @XmlEnumValue("_fixedLotSize")
    FIXED_LOT_SIZE("_fixedLotSize"),
    @XmlEnumValue("_lotForLot")
    LOT_FOR_LOT("_lotForLot"),
    @XmlEnumValue("_periodsOfSupply")
    PERIODS_OF_SUPPLY("_periodsOfSupply");
    private final String value;

    ItemSupplyLotSizingMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemSupplyLotSizingMethod fromValue(String v) {
        for (ItemSupplyLotSizingMethod c: ItemSupplyLotSizingMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
