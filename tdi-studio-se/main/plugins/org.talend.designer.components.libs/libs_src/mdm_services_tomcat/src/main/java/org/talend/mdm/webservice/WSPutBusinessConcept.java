
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSPutBusinessConcept complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSPutBusinessConcept"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="businessConcept" type="{http://www.talend.com/mdm}WSBusinessConcept" minOccurs="0"/&gt;
 *         &lt;element name="wsDataModelPK" type="{http://www.talend.com/mdm}WSDataModelPK" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSPutBusinessConcept", propOrder = {
    "businessConcept",
    "wsDataModelPK"
})
public class WSPutBusinessConcept {

    protected WSBusinessConcept businessConcept;
    protected WSDataModelPK wsDataModelPK;

    /**
     * Default no-arg constructor
     * 
     */
    public WSPutBusinessConcept() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSPutBusinessConcept(final WSBusinessConcept businessConcept, final WSDataModelPK wsDataModelPK) {
        this.businessConcept = businessConcept;
        this.wsDataModelPK = wsDataModelPK;
    }

    /**
     * Gets the value of the businessConcept property.
     * 
     * @return
     *     possible object is
     *     {@link WSBusinessConcept }
     *     
     */
    public WSBusinessConcept getBusinessConcept() {
        return businessConcept;
    }

    /**
     * Sets the value of the businessConcept property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSBusinessConcept }
     *     
     */
    public void setBusinessConcept(WSBusinessConcept value) {
        this.businessConcept = value;
    }

    /**
     * Gets the value of the wsDataModelPK property.
     * 
     * @return
     *     possible object is
     *     {@link WSDataModelPK }
     *     
     */
    public WSDataModelPK getWsDataModelPK() {
        return wsDataModelPK;
    }

    /**
     * Sets the value of the wsDataModelPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSDataModelPK }
     *     
     */
    public void setWsDataModelPK(WSDataModelPK value) {
        this.wsDataModelPK = value;
    }

}
