
package com.netsuite.webservices.lists.employees.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmployeePayFrequency.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EmployeePayFrequency"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_annually"/&gt;
 *     &lt;enumeration value="_custom"/&gt;
 *     &lt;enumeration value="_daily"/&gt;
 *     &lt;enumeration value="_endOfPeriod"/&gt;
 *     &lt;enumeration value="_everyFourWeeks"/&gt;
 *     &lt;enumeration value="_everyThreeYears"/&gt;
 *     &lt;enumeration value="_everyTwoMonths"/&gt;
 *     &lt;enumeration value="_everyTwoWeeks"/&gt;
 *     &lt;enumeration value="_everyTwoYears"/&gt;
 *     &lt;enumeration value="_hourly"/&gt;
 *     &lt;enumeration value="_monthly"/&gt;
 *     &lt;enumeration value="_never"/&gt;
 *     &lt;enumeration value="_oneTime"/&gt;
 *     &lt;enumeration value="_quarterly"/&gt;
 *     &lt;enumeration value="_startOfPeriod"/&gt;
 *     &lt;enumeration value="_twiceAMonth"/&gt;
 *     &lt;enumeration value="_twiceAYear"/&gt;
 *     &lt;enumeration value="_weekly"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EmployeePayFrequency", namespace = "urn:types.employees_2014_2.lists.webservices.netsuite.com")
@XmlEnum
public enum EmployeePayFrequency {

    @XmlEnumValue("_annually")
    ANNUALLY("_annually"),
    @XmlEnumValue("_custom")
    CUSTOM("_custom"),
    @XmlEnumValue("_daily")
    DAILY("_daily"),
    @XmlEnumValue("_endOfPeriod")
    END_OF_PERIOD("_endOfPeriod"),
    @XmlEnumValue("_everyFourWeeks")
    EVERY_FOUR_WEEKS("_everyFourWeeks"),
    @XmlEnumValue("_everyThreeYears")
    EVERY_THREE_YEARS("_everyThreeYears"),
    @XmlEnumValue("_everyTwoMonths")
    EVERY_TWO_MONTHS("_everyTwoMonths"),
    @XmlEnumValue("_everyTwoWeeks")
    EVERY_TWO_WEEKS("_everyTwoWeeks"),
    @XmlEnumValue("_everyTwoYears")
    EVERY_TWO_YEARS("_everyTwoYears"),
    @XmlEnumValue("_hourly")
    HOURLY("_hourly"),
    @XmlEnumValue("_monthly")
    MONTHLY("_monthly"),
    @XmlEnumValue("_never")
    NEVER("_never"),
    @XmlEnumValue("_oneTime")
    ONE_TIME("_oneTime"),
    @XmlEnumValue("_quarterly")
    QUARTERLY("_quarterly"),
    @XmlEnumValue("_startOfPeriod")
    START_OF_PERIOD("_startOfPeriod"),
    @XmlEnumValue("_twiceAMonth")
    TWICE_A_MONTH("_twiceAMonth"),
    @XmlEnumValue("_twiceAYear")
    TWICE_A_YEAR("_twiceAYear"),
    @XmlEnumValue("_weekly")
    WEEKLY("_weekly");
    private final String value;

    EmployeePayFrequency(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EmployeePayFrequency fromValue(String v) {
        for (EmployeePayFrequency c: EmployeePayFrequency.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
