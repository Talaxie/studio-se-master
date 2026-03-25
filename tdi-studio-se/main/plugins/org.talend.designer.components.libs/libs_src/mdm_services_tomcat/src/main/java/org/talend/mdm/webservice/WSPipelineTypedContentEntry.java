
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSPipelineTypedContentEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSPipelineTypedContentEntry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="output" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wsExtractedContent" type="{http://www.talend.com/mdm}WSExtractedContent" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSPipelineTypedContentEntry", propOrder = {
    "output",
    "wsExtractedContent"
})
public class WSPipelineTypedContentEntry {

    protected String output;
    protected WSExtractedContent wsExtractedContent;

    /**
     * Default no-arg constructor
     * 
     */
    public WSPipelineTypedContentEntry() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSPipelineTypedContentEntry(final String output, final WSExtractedContent wsExtractedContent) {
        this.output = output;
        this.wsExtractedContent = wsExtractedContent;
    }

    /**
     * Gets the value of the output property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutput() {
        return output;
    }

    /**
     * Sets the value of the output property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutput(String value) {
        this.output = value;
    }

    /**
     * Gets the value of the wsExtractedContent property.
     * 
     * @return
     *     possible object is
     *     {@link WSExtractedContent }
     *     
     */
    public WSExtractedContent getWsExtractedContent() {
        return wsExtractedContent;
    }

    /**
     * Sets the value of the wsExtractedContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSExtractedContent }
     *     
     */
    public void setWsExtractedContent(WSExtractedContent value) {
        this.wsExtractedContent = value;
    }

}
