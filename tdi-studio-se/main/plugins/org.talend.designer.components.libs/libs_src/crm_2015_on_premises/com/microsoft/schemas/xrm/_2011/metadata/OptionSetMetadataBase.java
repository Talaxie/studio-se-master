
package com.microsoft.schemas.xrm._2011.metadata;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas.xrm._2011.contracts.BooleanManagedProperty;
import com.microsoft.schemas.xrm._2011.contracts.Label;


/**
 * <p>Java class for OptionSetMetadataBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OptionSetMetadataBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/xrm/2011/Metadata}MetadataBase">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{http://schemas.microsoft.com/xrm/2011/Contracts}Label" minOccurs="0"/>
 *         &lt;element name="DisplayName" type="{http://schemas.microsoft.com/xrm/2011/Contracts}Label" minOccurs="0"/>
 *         &lt;element name="IsCustomOptionSet" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsCustomizable" type="{http://schemas.microsoft.com/xrm/2011/Contracts}BooleanManagedProperty" minOccurs="0"/>
 *         &lt;element name="IsGlobal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsManaged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OptionSetType" type="{http://schemas.microsoft.com/xrm/2011/Metadata}OptionSetType" minOccurs="0"/>
 *         &lt;element name="IntroducedVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionSetMetadataBase", propOrder = {
    "description",
    "displayName",
    "isCustomOptionSet",
    "isCustomizable",
    "isGlobal",
    "isManaged",
    "name",
    "optionSetType",
    "introducedVersion"
})
@XmlSeeAlso({
    BooleanOptionSetMetadata.class,
    OptionSetMetadata.class
})
public class OptionSetMetadataBase
    extends MetadataBase
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Description", nillable = true)
    protected Label description;
    @XmlElement(name = "DisplayName", nillable = true)
    protected Label displayName;
    @XmlElement(name = "IsCustomOptionSet", nillable = true)
    protected Boolean isCustomOptionSet;
    @XmlElement(name = "IsCustomizable", nillable = true)
    protected BooleanManagedProperty isCustomizable;
    @XmlElement(name = "IsGlobal", nillable = true)
    protected Boolean isGlobal;
    @XmlElement(name = "IsManaged", nillable = true)
    protected Boolean isManaged;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "OptionSetType", nillable = true)
    protected OptionSetType optionSetType;
    @XmlElement(name = "IntroducedVersion", nillable = true)
    protected String introducedVersion;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link Label }
     *     
     */
    public Label getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link Label }
     *     
     */
    public void setDescription(Label value) {
        this.description = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link Label }
     *     
     */
    public Label getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Label }
     *     
     */
    public void setDisplayName(Label value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the isCustomOptionSet property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCustomOptionSet() {
        return isCustomOptionSet;
    }

    /**
     * Sets the value of the isCustomOptionSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCustomOptionSet(Boolean value) {
        this.isCustomOptionSet = value;
    }

    /**
     * Gets the value of the isCustomizable property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanManagedProperty }
     *     
     */
    public BooleanManagedProperty getIsCustomizable() {
        return isCustomizable;
    }

    /**
     * Sets the value of the isCustomizable property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanManagedProperty }
     *     
     */
    public void setIsCustomizable(BooleanManagedProperty value) {
        this.isCustomizable = value;
    }

    /**
     * Gets the value of the isGlobal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsGlobal() {
        return isGlobal;
    }

    /**
     * Sets the value of the isGlobal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsGlobal(Boolean value) {
        this.isGlobal = value;
    }

    /**
     * Gets the value of the isManaged property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsManaged() {
        return isManaged;
    }

    /**
     * Sets the value of the isManaged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsManaged(Boolean value) {
        this.isManaged = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the optionSetType property.
     * 
     * @return
     *     possible object is
     *     {@link OptionSetType }
     *     
     */
    public OptionSetType getOptionSetType() {
        return optionSetType;
    }

    /**
     * Sets the value of the optionSetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionSetType }
     *     
     */
    public void setOptionSetType(OptionSetType value) {
        this.optionSetType = value;
    }

    /**
     * Gets the value of the introducedVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntroducedVersion() {
        return introducedVersion;
    }

    /**
     * Sets the value of the introducedVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntroducedVersion(String value) {
        this.introducedVersion = value;
    }

}
