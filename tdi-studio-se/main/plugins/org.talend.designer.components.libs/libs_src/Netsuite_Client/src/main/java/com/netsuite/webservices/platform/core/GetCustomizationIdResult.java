
package com.netsuite.webservices.platform.core;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCustomizationIdResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCustomizationIdResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:core_2014_2.platform.webservices.netsuite.com}status"/&gt;
 *         &lt;element name="totalRecords" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:core_2014_2.platform.webservices.netsuite.com}customizationRefList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCustomizationIdResult", propOrder = {
    "status",
    "totalRecords",
    "customizationRefList"
})
public class GetCustomizationIdResult {

    @XmlElement(required = true)
    protected Status status;
    protected Integer totalRecords;
    protected CustomizationRefList customizationRefList;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the totalRecords property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalRecords() {
        return totalRecords;
    }

    /**
     * Sets the value of the totalRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalRecords(Integer value) {
        this.totalRecords = value;
    }

    /**
     * Gets the value of the customizationRefList property.
     * 
     * @return
     *     possible object is
     *     {@link CustomizationRefList }
     *     
     */
    public CustomizationRefList getCustomizationRefList() {
        return customizationRefList;
    }

    /**
     * Sets the value of the customizationRefList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomizationRefList }
     *     
     */
    public void setCustomizationRefList(CustomizationRefList value) {
        this.customizationRefList = value;
    }

}
