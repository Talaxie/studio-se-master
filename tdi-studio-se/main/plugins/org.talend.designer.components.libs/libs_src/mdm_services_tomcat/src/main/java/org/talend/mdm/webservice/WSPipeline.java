
package org.talend.mdm.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSPipeline complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSPipeline"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="typedContentEntry" type="{http://www.talend.com/mdm}WSPipelineTypedContentEntry" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSPipeline", propOrder = {
    "typedContentEntry"
})
public class WSPipeline {

    @XmlElement(nillable = true)
    protected List<WSPipelineTypedContentEntry> typedContentEntry;

    /**
     * Default no-arg constructor
     * 
     */
    public WSPipeline() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSPipeline(final List<WSPipelineTypedContentEntry> typedContentEntry) {
        this.typedContentEntry = typedContentEntry;
    }

    /**
     * Gets the value of the typedContentEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the typedContentEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTypedContentEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSPipelineTypedContentEntry }
     * 
     * 
     */
    public List<WSPipelineTypedContentEntry> getTypedContentEntry() {
        if (typedContentEntry == null) {
            typedContentEntry = new ArrayList<WSPipelineTypedContentEntry>();
        }
        return this.typedContentEntry;
    }

}
