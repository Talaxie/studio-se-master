
package com.netsuite.webservices.platform.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core.CustomizationRef;
import com.netsuite.webservices.platform.core.SearchRecordBasic;


/**
 * <p>Java class for CustomSearchJoin complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomSearchJoin"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customizationRef" type="{urn:core_2014_2.platform.webservices.netsuite.com}CustomizationRef"/&gt;
 *         &lt;element name="searchRecordBasic" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchRecordBasic"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomSearchJoin", propOrder = {
    "customizationRef",
    "searchRecordBasic"
})
public class CustomSearchJoin {

    @XmlElement(required = true)
    protected CustomizationRef customizationRef;
    @XmlElement(required = true)
    protected SearchRecordBasic searchRecordBasic;

    /**
     * Gets the value of the customizationRef property.
     * 
     * @return
     *     possible object is
     *     {@link CustomizationRef }
     *     
     */
    public CustomizationRef getCustomizationRef() {
        return customizationRef;
    }

    /**
     * Sets the value of the customizationRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomizationRef }
     *     
     */
    public void setCustomizationRef(CustomizationRef value) {
        this.customizationRef = value;
    }

    /**
     * Gets the value of the searchRecordBasic property.
     * 
     * @return
     *     possible object is
     *     {@link SearchRecordBasic }
     *     
     */
    public SearchRecordBasic getSearchRecordBasic() {
        return searchRecordBasic;
    }

    /**
     * Sets the value of the searchRecordBasic property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchRecordBasic }
     *     
     */
    public void setSearchRecordBasic(SearchRecordBasic value) {
        this.searchRecordBasic = value;
    }

}
