
package com.netsuite.webservices.transactions.sales;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core.RecordRef;


/**
 * <p>Java class for TransactionShipGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionShipGroup"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="isFulfilled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="sourceAddressRef" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="sourceAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="destinationAddressRef" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="destinationAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shippingMethodRef" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="shippingMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isHandlingTaxable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="handlingTaxCode" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="handlingTaxRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="handlingTax2Rate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="handlingRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="handlingTaxAmt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="handlingTax2Amt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="isShippingTaxable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="shippingTaxCode" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="shippingTaxRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shippingTax2Rate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shippingRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="shippingTaxAmt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="shippingTax2Amt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionShipGroup", propOrder = {
    "id",
    "isFulfilled",
    "weight",
    "sourceAddressRef",
    "sourceAddress",
    "destinationAddressRef",
    "destinationAddress",
    "shippingMethodRef",
    "shippingMethod",
    "isHandlingTaxable",
    "handlingTaxCode",
    "handlingTaxRate",
    "handlingTax2Rate",
    "handlingRate",
    "handlingTaxAmt",
    "handlingTax2Amt",
    "isShippingTaxable",
    "shippingTaxCode",
    "shippingTaxRate",
    "shippingTax2Rate",
    "shippingRate",
    "shippingTaxAmt",
    "shippingTax2Amt"
})
public class TransactionShipGroup {

    protected Long id;
    protected Boolean isFulfilled;
    protected Double weight;
    protected RecordRef sourceAddressRef;
    protected String sourceAddress;
    protected RecordRef destinationAddressRef;
    protected String destinationAddress;
    protected RecordRef shippingMethodRef;
    protected String shippingMethod;
    protected Boolean isHandlingTaxable;
    protected RecordRef handlingTaxCode;
    protected String handlingTaxRate;
    protected String handlingTax2Rate;
    protected Double handlingRate;
    protected Double handlingTaxAmt;
    protected Double handlingTax2Amt;
    protected Boolean isShippingTaxable;
    protected RecordRef shippingTaxCode;
    protected String shippingTaxRate;
    protected String shippingTax2Rate;
    protected Double shippingRate;
    protected Double shippingTaxAmt;
    protected Double shippingTax2Amt;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the isFulfilled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFulfilled() {
        return isFulfilled;
    }

    /**
     * Sets the value of the isFulfilled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFulfilled(Boolean value) {
        this.isFulfilled = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWeight(Double value) {
        this.weight = value;
    }

    /**
     * Gets the value of the sourceAddressRef property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSourceAddressRef() {
        return sourceAddressRef;
    }

    /**
     * Sets the value of the sourceAddressRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSourceAddressRef(RecordRef value) {
        this.sourceAddressRef = value;
    }

    /**
     * Gets the value of the sourceAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceAddress() {
        return sourceAddress;
    }

    /**
     * Sets the value of the sourceAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceAddress(String value) {
        this.sourceAddress = value;
    }

    /**
     * Gets the value of the destinationAddressRef property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getDestinationAddressRef() {
        return destinationAddressRef;
    }

    /**
     * Sets the value of the destinationAddressRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setDestinationAddressRef(RecordRef value) {
        this.destinationAddressRef = value;
    }

    /**
     * Gets the value of the destinationAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationAddress() {
        return destinationAddress;
    }

    /**
     * Sets the value of the destinationAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationAddress(String value) {
        this.destinationAddress = value;
    }

    /**
     * Gets the value of the shippingMethodRef property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getShippingMethodRef() {
        return shippingMethodRef;
    }

    /**
     * Sets the value of the shippingMethodRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setShippingMethodRef(RecordRef value) {
        this.shippingMethodRef = value;
    }

    /**
     * Gets the value of the shippingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingMethod() {
        return shippingMethod;
    }

    /**
     * Sets the value of the shippingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingMethod(String value) {
        this.shippingMethod = value;
    }

    /**
     * Gets the value of the isHandlingTaxable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsHandlingTaxable() {
        return isHandlingTaxable;
    }

    /**
     * Sets the value of the isHandlingTaxable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsHandlingTaxable(Boolean value) {
        this.isHandlingTaxable = value;
    }

    /**
     * Gets the value of the handlingTaxCode property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getHandlingTaxCode() {
        return handlingTaxCode;
    }

    /**
     * Sets the value of the handlingTaxCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setHandlingTaxCode(RecordRef value) {
        this.handlingTaxCode = value;
    }

    /**
     * Gets the value of the handlingTaxRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandlingTaxRate() {
        return handlingTaxRate;
    }

    /**
     * Sets the value of the handlingTaxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandlingTaxRate(String value) {
        this.handlingTaxRate = value;
    }

    /**
     * Gets the value of the handlingTax2Rate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandlingTax2Rate() {
        return handlingTax2Rate;
    }

    /**
     * Sets the value of the handlingTax2Rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandlingTax2Rate(String value) {
        this.handlingTax2Rate = value;
    }

    /**
     * Gets the value of the handlingRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHandlingRate() {
        return handlingRate;
    }

    /**
     * Sets the value of the handlingRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHandlingRate(Double value) {
        this.handlingRate = value;
    }

    /**
     * Gets the value of the handlingTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHandlingTaxAmt() {
        return handlingTaxAmt;
    }

    /**
     * Sets the value of the handlingTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHandlingTaxAmt(Double value) {
        this.handlingTaxAmt = value;
    }

    /**
     * Gets the value of the handlingTax2Amt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHandlingTax2Amt() {
        return handlingTax2Amt;
    }

    /**
     * Sets the value of the handlingTax2Amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHandlingTax2Amt(Double value) {
        this.handlingTax2Amt = value;
    }

    /**
     * Gets the value of the isShippingTaxable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsShippingTaxable() {
        return isShippingTaxable;
    }

    /**
     * Sets the value of the isShippingTaxable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsShippingTaxable(Boolean value) {
        this.isShippingTaxable = value;
    }

    /**
     * Gets the value of the shippingTaxCode property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getShippingTaxCode() {
        return shippingTaxCode;
    }

    /**
     * Sets the value of the shippingTaxCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setShippingTaxCode(RecordRef value) {
        this.shippingTaxCode = value;
    }

    /**
     * Gets the value of the shippingTaxRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingTaxRate() {
        return shippingTaxRate;
    }

    /**
     * Sets the value of the shippingTaxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingTaxRate(String value) {
        this.shippingTaxRate = value;
    }

    /**
     * Gets the value of the shippingTax2Rate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingTax2Rate() {
        return shippingTax2Rate;
    }

    /**
     * Sets the value of the shippingTax2Rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingTax2Rate(String value) {
        this.shippingTax2Rate = value;
    }

    /**
     * Gets the value of the shippingRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getShippingRate() {
        return shippingRate;
    }

    /**
     * Sets the value of the shippingRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setShippingRate(Double value) {
        this.shippingRate = value;
    }

    /**
     * Gets the value of the shippingTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getShippingTaxAmt() {
        return shippingTaxAmt;
    }

    /**
     * Sets the value of the shippingTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setShippingTaxAmt(Double value) {
        this.shippingTaxAmt = value;
    }

    /**
     * Gets the value of the shippingTax2Amt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getShippingTax2Amt() {
        return shippingTax2Amt;
    }

    /**
     * Sets the value of the shippingTax2Amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setShippingTax2Amt(Double value) {
        this.shippingTax2Amt = value;
    }

}
