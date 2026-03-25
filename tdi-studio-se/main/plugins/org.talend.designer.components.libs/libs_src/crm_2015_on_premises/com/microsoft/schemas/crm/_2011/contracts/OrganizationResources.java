
package com.microsoft.schemas.crm._2011.contracts;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrganizationResources complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganizationResources">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrentNumberOfActiveUsers" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CurrentNumberOfCustomEntities" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CurrentNumberOfNonInteractiveUsers" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CurrentNumberOfPublishedWorkflows" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CurrentStorage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxNumberOfActiveUsers" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxNumberOfCustomEntities" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxNumberOfNonInteractiveUsers" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxNumberOfPublishedWorkflows" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxStorage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationResources", propOrder = {
    "currentNumberOfActiveUsers",
    "currentNumberOfCustomEntities",
    "currentNumberOfNonInteractiveUsers",
    "currentNumberOfPublishedWorkflows",
    "currentStorage",
    "maxNumberOfActiveUsers",
    "maxNumberOfCustomEntities",
    "maxNumberOfNonInteractiveUsers",
    "maxNumberOfPublishedWorkflows",
    "maxStorage"
})
public class OrganizationResources
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "CurrentNumberOfActiveUsers")
    protected Integer currentNumberOfActiveUsers;
    @XmlElement(name = "CurrentNumberOfCustomEntities")
    protected Integer currentNumberOfCustomEntities;
    @XmlElement(name = "CurrentNumberOfNonInteractiveUsers")
    protected Integer currentNumberOfNonInteractiveUsers;
    @XmlElement(name = "CurrentNumberOfPublishedWorkflows")
    protected Integer currentNumberOfPublishedWorkflows;
    @XmlElement(name = "CurrentStorage")
    protected Integer currentStorage;
    @XmlElement(name = "MaxNumberOfActiveUsers")
    protected Integer maxNumberOfActiveUsers;
    @XmlElement(name = "MaxNumberOfCustomEntities")
    protected Integer maxNumberOfCustomEntities;
    @XmlElement(name = "MaxNumberOfNonInteractiveUsers")
    protected Integer maxNumberOfNonInteractiveUsers;
    @XmlElement(name = "MaxNumberOfPublishedWorkflows")
    protected Integer maxNumberOfPublishedWorkflows;
    @XmlElement(name = "MaxStorage")
    protected Integer maxStorage;

    /**
     * Gets the value of the currentNumberOfActiveUsers property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrentNumberOfActiveUsers() {
        return currentNumberOfActiveUsers;
    }

    /**
     * Sets the value of the currentNumberOfActiveUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrentNumberOfActiveUsers(Integer value) {
        this.currentNumberOfActiveUsers = value;
    }

    /**
     * Gets the value of the currentNumberOfCustomEntities property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrentNumberOfCustomEntities() {
        return currentNumberOfCustomEntities;
    }

    /**
     * Sets the value of the currentNumberOfCustomEntities property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrentNumberOfCustomEntities(Integer value) {
        this.currentNumberOfCustomEntities = value;
    }

    /**
     * Gets the value of the currentNumberOfNonInteractiveUsers property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrentNumberOfNonInteractiveUsers() {
        return currentNumberOfNonInteractiveUsers;
    }

    /**
     * Sets the value of the currentNumberOfNonInteractiveUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrentNumberOfNonInteractiveUsers(Integer value) {
        this.currentNumberOfNonInteractiveUsers = value;
    }

    /**
     * Gets the value of the currentNumberOfPublishedWorkflows property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrentNumberOfPublishedWorkflows() {
        return currentNumberOfPublishedWorkflows;
    }

    /**
     * Sets the value of the currentNumberOfPublishedWorkflows property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrentNumberOfPublishedWorkflows(Integer value) {
        this.currentNumberOfPublishedWorkflows = value;
    }

    /**
     * Gets the value of the currentStorage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrentStorage() {
        return currentStorage;
    }

    /**
     * Sets the value of the currentStorage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrentStorage(Integer value) {
        this.currentStorage = value;
    }

    /**
     * Gets the value of the maxNumberOfActiveUsers property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxNumberOfActiveUsers() {
        return maxNumberOfActiveUsers;
    }

    /**
     * Sets the value of the maxNumberOfActiveUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxNumberOfActiveUsers(Integer value) {
        this.maxNumberOfActiveUsers = value;
    }

    /**
     * Gets the value of the maxNumberOfCustomEntities property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxNumberOfCustomEntities() {
        return maxNumberOfCustomEntities;
    }

    /**
     * Sets the value of the maxNumberOfCustomEntities property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxNumberOfCustomEntities(Integer value) {
        this.maxNumberOfCustomEntities = value;
    }

    /**
     * Gets the value of the maxNumberOfNonInteractiveUsers property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxNumberOfNonInteractiveUsers() {
        return maxNumberOfNonInteractiveUsers;
    }

    /**
     * Sets the value of the maxNumberOfNonInteractiveUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxNumberOfNonInteractiveUsers(Integer value) {
        this.maxNumberOfNonInteractiveUsers = value;
    }

    /**
     * Gets the value of the maxNumberOfPublishedWorkflows property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxNumberOfPublishedWorkflows() {
        return maxNumberOfPublishedWorkflows;
    }

    /**
     * Sets the value of the maxNumberOfPublishedWorkflows property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxNumberOfPublishedWorkflows(Integer value) {
        this.maxNumberOfPublishedWorkflows = value;
    }

    /**
     * Gets the value of the maxStorage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxStorage() {
        return maxStorage;
    }

    /**
     * Sets the value of the maxStorage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxStorage(Integer value) {
        this.maxStorage = value;
    }

}
