
package com.netsuite.webservices.transactions.sales.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemFulfillmentPackageFedExAdmPackageTypeFedEx.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemFulfillmentPackageFedExAdmPackageTypeFedEx"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_bag"/&gt;
 *     &lt;enumeration value="_barrel"/&gt;
 *     &lt;enumeration value="_basketOrHamper"/&gt;
 *     &lt;enumeration value="_box"/&gt;
 *     &lt;enumeration value="_bucket"/&gt;
 *     &lt;enumeration value="_bundle"/&gt;
 *     &lt;enumeration value="_cage"/&gt;
 *     &lt;enumeration value="_carton"/&gt;
 *     &lt;enumeration value="_case"/&gt;
 *     &lt;enumeration value="_chest"/&gt;
 *     &lt;enumeration value="_container"/&gt;
 *     &lt;enumeration value="_crate"/&gt;
 *     &lt;enumeration value="_cylinder"/&gt;
 *     &lt;enumeration value="_drum"/&gt;
 *     &lt;enumeration value="_envelope"/&gt;
 *     &lt;enumeration value="_package"/&gt;
 *     &lt;enumeration value="_pail"/&gt;
 *     &lt;enumeration value="_pallet"/&gt;
 *     &lt;enumeration value="_parcel"/&gt;
 *     &lt;enumeration value="_pieces"/&gt;
 *     &lt;enumeration value="_reel"/&gt;
 *     &lt;enumeration value="_roll"/&gt;
 *     &lt;enumeration value="_sack"/&gt;
 *     &lt;enumeration value="_shrinkWrapped"/&gt;
 *     &lt;enumeration value="_skid"/&gt;
 *     &lt;enumeration value="_tank"/&gt;
 *     &lt;enumeration value="_toteBin"/&gt;
 *     &lt;enumeration value="_tube"/&gt;
 *     &lt;enumeration value="_unit"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ItemFulfillmentPackageFedExAdmPackageTypeFedEx", namespace = "urn:types.sales_2014_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum ItemFulfillmentPackageFedExAdmPackageTypeFedEx {

    @XmlEnumValue("_bag")
    BAG("_bag"),
    @XmlEnumValue("_barrel")
    BARREL("_barrel"),
    @XmlEnumValue("_basketOrHamper")
    BASKET_OR_HAMPER("_basketOrHamper"),
    @XmlEnumValue("_box")
    BOX("_box"),
    @XmlEnumValue("_bucket")
    BUCKET("_bucket"),
    @XmlEnumValue("_bundle")
    BUNDLE("_bundle"),
    @XmlEnumValue("_cage")
    CAGE("_cage"),
    @XmlEnumValue("_carton")
    CARTON("_carton"),
    @XmlEnumValue("_case")
    CASE("_case"),
    @XmlEnumValue("_chest")
    CHEST("_chest"),
    @XmlEnumValue("_container")
    CONTAINER("_container"),
    @XmlEnumValue("_crate")
    CRATE("_crate"),
    @XmlEnumValue("_cylinder")
    CYLINDER("_cylinder"),
    @XmlEnumValue("_drum")
    DRUM("_drum"),
    @XmlEnumValue("_envelope")
    ENVELOPE("_envelope"),
    @XmlEnumValue("_package")
    PACKAGE("_package"),
    @XmlEnumValue("_pail")
    PAIL("_pail"),
    @XmlEnumValue("_pallet")
    PALLET("_pallet"),
    @XmlEnumValue("_parcel")
    PARCEL("_parcel"),
    @XmlEnumValue("_pieces")
    PIECES("_pieces"),
    @XmlEnumValue("_reel")
    REEL("_reel"),
    @XmlEnumValue("_roll")
    ROLL("_roll"),
    @XmlEnumValue("_sack")
    SACK("_sack"),
    @XmlEnumValue("_shrinkWrapped")
    SHRINK_WRAPPED("_shrinkWrapped"),
    @XmlEnumValue("_skid")
    SKID("_skid"),
    @XmlEnumValue("_tank")
    TANK("_tank"),
    @XmlEnumValue("_toteBin")
    TOTE_BIN("_toteBin"),
    @XmlEnumValue("_tube")
    TUBE("_tube"),
    @XmlEnumValue("_unit")
    UNIT("_unit");
    private final String value;

    ItemFulfillmentPackageFedExAdmPackageTypeFedEx(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemFulfillmentPackageFedExAdmPackageTypeFedEx fromValue(String v) {
        for (ItemFulfillmentPackageFedExAdmPackageTypeFedEx c: ItemFulfillmentPackageFedExAdmPackageTypeFedEx.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
