
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSPing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSPing"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="echo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSPing", propOrder = {
    "echo"
})
public class WSPing {

    protected String echo;

    /**
     * Default no-arg constructor
     * 
     */
    public WSPing() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSPing(final String echo) {
        this.echo = echo;
    }

    /**
     * Gets the value of the echo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEcho() {
        return echo;
    }

    /**
     * Sets the value of the echo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEcho(String value) {
        this.echo = value;
    }

}
