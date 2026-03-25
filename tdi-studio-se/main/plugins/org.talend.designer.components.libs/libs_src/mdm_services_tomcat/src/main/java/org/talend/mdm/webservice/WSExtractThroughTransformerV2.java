
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSExtractThroughTransformerV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSExtractThroughTransformerV2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wsItemPK" type="{http://www.talend.com/mdm}WSItemPK" minOccurs="0"/&gt;
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
@XmlType(name = "WSExtractThroughTransformerV2", propOrder = {
    "wsItemPK",
    "wsTransformerV2PK"
})
public class WSExtractThroughTransformerV2 {

    protected WSItemPK wsItemPK;
    protected WSTransformerV2PK wsTransformerV2PK;

    /**
     * Default no-arg constructor
     * 
     */
    public WSExtractThroughTransformerV2() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSExtractThroughTransformerV2(final WSItemPK wsItemPK, final WSTransformerV2PK wsTransformerV2PK) {
        this.wsItemPK = wsItemPK;
        this.wsTransformerV2PK = wsTransformerV2PK;
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
