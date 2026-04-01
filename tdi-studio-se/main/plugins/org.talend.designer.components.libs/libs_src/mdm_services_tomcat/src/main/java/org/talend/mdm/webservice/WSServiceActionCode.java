
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSServiceActionCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WSServiceActionCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="START"/&gt;
 *     &lt;enumeration value="STOP"/&gt;
 *     &lt;enumeration value="STATUS"/&gt;
 *     &lt;enumeration value="EXECUTE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WSServiceActionCode")
@XmlEnum
public enum WSServiceActionCode {

    START,
    STOP,
    STATUS,
    EXECUTE;

    public String value() {
        return name();
    }

    public static WSServiceActionCode fromValue(String v) {
        return valueOf(v);
    }

}
