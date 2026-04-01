
package com.microsoft.schemas.xrm._2011.metadata;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BooleanAttributeMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BooleanAttributeMetadata">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/xrm/2011/Metadata}AttributeMetadata">
 *       &lt;sequence>
 *         &lt;element name="DefaultValue" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OptionSet" type="{http://schemas.microsoft.com/xrm/2011/Metadata}BooleanOptionSetMetadata" minOccurs="0"/>
 *         &lt;element name="FormulaDefinition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceTypeMask" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BooleanAttributeMetadata", propOrder = {
    "defaultValue",
    "optionSet",
    "formulaDefinition",
    "sourceTypeMask"
})
public class BooleanAttributeMetadata
    extends AttributeMetadata
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "DefaultValue", nillable = true)
    protected Boolean defaultValue;
    @XmlElement(name = "OptionSet", nillable = true)
    protected BooleanOptionSetMetadata optionSet;
    @XmlElement(name = "FormulaDefinition", nillable = true)
    protected String formulaDefinition;
    @XmlElement(name = "SourceTypeMask", nillable = true)
    protected Integer sourceTypeMask;

    /**
     * Gets the value of the defaultValue property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultValue() {
        return defaultValue;
    }

    /**
     * Sets the value of the defaultValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultValue(Boolean value) {
        this.defaultValue = value;
    }

    /**
     * Gets the value of the optionSet property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanOptionSetMetadata }
     *     
     */
    public BooleanOptionSetMetadata getOptionSet() {
        return optionSet;
    }

    /**
     * Sets the value of the optionSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanOptionSetMetadata }
     *     
     */
    public void setOptionSet(BooleanOptionSetMetadata value) {
        this.optionSet = value;
    }

    /**
     * Gets the value of the formulaDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormulaDefinition() {
        return formulaDefinition;
    }

    /**
     * Sets the value of the formulaDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormulaDefinition(String value) {
        this.formulaDefinition = value;
    }

    /**
     * Gets the value of the sourceTypeMask property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSourceTypeMask() {
        return sourceTypeMask;
    }

    /**
     * Sets the value of the sourceTypeMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSourceTypeMask(Integer value) {
        this.sourceTypeMask = value;
    }

}
