
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSExtractUsingTransformer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSExtractUsingTransformer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wsItemPK" type="{http://www.talend.com/mdm}WSItemPK" minOccurs="0"/&gt;
 *         &lt;element name="wsTransformerPK" type="{http://www.talend.com/mdm}WSTransformerPK" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSExtractUsingTransformer", propOrder = {
    "wsItemPK",
    "wsTransformerPK"
})
public class WSExtractUsingTransformer {

    protected WSItemPK wsItemPK;
    protected WSTransformerPK wsTransformerPK;

    /**
     * Default no-arg constructor
     * 
     */
    public WSExtractUsingTransformer() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSExtractUsingTransformer(final WSItemPK wsItemPK, final WSTransformerPK wsTransformerPK) {
        this.wsItemPK = wsItemPK;
        this.wsTransformerPK = wsTransformerPK;
    }

    /**
     * Gets the value of the wsItemPK property.
     * 
     * @return
     *     possible object is
     *     {@link WSItemPK }
     *     
     */
    public WSItemPK getWsItemPK() {
        return wsItemPK;
    }

    /**
     * Sets the value of the wsItemPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSItemPK }
     *     
     */
    public void setWsItemPK(WSItemPK value) {
        this.wsItemPK = value;
    }

    /**
     * Gets the value of the wsTransformerPK property.
     * 
     * @return
     *     possible object is
     *     {@link WSTransformerPK }
     *     
     */
    public WSTransformerPK getWsTransformerPK() {
        return wsTransformerPK;
    }

    /**
     * Sets the value of the wsTransformerPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSTransformerPK }
     *     
     */
    public void setWsTransformerPK(WSTransformerPK value) {
        this.wsTransformerPK = value;
    }

}
