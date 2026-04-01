
package com.netsuite.webservices.lists.accounting.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemAccountMappingItemAccount.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemAccountMappingItemAccount"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_asset"/&gt;
 *     &lt;enumeration value="_costOfGoods"/&gt;
 *     &lt;enumeration value="_customerReturnVariance"/&gt;
 *     &lt;enumeration value="_deferral"/&gt;
 *     &lt;enumeration value="_deferredRevenue"/&gt;
 *     &lt;enumeration value="_discount"/&gt;
 *     &lt;enumeration value="_dropShipExpense"/&gt;
 *     &lt;enumeration value="_exchangeRateVariance"/&gt;
 *     &lt;enumeration value="_expense"/&gt;
 *     &lt;enumeration value="_gainLoss"/&gt;
 *     &lt;enumeration value="_income"/&gt;
 *     &lt;enumeration value="_liability"/&gt;
 *     &lt;enumeration value="_markup"/&gt;
 *     &lt;enumeration value="_payment"/&gt;
 *     &lt;enumeration value="_priceVariance"/&gt;
 *     &lt;enumeration value="_productionPriceVariance"/&gt;
 *     &lt;enumeration value="_productionQuantityVariance"/&gt;
 *     &lt;enumeration value="_purchasePriceVariance"/&gt;
 *     &lt;enumeration value="_quantityVariance"/&gt;
 *     &lt;enumeration value="_scrap"/&gt;
 *     &lt;enumeration value="_unbuildVariance"/&gt;
 *     &lt;enumeration value="_vendorReturnVariance"/&gt;
 *     &lt;enumeration value="_wipVariance"/&gt;
 *     &lt;enumeration value="_workInProcess"/&gt;
 *     &lt;enumeration value="_writeOff"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ItemAccountMappingItemAccount", namespace = "urn:types.accounting_2014_2.lists.webservices.netsuite.com")
@XmlEnum
public enum ItemAccountMappingItemAccount {

    @XmlEnumValue("_asset")
    ASSET("_asset"),
    @XmlEnumValue("_costOfGoods")
    COST_OF_GOODS("_costOfGoods"),
    @XmlEnumValue("_customerReturnVariance")
    CUSTOMER_RETURN_VARIANCE("_customerReturnVariance"),
    @XmlEnumValue("_deferral")
    DEFERRAL("_deferral"),
    @XmlEnumValue("_deferredRevenue")
    DEFERRED_REVENUE("_deferredRevenue"),
    @XmlEnumValue("_discount")
    DISCOUNT("_discount"),
    @XmlEnumValue("_dropShipExpense")
    DROP_SHIP_EXPENSE("_dropShipExpense"),
    @XmlEnumValue("_exchangeRateVariance")
    EXCHANGE_RATE_VARIANCE("_exchangeRateVariance"),
    @XmlEnumValue("_expense")
    EXPENSE("_expense"),
    @XmlEnumValue("_gainLoss")
    GAIN_LOSS("_gainLoss"),
    @XmlEnumValue("_income")
    INCOME("_income"),
    @XmlEnumValue("_liability")
    LIABILITY("_liability"),
    @XmlEnumValue("_markup")
    MARKUP("_markup"),
    @XmlEnumValue("_payment")
    PAYMENT("_payment"),
    @XmlEnumValue("_priceVariance")
    PRICE_VARIANCE("_priceVariance"),
    @XmlEnumValue("_productionPriceVariance")
    PRODUCTION_PRICE_VARIANCE("_productionPriceVariance"),
    @XmlEnumValue("_productionQuantityVariance")
    PRODUCTION_QUANTITY_VARIANCE("_productionQuantityVariance"),
    @XmlEnumValue("_purchasePriceVariance")
    PURCHASE_PRICE_VARIANCE("_purchasePriceVariance"),
    @XmlEnumValue("_quantityVariance")
    QUANTITY_VARIANCE("_quantityVariance"),
    @XmlEnumValue("_scrap")
    SCRAP("_scrap"),
    @XmlEnumValue("_unbuildVariance")
    UNBUILD_VARIANCE("_unbuildVariance"),
    @XmlEnumValue("_vendorReturnVariance")
    VENDOR_RETURN_VARIANCE("_vendorReturnVariance"),
    @XmlEnumValue("_wipVariance")
    WIP_VARIANCE("_wipVariance"),
    @XmlEnumValue("_workInProcess")
    WORK_IN_PROCESS("_workInProcess"),
    @XmlEnumValue("_writeOff")
    WRITE_OFF("_writeOff");
    private final String value;

    ItemAccountMappingItemAccount(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemAccountMappingItemAccount fromValue(String v) {
        for (ItemAccountMappingItemAccount c: ItemAccountMappingItemAccount.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
