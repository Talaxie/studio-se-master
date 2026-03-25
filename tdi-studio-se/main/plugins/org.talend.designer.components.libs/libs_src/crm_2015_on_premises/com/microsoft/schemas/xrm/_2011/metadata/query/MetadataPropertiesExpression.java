
package com.microsoft.schemas.xrm._2011.metadata.query;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;


/**
 * <p>Java class for MetadataPropertiesExpression complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MetadataPropertiesExpression">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AllProperties" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PropertyNames" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetadataPropertiesExpression", propOrder = {
    "allProperties",
    "propertyNames"
})
public class MetadataPropertiesExpression
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "AllProperties")
    protected Boolean allProperties;
    @XmlElement(name = "PropertyNames", nillable = true)
    protected ArrayOfstring propertyNames;

    /**
     * Gets the value of the allProperties property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllProperties() {
        return allProperties;
    }

    /**
     * Sets the value of the allProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllProperties(Boolean value) {
        this.allProperties = value;
    }

    /**
     * Gets the value of the propertyNames property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getPropertyNames() {
        return propertyNames;
    }

    /**
     * Sets the value of the propertyNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setPropertyNames(ArrayOfstring value) {
        this.propertyNames = value;
    }

}
