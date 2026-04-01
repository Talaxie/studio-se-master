
package com.netsuite.webservices.transactions.sales.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemFulfillmentMethodOfTransportUps.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemFulfillmentMethodOfTransportUps"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_air"/&gt;
 *     &lt;enumeration value="_airContainerized"/&gt;
 *     &lt;enumeration value="_auto"/&gt;
 *     &lt;enumeration value="_fixedTransportInstallations"/&gt;
 *     &lt;enumeration value="_mail"/&gt;
 *     &lt;enumeration value="_passengerHandcarried"/&gt;
 *     &lt;enumeration value="_pedestrian"/&gt;
 *     &lt;enumeration value="_rail"/&gt;
 *     &lt;enumeration value="_railContainerized"/&gt;
 *     &lt;enumeration value="_roadOther"/&gt;
 *     &lt;enumeration value="_seaBarge"/&gt;
 *     &lt;enumeration value="_seaContainerized"/&gt;
 *     &lt;enumeration value="_seaNoncontainerized"/&gt;
 *     &lt;enumeration value="_truck"/&gt;
 *     &lt;enumeration value="_truckContainerized"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ItemFulfillmentMethodOfTransportUps", namespace = "urn:types.sales_2014_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum ItemFulfillmentMethodOfTransportUps {

    @XmlEnumValue("_air")
    AIR("_air"),
    @XmlEnumValue("_airContainerized")
    AIR_CONTAINERIZED("_airContainerized"),
    @XmlEnumValue("_auto")
    AUTO("_auto"),
    @XmlEnumValue("_fixedTransportInstallations")
    FIXED_TRANSPORT_INSTALLATIONS("_fixedTransportInstallations"),
    @XmlEnumValue("_mail")
    MAIL("_mail"),
    @XmlEnumValue("_passengerHandcarried")
    PASSENGER_HANDCARRIED("_passengerHandcarried"),
    @XmlEnumValue("_pedestrian")
    PEDESTRIAN("_pedestrian"),
    @XmlEnumValue("_rail")
    RAIL("_rail"),
    @XmlEnumValue("_railContainerized")
    RAIL_CONTAINERIZED("_railContainerized"),
    @XmlEnumValue("_roadOther")
    ROAD_OTHER("_roadOther"),
    @XmlEnumValue("_seaBarge")
    SEA_BARGE("_seaBarge"),
    @XmlEnumValue("_seaContainerized")
    SEA_CONTAINERIZED("_seaContainerized"),
    @XmlEnumValue("_seaNoncontainerized")
    SEA_NONCONTAINERIZED("_seaNoncontainerized"),
    @XmlEnumValue("_truck")
    TRUCK("_truck"),
    @XmlEnumValue("_truckContainerized")
    TRUCK_CONTAINERIZED("_truckContainerized");
    private final String value;

    ItemFulfillmentMethodOfTransportUps(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemFulfillmentMethodOfTransportUps fromValue(String v) {
        for (ItemFulfillmentMethodOfTransportUps c: ItemFulfillmentMethodOfTransportUps.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
