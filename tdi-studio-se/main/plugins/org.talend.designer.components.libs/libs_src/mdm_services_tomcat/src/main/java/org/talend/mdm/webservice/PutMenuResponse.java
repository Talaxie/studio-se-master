
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for putMenuResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="putMenuResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{http://www.talend.com/mdm}WSMenuPK" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "putMenuResponse", propOrder = {
    "_return"
})
public class PutMenuResponse {

    @XmlElement(name = "return")
    protected WSMenuPK _return;

    /**
     * Default no-arg constructor
     * 
     */
    public PutMenuResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PutMenuResponse(final WSMenuPK _return) {
        this._return = _return;
    }

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link WSMenuPK }
     *     
     */
    public WSMenuPK getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSMenuPK }
     *     
     */
    public void setReturn(WSMenuPK value) {
        this._return = value;
    }

}
