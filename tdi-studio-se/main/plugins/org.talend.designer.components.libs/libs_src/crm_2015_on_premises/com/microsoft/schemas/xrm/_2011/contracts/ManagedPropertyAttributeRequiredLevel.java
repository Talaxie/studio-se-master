
package com.microsoft.schemas.xrm._2011.contracts;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevel;
import com.microsoft.schemas.xrm._2011.metadata.AttributeRequiredLevelManagedProperty;


/**
 * <p>Java class for ManagedPropertyAttributeRequiredLevel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManagedPropertyAttributeRequiredLevel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CanBeChanged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ManagedPropertyLogicalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Value" type="{http://schemas.microsoft.com/xrm/2011/Metadata}AttributeRequiredLevel" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManagedPropertyAttributeRequiredLevel", propOrder = {
    "canBeChanged",
    "managedPropertyLogicalName",
    "value"
})
@XmlSeeAlso({
    AttributeRequiredLevelManagedProperty.class
})
public class ManagedPropertyAttributeRequiredLevel
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "CanBeChanged")
    protected Boolean canBeChanged;
    @XmlElement(name = "ManagedPropertyLogicalName", nillable = true)
    protected String managedPropertyLogicalName;
    @XmlElement(name = "Value")
    protected AttributeRequiredLevel value;

    /**
     * Gets the value of the canBeChanged property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanBeChanged() {
        return canBeChanged;
    }

    /**
     * Sets the value of the canBeChanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanBeChanged(Boolean value) {
        this.canBeChanged = value;
    }

    /**
     * Gets the value of the managedPropertyLogicalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagedPropertyLogicalName() {
        return managedPropertyLogicalName;
    }

    /**
     * Sets the value of the managedPropertyLogicalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagedPropertyLogicalName(String value) {
        this.managedPropertyLogicalName = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeRequiredLevel }
     *     
     */
    public AttributeRequiredLevel getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeRequiredLevel }
     *     
     */
    public void setValue(AttributeRequiredLevel value) {
        this.value = value;
    }

}
