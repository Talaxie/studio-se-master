
package com.netsuite.webservices.transactions.sales;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.transactions.sales.types.ItemFulfillmentPackageUpsCodMethodUps;
import com.netsuite.webservices.transactions.sales.types.ItemFulfillmentPackageUpsDeliveryConfUps;
import com.netsuite.webservices.transactions.sales.types.ItemFulfillmentPackageUpsPackagingUps;


/**
 * <p>Java class for ItemFulfillmentPackageUps complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemFulfillmentPackageUps"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="packageWeightUps" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="packageDescrUps" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="packageTrackingNumberUps" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="packagingUps" type="{urn:types.sales_2014_2.transactions.webservices.netsuite.com}ItemFulfillmentPackageUpsPackagingUps" minOccurs="0"/&gt;
 *         &lt;element name="useInsuredValueUps" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="insuredValueUps" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="reference1Ups" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reference2Ups" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="packageLengthUps" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="packageWidthUps" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="packageHeightUps" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="additionalHandlingUps" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="useCodUps" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="codAmountUps" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="codMethodUps" type="{urn:types.sales_2014_2.transactions.webservices.netsuite.com}ItemFulfillmentPackageUpsCodMethodUps" minOccurs="0"/&gt;
 *         &lt;element name="deliveryConfUps" type="{urn:types.sales_2014_2.transactions.webservices.netsuite.com}ItemFulfillmentPackageUpsDeliveryConfUps" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemFulfillmentPackageUps", propOrder = {
    "packageWeightUps",
    "packageDescrUps",
    "packageTrackingNumberUps",
    "packagingUps",
    "useInsuredValueUps",
    "insuredValueUps",
    "reference1Ups",
    "reference2Ups",
    "packageLengthUps",
    "packageWidthUps",
    "packageHeightUps",
    "additionalHandlingUps",
    "useCodUps",
    "codAmountUps",
    "codMethodUps",
    "deliveryConfUps"
})
public class ItemFulfillmentPackageUps {

    protected Double packageWeightUps;
    protected String packageDescrUps;
    protected String packageTrackingNumberUps;
    @XmlSchemaType(name = "string")
    protected ItemFulfillmentPackageUpsPackagingUps packagingUps;
    protected Boolean useInsuredValueUps;
    protected Double insuredValueUps;
    protected String reference1Ups;
    protected String reference2Ups;
    protected Long packageLengthUps;
    protected Long packageWidthUps;
    protected Long packageHeightUps;
    protected Boolean additionalHandlingUps;
    protected Boolean useCodUps;
    protected Double codAmountUps;
    @XmlSchemaType(name = "string")
    protected ItemFulfillmentPackageUpsCodMethodUps codMethodUps;
    @XmlSchemaType(name = "string")
    protected ItemFulfillmentPackageUpsDeliveryConfUps deliveryConfUps;

    /**
     * Gets the value of the packageWeightUps property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPackageWeightUps() {
        return packageWeightUps;
    }

    /**
     * Sets the value of the packageWeightUps property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPackageWeightUps(Double value) {
        this.packageWeightUps = value;
    }

    /**
     * Gets the value of the packageDescrUps property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageDescrUps() {
        return packageDescrUps;
    }

    /**
     * Sets the value of the packageDescrUps property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageDescrUps(String value) {
        this.packageDescrUps = value;
    }

    /**
     * Gets the value of the packageTrackingNumberUps property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageTrackingNumberUps() {
        return packageTrackingNumberUps;
    }

    /**
     * Sets the value of the packageTrackingNumberUps property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageTrackingNumberUps(String value) {
        this.packageTrackingNumberUps = value;
    }

    /**
     * Gets the value of the packagingUps property.
     * 
     * @return
     *     possible object is
     *     {@link ItemFulfillmentPackageUpsPackagingUps }
     *     
     */
    public ItemFulfillmentPackageUpsPackagingUps getPackagingUps() {
        return packagingUps;
    }

    /**
     * Sets the value of the packagingUps property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemFulfillmentPackageUpsPackagingUps }
     *     
     */
    public void setPackagingUps(ItemFulfillmentPackageUpsPackagingUps value) {
        this.packagingUps = value;
    }

    /**
     * Gets the value of the useInsuredValueUps property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseInsuredValueUps() {
        return useInsuredValueUps;
    }

    /**
     * Sets the value of the useInsuredValueUps property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseInsuredValueUps(Boolean value) {
        this.useInsuredValueUps = value;
    }

    /**
     * Gets the value of the insuredValueUps property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getInsuredValueUps() {
        return insuredValueUps;
    }

    /**
     * Sets the value of the insuredValueUps property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setInsuredValueUps(Double value) {
        this.insuredValueUps = value;
    }

    /**
     * Gets the value of the reference1Ups property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference1Ups() {
        return reference1Ups;
    }

    /**
     * Sets the value of the reference1Ups property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference1Ups(String value) {
        this.reference1Ups = value;
    }

    /**
     * Gets the value of the reference2Ups property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference2Ups() {
        return reference2Ups;
    }

    /**
     * Sets the value of the reference2Ups property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference2Ups(String value) {
        this.reference2Ups = value;
    }

    /**
     * Gets the value of the packageLengthUps property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPackageLengthUps() {
        return packageLengthUps;
    }

    /**
     * Sets the value of the packageLengthUps property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPackageLengthUps(Long value) {
        this.packageLengthUps = value;
    }

    /**
     * Gets the value of the packageWidthUps property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPackageWidthUps() {
        return packageWidthUps;
    }

    /**
     * Sets the value of the packageWidthUps property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPackageWidthUps(Long value) {
        this.packageWidthUps = value;
    }

    /**
     * Gets the value of the packageHeightUps property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPackageHeightUps() {
        return packageHeightUps;
    }

    /**
     * Sets the value of the packageHeightUps property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPackageHeightUps(Long value) {
        this.packageHeightUps = value;
    }

    /**
     * Gets the value of the additionalHandlingUps property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdditionalHandlingUps() {
        return additionalHandlingUps;
    }

    /**
     * Sets the value of the additionalHandlingUps property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdditionalHandlingUps(Boolean value) {
        this.additionalHandlingUps = value;
    }

    /**
     * Gets the value of the useCodUps property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseCodUps() {
        return useCodUps;
    }

    /**
     * Sets the value of the useCodUps property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseCodUps(Boolean value) {
        this.useCodUps = value;
    }

    /**
     * Gets the value of the codAmountUps property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCodAmountUps() {
        return codAmountUps;
    }

    /**
     * Sets the value of the codAmountUps property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCodAmountUps(Double value) {
        this.codAmountUps = value;
    }

    /**
     * Gets the value of the codMethodUps property.
     * 
     * @return
     *     possible object is
     *     {@link ItemFulfillmentPackageUpsCodMethodUps }
     *     
     */
    public ItemFulfillmentPackageUpsCodMethodUps getCodMethodUps() {
        return codMethodUps;
    }

    /**
     * Sets the value of the codMethodUps property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemFulfillmentPackageUpsCodMethodUps }
     *     
     */
    public void setCodMethodUps(ItemFulfillmentPackageUpsCodMethodUps value) {
        this.codMethodUps = value;
    }

    /**
     * Gets the value of the deliveryConfUps property.
     * 
     * @return
     *     possible object is
     *     {@link ItemFulfillmentPackageUpsDeliveryConfUps }
     *     
     */
    public ItemFulfillmentPackageUpsDeliveryConfUps getDeliveryConfUps() {
        return deliveryConfUps;
    }

    /**
     * Sets the value of the deliveryConfUps property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemFulfillmentPackageUpsDeliveryConfUps }
     *     
     */
    public void setDeliveryConfUps(ItemFulfillmentPackageUpsDeliveryConfUps value) {
        this.deliveryConfUps = value;
    }

}
