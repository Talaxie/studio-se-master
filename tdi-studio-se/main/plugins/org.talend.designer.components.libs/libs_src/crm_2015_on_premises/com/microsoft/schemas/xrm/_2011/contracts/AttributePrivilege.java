
package com.microsoft.schemas.xrm._2011.contracts;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.Guid;


/**
 * <p>Java class for AttributePrivilege complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttributePrivilege">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AttributeId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="CanCreate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CanRead" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CanUpdate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttributePrivilege", propOrder = {
    "attributeId",
    "canCreate",
    "canRead",
    "canUpdate"
})
public class AttributePrivilege
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "AttributeId")
    protected Guid attributeId;
    @XmlElement(name = "CanCreate")
    protected Integer canCreate;
    @XmlElement(name = "CanRead")
    protected Integer canRead;
    @XmlElement(name = "CanUpdate")
    protected Integer canUpdate;

    /**
     * Gets the value of the attributeId property.
     * 
     * @return
     *     possible object is
     *     {@link Guid }
     *     
     */
    public Guid getAttributeId() {
        return attributeId;
    }

    /**
     * Sets the value of the attributeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Guid }
     *     
     */
    public void setAttributeId(Guid value) {
        this.attributeId = value;
    }

    /**
     * Gets the value of the canCreate property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCanCreate() {
        return canCreate;
    }

    /**
     * Sets the value of the canCreate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCanCreate(Integer value) {
        this.canCreate = value;
    }

    /**
     * Gets the value of the canRead property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCanRead() {
        return canRead;
    }

    /**
     * Sets the value of the canRead property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCanRead(Integer value) {
        this.canRead = value;
    }

    /**
     * Gets the value of the canUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCanUpdate() {
        return canUpdate;
    }

    /**
     * Sets the value of the canUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCanUpdate(Integer value) {
        this.canUpdate = value;
    }

}
