
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSComponent.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WSComponent"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DataManager"/&gt;
 *     &lt;enumeration value="Service"/&gt;
 *     &lt;enumeration value="Connector"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WSComponent")
@XmlEnum
public enum WSComponent {

    @XmlEnumValue("DataManager")
    DATA_MANAGER("DataManager"),
    @XmlEnumValue("Service")
    SERVICE("Service"),
    @XmlEnumValue("Connector")
    CONNECTOR("Connector");
    private final String value;

    WSComponent(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WSComponent fromValue(String v) {
        for (WSComponent c: WSComponent.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
