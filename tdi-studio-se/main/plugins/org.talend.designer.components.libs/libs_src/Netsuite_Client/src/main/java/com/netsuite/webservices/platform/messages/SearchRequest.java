
package com.netsuite.webservices.platform.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core.SearchRecord;


/**
 * <p>Java class for SearchRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="searchRecord" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchRecord"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchRequest", propOrder = {
    "searchRecord"
})
public class SearchRequest {

    @XmlElement(required = true)
    protected SearchRecord searchRecord;

    /**
     * Gets the value of the searchRecord property.
     * 
     * @return
     *     possible object is
     *     {@link SearchRecord }
     *     
     */
    public SearchRecord getSearchRecord() {
        return searchRecord;
    }

    /**
     * Sets the value of the searchRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchRecord }
     *     
     */
    public void setSearchRecord(SearchRecord value) {
        this.searchRecord = value;
    }

}
