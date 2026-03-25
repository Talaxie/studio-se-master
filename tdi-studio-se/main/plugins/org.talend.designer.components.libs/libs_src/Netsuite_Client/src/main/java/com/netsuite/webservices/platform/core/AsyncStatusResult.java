
package com.netsuite.webservices.platform.core;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core.types.AsyncStatusType;


/**
 * <p>Java class for AsyncStatusResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AsyncStatusResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="jobId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="status" type="{urn:types.core_2014_2.platform.webservices.netsuite.com}AsyncStatusType"/&gt;
 *         &lt;element name="percentCompleted" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="estRemainingDuration" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AsyncStatusResult", propOrder = {
    "jobId",
    "status",
    "percentCompleted",
    "estRemainingDuration"
})
public class AsyncStatusResult {

    @XmlElement(required = true)
    protected String jobId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected AsyncStatusType status;
    protected double percentCompleted;
    protected double estRemainingDuration;

    /**
     * Gets the value of the jobId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * Sets the value of the jobId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobId(String value) {
        this.jobId = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link AsyncStatusType }
     *     
     */
    public AsyncStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link AsyncStatusType }
     *     
     */
    public void setStatus(AsyncStatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the percentCompleted property.
     * 
     */
    public double getPercentCompleted() {
        return percentCompleted;
    }

    /**
     * Sets the value of the percentCompleted property.
     * 
     */
    public void setPercentCompleted(double value) {
        this.percentCompleted = value;
    }

    /**
     * Gets the value of the estRemainingDuration property.
     * 
     */
    public double getEstRemainingDuration() {
        return estRemainingDuration;
    }

    /**
     * Sets the value of the estRemainingDuration property.
     * 
     */
    public void setEstRemainingDuration(double value) {
        this.estRemainingDuration = value;
    }

}
