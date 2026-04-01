
package com.netsuite.webservices.transactions.sales.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionChargeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionChargeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_concession"/&gt;
 *     &lt;enumeration value="_fixedDate"/&gt;
 *     &lt;enumeration value="_fixedUsage"/&gt;
 *     &lt;enumeration value="_milestone"/&gt;
 *     &lt;enumeration value="_oneTime"/&gt;
 *     &lt;enumeration value="_penalty"/&gt;
 *     &lt;enumeration value="_projectProgress"/&gt;
 *     &lt;enumeration value="_recurringService"/&gt;
 *     &lt;enumeration value="_timeBased"/&gt;
 *     &lt;enumeration value="_variableUsage"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransactionChargeType", namespace = "urn:types.sales_2014_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum TransactionChargeType {

    @XmlEnumValue("_concession")
    CONCESSION("_concession"),
    @XmlEnumValue("_fixedDate")
    FIXED_DATE("_fixedDate"),
    @XmlEnumValue("_fixedUsage")
    FIXED_USAGE("_fixedUsage"),
    @XmlEnumValue("_milestone")
    MILESTONE("_milestone"),
    @XmlEnumValue("_oneTime")
    ONE_TIME("_oneTime"),
    @XmlEnumValue("_penalty")
    PENALTY("_penalty"),
    @XmlEnumValue("_projectProgress")
    PROJECT_PROGRESS("_projectProgress"),
    @XmlEnumValue("_recurringService")
    RECURRING_SERVICE("_recurringService"),
    @XmlEnumValue("_timeBased")
    TIME_BASED("_timeBased"),
    @XmlEnumValue("_variableUsage")
    VARIABLE_USAGE("_variableUsage");
    private final String value;

    TransactionChargeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionChargeType fromValue(String v) {
        for (TransactionChargeType c: TransactionChargeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
