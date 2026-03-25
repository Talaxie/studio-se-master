
package org.talend.mdm.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSItemPKsByCriteriaResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSItemPKsByCriteriaResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="results" type="{http://www.talend.com/mdm}WSItemPKsByCriteriaResponseResults" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSItemPKsByCriteriaResponse", propOrder = {
    "results"
})
public class WSItemPKsByCriteriaResponse {

    @XmlElement(nillable = true)
    protected List<WSItemPKsByCriteriaResponseResults> results;

    /**
     * Default no-arg constructor
     * 
     */
    public WSItemPKsByCriteriaResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSItemPKsByCriteriaResponse(final List<WSItemPKsByCriteriaResponseResults> results) {
        this.results = results;
    }

    /**
     * Gets the value of the results property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the results property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSItemPKsByCriteriaResponseResults }
     * 
     * 
     */
    public List<WSItemPKsByCriteriaResponseResults> getResults() {
        if (results == null) {
            results = new ArrayList<WSItemPKsByCriteriaResponseResults>();
        }
        return this.results;
    }

}
