
package com.microsoft.schemas.xrm._2011.metadata;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusOptionMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusOptionMetadata">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/xrm/2011/Metadata}OptionMetadata">
 *       &lt;sequence>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TransitionData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusOptionMetadata", propOrder = {
    "state",
    "transitionData"
})
public class StatusOptionMetadata
    extends OptionMetadata
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "State", nillable = true)
    protected Integer state;
    @XmlElement(name = "TransitionData", nillable = true)
    protected String transitionData;

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setState(Integer value) {
        this.state = value;
    }

    /**
     * Gets the value of the transitionData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransitionData() {
        return transitionData;
    }

    /**
     * Sets the value of the transitionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransitionData(String value) {
        this.transitionData = value;
    }

}
