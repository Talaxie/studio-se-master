
package com.microsoft.schemas.xrm._2011.contracts.services;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas.xrm._2011.contracts.Entity;


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
 *         &lt;element name="RetrieveResult" type="{http://schemas.microsoft.com/xrm/2011/Contracts}Entity" minOccurs="0"/>
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
    "retrieveResult"
})
@XmlRootElement(name = "RetrieveResponse")
public class RetrieveResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "RetrieveResult", nillable = true)
    protected Entity retrieveResult;

    /**
     * Gets the value of the retrieveResult property.
     * 
     * @return
     *     possible object is
     *     {@link Entity }
     *     
     */
    public Entity getRetrieveResult() {
        return retrieveResult;
    }

    /**
     * Sets the value of the retrieveResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Entity }
     *     
     */
    public void setRetrieveResult(Entity value) {
        this.retrieveResult = value;
    }

}
