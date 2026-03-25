
package com.microsoft.schemas.xrm._2012.contracts;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExecuteMultipleSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExecuteMultipleSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContinueOnError" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ReturnResponses" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExecuteMultipleSettings", propOrder = {
    "continueOnError",
    "returnResponses"
})
public class ExecuteMultipleSettings
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ContinueOnError")
    protected Boolean continueOnError;
    @XmlElement(name = "ReturnResponses")
    protected Boolean returnResponses;

    /**
     * Gets the value of the continueOnError property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContinueOnError() {
        return continueOnError;
    }

    /**
     * Sets the value of the continueOnError property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContinueOnError(Boolean value) {
        this.continueOnError = value;
    }

    /**
     * Gets the value of the returnResponses property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnResponses() {
        return returnResponses;
    }

    /**
     * Sets the value of the returnResponses property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnResponses(Boolean value) {
        this.returnResponses = value;
    }

}
