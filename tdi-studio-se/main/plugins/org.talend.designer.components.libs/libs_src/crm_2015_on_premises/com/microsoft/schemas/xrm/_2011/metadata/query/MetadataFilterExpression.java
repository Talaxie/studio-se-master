
package com.microsoft.schemas.xrm._2011.metadata.query;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas.xrm._2011.contracts.LogicalOperator;


/**
 * <p>Java class for MetadataFilterExpression complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MetadataFilterExpression">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Conditions" type="{http://schemas.microsoft.com/xrm/2011/Metadata/Query}ArrayOfMetadataConditionExpression" minOccurs="0"/>
 *         &lt;element name="FilterOperator" type="{http://schemas.microsoft.com/xrm/2011/Contracts}LogicalOperator" minOccurs="0"/>
 *         &lt;element name="Filters" type="{http://schemas.microsoft.com/xrm/2011/Metadata/Query}ArrayOfMetadataFilterExpression" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetadataFilterExpression", propOrder = {
    "conditions",
    "filterOperator",
    "filters"
})
public class MetadataFilterExpression
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Conditions", nillable = true)
    protected ArrayOfMetadataConditionExpression conditions;
    @XmlElement(name = "FilterOperator")
    protected LogicalOperator filterOperator;
    @XmlElement(name = "Filters", nillable = true)
    protected ArrayOfMetadataFilterExpression filters;

    /**
     * Gets the value of the conditions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMetadataConditionExpression }
     *     
     */
    public ArrayOfMetadataConditionExpression getConditions() {
        return conditions;
    }

    /**
     * Sets the value of the conditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMetadataConditionExpression }
     *     
     */
    public void setConditions(ArrayOfMetadataConditionExpression value) {
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
     *     {@link ArrayOfMetadataFilterExpression }
     *     
     */
    public ArrayOfMetadataFilterExpression getFilters() {
        return filters;
    }

    /**
     * Sets the value of the filters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMetadataFilterExpression }
     *     
     */
    public void setFilters(ArrayOfMetadataFilterExpression value) {
        this.filters = value;
    }

}
