
package com.microsoft.schemas.crm._2011.contracts;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.microsoft_crm_sdk.ArrayOfBusinessNotificationParameter;
import org.datacontract.schemas._2004._07.microsoft_crm_sdk.BusinessNotificationSeverity;


/**
 * <p>Java class for BusinessNotification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessNotification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Parameters" type="{http://schemas.datacontract.org/2004/07/Microsoft.Crm.Sdk.Messages}ArrayOfBusinessNotificationParameter" minOccurs="0"/>
 *         &lt;element name="Severity" type="{http://schemas.datacontract.org/2004/07/Microsoft.Crm.Sdk.Messages}BusinessNotificationSeverity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessNotification", propOrder = {
    "message",
    "parameters",
    "severity"
})
public class BusinessNotification
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Message", nillable = true)
    protected String message;
    @XmlElement(name = "Parameters", nillable = true)
    protected ArrayOfBusinessNotificationParameter parameters;
    @XmlElement(name = "Severity")
    protected BusinessNotificationSeverity severity;

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

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBusinessNotificationParameter }
     *     
     */
    public ArrayOfBusinessNotificationParameter getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBusinessNotificationParameter }
     *     
     */
    public void setParameters(ArrayOfBusinessNotificationParameter value) {
        this.parameters = value;
    }

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessNotificationSeverity }
     *     
     */
    public BusinessNotificationSeverity getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessNotificationSeverity }
     *     
     */
    public void setSeverity(BusinessNotificationSeverity value) {
        this.severity = value;
    }

}
