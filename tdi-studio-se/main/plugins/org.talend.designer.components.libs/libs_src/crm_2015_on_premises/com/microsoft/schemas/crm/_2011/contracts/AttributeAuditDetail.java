
package com.microsoft.schemas.crm._2011.contracts;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import com.microsoft.schemas.xrm._2011.contracts.Entity;


/**
 * <p>Java class for AttributeAuditDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttributeAuditDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/crm/2011/Contracts}AuditDetail">
 *       &lt;sequence>
 *         &lt;element name="InvalidNewValueAttributes" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="NewValue" type="{http://schemas.microsoft.com/xrm/2011/Contracts}Entity" minOccurs="0"/>
 *         &lt;element name="OldValue" type="{http://schemas.microsoft.com/xrm/2011/Contracts}Entity" minOccurs="0"/>
 *         &lt;element name="DeletedAttributes" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfintstring" minOccurs="0"/>
 *         &lt;element name="LocLabelLanguageCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttributeAuditDetail", propOrder = {
    "invalidNewValueAttributes",
    "newValue",
    "oldValue",
    "deletedAttributes",
    "locLabelLanguageCode"
})
public class AttributeAuditDetail
    extends AuditDetail
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "InvalidNewValueAttributes", nillable = true)
    protected ArrayOfstring invalidNewValueAttributes;
    @XmlElement(name = "NewValue", nillable = true)
    protected Entity newValue;
    @XmlElement(name = "OldValue", nillable = true)
    protected Entity oldValue;
    @XmlElement(name = "DeletedAttributes", nillable = true)
    protected ArrayOfKeyValueOfintstring deletedAttributes;
    @XmlElement(name = "LocLabelLanguageCode")
    protected Integer locLabelLanguageCode;

    /**
     * Gets the value of the invalidNewValueAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getInvalidNewValueAttributes() {
        return invalidNewValueAttributes;
    }

    /**
     * Sets the value of the invalidNewValueAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setInvalidNewValueAttributes(ArrayOfstring value) {
        this.invalidNewValueAttributes = value;
    }

    /**
     * Gets the value of the newValue property.
     * 
     * @return
     *     possible object is
     *     {@link Entity }
     *     
     */
    public Entity getNewValue() {
        return newValue;
    }

    /**
     * Sets the value of the newValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Entity }
     *     
     */
    public void setNewValue(Entity value) {
        this.newValue = value;
    }

    /**
     * Gets the value of the oldValue property.
     * 
     * @return
     *     possible object is
     *     {@link Entity }
     *     
     */
    public Entity getOldValue() {
        return oldValue;
    }

    /**
     * Sets the value of the oldValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Entity }
     *     
     */
    public void setOldValue(Entity value) {
        this.oldValue = value;
    }

    /**
     * Gets the value of the deletedAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeyValueOfintstring }
     *     
     */
    public ArrayOfKeyValueOfintstring getDeletedAttributes() {
        return deletedAttributes;
    }

    /**
     * Sets the value of the deletedAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeyValueOfintstring }
     *     
     */
    public void setDeletedAttributes(ArrayOfKeyValueOfintstring value) {
        this.deletedAttributes = value;
    }

    /**
     * Gets the value of the locLabelLanguageCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLocLabelLanguageCode() {
        return locLabelLanguageCode;
    }

    /**
     * Sets the value of the locLabelLanguageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLocLabelLanguageCode(Integer value) {
        this.locLabelLanguageCode = value;
    }

}
