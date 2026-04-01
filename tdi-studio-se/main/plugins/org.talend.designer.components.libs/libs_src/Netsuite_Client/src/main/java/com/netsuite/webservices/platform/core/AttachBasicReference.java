
package com.netsuite.webservices.platform.core;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttachBasicReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttachBasicReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2014_2.platform.webservices.netsuite.com}AttachReference"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="attachedRecord" type="{urn:core_2014_2.platform.webservices.netsuite.com}BaseRef"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachBasicReference", propOrder = {
    "attachedRecord"
})
public class AttachBasicReference
    extends AttachReference
{

    @XmlElement(required = true)
    protected BaseRef attachedRecord;

    /**
     * Gets the value of the attachedRecord property.
     * 
     * @return
     *     possible object is
     *     {@link BaseRef }
     *     
     */
    public BaseRef getAttachedRecord() {
        return attachedRecord;
    }

    /**
     * Sets the value of the attachedRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseRef }
     *     
     */
    public void setAttachedRecord(BaseRef value) {
        this.attachedRecord = value;
    }

}
