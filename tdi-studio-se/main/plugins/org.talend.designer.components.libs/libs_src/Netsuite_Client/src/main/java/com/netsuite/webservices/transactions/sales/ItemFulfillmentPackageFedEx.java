
package com.netsuite.webservices.transactions.sales;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.transactions.sales.types.ItemFulfillmentPackageFedExAdmPackageTypeFedEx;
import com.netsuite.webservices.transactions.sales.types.ItemFulfillmentPackageFedExCodFreightTypeFedEx;
import com.netsuite.webservices.transactions.sales.types.ItemFulfillmentPackageFedExCodMethodFedEx;
import com.netsuite.webservices.transactions.sales.types.ItemFulfillmentPackageFedExDeliveryConfFedEx;
import com.netsuite.webservices.transactions.sales.types.ItemFulfillmentPackageFedExPackagingFedEx;
import com.netsuite.webservices.transactions.sales.types.ItemFulfillmentPackageFedExPriorityAlertTypeFedEx;
import com.netsuite.webservices.transactions.sales.types.ItemFulfillmentPackageFedExSignatureOptionsFedEx;


/**
 * <p>Java class for ItemFulfillmentPackageFedEx complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemFulfillmentPackageFedEx"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="packageWeightFedEx" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="dryIceWeightFedEx" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="packageTrackingNumberFedEx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="packagingFedEx" type="{urn:types.sales_2014_2.transactions.webservices.netsuite.com}ItemFulfillmentPackageFedExPackagingFedEx" minOccurs="0"/&gt;
 *         &lt;element name="admPackageTypeFedEx" type="{urn:types.sales_2014_2.transactions.webservices.netsuite.com}ItemFulfillmentPackageFedExAdmPackageTypeFedEx" minOccurs="0"/&gt;
 *         &lt;element name="isNonStandardContainerFedEx" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isAlcoholFedEx" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isNonHazLithiumFedEx" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="insuredValueFedEx" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="useInsuredValueFedEx" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="reference1FedEx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="priorityAlertTypeFedEx" type="{urn:types.sales_2014_2.transactions.webservices.netsuite.com}ItemFulfillmentPackageFedExPriorityAlertTypeFedEx" minOccurs="0"/&gt;
 *         &lt;element name="priorityAlertContentFedEx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="packageLengthFedEx" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="packageWidthFedEx" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="packageHeightFedEx" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="useCodFedEx" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="codAmountFedEx" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="codMethodFedEx" type="{urn:types.sales_2014_2.transactions.webservices.netsuite.com}ItemFulfillmentPackageFedExCodMethodFedEx" minOccurs="0"/&gt;
 *         &lt;element name="codFreightTypeFedEx" type="{urn:types.sales_2014_2.transactions.webservices.netsuite.com}ItemFulfillmentPackageFedExCodFreightTypeFedEx" minOccurs="0"/&gt;
 *         &lt;element name="deliveryConfFedEx" type="{urn:types.sales_2014_2.transactions.webservices.netsuite.com}ItemFulfillmentPackageFedExDeliveryConfFedEx" minOccurs="0"/&gt;
 *         &lt;element name="signatureOptionsFedEx" type="{urn:types.sales_2014_2.transactions.webservices.netsuite.com}ItemFulfillmentPackageFedExSignatureOptionsFedEx" minOccurs="0"/&gt;
 *         &lt;element name="signatureReleaseFedEx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="authorizationNumberFedEx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemFulfillmentPackageFedEx", propOrder = {
    "packageWeightFedEx",
    "dryIceWeightFedEx",
    "packageTrackingNumberFedEx",
    "packagingFedEx",
    "admPackageTypeFedEx",
    "isNonStandardContainerFedEx",
    "isAlcoholFedEx",
    "isNonHazLithiumFedEx",
    "insuredValueFedEx",
    "useInsuredValueFedEx",
    "reference1FedEx",
    "priorityAlertTypeFedEx",
    "priorityAlertContentFedEx",
    "packageLengthFedEx",
    "packageWidthFedEx",
    "packageHeightFedEx",
    "useCodFedEx",
    "codAmountFedEx",
    "codMethodFedEx",
    "codFreightTypeFedEx",
    "deliveryConfFedEx",
    "signatureOptionsFedEx",
    "signatureReleaseFedEx",
    "authorizationNumberFedEx"
})
public class ItemFulfillmentPackageFedEx {

    protected Double packageWeightFedEx;
    protected Double dryIceWeightFedEx;
    protected String packageTrackingNumberFedEx;
    @XmlSchemaType(name = "string")
    protected ItemFulfillmentPackageFedExPackagingFedEx packagingFedEx;
    @XmlSchemaType(name = "string")
    protected ItemFulfillmentPackageFedExAdmPackageTypeFedEx admPackageTypeFedEx;
    protected Boolean isNonStandardContainerFedEx;
    protected Boolean isAlcoholFedEx;
    protected Boolean isNonHazLithiumFedEx;
    protected Double insuredValueFedEx;
    protected Boolean useInsuredValueFedEx;
    protected String reference1FedEx;
    @XmlSchemaType(name = "string")
    protected ItemFulfillmentPackageFedExPriorityAlertTypeFedEx priorityAlertTypeFedEx;
    protected String priorityAlertContentFedEx;
    protected Long packageLengthFedEx;
    protected Long packageWidthFedEx;
    protected Long packageHeightFedEx;
    protected Boolean useCodFedEx;
    protected Double codAmountFedEx;
    @XmlSchemaType(name = "string")
    protected ItemFulfillmentPackageFedExCodMethodFedEx codMethodFedEx;
    @XmlSchemaType(name = "string")
    protected ItemFulfillmentPackageFedExCodFreightTypeFedEx codFreightTypeFedEx;
    @XmlSchemaType(name = "string")
    protected ItemFulfillmentPackageFedExDeliveryConfFedEx deliveryConfFedEx;
    @XmlSchemaType(name = "string")
    protected ItemFulfillmentPackageFedExSignatureOptionsFedEx signatureOptionsFedEx;
    protected String signatureReleaseFedEx;
    protected String authorizationNumberFedEx;

    /**
     * Gets the value of the packageWeightFedEx property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPackageWeightFedEx() {
        return packageWeightFedEx;
    }

    /**
     * Sets the value of the packageWeightFedEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPackageWeightFedEx(Double value) {
        this.packageWeightFedEx = value;
    }

    /**
     * Gets the value of the dryIceWeightFedEx property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDryIceWeightFedEx() {
        return dryIceWeightFedEx;
    }

    /**
     * Sets the value of the dryIceWeightFedEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDryIceWeightFedEx(Double value) {
        this.dryIceWeightFedEx = value;
    }

    /**
     * Gets the value of the packageTrackingNumberFedEx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageTrackingNumberFedEx() {
        return packageTrackingNumberFedEx;
    }

    /**
     * Sets the value of the packageTrackingNumberFedEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageTrackingNumberFedEx(String value) {
        this.packageTrackingNumberFedEx = value;
    }

    /**
     * Gets the value of the packagingFedEx property.
     * 
     * @return
     *     possible object is
     *     {@link ItemFulfillmentPackageFedExPackagingFedEx }
     *     
     */
    public ItemFulfillmentPackageFedExPackagingFedEx getPackagingFedEx() {
        return packagingFedEx;
    }

    /**
     * Sets the value of the packagingFedEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemFulfillmentPackageFedExPackagingFedEx }
     *     
     */
    public void setPackagingFedEx(ItemFulfillmentPackageFedExPackagingFedEx value) {
        this.packagingFedEx = value;
    }

    /**
     * Gets the value of the admPackageTypeFedEx property.
     * 
     * @return
     *     possible object is
     *     {@link ItemFulfillmentPackageFedExAdmPackageTypeFedEx }
     *     
     */
    public ItemFulfillmentPackageFedExAdmPackageTypeFedEx getAdmPackageTypeFedEx() {
        return admPackageTypeFedEx;
    }

    /**
     * Sets the value of the admPackageTypeFedEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemFulfillmentPackageFedExAdmPackageTypeFedEx }
     *     
     */
    public void setAdmPackageTypeFedEx(ItemFulfillmentPackageFedExAdmPackageTypeFedEx value) {
        this.admPackageTypeFedEx = value;
    }

    /**
     * Gets the value of the isNonStandardContainerFedEx property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNonStandardContainerFedEx() {
        return isNonStandardContainerFedEx;
    }

    /**
     * Sets the value of the isNonStandardContainerFedEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNonStandardContainerFedEx(Boolean value) {
        this.isNonStandardContainerFedEx = value;
    }

    /**
     * Gets the value of the isAlcoholFedEx property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAlcoholFedEx() {
        return isAlcoholFedEx;
    }

    /**
     * Sets the value of the isAlcoholFedEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAlcoholFedEx(Boolean value) {
        this.isAlcoholFedEx = value;
    }

    /**
     * Gets the value of the isNonHazLithiumFedEx property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNonHazLithiumFedEx() {
        return isNonHazLithiumFedEx;
    }

    /**
     * Sets the value of the isNonHazLithiumFedEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNonHazLithiumFedEx(Boolean value) {
        this.isNonHazLithiumFedEx = value;
    }

    /**
     * Gets the value of the insuredValueFedEx property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getInsuredValueFedEx() {
        return insuredValueFedEx;
    }

    /**
     * Sets the value of the insuredValueFedEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setInsuredValueFedEx(Double value) {
        this.insuredValueFedEx = value;
    }

    /**
     * Gets the value of the useInsuredValueFedEx property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseInsuredValueFedEx() {
        return useInsuredValueFedEx;
    }

    /**
     * Sets the value of the useInsuredValueFedEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseInsuredValueFedEx(Boolean value) {
        this.useInsuredValueFedEx = value;
    }

    /**
     * Gets the value of the reference1FedEx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference1FedEx() {
        return reference1FedEx;
    }

    /**
     * Sets the value of the reference1FedEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference1FedEx(String value) {
        this.reference1FedEx = value;
    }

    /**
     * Gets the value of the priorityAlertTypeFedEx property.
     * 
     * @return
     *     possible object is
     *     {@link ItemFulfillmentPackageFedExPriorityAlertTypeFedEx }
     *     
     */
    public ItemFulfillmentPackageFedExPriorityAlertTypeFedEx getPriorityAlertTypeFedEx() {
        return priorityAlertTypeFedEx;
    }

    /**
     * Sets the value of the priorityAlertTypeFedEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemFulfillmentPackageFedExPriorityAlertTypeFedEx }
     *     
     */
    public void setPriorityAlertTypeFedEx(ItemFulfillmentPackageFedExPriorityAlertTypeFedEx value) {
        this.priorityAlertTypeFedEx = value;
    }

    /**
     * Gets the value of the priorityAlertContentFedEx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorityAlertContentFedEx() {
        return priorityAlertContentFedEx;
    }

    /**
     * Sets the value of the priorityAlertContentFedEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorityAlertContentFedEx(String value) {
        this.priorityAlertContentFedEx = value;
    }

    /**
     * Gets the value of the packageLengthFedEx property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPackageLengthFedEx() {
        return packageLengthFedEx;
    }

    /**
     * Sets the value of the packageLengthFedEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPackageLengthFedEx(Long value) {
        this.packageLengthFedEx = value;
    }

    /**
     * Gets the value of the packageWidthFedEx property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPackageWidthFedEx() {
        return packageWidthFedEx;
    }

    /**
     * Sets the value of the packageWidthFedEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPackageWidthFedEx(Long value) {
        this.packageWidthFedEx = value;
    }

    /**
     * Gets the value of the packageHeightFedEx property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPackageHeightFedEx() {
        return packageHeightFedEx;
    }

    /**
     * Sets the value of the packageHeightFedEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPackageHeightFedEx(Long value) {
        this.packageHeightFedEx = value;
    }

    /**
     * Gets the value of the useCodFedEx property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseCodFedEx() {
        return useCodFedEx;
    }

    /**
     * Sets the value of the useCodFedEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseCodFedEx(Boolean value) {
        this.useCodFedEx = value;
    }

    /**
     * Gets the value of the codAmountFedEx property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCodAmountFedEx() {
        return codAmountFedEx;
    }

    /**
     * Sets the value of the codAmountFedEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCodAmountFedEx(Double value) {
        this.codAmountFedEx = value;
    }

    /**
     * Gets the value of the codMethodFedEx property.
     * 
     * @return
     *     possible object is
     *     {@link ItemFulfillmentPackageFedExCodMethodFedEx }
     *     
     */
    public ItemFulfillmentPackageFedExCodMethodFedEx getCodMethodFedEx() {
        return codMethodFedEx;
    }

    /**
     * Sets the value of the codMethodFedEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemFulfillmentPackageFedExCodMethodFedEx }
     *     
     */
    public void setCodMethodFedEx(ItemFulfillmentPackageFedExCodMethodFedEx value) {
        this.codMethodFedEx = value;
    }

    /**
     * Gets the value of the codFreightTypeFedEx property.
     * 
     * @return
     *     possible object is
     *     {@link ItemFulfillmentPackageFedExCodFreightTypeFedEx }
     *     
     */
    public ItemFulfillmentPackageFedExCodFreightTypeFedEx getCodFreightTypeFedEx() {
        return codFreightTypeFedEx;
    }

    /**
     * Sets the value of the codFreightTypeFedEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemFulfillmentPackageFedExCodFreightTypeFedEx }
     *     
     */
    public void setCodFreightTypeFedEx(ItemFulfillmentPackageFedExCodFreightTypeFedEx value) {
        this.codFreightTypeFedEx = value;
    }

    /**
     * Gets the value of the deliveryConfFedEx property.
     * 
     * @return
     *     possible object is
     *     {@link ItemFulfillmentPackageFedExDeliveryConfFedEx }
     *     
     */
    public ItemFulfillmentPackageFedExDeliveryConfFedEx getDeliveryConfFedEx() {
        return deliveryConfFedEx;
    }

    /**
     * Sets the value of the deliveryConfFedEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemFulfillmentPackageFedExDeliveryConfFedEx }
     *     
     */
    public void setDeliveryConfFedEx(ItemFulfillmentPackageFedExDeliveryConfFedEx value) {
        this.deliveryConfFedEx = value;
    }

    /**
     * Gets the value of the signatureOptionsFedEx property.
     * 
     * @return
     *     possible object is
     *     {@link ItemFulfillmentPackageFedExSignatureOptionsFedEx }
     *     
     */
    public ItemFulfillmentPackageFedExSignatureOptionsFedEx getSignatureOptionsFedEx() {
        return signatureOptionsFedEx;
    }

    /**
     * Sets the value of the signatureOptionsFedEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemFulfillmentPackageFedExSignatureOptionsFedEx }
     *     
     */
    public void setSignatureOptionsFedEx(ItemFulfillmentPackageFedExSignatureOptionsFedEx value) {
        this.signatureOptionsFedEx = value;
    }

    /**
     * Gets the value of the signatureReleaseFedEx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatureReleaseFedEx() {
        return signatureReleaseFedEx;
    }

    /**
     * Sets the value of the signatureReleaseFedEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatureReleaseFedEx(String value) {
        this.signatureReleaseFedEx = value;
    }

    /**
     * Gets the value of the authorizationNumberFedEx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationNumberFedEx() {
        return authorizationNumberFedEx;
    }

    /**
     * Sets the value of the authorizationNumberFedEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationNumberFedEx(String value) {
        this.authorizationNumberFedEx = value;
    }

}
