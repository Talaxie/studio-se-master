
package com.netsuite.webservices.setup.customization;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core.RecordRef;


/**
 * <p>Java class for CustomRecordTypeLinks complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomRecordTypeLinks"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="linkCenter" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="linkSection" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="linkLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomRecordTypeLinks", propOrder = {
    "linkCenter",
    "linkSection",
    "linkLabel"
})
public class CustomRecordTypeLinks {

    protected RecordRef linkCenter;
    protected RecordRef linkSection;
    protected String linkLabel;

    /**
     * Gets the value of the linkCenter property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getLinkCenter() {
        return linkCenter;
    }

    /**
     * Sets the value of the linkCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setLinkCenter(RecordRef value) {
        this.linkCenter = value;
    }

    /**
     * Gets the value of the linkSection property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getLinkSection() {
        return linkSection;
    }

    /**
     * Sets the value of the linkSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setLinkSection(RecordRef value) {
        this.linkSection = value;
    }

    /**
     * Gets the value of the linkLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkLabel() {
        return linkLabel;
    }

    /**
     * Sets the value of the linkLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkLabel(String value) {
        this.linkLabel = value;
    }

}
