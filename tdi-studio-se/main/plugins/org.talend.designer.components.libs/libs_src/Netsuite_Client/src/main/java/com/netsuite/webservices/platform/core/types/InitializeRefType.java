
package com.netsuite.webservices.platform.core.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InitializeRefType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InitializeRefType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="assemblyItem"/&gt;
 *     &lt;enumeration value="assemblyBuild"/&gt;
 *     &lt;enumeration value="cashSale"/&gt;
 *     &lt;enumeration value="creditMemo"/&gt;
 *     &lt;enumeration value="customer"/&gt;
 *     &lt;enumeration value="customerDeposit"/&gt;
 *     &lt;enumeration value="employee"/&gt;
 *     &lt;enumeration value="estimate"/&gt;
 *     &lt;enumeration value="interCompanyTransferOrder"/&gt;
 *     &lt;enumeration value="invoice"/&gt;
 *     &lt;enumeration value="location"/&gt;
 *     &lt;enumeration value="lotNumberedAssemblyItem"/&gt;
 *     &lt;enumeration value="opportunity"/&gt;
 *     &lt;enumeration value="purchaseOrder"/&gt;
 *     &lt;enumeration value="returnAuthorization"/&gt;
 *     &lt;enumeration value="salesOrder"/&gt;
 *     &lt;enumeration value="serializedAssemblyItem"/&gt;
 *     &lt;enumeration value="transferOrder"/&gt;
 *     &lt;enumeration value="vendor"/&gt;
 *     &lt;enumeration value="vendorBill"/&gt;
 *     &lt;enumeration value="vendorReturnAuthorization"/&gt;
 *     &lt;enumeration value="workOrder"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InitializeRefType", namespace = "urn:types.core_2014_2.platform.webservices.netsuite.com")
@XmlEnum
public enum InitializeRefType {

    @XmlEnumValue("assemblyItem")
    ASSEMBLY_ITEM("assemblyItem"),
    @XmlEnumValue("assemblyBuild")
    ASSEMBLY_BUILD("assemblyBuild"),
    @XmlEnumValue("cashSale")
    CASH_SALE("cashSale"),
    @XmlEnumValue("creditMemo")
    CREDIT_MEMO("creditMemo"),
    @XmlEnumValue("customer")
    CUSTOMER("customer"),
    @XmlEnumValue("customerDeposit")
    CUSTOMER_DEPOSIT("customerDeposit"),
    @XmlEnumValue("employee")
    EMPLOYEE("employee"),
    @XmlEnumValue("estimate")
    ESTIMATE("estimate"),
    @XmlEnumValue("interCompanyTransferOrder")
    INTER_COMPANY_TRANSFER_ORDER("interCompanyTransferOrder"),
    @XmlEnumValue("invoice")
    INVOICE("invoice"),
    @XmlEnumValue("location")
    LOCATION("location"),
    @XmlEnumValue("lotNumberedAssemblyItem")
    LOT_NUMBERED_ASSEMBLY_ITEM("lotNumberedAssemblyItem"),
    @XmlEnumValue("opportunity")
    OPPORTUNITY("opportunity"),
    @XmlEnumValue("purchaseOrder")
    PURCHASE_ORDER("purchaseOrder"),
    @XmlEnumValue("returnAuthorization")
    RETURN_AUTHORIZATION("returnAuthorization"),
    @XmlEnumValue("salesOrder")
    SALES_ORDER("salesOrder"),
    @XmlEnumValue("serializedAssemblyItem")
    SERIALIZED_ASSEMBLY_ITEM("serializedAssemblyItem"),
    @XmlEnumValue("transferOrder")
    TRANSFER_ORDER("transferOrder"),
    @XmlEnumValue("vendor")
    VENDOR("vendor"),
    @XmlEnumValue("vendorBill")
    VENDOR_BILL("vendorBill"),
    @XmlEnumValue("vendorReturnAuthorization")
    VENDOR_RETURN_AUTHORIZATION("vendorReturnAuthorization"),
    @XmlEnumValue("workOrder")
    WORK_ORDER("workOrder");
    private final String value;

    InitializeRefType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InitializeRefType fromValue(String v) {
        for (InitializeRefType c: InitializeRefType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
