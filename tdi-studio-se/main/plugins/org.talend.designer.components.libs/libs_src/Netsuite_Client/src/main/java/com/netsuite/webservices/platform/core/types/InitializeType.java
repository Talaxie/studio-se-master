
package com.netsuite.webservices.platform.core.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InitializeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InitializeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="assemblyBuild"/&gt;
 *     &lt;enumeration value="assemblyUnbuild"/&gt;
 *     &lt;enumeration value="binWorksheet"/&gt;
 *     &lt;enumeration value="cashRefund"/&gt;
 *     &lt;enumeration value="cashSale"/&gt;
 *     &lt;enumeration value="creditMemo"/&gt;
 *     &lt;enumeration value="customerPayment"/&gt;
 *     &lt;enumeration value="customerRefund"/&gt;
 *     &lt;enumeration value="depositApplication"/&gt;
 *     &lt;enumeration value="estimate"/&gt;
 *     &lt;enumeration value="invoice"/&gt;
 *     &lt;enumeration value="itemFulfillment"/&gt;
 *     &lt;enumeration value="itemReceipt"/&gt;
 *     &lt;enumeration value="inventoryTransfer"/&gt;
 *     &lt;enumeration value="returnAuthorization"/&gt;
 *     &lt;enumeration value="salesOrder"/&gt;
 *     &lt;enumeration value="vendorBill"/&gt;
 *     &lt;enumeration value="vendorCredit"/&gt;
 *     &lt;enumeration value="vendorReturnAuthorization"/&gt;
 *     &lt;enumeration value="vendorPayment"/&gt;
 *     &lt;enumeration value="workOrder"/&gt;
 *     &lt;enumeration value="workOrderIssue"/&gt;
 *     &lt;enumeration value="workOrderCompletion"/&gt;
 *     &lt;enumeration value="workOrderClose"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InitializeType", namespace = "urn:types.core_2014_2.platform.webservices.netsuite.com")
@XmlEnum
public enum InitializeType {

    @XmlEnumValue("assemblyBuild")
    ASSEMBLY_BUILD("assemblyBuild"),
    @XmlEnumValue("assemblyUnbuild")
    ASSEMBLY_UNBUILD("assemblyUnbuild"),
    @XmlEnumValue("binWorksheet")
    BIN_WORKSHEET("binWorksheet"),
    @XmlEnumValue("cashRefund")
    CASH_REFUND("cashRefund"),
    @XmlEnumValue("cashSale")
    CASH_SALE("cashSale"),
    @XmlEnumValue("creditMemo")
    CREDIT_MEMO("creditMemo"),
    @XmlEnumValue("customerPayment")
    CUSTOMER_PAYMENT("customerPayment"),
    @XmlEnumValue("customerRefund")
    CUSTOMER_REFUND("customerRefund"),
    @XmlEnumValue("depositApplication")
    DEPOSIT_APPLICATION("depositApplication"),
    @XmlEnumValue("estimate")
    ESTIMATE("estimate"),
    @XmlEnumValue("invoice")
    INVOICE("invoice"),
    @XmlEnumValue("itemFulfillment")
    ITEM_FULFILLMENT("itemFulfillment"),
    @XmlEnumValue("itemReceipt")
    ITEM_RECEIPT("itemReceipt"),
    @XmlEnumValue("inventoryTransfer")
    INVENTORY_TRANSFER("inventoryTransfer"),
    @XmlEnumValue("returnAuthorization")
    RETURN_AUTHORIZATION("returnAuthorization"),
    @XmlEnumValue("salesOrder")
    SALES_ORDER("salesOrder"),
    @XmlEnumValue("vendorBill")
    VENDOR_BILL("vendorBill"),
    @XmlEnumValue("vendorCredit")
    VENDOR_CREDIT("vendorCredit"),
    @XmlEnumValue("vendorReturnAuthorization")
    VENDOR_RETURN_AUTHORIZATION("vendorReturnAuthorization"),
    @XmlEnumValue("vendorPayment")
    VENDOR_PAYMENT("vendorPayment"),
    @XmlEnumValue("workOrder")
    WORK_ORDER("workOrder"),
    @XmlEnumValue("workOrderIssue")
    WORK_ORDER_ISSUE("workOrderIssue"),
    @XmlEnumValue("workOrderCompletion")
    WORK_ORDER_COMPLETION("workOrderCompletion"),
    @XmlEnumValue("workOrderClose")
    WORK_ORDER_CLOSE("workOrderClose");
    private final String value;

    InitializeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InitializeType fromValue(String v) {
        for (InitializeType c: InitializeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
