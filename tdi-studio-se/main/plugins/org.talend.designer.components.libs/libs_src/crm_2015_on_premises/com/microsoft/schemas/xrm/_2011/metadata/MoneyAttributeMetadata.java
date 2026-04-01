
package com.microsoft.schemas.xrm._2011.metadata;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MoneyAttributeMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MoneyAttributeMetadata">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/xrm/2011/Metadata}AttributeMetadata">
 *       &lt;sequence>
 *         &lt;element name="CalculationOf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ImeMode" type="{http://schemas.microsoft.com/xrm/2011/Metadata}ImeMode" minOccurs="0"/>
 *         &lt;element name="MaxValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="MinValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Precision" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PrecisionSource" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FormulaDefinition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsBaseCurrency" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "MoneyAttributeMetadata", propOrder = {
    "calculationOf",
    "imeMode",
    "maxValue",
    "minValue",
    "precision",
    "precisionSource",
    "formulaDefinition",
    "isBaseCurrency",
    "sourceTypeMask"
})
public class MoneyAttributeMetadata
    extends AttributeMetadata
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "CalculationOf", nillable = true)
    protected String calculationOf;
    @XmlElement(name = "ImeMode", nillable = true)
    protected ImeMode imeMode;
    @XmlElement(name = "MaxValue", nillable = true)
    protected Double maxValue;
    @XmlElement(name = "MinValue", nillable = true)
    protected Double minValue;
    @XmlElement(name = "Precision", nillable = true)
    protected Integer precision;
    @XmlElement(name = "PrecisionSource", nillable = true)
    protected Integer precisionSource;
    @XmlElement(name = "FormulaDefinition", nillable = true)
    protected String formulaDefinition;
    @XmlElement(name = "IsBaseCurrency", nillable = true)
    protected Boolean isBaseCurrency;
    @XmlElement(name = "SourceTypeMask", nillable = true)
    protected Integer sourceTypeMask;

    /**
     * Gets the value of the calculationOf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalculationOf() {
        return calculationOf;
    }

    /**
     * Sets the value of the calculationOf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalculationOf(String value) {
        this.calculationOf = value;
    }

    /**
     * Gets the value of the imeMode property.
     * 
     * @return
     *     possible object is
     *     {@link ImeMode }
     *     
     */
    public ImeMode getImeMode() {
        return imeMode;
    }

    /**
     * Sets the value of the imeMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImeMode }
     *     
     */
    public void setImeMode(ImeMode value) {
        this.imeMode = value;
    }

    /**
     * Gets the value of the maxValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxValue() {
        return maxValue;
    }

    /**
     * Sets the value of the maxValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxValue(Double value) {
        this.maxValue = value;
    }

    /**
     * Gets the value of the minValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinValue() {
        return minValue;
    }

    /**
     * Sets the value of the minValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinValue(Double value) {
        this.minValue = value;
    }

    /**
     * Gets the value of the precision property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrecision() {
        return precision;
    }

    /**
     * Sets the value of the precision property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrecision(Integer value) {
        this.precision = value;
    }

    /**
     * Gets the value of the precisionSource property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrecisionSource() {
        return precisionSource;
    }

    /**
     * Sets the value of the precisionSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrecisionSource(Integer value) {
        this.precisionSource = value;
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
     * Gets the value of the isBaseCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsBaseCurrency() {
        return isBaseCurrency;
    }

    /**
     * Sets the value of the isBaseCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsBaseCurrency(Boolean value) {
        this.isBaseCurrency = value;
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
