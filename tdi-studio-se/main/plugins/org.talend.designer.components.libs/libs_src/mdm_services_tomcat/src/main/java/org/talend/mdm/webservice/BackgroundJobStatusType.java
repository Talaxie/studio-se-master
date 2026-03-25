
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BackgroundJobStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BackgroundJobStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SCHEDULED"/&gt;
 *     &lt;enumeration value="RUNNING"/&gt;
 *     &lt;enumeration value="COMPLETED"/&gt;
 *     &lt;enumeration value="SUSPENDED"/&gt;
 *     &lt;enumeration value="CANCEL_REQUESTED"/&gt;
 *     &lt;enumeration value="STOPPED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BackgroundJobStatusType")
@XmlEnum
public enum BackgroundJobStatusType {

    SCHEDULED,
    RUNNING,
    COMPLETED,
    SUSPENDED,
    CANCEL_REQUESTED,
    STOPPED;

    public String value() {
        return name();
    }

    public static BackgroundJobStatusType fromValue(String v) {
        return valueOf(v);
    }

}
