
package com.netsuite.webservices.platform.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core.ChangePassword;


/**
 * <p>Java class for ChangePasswordRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangePasswordRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="changePassword" type="{urn:core_2014_2.platform.webservices.netsuite.com}ChangePassword"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangePasswordRequest", propOrder = {
    "changePassword"
})
public class ChangePasswordRequest {

    @XmlElement(required = true)
    protected ChangePassword changePassword;

    /**
     * Gets the value of the changePassword property.
     * 
     * @return
     *     possible object is
     *     {@link ChangePassword }
     *     
     */
    public ChangePassword getChangePassword() {
        return changePassword;
    }

    /**
     * Sets the value of the changePassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangePassword }
     *     
     */
    public void setChangePassword(ChangePassword value) {
        this.changePassword = value;
    }

}
