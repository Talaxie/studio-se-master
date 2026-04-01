
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSWhereOperator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WSWhereOperator"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="JOIN"/&gt;
 *     &lt;enumeration value="CONTAINS"/&gt;
 *     &lt;enumeration value="CONTAINS_SENTENCE"/&gt;
 *     &lt;enumeration value="STARTSWITH"/&gt;
 *     &lt;enumeration value="EQUALS"/&gt;
 *     &lt;enumeration value="NOT_EQUALS"/&gt;
 *     &lt;enumeration value="GREATER_THAN"/&gt;
 *     &lt;enumeration value="GREATER_THAN_OR_EQUAL"/&gt;
 *     &lt;enumeration value="LOWER_THAN"/&gt;
 *     &lt;enumeration value="LOWER_THAN_OR_EQUAL"/&gt;
 *     &lt;enumeration value="NO_OPERATOR"/&gt;
 *     &lt;enumeration value="FULLTEXTSEARCH"/&gt;
 *     &lt;enumeration value="EMPTY_NULL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WSWhereOperator")
@XmlEnum
public enum WSWhereOperator {

    JOIN,
    CONTAINS,
    CONTAINS_SENTENCE,
    STARTSWITH,
    EQUALS,
    NOT_EQUALS,
    GREATER_THAN,
    GREATER_THAN_OR_EQUAL,
    LOWER_THAN,
    LOWER_THAN_OR_EQUAL,
    NO_OPERATOR,
    FULLTEXTSEARCH,
    EMPTY_NULL;

    public String value() {
        return name();
    }

    public static WSWhereOperator fromValue(String v) {
        return valueOf(v);
    }

}
