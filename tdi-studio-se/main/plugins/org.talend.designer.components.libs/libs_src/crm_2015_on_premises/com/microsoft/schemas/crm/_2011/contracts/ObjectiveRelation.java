
package com.microsoft.schemas.crm._2011.contracts;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.Guid;


/**
 * <p>Java class for ObjectiveRelation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObjectiveRelation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ObjectiveExpression" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResourceSpecId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectiveRelation", propOrder = {
    "objectiveExpression",
    "resourceSpecId"
})
public class ObjectiveRelation
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ObjectiveExpression", nillable = true)
    protected String objectiveExpression;
    @XmlElement(name = "ResourceSpecId")
    protected Guid resourceSpecId;

    /**
     * Gets the value of the objectiveExpression property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectiveExpression() {
        return objectiveExpression;
    }

    /**
     * Sets the value of the objectiveExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectiveExpression(String value) {
        this.objectiveExpression = value;
    }

    /**
     * Gets the value of the resourceSpecId property.
     * 
     * @return
     *     possible object is
     *     {@link Guid }
     *     
     */
    public Guid getResourceSpecId() {
        return resourceSpecId;
    }

    /**
     * Sets the value of the resourceSpecId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Guid }
     *     
     */
    public void setResourceSpecId(Guid value) {
        this.resourceSpecId = value;
    }

}
