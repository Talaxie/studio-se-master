
package com.microsoft.schemas.xrm._2011.metadata;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DateTimeAttributeMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateTimeAttributeMetadata">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/xrm/2011/Metadata}AttributeMetadata">
 *       &lt;sequence>
 *         &lt;element name="Format" type="{http://schemas.microsoft.com/xrm/2011/Metadata}DateTimeFormat" minOccurs="0"/>
 *         &lt;element name="ImeMode" type="{http://schemas.microsoft.com/xrm/2011/Metadata}ImeMode" minOccurs="0"/>
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
@XmlType(name = "DateTimeAttributeMetadata", propOrder = {
    "format",
    "imeMode",
    "formulaDefinition",
    "sourceTypeMask"
})
public class DateTimeAttributeMetadata
    extends AttributeMetadata
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Format", nillable = true)
    protected DateTimeFormat format;
    @XmlElement(name = "ImeMode", nillable = true)
    protected ImeMode imeMode;
    @XmlElement(name = "FormulaDefinition", nillable = true)
    protected String formulaDefinition;
    @XmlElement(name = "SourceTypeMask", nillable = true)
    protected Integer sourceTypeMask;

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeFormat }
     *     
     */
    public DateTimeFormat getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeFormat }
     *     
     */
    public void setFormat(DateTimeFormat value) {
        this.format = value;
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
