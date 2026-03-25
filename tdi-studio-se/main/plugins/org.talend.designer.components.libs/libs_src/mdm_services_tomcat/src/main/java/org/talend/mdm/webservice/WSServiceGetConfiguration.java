
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSServiceGetConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSServiceGetConfiguration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="jndiName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="optionalParameter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSServiceGetConfiguration", propOrder = {
    "jndiName",
    "optionalParameter"
})
public class WSServiceGetConfiguration {

    protected String jndiName;
    protected String optionalParameter;

    /**
     * Default no-arg constructor
     * 
     */
    public WSServiceGetConfiguration() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSServiceGetConfiguration(final String jndiName, final String optionalParameter) {
        this.jndiName = jndiName;
        this.optionalParameter = optionalParameter;
    }

    /**
     * Gets the value of the jndiName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJndiName() {
        return jndiName;
    }

    /**
     * Sets the value of the jndiName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJndiName(String value) {
        this.jndiName = value;
    }

    /**
     * Gets the value of the optionalParameter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionalParameter() {
        return optionalParameter;
    }

    /**
     * Sets the value of the optionalParameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionalParameter(String value) {
        this.optionalParameter = value;
    }

}
