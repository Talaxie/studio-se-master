
package com.netsuite.webservices.lists.accounting.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RevRecScheduleRecurrenceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RevRecScheduleRecurrenceType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_custom"/&gt;
 *     &lt;enumeration value="_straightLineByEvenPeriods"/&gt;
 *     &lt;enumeration value="_straightLineProrateFirstAndLastPeriod"/&gt;
 *     &lt;enumeration value="_straightLineProrateFirstAndLastPeriodPeriodRate"/&gt;
 *     &lt;enumeration value="_straightLineUsingExactDays"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RevRecScheduleRecurrenceType", namespace = "urn:types.accounting_2014_2.lists.webservices.netsuite.com")
@XmlEnum
public enum RevRecScheduleRecurrenceType {

    @XmlEnumValue("_custom")
    CUSTOM("_custom"),
    @XmlEnumValue("_straightLineByEvenPeriods")
    STRAIGHT_LINE_BY_EVEN_PERIODS("_straightLineByEvenPeriods"),
    @XmlEnumValue("_straightLineProrateFirstAndLastPeriod")
    STRAIGHT_LINE_PRORATE_FIRST_AND_LAST_PERIOD("_straightLineProrateFirstAndLastPeriod"),
    @XmlEnumValue("_straightLineProrateFirstAndLastPeriodPeriodRate")
    STRAIGHT_LINE_PRORATE_FIRST_AND_LAST_PERIOD_PERIOD_RATE("_straightLineProrateFirstAndLastPeriodPeriodRate"),
    @XmlEnumValue("_straightLineUsingExactDays")
    STRAIGHT_LINE_USING_EXACT_DAYS("_straightLineUsingExactDays");
    private final String value;

    RevRecScheduleRecurrenceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RevRecScheduleRecurrenceType fromValue(String v) {
        for (RevRecScheduleRecurrenceType c: RevRecScheduleRecurrenceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
