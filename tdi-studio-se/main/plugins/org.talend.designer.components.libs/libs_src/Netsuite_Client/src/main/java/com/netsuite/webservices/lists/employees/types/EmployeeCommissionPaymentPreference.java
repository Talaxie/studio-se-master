
package com.netsuite.webservices.lists.employees.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmployeeCommissionPaymentPreference.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EmployeeCommissionPaymentPreference"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_accountsPayable"/&gt;
 *     &lt;enumeration value="_payroll"/&gt;
 *     &lt;enumeration value="_systemPreference"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EmployeeCommissionPaymentPreference", namespace = "urn:types.employees_2014_2.lists.webservices.netsuite.com")
@XmlEnum
public enum EmployeeCommissionPaymentPreference {

    @XmlEnumValue("_accountsPayable")
    ACCOUNTS_PAYABLE("_accountsPayable"),
    @XmlEnumValue("_payroll")
    PAYROLL("_payroll"),
    @XmlEnumValue("_systemPreference")
    SYSTEM_PREFERENCE("_systemPreference");
    private final String value;

    EmployeeCommissionPaymentPreference(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EmployeeCommissionPaymentPreference fromValue(String v) {
        for (EmployeeCommissionPaymentPreference c: EmployeeCommissionPaymentPreference.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
