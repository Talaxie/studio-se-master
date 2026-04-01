
package com.netsuite.webservices.platform.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core.ChangeEmail;


/**
 * <p>Java class for ChangeEmailRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeEmailRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="changeEmail" type="{urn:core_2014_2.platform.webservices.netsuite.com}ChangeEmail"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeEmailRequest", propOrder = {
    "changeEmail"
})
public class ChangeEmailRequest {

    @XmlElement(required = true)
    protected ChangeEmail changeEmail;

    /**
     * Gets the value of the changeEmail property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeEmail }
     *     
     */
    public ChangeEmail getChangeEmail() {
        return changeEmail;
    }

    /**
     * Sets the value of the changeEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeEmail }
     *     
     */
    public void setChangeEmail(ChangeEmail value) {
        this.changeEmail = value;
    }

}
