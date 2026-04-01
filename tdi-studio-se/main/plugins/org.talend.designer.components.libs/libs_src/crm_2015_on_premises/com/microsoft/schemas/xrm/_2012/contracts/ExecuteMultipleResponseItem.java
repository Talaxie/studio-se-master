
package com.microsoft.schemas.xrm._2012.contracts;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas.xrm._2011.contracts.OrganizationResponse;
import com.microsoft.schemas.xrm._2011.contracts.OrganizationServiceFault;


/**
 * <p>Java class for ExecuteMultipleResponseItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExecuteMultipleResponseItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Fault" type="{http://schemas.microsoft.com/xrm/2011/Contracts}OrganizationServiceFault" minOccurs="0"/>
 *         &lt;element name="RequestIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Response" type="{http://schemas.microsoft.com/xrm/2011/Contracts}OrganizationResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExecuteMultipleResponseItem", propOrder = {
    "fault",
    "requestIndex",
    "response"
})
public class ExecuteMultipleResponseItem
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Fault", nillable = true)
    protected OrganizationServiceFault fault;
    @XmlElement(name = "RequestIndex")
    protected Integer requestIndex;
    @XmlElement(name = "Response", nillable = true)
    protected OrganizationResponse response;

    /**
     * Gets the value of the fault property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationServiceFault }
     *     
     */
    public OrganizationServiceFault getFault() {
        return fault;
    }

    /**
     * Sets the value of the fault property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationServiceFault }
     *     
     */
    public void setFault(OrganizationServiceFault value) {
        this.fault = value;
    }

    /**
     * Gets the value of the requestIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRequestIndex() {
        return requestIndex;
    }

    /**
     * Sets the value of the requestIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRequestIndex(Integer value) {
        this.requestIndex = value;
    }

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationResponse }
     *     
     */
    public OrganizationResponse getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationResponse }
     *     
     */
    public void setResponse(OrganizationResponse value) {
        this.response = value;
    }

}
