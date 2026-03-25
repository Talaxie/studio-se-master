
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getTransformerPluginV2SList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getTransformerPluginV2SList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arg0" type="{http://www.talend.com/mdm}WSGetTransformerPluginV2SList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTransformerPluginV2SList", propOrder = {
    "arg0"
})
public class GetTransformerPluginV2SList {

    protected WSGetTransformerPluginV2SList arg0;

    /**
     * Default no-arg constructor
     * 
     */
    public GetTransformerPluginV2SList() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public GetTransformerPluginV2SList(final WSGetTransformerPluginV2SList arg0) {
        this.arg0 = arg0;
    }

    /**
     * Gets the value of the arg0 property.
     * 
     * @return
     *     possible object is
     *     {@link WSGetTransformerPluginV2SList }
     *     
     */
    public WSGetTransformerPluginV2SList getArg0() {
        return arg0;
    }

    /**
     * Sets the value of the arg0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSGetTransformerPluginV2SList }
     *     
     */
    public void setArg0(WSGetTransformerPluginV2SList value) {
        this.arg0 = value;
    }

}
