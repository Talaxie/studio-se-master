
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for checkServiceConfigurationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="checkServiceConfigurationResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{http://www.talend.com/mdm}WSCheckServiceConfigResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkServiceConfigurationResponse", propOrder = {
    "_return"
})
public class CheckServiceConfigurationResponse {

    @XmlElement(name = "return")
    protected WSCheckServiceConfigResponse _return;

    /**
     * Default no-arg constructor
     * 
     */
    public CheckServiceConfigurationResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public CheckServiceConfigurationResponse(final WSCheckServiceConfigResponse _return) {
        this._return = _return;
    }

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link WSCheckServiceConfigResponse }
     *     
     */
    public WSCheckServiceConfigResponse getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSCheckServiceConfigResponse }
     *     
     */
    public void setReturn(WSCheckServiceConfigResponse value) {
        this._return = value;
    }

}
