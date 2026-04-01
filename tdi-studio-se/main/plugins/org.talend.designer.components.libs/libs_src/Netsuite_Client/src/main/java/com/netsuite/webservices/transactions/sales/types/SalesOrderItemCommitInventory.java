
package com.netsuite.webservices.transactions.sales.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SalesOrderItemCommitInventory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SalesOrderItemCommitInventory"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_availableQty"/&gt;
 *     &lt;enumeration value="_completeQty"/&gt;
 *     &lt;enumeration value="_doNotCommit"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SalesOrderItemCommitInventory", namespace = "urn:types.sales_2014_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum SalesOrderItemCommitInventory {

    @XmlEnumValue("_availableQty")
    AVAILABLE_QTY("_availableQty"),
    @XmlEnumValue("_completeQty")
    COMPLETE_QTY("_completeQty"),
    @XmlEnumValue("_doNotCommit")
    DO_NOT_COMMIT("_doNotCommit");
    private final String value;

    SalesOrderItemCommitInventory(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SalesOrderItemCommitInventory fromValue(String v) {
        for (SalesOrderItemCommitInventory c: SalesOrderItemCommitInventory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
