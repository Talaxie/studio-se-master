
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSGetBusinessConceptValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSGetBusinessConceptValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wsBusinessConceptPK" type="{http://www.talend.com/mdm}WSBusinessConceptPK" minOccurs="0"/&gt;
 *         &lt;element name="wsDataClusterPK" type="{http://www.talend.com/mdm}WSDataClusterPK" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSGetBusinessConceptValue", propOrder = {
    "wsBusinessConceptPK",
    "wsDataClusterPK"
})
public class WSGetBusinessConceptValue {

    protected WSBusinessConceptPK wsBusinessConceptPK;
    protected WSDataClusterPK wsDataClusterPK;

    /**
     * Default no-arg constructor
     * 
     */
    public WSGetBusinessConceptValue() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSGetBusinessConceptValue(final WSBusinessConceptPK wsBusinessConceptPK, final WSDataClusterPK wsDataClusterPK) {
        this.wsBusinessConceptPK = wsBusinessConceptPK;
        this.wsDataClusterPK = wsDataClusterPK;
    }

    /**
     * Gets the value of the wsBusinessConceptPK property.
     * 
     * @return
     *     possible object is
     *     {@link WSBusinessConceptPK }
     *     
     */
    public WSBusinessConceptPK getWsBusinessConceptPK() {
        return wsBusinessConceptPK;
    }

    /**
     * Sets the value of the wsBusinessConceptPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSBusinessConceptPK }
     *     
     */
    public void setWsBusinessConceptPK(WSBusinessConceptPK value) {
        this.wsBusinessConceptPK = value;
    }

    /**
     * Gets the value of the wsDataClusterPK property.
     * 
     * @return
     *     possible object is
     *     {@link WSDataClusterPK }
     *     
     */
    public WSDataClusterPK getWsDataClusterPK() {
        return wsDataClusterPK;
    }

    /**
     * Sets the value of the wsDataClusterPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSDataClusterPK }
     *     
     */
    public void setWsDataClusterPK(WSDataClusterPK value) {
        this.wsDataClusterPK = value;
    }

}
