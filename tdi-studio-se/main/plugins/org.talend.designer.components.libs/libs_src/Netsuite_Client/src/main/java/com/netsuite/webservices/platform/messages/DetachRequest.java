
package com.netsuite.webservices.platform.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core.DetachReference;


/**
 * <p>Java class for DetachRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DetachRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="detachReference" type="{urn:core_2014_2.platform.webservices.netsuite.com}DetachReference"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetachRequest", propOrder = {
    "detachReference"
})
public class DetachRequest {

    @XmlElement(required = true)
    protected DetachReference detachReference;

    /**
     * Gets the value of the detachReference property.
     * 
     * @return
     *     possible object is
     *     {@link DetachReference }
     *     
     */
    public DetachReference getDetachReference() {
        return detachReference;
    }

    /**
     * Sets the value of the detachReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetachReference }
     *     
     */
    public void setDetachReference(DetachReference value) {
        this.detachReference = value;
    }

}
