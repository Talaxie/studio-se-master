
package com.microsoft.schemas.xrm._2011.contracts.services;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.Guid;


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
 *         &lt;element name="CreateResult" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
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
    "createResult"
})
@XmlRootElement(name = "CreateResponse")
public class CreateResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "CreateResult")
    protected Guid createResult;

    /**
     * Gets the value of the createResult property.
     * 
     * @return
     *     possible object is
     *     {@link Guid }
     *     
     */
    public Guid getCreateResult() {
        return createResult;
    }

    /**
     * Sets the value of the createResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Guid }
     *     
     */
    public void setCreateResult(Guid value) {
        this.createResult = value;
    }

}
