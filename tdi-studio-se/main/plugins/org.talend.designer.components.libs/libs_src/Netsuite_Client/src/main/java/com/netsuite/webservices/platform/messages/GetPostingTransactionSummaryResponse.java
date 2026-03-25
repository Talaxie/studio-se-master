
package com.netsuite.webservices.platform.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core.GetPostingTransactionSummaryResult;


/**
 * <p>Java class for GetPostingTransactionSummaryResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetPostingTransactionSummaryResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:core_2014_2.platform.webservices.netsuite.com}getPostingTransactionSummaryResult"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPostingTransactionSummaryResponse", propOrder = {
    "getPostingTransactionSummaryResult"
})
public class GetPostingTransactionSummaryResponse {

    @XmlElement(namespace = "urn:core_2014_2.platform.webservices.netsuite.com", required = true)
    protected GetPostingTransactionSummaryResult getPostingTransactionSummaryResult;

    /**
     * Gets the value of the getPostingTransactionSummaryResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetPostingTransactionSummaryResult }
     *     
     */
    public GetPostingTransactionSummaryResult getGetPostingTransactionSummaryResult() {
        return getPostingTransactionSummaryResult;
    }

    /**
     * Sets the value of the getPostingTransactionSummaryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPostingTransactionSummaryResult }
     *     
     */
    public void setGetPostingTransactionSummaryResult(GetPostingTransactionSummaryResult value) {
        this.getPostingTransactionSummaryResult = value;
    }

}
