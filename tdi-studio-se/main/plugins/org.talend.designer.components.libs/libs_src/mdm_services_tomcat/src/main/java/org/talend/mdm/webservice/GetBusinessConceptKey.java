
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getBusinessConceptKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getBusinessConceptKey"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arg0" type="{http://www.talend.com/mdm}WSGetBusinessConceptKey" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getBusinessConceptKey", propOrder = {
    "arg0"
})
public class GetBusinessConceptKey {

    protected WSGetBusinessConceptKey arg0;

    /**
     * Default no-arg constructor
     * 
     */
    public GetBusinessConceptKey() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public GetBusinessConceptKey(final WSGetBusinessConceptKey arg0) {
        this.arg0 = arg0;
    }

    /**
     * Gets the value of the arg0 property.
     * 
     * @return
     *     possible object is
     *     {@link WSGetBusinessConceptKey }
     *     
     */
    public WSGetBusinessConceptKey getArg0() {
        return arg0;
    }

    /**
     * Sets the value of the arg0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSGetBusinessConceptKey }
     *     
     */
    public void setArg0(WSGetBusinessConceptKey value) {
        this.arg0 = value;
    }

}
