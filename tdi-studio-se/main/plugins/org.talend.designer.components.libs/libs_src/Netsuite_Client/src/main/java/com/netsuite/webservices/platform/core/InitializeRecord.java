
package com.netsuite.webservices.platform.core;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core.types.InitializeType;


/**
 * <p>Java class for InitializeRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InitializeRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="type" type="{urn:types.core_2014_2.platform.webservices.netsuite.com}InitializeType"/&gt;
 *         &lt;element name="reference" type="{urn:core_2014_2.platform.webservices.netsuite.com}InitializeRef" minOccurs="0"/&gt;
 *         &lt;element name="auxReference" type="{urn:core_2014_2.platform.webservices.netsuite.com}InitializeAuxRef" minOccurs="0"/&gt;
 *         &lt;element name="referenceList" type="{urn:core_2014_2.platform.webservices.netsuite.com}InitializeRefList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InitializeRecord", propOrder = {
    "type",
    "reference",
    "auxReference",
    "referenceList"
})
public class InitializeRecord {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected InitializeType type;
    protected InitializeRef reference;
    protected InitializeAuxRef auxReference;
    protected InitializeRefList referenceList;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link InitializeType }
     *     
     */
    public InitializeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link InitializeType }
     *     
     */
    public void setType(InitializeType value) {
        this.type = value;
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link InitializeRef }
     *     
     */
    public InitializeRef getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link InitializeRef }
     *     
     */
    public void setReference(InitializeRef value) {
        this.reference = value;
    }

    /**
     * Gets the value of the auxReference property.
     * 
     * @return
     *     possible object is
     *     {@link InitializeAuxRef }
     *     
     */
    public InitializeAuxRef getAuxReference() {
        return auxReference;
    }

    /**
     * Sets the value of the auxReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link InitializeAuxRef }
     *     
     */
    public void setAuxReference(InitializeAuxRef value) {
        this.auxReference = value;
    }

    /**
     * Gets the value of the referenceList property.
     * 
     * @return
     *     possible object is
     *     {@link InitializeRefList }
     *     
     */
    public InitializeRefList getReferenceList() {
        return referenceList;
    }

    /**
     * Sets the value of the referenceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link InitializeRefList }
     *     
     */
    public void setReferenceList(InitializeRefList value) {
        this.referenceList = value;
    }

}
