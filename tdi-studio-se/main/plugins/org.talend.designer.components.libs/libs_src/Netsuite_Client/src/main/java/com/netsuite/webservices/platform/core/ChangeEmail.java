
package com.netsuite.webservices.platform.core;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeEmail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeEmail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="currentPassword" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="newEmail" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="newEmail2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="justThisAccount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeEmail", propOrder = {
    "currentPassword",
    "newEmail",
    "newEmail2",
    "justThisAccount"
})
public class ChangeEmail {

    @XmlElement(required = true)
    protected String currentPassword;
    @XmlElement(required = true)
    protected String newEmail;
    @XmlElement(required = true)
    protected String newEmail2;
    protected Boolean justThisAccount;

    /**
     * Gets the value of the currentPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentPassword() {
        return currentPassword;
    }

    /**
     * Sets the value of the currentPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentPassword(String value) {
        this.currentPassword = value;
    }

    /**
     * Gets the value of the newEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewEmail() {
        return newEmail;
    }

    /**
     * Sets the value of the newEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewEmail(String value) {
        this.newEmail = value;
    }

    /**
     * Gets the value of the newEmail2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewEmail2() {
        return newEmail2;
    }

    /**
     * Sets the value of the newEmail2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewEmail2(String value) {
        this.newEmail2 = value;
    }

    /**
     * Gets the value of the justThisAccount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isJustThisAccount() {
        return justThisAccount;
    }

    /**
     * Sets the value of the justThisAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setJustThisAccount(Boolean value) {
        this.justThisAccount = value;
    }

}
