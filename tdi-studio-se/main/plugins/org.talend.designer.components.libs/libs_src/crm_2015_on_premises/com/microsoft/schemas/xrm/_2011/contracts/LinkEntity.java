
package com.microsoft.schemas.xrm._2011.contracts;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LinkEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinkEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Columns" type="{http://schemas.microsoft.com/xrm/2011/Contracts}ColumnSet" minOccurs="0"/>
 *         &lt;element name="EntityAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JoinOperator" type="{http://schemas.microsoft.com/xrm/2011/Contracts}JoinOperator" minOccurs="0"/>
 *         &lt;element name="LinkCriteria" type="{http://schemas.microsoft.com/xrm/2011/Contracts}FilterExpression" minOccurs="0"/>
 *         &lt;element name="LinkEntities" type="{http://schemas.microsoft.com/xrm/2011/Contracts}ArrayOfLinkEntity" minOccurs="0"/>
 *         &lt;element name="LinkFromAttributeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LinkFromEntityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LinkToAttributeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LinkToEntityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinkEntity", propOrder = {
    "columns",
    "entityAlias",
    "joinOperator",
    "linkCriteria",
    "linkEntities",
    "linkFromAttributeName",
    "linkFromEntityName",
    "linkToAttributeName",
    "linkToEntityName"
})
public class LinkEntity
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Columns", nillable = true)
    protected ColumnSet columns;
    @XmlElement(name = "EntityAlias", nillable = true)
    protected String entityAlias;
    @XmlElement(name = "JoinOperator")
    protected JoinOperator joinOperator;
    @XmlElement(name = "LinkCriteria", nillable = true)
    protected FilterExpression linkCriteria;
    @XmlElement(name = "LinkEntities", nillable = true)
    protected ArrayOfLinkEntity linkEntities;
    @XmlElement(name = "LinkFromAttributeName", nillable = true)
    protected String linkFromAttributeName;
    @XmlElement(name = "LinkFromEntityName", nillable = true)
    protected String linkFromEntityName;
    @XmlElement(name = "LinkToAttributeName", nillable = true)
    protected String linkToAttributeName;
    @XmlElement(name = "LinkToEntityName", nillable = true)
    protected String linkToEntityName;

    /**
     * Gets the value of the columns property.
     * 
     * @return
     *     possible object is
     *     {@link ColumnSet }
     *     
     */
    public ColumnSet getColumns() {
        return columns;
    }

    /**
     * Sets the value of the columns property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColumnSet }
     *     
     */
    public void setColumns(ColumnSet value) {
        this.columns = value;
    }

    /**
     * Gets the value of the entityAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityAlias() {
        return entityAlias;
    }

    /**
     * Sets the value of the entityAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityAlias(String value) {
        this.entityAlias = value;
    }

    /**
     * Gets the value of the joinOperator property.
     * 
     * @return
     *     possible object is
     *     {@link JoinOperator }
     *     
     */
    public JoinOperator getJoinOperator() {
        return joinOperator;
    }

    /**
     * Sets the value of the joinOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinOperator }
     *     
     */
    public void setJoinOperator(JoinOperator value) {
        this.joinOperator = value;
    }

    /**
     * Gets the value of the linkCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link FilterExpression }
     *     
     */
    public FilterExpression getLinkCriteria() {
        return linkCriteria;
    }

    /**
     * Sets the value of the linkCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterExpression }
     *     
     */
    public void setLinkCriteria(FilterExpression value) {
        this.linkCriteria = value;
    }

    /**
     * Gets the value of the linkEntities property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLinkEntity }
     *     
     */
    public ArrayOfLinkEntity getLinkEntities() {
        return linkEntities;
    }

    /**
     * Sets the value of the linkEntities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLinkEntity }
     *     
     */
    public void setLinkEntities(ArrayOfLinkEntity value) {
        this.linkEntities = value;
    }

    /**
     * Gets the value of the linkFromAttributeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkFromAttributeName() {
        return linkFromAttributeName;
    }

    /**
     * Sets the value of the linkFromAttributeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkFromAttributeName(String value) {
        this.linkFromAttributeName = value;
    }

    /**
     * Gets the value of the linkFromEntityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkFromEntityName() {
        return linkFromEntityName;
    }

    /**
     * Sets the value of the linkFromEntityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkFromEntityName(String value) {
        this.linkFromEntityName = value;
    }

    /**
     * Gets the value of the linkToAttributeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkToAttributeName() {
        return linkToAttributeName;
    }

    /**
     * Sets the value of the linkToAttributeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkToAttributeName(String value) {
        this.linkToAttributeName = value;
    }

    /**
     * Gets the value of the linkToEntityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkToEntityName() {
        return linkToEntityName;
    }

    /**
     * Sets the value of the linkToEntityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkToEntityName(String value) {
        this.linkToEntityName = value;
    }

}
