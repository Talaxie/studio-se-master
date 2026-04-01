
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSServiceGetDocument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSServiceGetDocument"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="configure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="configureSchema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="defaultConfig" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="document" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSServiceGetDocument", propOrder = {
    "configure",
    "configureSchema",
    "defaultConfig",
    "description",
    "document"
})
public class WSServiceGetDocument {

    protected String configure;
    protected String configureSchema;
    protected String defaultConfig;
    protected String description;
    protected String document;

    /**
     * Default no-arg constructor
     * 
     */
    public WSServiceGetDocument() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSServiceGetDocument(final String configure, final String configureSchema, final String defaultConfig, final String description, final String document) {
        this.configure = configure;
        this.configureSchema = configureSchema;
        this.defaultConfig = defaultConfig;
        this.description = description;
        this.document = document;
    }

    /**
     * Gets the value of the configure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigure() {
        return configure;
    }

    /**
     * Sets the value of the configure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigure(String value) {
        this.configure = value;
    }

    /**
     * Gets the value of the configureSchema property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigureSchema() {
        return configureSchema;
    }

    /**
     * Sets the value of the configureSchema property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigureSchema(String value) {
        this.configureSchema = value;
    }

    /**
     * Gets the value of the defaultConfig property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultConfig() {
        return defaultConfig;
    }

    /**
     * Sets the value of the defaultConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultConfig(String value) {
        this.defaultConfig = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the document property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocument(String value) {
        this.document = value;
    }

}
