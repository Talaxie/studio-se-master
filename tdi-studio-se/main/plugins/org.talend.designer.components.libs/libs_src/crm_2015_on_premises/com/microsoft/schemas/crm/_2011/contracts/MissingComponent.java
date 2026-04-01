
package com.microsoft.schemas.crm._2011.contracts;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MissingComponent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MissingComponent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DependentComponent" type="{http://schemas.microsoft.com/crm/2011/Contracts}ComponentDetail" minOccurs="0"/>
 *         &lt;element name="RequiredComponent" type="{http://schemas.microsoft.com/crm/2011/Contracts}ComponentDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MissingComponent", propOrder = {
    "dependentComponent",
    "requiredComponent"
})
public class MissingComponent
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "DependentComponent", nillable = true)
    protected ComponentDetail dependentComponent;
    @XmlElement(name = "RequiredComponent", nillable = true)
    protected ComponentDetail requiredComponent;

    /**
     * Gets the value of the dependentComponent property.
     * 
     * @return
     *     possible object is
     *     {@link ComponentDetail }
     *     
     */
    public ComponentDetail getDependentComponent() {
        return dependentComponent;
    }

    /**
     * Sets the value of the dependentComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComponentDetail }
     *     
     */
    public void setDependentComponent(ComponentDetail value) {
        this.dependentComponent = value;
    }

    /**
     * Gets the value of the requiredComponent property.
     * 
     * @return
     *     possible object is
     *     {@link ComponentDetail }
     *     
     */
    public ComponentDetail getRequiredComponent() {
        return requiredComponent;
    }

    /**
     * Sets the value of the requiredComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComponentDetail }
     *     
     */
    public void setRequiredComponent(ComponentDetail value) {
        this.requiredComponent = value;
    }

}
