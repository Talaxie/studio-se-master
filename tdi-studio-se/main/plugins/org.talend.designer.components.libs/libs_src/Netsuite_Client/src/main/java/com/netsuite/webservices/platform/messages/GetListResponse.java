
package com.netsuite.webservices.platform.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetListResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetListResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:messages_2014_2.platform.webservices.netsuite.com}readResponseList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetListResponse", propOrder = {
    "readResponseList"
})
public class GetListResponse {

    @XmlElement(required = true)
    protected ReadResponseList readResponseList;

    /**
     * Gets the value of the readResponseList property.
     * 
     * @return
     *     possible object is
     *     {@link ReadResponseList }
     *     
     */
    public ReadResponseList getReadResponseList() {
        return readResponseList;
    }

    /**
     * Sets the value of the readResponseList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadResponseList }
     *     
     */
    public void setReadResponseList(ReadResponseList value) {
        this.readResponseList = value;
    }

}
