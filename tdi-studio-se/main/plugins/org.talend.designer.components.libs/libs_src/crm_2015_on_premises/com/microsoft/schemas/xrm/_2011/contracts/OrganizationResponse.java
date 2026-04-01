
package com.microsoft.schemas.xrm._2011.contracts;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrganizationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganizationResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResponseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Results" type="{http://schemas.microsoft.com/xrm/2011/Contracts}ParameterCollection" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationResponse", propOrder = {
    "responseName",
    "results"
})
public class OrganizationResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ResponseName", nillable = true)
    protected String responseName;
    @XmlElement(name = "Results", nillable = true)
    protected ParameterCollection results;

    /**
     * Gets the value of the responseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseName() {
        return responseName;
    }

    /**
     * Sets the value of the responseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseName(String value) {
        this.responseName = value;
    }

    /**
     * Gets the value of the results property.
     * 
     * @return
     *     possible object is
     *     {@link ParameterCollection }
     *     
     */
    public ParameterCollection getResults() {
        return results;
    }

    /**
     * Sets the value of the results property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterCollection }
     *     
     */
    public void setResults(ParameterCollection value) {
        this.results = value;
    }

}
