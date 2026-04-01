
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for findBackgroundJobPKsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findBackgroundJobPKsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{http://www.talend.com/mdm}WSBackgroundJobPKArray" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findBackgroundJobPKsResponse", propOrder = {
    "_return"
})
public class FindBackgroundJobPKsResponse {

    @XmlElement(name = "return")
    protected WSBackgroundJobPKArray _return;

    /**
     * Default no-arg constructor
     * 
     */
    public FindBackgroundJobPKsResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public FindBackgroundJobPKsResponse(final WSBackgroundJobPKArray _return) {
        this._return = _return;
    }

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link WSBackgroundJobPKArray }
     *     
     */
    public WSBackgroundJobPKArray getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSBackgroundJobPKArray }
     *     
     */
    public void setReturn(WSBackgroundJobPKArray value) {
        this._return = value;
    }

}
