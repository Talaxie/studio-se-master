
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSInitData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSInitData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="xmlSchema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zap" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSInitData", propOrder = {
    "xmlSchema",
    "zap"
})
public class WSInitData {

    protected String xmlSchema;
    protected boolean zap;

    /**
     * Default no-arg constructor
     * 
     */
    public WSInitData() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSInitData(final String xmlSchema, final boolean zap) {
        this.xmlSchema = xmlSchema;
        this.zap = zap;
    }

    /**
     * Gets the value of the xmlSchema property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlSchema() {
        return xmlSchema;
    }

    /**
     * Sets the value of the xmlSchema property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlSchema(String value) {
        this.xmlSchema = value;
    }

    /**
     * Gets the value of the zap property.
     * 
     */
    public boolean isZap() {
        return zap;
    }

    /**
     * Sets the value of the zap property.
     * 
     */
    public void setZap(boolean value) {
        this.zap = value;
    }

}
