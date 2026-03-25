
package com.netsuite.webservices.platform.core;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchColumnMultiSelectCustomField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchColumnMultiSelectCustomField"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2014_2.platform.webservices.netsuite.com}SearchColumnCustomField"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="searchValue" type="{urn:core_2014_2.platform.webservices.netsuite.com}ListOrRecordRef" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchColumnMultiSelectCustomField", propOrder = {
    "searchValue"
})
public class SearchColumnMultiSelectCustomField
    extends SearchColumnCustomField
{

    protected List<ListOrRecordRef> searchValue;

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
     * {@link ListOrRecordRef }
     * 
     * 
     */
    public List<ListOrRecordRef> getSearchValue() {
        if (searchValue == null) {
            searchValue = new ArrayList<ListOrRecordRef>();
        }
        return this.searchValue;
    }

}
