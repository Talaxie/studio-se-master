
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for existsTransformerPluginV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="existsTransformerPluginV2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arg0" type="{http://www.talend.com/mdm}WSExistsTransformerPluginV2" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "existsTransformerPluginV2", propOrder = {
    "arg0"
})
public class ExistsTransformerPluginV2 {

    protected WSExistsTransformerPluginV2 arg0;

    /**
     * Default no-arg constructor
     * 
     */
    public ExistsTransformerPluginV2() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ExistsTransformerPluginV2(final WSExistsTransformerPluginV2 arg0) {
        this.arg0 = arg0;
    }

    /**
     * Gets the value of the arg0 property.
     * 
     * @return
     *     possible object is
     *     {@link WSExistsTransformerPluginV2 }
     *     
     */
    public WSExistsTransformerPluginV2 getArg0() {
        return arg0;
    }

    /**
     * Sets the value of the arg0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSExistsTransformerPluginV2 }
     *     
     */
    public void setArg0(WSExistsTransformerPluginV2 value) {
        this.arg0 = value;
    }

}
