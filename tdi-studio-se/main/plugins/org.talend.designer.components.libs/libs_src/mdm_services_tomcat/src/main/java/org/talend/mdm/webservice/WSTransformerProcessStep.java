
package org.talend.mdm.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSTransformerProcessStep complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSTransformerProcessStep"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="disabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="inputMappings" type="{http://www.talend.com/mdm}WSTransformerVariablesMapping" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="outputMappings" type="{http://www.talend.com/mdm}WSTransformerVariablesMapping" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="parameters" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pluginJNDI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSTransformerProcessStep", propOrder = {
    "description",
    "disabled",
    "inputMappings",
    "outputMappings",
    "parameters",
    "pluginJNDI"
})
public class WSTransformerProcessStep {

    protected String description;
    protected Boolean disabled;
    @XmlElement(nillable = true)
    protected List<WSTransformerVariablesMapping> inputMappings;
    @XmlElement(nillable = true)
    protected List<WSTransformerVariablesMapping> outputMappings;
    protected String parameters;
    protected String pluginJNDI;

    /**
     * Default no-arg constructor
     * 
     */
    public WSTransformerProcessStep() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSTransformerProcessStep(final String description, final Boolean disabled, final List<WSTransformerVariablesMapping> inputMappings, final List<WSTransformerVariablesMapping> outputMappings, final String parameters, final String pluginJNDI) {
        this.description = description;
        this.disabled = disabled;
        this.inputMappings = inputMappings;
        this.outputMappings = outputMappings;
        this.parameters = parameters;
        this.pluginJNDI = pluginJNDI;
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
     * Gets the value of the disabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisabled() {
        return disabled;
    }

    /**
     * Sets the value of the disabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisabled(Boolean value) {
        this.disabled = value;
    }

    /**
     * Gets the value of the inputMappings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inputMappings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInputMappings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSTransformerVariablesMapping }
     * 
     * 
     */
    public List<WSTransformerVariablesMapping> getInputMappings() {
        if (inputMappings == null) {
            inputMappings = new ArrayList<WSTransformerVariablesMapping>();
        }
        return this.inputMappings;
    }

    /**
     * Gets the value of the outputMappings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outputMappings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutputMappings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSTransformerVariablesMapping }
     * 
     * 
     */
    public List<WSTransformerVariablesMapping> getOutputMappings() {
        if (outputMappings == null) {
            outputMappings = new ArrayList<WSTransformerVariablesMapping>();
        }
        return this.outputMappings;
    }

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParameters(String value) {
        this.parameters = value;
    }

    /**
     * Gets the value of the pluginJNDI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPluginJNDI() {
        return pluginJNDI;
    }

    /**
     * Sets the value of the pluginJNDI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPluginJNDI(String value) {
        this.pluginJNDI = value;
    }

}
