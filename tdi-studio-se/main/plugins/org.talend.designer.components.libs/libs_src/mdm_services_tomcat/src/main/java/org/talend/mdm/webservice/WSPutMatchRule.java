
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSPutMatchRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSPutMatchRule"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rule" type="{http://www.talend.com/mdm}WSMatchRule" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSPutMatchRule", propOrder = {
    "rule"
})
public class WSPutMatchRule {

    protected WSMatchRule rule;

    /**
     * Default no-arg constructor
     * 
     */
    public WSPutMatchRule() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSPutMatchRule(final WSMatchRule rule) {
        this.rule = rule;
    }

    /**
     * Gets the value of the rule property.
     * 
     * @return
     *     possible object is
     *     {@link WSMatchRule }
     *     
     */
    public WSMatchRule getRule() {
        return rule;
    }

    /**
     * Sets the value of the rule property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSMatchRule }
     *     
     */
    public void setRule(WSMatchRule value) {
        this.rule = value;
    }

}
