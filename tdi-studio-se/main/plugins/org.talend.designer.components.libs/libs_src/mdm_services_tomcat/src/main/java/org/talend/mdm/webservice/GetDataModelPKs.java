
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getDataModelPKs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDataModelPKs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arg0" type="{http://www.talend.com/mdm}WSRegexDataModelPKs" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDataModelPKs", propOrder = {
    "arg0"
})
public class GetDataModelPKs {

    protected WSRegexDataModelPKs arg0;

    /**
     * Default no-arg constructor
     * 
     */
    public GetDataModelPKs() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public GetDataModelPKs(final WSRegexDataModelPKs arg0) {
        this.arg0 = arg0;
    }

    /**
     * Gets the value of the arg0 property.
     * 
     * @return
     *     possible object is
     *     {@link WSRegexDataModelPKs }
     *     
     */
    public WSRegexDataModelPKs getArg0() {
        return arg0;
    }

    /**
     * Sets the value of the arg0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSRegexDataModelPKs }
     *     
     */
    public void setArg0(WSRegexDataModelPKs value) {
        this.arg0 = value;
    }

}
