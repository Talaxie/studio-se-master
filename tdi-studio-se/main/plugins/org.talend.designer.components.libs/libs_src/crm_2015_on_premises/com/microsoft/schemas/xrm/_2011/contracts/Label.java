
package com.microsoft.schemas.xrm._2011.contracts;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Label complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Label">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LocalizedLabels" type="{http://schemas.microsoft.com/xrm/2011/Contracts}LocalizedLabelCollection" minOccurs="0"/>
 *         &lt;element name="UserLocalizedLabel" type="{http://schemas.microsoft.com/xrm/2011/Contracts}LocalizedLabel" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Label", propOrder = {
    "localizedLabels",
    "userLocalizedLabel"
})
public class Label
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "LocalizedLabels", nillable = true)
    protected LocalizedLabelCollection localizedLabels;
    @XmlElement(name = "UserLocalizedLabel", nillable = true)
    protected LocalizedLabel userLocalizedLabel;

    /**
     * Gets the value of the localizedLabels property.
     * 
     * @return
     *     possible object is
     *     {@link LocalizedLabelCollection }
     *     
     */
    public LocalizedLabelCollection getLocalizedLabels() {
        return localizedLabels;
    }

    /**
     * Sets the value of the localizedLabels property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalizedLabelCollection }
     *     
     */
    public void setLocalizedLabels(LocalizedLabelCollection value) {
        this.localizedLabels = value;
    }

    /**
     * Gets the value of the userLocalizedLabel property.
     * 
     * @return
     *     possible object is
     *     {@link LocalizedLabel }
     *     
     */
    public LocalizedLabel getUserLocalizedLabel() {
        return userLocalizedLabel;
    }

    /**
     * Sets the value of the userLocalizedLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalizedLabel }
     *     
     */
    public void setUserLocalizedLabel(LocalizedLabel value) {
        this.userLocalizedLabel = value;
    }

}
