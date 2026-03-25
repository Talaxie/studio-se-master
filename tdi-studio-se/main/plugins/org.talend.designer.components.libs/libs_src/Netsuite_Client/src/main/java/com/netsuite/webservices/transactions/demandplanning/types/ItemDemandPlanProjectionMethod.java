
package com.netsuite.webservices.transactions.demandplanning.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemDemandPlanProjectionMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemDemandPlanProjectionMethod"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_linearRegression"/&gt;
 *     &lt;enumeration value="_movingAverage"/&gt;
 *     &lt;enumeration value="_salesForecast"/&gt;
 *     &lt;enumeration value="_seasonalAverage"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ItemDemandPlanProjectionMethod", namespace = "urn:types.demandplanning_2014_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum ItemDemandPlanProjectionMethod {

    @XmlEnumValue("_linearRegression")
    LINEAR_REGRESSION("_linearRegression"),
    @XmlEnumValue("_movingAverage")
    MOVING_AVERAGE("_movingAverage"),
    @XmlEnumValue("_salesForecast")
    SALES_FORECAST("_salesForecast"),
    @XmlEnumValue("_seasonalAverage")
    SEASONAL_AVERAGE("_seasonalAverage");
    private final String value;

    ItemDemandPlanProjectionMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemDemandPlanProjectionMethod fromValue(String v) {
        for (ItemDemandPlanProjectionMethod c: ItemDemandPlanProjectionMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
