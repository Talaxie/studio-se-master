
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSLanguage.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WSLanguage"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FR"/&gt;
 *     &lt;enumeration value="EN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WSLanguage")
@XmlEnum
public enum WSLanguage {

    FR,
    EN;

    public String value() {
        return name();
    }

    public static WSLanguage fromValue(String v) {
        return valueOf(v);
    }

}
