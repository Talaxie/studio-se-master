
package com.microsoft.schemas.xrm._2011.metadata;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StateOptionMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StateOptionMetadata">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/xrm/2011/Metadata}OptionMetadata">
 *       &lt;sequence>
 *         &lt;element name="DefaultStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InvariantName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StateOptionMetadata", propOrder = {
    "defaultStatus",
    "invariantName"
})
public class StateOptionMetadata
    extends OptionMetadata
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "DefaultStatus", nillable = true)
    protected Integer defaultStatus;
    @XmlElement(name = "InvariantName", nillable = true)
    protected String invariantName;

    /**
     * Gets the value of the defaultStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDefaultStatus() {
        return defaultStatus;
    }

    /**
     * Sets the value of the defaultStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDefaultStatus(Integer value) {
        this.defaultStatus = value;
    }

    /**
     * Gets the value of the invariantName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvariantName() {
        return invariantName;
    }

    /**
     * Sets the value of the invariantName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvariantName(String value) {
        this.invariantName = value;
    }

}
