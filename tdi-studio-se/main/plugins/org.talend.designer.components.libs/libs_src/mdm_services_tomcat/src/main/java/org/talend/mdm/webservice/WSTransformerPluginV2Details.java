
package org.talend.mdm.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSTransformerPluginV2Details complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSTransformerPluginV2Details"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="documentation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="inputVariableDescriptors" type="{http://www.talend.com/mdm}WSTransformerPluginV2VariableDescriptor" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="outputVariableDescriptors" type="{http://www.talend.com/mdm}WSTransformerPluginV2VariableDescriptor" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="parametersSchema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSTransformerPluginV2Details", propOrder = {
    "description",
    "documentation",
    "inputVariableDescriptors",
    "outputVariableDescriptors",
    "parametersSchema"
})
public class WSTransformerPluginV2Details {

    protected String description;
    protected String documentation;
    @XmlElement(nillable = true)
    protected List<WSTransformerPluginV2VariableDescriptor> inputVariableDescriptors;
    @XmlElement(nillable = true)
    protected List<WSTransformerPluginV2VariableDescriptor> outputVariableDescriptors;
    protected String parametersSchema;

    /**
     * Default no-arg constructor
     * 
     */
    public WSTransformerPluginV2Details() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSTransformerPluginV2Details(final String description, final String documentation, final List<WSTransformerPluginV2VariableDescriptor> inputVariableDescriptors, final List<WSTransformerPluginV2VariableDescriptor> outputVariableDescriptors, final String parametersSchema) {
        this.description = description;
        this.documentation = documentation;
        this.inputVariableDescriptors = inputVariableDescriptors;
        this.outputVariableDescriptors = outputVariableDescriptors;
        this.parametersSchema = parametersSchema;
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
     * Gets the value of the documentation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentation() {
        return documentation;
    }

    /**
     * Sets the value of the documentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentation(String value) {
        this.documentation = value;
    }

    /**
     * Gets the value of the inputVariableDescriptors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inputVariableDescriptors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInputVariableDescriptors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSTransformerPluginV2VariableDescriptor }
     * 
     * 
     */
    public List<WSTransformerPluginV2VariableDescriptor> getInputVariableDescriptors() {
        if (inputVariableDescriptors == null) {
            inputVariableDescriptors = new ArrayList<WSTransformerPluginV2VariableDescriptor>();
        }
        return this.inputVariableDescriptors;
    }

    /**
     * Gets the value of the outputVariableDescriptors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outputVariableDescriptors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutputVariableDescriptors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSTransformerPluginV2VariableDescriptor }
     * 
     * 
     */
    public List<WSTransformerPluginV2VariableDescriptor> getOutputVariableDescriptors() {
        if (outputVariableDescriptors == null) {
            outputVariableDescriptors = new ArrayList<WSTransformerPluginV2VariableDescriptor>();
        }
        return this.outputVariableDescriptors;
    }

    /**
     * Gets the value of the parametersSchema property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParametersSchema() {
        return parametersSchema;
    }

    /**
     * Sets the value of the parametersSchema property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParametersSchema(String value) {
        this.parametersSchema = value;
    }

}
