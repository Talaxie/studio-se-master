
package com.microsoft.schemas.xrm._2011.contracts;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiscoveryServiceFault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscoveryServiceFault">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/xrm/2011/Contracts}BaseServiceFault">
 *       &lt;sequence>
 *         &lt;element name="InnerFault" type="{http://schemas.microsoft.com/xrm/2011/Contracts}DiscoveryServiceFault" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscoveryServiceFault", propOrder = {
    "innerFault"
})
public class DiscoveryServiceFault
    extends BaseServiceFault
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "InnerFault", nillable = true)
    protected DiscoveryServiceFault innerFault;

    /**
     * Gets the value of the innerFault property.
     * 
     * @return
     *     possible object is
     *     {@link DiscoveryServiceFault }
     *     
     */
    public DiscoveryServiceFault getInnerFault() {
        return innerFault;
    }

    /**
     * Sets the value of the innerFault property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscoveryServiceFault }
     *     
     */
    public void setInnerFault(DiscoveryServiceFault value) {
        this.innerFault = value;
    }

}
