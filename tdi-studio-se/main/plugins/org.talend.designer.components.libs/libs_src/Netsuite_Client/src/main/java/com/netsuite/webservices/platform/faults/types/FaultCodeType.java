
package com.netsuite.webservices.platform.faults.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FaultCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FaultCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACCT_TEMP_UNAVAILABLE"/&gt;
 *     &lt;enumeration value="EMAIL_ADDRS_REQD"/&gt;
 *     &lt;enumeration value="INVALID_ACCT"/&gt;
 *     &lt;enumeration value="INVALID_JOB_ID"/&gt;
 *     &lt;enumeration value="INVALID_LOGIN_CREDENTIALS"/&gt;
 *     &lt;enumeration value="INVALID_PAGE_INDEX"/&gt;
 *     &lt;enumeration value="INVALID_ROLE"/&gt;
 *     &lt;enumeration value="INVALID_WS_VERSION"/&gt;
 *     &lt;enumeration value="JOB_NOT_COMPLETE"/&gt;
 *     &lt;enumeration value="LOGIN_DISABLED"/&gt;
 *     &lt;enumeration value="MAX_RCRDS_EXCEEDED"/&gt;
 *     &lt;enumeration value="OI_FEATURE_REQD"/&gt;
 *     &lt;enumeration value="OI_PERMISSION_REQD"/&gt;
 *     &lt;enumeration value="PSWD_REQD"/&gt;
 *     &lt;enumeration value="ROLE_REQUIRED"/&gt;
 *     &lt;enumeration value="SESSION_TIMED_OUT"/&gt;
 *     &lt;enumeration value="UNEXPECTED_ERROR"/&gt;
 *     &lt;enumeration value="UNSUPPORTED_WS_VERSION"/&gt;
 *     &lt;enumeration value="USER_ERROR"/&gt;
 *     &lt;enumeration value="WS_CONCUR_SESSION_DISALLWD"/&gt;
 *     &lt;enumeration value="WS_FEATURE_REQD"/&gt;
 *     &lt;enumeration value="WS_PERMISSION_REQD"/&gt;
 *     &lt;enumeration value="WS_LOG_IN_REQD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FaultCodeType", namespace = "urn:types.faults_2014_2.platform.webservices.netsuite.com")
@XmlEnum
public enum FaultCodeType {

    ACCT_TEMP_UNAVAILABLE,
    EMAIL_ADDRS_REQD,
    INVALID_ACCT,
    INVALID_JOB_ID,
    INVALID_LOGIN_CREDENTIALS,
    INVALID_PAGE_INDEX,
    INVALID_ROLE,
    INVALID_WS_VERSION,
    JOB_NOT_COMPLETE,
    LOGIN_DISABLED,
    MAX_RCRDS_EXCEEDED,
    OI_FEATURE_REQD,
    OI_PERMISSION_REQD,
    PSWD_REQD,
    ROLE_REQUIRED,
    SESSION_TIMED_OUT,
    UNEXPECTED_ERROR,
    UNSUPPORTED_WS_VERSION,
    USER_ERROR,
    WS_CONCUR_SESSION_DISALLWD,
    WS_FEATURE_REQD,
    WS_PERMISSION_REQD,
    WS_LOG_IN_REQD;

    public String value() {
        return name();
    }

    public static FaultCodeType fromValue(String v) {
        return valueOf(v);
    }

}
