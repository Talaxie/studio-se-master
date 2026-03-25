
package com.netsuite.webservices.transactions.sales.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemFulfillmentLicenseExceptionUps.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemFulfillmentLicenseExceptionUps"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_agr"/&gt;
 *     &lt;enumeration value="_apr"/&gt;
 *     &lt;enumeration value="_avs"/&gt;
 *     &lt;enumeration value="_bag"/&gt;
 *     &lt;enumeration value="_civ"/&gt;
 *     &lt;enumeration value="_ctp"/&gt;
 *     &lt;enumeration value="_enc"/&gt;
 *     &lt;enumeration value="_gbs"/&gt;
 *     &lt;enumeration value="_gft"/&gt;
 *     &lt;enumeration value="_gov"/&gt;
 *     &lt;enumeration value="_kmi"/&gt;
 *     &lt;enumeration value="_lvs"/&gt;
 *     &lt;enumeration value="_nlr"/&gt;
 *     &lt;enumeration value="_rpl"/&gt;
 *     &lt;enumeration value="_tmp"/&gt;
 *     &lt;enumeration value="_tspa"/&gt;
 *     &lt;enumeration value="_tsr"/&gt;
 *     &lt;enumeration value="_tsu"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ItemFulfillmentLicenseExceptionUps", namespace = "urn:types.sales_2014_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum ItemFulfillmentLicenseExceptionUps {

    @XmlEnumValue("_agr")
    AGR("_agr"),
    @XmlEnumValue("_apr")
    APR("_apr"),
    @XmlEnumValue("_avs")
    AVS("_avs"),
    @XmlEnumValue("_bag")
    BAG("_bag"),
    @XmlEnumValue("_civ")
    CIV("_civ"),
    @XmlEnumValue("_ctp")
    CTP("_ctp"),
    @XmlEnumValue("_enc")
    ENC("_enc"),
    @XmlEnumValue("_gbs")
    GBS("_gbs"),
    @XmlEnumValue("_gft")
    GFT("_gft"),
    @XmlEnumValue("_gov")
    GOV("_gov"),
    @XmlEnumValue("_kmi")
    KMI("_kmi"),
    @XmlEnumValue("_lvs")
    LVS("_lvs"),
    @XmlEnumValue("_nlr")
    NLR("_nlr"),
    @XmlEnumValue("_rpl")
    RPL("_rpl"),
    @XmlEnumValue("_tmp")
    TMP("_tmp"),
    @XmlEnumValue("_tspa")
    TSPA("_tspa"),
    @XmlEnumValue("_tsr")
    TSR("_tsr"),
    @XmlEnumValue("_tsu")
    TSU("_tsu");
    private final String value;

    ItemFulfillmentLicenseExceptionUps(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemFulfillmentLicenseExceptionUps fromValue(String v) {
        for (ItemFulfillmentLicenseExceptionUps c: ItemFulfillmentLicenseExceptionUps.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
