
package com.netsuite.webservices.platform.core;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core.types.SearchLongFieldOperator;


/**
 * <p>Java class for SearchLongCustomField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchLongCustomField"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2014_2.platform.webservices.netsuite.com}SearchCustomField"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="searchValue" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="searchValue2" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="operator" type="{urn:types.core_2014_2.platform.webservices.netsuite.com}SearchLongFieldOperator" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchLongCustomField", propOrder = {
    "searchValue",
    "searchValue2"
})
public class SearchLongCustomField
    extends SearchCustomField
{

    protected Long searchValue;
    protected Long searchValue2;
    @XmlAttribute(name = "operator")
    protected SearchLongFieldOperator operator;

    /**
     * Gets the value of the searchValue property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSearchValue() {
        return searchValue;
    }

    /**
     * Sets the value of the searchValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSearchValue(Long value) {
        this.searchValue = value;
    }

    /**
     * Gets the value of the searchValue2 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSearchValue2() {
        return searchValue2;
    }

    /**
     * Sets the value of the searchValue2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSearchValue2(Long value) {
        this.searchValue2 = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongFieldOperator }
     *     
     */
    public SearchLongFieldOperator getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongFieldOperator }
     *     
     */
    public void setOperator(SearchLongFieldOperator value) {
        this.operator = value;
    }

}
