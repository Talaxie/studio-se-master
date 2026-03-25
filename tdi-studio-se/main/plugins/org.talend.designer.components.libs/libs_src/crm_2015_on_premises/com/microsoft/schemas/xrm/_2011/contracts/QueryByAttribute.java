
package com.microsoft.schemas.xrm._2011.contracts;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfanyType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;


/**
 * <p>Java class for QueryByAttribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryByAttribute">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/xrm/2011/Contracts}QueryBase">
 *       &lt;sequence>
 *         &lt;element name="Attributes" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="ColumnSet" type="{http://schemas.microsoft.com/xrm/2011/Contracts}ColumnSet" minOccurs="0"/>
 *         &lt;element name="EntityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Orders" type="{http://schemas.microsoft.com/xrm/2011/Contracts}ArrayOfOrderExpression" minOccurs="0"/>
 *         &lt;element name="PageInfo" type="{http://schemas.microsoft.com/xrm/2011/Contracts}PagingInfo" minOccurs="0"/>
 *         &lt;element name="Values" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfanyType" minOccurs="0"/>
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
@XmlType(name = "QueryByAttribute", propOrder = {
    "attributes",
    "columnSet",
    "entityName",
    "orders",
    "pageInfo",
    "values",
    "topCount"
})
public class QueryByAttribute
    extends QueryBase
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Attributes", nillable = true)
    protected ArrayOfstring attributes;
    @XmlElement(name = "ColumnSet", nillable = true)
    protected ColumnSet columnSet;
    @XmlElement(name = "EntityName", nillable = true)
    protected String entityName;
    @XmlElement(name = "Orders", nillable = true)
    protected ArrayOfOrderExpression orders;
    @XmlElement(name = "PageInfo", nillable = true)
    protected PagingInfo pageInfo;
    @XmlElement(name = "Values", nillable = true)
    protected ArrayOfanyType values;
    @XmlElement(name = "TopCount", nillable = true)
    protected Integer topCount;

    /**
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setAttributes(ArrayOfstring value) {
        this.attributes = value;
    }

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
     * Gets the value of the values property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfanyType }
     *     
     */
    public ArrayOfanyType getValues() {
        return values;
    }

    /**
     * Sets the value of the values property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfanyType }
     *     
     */
    public void setValues(ArrayOfanyType value) {
        this.values = value;
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
