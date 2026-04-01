
package com.netsuite.webservices.platform.core;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core.types.SearchEnumMultiSelectFieldOperator;


/**
 * <p>Java class for SearchEnumMultiSelectCustomField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchEnumMultiSelectCustomField"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2014_2.platform.webservices.netsuite.com}SearchCustomField"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="searchValue" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="operator" type="{urn:types.core_2014_2.platform.webservices.netsuite.com}SearchEnumMultiSelectFieldOperator" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchEnumMultiSelectCustomField", propOrder = {
    "searchValue"
})
public class SearchEnumMultiSelectCustomField
    extends SearchCustomField
{

    protected List<String> searchValue;
    @XmlAttribute(name = "operator")
    protected SearchEnumMultiSelectFieldOperator operator;

    /**
     * Gets the value of the searchValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSearchValue() {
        if (searchValue == null) {
            searchValue = new ArrayList<String>();
        }
        return this.searchValue;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectFieldOperator }
     *     
     */
    public SearchEnumMultiSelectFieldOperator getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectFieldOperator }
     *     
     */
    public void setOperator(SearchEnumMultiSelectFieldOperator value) {
        this.operator = value;
    }

}
