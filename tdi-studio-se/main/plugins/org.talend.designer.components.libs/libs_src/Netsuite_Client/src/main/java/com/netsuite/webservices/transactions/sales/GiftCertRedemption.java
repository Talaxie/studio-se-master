
package com.netsuite.webservices.transactions.sales;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core.RecordRef;


/**
 * <p>Java class for GiftCertRedemption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GiftCertRedemption"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="authCode" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="authCodeApplied" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="authCodeAmtRemaining" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="giftCertAvailable" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GiftCertRedemption", propOrder = {
    "authCode",
    "authCodeApplied",
    "authCodeAmtRemaining",
    "giftCertAvailable"
})
public class GiftCertRedemption {

    protected RecordRef authCode;
    protected Double authCodeApplied;
    protected Double authCodeAmtRemaining;
    protected Double giftCertAvailable;

    /**
     * Gets the value of the authCode property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getAuthCode() {
        return authCode;
    }

    /**
     * Sets the value of the authCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setAuthCode(RecordRef value) {
        this.authCode = value;
    }

    /**
     * Gets the value of the authCodeApplied property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAuthCodeApplied() {
        return authCodeApplied;
    }

    /**
     * Sets the value of the authCodeApplied property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAuthCodeApplied(Double value) {
        this.authCodeApplied = value;
    }

    /**
     * Gets the value of the authCodeAmtRemaining property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAuthCodeAmtRemaining() {
        return authCodeAmtRemaining;
    }

    /**
     * Sets the value of the authCodeAmtRemaining property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAuthCodeAmtRemaining(Double value) {
        this.authCodeAmtRemaining = value;
    }

    /**
     * Gets the value of the giftCertAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGiftCertAvailable() {
        return giftCertAvailable;
    }

    /**
     * Sets the value of the giftCertAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGiftCertAvailable(Double value) {
        this.giftCertAvailable = value;
    }

}
