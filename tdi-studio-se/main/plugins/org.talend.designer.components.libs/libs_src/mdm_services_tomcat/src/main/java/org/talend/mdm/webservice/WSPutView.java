
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSPutView complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSPutView"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wsView" type="{http://www.talend.com/mdm}WSView" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSPutView", propOrder = {
    "wsView"
})
public class WSPutView {

    protected WSView wsView;

    /**
     * Default no-arg constructor
     * 
     */
    public WSPutView() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSPutView(final WSView wsView) {
        this.wsView = wsView;
    }

    /**
     * Gets the value of the wsView property.
     * 
     * @return
     *     possible object is
     *     {@link WSView }
     *     
     */
    public WSView getWsView() {
        return wsView;
    }

    /**
     * Sets the value of the wsView property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSView }
     *     
     */
    public void setWsView(WSView value) {
        this.wsView = value;
    }

}
