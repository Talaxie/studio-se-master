
package com.microsoft.schemas.xrm._2011.metadata;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumAttributeMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnumAttributeMetadata">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/xrm/2011/Metadata}AttributeMetadata">
 *       &lt;sequence>
 *         &lt;element name="DefaultFormValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OptionSet" type="{http://schemas.microsoft.com/xrm/2011/Metadata}OptionSetMetadata" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnumAttributeMetadata", propOrder = {
    "defaultFormValue",
    "optionSet"
})
@XmlSeeAlso({
    StatusAttributeMetadata.class,
    PicklistAttributeMetadata.class,
    EntityNameAttributeMetadata.class,
    StateAttributeMetadata.class
})
public class EnumAttributeMetadata
    extends AttributeMetadata
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "DefaultFormValue", nillable = true)
    protected Integer defaultFormValue;
    @XmlElement(name = "OptionSet", nillable = true)
    protected OptionSetMetadata optionSet;

    /**
     * Gets the value of the defaultFormValue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDefaultFormValue() {
        return defaultFormValue;
    }

    /**
     * Sets the value of the defaultFormValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDefaultFormValue(Integer value) {
        this.defaultFormValue = value;
    }

    /**
     * Gets the value of the optionSet property.
     * 
     * @return
     *     possible object is
     *     {@link OptionSetMetadata }
     *     
     */
    public OptionSetMetadata getOptionSet() {
        return optionSet;
    }

    /**
     * Sets the value of the optionSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionSetMetadata }
     *     
     */
    public void setOptionSet(OptionSetMetadata value) {
        this.optionSet = value;
    }

}
