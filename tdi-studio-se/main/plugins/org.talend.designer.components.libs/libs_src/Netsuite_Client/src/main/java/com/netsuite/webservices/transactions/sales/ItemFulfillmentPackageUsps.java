
package com.netsuite.webservices.transactions.sales;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.transactions.sales.types.ItemFulfillmentPackageUspsDeliveryConfUsps;
import com.netsuite.webservices.transactions.sales.types.ItemFulfillmentPackageUspsPackagingUsps;


/**
 * <p>Java class for ItemFulfillmentPackageUsps complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemFulfillmentPackageUsps"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="packageWeightUsps" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="packageDescrUsps" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="packageTrackingNumberUsps" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="packagingUsps" type="{urn:types.sales_2014_2.transactions.webservices.netsuite.com}ItemFulfillmentPackageUspsPackagingUsps" minOccurs="0"/&gt;
 *         &lt;element name="useInsuredValueUsps" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="insuredValueUsps" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="reference1Usps" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reference2Usps" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="packageLengthUsps" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="packageWidthUsps" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="packageHeightUsps" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="deliveryConfUsps" type="{urn:types.sales_2014_2.transactions.webservices.netsuite.com}ItemFulfillmentPackageUspsDeliveryConfUsps" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemFulfillmentPackageUsps", propOrder = {
    "packageWeightUsps",
    "packageDescrUsps",
    "packageTrackingNumberUsps",
    "packagingUsps",
    "useInsuredValueUsps",
    "insuredValueUsps",
    "reference1Usps",
    "reference2Usps",
    "packageLengthUsps",
    "packageWidthUsps",
    "packageHeightUsps",
    "deliveryConfUsps"
})
public class ItemFulfillmentPackageUsps {

    protected Double packageWeightUsps;
    protected String packageDescrUsps;
    protected String packageTrackingNumberUsps;
    @XmlSchemaType(name = "string")
    protected ItemFulfillmentPackageUspsPackagingUsps packagingUsps;
    protected Boolean useInsuredValueUsps;
    protected Double insuredValueUsps;
    protected String reference1Usps;
    protected String reference2Usps;
    protected Long packageLengthUsps;
    protected Long packageWidthUsps;
    protected Long packageHeightUsps;
    @XmlSchemaType(name = "string")
    protected ItemFulfillmentPackageUspsDeliveryConfUsps deliveryConfUsps;

    /**
     * Gets the value of the packageWeightUsps property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPackageWeightUsps() {
        return packageWeightUsps;
    }

    /**
     * Sets the value of the packageWeightUsps property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPackageWeightUsps(Double value) {
        this.packageWeightUsps = value;
    }

    /**
     * Gets the value of the packageDescrUsps property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageDescrUsps() {
        return packageDescrUsps;
    }

    /**
     * Sets the value of the packageDescrUsps property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageDescrUsps(String value) {
        this.packageDescrUsps = value;
    }

    /**
     * Gets the value of the packageTrackingNumberUsps property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageTrackingNumberUsps() {
        return packageTrackingNumberUsps;
    }

    /**
     * Sets the value of the packageTrackingNumberUsps property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageTrackingNumberUsps(String value) {
        this.packageTrackingNumberUsps = value;
    }

    /**
     * Gets the value of the packagingUsps property.
     * 
     * @return
     *     possible object is
     *     {@link ItemFulfillmentPackageUspsPackagingUsps }
     *     
     */
    public ItemFulfillmentPackageUspsPackagingUsps getPackagingUsps() {
        return packagingUsps;
    }

    /**
     * Sets the value of the packagingUsps property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemFulfillmentPackageUspsPackagingUsps }
     *     
     */
    public void setPackagingUsps(ItemFulfillmentPackageUspsPackagingUsps value) {
        this.packagingUsps = value;
    }

    /**
     * Gets the value of the useInsuredValueUsps property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseInsuredValueUsps() {
        return useInsuredValueUsps;
    }

    /**
     * Sets the value of the useInsuredValueUsps property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseInsuredValueUsps(Boolean value) {
        this.useInsuredValueUsps = value;
    }

    /**
     * Gets the value of the insuredValueUsps property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getInsuredValueUsps() {
        return insuredValueUsps;
    }

    /**
     * Sets the value of the insuredValueUsps property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setInsuredValueUsps(Double value) {
        this.insuredValueUsps = value;
    }

    /**
     * Gets the value of the reference1Usps property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference1Usps() {
        return reference1Usps;
    }

    /**
     * Sets the value of the reference1Usps property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference1Usps(String value) {
        this.reference1Usps = value;
    }

    /**
     * Gets the value of the reference2Usps property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference2Usps() {
        return reference2Usps;
    }

    /**
     * Sets the value of the reference2Usps property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference2Usps(String value) {
        this.reference2Usps = value;
    }

    /**
     * Gets the value of the packageLengthUsps property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPackageLengthUsps() {
        return packageLengthUsps;
    }

    /**
     * Sets the value of the packageLengthUsps property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPackageLengthUsps(Long value) {
        this.packageLengthUsps = value;
    }

    /**
     * Gets the value of the packageWidthUsps property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPackageWidthUsps() {
        return packageWidthUsps;
    }

    /**
     * Sets the value of the packageWidthUsps property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPackageWidthUsps(Long value) {
        this.packageWidthUsps = value;
    }

    /**
     * Gets the value of the packageHeightUsps property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPackageHeightUsps() {
        return packageHeightUsps;
    }

    /**
     * Sets the value of the packageHeightUsps property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPackageHeightUsps(Long value) {
        this.packageHeightUsps = value;
    }

    /**
     * Gets the value of the deliveryConfUsps property.
     * 
     * @return
     *     possible object is
     *     {@link ItemFulfillmentPackageUspsDeliveryConfUsps }
     *     
     */
    public ItemFulfillmentPackageUspsDeliveryConfUsps getDeliveryConfUsps() {
        return deliveryConfUsps;
    }

    /**
     * Sets the value of the deliveryConfUsps property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemFulfillmentPackageUspsDeliveryConfUsps }
     *     
     */
    public void setDeliveryConfUsps(ItemFulfillmentPackageUspsDeliveryConfUsps value) {
        this.deliveryConfUsps = value;
    }

}
