
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSPutRole complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSPutRole"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wsRole" type="{http://www.talend.com/mdm}WSRole" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSPutRole", propOrder = {
    "wsRole"
})
public class WSPutRole {

    protected WSRole wsRole;

    /**
     * Default no-arg constructor
     * 
     */
    public WSPutRole() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSPutRole(final WSRole wsRole) {
        this.wsRole = wsRole;
    }

    /**
     * Gets the value of the wsRole property.
     * 
     * @return
     *     possible object is
     *     {@link WSRole }
     *     
     */
    public WSRole getWsRole() {
        return wsRole;
    }

    /**
     * Sets the value of the wsRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSRole }
     *     
     */
    public void setWsRole(WSRole value) {
        this.wsRole = value;
    }

}
