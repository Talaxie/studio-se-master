
package com.microsoft.schemas.xrm._2011.contracts;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryExpression complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryExpression">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/xrm/2011/Contracts}QueryBase">
 *       &lt;sequence>
 *         &lt;element name="ColumnSet" type="{http://schemas.microsoft.com/xrm/2011/Contracts}ColumnSet" minOccurs="0"/>
 *         &lt;element name="Criteria" type="{http://schemas.microsoft.com/xrm/2011/Contracts}FilterExpression" minOccurs="0"/>
 *         &lt;element name="Distinct" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EntityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LinkEntities" type="{http://schemas.microsoft.com/xrm/2011/Contracts}ArrayOfLinkEntity" minOccurs="0"/>
 *         &lt;element name="Orders" type="{http://schemas.microsoft.com/xrm/2011/Contracts}ArrayOfOrderExpression" minOccurs="0"/>
 *         &lt;element name="PageInfo" type="{http://schemas.microsoft.com/xrm/2011/Contracts}PagingInfo" minOccurs="0"/>
 *         &lt;element name="NoLock" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TopCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryExpression", propOrder = {
    "columnSet",
    "criteria",
    "distinct",
    "entityName",
    "linkEntities",
    "orders",
    "pageInfo",
    "noLock",
    "topCount"
})
public class QueryExpression
    extends QueryBase
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ColumnSet", nillable = true)
    protected ColumnSet columnSet;
    @XmlElement(name = "Criteria", nillable = true)
    protected FilterExpression criteria;
    @XmlElement(name = "Distinct")
    protected Boolean distinct;
    @XmlElement(name = "EntityName", nillable = true)
    protected String entityName;
    @XmlElement(name = "LinkEntities", nillable = true)
    protected ArrayOfLinkEntity linkEntities;
    @XmlElement(name = "Orders", nillable = true)
    protected ArrayOfOrderExpression orders;
    @XmlElement(name = "PageInfo", nillable = true)
    protected PagingInfo pageInfo;
    @XmlElement(name = "NoLock")
    protected Boolean noLock;
    @XmlElement(name = "TopCount", nillable = true)
    protected Integer topCount;

    /**
     * Gets the value of the columnSet property.
     * 
     * @return
     *     possible object is
     *     {@link ColumnSet }
     *     
     */
    public ColumnSet getColumnSet() {
        return columnSet;
    }

    /**
     * Sets the value of the columnSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColumnSet }
     *     
     */
    public void setColumnSet(ColumnSet value) {
        this.columnSet = value;
    }

    /**
     * Gets the value of the criteria property.
     * 
     * @return
     *     possible object is
     *     {@link FilterExpression }
     *     
     */
    public FilterExpression getCriteria() {
        return criteria;
    }

    /**
     * Sets the value of the criteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterExpression }
     *     
     */
    public void setCriteria(FilterExpression value) {
        this.criteria = value;
    }

    /**
     * Gets the value of the distinct property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDistinct() {
        return distinct;
    }

    /**
     * Sets the value of the distinct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDistinct(Boolean value) {
        this.distinct = value;
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
     * Gets the value of the orders property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrderExpression }
     *     
     */
    public ArrayOfOrderExpression getOrders() {
        return orders;
    }

    /**
     * Sets the value of the orders property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrderExpression }
     *     
     */
    public void setOrders(ArrayOfOrderExpression value) {
        this.orders = value;
    }

    /**
     * Gets the value of the pageInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PagingInfo }
     *     
     */
    public PagingInfo getPageInfo() {
        return pageInfo;
    }

    /**
     * Sets the value of the pageInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PagingInfo }
     *     
     */
    public void setPageInfo(PagingInfo value) {
        this.pageInfo = value;
    }

    /**
     * Gets the value of the noLock property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoLock() {
        return noLock;
    }

    /**
     * Sets the value of the noLock property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoLock(Boolean value) {
        this.noLock = value;
    }

    /**
     * Gets the value of the topCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTopCount() {
        return topCount;
    }

    /**
     * Sets the value of the topCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTopCount(Integer value) {
        this.topCount = value;
    }

}
