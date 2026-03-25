
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSDeleteRole complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSDeleteRole"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wsRolePK" type="{http://www.talend.com/mdm}WSRolePK" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSDeleteRole", propOrder = {
    "wsRolePK"
})
public class WSDeleteRole {

    protected WSRolePK wsRolePK;

    /**
     * Default no-arg constructor
     * 
     */
    public WSDeleteRole() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSDeleteRole(final WSRolePK wsRolePK) {
        this.wsRolePK = wsRolePK;
    }

    /**
     * Gets the value of the wsRolePK property.
     * 
     * @return
     *     possible object is
     *     {@link WSRolePK }
     *     
     */
    public WSRolePK getWsRolePK() {
        return wsRolePK;
    }

    /**
     * Sets the value of the wsRolePK property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSRolePK }
     *     
     */
    public void setWsRolePK(WSRolePK value) {
        this.wsRolePK = value;
    }

}
