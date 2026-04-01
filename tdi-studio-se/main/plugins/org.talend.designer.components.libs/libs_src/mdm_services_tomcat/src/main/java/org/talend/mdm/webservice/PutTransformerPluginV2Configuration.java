
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for putTransformerPluginV2Configuration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="putTransformerPluginV2Configuration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arg0" type="{http://www.talend.com/mdm}WSTransformerPluginV2PutConfiguration" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "putTransformerPluginV2Configuration", propOrder = {
    "arg0"
})
public class PutTransformerPluginV2Configuration {

    protected WSTransformerPluginV2PutConfiguration arg0;

    /**
     * Default no-arg constructor
     * 
     */
    public PutTransformerPluginV2Configuration() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PutTransformerPluginV2Configuration(final WSTransformerPluginV2PutConfiguration arg0) {
        this.arg0 = arg0;
    }

    /**
     * Gets the value of the arg0 property.
     * 
     * @return
     *     possible object is
     *     {@link WSTransformerPluginV2PutConfiguration }
     *     
     */
    public WSTransformerPluginV2PutConfiguration getArg0() {
        return arg0;
    }

    /**
     * Sets the value of the arg0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSTransformerPluginV2PutConfiguration }
     *     
     */
    public void setArg0(WSTransformerPluginV2PutConfiguration value) {
        this.arg0 = value;
    }

}
