
package com.netsuite.webservices.platform.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core.GetDataCenterUrlsResult;


/**
 * <p>Java class for GetDataCenterUrlsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDataCenterUrlsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:core_2014_2.platform.webservices.netsuite.com}getDataCenterUrlsResult"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetDataCenterUrlsResponse", propOrder = {
    "getDataCenterUrlsResult"
})
public class GetDataCenterUrlsResponse {

    @XmlElement(namespace = "urn:core_2014_2.platform.webservices.netsuite.com", required = true)
    protected GetDataCenterUrlsResult getDataCenterUrlsResult;

    /**
     * Gets the value of the getDataCenterUrlsResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetDataCenterUrlsResult }
     *     
     */
    public GetDataCenterUrlsResult getGetDataCenterUrlsResult() {
        return getDataCenterUrlsResult;
    }

    /**
     * Sets the value of the getDataCenterUrlsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDataCenterUrlsResult }
     *     
     */
    public void setGetDataCenterUrlsResult(GetDataCenterUrlsResult value) {
        this.getDataCenterUrlsResult = value;
    }

}
