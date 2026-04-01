
package com.microsoft.schemas.xrm._2011.contracts;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Relationship complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Relationship">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrimaryEntityRole" type="{http://schemas.microsoft.com/xrm/2011/Contracts}EntityRole" minOccurs="0"/>
 *         &lt;element name="SchemaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Relationship", propOrder = {
    "primaryEntityRole",
    "schemaName"
})
public class Relationship
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "PrimaryEntityRole", nillable = true)
    protected EntityRole primaryEntityRole;
    @XmlElement(name = "SchemaName", nillable = true)
    protected String schemaName;

    /**
     * Gets the value of the primaryEntityRole property.
     * 
     * @return
     *     possible object is
     *     {@link EntityRole }
     *     
     */
    public EntityRole getPrimaryEntityRole() {
        return primaryEntityRole;
    }

    /**
     * Sets the value of the primaryEntityRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityRole }
     *     
     */
    public void setPrimaryEntityRole(EntityRole value) {
        this.primaryEntityRole = value;
    }

    /**
     * Gets the value of the schemaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemaName() {
        return schemaName;
    }

    /**
     * Sets the value of the schemaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemaName(String value) {
        this.schemaName = value;
    }

}
