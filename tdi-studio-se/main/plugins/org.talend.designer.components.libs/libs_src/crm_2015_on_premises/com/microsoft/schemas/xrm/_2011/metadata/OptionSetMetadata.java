
package com.microsoft.schemas.xrm._2011.metadata;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OptionSetMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OptionSetMetadata">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/xrm/2011/Metadata}OptionSetMetadataBase">
 *       &lt;sequence>
 *         &lt;element name="Options" type="{http://schemas.microsoft.com/xrm/2011/Metadata}ArrayOfOptionMetadata" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionSetMetadata", propOrder = {
    "options"
})
public class OptionSetMetadata
    extends OptionSetMetadataBase
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Options", nillable = true)
    protected ArrayOfOptionMetadata options;

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOptionMetadata }
     *     
     */
    public ArrayOfOptionMetadata getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOptionMetadata }
     *     
     */
    public void setOptions(ArrayOfOptionMetadata value) {
        this.options = value;
    }

}
