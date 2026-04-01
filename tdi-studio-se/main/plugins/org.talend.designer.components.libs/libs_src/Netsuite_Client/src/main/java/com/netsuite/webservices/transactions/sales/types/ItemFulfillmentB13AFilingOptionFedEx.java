
package com.netsuite.webservices.transactions.sales.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemFulfillmentB13AFilingOptionFedEx.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemFulfillmentB13AFilingOptionFedEx"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_filedElectronically"/&gt;
 *     &lt;enumeration value="_manuallyAttached"/&gt;
 *     &lt;enumeration value="_notRequired"/&gt;
 *     &lt;enumeration value="_summaryReporting"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ItemFulfillmentB13AFilingOptionFedEx", namespace = "urn:types.sales_2014_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum ItemFulfillmentB13AFilingOptionFedEx {

    @XmlEnumValue("_filedElectronically")
    FILED_ELECTRONICALLY("_filedElectronically"),
    @XmlEnumValue("_manuallyAttached")
    MANUALLY_ATTACHED("_manuallyAttached"),
    @XmlEnumValue("_notRequired")
    NOT_REQUIRED("_notRequired"),
    @XmlEnumValue("_summaryReporting")
    SUMMARY_REPORTING("_summaryReporting");
    private final String value;

    ItemFulfillmentB13AFilingOptionFedEx(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemFulfillmentB13AFilingOptionFedEx fromValue(String v) {
        for (ItemFulfillmentB13AFilingOptionFedEx c: ItemFulfillmentB13AFilingOptionFedEx.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
