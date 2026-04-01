
package com.microsoft.schemas.xrm._2011.contracts.services;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas.xrm._2011.contracts.EntityCollection;


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
 *         &lt;element name="RetrieveMultipleResult" type="{http://schemas.microsoft.com/xrm/2011/Contracts}EntityCollection" minOccurs="0"/>
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
    "retrieveMultipleResult"
})
@XmlRootElement(name = "RetrieveMultipleResponse")
public class RetrieveMultipleResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "RetrieveMultipleResult", nillable = true)
    protected EntityCollection retrieveMultipleResult;

    /**
     * Gets the value of the retrieveMultipleResult property.
     * 
     * @return
     *     possible object is
     *     {@link EntityCollection }
     *     
     */
    public EntityCollection getRetrieveMultipleResult() {
        return retrieveMultipleResult;
    }

    /**
     * Sets the value of the retrieveMultipleResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityCollection }
     *     
     */
    public void setRetrieveMultipleResult(EntityCollection value) {
        this.retrieveMultipleResult = value;
    }

}
