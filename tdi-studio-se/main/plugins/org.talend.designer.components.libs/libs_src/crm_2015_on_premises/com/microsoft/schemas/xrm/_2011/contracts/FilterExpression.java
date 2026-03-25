
package com.microsoft.schemas.xrm._2011.contracts;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FilterExpression complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FilterExpression">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Conditions" type="{http://schemas.microsoft.com/xrm/2011/Contracts}ArrayOfConditionExpression" minOccurs="0"/>
 *         &lt;element name="FilterOperator" type="{http://schemas.microsoft.com/xrm/2011/Contracts}LogicalOperator" minOccurs="0"/>
 *         &lt;element name="Filters" type="{http://schemas.microsoft.com/xrm/2011/Contracts}ArrayOfFilterExpression" minOccurs="0"/>
 *         &lt;element name="IsQuickFindFilter" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilterExpression", propOrder = {
    "conditions",
    "filterOperator",
    "filters",
    "isQuickFindFilter"
})
public class FilterExpression
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Conditions", nillable = true)
    protected ArrayOfConditionExpression conditions;
    @XmlElement(name = "FilterOperator")
    protected LogicalOperator filterOperator;
    @XmlElement(name = "Filters", nillable = true)
    protected ArrayOfFilterExpression filters;
    @XmlElement(name = "IsQuickFindFilter")
    protected Boolean isQuickFindFilter;

    /**
     * Gets the value of the conditions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfConditionExpression }
     *     
     */
    public ArrayOfConditionExpression getConditions() {
        return conditions;
    }

    /**
     * Sets the value of the conditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfConditionExpression }
     *     
     */
    public void setConditions(ArrayOfConditionExpression value) {
        this.conditions = value;
    }

    /**
     * Gets the value of the filterOperator property.
     * 
     * @return
     *     possible object is
     *     {@link LogicalOperator }
     *     
     */
    public LogicalOperator getFilterOperator() {
        return filterOperator;
    }

    /**
     * Sets the value of the filterOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogicalOperator }
     *     
     */
    public void setFilterOperator(LogicalOperator value) {
        this.filterOperator = value;
    }

    /**
     * Gets the value of the filters property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFilterExpression }
     *     
     */
    public ArrayOfFilterExpression getFilters() {
        return filters;
    }

    /**
     * Sets the value of the filters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFilterExpression }
     *     
     */
    public void setFilters(ArrayOfFilterExpression value) {
        this.filters = value;
    }

    /**
     * Gets the value of the isQuickFindFilter property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsQuickFindFilter() {
        return isQuickFindFilter;
    }

    /**
     * Sets the value of the isQuickFindFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsQuickFindFilter(Boolean value) {
        this.isQuickFindFilter = value;
    }

}
