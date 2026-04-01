
package com.microsoft.schemas.xrm._2011.contracts.services;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas.xrm._2011.contracts.OrganizationResponse;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExecuteResult" type="{http://schemas.microsoft.com/xrm/2011/Contracts}OrganizationResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "executeResult"
})
@XmlRootElement(name = "ExecuteResponse")
public class ExecuteResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ExecuteResult", nillable = true)
    protected OrganizationResponse executeResult;

    /**
     * Gets the value of the executeResult property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationResponse }
     *     
     */
    public OrganizationResponse getExecuteResult() {
        return executeResult;
    }

    /**
     * Sets the value of the executeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationResponse }
     *     
     */
    public void setExecuteResult(OrganizationResponse value) {
        this.executeResult = value;
    }

}
