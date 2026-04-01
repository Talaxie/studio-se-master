
package com.netsuite.webservices.platform.core;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.netsuite.webservices.platform.core.types.SearchDate;
import com.netsuite.webservices.platform.core.types.SearchDateFieldOperator;


/**
 * <p>Java class for SearchDateCustomField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchDateCustomField"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2014_2.platform.webservices.netsuite.com}SearchCustomField"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="predefinedSearchValue" type="{urn:types.core_2014_2.platform.webservices.netsuite.com}SearchDate" minOccurs="0"/&gt;
 *         &lt;element name="searchValue" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="searchValue2" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="operator" type="{urn:types.core_2014_2.platform.webservices.netsuite.com}SearchDateFieldOperator" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchDateCustomField", propOrder = {
    "predefinedSearchValue",
    "searchValue",
    "searchValue2"
})
public class SearchDateCustomField
    extends SearchCustomField
{

    @XmlSchemaType(name = "string")
    protected SearchDate predefinedSearchValue;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar searchValue;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar searchValue2;
    @XmlAttribute(name = "operator")
    protected SearchDateFieldOperator operator;

    /**
     * Gets the value of the predefinedSearchValue property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDate }
     *     
     */
    public SearchDate getPredefinedSearchValue() {
        return predefinedSearchValue;
    }

    /**
     * Sets the value of the predefinedSearchValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDate }
     *     
     */
    public void setPredefinedSearchValue(SearchDate value) {
        this.predefinedSearchValue = value;
    }

    /**
     * Gets the value of the searchValue property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSearchValue() {
        return searchValue;
    }

    /**
     * Sets the value of the searchValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSearchValue(XMLGregorianCalendar value) {
        this.searchValue = value;
    }

    /**
     * Gets the value of the searchValue2 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSearchValue2() {
        return searchValue2;
    }

    /**
     * Sets the value of the searchValue2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSearchValue2(XMLGregorianCalendar value) {
        this.searchValue2 = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDateFieldOperator }
     *     
     */
    public SearchDateFieldOperator getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateFieldOperator }
     *     
     */
    public void setOperator(SearchDateFieldOperator value) {
        this.operator = value;
    }

}
