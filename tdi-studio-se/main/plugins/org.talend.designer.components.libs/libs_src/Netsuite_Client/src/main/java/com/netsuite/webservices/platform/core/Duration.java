
package com.netsuite.webservices.platform.core;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core.types.DurationUnit;


/**
 * <p>Java class for Duration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Duration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="timeSpan" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="unit" type="{urn:types.core_2014_2.platform.webservices.netsuite.com}DurationUnit"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Duration", propOrder = {
    "timeSpan",
    "unit"
})
public class Duration {

    protected double timeSpan;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected DurationUnit unit;

    /**
     * Gets the value of the timeSpan property.
     * 
     */
    public double getTimeSpan() {
        return timeSpan;
    }

    /**
     * Sets the value of the timeSpan property.
     * 
     */
    public void setTimeSpan(double value) {
        this.timeSpan = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link DurationUnit }
     *     
     */
    public DurationUnit getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationUnit }
     *     
     */
    public void setUnit(DurationUnit value) {
        this.unit = value;
    }

}
