
package com.netsuite.webservices.lists.accounting.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillingScheduleRecurrenceRecurrenceUnits.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BillingScheduleRecurrenceRecurrenceUnits"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_custom"/&gt;
 *     &lt;enumeration value="_days"/&gt;
 *     &lt;enumeration value="_months"/&gt;
 *     &lt;enumeration value="_weeks"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BillingScheduleRecurrenceRecurrenceUnits", namespace = "urn:types.accounting_2014_2.lists.webservices.netsuite.com")
@XmlEnum
public enum BillingScheduleRecurrenceRecurrenceUnits {

    @XmlEnumValue("_custom")
    CUSTOM("_custom"),
    @XmlEnumValue("_days")
    DAYS("_days"),
    @XmlEnumValue("_months")
    MONTHS("_months"),
    @XmlEnumValue("_weeks")
    WEEKS("_weeks");
    private final String value;

    BillingScheduleRecurrenceRecurrenceUnits(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BillingScheduleRecurrenceRecurrenceUnits fromValue(String v) {
        for (BillingScheduleRecurrenceRecurrenceUnits c: BillingScheduleRecurrenceRecurrenceUnits.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
