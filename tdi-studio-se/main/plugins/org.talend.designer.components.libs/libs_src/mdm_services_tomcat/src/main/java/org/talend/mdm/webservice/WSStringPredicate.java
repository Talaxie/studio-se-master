
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSStringPredicate.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WSStringPredicate"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NONE"/&gt;
 *     &lt;enumeration value="OR"/&gt;
 *     &lt;enumeration value="AND"/&gt;
 *     &lt;enumeration value="STRICTAND"/&gt;
 *     &lt;enumeration value="EXACTLY"/&gt;
 *     &lt;enumeration value="NOT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WSStringPredicate")
@XmlEnum
public enum WSStringPredicate {

    NONE,
    OR,
    AND,
    STRICTAND,
    EXACTLY,
    NOT;

    public String value() {
        return name();
    }

    public static WSStringPredicate fromValue(String v) {
        return valueOf(v);
    }

}
