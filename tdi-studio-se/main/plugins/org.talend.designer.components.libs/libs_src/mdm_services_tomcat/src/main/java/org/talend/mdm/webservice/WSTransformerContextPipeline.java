
package org.talend.mdm.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSTransformerContextPipeline complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSTransformerContextPipeline"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pipelineItem" type="{http://www.talend.com/mdm}WSTransformerContextPipelinePipelineItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSTransformerContextPipeline", propOrder = {
    "pipelineItem"
})
public class WSTransformerContextPipeline {

    @XmlElement(nillable = true)
    protected List<WSTransformerContextPipelinePipelineItem> pipelineItem;

    /**
     * Default no-arg constructor
     * 
     */
    public WSTransformerContextPipeline() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSTransformerContextPipeline(final List<WSTransformerContextPipelinePipelineItem> pipelineItem) {
        this.pipelineItem = pipelineItem;
    }

    /**
     * Gets the value of the pipelineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pipelineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPipelineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSTransformerContextPipelinePipelineItem }
     * 
     * 
     */
    public List<WSTransformerContextPipelinePipelineItem> getPipelineItem() {
        if (pipelineItem == null) {
            pipelineItem = new ArrayList<WSTransformerContextPipelinePipelineItem>();
        }
        return this.pipelineItem;
    }

}
