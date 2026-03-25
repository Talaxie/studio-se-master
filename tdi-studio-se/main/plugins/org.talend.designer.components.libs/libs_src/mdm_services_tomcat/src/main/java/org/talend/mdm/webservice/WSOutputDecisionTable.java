
package org.talend.mdm.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSOutputDecisionTable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSOutputDecisionTable"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="decisions" type="{http://www.talend.com/mdm}WSProcessBytesUsingTransformerWsOutputDecisionTableDecisions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSOutputDecisionTable", propOrder = {
    "decisions"
})
public class WSOutputDecisionTable {

    @XmlElement(nillable = true)
    protected List<WSProcessBytesUsingTransformerWsOutputDecisionTableDecisions> decisions;

    /**
     * Default no-arg constructor
     * 
     */
    public WSOutputDecisionTable() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSOutputDecisionTable(final List<WSProcessBytesUsingTransformerWsOutputDecisionTableDecisions> decisions) {
        this.decisions = decisions;
    }

    /**
     * Gets the value of the decisions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the decisions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDecisions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSProcessBytesUsingTransformerWsOutputDecisionTableDecisions }
     * 
     * 
     */
    public List<WSProcessBytesUsingTransformerWsOutputDecisionTableDecisions> getDecisions() {
        if (decisions == null) {
            decisions = new ArrayList<WSProcessBytesUsingTransformerWsOutputDecisionTableDecisions>();
        }
        return this.decisions;
    }

}
