
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSRoutingRuleOperator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WSRoutingRuleOperator"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CONTAINS"/&gt;
 *     &lt;enumeration value="MATCHES"/&gt;
 *     &lt;enumeration value="STARTSWITH"/&gt;
 *     &lt;enumeration value="EQUALS"/&gt;
 *     &lt;enumeration value="NOT_EQUALS"/&gt;
 *     &lt;enumeration value="GREATER_THAN"/&gt;
 *     &lt;enumeration value="GREATER_THAN_OR_EQUAL"/&gt;
 *     &lt;enumeration value="LOWER_THAN"/&gt;
 *     &lt;enumeration value="LOWER_THAN_OR_EQUAL"/&gt;
 *     &lt;enumeration value="IS_NULL"/&gt;
 *     &lt;enumeration value="IS_NOT_NULL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WSRoutingRuleOperator")
@XmlEnum
public enum WSRoutingRuleOperator {

    CONTAINS,
    MATCHES,
    STARTSWITH,
    EQUALS,
    NOT_EQUALS,
    GREATER_THAN,
    GREATER_THAN_OR_EQUAL,
    LOWER_THAN,
    LOWER_THAN_OR_EQUAL,
    IS_NULL,
    IS_NOT_NULL;

    public String value() {
        return name();
    }

    public static WSRoutingRuleOperator fromValue(String v) {
        return valueOf(v);
    }

}
