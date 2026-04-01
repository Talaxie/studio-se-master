
package com.netsuite.webservices.transactions.financial.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BudgetBudgetType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BudgetBudgetType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_global"/&gt;
 *     &lt;enumeration value="_local"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BudgetBudgetType", namespace = "urn:types.financial_2014_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum BudgetBudgetType {

    @XmlEnumValue("_global")
    GLOBAL("_global"),
    @XmlEnumValue("_local")
    LOCAL("_local");
    private final String value;

    BudgetBudgetType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BudgetBudgetType fromValue(String v) {
        for (BudgetBudgetType c: BudgetBudgetType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
