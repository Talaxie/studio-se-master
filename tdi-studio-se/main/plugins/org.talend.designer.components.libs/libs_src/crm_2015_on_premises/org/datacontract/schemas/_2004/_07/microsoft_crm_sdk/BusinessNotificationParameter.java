
package org.datacontract.schemas._2004._07.microsoft_crm_sdk;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessNotificationParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessNotificationParameter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParameterType" type="{http://schemas.datacontract.org/2004/07/Microsoft.Crm.Sdk.Messages}BusinessNotificationParameterType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessNotificationParameter", propOrder = {
    "data",
    "parameterType"
})
public class BusinessNotificationParameter
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Data", nillable = true)
    protected String data;
    @XmlElement(name = "ParameterType")
    protected BusinessNotificationParameterType parameterType;

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setData(String value) {
        this.data = value;
    }

    /**
     * Gets the value of the parameterType property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessNotificationParameterType }
     *     
     */
    public BusinessNotificationParameterType getParameterType() {
        return parameterType;
    }

    /**
     * Sets the value of the parameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessNotificationParameterType }
     *     
     */
    public void setParameterType(BusinessNotificationParameterType value) {
        this.parameterType = value;
    }

}
