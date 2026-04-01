
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSExistsStoredProcedure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSExistsStoredProcedure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wsStoredProcedurePK" type="{http://www.talend.com/mdm}WSStoredProcedurePK" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSExistsStoredProcedure", propOrder = {
    "wsStoredProcedurePK"
})
public class WSExistsStoredProcedure {

    protected WSStoredProcedurePK wsStoredProcedurePK;

    /**
     * Default no-arg constructor
     * 
     */
    public WSExistsStoredProcedure() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSExistsStoredProcedure(final WSStoredProcedurePK wsStoredProcedurePK) {
        this.wsStoredProcedurePK = wsStoredProcedurePK;
    }

    /**
     * Gets the value of the wsStoredProcedurePK property.
     * 
     * @return
     *     possible object is
     *     {@link WSStoredProcedurePK }
     *     
     */
    public WSStoredProcedurePK getWsStoredProcedurePK() {
        return wsStoredProcedurePK;
    }

    /**
     * Sets the value of the wsStoredProcedurePK property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSStoredProcedurePK }
     *     
     */
    public void setWsStoredProcedurePK(WSStoredProcedurePK value) {
        this.wsStoredProcedurePK = value;
    }

}
