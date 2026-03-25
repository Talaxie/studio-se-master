
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSRoutingEngineV2ActionCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WSRoutingEngineV2ActionCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="START"/&gt;
 *     &lt;enumeration value="STOP"/&gt;
 *     &lt;enumeration value="SUSPEND"/&gt;
 *     &lt;enumeration value="RESUME"/&gt;
 *     &lt;enumeration value="STATUS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WSRoutingEngineV2ActionCode")
@XmlEnum
public enum WSRoutingEngineV2ActionCode {

    START,
    STOP,
    SUSPEND,
    RESUME,
    STATUS;

    public String value() {
        return name();
    }

    public static WSRoutingEngineV2ActionCode fromValue(String v) {
        return valueOf(v);
    }

}
