
package com.netsuite.webservices.platform.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core.SsoCredentials;


/**
 * <p>Java class for MapSsoRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MapSsoRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ssoCredentials" type="{urn:core_2014_2.platform.webservices.netsuite.com}SsoCredentials"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MapSsoRequest", propOrder = {
    "ssoCredentials"
})
public class MapSsoRequest {

    @XmlElement(required = true)
    protected SsoCredentials ssoCredentials;

    /**
     * Gets the value of the ssoCredentials property.
     * 
     * @return
     *     possible object is
     *     {@link SsoCredentials }
     *     
     */
    public SsoCredentials getSsoCredentials() {
        return ssoCredentials;
    }

    /**
     * Sets the value of the ssoCredentials property.
     * 
     * @param value
     *     allowed object is
     *     {@link SsoCredentials }
     *     
     */
    public void setSsoCredentials(SsoCredentials value) {
        this.ssoCredentials = value;
    }

}
