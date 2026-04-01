
package com.microsoft.schemas.crm._2011.contracts;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.Guid;


/**
 * <p>Java class for SdkMessageProcessingStepRegistration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SdkMessageProcessingStepRegistration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomConfiguration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FilteringAttributes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Images" type="{http://schemas.microsoft.com/crm/2011/Contracts}ArrayOfSdkMessageProcessingStepImageRegistration" minOccurs="0"/>
 *         &lt;element name="ImpersonatingUserId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="InvocationSource" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MessageName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PluginTypeFriendlyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PluginTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryEntityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecondaryEntityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Stage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SupportedDeployment" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SdkMessageProcessingStepRegistration", propOrder = {
    "customConfiguration",
    "description",
    "filteringAttributes",
    "images",
    "impersonatingUserId",
    "invocationSource",
    "messageName",
    "mode",
    "pluginTypeFriendlyName",
    "pluginTypeName",
    "primaryEntityName",
    "secondaryEntityName",
    "stage",
    "supportedDeployment"
})
public class SdkMessageProcessingStepRegistration
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "CustomConfiguration", nillable = true)
    protected String customConfiguration;
    @XmlElement(name = "Description", nillable = true)
    protected String description;
    @XmlElement(name = "FilteringAttributes", nillable = true)
    protected String filteringAttributes;
    @XmlElement(name = "Images", nillable = true)
    protected ArrayOfSdkMessageProcessingStepImageRegistration images;
    @XmlElement(name = "ImpersonatingUserId")
    protected Guid impersonatingUserId;
    @XmlElement(name = "InvocationSource")
    protected Integer invocationSource;
    @XmlElement(name = "MessageName", nillable = true)
    protected String messageName;
    @XmlElement(name = "Mode")
    protected Integer mode;
    @XmlElement(name = "PluginTypeFriendlyName", nillable = true)
    protected String pluginTypeFriendlyName;
    @XmlElement(name = "PluginTypeName", nillable = true)
    protected String pluginTypeName;
    @XmlElement(name = "PrimaryEntityName", nillable = true)
    protected String primaryEntityName;
    @XmlElement(name = "SecondaryEntityName", nillable = true)
    protected String secondaryEntityName;
    @XmlElement(name = "Stage")
    protected Integer stage;
    @XmlElement(name = "SupportedDeployment")
    protected Integer supportedDeployment;

    /**
     * Gets the value of the customConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomConfiguration() {
        return customConfiguration;
    }

    /**
     * Sets the value of the customConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomConfiguration(String value) {
        this.customConfiguration = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the filteringAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilteringAttributes() {
        return filteringAttributes;
    }

    /**
     * Sets the value of the filteringAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilteringAttributes(String value) {
        this.filteringAttributes = value;
    }

    /**
     * Gets the value of the images property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSdkMessageProcessingStepImageRegistration }
     *     
     */
    public ArrayOfSdkMessageProcessingStepImageRegistration getImages() {
        return images;
    }

    /**
     * Sets the value of the images property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSdkMessageProcessingStepImageRegistration }
     *     
     */
    public void setImages(ArrayOfSdkMessageProcessingStepImageRegistration value) {
        this.images = value;
    }

    /**
     * Gets the value of the impersonatingUserId property.
     * 
     * @return
     *     possible object is
     *     {@link Guid }
     *     
     */
    public Guid getImpersonatingUserId() {
        return impersonatingUserId;
    }

    /**
     * Sets the value of the impersonatingUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Guid }
     *     
     */
    public void setImpersonatingUserId(Guid value) {
        this.impersonatingUserId = value;
    }

    /**
     * Gets the value of the invocationSource property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInvocationSource() {
        return invocationSource;
    }

    /**
     * Sets the value of the invocationSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInvocationSource(Integer value) {
        this.invocationSource = value;
    }

    /**
     * Gets the value of the messageName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageName() {
        return messageName;
    }

    /**
     * Sets the value of the messageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageName(String value) {
        this.messageName = value;
    }

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMode(Integer value) {
        this.mode = value;
    }

    /**
     * Gets the value of the pluginTypeFriendlyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPluginTypeFriendlyName() {
        return pluginTypeFriendlyName;
    }

    /**
     * Sets the value of the pluginTypeFriendlyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPluginTypeFriendlyName(String value) {
        this.pluginTypeFriendlyName = value;
    }

    /**
     * Gets the value of the pluginTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPluginTypeName() {
        return pluginTypeName;
    }

    /**
     * Sets the value of the pluginTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPluginTypeName(String value) {
        this.pluginTypeName = value;
    }

    /**
     * Gets the value of the primaryEntityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryEntityName() {
        return primaryEntityName;
    }

    /**
     * Sets the value of the primaryEntityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryEntityName(String value) {
        this.primaryEntityName = value;
    }

    /**
     * Gets the value of the secondaryEntityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryEntityName() {
        return secondaryEntityName;
    }

    /**
     * Sets the value of the secondaryEntityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryEntityName(String value) {
        this.secondaryEntityName = value;
    }

    /**
     * Gets the value of the stage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStage() {
        return stage;
    }

    /**
     * Sets the value of the stage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStage(Integer value) {
        this.stage = value;
    }

    /**
     * Gets the value of the supportedDeployment property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSupportedDeployment() {
        return supportedDeployment;
    }

    /**
     * Sets the value of the supportedDeployment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSupportedDeployment(Integer value) {
        this.supportedDeployment = value;
    }

}
