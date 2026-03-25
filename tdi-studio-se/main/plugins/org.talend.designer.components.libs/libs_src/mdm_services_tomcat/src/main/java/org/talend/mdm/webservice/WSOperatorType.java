
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSOperatorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WSOperatorType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UPDATE"/&gt;
 *     &lt;enumeration value="INSERT"/&gt;
 *     &lt;enumeration value="DELETE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WSOperatorType")
@XmlEnum
public enum WSOperatorType {

    UPDATE,
    INSERT,
    DELETE;

    public String value() {
        return name();
    }

    public static WSOperatorType fromValue(String v) {
        return valueOf(v);
    }

}
