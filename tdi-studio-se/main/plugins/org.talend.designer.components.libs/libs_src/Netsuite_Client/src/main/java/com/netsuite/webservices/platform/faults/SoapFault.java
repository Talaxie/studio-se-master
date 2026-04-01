
package com.netsuite.webservices.platform.faults;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.faults.types.FaultCodeType;


/**
 * <p>Java class for SoapFault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SoapFault"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="code" type="{urn:types.faults_2014_2.platform.webservices.netsuite.com}FaultCodeType"/&gt;
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SoapFault", propOrder = {
    "code",
    "message"
})
@XmlSeeAlso({
    InsufficientPermissionFault.class,
    InvalidAccountFault.class,
    InvalidCredentialsFault.class,
    InvalidSessionFault.class,
    ExceededRequestLimitFault.class,
    ExceededUsageLimitFault.class,
    ExceededRecordCountFault.class,
    ExceededRequestSizeFault.class,
    InvalidVersionFault.class,
    AsyncFault.class,
    UnexpectedErrorFault.class
})
public class SoapFault {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected FaultCodeType code;
    @XmlElement(required = true)
    protected String message;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link FaultCodeType }
     *     
     */
    public FaultCodeType getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link FaultCodeType }
     *     
     */
    public void setCode(FaultCodeType value) {
        this.code = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

}
