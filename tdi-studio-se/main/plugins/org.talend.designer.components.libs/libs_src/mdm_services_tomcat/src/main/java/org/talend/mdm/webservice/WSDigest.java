
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSDigest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSDigest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="digestValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="timeStamp" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="wsDigestKey" type="{http://www.talend.com/mdm}WSDigestKey" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSDigest", propOrder = {
    "digestValue",
    "timeStamp",
    "wsDigestKey"
})
public class WSDigest {

    protected String digestValue;
    protected long timeStamp;
    protected WSDigestKey wsDigestKey;

    /**
     * Default no-arg constructor
     * 
     */
    public WSDigest() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSDigest(final String digestValue, final long timeStamp, final WSDigestKey wsDigestKey) {
        this.digestValue = digestValue;
        this.timeStamp = timeStamp;
        this.wsDigestKey = wsDigestKey;
    }

    /**
     * Gets the value of the digestValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigestValue() {
        return digestValue;
    }

    /**
     * Sets the value of the digestValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigestValue(String value) {
        this.digestValue = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     */
    public long getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     */
    public void setTimeStamp(long value) {
        this.timeStamp = value;
    }

    /**
     * Gets the value of the wsDigestKey property.
     * 
     * @return
     *     possible object is
     *     {@link WSDigestKey }
     *     
     */
    public WSDigestKey getWsDigestKey() {
        return wsDigestKey;
    }

    /**
     * Sets the value of the wsDigestKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSDigestKey }
     *     
     */
    public void setWsDigestKey(WSDigestKey value) {
        this.wsDigestKey = value;
    }

}
