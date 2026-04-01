
package com.netsuite.webservices.platform.core;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DetachReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DetachReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="detachFrom" type="{urn:core_2014_2.platform.webservices.netsuite.com}BaseRef"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetachReference", propOrder = {
    "detachFrom"
})
@XmlSeeAlso({
    DetachBasicReference.class
})
public abstract class DetachReference {

    @XmlElement(required = true)
    protected BaseRef detachFrom;

    /**
     * Gets the value of the detachFrom property.
     * 
     * @return
     *     possible object is
     *     {@link BaseRef }
     *     
     */
    public BaseRef getDetachFrom() {
        return detachFrom;
    }

    /**
     * Sets the value of the detachFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseRef }
     *     
     */
    public void setDetachFrom(BaseRef value) {
        this.detachFrom = value;
    }

}
