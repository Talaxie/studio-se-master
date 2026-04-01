
package com.netsuite.webservices.platform.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core.CustomizationType;


/**
 * <p>Java class for GetCustomizationIdRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCustomizationIdRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customizationType" type="{urn:core_2014_2.platform.webservices.netsuite.com}CustomizationType"/&gt;
 *         &lt;element name="includeInactives" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCustomizationIdRequest", propOrder = {
    "customizationType",
    "includeInactives"
})
public class GetCustomizationIdRequest {

    @XmlElement(required = true)
    protected CustomizationType customizationType;
    protected boolean includeInactives;

    /**
     * Gets the value of the customizationType property.
     * 
     * @return
     *     possible object is
     *     {@link CustomizationType }
     *     
     */
    public CustomizationType getCustomizationType() {
        return customizationType;
    }

    /**
     * Sets the value of the customizationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomizationType }
     *     
     */
    public void setCustomizationType(CustomizationType value) {
        this.customizationType = value;
    }

    /**
     * Gets the value of the includeInactives property.
     * 
     */
    public boolean isIncludeInactives() {
        return includeInactives;
    }

    /**
     * Sets the value of the includeInactives property.
     * 
     */
    public void setIncludeInactives(boolean value) {
        this.includeInactives = value;
    }

}
