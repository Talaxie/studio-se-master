
package com.microsoft.schemas.crm._2011.contracts;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.Guid;


/**
 * <p>Java class for ValidationResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidationResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActivityId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="TraceInfo" type="{http://schemas.microsoft.com/crm/2011/Contracts}TraceInfo" minOccurs="0"/>
 *         &lt;element name="ValidationSuccess" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidationResult", propOrder = {
    "activityId",
    "traceInfo",
    "validationSuccess"
})
public class ValidationResult
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ActivityId")
    protected Guid activityId;
    @XmlElement(name = "TraceInfo", nillable = true)
    protected TraceInfo traceInfo;
    @XmlElement(name = "ValidationSuccess")
    protected Boolean validationSuccess;

    /**
     * Gets the value of the activityId property.
     * 
     * @return
     *     possible object is
     *     {@link Guid }
     *     
     */
    public Guid getActivityId() {
        return activityId;
    }

    /**
     * Sets the value of the activityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Guid }
     *     
     */
    public void setActivityId(Guid value) {
        this.activityId = value;
    }

    /**
     * Gets the value of the traceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TraceInfo }
     *     
     */
    public TraceInfo getTraceInfo() {
        return traceInfo;
    }

    /**
     * Sets the value of the traceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TraceInfo }
     *     
     */
    public void setTraceInfo(TraceInfo value) {
        this.traceInfo = value;
    }

    /**
     * Gets the value of the validationSuccess property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isValidationSuccess() {
        return validationSuccess;
    }

    /**
     * Sets the value of the validationSuccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValidationSuccess(Boolean value) {
        this.validationSuccess = value;
    }

}
