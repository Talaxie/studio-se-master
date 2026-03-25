
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAutoIncrementResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAutoIncrementResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{http://www.talend.com/mdm}WSAutoIncrement" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAutoIncrementResponse", propOrder = {
    "_return"
})
public class GetAutoIncrementResponse {

    @XmlElement(name = "return")
    protected WSAutoIncrement _return;

    /**
     * Default no-arg constructor
     * 
     */
    public GetAutoIncrementResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public GetAutoIncrementResponse(final WSAutoIncrement _return) {
        this._return = _return;
    }

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link WSAutoIncrement }
     *     
     */
    public WSAutoIncrement getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSAutoIncrement }
     *     
     */
    public void setReturn(WSAutoIncrement value) {
        this._return = value;
    }

}
