
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSDeleteTransformerV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSDeleteTransformerV2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wsTransformerV2PK" type="{http://www.talend.com/mdm}WSTransformerV2PK" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSDeleteTransformerV2", propOrder = {
    "wsTransformerV2PK"
})
public class WSDeleteTransformerV2 {

    protected WSTransformerV2PK wsTransformerV2PK;

    /**
     * Default no-arg constructor
     * 
     */
    public WSDeleteTransformerV2() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSDeleteTransformerV2(final WSTransformerV2PK wsTransformerV2PK) {
        this.wsTransformerV2PK = wsTransformerV2PK;
    }

    /**
     * Gets the value of the wsTransformerV2PK property.
     * 
     * @return
     *     possible object is
     *     {@link WSTransformerV2PK }
     *     
     */
    public WSTransformerV2PK getWsTransformerV2PK() {
        return wsTransformerV2PK;
    }

    /**
     * Sets the value of the wsTransformerV2PK property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSTransformerV2PK }
     *     
     */
    public void setWsTransformerV2PK(WSTransformerV2PK value) {
        this.wsTransformerV2PK = value;
    }

}
