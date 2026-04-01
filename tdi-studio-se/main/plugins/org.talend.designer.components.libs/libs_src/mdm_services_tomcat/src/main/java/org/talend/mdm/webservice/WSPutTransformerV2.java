
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSPutTransformerV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSPutTransformerV2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wsTransformerV2" type="{http://www.talend.com/mdm}WSTransformerV2" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSPutTransformerV2", propOrder = {
    "wsTransformerV2"
})
public class WSPutTransformerV2 {

    protected WSTransformerV2 wsTransformerV2;

    /**
     * Default no-arg constructor
     * 
     */
    public WSPutTransformerV2() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSPutTransformerV2(final WSTransformerV2 wsTransformerV2) {
        this.wsTransformerV2 = wsTransformerV2;
    }

    /**
     * Gets the value of the wsTransformerV2 property.
     * 
     * @return
     *     possible object is
     *     {@link WSTransformerV2 }
     *     
     */
    public WSTransformerV2 getWsTransformerV2() {
        return wsTransformerV2;
    }

    /**
     * Sets the value of the wsTransformerV2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSTransformerV2 }
     *     
     */
    public void setWsTransformerV2(WSTransformerV2 value) {
        this.wsTransformerV2 = value;
    }

}
