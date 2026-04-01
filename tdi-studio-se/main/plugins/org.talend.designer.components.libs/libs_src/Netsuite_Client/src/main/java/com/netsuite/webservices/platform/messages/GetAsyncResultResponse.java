
package com.netsuite.webservices.platform.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetAsyncResultResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAsyncResultResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:messages_2014_2.platform.webservices.netsuite.com}asyncResult"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAsyncResultResponse", propOrder = {
    "asyncResult"
})
public class GetAsyncResultResponse {

    @XmlElement(required = true)
    protected AsyncResult asyncResult;

    /**
     * Gets the value of the asyncResult property.
     * 
     * @return
     *     possible object is
     *     {@link AsyncResult }
     *     
     */
    public AsyncResult getAsyncResult() {
        return asyncResult;
    }

    /**
     * Sets the value of the asyncResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AsyncResult }
     *     
     */
    public void setAsyncResult(AsyncResult value) {
        this.asyncResult = value;
    }

}
