
package com.microsoft.schemas.xrm._2011.contracts;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrganizationServiceFault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganizationServiceFault">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/xrm/2011/Contracts}BaseServiceFault">
 *       &lt;sequence>
 *         &lt;element name="InnerFault" type="{http://schemas.microsoft.com/xrm/2011/Contracts}OrganizationServiceFault" minOccurs="0"/>
 *         &lt;element name="TraceText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationServiceFault", propOrder = {
    "innerFault",
    "traceText"
})
public class OrganizationServiceFault
    extends BaseServiceFault
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "InnerFault", nillable = true)
    protected OrganizationServiceFault innerFault;
    @XmlElement(name = "TraceText", nillable = true)
    protected String traceText;

    /**
     * Gets the value of the innerFault property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationServiceFault }
     *     
     */
    public OrganizationServiceFault getInnerFault() {
        return innerFault;
    }

    /**
     * Sets the value of the innerFault property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationServiceFault }
     *     
     */
    public void setInnerFault(OrganizationServiceFault value) {
        this.innerFault = value;
    }

    /**
     * Gets the value of the traceText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraceText() {
        return traceText;
    }

    /**
     * Sets the value of the traceText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraceText(String value) {
        this.traceText = value;
    }

}
