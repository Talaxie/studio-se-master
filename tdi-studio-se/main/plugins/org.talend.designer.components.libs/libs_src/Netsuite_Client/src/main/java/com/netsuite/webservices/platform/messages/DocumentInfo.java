
package com.netsuite.webservices.platform.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nsId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentInfo", propOrder = {
    "nsId"
})
public class DocumentInfo {

    @XmlElement(required = true)
    protected String nsId;

    /**
     * Gets the value of the nsId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNsId() {
        return nsId;
    }

    /**
     * Sets the value of the nsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNsId(String value) {
        this.nsId = value;
    }

}
