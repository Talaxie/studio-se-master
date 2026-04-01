
package com.netsuite.webservices.platform.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core.CustomizationRef;
import com.netsuite.webservices.platform.core.SearchRowBasic;


/**
 * <p>Java class for CustomSearchRowBasic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomSearchRowBasic"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customizationRef" type="{urn:core_2014_2.platform.webservices.netsuite.com}CustomizationRef"/&gt;
 *         &lt;element name="searchRowBasic" type="{urn:core_2014_2.platform.webservices.netsuite.com}SearchRowBasic"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomSearchRowBasic", propOrder = {
    "customizationRef",
    "searchRowBasic"
})
public class CustomSearchRowBasic {

    @XmlElement(required = true)
    protected CustomizationRef customizationRef;
    @XmlElement(required = true)
    protected SearchRowBasic searchRowBasic;

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
     * Gets the value of the searchRowBasic property.
     * 
     * @return
     *     possible object is
     *     {@link SearchRowBasic }
     *     
     */
    public SearchRowBasic getSearchRowBasic() {
        return searchRowBasic;
    }

    /**
     * Sets the value of the searchRowBasic property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchRowBasic }
     *     
     */
    public void setSearchRowBasic(SearchRowBasic value) {
        this.searchRowBasic = value;
    }

}
