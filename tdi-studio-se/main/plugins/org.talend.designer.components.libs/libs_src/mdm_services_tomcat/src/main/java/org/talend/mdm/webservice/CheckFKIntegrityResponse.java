
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for checkFKIntegrityResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="checkFKIntegrityResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{http://www.talend.com/mdm}fkIntegrityCheckResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkFKIntegrityResponse", propOrder = {
    "_return"
})
public class CheckFKIntegrityResponse {

    @XmlElement(name = "return")
    @XmlSchemaType(name = "string")
    protected FkIntegrityCheckResult _return;

    /**
     * Default no-arg constructor
     * 
     */
    public CheckFKIntegrityResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public CheckFKIntegrityResponse(final FkIntegrityCheckResult _return) {
        this._return = _return;
    }

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link FkIntegrityCheckResult }
     *     
     */
    public FkIntegrityCheckResult getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link FkIntegrityCheckResult }
     *     
     */
    public void setReturn(FkIntegrityCheckResult value) {
        this._return = value;
    }

}
