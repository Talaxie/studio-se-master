
package com.microsoft.schemas.xrm._2011.contracts;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntityCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityCollection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Entities" type="{http://schemas.microsoft.com/xrm/2011/Contracts}ArrayOfEntity" minOccurs="0"/>
 *         &lt;element name="EntityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MinActiveRowVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MoreRecords" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PagingCookie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalRecordCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TotalRecordCountLimitExceeded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityCollection", propOrder = {
    "entities",
    "entityName",
    "minActiveRowVersion",
    "moreRecords",
    "pagingCookie",
    "totalRecordCount",
    "totalRecordCountLimitExceeded"
})
public class EntityCollection
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Entities", nillable = true)
    protected ArrayOfEntity entities;
    @XmlElement(name = "EntityName", nillable = true)
    protected String entityName;
    @XmlElement(name = "MinActiveRowVersion", nillable = true)
    protected String minActiveRowVersion;
    @XmlElement(name = "MoreRecords")
    protected Boolean moreRecords;
    @XmlElement(name = "PagingCookie", nillable = true)
    protected String pagingCookie;
    @XmlElement(name = "TotalRecordCount")
    protected Integer totalRecordCount;
    @XmlElement(name = "TotalRecordCountLimitExceeded")
    protected Boolean totalRecordCountLimitExceeded;

    /**
     * Gets the value of the entities property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEntity }
     *     
     */
    public ArrayOfEntity getEntities() {
        return entities;
    }

    /**
     * Sets the value of the entities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEntity }
     *     
     */
    public void setEntities(ArrayOfEntity value) {
        this.entities = value;
    }

    /**
     * Gets the value of the entityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityName() {
        return entityName;
    }

    /**
     * Sets the value of the entityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityName(String value) {
        this.entityName = value;
    }

    /**
     * Gets the value of the minActiveRowVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinActiveRowVersion() {
        return minActiveRowVersion;
    }

    /**
     * Sets the value of the minActiveRowVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinActiveRowVersion(String value) {
        this.minActiveRowVersion = value;
    }

    /**
     * Gets the value of the moreRecords property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMoreRecords() {
        return moreRecords;
    }

    /**
     * Sets the value of the moreRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMoreRecords(Boolean value) {
        this.moreRecords = value;
    }

    /**
     * Gets the value of the pagingCookie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPagingCookie() {
        return pagingCookie;
    }

    /**
     * Sets the value of the pagingCookie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPagingCookie(String value) {
        this.pagingCookie = value;
    }

    /**
     * Gets the value of the totalRecordCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalRecordCount() {
        return totalRecordCount;
    }

    /**
     * Sets the value of the totalRecordCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalRecordCount(Integer value) {
        this.totalRecordCount = value;
    }

    /**
     * Gets the value of the totalRecordCountLimitExceeded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalRecordCountLimitExceeded() {
        return totalRecordCountLimitExceeded;
    }

    /**
     * Sets the value of the totalRecordCountLimitExceeded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalRecordCountLimitExceeded(Boolean value) {
        this.totalRecordCountLimitExceeded = value;
    }

}
