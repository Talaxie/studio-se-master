
package com.microsoft.schemas.xrm._2011.metadata;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BooleanOptionSetMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BooleanOptionSetMetadata">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/xrm/2011/Metadata}OptionSetMetadataBase">
 *       &lt;sequence>
 *         &lt;element name="FalseOption" type="{http://schemas.microsoft.com/xrm/2011/Metadata}OptionMetadata" minOccurs="0"/>
 *         &lt;element name="TrueOption" type="{http://schemas.microsoft.com/xrm/2011/Metadata}OptionMetadata" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BooleanOptionSetMetadata", propOrder = {
    "falseOption",
    "trueOption"
})
public class BooleanOptionSetMetadata
    extends OptionSetMetadataBase
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "FalseOption", nillable = true)
    protected OptionMetadata falseOption;
    @XmlElement(name = "TrueOption", nillable = true)
    protected OptionMetadata trueOption;

    /**
     * Gets the value of the falseOption property.
     * 
     * @return
     *     possible object is
     *     {@link OptionMetadata }
     *     
     */
    public OptionMetadata getFalseOption() {
        return falseOption;
    }

    /**
     * Sets the value of the falseOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionMetadata }
     *     
     */
    public void setFalseOption(OptionMetadata value) {
        this.falseOption = value;
    }

    /**
     * Gets the value of the trueOption property.
     * 
     * @return
     *     possible object is
     *     {@link OptionMetadata }
     *     
     */
    public OptionMetadata getTrueOption() {
        return trueOption;
    }

    /**
     * Sets the value of the trueOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionMetadata }
     *     
     */
    public void setTrueOption(OptionMetadata value) {
        this.trueOption = value;
    }

}
