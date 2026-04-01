
package com.microsoft.schemas.xrm._2011.metadata;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManagedPropertyAttributeMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManagedPropertyAttributeMetadata">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/xrm/2011/Metadata}AttributeMetadata">
 *       &lt;sequence>
 *         &lt;element name="ManagedPropertyLogicalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentAttributeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentComponentType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ValueAttributeTypeCode" type="{http://schemas.microsoft.com/xrm/2011/Metadata}AttributeTypeCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManagedPropertyAttributeMetadata", propOrder = {
    "managedPropertyLogicalName",
    "parentAttributeName",
    "parentComponentType",
    "valueAttributeTypeCode"
})
public class ManagedPropertyAttributeMetadata
    extends AttributeMetadata
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ManagedPropertyLogicalName", nillable = true)
    protected String managedPropertyLogicalName;
    @XmlElement(name = "ParentAttributeName", nillable = true)
    protected String parentAttributeName;
    @XmlElement(name = "ParentComponentType", nillable = true)
    protected Integer parentComponentType;
    @XmlElement(name = "ValueAttributeTypeCode")
    protected AttributeTypeCode valueAttributeTypeCode;

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
     * Gets the value of the parentAttributeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentAttributeName() {
        return parentAttributeName;
    }

    /**
     * Sets the value of the parentAttributeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentAttributeName(String value) {
        this.parentAttributeName = value;
    }

    /**
     * Gets the value of the parentComponentType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getParentComponentType() {
        return parentComponentType;
    }

    /**
     * Sets the value of the parentComponentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setParentComponentType(Integer value) {
        this.parentComponentType = value;
    }

    /**
     * Gets the value of the valueAttributeTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeTypeCode }
     *     
     */
    public AttributeTypeCode getValueAttributeTypeCode() {
        return valueAttributeTypeCode;
    }

    /**
     * Sets the value of the valueAttributeTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeTypeCode }
     *     
     */
    public void setValueAttributeTypeCode(AttributeTypeCode value) {
        this.valueAttributeTypeCode = value;
    }

}
