
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSTransformerVariablesMapping complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSTransformerVariablesMapping"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hardCoding" type="{http://www.talend.com/mdm}WSTypedContent" minOccurs="0"/&gt;
 *         &lt;element name="pipelineVariable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pluginVariable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSTransformerVariablesMapping", propOrder = {
    "hardCoding",
    "pipelineVariable",
    "pluginVariable"
})
public class WSTransformerVariablesMapping {

    protected WSTypedContent hardCoding;
    protected String pipelineVariable;
    protected String pluginVariable;

    /**
     * Default no-arg constructor
     * 
     */
    public WSTransformerVariablesMapping() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSTransformerVariablesMapping(final WSTypedContent hardCoding, final String pipelineVariable, final String pluginVariable) {
        this.hardCoding = hardCoding;
        this.pipelineVariable = pipelineVariable;
        this.pluginVariable = pluginVariable;
    }

    /**
     * Gets the value of the hardCoding property.
     * 
     * @return
     *     possible object is
     *     {@link WSTypedContent }
     *     
     */
    public WSTypedContent getHardCoding() {
        return hardCoding;
    }

    /**
     * Sets the value of the hardCoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSTypedContent }
     *     
     */
    public void setHardCoding(WSTypedContent value) {
        this.hardCoding = value;
    }

    /**
     * Gets the value of the pipelineVariable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPipelineVariable() {
        return pipelineVariable;
    }

    /**
     * Sets the value of the pipelineVariable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPipelineVariable(String value) {
        this.pipelineVariable = value;
    }

    /**
     * Gets the value of the pluginVariable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPluginVariable() {
        return pluginVariable;
    }

    /**
     * Sets the value of the pluginVariable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPluginVariable(String value) {
        this.pluginVariable = value;
    }

}
